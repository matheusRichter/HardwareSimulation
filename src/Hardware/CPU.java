package Hardware;

public class CPU {
    IO io;
    Cache cache;

    public CPU(IO io, Cache cache) {
        this.io = io;
        this.cache = cache;
    }

    public void Run(int ender) throws EnderecoInvalido {
        io.OutPut(cache.solicitacao(ender));
    }
}
