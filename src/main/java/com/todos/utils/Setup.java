package com.todos.utils;

import org.testng.annotations.*;

import java.io.IOException;

public class Setup extends BasePage {


    public Setup() throws IOException {
        super();
    }

    @Parameters({"browser"})

    @BeforeTest
    public void setupTest(String browser) {
        initialization(browser);
        driver.get(prop.getProperty("url"));
        driver.manage().window().maximize();
    }

    @AfterTest
    public void cleanTest() {
        driver.navigate().refresh();
        driver.quit();
    }
}
