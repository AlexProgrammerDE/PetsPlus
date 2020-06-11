package me.alexprogrammerde.petsplus.config;

import org.bukkit.configuration.file.FileConfiguration;

public class LanguageManager {
    public static FileConfiguration language = ConfigHandler.getLanguageFileConfiguration();

    public static String getText(String section) {
        String text = language.getString(section);

        return text;
    }
}
