class NoPilha {
    int valor;
    NoPilha proximo; // Referecia pro proximo nó

    public NoPilha(int valor) {
        this.valor = valor;
        this.proximo = null;
    }
}

// Estrutura usando lista encadeada
class Pilha {
    private NoPilha topo;

    public Pilha() {
        this.topo = null;
    }

    // inserir valor no topo da pilha
    public void insere(int valor) {
        NoPilha novoNo = new NoPilha(valor); //nó com Valor
        novoNo.proximo = topo; // aponta pro antigo
        topo = novoNo;
        System.out.println("Elemento " + valor + " inserido na pilha.");
    }

    // remoiver elementos do topo
    public int remove() {
        if (topo == null) {
            System.out.println("Pilha vazia, não é possível remover.");
            return -1;
        }
        int valorRemovido = topo.valor; // guarda o novo valor do top
        topo = topo.proximo; //atualiza o valor do Tpo
        System.out.println("Elemento " + valorRemovido + " removido da pilha.");
        return valorRemovido;
    }

    //imprimir pilha
    public void imprime() {
        NoPilha atual = topo;
        System.out.print("Elementos da pilha: ");
        while (atual != null) {
            System.out.print(atual.valor + " ");
            atual = atual.proximo; // percorre tudo até o final
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
