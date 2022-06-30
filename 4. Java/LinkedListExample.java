import java.util.LinkedList;

public class LinkedListExample{
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();

        ll.add("A");
        ll.add("B");
        ll.add(1, "C");
        System.out.println(ll);

        ll.remove("B");
        System.out.println(ll);

        // using list as queue
        String s = ll.poll();   //removes the first element like queue
        System.out.println(s);
        System.out.println(ll);
    }
}