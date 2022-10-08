package leaf.mods.impl;

import leaf.mods.*;
import leaf.*;

public class HitBoxMod extends Mod
{
    public boolean llllIIIIlIIIlIlllIll;
    
    public HitBoxMod() {
        super("HitBox", 0, 0, Integer.parseInt(Leaf.instance.saveConfig.loadConfig("HitBox", "red")), Integer.parseInt(Leaf.instance.saveConfig.loadConfig("HitBox", "green")), Integer.parseInt(Leaf.instance.saveConfig.loadConfig("HitBox", "blue")), 0, Boolean.valueOf(Leaf.instance.saveConfig.loadConfig("HitBox", "enable")));
        this.llllIIIIlIIIlIlllIll = Boolean.valueOf(Leaf.instance.saveConfig.loadConfig("HitBox", "look_direction"));
    }
}
