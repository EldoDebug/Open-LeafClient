package leaf.IllIIlllIIIIlllIIlIl;

import leaf.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll.*;
import leaf.setting.*;
import leaf.*;

class IlIlIllllllllIIIIlII extends GuiLeafSetting
{
    final /* synthetic */ HudSetting IlIlIlIlIlllllllllIl;
    
    IlIlIllllllllIIIIlII(final HudSetting ilIlIlIlIlllllllllIl, final String s, final int n, final int n2, final int n3, final int n4, final int n5, final int n6) {
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
        super(s, n, n2, n3, n4, n5, n6);
    }
    
    @Override
    public void addSetting() {
        final int llIllIIIIIllIlIIIIlI = Setting.llIllIIIIIllIlIIIIlI(this.llllIIIIlIIIlIlllIll);
        Leaf.instance.configManager.saveConfig(HudSetting.llllIIIIlIIIlIlllIll(this.IlIlIlIlIlllllllllIl).getName(), "green", String.valueOf(llIllIIIIIllIlIIIIlI));
        HudSetting.llllIIIIlIIIlIlllIll(this.IlIlIlIlIlllllllllIl).llllIIIIlIIIlIlllIll(HudSetting.llllIIIIlIIIlIlllIll(this.IlIlIlIlIlllllllllIl).getColor().getRed(), llIllIIIIIllIlIIIIlI, HudSetting.llllIIIIlIIIlIlllIll(this.IlIlIlIlIlllllllllIl).getColor().getBlue());
    }
}
