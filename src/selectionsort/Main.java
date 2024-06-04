package selectionsort;

public class Main {

    /*
        SELECTION SORT - Complexidade O(N^2) quadrado (+ rapido que bubble sort, mas quadrática tbm)
    Verifica qual é o menor elemento da lista, comparando a posição menor que é [i] com a posição [j]
    guarda a posição menor na variavel aux
    pega o valor da posição menor e coloca na posição [i](que é a posição que precisa ser ordenada/substituída)
    e depois colocar o valor da aux, que é a menor posição no vetor da posição [i]
    ele realiza apenas uma troca, diferente do bublle sort, pois ele só guarda o valor na aux e realiza a troca depois

    */

    public static void main(String[] args) {
        int [] vetor = new int[10];

        System.out.println("Desordenado");
        // preenche o vetor com números aleatórios
        for(int i = 0; i < vetor.length; i++){
            vetor[i] = (int) (Math.random() * vetor.length);
        }

        System.out.println("Desordenado");
        for(int i = 0; i < vetor.length; i++){
            System.out.println(vetor[i]);
        }


        // SELECTION SORT
        int posicao_menor, aux;
        for(int i = 0; i < vetor.length; i++) {
            posicao_menor = i;
            for (int j = i + 1; j < vetor.length; j++) {
                if (vetor[j] < vetor[posicao_menor]) {
                    posicao_menor = j;
                }
            }
            aux = vetor[posicao_menor];
            vetor[posicao_menor] = vetor[i];
            vetor[i] = aux;
        }

        System.out.println("\n\nOrdenado");
        for(int i = 0; i < vetor.length; i++){
            System.out.println(vetor[i]);
        }
    }
}
