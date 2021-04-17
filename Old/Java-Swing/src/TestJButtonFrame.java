import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TestJButtonFrame extends JFrame implements ActionListener
{
	
	public TestJButtonFrame() 
	{
		super("Simple Frame");
		ImageIcon ic=new ImageIcon("img.png");
		JButton jb1=new JButton("Button-1");
		JButton jb2=new JButton(ic);	
		jb1.setActionCommand("Button1");
		jb2.setActionCommand("Button2");
		Container c=getContentPane();
		c.setLayout(new FlowLayout());
		c.add(jb1); 
		c.add(jb2);	
		jb1.addActionListener(this);
		jb2.addActionListener(this);				
		setSize(250,250);		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocation(300,300);		
		setVisible(true);
		
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getActionCommand().equals("Button1"))
		{
			JOptionPane.showMessageDialog(null,"Button 1 Clicked");	
		}
		if(ae.getActionCommand().equals("Button2"))
		{
			JOptionPane.showMessageDialog(null,"Button 2 Clicked");	
		}
	}
	
	public static void main(String args[])
	{
		new TestJButtonFrame();
	}
}