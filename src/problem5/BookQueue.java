package problem5;

import java.util.LinkedList;

public class BookQueue {
    private LinkedList<Book> queue;
    public BookQueue() {
        queue = new LinkedList<>();
    }
    public void enqueue(Book book) {
        queue.addLast(book);
    }
    public Book dequeue() {
        System.out.println("Dequeued: "+ queue.getFirst());
        return queue.removeFirst();
    }
    public Book peek() {
        System.out.println("Front: "+ queue.getFirst());
        return queue.getFirst();
    }
    public void display() {
        System.out.println("Queue contents (Front to back):");
        for(int i = 0; i <queue.size(); i++) {
            System.out.println("-"+queue.get(i));
        }

    }
}

