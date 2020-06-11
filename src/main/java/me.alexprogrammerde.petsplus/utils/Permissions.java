package me.alexprogrammerde.petsplus.utils;

import org.bukkit.command.CommandSender;

public class Permissions {

    public static boolean hasPermission(String permission, CommandSender sender) {
        if (permission == "admin") {
            if (sender.hasPermission("petsplus.admin" )) {
                return true;
            }
        }

        if (permission == "player") {
            if (sender.hasPermission("petsplus.player" )) {
                return true;
            }
        }

        return false;
    }
}
