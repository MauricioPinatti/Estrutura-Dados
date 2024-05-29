package listaligada;

public class Programa {

    public static void main(String[] args) {
        ListaLigada<String> lista = new ListaLigada<String>();
        lista.adicionar("AC");
        lista.adicionar("BA");
        lista.adicionar("CE");
        lista.adicionar("DF");
        System.out.println("Tamanho: " + lista.getTamanho());
        System.out.println("Primeiro: " + lista.getPrimeiro().getValor());
        System.out.println("Ultimo: "+  lista.getUltimo().getValor());

        for(int i = 0; i < lista.getTamanho(); i++){
            System.out.println(lista.get(i).getValor());
        }

        // removendo elemento

        System.out.println("________________________");

        lista.remover("CE");
        System.out.println("Adicionando SP");
        lista.adicionar("SP");
        System.out.println("Removendo todos");
        lista.remover("AC");
        lista.remover("BA");
        lista.remover("DF");
        lista.remover("SP");

        System.out.println(lista.getTamanho());


        for(int i = 0; i < lista.getTamanho(); i++){
            System.out.println(lista.get(i).getValor());
        }
    }
}
