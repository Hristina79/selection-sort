import java.util.Comparator;

public class Main {
    public static void main(String[] args) {

        // Create a SingleLinkedListQueue
        SingleLinkedList<Integer> queue = new SingleLinkedList<>();
        
        // Add elements to the queue
        queue.enqueue(5);
        queue.enqueue(1);
        queue.enqueue(4);
        queue.enqueue(2);
        queue.enqueue(3);

        System.out.println("Original Queue: " + queue);

        // Create a SelectionSort instance
        SelectionSort<Integer> sorter = new SelectionSort<>();

        // Sort in natural order (comparator = null)
        MyQueue<Integer> sortedQueue = sorter.sort(queue, null);
        System.out.println("Sorted (Natural Order): " + sortedQueue);

        // Sort using a Comparator
        Comparator<Integer> descendingComparator = Comparator.reverseOrder();
        MyQueue<Integer> reverseSortedQueue = sorter.sort(queue, descendingComparator);
        System.out.println("Sorted (Descending Order): " + reverseSortedQueue);
    }
}