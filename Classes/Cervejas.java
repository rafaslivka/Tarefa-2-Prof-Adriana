public class Cerveja {
    private String nome;
    private String tipo;
    private String marca;

    public Cerveja(String nome, String tipo, String marca) {
        this.nome = nome;
        this.tipo = tipo;
        this.marca = marca;
    }

    public void mostrarInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Tipo: " + tipo);
        System.out.println("Marca: " + marca);
    }

    public void volumes(double volume) {
        System.out.println("O volume da cerveja " + nome + " é: " + volume + " ml.");
    }

    public void compararPeso(double peso1, double peso2) {
        if (peso1 > peso2) {
            System.out.println("A cerveja " + nome + " é mais pesada.");
        } else if (peso1 < peso2) {
            System.out.println("A cerveja " + nome + " é mais leve.");
        } else {
            System.out.println("As duas cervejas têm o mesmo peso.");
        }
    }

    public static void main(String[] args) {
        Cerveja cerveja1 = new Cerveja("Heineken", "Pilsen", "Heineken");
        cerveja1.mostrarInformacoes();
        cerveja1.volumes(330);
        cerveja1.compararPeso(500, 600);

        Cerveja cerveja2 = new Cerveja("Brahma", "Lager", "Ambev");
        cerveja2.mostrarInformacoes();
        cerveja2.volumes(350);
        cerveja2.compararPeso(600, 600);
    }
}
