public class Cerveja {
    private String nome;
    private String tipo;
    private String marca;

    public Cerveja(String nome, String tipo, String marca) {
        this.nome = nome;
        this.tipo = tipo;
        this.marca = marca;
    }

    public void mostrarInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Tipo: " + tipo);
        System.out.println("Marca: " + marca);
    }

    public void volumes(double volume) {
        System.out.println("O volume da cerveja " + nome + " é: " + volume + " ml.");
    }

    public void compararPeso(double peso1, double peso2) {
        if (peso1 > peso2) {
            System.out.println("A cerveja " + nome + " é mais pesada.");
        } else if (peso1 < peso2) {
            System.out.println("A cerveja " + nome + " é mais leve.");
        } else {
            System.out.println("As duas cervejas têm o mesmo peso.");
        }
    }

    public static void main(String[] args) {
        Cerveja cerveja1 = new Cerveja("Heineken", "Pilsen", "Heineken");
        cerveja1.mostrarInformacoes();
        cerveja1.volumes(330);
        cerveja1.compararPeso(500, 600);

        Cerveja cerveja2 = new Cerveja("Brahma", "Lager", "Ambev");
        cerveja2.mostrarInformacoes();
        cerveja2.volumes(350);
        cerveja2.compararPeso(600, 600);
    }
}

**TESTA CLASSE**

  import java.util.Scanner;

public class TestaClasse3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Cerveja cerveja = new Cerveja("Skol", "Pilsen", "Ambev");

        int opcao = -1;

        while (opcao != 0) {
            System.out.println("\nMENU:");
            System.out.println("1. Mostrar informações da cerveja");
            System.out.println("2. Inserir volume da cerveja");
            System.out.println("3. Comparar peso de duas cervejas");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            if (opcao == 1) {
                cerveja.mostrarInformacoes();
            } else if (opcao == 2) {
                System.out.print("Digite o volume da cerveja (em ml): ");
                double volume = scanner.nextDouble();
                cerveja.volumes(volume);
            } else if (opcao == 3) {
                System.out.print("Digite o peso da primeira cerveja (em gramas): ");
                double peso1 = scanner.nextDouble();
                System.out.print("Digite o peso da segunda cerveja (em gramas): ");
                double peso2 = scanner.nextDouble();
                cerveja.compararPeso(peso1, peso2);
            } else if (opcao == 0) {
                System.out.println("Saindo...");
            } else {
                System.out.println("Opção inválida. Tente novamente.");
            }
        }

        scanner.close();
    }
}
