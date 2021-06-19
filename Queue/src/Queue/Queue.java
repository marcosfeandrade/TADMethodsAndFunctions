package Queue;

public class Queue<T> {

    private QueueNode<T> inicio;
    private QueueNode<T> fim;
    private int qtd;
    private int limite;

    public Queue(int limite) { // Utilizado caso haja um limite para a fila na hora de instanciá-la
        this.limite = limite;
    }

    public void setLimite(int limite) { // Utilizado caso haja um limite para a fila, depois de instanciá-la
        this.limite = limite;
    }

    public boolean isEmpty() { // Verifica se a fila está vazia
        if (inicio == null) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isFull() { // Verifica se a fila está cheia
        if (qtd == limite) {
            return true;
        }
        return false;
    }

    public T head() { // Retorna o inicio da fila
        return inicio.getInfo();
    }

    public void enqueue(T valor) { // Adiciona um novo nó atrás da fila
        QueueNode<T> novo = new QueueNode(valor);
        if (isEmpty()) {
            inicio = novo;
            fim = novo;
            qtd++;
        } else {
            if (!isFull()) {
                fim.setProx(novo);
                fim = novo;
                qtd++;
            }
        }
    }

    public T dequeue() { // Adiciona o nó no inicio da fila
        QueueNode<T> aux = inicio;
        if (inicio == fim) {
            inicio = null;
            fim = null;
            qtd--;
        } else {
            inicio = inicio.getProx();
            qtd--;
        }
        return aux.getInfo();
    }
}
