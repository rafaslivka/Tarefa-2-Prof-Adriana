![image](https://github.com/user-attachments/assets/ba2da3c3-93fb-48b2-a52b-4ff9fdeb2fd3)


// Classe Bandas
public class Bandas {
    // Atributos
    private String nomeBanda = "LockFist669";
    private String instrumentos = "guitarra, baixo, vocal e baterista";
    private String tipoMusica = "rock";
    private String cidadeTour;
    private double cache = 10000 * 4; // 4 membros da banda, R$ 10.000 por pessoa

    
    private String[] cidades = {
        "São José dos Campos", "São Paulo", "Taubaté", "Brasília"
    };

    // informações da banda 
    public void mostrarInformacoes() {
        System.out.println("Nome da Banda: " + nomeBanda);
        System.out.println("Instrumentos: " + instrumentos);
        System.out.println("Tipo de Música: " + tipoMusica);
        System.out.println("Cidade de Tour: " + (cidadeTour != null ? cidadeTour : "Nenhuma"));
        System.out.println("Cachê Atual: R$ " + cache);
    }

    // sortear uma cidade tour
    public void atualizarCidadeTour() {
        Random random = new Random();
        int index = random.nextInt(cidades.length);
        cidadeTour = cidades[index];
        System.out.println("Nova cidade de tour: " + cidadeTour);
    }

    // cachê da banda
    public void atualizarCache(double novoCachePorPessoa) {
        cache = novoCachePorPessoa * 4; // Assume 4 membros na banda
        System.out.println("Cachê atualizado para: R$ " + cache);
    }
}

**TESTA CLASSE**

import java.util.Scanner;

// Classe TestaClasse
public class TestaClasse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Bandas banda = new Bandas();
        int opcao;

        do {
            System.out.println("\nMENU:");
            System.out.println("1. Mostrar informações da banda");
            System.out.println("2. Atualizar cidade de tour");
            System.out.println("3. Atualizar cachê");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    banda.mostrarInformacoes();
                    break;
                case 2:
                    banda.atualizarCidadeTour();
                    break;
                case 3:
                    System.out.print("Digite o novo cachê por pessoa: ");
                    double novoCachePorPessoa = scanner.nextDouble();
                    banda.atualizarCache(novoCachePorPessoa);
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 0);

        scanner.close();
    }
}
