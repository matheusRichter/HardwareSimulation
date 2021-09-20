package Hardware;

public interface Memoria {
    /**
     * Interface comum para memórias, seja Ram ou cache
     * */

    int Read(int ender) throws EnderecoInvalido;

    void Write(int ender, int palavra) throws EnderecoInvalido;
}
