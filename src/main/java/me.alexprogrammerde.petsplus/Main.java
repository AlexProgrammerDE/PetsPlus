package me.alexprogrammerde.petsplus;

import me.alexprogrammerde.petsplus.commands.MainCommand;
import me.alexprogrammerde.petsplus.listener.PetClick;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new PetClick(), this);

        this.getCommand("pets").setExecutor(new MainCommand());
        this.getCommand("pets").setTabCompleter(new MainCommand());
    }

    @Override
    public void onDisable() {

    }

    public Main getMain() {
        return this;
    }
}