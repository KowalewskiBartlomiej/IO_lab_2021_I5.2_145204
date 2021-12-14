package put.io.testing.mocks;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.net.ConnectException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;

public class ExpenseManagerTest {

    @Test
    public void test_calculateTotal() {
        ExpenseRepository mock = mock(ExpenseRepository.class);
        when(mock.getExpenses()).thenReturn([])
    }
}
