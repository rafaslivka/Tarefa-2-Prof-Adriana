public class Bandas {
    private String nomeBanda = "LockFist669";
    private String instrumentos = "guitarra, baixo, vocal e baterista";
    private String tipoMusica = "rock";
    private String cidadeTour = "São José dos Campos"; 
    private double cache = 10000 * 4; // 
    
    public void mostrarInformacoes() {
        System.out.println("Nome da Banda: " + nomeBanda);
        System.out.println("Instrumentos: " + instrumentos);
        System.out.println("Tipo de Música: " + tipoMusica);
        System.out.println("Cidade de Tour: " + cidadeTour);
        System.out.println("Cachê Atual: R$ " + cache);
    }

    public void atualizarCidadeTour(String novaCidade) {
        cidadeTour = novaCidade;
        System.out.println("Cidade de tour atualizada para: " + cidadeTour);
    }

    public void atualizarCache(double novoCachePorPessoa) {
        cache = novoCachePorPessoa * 4; 
        System.out.println("Cachê atualizado para: R$ " + cache);
    }

    public static void main(String[] args) {
        Bandas banda = new Bandas();
        banda.mostrarInformacoes();
        banda.atualizarCidadeTour("Taubaté");
        banda.atualizarCache(12000);
        banda.mostrarInformacoes();
    }
}
