import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Random;


public class Window extends JFrame implements ActionListener{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 766760530698248928L;
	
	private JButton button;
	private JLabel GenerateLabel;

	private static String randomOutput(String[] array ) 
	{
		int index = new Random().nextInt(array.length);
		String result = array[index];
		
		return result;
		
	}
	public Window(int width, int height, String title) 
	{
		setTitle(title);	
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        setSize(width, height);
        setLayout(null);
	    button = new JButton();
	    button.setSize(640, 20);
	    button.setLocation(50, 250);
	    button.setText("Generate");
	    button.setVisible(true);
	    button.addActionListener(this);
	    GenerateLabel = new JLabel();
		GenerateLabel.setLocation(335, 100);
		GenerateLabel.setSize(1500, 50);
	    this.add(button);
	    this.add(GenerateLabel);
	}
	
	public void addText(String text, int x, int y, int size_i, int size_x)
	{
		JLabel label = new JLabel(text);
		label.setLocation(x, y);
		label.setSize(size_i, size_x);
		this.add(label);
	}
	public String nameGenerator()
	{
		String[] name_part_1 = new String [] {"Ro", "Pa", "Sca", "Ly", "La", "Fa", "Hy", "Ry", "Ty", "Sy", "Ly", "He", "Re", "Te", "Me", "Ku", "Mu", "Hu", "Ru", "Ma", "A", "La", "Ha", "Ta", "Tr", "Pr", "Cr", "Ar"};
		String[] name_part_2 = new String [] {"gon", "ron", "son", "bun", "gun", "lun", "ay", "eng", "zu", "uko", "sem", "sen", "ion", "ireon", "izon" };
		
		String result_1 = randomOutput(name_part_1);
		String result_2 = randomOutput(name_part_2);
		
		String result = result_1 + result_2;
		
		return result;
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource() == button) 
		{
			GenerateLabel.setText("<html><h1>"+nameGenerator()+"</h1></html>");
		}
	}


	
}
