package leaf.setting;

import leaf.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll.*;
import java.util.*;
import net.minecraft.client.*;
import net.minecraft.client.llIllIIIIIllIlIIIIlI.*;

class CosmeticTypeSetting extends llllIIIIlIIIlIlllIll
{
    final /* synthetic */ PlayerCosmeticSetting llllIIIIlIIIlIlllIll;
    
    CosmeticTypeSetting(final PlayerCosmeticSetting llllIIIIlIIIlIlllIll, final String s, final int n, final int n2, final int n3, final int n4, final List list, final String s2) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        super(s, n, n2, n3, n4, list, s2);
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll() {
        Minecraft.getMinecraft().llllIIIIlIIIlIlllIll(new PlayerCosmeticSetting(this.IlIlIlIlIlllllllllIl.get(this.llIllIIIIIllIlIIIIlI)));
    }
}
