public class MultiplosCatch {
    public static void main(String[] args) {

        int[] numeros = {4,8,16,32,64,128};
        int[] deno = {2,0,4,8,0};
// tratando mais de uma exception
        for(int i=0; i< numeros.length; i++) {
            try{
                System.out.println(numeros[i]+"/"+deno[i]+"="+(numeros[i]/deno[i]));
            } catch (ArithmeticException e) {
                System.out.println("erro ao dividir por zero");
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("posicao sem divisor");
            }


        }
    }
}
