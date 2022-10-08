package leaf.mods.impl;

import leaf.mods.*;
import leaf.*;

public class ChatMod extends Mod
{
    public boolean llllIIIIlIIIlIlllIll;
    public boolean IlIlIlIlIlllllllllIl;
    public boolean llIllIIIIIllIlIIIIlI;
    
    public ChatMod() {
        super("Chat", 0, 0, Integer.parseInt(Leaf.instance.saveConfig.loadConfig("Chat", "red")), Integer.parseInt(Leaf.instance.saveConfig.loadConfig("Chat", "green")), Integer.parseInt(Leaf.instance.saveConfig.loadConfig("Chat", "blue")), 0, Boolean.valueOf(Leaf.instance.saveConfig.loadConfig("Chat", "enable")));
        this.llllIIIIlIIIlIlllIll = Boolean.valueOf(Leaf.instance.saveConfig.loadConfig("Chat", "detect"));
        this.IlIlIlIlIlllllllllIl = Boolean.valueOf(Leaf.instance.saveConfig.loadConfig("Chat", "background"));
        this.llIllIIIIIllIlIIIIlI = Boolean.valueOf(Leaf.instance.saveConfig.loadConfig("Chat", "access"));
    }
}
