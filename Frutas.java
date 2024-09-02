public class Frutas {
    private String nome;
    private String epoca;
    private double peso;

    public Frutas(String nome, String epoca, double peso) {
        this.nome = nome;
        this.epoca = epoca;
        this.peso = peso;
    }

    public void mostrarInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Época: " + epoca);
        System.out.println("Peso: " + peso + " kg");
    }

    public void atualizarPeso(double novoPeso) {
        this.peso = novoPeso;
        System.out.println("Peso atualizado: " + peso + " kg");
    }

    public void exibirEpoca() {
        System.out.println("A época da fruta " + nome + " é: " + epoca);
    }

    public static void main(String[] args) {
        Frutas kiwi = new Frutas("Kiwi", "Outono", 0.1);
        Frutas abacaxi = new Frutas("Abacaxi", "Verão", 1.5);
        Frutas uva = new Frutas("Uva", "Primavera", 0.2);
        Frutas roma = new Frutas("Romã", "Inverno", 0.3);
        Frutas banana = new Frutas("Banana", "Verão", 0.12);
        Frutas manga = new Frutas("Manga", "Primavera", 0.5);
        Frutas uvaVerde = new Frutas("Uva Verde", "Outono", 0.2);
        Frutas melancia = new Frutas("Melância", "Verão", 5.0);
        Frutas pera = new Frutas("Pêra", "Outono", 0.15);
        Frutas laranja = new Frutas("Laranja", "Inverno", 0.25);
        Frutas mirtilo = new Frutas("Mirtilo", "Primavera", 0.05);
        Frutas limaoSiciliano = new Frutas("Limão Siciliano", "Inverno", 0.2);

        kiwi.mostrarInformacoes();
        abacaxi.mostrarInformacoes();
        uva.mostrarInformacoes();
        roma.mostrarInformacoes();
        banana.mostrarInformacoes();
        manga.mostrarInformacoes();
        uvaVerde.mostrarInformacoes();
        melancia.mostrarInformacoes();
        pera.mostrarInformacoes();
        laranja.mostrarInformacoes();
        mirtilo.mostrarInformacoes();
        limaoSiciliano.mostrarInformacoes();
    }
}

**TESTA CLASSE;**

import java.util.Scanner;

public class TestaClasse6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Frutas[] frutas = {
            new Frutas("Kiwi", "Outono", 0.1),
            new Frutas("Abacaxi", "Verão", 1.5),
            new Frutas("Uva", "Primavera", 0.2),
            new Frutas("Romã", "Inverno", 0.3),
            new Frutas("Banana", "Verão", 0.12),
            new Frutas("Manga", "Primavera", 0.5),
            new Frutas("Uva Verde", "Outono", 0.2),
            new Frutas("Melância", "Verão", 5.0),
            new Frutas("Pêra", "Outono", 0.15),
            new Frutas("Laranja", "Inverno", 0.25),
            new Frutas("Mirtilo", "Primavera", 0.05),
            new Frutas("Limão Siciliano", "Inverno", 0.2)
        };

        int opcao = -1;

        while (opcao != 0) {
            System.out.println("\nMENU:");
            System.out.println("1. Mostrar informações das frutas");
            System.out.println("2. Atualizar peso de uma fruta");
            System.out.println("3. Exibir época do ano de uma fruta");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            if (opcao == 1) {
                for (Frutas fruta : frutas) {
                    fruta.mostrarInformacoes();
                    System.out.println();
                }
            } else if (opcao == 2) {
                System.out.print("Escolha o número da fruta para atualizar o peso (1-12): ");
                int frutaEscolhida = scanner.nextInt();
                if (frutaEscolhida >= 1 && frutaEscolhida <= 12) {
                    System.out.print("Digite o novo peso da fruta (em kg): ");
                    double novoPeso = scanner.nextDouble();
                    frutas[frutaEscolhida - 1].atualizarPeso(novoPeso);
                } else {
                    System.out.println("Fruta inválida.");
                }
            } else if (opcao == 3) {
                System.out.print("Escolha o número da fruta para exibir a época (1-12): ");
                int frutaEscolhida = scanner.nextInt();
                if (frutaEscolhida >= 1 && frutaEscolhida <= 12) {
                    frutas[frutaEscolhida - 1].exibirEpoca();
                } else {
                    System.out.println("Fruta inválida.");
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
