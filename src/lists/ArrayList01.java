package lists;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class ArrayList01 {

    public static void main(String[] args) {
        
        List<Integer> numbers = new ArrayList<Integer>(3);

        numbers.add(2);
        numbers.add(1);
        numbers.add(3);
        numbers.add(22);
        numbers.add(21);
        numbers.add(52);
        numbers.add(5);
        numbers.add(0);
        numbers.add(9);
        numbers.add(12);
        numbers.add(14);

        System.out.println(numbers);

        Collections.sort(numbers);
        System.out.println("Ordenado crescente:" + numbers);

        Collections.reverse(numbers);
        System.out.println("Ordenado decrescente:" + numbers);

        //obtem pelo index
        System.out.println(numbers.get(3));

        //remove pelo index
        System.out.println(numbers.remove(2));

        System.out.println(numbers);
    }

    
}
