import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

import static org.junit.Assert.*;

public class PrimeirosTestsTest {

    @Test
    public void Test(){
        String nomesDasPessoas = "";
        List<String> listaPessoa = new ArrayList<>();

        ListaPessoas  lista = new ListaPessoas();


        lista.adicionarPessoa("lucia","f");
        lista.adicionarPessoa("ana","f");
        lista.adicionarPessoa("marcos","m");
        lista.adicionarPessoa("antonio","m");


        listaPessoa = Arrays.asList(nomesDasPessoas.split(","));



        for(String dados : listaPessoa ){
            String[] novaPessoa  = dados.split("-");
            if (novaPessoa.length == 2) {
                lista.adicionarPessoa(novaPessoa[0], novaPessoa[1]);
            } else {
                System.out.println("Dados inválidos: " + dados);
            }
        }

        Stream<Pessoa> listaFeminina = lista.listaDePessoas.stream().filter(p -> p.getGenero().equals("f"));
        listaFeminina.forEach( p -> Assert.assertEquals("f", p.getGenero() ));
    }

}