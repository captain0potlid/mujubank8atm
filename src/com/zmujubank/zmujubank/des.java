package com.zmujubank.zmujubank;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;



public class des implements CommandExecutor{
public static int check;	
	
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {

		if (cmd.getName().equalsIgnoreCase("des")) {
			String it = inven2.local;
			String perc = args[0];
			check = 0;
			
			if(perc.contains("25")) {
				check = Integer.parseInt(it) / 4;
			}
			if(perc.contains("50")) {
				check = Integer.parseInt(it) / 2;
			}
			if(perc.contains("75")) {
				check = Integer.parseInt(it) * 3 / 4;
			}
			if(perc.contains("100")) {
				int wd = mybankapi.getmoney(Bukkit.getPlayer(sender.getName()));
				mybankapi.setmoney(Bukkit.getPlayer(sender.getName()), wd + Integer.parseInt(it));
				check = wd + Integer.parseInt(it);
				String urab = Integer.toString(check);
				urab = calculate.getobeack(urab);
				check = Integer.parseInt(urab);
				ATMTRAY.opentray(Bukkit.getPlayer(sender.getName()), check);
			}
			
			String urab = Integer.toString(check);
			urab = calculate.getobeack(urab);
			check = Integer.parseInt(urab);
			
			
			cc.korea.put(Bukkit.getPlayer(sender.getName()).getUniqueId(), check);
			cc.trot.put(Bukkit.getPlayer(sender.getName()).getUniqueId(), Integer.parseInt(urab));
			ATMTRAY.opentray(Bukkit.getPlayer(sender.getName()), des.check);
		} 
		return true;

	}
	
}
