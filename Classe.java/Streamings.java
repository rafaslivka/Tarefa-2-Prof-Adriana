public class Streamings {
    private String nome;
    private int quantidadeUsuarios;
    private int quantidadeFilmes;

    public Streamings(String nome, int quantidadeUsuarios, int quantidadeFilmes) {
        this.nome = nome;
        this.quantidadeUsuarios = quantidadeUsuarios;
        this.quantidadeFilmes = quantidadeFilmes;
    }

    public void mostrarInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Quantidade de Usuários: " + quantidadeUsuarios);
        System.out.println("Quantidade de Filmes: " + quantidadeFilmes);
    }

    public void atualizarQuantidadeFilmes(int novaQuantidade) {
        this.quantidadeFilmes = novaQuantidade;
        System.out.println("Quantidade de filmes atualizada para: " + quantidadeFilmes);
    }

    public void atualizarQuantidadeUsuarios(int novaQuantidade) {
        this.quantidadeUsuarios = novaQuantidade;
        System.out.println("Quantidade de usuários atualizada para: " + quantidadeUsuarios);
    }

    public static void main(String[] args) {
        Streamings netflix = new Streamings("Netflix", 231000000, 4000);
        Streamings primeVideo = new Streamings("Prime Video", 200000000, 5000);
        Streamings disney = new Streamings("Disney+", 160000000, 3000);
        Streamings globoplay = new Streamings("Globoplay", 15000000, 2000);
        Streamings starPlus = new Streamings("Star+", 15000000, 1500);
        Streamings hboMax = new Streamings("HBO Max", 76000000, 2500);

        netflix.mostrarInformacoes();
        primeVideo.mostrarInformacoes();
        disney.mostrarInformacoes();
        globoplay.mostrarInformacoes();
        starPlus.mostrarInformacoes();
        hboMax.mostrarInformacoes();
    }
}

**TESTA CLASSE;**

import java.util.Scanner;

public class TestaClasse9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Streamings[] streamings = {
            new Streamings("Netflix", 231000000, 4000),
            new Streamings("Prime Video", 200000000, 5000),
            new Streamings("Disney+", 160000000, 3000),
            new Streamings("Globoplay", 15000000, 2000),
            new Streamings("Star+", 15000000, 1500),
            new Streamings("HBO Max", 76000000, 2500)
        };

        int opcao = -1;

        while (opcao != 0) {
            System.out.println("\nMENU:");
            System.out.println("1. Mostrar informações dos streamings");
            System.out.println("2. Atualizar quantidade de filmes de um streaming");
            System.out.println("3. Atualizar quantidade de usuários de um streaming");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer

            if (opcao == 1) {
                for (Streamings streaming : streamings) {
                    streaming.mostrarInformacoes();
                    System.out.println();
                }
            } else if (opcao == 2) {
                System.out.print("Escolha o número do streaming para atualizar a quantidade de filmes (1-6): ");
                int streamingEscolhido = scanner.nextInt();
                if (streamingEscolhido >= 1 && streamingEscolhido <= 6) {
                    System.out.print("Digite a nova quantidade de filmes: ");
                    int novaQuantidade = scanner.nextInt();
                    streamings[streamingEscolhido - 1].atualizarQuantidadeFilmes(novaQuantidade);
                } else {
                    System.out.println("Streaming inválido.");
                }
            } else if (opcao == 3) {
                System.out.print("Escolha o número do streaming para atualizar a quantidade de usuários (1-6): ");
                int streamingEscolhido = scanner.nextInt();
                if (streamingEscolhido >= 1 && streamingEscolhido <= 6) {
                    System.out.print("Digite a nova quantidade de usuários: ");
                    int novaQuantidade = scanner.nextInt();
                    streamings[streamingEscolhido - 1].atualizarQuantidadeUsuarios(novaQuantidade);
                } else {
                    System.out.println("Streaming inválido.");
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
