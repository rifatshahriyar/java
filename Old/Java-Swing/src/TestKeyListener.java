import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TestKeyListener extends JFrame implements KeyListener
{
	JLabel label;	
		
	public TestKeyListener() 
	{
		super("Simple Frame");
		label=new JLabel();		
								
		Container c=getContentPane();
		c.setLayout(new FlowLayout());
		c.add(label);	
		addKeyListener(this);							
		setSize(250,100);		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocation(300,300);		
		setVisible(true);
		
	}
	
	public void keyTyped(KeyEvent e)
	{	
		label.setText("KeyTyped : (" + e.getKeyChar() + ", " + e.getKeyCode() + ")");
	}
        
    public void keyPressed(KeyEvent e) {
        label.setText("KeyPressed : (" + e.getKeyChar() + ", " + e.getKeyCode() + ")");
    }

    public void keyReleased(KeyEvent e) {
        label.setText("KeyReleased : (" + e.getKeyChar() + ", " + e.getKeyCode() + ")");
    }
    
	
	public static void main(String args[])
	{
		new TestKeyListener();
	}
}
