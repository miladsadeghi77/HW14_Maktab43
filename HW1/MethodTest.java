package ir.maktab.practice14;

public class MethodTest {
    // generic method
    public static <E> void printArray(E[] input) {
        for (E element : input) {
            System.out.println(element);
        }
        System.out.println();
    }
    // Overload generic method
    public static <E> void printArray(E[] input, int lowSubscript, int highSubscript) {
        if (lowSubscript < 0 || highSubscript > input.length - 1) {
            throw new IllegalArgumentException("IllegalArgumentException");
        }
        for (int i = lowSubscript; i < highSubscript + 1; i++) {
            System.out.println(input[i]);
        }
        System.out.println();
    }

    // Overload method without generics
    public static void printArray(String[] inputArray) {
        for (String element : inputArray) {
            System.out.println(element);
        }
    }

    public static void main(String args[]) {

        Integer[] intArray = {1, 2, 3, 4};
        System.out.println("Array integerArray contains:");
        printArray(intArray);
        printArray(intArray, 2, 3); //1 2 3


        Double[] doubleArray = {0.1, 0.2, 0.3, 0.4};
        System.out.println("\nArray doubleArray contains:");
        printArray(doubleArray);
        printArray(doubleArray, 1, 3); // 0.2 0.3 0.4


        Character[] charArray = {'M', 'E', 'T', 'H', 'O', 'D'};
        System.out.println("\nArray characterArray contains:");
        printArray(charArray);
        printArray(charArray, 6, 8); //exception


        String[] stringArray = {"java", "cpp", "python"};
        System.out.println("\nArray StringArray contains:");
        printArray(stringArray);
    }
}
