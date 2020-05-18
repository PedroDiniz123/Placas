package placas.modules.signcolor.utils;

public class Utilities {
    public static void replaceLines(String[] lines){
        lines[0] = lines[0].replace("&", "§");
        lines[1] = lines[1].replace("&", "§");
        lines[2] = lines[2].replace("&", "§");
        lines[3] = lines[3].replace("&", "§");
    }
}
