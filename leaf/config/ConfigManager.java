package leaf.config;

import net.minecraft.client.*;
import java.util.*;
import java.io.*;

public class ConfigManager
{
    private File configFile;
    
    public ConfigManager() {
        this.configFile = new File(Minecraft.getMinecraft().mcDataDir, "LeafClient-1.8.9");
        if (!this.configFile.exists()) {
            this.configFile.mkdirs();
        }
        this.saveMod();
    }
    
    void saveMod() {
        for (final String s : Arrays.asList("Setting", "FPS", "KillEffect", "ToggleSprint", "PotionStatus", "CPS", "ArmorStatus", "NickHider", "Saturation", "FreeLook", "HitBox", "Ping", "ScoreBoard", "NameTag", "Chat", "Animation", "Coordinate", "BossBar")) {
            final File file = new File(this.configFile, String.valueOf(s) + ".txt");
            if (!file.exists()) {
                try {
                    file.createNewFile();
                }
                catch (IOException ex) {}
                this.saveSetting(file, s);
            }
        }
    }
    
    void saveSetting(final File file, final String s) {
        try {
            final FileWriter fileWriter = new FileWriter(file, false);
            switch (s) {
                case "HitBox": {
                    fileWriter.write("enable:true\n");
                    fileWriter.write("red:254\n");
                    fileWriter.write("green:254\n");
                    fileWriter.write("blue:254\n");
                    fileWriter.write("look_direction:false");
                    fileWriter.close();
                    return;
                }
                case "Coordinate": {
                    fileWriter.write("enable:true\n");
                    fileWriter.write("x:5\n");
                    fileWriter.write("y:5\n");
                    fileWriter.write("red:254\n");
                    fileWriter.write("green:254\n");
                    fileWriter.write("blue:254\n");
                    fileWriter.write("size:127\n");
                    fileWriter.write("biome:false\n");
                    fileWriter.write("decimal:false");
                    fileWriter.close();
                    return;
                }
                case "FreeLook": {
                    fileWriter.write("enable:true");
                    fileWriter.close();
                    return;
                }
                case "Animation": {
                    fileWriter.write("enable:true");
                    fileWriter.close();
                    return;
                }
                case "NameTag": {
                    fileWriter.write("enable:true\n");
                    fileWriter.write("shadow:false\n");
                    fileWriter.write("background:false");
                    fileWriter.close();
                    return;
                }
                case "PotionStatus": {
                    fileWriter.write("enable:true\n");
                    fileWriter.write("x:5\n");
                    fileWriter.write("y:5\n");
                    fileWriter.write("red:254\n");
                    fileWriter.write("green:254\n");
                    fileWriter.write("blue:254\n");
                    fileWriter.write("size:127\n");
                    fileWriter.write("background:false");
                    fileWriter.close();
                    return;
                }
                case "ScoreBoard": {
                    fileWriter.write("enable:true\n");
                    fileWriter.write("x:5\n");
                    fileWriter.write("y:5\n");
                    fileWriter.write("size:127\n");
                    fileWriter.write("number:false");
                    fileWriter.close();
                    return;
                }
                case "Setting": {
                    fileWriter.write("cape:None\n");
                    fileWriter.write("wing:None\n");
                    fileWriter.write("hat:None\n");
                    fileWriter.write("hide_icon:false\n");
                    fileWriter.write("hide_cape:false\n");
                    fileWriter.write("hide_wing:false\n");
                    fileWriter.write("hide_hat:false\n");
                    fileWriter.write("fullbright:false\n");
                    fileWriter.write("clear_glass:false\n");
                    fileWriter.write("hide_enchant:false\n");
                    fileWriter.write("hide_fire:false\n");
                    fileWriter.write("item:false");
                    fileWriter.close();
                    return;
                }
                case "NickHider": {
                    fileWriter.write("enable:true\n");
                    fileWriter.write("nick_others:false\n");
                    fileWriter.write("name:Player\n");
                    fileWriter.write("id:aaaaaaaa-aaaa-aaaa-aaaa-aaaaaaaaaaaa\n");
                    fileWriter.close();
                    return;
                }
                case "CPS": {
                    fileWriter.write("enable:true\n");
                    fileWriter.write("x:5\n");
                    fileWriter.write("y:5\n");
                    fileWriter.write("red:254\n");
                    fileWriter.write("green:254\n");
                    fileWriter.write("blue:254\n");
                    fileWriter.write("size:127\n");
                    fileWriter.write("right_click:false");
                    fileWriter.close();
                    return;
                }
                case "Chat": {
                    fileWriter.write("enable:true\n");
                    fileWriter.write("red:254\n");
                    fileWriter.write("green:254\n");
                    fileWriter.write("blue:254\n");
                    fileWriter.write("detect:false\n");
                    fileWriter.write("background:false\n");
                    fileWriter.write("access:false");
                    fileWriter.close();
                    return;
                }
                case "KillEffect": {
                    fileWriter.write("enable:true\n");
                    fileWriter.write("effect:NONE\n");
                    fileWriter.write("hide_cadaver:false\n");
                    fileWriter.write("bypass:false");
                    fileWriter.close();
                    return;
                }
                case "ToggleSprint": {
                    fileWriter.write("enable:true\n");
                    fileWriter.write("x:5\n");
                    fileWriter.write("y:5\n");
                    fileWriter.write("red:254\n");
                    fileWriter.write("green:254\n");
                    fileWriter.write("blue:254\n");
                    fileWriter.write("size:127\n");
                    fileWriter.write("speedup:false\n");
                    fileWriter.write("sneak:false");
                    fileWriter.close();
                    return;
                }
                case "BossBar": {
                    fileWriter.write("enable:true\n");
                    fileWriter.write("x:5\n");
                    fileWriter.write("y:5\n");
                    fileWriter.write("red:254\n");
                    fileWriter.write("green:254\n");
                    fileWriter.write("blue:254\n");
                    fileWriter.write("size:127\n");
                    fileWriter.write("health:false");
                    fileWriter.close();
                    return;
                }
                default:
                    break;
            }
            fileWriter.write("enable:true\n");
            fileWriter.write("x:5\n");
            fileWriter.write("y:5\n");
            fileWriter.write("red:254\n");
            fileWriter.write("green:254\n");
            fileWriter.write("blue:254\n");
            fileWriter.write("size:127");
            fileWriter.close();
        }
        catch (IOException ex) {}
    }
    
    public void saveConfig(final String s, final String s2, final String s3) {
        try {
            final BufferedReader bufferedReader = new BufferedReader(new FileReader(new File(this.configFile, String.valueOf(s) + ".txt")));
            String s4 = "";
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                if (line.startsWith(s2)) {
                    s4 = String.valueOf(s4) + line.replace(line.split(":")[1], s3) + "\n";
                }
                else {
                    s4 = String.valueOf(s4) + line + "\n";
                }
            }
            bufferedReader.close();
            final FileWriter fileWriter = new FileWriter(new File(this.configFile, String.valueOf(s) + ".txt"), false);
            fileWriter.write(s4);
            fileWriter.close();
        }
        catch (IOException ex) {}
    }
    
    public String loadConfig(final String s, final String s2) {
        try {
            final BufferedReader bufferedReader = new BufferedReader(new FileReader(new File(this.configFile, String.valueOf(s) + ".txt")));
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                if (line.startsWith(s2)) {
                    bufferedReader.close();
                    return line.split(":")[1];
                }
            }
        }
        catch (IOException ex) {}
        return null;
    }
}
