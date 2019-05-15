import javax.swing.JOptionPane;
public class RollerCoaster {
public static void main(String[] args) {
String Answer = JOptionPane.showInputDialog(null, "How tall are you?(In inches)");
int inches = Integer.parseInt(Answer);
if(inches>=49) {
JOptionPane.showMessageDialog(null, "You can go on the ride.");
}
else {
JOptionPane.showMessageDialog(null,"Sorry you can not go on the ride.");
}
}
}