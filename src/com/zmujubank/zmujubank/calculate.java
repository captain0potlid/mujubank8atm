package com.zmujubank.zmujubank;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class calculate {
	
	public static int getAmount(Player arg0, ItemStack arg1) {
        int amount = 0;
        for (int i = 0; i < 36; i++) {
            ItemStack slot = arg0.getInventory().getItem(i);
            if (slot == null || !slot.isSimilar(arg1))
                continue;
            amount += slot.getAmount();
        }
        return amount;
    }
	
	public static String getATMSum(Player p) {
		int one;
		int two;
		int three;
		int four;
		int total;
		
		int g = calculate.getAmount(p, papers.chun());
		int dr = g*1000;
		
		one = dr;
		
		p.sendMessage(Integer.toString(dr));
		
		g = calculate.getAmount(p, papers.ochun());
		dr = g*5000;
		
		two = dr;
		p.sendMessage(Integer.toString(dr));
		
		g = calculate.getAmount(p, papers.man());
		dr = g*10000;
		
		three = dr;
		p.sendMessage(Integer.toString(dr));
		
		g = calculate.getAmount(p, papers.oman());
		dr = g*50000;
		
		four = dr;
		p.sendMessage(Integer.toString(dr));
		
		total = one + two + three + four;
		String sl = Integer.toString(total);
		
		p.sendMessage(ChatColor.AQUA + "TOTAL SUM >>> " + ChatColor.RED + sl);
		
		cc.trot.put(p.getUniqueId(), Integer.parseInt(sl));
		
		return sl;
	}
	
	public static String getobeack(String a) {
		
		
		String b = a;
		int ta = Integer.parseInt(a);
		
		String result = b.substring(b.length()-3, b.length());
		if(result.contains("500")) {
			ta = ta - 500;
			
		}
		
		return Integer.toString(ta);
	}
}
