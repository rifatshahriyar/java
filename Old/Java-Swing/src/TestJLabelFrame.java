import javax.swing.*;
import java.awt.*;

public class TestJLabelFrame extends JFrame
{
	public TestJLabelFrame() 
	{
		super("Simple Frame");
		ImageIcon ic=new ImageIcon("img.png");
		JLabel label1=new JLabel();
		label1.setText("My Label");
		JLabel label2=new JLabel(ic);		
		Container c=getContentPane();
		c.setLayout(new FlowLayout());
		c.add(label1); 
		c.add(label2);					
		setSize(250,250);		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocation(300,300);		
		setVisible(true);
		
	}
	
	public static void main(String args[])
	{
		new TestJLabelFrame();
	}
}