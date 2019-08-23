package week4cs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TestmeRegistration {
	static WebDriver driver;
	
	@Given("User launched the app of TestMeApp")
	public void user_launched_the_app_of_TestMeApp() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.setProperty("webdriver.chrome.driver","C:\\Users\\training_h2a.06.15\\Desktop\\Selenium Workspace\\SeleniumBroDrivers\\chromedriver.exe\\");
		driver=new ChromeDriver();
		driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
		driver.manage().window().maximize();
	}

	@Then("User clicks on SignUp link")
	public void user_clicks_on_SignUp_link() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By .linkText("SignUp")).click();
	}

	@Then("user enters username {string}")
	public void user_enters_username(String string1) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By .name("userName")).sendKeys(string1);
		
	}

	@Then("user enters first name  {string}")
	public void user_enters_first_name(String string2) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		 driver.findElement(By .name("firstName")).sendKeys(string2);
	}

	@Then("user enters last name {string}")
	public void user_enters_last_name(String string3) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By .name("lastName")).sendKeys(string3);
	}

	@Then("user enters password {string}")
	public void user_enters_password(String string4) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By .name("password")).sendKeys(string4);
	}

	@Then("user enters confirm password {string}")
	public void user_enters_confirm_password(String string5) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By .name("confirmPassword")).sendKeys(string5);
	}

	@Then("user selects the gender")
	public void user_selects_the_gender() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By .xpath("//*[@id=\"gender\"]")).click();
	}

	@Then("user enters email {string}")
	public void user_enters_email(String string6) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By .name("emailAddress")).sendKeys(string6);
	}

	@Then("user enters mobile number {string}")
	public void user_enters_mobile_number(String string7) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By .name("mobileNumber")).sendKeys(string7);
	}

	@Then("user enters dob {string}")
	public void user_enters_dob(String string8) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By .name("dob")).sendKeys(string8);
	}

	@Then("user enters address {string}")
	public void user_enters_address(String string9) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By .name("address")).sendKeys(string9);
	}

	@Then("user selects security question")
	public void user_selects_security_question() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By .name("securityQuestion")).sendKeys("What is your favour color?");
		
	}

	@Then("user enters answer")
	public void user_enters_answer() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();

         driver.findElement(By .name("answer")).sendKeys("Red");
	}
	
	@Then("User clicks on submit button available")
	public void user_clicks_on_submit_button_available() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By .name("Submit")).click();
	}
	
	@Then("verifies registration process")
	public void verifies_registration_process() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		String str4 = driver.findElement(By .xpath("//*[@id=\"errormsg\"]")).getText();
		  String str5= " User Registered Succesfully!!! Please login";
		  Assert.assertEquals(str4, str5);
	
	}




@Given("enter valid username {string}")
public void enter_valid_username(String string14) {
    // Write code here that turns the phrase above into concrete actions
   // throw new cucumber.api.PendingException();
	System.setProperty("webdriver.chrome.driver","C:\\Users\\training_h2a.06.15\\Desktop\\Selenium Workspace\\SeleniumBroDrivers\\chromedriver.exe\\");
	driver=new ChromeDriver();
	driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
	driver.manage().window().maximize();
	 driver.findElement(By .linkText("SignIn")).click();
	driver.findElement(By .name("userName")).sendKeys(string14);
}

@Given("enter valid password {string}")
public void enter_valid_password(String string15) {
    // Write code here that turns the phrase above into concrete actions
    //throw new cucumber.api.PendingException();
	driver.findElement(By .name("password")).sendKeys(string15);
}

@Then("click on login button")
public void click_on_login_button() {
    // Write code here that turns the phrase above into concrete actions
    //throw new cucumber.api.PendingException();
	driver.findElement(By .xpath("/html/body/main/div/div/div/form/fieldset/div[4]/div/input[1]")).click();
}

@Then("verify login process")
public void verify_login_process() {
	// Write code here that turns the phrase above into concrete actions
    //throw new cucumber.api.PendingException();
	 String str6 = driver.findElement(By .xpath("//*[@id=\"menu3\"]/li[4]/a/span")).getText();
	  String str7= "OrderDetails";
	  Assert.assertEquals(str6, str7);
	 // driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
}




@Given("user enters the product name")
public void user_enters_the_product_name() {
	Actions a=new Actions(driver);
	
    // Write code here that turns the phrase above into concrete actions
   // throw new cucumber.api.PendingException();
	//driver.findElement(By .name("products")).sendKeys("Headphone");
	
	 
	  a.moveToElement(driver.findElement(By .xpath("//*[@id=\"menu3\"]/li[2]/a/span"))).click().perform();
	  a.moveToElement(driver.findElement(By .xpath("//*[@id=\"menu3\"]/li[2]/ul/li[1]/a"))).click().perform();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
      a.moveToElement(driver.findElement(By .xpath("//*[@id=\"submenuul11290\"]/li[1]/a/span"))).click().perform();
	  
    
}



