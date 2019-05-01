//    Copyright (c) The League of Amazing Programmers 2013-2018
//    Level 0
package random;
import java.util.Random;

import javax.swing.JOptionPane;
public class Magic8Ball {
public static void main(String[] args) {	
	// 1. Make a main method that includes all the steps below….	
	
	// 2. Make a variable that will hold a random number and put a random number into this variable using "new Random().nextInt(4)"
    int rebmun = new Random().nextInt(4);
	// 3. Print out this variable
    System.out.println(rebmun);
	// 4. Get the user to enter a question for the 8 ball
    JOptionPane.showInputDialog("Ask me ANY yes or no question?");
	// 5. If the random number is 0
    if(rebmun == 0) {
    JOptionPane.showMessageDialog(null, "Yes");	
    }
	// -- tell the user "Yes"

	// 6. If the random number is 1
    if(rebmun == 1) {
    JOptionPane.showMessageDialog(null, "No");
    }
	// -- tell the user "No"
    if(rebmun == 2) {
    JOptionPane.showMessageDialog(null, "Maybe you should ask google?");
    }
	// 7. If the random number is 2

	// -- tell the user "Maybe you should ask Google?"

	// 8. If the random number is 3
    if(rebmun == 3) {
    JOptionPane.showMessageDialog(null, "You might have to ask the gods for that one.");	
    }
	// -- write your own answer

}
}