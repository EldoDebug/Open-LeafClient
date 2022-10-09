package net.minecraft.client.IlIIIlIlIIIllIlIlIIl;

import net.minecraft.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;

public class IllIllIIIIlIIlIlllII extends IlIIIlIlIIIllIlIlIIl
{
    public IIlIIIIIllIlIIIlIIll llllIIIIlIIIlIlllIll;
    public IIlIIIIIllIlIIIlIIll IlIlIlIlIlllllllllIl;
    public IIlIIIIIllIlIIIlIIll llIllIIIIIllIlIIIIlI;
    public IIlIIIIIllIlIIIlIIll IlIIIlIlIIIllIlIlIIl;
    public IIlIIIIIllIlIIIlIIll llIllIlIIIIllIlIIllI;
    public IIlIIIIIllIlIIIlIIll lIlIlIIIllIIllIIIllI;
    
    public IllIllIIIIlIIlIlllII(final float n) {
        this(n, 0.0f, 64, 64);
    }
    
    public IllIllIIIIlIIlIlllII(final float n, final float n2, final int n3, final int n4) {
        (this.llllIIIIlIIIlIlllIll = new IIlIIIIIllIlIIIlIIll(this).IlIlIlIlIlllllllllIl(n3, n4)).llllIIIIlIIIlIlllIll(0.0f, 0.0f + n2, 0.0f);
        this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(0, 0).llllIIIIlIIIlIlllIll(-4.0f, -10.0f, -4.0f, 8, 10, 8, n);
        (this.lIlIlIIIllIIllIIIllI = new IIlIIIIIllIlIIIlIIll(this).IlIlIlIlIlllllllllIl(n3, n4)).llllIIIIlIIIlIlllIll(0.0f, n2 - 2.0f, 0.0f);
        this.lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll(24, 0).llllIIIIlIIIlIlllIll(-1.0f, -1.0f, -6.0f, 2, 4, 2, n);
        this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(this.lIlIlIIIllIIllIIIllI);
        (this.IlIlIlIlIlllllllllIl = new IIlIIIIIllIlIIIlIIll(this).IlIlIlIlIlllllllllIl(n3, n4)).llllIIIIlIIIlIlllIll(0.0f, 0.0f + n2, 0.0f);
        this.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(16, 20).llllIIIIlIIIlIlllIll(-4.0f, 0.0f, -3.0f, 8, 12, 6, n);
        this.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(0, 38).llllIIIIlIIIlIlllIll(-4.0f, 0.0f, -3.0f, 8, 18, 6, n + 0.5f);
        (this.llIllIIIIIllIlIIIIlI = new IIlIIIIIllIlIIIlIIll(this).IlIlIlIlIlllllllllIl(n3, n4)).llllIIIIlIIIlIlllIll(0.0f, 0.0f + n2 + 2.0f, 0.0f);
        this.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(44, 22).llllIIIIlIIIlIlllIll(-8.0f, -2.0f, -2.0f, 4, 8, 4, n);
        this.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(44, 22).llllIIIIlIIIlIlllIll(4.0f, -2.0f, -2.0f, 4, 8, 4, n);
        this.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(40, 38).llllIIIIlIIIlIlllIll(-4.0f, 2.0f, -2.0f, 8, 4, 4, n);
        (this.IlIIIlIlIIIllIlIlIIl = new IIlIIIIIllIlIIIlIIll(this, 0, 22).IlIlIlIlIlllllllllIl(n3, n4)).llllIIIIlIIIlIlllIll(-2.0f, 12.0f + n2, 0.0f);
        this.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(-2.0f, 0.0f, -2.0f, 4, 12, 4, n);
        this.llIllIlIIIIllIlIIllI = new IIlIIIIIllIlIIIlIIll(this, 0, 22).IlIlIlIlIlllllllllIl(n3, n4);
        this.llIllIlIIIIllIlIIllI.lIIIlllIIIllIIIllIII = true;
        this.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll(2.0f, 12.0f + n2, 0.0f);
        this.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll(-2.0f, 0.0f, -2.0f, 4, 12, 4, n);
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI, final float n, final float n2, final float n3, final float n4, final float n5, final float n6) {
        this.llllIIIIlIIIlIlllIll(n, n2, n3, n4, n5, n6, llIllIIIIIllIlIIIIlI);
        this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(n6);
        this.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(n6);
        this.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(n6);
        this.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll(n6);
        this.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(n6);
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final float n, final float n2, final float n3, final float n4, final float n5, final float n6, final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI) {
        this.llllIIIIlIIIlIlllIll.llllIIIlIlllIlIIIIIl = n4 / 57.295776f;
        this.llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl = n5 / 57.295776f;
        this.llIllIIIIIllIlIIIIlI.IlIIIlIlIIIllIlIlIIl = 3.0f;
        this.llIllIIIIIllIlIIIIlI.IlIlIIIllIllIIIIIllI = -1.0f;
        this.llIllIIIIIllIlIIIIlI.IllIIlllIIIIlllIIlIl = -0.75f;
        this.IlIIIlIlIIIllIlIlIIl.IllIIlllIIIIlllIIlIl = llIllIIlllllllllllll.IlIlIlIlIlllllllllIl(n * 0.6662f) * 1.4f * n2 * 0.5f;
        this.llIllIlIIIIllIlIIllI.IllIIlllIIIIlllIIlIl = llIllIIlllllllllllll.IlIlIlIlIlllllllllIl(n * 0.6662f + 3.1415927f) * 1.4f * n2 * 0.5f;
        this.IlIIIlIlIIIllIlIlIIl.llllIIIlIlllIlIIIIIl = 0.0f;
        this.llIllIlIIIIllIlIIllI.llllIIIlIlllIlIIIIIl = 0.0f;
    }
}
