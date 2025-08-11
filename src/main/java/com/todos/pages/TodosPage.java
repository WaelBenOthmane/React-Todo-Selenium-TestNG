package com.todos.pages;

import com.todos.utils.BasePage;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class TodosPage extends BasePage {

    /**
     * @FindBy
     **/
    @FindBy(how = How.ID, using = "todo-input")
    public static WebElement todosInput;

    @FindBy(how = How.CSS, using = "label[data-testid='todo-item-label']")
    public static WebElement todosText;

    @FindBy(how = How.XPATH, using = "//input[@class='toggle']")
    public static WebElement todosCheckbox;

    @FindBy(how = How.XPATH, using = "//div[@class='view']")
    public static WebElement todosElement;

    @FindBy(how = How.XPATH, using = "//button[@class='destroy']")
    public static WebElement deleteButton;


    public TodosPage() throws IOException {
        PageFactory.initElements(driver, this);
    }

    public void fillTodosField(String data) {
        todosInput.clear();
        todosInput.sendKeys(data);
        todosInput.sendKeys(Keys.ENTER);
    }

    public boolean isElementDisplayed(WebElement element) {
        return element.isDisplayed();
    }

    public String checkElementContain(WebElement element) {
        return element.getText();
    }

    public boolean isElementChecked(WebElement element) {
        return element.isSelected();
    }

    public void deleteElement(WebElement element) {
        Actions actions = new Actions(driver);
        actions.moveToElement(todosElement).perform();
        element.click();
    }

    public String getPageSource() {
        return driver.getPageSource();
    }

}
