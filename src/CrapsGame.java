// Implements the game of Craps logic

public class CrapsGame
{
  private int point = 0;
  
  public CrapsGame()
  {
  }

  /**
   *  Calculates the result of the next dice roll in the Craps game.
   *  The parameter total is the sum of dots on two dice.
   *  point is set to the saved total, if the game continues,
   *  or 0, if the game has ended.
   *  Returns 1 if player won, -1 if player lost,
   *  0 if player continues rolling.
   */
  public int processRoll(int total)
  {
	  int result =0;
	  if (point == 0)//if is first roll
	  {
		  if (total == 7 || total == 11)//if first roll is 7 or 11 you win
		  {
			  	result = 1;
		  }else if (total == 2 || total == 3 || total == 12)
		  {
			  result = -1;
		  }else
		  {
			  point = total;
			  result = 0;
		  }
	  }
	  else if (point > 0)//if isn't first roll
	  {
		if (total == point)//if the total is the same as the first roll you win
		{
			point = 0;
			result = 1;
		}
		else if (total == 7)//if the total is 7, you lose
		{
			point = 0;
			result = -1;
		} 
		else 
		{
			result = 0;
		}
	  }
	  return result;
  }

  /**
   *  Returns the saved point
   */
  public int getPoint()
  {
    return point;
  }
}

