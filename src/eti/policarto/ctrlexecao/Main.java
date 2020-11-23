package eti.policarto.ctrlexecao;

public class Main {
    public static void main(String[] args) {
        try(ConexaoBanco conn = new ConexaoBanco()){
            conn.levantarExcecaoChecked();
            conn.levantarExcecaoUnchecked();
        }catch ( ConexaoBancoUnchekedException | ConexaoBancoChekedException e){
            System.err.println(" A exceção levantada foi a "+ e.getClass());
            e.printStackTrace();
        }
    }
}
