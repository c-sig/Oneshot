package net.sisig.oneshot;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin implements Listener {
    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(this, this);
    }
    @EventHandler
    public void onPlayerDamage(EntityDamageEvent a) {
        if(a.getEntity() instanceof Player)
            a.setDamage(100.0D);
        }
}
