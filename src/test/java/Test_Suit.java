import org.testng.annotations.Test;

public class Test_Suit extends BaseTest
{
    HomePage homePage = new HomePage();
    Registration_Page registrationPage = new Registration_Page();
    Registration_Result registrationResult = new Registration_Result();
    LogIn logIn = new LogIn();
    Order_MacBookPro orderMacBookPro = new Order_MacBookPro();
    Checkout_Page checkoutPage = new Checkout_Page();
    ChangeCurrency_Sign changeCurrencySign = new ChangeCurrency_Sign();
    Alert_PopUps alertPopUps = new Alert_PopUps();
    LeaveYour_Comment leaveYourComment = new LeaveYour_Comment();
    Search_NikePage searchNikePage = new Search_NikePage();
    Billing_Address billingAddress = new Billing_Address();
    Shipping_Method shippingMethod = new Shipping_Method();
    Payment_Method paymentMethod = new Payment_Method();
    Payment_Information paymentInformation = new Payment_Information();
    Confirm_order confirmOrder = new Confirm_order();
    Order_Complete orderComplete = new Order_Complete();


    @Test(priority = 1)
    public void userIsAbleToRegisterSuccessfully()
    {
        homePage.waitUntilRegistrationLinkClickable();//waits until the Registration button is clickable.
        homePage.clickOnRegisterLink();//clicks on the Register Link.
        registrationPage.verifyPageURL();//verify Weather the landing page is registration page.
        registrationPage.userSubmitRegistrationFormSuccessfully();//fills the registration form with personal details and submits.
        registrationResult.waitsForSubmitButtonToDisappear();//Page waits until the submit button is disappeared.
        registrationResult.verifiesTheRegisteredMessageIsCorrect();//captures and verifies the registration complete message.
    }

    @Test (priority = 2)
    public void userIsAbleToLogINSuccessfully()
    {
        logIn.verifyIfUserisLoggedIn();//Verifies weather user is logged in already or not.
        logIn.userShouldLogInSuccessfully();//clicks on log in button and fills log in information of registered user.
    }


    @Test (priority = 3)
    public void userIsAbleToOrderMacBookPro(){



        logIn.verifyIfUserisLoggedIn();//Verifies weather user is logged in already or not.
        logIn.userShouldLogInSuccessfully();//clicks on log in button and fills log in information of registered user.

        homePage.waitUntilUserisInHomepage();//waits until the home page is loaded.
        homePage.clickOnMacBookLink();//clicks on the macbook pro link.

        orderMacBookPro.verifyMacBookUrlToBe();//waits until the link is loaded.
        orderMacBookPro.clickOnAddToCartButton();//clicks on the add to cart.
        orderMacBookPro.waitUntilItemIsAddedIntheCart();//waits until the item is loaded in the cart.
        orderMacBookPro.clickOnTheShoppingCart();//clicks on the cart button to navigate.

        checkoutPage.verifyPrice();//verifies the price for minimum quantity.
        checkoutPage.clickOnCheckoutButton();//clicks on checkout button.
        checkoutPage.closePopUp();//verifies the popups and closes.
        checkoutPage.tickTermsOfService();//ticks on the terms and conditions button.
        checkoutPage.clickOnCheckoutButton();//then clicks to continue to next page.

        billingAddress.waitUntilFirstNameIsVisible();//waits until the name of registered user is visible.
        billingAddress.fillShippingInformation();//fills shipping information.
        billingAddress.clickOnContinue();//clicks on continue.

        shippingMethod.waitUntilPageLoads();//waits until the page is loaded.
        shippingMethod.selectShippingMethod();//selects the shipping methods.
        shippingMethod.clickContinue();//continues to next page.

        paymentMethod.selectPaymentMethod();//selects and fills payment methods form.
        paymentMethod.clickOnContinueButton();//clicks on continue to next page.

        paymentInformation.fillPaymentMethod();//fills credit card information.

        confirmOrder.confirmOrder();//confirms and clicks next.
        orderComplete.orderCompleteMessage();//prints the order complete message.

    }

    @Test (priority = 4)
    public void userIsAbleToChangeCurrency(){

        logIn.verifyIfUserisLoggedIn();//Verifies weather user is logged in already or not.
        logIn.userShouldLogInSuccessfully();//clicks on log in button and fills log in information of registered user.

        changeCurrencySign.clickOnCurrencySelector();
        changeCurrencySign.selectsCurrencyToEuro();
        changeCurrencySign.checkThePriceCurrencySign();

        changeCurrencySign.clickOnCurrencySelector();
        changeCurrencySign.selectCurrencyToDollar();
        changeCurrencySign.checkThePriceCurrencySign();
    }

    @Test (priority = 5)
    public void userIsAbleToClickAndAcceptAlerts(){

        logIn.verifyIfUserisLoggedIn();//Verifies weather user is logged in already or not.
        logIn.userShouldLogInSuccessfully();//clicks on log in button and fills log in information of registered user.

        alertPopUps.clickSearchAndAcceptAlert();
        alertPopUps.clickVoteAndAcceptAlert();
    }

    @Test (priority = 6)
    public void userIsAbleToLeaveComment(){

        logIn.verifyIfUserisLoggedIn();//Verifies weather user is logged in already or not.
        logIn.userShouldLogInSuccessfully();//clicks on log in button and fills log in information of registered user.

        leaveYourComment.clickOnNewsReleaseDetails();
        leaveYourComment.waitsUntilPageIsVisible();
        leaveYourComment.typeCommentTitle();
        leaveYourComment.typeComment();
        leaveYourComment.clickOnNewCommentButton();
        leaveYourComment.verifyThecommentAddedMessage();
        leaveYourComment.verifyThecommentIsPosted();

    }

    @Test (priority = 7)
    public void userIsAbleToSerchAndCheckNikeBrandAndChangeBrand(){

        logIn.verifyIfUserisLoggedIn();//Verifies weather user is logged in already or not.
        logIn.userShouldLogInSuccessfully();//clicks on log in button and fills log in information of registered user.

        homePage.waitUntilUserisInHomepage();
        homePage.clickOnSearchBoxAndTypeText();
        homePage.clickOnSearchButtonInHomepage();

        searchNikePage.verifyUserInNikeBrandPage();
        searchNikePage.verifyAllItemsContainsNike();

    }


}
