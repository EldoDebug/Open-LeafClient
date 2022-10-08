package leaf.mods.impl;

import leaf.mods.*;
import leaf.*;

public class OldAnimationMod extends Mod
{
    public OldAnimationMod() {
        super("Old Animation", 0, 0, 0, 0, 0, 0, Boolean.valueOf(Leaf.instance.saveConfig.loadConfig("Animation", "enable")));
    }
}
