package net.optifine;

import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.optifine.llllIIIIlIIIlIlllIll.*;
import java.util.*;

public class IllIIlllllIIllIIllIl
{
    public String llllIIIIlIIIlIlllIll;
    public String IlIlIlIlIlllllllllIl;
    public lIllllIllIllIIllllll[] llIllIIIIIllIlIIIIlI;
    public lIllIIIIIlllIIlIIllI[] IlIIIlIlIIIllIlIlIIl;
    
    public IllIIlllllIIllIIllIl(final String s, final lIllllIllIllIIllllll[] llIllIIIIIllIlIIIIlI) {
        this.llllIIIIlIIIlIlllIll = null;
        this.IlIlIlIlIlllllllllIl = null;
        this.llIllIIIIIllIlIIIIlI = null;
        this.IlIIIlIlIIIllIlIlIIl = null;
        final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll = new llllIIIIlIIIlIlllIll("RandomEntities");
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(s);
        this.IlIlIlIlIlllllllllIl = llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(s);
        this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
    }
    
    public IllIIlllllIIllIIllIl(final Properties properties, final String s, final lIllllIllIllIIllllll lIllllIllIllIIllllll) {
        this.llllIIIIlIIIlIlllIll = null;
        this.IlIlIlIlIlllllllllIl = null;
        this.llIllIIIIIllIlIIIIlI = null;
        this.IlIIIlIlIIIllIlIlIIl = null;
        final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll = new llllIIIIlIIIlIlllIll("RandomEntities");
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(s);
        this.IlIlIlIlIlllllllllIl = llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(s);
        this.IlIIIlIlIIIllIlIlIIl = this.llllIIIIlIIIlIlllIll(properties, s, lIllllIllIllIIllllll, llllIIIIlIIIlIlllIll);
    }
    
    public lIllllIllIllIIllllll llllIIIIlIIIlIlllIll(final lIllllIllIllIIllllll lIllllIllIllIIllllll, final IlIllllIIlIIlIlIlIll ilIllllIIlIIlIlIlIll) {
        if (this.IlIIIlIlIIIllIlIlIIl != null) {
            for (int i = 0; i < this.IlIIIlIlIIIllIlIlIIl.length; ++i) {
                final lIllIIIIIlllIIlIIllI lIllIIIIIlllIIlIIllI = this.IlIIIlIlIIIllIlIlIIl[i];
                if (lIllIIIIIlllIIlIIllI.llllIIIIlIIIlIlllIll(ilIllllIIlIIlIlIlIll)) {
                    return lIllIIIIIlllIIlIIllI.llllIIIIlIIIlIlllIll(lIllllIllIllIIllllll, ilIllllIIlIIlIlIlIll.llllIIIIlIIIlIlllIll());
                }
            }
        }
        if (this.llIllIIIIIllIlIIIIlI != null) {
            return this.llIllIIIIIllIlIIIIlI[ilIllllIIlIIlIlIlIll.llllIIIIlIIIlIlllIll() % this.llIllIIIIIllIlIIIIlI.length];
        }
        return lIllllIllIllIIllllll;
    }
    
    private lIllIIIIIlllIIlIIllI[] llllIIIIlIIIlIlllIll(final Properties properties, final String s, final lIllllIllIllIIllllll lIllllIllIllIIllllll, final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        final ArrayList<lIllIIIIIlllIIlIIllI> list = new ArrayList<lIllIIIIIlllIIlIIllI>();
        for (int size = properties.size(), i = 0; i < size; ++i) {
            final int n = i + 1;
            String s2 = properties.getProperty("textures." + n);
            if (s2 == null) {
                s2 = properties.getProperty("skins." + n);
            }
            if (s2 != null) {
                final lIllIIIIIlllIIlIIllI lIllIIIIIlllIIlIIllI = new lIllIIIIIlllIIlIIllI(properties, s, lIllllIllIllIIllllll, n, s2, llllIIIIlIIIlIlllIll);
                if (lIllIIIIIlllIIlIIllI.llllIIIIlIIIlIlllIll(s)) {
                    list.add(lIllIIIIIlllIIlIIllI);
                }
            }
        }
        return list.toArray(new lIllIIIIIlllIIlIIllI[list.size()]);
    }
    
    public boolean llllIIIIlIIIlIlllIll(final String s) {
        if (this.llIllIIIIIllIlIIIIlI == null && this.IlIIIlIlIIIllIlIlIIl == null) {
            net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI("No skins specified: " + s);
            return false;
        }
        if (this.IlIIIlIlIIIllIlIlIIl != null) {
            for (int i = 0; i < this.IlIIIlIlIIIllIlIlIIl.length; ++i) {
                if (!this.IlIIIlIlIIIllIlIlIIl[i].llllIIIIlIIIlIlllIll(s)) {
                    return false;
                }
            }
        }
        if (this.llIllIIIIIllIlIIIIlI != null) {
            for (int j = 0; j < this.llIllIIIIIllIlIIIIlI.length; ++j) {
                final lIllllIllIllIIllllll lIllllIllIllIIllllll = this.llIllIIIIIllIlIIIIlI[j];
                if (!net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI(lIllllIllIllIIllllll)) {
                    net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI("Texture not found: " + lIllllIllIllIIllllll.IlIlIlIlIlllllllllIl());
                    return false;
                }
            }
        }
        return true;
    }
    
    public boolean llllIIIIlIIIlIlllIll() {
        return this.IlIIIlIlIIIllIlIlIIl == null && this.llIllIIIIIllIlIIIIlI == null;
    }
}
