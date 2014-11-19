
public class Die {
	/*
	 * Die class for the "Craps" project.
	 * Simulate a dice, generate 1-6 and stores in a field.
	 */
	private int NumDots;
	public Die(){
	}
	
	public void roll(){
		NumDots = (int)(Math.random()*6+1);//generate a random number between 1-6
	}
	
	public int getNumDots()
	{
		return NumDots;
	}
}
