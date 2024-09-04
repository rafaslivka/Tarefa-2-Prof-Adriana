public class Times {
    private String nome;
    private int titulos;
    private int quantidadeMembros;

    public Times(String nome, int titulos, int quantidadeMembros) {
        this.nome = nome;
        this.titulos = titulos;
        this.quantidadeMembros = quantidadeMembros;
    }

    public void mostrarInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Títulos: " + titulos);
        System.out.println("Quantidade de Membros: " + quantidadeMembros);
    }

    public void atualizarTitulos(int novosTitulos) {
        this.titulos = novosTitulos;
        System.out.println("Títulos atualizados para: " + titulos);
    }

    public void atualizarMembros(int novosMembros) {
        this.quantidadeMembros = novosMembros;
        System.out.println("Quantidade de membros atualizada para: " + quantidadeMembros);
    }

    public static void main(String[] args) {
        Times[] times = {
            new Times("Vasco", 25, 30),
            new Times("Grêmio", 20, 28),
            new Times("Flamengo", 40, 35),
            new Times("Palmeiras (sem mundial)", 15, 32),
            new Times("São Paulo", 25, 30),
            new Times("Cruzeiro", 27, 29),
            new Times("Corinthians (o maior de todos)", 30, 33)
        };

        times[0].mostrarInformacoes();
        times[1].mostrarInformacoes();
        times[2].mostrarInformacoes();
        times[3].mostrarInformacoes();
        times[4].mostrarInformacoes();
        times[5].mostrarInformacoes();
        times[6].mostrarInformacoes();
    }
}
