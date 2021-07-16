package com.zmujubank.zmujubank;

import java.util.Arrays;
import java.util.Set;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.Server;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.permissions.Permission;
import org.bukkit.permissions.PermissionAttachment;
import org.bukkit.permissions.PermissionAttachmentInfo;
import org.bukkit.plugin.Plugin;

public class foradmins implements CommandExecutor{
	
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {

		if (cmd.getName().equalsIgnoreCase("w")) {
			if(!sender.isOp()) {
				sender.sendMessage(ChatColor.RED + "[!] ADMIN 이 아닙니다!" + ChatColor.GRAY + "(개발자는 /dvlp)");
				
			}
			if(sender.isOp()) {
				if(args.toString().isEmpty()) {
					sender.sendMessage(ChatColor.AQUA + "[R]" + ChatColor.RED + " INVALID ARGS");
				}
				if(args[0].equalsIgnoreCase("give")) {
					if(args[1].equalsIgnoreCase("1000")) {
						Bukkit.getPlayer(sender.getName()).getInventory().addItem(papers.chun());
						
						return true;
					}
					if(args[1].equalsIgnoreCase("5000")) {
						
						Bukkit.getPlayer(sender.getName()).getInventory().addItem(papers.ochun());
						
						return true;
					}
					if(args[1].equalsIgnoreCase("10000")) {
						Bukkit.getPlayer(sender.getName()).getInventory().addItem(papers.man());
						
						return true;
					}
					if(args[1].equalsIgnoreCase("50000")) {
						
						Bukkit.getPlayer(sender.getName()).getInventory().addItem(papers.oman());
						
						return true;
					} else {
						sender.sendMessage(ChatColor.AQUA + "[R]" + ChatColor.RED + " INVALID ARGS");
						
						return true;
					}
				}
			}
		} 
		return true;

	}
	
}
