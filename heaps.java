public void remover(int indice) {
    int ultimo = heap.size() - 1;

    heap.set(indice, heap.get(ultimo));
    heap.remove(ultimo);

    descer(indice);
}

private void descer(int indice) {
    for (;;) {
        int esquerdo = 2 * indice + 1;
        int direito = 2 * indice + 2;
        int maior = indice;

        if (esquerdo < heap.size() && heap.get(esquerdo) > heap.get(maior)) {
            maior = esquerdo;
        }

        if (direito < heap.size() && heap.get(direito) > heap.get(maior)) {
            maior = direito;
        }

        if (maior == indice) {
            break;
        }

        int temp = heap.get(indice);
        heap.set(indice, heap.get(maior));
        heap.set(maior, temp);

        indice = maior;
    }
}