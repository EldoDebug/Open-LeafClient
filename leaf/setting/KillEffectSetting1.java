package leaf.setting;

import leaf.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll.*;
import leaf.*;

class KillEffectSetting1 extends SettingBase
{
    final /* synthetic */ HudSetting IlIlIlIlIlllllllllIl;
    
    KillEffectSetting1(final HudSetting ilIlIlIlIlllllllllIl, final String s, final int n, final int n2, final int n3, final int n4, final boolean b) {
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
        super(s, n, n2, n3, n4, b);
    }
    
    @Override
    public void addSetting() {
        Leaf.instance.configManager.saveConfig("KillEffect", "hide_cadaver", String.valueOf(this.llllIIIIlIIIlIlllIll));
        Leaf.instance.modManager.killEffectMod.hideCadaver = this.llllIIIIlIIIlIlllIll;
    }
}
