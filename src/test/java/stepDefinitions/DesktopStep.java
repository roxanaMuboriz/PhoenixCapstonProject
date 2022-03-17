package stepDefinitions;

import java.util.List;

import java.util.Map;

import org.junit.Assert;

import core.Base;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjectRepository.DesktopPageObject;
import utilities.Utilities;

public class DesktopStep extends Base {

	DesktopPageObject desktop = new DesktopPageObject();



/*	@Given("User is on Retail Website")
	public void user_is_on_retail_website() {
	}

	@When("User click on show all desktops")
	public void user_click_on_show_all_desktops() {
	}

	@Then("User should see all items are present in Desktops page")
	public void user_should_see_all_items_are_present_in_desktops_page() {
	}

	@When("User click  ADD TO CART option on ‘HP LP3065’ item")
	public void user_click_add_to_cart_option_on_hp_lp_item() {
	}

	@When("User select quantity {string}")
	public void user_select_quantity(String string) {
	}

	@Then("User should see a message ‘Success: you have added HP LP3065 to your Shopping cart!’")
	public void user_should_see_a_message_success_you_have_added_hp_lp3065_to_your_shopping_cart() {
	}

	@When("User select canon quantity {string}")
	public void user_select_canon_quantity(String string) {
	}

	@When("User click add to Cart button canon")
	public void user_click_add_to_cart_button_canon() {
	}

	@Then("User should see a message with {string}")
	public void user_should_see_a_message_with(String string) {
	}
*/
	@When("User click on Desktops tab")
	public void user_click_on_desktops_tab() {
	desktop.clickOnDesktop();
	logger.info("user click on desktops tab");
	}



	@And("User click on Show all desktops")
	public void user_clik_on_show_all_desktops() {
	desktop.clickOnShowAllDesktop();
	logger.info("user click on show all desktops");
	}



	@Then("User should see all items are present in Desktop page")
	public void user_should_see_all_items_are_present_in_desktop_page() {
	desktop.desktopPage();
	// Assert.assertTrue(desktop.isAllItemsShowing());
	// Assert.assertFalse(desktop.verifyUIElementsOnDesktopsPage());
	logger.info("user should see all items are present in desktop page");
	Utilities.screenShot();
	}

	@And("User click ADD TO CART option on 'HP LP3065' item")
	public void user_click_add_to_cart_option_on_hp_item() {
	desktop.clickOnAddToCartHP();
	logger.info("user click add to cart option on HPLP3065 item");
	}

	@And("User click ADD TO CART option on 'Canon EOS 5D' item")
	public void user_click_add_to_cart_option_on_canon_item() {
	desktop.clickOnAddToCartCanon();
	logger.info("user click add to cart option on canon eos 5d item");
	}


	@And("User click on write a review link")
	public void user_click_on_write_a_review_link() {
	desktop.clickOnReviewLink();
	logger.info("user click on write a review link");

	}

	@And("user fill the review information with below information")
	public void user_fill_the_review_information_with_below_information(DataTable dataTable) {
	List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
	desktop.enterYourName(data.get(0).get("yourName"));
	desktop.enterYourReview(data.get(0).get("yourReview"));
	desktop.enterRating(data.get(0).get("rating"));
	logger.info("user fill the review information with below information");



	}



	@Then("User should see a message")
	public void user_should_see_a_message() {
	desktop.shouldSeeAMessage();
	logger.info("user should see a message");
	}




	@And("User select quantity {int}")
	public void user_select_quantity(Integer int1) {
	desktop.selectQuantity();
	logger.info("user select quantity");
	}



	@And("User click ADD TO CART option on ‘HP LP3065’ item")
	public void user_click_add_to_cart_option_on_hp_lp3065_item() {
	desktop.clickOnAddToCartLaptop();
	logger.info("user click add to cart option on HP LP3065 item");
	}



	@Then("User should see a message ‘Success: you have added HP LP to your Shopping cart!’")
	public void user_should_see_a_message_success_you_have_added_hp_lp_to_your_shopping_cart() {
	desktop.shouldSeeAMessageLapTop();
	logger.info("user should see a message 'success you have added hp lp to your shopping cart!'");
	}



	@And("User click ADD TO CART option on ‘Canon EOS 5D’ item")
	public void user_click_add_to_cart_option_on_canon_eos_5d_item() {
	desktop.clickAddToCartCanonE();
	logger.info("user click add to cart option on canon eos 5d item");
	}



	@And("User select color from dropdown ‘Red’")
	public void user_select_color_from_dropdown_red() {
	desktop.selectColorDropDown();
	logger.info("user select color from dropdown Red");
	}



	@Then("User should see a message ‘Success: You have added Canon EOS 5D to your shopping cart!’")
	public void user_should_see_a_message_success_you_have_added_canon_eos_5d_to_your_shopping_cart() {
	desktop.shouldSeeAMessageCanonCart();
	logger.info("user should see a message success you have added canon eos 5d to your shopping cart");
	}



	@And("User click on Canon EOS 5D item")
	public void user_click_on_canon_eos_5d_item() {
	desktop.clickOnCanonItem();
	logger.info("user click on canon eos 5d item");

	}



	@And("User click on Continue Button")
	public void user_click_on_continue_button() {
	desktop.clickOnContinueButton();
	logger.info("user click on continue button");
	}



	@Then("User should see a message with ‘Thank you for your review. It has been submitted to the webmaster for approval.”")
	public void user_should_see_a_message_with_thank_you_for_your_review_it_has_been_submitted_to_the_webmaster_for_approval() {
	desktop.shouldSeeAReviewMessage();
	Assert.assertTrue(desktop.isReviewSuccessMessagePresent());
	logger.info("user should see a message with thank you for your review it has been submitted to the webmaster for approval");
	Utilities.screenShot();
	}

	
	
}
