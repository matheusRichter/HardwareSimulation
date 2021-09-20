package Hardware;

public class CalcEndeBom {

    public static int separa_t(int x){
        int mascara = 0b111111111110000000000000;
        return (x & mascara) >> 13;
    }

    public static int separa_r(int x){
        int mascara = 0b1111111000000;
        return (x & mascara) >> 6;
    }

    public static int separa_w(int x){
        int mascara = 0b111111;
        return x & mascara;
    }

    public static int concatena_s(int t, int r){
        return t << (32 - Integer.numberOfLeadingZeros(r)) | r;
    }
}
