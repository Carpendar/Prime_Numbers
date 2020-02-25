public class Main {{}
    public static void main(String[] args) {

        int inputVal = 124; //Integer.parseInt(args[1]);

        if( (inputVal % 2 == 0) && (inputVal != 2)) {
            System.out.println(inputVal + " is not Prime");
        }
        else if ( (inputVal % 3 == 0) && (inputVal != 3)) {
            System.out.println(inputVal + " is not Prime");
        }
        else {
            for (int i = 5; i < inputVal; i += 2) {
                if (inputVal % i == 0) {
                    System.out.println(inputVal + " is not Prime");
                }
            }
        }
    }
}
