package leaf.mods.impl;

import leaf.mods.*;
import leaf.*;

public class NameTagMod extends Mod
{
    public boolean shadow;
    public boolean background;
    
    public NameTagMod() {
        super("NameTag", 0, 0, 0, 0, 0, 0, Boolean.valueOf(Leaf.instance.configManager.loadConfig("NameTag", "enable")));
        this.shadow = Boolean.valueOf(Leaf.instance.configManager.loadConfig("NameTag", "shadow"));
        this.background = Boolean.valueOf(Leaf.instance.configManager.loadConfig("NameTag", "background"));
    }
}
