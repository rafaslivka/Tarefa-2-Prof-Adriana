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
