/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author avi
 */
public interface Question {


   //[int|String] answer
    String correct = "";
    String ask();
    Boolean guess(String guess);

}
