package stepDefinitions;

import java.util.List;
import java.util.Map;

import core.Base;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjectRepository.RetailPageObject;
import utilities.Utilities;

public class RetailPageStep extends Base {


	RetailPageObject retailPage = new RetailPageObject();
	
	@Given("User click on MyAccount")
	public void user_click_on_my_account() {
	retailPage.clickOnMyAccount();
	logger.info("User click on my account");
	}
	
	@When("User click on Login")
	public void user_click_on_login() {
	retailPage.clickOnLogin();
	logger.info("user click on Login");
	}
	
	@And("User enter username {string} and password 'password’")
	public void user_enter_username_user_name_and_password_password(String string ) {
	retailPage.enterUsername();
	retailPage.enterPassword();
	logger.info("User enter user 'userName' and password 'password'");
	} 
	
	@And("User click on Login button")
	public void user_click_on_login_button() {
	retailPage.clickOnLoginButton();
	logger.info("User click on Login button");
	} 
	
	@Then("User should be logged in to MyAccount dashboard")
	public void user_should_be_logged_in_to_my_account_dashboard() {
	retailPage.shouldBeLoggedInToMyAccountDashboard();
	logger.info("User should be logged in to My Account dashboard");
	Utilities.screenShot();
	} 
	
	@When("User click on ‘Register for an Affiliate Account’ link")
	public void user_click_on_register_for_an_affiliate_account_link() {
	retailPage.clickOnRegisterForAffiliateAccountLink();
	logger.info("User click on 'Register for Affiliate Account ' link");
	} 
	
	@And("User fill affiliate form with below information")
	public void user_fill_affiliate_form_with_below_information(DataTable dataTable) {
	List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
	retailPage.enterCompany(data.get(0).get("company"));
	retailPage.enterWebsite(data.get(0).get("website"));
	retailPage.enterTaxID(data.get(0).get("taxID"));
	retailPage.enterPaymentMethod(data.get(0).get("paymentMethod"));
	logger.info("User fill affiliate form with below information");
	}
	
	@And("User check on About us check box")
	public void user_check_on_about_us_check_box() {
	retailPage.checkOnAboutUsCheckBox();
	logger.info("User check on about us check box");
	} 
	
	@And("User click on Continue button")
	public void user_click_on_continue_button() {
	retailPage.clickOnContinueButton();
	logger.info("User click on Continue button");
	}
	
	@Then("User should see a success message")
	public void user_should_see_a_success_message() {
	retailPage.shouldSeeSuccessMessage();
	logger.info("User should see a success message");
	Utilities.screenShot();
	} 
	
	@When("User click on ‘Edit your affiliate informationlink")
	public void user_click_on_edit_your_affiliate_informationlink() {
	retailPage.clickOnEditYourAffiliateInfoLink();
	logger.info("User click on 'Edit you affiliate information link'");
	}
	
	@And("user click on Bank Transfer radio button")
	public void user_click_on_bank_transfer_radio_button() {
	retailPage.clickOnBankTransferRadioButton();
	logger.info("User click on Bank Transfer radio button");
	} 
	
	@And("User fill Bank information with below information")
	public void user_fill_bank_information_with_below_information(DataTable dataTable) {
	List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
	retailPage.enterBankName(data.get(0).get("bankName"));
	retailPage.enterABANumber(data.get(0).get("abaNumber"));
	retailPage.enterswiftCode(data.get(0).get("swiftCode"));
	retailPage.enterAccountName(data.get(0).get("accountName"));
	retailPage.enterAccountNumber(data.get(0).get("accountNumber"));
	logger.info("User fill Bank information with below information");
	}
	
	@And("User click on ‘Edit your account information’ link")
	public void user_click_on_edit_your_account_information_link() {
	retailPage.clickOnEditYouAccountInfoLink();
	logger.info("User click on 'Edit your account information' link");
	}
	
	@And("User modify below information")
	public void user_modify_below_information(io.cucumber.datatable.DataTable dataTable) {
	List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
	retailPage.enterFirstName(data.get(0).get("firstname"));
	retailPage.enterLastName(data.get(0).get("lastName"));
	retailPage.enterEmail(data.get(0).get("email"));
	retailPage.enterTelephone(data.get(0).get("telephone"));
	logger.info("User modify below information");
	}
	
	@And("User click on continue button")
	public void user_click_on_continue_button1() {
	retailPage.clickOnContinueButton();
	logger.info("User click on continue button");
	}
	
	@Then("User should see a message ‘Success: Your account has been successfully updated.’")
	public void user_should_see_a_message_success_your_account_has_been_successfully_updated() {
	retailPage.shouldSeeMessageSuccessUpdated();
	logger.info("User should see a message 'Success: you account has been successfully update.'");
	Utilities.screenShot();
	}
	


}
