import java.util.NoSuchElementException;

public class Queue<E> {
    private DoubleLinkedList<E> list;

    public Queue() {
        list = new DoubleLinkedList<E>();
    }
    /*enqueue fügt ein Element am Ende der Queue hinzu. Sie akzeptiert ein Argument e vom Typ E, das das Element darstellt, das in die Queue eingefügt werden soll.
    Die Methode fügt das Element einfach am Ende der Liste hinzu, indem sie die Methode add der Liste aufruft, die das Element am Ende hinzufügt.
    Dadurch wird das Element am Ende der Warteschlange platziert.
     */
    public void enqueue(E e) {
        list.add(e);
    }
    /*dequeue() in einer Queue-Implementierung entfernt und gibt das Element zurück, das sich am Anfang der Warteschlange befindet. Wenn die Warteschlange leer ist, wird eine NoSuchElementException ausgelöst.
     Die Methode überprüft, ob die Warteschlange leer ist, indem sie die Größe der internen Liste abruft. Wenn die Größe 0 ist, wird eine Ausnahme ausgelöst.
     Andernfalls wird das Datenobjekt des Kopfelements der Liste in eine lokale Variable data vom generischen Typ E kopiert.
     Anschließend wird das Kopfelement der Liste entfernt. Schließlich wird die lokale Variable data zurückgegeben, die das entfernte Element enthält.
     */
    public E dequeue() {
        if (list.getSize() == 0) {
            throw new NoSuchElementException();
        }
        E data = (E) list.getHead().getData();
        list.removeFirst();
        return data;
    }
    /*peek() gibt das erste Element in der Warteschlange zurück, ohne es aus der Warteschlange zu entfernen. Die Methode überprüft zuerst, ob die Größe der Warteschlange gleich Null ist. Wenn dies der Fall ist,
     wird eine NoSuchElementException ausgelöst, da es kein Element gibt, auf das zugegriffen werden kann.
    Andernfalls gibt die Methode das Datenfeld des Knotens zurück, der den Kopf der Liste darstellt. Da die Klasse generisch ist, muss das zurückgegebene Element in den entsprechenden Datentyp E gecastet werden.
     */
    public E peek() {
        if (list.getSize() == 0) {
            throw new NoSuchElementException();
        }
        return (E) list.getHead().getData();
    }

    public int size() {
        return list.getSize();
    }

    public boolean isEmpty() {
        return list.getSize() == 0;
    }
}
