public class DigitCalculator {
    public int calc(String[][] values) {
        checkSizeCondition(values.length);

        for (int i = 0; i < values.length; i++) {
            checkSizeCondition(values[i].length);
        }

        int sum  = 0;
        for (int i = 0; i < values.length; i++) {
            for (int j = 0; j < values[i].length; j++) {
               try {
                   sum += Integer.parseInt(values[i][j]);
               } catch (NumberFormatException e) {
                   String message = String.format("Массив[%s][%s] должен содержать только арабские цифры", i, j);
                   throw new MyDataArrayException(message, e);
               }
            }
        }

        return sum;
    }

    private void checkSizeCondition(int length) {
        if (length != 4) {
            throw new MyArraySizeException("Развмер массива должна быть  4x4");
        }

    }
}