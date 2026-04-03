package config;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

public class SimulationProperties {
    private final Map<ConfigKey, Object> parsedConfigs = new HashMap<>();
    private final List<String> errors = new ArrayList<>();
    private final Properties props = new Properties();

    public SimulationProperties() {
        loadProperties();
        validateAllKeys();
    }

    private void validateAllKeys() {
        ConfigKey[] keys = ConfigKey.values();//получаем список обязательных ключей
        for (ConfigKey key : keys) {
            if (!props.containsKey(key.getKey())) {
                errors.add("Missing key: " + key.name());
                continue;
            }
            String value = props.getProperty(key.getKey());
            if (value == null || value.trim().isEmpty()) {
                errors.add("Missing value for key: " + key.name());
                continue;
            }
            try {
                validateValue(key, value);
            } catch (Exception e) {
                errors.add("Invalid value for key: " + key.name());
            }

        }
    }
    private void validateValue(ConfigKey key, String value) {
        switch (key.getType()) {
            case INT:
                int intVal = Integer.parseInt(value);
                if (key.getIntMin() != null && intVal < key.getIntMin()) {
                    throw new IllegalArgumentException("value " + intVal + " < min " + key.getIntMin());
                }
                if (key.getIntMax() != null && intVal > key.getIntMax()) {
                    throw new IllegalArgumentException("value " + intVal + " > max " + key.getIntMax());
                }
                break;
            case DOUBLE: break;
            case COLOR: break;
            case COLOR_ALPHA: break;
            case BOOLEAN:
                if (!value.equalsIgnoreCase("true") && !value.equalsIgnoreCase("false")) {
                    throw new IllegalArgumentException("Key " + key.getKey() + "must be true or false");
                }
                break;

        }

    }






    private void loadProperties() {
        try (InputStream input = getClass().getResourceAsStream("/config/application.properties")) {
            if (input == null) {
                throw new FileNotFoundException("appliction.proprties not found");
            }
            props.load(input);
        } catch (IOException e) {
            throw new RuntimeException("Failed to load config", e);
        }
    }


    public void configInfo() {
        System.out.println(errors);
    }
}
