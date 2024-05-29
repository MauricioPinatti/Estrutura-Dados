package listaligada;

public class ProgramaCliente {

    public static void main(String[] args) {
        ListaLigada<Cliente> clientes = new ListaLigada<Cliente>();

        clientes.adicionar(new Cliente("Joao", "123"));
        clientes.adicionar(new Cliente("Maria", "124"));
        clientes.adicionar(new Cliente("Jose", "125"));

        for(int i = 0; i < clientes.getTamanho(); i++){
            System.out.println(clientes.get(i).getValor());
        }
    }
}
