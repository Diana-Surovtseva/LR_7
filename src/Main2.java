import java.util.HashSet;
import java.util.Set;

public class Main2 {
    public static void main(String[] args) {
        Set<Integer> setCollection = new HashSet();
        setCollection.add(1);
        setCollection.add(2);
        setCollection.add(2);
        setCollection.add(3);

        for (Integer element:setCollection
             ) {
            System.out.println(element);
        }
    }

}
