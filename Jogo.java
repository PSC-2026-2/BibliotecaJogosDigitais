public class Jogo {
    // atributos
    private String nome;
    private String genero;
    private double preco;

    // construtor
    public Jogo(String nome, String genero, double preco) {
        this.nome = nome;
        this.genero = genero;
        this.preco = preco;
    }

    // metodos getters/setters
    public String getNome() {
        return this.nome;
    }

    public String getGenero() {
        return this.genero;
    }

    public double getPreco() {
        return this.preco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    // demais metodos
    public String exibirInformacoes() {
        return "\nJogo: " + this.nome +
                "\nGênero: " + this.genero +
                "\nPreço: R$ " + this.preco +
                "\n-----------------------------";
    }
}