public class Main {
    public static void main(String[] args) {
        Queue<String> queue = new Queue<>();

        queue.enqueue("first");
        queue.enqueue("second");
        queue.enqueue("third");

        System.out.println(queue.dequeue()); // Output: first
        System.out.println(queue.peek()); // Output: second
        System.out.println(queue.size()); // Output: 2
        System.out.println(queue.isEmpty()); // Output: false

        queue.dequeue();
        queue.dequeue();
        System.out.println(queue.isEmpty()); // Output: true
    }
}
