package helloworld;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertNotNull;

public class HomeControllerTest {

    private HomeController homeController = new HomeController();

    @Test
    public void home() {
        assertEquals ("index", homeController.home());
        assertNotNull(homeController);
    }
}