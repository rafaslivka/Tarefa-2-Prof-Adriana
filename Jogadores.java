public class Jogadores {
    private String nome;
    private int numero;
    private double peso;

    public Jogadores(String nome, int numero, double peso) {
        this.nome = nome;
        this.numero = numero;
        this.peso = peso;
    }

    public void mostrarInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Número: " + numero);
        System.out.println("Peso: " + peso + " kg");
    }

    public void atualizarPeso(double novoPeso) {
        this.peso = novoPeso;
        System.out.println("Peso atualizado: " + peso + " kg");
    }

    public void atualizarNumero(int novoNumero) {
        this.numero = novoNumero;
        System.out.println("Número atualizado: " + numero);
    }

    public static void main(String[] args) {
        Jogadores ronaldo = new Jogadores("Ronaldo Fenômeno", 9, 82.0);
        Jogadores cafu = new Jogadores("Cafu", 2, 73.0);
        Jogadores zico = new Jogadores("Zico", 10, 69.0);
        Jogadores cassio = new Jogadores("Cássio", 12, 92.0);

        ronaldo.mostrarInformacoes();
        cafu.mostrarInformacoes();
        zico.mostrarInformacoes();
        cassio.mostrarInformacoes();
    }
}

**TESTA CLASSE;**

import java.util.Scanner;

public class TestaClasse7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Jogadores[] jogadores = {
            new Jogadores("Ronaldo Fenômeno", 9, 82.0),
            new Jogadores("Cafu", 2, 73.0),
            new Jogadores("Zico", 10, 69.0),
            new Jogadores("Cássio", 12, 92.0)
        };

        int opcao = -1;

        while (opcao != 0) {
            System.out.println("\nMENU:");
            System.out.println("1. Mostrar informações dos jogadores");
            System.out.println("2. Atualizar peso de um jogador");
            System.out.println("3. Atualizar número de um jogador");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            if (opcao == 1) {
                for (Jogadores jogador : jogadores) {
                    jogador.mostrarInformacoes();
                    System.out.println();
                }
            } else if (opcao == 2) {
                System.out.print("Escolha o número do jogador para atualizar o peso (1-4): ");
                int jogadorEscolhido = scanner.nextInt();
                if (jogadorEscolhido >= 1 && jogadorEscolhido <= 4) {
                    System.out.print("Digite o novo peso do jogador (em kg): ");
                    double novoPeso = scanner.nextDouble();
                    jogadores[jogadorEscolhido - 1].atualizarPeso(novoPeso);
                } else {
                    System.out.println("Jogador inválido.");
                }
            } else if (opcao == 3) {
                System.out.print("Escolha o número do jogador para atualizar o número (1-4): ");
                int jogadorEscolhido = scanner.nextInt();
                if (jogadorEscolhido >= 1 && jogadorEscolhido <= 4) {
                    System.out.print("Digite o novo número do jogador: ");
                    int novoNumero = scanner.nextInt();
                    jogadores[jogadorEscolhido - 1].atualizarNumero(novoNumero);
                } else {
                    System.out.println("Jogador inválido.");
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
