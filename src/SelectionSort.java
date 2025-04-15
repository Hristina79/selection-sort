import java.util.Comparator;

public class SelectionSort<T extends Comparable<T>> {

    public MyQueue<T> sort(MyQueue<T> queue, Comparator<T> comparator) {

        // check if input is from a compatible type (of SingleLinkedList)
        if (!(queue instanceof SingleLinkedList)) {
            throw new IllegalArgumentException("This sorter only works with SingleLinkedList!");
        }

        // Cast SingleLinkedList for direct access
        SingleLinkedList<T> listQueue = (SingleLinkedList<T>) queue;

        System.out.println("Original queue:");
        System.out.println(listQueue); // Uses toString()

        // Start sorting
        SingleLinkedList<T>.Node current = listQueue.head;

        // Iterate over each node
        while (current != null) {
            SingleLinkedList<T>.Node minNode = current;
            SingleLinkedList<T>.Node search = current.next;

            // Find the node with min value
            while (search != null) {
                if (compare(search.data, minNode.data, comparator) < 0) {
                    minNode = search;
                }
                search = search.next;
            }

            // Swap data if a new min is found
            if (minNode != current) {
                T temp = current.data;
                current.data = minNode.data;
                minNode.data = temp;
            }

            current = current.next;
        }

        System.out.println("Sorted queue:");
        System.out.println(listQueue);

        return listQueue; // Return the sorted queue
    }

    /**
     * Compates two elements using the provided Comparator / if null it takes natural ordering
     */
    private int compare(T a, T b, Comparator<T> comparator) {
        return (comparator != null) ? comparator.compare(a, b) : a.compareTo(b);
    }
}
