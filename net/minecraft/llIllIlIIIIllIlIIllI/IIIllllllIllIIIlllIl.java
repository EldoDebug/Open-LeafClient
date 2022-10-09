package net.minecraft.llIllIlIIIIllIlIIllI;

import net.minecraft.IlIIIlIlIIIllIlIlIIl.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.IllIIlllIIIIlllIIlIl.*;
import net.minecraft.lIIIlllIIIllIIIllIII.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.IIIlIIIlIlIIlllIIlll.*;

public class IIIllllllIllIIIlllIl extends IlIIIlIlIIIllIlIlIIl
{
    public static final String[] llllIIIlIlllIlIIIIIl;
    
    static {
        llllIIIlIlllIlIIIIIl = new String[] { "pulling_0", "pulling_1", "pulling_2" };
    }
    
    public IIIllllllIllIIIlllIl() {
        this.IlIIIlIlIIIllIlIlIIl = 1;
        this.IlIIIlIlIIIllIlIlIIl(384);
        this.llllIIIIlIIIlIlllIll(net.minecraft.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl);
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl, final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final int n) {
        final boolean b = llllIIIIlIIIlIlllIll.K.IlIIIlIlIIIllIlIlIIl || net.minecraft.IllIIlllIIIIlllIIlIl.lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll(net.minecraft.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll.IIlIIIIlllIlllllIlII.IIlllIlIIllIlIlIlIIl, lllIIIIlIlIllIIlIIIl) > 0;
        if (b || llllIIIIlIIIlIlllIll.lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl(IIllIIllIIIlIlIIIIlI.llllIIIlIlllIlIIIIIl)) {
            final float n2 = (this.IlIIIlIlIIIllIlIlIIl(lllIIIIlIlIllIIlIIIl) - n) / 20.0f;
            float n3 = (n2 * n2 + n2 * 2.0f) / 3.0f;
            if (n3 < 0.1) {
                return;
            }
            if (n3 > 1.0f) {
                n3 = 1.0f;
            }
            final net.minecraft.llllIIIlIlllIlIIIIIl.lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll2 = new net.minecraft.llllIIIlIlllIlIIIIIl.lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, llllIIIIlIIIlIlllIll, n3 * 2.0f);
            if (n3 == 1.0f) {
                llllIIIIlIIIlIlllIll2.llllIIIIlIIIlIlllIll(true);
            }
            final int llllIIIIlIIIlIlllIll3 = net.minecraft.IllIIlllIIIIlllIIlIl.lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll(net.minecraft.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll.IIIlIIIlIlIIlllIIlll.IIlllIlIIllIlIlIlIIl, lllIIIIlIlIllIIlIIIl);
            if (llllIIIIlIIIlIlllIll3 > 0) {
                llllIIIIlIIIlIlllIll2.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll2.llllIIIlIlllIlIIIIIl() + llllIIIIlIIIlIlllIll3 * 0.5 + 0.5);
            }
            final int llllIIIIlIIIlIlllIll4 = net.minecraft.IllIIlllIIIIlllIIlIl.lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll(net.minecraft.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll.IlIlIIIlIIlIlIIlllIl.IIlllIlIIllIlIlIlIIl, lllIIIIlIlIllIIlIIIl);
            if (llllIIIIlIIIlIlllIll4 > 0) {
                llllIIIIlIIIlIlllIll2.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll4);
            }
            if (net.minecraft.IllIIlllIIIIlllIIlIl.lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll(net.minecraft.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll.IlllllllIIIlIIIlIlII.IIlllIlIIllIlIlIlIIl, lllIIIIlIlIllIIlIIIl) > 0) {
                llllIIIIlIIIlIlllIll2.IlIlIIIllIllIIIIIllI(100);
            }
            lllIIIIlIlIllIIlIIIl.llllIIIIlIIIlIlllIll(1, llllIIIIlIIIlIlllIll);
            illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll((llIllIIIIIllIlIIIIlI)llllIIIIlIIIlIlllIll, "random.bow", 1.0f, 1.0f / (IIIllllllIllIIIlllIl.llIllIIIIIllIlIIIIlI.nextFloat() * 0.4f + 1.2f) + n3 * 0.5f);
            if (b) {
                llllIIIIlIIIlIlllIll2.llllIIIIlIIIlIlllIll = 2;
            }
            else {
                llllIIIIlIIIlIlllIll.lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll(IIllIIllIIIlIlIIIIlI.llllIIIlIlllIlIIIIIl);
            }
            llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(IIIIlllIIIIIIlIIIlll.IlIIllIIllIIllIIlIIl[net.minecraft.llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(this)]);
            if (!illlllllIIIlIIIlIlII.IlIlIllllllllIIIIlII) {
                illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll2);
            }
        }
    }
    
    @Override
    public lllIIIIlIlIllIIlIIIl IlIlIlIlIlllllllllIl(final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl, final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        return lllIIIIlIlIllIIlIIIl;
    }
    
    @Override
    public int IlIIIlIlIIIllIlIlIIl(final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl) {
        return 72000;
    }
    
    @Override
    public net.minecraft.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll llIllIIIIIllIlIIIIlI(final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl) {
        return net.minecraft.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI;
    }
    
    @Override
    public lllIIIIlIlIllIIlIIIl llllIIIIlIIIlIlllIll(final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl, final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        if (llllIIIIlIIIlIlllIll.K.IlIIIlIlIIIllIlIlIIl || llllIIIIlIIIlIlllIll.lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl(IIllIIllIIIlIlIIIIlI.llllIIIlIlllIlIIIIIl)) {
            llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(lllIIIIlIlIllIIlIIIl, this.IlIIIlIlIIIllIlIlIIl(lllIIIIlIlIllIIlIIIl));
        }
        return lllIIIIlIlIllIIlIIIl;
    }
    
    @Override
    public int IlIlIIIllIIllIlllllI() {
        return 1;
    }
}
