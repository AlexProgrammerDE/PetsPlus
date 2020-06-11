package me.alexprogrammerde.petsplus.config;

import me.alexprogrammerde.petsplus.Main;
import org.bukkit.configuration.InvalidConfigurationException;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;

import java.io.File;
import java.io.IOException;

public class FileManager {

    private File ConfigFile;
    private FileConfiguration Config;

    public FileConfiguration getConfig() {
        return this.Config;
    }

    public FileManager createConfig(Main main, String filename) {
        ConfigFile = new File(main.getDataFolder(), filename);
        if (!ConfigFile.exists()) {
            ConfigFile.getParentFile().mkdirs();
            main.saveResource(filename, false);
        }

        Config = new YamlConfiguration();
        try {
            Config.load(ConfigFile);
        } catch (IOException | InvalidConfigurationException e) {
            e.printStackTrace();
        }

        return this;
    }

    public void reloadConfig() {
        try {
            Config.load(ConfigFile);
        } catch (IOException | InvalidConfigurationException e) {
            e.printStackTrace();
        }
    }

}
