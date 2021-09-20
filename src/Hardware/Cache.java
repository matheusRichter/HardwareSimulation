package Hardware;

public class Cache {
    private int w;
    private int r;
    private int t;
    private int s;
    private final int k; // número de palavras em uma cahce line
    private Line[] cache; // array de cache lines
    private RAM ram; // instância da memória ram

    public Cache(RAM ram, int k){
        this.ram = ram;
        this.k = k;

        cache = new Line[128];
        for(int i = 0; i < 128; i++){
            cache[i] = new Line(k);
        }
    }

    /**
     * Função para escrever palavra na Ram
     * */
    private void write() throws EnderecoInvalido {
        for(int i=0; i < k; i++){
            ram.Write(s+w, cache[r].bloco[i]);
        }
    }

    private void read() throws EnderecoInvalido {
        for(int i = 0; i < k; i++){
            cache[r].bloco[i] = ram.Read(s+w);
        }
    }

    private int hit(){
        return cache[r].bloco[w];
    }

    private int miss() throws EnderecoInvalido {
        if(cache[r].modif){
            write();
        }
        read();
        return cache[r].bloco[w];
    }

    public int solicitacao(int ende) throws EnderecoInvalido {
        w = CalcEndeBom.separa_w(ende);
        r = CalcEndeBom.separa_r(ende);
        t = CalcEndeBom.separa_t(ende);
        s = CalcEndeBom.concatena_s(t, r);

        if (t == cache[r].tag){
            return hit();
        }else{
            return miss();
        }
    }
}
