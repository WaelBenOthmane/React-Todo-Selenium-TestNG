package com.todos.tests;

import com.todos.pages.TodosPage;
import com.todos.utils.Setup;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class RemoveTodoTest extends Setup {
    TodosPage todopage;

    public RemoveTodoTest() throws IOException {
        super();
    }

    @Test
    public void verifElementIsDeleted() throws IOException {
        todopage = new TodosPage();
        todopage.deleteElement(todopage.deleteButton);
        Assert.assertFalse(todopage.getPageSource().contains(prop.getProperty("input.data")));
        System.out.println("Todos element is deleted");

    }


}
