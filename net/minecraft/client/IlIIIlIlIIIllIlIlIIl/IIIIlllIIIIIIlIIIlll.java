package net.minecraft.client.IlIIIlIlIIIllIlIlIIl;

import net.minecraft.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;

public class IIIIlllIIIIIIlIIIlll extends IlIIIlIlIIIllIlIlIIl
{
    public IIlIIIIIllIlIIIlIIll llllIIIIlIIIlIlllIll;
    public IIlIIIIIllIlIIIlIIll IlIlIlIlIlllllllllIl;
    public IIlIIIIIllIlIIIlIIll llIllIIIIIllIlIIIIlI;
    public IIlIIIIIllIlIIIlIIll IlIIIlIlIIIllIlIlIIl;
    public IIlIIIIIllIlIIIlIIll llIllIlIIIIllIlIIllI;
    public IIlIIIIIllIlIIIlIIll lIlIlIIIllIIllIIIllI;
    public IIlIIIIIllIlIIIlIIll IlIlIIIllIIllIlllllI;
    
    public IIIIlllIIIIIIlIIIlll() {
        this(0.0f);
    }
    
    public IIIIlllIIIIIIlIIIlll(final float n) {
        final int n2 = 6;
        (this.llllIIIIlIIIlIlllIll = new IIlIIIIIllIlIIIlIIll(this, 0, 0)).llllIIIIlIIIlIlllIll(-4.0f, -8.0f, -4.0f, 8, 8, 8, n);
        this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(0.0f, (float)n2, 0.0f);
        (this.IlIlIlIlIlllllllllIl = new IIlIIIIIllIlIIIlIIll(this, 32, 0)).llllIIIIlIIIlIlllIll(-4.0f, -8.0f, -4.0f, 8, 8, 8, n + 0.5f);
        this.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(0.0f, (float)n2, 0.0f);
        (this.llIllIIIIIllIlIIIIlI = new IIlIIIIIllIlIIIlIIll(this, 16, 16)).llllIIIIlIIIlIlllIll(-4.0f, 0.0f, -2.0f, 8, 12, 4, n);
        this.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(0.0f, (float)n2, 0.0f);
        (this.IlIIIlIlIIIllIlIlIIl = new IIlIIIIIllIlIIIlIIll(this, 0, 16)).llllIIIIlIIIlIlllIll(-2.0f, 0.0f, -2.0f, 4, 6, 4, n);
        this.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(-2.0f, (float)(12 + n2), 4.0f);
        (this.llIllIlIIIIllIlIIllI = new IIlIIIIIllIlIIIlIIll(this, 0, 16)).llllIIIIlIIIlIlllIll(-2.0f, 0.0f, -2.0f, 4, 6, 4, n);
        this.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll(2.0f, (float)(12 + n2), 4.0f);
        (this.lIlIlIIIllIIllIIIllI = new IIlIIIIIllIlIIIlIIll(this, 0, 16)).llllIIIIlIIIlIlllIll(-2.0f, 0.0f, -2.0f, 4, 6, 4, n);
        this.lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll(-2.0f, (float)(12 + n2), -4.0f);
        (this.IlIlIIIllIIllIlllllI = new IIlIIIIIllIlIIIlIIll(this, 0, 16)).llllIIIIlIIIlIlllIll(-2.0f, 0.0f, -2.0f, 4, 6, 4, n);
        this.IlIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll(2.0f, (float)(12 + n2), -4.0f);
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI, final float n, final float n2, final float n3, final float n4, final float n5, final float n6) {
        this.llllIIIIlIIIlIlllIll(n, n2, n3, n4, n5, n6, llIllIIIIIllIlIIIIlI);
        this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(n6);
        this.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(n6);
        this.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(n6);
        this.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll(n6);
        this.lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll(n6);
        this.IlIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll(n6);
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final float n, final float n2, final float n3, final float n4, final float n5, final float n6, final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI) {
        this.llllIIIIlIIIlIlllIll.llllIIIlIlllIlIIIIIl = n4 / 57.295776f;
        this.llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl = n5 / 57.295776f;
        this.IlIIIlIlIIIllIlIlIIl.IllIIlllIIIIlllIIlIl = llIllIIlllllllllllll.IlIlIlIlIlllllllllIl(n * 0.6662f) * 1.4f * n2;
        this.llIllIlIIIIllIlIIllI.IllIIlllIIIIlllIIlIl = llIllIIlllllllllllll.IlIlIlIlIlllllllllIl(n * 0.6662f + 3.1415927f) * 1.4f * n2;
        this.lIlIlIIIllIIllIIIllI.IllIIlllIIIIlllIIlIl = llIllIIlllllllllllll.IlIlIlIlIlllllllllIl(n * 0.6662f + 3.1415927f) * 1.4f * n2;
        this.IlIlIIIllIIllIlllllI.IllIIlllIIIIlllIIlIl = llIllIIlllllllllllll.IlIlIlIlIlllllllllIl(n * 0.6662f) * 1.4f * n2;
    }
}
