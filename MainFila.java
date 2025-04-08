class NoFila {
    int valor;
    NoFila proximo;

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

    public void insere(int valor) {
        NoFila novoNo = new NoFila(valor);
        if (fim == null) {
            inicio = novoNo;
            fim = novoNo;
        } else {
            fim.proximo = novoNo;
            fim = novoNo;
        }
        System.out.println("Elemento " + valor + " inserido na fila.");
    }

    public int remove() {
        if (inicio == null) {
            System.out.println("Fila vazia, não é possível remover.");
            return -1;
        }
        int valorRemovido = inicio.valor;
        inicio = inicio.proximo;
        if (inicio == null) {
            fim = null;
        }
        System.out.println("Elemento " + valorRemovido + " removido da fila.");
        return valorRemovido;
    }

    public void imprime() {
        NoFila atual = inicio;
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