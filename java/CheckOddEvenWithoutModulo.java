class CheckOddEvenWithoutModulo {

    public static void main(String[] args) {
        int number = 25;

        if (isEven(number)) {
            System.out.println(number + " is even.");
        } else {
            System.out.println(number + " is odd.");
        }
    }

    public static boolean isEven(int number) {
        int quotient = number / 2;

        // If the quotient multiplied by 2 is equal to the number, it's even
        if (quotient * 2 == number) {
            return true;
        } else {
            return false;
        }
    }
}
