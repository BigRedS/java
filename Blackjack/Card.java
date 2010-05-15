public class Card {
	public int value;
	public char suit;

	private Card(){
		Card(a,0);
	}
	
	private Card(char suit, int value){
		if (value > 13){
			Random rand = new Random(14);
			int value = rand.nextInt();
		}
		
		
	}
}

/* Pretends to be a dataype of
 * type Rank
 */

public class Rank{
	private Rank (String name){
		rank = name;
	}
}
/* Petends to be a datatype of 
 * type suit
 */
public class Suit{
	public final static 
	private Suit (string name){
		suit = name;
	}
}
