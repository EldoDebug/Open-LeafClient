package net.minecraft.IIIlIIlIIIIlllIlllII;

import net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.llIllIIIIIllIlIIIIlI.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIIIllIllIIIIIllI.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;

public abstract class lllllIlIIIlIlIIlllII
{
    public static final float[] llllIIIIlIIIlIlllIll;
    protected IlllllllIIIlIIIlIlII IlIlIlIlIlllllllllIl;
    private llIllIlIlIIIIIIIllII lIIIIlIIIIIlllIllIII;
    private String lIIIlllIIIllIIIllIII;
    protected IIIllllllIllIIIlllIl llIllIIIIIllIlIIIIlI;
    protected boolean IlIIIlIlIIIllIlIlIIl;
    protected boolean IlIlIIIllIllIIIIIllI;
    protected final float[] IllIIlllIIIIlllIIlIl;
    protected int llllIIIlIlllIlIIIIIl;
    private final float[] llIIlIIIlIIIllIlIIIl;
    
    static {
        llllIIIIlIIIlIlllIll = new float[] { 1.0f, 0.75f, 0.5f, 0.25f, 0.0f, 0.25f, 0.5f, 0.75f };
    }
    
    public lllllIlIIIlIlIIlllII() {
        this.IllIIlllIIIIlllIIlIl = new float[16];
        this.llIIlIIIlIIIllIlIIIl = new float[4];
    }
    
