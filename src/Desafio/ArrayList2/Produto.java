package Desafio.ArrayList2;

import java.util.ArrayList;

public class Produto {
    private String nome;
    private double preco;
    private int quantidade;

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return ("Produto: " + nome + "preco " + preco + "Quantidade " + quantidade);
    }



    static void main(String[] args) {
        Produto produto1 = new Produto("Garfo", 5.43, 5);
        Produto produto2 = new Produto("Faca", 5, 1);
        ArrayList<Produto> listaDeObjetos = new ArrayList<>();
        listaDeObjetos.add(produto1);
        listaDeObjetos.add(produto2);
        System.out.println("Lista de produtor é " + listaDeObjetos.size());
        System.out.println("Lista de produtos é " + listaDeObjetos.get(0).getNome());
        System.out.println("O produto é: " + listaDeObjetos.toString());
        System.out.println(produto1);
        ProdutoPerecivel produtoPerecivel1 = new ProdutoPerecivel("Produto C", 12.75, 2, "aaaa");
        System.out.println(produtoPerecivel1);
    }
}
