package Deque;

public class Deque<T> {

    private DequeNode<T> inicio;
    private DequeNode<T> fim;
    private int qtd;

    public void push(T valor) { // Inserir inicio
        DequeNode<T> novo = new DequeNode(valor);
        if (isEmpty() == true) {
            inicio = novo;
            fim = novo;
            qtd++;
        } else {
            inicio.setAnt(novo);
            novo.setProx(inicio);
            inicio = novo;
            qtd++;
        }
    }

    public T pop() { // Remover inicio
        DequeNode<T> aux = inicio;
        if (isEmpty()) {
            return null;
        } else if (qtd == 1) {
            inicio = null;
            fim = null;
            qtd--;
        } else {
            inicio = inicio.getProx();
            inicio.setAnt(null);
            qtd--;
        }
        return aux.getInfo();
    }

    public void inject(T valor) { // Inserir final
        DequeNode<T> novo = new DequeNode(valor);
        if (isEmpty()) {
            inicio = novo;
            fim = novo;
            qtd++;
        } else {
            novo.setAnt(fim);
            fim.setProx(novo);
            fim = novo;
            qtd++;
        }
    }

    public T eject() { // Remover final
        DequeNode<T> aux = fim;
        if (isEmpty()) {
            return null;
        }
        else if (qtd == 1) {
            inicio = null;
            fim = null;
            qtd--;
        } else {
            fim = fim.getAnt();
            fim.setProx(null);
            qtd--;
        }
        return aux.getInfo();
    }

    public boolean isEmpty() { // Verifica se o deque está vazio
        if (qtd == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isFull() { // Verifica se o deque está cheio
        return false;
    }

}
