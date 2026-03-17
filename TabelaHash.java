class No {
    int valor;
    No proximo;

    public No(int valor) {
        this.valor = valor;
        this.proximo = null;
    }
}

class TabelaHash {

    No[] tabela;

    public TabelaHash(int tamanho) {
        tabela = new No[tamanho];
    }

    public int hash(int valor) {
        return valor % tabela.length;
    }

    public void inserir(int valor) {
        int indice = hash(valor);

        No novo = new No(valor);

        if (tabela[indice] == null) {
            tabela[indice] = novo;
        } else {
            novo.proximo = tabela[indice];
            tabela[indice] = novo;
        }
    }

    public boolean buscar(int valor) {
        int indice = hash(valor);

        No atual = tabela[indice];

        while (atual != null) {
            if (atual.valor == valor) {
                return true;
            }
            atual = atual.proximo;
        }

        return false;
    }

    public void imprimir() {
        for (int i = 0; i < tabela.length; i++) {
            System.out.print("Posição " + i + ": ");

            No atual = tabela[i];

            while (atual != null) {
                System.out.print(atual.valor + " -> ");
                atual = atual.proximo;
            }

            System.out.println("null");
        }
    }
}