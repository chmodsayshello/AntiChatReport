package chmodsayshello.antichatreport.Events;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerChatEvent;

public class Chat implements Listener {
    @EventHandler
    public void onplayerchat(PlayerChatEvent e){
        for (Player p : Bukkit.getOnlinePlayers()){
            p.sendMessage("<"+e.getPlayer().getName()+"> "+e.getMessage()); //clients now think the server sent this message, which it basicly did
        }
        Bukkit.getLogger().info("[AntiChatReport] <"+e.getPlayer().getName()+"> "+e.getMessage());
        e.setCancelled(true);
    }
}
