package patterns;

public class Program5 {

	public static void main(String[] args)
	{
		int n=4;	
		int count=1;
		for(int rows=0;rows<n;rows++)
		{
			for(int col=0;col<n;col++)
			{
				if(rows>=col)
				System.out.print(count++ + " ");
				else
				System.out.print("  ");
			}
			 count=1;
			System.out.println();
		}
	}
}
