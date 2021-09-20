public class CalcEndeBom {

    /*
     * Retorna o valor t do endereco passado como parametro
     * */
    public static int separa_t(int x){
        int mascara = 0b111111111110000000000000;
        return (x & mascara) >> 13;
    }

    /*
     * Retorna o valor r do endereco passado como parametro
     * */
    public static int separa_r(int x){
        int mascara = 0b1111111000000;
        return (x & mascara) >> 6;
    }

    /*
     * Retorna o valor w do endereco passado como parametro
     * */
    public static int separa_w(int x){
        int mascara = 0b111111;
        return x & mascara;
    }

    /*
     * Concatena o as variaveis t e r, resultando no s
     * */
    public static int concatena_s(int t, int r){
        return t << (32 - Integer.numberOfLeadingZeros(r)) | r;
    }

    /*
     * Retorna o primeiro indereco do bloco da memoria
     * */
    public static int endereco_inicial(int s){
        int x = 24 - Integer.toBinaryString(s).length();
        return s<<x;
    }
}
