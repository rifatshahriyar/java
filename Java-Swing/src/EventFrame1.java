import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class EventFrame1 extends JFrame
{
	JLabel label;
	JButton button1;
	JButton button2;
	
	public EventFrame1() 
	{
		super("Simple Frame");
		Container c=getContentPane();
		c.setLayout(new FlowLayout());
		label=new JLabel("Label");
		button1=new JButton("Button-1");
		button2=new JButton("Button-2");	
		button1.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				label.setText("Button-1 is Pressed");
			}
		});
		// button1.addActionListener(e -> label.setText("Button-1 is Pressed")); lambda expression
		button2.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				label.setText("Button-2 is Pressed");
			}
		});
		// button2.addActionListener(e -> label.setText("Button-2 is Pressed")); lambda expression
		c.add(button1);					
		c.add(button2);
		c.add(label);
		setSize(200,200);		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocation(300,300);		
		setVisible(true);
		setResizable(false);
		
	}
	
	public static void main(String args[])
	{
		new EventFrame1();
	}
}
