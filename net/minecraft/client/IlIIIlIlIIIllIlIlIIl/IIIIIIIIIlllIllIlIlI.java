package net.minecraft.client.IlIIIlIlIIIllIlIlIIl;

import net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIIIllIllIIIIIllI.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;

public class IIIIIIIIIlllIllIlIlI extends IlIIlIlIIIlIIlIlIlII
{
    public IIIIIIIIIlllIllIlIlI() {
        this(0.0f, false);
    }
    
    public IIIIIIIIIlllIllIlIlI(final float n, final boolean b) {
        super(n, 0.0f, 64, 32);
        if (!b) {
            (this.IIIIlllIIIIIIlIIIlll = new IIlIIIIIllIlIIIlIIll(this, 40, 16)).llllIIIIlIIIlIlllIll(-1.0f, -2.0f, -1.0f, 2, 12, 2, n);
            this.IIIIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll(-5.0f, 2.0f, 0.0f);
            this.llllIIllllIlIlIIIIll = new IIlIIIIIllIlIIIlIIll(this, 40, 16);
            this.llllIIllllIlIlIIIIll.lIIIlllIIIllIIIllIII = true;
            this.llllIIllllIlIlIIIIll.llllIIIIlIIIlIlllIll(-1.0f, -2.0f, -1.0f, 2, 12, 2, n);
            this.llllIIllllIlIlIIIIll.llllIIIIlIIIlIlllIll(5.0f, 2.0f, 0.0f);
            (this.IlIllIlIlIIIlIlIlIII = new IIlIIIIIllIlIIIlIIll(this, 0, 16)).llllIIIIlIIIlIlllIll(-1.0f, 0.0f, -1.0f, 2, 12, 2, n);
            this.IlIllIlIlIIIlIlIlIII.llllIIIIlIIIlIlllIll(-2.0f, 12.0f, 0.0f);
            this.IIlllIIlIllIllIlIIll = new IIlIIIIIllIlIIIlIIll(this, 0, 16);
            this.IIlllIIlIllIllIlIIll.lIIIlllIIIllIIIllIII = true;
            this.IIlllIIlIllIllIlIIll.llllIIIIlIIIlIlllIll(-1.0f, 0.0f, -1.0f, 2, 12, 2, n);
            this.IIlllIIlIllIllIlIIll.llllIIIIlIIIlIlllIll(2.0f, 12.0f, 0.0f);
        }
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final lllIIIIlllllIlIIllIl lllIIIIlllllIlIIllIl, final float n, final float n2, final float n3) {
        this.IIIlIIIlIlIIlllIIlll = (((llllllIllIllIlIllllI)lllIIIIlllllIlIIllIl).ao() == 1);
        super.llllIIIIlIIIlIlllIll(lllIIIIlllllIlIIllIl, n, n2, n3);
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final float n, final float n2, final float n3, final float n4, final float n5, final float n6, final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI) {
        super.llllIIIIlIIIlIlllIll(n, n2, n3, n4, n5, n6, llIllIIIIIllIlIIIIlI);
    }
}
