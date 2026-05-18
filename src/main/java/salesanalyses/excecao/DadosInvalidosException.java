package main.java.salesanalyses.excecao;

public class DadosInvalidosException extends Exception { //Herda de Exception para ser verificada antes compilação
    public DadosInvalidosException(String mensagem) {
        super(mensagem);
    }
}
