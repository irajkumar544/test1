package seleniumframeworkJava;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
//test
public class loop1 {	
	
	
	@Test
	public void whileloop()
	{
		int x=1;
		while (x<=4)
		{
			System.out.println("whileloop ************" +x);
			//x=x+4;
			x++;			
		}		
	}
	@AfterTest
	public void forloop()
	{
		for (int x=1;x<=4;x++)
			System.out.println("forloop**********" + x);
	}

	@Test
	public void ifandelse()
	{
		int x=2;
		int y=4;
		if(x>y)
		{
			System.out.println("x is greater then y");
			
		}
		else 
		{
			System.out.println("x is less then y");
		}
		
		
	}


}
