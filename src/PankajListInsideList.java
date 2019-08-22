import java.util.ArrayList;

public class PankajListInsideList {

    public static void main(String[] args) {

        ArrayList<ArrayList<String>> counterList = new ArrayList<>();
        ArrayList<String> singleList = new ArrayList();
        singleList.add("hello");
        singleList.add("pankaj");
        counterList.add(singleList);

        ArrayList<String> anotherList = new ArrayList<String>();
        anotherList.add("this is another list");
        counterList.add(anotherList);

        System.out.println(counterList.contains(singleList));
        System.out.println(counterList.remove(singleList));

        ArrayList<String> activeRegisters = new ArrayList<String>();
        anotherList.add("this is activeRegisters");

        System.out.println(counterList.add(singleList));



    }
}
