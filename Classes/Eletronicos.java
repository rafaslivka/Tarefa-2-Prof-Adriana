public class Eletronicos {
    private String nome;
    private String marca;
    private int armazenamento;

    public Eletronicos(String nome, String marca, int armazenamento) {
        this.nome = nome;
        this.marca = marca;
        this.armazenamento = armazenamento;
    }

    public void mostrarInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Marca: " + marca);
        System.out.println("Armazenamento: " + armazenamento + " GB");
    }

    public void ligar() {
        System.out.println(nome + " está agora LIGADO.");
    }

    public void desligar() {
        System.out.println(nome + " está agora DESLIGADO.");
    }

    public static void main(String[] args) {
        Eletronicos controlePs4 = new Eletronicos("Controle de PS4", "Sony", 0);
        Eletronicos jbl = new Eletronicos("Caixa de Som JBL", "JBL", 0);
        Eletronicos camera = new Eletronicos("Câmera Digital", "Canon", 32);
        Eletronicos celular = new Eletronicos("Celular", "Samsung", 128);
        Eletronicos projetor = new Eletronicos("Projetor", "Epson", 0);
        Eletronicos fone = new Eletronicos("Fone de Ouvido", "Sony", 0);

        controlePs4.mostrarInformacoes();
        controlePs4.ligar();
        controlePs4.desligar();

        jbl.mostrarInformacoes();
        jbl.ligar();
        jbl.desligar();

        camera.mostrarInformacoes();
        camera.ligar();
        camera.desligar();

        celular.mostrarInformacoes();
        celular.ligar();
        celular.desligar();

        projetor.mostrarInformacoes();
        projetor.ligar();
        projetor.desligar();

        fone.mostrarInformacoes();
        fone.ligar();
        fone.desligar();
    }
}

**TESTA CLASSE;**

import java.util.Scanner;

public class TestaClasse5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Eletronicos controlePs4 = new Eletronicos("Controle de PS4", "Sony", 0);
        Eletronicos jbl = new Eletronicos("Caixa de Som JBL", "JBL", 0);
        Eletronicos camera = new Eletronicos("Câmera Digital", "Canon", 32);
        Eletronicos celular = new Eletronicos("Celular", "Samsung", 128);
        Eletronicos projetor = new Eletronicos("Projetor", "Epson", 0);
        Eletronicos fone = new Eletronicos("Fone de Ouvido", "Sony", 0);

        Eletronicos[] eletronicos = {controlePs4, jbl, camera, celular, projetor, fone};

        int opcao = -1;

        while (opcao != 0) {
            System.out.println("\nMENU:");
            System.out.println("1. Mostrar informações dos produtos");
            System.out.println("2. Ligar um produto");
            System.out.println("3. Desligar um produto");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            if (opcao == 1) {
                for (Eletronicos eletronico : eletronicos) {
                    eletronico.mostrarInformacoes();
                    System.out.println();
                }
            } else if (opcao == 2) {
                System.out.print("Escolha o número do produto para ligar (1-6): ");
                int produto = scanner.nextInt();
                if (produto >= 1 && produto <= 6) {
                    eletronicos[produto - 1].ligar();
                } else {
                    System.out.println("Produto inválido.");
                }
            } else if (opcao == 3) {
                System.out.print("Escolha o número do produto para desligar (1-6): ");
                int produto = scanner.nextInt();
                if (produto >= 1 && produto <= 6) {
                    eletronicos[produto - 1].desligar();
                } else {
                    System.out.println("Produto inválido.");
                }
            } else if (opcao == 0) {
                System.out.println("Saindo...");
            } else {
                System.out.println("Opção inválida. Tente novamente.");
            }
        }

        scanner.close();
    }
}
