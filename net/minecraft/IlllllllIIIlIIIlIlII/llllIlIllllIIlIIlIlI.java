package net.minecraft.IlllllllIIIlIIIlIlII;

import net.minecraft.client.*;

public class llllIlIllllIIlIIlIlI
{
    float llllIIIIlIIIlIlllIll;
    private double IllIIlllIIIIlllIIlIl;
    public int IlIlIlIlIlllllllllIl;
    public float llIllIIIIIllIlIIIIlI;
    public float IlIIIlIlIIIllIlIlIIl;
    public float IlIlIIIllIllIIIIIllI;
    private long llllIIIlIlllIlIIIIIl;
    private long lIIIIlIIIIIlllIllIII;
    private long lIIIlllIIIllIIIllIII;
    private double llIIlIIIlIIIllIlIIIl;
    
    public llllIlIllllIIlIIlIlI(final float llllIIIIlIIIlIlllIll) {
        this.IlIIIlIlIIIllIlIlIIl = 1.0f;
        this.llIIlIIIlIIIllIlIIIl = 1.0;
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.llllIIIlIlllIlIIIIIl = Minecraft.IIIllllllIllIIIlllIl();
        this.lIIIIlIIIIIlllIllIII = System.nanoTime() / 1000000L;
    }
    
    public void llllIIIIlIIIlIlllIll() {
        final long iiIllllllIllIIIlllIl = Minecraft.IIIllllllIllIIIlllIl();
        final long n = iiIllllllIllIIIlllIl - this.llllIIIlIlllIlIIIIIl;
        final long n2 = System.nanoTime() / 1000000L;
        final double n3 = n2 / 1000.0;
        if (n <= 1000L && n >= 0L) {
            this.lIIIlllIIIllIIIllIII += n;
            if (this.lIIIlllIIIllIIIllIII > 1000L) {
                this.llIIlIIIlIIIllIlIIIl += (this.lIIIlllIIIllIIIllIII / (double)(n2 - this.lIIIIlIIIIIlllIllIII) - this.llIIlIIIlIIIllIlIIIl) * 0.20000000298023224;
                this.lIIIIlIIIIIlllIllIII = n2;
                this.lIIIlllIIIllIIIllIII = 0L;
            }
            if (this.lIIIlllIIIllIIIllIII < 0L) {
                this.lIIIIlIIIIIlllIllIII = n2;
            }
        }
        else {
            this.IllIIlllIIIIlllIIlIl = n3;
        }
        this.llllIIIlIlllIlIIIIIl = iiIllllllIllIIIlllIl;
        final double n4 = (n3 - this.IllIIlllIIIIlllIIlIl) * this.llIIlIIIlIIIllIlIIIl;
        this.IllIIlllIIIIlllIIlIl = n3;
        this.IlIlIIIllIllIIIIIllI += (float)(llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(n4, 0.0, 1.0) * this.IlIIIlIlIIIllIlIlIIl * this.llllIIIIlIIIlIlllIll);
        this.IlIlIlIlIlllllllllIl = (int)this.IlIlIIIllIllIIIIIllI;
        this.IlIlIIIllIllIIIIIllI -= this.IlIlIlIlIlllllllllIl;
        if (this.IlIlIlIlIlllllllllIl > 10) {
            this.IlIlIlIlIlllllllllIl = 10;
        }
        this.llIllIIIIIllIlIIIIlI = this.IlIlIIIllIllIIIIIllI;
    }
}
