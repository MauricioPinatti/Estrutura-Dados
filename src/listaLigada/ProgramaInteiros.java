package listaLigada;

public class ProgramaInteiros {

    public static void main(String[] args) {
        ListaLigada<Integer> numeros = new ListaLigada<Integer>();
        numeros.adicionar(1);
        numeros.adicionar(2);
        numeros.adicionar(3);
        numeros.adicionar(4);
        numeros.adicionar(5);

        for(int i = 0; i < numeros.getTamanho(); i++){
            System.out.println(numeros.get(i).getValor());
        }
    }
}

