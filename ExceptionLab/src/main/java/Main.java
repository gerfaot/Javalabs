import java.util.Arrays;

public class Main {

    static void stringArrayToIntSum(String[][] strArray) throws MyArraySizeException {
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

    public static void main(String[] args) throws MyArraySizeException {
        String[][] str = new String[4][4];

        str[0][0] = "1";
        str[2][0] = "9";
        str[0][1] = "2";
        str[2][1] = "10";
        str[0][2] = "3";
        str[2][2] = "11";
        str[0][3] = "4";
        str[2][3] = "12";
        str[1][0] = "5";
        str[3][0] = "13";
        str[1][1] = "6";
        str[3][1] = "14";
        str[1][2] = "7";
        str[3][2] = "15";
        str[1][3] = "8";
        str[3][3] = "16";

        stringArrayToIntSum(str);

    }
}
