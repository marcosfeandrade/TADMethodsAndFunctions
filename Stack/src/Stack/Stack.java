package Stack;

public class Stack<T> {

    private StackNode<T> topo;

    public boolean isEmpty() { // Verifica se o stack está cheio
        if (topo == null) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isFull() { // Verifica se o stack está cheio
        return false;
    }

    public void push(T valor) {  // Inserir inicio
        StackNode<T> novo = new StackNode(valor);
        if (isEmpty() == true) {
            topo = novo;
        } else {
            novo.setProx(topo);
            topo = novo;
        }
    }

    public T pop() { // Remover inicio
        StackNode<T> aux = topo;

        topo = topo.getProx();
        return aux.getInfo();
    }

    public T top() {
        return topo.getInfo();
    }
}
