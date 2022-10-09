package net.minecraft.client.llllIIIlIlllIlIIIIIl;

import net.minecraft.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.*;

public class IllIIlllllIIllIIllIl extends IIIllllllIllIIIlllIl
{
    private llIllIIIIIllIlIIIIlI llllIIIIlIIIlIlllIll;
    private int IIIIIIIllllIlIIIIIII;
    private int IIlllIIIllIllIIlIlIl;
    private IlIllllIIlIIlIlIlIll llIlllIlllllIIllIIII;
    
    public IllIIlllllIIllIIllIl(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final llIllIIIIIllIlIIIIlI llllIIIIlIIIlIlllIll, final IlIllllIIlIIlIlIlIll llIlllIlllllIIllIIII) {
        super(illlllllIIIlIIIlIlII, llllIIIIlIIIlIlllIll.IIlllIlIIllIlIlIlIIl, llllIIIIlIIIlIlllIll.IlIIlllIIlIlllllIIlI().IlIlIlIlIlllllllllIl + llllIIIIlIIIlIlllIll.IlIllllIIlIIlIlIlIll / 2.0f, llllIIIIlIIIlIlllIll.lllllIlIIIlIlIIlllII, llllIIIIlIIIlIlllIll.lIllllllIIllIlIlIlII, llllIIIIlIIIlIlllIll.llIIlllIIlllIIllIllI, llllIIIIlIIIlIlllIll.IIlllIIIlIlllIIlllII);
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.IIlllIIIllIllIIlIlIl = 3;
        this.llIlllIlllllIIllIIII = llIlllIlllllIIllIIII;
        this.IIllIIllIIIlIlIIIIlI();
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final lIIllIIIllllIlllIllI liIllIIIllllIlllIllI, final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI, final float n, final float n2, final float n3, final float n4, final float n5, final float n6) {
    }
    
    @Override
    public void IIllIIllIIIlIlIIIIlI() {
        for (int i = 0; i < 16; ++i) {
            final double n = this.IlIIllIIllIIllIIlIIl.nextFloat() * 2.0f - 1.0f;
            final double n2 = this.IlIIllIIllIIllIIlIIl.nextFloat() * 2.0f - 1.0f;
            final double n3 = this.IlIIllIIllIIllIIlIIl.nextFloat() * 2.0f - 1.0f;
            if (n * n + n2 * n2 + n3 * n3 <= 1.0) {
                this.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(this.llIlllIlllllIIllIIII, false, this.llllIIIIlIIIlIlllIll.IIlllIlIIllIlIlIlIIl + n * this.llllIIIIlIIIlIlllIll.IllIllIIIIlIIlIlllII / 4.0, this.llllIIIIlIIIlIlllIll.IlIIlllIIlIlllllIIlI().IlIlIlIlIlllllllllIl + this.llllIIIIlIIIlIlllIll.IlIllllIIlIIlIlIlIll / 2.0f + n2 * this.llllIIIIlIIIlIlllIll.IlIllllIIlIIlIlIlIll / 4.0, this.llllIIIIlIIIlIlllIll.lllllIlIIIlIlIIlllII + n3 * this.llllIIIIlIIIlIlllIll.IllIllIIIIlIIlIlllII / 4.0, n, n2 + 0.2, n3, new int[0]);
            }
        }
        ++this.IIIIIIIllllIlIIIIIII;
        if (this.IIIIIIIllllIlIIIIIII >= this.IIlllIIIllIllIIlIlIl) {
            this.IllIllIIIIlIIlIlllII();
        }
    }
    
    @Override
    public int IlIIIlIlIIIllIlIlIIl() {
        return 3;
    }
}
