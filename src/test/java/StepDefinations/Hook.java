package StepDefinations;

import org.openqa.selenium.chrome.ChromeDriver;

import Base.BaseUtil;
//import cucumber.api.java.After;
//import cucumber.api.java.Before;


public class Hook extends BaseUtil{
	
	private BaseUtil base;

    public Hook(BaseUtil base) {
        this.base = base;
    }
	    
    @io.cucumber.java.Before
    public void InitializeTest() {
    	System.setProperty("webdriver.chrome.driver", "Driver/chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
    }

    @io.cucumber.java.After
    public void TearDownTest() {
        driver.quit();
    }
}
