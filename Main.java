/*Реализовать свой LinkedList с методами вставки в начало, конец списка, 
получения размера списка и получения
элемента по индексу. (можете выбрать список однонаправленный или двунаправленный, 
по желанию)
*/
public class Main {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        //Добавляем записи в список
        list.insertAtBeginning("1");
        list.insertAtEnd("2");
        list.insertAtEnd("3");
        list.insertAtEnd("4");
        list.insertAtBeginning("5");
        //Выводим размер списка
        System.out.println("Размер списка: " + list.getSize() + " элементов");
        //Выводим элементы списка
        System.out.println("Элемент под индексом 0: " + list.getElementAtIndex(0));
        System.out.println("Элемент под индексом 1: " + list.getElementAtIndex(1));
        System.out.println("Элемент под индексом 2: " + list.getElementAtIndex(2));
        System.out.println("Элемент под индексом 3: " + list.getElementAtIndex(3));
        System.out.println("Элемент под индексом 4: " + list.getElementAtIndex(4));
    }
}
