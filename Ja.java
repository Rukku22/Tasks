package project1;

public class Ja {

	public static void main(String[] args) {
		for(int i=1;i<=9;i++)
		{
			int count=0;
			for(int j=9;j>=1;j--)
			{
				if(j>=i)
				{
					if(i%j==0)
					{
						count++;
					}
				}
			}
			
		}
 
	}

}
