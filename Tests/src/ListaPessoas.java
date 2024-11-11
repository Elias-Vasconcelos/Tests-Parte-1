
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ListaPessoas implements Comparator<Pessoa> {


    List<Pessoa> listaDePessoas = new ArrayList<>();

    @Override
    public int compare(Pessoa p1, Pessoa p2) {
        return p1.getNome().compareTo(p2.getNome());
    }



    public  void adicionarPessoa(String nome , String genero){
        Pessoa novaPessoa = new Pessoa(nome, genero);
        listaDePessoas.add(novaPessoa);
    }

}
