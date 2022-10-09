package net.minecraft.llllIIIlIlllIlIIIIIl.lIIIIlIIIIIlllIllIII;

import net.minecraft.llllIIIIlIIIlIlllIll.*;
import net.minecraft.lIIIlllIIIllIIIllIII.*;
import net.minecraft.llIllIlIIIIllIlIIllI.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.IllIIlllIIIIlllIIlIl.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.lIlIlIIIllIIllIIIllI.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import java.util.*;

public class IlIIIlIlIIIllIlIlIIl extends llIllIIIIIllIlIIIIlI
{
    private static final List IlIIIlIlIIIllIlIlIIl;
    private static final List IlIlIIIllIllIIIIIllI;
    private static final List IllIIlllIIIIlllIIlIl;
    private int llllIIIlIlllIlIIIIIl;
    private int lIIIIlIIIIIlllIllIII;
    private int lIIIlllIIIllIIIllIII;
    private llllIIIIlIIIlIlllIll llIIlIIIlIIIllIlIIIl;
    private boolean llIllIlIIIIllIlIIllI;
    public int llllIIIIlIIIlIlllIll;
    public net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll IlIlIlIlIlllllllllIl;
    private int lIlIlIIIllIIllIIIllI;
    private int IlIlIIIllIIllIlllllI;
    private int IIIIlllIIIIIIlIIIlll;
    private int llllIIllllIlIlIIIIll;
    private int IlIllIlIlIIIlIlIlIII;
    private float IIlllIIlIllIllIlIIll;
    public llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI;
    private int IIIIIIIllllIlIIIIIII;
    private double IIlllIIIllIllIIlIlIl;
    private double llIlllIlllllIIllIIII;
    private double lllllIlIlIlllIlllIlI;
    private double IlIllllIIlIllIlIlIll;
    private double lllIlIIIIIlIlllllIlI;
    private double llIlIIIIllIlIIlIlIII;
    private double IIIIIlllIlIIIIIIIllI;
    private double llllllIIIIIIIlllIIll;
    
    static {
        IlIIIlIlIIIllIlIlIIl = Arrays.asList(new l(new lllIIIIlIlIllIIlIIIl(IIllIIllIIIlIlIIIIlI.IllIllIlllIllllIIllI), 10).llllIIIIlIIIlIlllIll(0.9f), new l(new lllIIIIlIlIllIIlIIIl(IIllIIllIIIlIlIIIIlI.lllllIlIlIlllIlllIlI), 10), new l(new lllIIIIlIlIllIIlIIIl(IIllIIllIIIlIlIIIIlI.b), 10), new l(new lllIIIIlIlIllIIlIIIl(IIllIIllIIIlIlIIIIlI.D), 10), new l(new lllIIIIlIlIllIIlIIIl(IIllIIllIIIlIlIIIIlI.IIlllIIIlIlllIIlllII), 5), new l(new lllIIIIlIlIllIIlIIIl(IIllIIllIIIlIlIIIIlI.lIIlllIlllllIIlllIll), 2).llllIIIIlIIIlIlllIll(0.9f), new l(new lllIIIIlIlIllIIlIIIl(IIllIIllIIIlIlIIIIlI.IlIlIllllllllIIIIlII), 10), new l(new lllIIIIlIlIllIIlIIIl(IIllIIllIIIlIlIIIIlI.IIIlIIlIIIIlllIlllII), 5), new l(new lllIIIIlIlIllIIlIIIl(IIllIIllIIIlIlIIIIlI.a, 10, net.minecraft.llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl.IlIllIlIlIIIlIlIlIII.llIllIIIIIllIlIIIIlI()), 1), new l(new lllIIIIlIlIllIIlIIIl(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.V), 10), new l(new lllIIIIlIlIllIIlIIIl(IIllIIllIIIlIlIIIIlI.x), 10));
        IlIlIIIllIllIIIIIllI = Arrays.asList(new l(new lllIIIIlIlIllIIlIIIl(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.B), 1), new l(new lllIIIIlIlIllIIlIIIl(IIllIIllIIIlIlIIIIlI.as), 1), new l(new lllIIIIlIlIllIIlIIIl(IIllIIllIIIlIlIIIIlI.IIllIIIlIIIIlIIlIIII), 1), new l(new lllIIIIlIlIllIIlIIIl(IIllIIllIIIlIlIIIIlI.IllIIlllIIIIlllIIlIl), 1).llllIIIIlIIIlIlllIll(0.25f).llllIIIIlIIIlIlllIll(), new l(new lllIIIIlIlIllIIlIIIl(IIllIIllIIIlIlIIIIlI.lIIlllIlllllIIlllIll), 1).llllIIIIlIIIlIlllIll(0.25f).llllIIIIlIIIlIlllIll(), new l(new lllIIIIlIlIllIIlIIIl(IIllIIllIIIlIlIIIIlI.IIlIlllIlIlllIlIllll), 1).llllIIIIlIIIlIlllIll());
        IllIIlllIIIIlllIIlIl = Arrays.asList(new l(new lllIIIIlIlIllIIlIIIl(IIllIIllIIIlIlIIIIlI.IlIIlllIIlIlllllIIlI, 1, IlIIllIIllIIllIIlIIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll()), 60), new l(new lllIIIIlIlIllIIlIIIl(IIllIIllIIIlIlIIIIlI.IlIIlllIIlIlllllIIlI, 1, IlIIllIIllIIllIIlIIl.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll()), 25), new l(new lllIIIIlIlIllIIlIIIl(IIllIIllIIIlIlIIIIlI.IlIIlllIIlIlllllIIlI, 1, IlIIllIIllIIllIIlIIl.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll()), 2), new l(new lllIIIIlIlIllIIlIIIl(IIllIIllIIIlIlIIIIlI.IlIIlllIIlIlllllIIlI, 1, IlIIllIIllIIllIIlIIl.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll()), 13));
    }
    
