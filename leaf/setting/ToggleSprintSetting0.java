package leaf.setting;

import leaf.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll.*;
import leaf.*;

class ToggleSprintSetting0 extends IlIIIlIlIIIllIlIlIIl
{
    final /* synthetic */ HudSetting IlIlIlIlIlllllllllIl;
    
    ToggleSprintSetting0(final HudSetting ilIlIlIlIlllllllllIl, final String s, final int n, final int n2, final int n3, final int n4, final boolean b) {
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
        super(s, n, n2, n3, n4, b);
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll() {
        Leaf.instance.saveConfig.saveConfig("ToggleSprint", "sneak", String.valueOf(this.llllIIIIlIIIlIlllIll));
        Leaf.instance.modManager.IlIlIlIlIlllllllllIl.sneak = this.llllIIIIlIIIlIlllIll;
    }
}
