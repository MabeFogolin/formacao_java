package Curso.Desafios.DesafioFinal;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class CartaoDeCredito {

    private String nomeTitular;
    private double limite;
    private double saldo;
    private List<Produto> compras = new ArrayList<>();


    public CartaoDeCredito (String nomeTitular, double limite) {
        this.nomeTitular = nomeTitular;
        this.limite = limite;
        this.saldo = limite;
    }

    public void comprar (Produto produto) {
        if (saldo >= produto.getPreco()) {
            saldo -= produto.getPreco();
            compras.add(produto);
            System.out.println("Produto adquirido. \nParabéns pela compra!\n");
        } else {
            System.err.printf("Saldo insuficiente. \nSaldo disponível: %.2f \nValor da compra: %.2f\n", saldo,
                    produto.getPreco());
        }
    }

    public void ordenarPorNome () {
        compras.sort(Comparator.comparing(Produto::getDescricao));
    }

    public void listaDeCompras () {
        if (compras.isEmpty()) {
            System.err.println("NENHUMA COMPRA FOI REALIZADA");
        } else {
            ordenarPorNome();
            System.out.println("*----Lista de compras ----*");
            for (Produto produto : this.compras) {
                System.out.println(produto + "\n");
            }
        }
    }

    public void verificarSaldo () {
        System.out.printf("Saldo disponível: %.2f \n", getSaldo());
    }

    public String getNomeTitular () {
        return nomeTitular;
    }

    public double getLimite () {
        return limite;
    }

    public double getSaldo () {
        return saldo;
    }
}
