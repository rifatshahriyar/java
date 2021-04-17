import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TestJCheckBoxFrame extends JFrame implements ActionListener
{
	JCheckBox cb1,cb2,cb3;
	JButton jb;
	
	public TestJCheckBoxFrame() 
	{
		super("Simple Frame");	
		Container c=getContentPane();
		c.setLayout(new FlowLayout());		
		cb1=new JCheckBox("C");
		cb2=new JCheckBox("C++");
		cb3=new JCheckBox("Java");
		jb=new JButton("Submit");
		c.add(cb1); 
		c.add(cb2);	
		c.add(cb3);
		c.add(jb);
		jb.addActionListener(this);
		setSize(250,100);		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocation(300,300);		
		setVisible(true);
		
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==jb)
		{
			String s="cb1 : "+cb1.isSelected() + " cb2 :"+cb2.isSelected() + " cb3 : " + cb3.isSelected(); 	
			JOptionPane.showMessageDialog(null,s);
		}
	}
	
	public static void main(String args[])
	{
		new TestJCheckBoxFrame();
	}
}