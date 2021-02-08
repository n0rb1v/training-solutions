package properties;

import java.io.*;
import java.util.Properties;

public class DatabaseConfiguration {
    private Properties config;

    public DatabaseConfiguration(File file) {
        try (FileInputStream fileInputStream = new FileInputStream(file)) {
            load(fileInputStream);
        } catch (FileNotFoundException e) {
            throw new IllegalArgumentException("Cannot read file", e);
        } catch (IOException e) {
            throw new IllegalArgumentException("Cannot read file", e);
        }
    }

    public DatabaseConfiguration() {
        try (InputStream resource = DatabaseConfiguration.class.getResourceAsStream("/db.properties")) {
            load(resource);
        } catch (IOException e) {
            throw new RuntimeException("Cannot read file from classpath, e");
        }
    }

    private Properties load(InputStream inputStream) {
        config = new Properties();
        try (InputStreamReader inputStreamReader = new InputStreamReader(inputStream, "UTF-8")) {
            config.load(inputStreamReader);
            return config;
        } catch (IOException e) {
            throw new RuntimeException("Cannot read properties file from inputstream", e);
        }
    }

    public String getHost() {
        return config.getProperty("db.host");
    }

    public int getPort() {
        return Integer.parseInt(config.getProperty("db.port"));
    }

    public String getSchema() {
        return config.getProperty("db.schema");
    }


}
