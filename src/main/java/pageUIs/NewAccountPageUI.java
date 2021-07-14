package pageUIs;

public class NewAccountPageUI {
    public static final String CUSTOMER_ID_TEXT_BOX = "//td[text()='Customer id']/following-sibling::td/input";
    public static final String ACCOUNT_TYPE_DROPDOWN = "//select[@name='selaccount']";
    public static final String INITIAL_DEPOSIT_TEXT_BOX = "//td[contains(.,'Initial deposit')]/following-sibling::td/input";
    public static final String SUBMIT_BUTTON = "//input[@value='submit']";

    public static final String ACCOUNT_GENERATED_SUCCESS_MESSAGE = "//p[text()='Account Generated Successfully!!!']";
    public static final String CURRENT_AMOUNT_TEXT_AT_TABLE_DETAILS = "//td[text()='Current Amount']/following-sibling::td";
    public static final String ACCOUNT_ID_TEXT_AT_TABLE_DETAILS = "//td[text()='Account ID']/following-sibling::td";
}
