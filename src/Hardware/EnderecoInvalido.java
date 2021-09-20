package Hardware;

class EnderecoInvalido extends Exception{
    private final int ender;

    public EnderecoInvalido(int ender){
        this.ender = ender;
    }

    @Override
    public String toString() {
        return "EnderecoInvalido{" +
                "ender=" + ender +
                '}';
    }
}