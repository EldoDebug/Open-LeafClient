package net.minecraft.client.lIIIlllIIIllIIIllIII;

import net.optifine.*;

public class IIlllIIlllIIIlIlllII
{
    private lIIllIIIllllIlllIllI llllIIIIlIIIlIlllIll;
    private llIllIIlllllllllllll IlIlIlIlIlllllllllIl;
    private static final IIlllIIlllIIIlIlllII llIllIIIIIllIlIIIIlI;
    
    static {
        llIllIIIIIllIlIIIIlI = new IIlllIIlllIIIlIlllII(2097152);
    }
    
    public static IIlllIIlllIIIlIlllII llllIIIIlIIIlIlllIll() {
        return IIlllIIlllIIIlIlllII.llIllIIIIIllIlIIIIlI;
    }
    
    public IIlllIIlllIIIlIlllII(final int n) {
        this.IlIlIlIlIlllllllllIl = new llIllIIlllllllllllll();
        this.llllIIIIlIIIlIlllIll = new lIIllIIIllllIlllIllI(n);
    }
    
    public void IlIlIlIlIlllllllllIl() {
        if (this.llllIIIIlIIIlIlllIll.llllIIIlIlllIlIIIIIl != null) {
            llIIIllIlIllIllIIIIl.llllIIIIlIIIlIlllIll(this.llllIIIIlIIIlIlllIll.llllIIIlIlllIlIIIIIl);
        }
        this.llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl();
        this.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(this.llllIIIIlIIIlIlllIll);
    }
    
    public lIIllIIIllllIlllIllI llIllIIIIIllIlIIIIlI() {
        return this.llllIIIIlIIIlIlllIll;
    }
}
