package leaf.setting;

import leaf.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll.*;
import leaf.*;

class HudSizeSetting extends GuiLeafSetting
{
    final /* synthetic */ HudSetting hudSetting;
    
    HudSizeSetting(final HudSetting hudSetting, final String s, final int n, final int n2, final int n3, final int n4, final int n5, final int n6) {
        this.hudSetting = hudSetting;
        super(s, n, n2, n3, n4, n5, n6);
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll() {
        final int llIllIIIIIllIlIIIIlI = Setting.llIllIIIIIllIlIIIIlI(this.llllIIIIlIIIlIlllIll);
        Leaf.instance.saveConfig.saveConfig(this.hudSetting.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl(), "size", String.valueOf(llIllIIIIIllIlIIIIlI));
        this.hudSetting.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI);
    }
}
