package net.minecraft.client.IlIIIlIlIIIllIlIlIIl;

import net.minecraft.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;

public class lllIllIIIllllllIllll extends IlIIIlIlIIIllIlIlIIl
{
    public IIlIIIIIllIlIIIlIIll llllIIIIlIIIlIlllIll;
    public IIlIIIIIllIlIIIlIIll IlIlIlIlIlllllllllIl;
    public IIlIIIIIllIlIIIlIIll llIllIIIIIllIlIIIIlI;
    public IIlIIIIIllIlIIIlIIll IlIIIlIlIIIllIlIlIIl;
    public IIlIIIIIllIlIIIlIIll llIllIlIIIIllIlIIllI;
    
    public lllIllIIIllllllIllll() {
        final float n = 4.0f;
        final float n2 = 0.0f;
        (this.llIllIIIIIllIlIIIIlI = new IIlIIIIIllIlIIIlIIll(this, 0, 0).IlIlIlIlIlllllllllIl(64, 64)).llllIIIIlIIIlIlllIll(-4.0f, -8.0f, -4.0f, 8, 8, 8, n2 - 0.5f);
        this.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(0.0f, 0.0f + n, 0.0f);
        (this.IlIIIlIlIIIllIlIlIIl = new IIlIIIIIllIlIIIlIIll(this, 32, 0).IlIlIlIlIlllllllllIl(64, 64)).llllIIIIlIIIlIlllIll(-1.0f, 0.0f, -1.0f, 12, 2, 2, n2 - 0.5f);
        this.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(0.0f, 0.0f + n + 9.0f - 7.0f, 0.0f);
        (this.llIllIlIIIIllIlIIllI = new IIlIIIIIllIlIIIlIIll(this, 32, 0).IlIlIlIlIlllllllllIl(64, 64)).llllIIIIlIIIlIlllIll(-1.0f, 0.0f, -1.0f, 12, 2, 2, n2 - 0.5f);
        this.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll(0.0f, 0.0f + n + 9.0f - 7.0f, 0.0f);
        (this.llllIIIIlIIIlIlllIll = new IIlIIIIIllIlIIIlIIll(this, 0, 16).IlIlIlIlIlllllllllIl(64, 64)).llllIIIIlIIIlIlllIll(-5.0f, -10.0f, -5.0f, 10, 10, 10, n2 - 0.5f);
        this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(0.0f, 0.0f + n + 9.0f, 0.0f);
        (this.IlIlIlIlIlllllllllIl = new IIlIIIIIllIlIIIlIIll(this, 0, 36).IlIlIlIlIlllllllllIl(64, 64)).llllIIIIlIIIlIlllIll(-6.0f, -12.0f, -6.0f, 12, 12, 12, n2 - 0.5f);
        this.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(0.0f, 0.0f + n + 20.0f, 0.0f);
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final float n, final float n2, final float n3, final float n4, final float n5, final float n6, final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI) {
        super.llllIIIIlIIIlIlllIll(n, n2, n3, n4, n5, n6, llIllIIIIIllIlIIIIlI);
        this.llIllIIIIIllIlIIIIlI.llllIIIlIlllIlIIIIIl = n4 / 57.295776f;
        this.llIllIIIIIllIlIIIIlI.IllIIlllIIIIlllIIlIl = n5 / 57.295776f;
        this.llllIIIIlIIIlIlllIll.llllIIIlIlllIlIIIIIl = n4 / 57.295776f * 0.25f;
        final float llllIIIIlIIIlIlllIll = llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(this.llllIIIIlIIIlIlllIll.llllIIIlIlllIlIIIIIl);
        final float ilIlIlIlIlllllllllIl = llIllIIlllllllllllll.IlIlIlIlIlllllllllIl(this.llllIIIIlIIIlIlllIll.llllIIIlIlllIlIIIIIl);
        this.IlIIIlIlIIIllIlIlIIl.lIIIIlIIIIIlllIllIII = 1.0f;
        this.llIllIlIIIIllIlIIllI.lIIIIlIIIIIlllIllIII = -1.0f;
        this.IlIIIlIlIIIllIlIlIIl.llllIIIlIlllIlIIIIIl = 0.0f + this.llllIIIIlIIIlIlllIll.llllIIIlIlllIlIIIIIl;
        this.llIllIlIIIIllIlIIllI.llllIIIlIlllIlIIIIIl = 3.1415927f + this.llllIIIIlIIIlIlllIll.llllIIIlIlllIlIIIIIl;
        this.IlIIIlIlIIIllIlIlIIl.llIllIIIIIllIlIIIIlI = ilIlIlIlIlllllllllIl * 5.0f;
        this.IlIIIlIlIIIllIlIlIIl.IlIlIIIllIllIIIIIllI = -llllIIIIlIIIlIlllIll * 5.0f;
        this.llIllIlIIIIllIlIIllI.llIllIIIIIllIlIIIIlI = -ilIlIlIlIlllllllllIl * 5.0f;
        this.llIllIlIIIIllIlIIllI.IlIlIIIllIllIIIIIllI = llllIIIIlIIIlIlllIll * 5.0f;
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI, final float n, final float n2, final float n3, final float n4, final float n5, final float n6) {
        this.llllIIIIlIIIlIlllIll(n, n2, n3, n4, n5, n6, llIllIIIIIllIlIIIIlI);
        this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(n6);
        this.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(n6);
        this.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(n6);
        this.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(n6);
        this.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll(n6);
    }
}
