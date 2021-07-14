package pageUIs;

public class EditAccountPageUI {
    public static final String ACCOUNT_ID_TEXT_BOX = "//td[text()='Account No']/following-sibling::td/input";
    public static final String SUBMIT_BUTTON = "//input[@value='Submit']";
    public static final String TYPE_OF_ACCOUNT_DROPDOWN = "//td[text()='Type of Account']/following-sibling::td/select";
    public static final String SUBMIT_BUTTON_AT_EDIT_FORM = "//input[@value='Submit']";

    public static final String UPDATE_ACCOUNT_SUCCESS_MESSAGE = "//p[text()='Account details updated Successfully!!!']";
    public static final String ACCOUNT_ID_TEXT_AT_TABLE_DETAILS = "//td[text()='Account ID']/following-sibling::td";
    public static final String TYPE_OF_ACCOUNT_TEXT_AT_TABLE_DETAILS = "//td[text()='Account Type']/following-sibling::td";
}
