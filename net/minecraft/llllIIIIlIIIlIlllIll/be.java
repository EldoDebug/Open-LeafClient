package net.minecraft.llllIIIIlIIIlIlllIll;

import net.minecraft.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.*;
import net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import java.util.*;
import net.minecraft.llIllIlIIIIllIlIIllI.*;
import net.minecraft.lIIIlllIIIllIIIllIII.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;

public class be extends bb
{
    public static final IlIlIlIlIlllllllllIl IIIIIIIIIlllIllIlIlI;
    public static final IllIIlllIIIIlllIIlIl IIllllIIIlIIIIIIllIl;
    
    static {
        IIIIIIIIIlllIllIlIlI = net.minecraft.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll("locked");
        IIllllIIIlIIIIIIllIl = net.minecraft.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll("delay", 1, 4);
    }
    
    protected be(final boolean b) {
        super(b);
        this.lIIIIlIIIIIlllIllIII(this.IIIIIllIIIIlIIIIllIl.IlIlIlIlIlllllllllIl().llllIIIIlIIIlIlllIll(be.IlllIIIIlIIIlIlIlIIl, net.minecraft.IlllllllIIIlIIIlIlII.lllIllIIIllllllIllll.llIllIIIIIllIlIIIIlI).llllIIIIlIIIlIlllIll(be.IIllllIIIlIIIIIIllIl, 1).llllIIIIlIIIlIlllIll(be.IIIIIIIIIlllIllIlIlI, false));
    }
    
    @Override
    public String lllllIlIIIlIlIIlllII() {
        return lIIlllIlllllIIlllIll.llllIIIIlIIIlIlllIll("item.diode.name");
    }
    
    @Override
    public llIIlIIIlIIIllIlIIIl llllIIIIlIIIlIlllIll(final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final lIlIlIIIllIIllIIIllI lIlIlIIIllIIllIIIllI, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        return llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(be.IIIIIIIIIlllIllIlIlI, this.IlIlIlIlIlllllllllIl(lIlIlIIIllIIllIIIllI, ilIlIlIlIlllllllllIl, llIIlIIIlIIIllIlIIIl));
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final lllIllIIIllllllIllll lllIllIIIllllllIllll, final float n, final float n2, final float n3) {
        if (!llllIIIIlIIIlIlllIll.K.IlIlIIIllIllIIIIIllI) {
            return false;
        }
        illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl, llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl(be.IIllllIIIlIIIIIIllIl), 3);
        return true;
    }
    
    @Override
    protected int lIIIlllIIIllIIIllIII(final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl) {
        return (int)llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(be.IIllllIIIlIIIIIIllIl) * 2;
    }
    
    @Override
    protected llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl(final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl) {
        return net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.g.lllIllIIIllllllIllll().llllIIIIlIIIlIlllIll(be.IlllIIIIlIIIlIlIlIIl, llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(be.IlllIIIIlIIIlIlIlIIl)).llllIIIIlIIIlIlllIll(be.IIllllIIIlIIIIIIllIl, llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(be.IIllllIIIlIIIIIIllIl)).llllIIIIlIIIlIlllIll(be.IIIIIIIIIlllIllIlIlI, llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(be.IIIIIIIIIlllIllIlIlI));
    }
    
    @Override
    protected llIIlIIIlIIIllIlIIIl llIllIlIIIIllIlIIllI(final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl) {
        return net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.f.lllIllIIIllllllIllll().llllIIIIlIIIlIlllIll(be.IlllIIIIlIIIlIlIlIIl, llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(be.IlllIIIIlIIIlIlIlIIl)).llllIIIIlIIIlIlllIll(be.IIllllIIIlIIIIIIllIl, llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(be.IIllllIIIlIIIIIIllIl)).llllIIIIlIIIlIlllIll(be.IIIIIIIIIlllIllIlIlI, llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(be.IIIIIIIIIlllIllIlIlI));
    }
    
    @Override
    public IlIIIlIlIIIllIlIlIIl llllIIIIlIIIlIlllIll(final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final Random random, final int n) {
        return net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.f;
    }
    
    @Override
    public IlIIIlIlIIIllIlIlIIl IlIlIIIllIllIIIIIllI(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        return net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.f;
    }
    
    @Override
    public boolean IlIlIlIlIlllllllllIl(final lIlIlIIIllIIllIIIllI lIlIlIIIllIIllIIIllI, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl) {
        return this.llIllIIIIIllIlIIIIlI(lIlIlIIIllIIllIIIllI, ilIlIlIlIlllllllllIl, llIIlIIIlIIIllIlIIIl) > 0;
    }
    
    @Override
    protected boolean llIllIIIIIllIlIIIIlI(final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        return bb.IlIIIlIlIIIllIlIlIIl(llllIIIIlIIIlIlllIll);
    }
    
    @Override
    public void llIllIIIIIllIlIIIIlI(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final Random random) {
        if (this.lllIllIIIllllllIllll) {
            final lllIllIIIllllllIllll lllIllIIIllllllIllll = (lllIllIIIllllllIllll)llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(be.IlllIIIIlIIIlIlIlIIl);
            final double n = ilIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII() + 0.5f + (random.nextFloat() - 0.5f) * 0.2;
            final double n2 = ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII() + 0.4f + (random.nextFloat() - 0.5f) * 0.2;
            final double n3 = ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl() + 0.5f + (random.nextFloat() - 0.5f) * 0.2;
            float n4 = -5.0f;
            if (random.nextBoolean()) {
                n4 = (float)((int)llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(be.IIllllIIIlIIIIIIllIl) * 2 - 1);
            }
            final float n5 = n4 / 16.0f;
            illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(IlIllllIIlIIlIlIlIll.llIIlllIIlllIIllIllI, n + n5 * lllIllIIIllllllIllll.lIIIIlIIIIIlllIllIII(), n2, n3 + n5 * lllIllIIIllllllIllll.llIIlIIIlIIIllIlIIIl(), 0.0, 0.0, 0.0, new int[0]);
        }
    }
    
    @Override
    public void IlIIIlIlIIIllIlIlIIl(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl) {
        super.IlIIIlIlIIIllIlIlIIl(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl, llIIlIIIlIIIllIlIIIl);
        this.lIIIIlIIIIIlllIllIII(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl, llIIlIIIlIIIllIlIIIl);
    }
    
    @Override
    public llIIlIIIlIIIllIlIIIl llIllIIIIIllIlIIIIlI(final int n) {
        return this.lllIllIIIllllllIllll().llllIIIIlIIIlIlllIll(be.IlllIIIIlIIIlIlIlIIl, net.minecraft.IlllllllIIIlIIIlIlII.lllIllIIIllllllIllll.IlIlIlIlIlllllllllIl(n)).llllIIIIlIIIlIlllIll(be.IIIIIIIIIlllIllIlIlI, false).llllIIIIlIIIlIlllIll(be.IIllllIIIlIIIIIIllIl, 1 + (n >> 2));
    }
    
    @Override
    public int llIllIIIIIllIlIIIIlI(final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl) {
        return 0x0 | ((lllIllIIIllllllIllll)llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(be.IlllIIIIlIIIlIlIlIIl)).llIllIIIIIllIlIIIIlI() | (int)llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(be.IIllllIIIlIIIIIIllIl) - 1 << 2;
    }
    
    @Override
    protected net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl IIllllIIIlIIIIIIllIl() {
        return new net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(this, new net.minecraft.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll[] { be.IlllIIIIlIIIlIlIlIIl, be.IIllllIIIlIIIIIIllIl, be.IIIIIIIIIlllIllIlIlI });
    }
}
