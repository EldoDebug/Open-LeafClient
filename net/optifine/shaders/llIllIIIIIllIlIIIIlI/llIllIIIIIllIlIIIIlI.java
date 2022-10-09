package net.optifine.shaders.llIllIIIIIllIlIIIIlI;

import java.util.*;
import net.optifine.expr.*;
import net.optifine.shaders.*;

public class llIllIIIIIllIlIIIIlI implements llllIIllllIlIlIIIIll
{
    private Map llllIIIIlIIIlIlllIll;
    
    public llIllIIIIIllIlIIIIlI(final Map map) {
        this.llllIIIIlIIIlIlllIll = new HashMap();
        this.llllIIIIlIIIlIlllIll();
        for (final String s : map.keySet()) {
            this.llllIIIIlIIIlIlllIll(s, (llIIlIIIlIIIllIlIIIl)map.get(s));
        }
    }
    
    private void llllIIIIlIIIlIlllIll() {
        final IlIlIIIllIllIIIIIllI[] values = IlIlIIIllIllIIIIIllI.values();
        for (int i = 0; i < values.length; ++i) {
            this.llllIIIIlIIIlIlllIll(this.llllIIIIlIIIlIlllIll, values[i]);
        }
        final IlIIIlIlIIIllIlIlIIl[] values2 = IlIIIlIlIIIllIlIlIIl.values();
        for (int j = 0; j < values2.length; ++j) {
            final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl = values2[j];
            this.llllIIIIlIIIlIlllIll.put(ilIIIlIlIIIllIlIlIIl.IlIlIlIlIlllllllllIl(), ilIIIlIlIIIllIlIlIIl);
        }
        for (final net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl : net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl.llllIIllllIlIlIIIIll.values()) {
            this.llllIIIIlIIIlIlllIll("BIOME_" + llIIlIIIlIIIllIlIIIl.lIlIIlllIIlIIlIlllIl.trim().toUpperCase().replace(' ', '_'), new llllIIIIlIIIlIlllIll((float)llIIlIIIlIIIllIlIIIl.lIIIIIlIlIIIlIIIIlIl));
        }
    }
    
    private void llllIIIIlIIIlIlllIll(final Map map, final IlIlIIIllIllIIIIIllI ilIlIIIllIllIIIIIllI) {
        final String[] llIllIIIIIllIlIIIIlI = ilIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI();
        if (llIllIIIIIllIlIIIIlI == null) {
            map.put(ilIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll(), new IllIIlllIIIIlllIIlIl(ilIlIIIllIllIIIIIllI));
        }
        else {
            for (int i = 0; i < llIllIIIIIllIlIIIIlI.length; ++i) {
                final String s = llIllIIIIIllIlIIIIlI[i];
                final String[] ilIIIlIlIIIllIlIlIIl = ilIlIIIllIllIIIIIllI.IlIIIlIlIIIllIlIlIIl();
                if (ilIIIlIlIIIllIlIlIIl == null) {
                    map.put(String.valueOf(ilIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll()) + "." + s, new IllIIlllIIIIlllIIlIl(ilIlIIIllIllIIIIIllI, i));
                }
                else {
                    for (int j = 0; j < ilIIIlIlIIIllIlIlIIl.length; ++j) {
                        map.put(String.valueOf(ilIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll()) + "." + s + "." + ilIIIlIlIIIllIlIlIIl[j], new IllIIlllIIIIlllIIlIl(ilIlIIIllIllIIIIIllI, i, j));
                    }
                }
            }
        }
    }
    
    public boolean llllIIIIlIIIlIlllIll(final String s, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl) {
        if (this.llllIIIIlIIIlIlllIll.containsKey(s)) {
            IIllIIllIIIlIlIIIIlI.IlIlIlIlIlllllllllIl("Expression already defined: " + s);
            return false;
        }
        this.llllIIIIlIIIlIlllIll.put(s, llIIlIIIlIIIllIlIIIl);
        return true;
    }
    
    @Override
    public llIIlIIIlIIIllIlIIIl llIllIIIIIllIlIIIIlI(final String s) {
        return this.llllIIIIlIIIlIlllIll.get(s);
    }
    
    public boolean llllIIIIlIIIlIlllIll(final String s) {
        return this.llllIIIIlIIIlIlllIll.containsKey(s);
    }
}
