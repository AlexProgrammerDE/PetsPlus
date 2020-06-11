package me.alexprogrammerde.petsplus.gui;

import me.alexprogrammerde.petsplus.config.LanguageManager;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class MainMenu {
    public static Inventory getMainMenu() {
       Inventory inv = Bukkit.createInventory(null, 5*9, "Pets+") ;

       ItemStack jump = new ItemStack(Material.CARROT_ON_A_STICK, 1);
       ItemMeta jumpMeta = jump.getItemMeta();
       jumpMeta.setDisplayName(LanguageManager.getText("items.jump"));

       jump.setItemMeta(jumpMeta);
       inv.setItem(11, jump);

       return inv;
    }

}
