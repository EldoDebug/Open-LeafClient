package net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl;

import net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.llIllIlIIIIllIlIIllI.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.*;
import java.util.*;
import net.minecraft.llllIIIIlIIIlIlllIll.*;
import net.minecraft.lIlIlIIIllIIllIIIllI.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;

public abstract class llIllIlIIIIllIlIIllI extends llIllIIIIIllIlIIIIlI implements IlIllIlIlIIIlIlIlIII
{
    private boolean llllIIIIlIIIlIlllIll;
    private String IlIlIlIlIlllllllllIl;
    private static final int[][][] llIllIIIIIllIlIIIIlI;
    private int IlIIIlIlIIIllIlIlIIl;
    private double IlIlIIIllIllIIIIIllI;
    private double IllIIlllIIIIlllIIlIl;
    private double llllIIIlIlllIlIIIIIl;
    private double lIIIIlIIIIIlllIllIII;
    private double lIIIlllIIIllIIIllIII;
    private double llIIlIIIlIIIllIlIIIl;
    private double llIllIlIIIIllIlIIllI;
    private double lIlIlIIIllIIllIIIllI;
    private static volatile /* synthetic */ int[] IlIlIIIllIIllIlllllI;
    private static volatile /* synthetic */ int[] IIIIlllIIIIIIlIIIlll;
    
    static {
        llIllIIIIIllIlIIIIlI = new int[][][] { { { 0, 0, -1 }, { 0, 0, 1 } }, { { -1, 0, 0 }, { 1, 0, 0 } }, { { -1, -1, 0 }, { 1, 0, 0 } }, { { -1, 0, 0 }, { 1, -1, 0 } }, { { 0, 0, -1 }, { 0, -1, 1 } }, { { 0, -1, -1 }, { 0, 0, 1 } }, { { 0, 0, 1 }, { 1, 0, 0 } }, { { 0, 0, 1 }, { -1, 0, 0 } }, { { 0, 0, -1 }, { -1, 0, 0 } }, { { 0, 0, -1 }, { 1, 0, 0 } } };
    }
    
    public llIllIlIIIIllIlIIllI(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII) {
        super(illlllllIIIlIIIlIlII);
        this.IlIlIIIIIIlllIlIllIl = true;
        this.llllIIIIlIIIlIlllIll(0.98f, 0.7f);
    }
    
