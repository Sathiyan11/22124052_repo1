import java.util.HashSet;

public class FirstRepeatingElement {
    public static void main(String[] args) {
        int[] array = {10, 5, 3, 4, 3, 5, 6};
        int result = findFirstRepeatingElement(array);
        if (result != -1) {
            System.out.println("The first repeating element is: " + result);
        } else {
            System.out.println("There is no repeating element in the array.");
        }
    }

    public static int findFirstRepeatingElement(int[] array) {
        HashSet<Integer> set = new HashSet<>();
        int minIndex = -1;
        
        for (int i = array.length - 1; i >= 0; i--) {
            if (set.contains(array[i])) {
                minIndex = i;
            } else {
                set.add(array[i]);
            }
        }
        
        if (minIndex != -1) {
            return array[minIndex];
        } else {
            return -1; 
        }
    }
}
