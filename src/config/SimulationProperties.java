package config;

import java.awt.*;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

public class SimulationProperties {
    private final Map<ConfigKey, Object> parsedValues = new HashMap<>();
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


    /**
     * Валидирует значение по типу и диапазонам ключа.
     */
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
            case DOUBLE:
                double dblVal = Double.parseDouble(value);
                if (key.getDoubleMin() != null && dblVal < key.getDoubleMin()) {
                    throw new IllegalArgumentException("value " + dblVal + " < min " + key.getDoubleMin());
                }
                if (key.getDoubleMax() != null && dblVal > key.getDoubleMax()) {
                    throw new IllegalArgumentException("value " + dblVal + " > max " + key.getDoubleMax());
                }
                break;
            case COLOR:
                String[] parts = value.split(",");
                if (parts.length != 3) {
                    throw new IllegalArgumentException("expected 3 RGB components, got " + value);
                }
                for (String p : parts) {
                    int v = Integer.parseInt(p.trim());
                    if (v < 0 || v > 255) {
                        throw new IllegalArgumentException("color component out of range: " + v);
                    }
                }
                break;
            case COLOR_ALPHA:
                String[] rgba = value.split(",");
                if (rgba.length != 4) {
                    throw new IllegalArgumentException("expected 4 RGBA components, got " + value);
                }
                for (String p : rgba) {
                    int v = Integer.parseInt(p.trim());
                    if (v < 0 || v > 255) {
                        throw new IllegalArgumentException("color component out of range: " + v);
                    }
                }
                break;
            case BOOLEAN:
                if (!value.equalsIgnoreCase("true") && !value.equalsIgnoreCase("false")) {
                    throw new IllegalArgumentException("must be true or false");
                }
                break;
            case STRING:
                break;
        }
    }

    private int getInt(ConfigKey key) {
        return (int) parsedValues.computeIfAbsent(key, k -> Integer.parseInt(props.getProperty(k.getKey())));
    }

    private double getDouble(ConfigKey key) {
        return (double) parsedValues.computeIfAbsent(key, k -> Double.parseDouble(props.getProperty(k.getKey())));
    }

    private String getString(ConfigKey key) {
        return (String) parsedValues.computeIfAbsent(key, k -> props.getProperty(k.getKey()));
    }

    private boolean getBoolean(ConfigKey key) {
        return (boolean) parsedValues.computeIfAbsent(key, k -> Boolean.parseBoolean(props.getProperty(k.getKey())));
    }

    private Color getColor(ConfigKey key) {
        return (Color) parsedValues.computeIfAbsent(key, k -> {
            String[] rgb = props.getProperty(k.getKey()).split(",");
            return new Color(
                    Integer.parseInt(rgb[0].trim()),
                    Integer.parseInt(rgb[1].trim()),
                    Integer.parseInt(rgb[2].trim())
            );
        });
    }

    private Color getColorAlpha(ConfigKey key) {
        return (Color) parsedValues.computeIfAbsent(key, k -> {
            String[] rgba = props.getProperty(k.getKey()).split(",");
            return new Color(
                    Integer.parseInt(rgba[0].trim()),
                    Integer.parseInt(rgba[1].trim()),
                    Integer.parseInt(rgba[2].trim()),
                    Integer.parseInt(rgba[3].trim())
            );
        });
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
