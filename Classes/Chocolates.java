public class Chocolates {
    private String nome;
    private String tipo;
    private String marca;

    public Chocolates(String nome, String tipo) {
        this.nome = nome;
        this.tipo = tipo;
        this.marca = "Nestle";
    }

    public void mostrarInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Tipo: " + tipo);
        System.out.println("Marca: " + marca);
    }

    public void volumes(double volume) {
        System.out.println("O volume do chocolate " + nome + " é: " + volume + " gramas.");
    }

    public void compararPeso(double peso1, double peso2) {
        if (peso1 > peso2) {
            System.out.println("O chocolate " + nome + " é mais pesado.");
        } else if (peso1 < peso2) {
            System.out.println("O chocolate " + nome + " é mais leve.");
        } else {
            System.out.println("Os dois chocolates têm o mesmo peso.");
        }
    }

    public static void main(String[] args) {
        Chocolates chocolate1 = new Chocolates("Meio Amargo", "Amargo");
        chocolate1.mostrarInformacoes();
        chocolate1.volumes(150);
        chocolate1.compararPeso(150, 200);

        Chocolates chocolate2 = new Chocolates("Duo", "Ao Leite e Branco");
        chocolate2.mostrarInformacoes();
        chocolate2.volumes(130);
        chocolate2.compararPeso(130, 130);

        Chocolates chocolate3 = new Chocolates("Suflair", "Aerado");
        chocolate3.mostrarInformacoes();
        chocolate3.volumes(100);
        chocolate3.compararPeso(100, 150);
    }
}
