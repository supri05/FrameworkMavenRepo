package pakage1;

import org.testng.annotations.Test;

public class ContactTest{
	@Test(groups = "regressionTest")
public void createContactTest()
{
		String browser=System.getProperty("browser");
		String url=System.getProperty("url");
		String username=System.getProperty("username");
		String password=System.getProperty("password");
		System.out.println(browser);
		System.out.println(url);
		System.out.println(username);
		System.out.println(password);
		System.out.println("execute create contact test");
	
}
	@Test(groups = "regressionTest")
	public void modifyContactTest()
	{
		System.out.println("execute modify");
	}
	@Test(groups = "regressionTest")
	public void deleteContactTest()
	{
		System.out.println("executr delete contact test");
	}
}
