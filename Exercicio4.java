public class Exercicio4 {
    public static void main(String[] args) {
        int numeros[] = {16, 23, 55, 11, 85, 36, 77, 59, 66, 29};

        for(int indice = 0;indice < numeros.length;indice++) {
            boolean ePrimo = true;
            for(int valor = 2;valor < numeros[indice];valor++) {
                if(numeros[indice] % valor == 0) {
                    ePrimo = false;
                    break;
                }
            }
            if(ePrimo) {
                System.out.print(numeros[indice]);
            }       
        }
    }
}
