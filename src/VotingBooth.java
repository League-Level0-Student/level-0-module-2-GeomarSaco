import javax.swing.JOptionPane;

public class VotingBooth {
public static void main(String[] args) {
String Age = JOptionPane.showInputDialog(null,"How old are you?(In YEARS)");
int years = Integer.parseInt(Age);
if(years>=18) {
JOptionPane.showInputDialog(null,"You may vote. So who do you think the next president should be?");
}
else {
JOptionPane.showMessageDialog(null,"Nobody Cares about what you have to say. LOL");	
}
}
}