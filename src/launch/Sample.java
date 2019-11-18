package launch;

import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Sample extends BaseClass{
	
	static Locators l;

	@BeforeClass
	public static void launchBrowser() {
		launchBrowser("https://www.facebook.com/");
		Assert.assertTrue(driver.getCurrentUrl().contains("facebook"));
		Assert.assertTrue(driver.getTitle().contains("Facebook"));
	}

	@AfterClass
	public static void closeBrowser() {
		closeBrowser();
	}

	@Before
	public void startTime() {
		Date d = new Date();
		System.out.println(d);
	}

	@After
	public void endTime() {
		Date d = new Date();
		System.out.println(d);
	}

	@Test
	public void aTest() {
		l = new Locators();
		type(l.getTxtEmail(), "Sruthi");
		Assert.assertEquals("Sruthi", l.getTxtEmail().getAttribute("value"));
		type(l.getTxtPass(), "KV");
		Assert.assertEquals("KV", l.getTxtPass().getAttribute("value"));
	}

	@Test
	public void bTest() {
		click(l.getBtnLogIn());
	}

}
