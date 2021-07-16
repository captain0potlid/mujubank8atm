package com.zmujubank.zmujubank;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

public class atm implements Listener{
	@EventHandler
	public void atmclick(PlayerInteractEvent e) {
		
		if(e.getAction() == Action.RIGHT_CLICK_BLOCK) {
			Player p = e.getPlayer();
			Block a = e.getClickedBlock();
			if(a.getType().equals(Material.STONE_BUTTON) || a.getType().equals(Material.LEGACY_STONE_BUTTON)) {
				openatm.displayatm(p);
				
			}
			if(a.getType().equals(Material.CHEST) || a.getType().equals(Material.LEGACY_CHEST)) {
				if(a.getLocation().add(0, 2, 0).getBlock().getType().equals(Material.STONE_BUTTON) || a.getLocation().add(0, 2, 0).getBlock().getType().equals(Material.LEGACY_STONE_BUTTON)) {
					e.setCancelled(true);
					
					p.sendMessage(ChatColor.RED + "[ERROR] ATM TRAY(이)의 접근은 ATM.Force_muju 를 통해서만 가능합니다!");
				}
				
			}
		}
	}
}
