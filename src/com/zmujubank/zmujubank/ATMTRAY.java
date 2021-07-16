package com.zmujubank.zmujubank;

import java.util.Arrays;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.meta.ItemMeta;

public class ATMTRAY {
	
	public static Inventory mastermenu = Bukkit.createInventory(null, 27, ChatColor.BLACK + "ATM TRAY"); // ATM
	
	public static void opentray(Player p, int loso) {
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
		mastermenu.setItem(17, item1);
		mastermenu.setItem(21, item1);
		mastermenu.setItem(22, item1);
		mastermenu.setItem(23, item1);
		mastermenu.setItem(24, item1);
		mastermenu.setItem(25, item1);
		mastermenu.setItem(26, item1);
		mastermenu.setItem(10, item1);
		mastermenu.setItem(14, item1);
		mastermenu.setItem(16, item1);
		
		org.bukkit.inventory.ItemStack item = new org.bukkit.inventory.ItemStack(Material.LIME_DYE);
		org.bukkit.inventory.meta.ItemMeta meta = item.getItemMeta();

		meta.setDisplayName(ChatColor.RED + "" + ChatColor.BOLD + "| " + loso + "원 투입 필요! |");
		meta.setLore(Arrays.asList(ChatColor.AQUA + " ------ INFORMATION ------", "", ChatColor.WHITE + " [저금금액] " + cc.korea.get(p.getUniqueId())  +"원" + ChatColor.GRAY + "(RTAX) ", ChatColor.WHITE + " [ATM상태] " + ChatColor.GREEN + "투입대기중(정상)", ChatColor.RED + " [미달금액] " + loso + "원", "", "",
				ChatColor.GRAY + " [" + ChatColor.WHITE + "?" + ChatColor.GRAY + "] 어떻게 진행하나요?", ChatColor.GRAY+ " - 투입할 금액만큼 지폐 아이템을 클릭하면 자동으로 투입됩니다.", ChatColor.GRAY + " [" + ChatColor.WHITE + "?" + ChatColor.GRAY + "] 현금을 잘못 투입했습니다!", ChatColor.GRAY+ " - 매일 17시 30분에 자동으로 플러그인이 기록 확인 후 현금으로 반환시켜 드립니다. (조심하세요!)", ChatColor.GRAY + "", "", ChatColor.GRAY + "[관련 버그 신고 : 디스코드]"));
		meta.addEnchant(Enchantment.DAMAGE_ALL, 1, false);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		item.setItemMeta(meta);
		cc.korea.put(p.getUniqueId(), loso);
		
		mastermenu.setItem(13, item);
		
		
		if(loso <= 0) {
			meta.setDisplayName(ChatColor.GREEN + "" + ChatColor.BOLD + "| 금액투입 완료[✔] |");
			meta.setLore(Arrays.asList(ChatColor.AQUA + " ------ INFORMATION ------", "", ChatColor.WHITE + " [저금금액] " + cc.trot.get(p.getUniqueId())  +"원" + ChatColor.GRAY + "(RTAX) ", ChatColor.WHITE + " [ATM상태] " + ChatColor.GREEN + "신호대기중(정상)"));
			meta.addEnchant(Enchantment.DAMAGE_ALL, 1, false);
			meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			item.setItemMeta(meta);
			
			mastermenu.setItem(13, item);
			
			
			mybankapi .setmoney(p, cc.trot.get(p.getUniqueId()));
		}
		
		p.openInventory(mastermenu);
		
	}
}

