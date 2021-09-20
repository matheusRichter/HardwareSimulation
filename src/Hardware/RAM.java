package Hardware;

public class RAM implements Memoria{

    private final int tam; // tamanho total da memória
    private final int[] ram; // array que representa a memória

    public RAM(int k){
        tam = (int) Math.pow(2,k);
        this.ram = new int[tam];
    }

    @Override
    public int Read(int ender) throws EnderecoInvalido {
        /**
         * Função para ler da Ram
         * Faz validação do endereço passado no parâmetro,
         * caso o endereço seja válido, realiza a leitura,
         * caso o endereço não seja válido, lança exceção.
         * */
        if(EhValido(ender)) {
            return ram[ender];
        }
        throw new EnderecoInvalido(ender);
    }

    @Override
    public void Write(int ender, int palavra) throws EnderecoInvalido {
        /**
         * Função para escrever na Ram
         * Faz validação do endereço passado no parâmetro,
         * caso o endereço seja válido, realiza a escrita,
         * caso o endereço não seja válido, lança exceção.
         * */
        if(EhValido(ender)) {
            ram[ender] = palavra;
        }else {
            throw new EnderecoInvalido(ender);
        }
    }

    private boolean EhValido(int ender){
        /**
         * Função para validar endereço de leitura ou escrita
         * Para ser válido um endereço precisa ser menor que o
         * tamanho total da memória e maior do que zero
         * */
        return (ender >= 0 && ender < tam);
    }
}
