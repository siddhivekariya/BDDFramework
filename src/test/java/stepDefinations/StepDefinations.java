package stepDefinations;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinations {
	
	WebDriver driver;
	
	@Given("^user is already on Login Page$")
	public void user_is_already_on_Login_Page(){
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\vekar\\Desktop\\Java\\SeleniumJars\\geckodriver.exe");
		driver = new FirefoxDriver(); 
		driver.get("https://www.amazon.ca/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.ca%2F%3Fref_%3Dnav_ya_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=caflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
	}

	
	  @When("^title of login page is amazon sign page$") 
	  public void title_of_login_page_is_amazon_sign_page(){ 
		  String actLoginTitle= driver.getTitle();
		  System.out.println(actLoginTitle); 
		  Assert.assertEquals("Amazon Sign In", actLoginTitle);
	  }
	 
	

	@Then("^user enters username and password$")
	public void user_enters_username_and_password(){
		driver.findElement(By.id("ap_email")).sendKeys("vekariyasiddhi22@gmail.com");
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.id("ap_password")).sendKeys("Veksid01!");
		
	}

	@Then("^user clicks on login button$")
	public void user_clicks_on_login_button(){
		driver.findElement(By.id("signInSubmit")).click();
	}

	@Then("^user is on Home Page$")
	public void user_is_on_Home_Page(){
		String actualHomeTitle= driver.getTitle();
		System.out.println(actualHomeTitle);
		Assert.assertEquals("Amazon.ca: Low Prices – Fast Shipping – Millions of Items", actualHomeTitle);
	}
	@When("^user select search bar and enters procductname$")
	public void user_select_search_bar_and_enters_procductname(){
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("watch");
	}

	@Then("^user clicks on search Icon$")
	public void user_clicks_on_search_Icon() {
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(Keys.ENTER);
	}
	@Then("^user is on product page$")
	public void user_is_on_product_page() {
	
		String watchActualTitle = driver.getTitle();
		System.out.println(watchActualTitle);
		Assert.assertEquals("Amazon.ca: Low Prices – Fast Shipping – Millions of Items", watchActualTitle);
	}
	@Then("^user select a product$")
	public void user_select_a_product() {
		driver.get("https://www.amazon.ca/Amazon-Essentials-Gold-Tone-AE-1000WTBN/dp/B07YQFY57B/ref=sr_1_1_sspa?crid=2DQ3AVPA88MLU&keywords=watch&qid=1661619458&sprefix=watch%2Caps%2C112&sr=8-1-spons&psc=1&spLa=ZW5jcnlwdGVkUXVhbGlmaWVyPUEyNE1HTVNIV09UR001JmVuY3J5cHRlZElkPUEwNDMwMjQ3M1M2Mk0zS0ZNT09TOCZlbmNyeXB0ZWRBZElkPUEwMzAxNDkzOUxTSU1aWFBHWFBPJndpZGdldE5hbWU9c3BfYXRmJmFjdGlvbj1jbGlja1JlZGlyZWN0JmRvTm90TG9nQ2xpY2s9dHJ1ZQ=");
	}

	@Then("^user click on add to cart button$")
	public void user_click_on_add_to_cart_button() {
		driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
	}
	
	@Then("^user is on added to cart page$")
	public void user_is_on_added_to_cart_page() {
		String actAddToCartTitle = driver.getTitle();
		System.out.println(actAddToCartTitle);
		Assert.assertEquals("Amazon.ca Shopping Cart", actAddToCartTitle);
	}

	@When("^user click on procced to check out button$")
	public void user_click_on_procced_to_check_out_button() {
		driver.findElement(By.name("proceedToRetailCheckout")).click();
	}

	@Then("^user is on checkout page$")
	public void user_is_on_checkout_page() {
		String expectedCheckoutTitle= driver.getTitle();
		System.out.println(expectedCheckoutTitle);
		Assert.assertEquals("Enter the shipping address for this order", expectedCheckoutTitle);
	}

	@Then("^user close the browser$")
	public void user_close_the_browser(){
		driver.quit();
	}
}
