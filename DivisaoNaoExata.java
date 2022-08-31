public class DivisaoNaoExata extends Exception{

    private int num;
    private int deno;

    public DivisaoNaoExata(int num, int deno) {
        super();
        this.num = num;
        this.deno = deno;
    }

    @Override
    public String toString() {
        return "Resultado de "+num+"/"+deno+" nao e um inteiro ";
    }
}
