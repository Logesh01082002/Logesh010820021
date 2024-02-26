public class PrimeCheckWithoutLoop {
    public static void main(String[] args) {
        int number = 13;

        if (isPrime(number)) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }

    public static boolean isPrime(int number) {
        // this is implemented by prime number = 6n + 1
        float fraction = (float) (number - 1) / 6; 

        return fraction == (int) fraction; // Number is prime
    }
}
