package Curso.Desafios.DesafioFinal;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Produto {
    private String descricao;
    private float preco;
    private static List<Produto> produtosDisponiveis = new ArrayList<>();

    static {
        produtosDisponiveis.add(new Produto("Camiseta", 29.99f));
        produtosDisponiveis.add(new Produto("Calça Jeans", 59.99f));
        produtosDisponiveis.add(new Produto("Tênis", 99.99f));
        produtosDisponiveis.add(new Produto("Relógio", 149.99f));
        produtosDisponiveis.add(new Produto("Mochila", 79.99f));
    }

    public Produto (String descricao, float preco) {
        this.descricao = descricao;
        this.preco = preco;
    }

    public Produto () {
    }

    public String getDescricao () {
        return descricao;
    }

    public double getPreco () {
        return preco;
    }

    public void ordenarPorNome() {
        produtosDisponiveis.sort(Comparator.comparing(Produto::getDescricao));
    }

    public void listarProdutos() {
        System.out.println("*---- Lista de produtos disponíveis ----*");
        ordenarPorNome();
        for (Produto produto : produtosDisponiveis) {
            System.out.printf("Produto %d:\n%s: %.2f \n", produtosDisponiveis.indexOf(produto), produto.getDescricao()
                    , produto.getPreco());
        }
    }

    @Override
    public String toString () {
        return "Produto: " + descricao + "\n" +
                "Preço: " + preco + "\n";
    }
}
