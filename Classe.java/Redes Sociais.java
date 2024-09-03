public class RedesSociais {
    private String nomeUsuario;
    private int numeroSeguidores;
    private int anoCriacao;

    public RedesSociais(String nomeUsuario, int numeroSeguidores, int anoCriacao) {
        this.nomeUsuario = nomeUsuario;
        this.numeroSeguidores = numeroSeguidores;
        this.anoCriacao = anoCriacao;
    }

    public void mostrarInformacoes() {
        System.out.println("Nome de Usuário: " + nomeUsuario);
        System.out.println("Número de Seguidores: " + numeroSeguidores);
        System.out.println("Ano de Criação: " + anoCriacao);
    }

    public void enviarMensagem(String mensagem) {
        System.out.println("Mensagem enviada para " + nomeUsuario + ": " + mensagem);
    }

    public void seguir() {
        System.out.println("Agora você está seguindo " + nomeUsuario + "!");
    }

    public static void main(String[] args) {
        RedesSociais twitter = new RedesSociais("user_twitter", 1200, 2009);
        RedesSociais instagram = new RedesSociais("user_instagram", 3400, 2012);
        RedesSociais linkedin = new RedesSociais("user_linkedin", 1500, 2007);
        RedesSociais pinterest = new RedesSociais("user_pinterest", 900, 2010);
        RedesSociais tiktok = new RedesSociais("user_tiktok", 5000, 2016);
        RedesSociais facebook = new RedesSociais("user_facebook", 2400, 2006);
        RedesSociais whatsapp = new RedesSociais("user_whatsapp", 3000, 2013);
        RedesSociais youtube = new RedesSociais("user_youtube", 4500, 2005);

        twitter.mostrarInformacoes();
        instagram.mostrarInformacoes();
        linkedin.mostrarInformacoes();
        pinterest.mostrarInformacoes();
        tiktok.mostrarInformacoes();
        facebook.mostrarInformacoes();
        whatsapp.mostrarInformacoes();
        youtube.mostrarInformacoes();
    }
}

**TESTE CLASSE;**

import java.util.Scanner;

public class TestaClasse8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        RedesSociais[] redesSociais = {
            new RedesSociais("user_twitter", 1200, 2009),
            new RedesSociais("user_instagram", 3400, 2012),
            new RedesSociais("user_linkedin", 1500, 2007),
            new RedesSociais("user_pinterest", 900, 2010),
            new RedesSociais("user_tiktok", 5000, 2016),
            new RedesSociais("user_facebook", 2400, 2006),
            new RedesSociais("user_whatsapp", 3000, 2013),
            new RedesSociais("user_youtube", 4500, 2005)
        };

        int opcao = -1;

        while (opcao != 0) {
            System.out.println("\nMENU:");
            System.out.println("1. Mostrar informações das redes sociais");
            System.out.println("2. Enviar mensagem para uma rede social");
            System.out.println("3. Seguir uma rede social");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            if (opcao == 1) {
                for (RedesSociais rede : redesSociais) {
                    rede.mostrarInformacoes();
                    System.out.println();
                }
            } else if (opcao == 2) {
                System.out.print("Escolha o número da rede social para enviar mensagem (1-8): ");
                int redeEscolhida = scanner.nextInt();
                scanner.nextLine();
                if (redeEscolhida >= 1 && redeEscolhida <= 8) {
                    System.out.print("Digite a mensagem: ");
                    String mensagem = scanner.nextLine();
                    redesSociais[redeEscolhida - 1].enviarMensagem(mensagem);
                } else {
                    System.out.println("Rede social inválida.");
                }
            } else if (opcao == 3) {
                System.out.print("Escolha o número da rede social para seguir (1-8): ");
                int redeEscolhida = scanner.nextInt();
                if (redeEscolhida >= 1 && redeEscolhida <= 8) {
                    redesSociais[redeEscolhida - 1].seguir();
                } else {
                    System.out.println("Rede social inválida.");
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
