package main.java.salesanalyses;
import main.java.salesanalyses.analisador.AnalisadorVendas;
import main.java.salesanalyses.leitor.LeitorVendas;
import main.java.salesanalyses.modelo.Venda;
import main.java.salesanalyses.relatorio.RelatorioVendas;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        System.out.println("Informe o nome do arquivo que deseja analisar: ");
        Scanner scanner = new Scanner(System.in);
        String nomeArquivo = scanner.nextLine();
        ArrayList<Venda> vendas = LeitorVendas.lerVendas(nomeArquivo);
        HashMap mapaVendas = AnalisadorVendas.agruparPorCategoria(vendas);
        RelatorioVendas.gerarRelatorio(mapaVendas);

    }
}
