package placas.modules.signeditor.commands;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.Sign;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import placas.core.Placas;
import placas.modules.signeditor.utils.Utilities;

import java.util.Set;

public class Editar implements CommandExecutor {
    public Placas plugin;
    public Editar(Placas plugin) {
        this.plugin = plugin;
        plugin.getCommand("editar").setExecutor(this);
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!(sender instanceof Player)) {
            sender.sendMessage("Comando apenas para player.");
            return true;
        }

        Player player = (Player) sender;
        Set<Material> materials = null;
        Block block = player.getTargetBlock(materials, 4);
        Material type = block.getType();

        if(!Utilities.isValid(block, player, args)){
            return true;
        }

        int index = (Integer.parseInt(args[0])) - 1;

        String frase = Utilities.getCommandLine(args);

        Sign sign = ((Sign) block.getState());
        Utilities.setLine(sign, index, frase);
        return true;
    }
}
