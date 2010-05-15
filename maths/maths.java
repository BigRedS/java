import java.util.Random;
import java.io.Console;

public class maths{
	public static void main(String[] args) {

		for(int count = 0; count <10; count++){

			Question Q = new Question();		
			Console c = System.console();
			String s = c.readLine(Q.ask()+"\n");
			int guess = Integer.parseInt(s.trim());
			if(Q.answer(guess)){
				System.out.println("Yay");
			}else{
				System.out.println("Nope");
				System.out.println("\tExpected "+Q.correct());
			}
		}
		
		Question.stats();
	}
} 
