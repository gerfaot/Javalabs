public class MyArrayDataException extends NumberFormatException {
    public MyArrayDataException(int a, int b) {
        super("Incorrect data in array, check element: " + "[" + a + "][" + b + "]");
    }
}
