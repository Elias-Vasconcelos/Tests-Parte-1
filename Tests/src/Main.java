

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String nomesDasPessoas = "";
        List<String> listaPessoa = new ArrayList<>();

        ListaPessoas  lista = new ListaPessoas();


        lista.adicionarPessoa("lucia","f");
        lista.adicionarPessoa("ana","f");
        lista.adicionarPessoa("marcos","m");
        lista.adicionarPessoa("antonio","m");



        System.out.println("Ola, digite o nome e genero das pessoas separado por `-` e virgula : Exemplo-m,Exemplo-f ");
        nomesDasPessoas = scan.nextLine();
        listaPessoa = Arrays.asList(nomesDasPessoas.split(","));



        for(String dados : listaPessoa ){
            String[] novaPessoa  = dados.split("-");
            lista.adicionarPessoa(novaPessoa[0],novaPessoa[1]);
        }

        Stream<Pessoa> listaFeminina = lista.listaDePessoas.stream().filter(p -> p.getGenero().equals("f"));
        System.out.println("lista Feminina");
        listaFeminina.forEach(p -> System.out.println(p.getNome()));

    }
}