package net.minecraft.client.llllIIIlIlllIlIIIIIl;

import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;

public class lIIlIIIlIllIlIllIIIl extends IIIllllllIllIIIlllIl
{
    private int llllIIIIlIIIlIlllIll;
    private int IIIIIIIllllIlIIIIIII;
    
    protected lIIlIIIlIllIlIllIIIl(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final double n, final double n2, final double n3, final double n4, final double n5, final double n6) {
        super(illlllllIIIlIIIlIlII, n, n2, n3, 0.0, 0.0, 0.0);
        this.IIIIIIIllllIlIIIIIII = 8;
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final lIIllIIIllllIlllIllI liIllIIIllllIlllIllI, final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI, final float n, final float n2, final float n3, final float n4, final float n5, final float n6) {
    }
    
    @Override
    public void IIllIIllIIIlIlIIIIlI() {
        for (int i = 0; i < 6; ++i) {
            this.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(net.minecraft.IlllllllIIIlIIIlIlII.IlIllllIIlIIlIlIlIll.IlIlIlIlIlllllllllIl, this.IIlllIlIIllIlIlIlIIl + (this.IlIIllIIllIIllIIlIIl.nextDouble() - this.IlIIllIIllIIllIIlIIl.nextDouble()) * 4.0, this.llIIIlIlIllIIlIlIlII + (this.IlIIllIIllIIllIIlIIl.nextDouble() - this.IlIIllIIllIIllIIlIIl.nextDouble()) * 4.0, this.lllllIlIIIlIlIIlllII + (this.IlIIllIIllIIllIIlIIl.nextDouble() - this.IlIIllIIllIIllIIlIIl.nextDouble()) * 4.0, this.llllIIIIlIIIlIlllIll / (float)this.IIIIIIIllllIlIIIIIII, 0.0, 0.0, new int[0]);
        }
        ++this.llllIIIIlIIIlIlllIll;
        if (this.llllIIIIlIIIlIlllIll == this.IIIIIIIllllIlIIIIIII) {
            this.IllIllIIIIlIIlIlllII();
        }
    }
    
    @Override
    public int IlIIIlIlIIIllIlIlIIl() {
        return 1;
    }
}
