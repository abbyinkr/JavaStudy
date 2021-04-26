public class Practice089
{
	public static void main(String[] args)
	{
		
		int[][] arr = new int[5][5];


		for (int i=0; i<arr.length; i++)
		{
			for (int j=i, n=1; n<=5; n++)
			{
				arr[i][j] = n;

				j++;
				if (j==5)
					j=0;

			}
		}
		
		for (int i=0; i<arr.length; i++)
		{
			for (int j=0; j<arr[i].length; j++)
			{
				System.out.printf("%2d", arr[i][j]);
			}
			System.out.println();	
		}
		




	}//end main
}//end class Practice089
