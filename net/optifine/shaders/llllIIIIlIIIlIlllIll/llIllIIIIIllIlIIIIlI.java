package net.optifine.shaders.llllIIIIlIIIlIlllIll;

import java.util.*;
import net.optifine.expr.*;
import net.minecraft.IIllIIllIIIlIlIIIIlI.*;

public class llIllIIIIIllIlIIIIlI implements llllIIllllIlIlIIIIll
{
    private Map llllIIIIlIIIlIlllIll;
    
    public llIllIIIIIllIlIIIIlI(final Map llllIIIIlIIIlIlllIll) {
        this.llllIIIIlIIIlIlllIll = null;
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
    }
    
    @Override
    public llIIlIIIlIIIllIlIIIl llIllIIIIIllIlIIIIlI(String s) {
        final String s2 = "defined_";
        if (s.startsWith(s2)) {
            return this.llllIIIIlIIIlIlllIll.containsKey(s.substring(s2.length())) ? new IllIIlllIIIIlllIIlIl(lIIIlllIIIllIIIllIII.llIlIIIIIlIIlIlIIlll, null) : new IllIIlllIIIIlllIIlIl(lIIIlllIIIllIIIllIII.IlIIlIlIIIlIIlIlIlII, null);
        }
        while (this.llllIIIIlIIIlIlllIll.containsKey(s)) {
            final String s3 = this.llllIIIIlIIIlIlllIll.get(s);
            if (s3 == null) {
                break;
            }
            if (s3.equals(s)) {
                break;
            }
            s = s3;
        }
        final int llllIIIIlIIIlIlllIll = net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(s, Integer.MIN_VALUE);
        if (llllIIIIlIIIlIlllIll == Integer.MIN_VALUE) {
            net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI("Unknown macro value: " + s);
            return new net.optifine.expr.llllIIIIlIIIlIlllIll(0.0f);
        }
        return new net.optifine.expr.llllIIIIlIIIlIlllIll((float)llllIIIIlIIIlIlllIll);
    }
}
