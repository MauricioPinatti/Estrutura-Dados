package insertionsort;

public class Main {

    /*
        INSERTION SORT - Complexidade O(N^2) quadrado
        i não precisa iniciar no 0, pois vamos testar o segundo com o primeiro
        sempre testamos com as posições anteriores do vetor  comparando com o valor em aux
    */

    public static void main(String[] args) {
        int [] vetor = new int[10];

        System.out.println("Desordenado");
        // preenche o vetor com números aleatórios
        for(int i = 0; i < vetor.length; i++){
            vetor[i] = (int) (Math.random() * vetor.length);
            System.out.println(vetor[i]);
        }

        int aux, j;
        for(int i = 1; i < vetor.length; i++){
            aux = vetor[i];
            j = i -1;
            while (j >= 0 && vetor[j] > aux){
                vetor[j+1] = vetor[j];
                j--;
            }
            vetor[j+1] = aux;
        }

        System.out.println("\n\nOrdenado");
        for(int i = 0; i < vetor.length; i++){
            System.out.println(vetor[i]);
        }
    }
}
