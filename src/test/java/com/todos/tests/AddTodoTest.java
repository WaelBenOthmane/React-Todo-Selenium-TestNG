package com.todos.tests;

import com.todos.pages.TodosPage;
import com.todos.utils.Setup;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class AddTodoTest extends Setup {
    TodosPage todopage;

    public AddTodoTest() throws IOException {
        super();

    }

    @Test(priority = 1)
    public void entersText() throws IOException {
        todopage = new TodosPage();
        Assert.assertTrue(todopage.isElementDisplayed(todopage.todosInput));
        todopage.fillTodosField(prop.getProperty("input.data"));
        Assert.assertEquals(todopage.checkElementContain(todopage.todosText), prop.getProperty("input.data"));
        Assert.assertFalse(todopage.isElementChecked(todopage.todosCheckbox));
        System.out.println("Element is not checked");
    }

}
