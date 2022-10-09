package net.minecraft.client.IlIIIlIlIIIllIlIlIIl;

import net.minecraft.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;

public class lIIIlllIIIllIIIllIII extends IlIIIlIlIIIllIlIlIIl
{
    public IIlIIIIIllIlIIIlIIll llllIIIIlIIIlIlllIll;
    public IIlIIIIIllIlIIIlIIll IlIlIlIlIlllllllllIl;
    public IIlIIIIIllIlIIIlIIll llIllIIIIIllIlIIIIlI;
    public IIlIIIIIllIlIIIlIIll IlIIIlIlIIIllIlIlIIl;
    public IIlIIIIIllIlIIIlIIll llIllIlIIIIllIlIIllI;
    public IIlIIIIIllIlIIIlIIll lIlIlIIIllIIllIIIllI;
    public IIlIIIIIllIlIIIlIIll IlIlIIIllIIllIlllllI;
    
    public lIIIlllIIIllIIIllIII() {
        this.llllIIIIlIIIlIlllIll = new IIlIIIIIllIlIIIlIIll(this).llllIIIIlIIIlIlllIll(0, 0).llllIIIIlIIIlIlllIll(-6.0f, -5.0f, 0.0f, 6, 10, 0);
        this.IlIlIlIlIlllllllllIl = new IIlIIIIIllIlIIIlIIll(this).llllIIIIlIIIlIlllIll(16, 0).llllIIIIlIIIlIlllIll(0.0f, -5.0f, 0.0f, 6, 10, 0);
        this.llIllIIIIIllIlIIIIlI = new IIlIIIIIllIlIIIlIIll(this).llllIIIIlIIIlIlllIll(0, 10).llllIIIIlIIIlIlllIll(0.0f, -4.0f, -0.99f, 5, 8, 1);
        this.IlIIIlIlIIIllIlIlIIl = new IIlIIIIIllIlIIIlIIll(this).llllIIIIlIIIlIlllIll(12, 10).llllIIIIlIIIlIlllIll(0.0f, -4.0f, -0.01f, 5, 8, 1);
        this.llIllIlIIIIllIlIIllI = new IIlIIIIIllIlIIIlIIll(this).llllIIIIlIIIlIlllIll(24, 10).llllIIIIlIIIlIlllIll(0.0f, -4.0f, 0.0f, 5, 8, 0);
        this.lIlIlIIIllIIllIIIllI = new IIlIIIIIllIlIIIlIIll(this).llllIIIIlIIIlIlllIll(24, 10).llllIIIIlIIIlIlllIll(0.0f, -4.0f, 0.0f, 5, 8, 0);
        this.IlIlIIIllIIllIlllllI = new IIlIIIIIllIlIIIlIIll(this).llllIIIIlIIIlIlllIll(12, 0).llllIIIIlIIIlIlllIll(-1.0f, -5.0f, 0.0f, 2, 10, 0);
        this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(0.0f, 0.0f, -1.0f);
        this.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(0.0f, 0.0f, 1.0f);
        this.IlIlIIIllIIllIlllllI.llllIIIlIlllIlIIIIIl = 1.5707964f;
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI, final float n, final float n2, final float n3, final float n4, final float n5, final float n6) {
        this.llllIIIIlIIIlIlllIll(n, n2, n3, n4, n5, n6, llIllIIIIIllIlIIIIlI);
        this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(n6);
        this.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(n6);
        this.IlIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll(n6);
        this.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(n6);
        this.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(n6);
        this.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll(n6);
        this.lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll(n6);
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final float n, final float n2, final float n3, final float n4, final float n5, final float n6, final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI) {
        final float llllIIIlIlllIlIIIIIl = (llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(n * 0.02f) * 0.1f + 1.25f) * n4;
        this.llllIIIIlIIIlIlllIll.llllIIIlIlllIlIIIIIl = 3.1415927f + llllIIIlIlllIlIIIIIl;
        this.IlIlIlIlIlllllllllIl.llllIIIlIlllIlIIIIIl = -llllIIIlIlllIlIIIIIl;
        this.llIllIIIIIllIlIIIIlI.llllIIIlIlllIlIIIIIl = llllIIIlIlllIlIIIIIl;
        this.IlIIIlIlIIIllIlIlIIl.llllIIIlIlllIlIIIIIl = -llllIIIlIlllIlIIIIIl;
        this.llIllIlIIIIllIlIIllI.llllIIIlIlllIlIIIIIl = llllIIIlIlllIlIIIIIl - llllIIIlIlllIlIIIIIl * 2.0f * n2;
        this.lIlIlIIIllIIllIIIllI.llllIIIlIlllIlIIIIIl = llllIIIlIlllIlIIIIIl - llllIIIlIlllIlIIIIIl * 2.0f * n3;
        this.llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI = llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(llllIIIlIlllIlIIIIIl);
        this.IlIIIlIlIIIllIlIlIIl.llIllIIIIIllIlIIIIlI = llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(llllIIIlIlllIlIIIIIl);
        this.llIllIlIIIIllIlIIllI.llIllIIIIIllIlIIIIlI = llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(llllIIIlIlllIlIIIIIl);
        this.lIlIlIIIllIIllIIIllI.llIllIIIIIllIlIIIIlI = llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(llllIIIlIlllIlIIIIIl);
    }
}
