package com.logcursos.admin.catalogo.infrastructure;


import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        int cep;
        System.out.println("Digite o CEP da cidade desejada: ");
        Scanner scan = new Scanner(System.in);
        cep = scan.nextInt();

        BuscaCep buscaCep = new BuscaCep();

        String resultado = buscaCep.buscaDadosJson(cep);
        System.out.println(resultado);
    }
}