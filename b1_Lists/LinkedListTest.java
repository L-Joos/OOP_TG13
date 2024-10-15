package b1_Lists;

import java.util.LinkedList;

public class LinkedListTest
{
    public static void main(String[] args) {
        LinkedList<String> languages = new LinkedList<String>();

        languages.add("C++");
        languages.addFirst("Assmebler");
        languages.addLast("Java");
        languages.add("Lua");


        System.out.println("last: "+languages.getLast());
        System.out.println("first: "+languages.getFirst());
        System.out.println("second: "+languages.get(2));
        System.out.println("first: "+languages.peek());

        System.out.println("Complete List:");
        System.out.println(languages);
    }
}
