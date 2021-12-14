package put.io.testing.mocks;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.util.Collections;
import java.util.List;

import org.junit.BeforeClass;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InOrder;

import put.io.students.fancylibrary.database.FancyDatabase;
import put.io.students.fancylibrary.database.IFancyDatabase;

public class ExpenseRepositoryTest {
    private ExpenseRepository repository;

    /*@BeforeEach
    void setUp() {
        IFancyDatabase fancyDatabase = new MyDatabase();
        repository = new ExpenseRepository(fancyDatabase);
    }*/

    @Test
    void loadExpenses() {
        IFancyDatabase mock = mock(IFancyDatabase.class);
        when(mock.queryAll()).thenReturn(Collections.emptyList());
        repository = new ExpenseRepository(mock);
        repository.loadExpenses();
        InOrder inOrder = inOrder(mock);
        inOrder.verify(mock).connect();
        inOrder.verify(mock).queryAll();
        inOrder.verify(mock).close();
        assertTrue(repository.getExpenses().isEmpty());
    }

    @Test
    void saveExpenses() {

        IFancyDatabase mock = mock(IFancyDatabase.class);
        when(mock.queryAll()).thenReturn(Collections.emptyList());
        repository = new ExpenseRepository(mock);
        repository.loadExpenses();
        repository.addExpense(new Expense());
        repository.saveExpenses();
        verify(mock, times(5)).persist(any(Expense.class));
        //assertTrue(repository.getExpenses().isEmpty());
    }
}
