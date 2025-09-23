package com.chm137.playwrith;

import com.microsoft.playwright.*;
import com.microsoft.playwright.options.WaitUntilState;

public class App {
    public static void main(String[] args) {
            Playwright playwright = Playwright.create();

            System.out.println("\n=== Тестирование в Chromium ===");
            Browser browser = playwright.chromium().launch();
            Page page = browser.newPage();

            page.navigate("https://playwright.dev", new Page.NavigateOptions().setWaitUntil(WaitUntilState.NETWORKIDLE));
            page.waitForTimeout(2000);

            String actualTitle = page.title();
            String expectedTitle = "Fast and reliable end-to-end testing for modern web apps | Playwright";
            // System.out.println(page.title());
            
            if (actualTitle.equals(expectedTitle)) {
            System.out.println("Тест на chromium пройден! Заголовок корректен: " + actualTitle);
            } else {
            System.out.println("Тест не пройден!");
            System.out.println("  Ожидалось: " + expectedTitle);
            System.out.println("  Фактически: " + actualTitle);
            }
            browser.close();

            System.out.println("\n=== Тестирование в Firefox ===");

            Browser browser2 = playwright.firefox().launch();
            Page page2 = browser2.newPage();

            page2.navigate("https://playwright.dev", new Page.NavigateOptions().setWaitUntil(WaitUntilState.NETWORKIDLE));
            page2.waitForTimeout(2000);

            String actualTitle2 = page2.title();
            String expectedTitle2 = "Fast and reliable end-to-end testing for modern web apps | Playwright";
            // System.out.println(page2.title());
            
            if (actualTitle2.equals(expectedTitle2)) {
            System.out.println("Тест на firefox пройден! Заголовок корректен: " + actualTitle2);
            } else {
            System.out.println("Тест не пройден!");
            System.out.println("  Ожидалось: " + expectedTitle2);
            System.out.println("  Фактически: " + actualTitle2);
            }
            browser2.close();
    }
}

