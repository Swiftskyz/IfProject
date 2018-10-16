package ifcontroller;

//Import Section
import model.ChickaChicka;
import javax.swing.JOptionPane;
import java.util.ArrayList;

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
		askUser();
		// loopy();
		// looper();
		loopin();
		
	}

	private void loopy()
	{
		// Define variable before loop
		boolean isDone = false;
		int count = 0;

		while (!isDone)// Test the variable
		{
			JOptionPane.showMessageDialog(null, "brother may I have some looops??");
			// Eventually change the loop variable
			count++;
			if (count >= 10)
			{
				isDone = true; // update variable
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
			if (count >= 10)
			{
				isDone = true;
			}
		}
	}
	
	private void loopin()
	{
		boolean isDone = false;
		int count = 0;
		
		while (!isDone)
		{
			JOptionPane.showMessageDialog(null, "Hippity Hoppity I am in Poverty. ;-; ");
			count++;
			if (count >= 10)
			{
				isDone = true;
			}
		}
	}
	
	private void lotsOfRun()
	{
		//local variable are only visible in the method they are defined in!
		//They only have SCOPE to that method
		
		ArrayList<ChickaChicka> myRuns = new ArrayList<ChickaChicka>();
		
		ArrayList<Integer> myNums = new ArrayList<Integer>();
		//Have to use a Wrapper class to hold a primitive in a list
		
		
		
		ChickaChicka sampleRun = new ChickaChicka();
		ChickaChicka otherRun = new ChickaChicka();
		
		myRuns.add(sampleRun);
		myRuns.add(sampleRun);
		myRuns.add(otherRun);
		
		//Standard forward loop
		//if used to remove you have to change index -= 1
		for (int index = 0; index < myRuns.size(); index += 1)
		{
			//Good for display, or minor changes
			JOptionPane.showMessageDialog(null, myRuns.get(index).getName());
			
			//Good for remove, replace, change multiple values
			ChickaChicka currentRun = myRuns.get(index);
			currentRun.setName("The new name is " + index + " run");
			currentRun.setDistance(index * (int) (Math.random() * 300));
		}
		
		//Standard backward loop
		//great for removing!!!
		for(int index = myRuns.size() - 1; index >= 0; index -= 1)
		{
			
		}
		
		for (ChickaChicka current : myRuns)
		{
			JOptionPane.showMessageDialog(null, "This chicka chicka is named: " + current.getName());
		} 
		
	}
	

	{
		for (int loop = 30; loop >= 0; loop -= 15)
		{
			JOptionPane.showMessageDialog(null, "The loop value is: " + loop + "th Run object I made");
		}

	}
	
	{
		for (int loop = 10; loop >= 9; loop -= 1)
		{
			JOptionPane.showMessageDialog(null, "Robbie has " + loop + " Brain Cells");
			JOptionPane.showMessageDialog(null, "uh oh");
		}
	}

	{
		for (int loop = 9; loop >= 8; loop -= 1)
		{
			JOptionPane.showMessageDialog(null, "Robbie has " + loop + " Brain Cells");
			JOptionPane.showMessageDialog(null, "oh god");
		}
	}
	private void askUser()
	{
		ChickaChicka userRun = new ChickaChicka();
		
		//ask
		String response = JOptionPane.showInputDialog(null, "What is the distance???");
		
		//repeat until finished correctly
		while (!validDouble(response))
		{
			response = JOptionPane.showInputDialog(null, "No! type in a valid number for the distance or don't press booyah!");
		}
		//assign and convert
		userRun.setDistance(Double.parseDouble(response));
		
		response = JOptionPane.showInputDialog(null, "What is the name of the run?");
		if (response .equalsIgnoreCase("CTEC"))
		{
			JOptionPane.showMessageDialog(null, "You either pressed cancel, the x, or typed nothing >:[ ");
		}
		response = JOptionPane.showInputDialog(null, "Hippity Hoppity I am a Froggity.");
		
		
	}

	public boolean validInt(String maybeInt)
	{
		boolean isValid = false;

		try
		{
			Integer.parseInt(maybeInt);
			isValid = true;
		}
		catch (NumberFormatException error)
		{
			JOptionPane.showMessageDialog(null, "You should type an integer value like -1234");
		}

		return isValid;
	}

	public boolean validDouble(String maybeDouble)
	{
		boolean isValid = false;

		try
		{
			Double.parseDouble(maybeDouble);
			isValid = true;
		}
		catch (NumberFormatException error)
		{
			JOptionPane.showMessageDialog(null, "You stupid or something?");
		}

		return isValid;
	}
}
