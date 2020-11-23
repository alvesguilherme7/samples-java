package eti.policarto.ctrlexecao;

public class ConexaoBanco implements AutoCloseable {

    public ConexaoBanco() {
        System.out.println(" Conexão aberta...");
    }

    public void levantarExcecaoUnchecked(){
        throw new ConexaoBancoUnchekedException(" Exception Uncheked. ");
    }

    public void levantarExcecaoChecked() throws ConexaoBancoChekedException {
        throw new ConexaoBancoChekedException(" Exception Cheked. ");
    }

    @Override
    public void close() {
        System.out.println(" Conexão Fechada... ");
    }
}
