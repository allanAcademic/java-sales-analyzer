package main.java.salesanalyses.relatorio;
import java.util.HashMap;

public class RelatorioVendas {
    public static void gerarRelatorio(HashMap mapaDeAnaliseDeVendas){
        String relatorio = "Relatório de vendas por categorias: ";
    mapaDeAnaliseDeVendas.forEach((categoria, preco) -> {
        System.out.println("\nCategoria: " + categoria + " | Total: R$ " + preco);
    });
    double somaTotal = 0.0;
    for (Object totalCategoria : mapaDeAnaliseDeVendas.values()) {
            somaTotal += (double) totalCategoria;
    }
    System.out.println("Faturamento Total: R$ " + somaTotal);
    }
}
