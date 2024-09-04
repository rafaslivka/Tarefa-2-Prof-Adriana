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
