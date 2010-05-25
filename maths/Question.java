import java.util.*;

public class Question{

	Random generator = new Random();
	int a = generator.nextInt(100);
	int b = generator.nextInt(100);
	String question = a+"+"+b;
	int answer = a + b;

	static int tot = 0;
	static int totWrong = 0 ;
	static int totCorrect = 0;

	public Question(){
	}

	public String ask(){
		tot++;
		StandardQuestion Q = new Differentiation();
		return Q.ask();
	}

	public boolean answer(int guess){
		if(guess == answer){
			totCorrect++;
			return true;
		}else{
			totWrong++;
			return false;
		}
	}

        public int correct(){
		return answer;
	}

        public static void stats(){
		System.out.println("Total: "+tot);
		System.out.println("Correct: "+totCorrect);
		System.out.println("Wrong: "+totWrong);
	}
}
