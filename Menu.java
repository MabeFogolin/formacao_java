package Curso.Desafios.DesafioFinal;

import java.util.Scanner;

public class Menu {

    public void apresentarMenu(){
        Scanner input = new Scanner(System.in);
        int opcao = 0;
        CartaoDeCredito cartao = null;

        Produto p1 = new Produto("Camiseta", 29.99f);
        Produto p2 = new Produto("Calça Jeans", 59.99f);
        Produto p3 = new Produto("Tênis", 99.99f);
        Produto p4 = new Produto("Relógio", 149.99f);
        Produto p5 = new Produto("Mochila", 79.99f);
        Produto lista = new Produto();

        System.out.println("***** Boas vindas às compras! *****");
        while (opcao != -1){
            System.out.println("O que você deseja fazer? \n1- Adicionar cartão\n2-Comprar um novo produto\n" +
                    "3- Verificar os produtos existentes\n4- Verificar saldo do cartão\n5- Listar compras\n6- Sair");
            opcao = input.nextInt();
            switch (opcao){
                case 1:
                    System.out.println("Para adicionar o cartão informe o nome do titular e seu saldo");
                    System.out.println("Informe o nome do titular \n");
                    String nome = input.next();
                    input.nextLine(); // Consumir quebra de linha pendente
                    System.out.println("Informe o saldo do cartão \n");
                    double saldo = input.nextDouble();
                    cartao = new CartaoDeCredito(nome, saldo);
                    break;
                case 2:
                    System.out.println("Ok, vamos listar os produtos e você poderá comprá-los");
                    lista.listarProdutos();
                    System.out.println("Agora, informe o produto a ser comprado");
                    String produto = input.next();

                    if (cartao != null){
                        switch (produto.toUpperCase()){
                            case "CAMISETA":
                                cartao.comprar(p1);
                                break;

                            case "CALÇA JEANS":
                                cartao.comprar(p2);
                                break;

                            case "TÊNIS":
                                cartao.comprar(p3);
                                break;

                            case "TENIS":
                                cartao.comprar(p3);
                                break;

                            case "RELÔGIO":
                                cartao.comprar(p4);
                                break;

                            case "RELOGIO":
                                cartao.comprar(p4);
                                break;

                            case "MOCHILA":
                                cartao.comprar(p5);
                                break;

                            default:
                                System.err.println("INFORME UM PRODUTO VÁLIDO");
                                break;
                        }
                    } else {
                        System.err.println("CARTÃO NÃO ADICIONADO, RETORNAMOS AO MENU PARA VOCê ADICIONAR");
                        break;
                    }
                    break;
                case 3:
                    lista.listarProdutos();
                    break;
                case 4:
                    if (cartao != null){
                        cartao.verificarSaldo();
                        break;
                    } else System.err.println("CARTÃO NÃO ADICIONADO");
                    break;

                case 5:
                    if (cartao != null){
                        cartao.listaDeCompras();
                        break;
                    } else System.err.println("CARTÃO NÃO ADICIONADO");
                    break;
                case 6:
                    System.out.println("Até mais!");
                    opcao = -1;
                    input.close();
                    break;

                default:
                    System.out.println("Informe uma opção válida");
            }
        }
    }
}
