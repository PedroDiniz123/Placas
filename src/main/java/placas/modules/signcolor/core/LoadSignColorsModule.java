package placas.modules.signcolor.core;

import placas.core.Placas;
import placas.modules.signcolor.events.SignCreate;

public class LoadSignColorsModule {
    public LoadSignColorsModule(Placas plugin){
        try{
            new SignCreate(plugin);

            plugin.getServer().getConsoleSender().sendMessage("§aSignColors carregou!");

        } catch (Exception exception){

            plugin.getServer().getConsoleSender().sendMessage("§cSignColors não carregou");
        }
    }
}