    public static List llllIIIlIlllIlIIIIIl() {
        return net.minecraft.llllIIIlIlllIlIIIIIl.lIIIIlIIIIIlllIllIII.IlIIIlIlIIIllIlIlIIl.IllIIlllIIIIlllIIlIl;
    }
    
    public IlIIIlIlIIIllIlIlIIl(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII) {
        super(illlllllIIIlIIIlIlII);
        this.llllIIIlIlllIlIIIIIl = -1;
        this.lIIIIlIIIIIlllIllIII = -1;
        this.lIIIlllIIIllIIIllIII = -1;
        this.llllIIIIlIIIlIlllIll(0.25f, 0.25f);
        this.IIllIIIlIIlIlIlIIIII = true;
    }
    
    public IlIIIlIlIIIllIlIlIIl(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final double n, final double n2, final double n3, final net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll ilIlIlIlIlllllllllIl) {
        this(illlllllIIIlIIIlIlII);
        this.IlIlIlIlIlllllllllIl(n, n2, n3);
        this.IIllIIIlIIlIlIlIIIII = true;
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
        ilIlIlIlIlllllllllIl.Q = this;
    }
    
    public IlIIIlIlIIIllIlIlIIl(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll ilIlIlIlIlllllllllIl) {
        super(illlllllIIIlIIIlIlII);
        this.llllIIIlIlllIlIIIIIl = -1;
        this.lIIIIlIIIIIlllIllIII = -1;
        this.lIIIlllIIIllIIIllIII = -1;
        this.IIllIIIlIIlIlIlIIIII = true;
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
        (this.IlIlIlIlIlllllllllIl.Q = this).llllIIIIlIIIlIlllIll(0.25f, 0.25f);
        this.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl.IIlllIlIIllIlIlIlIIl, ilIlIlIlIlllllllllIl.llIIIlIlIllIIlIlIlII + ilIlIlIlIlllllllllIl.llllIlIllllIIlIIlIlI(), ilIlIlIlIlllllllllIl.lllllIlIIIlIlIIlllII, ilIlIlIlIlllllllllIl.IIlIIIIIllIlIIIlIIll, ilIlIlIlIlllllllllIl.llllllIllIllIlIllllI);
        this.IIlllIlIIllIlIlIlIIl -= net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.IlIlIlIlIlllllllllIl(this.IIlIIIIIllIlIIIlIIll / 180.0f * 3.1415927f) * 0.16f;
        this.llIIIlIlIllIIlIlIlII -= 0.10000000149011612;
        this.lllllIlIIIlIlIIlllII -= net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(this.IIlIIIIIllIlIIIlIIll / 180.0f * 3.1415927f) * 0.16f;
        this.IlIlIlIlIlllllllllIl(this.IIlllIlIIllIlIlIlIIl, this.llIIIlIlIllIIlIlIlII, this.lllllIlIIIlIlIIlllII);
        final float n = 0.4f;
        this.lIllllllIIllIlIlIlII = -net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(this.IIlIIIIIllIlIIIlIIll / 180.0f * 3.1415927f) * net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.IlIlIlIlIlllllllllIl(this.llllllIllIllIlIllllI / 180.0f * 3.1415927f) * n;
        this.IIlllIIIlIlllIIlllII = net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.IlIlIlIlIlllllllllIl(this.IIlIIIIIllIlIIIlIIll / 180.0f * 3.1415927f) * net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.IlIlIlIlIlllllllllIl(this.llllllIllIllIlIllllI / 180.0f * 3.1415927f) * n;
        this.llIIlllIIlllIIllIllI = -net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(this.llllllIllIllIlIllllI / 180.0f * 3.1415927f) * n;
        this.llIllIIIIIllIlIIIIlI(this.lIllllllIIllIlIlIlII, this.llIIlllIIlllIIllIllI, this.IIlllIIIlIlllIIlllII, 1.5f, 1.0f);
    }
    
    @Override
    protected void a_() {
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll(final double n) {
        double n2 = this.IlIIlllIIlIlllllIIlI().llllIIIIlIIIlIlllIll() * 4.0;
        if (Double.isNaN(n2)) {
            n2 = 4.0;
        }
        final double n3 = n2 * 64.0;
        return n < n3 * n3;
    }
    
    public void llIllIIIIIllIlIIIIlI(double lIllllllIIllIlIlIlII, double llIIlllIIlllIIllIllI, double iIlllIIIlIlllIIlllII, final float n, final float n2) {
        final float llllIIIIlIIIlIlllIll = net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(lIllllllIIllIlIlIlII * lIllllllIIllIlIlIlII + llIIlllIIlllIIllIllI * llIIlllIIlllIIllIllI + iIlllIIIlIlllIIlllII * iIlllIIIlIlllIIlllII);
        lIllllllIIllIlIlIlII /= llllIIIIlIIIlIlllIll;
        llIIlllIIlllIIllIllI /= llllIIIIlIIIlIlllIll;
        iIlllIIIlIlllIIlllII /= llllIIIIlIIIlIlllIll;
        lIllllllIIllIlIlIlII += this.IlIIllIIllIIllIIlIIl.nextGaussian() * 0.007499999832361937 * n2;
        llIIlllIIlllIIllIllI += this.IlIIllIIllIIllIIlIIl.nextGaussian() * 0.007499999832361937 * n2;
        iIlllIIIlIlllIIlllII += this.IlIIllIIllIIllIIlIIl.nextGaussian() * 0.007499999832361937 * n2;
        lIllllllIIllIlIlIlII *= n;
        llIIlllIIlllIIllIllI *= n;
        iIlllIIIlIlllIIlllII *= n;
        this.lIllllllIIllIlIlIlII = lIllllllIIllIlIlIlII;
        this.llIIlllIIlllIIllIllI = llIIlllIIlllIIllIllI;
        this.IIlllIIIlIlllIIlllII = iIlllIIIlIlllIIlllII;
        final float llllIIIIlIIIlIlllIll2 = net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(lIllllllIIllIlIlIlII * lIllllllIIllIlIlIlII + iIlllIIIlIlllIIlllII * iIlllIIIlIlllIIlllII);
        final float n3 = (float)(net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.IlIlIlIlIlllllllllIl(lIllllllIIllIlIlIlII, iIlllIIIlIlllIIlllII) * 180.0 / 3.141592653589793);
        this.IIlIIIIIllIlIIIlIIll = n3;
        this.IIIllllllIllIIIlllIl = n3;
        final float n4 = (float)(net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.IlIlIlIlIlllllllllIl(llIIlllIIlllIIllIllI, llllIIIIlIIIlIlllIll2) * 180.0 / 3.141592653589793);
        this.llllllIllIllIlIllllI = n4;
        this.IlIIIlIIIllllIlIlIlI = n4;
        this.lIlIlIIIllIIllIIIllI = 0;
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final double iIlllIIIllIllIIlIlIl, final double llIlllIlllllIIllIIII, final double lllllIlIlIlllIlllIlI, final float n, final float n2, final int iiiiiiIllllIlIIIIIII, final boolean b) {
        this.IIlllIIIllIllIIlIlIl = iIlllIIIllIllIIlIlIl;
        this.llIlllIlllllIIllIIII = llIlllIlllllIIllIIII;
        this.lllllIlIlIlllIlllIlI = lllllIlIlIlllIlllIlI;
        this.IlIllllIIlIllIlIlIll = n;
        this.lllIlIIIIIlIlllllIlI = n2;
        this.IIIIIIIllllIlIIIIIII = iiiiiiIllllIlIIIIIII;
        this.lIllllllIIllIlIlIlII = this.llIlIIIIllIlIIlIlIII;
        this.llIIlllIIlllIIllIllI = this.IIIIIlllIlIIIIIIIllI;
        this.IIlllIIIlIlllIIlllII = this.llllllIIIIIIIlllIIll;
    }
    
    @Override
    public void lIIIlllIIIllIIIllIII(final double n, final double n2, final double n3) {
        this.lIllllllIIllIlIlIlII = n;
        this.llIlIIIIllIlIIlIlIII = n;
        this.llIIlllIIlllIIllIllI = n2;
        this.IIIIIlllIlIIIIIIIllI = n2;
        this.IIlllIIIlIlllIIlllII = n3;
        this.llllllIIIIIIIlllIIll = n3;
    }
    
    @Override
    public void IIllIIllIIIlIlIIIIlI() {
        super.IIllIIllIIIlIlIIIIlI();
        if (this.IIIIIIIllllIlIIIIIII > 0) {
            final double n = this.IIlllIlIIllIlIlIlIIl + (this.IIlllIIIllIllIIlIlIl - this.IIlllIlIIllIlIlIlIIl) / this.IIIIIIIllllIlIIIIIII;
            final double n2 = this.llIIIlIlIllIIlIlIlII + (this.llIlllIlllllIIllIIII - this.llIIIlIlIllIIlIlIlII) / this.IIIIIIIllllIlIIIIIII;
            final double n3 = this.lllllIlIIIlIlIIlllII + (this.lllllIlIlIlllIlllIlI - this.lllllIlIIIlIlIIlllII) / this.IIIIIIIllllIlIIIIIII;
            this.IIlIIIIIllIlIIIlIIll += (float)(net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.llllIIIlIlllIlIIIIIl(this.IlIllllIIlIllIlIlIll - this.IIlIIIIIllIlIIIlIIll) / this.IIIIIIIllllIlIIIIIII);
            this.llllllIllIllIlIllllI += (float)((this.lllIlIIIIIlIlllllIlI - this.llllllIllIllIlIllllI) / this.IIIIIIIllllIlIIIIIII);
            --this.IIIIIIIllllIlIIIIIII;
            this.IlIlIlIlIlllllllllIl(n, n2, n3);
            this.IlIlIlIlIlllllllllIl(this.IIlIIIIIllIlIIIlIIll, this.llllllIllIllIlIllllI);
        }
        else {
            if (!this.IlllllllIIIlIIIlIlII.IlIlIllllllllIIIIlII) {
                final lllIIIIlIlIllIIlIIIl p = this.IlIlIlIlIlllllllllIl.p();
                if (this.IlIlIlIlIlllllllllIl.IIlIlIlIIlIllIIIIIIl || !this.IlIlIlIlIlllllllllIl.llllIllllIllllIlIlII() || p == null || p.llllIIIIlIIIlIlllIll() != net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.lIIlllIlllllIIlllIll || this.IlIlIIIllIllIIIIIllI(this.IlIlIlIlIlllllllllIl) > 1024.0) {
                    this.IllIllIIIIlIIlIlllII();
                    this.IlIlIlIlIlllllllllIl.Q = null;
                    return;
                }
                if (this.llIllIIIIIllIlIIIIlI != null) {
                    if (!this.llIllIIIIIllIlIIIIlI.IIlIlIlIIlIllIIIIIIl) {
                        this.IIlllIlIIllIlIlIlIIl = this.llIllIIIIIllIlIIIIlI.IIlllIlIIllIlIlIlIIl;
                        this.llIIIlIlIllIIlIlIlII = this.llIllIIIIIllIlIIIIlI.IlIIlllIIlIlllllIIlI().IlIlIlIlIlllllllllIl + this.llIllIIIIIllIlIIIIlI.IlIllllIIlIIlIlIlIll * 0.8;
                        this.lllllIlIIIlIlIIlllII = this.llIllIIIIIllIlIIIIlI.lllllIlIIIlIlIIlllII;
                        return;
                    }
                    this.llIllIIIIIllIlIIIIlI = null;
                }
            }
            if (this.llllIIIIlIIIlIlllIll > 0) {
                --this.llllIIIIlIIIlIlllIll;
            }
            if (this.llIllIlIIIIllIlIIllI) {
                if (this.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(new net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(this.llllIIIlIlllIlIIIIIl, this.lIIIIlIIIIIlllIllIII, this.lIIIlllIIIllIIIllIII)).llIllIIIIIllIlIIIIlI() == this.llIIlIIIlIIIllIlIIIl) {
                    ++this.lIlIlIIIllIIllIIIllI;
                    if (this.lIlIlIIIllIIllIIIllI == 1200) {
                        this.IllIllIIIIlIIlIlllII();
                    }
                    return;
                }
                this.llIllIlIIIIllIlIIllI = false;
                this.lIllllllIIllIlIlIlII *= this.IlIIllIIllIIllIIlIIl.nextFloat() * 0.2f;
                this.llIIlllIIlllIIllIllI *= this.IlIIllIIllIIllIIlIIl.nextFloat() * 0.2f;
                this.IIlllIIIlIlllIIlllII *= this.IlIIllIIllIIllIIlIIl.nextFloat() * 0.2f;
                this.lIlIlIIIllIIllIIIllI = 0;
                this.IlIlIIIllIIllIlllllI = 0;
            }
            else {
                ++this.IlIlIIIllIIllIlllllI;
            }
            llIlllIlllllIIllIIII llllIIIIlIIIlIlllIll = this.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(new e(this.IIlllIlIIllIlIlIlIIl, this.llIIIlIlIllIIlIlIlII, this.lllllIlIIIlIlIIlllII), new e(this.IIlllIlIIllIlIlIlIIl + this.lIllllllIIllIlIlIlII, this.llIIIlIlIllIIlIlIlII + this.llIIlllIIlllIIllIllI, this.lllllIlIIIlIlIIlllII + this.IIlllIIIlIlllIIlllII));
            final e e = new e(this.IIlllIlIIllIlIlIlIIl, this.llIIIlIlIllIIlIlIlII, this.lllllIlIIIlIlIIlllII);
            e e2 = new e(this.IIlllIlIIllIlIlIlIIl + this.lIllllllIIllIlIlIlII, this.llIIIlIlIllIIlIlIlII + this.llIIlllIIlllIIllIllI, this.lllllIlIIIlIlIIlllII + this.IIlllIIIlIlllIIlllII);
            if (llllIIIIlIIIlIlllIll != null) {
                e2 = new e(llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll, llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl, llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI);
            }
            llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI = null;
            final List ilIlIlIlIlllllllllIl = this.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(this, this.IlIIlllIIlIlllllIIlI().llllIIIIlIIIlIlllIll(this.lIllllllIIllIlIlIlII, this.llIIlllIIlllIIllIllI, this.IIlllIIIlIlllIIlllII).IlIlIlIlIlllllllllIl(1.0, 1.0, 1.0));
            double n4 = 0.0;
            for (int i = 0; i < ilIlIlIlIlllllllllIl.size(); ++i) {
                final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI2 = ilIlIlIlIlllllllllIl.get(i);
                if (llIllIIIIIllIlIIIIlI2.IIlllIIlllIIIlIlllII() && (llIllIIIIIllIlIIIIlI2 != this.IlIlIlIlIlllllllllIl || this.IlIlIIIllIIllIlllllI >= 5)) {
                    final float n5 = 0.3f;
                    final llIlllIlllllIIllIIII llllIIIIlIIIlIlllIll2 = llIllIIIIIllIlIIIIlI2.IlIIlllIIlIlllllIIlI().IlIlIlIlIlllllllllIl(n5, n5, n5).llllIIIIlIIIlIlllIll(e, e2);
                    if (llllIIIIlIIIlIlllIll2 != null) {
                        final double llllIIIlIlllIlIIIIIl = e.llllIIIlIlllIlIIIIIl(llllIIIIlIIIlIlllIll2.llIllIIIIIllIlIIIIlI);
                        if (llllIIIlIlllIlIIIIIl < n4 || n4 == 0.0) {
                            llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI2;
                            n4 = llllIIIlIlllIlIIIIIl;
                        }
                    }
                }
            }
            if (llIllIIIIIllIlIIIIlI != null) {
                llllIIIIlIIIlIlllIll = new llIlllIlllllIIllIIII(llIllIIIIIllIlIIIIlI);
            }
            if (llllIIIIlIIIlIlllIll != null) {
                if (llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl != null) {
                    if (llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(net.minecraft.IlllllllIIIlIIIlIlII.lIllllllIIllIlIlIlII.llllIIIIlIIIlIlllIll(this, this.IlIlIlIlIlllllllllIl), 0.0f)) {
                        this.llIllIIIIIllIlIIIIlI = llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl;
                    }
                }
                else {
                    this.llIllIlIIIIllIlIIllI = true;
                }
            }
            if (!this.llIllIlIIIIllIlIIllI) {
                this.IlIIIlIlIIIllIlIlIIl(this.lIllllllIIllIlIlIlII, this.llIIlllIIlllIIllIllI, this.IIlllIIIlIlllIIlllII);
                final float llllIIIIlIIIlIlllIll3 = net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(this.lIllllllIIllIlIlIlII * this.lIllllllIIllIlIlIlII + this.IIlllIIIlIlllIIlllII * this.IIlllIIIlIlllIIlllII);
                this.IIlIIIIIllIlIIIlIIll = (float)(net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.IlIlIlIlIlllllllllIl(this.lIllllllIIllIlIlIlII, this.IIlllIIIlIlllIIlllII) * 180.0 / 3.141592653589793);
                this.llllllIllIllIlIllllI = (float)(net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.IlIlIlIlIlllllllllIl(this.llIIlllIIlllIIllIllI, llllIIIIlIIIlIlllIll3) * 180.0 / 3.141592653589793);
                while (this.llllllIllIllIlIllllI - this.IlIIIlIIIllllIlIlIlI < -180.0f) {
                    this.IlIIIlIIIllllIlIlIlI -= 360.0f;
                }
                while (this.llllllIllIllIlIllllI - this.IlIIIlIIIllllIlIlIlI >= 180.0f) {
                    this.IlIIIlIIIllllIlIlIlI += 360.0f;
                }
                while (this.IIlIIIIIllIlIIIlIIll - this.IIIllllllIllIIIlllIl < -180.0f) {
                    this.IIIllllllIllIIIlllIl -= 360.0f;
                }
                while (this.IIlIIIIIllIlIIIlIIll - this.IIIllllllIllIIIlllIl >= 180.0f) {
                    this.IIIllllllIllIIIlllIl += 360.0f;
                }
                this.llllllIllIllIlIllllI = this.IlIIIlIIIllllIlIlIlI + (this.llllllIllIllIlIllllI - this.IlIIIlIIIllllIlIlIlI) * 0.2f;
                this.IIlIIIIIllIlIIIlIIll = this.IIIllllllIllIIIlllIl + (this.IIlIIIIIllIlIIIlIIll - this.IIIllllllIllIIIlllIl) * 0.2f;
                float n6 = 0.92f;
                if (this.IIIIIllIIIIlIIIIllIl || this.IIIIIIIIIlllIllIlIlI) {
                    n6 = 0.5f;
                }
                final int n7 = 5;
                double n8 = 0.0;
                for (int j = 0; j < n7; ++j) {
                    final net.minecraft.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll ilIIlllIIlIlllllIIlI = this.IlIIlllIIlIlllllIIlI();
                    final double n9 = ilIIlllIIlIlllllIIlI.IlIlIIIllIllIIIIIllI - ilIIlllIIlIlllllIIlI.IlIlIlIlIlllllllllIl;
                    if (this.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(new net.minecraft.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(ilIIlllIIlIlllllIIlI.llllIIIIlIIIlIlllIll, ilIIlllIIlIlllllIIlI.IlIlIlIlIlllllllllIl + n9 * j / n7, ilIIlllIIlIlllllIIlI.llIllIIIIIllIlIIIIlI, ilIIlllIIlIlllllIIlI.IlIIIlIlIIIllIlIlIIl, ilIIlllIIlIlllllIIlI.IlIlIlIlIlllllllllIl + n9 * (j + 1) / n7, ilIIlllIIlIlllllIIlI.IllIIlllIIIIlllIIlIl), net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII)) {
                        n8 += 1.0 / n7;
                    }
                }
                if (!this.IlllllllIIIlIIIlIlII.IlIlIllllllllIIIIlII && n8 > 0.0) {
                    final IIIllllllIllIIIlllIl iiIllllllIllIIIlllIl = (IIIllllllIllIIIlllIl)this.IlllllllIIIlIIIlIlII;
                    int n10 = 1;
                    final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll4 = new net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(this).llllIIIIlIIIlIlllIll();
                    if (this.IlIIllIIllIIllIIlIIl.nextFloat() < 0.25f && this.IlllllllIIIlIIIlIlII.llIIIlIlIllIIlIlIlII(llllIIIIlIIIlIlllIll4)) {
                        n10 = 2;
                    }
                    if (this.IlIIllIIllIIllIIlIIl.nextFloat() < 0.5f && !this.IlllllllIIIlIIIlIlII.llIIlIIIlIIIllIlIIIl(llllIIIIlIIIlIlllIll4)) {
                        --n10;
                    }
                    if (this.IIIIlllIIIIIIlIIIlll > 0) {
                        --this.IIIIlllIIIIIIlIIIlll;
                        if (this.IIIIlllIIIIIIlIIIlll <= 0) {
                            this.llllIIllllIlIlIIIIll = 0;
                            this.IlIllIlIlIIIlIlIlIII = 0;
                        }
                    }
                    else if (this.IlIllIlIlIIIlIlIlIII > 0) {
                        this.IlIllIlIlIIIlIlIlIII -= n10;
                        if (this.IlIllIlIlIIIlIlIlIII <= 0) {
                            this.llIIlllIIlllIIllIllI -= 0.20000000298023224;
                            this.llllIIIIlIIIlIlllIll("random.splash", 0.25f, 1.0f + (this.IlIIllIIllIIllIIlIIl.nextFloat() - this.IlIIllIIllIIllIIlIIl.nextFloat()) * 0.4f);
                            final float n11 = (float)net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(this.IlIIlllIIlIlllllIIlI().IlIlIlIlIlllllllllIl);
                            iiIllllllIllIIIlllIl.llllIIIIlIIIlIlllIll(net.minecraft.IlllllllIIIlIIIlIlII.IlIllllIIlIIlIlIlIll.IlIlIIIllIllIIIIIllI, this.IIlllIlIIllIlIlIlIIl, n11 + 1.0f, this.lllllIlIIIlIlIIlllII, (int)(1.0f + this.IllIllIIIIlIIlIlllII * 20.0f), this.IllIllIIIIlIIlIlllII, 0.0, this.IllIllIIIIlIIlIlllII, 0.20000000298023224, new int[0]);
                            iiIllllllIllIIIlllIl.llllIIIIlIIIlIlllIll(net.minecraft.IlllllllIIIlIIIlIlII.IlIllllIIlIIlIlIlIll.llllIIIlIlllIlIIIIIl, this.IIlllIlIIllIlIlIlIIl, n11 + 1.0f, this.lllllIlIIIlIlIIlllII, (int)(1.0f + this.IllIllIIIIlIIlIlllII * 20.0f), this.IllIllIIIIlIIlIlllII, 0.0, this.IllIllIIIIlIIlIlllII, 0.20000000298023224, new int[0]);
                            this.IIIIlllIIIIIIlIIIlll = net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(this.IlIIllIIllIIllIIlIIl, 10, 30);
                        }
                        else {
                            this.IIlllIIlIllIllIlIIll += (float)(this.IlIIllIIllIIllIIlIIl.nextGaussian() * 4.0);
                            final float n12 = this.IIlllIIlIllIllIlIIll * 0.017453292f;
                            final float llllIIIIlIIIlIlllIll5 = net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(n12);
                            final float ilIlIlIlIlllllllllIl2 = net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.IlIlIlIlIlllllllllIl(n12);
                            final double n13 = this.IIlllIlIIllIlIlIlIIl + llllIIIIlIIIlIlllIll5 * this.IlIllIlIlIIIlIlIlIII * 0.1f;
                            final double n14 = net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(this.IlIIlllIIlIlllllIIlI().IlIlIlIlIlllllllllIl) + 1.0f;
                            final double n15 = this.lllllIlIIIlIlIIlllII + ilIlIlIlIlllllllllIl2 * this.IlIllIlIlIIIlIlIlIII * 0.1f;
                            final llllIIIIlIIIlIlllIll llIllIIIIIllIlIIIIlI3 = iiIllllllIllIIIlllIl.IlIlIlIlIlllllllllIl(new net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl((int)n13, (int)n14 - 1, (int)n15)).llIllIIIIIllIlIIIIlI();
                            if (llIllIIIIIllIlIIIIlI3 == net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl || llIllIIIIIllIlIIIIlI3 == net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lIIIlllIIIllIIIllIII) {
                                if (this.IlIIllIIllIIllIIlIIl.nextFloat() < 0.15f) {
                                    iiIllllllIllIIIlllIl.llllIIIIlIIIlIlllIll(net.minecraft.IlllllllIIIlIIIlIlII.IlIllllIIlIIlIlIlIll.IlIlIIIllIllIIIIIllI, n13, n14 - 0.10000000149011612, n15, 1, llllIIIIlIIIlIlllIll5, 0.1, ilIlIlIlIlllllllllIl2, 0.0, new int[0]);
                                }
                                final float n16 = llllIIIIlIIIlIlllIll5 * 0.04f;
                                final float n17 = ilIlIlIlIlllllllllIl2 * 0.04f;
                                iiIllllllIllIIIlllIl.llllIIIIlIIIlIlllIll(net.minecraft.IlllllllIIIlIIIlIlII.IlIllllIIlIIlIlIlIll.llllIIIlIlllIlIIIIIl, n13, n14, n15, 0, n17, 0.01, -n16, 1.0, new int[0]);
                                iiIllllllIllIIIlllIl.llllIIIIlIIIlIlllIll(net.minecraft.IlllllllIIIlIIIlIlII.IlIllllIIlIIlIlIlIll.llllIIIlIlllIlIIIIIl, n13, n14, n15, 0, -n17, 0.01, n16, 1.0, new int[0]);
                            }
                        }
                    }
                    else if (this.llllIIllllIlIlIIIIll > 0) {
                        this.llllIIllllIlIlIIIIll -= n10;
                        float n18 = 0.15f;
                        if (this.llllIIllllIlIlIIIIll < 20) {
                            n18 += (float)((20 - this.llllIIllllIlIlIIIIll) * 0.05);
                        }
                        else if (this.llllIIllllIlIlIIIIll < 40) {
                            n18 += (float)((40 - this.llllIIllllIlIlIIIIll) * 0.02);
                        }
                        else if (this.llllIIllllIlIlIIIIll < 60) {
                            n18 += (float)((60 - this.llllIIllllIlIlIIIIll) * 0.01);
                        }
                        if (this.IlIIllIIllIIllIIlIIl.nextFloat() < n18) {
                            final float n19 = net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(this.IlIIllIIllIIllIIlIIl, 0.0f, 360.0f) * 0.017453292f;
                            final float llllIIIIlIIIlIlllIll6 = net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(this.IlIIllIIllIIllIIlIIl, 25.0f, 60.0f);
                            final double n20 = this.IIlllIlIIllIlIlIlIIl + net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(n19) * llllIIIIlIIIlIlllIll6 * 0.1f;
                            final double n21 = net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(this.IlIIlllIIlIlllllIIlI().IlIlIlIlIlllllllllIl) + 1.0f;
                            final double n22 = this.lllllIlIIIlIlIIlllII + net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.IlIlIlIlIlllllllllIl(n19) * llllIIIIlIIIlIlllIll6 * 0.1f;
                            final llllIIIIlIIIlIlllIll llIllIIIIIllIlIIIIlI4 = iiIllllllIllIIIlllIl.IlIlIlIlIlllllllllIl(new net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl((int)n20, (int)n21 - 1, (int)n22)).llIllIIIIIllIlIIIIlI();
                            if (llIllIIIIIllIlIIIIlI4 == net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl || llIllIIIIIllIlIIIIlI4 == net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lIIIlllIIIllIIIllIII) {
                                iiIllllllIllIIIlllIl.llllIIIIlIIIlIlllIll(net.minecraft.IlllllllIIIlIIIlIlII.IlIllllIIlIIlIlIlIll.IllIIlllIIIIlllIIlIl, n20, n21, n22, 2 + this.IlIIllIIllIIllIIlIIl.nextInt(2), 0.10000000149011612, 0.0, 0.10000000149011612, 0.0, new int[0]);
                            }
                        }
                        if (this.llllIIllllIlIlIIIIll <= 0) {
                            this.IIlllIIlIllIllIlIIll = net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(this.IlIIllIIllIIllIIlIIl, 0.0f, 360.0f);
                            this.IlIllIlIlIIIlIlIlIII = net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(this.IlIIllIIllIIllIIlIIl, 20, 80);
                        }
                    }
                    else {
                        this.llllIIllllIlIlIIIIll = net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(this.IlIIllIIllIIllIIlIIl, 100, 900);
                        this.llllIIllllIlIlIIIIll -= net.minecraft.IllIIlllIIIIlllIIlIl.lIlIlIIIllIIllIIIllI.llllIIIlIlllIlIIIIIl(this.IlIlIlIlIlllllllllIl) * 20 * 5;
                    }
                    if (this.IIIIlllIIIIIIlIIIlll > 0) {
                        this.llIIlllIIlllIIllIllI -= this.IlIIllIIllIIllIIlIIl.nextFloat() * this.IlIIllIIllIIllIIlIIl.nextFloat() * this.IlIIllIIllIIllIIlIIl.nextFloat() * 0.2;
                    }
                }
                this.llIIlllIIlllIIllIllI += 0.03999999910593033 * (n8 * 2.0 - 1.0);
                if (n8 > 0.0) {
                    n6 *= (float)0.9;
                    this.llIIlllIIlllIIllIllI *= 0.8;
                }
                this.lIllllllIIllIlIlIlII *= n6;
                this.llIIlllIIlllIIllIllI *= n6;
                this.IIlllIIIlIlllIIlllII *= n6;
                this.IlIlIlIlIlllllllllIl(this.IIlllIlIIllIlIlIlIIl, this.llIIIlIlIllIIlIlIlII, this.lllllIlIIIlIlIIlllII);
            }
        }
    }
    
    public void llllIIIIlIIIlIlllIll(final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll) {
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("xTile", (short)this.llllIIIlIlllIlIIIIIl);
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("yTile", (short)this.lIIIIlIIIIIlllIllIII);
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("zTile", (short)this.lIIIlllIIIllIIIllIII);
        final lIllllIllIllIIllllll lIllllIllIllIIllllll = (lIllllIllIllIIllllll)net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(this.llIIlIIIlIIIllIlIIIl);
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("inTile", (lIllllIllIllIIllllll == null) ? "" : lIllllIllIllIIllllll.toString());
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("shake", (byte)this.llllIIIIlIIIlIlllIll);
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("inGround", (byte)(this.llIllIlIIIIllIlIIllI ? 1 : 0));
    }
    
    public void IlIlIlIlIlllllllllIl(final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll) {
        this.llllIIIlIlllIlIIIIIl = iiiIlllIIIIIIlIIIlll.IlIlIIIllIllIIIIIllI("xTile");
        this.lIIIIlIIIIIlllIllIII = iiiIlllIIIIIIlIIIlll.IlIlIIIllIllIIIIIllI("yTile");
        this.lIIIlllIIIllIIIllIII = iiiIlllIIIIIIlIIIlll.IlIlIIIllIllIIIIIllI("zTile");
        if (iiiIlllIIIIIIlIIIlll.IlIlIlIlIlllllllllIl("inTile", 8)) {
            this.llIIlIIIlIIIllIlIIIl = net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(iiiIlllIIIIIIlIIIlll.llIIlIIIlIIIllIlIIIl("inTile"));
        }
        else {
            this.llIIlIIIlIIIllIlIIIl = net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(iiiIlllIIIIIIlIIIlll.IlIIIlIlIIIllIlIlIIl("inTile") & 0xFF);
        }
        this.llllIIIIlIIIlIlllIll = (iiiIlllIIIIIIlIIIlll.IlIIIlIlIIIllIlIlIIl("shake") & 0xFF);
        this.llIllIlIIIIllIlIIllI = (iiiIlllIIIIIIlIIIlll.IlIIIlIlIIIllIlIlIIl("inGround") == 1);
    }
    
    public int lIIIIlIIIIIlllIllIII() {
        if (this.IlllllllIIIlIIIlIlII.IlIlIllllllllIIIIlII) {
            return 0;
        }
        int n = 0;
        if (this.llIllIIIIIllIlIIIIlI != null) {
            final double n2 = this.IlIlIlIlIlllllllllIl.IIlllIlIIllIlIlIlIIl - this.IIlllIlIIllIlIlIlIIl;
            final double n3 = this.IlIlIlIlIlllllllllIl.llIIIlIlIllIIlIlIlII - this.llIIIlIlIllIIlIlIlII;
            final double n4 = this.IlIlIlIlIlllllllllIl.lllllIlIIIlIlIIlllII - this.lllllIlIIIlIlIIlllII;
            final double n5 = net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(n2 * n2 + n3 * n3 + n4 * n4);
            final double n6 = 0.1;
            final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI = this.llIllIIIIIllIlIIIIlI;
            llIllIIIIIllIlIIIIlI.lIllllllIIllIlIlIlII += n2 * n6;
            final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI2 = this.llIllIIIIIllIlIIIIlI;
            llIllIIIIIllIlIIIIlI2.llIIlllIIlllIIllIllI += n3 * n6 + net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(n5) * 0.08;
            final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI3 = this.llIllIIIIIllIlIIIIlI;
            llIllIIIIIllIlIIIIlI3.IIlllIIIlIlllIIlllII += n4 * n6;
            n = 3;
        }
        else if (this.IIIIlllIIIIIIlIIIlll > 0) {
            final lIIIlllIIIllIIIllIII liiIlllIIIllIIIllIII = new lIIIlllIIIllIIIllIII(this.IlllllllIIIlIIIlIlII, this.IIlllIlIIllIlIlIlIIl, this.llIIIlIlIllIIlIlIlII, this.lllllIlIIIlIlIIlllII, this.lIIIlllIIIllIIIllIII());
            final double n7 = this.IlIlIlIlIlllllllllIl.IIlllIlIIllIlIlIlIIl - this.IIlllIlIIllIlIlIlIIl;
            final double n8 = this.IlIlIlIlIlllllllllIl.llIIIlIlIllIIlIlIlII - this.llIIIlIlIllIIlIlIlII;
            final double n9 = this.IlIlIlIlIlllllllllIl.lllllIlIIIlIlIIlllII - this.lllllIlIIIlIlIIlllII;
            final double n10 = net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(n7 * n7 + n8 * n8 + n9 * n9);
            final double n11 = 0.1;
            liiIlllIIIllIIIllIII.lIllllllIIllIlIlIlII = n7 * n11;
            liiIlllIIIllIIIllIII.llIIlllIIlllIIllIllI = n8 * n11 + net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(n10) * 0.08;
            liiIlllIIIllIIIllIII.IIlllIIIlIlllIIlllII = n9 * n11;
            this.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(liiIlllIIIllIIIllIII);
            this.IlIlIlIlIlllllllllIl.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(new IlIlIIIlIIlIlIIlllIl(this.IlIlIlIlIlllllllllIl.IlllllllIIIlIIIlIlII, this.IlIlIlIlIlllllllllIl.IIlllIlIIllIlIlIlIIl, this.IlIlIlIlIlllllllllIl.llIIIlIlIllIIlIlIlII + 0.5, this.IlIlIlIlIlllllllllIl.lllllIlIIIlIlIIlllII + 0.5, this.IlIIllIIllIIllIIlIIl.nextInt(6) + 1));
            n = 1;
        }
        if (this.llIllIlIIIIllIlIIllI) {
            n = 2;
        }
        this.IllIllIIIIlIIlIlllII();
        this.IlIlIlIlIlllllllllIl.Q = null;
        return n;
    }
    
    private lllIIIIlIlIllIIlIIIl lIIIlllIIIllIIIllIII() {
        final float nextFloat = this.IlllllllIIIlIIIlIlII.llllIIllllIlIlIIIIll.nextFloat();
        final int illIIlllIIIIlllIIlIl = net.minecraft.IllIIlllIIIIlllIIlIl.lIlIlIIIllIIllIIIllI.IllIIlllIIIIlllIIlIl(this.IlIlIlIlIlllllllllIl);
        final int llllIIIlIlllIlIIIIIl = net.minecraft.IllIIlllIIIIlllIIlIl.lIlIlIIIllIIllIIIllI.llllIIIlIlllIlIIIIIl(this.IlIlIlIlIlllllllllIl);
        final float n = 0.1f - illIIlllIIIIlllIIlIl * 0.025f - llllIIIlIlllIlIIIIIl * 0.01f;
        final float n2 = 0.05f + illIIlllIIIIlllIIlIl * 0.01f - llllIIIlIlllIlIIIIIl * 0.01f;
        final float llllIIIIlIIIlIlllIll = net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(n, 0.0f, 1.0f);
        final float llllIIIIlIIIlIlllIll2 = net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(n2, 0.0f, 1.0f);
        if (nextFloat < llllIIIIlIIIlIlllIll) {
            this.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(net.minecraft.IIIlIIIlIlIIlllIIlll.IIIIlllIIIIIIlIIIlll.lIllllllIIllIlIlIlII);
            return ((l)i.llllIIIIlIIIlIlllIll(this.IlIIllIIllIIllIIlIIl, net.minecraft.llllIIIlIlllIlIIIIIl.lIIIIlIIIIIlllIllIII.IlIIIlIlIIIllIlIlIIl.IlIIIlIlIIIllIlIlIIl)).llllIIIIlIIIlIlllIll(this.IlIIllIIllIIllIIlIIl);
        }
        if (nextFloat - llllIIIIlIIIlIlllIll < llllIIIIlIIIlIlllIll2) {
            this.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(net.minecraft.IIIlIIIlIlIIlllIIlll.IIIIlllIIIIIIlIIIlll.llIIlllIIlllIIllIllI);
            return ((l)i.llllIIIIlIIIlIlllIll(this.IlIIllIIllIIllIIlIIl, net.minecraft.llllIIIlIlllIlIIIIIl.lIIIIlIIIIIlllIllIII.IlIIIlIlIIIllIlIlIIl.IlIlIIIllIllIIIIIllI)).llllIIIIlIIIlIlllIll(this.IlIIllIIllIIllIIlIIl);
        }
        this.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(net.minecraft.IIIlIIIlIlIIlllIIlll.IIIIlllIIIIIIlIIIlll.lllllIlIIIlIlIIlllII);
        return ((l)i.llllIIIIlIIIlIlllIll(this.IlIIllIIllIIllIIlIIl, net.minecraft.llllIIIlIlllIlIIIIIl.lIIIIlIIIIIlllIllIII.IlIIIlIlIIIllIlIlIIl.IllIIlllIIIIlllIIlIl)).llllIIIIlIIIlIlllIll(this.IlIIllIIllIIllIIlIIl);
    }
    
    @Override
    public void IllIllIIIIlIIlIlllII() {
        super.IllIllIIIIlIIlIlllII();
        if (this.IlIlIlIlIlllllllllIl != null) {
            this.IlIlIlIlIlllllllllIl.Q = null;
        }
    }
}
