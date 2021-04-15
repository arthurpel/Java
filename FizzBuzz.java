public class FizzBuzz {

    public static void FizzBuzz(int taille_liste) {
        String[] liste = new String[taille_liste+1];
        for(int index=1;index < taille_liste+1;index++) {
            liste[index] = "" + index;
            if(index%3 ==0 && index%5 ==0)
                liste[index] = "FizzBuzz";
            else if(index%3 ==0)
                liste[index] = "Fizz";
            else if(index%5 ==0)
                liste[index] = "Buzz";
            System.out.println(liste[index]);
        }
    }//FizzBuzz method

    public static void main(String[] args) {
            FizzBuzz(100);
    }//main function
}//FizzBuzz class
