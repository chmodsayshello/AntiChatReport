package chmodsayshello.antichatreport;

import org.bukkit.plugin.java.JavaPlugin;
import chmodsayshello.antichatreport.Events.*;

public final class AntiChatReport extends JavaPlugin {

    @Override
    public void onEnable() {
        this.getServer().getPluginManager().registerEvents(new Chat(), this);
        this.getLogger().info("AntiChatReport started!");
        // Plugin startup logic

    }

    @Override
    public void onDisable() {
        this.getLogger().info("AntiChatReport shut down, people can now report each other!");
        // Plugin shutdown logic
    }
}
