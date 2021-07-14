package testdata;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;

public class CustomerInfoData {
    public static CustomerInfoData getFiles(String fileName) {
        try {
            ObjectMapper mapper = new ObjectMapper();
            mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
            return mapper.readValue(new File(fileName), CustomerInfoData.class);
        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }

    @JsonProperty("customer_01")
    private Customer_01 customer_01;

    static class Customer_01 {
        @JsonProperty("customer_name")
        private String customerName;

        @JsonProperty("gender")
        private String gender;

        @JsonProperty("date_of_birth")
        private String dateOfBirth;

        @JsonProperty("address")
        private String address;

        @JsonProperty("city")
        private String city;

        @JsonProperty("state")
        private String state;

        @JsonProperty("pin")
        private String pin;

        @JsonProperty("mobile_number")
        private String mobileNumber;

        @JsonProperty("password")
        private String password;
    }

    public String getCustomerName_01() {
        return customer_01.customerName;
    }

    public String getGender_01() {
        return customer_01.gender;
    }

    public String getDateOfBirth_01() {
        return customer_01.dateOfBirth;
    }

    public String getAddress_01() {
        return customer_01.address;
    }

    public String getCity_01() {
        return customer_01.city;
    }

    public String getState_01() {
        return customer_01.state;
    }

    public String getPin_01() {
        return customer_01.pin;
    }

    public String getMobileNumber_01() {
        return customer_01.mobileNumber;
    }

    public String getPassword_01() {
        return customer_01.password;
    }
    
    
    /*****************************/


    @JsonProperty("customer_02")
    private Customer_02 customer_02;

    static class Customer_02 {
        @JsonProperty("customer_name")
        private String customerName;

        @JsonProperty("gender")
        private String gender;

        @JsonProperty("date_of_birth")
        private String dateOfBirth;

        @JsonProperty("address")
        private String address;

        @JsonProperty("city")
        private String city;

        @JsonProperty("state")
        private String state;

        @JsonProperty("pin")
        private String pin;

        @JsonProperty("mobile_number")
        private String mobileNumber;

        @JsonProperty("password")
        private String password;
    }

    public String getCustomerName_02() {
        return customer_02.customerName;
    }

    public String getGender_02() {
        return customer_02.gender;
    }

    public String getDateOfBirth_02() {
        return customer_02.dateOfBirth;
    }

    public String getAddress_02() {
        return customer_02.address;
    }

    public String getCity_02() {
        return customer_02.city;
    }

    public String getState_02() {
        return customer_02.state;
    }

    public String getPin_02() {
        return customer_02.pin;
    }

    public String getMobileNumber_02() {
        return customer_02.mobileNumber;
    }

    public String getPassword_02() {
        return customer_02.password;
    }

}
