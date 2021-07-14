package pageUIs;

public class WithdrawalPageUI {
    public static final String ACCOUNT_ID_TEXT_BOX = "//td[text()='Account No']/following-sibling::td/input";
    public static final String AMOUNT_TEXT_BOX = "//td[text()='Amount']/following-sibling::td/input";
    public static final String DESCRIPTION_TEXT_BOX = "//td[text()='Description']/following-sibling::td/input";
    public static final String SUBMIT_BUTTON = "//input[@value='Submit']";

    public static final String WITHDRAWAL_DETAILS_MESSAGE = "//p[text()='Transaction details of Withdrawal for Account %s']";
    public static final String CURRENT_BALANCE_TEXT_AT_TABLE_DETAILS = "//td[text()='Current Balance']/following-sibling::td";
}
