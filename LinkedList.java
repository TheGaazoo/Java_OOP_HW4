public class LinkedList<T> {
    private Node head;
    private int size;

    private class Node {
        T data;
        Node next;

        Node(T data) {
            this.data = data;
            next = null;
        }
    }
    //Вставка в начало списка
    public void insertAtBeginning(T data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        size++;
    }
    //Вставка в конец списка
    public void insertAtEnd(T data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        size++;
    }
    //Получаем размер списка
    public int getSize() {
        return size;
    }
    //Выводим элемент соответствующий индексу
    public T getElementAtIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        Node current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.data;
    }
}
