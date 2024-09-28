import java.util.Vector;
public class Vectors {
    public static void main(String[] args) {
        Vector<Integer> numVector = new Vector<>();
        numVector.add(10);
        numVector.add(20);
        numVector.add(30);
        numVector.add(3, 100);
        System.out.println(numVector);
    }
}
