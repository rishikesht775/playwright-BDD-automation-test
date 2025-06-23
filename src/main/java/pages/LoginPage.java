// LoginPage.java
package pages;

import com.microsoft.playwright.Page;

public class LoginPage {
    private Page page;
    private final String emailInput = "#email";
    private final String passwordInput = "#pass";
    private final String loginButton = "#send2";

    public LoginPage(Page page) {
        this.page = page;
    }

    public void navigateTo(String url) {
    	System.out.println("Is page null? " + (page == null));

        page.navigate(url);
        
    }

    public void login(String email, String password) {
        page.fill(emailInput, email);
        page.fill(passwordInput, password);
        page.click(loginButton);
    }

    public Page getPage() {
        return page;
    }
}