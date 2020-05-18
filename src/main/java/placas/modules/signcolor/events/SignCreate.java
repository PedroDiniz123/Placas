package placas.modules.signcolor.events;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.SignChangeEvent;
import placas.core.Placas;
import placas.modules.signcolor.utils.Utilities;

public class SignCreate implements Listener {
    public Placas plugin;
    public SignCreate(Placas plugin){
        this.plugin = plugin;
        plugin.getServer().getPluginManager().registerEvents(this, plugin);
    }

    @EventHandler
    public void onSignCreare(SignChangeEvent event){
        String[] lines = event.getLines();

        Utilities.replaceLines(lines);
    }
}
