import java.util.Scanner;

public class TestaClasse {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        // Para criar os objetos:
        Bandas banda = new Bandas();
        Carros carro1 = new Carros("Fiat", "Touro", 2024);
        Cerveja cerveja1 = new Cerveja("Heineken", "Pilsen", "Heineken");
        Chocolates chocolate1 = new Chocolates("Meio Amargo", "Amargo");
        Eletronicos controlePs4 = new Eletronicos("Controle de PS4", "Sony", 0);
        Frutas fruta1 = new Frutas("Kiwi", "Outono", 0.1);
        RedesSociais twitter = new RedesSociais("user_twitter", 1200, 2009);
        Streamings netflix = new Streamings("Netflix", 231000000, 4000);
        Times time1 = new Times("Vasco", 25, 30);

        while (continuar) {
           
            System.out.println("\n--- Menu ---");
            System.out.println("1. Testar Banda");
            System.out.println("2. Testar Carros");
            System.out.println("3. Testar Cerveja");
            System.out.println("4. Testar Chocolates");
            System.out.println("5. Testar Eletrônicos");
            System.out.println("6. Testar Frutas");
            System.out.println("7. Testar Redes Sociais");
            System.out.println("8. Testar Streamings");
            System.out.println("9. Testar Times");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcao) {
                case 1:
                    banda.mostrarInformacoes();
                    banda.atualizarCidadeTour("Taubaté");
                    banda.atualizarCache(12000);
                    break;
                case 2:
                    carro1.ligar();
                    carro1.desligar();
                    break;
                case 3:
                    cerveja1.mostrarInformacoes();
                    cerveja1.volumes(330);
                    cerveja1.compararPeso(500, 600);
                    break;
                case 4:
                    chocolate1.mostrarInformacoes();
                    chocolate1.volumes(150);
                    chocolate1.compararPeso(150, 200);
                    break;
                case 5:
                    controlePs4.mostrarInformacoes();
                    controlePs4.ligar();
                    controlePs4.desligar();
                    break;
                case 6:
                    fruta1.mostrarInformacoes();
                    fruta1.atualizarPeso(0.15);
                    fruta1.exibirEpoca();
                    break;
                case 7:
                    twitter.mostrarInformacoes();
                    twitter.enviarMensagem("Olá!");
                    twitter.seguir();
                    break;
                case 8:
                    netflix.mostrarInformacoes();
                    netflix.atualizarQuantidadeFilmes(4200);
                    netflix.atualizarQuantidadeUsuarios(235000000);
                    break;
                case 9:
                    time1.mostrarInformacoes();
                    time1.atualizarTitulos(26);
                    time1.atualizarMembros(31);
                    break;
                case 0:
                    continuar = false;
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }

        scanner.close();
    }
}
