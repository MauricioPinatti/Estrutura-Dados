import java.io.IOException;
import java.util.Scanner;

public class Arrays {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        double[] temperaturas = new double[5];
        temperaturas[0] = 31.3;
        temperaturas[1] = 32;
        temperaturas[2] = 33.7;
        temperaturas[3] = 34;
        temperaturas[4] = 33.1;


        System.out.println("O valor da temperatura do dia 3 é: " + temperaturas[2]);

        System.out.println("O tamanho do Array é: " + temperaturas.length);

        for(int i=0; i<temperaturas.length; i++){
            System.out.println("O valor da temperatura do dia " + (i+1) + " é: " + temperaturas[i]);
        }

        System.out.println("For melhorado imprimindo valores das temperaturas: ");

        for (double temp : temperaturas){
            System.out.println(temp);
        }

        sc.close();
    }

}