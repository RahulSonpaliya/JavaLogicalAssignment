public class CardNumberMask {

    public static void main(String[] args) {
        final String cardNum = "0521123455677734";
        final String maskedCardNum = maskCardNumber(cardNum, "xxxx-xxxx-xxxx-####");
        System.out.println(maskedCardNum);
    }

    /**
     * Applies the specified mask to the card number.
     *
     * @param cardNumber The card number in plain format
     * @param mask The number mask pattern. Use # to include a digit from the
     * card number at that position, use x to skip the digit at that position
     *
     * @return The masked card number
     */
    private static String maskCardNumber(String cardNumber, String mask) {

        // format the number
        int index = 0;
        StringBuilder maskedNumber = new StringBuilder();
        for (int i = 0; i < mask.length(); i++) {
            char c = mask.charAt(i);
            if (c == '#') {
                maskedNumber.append(cardNumber.charAt(index));
                index++;
            } else if (c == 'x') {
                maskedNumber.append(c);
                index++;
            } else {
                maskedNumber.append(c);
            }
        }

        // return the masked number
        return maskedNumber.toString();
    }

}
