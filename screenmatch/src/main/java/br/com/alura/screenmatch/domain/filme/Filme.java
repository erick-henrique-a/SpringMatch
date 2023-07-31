package br.com.alura.screenmatch.domain.filme;

public class Filme {
    private String nome;
    private Integer duracao;
    private Integer ano;
    private String genero;


    public Filme(DadosCadastroFilmes dados) {
        this.nome = dados.nome();
        this.duracao = dados.duracao();
        this.ano = dados.ano();
        this.genero = dados.genero();
    }

    @Override
    public String toString() {
        return "Filmes{" +
                "nome='" + nome + '\'' +
                ", duracao=" + duracao +
                ", ano=" + ano +
                ", genero='" + genero + '\'' +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getDuracao() {
        return duracao;
    }

    public void setDuracao(Integer duracao) {
        this.duracao = duracao;
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}
