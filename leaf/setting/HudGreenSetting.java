package leaf.setting;

import leaf.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll.*;
import leaf.*;

class HudGreenSetting extends GuiLeafSetting
{
    final /* synthetic */ HudSetting IlIlIlIlIlllllllllIl;
    
    HudGreenSetting(final HudSetting ilIlIlIlIlllllllllIl, final String s, final int n, final int n2, final int n3, final int n4, final int n5, final int n6) {
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
        super(s, n, n2, n3, n4, n5, n6);
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll() {
        final int llIllIIIIIllIlIIIIlI = Setting.llIllIIIIIllIlIIIIlI(this.llllIIIIlIIIlIlllIll);
        Leaf.instance.saveConfig.saveConfig(this.IlIlIlIlIlllllllllIl.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl(), "green", String.valueOf(llIllIIIIIllIlIIIIlI));
        this.IlIlIlIlIlllllllllIl.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll(this.IlIlIlIlIlllllllllIl.IlIlIIIllIllIIIIIllI.lIIIlllIIIllIIIllIII().getRed(), llIllIIIIIllIlIIIIlI, this.IlIlIlIlIlllllllllIl.IlIlIIIllIllIIIIIllI.lIIIlllIIIllIIIllIII().getBlue());
    }
}
