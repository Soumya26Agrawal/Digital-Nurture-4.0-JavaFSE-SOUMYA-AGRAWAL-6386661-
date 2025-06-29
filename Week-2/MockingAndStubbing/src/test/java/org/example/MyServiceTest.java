package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class MyServiceTest {
    @Test
    void testFetchData() {
        // Arrange: Mock and stub
        ExternalApi mockApi = mock(ExternalApi.class);
        when(mockApi.getData()).thenReturn("Mock Data");

        // Act
        MyService service = new MyService(mockApi);
        String result = service.fetchData();

        // Assert
        assertEquals("Mock Data", result);
    }

    @Test
    void testCategorizeUserWithStubbing() {
        // Arrange
        ExternalApi mockApi = mock(ExternalApi.class);
        when(mockApi.getUserAge("u1")).thenReturn(17);
        when(mockApi.getUserAge("u2")).thenReturn(35);
        when(mockApi.getUserAge("u3")).thenReturn(65);

        MyService service = new MyService(mockApi);

        // Act & Assert
        assertEquals("Minor", service.categorizeUser("u1"));
        assertEquals("Adult", service.categorizeUser("u2"));
        assertEquals("Senior", service.categorizeUser("u3"));
    }

    @Test
    void testVerifyMethodCall() {
        // Arrange
        ExternalApi mockApi = mock(ExternalApi.class);
        when(mockApi.getData()).thenReturn("Verified");

        MyService service = new MyService(mockApi);
        service.fetchData();

        // Assert method was called exactly once
        verify(mockApi, times(1)).getData();
    }
}
