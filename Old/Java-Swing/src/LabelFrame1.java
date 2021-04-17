import javax.swing.*;
import java.awt.*;

public class LabelFrame1 extends JFrame
{
	public LabelFrame1() 
	{
		super("Simple Frame");
		JLabel label=new JLabel("Simple Label");
		JButton button=new JButton("Simple Button");
		add(label); // This method uses BorderLayout
		add(button);					
		setSize(250,250);		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocation(300,300);		
		setVisible(true);
		
	}
	
	public static void main(String args[])
	{
		new LabelFrame1();
	}
}