
public class Pessoa implements Comparable<Pessoa> {

    private String genero;
    private String nome;

    public String getNome() {
        return nome;
    }

    public String getGenero() {
        return genero;
    }

    public Pessoa(String nome, String genero) {
        this.genero = genero;
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "genero='" + genero + '\'' +
                ", nome='" + nome + '\'' +
                '}';
    }

    @Override
    public int compareTo(Pessoa pessoa) {
        return this.nome.compareTo(pessoa.getNome()) ;
    }
}
