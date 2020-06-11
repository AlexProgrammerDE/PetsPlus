package me.alexprogrammerde.petsplus.commands;

import me.alexprogrammerde.petsplus.config.ConfigHandler;
import me.alexprogrammerde.petsplus.utils.Permissions;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabCompleter;
import org.bukkit.util.StringUtil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MainCommand implements CommandExecutor, TabCompleter {
    private static final String[] PLAYER = { "menu" };
    private static final String[] ADMIN = { "reload" };

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String alias, String[] args) {
        if (args[0].equals("reload")) {
            sender.sendMessage("Reloading the configuration.");
            ConfigHandler.reloadConfig();
        }

        return false;
    }

    @Override
    public List<String> onTabComplete(CommandSender sender, Command command, String s, String[] args) {
        final List<String> completions = new ArrayList<>();
        if (args.length == 1) {
          if (Permissions.hasPermission("player", sender)) {
              StringUtil.copyPartialMatches(args[0], Arrays.asList(PLAYER), completions);
          }

          if (Permissions.hasPermission("admin", sender)) {
              StringUtil.copyPartialMatches(args[0], Arrays.asList(ADMIN), completions);
          }
        }

        Collections.sort(completions);

        return completions;
    }
}
