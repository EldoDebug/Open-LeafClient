package net.minecraft.llllIIIlIlllIlIIIIIl.lIIIIlIIIIIlllIllIII;

import net.minecraft.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIIIllIllIIIIIllI.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl.*;
import net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.*;
import java.util.*;
import net.minecraft.lIlIlIIIllIIllIIIllI.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.lIIIlllIIIllIIIllIII.*;
import net.minecraft.llIllIlIIIIllIlIIllI.*;

public class llllIIIIlIIIlIlllIll extends llIllIIIIIllIlIIIIlI implements IIlIIIIIllIlIIIlIIll
{
    private int IlIIIlIlIIIllIlIlIIl;
    private int IlIlIIIllIllIIIIIllI;
    private int IllIIlllIIIIlllIIlIl;
    private net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llllIIIlIlllIlIIIIIl;
    private int lIIIIlIIIIIlllIllIII;
    private boolean lIIIlllIIIllIIIllIII;
    public int llllIIIIlIIIlIlllIll;
    public int IlIlIlIlIlllllllllIl;
    public llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI;
    private int llIIlIIIlIIIllIlIIIl;
    private int llIllIlIIIIllIlIIllI;
    private double lIlIlIIIllIIllIIIllI;
    private int IlIlIIIllIIllIlllllI;
    
