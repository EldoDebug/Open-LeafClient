package net.minecraft.client.IlIIIlIlIIIllIlIlIIl;

import net.minecraft.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.*;

public class IlIllIlIlIIIlIlIlIII extends IlIIIlIlIIIllIlIlIIl
{
    private IIlIIIIIllIlIIIlIIll llllIIIIlIIIlIlllIll;
    private IIlIIIIIllIlIIIlIIll IlIlIlIlIlllllllllIl;
    private IIlIIIIIllIlIIIlIIll llIllIIIIIllIlIIIIlI;
    
    public IlIllIlIlIIIlIlIlIII(final float n, final boolean b) {
        this.IlIlIlIlIlllllllllIl = new IIlIIIIIllIlIIIlIIll(this, "glass");
        this.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(0, 0).llllIIIIlIIIlIlllIll(-4.0f, -4.0f, -4.0f, 8, 8, 8);
        this.llllIIIIlIIIlIlllIll = new IIlIIIIIllIlIIIlIIll(this, "cube");
        this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(32, 0).llllIIIIlIIIlIlllIll(-4.0f, -4.0f, -4.0f, 8, 8, 8);
        if (b) {
            this.llIllIIIIIllIlIIIIlI = new IIlIIIIIllIlIIIlIIll(this, "base");
            this.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(0, 16).llllIIIIlIIIlIlllIll(-6.0f, 0.0f, -6.0f, 12, 4, 12);
        }
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI, final float n, final float n2, final float n3, final float n4, final float n5, final float n6) {
        lllllIlIIIlIlIIlllII.lllllIlIIIlIlIIlllII();
        lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(2.0f, 2.0f, 2.0f);
        lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(0.0f, -0.5f, 0.0f);
        if (this.llIllIIIIIllIlIIIIlI != null) {
            this.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(n6);
        }
        lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(n2, 0.0f, 1.0f, 0.0f);
        lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(0.0f, 0.8f + n3, 0.0f);
        lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(60.0f, 0.7071f, 0.0f, 0.7071f);
        this.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(n6);
        final float n7 = 0.875f;
        lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(n7, n7, n7);
        lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(60.0f, 0.7071f, 0.0f, 0.7071f);
        lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(n2, 0.0f, 1.0f, 0.0f);
        this.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(n6);
        lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(n7, n7, n7);
        lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(60.0f, 0.7071f, 0.0f, 0.7071f);
        lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(n2, 0.0f, 1.0f, 0.0f);
        this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(n6);
        lllllIlIIIlIlIIlllII.lIllllllIIllIlIlIlII();
    }
}
