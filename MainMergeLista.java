// combina duas filas ordenadas em  uma nova fila ordenada

public class MainMergeLista {
    public static void main(String[] args) {
        Fila filaA = new Fila(); // fila 1
        Fila filaB = new Fila(); // fila 2

        System.out.println("=== TESTE DO MERGE COM LISTA ENCADEADA ===");

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
        Fila filaC = mergeFilas(filaA, filaB);
        filaC.imprime();
    }

    public static Fila mergeFilas(Fila filaA, Fila filaB) {
        Fila filaC = new Fila(); // percorre as filas
        NoFila atualA = filaA.inicio;
        NoFila atualB = filaB.inicio;

        while (atualA != null && atualB != null) {
            if (atualA.valor < atualB.valor) { // comparar elementos das filas
                filaC.insere(atualA.valor);
                atualA = atualA.proximo;
            } else {
                filaC.insere(atualB.valor);
                atualB = atualB.proximo;
            }
        }

        // Adiciona os elementos restantes de A se tiver
        while (atualA != null) {
            filaC.insere(atualA.valor);
            atualA = atualA.proximo;
        }

        // Adiciona os elementos restantes de B se tiver
        while (atualB != null) {
            filaC.insere(atualB.valor);
            atualB = atualB.proximo;
        }

        return filaC;
    }
}
