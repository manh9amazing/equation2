import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Test {
    int lol = 1 ;

    public static void main(String[] args) {

        List listA = new ArrayList();
        listA.add(3);
        listA.add(4);
        listA.add(5);
        System.out.println(listA);
        int ele = (int) listA.get(0);
        System.out.println(ele);
        Random rand = new Random();
        int n = rand.nextInt(5);
        System.out.println(n);
        int joj = listA.size();
        System.out.println(joj);
        System.out.println("-------------------");
    }
}

