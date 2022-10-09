package net.optifine.llIllIIIIIllIlIIIIlI;

import java.awt.*;
import net.minecraft.client.llIllIIIIIllIlIIIIlI.*;
import net.optifine.shaders.IlIlIlIlIlllllllllIl.*;

public class IlIllIlIlIIIlIlIlIII implements llllIIllllIlIlIIIIll
{
    @Override
    public Rectangle llllIIIIlIIIlIlllIll(final lIIllIIIllllIlllIllI liIllIIIllllIlllIllI, final int n, final int n2) {
        int n3 = liIllIIIllllIlllIllI.llllIIllllIlIlIIIIll - 450;
        int n4 = 35;
        if (n3 < 10) {
            n3 = 10;
        }
        if (n2 <= n4 + 94) {
            n4 += 100;
        }
        return new Rectangle(n3, n4, n3 + 150 + 150 - n3, n4 + 84 + 10 - n4);
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll() {
        return true;
    }
    
    @Override
    public String[] llllIIIIlIIIlIlllIll(final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl, final int n) {
        if (ilIIIlIlIIIllIlIlIIl instanceof llllIIIIlIIIlIlllIll) {
            return IIlllIIlIllIllIlIIll.llllIIIIlIIIlIlllIll("of.options.shaders.DOWNLOAD");
        }
        if (!(ilIIIlIlIIIllIlIlIIl instanceof IlIlIlIlIlllllllllIl)) {
            return null;
        }
        return this.llllIIIIlIIIlIlllIll(((IlIlIlIlIlllllllllIl)ilIIIlIlIIIllIlIlIIl).llIllIIIIIllIlIIIIlI());
    }
    
    private String[] llllIIIIlIIIlIlllIll(final net.optifine.shaders.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        return IIlllIIlIllIllIlIIll.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll());
    }
}
