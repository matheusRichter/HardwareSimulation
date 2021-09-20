package Hardware;

public class IO {
    java.io.PrintStream saida;

    public IO(java.io.PrintStream saida){
        this.saida = saida;
    }

    public void OutPut(int palavra){
        saida.println(palavra);
    }
}
