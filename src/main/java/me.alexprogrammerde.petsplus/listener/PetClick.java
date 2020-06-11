package me.alexprogrammerde.petsplus.listener;

import me.alexprogrammerde.petsplus.gui.MainMenu;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.entity.Wolf;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEntityEvent;

public class PetClick implements Listener {

    @EventHandler
    public void onPetClick(PlayerInteractEntityEvent event) {
        Player player = event.getPlayer();
        Entity entity = event.getRightClicked();
        if(entity.getType() == EntityType.WOLF) {
            Wolf target = (Wolf) entity;
            if(player.getUniqueId() == target.getOwner().getUniqueId()) {
                event.setCancelled(true);
                player.openInventory(MainMenu.getMainMenu());
            } else {
                player.sendMessage("Sorry you are not the owner.");
            }
        }
    }
}
