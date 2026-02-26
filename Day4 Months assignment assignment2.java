import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class MonthsLinkedList {
    public static void main(String[] args) {
        LinkedList<String> months = new LinkedList<>();

        months.add("May");
        months.add("June");
        months.add("July");
        months.add("August");
        months.add("April");
        months.add("November");

        months.addLast("December");
        months.addFirst("January");

        months.add(1, "March");
        months.add(1, "February");

        months.remove("April");
        months.add(3, "April");

        months.add(8, "September");
        months.add(9, "October");

        System.out.println("(1) Proper order: " + months);

        LinkedList<String> evenMonths = new LinkedList<>();
        for (int i = 0; i < months.size(); i++) {
            if ((i + 1) % 2 == 0) evenMonths.add(months.get(i));
        }
        System.out.println("(2) Even months: " + evenMonths);

        LinkedList<String> oddMonths = new LinkedList<>();
        for (int i = 0; i < months.size(); i++) {
            if ((i + 1) % 2 != 0) oddMonths.add(months.get(i));
        }
        System.out.println("(3) Odd months: " + oddMonths);

        System.out.print("(4) Iterator: ");
        Iterator<String> it = months.iterator();
        while (it.hasNext()) {
            System.out.print(it.next());
            if (it.hasNext()) System.out.print(", ");
        }
        System.out.println();

        System.out.println("(5) First & Last together: " + months.getFirst() + " | " + months.getLast());

        Scanner sc = new Scanner(System.in);
        System.out.print("(6) Enter your birthday month to remove: ");
        String bday = sc.nextLine().trim();
        boolean removed = false;
        Iterator<String> it2 = months.iterator();
        while (it2.hasNext()) {
            if (it2.next().equalsIgnoreCase(bday)) {
                it2.remove();
                removed = true;
                break;
            }
        }
        System.out.println(removed ? "(6) Removed: " + bday : "(6) Not found: " + bday);
        System.out.println("(6) After removal: " + months);

        boolean hasWinter = months.contains("December") || months.contains("January") || months.contains("February");
        System.out.println("(7) Contains any winter month (Dec/Jan/Feb)? " + hasWinter);

        String peekFirst = months.peekFirst();
        String peekLast = months.peekLast();
        System.out.println("(8) peekFirst: " + peekFirst + ", peekLast: " + peekLast);

        String pollFirst = months.pollFirst();
        String pollLast = months.pollLast();
        System.out.println("(9) pollFirst: " + pollFirst + ", pollLast: " + pollLast);
        System.out.println("(9) After polling: " + months);

        sc.close();
    }
}
