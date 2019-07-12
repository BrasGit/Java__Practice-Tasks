package Collection;


import java.util.LinkedList;

public class LinkedListTopic {
    public static void main(String[] args) {
        LinkedList<String> data = new LinkedList<>();
        data.addFirst  ("qwerty");
        data.add ("qwert");
        data.add ("qwer");
        data.add ("qwe");
        data.addLast ("qw");
        for (String datum : data) {

        }

        System.out.printf("List has elements \n", data.size());

        data.removeFirst();
        System.out.printf("List has elements \n", data.size());

    }
}
