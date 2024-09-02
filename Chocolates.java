public class Chocolates {
    private String nome;
    private String tipo;
    private String marca;

    public Chocolates(String nome, String tipo) {
        this.nome = nome;
        this.tipo = tipo;
        this.marca = "Nestle";
    }

    public void mostrarInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Tipo: " + tipo);
        System.out.println("Marca: " + marca);
    }

    public void volumes(double volume) {
        System.out.println("O volume do chocolate " + nome + " é: " + volume + " gramas.");
    }

    public void compararPeso(double peso1, double peso2) {
        if (peso1 > peso2) {
            System.out.println("O chocolate " + nome + " é mais pesado.");
        } else if (peso1 < peso2) {
            System.out.println("O chocolate " + nome + " é mais leve.");
        } else {
            System.out.println("Os dois chocolates têm o mesmo peso.");
        }
    }

    public static void main(String[] args) {
        Chocolates chocolate1 = new Chocolates("Meio Amargo", "Amargo");
        chocolate1.mostrarInformacoes();
        chocolate1.volumes(150);
        chocolate1.compararPeso(150, 200);

        Chocolates chocolate2 = new Chocolates("Duo", "Ao Leite e Branco");
        chocolate2.mostrarInformacoes();
        chocolate2.volumes(130);
        chocolate2.compararPeso(130, 130);

        Chocolates chocolate3 = new Chocolates("Suflair", "Aerado");
        chocolate3.mostrarInformacoes();
        chocolate3.volumes(100);
        chocolate3.compararPeso(100, 150);
    }
}

**TESTA CLASSE;**

import java.util.Scanner;

public class TestaClasse4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Chocolates chocolate = new Chocolates("Meio Amargo", "Amargo");

        int opcao = -1;

        while (opcao != 0) {
            System.out.println("\nMENU:");
            System.out.println("1. Mostrar informações do chocolate");
            System.out.println("2. Inserir volume do chocolate");
            System.out.println("3. Comparar peso de dois chocolates");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            if (opcao == 1) {
                chocolate.mostrarInformacoes();
            } else if (opcao == 2) {
                System.out.print("Digite o volume do chocolate (em gramas): ");
                double volume = scanner.nextDouble();
                chocolate.volumes(volume);
            } else if (opcao == 3) {
                System.out.print("Digite o peso do primeiro chocolate (em gramas): ");
                double peso1 = scanner.nextDouble();
                System.out.print("Digite o peso do segundo chocolate (em gramas): ");
                double peso2 = scanner.nextDouble();
                chocolate.compararPeso(peso1, peso2);
            } else if (opcao == 0) {
                System.out.println("Saindo...");
            } else {
                System.out.println("Opção inválida. Tente novamente.");
            }
        }

        scanner.close();
    }
}

