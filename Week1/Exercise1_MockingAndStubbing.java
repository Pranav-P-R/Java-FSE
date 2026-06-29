import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.mockito.Mockito;

// External API class
class ExternalApi {
    public String getData() {
        return "Real Data";
    }
}

// Service class
class MyService {
    private ExternalApi api;

    public MyService(ExternalApi api) {
        this.api = api;
    }

    public String fetchData() {
        return api.getData();
    }
}

public class Exercise1_MockingAndStubbing {

    @Test
    public void testExternalApi() {

        // Create mock object
        ExternalApi mockApi = Mockito.mock(ExternalApi.class);

        // Stub the method
        when(mockApi.getData()).thenReturn("Mock Data");

        // Inject mock object
        MyService service = new MyService(mockApi);

        // Test
        String result = service.fetchData();

        // Verify result
        assertEquals("Mock Data", result);
    }
}