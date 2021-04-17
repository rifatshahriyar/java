import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TestJRadioButtonFrame extends JFrame implements ActionListener
{
	JRadioButton rb1,rb2,rb3;	
	
	public TestJRadioButtonFrame() 
	{
		super("Simple Frame");	
		Container c=getContentPane();
		c.setLayout(new FlowLayout());		
		rb1=new JRadioButton("C");
		rb2=new JRadioButton("C++");
		rb3=new JRadioButton("Java");
		ButtonGroup bg=new ButtonGroup();
		bg.add(rb1);
		bg.add(rb2);
		bg.add(rb3);
		c.add(rb1); 
		c.add(rb2);	
		c.add(rb3);	
		rb1.addActionListener(this);
		rb2.addActionListener(this);
		rb3.addActionListener(this);		
		setSize(250,100);		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocation(300,300);		
		setVisible(true);
		
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		JOptionPane.showMessageDialog(null,"You Selected : " + ae.getActionCommand());
	}
	
	public static void main(String args[])
	{
		new TestJRadioButtonFrame();
	}
}