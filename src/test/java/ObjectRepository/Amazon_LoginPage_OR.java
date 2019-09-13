package ObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Driver.desiredCapabilities;

public class Amazon_LoginPage_OR extends desiredCapabilities{

	
	@FindBy(id = "gw-sign-in-button")
	public static WebElement SignIn;
	
	@FindBy(xpath = "//*/android.view.View[1]/android.view.View[8]/android.view.View[2]/android.widget.EditText")
	public static WebElement Password;
	
	@FindBy(xpath = "//android.widget.Button[@text='Login']")
	public static WebElement Login;
}
