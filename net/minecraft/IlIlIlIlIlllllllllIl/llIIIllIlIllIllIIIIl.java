package net.minecraft.IlIlIlIlIlllllllllIl;

import com.google.common.base.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.IlIlIIIIIIlllIlIllIl.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.*;
import java.util.*;
import net.minecraft.lllIIIIlllllIlIIllIl.*;

class llIIIllIlIllIllIIIIl implements Predicate
{
    private final /* synthetic */ Map llllIIIIlIIIlIlllIll;
    
    llIIIllIlIllIllIIIIl(final Map llllIIIIlIIIlIlllIll) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
    }
    
    public boolean llllIIIIlIIIlIlllIll(final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI) {
        final llIIlIIIlIIIllIlIIIl illlIIIIlIIIlIlIlIIl = net.minecraft.IlIlIIIIIIlllIlIllIl.llllIIIIlIIIlIlllIll.IIIIIllIIIIlIIIIllIl().llllIIIIlIIIlIlllIll(0).IlllIIIIlIIIlIlIlIIl();
        for (final Map.Entry<String, V> entry : this.llllIIIIlIIIlIlllIll.entrySet()) {
            String substring = entry.getKey();
            boolean b = false;
            if (substring.endsWith("_min") && substring.length() > 4) {
                b = true;
                substring = substring.substring(0, substring.length() - 4);
            }
            final lIIIIlIIIIIlllIllIII llllIIIIlIIIlIlllIll = illlIIIIlIIIlIlIlIIl.llllIIIIlIIIlIlllIll(substring);
            if (llllIIIIlIIIlIlllIll == null) {
                return false;
            }
            final String s = (llIllIIIIIllIlIIIIlI instanceof IlIIIlIlIIIllIlIlIIl) ? llIllIIIIIllIlIIIIlI.s_() : llIllIIIIIllIlIIIIlI.lllIIIIlIlIllIIlIIIl().toString();
            if (!illlIIIIlIIIlIlIlIIl.llllIIIIlIIIlIlllIll(s, llllIIIIlIIIlIlllIll)) {
                return false;
            }
            final int ilIlIlIlIlllllllllIl = illlIIIIlIIIlIlIlIIl.IlIlIlIlIlllllllllIl(s, llllIIIIlIIIlIlllIll).IlIlIlIlIlllllllllIl();
            if (ilIlIlIlIlllllllllIl < (int)entry.getValue() && b) {
                return false;
            }
            if (ilIlIlIlIlllllllllIl > (int)entry.getValue() && !b) {
                return false;
            }
        }
        return true;
    }
}
