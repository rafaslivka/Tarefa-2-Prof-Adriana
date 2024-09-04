public class Frutas {
    private String nome;
    private String epoca;
    private double peso;

    public Frutas(String nome, String epoca, double peso) {
        this.nome = nome;
        this.epoca = epoca;
        this.peso = peso;
    }

    public void mostrarInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Época: " + epoca);
        System.out.println("Peso: " + peso + " kg");
    }

    public void atualizarPeso(double novoPeso) {
        this.peso = novoPeso;
        System.out.println("Peso atualizado: " + peso + " kg");
    }

    public void exibirEpoca() {
        System.out.println("A época da fruta " + nome + " é: " + epoca);
    }

    public static void main(String[] args) {
        Frutas kiwi = new Frutas("Kiwi", "Outono", 0.1);
        Frutas abacaxi = new Frutas("Abacaxi", "Verão", 1.5);
        Frutas uva = new Frutas("Uva", "Primavera", 0.2);
        Frutas roma = new Frutas("Romã", "Inverno", 0.3);
        Frutas banana = new Frutas("Banana", "Verão", 0.12);
        Frutas manga = new Frutas("Manga", "Primavera", 0.5);
        Frutas uvaVerde = new Frutas("Uva Verde", "Outono", 0.2);
        Frutas melancia = new Frutas("Melância", "Verão", 5.0);
        Frutas pera = new Frutas("Pêra", "Outono", 0.15);
        Frutas laranja = new Frutas("Laranja", "Inverno", 0.25);
        Frutas mirtilo = new Frutas("Mirtilo", "Primavera", 0.05);
        Frutas limaoSiciliano = new Frutas("Limão Siciliano", "Inverno", 0.2);

        kiwi.mostrarInformacoes();
        abacaxi.mostrarInformacoes();
        uva.mostrarInformacoes();
        roma.mostrarInformacoes();
        banana.mostrarInformacoes();
        manga.mostrarInformacoes();
        uvaVerde.mostrarInformacoes();
        melancia.mostrarInformacoes();
        pera.mostrarInformacoes();
        laranja.mostrarInformacoes();
        mirtilo.mostrarInformacoes();
        limaoSiciliano.mostrarInformacoes();
    }
}
