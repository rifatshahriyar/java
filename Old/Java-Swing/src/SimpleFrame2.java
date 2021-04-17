import javax.swing.*;

public class SimpleFrame2 extends JFrame
{
	public SimpleFrame2() 
	{
		super("Simple Frame");
		setSize(250,250);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocation(300,300);
		setVisible(true);
	}
	
	public static void main(String args[])
	{
		new SimpleFrame2();
	}
}