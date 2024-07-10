package org.StepDefinition;

import java.time.Duration;

import org.Base_class.Base_ClassDominos;
import org.Pom.Order_Food;
import org.Runner.Dominos_Runner;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Dominos_StepDefinition extends Base_ClassDominos {
	
	public static WebDriver driver = Dominos_Runner.driver;
	
	
	public static Order_Food a = new Order_Food(driver);
	
	@Given("the user launch Dominos url")
	public void the_user_launch_dominos_url() {
	   driver.get("https://www.dominos.co.in/");
	}
	@When("the user click order online now button")
	public void the_user_click_order_online_now_button() {
     click(a.getOrder_online());
	
	}
	@When("the user click delivery radio button")
	public void the_user_click_delivery_radio_button() throws InterruptedException {
	  click(a.getDelivery_Button());
	  Thread.sleep(5000);
	
	}
	
	
	@When("the user enter the Area\\/locality in the locate me field")
	public void the_user_enter_the_area_locality_in_the_locate_me_field() throws InterruptedException {
		 click(a.getNotification());
		click(a.getEnter_area());
	    send_keys(a.getEnter_area(),"600016");
	    Thread.sleep(5000);
	    click(a.getLocation_click());
	   
	   
	  
	    
	}
	@When("the user click VEG PIZZA in the top of the margin menu")
	public void the_user_click_veg_pizza_in_the_top_of_the_margin_menu() throws InterruptedException {
		Thread.sleep(5000);
	   click(a.getVEG_PIZZA());
	}
	@When("the user click Margherita pizza add to cart click two Qty")
	public void the_user_click_margherita_pizza_add_to_cart_click_two_qty() throws InterruptedException {
	   click(a.getMar_add_cart());
	   click(a.getNo_thanks());
	   Thread.sleep(5000);
	   
	//   multi_click(a.getMar_QTY(), 5);
	   click(a.getMar_QTY());   
	  
		
	}
	
	@When("the user click Peppy Paneer pizza add to cart click two Qty")
	public void the_user_click_peppy_paneer_pizza_add_to_cart_click_two_qty() throws InterruptedException {
		
//		 WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
//	        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(a.getPeppy_panner_cart()));
//	        element.click();
//	        wait.until(ExpectedCondition.alerts.present());
	//	click(a.getVEG_PIZZA());
		// click(a.getNo_thanks());
	Thread.sleep(5000);	
    click(a.getPeppy_panner_cart());
    click(a.getPeppy_panner_qty());
     
	}
	@When("the user click Primavera Gourmet-Pizza add to cart click two Qty")
	public void the_user_click_primavera_gourmet_pizza_add_to_cart_click_two_qty() throws InterruptedException {
	   click(a.getGourmet_cart());
	   Thread.sleep(5000);
		click(a.getGourmet_qty());

	}
	@When("the user click BEVERAGES in the top of the margin menu")
	public void the_user_click_beverages_in_the_top_of_the_margin_menu() {
	   click(a.getBEVERAGES());
		
	}
	@When("the user click Pepsi 475ml add to cart click twelve Qty")
	public void the_user_click_pepsi_475ml_add_to_cart_click_twelve_qty() throws InterruptedException {
		Thread.sleep(5000);
	  click(a.getPepsi_cart());
	  for(int i=0;i<11;i++) {	
	   click(a.getPepsi_add_qty());
	  }
}
	@When("the user remove  one qty Margherita from the cart")
	public void the_user_remove_one_qty_margherita_from_the_cart() {
	   click(a.getMar_reduce_qty());
	
	}
	@When("the user remove six qty 475ml from the cart")
	public void the_user_remove_six_qty_475ml_from_the_cart() {
		for(int i=0;i<6;i++) {	
	  click(a.getPepsi_reduce_qty());
		}
	}
	@When("the user verify the cart click the checkout button")
	public void the_user_verify_the_cart_click_the_checkout_button() {
	  click(a.getCheckout());
		
	}
	@When("the user view the place order page")
	public void the_user_view_the_place_order_page() {
	   
		
	}
	@Then("the user verify the address and price details click place order button")
	public void the_user_verify_the_address_and_price_details_click_place_order_button() throws InterruptedException {
		Thread.sleep(5000);
	   click(a.getPlace_order());
	}



}
