package com.zmujubank.zmujubank;

import java.util.Arrays;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.meta.ItemMeta;


public class openatm implements Listener{
	
	public static Inventory mastermenu = Bukkit.createInventory(null, 27, ChatColor.BLACK + "���ֽ� ATM <MUJU CITY ATM>"); // ATM
	
	public static void displayatm(Player ap) {
		
		org.bukkit.inventory.ItemStack item = new org.bukkit.inventory.ItemStack(Material.PAPER);
		org.bukkit.inventory.meta.ItemMeta meta = item.getItemMeta();

		meta.setDisplayName(ChatColor.YELLOW + "| �� ���� ���� |");
		meta.setLore(Arrays.asList(ChatColor.AQUA + " ------ INFORMATION ------", "", ChatColor.WHITE + " [����] " + ap.getDisplayName(), ChatColor.WHITE + " [�ܾ�] " + "2"));
		meta.addEnchant(Enchantment.DAMAGE_ALL, 1, false);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		item.setItemMeta(meta);
		
		

		mastermenu.setItem(10, item);

		org.bukkit.inventory.ItemStack item1 = new org.bukkit.inventory. ItemStack(Material.BLACK_STAINED_GLASS_PANE);
		ItemMeta sss = item1.getItemMeta();
		sss.setDisplayName(ChatColor.RED + "");
		item1.setItemMeta(sss);
		
		
		mastermenu.setItem(0, item1);
		mastermenu.setItem(9, item1);
		mastermenu.setItem(18, item1);
		mastermenu.setItem(19, item1);
		mastermenu.setItem(1, item1);
		mastermenu.setItem(2, item1);
		mastermenu.setItem(11, item1);
		mastermenu.setItem(20, item1);
		mastermenu.setItem(3, item1);
		mastermenu.setItem(4, item1);
		mastermenu.setItem(5, item1);
		mastermenu.setItem(7, item1);
		mastermenu.setItem(6, item1);
		mastermenu.setItem(8, item1);
		mastermenu.setItem(12, item1);
		mastermenu.setItem(15, item1);
		mastermenu.setItem(13, item1);
		mastermenu.setItem(17, item1);
		mastermenu.setItem(21, item1);
		mastermenu.setItem(22, item1);
		mastermenu.setItem(23, item1);
		mastermenu.setItem(24, item1);
		mastermenu.setItem(25, item1);
		mastermenu.setItem(26, item1);
		
		org.bukkit.inventory.ItemStack itema = new org.bukkit.inventory.ItemStack(Material.EMERALD);
		org.bukkit.inventory.meta.ItemMeta metaa = item.getItemMeta();

		metaa.setDisplayName(ChatColor.YELLOW + "��������");
		metaa.setLore(Arrays.asList(ChatColor.WHITE + " - �� ���忡�� ������ �����մϴ�", ChatColor.WHITE + " - �ǿ��������� ������ ���� ���ɼ��� ", ChatColor.WHITE + " �ֽ��ϴ�", "", "", ChatColor.GRAY + "[RŬ��] �������� ����"));
		metaa.addEnchant(Enchantment.DAMAGE_ALL, 1, false);
		metaa.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		itema.setItemMeta(metaa);
		
		mastermenu.setItem(14, itema);
		
		org.bukkit.inventory.ItemStack itema1 = new org.bukkit.inventory.ItemStack(Material.GOLD_INGOT);
		org.bukkit.inventory.meta.ItemMeta metaa1 = item.getItemMeta();

		metaa1.setDisplayName(ChatColor.YELLOW + "��������");
		metaa1.setLore(Arrays.asList(ChatColor.WHITE + " - ������ ���忡 �����մϴ�", ChatColor.WHITE + " - [����]���忡 �־�θ� ���ڰ� �ٽ��ϴ�", "", "", ChatColor.GRAY + "[RŬ��] ���� ���� ���� Ž��", ChatColor.GRAY + "[LŬ��] �������� ����"));
		metaa1.addEnchant(Enchantment.DAMAGE_ALL, 1, false);
		metaa1.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		itema1.setItemMeta(metaa1);
		
		mastermenu.setItem(16, itema1);
		
		
		cc.korea.put(ap.getUniqueId(), des.check);
		
		Bukkit.getPlayer(ap.getName()).openInventory(mastermenu);
		
	}
}
