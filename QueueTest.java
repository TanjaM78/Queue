import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class QueueTest {

    private Queue<Integer> queue;


    /*@Before-Annotation gehört zum Test-Framework JUnit und wird verwendet, um eine Methode zu markieren, die vor jedem einzelnen Test in der Testklasse ausgeführt werden soll.
     In diesem Fall wird die setUp()-Methode markiert, die eine Instanz der Queue-Klasse erstellt und der Variablen queue zuweist.
     Da diese Methode vor jedem Test ausgeführt wird, stellt sie sicher, dass jeder Test auf eine frische Instanz der Queue-Klasse zugreifen kann, ohne dass der vorherige Test das Ergebnis beeinflusst.
     */
    @Before
    public void setUp() {
        queue = new Queue<>();
    }
    /*Element zur Warteschlange hinzugefügt und die Größe der Warteschlange überprüft. Dann werden zwei weitere Elemente hinzugefügt und die Größe der Warteschlange wird nach jedem Hinzufügen überprüft.*/
    @Test
    public void testEnqueue() {
        queue.enqueue(1);
        assertEquals(1, queue.size());
        queue.enqueue(2);
        assertEquals(2, queue.size());
        queue.enqueue(3);
        assertEquals(3, queue.size());
    }
    /* drei Elemente in die Queue eingefügt. Anschließend wird das erste Element mit dequeue() entfernt und mit assertEquals() überprüft, ob es den erwarteten Wert hat.
     Das wird für die nächsten beiden Elemente wiederholt. Am Ende wird noch geprüft, ob die Größe der Queue nach dem Entfernen aller Elemente korrekt 0 ist.*/
    @Test
    public void testDequeue() {
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        assertEquals(Integer.valueOf(1), queue.dequeue());
        assertEquals(Integer.valueOf(2), queue.dequeue());
        assertEquals(Integer.valueOf(3), queue.dequeue());
        assertEquals(0, queue.size());
    }
    /*Zuerst wird überprüft, ob die Queue als leer erkannt wird, indem die Methode isEmpty() aufgerufen und das Ergebnis mit assertTrue() überprüft wird.
    Danach wird ein Element in die Queue eingefügt und die Methode isEmpty() wird erneut aufgerufen, um sicherzustellen, dass die Queue nicht mehr als leer erkannt wird.
    Dazu wird das Ergebnis mit assertTrue(!queue.isEmpty()) überprüft.*/
    @Test
    public void testIsEmpty() {
        assertTrue(queue.isEmpty());
        queue.enqueue(1);
        assertTrue(!queue.isEmpty());
    }
    /*ein Element zur Queue hinzugefügt, und dann wird geprüft, ob das zurückgegebene Element von peek() dem hinzugefügten Element entspricht.
     Danach wird ein weiteres Element hinzugefügt und erneut geprüft, ob peek() das erste Element zurückgibt.
     Schließlich wird das erste Element aus der Queue entfernt und erneut geprüft, ob peek() nun das zweite Element zurückgibt.*/
    @Test
    public void testPeek() {
        queue.enqueue(1);
        assertEquals(Integer.valueOf(1), queue.peek());
        queue.enqueue(2);
        assertEquals(Integer.valueOf(1), queue.peek());
        queue.dequeue();
        assertEquals(Integer.valueOf(2), queue.peek());
    }

}
