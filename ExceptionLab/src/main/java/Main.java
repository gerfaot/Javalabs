import java.util.Arrays;

public class Main {

    static void stringArrayToIntSum(String[][] strArray) {
        int sum = 0;
        int firstIndex = 0;
        int secondIndex = 0;
        if (strArray.length != 4 || strArray[0].length != 4) {
            throw new MyArraySizeException("Length and width should be 4");
        }
        try {
            for (String[] strings : strArray) {
                for (String string : strings) {
                    firstIndex = Arrays.asList(strArray).indexOf(strings);
                    secondIndex = Arrays.asList(strings).indexOf(string);
                    sum = sum + Integer.parseInt(string);
                }
            }
        } catch (NumberFormatException e) {
            throw new MyArrayDataException(firstIndex, secondIndex);
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        String[][] str = new String[][]{
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"}
        };

        stringArrayToIntSum(str);

    }
}
