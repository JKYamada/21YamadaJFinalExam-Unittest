public class StringCalculator {
    public static int add(final String numbers) {
        int returnValue = 0;
        String[] numbersArray = numbers.split(",|\n");
        for (String number : numbersArray) {
            if (!number.trim().isEmpty()) {
                int value = Integer.parseInt(number.trim());
                if (value < 0)
                    throw new IllegalArgumentException("Negatives not allowed");

                if (value < 1000)
                    returnValue += value;
            }
        }
        return returnValue;
    }
}