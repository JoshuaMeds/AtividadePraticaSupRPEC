class NoPilha {
    int valor;
    NoPilha proximo;

    public NoPilha(int valor) {
        this.valor = valor;
        this.proximo = null;
    }
}

class Pilha {
    private NoPilha topo;

    public Pilha() {
        this.topo = null;
    }

    public void insere(int valor) {
        NoPilha novoNo = new NoPilha(valor);
        novoNo.proximo = topo;
        topo = novoNo;
        System.out.println("Elemento " + valor + " inserido na pilha.");
    }

    public int remove() {
        if (topo == null) {
            System.out.println("Pilha vazia, não é possível remover.");
            return -1;
        }
        int valorRemovido = topo.valor;
        topo = topo.proximo;
        System.out.println("Elemento " + valorRemovido + " removido da pilha.");
        return valorRemovido;
    }

    public void imprime() {
        NoPilha atual = topo;
        System.out.print("Elementos da pilha: ");
        while (atual != null) {
            System.out.print(atual.valor + " ");
            atual = atual.proximo;
        }
        System.out.println();
    }
}

public class MainPilha {
    public static void main(String[] args) {
        Pilha pilha = new Pilha();

        System.out.println("=== TESTE DA PILHA ===");
        pilha.insere(10);
        pilha.insere(20);
        pilha.insere(30);
        pilha.imprime();

        System.out.println("\nRemovendo elementos:");
        pilha.remove();
        pilha.imprime();

        pilha.remove();
        pilha.imprime();

        pilha.remove();
        pilha.imprime();

        pilha.remove(); // Tentativa de remover de pilha vazia
    }
}