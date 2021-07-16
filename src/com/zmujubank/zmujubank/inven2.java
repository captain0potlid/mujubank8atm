package com.zmujubank.zmujubank;

import java.lang.reflect.Field;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.ClickType;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;

import net.md_5.bungee.api.chat.ClickEvent;
import net.md_5.bungee.api.chat.ComponentBuilder;
import net.md_5.bungee.api.chat.HoverEvent;
import net.md_5.bungee.api.chat.TextComponent;


public class inven2 implements Listener{
	
	public int one;
	public int two;
	public int three;
	public int four;
	public int total;
	public static String local;
	
	@EventHandler
    public void onMenuClick(InventoryClickEvent e){
		
		try {
			Player p = (Player) e.getWhoClicked();
			ItemStack it = e.getCurrentItem();
			String itname = it.getItemMeta().getDisplayName();
		
		
			
			if(e.getWhoClicked().getOpenInventory().getTitle().equalsIgnoreCase(ChatColor.BLACK + "ATM TRAY")) {
				e.setCancelled(true);
				
				if(e.getCurrentItem().getItemMeta().getDisplayName().contains("1000") || e.getCurrentItem().getItemMeta().getDisplayName().contains("5000") || e.getCurrentItem().getItemMeta().getDisplayName().contains("10000") || e.getCurrentItem().getItemMeta().getDisplayName().contains("50000")) {
					if(e.getCurrentItem().getAmount() > 1) {
						e.getCurrentItem().setAmount(e.getCurrentItem().getAmount()-1);
						ItemStack wan = e.getCurrentItem();
						int babo=0;
						if(wan.getItemMeta().getDisplayName().contains("1000")) {
							babo = 1000;
						}
						if(wan.getItemMeta().getDisplayName().contains("5000")) {
							babo = 5000;
						}
						if(wan.getItemMeta().getDisplayName().contains("10000")) {
							babo = 10000;
						}
						if(wan.getItemMeta().getDisplayName().contains("50000")) {
							babo = 50000;
						}
						
						p.closeInventory();
						//CONFIG!!!!
						int laugh = cc.korea.get(p.getUniqueId());
						int zzz = laugh - babo;
						//CONFIG!!!
						
						ATMTRAY.opentray(p, zzz);
					}
				}
				
				
			}
			if(e.getWhoClicked().getOpenInventory().getTitle().equalsIgnoreCase(ChatColor.BLACK +"무주시 ATM <MUJU CITY ATM>")) {
				e.setCancelled(true);
		
				
		
				if(it.equals(Material.AIR)) return; 
				if(!e.getCurrentItem().hasItemMeta()) return;
			
			
				
			
		
				if(itname.contains("현금인출")) { 
					
					
					
				}
		
				if(itname.contains("통장저금")) {
					
					if(e.getClick().isLeftClick()) {
						local = calculate.getATMSum(p);
						
						p.sendMessage(ChatColor.YELLOW + "-------------------------------");
						TextComponent message = new TextComponent("[선택] 25% 통장저금하기");
						message.setColor(net.md_5.bungee.api.ChatColor.GREEN);
						message.setBold(true);
						message.setClickEvent(new ClickEvent(ClickEvent.Action.RUN_COMMAND, "/des 25"));
						message.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT,
								new ComponentBuilder("[MUJU_CHOICE.API - 25bankinto]").color(net.md_5.bungee.api.ChatColor.GRAY).italic(true).create()));
						p.spigot().sendMessage(message);
						
						message = new TextComponent("[선택] 50% 통장저금하기");
						message.setColor(net.md_5.bungee.api.ChatColor.GREEN);
						message.setBold(true);
						message.setClickEvent(new ClickEvent(ClickEvent.Action.RUN_COMMAND, "/des 50"));
						message.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT,
								new ComponentBuilder("[MUJU_CHOICE.API - 50bankinto]").color(net.md_5.bungee.api.ChatColor.GRAY).italic(true).create()));
						p.spigot().sendMessage(message);
						
						message = new TextComponent("[선택] 75% 통장저금하기");
						message.setColor(net.md_5.bungee.api.ChatColor.GREEN);
						message.setBold(true);
						message.setClickEvent(new ClickEvent(ClickEvent.Action.RUN_COMMAND, "/des 75"));
						message.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT,
								new ComponentBuilder("[MUJU_CHOICE.API - 75bankinto]").color(net.md_5.bungee.api.ChatColor.GRAY).italic(true).create()));
						p.spigot().sendMessage(message);
						
						message = new TextComponent("[선택] 100% 통장저금하기");
						message.setColor(net.md_5.bungee.api.ChatColor.GREEN);
						message.setBold(true);
						message.setClickEvent(new ClickEvent(ClickEvent.Action.RUN_COMMAND, "/des 100"));
						message.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT,
								new ComponentBuilder("[MUJU_CHOICE.API - 100bankinto]").color(net.md_5.bungee.api.ChatColor.GRAY).italic(true).create()));
						p.spigot().sendMessage(message);
						p.sendMessage(ChatColor.YELLOW + "-------------------------------");
					}
					if(e.getClick().isRightClick()) {
						p.closeInventory();
						
						p.sendMessage(ChatColor.YELLOW + " - - - - - 무주시대은행 - - - - - ");
						p.sendMessage("");
						p.sendMessage(ChatColor.AQUA + " [적용이율] " + ChatColor.RED + "LVL(레벨)" + ChatColor.WHITE+ " x 0.25 [%]");
						
						int a = p.getLevel();
						
						double d = a * 0.25;
						String w = Double.toString(d);
						p.sendMessage(ChatColor.GRAY + "<" + p.getDisplayName() + "님의 이율은 " + w + "% 이십니다>");
					}
				}
			} else {
				return;
			}
			
		} catch(Exception x) {
			Bukkit.getConsoleSender().sendMessage(ChatColor.RED+ "[ALERT!] EXCEPTION HAS BEEN CHECKED >>> " + ChatColor.AQUA + x.getMessage());
			
			
		}
			
	}
}
