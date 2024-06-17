package package2;

import org.testng.annotations.Test;

public class OrgTest {
	@Test(groups = "smoke")
public void createOrgTest()
{
	String browser=System.getProperty("browser");
	String url=System.getProperty("url");
	String username=System.getProperty("username");
	String password=System.getProperty("password");
	System.out.println(browser);
	System.out.println(url);
	System.out.println(username);
	System.out.println(password);
	System.out.println("executr create contact test");
}
	@Test(groups = "smoke")	
	public void modifyOrgsTest()
	{
		System.out.println("executr create contact test");
	}
}
