class FilaVetor {
    private int[] dados; // vetor para elemnentos
    private int inicio; // indice do primeiro elemento
    private int fim; // indice do ultimo elemento
    private int tamanho;// quantidade de elementos
    private final int tamanhoMaximo; // maximo

    public FilaVetor(int tamanhoMaximo) {
        this.tamanhoMaximo = tamanhoMaximo;
        this.dados = new int[tamanhoMaximo];
        this.inicio = 0;
        this.fim = -1;
        this.tamanho = 0;
    }

    //inserir elementos
    public void insere(int valor) {
        if (tamanho == tamanhoMaximo) {
            System.out.println("Fila cheia, não é possível inserir.");
            return;
        }
        fim = (fim + 1) % tamanhoMaximo;
        dados[fim] = valor;
        tamanho++;
        System.out.println("Elemento " + valor + " inserido na fila.");
    }

    //remover elementos
    public int remove() {
        if (tamanho == 0) {
            System.out.println("Fila vazia, não é possível remover.");
            return -1;
        }
        int valorRemovido = dados[inicio];
        inicio = (inicio + 1) % tamanhoMaximo;
        tamanho--;
        System.out.println("Elemento " + valorRemovido + " removido da fila.");
        return valorRemovido;
    }

    //imprimir elementos
    public void imprime() {
        System.out.print("Elementos da fila: ");
        for (int i = 0; i < tamanho; i++) {
            int pos = (inicio + i) % tamanhoMaximo;
            System.out.print(dados[pos] + " ");
        }
        System.out.println();
    }

    public int getTamanho() {
        return tamanho;
    }

    public int getElemento(int index) {
        if (index < 0 || index >= tamanho) {
            throw new IndexOutOfBoundsException("Índice inválido");
        }
        return dados[(inicio + index) % tamanhoMaximo]; // calcula possicao do vetor
    }
}

public class MainMergeVetor {
    public static void main(String[] args) {
        FilaVetor filaA = new FilaVetor(10);
        FilaVetor filaB = new FilaVetor(10);

        System.out.println("=== TESTE DO MERGE COM VETORES ===");

        // Preenchendo fila A
        System.out.println("\nPreenchendo fila A:");
        filaA.insere(12);
        filaA.insere(35);
        filaA.insere(52);
        filaA.insere(64);
        filaA.imprime();

        // Preenchendo fila B
        System.out.println("\nPreenchendo fila B:");
        filaB.insere(5);
        filaB.insere(15);
        filaB.insere(23);
        filaB.insere(55);
        filaB.insere(75);
        filaB.imprime();

        // Realizando o merge
        System.out.println("\nRealizando merge das filas A e B:");
        FilaVetor filaC = mergeFilas(filaA, filaB);
        filaC.imprime();
    }

    public static FilaVetor mergeFilas(FilaVetor filaA, FilaVetor filaB) {
        int tamanhoTotal = filaA.getTamanho() + filaB.getTamanho(); // cria fila do resultado
        FilaVetor filaC = new FilaVetor(tamanhoTotal);
        int indexA = 0;
        int indexB = 0;

        while (indexA < filaA.getTamanho() && indexB < filaB.getTamanho()) {
            int valorA = filaA.getElemento(indexA); // obtem elementos
            int valorB = filaB.getElemento(indexB); // obtem elementos

            if (valorA < valorB) { // compara e pega o menor
                filaC.insere(valorA);
                indexA++;
            } else {
                filaC.insere(valorB);
                indexB++;
            }
        }

        // Adiciona os restos de A
        while (indexA < filaA.getTamanho()) {
            filaC.insere(filaA.getElemento(indexA));
            indexA++;
        }

        // Adiciona os restos de A
        while (indexB < filaB.getTamanho()) {
            filaC.insere(filaB.getElemento(indexB));
            indexB++;
        }

        return filaC;
    }
}
