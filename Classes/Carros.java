public class Carros {
    private String nome;
    private String modelo;
    private int ano;

    public Carros(String nome, String modelo, int ano) {
        this.nome = nome;
        this.modelo = modelo;
        this.ano = ano;
    }

    public void ligar() {
        System.out.println(nome + " " + modelo + " (ano " + ano + ") está ligado.");
    }

    public void desligar() {
        System.out.println(nome + " " + modelo + " (ano " + ano + ") está desligado.");
    }

    public static void main(String[] args) {
        Carros[] carros = {
            new Carros("Fiat", "Touro", 2024),
            new Carros("Fiat", "Argo", 2023),
            new Carros("Fiat", "Mobi", 2022)
        };

        for (Carros carro : carros) {
            carro.ligar();
            carro.desligar();
            System.out.println();
        }
    }
