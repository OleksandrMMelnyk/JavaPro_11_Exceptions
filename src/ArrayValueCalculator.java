import java.util.Arrays;


public class ArrayValueCalculator {

    public static int doCalc(String[][] array) throws ArrayDataException, ArraySizeException {
        if (array.length != 4 || Arrays.stream(array).anyMatch(row -> row.length != 4)) {
            throw new ArraySizeException("Array size should be 4x4");
        }

        int total = 0;
        for (int i = 0; i < array.length; i +=1){
            for (int j =0; j < array[i].length; j+=1) {
                try {
                    total += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    throw new ArrayDataException("Invalid data in: " + (i + 1) + ", column " + (j + 1));
                }
            }
        }
        return total;
    }
}
