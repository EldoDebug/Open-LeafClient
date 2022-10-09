package leaf.mods.impl;

import leaf.mods.*;
import leaf.*;

public class HitBoxMod extends Mod
{
    public boolean lookDirection;
    
    public HitBoxMod() {
        super("HitBox", 0, 0, Integer.parseInt(Leaf.instance.configManager.loadConfig("HitBox", "red")), Integer.parseInt(Leaf.instance.configManager.loadConfig("HitBox", "green")), Integer.parseInt(Leaf.instance.configManager.loadConfig("HitBox", "blue")), 0, Boolean.valueOf(Leaf.instance.configManager.loadConfig("HitBox", "enable")));
        this.lookDirection = Boolean.valueOf(Leaf.instance.configManager.loadConfig("HitBox", "look_direction"));
    }
}
