public class Main {
    public static void main(String[] args) {

        TabelaHash tabela = new TabelaHash(5);

        tabela.inserir(10);
        tabela.inserir(15);
        tabela.inserir(20);
        tabela.inserir(7);

        System.out.println("TABELA HASH:");
        tabela.imprimir();

        System.out.println("\nBuscar 15:");
        System.out.println(tabela.buscar(15));
    }
}