
import dev.collin.spf.Link;
import dev.collin.spf.Route;
import dev.collin.spf.Router;
import dev.collin.spf.SPFAlgorithm;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

public class SPFAlgorithmTest {

    @Test
    public void testSingleRouter() {
        // Arrange
        Router router = mock(Router.class);
        when(router.getLinks()).thenReturn(Arrays.asList(new Link("192.168.1.1", "192.168.1.2", 10)));

        // Act
        SPFAlgorithm algorithm = new SPFAlgorithm();
        List<Route> actualRoutes = algorithm.calculateRoutes(router);

        // Assert
        assertEquals(Arrays.asList(new Route("192.168.1.2", 10)), actualRoutes);
    }

}
