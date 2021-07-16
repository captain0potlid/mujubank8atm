package com.zmujubank.zmujubank;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.plugin.java.JavaPlugin;


public class main extends JavaPlugin implements Listener {

	@Override
	public void onEnable() {

		ConsoleCommandSender consol = Bukkit.getConsoleSender();

		consol.sendMessage(ChatColor.AQUA + "mujubank starts/");
		getServer().getPluginManager().registerEvents(this, this);
		this.getServer().getPluginManager().registerEvents(new atm(), this);
		this.getServer().getPluginManager().registerEvents(new inven2(), this);
		getCommand("w").setExecutor(new foradmins());
		getCommand("des").setExecutor(new des());
	}

	@EventHandler
	public void join(PlayerJoinEvent e) {

	}

	@EventHandler
	public void onQuit(PlayerQuitEvent e) {
	}
	

	
}

