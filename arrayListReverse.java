import java.util.ArrayList;

public class arrayListReverse {
    static void reverseList(ArrayList<Integer> list) {
        int i = 0;
        int j = list.size() - 1;
        while (i < j) {
            Integer temp = Integer.valueOf(list.get(i));
            list.set(i, list.get(j));
            list.set(j, temp);
            i++;
            j--;
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(11);// adding elements in list
        list.add(12);
        list.add(13);
        list.add(14);
        list.add(15);
        System.out.println("Original List : " + list);
        reverseList(list);
        System.out.println("Reversed List : " + list);
    }
}
