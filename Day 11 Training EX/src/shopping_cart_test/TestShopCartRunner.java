package shopping_cart_test;

import logincreds.TestLogin;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;

public class TestShopCartRunner {
    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(TestLogin.class);
        System.out.println("Tests were "+(result.wasSuccessful()?"successful":"unsuccessful"));
    }
}