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
    public static SimulationProperties instance;


    // Основные параметры
    public final int GRID_WIDTH;
    public final int GRID_HEIGHT;
    public final int TICK_MS;
    public final int INITIAL_POPULATION;
    public final int THREAD_POOL_SIZE;

    // Параметры вируса
    public final String VIRUS_TYPE;
    public final double VIRUS_BASE_INFECTION_RATE;
    public final double VIRUS_BASE_LETHALITY;
    public final int VIRUS_INCUBATION_DAYS;
    public final double VIRUS_IMMUNITY_CHANCE;

    // Уязвимость
    public final double[] VULNERABLE_RATIO = new double[4];
    public final double[] MORTALITY_MULT = new double[4];
    public final double[] INFECTION_MULT = new double[4];
    public final double MEDIC_IMMUNITY;

    // Поведение
    public final double[] BEHAVIOR_RATIO = new double[4];
    public final double[] MOVE_PROB = new double[4];
    public final double[] CONTACT_MOD = new double[4];
    public final double CARRIER_INCUBATION_INFECTION;

    // Модификаторы
    public final double SICK_MOVE_MOD;
    public final double SICK_CONTACT_MOD;

    // Зоны плотности
    public final int DENSE_ZONES_COUNT;
    public final int DENSE_ZONE_RADIUS;
    public final double DENSE_ZONE_MODIFIER;
    public final double DENSE_BASE_MODIFIER;

    // Заражение
    public final double RECOVERY_CHANCE;

    // Визуализация
    public final int CELL_SIZE;
    public final int UPDATE_DELAY_MS;

    // Цвета
    public final Color COLOR_HEALTHY;
    public final Color COLOR_INCUBATING;
    public final Color COLOR_SICK;
    public final Color COLOR_DEAD;
    public final Color COLOR_RECOVERED;
    public final Color COLOR_MEDIC;
    public final Color COLOR_DENSE_OVERLAY;
    public final Color COLOR_GRID_LINES;
    public final Color COLOR_BACKGROUND;

    // Условия остановки
    public final boolean STOP_WHEN_ALL_HEALTHY;
    public final boolean STOP_WHEN_ALL_DEAD_OR_RECOVERED;
    public final int MIN_ALIVE_TO_CONTINUE;

    public static SimulationProperties getInstance() {
        if (instance == null) {
            instance = new SimulationProperties();
        }
        return instance;
    }

    private SimulationProperties() {
        loadProperties();
        validateAllKeys();
        GRID_WIDTH = getInt(ConfigKey.GRID_WIDTH);
        GRID_HEIGHT = getInt(ConfigKey.GRID_HEIGHT);
        TICK_MS = getInt(ConfigKey.SIMULATION_TICK_MS);
        INITIAL_POPULATION = getInt(ConfigKey.SIMULATION_INITIAL_POPULATION);
        THREAD_POOL_SIZE = getInt(ConfigKey.SIMULATION_THREAD_POOL_SIZE);

        VIRUS_TYPE = getString(ConfigKey.VIRUS_TYPE);
        VIRUS_BASE_INFECTION_RATE = getDouble(ConfigKey.VIRUS_BASE_INFECTION_RATE);
        VIRUS_BASE_LETHALITY = getDouble(ConfigKey.VIRUS_BASE_LETHALITY);
        VIRUS_INCUBATION_DAYS = getInt(ConfigKey.VIRUS_INCUBATION_DAYS);
        VIRUS_IMMUNITY_CHANCE = getDouble(ConfigKey.VIRUS_IMMUNITY_CHANCE);

        VULNERABLE_RATIO[0] = getDouble(ConfigKey.HUMAN_VULNERABLE_CHILD_RATIO);
        VULNERABLE_RATIO[1] = getDouble(ConfigKey.HUMAN_VULNERABLE_ADULT_RATIO);
        VULNERABLE_RATIO[2] = getDouble(ConfigKey.HUMAN_VULNERABLE_ELDER_RATIO);
        VULNERABLE_RATIO[3] = getDouble(ConfigKey.HUMAN_VULNERABLE_MEDIC_RATIO);

        MORTALITY_MULT[0] = getDouble(ConfigKey.HUMAN_VULNERABLE_CHILD_MORTALITY);
        MORTALITY_MULT[1] = getDouble(ConfigKey.HUMAN_VULNERABLE_ADULT_MORTALITY);
        MORTALITY_MULT[2] = getDouble(ConfigKey.HUMAN_VULNERABLE_ELDER_MORTALITY);
        MORTALITY_MULT[3] = getDouble(ConfigKey.HUMAN_VULNERABLE_MEDIC_MORTALITY);

        INFECTION_MULT[0] = getDouble(ConfigKey.HUMAN_VULNERABLE_CHILD_INFECTION);
        INFECTION_MULT[1] = getDouble(ConfigKey.HUMAN_VULNERABLE_ADULT_INFECTION);
        INFECTION_MULT[2] = getDouble(ConfigKey.HUMAN_VULNERABLE_ELDER_INFECTION);
        INFECTION_MULT[3] = getDouble(ConfigKey.HUMAN_VULNERABLE_MEDIC_INFECTION);

        MEDIC_IMMUNITY = getDouble(ConfigKey.HUMAN_VULNERABLE_MEDIC_IMMUNITY);

        BEHAVIOR_RATIO[0] = getDouble(ConfigKey.HUMAN_BEHAVIOR_ACTIVE_RATIO);
        BEHAVIOR_RATIO[1] = getDouble(ConfigKey.HUMAN_BEHAVIOR_NORMAL_RATIO);
        BEHAVIOR_RATIO[2] = getDouble(ConfigKey.HUMAN_BEHAVIOR_ISOLATOR_RATIO);
        BEHAVIOR_RATIO[3] = getDouble(ConfigKey.HUMAN_BEHAVIOR_CARRIER_RATIO);

        MOVE_PROB[0] = getDouble(ConfigKey.HUMAN_BEHAVIOR_ACTIVE_MOVE);
        MOVE_PROB[1] = getDouble(ConfigKey.HUMAN_BEHAVIOR_NORMAL_MOVE);
        MOVE_PROB[2] = getDouble(ConfigKey.HUMAN_BEHAVIOR_ISOLATOR_MOVE);
        MOVE_PROB[3] = getDouble(ConfigKey.HUMAN_BEHAVIOR_CARRIER_MOVE);

        CONTACT_MOD[0] = getDouble(ConfigKey.HUMAN_BEHAVIOR_ACTIVE_CONTACT);
        CONTACT_MOD[1] = getDouble(ConfigKey.HUMAN_BEHAVIOR_NORMAL_CONTACT);
        CONTACT_MOD[2] = getDouble(ConfigKey.HUMAN_BEHAVIOR_ISOLATOR_CONTACT);
        CONTACT_MOD[3] = getDouble(ConfigKey.HUMAN_BEHAVIOR_CARRIER_CONTACT);

        CARRIER_INCUBATION_INFECTION = getDouble(ConfigKey.HUMAN_BEHAVIOR_CARRIER_INCUBATION_INFECTION);

        SICK_MOVE_MOD = getDouble(ConfigKey.HUMAN_MODIFIERS_SICK_MOVE);
        SICK_CONTACT_MOD = getDouble(ConfigKey.HUMAN_MODIFIERS_SICK_CONTACT);

        DENSE_ZONES_COUNT = getInt(ConfigKey.DENSE_ZONES_COUNT);
        DENSE_ZONE_RADIUS = getInt(ConfigKey.DENSE_ZONES_RADIUS);
        DENSE_ZONE_MODIFIER = getDouble(ConfigKey.DENSE_ZONES_MODIFIER);
        DENSE_BASE_MODIFIER = getDouble(ConfigKey.DENSE_ZONES_BASE_MODIFIER);

        RECOVERY_CHANCE = getDouble(ConfigKey.INFECTION_RECOVERY_CHANCE);

        CELL_SIZE = getInt(ConfigKey.VISUAL_CELL_SIZE);
        UPDATE_DELAY_MS = getInt(ConfigKey.VISUAL_UPDATE_DELAY_MS);

        COLOR_HEALTHY = getColor(ConfigKey.COLOR_HEALTHY);
        COLOR_INCUBATING = getColor(ConfigKey.COLOR_INCUBATING);
        COLOR_SICK = getColor(ConfigKey.COLOR_SICK);
        COLOR_DEAD = getColor(ConfigKey.COLOR_DEAD);
        COLOR_RECOVERED = getColor(ConfigKey.COLOR_RECOVERED);
        COLOR_MEDIC = getColor(ConfigKey.COLOR_MEDIC);
        COLOR_DENSE_OVERLAY = getColorAlpha(ConfigKey.COLOR_DENSE_ZONE_OVERLAY);
        COLOR_GRID_LINES = getColor(ConfigKey.COLOR_GRID_LINES);
        COLOR_BACKGROUND = getColor(ConfigKey.COLOR_BACKGROUND);

        STOP_WHEN_ALL_HEALTHY = getBoolean(ConfigKey.STOP_WHEN_ALL_HEALTHY);
        STOP_WHEN_ALL_DEAD_OR_RECOVERED = getBoolean(ConfigKey.STOP_WHEN_ALL_DEAD_OR_RECOVERED);
        MIN_ALIVE_TO_CONTINUE = getInt(ConfigKey.MIN_ALIVE_TO_CONTINUE);
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
            }
            catch (NumberFormatException e ) {
                errors.add("Invalid value for key: " + key.name());
            } catch (IllegalArgumentException e) {
                errors.add(e.getMessage());
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
                    throw new IllegalArgumentException(key.getKey() + " value " + intVal + " < min " + key.getIntMin());
                }
                if (key.getIntMax() != null && intVal > key.getIntMax()) {
                    throw new IllegalArgumentException(key.getKey() + " value " + intVal + " > max " + key.getIntMax());
                }
                break;
            case DOUBLE:
                double dblVal = Double.parseDouble(value);
                if (key.getDoubleMin() != null && dblVal < key.getDoubleMin()) {
                    throw new IllegalArgumentException(key.getKey() + " value " + dblVal + " < min " + key.getDoubleMin());
                }
                if (key.getDoubleMax() != null && dblVal > key.getDoubleMax()) {
                    throw new IllegalArgumentException(key.getKey() + " value " + dblVal + " > max " + key.getDoubleMax());
                }
                break;
            case COLOR:
                String[] parts = value.split(",");
                if (parts.length != 3) {
                    throw new IllegalArgumentException(key.getKey() + " expected 3 RGB components, got " + value);
                }
                for (String p : parts) {
                    int v = Integer.parseInt(p.trim());
                    if (v < 0 || v > 255) {
                        throw new IllegalArgumentException(key.getKey() + " color component out of range: " + v);
                    }
                }
                break;
            case COLOR_ALPHA:
                String[] rgba = value.split(",");
                if (rgba.length != 4) {
                    throw new IllegalArgumentException(key.getKey() + " expected 4 RGBA components, got " + value);
                }
                for (String p : rgba) {
                    int v = Integer.parseInt(p.trim());
                    if (v < 0 || v > 255) {
                        throw new IllegalArgumentException(key.getKey() + " color component out of range: " + v);
                    }
                }
                break;
            case BOOLEAN:
                if (!value.equalsIgnoreCase("true") && !value.equalsIgnoreCase("false")) {
                    throw new IllegalArgumentException(key.getKey() + " must be true or false");
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
