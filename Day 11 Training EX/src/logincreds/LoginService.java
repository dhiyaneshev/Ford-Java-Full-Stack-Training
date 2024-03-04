package logincreds;

public class LoginService {
    private int failedLoginAttempts = 0;
    private boolean isAccountLocked = false;
    static final int MAX_FAILED_ATTEMPTS = 3; // Threshold for locking the account

    public boolean authenticateUser(String username, String password) {
        if (isAccountLocked) {
            return false; // Account is already locked
        }

        if (username.equals("user123") && password.equals("password123")) {
            // Successful login
            failedLoginAttempts = 0; // Reset failed login attempts
            return true;
        } else {
            failedLoginAttempts++;
            if (failedLoginAttempts >= MAX_FAILED_ATTEMPTS) {
                isAccountLocked = true; // Lock the account
            }
            return false; // Failed login
        }
    }

    public boolean isAccountLocked() {
        return isAccountLocked;
    }
}
