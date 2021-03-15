public class Multid
{
  public static void main (String[]args)
  {
    int size = 6;
    int count = 1;
    int[][] twoD = new int[size][];
    for (int k=0;k<size ;k++ ) 
    {
        twoD[k] = new int[k+1];
    }
    for (int i = 0; i<size; i++)
      {
	for (int j = 0; j <= i; j++)
	  {
		twoD[i][j] = count;
		count++;
	  }
      }

    for (int i = 0; i < size; i++)
      {
	for (int j = 0; j <= i; j++)
	  {
	    System.out.print(twoD[i][j] + " ");
	  }
	  System.out.println("");
      }
    
  }
}
