public class Main {
    public static void main(String[] args) {

        String [][] array = {
                {"4", "1", "3", "2"},
                {"12", "15", "18", "21"},
                {"24", "26", "28", "30"},
                {"32", "33", "31", "34"}
        };

        try {
            System.out.println("Total amount: " + ArrayValueCalculator.doCalc(array));
        } catch (ArraySizeException | ArrayDataException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
