package com.zmujubank.zmujubank;

import java.util.HashMap;
import java.util.UUID;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;

public class mybankapi {
	
	public static HashMap<UUID, Integer> money = new HashMap<UUID, Integer>(); 
	
	
	public static int getmoney(Player p) {
		if(money.containsKey(p) | money.get(p) >= 0 ) {
			int a = money.get(p.getUniqueId());
			
			return a;
		} else {
			money.put(p.getUniqueId(), 3000);
			int a = 3000;
			
			return a;
		}
		
		
	}
	
	public static void setmoney(Player p, int a) {
		
		if(a <= 0) {
			return;
		}
		
		
		money.put(p.getUniqueId(), a);
		ConsoleCommandSender consol = Bukkit.getConsoleSender();

		consol.sendMessage(ChatColor.AQUA + "[!!!] MONEY VALUE OF " + p.getDisplayName() + " HAS BEEN CHANGED TO " + a);
	}
}
