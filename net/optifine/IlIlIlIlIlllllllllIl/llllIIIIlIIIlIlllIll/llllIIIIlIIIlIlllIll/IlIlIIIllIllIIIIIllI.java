package net.optifine.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll;

import net.optifine.expr.*;
import net.minecraft.client.IlIIIlIlIIIllIlIlIIl.*;

public class IlIlIIIllIllIIIIIllI implements IlIlIIIllIIllIlllllI
{
    private String llllIIIIlIIIlIlllIll;
    private IIlIIIIIllIlIIIlIIll IlIlIlIlIlllllllllIl;
    private IllIIlllIIIIlllIIlIl llIllIIIIIllIlIIIIlI;
    
    public IlIlIIIllIllIIIIIllI(final String llllIIIIlIIIlIlllIll, final IIlIIIIIllIlIIIlIIll ilIlIlIlIlllllllllIl, final IllIIlllIIIIlllIIlIl llIllIIIIIllIlIIIIlI) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
        this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
    }
    
    @Override
    public net.optifine.expr.IlIlIIIllIllIIIIIllI llllIIIIlIIIlIlllIll() {
        return net.optifine.expr.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll;
    }
    
    @Override
    public float IlIlIlIlIlllllllllIl() {
        return this.llIllIIIIIllIlIIIIlI();
    }
    
    public float llIllIIIIIllIlIIIIlI() {
        return this.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(this.IlIlIlIlIlllllllllIl);
    }
    
    public void llllIIIIlIIIlIlllIll(final float n) {
        this.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(this.IlIlIlIlIlllllllllIl, n);
    }
    
    @Override
    public String toString() {
        return this.llllIIIIlIIIlIlllIll;
    }
}
