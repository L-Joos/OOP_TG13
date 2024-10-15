package b1_Lists;

import java.util.LinkedList;
import java.util.Queue;

public class StacksAndQueues {

    public static void main(String[] args) {
        Queue<String> languages = new LinkedList<String>();

        languages.add("C++");
        languages.add("Assmebler");
        languages.add("Java");
        languages.add("Lua");

        System.out.println("Queue: " + languages);

        String front = languages.remove();
        System.out.println("Removed element: " + front);

        System.out.println("Queue after removal: " + languages);

        languages.add("C");

        String peeked = languages.peek();
        System.out.println("Peeked element: " + peeked);

        System.out.println("Queue after peek: " + languages);

    }
    
}
