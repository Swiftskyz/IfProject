package model;

public class ChickaChicka
{
	//Declaration section
	//Data member section
	//Also called instance variables
	//These are special - they get a "default" value
	//All numbers => 0
	//boolean => false
	//Objects => null!!!
	
	private double distance;
	private String name;
	private int timeMinutes;
	private int timeHours;
	
	/**
	 * Default constructor for after the fact customization.
	 * AKA I don't know the info yet about the Run.
	 * Initializing data members with "bad" values to be changed.
	 */
	public ChickaChicka()
	{
		this.distance = -99.99;
		this.name = "unnamed run";
		this.timeMinutes = -99;
		this.timeHours = -99;
	}
	
	/**
	 * Better constructor when I know information for the Run object.
	 * @param distance The distance ran.
	 */
	
	public ChickaChicka(double distance)
	{
		this.distance = distance;
		
	}
	
	public double getDistance()
	{
		return distance;
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getTimeHours()
	{
		return timeHours;
	}
	
	public int getTimeMinutes()
	{
		return timeMinutes;
	}
	
	
	public void setDistance(double distance)
	{
		this.distance = distance;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public void setTimeMinutes(int timeMinutes)
	{
		this.timeMinutes = timeMinutes;
	}
	
	public void setTimeHours(int hours)
	{
		this.timeHours = hours;
	}
	
	public String toString()
	{
		String description = "This is a Run!";
		description += " The Run is named " + name;
		description += " and it took " + timeMinutes + " minutes to run";
		return description;
	}
	
	public void updateTime(int hours, int minutes)
	{
		
	}
	
	
}
