package placas.modules.signeditor.core;


import placas.core.Placas;
import placas.modules.signeditor.commands.Editar;

public class LoadSignEditorModules {
    public LoadSignEditorModules(Placas plugin) {
        try{
            new Editar(plugin);

            plugin.getServer().getConsoleSender().sendMessage("§aSignEditor carregou!");
        }catch (Exception exception){

            plugin.getServer().getConsoleSender().sendMessage("§cSignEditor não carregou!");
        }
    }
}
