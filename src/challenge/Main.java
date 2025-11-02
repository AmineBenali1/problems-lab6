package challenge;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        LinkedList<Place> placesToVisit = new LinkedList<>();

        // Add places in sorted order
        placesToVisit.add(new Place("Melbourne", 877));
        placesToVisit.add(new Place("Brisbane", 917));
        placesToVisit.add(new Place("Adelaide", 1374));
        placesToVisit.add(new Place("Alice Springs", 2771));
        placesToVisit.add(new Place("Perth", 3923));
        placesToVisit.add(new Place("Darwin", 3972));

        Scanner scanner = new Scanner(System.in);
        ListIterator<Place> iterator = placesToVisit.listIterator();
        boolean quit = false;
        boolean goingForward = true;

        printMenu();
        System.out.println("Starting in " + iterator.next());

        while (!quit) {
            System.out.print("\nSelect action: ");
            String action = scanner.nextLine().trim().toUpperCase();

            switch (action) {
                case "F":
                    if (!goingForward) {
                        if (iterator.hasNext()) iterator.next();
                        goingForward = true;
                    }
                    if (iterator.hasNext()) {
                        System.out.println("Traveling to " + iterator.next());
                    } else {
                        System.out.println("End of the list");
                        goingForward = false;
                    }
                    break;

                case "B":
                    if (goingForward) {
                        if (iterator.hasPrevious()) iterator.previous();
                        goingForward = false;
                    }
                    if (iterator.hasPrevious()) {
                        System.out.println("Traveling back to " + iterator.previous());
                    } else {
                        System.out.println("We are at the start of the list.");
                        goingForward = true;
                    }
                    break;
                case "L":
                    printList(placesToVisit);
                    break;
                case "M":
                    printMenu();
                    break;
                case "Q":
                    quit = true;
                    break;
                default:
                    System.out.println("Invalid option. Try again.");
            }
        }
    }

    private static void printMenu() {
        System.out.println("\nSelect a letter:  ");
        System.out.println("(F)orward");
        System.out.println("(B)ackward");
        System.out.println("(L)ist Places");
        System.out.println("(M)enu");
        System.out.println("(Q)uit");
    }

    private static void printList(LinkedList<Place> list) {
        System.out.println("\nList of places to visit:");
        for (Place place : list) {
            System.out.println(place);
        }
    }
}


