package me.alexprogrammerde.petsplus.config;

import me.alexprogrammerde.petsplus.Main;
import org.bukkit.configuration.file.FileConfiguration;

public class ConfigHandler {
    public static FileManager config;
    public static FileManager language;

    public static void loadConfig() {
        config = new FileManager().createConfig(Main.getPlugin(Main.class), "config.yml");
        language = new FileManager().createConfig(Main.getPlugin(Main.class), "language.yml");
    }

    public static FileConfiguration getConfigFileConfiguration() {
        return config.getConfig();
    }

    public static FileConfiguration getLanguageFileConfiguration() {
        return language.getConfig();
    }

    public static FileManager getConfigFileManager() {
        return config;
    }

    public static FileManager getLanguageFileManager() {
        return language;
    }

    public static void reloadConfig() {
        config.reloadConfig();
        language.reloadConfig();
    }
}
