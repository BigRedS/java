/* This runs the questioning. It will, one day, choose a random class to use
 * for the generation of questions.
 *
 */

public class QuestionMaster{

        static int totalAsked = 0;
	static int totalWrong = 0;
	static int totalCorrect = 0;

        Question Q = new Arithmetic();

	public QuestionMaster(){
            
	}

        public String ask(){
            totalAsked++;
            return Q.ask();
        }

	public boolean answer(String guess){
            if (Q.guess(guess)){
                totalCorrect++;
            }else{
                totalWrong++;
            }
            return Q.guess(guess);
	}

        public String correct = Q.correct;
        
        public static void stats(){
		System.out.println("Total: "+totalAsked);
		System.out.println("Correct: "+totalCorrect);
		System.out.println("Wrong: "+totalWrong);
	}
}
