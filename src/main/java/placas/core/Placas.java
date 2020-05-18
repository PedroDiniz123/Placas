package placas.core;

import org.bukkit.Bukkit;
import org.bukkit.event.HandlerList;
import org.bukkit.plugin.java.JavaPlugin;
import placas.modules.signcolor.core.LoadSignColorsModule;
import placas.modules.signeditor.core.LoadSignEditorModules;

public class Placas extends JavaPlugin{
    public static Placas plugin;

    @Override
    public void onEnable() {
        plugin = this;

        loadModules();
    }

    @Override
    public void onDisable() {
        HandlerList.unregisterAll(this);
    }

    public void loadModules(){
        new LoadSignColorsModule(this);
        new LoadSignEditorModules(this);
    }
}
