package net.minecraft.client.lIIIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl;

import net.minecraft.client.lIIIlllIIIllIIIllIII.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.*;
import net.minecraft.llIllIlIIIIllIlIIllI.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;

public class lIllIIIIIlllIIlIIllI extends llIllIIIIIllIlIIIIlI
{
    protected final IlIIIlIlIIIllIlIlIIl llllIIIIlIIIlIlllIll;
    private final IIlllIlIIllIlIlIlIIl IlIlIIIllIllIIIIIllI;
    
    public lIllIIIIIlllIIlIIllI(final lllIllIIIllllllIllll lllIllIIIllllllIllll, final IlIIIlIlIIIllIlIlIIl llllIIIIlIIIlIlllIll, final IIlllIlIIllIlIlIlIIl ilIlIIIllIllIIIIIllI) {
        super(lllIllIIIllllllIllll);
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.IlIlIIIllIllIIIIIllI = ilIlIIIllIllIIIIIllI;
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final net.minecraft.llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI, final double n, final double n2, final double n3, final float n4, final float n5) {
        lllllIlIIIlIlIIlllII.lllllIlIIIlIlIIlllII();
        lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl((float)n, (float)n2, (float)n3);
        lllllIlIIIlIlIIlllII.IlIlIllllllllIIIIlII();
        lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(0.5f, 0.5f, 0.5f);
        lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(-this.IlIlIlIlIlllllllllIl.IlIlIIIllIllIIIIIllI, 0.0f, 1.0f, 0.0f);
        lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(this.IlIlIlIlIlllllllllIl.IllIIlllIIIIlllIIlIl, 1.0f, 0.0f, 0.0f);
        this.llllIIIIlIIIlIlllIll(IlIlIIIIIIlllIlIllIl.IlIlIlIlIlllllllllIl);
        this.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll(this.IlIIIlIlIIIllIlIlIIl(llIllIIIIIllIlIIIIlI), IlIlIIIllIIllIlllllI.IllIIlllIIIIlllIIlIl);
        lllllIlIIIlIlIIlllII.IIlllIlIIllIlIlIlIIl();
        lllllIlIIIlIlIIlllII.lIllllllIIllIlIlIlII();
        super.llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI, n, n2, n3, n4, n5);
    }
    
    public lllIIIIlIlIllIIlIIIl IlIIIlIlIIIllIlIlIIl(final net.minecraft.llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI) {
        return new lllIIIIlIlIllIIlIIIl(this.llllIIIIlIIIlIlllIll, 1, 0);
    }
    
    @Override
    protected lIllllIllIllIIllllll llllIIIIlIIIlIlllIll(final net.minecraft.llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI) {
        return IlIlIIIIIIlllIlIllIl.IlIlIlIlIlllllllllIl;
    }
}