    public static llIllIlIIIIllIlIIllI llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final double n, final double n2, final double n3, final lIlIlIIIllIIllIIIllI lIlIlIIIllIIllIIIllI) {
        switch (IlIlIllllllllIIIIlII()[lIlIlIIIllIIllIIIllI.ordinal()]) {
            case 2: {
                return new IlIlIIIllIIllIlllllI(illlllllIIIlIIIlIlII, n, n2, n3);
            }
            case 3: {
                return new net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl.IlIllIlIlIIIlIlIlIII(illlllllIIIlIIIlIlII, n, n2, n3);
            }
            case 4: {
                return new lllIIIIlllllIlIIllIl(illlllllIIIlIIIlIlII, n, n2, n3);
            }
            case 5: {
                return new llIIIllIlIllIllIIIIl(illlllllIIIlIIIlIlII, n, n2, n3);
            }
            case 6: {
                return new IIlllIIlIllIllIlIIll(illlllllIIIlIIIlIlII, n, n2, n3);
            }
            case 7: {
                return new IIllIIllIIIlIlIIIIlI(illlllllIIIlIIIlIlII, n, n2, n3);
            }
            default: {
                return new llllIIllllIlIlIIIIll(illlllllIIIlIIIlIlII, n, n2, n3);
            }
        }
    }
    
    @Override
    protected boolean c_() {
        return false;
    }
    
    @Override
    protected void a_() {
        this.IIlllIIlllIIIlIlllII.llllIIIIlIIIlIlllIll(17, new Integer(0));
        this.IIlllIIlllIIIlIlllII.llllIIIIlIIIlIlllIll(18, new Integer(1));
        this.IIlllIIlllIIIlIlllII.llllIIIIlIIIlIlllIll(19, new Float(0.0f));
        this.IIlllIIlllIIIlIlllII.llllIIIIlIIIlIlllIll(20, new Integer(0));
        this.IIlllIIlllIIIlIlllII.llllIIIIlIIIlIlllIll(21, new Integer(6));
        this.IIlllIIlllIIIlIlllII.llllIIIIlIIIlIlllIll(22, (Object)0);
    }
    
    @Override
    public llllIIIIlIIIlIlllIll llllIIIlIlllIlIIIIIl(final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI) {
        return llIllIIIIIllIlIIIIlI.g_() ? llIllIIIIIllIlIIIIlI.IlIIlllIIlIlllllIIlI() : null;
    }
    
    @Override
    public llllIIIIlIIIlIlllIll h_() {
        return null;
    }
    
    @Override
    public boolean g_() {
        return true;
    }
    
    public llIllIlIIIIllIlIIllI(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final double iIlIIIIlllIlllllIlII, final double iiIlIIlIIIIlllIlllII, final double ilIlIllllllllIIIIlII) {
        this(illlllllIIIlIIIlIlII);
        this.IlIlIlIlIlllllllllIl(iIlIIIIlllIlllllIlII, iiIlIIlIIIIlllIlllII, ilIlIllllllllIIIIlII);
        this.lIllllllIIllIlIlIlII = 0.0;
        this.llIIlllIIlllIIllIllI = 0.0;
        this.IIlllIIIlIlllIIlllII = 0.0;
        this.IIlIIIIlllIlllllIlII = iIlIIIIlllIlllllIlII;
        this.IIIlIIlIIIIlllIlllII = iiIlIIlIIIIlllIlllII;
        this.IlIlIllllllllIIIIlII = ilIlIllllllllIIIIlII;
    }
    
    @Override
    public double llIllIIlllllllllllll() {
        return 0.0;
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll(final lIllllllIIllIlIlIlII lIllllllIIllIlIlIlII, final float n) {
        if (this.IlllllllIIIlIIIlIlII.IlIlIllllllllIIIIlII || this.IIlIlIlIIlIllIIIIIIl) {
            return true;
        }
        if (this.llllIIIIlIIIlIlllIll(lIllllllIIllIlIlIlII)) {
            return false;
        }
        this.llIllIIIIIllIlIIIIlI(-this.IlIlIIIIIIlllIlIllIl());
        this.IlIlIlIlIlllllllllIl(10);
        this.IIIllIIIlIlIIllIIIlI();
        this.IlIIIlIlIIIllIlIlIIl(this.IIlllIIlIllIllIlIIll() + n * 10.0f);
        final boolean b = lIllllllIIllIlIlIlII.llIIlIIIlIIIllIlIIIl() instanceof net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll && ((net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll)lIllllllIIllIlIlIlII.llIIlIIIlIIIllIlIIIl()).K.IlIIIlIlIIIllIlIlIIl;
        if (b || this.IIlllIIlIllIllIlIIll() > 40.0f) {
            if (this.IIllIIllIIIlIlIIIIlI != null) {
                this.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll((llIllIIIIIllIlIIIIlI)null);
            }
            if (b && !this.w_()) {
                this.IllIllIIIIlIIlIlllII();
            }
            else {
                this.IlIlIlIlIlllllllllIl(lIllllllIIllIlIlIlII);
            }
        }
        return true;
    }
    
    public void IlIlIlIlIlllllllllIl(final lIllllllIIllIlIlIlII lIllllllIIllIlIlIlII) {
        this.IllIllIIIIlIIlIlllII();
        if (this.IlllllllIIIlIIIlIlII.llIIlllIIlllIIllIllI().IlIlIlIlIlllllllllIl("doEntityDrops")) {
            final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl = new lllIIIIlIlIllIIlIIIl(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.lIIIIIlIlIIIlIIIIlIl, 1);
            if (this.IlIlIlIlIlllllllllIl != null) {
                lllIIIIlIlIllIIlIIIl.llllIIIIlIIIlIlllIll(this.IlIlIlIlIlllllllllIl);
            }
            this.llllIIIIlIIIlIlllIll(lllIIIIlIlIllIIlIIIl, 0.0f);
        }
    }
    
    @Override
    public void lllllIIIIIlIIlllIlIl() {
        this.llIllIIIIIllIlIIIIlI(-this.IlIlIIIIIIlllIlIllIl());
        this.IlIlIlIlIlllllllllIl(10);
        this.IlIIIlIlIIIllIlIlIIl(this.IIlllIIlIllIllIlIIll() + this.IIlllIIlIllIllIlIIll() * 10.0f);
    }
    
    @Override
    public boolean IIlllIIlllIIIlIlllII() {
        return !this.IIlIlIlIIlIllIIIIIIl;
    }
    
    @Override
    public void IllIllIIIIlIIlIlllII() {
        super.IllIllIIIIlIIlIlllII();
    }
    
    @Override
    public void IIllIIllIIIlIlIIIIlI() {
        if (this.lllIIIIlllllIlIIllIl() > 0) {
            this.IlIlIlIlIlllllllllIl(this.lllIIIIlllllIlIIllIl() - 1);
        }
        if (this.IIlllIIlIllIllIlIIll() > 0.0f) {
            this.IlIIIlIlIIIllIlIlIIl(this.IIlllIIlIllIllIlIIll() - 1.0f);
        }
        if (this.llIIIlIlIllIIlIlIlII < -64.0) {
            this.IllIlIIllIllIIlIllII();
        }
        if (!this.IlllllllIIIlIIIlIlII.IlIlIllllllllIIIIlII && this.IlllllllIIIlIIIlIlII instanceof IIIllllllIllIIIlllIl) {
            this.IlllllllIIIlIIIlIlII.IIlIIIIlllIlllllIlII.llllIIIIlIIIlIlllIll("portal");
            final net.minecraft.IlIlIIIIIIlllIlIllIl.llllIIIIlIIIlIlllIll llIIIIIIlIllIIlIIIll = ((IIIllllllIllIIIlllIl)this.IlllllllIIIlIIIlIlII).llIIIIIIlIllIIlIIIll();
            final int illIllIlllIllllIIllI = this.IllIllIlllIllllIIllI();
            if (this.IlIIIIIlIIllIIlIlIll) {
                if (llIIIIIIlIllIIlIIIll.lllllIlIIIlIlIIlllII()) {
                    if (this.IIIlIIIlIlIIlllIIlll == null && this.IllllIIlIlIllIIIllII++ >= illIllIlllIllllIIllI) {
                        this.IllllIIlIlIllIIIllII = illIllIlllIllllIIllI;
                        this.lllllIIllIlIllIllllI = this.IllllIIlIlIllIIIllII();
                        int n;
                        if (this.IlllllllIIIlIIIlIlII.IlIllIlIlIIIlIlIlIII.IIlllIIlIllIllIlIIll() == -1) {
                            n = 0;
                        }
                        else {
                            n = -1;
                        }
                        this.lIIIlllIIIllIIIllIII(n);
                    }
                    this.IlIIIIIlIIllIIlIlIll = false;
                }
            }
            else {
                if (this.IllllIIlIlIllIIIllII > 0) {
                    this.IllllIIlIlIllIIIllII -= 4;
                }
                if (this.IllllIIlIlIllIIIllII < 0) {
                    this.IllllIIlIlIllIIIllII = 0;
                }
            }
            if (this.lllllIIllIlIllIllllI > 0) {
                --this.lllllIIllIlIllIllllI;
            }
            this.IlllllllIIIlIIIlIlII.IIlIIIIlllIlllllIlII.IlIlIlIlIlllllllllIl();
        }
        if (this.IlllllllIIIlIIIlIlII.IlIlIllllllllIIIIlII) {
            if (this.IlIIIlIlIIIllIlIlIIl > 0) {
                final double n2 = this.IIlllIlIIllIlIlIlIIl + (this.IlIlIIIllIllIIIIIllI - this.IIlllIlIIllIlIlIlIIl) / this.IlIIIlIlIIIllIlIlIIl;
                final double n3 = this.llIIIlIlIllIIlIlIlII + (this.IllIIlllIIIIlllIIlIl - this.llIIIlIlIllIIlIlIlII) / this.IlIIIlIlIIIllIlIlIIl;
                final double n4 = this.lllllIlIIIlIlIIlllII + (this.llllIIIlIlllIlIIIIIl - this.lllllIlIIIlIlIIlllII) / this.IlIIIlIlIIIllIlIlIIl;
                this.IIlIIIIIllIlIIIlIIll += (float)(net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.llllIIIlIlllIlIIIIIl(this.lIIIIlIIIIIlllIllIII - this.IIlIIIIIllIlIIIlIIll) / this.IlIIIlIlIIIllIlIlIIl);
                this.llllllIllIllIlIllllI += (float)((this.lIIIlllIIIllIIIllIII - this.llllllIllIllIlIllllI) / this.IlIIIlIlIIIllIlIlIIl);
                --this.IlIIIlIlIIIllIlIlIIl;
                this.IlIlIlIlIlllllllllIl(n2, n3, n4);
                this.IlIlIlIlIlllllllllIl(this.IIlIIIIIllIlIIIlIIll, this.llllllIllIllIlIllllI);
            }
            else {
                this.IlIlIlIlIlllllllllIl(this.IIlllIlIIllIlIlIlIIl, this.llIIIlIlIllIIlIlIlII, this.lllllIlIIIlIlIIlllII);
                this.IlIlIlIlIlllllllllIl(this.IIlIIIIIllIlIIIlIIll, this.llllllIllIllIlIllllI);
            }
        }
        else {
            this.IIlIIIIlllIlllllIlII = this.IIlllIlIIllIlIlIlIIl;
            this.IIIlIIlIIIIlllIlllII = this.llIIIlIlIllIIlIlIlII;
            this.IlIlIllllllllIIIIlII = this.lllllIlIIIlIlIIlllII;
            this.llIIlllIIlllIIllIllI -= 0.03999999910593033;
            final int llIllIIIIIllIlIIIIlI = net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(this.IIlllIlIIllIlIlIlIIl);
            int llIllIIIIIllIlIIIIlI2 = net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(this.llIIIlIlIllIIlIlIlII);
            final int llIllIIIIIllIlIIIIlI3 = net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(this.lllllIlIIIlIlIIlllII);
            if (ao.lIIIlllIIIllIIIllIII(this.IlllllllIIIlIIIlIlII, new IlIlIlIlIlllllllllIl(llIllIIIIIllIlIIIIlI, llIllIIIIIllIlIIIIlI2 - 1, llIllIIIIIllIlIIIIlI3))) {
                --llIllIIIIIllIlIIIIlI2;
            }
            final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl = new IlIlIlIlIlllllllllIl(llIllIIIIIllIlIIIIlI, llIllIIIIIllIlIIIIlI2, llIllIIIIIllIlIIIIlI3);
            final llIIlIIIlIIIllIlIIIl ilIlIlIlIlllllllllIl2 = this.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl);
            if (ao.lIIIlllIIIllIIIllIII(ilIlIlIlIlllllllllIl2)) {
                this.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl, ilIlIlIlIlllllllllIl2);
                if (ilIlIlIlIlllllllllIl2.llIllIIIIIllIlIIIIlI() == net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.aw) {
                    this.llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI, llIllIIIIIllIlIIIIlI2, llIllIIIIIllIlIIIIlI3, (boolean)ilIlIlIlIlllllllllIl2.llllIIIIlIIIlIlllIll(at.IlllIIIIlIIIlIlIlIIl));
                }
            }
            else {
                this.llllIIllllIlIlIIIIll();
            }
            this.IIlIIIlllIllIllIlIII();
            this.llllllIllIllIlIllllI = 0.0f;
            final double n5 = this.IIlIIIIlllIlllllIlII - this.IIlllIlIIllIlIlIlIIl;
            final double n6 = this.IlIlIllllllllIIIIlII - this.lllllIlIIIlIlIIlllII;
            if (n5 * n5 + n6 * n6 > 0.001) {
                this.IIlIIIIIllIlIIIlIIll = (float)(net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.IlIlIlIlIlllllllllIl(n6, n5) * 180.0 / 3.141592653589793);
                if (this.llllIIIIlIIIlIlllIll) {
                    this.IIlIIIIIllIlIIIlIIll += 180.0f;
                }
            }
            final double n7 = net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.llllIIIlIlllIlIIIIIl(this.IIlIIIIIllIlIIIlIIll - this.IIIllllllIllIIIlllIl);
            if (n7 < -170.0 || n7 >= 170.0) {
                this.IIlIIIIIllIlIIIlIIll += 180.0f;
                this.llllIIIIlIIIlIlllIll = !this.llllIIIIlIIIlIlllIll;
            }
            this.IlIlIlIlIlllllllllIl(this.IIlIIIIIllIlIIIlIIll, this.llllllIllIllIlIllllI);
            for (final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI4 : this.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(this, this.IlIIlllIIlIlllllIIlI().IlIlIlIlIlllllllllIl(0.20000000298023224, 0.0, 0.20000000298023224))) {
                if (llIllIIIIIllIlIIIIlI4 != this.IIllIIllIIIlIlIIIIlI && llIllIIIIIllIlIIIIlI4.g_() && llIllIIIIIllIlIIIIlI4 instanceof llIllIlIIIIllIlIIllI) {
                    llIllIIIIIllIlIIIIlI4.IllIIlllIIIIlllIIlIl(this);
                }
            }
            if (this.IIllIIllIIIlIlIIIIlI != null && this.IIllIIllIIIlIlIIIIlI.IIlIlIlIIlIllIIIIIIl) {
                if (this.IIllIIllIIIlIlIIIIlI.IIIlIIIlIlIIlllIIlll == this) {
                    this.IIllIIllIIIlIlIIIIlI.IIIlIIIlIlIIlllIIlll = null;
                }
                this.IIllIIllIIIlIlIIIIlI = null;
            }
            this.IlIIllIIllIIllIIlIIl();
        }
    }
    
    protected double lIlIlIIIllIIllIIIllI() {
        return 0.4;
    }
    
    public void llllIIIIlIIIlIlllIll(final int n, final int n2, final int n3, final boolean b) {
    }
    
    protected void llllIIllllIlIlIIIIll() {
        final double lIlIlIIIllIIllIIIllI = this.lIlIlIIIllIIllIIIllI();
        this.lIllllllIIllIlIlIlII = net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(this.lIllllllIIllIlIlIlII, -lIlIlIIIllIIllIIIllI, lIlIlIIIllIIllIIIllI);
        this.IIlllIIIlIlllIIlllII = net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(this.IIlllIIIlIlllIIlllII, -lIlIlIIIllIIllIIIllI, lIlIlIIIllIIllIIIllI);
        if (this.IIIIIllIIIIlIIIIllIl) {
            this.lIllllllIIllIlIlIlII *= 0.5;
            this.llIIlllIIlllIIllIllI *= 0.5;
            this.IIlllIIIlIlllIIlllII *= 0.5;
        }
        this.IlIIIlIlIIIllIlIlIIl(this.lIllllllIIllIlIlIlII, this.llIIlllIIlllIIllIllI, this.IIlllIIIlIlllIIlllII);
        if (!this.IIIIIllIIIIlIIIIllIl) {
            this.lIllllllIIllIlIlIlII *= 0.949999988079071;
            this.llIIlllIIlllIIllIllI *= 0.949999988079071;
            this.IIlllIIIlIlllIIlllII *= 0.949999988079071;
        }
    }
    
    protected void llllIIIIlIIIlIlllIll(final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl) {
        this.IllIlIIllIllIIlIllII = 0.0f;
        final e llIllIlIIIIllIlIIllI = this.llIllIlIIIIllIlIIllI(this.IIlllIlIIllIlIlIlIIl, this.llIIIlIlIllIIlIlIlII, this.lllllIlIIIlIlIIlllII);
        this.llIIIlIlIllIIlIlIlII = ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII();
        boolean booleanValue = false;
        int n = 0;
        final ao ao = (ao)llIIlIIIlIIIllIlIIIl.llIllIIIIIllIlIIIIlI();
        if (ao == net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lIllllllIIllIlIlIlII) {
            booleanValue = (boolean)llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(at.IlllIIIIlIIIlIlIlIIl);
            n = (booleanValue ? 0 : 1);
        }
        final ap ap = (ap)llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(ao.IllIllIIIIlIIlIlllII());
        switch (IIlllIlIIllIlIlIlIIl()[ap.ordinal()]) {
            case 3: {
                this.lIllllllIIllIlIlIlII -= 0.0078125;
                ++this.llIIIlIlIllIIlIlIlII;
                break;
            }
            case 4: {
                this.lIllllllIIllIlIlIlII += 0.0078125;
                ++this.llIIIlIlIllIIlIlIlII;
                break;
            }
            case 5: {
                this.IIlllIIIlIlllIIlllII += 0.0078125;
                ++this.llIIIlIlIllIIlIlIlII;
                break;
            }
            case 6: {
                this.IIlllIIIlIlllIIlllII -= 0.0078125;
                ++this.llIIIlIlIllIIlIlIlII;
                break;
            }
        }
        final int[][] array = net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl.llIllIlIIIIllIlIIllI.llIllIIIIIllIlIIIIlI[ap.IlIlIlIlIlllllllllIl()];
        double n2 = array[1][0] - array[0][0];
        double n3 = array[1][2] - array[0][2];
        final double sqrt = Math.sqrt(n2 * n2 + n3 * n3);
        if (this.lIllllllIIllIlIlIlII * n2 + this.IIlllIIIlIlllIIlllII * n3 < 0.0) {
            n2 = -n2;
            n3 = -n3;
        }
        double sqrt2 = Math.sqrt(this.lIllllllIIllIlIlIlII * this.lIllllllIIllIlIlIlII + this.IIlllIIIlIlllIIlllII * this.IIlllIIIlIlllIIlllII);
        if (sqrt2 > 2.0) {
            sqrt2 = 2.0;
        }
        this.lIllllllIIllIlIlIlII = sqrt2 * n2 / sqrt;
        this.IIlllIIIlIlllIIlllII = sqrt2 * n3 / sqrt;
        if (this.IIllIIllIIIlIlIIIIlI instanceof net.minecraft.llllIIIlIlllIlIIIIIl.lllIIIIlllllIlIIllIl && ((net.minecraft.llllIIIlIlllIlIIIIIl.lllIIIIlllllIlIIllIl)this.IIllIIllIIIlIlIIIIlI).l > 0.0) {
            final double n4 = -Math.sin(this.IIllIIllIIIlIlIIIIlI.IIlIIIIIllIlIIIlIIll * 3.1415927f / 180.0f);
            final double cos = Math.cos(this.IIllIIllIIIlIlIIIIlI.IIlIIIIIllIlIIIlIIll * 3.1415927f / 180.0f);
            if (this.lIllllllIIllIlIlIlII * this.lIllllllIIllIlIlIlII + this.IIlllIIIlIlllIIlllII * this.IIlllIIIlIlllIIlllII < 0.01) {
                this.lIllllllIIllIlIlIlII += n4 * 0.1;
                this.IIlllIIIlIlllIIlllII += cos * 0.1;
                n = 0;
            }
        }
        if (n != 0) {
            if (Math.sqrt(this.lIllllllIIllIlIlIlII * this.lIllllllIIllIlIlIlII + this.IIlllIIIlIlllIIlllII * this.IIlllIIIlIlllIIlllII) < 0.03) {
                this.lIllllllIIllIlIlIlII *= 0.0;
                this.llIIlllIIlllIIllIllI *= 0.0;
                this.IIlllIIIlIlllIIlllII *= 0.0;
            }
            else {
                this.lIllllllIIllIlIlIlII *= 0.5;
                this.llIIlllIIlllIIllIllI *= 0.0;
                this.IIlllIIIlIlllIIlllII *= 0.5;
            }
        }
        final double n5 = ilIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII() + 0.5 + array[0][0] * 0.5;
        final double n6 = ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl() + 0.5 + array[0][2] * 0.5;
        final double n7 = ilIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII() + 0.5 + array[1][0] * 0.5;
        final double n8 = ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl() + 0.5 + array[1][2] * 0.5;
        final double n9 = n7 - n5;
        final double n10 = n8 - n6;
        double n11;
        if (n9 == 0.0) {
            this.IIlllIlIIllIlIlIlIIl = ilIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII() + 0.5;
            n11 = this.lllllIlIIIlIlIIlllII - ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl();
        }
        else if (n10 == 0.0) {
            this.lllllIlIIIlIlIIlllII = ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl() + 0.5;
            n11 = this.IIlllIlIIllIlIlIlIIl - ilIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII();
        }
        else {
            n11 = ((this.IIlllIlIIllIlIlIlIIl - n5) * n9 + (this.lllllIlIIIlIlIIlllII - n6) * n10) * 2.0;
        }
        this.IIlllIlIIllIlIlIlIIl = n5 + n9 * n11;
        this.lllllIlIIIlIlIIlllII = n6 + n10 * n11;
        this.IlIlIlIlIlllllllllIl(this.IIlllIlIIllIlIlIlIIl, this.llIIIlIlIllIIlIlIlII, this.lllllIlIIIlIlIIlllII);
        double lIllllllIIllIlIlIlII = this.lIllllllIIllIlIlIlII;
        double iIlllIIIlIlllIIlllII = this.IIlllIIIlIlllIIlllII;
        if (this.IIllIIllIIIlIlIIIIlI != null) {
            lIllllllIIllIlIlIlII *= 0.75;
            iIlllIIIlIlllIIlllII *= 0.75;
        }
        final double lIlIlIIIllIIllIIIllI = this.lIlIlIIIllIIllIIIllI();
        this.IlIIIlIlIIIllIlIlIIl(net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(lIllllllIIllIlIlIlII, -lIlIlIIIllIIllIIIllI, lIlIlIIIllIIllIIIllI), 0.0, net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(iIlllIIIlIlllIIlllII, -lIlIlIIIllIIllIIIllI, lIlIlIIIllIIllIIIllI));
        if (array[0][1] != 0 && net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(this.IIlllIlIIllIlIlIlIIl) - ilIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII() == array[0][0] && net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(this.lllllIlIIIlIlIIlllII) - ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl() == array[0][2]) {
            this.IlIlIlIlIlllllllllIl(this.IIlllIlIIllIlIlIlIIl, this.llIIIlIlIllIIlIlIlII + array[0][1], this.lllllIlIIIlIlIIlllII);
        }
        else if (array[1][1] != 0 && net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(this.IIlllIlIIllIlIlIlIIl) - ilIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII() == array[1][0] && net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(this.lllllIlIIIlIlIIlllII) - ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl() == array[1][2]) {
            this.IlIlIlIlIlllllllllIl(this.IIlllIlIIllIlIlIlIIl, this.llIIIlIlIllIIlIlIlII + array[1][1], this.lllllIlIIIlIlIIlllII);
        }
        this.IlIllIlIlIIIlIlIlIII();
        final e llIllIlIIIIllIlIIllI2 = this.llIllIlIIIIllIlIIllI(this.IIlllIlIIllIlIlIlIIl, this.llIIIlIlIllIIlIlIlII, this.lllllIlIIIlIlIIlllII);
        if (llIllIlIIIIllIlIIllI2 != null && llIllIlIIIIllIlIIllI != null) {
            final double n12 = (llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl - llIllIlIIIIllIlIIllI2.IlIlIlIlIlllllllllIl) * 0.05;
            final double sqrt3 = Math.sqrt(this.lIllllllIIllIlIlIlII * this.lIllllllIIllIlIlIlII + this.IIlllIIIlIlllIIlllII * this.IIlllIIIlIlllIIlllII);
            if (sqrt3 > 0.0) {
                this.lIllllllIIllIlIlIlII = this.lIllllllIIllIlIlIlII / sqrt3 * (sqrt3 + n12);
                this.IIlllIIIlIlllIIlllII = this.IIlllIIIlIlllIIlllII / sqrt3 * (sqrt3 + n12);
            }
            this.IlIlIlIlIlllllllllIl(this.IIlllIlIIllIlIlIlIIl, llIllIlIIIIllIlIIllI2.IlIlIlIlIlllllllllIl, this.lllllIlIIIlIlIIlllII);
        }
        final int llIllIIIIIllIlIIIIlI = net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(this.IIlllIlIIllIlIlIlIIl);
        final int llIllIIIIIllIlIIIIlI2 = net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(this.lllllIlIIIlIlIIlllII);
        if (llIllIIIIIllIlIIIIlI != ilIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII() || llIllIIIIIllIlIIIIlI2 != ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl()) {
            final double sqrt4 = Math.sqrt(this.lIllllllIIllIlIlIlII * this.lIllllllIIllIlIlIlII + this.IIlllIIIlIlllIIlllII * this.IIlllIIIlIlllIIlllII);
            this.lIllllllIIllIlIlIlII = sqrt4 * (llIllIIIIIllIlIIIIlI - ilIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII());
            this.IIlllIIIlIlllIIlllII = sqrt4 * (llIllIIIIIllIlIIIIlI2 - ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl());
        }
        if (booleanValue) {
            final double sqrt5 = Math.sqrt(this.lIllllllIIllIlIlIlII * this.lIllllllIIllIlIlIlII + this.IIlllIIIlIlllIIlllII * this.IIlllIIIlIlllIIlllII);
            if (sqrt5 > 0.01) {
                final double n13 = 0.06;
                this.lIllllllIIllIlIlIlII += this.lIllllllIIllIlIlIlII / sqrt5 * n13;
                this.IIlllIIIlIlllIIlllII += this.IIlllIIIlIlllIIlllII / sqrt5 * n13;
            }
            else if (ap == net.minecraft.llllIIIIlIIIlIlllIll.ap.IlIlIlIlIlllllllllIl) {
                if (this.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl.IlIlIIIllIllIIIIIllI()).llIllIIIIIllIlIIIIlI().lIIIIlIIIIIlllIllIII()) {
                    this.lIllllllIIllIlIlIlII = 0.02;
                }
                else if (this.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl.IllIIlllIIIIlllIIlIl()).llIllIIIIIllIlIIIIlI().lIIIIlIIIIIlllIllIII()) {
                    this.lIllllllIIllIlIlIlII = -0.02;
                }
            }
            else if (ap == net.minecraft.llllIIIIlIIIlIlllIll.ap.llllIIIIlIIIlIlllIll) {
                if (this.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI()).llIllIIIIIllIlIIIIlI().lIIIIlIIIIIlllIllIII()) {
                    this.IIlllIIIlIlllIIlllII = 0.02;
                }
                else if (this.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl.IlIIIlIlIIIllIlIlIIl()).llIllIIIIIllIlIIIIlI().lIIIIlIIIIIlllIllIII()) {
                    this.IIlllIIIlIlllIIlllII = -0.02;
                }
            }
        }
    }
    
    protected void IlIllIlIlIIIlIlIlIII() {
        if (this.IIllIIllIIIlIlIIIIlI != null) {
            this.lIllllllIIllIlIlIlII *= 0.996999979019165;
            this.llIIlllIIlllIIllIllI *= 0.0;
            this.IIlllIIIlIlllIIlllII *= 0.996999979019165;
        }
        else {
            this.lIllllllIIllIlIlIlII *= 0.9599999785423279;
            this.llIIlllIIlllIIllIllI *= 0.0;
            this.IIlllIIIlIlllIIlllII *= 0.9599999785423279;
        }
    }
    
    @Override
    public void IlIlIlIlIlllllllllIl(final double iIlllIlIIllIlIlIlIIl, final double llIIIlIlIllIIlIlIlII, final double lllllIlIIIlIlIIlllII) {
        this.IIlllIlIIllIlIlIlIIl = iIlllIlIIllIlIlIlIIl;
        this.llIIIlIlIllIIlIlIlII = llIIIlIlIllIIlIlIlII;
        this.lllllIlIIIlIlIIlllII = lllllIlIIIlIlIIlllII;
        final float n = this.IllIllIIIIlIIlIlllII / 2.0f;
        this.llllIIIIlIIIlIlllIll(new llllIIIIlIIIlIlllIll(iIlllIlIIllIlIlIlIIl - n, llIIIlIlIllIIlIlIlII, lllllIlIIIlIlIIlllII - n, iIlllIlIIllIlIlIlIIl + n, llIIIlIlIllIIlIlIlII + this.IlIllllIIlIIlIlIlIll, lllllIlIIIlIlIIlllII + n));
    }
    
    public e llllIIIIlIIIlIlllIll(double n, double n2, double n3, final double n4) {
        final int llIllIIIIIllIlIIIIlI = net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(n);
        int llIllIIIIIllIlIIIIlI2 = net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(n2);
        final int llIllIIIIIllIlIIIIlI3 = net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(n3);
        if (ao.lIIIlllIIIllIIIllIII(this.IlllllllIIIlIIIlIlII, new IlIlIlIlIlllllllllIl(llIllIIIIIllIlIIIIlI, llIllIIIIIllIlIIIIlI2 - 1, llIllIIIIIllIlIIIIlI3))) {
            --llIllIIIIIllIlIIIIlI2;
        }
        final llIIlIIIlIIIllIlIIIl ilIlIlIlIlllllllllIl = this.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(new IlIlIlIlIlllllllllIl(llIllIIIIIllIlIIIIlI, llIllIIIIIllIlIIIIlI2, llIllIIIIIllIlIIIIlI3));
        if (ao.lIIIlllIIIllIIIllIII(ilIlIlIlIlllllllllIl)) {
            final ap ap = (ap)ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(((ao)ilIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI()).IllIllIIIIlIIlIlllII());
            n2 = llIllIIIIIllIlIIIIlI2;
            if (ap.llIllIIIIIllIlIIIIlI()) {
                n2 = llIllIIIIIllIlIIIIlI2 + 1;
            }
            final int[][] array = net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl.llIllIlIIIIllIlIIllI.llIllIIIIIllIlIIIIlI[ap.IlIlIlIlIlllllllllIl()];
            final double n5 = array[1][0] - array[0][0];
            final double n6 = array[1][2] - array[0][2];
            final double sqrt = Math.sqrt(n5 * n5 + n6 * n6);
            final double n7 = n5 / sqrt;
            final double n8 = n6 / sqrt;
            n += n7 * n4;
            n3 += n8 * n4;
            if (array[0][1] != 0 && net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(n) - llIllIIIIIllIlIIIIlI == array[0][0] && net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(n3) - llIllIIIIIllIlIIIIlI3 == array[0][2]) {
                n2 += array[0][1];
            }
            else if (array[1][1] != 0 && net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(n) - llIllIIIIIllIlIIIIlI == array[1][0] && net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(n3) - llIllIIIIIllIlIIIIlI3 == array[1][2]) {
                n2 += array[1][1];
            }
            return this.llIllIlIIIIllIlIIllI(n, n2, n3);
        }
        return null;
    }
    
    public e llIllIlIIIIllIlIIllI(double n, double n2, double n3) {
        final int llIllIIIIIllIlIIIIlI = net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(n);
        int llIllIIIIIllIlIIIIlI2 = net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(n2);
        final int llIllIIIIIllIlIIIIlI3 = net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(n3);
        if (ao.lIIIlllIIIllIIIllIII(this.IlllllllIIIlIIIlIlII, new IlIlIlIlIlllllllllIl(llIllIIIIIllIlIIIIlI, llIllIIIIIllIlIIIIlI2 - 1, llIllIIIIIllIlIIIIlI3))) {
            --llIllIIIIIllIlIIIIlI2;
        }
        final llIIlIIIlIIIllIlIIIl ilIlIlIlIlllllllllIl = this.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(new IlIlIlIlIlllllllllIl(llIllIIIIIllIlIIIIlI, llIllIIIIIllIlIIIIlI2, llIllIIIIIllIlIIIIlI3));
        if (ao.lIIIlllIIIllIIIllIII(ilIlIlIlIlllllllllIl)) {
            final int[][] array = net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl.llIllIlIIIIllIlIIllI.llIllIIIIIllIlIIIIlI[((ap)ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(((ao)ilIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI()).IllIllIIIIlIIlIlllII())).IlIlIlIlIlllllllllIl()];
            final double n4 = llIllIIIIIllIlIIIIlI + 0.5 + array[0][0] * 0.5;
            final double n5 = llIllIIIIIllIlIIIIlI2 + 0.0625 + array[0][1] * 0.5;
            final double n6 = llIllIIIIIllIlIIIIlI3 + 0.5 + array[0][2] * 0.5;
            final double n7 = llIllIIIIIllIlIIIIlI + 0.5 + array[1][0] * 0.5;
            final double n8 = llIllIIIIIllIlIIIIlI2 + 0.0625 + array[1][1] * 0.5;
            final double n9 = llIllIIIIIllIlIIIIlI3 + 0.5 + array[1][2] * 0.5;
            final double n10 = n7 - n4;
            final double n11 = (n8 - n5) * 2.0;
            final double n12 = n9 - n6;
            double n13;
            if (n10 == 0.0) {
                n = llIllIIIIIllIlIIIIlI + 0.5;
                n13 = n3 - llIllIIIIIllIlIIIIlI3;
            }
            else if (n12 == 0.0) {
                n3 = llIllIIIIIllIlIIIIlI3 + 0.5;
                n13 = n - llIllIIIIIllIlIIIIlI;
            }
            else {
                n13 = ((n - n4) * n10 + (n3 - n6) * n12) * 2.0;
            }
            n = n4 + n10 * n13;
            n2 = n5 + n11 * n13;
            n3 = n6 + n12 * n13;
            if (n11 < 0.0) {
                ++n2;
            }
            if (n11 > 0.0) {
                n2 += 0.5;
            }
            return new e(n, n2, n3);
        }
        return null;
    }
    
    @Override
    protected void IlIlIlIlIlllllllllIl(final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll) {
        if (iiiIlllIIIIIIlIIIlll.IIIIlllIIIIIIlIIIlll("CustomDisplayTile")) {
            final int illIIlllIIIIlllIIlIl = iiiIlllIIIIIIlIIIlll.IllIIlllIIIIlllIIlIl("DisplayData");
            if (iiiIlllIIIIIIlIIIlll.IlIlIlIlIlllllllllIl("DisplayTile", 8)) {
                final net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll = net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(iiiIlllIIIIIIlIIIlll.llIIlIIIlIIIllIlIIIl("DisplayTile"));
                if (llllIIIIlIIIlIlllIll == null) {
                    this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.lllIllIIIllllllIllll());
                }
                else {
                    this.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI(illIIlllIIIIlllIIlIl));
                }
            }
            else {
                final net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll2 = net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(iiiIlllIIIIIIlIIIlll.IllIIlllIIIIlllIIlIl("DisplayTile"));
                if (llllIIIIlIIIlIlllIll2 == null) {
                    this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.lllIllIIIllllllIllll());
                }
                else {
                    this.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll2.llIllIIIIIllIlIIIIlI(illIIlllIIIIlllIIlIl));
                }
            }
            this.llIllIlIIIIllIlIIllI(iiiIlllIIIIIIlIIIlll.IllIIlllIIIIlllIIlIl("DisplayOffset"));
        }
        if (iiiIlllIIIIIIlIIIlll.IlIlIlIlIlllllllllIl("CustomName", 8) && iiiIlllIIIIIIlIIIlll.llIIlIIIlIIIllIlIIIl("CustomName").length() > 0) {
            this.IlIlIlIlIlllllllllIl = iiiIlllIIIIIIlIIIlll.llIIlIIIlIIIllIlIIIl("CustomName");
        }
    }
    
    @Override
    protected void llllIIIIlIIIlIlllIll(final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll) {
        if (this.IIIlIIlIIIIlllIlllII()) {
            iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("CustomDisplayTile", true);
            final llIIlIIIlIIIllIlIIIl iiIlIIIlIlIIlllIIlll = this.IIIlIIIlIlIIlllIIlll();
            final lIllllIllIllIIllllll lIllllIllIllIIllllll = (lIllllIllIllIIllllll)net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(iiIlIIIlIlIIlllIIlll.llIllIIIIIllIlIIIIlI());
            iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("DisplayTile", (lIllllIllIllIIllllll == null) ? "" : lIllllIllIllIIllllll.toString());
            iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("DisplayData", iiIlIIIlIlIIlllIIlll.llIllIIIIIllIlIIIIlI().llIllIIIIIllIlIIIIlI(iiIlIIIlIlIIlllIIlll));
            iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("DisplayOffset", this.IlllllllIIIlIIIlIlII());
        }
        if (this.IlIlIlIlIlllllllllIl != null && this.IlIlIlIlIlllllllllIl.length() > 0) {
            iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("CustomName", this.IlIlIlIlIlllllllllIl);
        }
    }
    
    @Override
    public void IllIIlllIIIIlllIIlIl(final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI) {
        if (!this.IlllllllIIIlIIIlIlII.IlIlIllllllllIIIIlII && !llIllIIIIIllIlIIIIlI.lIIIIlIlIllllIIlIllI && !this.lIIIIlIlIllllIIlIllI && llIllIIIIIllIlIIIIlI != this.IIllIIllIIIlIlIIIIlI) {
            if (llIllIIIIIllIlIIIIlI instanceof net.minecraft.llllIIIlIlllIlIIIIIl.lllIIIIlllllIlIIllIl && !(llIllIIIIIllIlIIIIlI instanceof net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll) && !(llIllIIIIIllIlIIIIlI instanceof net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIIIllIllIIIIIllI.IlllllllIIIlIIIlIlII) && this.llllIIIlIlllIlIIIIIl() == net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl.lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll && this.lIllllllIIllIlIlIlII * this.lIllllllIIllIlIlIlII + this.IIlllIIIlIlllIIlllII * this.IIlllIIIlIlllIIlllII > 0.01 && this.IIllIIllIIIlIlIIIIlI == null && llIllIIIIIllIlIIIIlI.IIIlIIIlIlIIlllIIlll == null) {
                llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(this);
            }
            final double n = llIllIIIIIllIlIIIIlI.IIlllIlIIllIlIlIlIIl - this.IIlllIlIIllIlIlIlIIl;
            final double n2 = llIllIIIIIllIlIIIIlI.lllllIlIIIlIlIIlllII - this.lllllIlIIIlIlIIlllII;
            final double n3 = n * n + n2 * n2;
            if (n3 >= 9.999999747378752E-5) {
                final double n4 = net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(n3);
                final double n5 = n / n4;
                final double n6 = n2 / n4;
                double n7 = 1.0 / n4;
                if (n7 > 1.0) {
                    n7 = 1.0;
                }
                final double n8 = n5 * n7;
                final double n9 = n6 * n7;
                final double n10 = n8 * 0.10000000149011612;
                final double n11 = n9 * 0.10000000149011612;
                final double n12 = n10 * (1.0f - this.llIIIlIlllIllIIlIllI);
                final double n13 = n11 * (1.0f - this.llIIIlIlllIllIIlIllI);
                final double n14 = n12 * 0.5;
                final double n15 = n13 * 0.5;
                if (llIllIIIIIllIlIIIIlI instanceof llIllIlIIIIllIlIIllI) {
                    if (Math.abs(new e(llIllIIIIIllIlIIIIlI.IIlllIlIIllIlIlIlIIl - this.IIlllIlIIllIlIlIlIIl, 0.0, llIllIIIIIllIlIIIIlI.lllllIlIIIlIlIIlllII - this.lllllIlIIIlIlIIlllII).llllIIIIlIIIlIlllIll().IlIlIlIlIlllllllllIl(new e(net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.IlIlIlIlIlllllllllIl(this.IIlIIIIIllIlIIIlIIll * 3.1415927f / 180.0f), 0.0, net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(this.IIlIIIIIllIlIIIlIIll * 3.1415927f / 180.0f)).llllIIIIlIIIlIlllIll())) < 0.800000011920929) {
                        return;
                    }
                    final double n16 = llIllIIIIIllIlIIIIlI.lIllllllIIllIlIlIlII + this.lIllllllIIllIlIlIlII;
                    final double n17 = llIllIIIIIllIlIIIIlI.IIlllIIIlIlllIIlllII + this.IIlllIIIlIlllIIlllII;
                    if (((llIllIlIIIIllIlIIllI)llIllIIIIIllIlIIIIlI).llllIIIlIlllIlIIIIIl() == net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl.lIlIlIIIllIIllIIIllI.llIllIIIIIllIlIIIIlI && this.llllIIIlIlllIlIIIIIl() != net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl.lIlIlIIIllIIllIIIllI.llIllIIIIIllIlIIIIlI) {
                        this.lIllllllIIllIlIlIlII *= 0.20000000298023224;
                        this.IIlllIIIlIlllIIlllII *= 0.20000000298023224;
                        this.llllIIIlIlllIlIIIIIl(llIllIIIIIllIlIIIIlI.lIllllllIIllIlIlIlII - n14, 0.0, llIllIIIIIllIlIIIIlI.IIlllIIIlIlllIIlllII - n15);
                        llIllIIIIIllIlIIIIlI.lIllllllIIllIlIlIlII *= 0.949999988079071;
                        llIllIIIIIllIlIIIIlI.IIlllIIIlIlllIIlllII *= 0.949999988079071;
                    }
                    else if (((llIllIlIIIIllIlIIllI)llIllIIIIIllIlIIIIlI).llllIIIlIlllIlIIIIIl() != net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl.lIlIlIIIllIIllIIIllI.llIllIIIIIllIlIIIIlI && this.llllIIIlIlllIlIIIIIl() == net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl.lIlIlIIIllIIllIIIllI.llIllIIIIIllIlIIIIlI) {
                        llIllIIIIIllIlIIIIlI.lIllllllIIllIlIlIlII *= 0.20000000298023224;
                        llIllIIIIIllIlIIIIlI.IIlllIIIlIlllIIlllII *= 0.20000000298023224;
                        llIllIIIIIllIlIIIIlI.llllIIIlIlllIlIIIIIl(this.lIllllllIIllIlIlIlII + n14, 0.0, this.IIlllIIIlIlllIIlllII + n15);
                        this.lIllllllIIllIlIlIlII *= 0.949999988079071;
                        this.IIlllIIIlIlllIIlllII *= 0.949999988079071;
                    }
                    else {
                        final double n18 = n16 / 2.0;
                        final double n19 = n17 / 2.0;
                        this.lIllllllIIllIlIlIlII *= 0.20000000298023224;
                        this.IIlllIIIlIlllIIlllII *= 0.20000000298023224;
                        this.llllIIIlIlllIlIIIIIl(n18 - n14, 0.0, n19 - n15);
                        llIllIIIIIllIlIIIIlI.lIllllllIIllIlIlIlII *= 0.20000000298023224;
                        llIllIIIIIllIlIIIIlI.IIlllIIIlIlllIIlllII *= 0.20000000298023224;
                        llIllIIIIIllIlIIIIlI.llllIIIlIlllIlIIIIIl(n18 + n14, 0.0, n19 + n15);
                    }
                }
                else {
                    this.llllIIIlIlllIlIIIIIl(-n14, 0.0, -n15);
                    llIllIIIIIllIlIIIIlI.llllIIIlIlllIlIIIIIl(n14 / 4.0, 0.0, n15 / 4.0);
                }
            }
        }
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final double ilIlIIIllIllIIIIIllI, final double illIIlllIIIIlllIIlIl, final double llllIIIlIlllIlIIIIIl, final float n, final float n2, final int n3, final boolean b) {
        this.IlIlIIIllIllIIIIIllI = ilIlIIIllIllIIIIIllI;
        this.IllIIlllIIIIlllIIlIl = illIIlllIIIIlllIIlIl;
        this.llllIIIlIlllIlIIIIIl = llllIIIlIlllIlIIIIIl;
        this.lIIIIlIIIIIlllIllIII = n;
        this.lIIIlllIIIllIIIllIII = n2;
        this.IlIIIlIlIIIllIlIlIIl = n3 + 2;
        this.lIllllllIIllIlIlIlII = this.llIIlIIIlIIIllIlIIIl;
        this.llIIlllIIlllIIllIllI = this.llIllIlIIIIllIlIIllI;
        this.IIlllIIIlIlllIIlllII = this.lIlIlIIIllIIllIIIllI;
    }
    
    @Override
    public void lIIIlllIIIllIIIllIII(final double n, final double n2, final double n3) {
        this.lIllllllIIllIlIlIlII = n;
        this.llIIlIIIlIIIllIlIIIl = n;
        this.llIIlllIIlllIIllIllI = n2;
        this.llIllIlIIIIllIlIIllI = n2;
        this.IIlllIIIlIlllIIlllII = n3;
        this.lIlIlIIIllIIllIIIllI = n3;
    }
    
    public void IlIIIlIlIIIllIlIlIIl(final float n) {
        this.IIlllIIlllIIIlIlllII.IlIlIlIlIlllllllllIl(19, n);
    }
    
    public float IIlllIIlIllIllIlIIll() {
        return this.IIlllIIlllIIIlIlllII.IlIIIlIlIIIllIlIlIIl(19);
    }
    
    public void IlIlIlIlIlllllllllIl(final int n) {
        this.IIlllIIlllIIIlIlllII.IlIlIlIlIlllllllllIl(17, n);
    }
    
    public int lllIIIIlllllIlIIllIl() {
        return this.IIlllIIlllIIIlIlllII.llIllIIIIIllIlIIIIlI(17);
    }
    
    public void llIllIIIIIllIlIIIIlI(final int n) {
        this.IIlllIIlllIIIlIlllII.IlIlIlIlIlllllllllIl(18, n);
    }
    
    public int IlIlIIIIIIlllIlIllIl() {
        return this.IIlllIIlllIIIlIlllII.llIllIIIIIllIlIIIIlI(18);
    }
    
    public abstract lIlIlIIIllIIllIIIllI llllIIIlIlllIlIIIIIl();
    
    public llIIlIIIlIIIllIlIIIl IIIlIIIlIlIIlllIIlll() {
        return this.IIIlIIlIIIIlllIlllII() ? net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(this.llIllIlIlIIIIIIIllII().llIllIIIIIllIlIIIIlI(20)) : this.lIIIIlIIIIIlllIllIII();
    }
    
    public llIIlIIIlIIIllIlIIIl lIIIIlIIIIIlllIllIII() {
        return net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.lllIllIIIllllllIllll();
    }
    
    public int IlllllllIIIlIIIlIlII() {
        return this.IIIlIIlIIIIlllIlllII() ? this.llIllIlIlIIIIIIIllII().llIllIIIIIllIlIIIIlI(21) : this.IIlIIIIlllIlllllIlII();
    }
    
    public int IIlIIIIlllIlllllIlII() {
        return 6;
    }
    
    public void llllIIIIlIIIlIlllIll(final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl) {
        this.llIllIlIlIIIIIIIllII().IlIlIlIlIlllllllllIl(20, net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(llIIlIIIlIIIllIlIIIl));
        this.llllIIIIlIIIlIlllIll(true);
    }
    
    public void llIllIlIIIIllIlIIllI(final int n) {
        this.llIllIlIlIIIIIIIllII().IlIlIlIlIlllllllllIl(21, n);
        this.llllIIIIlIIIlIlllIll(true);
    }
    
    public boolean IIIlIIlIIIIlllIlllII() {
        return this.llIllIlIlIIIIIIIllII().llllIIIIlIIIlIlllIll(22) == 1;
    }
    
    public void llllIIIIlIIIlIlllIll(final boolean b) {
        this.llIllIlIlIIIIIIIllII().IlIlIlIlIlllllllllIl(22, (byte)(byte)(b ? 1 : 0));
    }
    
    @Override
    public void IlIIIlIlIIIllIlIlIIl(final String ilIlIlIlIlllllllllIl) {
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
    }
    
    @Override
    public String s_() {
        return (this.IlIlIlIlIlllllllllIl != null) ? this.IlIlIlIlIlllllllllIl : super.s_();
    }
    
    @Override
    public boolean w_() {
        return this.IlIlIlIlIlllllllllIl != null;
    }
    
    @Override
    public String lIllIlIIIllllllIIlII() {
        return this.IlIlIlIlIlllllllllIl;
    }
    
    @Override
    public llIIIIIIlIllIIlIIIll v_() {
        if (this.w_()) {
            final IlIlIIIIIIlllIlIllIl ilIlIIIIIIlllIlIllIl = new IlIlIIIIIIlllIlIllIl(this.IlIlIlIlIlllllllllIl);
            ilIlIIIIIIlllIlIllIl.llllIIIlIlllIlIIIIIl().llllIIIIlIIIlIlllIll(this.lIIlIIIIIIIlIIlIlIIl());
            ilIlIIIIIIlllIlIllIl.llllIIIlIlllIlIIIIIl().llllIIIIlIIIlIlllIll(this.lllIIIIlIlIllIIlIIIl().toString());
            return ilIlIIIIIIlllIlIllIl;
        }
        final net.minecraft.IlllllllIIIlIIIlIlII.IIllIIllIIIlIlIIIIlI illIIllIIIlIlIIIIlI = new net.minecraft.IlllllllIIIlIIIlIlII.IIllIIllIIIlIlIIIIlI(this.s_(), new Object[0]);
        illIIllIIIlIlIIIIlI.llllIIIlIlllIlIIIIIl().llllIIIIlIIIlIlllIll(this.lIIlIIIIIIIlIIlIlIIl());
        illIIllIIIlIlIIIIlI.llllIIIlIlllIlIIIIIl().llllIIIIlIIIlIlllIll(this.lllIIIIlIlIllIIlIIIl().toString());
        return illIIllIIIlIlIIIIlI;
    }
    
    static /* synthetic */ int[] IlIlIllllllllIIIIlII() {
        final int[] ilIlIIIllIIllIlllllI = llIllIlIIIIllIlIIllI.IlIlIIIllIIllIlllllI;
        if (ilIlIIIllIIllIlllllI != null) {
            return ilIlIIIllIIllIlllllI;
        }
        final int[] ilIlIIIllIIllIlllllI2 = new int[lIlIlIIIllIIllIIIllI.values().length];
        try {
            ilIlIIIllIIllIlllllI2[lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            ilIlIIIllIIllIlllllI2[lIlIlIIIllIIllIIIllI.llllIIIlIlllIlIIIIIl.ordinal()] = 7;
        }
        catch (NoSuchFieldError noSuchFieldError2) {}
        try {
            ilIlIIIllIIllIlllllI2[lIlIlIIIllIIllIIIllI.llIllIIIIIllIlIIIIlI.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError3) {}
        try {
            ilIlIIIllIIllIlllllI2[lIlIlIIIllIIllIIIllI.IllIIlllIIIIlllIIlIl.ordinal()] = 6;
        }
        catch (NoSuchFieldError noSuchFieldError4) {}
        try {
            ilIlIIIllIIllIlllllI2[lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError5) {}
        try {
            ilIlIIIllIIllIlllllI2[lIlIlIIIllIIllIIIllI.IlIlIIIllIllIIIIIllI.ordinal()] = 5;
        }
        catch (NoSuchFieldError noSuchFieldError6) {}
        try {
            ilIlIIIllIIllIlllllI2[lIlIlIIIllIIllIIIllI.IlIIIlIlIIIllIlIlIIl.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError7) {}
        return llIllIlIIIIllIlIIllI.IlIlIIIllIIllIlllllI = ilIlIIIllIIllIlllllI2;
    }
    
    static /* synthetic */ int[] IIlllIlIIllIlIlIlIIl() {
        final int[] iiiIlllIIIIIIlIIIlll = llIllIlIIIIllIlIIllI.IIIIlllIIIIIIlIIIlll;
        if (iiiIlllIIIIIIlIIIlll != null) {
            return iiiIlllIIIIIIlIIIlll;
        }
        final int[] iiiIlllIIIIIIlIIIlll2 = new int[ap.values().length];
        try {
            iiiIlllIIIIIIlIIIlll2[ap.llIllIIIIIllIlIIIIlI.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            iiiIlllIIIIIIlIIIlll2[ap.IlIlIIIllIllIIIIIllI.ordinal()] = 5;
        }
        catch (NoSuchFieldError noSuchFieldError2) {}
        try {
            iiiIlllIIIIIIlIIIlll2[ap.IllIIlllIIIIlllIIlIl.ordinal()] = 6;
        }
        catch (NoSuchFieldError noSuchFieldError3) {}
        try {
            iiiIlllIIIIIIlIIIlll2[ap.IlIIIlIlIIIllIlIlIIl.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError4) {}
        try {
            iiiIlllIIIIIIlIIIlll2[ap.IlIlIlIlIlllllllllIl.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError5) {}
        try {
            iiiIlllIIIIIIlIIIlll2[ap.llIIlIIIlIIIllIlIIIl.ordinal()] = 10;
        }
        catch (NoSuchFieldError noSuchFieldError6) {}
        try {
            iiiIlllIIIIIIlIIIlll2[ap.llllIIIIlIIIlIlllIll.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError7) {}
        try {
            iiiIlllIIIIIIlIIIlll2[ap.lIIIlllIIIllIIIllIII.ordinal()] = 9;
        }
        catch (NoSuchFieldError noSuchFieldError8) {}
        try {
            iiiIlllIIIIIIlIIIlll2[ap.llllIIIlIlllIlIIIIIl.ordinal()] = 7;
        }
        catch (NoSuchFieldError noSuchFieldError9) {}
        try {
            iiiIlllIIIIIIlIIIlll2[ap.lIIIIlIIIIIlllIllIII.ordinal()] = 8;
        }
        catch (NoSuchFieldError noSuchFieldError10) {}
        return llIllIlIIIIllIlIIllI.IIIIlllIIIIIIlIIIlll = iiiIlllIIIIIIlIIIlll2;
    }
}
