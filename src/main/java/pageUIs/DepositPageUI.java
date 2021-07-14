package pageUIs;

public class DepositPageUI {
    public static final String ACCOUNT_ID_TEXT_BOX = "//td[text()='Account No']/following-sibling::td/input";
    public static final String AMOUNT_TEXT_BOX = "//td[text()='Amount']/following-sibling::td/input";
    public static final String DESCRIPTION_TEXT_BOX = "//td[text()='Description']/following-sibling::td/input";
    public static final String SUBMIT_BUTTON = "//input[@value='Submit']";

    public static final String TRANSFER_DETAILS_MESSAGE = "//p[text()='Transaction details of Deposit for Account %s']";
    public static final String CURRENT_BALANCE_TEXT_AT_TABLE_DETAILS = "//td[text()='Current Balance']/following-sibling::td";
}
