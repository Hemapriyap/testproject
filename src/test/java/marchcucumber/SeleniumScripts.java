package marchcucumber;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SeleniumScripts extends Reuseable_methods{
	@Test
	@Given("User login page is launched") 
	public void user_login_page_is_launched() throws Exception {
		
	    Reuseable_methods.InitializeDriver();
	    Reuseable_methods.Launch("https://login.salesforce.com/");
	    
	}
	@When("^Username enters username field$")
	public void username_enters_username_field() throws Throwable {
		WebElement uname = findElement(By.xpath("//input[@name='username']"), "Username");
		enterText(uname,"mithun.r@tekarch.com","Username");
	}

	@When("Password field is empty")
	public void password_field_is_empty() throws Throwable {
		WebElement password = findElement(By.xpath("//input[@name='pw']"), "Password");
	  enterText(password,"Anoop@1234","Password");
	  password.clear();
	}

	@When("login button is clicked")
	public void login_button_is_clicked() {
		WebElement login = findElement(By.xpath("//input[@value='Log In']"), "Login");
		clickObj(login, "Login");
	    
	}

	@Then("Error msg Displayed on login page")
	public void error_msg_Displayed_on_login_page() {
		WebElement err_msg = driver.findElement(By.id("error"));

		String S1 = err_msg.getText();
		String S2 = "Please enter your password.";
		compareStrings(S1, S2);
	    
	}
	@And("^close the browser$")
	public void close_the_browser() {
		driver.quit();
	}

	@When("^Valid Username enters username field$")
	public void Valid_Username_enters_username_field() throws Throwable {
		WebElement uname = findElement(By.xpath("//input[@name='username']"), "Username");
		enterText(uname,"mithun.r@tekarch.com","Username");
	}

	@When("^Valid Password enters Password field$")
	public void Valid_Password_enters_Password_field() throws Throwable {
		WebElement password = findElement(By.xpath("//input[@name='pw']"), "Password");
		enterText(password,"Anoop@1234","Password");

	}

	@When("^User clicks on Login button$")
	public void user_clicks_on_Login_button() throws Throwable {
		WebElement login = findElement(By.xpath("//input[@value='Log In']"),"Login");
		clickObj(login,"Login");
		Thread.sleep(5000);

	}
	@Given("^User Login page is displayed$")
	public void user_Login_page_is_displayed() throws Throwable {
		Reuseable_methods.InitializeDriver();
		Reuseable_methods.Launch("https://login.salesforce.com/");
	}

	@When("^Remember me CheckBox is Checked$")
	public void remember_me_CheckBox_is_Checked() throws Throwable {
		WebElement remUN = findElement(By.xpath("//input[@name='rememberUn']"), "Remember Username");
		selectCheckBox(remUN, "Remember UN");
	}

	@When("^User clicks on user menu dropdown$")
	public void user_clicks_on_user_menu_dropdown() throws Throwable {
		Thread.sleep(3000);
		WebDriverWait wait=new WebDriverWait(driver,20);
		WebElement usermenu=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='userNavButton']")));
		usermenu.click();

		
	}

	@When("^logout menu is clicked$")
	public void logout_menu_is_clicked() throws Throwable {
		WebElement UserMenu = driver.findElement(By.xpath("//*[@id='userNavButton']"));
//		UserMenu.click();
		selectDropdown(UserMenu, "UserMenu");
		Thread.sleep(3000);
		WebElement logout = findElement(By.xpath("//a[@title='Logout']"), "Logout");
		clickObj(logout, "Logout");

	}

		@When("^User clicks forgot password link$")
	public void user_clicks_forgot_password_link() throws Throwable {
		WebElement forgotpasswd = findElement(By.id("forgot_password_link"),"Forgot Password");
		clickObj(forgotpasswd,"Forgot Password");
		
	}

	@Then("^SalesForce forgot password page should be displayed$")
	public void salesforce_forgot_password_page_should_be_displayed() throws Throwable {
		String curr_url = driver.getCurrentUrl();
		String expurl = "https://login.salesforce.com/secur/forgotpassword.jsp?locale=us";
		compareStrings(curr_url,expurl);
	}

	@When("^Valid username enters username field in forgot password page$")
	public void valid_username_enters_username_field_in_forgot_password_page() throws Throwable {
		WebElement Uname = findElement(By.xpath("//input[@name='un']"),"Username");
		enterText(Uname,"Username","mithun.g@tekarch.com");

	}

	@When("^Continue button is clicked$")
	public void continue_button_is_clicked() throws Throwable {
		WebElement Continue_bt = findElement(By.xpath("//input[@id='continue']"),"Continue Button");
		clickObj(Continue_bt,"Continue Button");
		
	}

	@Then("^Password reset message page is displayed$")
	public void password_reset_message_page_is_displayed() throws Throwable {
		String curr_url = driver.getCurrentUrl();
		String expurl = "https://login.salesforce.com/secur/forgotpassword.jsp";
		compareStrings(curr_url,expurl);

	}
	
	@When("^Wrong username enters username field$")
	public void wrong_username_enters_username_field() throws Throwable {
		WebElement uname = findElement(By.xpath("//input[@name='username']"), "Username");
		enterText(uname,"mithun.g@tekarch.com","Username");
	}

	@When("^Wrong password enters password field$")
	public void wrong_password_enters_password_field() throws Throwable {
		WebElement password = findElement(By.xpath("//input[@name='pw']"), "Password");
		enterText(password,"Bains2","Password");
	}
	
	@Then("^Error message Displayed on login page$")
	public void error_message_Displayed_on_login_page() throws Throwable {
		WebElement err_msg = driver.findElement(By.id("error"));

		String S1 = err_msg.getText();
		String S2 = "Please check your username and password. If you still can't log in, contact your Salesforce administrator.";

		compareStrings(S1, S2);
	}
	
	@Then("^User dropdown menu should be displayed$")
	public void User_dropdown_menu_should_be_displayed() {
		WebElement my_prfl = findElement(By.xpath("//a[@title='My Profile']"),"My Profile");
		compareStrings(my_prfl.getText(),"My Profile");
		
		WebElement my_stngs = findElement(By.xpath("//a[@title='My Settings']"),"My Settings");
		compareStrings(my_stngs.getText(),"My Settings");
		
		
		WebElement dev_con = findElement(By.xpath("//a[@title='Developer Console (New Window)']"),"Developer Console");
		compareStrings(dev_con.getText(),"Developer Console");
		
//		WebElement stle = findElement(By.xpath("//a[@title='Switch to Lightning Experience']"),"Switch to Lightning Experience");
//		compareStrings(stle.getText(),"Switch to Lightning Experience");
		
		WebElement logout = findElement(By.xpath("//a[@title='Logout']"),"Logout");
		compareStrings(logout.getText(),"Logout");
		
	}
}
