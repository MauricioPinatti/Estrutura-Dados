package buscalinear;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int [] vetor = new int[8];

        // preenchendo o vetor aleatóriamente
        for(int i =0; i < vetor.length; i++){
            vetor[i] = (int) (Math.random() * 10);
            System.out.println(vetor[i]);
        }

        // Busca Linear no vetor.
        System.out.println("Qual número você busca?");
        Scanner leitor = new Scanner(System.in);
        int buscado = leitor.nextInt();

        boolean achou = false;
        for (int i = 0; i < vetor.length; i++){
            if(vetor[i] == buscado){
                achou = true;
                break;
            }
        }
        if (achou){
            System.out.println("Achou");
        }else {
            System.out.println("Não achou");
        }
    }
}