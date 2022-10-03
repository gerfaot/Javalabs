public class Main {
    static void doSomething(String[][] strArray) throws MyArraySizeException{
        if (strArray.length != 4 || strArray[0].length != 4){
            throw new MyArraySizeException("Length and width should be 4");
        }
    }
    public static void main(String[] args) throws MyArraySizeException {
        String[][] str = new String[5][4];
        doSomething(str);

    }
}
