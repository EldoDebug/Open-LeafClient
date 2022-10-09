package net.optifine.llIllIIIIIllIlIIIIlI;

import java.awt.*;
import net.minecraft.client.llIllIIIIIllIlIIIIlI.*;
import java.util.*;
import net.optifine.*;

public class IIlllIIlIllIllIlIIll implements llllIIllllIlIlIIIIll
{
    @Override
    public Rectangle llllIIIIlIIIlIlllIll(final lIIllIIIllllIlllIllI liIllIIIllllIlllIllI, final int n, final int n2) {
        final int n3 = liIllIIIllllIlllIllI.llllIIllllIlIlIIIIll / 2 - 150;
        int n4 = liIllIIIllllIlllIllI.IlIllIlIlIIIlIlIlIII / 6 - 7;
        if (n2 <= n4 + 98) {
            n4 += 105;
        }
        return new Rectangle(n3, n4, n3 + 150 + 150 - n3, n4 + 84 + 10 - n4);
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll() {
        return false;
    }
    
    @Override
    public String[] llllIIIIlIIIlIlllIll(final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl, final int n) {
        if (!(ilIIIlIlIIIllIlIlIIl instanceof IlIlIIIllIIllIlllllI)) {
            return null;
        }
        return llllIIIIlIIIlIlllIll(((IlIlIIIllIIllIlllllI)ilIIIlIlIIIllIlIlIIl).IlIIIlIlIIIllIlIlIIl().IlIIIlIlIIIllIlIlIIl());
    }
    
    public static String[] llllIIIIlIIIlIlllIll(final String s) {
        final ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 10; ++i) {
            final String llllIIIIlIIIlIlllIll = IlIIlIlIIIlIIlIlIlII.llllIIIIlIIIlIlllIll(String.valueOf(s) + ".tooltip." + (i + 1), null);
            if (llllIIIIlIIIlIlllIll == null) {
                break;
            }
            list.add(llllIIIIlIIIlIlllIll);
        }
        if (list.size() <= 0) {
            return null;
        }
        return list.toArray(new String[list.size()]);
    }
}
