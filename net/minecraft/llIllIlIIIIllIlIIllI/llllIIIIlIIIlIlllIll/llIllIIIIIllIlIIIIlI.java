package net.minecraft.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll;

import com.google.common.collect.*;
import net.minecraft.lIIIlllIIIllIIIllIII.*;
import net.minecraft.llllIIIIlIIIlIlllIll.*;
import net.minecraft.llIllIlIIIIllIlIIllI.*;
import java.util.*;

public class llIllIIIIIllIlIIIIlI
{
    private static final llIllIIIIIllIlIIIIlI llllIIIIlIIIlIlllIll;
    private Map IlIlIlIlIlllllllllIl;
    private Map llIllIIIIIllIlIIIIlI;
    
    static {
        llllIIIIlIIIlIlllIll = new llIllIIIIIllIlIIIIlI();
    }
    
    public static llIllIIIIIllIlIIIIlI llllIIIIlIIIlIlllIll() {
        return llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll;
    }
    
    private llIllIIIIIllIlIIIIlI() {
        this.IlIlIlIlIlllllllllIl = Maps.newHashMap();
        this.llIllIIIIIllIlIIIIlI = Maps.newHashMap();
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIllIlIlIIIlIlIlIII, new lllIIIIlIlIllIIlIIIl(IIllIIllIIIlIlIIIIlI.llIIlIIIlIIIllIlIIIl), 0.7f);
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIllllIlIlIIIIll, new lllIIIIlIlIllIIlIIIl(IIllIIllIIIlIlIIIIlI.llIllIlIIIIllIlIIllI), 1.0f);
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lIllIIIIIlllIIlIIllI, new lllIIIIlIlIllIIlIIIl(IIllIIllIIIlIlIIIIlI.lIIIlllIIIllIIIllIII), 1.0f);
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIlIIIllIIllIlllllI, new lllIIIIlIlIllIIlIIIl(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlllllllIIIlIIIlIlII), 0.1f);
        this.llllIIIIlIIIlIlllIll(IIllIIllIIIlIlIIIIlI.IlIIlllllIIllIIlllll, new lllIIIIlIlIllIIlIIIl(IIllIIllIIIlIlIIIIlI.lllllIIlIlIIIlIlIIIl), 0.35f);
        this.llllIIIIlIIIlIlllIll(IIllIIllIIIlIlIIIIlI.m, new lllIIIIlIlIllIIlIIIl(IIllIIllIIIlIlIIIIlI.n), 0.35f);
        this.llllIIIIlIIIlIlllIll(IIllIIllIIIlIlIIIIlI.o, new lllIIIIlIlIllIIlIIIl(IIllIIllIIIlIlIIIIlI.p), 0.35f);
        this.llllIIIIlIIIlIlllIll(IIllIIllIIIlIlIIIIlI.s, new lllIIIIlIlIllIIlIIIl(IIllIIllIIIlIlIIIIlI.t), 0.35f);
        this.llllIIIIlIIIlIlllIll(IIllIIllIIIlIlIIIIlI.q, new lllIIIIlIlIllIIlIIIl(IIllIIllIIIlIlIIIIlI.r), 0.35f);
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI, new lllIIIIlIlIllIIlIIIl(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl), 0.1f);
        this.llllIIIIlIIIlIlllIll(new lllIIIIlIlIllIIlIIIl(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.j, 1, cv.IIllllIIIlIIIIIIllIl), new lllIIIIlIlIllIIlIIIl(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.j, 1, cv.lllIllIIIllllllIllll), 0.1f);
        this.llllIIIIlIIIlIlllIll(IIllIIllIIIlIlIIIIlI.llIlIIIIllIlIIlIlIII, new lllIIIIlIlIllIIlIIIl(IIllIIllIIIlIlIIIIlI.lllIlIIIIIlIlllllIlI), 0.3f);
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIlIlllIlIlllIlIllll, new lllIIIIlIlIllIIlIIIl(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.aD), 0.35f);
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllllIIIIIIIlllIIll, new lllIIIIlIlIllIIlIIIl(IIllIIllIIIlIlIIIIlI.a, 1, net.minecraft.llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl.IIIIlllIIIIIIlIIIlll.llIllIIIIIllIlIIIIlI()), 0.2f);
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lllIIIIlllllIlIIllIl, new lllIIIIlIlIllIIlIIIl(IIllIIllIIIlIlIIIIlI.lIIIIlIIIIIlllIllIII, 1, 1), 0.15f);
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIlIIIIIIlllIlIllIl, new lllIIIIlIlIllIIlIIIl(IIllIIllIIIlIlIIIIlI.lIIIIlIIIIIlllIllIII, 1, 1), 0.15f);
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.T, new lllIIIIlIlIllIIlIIIl(IIllIIllIIIlIlIIIIlI.S), 1.0f);
        this.llllIIIIlIIIlIlllIll(IIllIIllIIIlIlIIIIlI.W, new lllIIIIlIlIllIIlIIIl(IIllIIllIIIlIlIIIIlI.X), 0.35f);
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIlIllllIIlIIlIlI, new lllIIIIlIlIllIIlIIIl(IIllIIllIIIlIlIIIIlI.aj), 0.1f);
        this.llllIIIIlIIIlIlllIll(new lllIIIIlIlIllIIlIIIl(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIlIIIlIIlIlIIlllIl, 1, 1), new lllIIIIlIlIllIIlIIIl(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIlIIIlIIlIlIIlllIl, 1, 0), 0.15f);
        IlIIllIIllIIllIIlIIl[] values;
        for (int length = (values = IlIIllIIllIIllIIlIIl.values()).length, i = 0; i < length; ++i) {
            final IlIIllIIllIIllIIlIIl ilIIllIIllIIllIIlIIl = values[i];
            if (ilIIllIIllIIllIIlIIl.llllIIIlIlllIlIIIIIl()) {
                this.llllIIIIlIIIlIlllIll(new lllIIIIlIlIllIIlIIIl(IIllIIllIIIlIlIIIIlI.IlIIlllIIlIlllllIIlI, 1, ilIIllIIllIIllIIlIIl.llllIIIIlIIIlIlllIll()), new lllIIIIlIlIllIIlIIIl(IIllIIllIIIlIlIIIIlI.llllIlIllllIIlIIlIlI, 1, ilIIllIIllIIllIIlIIl.llllIIIIlIIIlIlllIll()), 0.35f);
            }
        }
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIlllIIlIllIllIlIIll, new lllIIIIlIlIllIIlIIIl(IIllIIllIIIlIlIIIIlI.lIIIIlIIIIIlllIllIII), 0.1f);
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIIIIIIllllIlIIIIIII, new lllIIIIlIlIllIIlIIIl(IIllIIllIIIlIlIIIIlI.IIIIIIIllllIlIIIIIII), 0.7f);
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIlIIIIlllIlllllIlII, new lllIIIIlIlIllIIlIIIl(IIllIIllIIIlIlIIIIlI.a, 1, net.minecraft.llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl.lIlIlIIIllIIllIIIllI.llIllIIIIIllIlIIIIlI()), 0.2f);
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.as, new lllIIIIlIlIllIIlIIIl(IIllIIllIIIlIlIIIIlI.ak), 0.2f);
    }
    
    public void llllIIIIlIIIlIlllIll(final net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl, final float n) {
        this.llllIIIIlIIIlIlllIll(IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll), lllIIIIlIlIllIIlIIIl, n);
    }
    
    public void llllIIIIlIIIlIlllIll(final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl, final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl, final float n) {
        this.llllIIIIlIIIlIlllIll(new lllIIIIlIlIllIIlIIIl(ilIIIlIlIIIllIlIlIIl, 1, 32767), lllIIIIlIlIllIIlIIIl, n);
    }
    
    public void llllIIIIlIIIlIlllIll(final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl, final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl2, final float n) {
        this.IlIlIlIlIlllllllllIl.put(lllIIIIlIlIllIIlIIIl, lllIIIIlIlIllIIlIIIl2);
        this.llIllIIIIIllIlIIIIlI.put(lllIIIIlIlIllIIlIIIl2, n);
    }
    
    public lllIIIIlIlIllIIlIIIl llllIIIIlIIIlIlllIll(final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl) {
        for (final Map.Entry<lllIIIIlIlIllIIlIIIl, V> entry : this.IlIlIlIlIlllllllllIl.entrySet()) {
            if (this.llllIIIIlIIIlIlllIll(lllIIIIlIlIllIIlIIIl, entry.getKey())) {
                return (lllIIIIlIlIllIIlIIIl)entry.getValue();
            }
        }
        return null;
    }
    
    private boolean llllIIIIlIIIlIlllIll(final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl, final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl2) {
        return lllIIIIlIlIllIIlIIIl2.llllIIIIlIIIlIlllIll() == lllIIIIlIlIllIIlIIIl.llllIIIIlIIIlIlllIll() && (lllIIIIlIlIllIIlIIIl2.lIIIIlIIIIIlllIllIII() == 32767 || lllIIIIlIlIllIIlIIIl2.lIIIIlIIIIIlllIllIII() == lllIIIIlIlIllIIlIIIl.lIIIIlIIIIIlllIllIII());
    }
    
    public Map IlIlIlIlIlllllllllIl() {
        return this.IlIlIlIlIlllllllllIl;
    }
    
    public float IlIlIlIlIlllllllllIl(final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl) {
        for (final Map.Entry<lllIIIIlIlIllIIlIIIl, V> entry : this.llIllIIIIIllIlIIIIlI.entrySet()) {
            if (this.llllIIIIlIIIlIlllIll(lllIIIIlIlIllIIlIIIl, entry.getKey())) {
                return (float)entry.getValue();
            }
        }
        return 0.0f;
    }
}
