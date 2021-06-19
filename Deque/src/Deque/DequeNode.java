package Deque;

public class DequeNode<T> {

    private T info;
    private DequeNode<T> prox;
    private DequeNode<T> ant;

    DequeNode(T valor) {
        info = valor;
    }

    void setInfo(T valor) {
        info = valor;
    }

    void setProx(DequeNode<T> novoProx) {
        prox = novoProx;
    }

    void setAnt(DequeNode<T> novoAnt) {
        ant = novoAnt;
    }

    T getInfo() {
        return info;
    }

    DequeNode<T> getProx() {
        return prox;
    }

    DequeNode<T> getAnt() {
        return ant;
    }
}
