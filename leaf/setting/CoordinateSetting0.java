package leaf.setting;

import leaf.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll.*;
import leaf.*;

class CoordinateSetting0 extends IlIIIlIlIIIllIlIlIIl
{
    final /* synthetic */ HudSetting IlIlIlIlIlllllllllIl;
    
    CoordinateSetting0(final HudSetting ilIlIlIlIlllllllllIl, final String s, final int n, final int n2, final int n3, final int n4, final boolean b) {
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
        super(s, n, n2, n3, n4, b);
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll() {
        Leaf.instance.saveConfig.saveConfig("Coordinate", "biome", String.valueOf(this.llllIIIIlIIIlIlllIll));
        Leaf.instance.modManager.IIIIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll = this.llllIIIIlIIIlIlllIll;
    }
}
