public class Eletronicos {
    private String nome;
    private String marca;
    private int armazenamento;

    public Eletronicos(String nome, String marca, int armazenamento) {
        this.nome = nome;
        this.marca = marca;
        this.armazenamento = armazenamento;
    }

    public void mostrarInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Marca: " + marca);
        System.out.println("Armazenamento: " + armazenamento + " GB");
    }

    public void ligar() {
        System.out.println(nome + " está agora LIGADO.");
    }

    public void desligar() {
        System.out.println(nome + " está agora DESLIGADO.");
    }

    public static void main(String[] args) {
        Eletronicos controlePs4 = new Eletronicos("Controle de PS4", "Sony", 0);
        Eletronicos jbl = new Eletronicos("Caixa de Som JBL", "JBL", 0);
        Eletronicos camera = new Eletronicos("Câmera Digital", "Canon", 32);
        Eletronicos celular = new Eletronicos("Celular", "Samsung", 128);
        Eletronicos projetor = new Eletronicos("Projetor", "Epson", 0);
        Eletronicos fone = new Eletronicos("Fone de Ouvido", "Sony", 0);

        controlePs4.mostrarInformacoes();
        controlePs4.ligar();
        controlePs4.desligar();

        jbl.mostrarInformacoes();
        jbl.ligar();
        jbl.desligar();

        camera.mostrarInformacoes();
        camera.ligar();
        camera.desligar();

        celular.mostrarInformacoes();
        celular.ligar();
        celular.desligar();

        projetor.mostrarInformacoes();
        projetor.ligar();
        projetor.desligar();

        fone.mostrarInformacoes();
        fone.ligar();
        fone.desligar();
    }
}
