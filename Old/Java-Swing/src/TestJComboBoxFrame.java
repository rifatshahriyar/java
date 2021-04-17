import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TestJComboBoxFrame extends JFrame implements ActionListener
{
	JComboBox comboBox;	
		
	public TestJComboBoxFrame() 
	{
		super("Simple Frame");	
		Container c=getContentPane();
		c.setLayout(new FlowLayout());		
		comboBox=new JComboBox();
		comboBox.addItem("A");
		comboBox.addItem("B");
		comboBox.addItem("C");
		comboBox.addItem("D");
		comboBox.addItem("E");	
		c.add(comboBox); 
		comboBox.addActionListener(this);		
		setSize(250,100);		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocation(300,300);		
		setVisible(true);
		
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		JOptionPane.showMessageDialog(null,"You Selected : (" + comboBox.getSelectedIndex() + ", " + comboBox.getSelectedItem().toString() + ")");
	}
	
	public static void main(String args[])
	{
		new TestJComboBoxFrame();
	}
}