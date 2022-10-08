package leaf.mods.impl;

import leaf.mods.*;
import leaf.*;

public class NameTagMod extends Mod
{
    public boolean llllIIIIlIIIlIlllIll;
    public boolean IlIlIlIlIlllllllllIl;
    
    public NameTagMod() {
        super("NameTag", 0, 0, 0, 0, 0, 0, Boolean.valueOf(Leaf.instance.saveConfig.loadConfig("NameTag", "enable")));
        this.llllIIIIlIIIlIlllIll = Boolean.valueOf(Leaf.instance.saveConfig.loadConfig("NameTag", "shadow"));
        this.IlIlIlIlIlllllllllIl = Boolean.valueOf(Leaf.instance.saveConfig.loadConfig("NameTag", "background"));
    }
}
