package Hardware;

public class Line {
    public int tag;
    public boolean modif; // flag que indica se a cache foi modificada
    public int[] bloco; // array que representa a linha da cache

    public Line(int k) {
        /**
         * o tamanho do 'bloco' é o valor de 'k' passado como parâmetro
         * */
        this.bloco = new int[k];
    }
}
