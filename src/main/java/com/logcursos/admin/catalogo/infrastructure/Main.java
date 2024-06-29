package com.logcursos.admin.catalogo.infrastructure;


import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        String opcao = "";

        while (!opcao.equals("sair")) {
            System.out.println("Digite o CEP da cidade desejada: ");
            Scanner scan = new Scanner(System.in);
            int cep = scan.nextInt();
            BuscaCep buscaCep = new BuscaCep();


            String resultado = buscaCep.buscaDadosJson(cep);
            System.out.println(resultado);
            System.out.println("Digite 'sair' para encerrar o programa ou qualquer outra tecla para continuar: ");
            opcao = scan.next().toLowerCase(Locale.ROOT);

            SaveCEP saveCEP = new SaveCEP();

            saveCEP.saveCEP(resultado);
        }
    }
}