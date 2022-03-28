public class Exercicio3{
    public static void main(String[] args) {
        int vetor[] = {15, 20, 55, 10, 85, 36, 77, 56, 66, 25};
        
        for(int i = 0;i < (vetor.length - 1);i++){
            if(vetor[i] > vetor[i+1]) {
                int aux = vetor[i];
                vetor[i] = vetor[i+1];
                vetor[i+1] = aux;
                i = -1;
            }
        }
        
        for(int i = 0;i < vetor.length;i++) {
            System.out.println(vetor[i]);
        }
    }
}            

