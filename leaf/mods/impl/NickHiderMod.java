package leaf.mods.impl;

import leaf.mods.*;
import leaf.*;

public class NickHiderMod extends Mod
{
    public boolean llllIIIIlIIIlIlllIll;
    public String IlIlIlIlIlllllllllIl;
    
    public NickHiderMod() {
        super("NickHider", 0, 0, 0, 0, 0, 0, Boolean.valueOf(Leaf.instance.saveConfig.loadConfig("NickHider", "enable")));
        this.llllIIIIlIIIlIlllIll = Boolean.valueOf(Leaf.instance.saveConfig.loadConfig("NickHider", "nick_others"));
        this.IlIlIlIlIlllllllllIl = Leaf.instance.saveConfig.loadConfig("NickHider", "name");
    }
}
