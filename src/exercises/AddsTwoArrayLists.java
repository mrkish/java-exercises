package exercises;
import java.util.ArrayList;

public class AddsTwoArrayLists {

    public static void main(String[] args) {

        ArrayList<Integer> first = new ArrayList<Integer>();
        first.add(3);
        first.add(4);
        first.add(5);
        first.add(1);

        ArrayList<Integer> second = new ArrayList<>();
        second.add(1);
        second.add(6);

        ArrayList<Integer> sumList = new ArrayList<>();

        for (int i = 0; i < first.size(); i++) {
            if(i < second.size()) {
                int sum = first.get(i) + second.get(i);
                sumList.add(sum);
            } else {
                //int sum = first.get(i);
                sumList.add(first.get(i));
            }

        }
        System.out.println(sumList);
    }
}