    public final void llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII ilIlIlIlIlllllllllIl) {
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
        this.lIIIIlIIIIIlllIllIII = ilIlIlIlIlllllllllIl.lIllllllIIllIlIlIlII().IIllIIllIIIlIlIIIIlI();
        this.lIIIlllIIIllIIIllIII = ilIlIlIlIlllllllllIl.lIllllllIIllIlIlIlII().IIlllIlIIllIlIlIlIIl();
        this.IlIlIlIlIlllllllllIl();
        this.llllIIIIlIIIlIlllIll();
    }
    
    protected void llllIIIIlIIIlIlllIll() {
        final float n = 0.0f;
        for (int i = 0; i <= 15; ++i) {
            final float n2 = 1.0f - i / 15.0f;
            this.IllIIlllIIIIlllIIlIl[i] = (1.0f - n2) / (n2 * 3.0f + 1.0f) * (1.0f - n) + n;
        }
    }
    
    protected void IlIlIlIlIlllllllllIl() {
        final llIllIlIlIIIIIIIllII iIllIIllIIIlIlIIIIlI = this.IlIlIlIlIlllllllllIl.lIllllllIIllIlIlIlII().IIllIIllIIIlIlIIIIlI();
        if (iIllIIllIIIlIlIIIIlI == llIllIlIlIIIIIIIllII.llIllIIIIIllIlIIIIlI) {
            this.llIllIIIIIllIlIIIIlI = new IlIIIlIIIllllIlIlIlI(net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIIIllIllIIIIIllI.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(this.IlIlIlIlIlllllllllIl.lIllllllIIllIlIlIlII().IIlllIlIIllIlIlIlIIl()).llllIIIIlIIIlIlllIll(), net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl.IlIIllIIllIIllIIlIIl), 0.5f);
        }
        else if (iIllIIllIIIlIlIIIIlI == llIllIlIlIIIIIIIllII.llllIIIlIlllIlIIIIIl) {
            this.llIllIIIIIllIlIIIIlI = new IlIIIlIIIllllIlIlIlI(net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl.IIlllIIlIllIllIlIIll, 0.0f);
        }
        else {
            this.llIllIIIIIllIlIIIIlI = new IIIllllllIllIIIlllIl(this.IlIlIlIlIlllllllllIl);
        }
    }
    
    public lIIIIlIIIIIlllIllIII llIllIIIIIllIlIIIIlI() {
        return (this.lIIIIlIIIIIlllIllIII == llIllIlIlIIIIIIIllII.llIllIIIIIllIlIIIIlI) ? new llIllIIIIIllIlIIIIlI(this.IlIlIlIlIlllllllllIl, this.IlIlIlIlIlllllllllIl.IIlIIIIlllIlllllIlII(), this.IlIlIlIlIlllllllllIl.lIllllllIIllIlIlIlII().lllIIIIlllllIlIIllIl(), this.lIIIlllIIIllIIIllIII) : ((this.lIIIIlIIIIIlllIllIII == llIllIlIlIIIIIIIllII.llllIIIlIlllIlIIIIIl) ? new llllIIIIlIIIlIlllIll(this.IlIlIlIlIlllllllllIl) : ((this.lIIIIlIIIIIlllIllIII == llIllIlIlIIIIIIIllII.IllIIlllIIIIlllIIlIl) ? new IlIIIlIlIIIllIlIlIIl(this.IlIlIlIlIlllllllllIl, this.IlIlIlIlIlllllllllIl.IIlIIIIlllIlllllIlII(), this.IlIlIlIlIlllllllllIl.lIllllllIIllIlIlIlII().lllIIIIlllllIlIIllIl(), this.lIIIlllIIIllIIIllIII) : new IlIIIlIlIIIllIlIlIIl(this.IlIlIlIlIlllllllllIl, this.IlIlIlIlIlllllllllIl.IIlIIIIlllIlllllIlII(), this.IlIlIlIlIlllllllllIl.lIllllllIIllIlIlIlII().lllIIIIlllllIlIIllIl(), this.lIIIlllIIIllIIIllIII)));
    }
    
    public boolean llllIIIIlIIIlIlllIll(final int n, final int n2) {
        return this.IlIlIlIlIlllllllllIl.IlIlIIIllIllIIIIIllI(new IlIlIlIlIlllllllllIl(n, 0, n2)) == net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI;
    }
    
    public float llllIIIIlIIIlIlllIll(final long n, final float n2) {
        float n3 = ((int)(n % 24000L) + n2) / 24000.0f - 0.25f;
        if (n3 < 0.0f) {
            ++n3;
        }
        if (n3 > 1.0f) {
            --n3;
        }
        final float n4 = 1.0f - (float)((Math.cos(n3 * 3.141592653589793) + 1.0) / 2.0);
        return n4 + (n4 - n4) / 3.0f;
    }
    
    public int llllIIIIlIIIlIlllIll(final long n) {
        return (int)(n / 24000L % 8L + 8L) % 8;
    }
    
    public boolean IlIIIlIlIIIllIlIlIIl() {
        return true;
    }
    
    public float[] llllIIIIlIIIlIlllIll(final float n, final float n2) {
        final float n3 = 0.4f;
        final float n4 = llIllIIlllllllllllll.IlIlIlIlIlllllllllIl(n * 3.1415927f * 2.0f) - 0.0f;
        final float n5 = -0.0f;
        if (n4 >= n5 - n3 && n4 <= n5 + n3) {
            final float n6 = (n4 - n5) / n3 * 0.5f + 0.5f;
            final float n7 = 1.0f - (1.0f - llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(n6 * 3.1415927f)) * 0.99f;
            final float n8 = n7 * n7;
            this.llIIlIIIlIIIllIlIIIl[0] = n6 * 0.3f + 0.7f;
            this.llIIlIIIlIIIllIlIIIl[1] = n6 * n6 * 0.7f + 0.2f;
            this.llIIlIIIlIIIllIlIIIl[2] = n6 * n6 * 0.0f + 0.2f;
            this.llIIlIIIlIIIllIlIIIl[3] = n8;
            return this.llIIlIIIlIIIllIlIIIl;
        }
        return null;
    }
    
    public e IlIlIlIlIlllllllllIl(final float n, final float n2) {
        final float llllIIIIlIIIlIlllIll = llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(llIllIIlllllllllllll.IlIlIlIlIlllllllllIl(n * 3.1415927f * 2.0f) * 2.0f + 0.5f, 0.0f, 1.0f);
        return new e(0.7529412f * (llllIIIIlIIIlIlllIll * 0.94f + 0.06f), 0.84705883f * (llllIIIIlIIIlIlllIll * 0.94f + 0.06f), 1.0f * (llllIIIIlIIIlIlllIll * 0.91f + 0.09f));
    }
    
    public boolean IlIlIIIllIllIIIIIllI() {
        return true;
    }
    
    public static lllllIlIIIlIlIIlllII llllIIIIlIIIlIlllIll(final int n) {
        return (n == -1) ? new llIIlllIIlllIIllIllI() : ((n == 0) ? new IIlIIIIIllIlIIIlIIll() : ((n == 1) ? new lIllllllIIllIlIlIlII() : null));
    }
    
    public float IllIIlllIIIIlllIIlIl() {
        return 128.0f;
    }
    
    public boolean llllIIIlIlllIlIIIIIl() {
        return true;
    }
    
    public IlIlIlIlIlllllllllIl lIIIIlIIIIIlllIllIII() {
        return null;
    }
    
    public int lIIIlllIIIllIIIllIII() {
        return (this.lIIIIlIIIIIlllIllIII == llIllIlIlIIIIIIIllII.llIllIIIIIllIlIIIIlI) ? 4 : (this.IlIlIlIlIlllllllllIl.IlIlIIIlIIlIlIIlllIl() + 1);
    }
    
    public double llIIlIIIlIIIllIlIIIl() {
        return (this.lIIIIlIIIIIlllIllIII == llIllIlIlIIIIIIIllII.llIllIIIIIllIlIIIIlI) ? 1.0 : 0.03125;
    }
    
    public boolean IlIlIlIlIlllllllllIl(final int n, final int n2) {
        return false;
    }
    
    public abstract String llIllIlIIIIllIlIIllI();
    
    public abstract String lIlIlIIIllIIllIIIllI();
    
    public IIIllllllIllIIIlllIl IlIlIIIllIIllIlllllI() {
        return this.llIllIIIIIllIlIIIIlI;
    }
    
    public boolean IIIIlllIIIIIIlIIIlll() {
        return this.IlIIIlIlIIIllIlIlIIl;
    }
    
    public boolean llllIIllllIlIlIIIIll() {
        return this.IlIlIIIllIllIIIIIllI;
    }
    
    public float[] IlIllIlIlIIIlIlIlIII() {
        return this.IllIIlllIIIIlllIIlIl;
    }
    
    public int IIlllIIlIllIllIlIIll() {
        return this.llllIIIlIlllIlIIIIIl;
    }
    
    public net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI lllIIIIlllllIlIIllIl() {
        return new net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI();
    }
}
