import static org.mockito.Mockito.verify;

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

public class Exercise2_VerifyingInteractions {

    @Test
    public void testVerifyInteraction() {

        // Create mock object
        ExternalApi mockApi = Mockito.mock(ExternalApi.class);

        // Create service
        MyService service = new MyService(mockApi);

        // Call method
        service.fetchData();

        // Verify interaction
        verify(mockApi).getData();
    }
}