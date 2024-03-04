package logincreds;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class TestLogin {
    @Test
    public void testSuccessfulLogin() {
        LoginService loginService = new LoginService();
        assertTrue(loginService.authenticateUser("user123", "password123"));
    }

    @Test
    public void testFailedLoginInvalidUsername() {
        LoginService loginService = new LoginService();
        assertFalse(loginService.authenticateUser("invalidUser", "password123"));
    }

    @Test
    public void testFailedLoginInvalidPassword() {
        LoginService loginService = new LoginService();
        assertFalse(loginService.authenticateUser("user123", "invalidPassword"));
    }

    @Test
    public void testFailedLoginAccountLocked() {
        LoginService loginService = new LoginService();
        // Simulate account lock
        for (int i = 0; i < LoginService.MAX_FAILED_ATTEMPTS; i++) {
            loginService.authenticateUser("lockedUser", "invalidPassword");
        }
        assertTrue(loginService.isAccountLocked());
        assertFalse(loginService.authenticateUser("lockedUser", "password123"));
    }


}