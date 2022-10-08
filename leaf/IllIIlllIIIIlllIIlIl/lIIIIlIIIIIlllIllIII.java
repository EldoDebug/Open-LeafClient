package leaf.IllIIlllIIIIlllIIlIl;

import leaf.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll.*;
import leaf.setting.*;
import leaf.*;

class lIIIIlIIIIIlllIllIII extends GuiLeafSetting
{
    final /* synthetic */ HudSetting IlIlIlIlIlllllllllIl;
    
    lIIIIlIIIIIlllIllIII(final HudSetting ilIlIlIlIlllllllllIl, final String s, final int n, final int n2, final int n3, final int n4, final int n5, final int n6) {
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
        super(s, n, n2, n3, n4, n5, n6);
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll() {
        final int llIllIIIIIllIlIIIIlI = Setting.llIllIIIIIllIlIIIIlI(this.llllIIIIlIIIlIlllIll);
        Leaf.instance.saveConfig.saveConfig(HudSetting.llllIIIIlIIIlIlllIll(this.IlIlIlIlIlllllllllIl).IlIlIlIlIlllllllllIl(), "green", String.valueOf(llIllIIIIIllIlIIIIlI));
        HudSetting.llllIIIIlIIIlIlllIll(this.IlIlIlIlIlllllllllIl).llllIIIIlIIIlIlllIll(HudSetting.llllIIIIlIIIlIlllIll(this.IlIlIlIlIlllllllllIl).lIIIlllIIIllIIIllIII().getRed(), llIllIIIIIllIlIIIIlI, HudSetting.llllIIIIlIIIlIlllIll(this.IlIlIlIlIlllllllllIl).lIIIlllIIIllIIIllIII().getBlue());
    }
}
