package leaf.mods.impl;

import leaf.mods.*;
import leaf.*;

public class ChatMod extends Mod
{
    public boolean detect;
    public boolean background;
    public boolean access;
    
    public ChatMod() {
        super("Chat", 0, 0, Integer.parseInt(Leaf.instance.configManager.loadConfig("Chat", "red")), Integer.parseInt(Leaf.instance.configManager.loadConfig("Chat", "green")), Integer.parseInt(Leaf.instance.configManager.loadConfig("Chat", "blue")), 0, Boolean.valueOf(Leaf.instance.configManager.loadConfig("Chat", "enable")));
        this.detect = Boolean.valueOf(Leaf.instance.configManager.loadConfig("Chat", "detect"));
        this.background = Boolean.valueOf(Leaf.instance.configManager.loadConfig("Chat", "background"));
        this.access = Boolean.valueOf(Leaf.instance.configManager.loadConfig("Chat", "access"));
    }
}
