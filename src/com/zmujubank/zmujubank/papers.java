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

		meta.setDisplayName(ChatColor.YELLOW + "[����] " + ChatColor.WHITE + "1000��");
		meta.setLore(Arrays.asList(ChatColor.WHITE + " - ���ֽô����࿡�� �߱޵� ����� ����", ChatColor.WHITE + " - �ǿ��������� ������ ���� ���ɼ��� ", ChatColor.WHITE + " �ֽ��ϴ�"));
		meta.addEnchant(Enchantment.DAMAGE_ALL, 1, false);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		item.setItemMeta(meta);
		
		return item;
	}
	public static ItemStack ochun() {
		org.bukkit.inventory.ItemStack item = new org.bukkit.inventory.ItemStack(Material.LIME_DYE);
		org.bukkit.inventory.meta.ItemMeta meta = item.getItemMeta();

		meta.setDisplayName(ChatColor.YELLOW + "[����] " + ChatColor.WHITE + "5000��");
		meta.setLore(Arrays.asList(ChatColor.WHITE + " - ���ֽô����࿡�� �߱޵� ����� ����", ChatColor.WHITE + " - �ǿ��������� ������ ���� ���ɼ��� ", ChatColor.WHITE + " �ֽ��ϴ�"));
		meta.addEnchant(Enchantment.DAMAGE_ALL, 1, false);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		item.setItemMeta(meta);
		
		
		return item;
	}
	public static ItemStack man() {
		org.bukkit.inventory.ItemStack item = new org.bukkit.inventory.ItemStack(Material.PINK_DYE);
		org.bukkit.inventory.meta.ItemMeta meta = item.getItemMeta();

		meta.setDisplayName(ChatColor.YELLOW + "[����] " + ChatColor.WHITE + "10000��");
		meta.setLore(Arrays.asList(ChatColor.WHITE + " - ���ֽô����࿡�� �߱޵� ����� ����", ChatColor.WHITE + " - �ǿ��������� ������ ���� ���ɼ��� ", ChatColor.WHITE + " �ֽ��ϴ�"));
		meta.addEnchant(Enchantment.DAMAGE_ALL, 1, false);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		item.setItemMeta(meta);
		return item;
	}
	public static ItemStack oman() {
		org.bukkit.inventory.ItemStack item = new org.bukkit.inventory.ItemStack(Material.LIGHT_BLUE_DYE);
		org.bukkit.inventory.meta.ItemMeta meta = item.getItemMeta();

		meta.setDisplayName(ChatColor.YELLOW + "[����] " + ChatColor.WHITE + "50000��");
		meta.setLore(Arrays.asList(ChatColor.WHITE + " - ���ֽô����࿡�� �߱޵� ����� ����", ChatColor.WHITE + " - �ǿ��������� ������ ���� ���ɼ��� ", ChatColor.WHITE + " �ֽ��ϴ�"));
		meta.addEnchant(Enchantment.DAMAGE_ALL, 1, false);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		item.setItemMeta(meta);
		return item;
	}
}
