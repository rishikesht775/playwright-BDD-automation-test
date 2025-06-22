package enums;

public enum EnvConfig {
    BASE_URL("https://magento.softwaretestingboard.com/"),
    LOGIN_URL("https://magento.softwaretestingboard.com/customer/account/login/"),
    VALID_USERNAME("testuser@example.com"),
    VALID_PASSWORD("test123");

    private final String value;
    EnvConfig(String value) { this.value = value; }
    public String getValue() { return value; }
}