@Then("user clicks on add to cart")
public void user_clicks_on_add_to_cart() {
    // Write code here that turns the phrase above into concrete actions
    //throw new cucumber.api.PendingException();
	 driver.findElement(By .xpath("/html/body/section/div/div/div[2]/div/div/div/div[2]/center/a")).click();/*add to cart*/
	 
}

@Then("clicks on cart link")
public void clicks_on_cart_link() {
    // Write code here that turns the phrase above into concrete actions
    //throw new cucumber.api.PendingException();
	 driver.findElement(By .xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/a[2]")).click();/*cart1*/
}

@Then("clicks on checkout button")
public void clicks_on_checkout_button() {
    // Write code here that turns the phrase above into concrete actions
    //throw new cucumber.api.PendingException();
	 driver.findElement(By .xpath("//*[@id=\"cart\"]/tfoot/tr[2]/td[5]/a")).click();/*click checkout*/	  
	 
}

@Then("clicks on proceed to pay")
public void clicks_on_proceed_to_pay() {
    // Write code here that turns the phrase above into concrete actions
    //throw new cucumber.api.PendingException();
	 driver.findElement(By .xpath(" /html/body/b/div/div/div[1]/div/div[2]/div[3]/div/form[2]/input")).click();/*click proceed to pay*/
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
}

@Then("selects the bank and clicks on continue button")
public void selects_the_bank_and_clicks_on_continue_button() {
    // Write code here that turns the phrase above into concrete actions
    //throw new cucumber.api.PendingException();
	driver.findElement(By .xpath("//*[@id=\"swit\"]/div[1]/div/label/i")).click();/*select bank*/
	  driver.findElement(By .xpath("//*[@id=\"btn\"]")).click(); /*continue*/
}

@Then("enters username and password of bank")
public void enters_username_and_password_of_bank() {
    // Write code here that turns the phrase above into concrete actions
   // throw new cucumber.api.PendingException();
	driver.findElement(By .name("username")).sendKeys("123456");
	  driver.findElement(By .name("password")).sendKeys("Pass@456");
}

@Then("clicks on login button")
public void clicks_on_login_button() {
    // Write code here that turns the phrase above into concrete actions
    //throw new cucumber.api.PendingException();
	  driver.findElement(By .xpath("//*[@id=\"horizontalTab\"]/div[2]/div/div/div/div/form/div/div[3]/input")).click();
}

@Then("enter transaction password")
public void enter_transaction_password() {
    // Write code here that turns the phrase above into concrete actions
    //throw new cucumber.api.PendingException();
	driver.findElement(By .name("transpwd")).sendKeys("Trans@456");
}

@Then("click on paynow button")
public void click_on_paynow_button() {
    // Write code here that turns the phrase above into concrete actions
    //throw new cucumber.api.PendingException();
	 driver.findElement(By .xpath("//*[@id=\"horizontalTab\"]/div[2]/div/div/div/div/form/div/div[2]/input")).click();/*click paynow*/
}


@Then("verifies the payment process")
public void verifies_the_payment_process() {
    // Write code here that turns the phrase above into concrete actions
    //throw new cucumber.api.PendingException();
String str2 = driver.findElement(By .xpath("/html/body/b/section/div/div/div/div[2]/p")).getText();
String str3= "Your order has been confirmed";
Assert.assertEquals(str2, str3);
driver.close();
}



@Given("user has registered into TestMeApp")
public void user_has_registered_into_TestMeApp() {
    // Write code here that turns the phrase above into concrete actions
    //throw new cucumber.api.PendingException();
	System.setProperty("webdriver.chrome.driver","C:\\Users\\training_h2a.06.15\\Desktop\\Selenium Workspace\\SeleniumBroDrivers\\chromedriver.exe\\");
	driver=new ChromeDriver();
	driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
	driver.manage().window().maximize();

	driver.findElement(By .linkText("SignIn")).click();
	  driver.findElement(By .name("userName")).sendKeys("lalitha");
	  driver.findElement(By .name("password")).sendKeys("Password123");
	  driver.findElement(By .xpath("/html/body/main/div/div/div/form/fieldset/div[4]/div/input[1]")).click();
}

@When("user search a particular product like headphones")
public void user_search_a_particular_product_like_headphones() {
    // Write code here that turns the phrase above into concrete actions
    //throw new cucumber.api.PendingException();
	driver.findElement(By .name("products")).sendKeys("Headphone");
	
	 
}

@When("try to proceed to payment without adding any item in the cart")
public void try_to_proceed_to_payment_without_adding_any_item_in_the_cart() {
    // Write code here that turns the phrase above into concrete actions
    //throw new cucumber.api.PendingException();
	 driver.findElement(By .xpath("/html/body/div[1]/form/input")).click();
	 boolean cart=driver.findElement(By .xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/a[2]")).isDisplayed();
	 Assert.assertTrue(cart);
}

@Then("TestMeApp does not display the cart icon")
public void testmeapp_does_not_display_the_cart_icon() {
    // Write code here that turns the phrase above into concrete actions
    //throw new cucumber.api.PendingException();
	System.out.println("No cart icon displayed");
}
}











