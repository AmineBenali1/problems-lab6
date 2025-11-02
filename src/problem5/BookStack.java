package problem5;

import java.util.LinkedList;

public class BookStack {
    private LinkedList<Book> stack;

    public BookStack() {
        stack = new LinkedList<>();
    }

    public void push(Book book) {
        stack.addFirst(book);
    }

    public Book pop() {
        System.out.println("popped: "+ stack.getFirst());
        return stack.removeFirst();

    }

    public Book peek() {
        System.out.println("Top: "+ stack.getFirst());
        return stack.getFirst();
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public void display() {
        System.out.println("Stack contents (top to bottom):");
        for(int i = 0; i < stack.size(); i++) {
            System.out.println("-"+stack.get(i));
        }
    }
}