    public llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII) {
        super(illlllllIIIlIIIlIlII);
        this.IlIIIlIlIIIllIlIlIIl = -1;
        this.IlIlIIIllIllIIIIIllI = -1;
        this.IllIIlllIIIIlllIIlIl = -1;
        this.lIlIlIIIllIIllIIIllI = 2.0;
        this.lllIIIIlllllIlIIllIl = 10.0;
        this.llllIIIIlIIIlIlllIll(0.5f, 0.5f);
    }
    
    public llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final double n, final double n2, final double n3) {
        super(illlllllIIIlIIIlIlII);
        this.IlIIIlIlIIIllIlIlIIl = -1;
        this.IlIlIIIllIllIIIIIllI = -1;
        this.IllIIlllIIIIlllIIlIl = -1;
        this.lIlIlIIIllIIllIIIllI = 2.0;
        this.lllIIIIlllllIlIIllIl = 10.0;
        this.llllIIIIlIIIlIlllIll(0.5f, 0.5f);
        this.IlIlIlIlIlllllllllIl(n, n2, n3);
    }
    
    public llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final lllIIIIlllllIlIIllIl llIllIIIIIllIlIIIIlI, final lllIIIIlllllIlIIllIl lllIIIIlllllIlIIllIl, final float n, final float n2) {
        super(illlllllIIIlIIIlIlII);
        this.IlIIIlIlIIIllIlIlIIl = -1;
        this.IlIlIIIllIllIIIIIllI = -1;
        this.IllIIlllIIIIlllIIlIl = -1;
        this.lIlIlIIIllIIllIIIllI = 2.0;
        this.lllIIIIlllllIlIIllIl = 10.0;
        this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
        if (llIllIIIIIllIlIIIIlI instanceof net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll) {
            this.llllIIIIlIIIlIlllIll = 1;
        }
        this.llIIIlIlIllIIlIlIlII = llIllIIIIIllIlIIIIlI.llIIIlIlIllIIlIlIlII + llIllIIIIIllIlIIIIlI.llllIlIllllIIlIIlIlI() - 0.10000000149011612;
        final double n3 = lllIIIIlllllIlIIllIl.IIlllIlIIllIlIlIlIIl - llIllIIIIIllIlIIIIlI.IIlllIlIIllIlIlIlIIl;
        final double n4 = lllIIIIlllllIlIIllIl.IlIIlllIIlIlllllIIlI().IlIlIlIlIlllllllllIl + lllIIIIlllllIlIIllIl.IlIllllIIlIIlIlIlIll / 3.0f - this.llIIIlIlIllIIlIlIlII;
        final double n5 = lllIIIIlllllIlIIllIl.lllllIlIIIlIlIIlllII - llIllIIIIIllIlIIIIlI.lllllIlIIIlIlIIlllII;
        final double n6 = net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(n3 * n3 + n5 * n5);
        if (n6 >= 1.0E-7) {
            this.IlIlIlIlIlllllllllIl(llIllIIIIIllIlIIIIlI.IIlllIlIIllIlIlIlIIl + n3 / n6, this.llIIIlIlIllIIlIlIlII, llIllIIIIIllIlIIIIlI.lllllIlIIIlIlIIlllII + n5 / n6, (float)(net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.IlIlIlIlIlllllllllIl(n5, n3) * 180.0 / 3.141592653589793) - 90.0f, (float)(-(net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.IlIlIlIlIlllllllllIl(n4, n6) * 180.0 / 3.141592653589793)));
            this.llllIIIIlIIIlIlllIll(n3, n4 + (float)(n6 * 0.20000000298023224), n5, n, n2);
        }
    }
    
    public llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final lllIIIIlllllIlIIllIl llIllIIIIIllIlIIIIlI, final float n) {
        super(illlllllIIIlIIIlIlII);
        this.IlIIIlIlIIIllIlIlIIl = -1;
        this.IlIlIIIllIllIIIIIllI = -1;
        this.IllIIlllIIIIlllIIlIl = -1;
        this.lIlIlIIIllIIllIIIllI = 2.0;
        this.lllIIIIlllllIlIIllIl = 10.0;
        this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
        if (llIllIIIIIllIlIIIIlI instanceof net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll) {
            this.llllIIIIlIIIlIlllIll = 1;
        }
        this.llllIIIIlIIIlIlllIll(0.5f, 0.5f);
        this.IlIlIlIlIlllllllllIl(llIllIIIIIllIlIIIIlI.IIlllIlIIllIlIlIlIIl, llIllIIIIIllIlIIIIlI.llIIIlIlIllIIlIlIlII + llIllIIIIIllIlIIIIlI.llllIlIllllIIlIIlIlI(), llIllIIIIIllIlIIIIlI.lllllIlIIIlIlIIlllII, llIllIIIIIllIlIIIIlI.IIlIIIIIllIlIIIlIIll, llIllIIIIIllIlIIIIlI.llllllIllIllIlIllllI);
        this.IIlllIlIIllIlIlIlIIl -= net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.IlIlIlIlIlllllllllIl(this.IIlIIIIIllIlIIIlIIll / 180.0f * 3.1415927f) * 0.16f;
        this.llIIIlIlIllIIlIlIlII -= 0.10000000149011612;
        this.lllllIlIIIlIlIIlllII -= net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(this.IIlIIIIIllIlIIIlIIll / 180.0f * 3.1415927f) * 0.16f;
        this.IlIlIlIlIlllllllllIl(this.IIlllIlIIllIlIlIlIIl, this.llIIIlIlIllIIlIlIlII, this.lllllIlIIIlIlIIlllII);
        this.lIllllllIIllIlIlIlII = -net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(this.IIlIIIIIllIlIIIlIIll / 180.0f * 3.1415927f) * net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.IlIlIlIlIlllllllllIl(this.llllllIllIllIlIllllI / 180.0f * 3.1415927f);
        this.IIlllIIIlIlllIIlllII = net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.IlIlIlIlIlllllllllIl(this.IIlIIIIIllIlIIIlIIll / 180.0f * 3.1415927f) * net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.IlIlIlIlIlllllllllIl(this.llllllIllIllIlIllllI / 180.0f * 3.1415927f);
        this.llIIlllIIlllIIllIllI = -net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(this.llllllIllIllIlIllllI / 180.0f * 3.1415927f);
        this.llllIIIIlIIIlIlllIll(this.lIllllllIIllIlIlIlII, this.llIIlllIIlllIIllIllI, this.IIlllIIIlIlllIIlllII, n * 1.5f, 1.0f);
    }
    
    @Override
    protected void a_() {
        this.IIlllIIlllIIIlIlllII.llllIIIIlIIIlIlllIll(16, (Object)0);
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(double lIllllllIIllIlIlIlII, double llIIlllIIlllIIllIllI, double iIlllIIIlIlllIIlllII, final float n, final float n2) {
        final float llllIIIIlIIIlIlllIll = net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(lIllllllIIllIlIlIlII * lIllllllIIllIlIlIlII + llIIlllIIlllIIllIllI * llIIlllIIlllIIllIllI + iIlllIIIlIlllIIlllII * iIlllIIIlIlllIIlllII);
        lIllllllIIllIlIlIlII /= llllIIIIlIIIlIlllIll;
        llIIlllIIlllIIllIllI /= llllIIIIlIIIlIlllIll;
        iIlllIIIlIlllIIlllII /= llllIIIIlIIIlIlllIll;
        lIllllllIIllIlIlIlII += this.IlIIllIIllIIllIIlIIl.nextGaussian() * (this.IlIIllIIllIIllIIlIIl.nextBoolean() ? -1 : 1) * 0.007499999832361937 * n2;
        llIIlllIIlllIIllIllI += this.IlIIllIIllIIllIIlIIl.nextGaussian() * (this.IlIIllIIllIIllIIlIIl.nextBoolean() ? -1 : 1) * 0.007499999832361937 * n2;
        iIlllIIIlIlllIIlllII += this.IlIIllIIllIIllIIlIIl.nextGaussian() * (this.IlIIllIIllIIllIIlIIl.nextBoolean() ? -1 : 1) * 0.007499999832361937 * n2;
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
        this.llIIlIIIlIIIllIlIIIl = 0;
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final double n, final double n2, final double n3, final float n4, final float n5, final int n6, final boolean b) {
        this.IlIlIlIlIlllllllllIl(n, n2, n3);
        this.IlIlIlIlIlllllllllIl(n4, n5);
    }
    
    @Override
    public void lIIIlllIIIllIIIllIII(final double lIllllllIIllIlIlIlII, final double llIIlllIIlllIIllIllI, final double iIlllIIIlIlllIIlllII) {
        this.lIllllllIIllIlIlIlII = lIllllllIIllIlIlIlII;
        this.llIIlllIIlllIIllIllI = llIIlllIIlllIIllIllI;
        this.IIlllIIIlIlllIIlllII = iIlllIIIlIlllIIlllII;
        if (this.IlIIIlIIIllllIlIlIlI == 0.0f && this.IIIllllllIllIIIlllIl == 0.0f) {
            final float llllIIIIlIIIlIlllIll = net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(lIllllllIIllIlIlIlII * lIllllllIIllIlIlIlII + iIlllIIIlIlllIIlllII * iIlllIIIlIlllIIlllII);
            final float n = (float)(net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.IlIlIlIlIlllllllllIl(lIllllllIIllIlIlIlII, iIlllIIIlIlllIIlllII) * 180.0 / 3.141592653589793);
            this.IIlIIIIIllIlIIIlIIll = n;
            this.IIIllllllIllIIIlllIl = n;
            final float n2 = (float)(net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.IlIlIlIlIlllllllllIl(llIIlllIIlllIIllIllI, llllIIIIlIIIlIlllIll) * 180.0 / 3.141592653589793);
            this.llllllIllIllIlIllllI = n2;
            this.IlIIIlIIIllllIlIlIlI = n2;
            this.IlIIIlIIIllllIlIlIlI = this.llllllIllIllIlIllllI;
            this.IIIllllllIllIIIlllIl = this.IIlIIIIIllIlIIIlIIll;
            this.IlIlIlIlIlllllllllIl(this.IIlllIlIIllIlIlIlIIl, this.llIIIlIlIllIIlIlIlII, this.lllllIlIIIlIlIIlllII, this.IIlIIIIIllIlIIIlIIll, this.llllllIllIllIlIllllI);
            this.llIIlIIIlIIIllIlIIIl = 0;
        }
    }
    
    @Override
    public void IIllIIllIIIlIlIIIIlI() {
        super.IIllIIllIIIlIlIIIIlI();
        if (this.IlIIIlIIIllllIlIlIlI == 0.0f && this.IIIllllllIllIIIlllIl == 0.0f) {
            final float llllIIIIlIIIlIlllIll = net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(this.lIllllllIIllIlIlIlII * this.lIllllllIIllIlIlIlII + this.IIlllIIIlIlllIIlllII * this.IIlllIIIlIlllIIlllII);
            final float n = (float)(net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.IlIlIlIlIlllllllllIl(this.lIllllllIIllIlIlIlII, this.IIlllIIIlIlllIIlllII) * 180.0 / 3.141592653589793);
            this.IIlIIIIIllIlIIIlIIll = n;
            this.IIIllllllIllIIIlllIl = n;
            final float n2 = (float)(net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.IlIlIlIlIlllllllllIl(this.llIIlllIIlllIIllIllI, llllIIIIlIIIlIlllIll) * 180.0 / 3.141592653589793);
            this.llllllIllIllIlIllllI = n2;
            this.IlIIIlIIIllllIlIlIlI = n2;
        }
        final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl = new IlIlIlIlIlllllllllIl(this.IlIIIlIlIIIllIlIlIIl, this.IlIlIIIllIllIIIIIllI, this.IllIIlllIIIIlllIIlIl);
        final llIIlIIIlIIIllIlIIIl ilIlIlIlIlllllllllIl2 = this.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl);
        final net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llIllIIIIIllIlIIIIlI = ilIlIlIlIlllllllllIl2.llIllIIIIIllIlIIIIlI();
        if (llIllIIIIIllIlIIIIlI.IllIIlllIIIIlllIIlIl() != net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll) {
            llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI((lIlIlIIIllIIllIIIllI)this.IlllllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl);
            final net.minecraft.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll2 = llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(this.IlllllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl, ilIlIlIlIlllllllllIl2);
            if (llllIIIIlIIIlIlllIll2 != null && llllIIIIlIIIlIlllIll2.llllIIIIlIIIlIlllIll(new e(this.IIlllIlIIllIlIlIlIIl, this.llIIIlIlIllIIlIlIlII, this.lllllIlIIIlIlIIlllII))) {
                this.lIIIlllIIIllIIIllIII = true;
            }
        }
        if (this.IlIlIlIlIlllllllllIl > 0) {
            --this.IlIlIlIlIlllllllllIl;
        }
        if (this.lIIIlllIIIllIIIllIII) {
            final int llIllIIIIIllIlIIIIlI2 = llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI(ilIlIlIlIlllllllllIl2);
            if (llIllIIIIIllIlIIIIlI == this.llllIIIlIlllIlIIIIIl && llIllIIIIIllIlIIIIlI2 == this.lIIIIlIIIIIlllIllIII) {
                ++this.llIIlIIIlIIIllIlIIIl;
                if (this.llIIlIIIlIIIllIlIIIl >= 1200) {
                    this.IllIllIIIIlIIlIlllII();
                }
            }
            else {
                this.lIIIlllIIIllIIIllIII = false;
                this.lIllllllIIllIlIlIlII *= this.IlIIllIIllIIllIIlIIl.nextFloat() * 0.2f;
                this.llIIlllIIlllIIllIllI *= this.IlIIllIIllIIllIIlIIl.nextFloat() * 0.2f;
                this.IIlllIIIlIlllIIlllII *= this.IlIIllIIllIIllIIlIIl.nextFloat() * 0.2f;
                this.llIIlIIIlIIIllIlIIIl = 0;
                this.llIllIlIIIIllIlIIllI = 0;
            }
        }
        else {
            ++this.llIllIlIIIIllIlIIllI;
            llIlllIlllllIIllIIII llllIIIIlIIIlIlllIll3 = this.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(new e(this.IIlllIlIIllIlIlIlIIl, this.llIIIlIlIllIIlIlIlII, this.lllllIlIIIlIlIIlllII), new e(this.IIlllIlIIllIlIlIlIIl + this.lIllllllIIllIlIlIlII, this.llIIIlIlIllIIlIlIlII + this.llIIlllIIlllIIllIllI, this.lllllIlIIIlIlIIlllII + this.IIlllIIIlIlllIIlllII), false, true, false);
            final e e = new e(this.IIlllIlIIllIlIlIlIIl, this.llIIIlIlIllIIlIlIlII, this.lllllIlIIIlIlIIlllII);
            e e2 = new e(this.IIlllIlIIllIlIlIlIIl + this.lIllllllIIllIlIlIlII, this.llIIIlIlIllIIlIlIlII + this.llIIlllIIlllIIllIllI, this.lllllIlIIIlIlIIlllII + this.IIlllIIIlIlllIIlllII);
            if (llllIIIIlIIIlIlllIll3 != null) {
                e2 = new e(llllIIIIlIIIlIlllIll3.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll, llllIIIIlIIIlIlllIll3.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl, llllIIIIlIIIlIlllIll3.llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI);
            }
            llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI3 = null;
            final List ilIlIlIlIlllllllllIl3 = this.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(this, this.IlIIlllIIlIlllllIIlI().llllIIIIlIIIlIlllIll(this.lIllllllIIllIlIlIlII, this.llIIlllIIlllIIllIllI, this.IIlllIIIlIlllIIlllII).IlIlIlIlIlllllllllIl(1.0, 1.0, 1.0));
            double n3 = 0.0;
            for (int i = 0; i < ilIlIlIlIlllllllllIl3.size(); ++i) {
                final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI4 = ilIlIlIlIlllllllllIl3.get(i);
                if (llIllIIIIIllIlIIIIlI4.IIlllIIlllIIIlIlllII() && (llIllIIIIIllIlIIIIlI4 != this.llIllIIIIIllIlIIIIlI || this.llIllIlIIIIllIlIIllI >= 5)) {
                    final float n4 = 0.3f;
                    final llIlllIlllllIIllIIII llllIIIIlIIIlIlllIll4 = llIllIIIIIllIlIIIIlI4.IlIIlllIIlIlllllIIlI().IlIlIlIlIlllllllllIl(n4, n4, n4).llllIIIIlIIIlIlllIll(e, e2);
                    if (llllIIIIlIIIlIlllIll4 != null) {
                        final double llllIIIlIlllIlIIIIIl = e.llllIIIlIlllIlIIIIIl(llllIIIIlIIIlIlllIll4.llIllIIIIIllIlIIIIlI);
                        if (llllIIIlIlllIlIIIIIl < n3 || n3 == 0.0) {
                            llIllIIIIIllIlIIIIlI3 = llIllIIIIIllIlIIIIlI4;
                            n3 = llllIIIlIlllIlIIIIIl;
                        }
                    }
                }
            }
            if (llIllIIIIIllIlIIIIlI3 != null) {
                llllIIIIlIIIlIlllIll3 = new llIlllIlllllIIllIIII(llIllIIIIIllIlIIIIlI3);
            }
            if (llllIIIIlIIIlIlllIll3 != null && llllIIIIlIIIlIlllIll3.IlIIIlIlIIIllIlIlIIl != null && llllIIIIlIIIlIlllIll3.IlIIIlIlIIIllIlIlIIl instanceof net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll) {
                final net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll5 = (net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll)llllIIIIlIIIlIlllIll3.IlIIIlIlIIIllIlIlIIl;
                if (llllIIIIlIIIlIlllIll5.K.llllIIIIlIIIlIlllIll || (this.llIllIIIIIllIlIIIIlI instanceof net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll && !((net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll)this.llIllIIIIIllIlIIIIlI).IlIIIlIlIIIllIlIlIIl(llllIIIIlIIIlIlllIll5))) {
                    llllIIIIlIIIlIlllIll3 = null;
                }
            }
            if (llllIIIIlIIIlIlllIll3 != null) {
                if (llllIIIIlIIIlIlllIll3.IlIIIlIlIIIllIlIlIIl != null) {
                    int illIIlllIIIIlllIIlIl = net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.IllIIlllIIIIlllIIlIl(net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(this.lIllllllIIllIlIlIlII * this.lIllllllIIllIlIlIlII + this.llIIlllIIlllIIllIllI * this.llIIlllIIlllIIllIllI + this.IIlllIIIlIlllIIlllII * this.IIlllIIIlIlllIIlllII) * this.lIlIlIIIllIIllIIIllI);
                    if (this.lIIIIlIIIIIlllIllIII()) {
                        illIIlllIIIIlllIIlIl += this.IlIIllIIllIIllIIlIIl.nextInt(illIIlllIIIIlllIIlIl / 2 + 2);
                    }
                    lIllllllIIllIlIlIlII lIllllllIIllIlIlIlII;
                    if (this.llIllIIIIIllIlIIIIlI == null) {
                        lIllllllIIllIlIlIlII = net.minecraft.IlllllllIIIlIIIlIlII.lIllllllIIllIlIlIlII.llllIIIIlIIIlIlllIll(this, this);
                    }
                    else {
                        lIllllllIIllIlIlIlII = net.minecraft.IlllllllIIIlIIIlIlII.lIllllllIIllIlIlIlII.llllIIIIlIIIlIlllIll(this, this.llIllIIIIIllIlIIIIlI);
                    }
                    if (this.lIIIIIlIlIIIlIIIIlIl() && !(llllIIIIlIIIlIlllIll3.IlIIIlIlIIIllIlIlIIl instanceof IlIlIIIllIllIIIIIllI)) {
                        llllIIIIlIIIlIlllIll3.IlIIIlIlIIIllIlIlIIl.IlIlIIIllIllIIIIIllI(5);
                    }
                    if (llllIIIIlIIIlIlllIll3.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(lIllllllIIllIlIlIlII, (float)illIIlllIIIIlllIIlIl)) {
                        if (llllIIIIlIIIlIlllIll3.IlIIIlIlIIIllIlIlIIl instanceof lllIIIIlllllIlIIllIl) {
                            final lllIIIIlllllIlIIllIl lllIIIIlllllIlIIllIl = (lllIIIIlllllIlIIllIl)llllIIIIlIIIlIlllIll3.IlIIIlIlIIIllIlIlIIl;
                            if (!this.IlllllllIIIlIIIlIlII.IlIlIllllllllIIIIlII) {
                                lllIIIIlllllIlIIllIl.IIlllIIlIllIllIlIIll(lllIIIIlllllIlIIllIl.V() + 1);
                            }
                            if (this.IlIlIIIllIIllIlllllI > 0) {
                                final float llllIIIIlIIIlIlllIll6 = net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(this.lIllllllIIllIlIlIlII * this.lIllllllIIllIlIlIlII + this.IIlllIIIlIlllIIlllII * this.IIlllIIIlIlllIIlllII);
                                if (llllIIIIlIIIlIlllIll6 > 0.0f) {
                                    llllIIIIlIIIlIlllIll3.IlIIIlIlIIIllIlIlIIl.llllIIIlIlllIlIIIIIl(this.lIllllllIIllIlIlIlII * this.IlIlIIIllIIllIlllllI * 0.6000000238418579 / llllIIIIlIIIlIlllIll6, 0.1, this.IIlllIIIlIlllIIlllII * this.IlIlIIIllIIllIlllllI * 0.6000000238418579 / llllIIIIlIIIlIlllIll6);
                                }
                            }
                            if (this.llIllIIIIIllIlIIIIlI instanceof lllIIIIlllllIlIIllIl) {
                                net.minecraft.IllIIlllIIIIlllIIlIl.lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll(lllIIIIlllllIlIIllIl, this.llIllIIIIIllIlIIIIlI);
                                net.minecraft.IllIIlllIIIIlllIIlIl.lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl((lllIIIIlllllIlIIllIl)this.llIllIIIIIllIlIIIIlI, lllIIIIlllllIlIIllIl);
                            }
                            if (this.llIllIIIIIllIlIIIIlI != null && llllIIIIlIIIlIlllIll3.IlIIIlIlIIIllIlIlIIl != this.llIllIIIIIllIlIIIIlI && llllIIIIlIIIlIlllIll3.IlIIIlIlIIIllIlIlIIl instanceof net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll && this.llIllIIIIIllIlIIIIlI instanceof IlIIIlIlIIIllIlIlIIl) {
                                ((IlIIIlIlIIIllIlIlIIl)this.llIllIIIIIllIlIIIIlI).llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(new IlIIlIlIIIlIIlIlIlII(6, 0.0f));
                            }
                        }
                        this.llllIIIIlIIIlIlllIll("random.bowhit", 1.0f, 1.2f / (this.IlIIllIIllIIllIIlIIl.nextFloat() * 0.2f + 0.9f));
                        if (!(llllIIIIlIIIlIlllIll3.IlIIIlIlIIIllIlIlIIl instanceof IlIlIIIllIllIIIIIllI)) {
                            this.IllIllIIIIlIIlIlllII();
                        }
                    }
                    else {
                        this.lIllllllIIllIlIlIlII *= -0.10000000149011612;
                        this.llIIlllIIlllIIllIllI *= -0.10000000149011612;
                        this.IIlllIIIlIlllIIlllII *= -0.10000000149011612;
                        this.IIlIIIIIllIlIIIlIIll += 180.0f;
                        this.IIIllllllIllIIIlllIl += 180.0f;
                        this.llIllIlIIIIllIlIIllI = 0;
                    }
                }
                else {
                    final IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll7 = llllIIIIlIIIlIlllIll3.llllIIIIlIIIlIlllIll();
                    this.IlIIIlIlIIIllIlIlIIl = llllIIIIlIIIlIlllIll7.lIIIIlIIIIIlllIllIII();
                    this.IlIlIIIllIllIIIIIllI = llllIIIIlIIIlIlllIll7.lIIIlllIIIllIIIllIII();
                    this.IllIIlllIIIIlllIIlIl = llllIIIIlIIIlIlllIll7.llIIlIIIlIIIllIlIIIl();
                    final llIIlIIIlIIIllIlIIIl ilIlIlIlIlllllllllIl4 = this.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll7);
                    this.llllIIIlIlllIlIIIIIl = ilIlIlIlIlllllllllIl4.llIllIIIIIllIlIIIIlI();
                    this.lIIIIlIIIIIlllIllIII = this.llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI(ilIlIlIlIlllllllllIl4);
                    this.lIllllllIIllIlIlIlII = (float)(llllIIIIlIIIlIlllIll3.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll - this.IIlllIlIIllIlIlIlIIl);
                    this.llIIlllIIlllIIllIllI = (float)(llllIIIIlIIIlIlllIll3.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl - this.llIIIlIlIllIIlIlIlII);
                    this.IIlllIIIlIlllIIlllII = (float)(llllIIIIlIIIlIlllIll3.llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI - this.lllllIlIIIlIlIIlllII);
                    final float llllIIIIlIIIlIlllIll8 = net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(this.lIllllllIIllIlIlIlII * this.lIllllllIIllIlIlIlII + this.llIIlllIIlllIIllIllI * this.llIIlllIIlllIIllIllI + this.IIlllIIIlIlllIIlllII * this.IIlllIIIlIlllIIlllII);
                    this.IIlllIlIIllIlIlIlIIl -= this.lIllllllIIllIlIlIlII / llllIIIIlIIIlIlllIll8 * 0.05000000074505806;
                    this.llIIIlIlIllIIlIlIlII -= this.llIIlllIIlllIIllIllI / llllIIIIlIIIlIlllIll8 * 0.05000000074505806;
                    this.lllllIlIIIlIlIIlllII -= this.IIlllIIIlIlllIIlllII / llllIIIIlIIIlIlllIll8 * 0.05000000074505806;
                    this.llllIIIIlIIIlIlllIll("random.bowhit", 1.0f, 1.2f / (this.IlIIllIIllIIllIIlIIl.nextFloat() * 0.2f + 0.9f));
                    this.lIIIlllIIIllIIIllIII = true;
                    this.IlIlIlIlIlllllllllIl = 7;
                    this.llllIIIIlIIIlIlllIll(false);
                    if (this.llllIIIlIlllIlIIIIIl.IllIIlllIIIIlllIIlIl() != net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll) {
                        this.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll(this.IlllllllIIIlIIIlIlII, llllIIIIlIIIlIlllIll7, ilIlIlIlIlllllllllIl4, this);
                    }
                }
            }
            if (this.lIIIIlIIIIIlllIllIII()) {
                for (int j = 0; j < 4; ++j) {
                    this.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(net.minecraft.IlllllllIIIlIIIlIlII.IlIllllIIlIIlIlIlIll.llIIlIIIlIIIllIlIIIl, this.IIlllIlIIllIlIlIlIIl + this.lIllllllIIllIlIlIlII * j / 4.0, this.llIIIlIlIllIIlIlIlII + this.llIIlllIIlllIIllIllI * j / 4.0, this.lllllIlIIIlIlIIlllII + this.IIlllIIIlIlllIIlllII * j / 4.0, -this.lIllllllIIllIlIlIlII, -this.llIIlllIIlllIIllIllI + 0.2, -this.IIlllIIIlIlllIIlllII, new int[0]);
                }
            }
            this.IIlllIlIIllIlIlIlIIl += this.lIllllllIIllIlIlIlII;
            this.llIIIlIlIllIIlIlIlII += this.llIIlllIIlllIIllIllI;
            this.lllllIlIIIlIlIIlllII += this.IIlllIIIlIlllIIlllII;
            final float llllIIIIlIIIlIlllIll9 = net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(this.lIllllllIIllIlIlIlII * this.lIllllllIIllIlIlIlII + this.IIlllIIIlIlllIIlllII * this.IIlllIIIlIlllIIlllII);
            this.IIlIIIIIllIlIIIlIIll = (float)(net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.IlIlIlIlIlllllllllIl(this.lIllllllIIllIlIlIlII, this.IIlllIIIlIlllIIlllII) * 180.0 / 3.141592653589793);
            this.llllllIllIllIlIllllI = (float)(net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.IlIlIlIlIlllllllllIl(this.llIIlllIIlllIIllIllI, llllIIIIlIIIlIlllIll9) * 180.0 / 3.141592653589793);
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
            float n5 = 0.99f;
            final float n6 = 0.05f;
            if (this.llIIIlIlllIllIIlIllI()) {
                for (int k = 0; k < 4; ++k) {
                    final float n7 = 0.25f;
                    this.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(net.minecraft.IlllllllIIIlIIIlIlII.IlIllllIIlIIlIlIlIll.IlIlIIIllIllIIIIIllI, this.IIlllIlIIllIlIlIlIIl - this.lIllllllIIllIlIlIlII * n7, this.llIIIlIlIllIIlIlIlII - this.llIIlllIIlllIIllIllI * n7, this.lllllIlIIIlIlIIlllII - this.IIlllIIIlIlllIIlllII * n7, this.lIllllllIIllIlIlIlII, this.llIIlllIIlllIIllIllI, this.IIlllIIIlIlllIIlllII, new int[0]);
                }
                n5 = 0.6f;
            }
            if (this.lIIIIlIlIllllIIlIllI()) {
                this.IlIIlIlIIIlIIlIlIlII();
            }
            this.lIllllllIIllIlIlIlII *= n5;
            this.llIIlllIIlllIIllIllI *= n5;
            this.IIlllIIIlIlllIIlllII *= n5;
            this.llIIlllIIlllIIllIllI -= n6;
            this.IlIlIlIlIlllllllllIl(this.IIlllIlIIllIlIlIlIIl, this.llIIIlIlIllIIlIlIlII, this.lllllIlIIIlIlIIlllII);
            this.IIlIIIlllIllIllIlIII();
        }
    }
    
    public void llllIIIIlIIIlIlllIll(final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll) {
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("xTile", (short)this.IlIIIlIlIIIllIlIlIIl);
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("yTile", (short)this.IlIlIIIllIllIIIIIllI);
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("zTile", (short)this.IllIIlllIIIIlllIIlIl);
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("life", (short)this.llIIlIIIlIIIllIlIIIl);
        final lIllllIllIllIIllllll lIllllIllIllIIllllll = (lIllllIllIllIIllllll)net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(this.llllIIIlIlllIlIIIIIl);
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("inTile", (lIllllIllIllIIllllll == null) ? "" : lIllllIllIllIIllllll.toString());
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("inData", (byte)this.lIIIIlIIIIIlllIllIII);
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("shake", (byte)this.IlIlIlIlIlllllllllIl);
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("inGround", (byte)(this.lIIIlllIIIllIIIllIII ? 1 : 0));
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("pickup", (byte)this.llllIIIIlIIIlIlllIll);
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("damage", this.lIlIlIIIllIIllIIIllI);
    }
    
    public void IlIlIlIlIlllllllllIl(final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll) {
        this.IlIIIlIlIIIllIlIlIIl = iiiIlllIIIIIIlIIIlll.IlIlIIIllIllIIIIIllI("xTile");
        this.IlIlIIIllIllIIIIIllI = iiiIlllIIIIIIlIIIlll.IlIlIIIllIllIIIIIllI("yTile");
        this.IllIIlllIIIIlllIIlIl = iiiIlllIIIIIIlIIIlll.IlIlIIIllIllIIIIIllI("zTile");
        this.llIIlIIIlIIIllIlIIIl = iiiIlllIIIIIIlIIIlll.IlIlIIIllIllIIIIIllI("life");
        if (iiiIlllIIIIIIlIIIlll.IlIlIlIlIlllllllllIl("inTile", 8)) {
            this.llllIIIlIlllIlIIIIIl = net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(iiiIlllIIIIIIlIIIlll.llIIlIIIlIIIllIlIIIl("inTile"));
        }
        else {
            this.llllIIIlIlllIlIIIIIl = net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(iiiIlllIIIIIIlIIIlll.IlIIIlIlIIIllIlIlIIl("inTile") & 0xFF);
        }
        this.lIIIIlIIIIIlllIllIII = (iiiIlllIIIIIIlIIIlll.IlIIIlIlIIIllIlIlIIl("inData") & 0xFF);
        this.IlIlIlIlIlllllllllIl = (iiiIlllIIIIIIlIIIlll.IlIIIlIlIIIllIlIlIIl("shake") & 0xFF);
        this.lIIIlllIIIllIIIllIII = (iiiIlllIIIIIIlIIIlll.IlIIIlIlIIIllIlIlIIl("inGround") == 1);
        if (iiiIlllIIIIIIlIIIlll.IlIlIlIlIlllllllllIl("damage", 99)) {
            this.lIlIlIIIllIIllIIIllI = iiiIlllIIIIIIlIIIlll.lIIIlllIIIllIIIllIII("damage");
        }
        if (iiiIlllIIIIIIlIIIlll.IlIlIlIlIlllllllllIl("pickup", 99)) {
            this.llllIIIIlIIIlIlllIll = iiiIlllIIIIIIlIIIlll.IlIIIlIlIIIllIlIlIIl("pickup");
        }
        else if (iiiIlllIIIIIIlIIIlll.IlIlIlIlIlllllllllIl("player", 99)) {
            this.llllIIIIlIIIlIlllIll = (iiiIlllIIIIIIlIIIlll.IIIIlllIIIIIIlIIIlll("player") ? 1 : 0);
        }
    }
    
    @Override
    public void b_(final net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        if (!this.IlllllllIIIlIIIlIlII.IlIlIllllllllIIIIlII && this.lIIIlllIIIllIIIllIII && this.IlIlIlIlIlllllllllIl <= 0) {
            boolean b = this.llllIIIIlIIIlIlllIll == 1 || (this.llllIIIIlIIIlIlllIll == 2 && llllIIIIlIIIlIlllIll.K.IlIIIlIlIIIllIlIlIIl);
            if (this.llllIIIIlIIIlIlllIll == 1 && !llllIIIIlIIIlIlllIll.lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll(new lllIIIIlIlIllIIlIIIl(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.llllIIIlIlllIlIIIIIl, 1))) {
                b = false;
            }
            if (b) {
                this.llllIIIIlIIIlIlllIll("random.pop", 0.2f, ((this.IlIIllIIllIIllIIlIIl.nextFloat() - this.IlIIllIIllIIllIIlIIl.nextFloat()) * 0.7f + 1.0f) * 2.0f);
                llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(this, 1);
                this.IllIllIIIIlIIlIlllII();
            }
        }
    }
    
    @Override
    protected boolean c_() {
        return false;
    }
    
    public void IlIlIlIlIlllllllllIl(final double lIlIlIIIllIIllIIIllI) {
        this.lIlIlIIIllIIllIIIllI = lIlIlIIIllIIllIIIllI;
    }
    
    public double llllIIIlIlllIlIIIIIl() {
        return this.lIlIlIIIllIIllIIIllI;
    }
    
    public void llllIIIIlIIIlIlllIll(final int ilIlIIIllIIllIlllllI) {
        this.IlIlIIIllIIllIlllllI = ilIlIIIllIIllIlllllI;
    }
    
    @Override
    public boolean i_() {
        return false;
    }
    
    @Override
    public float llllIlIllllIIlIIlIlI() {
        return 0.0f;
    }
    
    public void llllIIIIlIIIlIlllIll(final boolean b) {
        final byte llllIIIIlIIIlIlllIll = this.IIlllIIlllIIIlIlllII.llllIIIIlIIIlIlllIll(16);
        if (b) {
            this.IIlllIIlllIIIlIlllII.IlIlIlIlIlllllllllIl(16, (byte)(llllIIIIlIIIlIlllIll | 0x1));
        }
        else {
            this.IIlllIIlllIIIlIlllII.IlIlIlIlIlllllllllIl(16, (byte)(llllIIIIlIIIlIlllIll & 0xFFFFFFFE));
        }
    }
    
    public boolean lIIIIlIIIIIlllIllIII() {
        return (this.IIlllIIlllIIIlIlllII.llllIIIIlIIIlIlllIll(16) & 0x1) != 0x0;
    }
}
