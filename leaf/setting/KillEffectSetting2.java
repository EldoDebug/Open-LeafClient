package leaf.setting;

import leaf.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll.*;
import java.util.*;
import leaf.*;

class KillEffectSetting2 extends llllIIIIlIIIlIlllIll
{
    final /* synthetic */ HudSetting llllIIIIlIIIlIlllIll;
    
    KillEffectSetting2(final HudSetting llllIIIIlIIIlIlllIll, final String s, final int n, final int n2, final int n3, final int n4, final List list, final String s2) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        super(s, n, n2, n3, n4, list, s2);
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll() {
        Leaf.instance.saveConfig.saveConfig("KillEffect", "effect", this.IlIlIlIlIlllllllllIl.get(this.llIllIIIIIllIlIIIIlI));
        Leaf.instance.modManager.IlIIIlIlIIIllIlIlIIl.effectType = this.IlIlIlIlIlllllllllIl.get(this.llIllIIIIIllIlIIIIlI);
    }
}
