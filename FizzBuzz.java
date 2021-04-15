public class FizzBuzz {

    public static void FizzBuzz(int taille_liste) {
        for(int index=1; index < taille_liste + 1; index++) {
            if(index%3 ==0 && index%5 ==0)
                System.out.println("FizzBuzz");
            else if(index%3 ==0)
                System.out.println("Fizz");
            else if(index%5 ==0)
                System.out.println("Buzz");
            else
                System.out.println(index);
        }
    }//FizzBuzz method

    public static void main(String[] args) {
            FizzBuzz(100);
    }//main function
}//FizzBuzz class
