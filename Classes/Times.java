public class Times {
    private String nome;
    private int titulos;
    private int quantidadeMembros;

    public Times(String nome, int titulos, int quantidadeMembros) {
        this.nome = nome;
        this.titulos = titulos;
        this.quantidadeMembros = quantidadeMembros;
    }

    public void mostrarInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Títulos: " + titulos);
        System.out.println("Quantidade de Membros: " + quantidadeMembros);
    }

    public void atualizarTitulos(int novosTitulos) {
        this.titulos = novosTitulos;
        System.out.println("Títulos atualizados para: " + titulos);
    }

    public void atualizarMembros(int novosMembros) {
        this.quantidadeMembros = novosMembros;
        System.out.println("Quantidade de membros atualizada para: " + quantidadeMembros);
    }

    public static void main(String[] args) {
        Times[] times = {
            new Times("Vasco", 25, 30),
            new Times("Grêmio", 20, 28),
            new Times("Flamengo", 40, 35),
            new Times("Palmeiras (sem mundial)", 15, 32),
            new Times("São Paulo", 25, 30),
            new Times("Cruzeiro", 27, 29),
            new Times("Corinthians (o maior de todos)", 30, 33)
        };

        times[0].mostrarInformacoes();
        times[1].mostrarInformacoes();
        times[2].mostrarInformacoes();
        times[3].mostrarInformacoes();
        times[4].mostrarInformacoes();
        times[5].mostrarInformacoes();
        times[6].mostrarInformacoes();
    }
}

**TESTA CLASSE;**

import java.util.Scanner;

public class TestaClasse10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Times[] times = {
            new Times("Vasco", 25, 30),
            new Times("Grêmio", 20, 28),
            new Times("Flamengo", 40, 35),
            new Times("Palmeiras (sem mundial)", 15, 32),
            new Times("São Paulo", 25, 30),
            new Times("Cruzeiro", 27, 29),
            new Times("Corinthians (o maior de todos)", 30, 33)
        };

        int opcao = -1;

        while (opcao != 0) {
            System.out.println("\nMENU:");
            System.out.println("1. Mostrar informações dos times");
            System.out.println("2. Atualizar títulos de um time");
            System.out.println("3. Atualizar quantidade de membros de um time");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            if (opcao == 1) {
                for (Times time : times) {
                    time.mostrarInformacoes();
                    System.out.println();
                }
            } else if (opcao == 2) {
                System.out.print("Escolha o número do time para atualizar os títulos (1-7): ");
                int timeEscolhido = scanner.nextInt();
                if (timeEscolhido >= 1 && timeEscolhido <= 7) {
                    System.out.print("Digite a nova quantidade de títulos: ");
                    int novosTitulos = scanner.nextInt();
                    times[timeEscolhido - 1].atualizarTitulos(novosTitulos);
                } else {
                    System.out.println("Time inválido.");
                }
            } else if (opcao == 3) {
                System.out.print("Escolha o número do time para atualizar a quantidade de membros (1-7): ");
                int timeEscolhido = scanner.nextInt();
                if (timeEscolhido >= 1 && timeEscolhido <= 7) {
                    System.out.print("Digite a nova quantidade de membros: ");
                    int novosMembros = scanner.nextInt();
                    times[timeEscolhido - 1].atualizarMembros(novosMembros);
                } else {
                    System.out.println("Time inválido.");
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
