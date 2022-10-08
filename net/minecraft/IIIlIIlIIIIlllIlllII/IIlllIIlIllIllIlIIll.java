package net.minecraft.IIIlIIlIIIIlllIlllII;

import net.minecraft.lIlIlIIIllIIllIIIllI.*;

public class IIlllIIlIllIllIlIIll
{
    public static final IIlllIIlIllIllIlIIll llllIIIIlIIIlIlllIll;
    private final String IlIlIlIlIlllllllllIl;
    
    static {
        llllIIIIlIIIlIlllIll = new IIlllIIlIllIllIlIIll("");
    }
    
    public IIlllIIlIllIllIlIIll(final String ilIlIlIlIlllllllllIl) {
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
    }
    
    public boolean llllIIIIlIIIlIlllIll() {
        return this.IlIlIlIlIlllllllllIl == null || this.IlIlIlIlIlllllllllIl.isEmpty();
    }
    
    public String IlIlIlIlIlllllllllIl() {
        return this.IlIlIlIlIlllllllllIl;
    }
    
    public void llllIIIIlIIIlIlllIll(final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll) {
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("Lock", this.IlIlIlIlIlllllllllIl);
    }
    
    public static IIlllIIlIllIllIlIIll IlIlIlIlIlllllllllIl(final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll) {
        if (iiiIlllIIIIIIlIIIlll.IlIlIlIlIlllllllllIl("Lock", 8)) {
            return new IIlllIIlIllIllIlIIll(iiiIlllIIIIIIlIIIlll.llIIlIIIlIIIllIlIIIl("Lock"));
        }
        return IIlllIIlIllIllIlIIll.llllIIIIlIIIlIlllIll;
    }
}
