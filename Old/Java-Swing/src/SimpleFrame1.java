import javax.swing.*;

public class SimpleFrame1 
{
	public SimpleFrame1()
	{
		JFrame frame=new JFrame("Simple Frame");
		frame.setSize(250,250);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocation(300,300);
		frame.setVisible(true);
	}
	
	public static void main(String args[])
	{
		new SimpleFrame1(); // same as SimpleFrame1 frame = new SimpleFrame1();
	}
}