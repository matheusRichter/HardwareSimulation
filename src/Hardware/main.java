package Hardware;

public class main {

    public static void main(String[] args) throws EnderecoInvalido {
        IO es = new IO(System.out);
        RAM ram = new RAM(24);
        Cache cache = new Cache(ram, 64);

        ram.Write(156251, 9);


        CPU cpu = new CPU(es, cache);

        cpu.Run(10000001);

    }
}
