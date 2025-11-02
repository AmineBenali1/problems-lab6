package problem3;

import java.util.Scanner;

public class Test {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of documents (greater than 2) : ");
        int CAPACITY = scan.nextInt();
        scan.nextLine(); // consume leftover newline
        Library library = new Library(CAPACITY);

        library.add(new Novel("Novel1", "Amine Benali", 150, 20));
        library.add(new TextBook("TextBook1", "Ali Ben", 200, "SUP"));

        printMenu();
        int choice = scan.nextInt();
        scan.nextLine();

        while (choice != 0) {
            switch(choice) {
                case 1:
                    AdditionMenu();
                    int addChoice = scan.nextInt();
                    scan.nextLine();
                    switch (addChoice) {
                        case 1: { // Novel
                            System.out.println("Enter the title of the novel : ");
                            String title = scan.nextLine();
                            System.out.println("Enter the author of the novel : ");
                            String author = scan.nextLine();
                            System.out.println("Enter the number of pages of the novel : ");
                            int nbrPages = scan.nextInt();
                            scan.nextLine();
                            System.out.println("Enter the price of the novel : ");
                            double price = scan.nextDouble();
                            scan.nextLine();

                            library.add(new Novel(title, author, nbrPages, price));
                            break;
                        }

                        case 2: { // TextBook
                            System.out.println("Enter the title of the TextBook : ");
                            String title = scan.nextLine();
                            System.out.println("Enter the author of the TextBook : ");
                            String author = scan.nextLine();
                            System.out.println("Enter the number of pages of the TextBook : ");
                            int nbrPages = scan.nextInt();
                            scan.nextLine();
                            System.out.println("Enter the level of the TextBook : ");
                            String level = scan.nextLine();

                            library.add(new TextBook(title, author, nbrPages, level));
                            break;
                        }

                        case 3: { // Magazine
                            System.out.println("Enter the title of the Magazine : ");
                            String title = scan.nextLine();
                            System.out.println("Enter the month of the Magazine : ");
                            String month = scan.nextLine();
                            System.out.println("Enter the year of the Magazine : ");
                            int year = scan.nextInt();
                            scan.nextLine();

                            library.add(new Magazine(title, month, year));
                            break;
                        }

                        case 4: { // Dictionary
                            System.out.println("Enter the title of the dictionary : ");
                            String title = scan.nextLine();
                            System.out.println("Enter the language of the dictionary : ");
                            String language = scan.nextLine();

                            library.add(new Dictionary(title, language));
                            break;
                        }

                        default:
                            System.out.println("Invalid document choice.");
                            break;
                    }
                    break;

                case 2: { // Delete document
                    System.out.println("Enter the title of the document to delete: ");
                    String title = scan.nextLine();
                    library.delete(title);
                    break;
                }

                case 3: // Display authors
                    library.displayAuthors();
                    break;

                case 4:
                    library.displayDocuments();
                    break;
                case 5:
                    System.out.println("Enter the record number to search: ");
                    int numRec = scan.nextInt();
                    Document result = library.document(numRec);
                    if(result != null){
                        System.out.println(result);
                    }
                    else{
                        System.out.println("Document not found");
                    }
                    break;
                default:
                    System.out.println("Sorry, invalid choice");
                    break;
            }

            printMenu();
            choice = scan.nextInt();
            scan.nextLine();
        }
    }

    //----------------------------
    public static void printMenu() {
        System.out.println("\n Menu ");
        System.out.println(" ====");
        System.out.println("0: Quit");
        System.out.println("1: Add a document");
        System.out.println("2: Delete a document");
        System.out.println("3: Display Authors");
        System.out.println("4: Display all documents");
        System.out.println("5: Search for a document");
        System.out.print("\nEnter your choice: ");
    }

    public static void AdditionMenu(){
        System.out.println("Which document to add ?");
        System.out.println("1: Novel");
        System.out.println("2: TextBook");
        System.out.println("3: Magazine");
        System.out.println("4: Dictionary");
        System.out.print("\nEnter your choice: ");
    }
}
