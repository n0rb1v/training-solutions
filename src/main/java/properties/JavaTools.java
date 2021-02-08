package properties;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashSet;
import java.util.Properties;
import java.util.Set;

public class JavaTools {
    private Properties tools = new Properties();
    private static final String POSTFIX = ".name";

    public JavaTools() {
        try (InputStream is = DatabaseConfiguration.class.getResourceAsStream("/javatools.properties")) {
            tools.load(is);
        } catch (IOException e) {
            throw new RuntimeException("Cannot read file from classpath", e);
        }
    }

    public Set<String> getToolKeys() {
        Set<String> result = new HashSet<>();
        Set<String> keys = tools.stringPropertyNames();
        for (String item : keys) {
            if (item.contains(POSTFIX)) {
                result.add(item.replaceAll(POSTFIX, ""));
            }
        }
        return result;
    }

    public Set<String> getTools() {
        Set<String> result = new HashSet<>();
        Set<String> keys = tools.stringPropertyNames();
        for (String item : getToolKeys()) {
            result.add(tools.getProperty(item + POSTFIX));
        }
        return result;
    }

    public String getName(String key) {
        return tools.getProperty(key + POSTFIX);
    }

    public String getUrl(String key) {
        return tools.getProperty(key + ".url");
    }

}
