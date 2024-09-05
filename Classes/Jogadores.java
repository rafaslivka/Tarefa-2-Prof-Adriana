public class Jogadores {
    private String nome;
    private int numero;
    private double peso;

    public Jogadores(String nome, int numero, double peso) {
        this.nome = nome;
        this.numero = numero;
        this.peso = peso;
    }

    public void mostrarInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Número: " + numero);
        System.out.println("Peso: " + peso + " kg");
    }

    public void atualizarPeso(double novoPeso) {
        this.peso = novoPeso;
        System.out.println("Peso atualizado para: " + peso + " kg");
    }

    public void atualizarNumero(int novoNumero) {
        this.numero = novoNumero;
        System.out.println("Número atualizado para: " + numero);
    }

    public static void main(String[] args) {

        Jogadores jogador = new Jogadores("Rafael", 10, 75.5);


        jogador.mostrarInformacoes();

        jogador.atualizarPeso(78.0);
        jogador.atualizarNumero(7);

        jogador.mostrarInformacoes();
    }
}
