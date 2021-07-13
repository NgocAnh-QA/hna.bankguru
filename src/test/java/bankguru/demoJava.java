package bankguru;

import commons.AbstractTest;

public class demoJava extends AbstractTest {
    int randomNumber = getRandomNumber();
    String postEmail = randomNumber + "@hotmail.com";

    public static void main(String[] args) {
        demoJava demo = new demoJava();
        System.out.println(demo.postEmail);
        System.out.println(demo.postEmail);
        System.out.println(demo.postEmail);
        System.out.println(demo.postEmail);
    }
}
