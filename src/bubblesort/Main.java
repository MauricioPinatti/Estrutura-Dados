package bubblesort;
/*
    Algorito muito lerdo, apenas para pequenos conjutos de dados!
*/

public class Main {
    public static void main(String[] args) {
        int [] vetor = new int[100000];

        for(int i = 0; i < vetor.length; i++){
            vetor[i] = (int) (Math.random() * vetor.length);
            //System.out.println(vetor[i]);
        }

        long inicio = System.currentTimeMillis();
        long fim;
        //BUBBLE SORT - Complexidade O(N^2) quadrado
        int aux;
        for(int i = 0; i < vetor.length; i++){ // 0(N) varre o vetor inteiro
            for(int j = i + 1; j < vetor.length; j++){ // 0(N -1) desconsidera o numero absoluto
                if(vetor[i] > vetor[j]){
                    aux = vetor[j];
                    vetor[j] = vetor[i];
                    vetor[i] = aux;
                }
            }
        }
        fim = System.currentTimeMillis();
        System.out.println("Tempo: " + (fim - inicio));
        /*System.out.println("Vetor ordenado!");
        for(int i = 0; i < vetor.length; i++){
            System.out.println(vetor[i]);
        }*/

    }
}
