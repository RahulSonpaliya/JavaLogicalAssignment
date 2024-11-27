public class CardOwnerCategory {
    public static void main(String[] args) {
        final String cardNum = "0521123455677734";

        // Extract the 13th and 14th digits (substring starting from index 12 and ending at 14)
        final String qualifiedDigits = cardNum.substring(12, 14);

        if(qualifiedDigits.equals("01")) {
            System.out.println("Primary Card");
        } else {
            System.out.println("Secondary Card");
        }
    }
}
