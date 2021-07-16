package com.zmujubank.zmujubank;

import java.util.Arrays;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;

public class papers {
	public static ItemStack chun() {
		org.bukkit.inventory.ItemStack item = new org.bukkit.inventory.ItemStack(Material.GRAY_DYE);
		org.bukkit.inventory.meta.ItemMeta meta = item.getItemMeta();

		meta.setDisplayName(ChatColor.YELLOW + "[현금] " + ChatColor.WHITE + "1000원");
		meta.setLore(Arrays.asList(ChatColor.WHITE + " - 무주시대은행에서 발급된 평범한 지폐", ChatColor.WHITE + " - 실용적이지만 현금은 도난 가능성이 ", ChatColor.WHITE + " 있습니다"));
		meta.addEnchant(Enchantment.DAMAGE_ALL, 1, false);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		item.setItemMeta(meta);
		
		return item;
	}
	public static ItemStack ochun() {
		org.bukkit.inventory.ItemStack item = new org.bukkit.inventory.ItemStack(Material.LIME_DYE);
		org.bukkit.inventory.meta.ItemMeta meta = item.getItemMeta();

		meta.setDisplayName(ChatColor.YELLOW + "[현금] " + ChatColor.WHITE + "5000원");
		meta.setLore(Arrays.asList(ChatColor.WHITE + " - 무주시대은행에서 발급된 평범한 지폐", ChatColor.WHITE + " - 실용적이지만 현금은 도난 가능성이 ", ChatColor.WHITE + " 있습니다"));
		meta.addEnchant(Enchantment.DAMAGE_ALL, 1, false);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		item.setItemMeta(meta);
		
		
		return item;
	}
	public static ItemStack man() {
		org.bukkit.inventory.ItemStack item = new org.bukkit.inventory.ItemStack(Material.PINK_DYE);
		org.bukkit.inventory.meta.ItemMeta meta = item.getItemMeta();

		meta.setDisplayName(ChatColor.YELLOW + "[현금] " + ChatColor.WHITE + "10000원");
		meta.setLore(Arrays.asList(ChatColor.WHITE + " - 무주시대은행에서 발급된 평범한 지폐", ChatColor.WHITE + " - 실용적이지만 현금은 도난 가능성이 ", ChatColor.WHITE + " 있습니다"));
		meta.addEnchant(Enchantment.DAMAGE_ALL, 1, false);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		item.setItemMeta(meta);
		return item;
	}
	public static ItemStack oman() {
		org.bukkit.inventory.ItemStack item = new org.bukkit.inventory.ItemStack(Material.LIGHT_BLUE_DYE);
		org.bukkit.inventory.meta.ItemMeta meta = item.getItemMeta();

		meta.setDisplayName(ChatColor.YELLOW + "[현금] " + ChatColor.WHITE + "50000원");
		meta.setLore(Arrays.asList(ChatColor.WHITE + " - 무주시대은행에서 발급된 평범한 지폐", ChatColor.WHITE + " - 실용적이지만 현금은 도난 가능성이 ", ChatColor.WHITE + " 있습니다"));
		meta.addEnchant(Enchantment.DAMAGE_ALL, 1, false);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		item.setItemMeta(meta);
		return item;
	}
}
