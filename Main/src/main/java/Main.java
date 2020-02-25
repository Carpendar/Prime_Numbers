public class Main {{}
    public static void main(String[] args) {

        int inputVal = 124; //Integer.parseInt(args[1]);
        int sqrVal = (int)Math.sqrt(inputVal);

        if((inputVal % 2 == 0) || (inputVal % 3 == 0)) {
            System.out.println(inputVal + " is not Prime");
        }
        else {
            // all primes are of the form 6k ± 1, with the exception of 2 and 3
            for (int i = 5; i * i <= sqrVal; i = i + 6) {
                if ((inputVal % i == 0) || (inputVal % (i+2) == 0)) {
                    System.out.println(inputVal + " is not Prime");
                }
            }
        }
    }
}
