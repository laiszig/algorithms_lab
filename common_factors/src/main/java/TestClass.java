import java.util.*;

/**
 * Calculate how many common factors exist between two given numbers.
 */
class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner scan = new Scanner(System.in);
        long a = scan.nextLong();
        long b = scan.nextLong();

        // Determine the larger and smaller number - assign a value, if a > b, change value
        long num = b;
        long num2 = a;
        ArrayList<Long> factor = new ArrayList<>();
        if (a > b){
            num = a;
            num2 = b;
        }
        /**
         * Trial Division is an algorithm for finding factors of a number by checking divisibility from 1 to num.
         * Instead of checking all numbers up to num, we only check up to sqrt(num), significantly reducing computation time.
         *
         * If num = A × B, then one of the factors (A or B) must be less than or equal to sqrt(num).
         * This is because if both A and B were greater than sqrt(num), their product would exceed num.
         */
        // If num is even, incrementer is 1, meaning i increments normally.
        // If num is odd, incrementer is 2, skipping even numbers (since they won’t be factors of an odd number).
        int incrementer = num % 2 == 0 ? 1 : 2;
        // Find all divisors (factors) of num (the larger number). It optimizes factorization using trial division up to sqrt(num).
        for (long i = 1; i <= Math.sqrt(num); i += incrementer){
            // Whenever i divides num, both i and num/i are stored in factor.
            if (num % i == 0){
                factor.add(i);
            }
            if (i != num / i){
                factor.add(num / i);
            }
        }
        //System.out.println(Arrays.toString(factor.toArray()));
        int count = 0;
        for (int i = 0; i < factor.size(); i ++){
            // If num2 is also divisible by a factor, it increases count.
            if ((num2 % factor.get(i)) == 0){
                //System.out.println(factor.get(i));
                count ++;
            }
        }
        System.out.println(count);
    }
}