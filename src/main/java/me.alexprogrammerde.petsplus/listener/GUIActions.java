package me.alexprogrammerde.petsplus.listener;

import me.alexprogrammerde.petsplus.gui.MainMenu;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;

public class GUIActions implements Listener {

    @EventHandler
    public void onClick(InventoryClickEvent event) {
       if (event.getWhoClicked() instanceof Player) {
         Player player = (Player) event.getWhoClicked();
         Inventory inv = MainMenu.getMainMenu();
         if(event.getClickedInventory().equals(inv)) {
             player.sendMessage("You clicked in a Pets+ Invenotry!");
         }
       }
    }
}
