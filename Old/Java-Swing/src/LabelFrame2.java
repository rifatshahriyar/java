import javax.swing.*;
import java.awt.*;

public class LabelFrame2 extends JFrame
{
	public LabelFrame2() 
	{
		super("Simple Frame");
		JLabel label=new JLabel("Simple Label");
		JButton button=new JButton("Simple Button");
		Container c=getContentPane();
		c.setLayout(new FlowLayout());
		c.add(label); 
		c.add(button);
		/*FlowLayout flowLayout = new FlowLayout();
		getContentPane().setLayout(flowLayout);
		add(label);
		add(button);*/
		setSize(250, 250);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocation(300,300);		
		setVisible(true);
		
	}
	
	public static void main(String args[])
	{
		new LabelFrame2();
	}
}