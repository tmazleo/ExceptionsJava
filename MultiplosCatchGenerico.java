public class MultiplosCatchGenerico {
    public static void main(String[] args) {
        // capturando um erro ou excecao generica
        int[] numeros = {4,8,16,32,64,128};
        int[] deno = {2,0,4,8,0};

        for(int i=0; i< numeros.length; i++) {
            try{
                System.out.println(numeros[i]+"/"+deno[i]+"="+(numeros[i]/deno[i]));
            } catch (ArithmeticException e) {
                System.out.println("erro ao dividir por zero");
            } catch (Throwable e) {
                System.out.println("Ocorreu um erro");
            }


        }
    }
}
