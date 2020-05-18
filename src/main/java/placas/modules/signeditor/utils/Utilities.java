package placas.modules.signeditor.utils;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.Sign;
import org.bukkit.entity.Player;

public class Utilities {
    public static boolean isValid(Block block, Player player, String[] args) {
        Material type = block.getType();

        if (!(type.equals(Material.SIGN_POST) || type.equals(Material.WALL_SIGN))) {
            player.sendMessage("Esse comando só funciona olhando para placas!");
            return false;
        }

        if (args.length == 0) {
            player.sendMessage("§9Use: §7/editar <linha 1-4> <texto> §c(olhando para uma placa)");
            return false;
        }

        char[] arg1 = args[0].toCharArray();

        if (!Character.isDigit(arg1[0])) {
            player.sendMessage("§cNúmero inválido, use 1, 2, 3 ou 4");
            return false;
        }

        int index = (Integer.parseInt(args[0])) - 1;
        if (index > 3 || index < 0) {
            player.sendMessage("§cNúmero inválido, use 1, 2, 3 ou 4");
            return false;
        }
        return true;
    }

    public static void setLine(Sign sign, int index, String frase){
        String[] lines = sign.getLines();
        lines[index] = frase;
        lines[index] = lines[index].replace("&", "§");
        sign.update();
    }

    public static String getCommandLine(String[] args){
        String frase = "";
        for(int i = 1; i < args.length; i++){
            frase += args[i] + " ";
        }
        return frase;
    }
}
