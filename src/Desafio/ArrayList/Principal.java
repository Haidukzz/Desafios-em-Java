package Desafio.ArrayList;

import java.util.ArrayList;

public class Principal {
    static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("Akemi", 18);
        Pessoa pessoa2 = new Pessoa("Ak", 18);
        Pessoa pessoa3 = new Pessoa("Aki", 18);
        ArrayList<Pessoa> listaDePessoas = new ArrayList<>();
        listaDePessoas.add(pessoa1);
        listaDePessoas.add(pessoa2);
        listaDePessoas.add(pessoa3);
        System.out.println("o tamanho da lista é de " + listaDePessoas.size());
        System.out.println("O primeiro filme é " + listaDePessoas.get(0));
        System.out.println("As pessoas são " + listaDePessoas.toString());

    }
}
