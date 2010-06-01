/*
 * _all_ Question classes should implement this.
 */
public interface Question {


   //[int|String] answer
    String correct = "";
    String ask();
    Boolean guess(String guess);

}
