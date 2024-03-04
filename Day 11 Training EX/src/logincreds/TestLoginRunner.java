package logincreds;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;

public class TestLoginRunner {
    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(TestLogin.class);
        System.out.println("Tests were "+(result.wasSuccessful()?"successful":"unsuccessful"));

    }
}