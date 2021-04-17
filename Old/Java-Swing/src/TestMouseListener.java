import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TestMouseListener extends JFrame implements MouseListener
{
	JLabel label;	
		
	public TestMouseListener() 
	{
		super("Simple Frame");
		label=new JLabel();		
								
		Container c=getContentPane();
		c.setLayout(new FlowLayout());
		c.add(label);	
		addMouseListener(this);							
		setSize(250,100);		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocation(300,300);		
		setVisible(true);
		
	}
	
	public void mouseClicked(MouseEvent e) {
		label.setText("MouseClicked : (" + e.getX() + ", " + e.getY() + ")");
    }

    public void mousePressed(MouseEvent e) {
    	label.setText("MousePressed : (" + e.getX() + ", " + e.getY() + ")");
    }

    public void mouseReleased(MouseEvent e) {
    	label.setText("MouseReleased : (" + e.getX() + ", " + e.getY() + ")");
    }

    public void mouseEntered(MouseEvent e) {
    	label.setText("MouseEntered : (" + e.getX() + ", " + e.getY() + ")");
    }

    public void mouseExited(MouseEvent e) {
    	label.setText("MouseExited : (" + e.getX() + ", " + e.getY() + ")");
    }
    
	
	public static void main(String args[])
	{
		new TestMouseListener();
	}
}
