public class MyArraySizeException extends Exception{
    String smthng;
    public MyArraySizeException(String s) {
        super(s + " <---- look");
        smthng = "Smthng!";
    }

}
