package properties;
import java.io.InputStream;
import java.util.Properties;

/**
 * This class loads the properties files
 * @author Roy de Kleijn
 *
 */
public class Locators {
	private static final Properties locators;
	 
    static {
        locators = new Properties();
        InputStream is = Locators.class.getResourceAsStream("/locators.properties");
        try {
            locators.load(is);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
 
    /**
     * Retrieve the property value based on the property name
     * @param locatorName
     * @return property value
     */
    public static String getLocator(String locatorName) {
        return locators.getProperty(locatorName);
    }
}