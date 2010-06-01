/*
 * This is a class for asking questions about Arithmetic. Currently only
 * addition is supported.
 */

import java.util.Random;
public class Arithmetic implements Question {

    Random generator = new Random();
    int a = generator.nextInt(100);
    int b = generator.nextInt(100);

    int answer = a + b;
    public String correct = Integer.toString(answer);

    public Arithmetic(){
        
    }

    public String ask() {
        return a+"+"+b+"";
    }


    public Boolean guess(String guess) {
        int guessInt = 0;
        
        try {
            guessInt = Integer.parseInt(guess.trim());
        }catch (NumberFormatException nfe){
            System.out.println("NumberFormatException: " + nfe.getMessage());
            System.exit(1);
        }

        if (guessInt != answer){
            return false;
        }else{
            return true;
        }

    }


}
