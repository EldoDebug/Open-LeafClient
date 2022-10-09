package net.optifine.util;

public class llllllIllIllIlIllllI
{
    private float llllIIIIlIIIlIlllIll;
    private float IlIlIlIlIlllllllllIl;
    private float llIllIIIIIllIlIIIIlI;
    private long IlIIIlIlIIIllIlIlIIl;
    
    public llllllIllIllIlIllllI(final float n, final float n2) {
        this(n, n2, n2);
    }
    
    public llllllIllIllIlIllllI(final float llllIIIIlIIIlIlllIll, final float ilIlIlIlIlllllllllIl, final float llIllIIIIIllIlIIIIlI) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
        this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
        this.IlIIIlIlIIIllIlIlIIl = System.currentTimeMillis();
    }
    
    public float llllIIIIlIIIlIlllIll() {
        return this.llllIIIIlIIIlIlllIll;
    }
    
    public float IlIlIlIlIlllllllllIl() {
        return this.IlIlIlIlIlllllllllIl;
    }
    
    public float llIllIIIIIllIlIIIIlI() {
        return this.llIllIIIIIllIlIIIIlI;
    }
    
    public long IlIIIlIlIIIllIlIlIIl() {
        return this.IlIIIlIlIIIllIlIlIIl;
    }
    
    public float llllIIIIlIIIlIlllIll(final float n, final float ilIlIlIlIlllllllllIl, final float llIllIIIIIllIlIIIIlI) {
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
        this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
        return this.llllIIIIlIIIlIlllIll(n);
    }
    
    public float llllIIIIlIIIlIlllIll(final float n) {
        final long currentTimeMillis = System.currentTimeMillis();
        final float llllIIIIlIIIlIlllIll = this.llllIIIIlIIIlIlllIll;
        final float llllIIIIlIIIlIlllIll2 = llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll, n, (currentTimeMillis - this.IlIIIlIlIIIllIlIlIIl) / 1000.0f, (n >= llllIIIIlIIIlIlllIll) ? this.IlIlIlIlIlllllllllIl : this.llIllIIIIIllIlIIIIlI);
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll2;
        this.IlIIIlIlIIIllIlIlIIl = currentTimeMillis;
        return llllIIIIlIIIlIlllIll2;
    }
    
    public static float llllIIIIlIIIlIlllIll(final float n, final float n2, final float n3, final float n4) {
        if (n3 <= 0.0f) {
            return n;
        }
        final float n5 = n2 - n;
        float n6;
        if (n4 > 0.0f && n3 < n4 && Math.abs(n5) > 1.0E-6f) {
            n6 = n + n5 * lIllllllIIllIlIlIlII.llllIIIIlIIIlIlllIll(n3 / n4 * (4.61f - 1.0f / (0.13f + n4 / n3 / 10.0f)), 0.0f, 1.0f);
        }
        else {
            n6 = n2;
        }
        return n6;
    }
}
