public class UsandoMinhaException {
    public static void main(String[] args) {
        int[] numeros = {4,8,5,16,32,21,64,128};
        int[] deno = {2,0,4,8,0,2,4};

        for(int i=0; i< numeros.length; i++) {
            try{
                if(numeros[i] % 2 != 0) {
                    //lancar exception

                    throw new DivisaoNaoExata(numeros[i], deno[i]);
                }
                System.out.println(numeros[i]+"/"+deno[i]+"="+(numeros[i]/deno[i]));
            } catch (ArrayIndexOutOfBoundsException | ArithmeticException | DivisaoNaoExata e) {
                System.out.println("ocorreu um erro");
                e.printStackTrace();
            }
    }
}
}
