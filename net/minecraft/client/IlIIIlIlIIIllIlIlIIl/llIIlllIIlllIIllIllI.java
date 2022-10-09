package net.minecraft.client.IlIIIlIlIIIllIlIlIIl;

import net.minecraft.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;

public class llIIlllIIlllIIllIllI extends IlIIIlIlIIIllIlIlIIl
{
    public IIlIIIIIllIlIIIlIIll llllIIIIlIIIlIlllIll;
    public IIlIIIIIllIlIIIlIIll IlIlIlIlIlllllllllIl;
    public IIlIIIIIllIlIIIlIIll llIllIIIIIllIlIIIIlI;
    public IIlIIIIIllIlIIIlIIll IlIIIlIlIIIllIlIlIIl;
    public IIlIIIIIllIlIIIlIIll llIllIlIIIIllIlIIllI;
    public IIlIIIIIllIlIIIlIIll lIlIlIIIllIIllIIIllI;
    protected float IlIlIIIllIIllIlllllI;
    protected float IIIIlllIIIIIIlIIIlll;
    
    public llIIlllIIlllIIllIllI(final int n, final float n2) {
        this.llllIIIIlIIIlIlllIll = new IIlIIIIIllIlIIIlIIll(this, 0, 0);
        this.IlIlIIIllIIllIlllllI = 8.0f;
        this.IIIIlllIIIIIIlIIIlll = 4.0f;
        this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(-4.0f, -4.0f, -8.0f, 8, 8, 8, n2);
        this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(0.0f, (float)(18 - n), -6.0f);
        (this.IlIlIlIlIlllllllllIl = new IIlIIIIIllIlIIIlIIll(this, 28, 8)).llllIIIIlIIIlIlllIll(-5.0f, -10.0f, -7.0f, 10, 16, 8, n2);
        this.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(0.0f, (float)(17 - n), 2.0f);
        (this.llIllIIIIIllIlIIIIlI = new IIlIIIIIllIlIIIlIIll(this, 0, 16)).llllIIIIlIIIlIlllIll(-2.0f, 0.0f, -2.0f, 4, n, 4, n2);
        this.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(-3.0f, (float)(24 - n), 7.0f);
        (this.IlIIIlIlIIIllIlIlIIl = new IIlIIIIIllIlIIIlIIll(this, 0, 16)).llllIIIIlIIIlIlllIll(-2.0f, 0.0f, -2.0f, 4, n, 4, n2);
        this.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(3.0f, (float)(24 - n), 7.0f);
        (this.llIllIlIIIIllIlIIllI = new IIlIIIIIllIlIIIlIIll(this, 0, 16)).llllIIIIlIIIlIlllIll(-2.0f, 0.0f, -2.0f, 4, n, 4, n2);
        this.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll(-3.0f, (float)(24 - n), -5.0f);
        (this.lIlIlIIIllIIllIIIllI = new IIlIIIIIllIlIIIlIIll(this, 0, 16)).llllIIIIlIIIlIlllIll(-2.0f, 0.0f, -2.0f, 4, n, 4, n2);
        this.lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll(3.0f, (float)(24 - n), -5.0f);
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI, final float n, final float n2, final float n3, final float n4, final float n5, final float n6) {
        this.llllIIIIlIIIlIlllIll(n, n2, n3, n4, n5, n6, llIllIIIIIllIlIIIIlI);
        if (this.llllIIIlIlllIlIIIIIl) {
            final float n7 = 2.0f;
            lllllIlIIIlIlIIlllII.lllllIlIIIlIlIIlllII();
            lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(0.0f, this.IlIlIIIllIIllIlllllI * n6, this.IIIIlllIIIIIIlIIIlll * n6);
            this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(n6);
            lllllIlIIIlIlIIlllII.lIllllllIIllIlIlIlII();
            lllllIlIIIlIlIIlllII.lllllIlIIIlIlIIlllII();
            lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(1.0f / n7, 1.0f / n7, 1.0f / n7);
            lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(0.0f, 24.0f * n6, 0.0f);
            this.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(n6);
            this.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(n6);
            this.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(n6);
            this.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll(n6);
            this.lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll(n6);
            lllllIlIIIlIlIIlllII.lIllllllIIllIlIlIlII();
        }
        else {
            this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(n6);
            this.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(n6);
            this.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(n6);
            this.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(n6);
            this.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll(n6);
            this.lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll(n6);
        }
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final float n, final float n2, final float n3, final float n4, final float n5, final float n6, final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI) {
        this.llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl = n5 / 57.295776f;
        this.llllIIIIlIIIlIlllIll.llllIIIlIlllIlIIIIIl = n4 / 57.295776f;
        this.IlIlIlIlIlllllllllIl.IllIIlllIIIIlllIIlIl = 1.5707964f;
        this.llIllIIIIIllIlIIIIlI.IllIIlllIIIIlllIIlIl = llIllIIlllllllllllll.IlIlIlIlIlllllllllIl(n * 0.6662f) * 1.4f * n2;
        this.IlIIIlIlIIIllIlIlIIl.IllIIlllIIIIlllIIlIl = llIllIIlllllllllllll.IlIlIlIlIlllllllllIl(n * 0.6662f + 3.1415927f) * 1.4f * n2;
        this.llIllIlIIIIllIlIIllI.IllIIlllIIIIlllIIlIl = llIllIIlllllllllllll.IlIlIlIlIlllllllllIl(n * 0.6662f + 3.1415927f) * 1.4f * n2;
        this.lIlIlIIIllIIllIIIllI.IllIIlllIIIIlllIIlIl = llIllIIlllllllllllll.IlIlIlIlIlllllllllIl(n * 0.6662f) * 1.4f * n2;
    }
}
