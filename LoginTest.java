import org.junit.Test;
import static org.junit.Assert.*;

public class LoginTest {

    @Test
    public void testUsernameCorrect() {
        Login login = new Login("kyl_1", "Password1!", "+27831234567");
        assertTrue(login.checkUserName());
    }

    @Test 
    public void testUsernameIncorrect() {
        Login login = new Login("kyle123", "Password1!", "+27831234567");
        assertFalse(login.checkUserName());
    }

    @Test
    public void testPasswordCorrect() {
        Login login = new Login("kyl_1", "Password1!", "+27831234567");
        assertTrue(login.checkPasswordComplexity());
    }

    @Test
    public void testPasswordIncorrect() {
        Login login = new Login("kyl_1", "pass", "+27831234567");
        assertFalse(login.checkPasswordComplexity());
    }

    @Test
    public void testPhoneCorrect() {
        Login login = new Login("kyl_1", "Password1!", "+27831234567");
        assertTrue(login.checkCellPhoneNumber());
    }

    @Test
    public void testPhoneIncorrect() {
        Login login = new Login("kyl_1", "Password1!", "0831234567");
        assertFalse(login.checkCellPhoneNumber());
    }

    @Test
    public void testLoginSuccess() {
        Login login = new Login("kyl_1", "Password1!", "+27831234567");
        assertTrue(login.loginUser("kyl_1", "Password1!"));
    }

    @Test
    public void testLoginFail() {
        Login login = new Login("kyl_1", "Password1!", "+27831234567");
        assertFalse(login.loginUser("wrong", "wrong"));
    }
}
