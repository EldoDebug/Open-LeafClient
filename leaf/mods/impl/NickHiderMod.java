package leaf.mods.impl;

import leaf.mods.*;
import leaf.*;

public class NickHiderMod extends Mod
{
    public boolean nickOther;
    public String nickName;
    
    public NickHiderMod() {
        super("NickHider", 0, 0, 0, 0, 0, 0, Boolean.valueOf(Leaf.instance.configManager.loadConfig("NickHider", "enable")));
        this.nickOther = Boolean.valueOf(Leaf.instance.configManager.loadConfig("NickHider", "nick_others"));
        this.nickName = Leaf.instance.configManager.loadConfig("NickHider", "name");
    }
}
