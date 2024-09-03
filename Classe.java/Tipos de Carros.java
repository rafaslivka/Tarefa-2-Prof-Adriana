public class Carros {
    private String nome;
    private String modelo;
    private int ano;

    public Carros(String nome, String modelo, int ano) {
        this.nome = nome;
        this.modelo = modelo;
        this.ano = ano;
    }

    public void ligar() {
        System.out.println(nome + " " + modelo + " (ano " + ano + ") está ligado.");
    }

    public void desligar() {
        System.out.println(nome + " " + modelo + " (ano " + ano + ") está desligado.");
    }

    public static void main(String[] args) {
        Carros[] carros = {
            new Carros("Fiat", "Touro", 2024),
            new Carros("Fiat", "Argo", 2023),
            new Carros("Fiat", "Mobi", 2022)
        };

        for (Carros carro : carros) {
            carro.ligar();
            carro.desligar();
            System.out.println();
        }
    }
}

**TESTA CLASSE;**

import java.util.Scanner;

public class TestaClasse11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Carros[] carros = {
            new Carros("Fiat", "Touro", 2024),
            new Carros("Fiat", "Argo", 2023),
            new Carros("Fiat", "Mobi", 2022)
        };

        int opcao = -1;

        while (opcao != 0) {
            System.out.println("\nMENU:");
            System.out.println("1. Ligar um carro");
            System.out.println("2. Desligar um carro");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            if (opcao == 1) {
                System.out.print("Escolha o número do carro para ligar (1-3): ");
                int carroEscolhido = scanner.nextInt();
                if (carroEscolhido >= 1 && carroEscolhido <= 3) {
                    carros[carroEscolhido - 1].ligar();
                } else {
                    System.out.println("Carro inválido.");
                }
            } else if (opcao == 2) {
                System.out.print("Escolha o número do carro para desligar (1-3): ");
                int carroEscolhido = scanner.nextInt();
                if (carroEscolhido >= 1 && carroEscolhido <= 3) {
                    carros[carroEscolhido - 1].desligar();
                } else {
                    System.out.println("Carro inválido.");
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
