/* This is basically a frontend to QuestionMaster.
 *
 */

import java.util.Random;
import java.io.Console;


public class maths{
	public static void main(String[] args) {

            for(int count=0; count<2; count++){

                QuestionMaster Q = new QuestionMaster();
                Console c = System.console();
                if (c == null){
                    System.out.println("Error: no console support!");
                    System.exit(1);
                }else{
                    String guess = c.readLine(Q.ask()+"\n");
                    if(Q.answer(guess)){
                        System.out.println("Yay");
                    }else{
                        System.out.println("Nope");
                        System.out.println("\tExpected "+Q.correct);
                    }
                }
            }
            QuestionMaster.stats();
	}
} 
