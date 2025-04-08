Atividade Pratica Supervisionada

 - Estrutura do Projeto
/estruturas-dados-java
  ├── MainPilha.java            # Implementação de Pilha com lista encadeada
  ├── MainFila.java             # Implementação de Fila com lista encadeada
  ├── MainMergeLista.java       # Merge de filas com lista encadeada
  └── MainMergeVetor.java       # Merge de filas com vetores


 - Implementações
1. Pilha (Lista Encadeada)
insere(int valor): Adiciona elemento no topo

remove(): Remove elemento do topo

imprime(): Exibe todos os elementos

2. Fila (Lista Encadeada)
insere(int valor): Adiciona elemento no final

remove(): Remove elemento do início

imprime(): Exibe todos os elementos

3. Merge de Filas
Versão Lista Encadeada: mergeFilas(Fila filaA, Fila filaB)

Versão Vetores: mergeFilas(FilaVetor filaA, FilaVetor filaB)


 - Exemplos de Validação
Pilha p = new Pilha();
p.insere(10); p.insere(20); p.insere(30);
p.imprime();  // 30 20 10
p.remove();   // Remove 30
p.imprime();  // 20 10

Fila f = new Fila();
f.insere(10); f.insere(20); f.insere(30);
f.imprime();  // 10 20 30
f.remove();   // Remove 10
f.imprime();  // 20 30

// Fila A: 12, 35, 52, 64
// Fila B: 5, 15, 23, 55, 75
Fila resultado = mergeFilas(filaA, filaB);
resultado.imprime(); // 5 12 15 23 35 52 55 64 75


 - Soluções Implementadas
Pilha com Lista Encadeada;
Inserção/remoção O(1);
Alocação dinâmica de memória;
Tratamento de pilha vazia;
Fila com Lista Encadeada;
Inserção O(1) no final;
Remoção O(1) no início;
Ponteiros para início e fim;
Merge de Filas;
Algoritmo O(n+m) para listas encadeadas;
Versão com vetores usando aritmética modular;
Preserva a ordenação das filas de entrada;
