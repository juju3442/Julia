import javax.swing.JOptionPane;

public class creeper {
public static void main(String[] args) {
	String Money = JOptionPane.showInputDialog(null, "Who much money do you own? ");
	String Music = JOptionPane.showInputDialog(null, "What song is your favorite right now? ");
	String Cake = JOptionPane.showInputDialog(null,"Do you prefer Luke or Calum?");
	String Bands = JOptionPane.showInputDialog(null, "What happens to be your favorite band right now?");
	JOptionPane.showMessageDialog(null, "I know you have NO MONEY "+Money+ "your favorite song is Hallow by Mayday Parade "+Music+ "you prefer Luke even though you say you don't "+Cake);
	JOptionPane.showMessageDialog(null,"Your favorite band is Mayday Parade or 5 Seconds of Summer. "+Bands);
}
}