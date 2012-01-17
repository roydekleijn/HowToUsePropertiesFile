package properties;

import org.testng.annotations.Test;

public class TestProperties {

	/**
	 * Simple test to retrieve the property value
	 */
	@Test
	public void propertiesTest() {
		System.out.println(Locators.getLocator("login.username.textfield"));
	}
}
