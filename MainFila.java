class NoFila {
    int valor;
    NoFila proximo; // referecia pro próximo nó

    public NoFila(int valor) {
        this.valor = valor;
        this.proximo = null;
    }
}

class Fila {
    public NoFila inicio;
    private NoFila fim;

    public Fila() {
        this.inicio = null;
        this.fim = null;
    }

    // insere um valor no final da fila
    public void insere(int valor) {
        NoFila novoNo = new NoFila(valor); // cria um novo nó
        if (fim == null) {
            inicio = novoNo;
            fim = novoNo;
        } else {
            fim.proximo = novoNo;
            fim = novoNo; // atualiza o fim para ser o novo nó
        }
        System.out.println("Elemento " + valor + " inserido na fila.");
    }

    // remove valor do inicio da fila
    public int remove() {
        if (inicio == null) {
            System.out.println("Fila vazia, não é possível remover.");
            return -1;
        }
        int valorRemovido = inicio.valor; // guarda valor
        inicio = inicio.proximo; // atualiza o valor
        if (inicio == null) {
            fim = null; // atualiza o fim
        }
        System.out.println("Elemento " + valorRemovido + " removido da fila.");
        return valorRemovido;
    }

    // imprime fila
    public void imprime() {
        NoFila atual = inicio; // inicio ao fim da fila
        System.out.print("Elementos da fila: ");
        while (atual != null) {
            System.out.print(atual.valor + " ");
            atual = atual.proximo;
        }
        System.out.println();
    }
}

public class MainFila {
    public static void main(String[] args) {
        Fila fila = new Fila();

        System.out.println("=== TESTE DA FILA ===");
        fila.insere(10);
        fila.insere(20);
        fila.insere(30);
        fila.imprime();

        System.out.println("\nRemovendo elementos:");
        fila.remove();
        fila.imprime();

        fila.remove();
        fila.imprime();

        fila.remove();
        fila.imprime();

        fila.remove(); // Tentativa de remover de fila vazia

        System.out.println("\nInserindo novos elementos:");
        fila.insere(100);
        fila.insere(200);
        fila.imprime();
    }
}
