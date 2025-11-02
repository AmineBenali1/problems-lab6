package problem5;

public class Main {
    public static void main(String[] args){
        Book book3 = new Book("The Hobbit","J.R.R. Tolkien",1937);
        Book book2 = new Book("1984","George Orwell",1949);
        Book book1 = new Book("Clean Code", " Robert C. Martin", 2008);
        // stack
        System.out.println("=== Stack Test ===");
        BookStack stack = new BookStack();
        stack.push(book3);
        stack.push(book2);
        stack.push(book1);
        stack.display();
        stack.pop();
        Book top = stack.peek();
        stack.display();

        System.out.println("=== Queue Test ===");
        BookQueue queue = new BookQueue();
        queue.enqueue(book3);
        queue.enqueue(book2);
        queue.enqueue(book1);
        queue.display();
        queue.dequeue();
        Book front = stack.peek();
        queue.display();
    }
}
