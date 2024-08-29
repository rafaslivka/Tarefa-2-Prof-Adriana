public class Bandas {
    private String nomeBanda = "LockFist669";
    private String instrumentos = "guitarra, baixo, vocal e baterista";
    private String tipoMusica = "rock";
    private String cidadeTour = "São José dos Campos"; 
    private double cache = 10000 * 4; // 
    
    public void mostrarInformacoes() {
        System.out.println("Nome da Banda: " + nomeBanda);
        System.out.println("Instrumentos: " + instrumentos);
        System.out.println("Tipo de Música: " + tipoMusica);
        System.out.println("Cidade de Tour: " + cidadeTour);
        System.out.println("Cachê Atual: R$ " + cache);
    }

    public void atualizarCidadeTour(String novaCidade) {
        cidadeTour = novaCidade;
        System.out.println("Cidade de tour atualizada para: " + cidadeTour);
    }

    public void atualizarCache(double novoCachePorPessoa) {
        cache = novoCachePorPessoa * 4; 
        System.out.println("Cachê atualizado para: R$ " + cache);
    }
}

** TESTA CLASSE **
    
import java.util.Scanner;

public class TestaClasse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Bandas banda = new Bandas();
        int opcao = -1; // 

        while (opcao != 0) {
            System.out.println("\nMENU:");
            System.out.println("1. Mostrar informações da banda");
            System.out.println("2. Atualizar cidade de tour");
            System.out.println("3. Atualizar cachê");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            if (opcao == 1) {
                banda.mostrarInformacoes();
            } else if (opcao == 2) {
                System.out.println("Escolha uma das cidades: São José dos Campos, São Paulo, Taubaté, Brasília");
                System.out.print("Digite o nome da nova cidade de tour: ");
                scanner.nextLine(); 
                String novaCidade = scanner.nextLine();
                banda.atualizarCidadeTour(novaCidade);
            } else if (opcao == 3) {
                System.out.print("Digite o novo cachê por pessoa: ");
                double novoCachePorPessoa = scanner.nextDouble();
                banda.atualizarCache(novoCachePorPessoa);
            } else if (opcao == 0) {
                System.out.println("Saindo...");
            } else {
                System.out.println("Opção inválida. Tente novamente.");
            }
        }

        scanner.close();
    }
}
