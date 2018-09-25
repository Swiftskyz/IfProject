package ifcontroller;

//Import Section
import model.ChickaChicka;
import javax.swing.JOptionPane;

public class IfBooyahController
{
	/**
	 * Builds the instance of the Controller.
	 */
	public IfBooyahController()
	{
		
	}
	
	/**
	 * This is where the program starts calling methods to run the program.  
	 */
	public void start()
	{
		loopy();
		looper();
	}
	
	private void loopy()
	{
		//Define variable before loop
		boolean isDone = false;
		int count = 0;
		
		while (!isDone)//Test the variable
		{
			JOptionPane.showMessageDialog(null,  "brother may I have some looops??");
			//Eventually change the loop variable
			count++;
			if (count >= 10)
			{	
				isDone = true;  //update variable
			}
		}
	}
	
	private void looper()
	{
		boolean isDone = false;
		int count = 0;
		
		while (!isDone)
		{
			JOptionPane.showMessageDialog(null, "Hola Bobby Kalfman, please stop being the big dumbus.");
			count++;
			if (count >=10)
			{
				isDone = true;
			}
		}
	}
	
}
