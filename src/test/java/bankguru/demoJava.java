package bankguru;

import commons.AbstractTest;

import java.util.ArrayList;
import java.util.Collections;

public class demoJava extends AbstractTest {

    public static void main(String[] args) {
       String demo = "1989-12-24";
       String[] charDemo = demo.split("-");
        System.out.println(charDemo[0]);
        System.out.println(charDemo[1]);
        System.out.println(charDemo[2]);
    }
}
