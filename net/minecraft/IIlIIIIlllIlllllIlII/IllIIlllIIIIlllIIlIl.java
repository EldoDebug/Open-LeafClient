package net.minecraft.IIlIIIIlllIlllllIlII;

import net.minecraft.IlllllllIIIlIIIlIlII.*;

public class IllIIlllIIIIlllIIlIl
{
    private final IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll;
    private final IlIlIlIlIlllllllllIl IlIlIlIlIlllllllllIl;
    private final lllIllIIIllllllIllll llIllIIIIIllIlIIIIlI;
    private int IlIIIlIlIIIllIlIlIIl;
    private boolean IlIlIIIllIllIIIIIllI;
    private int IllIIlllIIIIlllIIlIl;
    
    public IllIIlllIIIIlllIIlIl(final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final int n, final int n2, final int n3) {
        this(ilIlIlIlIlllllllllIl, llllIIIIlIIIlIlllIll(n, n2), n3);
    }
    
    private static lllIllIIIllllllIllll llllIIIIlIIIlIlllIll(final int n, final int n2) {
        return (n < 0) ? lllIllIIIllllllIllll.IlIlIIIllIllIIIIIllI : ((n > 0) ? lllIllIIIllllllIllll.IllIIlllIIIIlllIIlIl : ((n2 < 0) ? lllIllIIIllllllIllll.llIllIIIIIllIlIIIIlI : lllIllIIIllllllIllll.IlIIIlIlIIIllIlIlIIl));
    }
    
    public IllIIlllIIIIlllIIlIl(final IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll, final lllIllIIIllllllIllll llIllIIIIIllIlIIIIlI, final int ilIIIlIlIIIllIlIlIIl) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
        this.IlIlIlIlIlllllllllIl = llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI, 2);
        this.IlIIIlIlIIIllIlIlIIl = ilIIIlIlIIIllIlIlIIl;
    }
    
    public int llllIIIIlIIIlIlllIll(final int n, final int n2, final int n3) {
        return (int)this.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(n, n2, n3);
    }
    
    public int llllIIIIlIIIlIlllIll(final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        return (int)ilIlIlIlIlllllllllIl.IllIIlllIIIIlllIIlIl(this.IlIIIlIlIIIllIlIlIIl());
    }
    
    public int IlIlIlIlIlllllllllIl(final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        return (int)this.IlIlIlIlIlllllllllIl.IllIIlllIIIIlllIIlIl(ilIlIlIlIlllllllllIl);
    }
    
    public boolean llIllIIIIIllIlIIIIlI(final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        return (ilIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII() - this.llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII()) * this.llIllIIIIIllIlIIIIlI.lIIIIlIIIIIlllIllIII() + (ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl() - this.llllIIIIlIIIlIlllIll.lIIIlllIIIllIIIllIII()) * this.llIllIIIIIllIlIIIIlI.llIIlIIIlIIIllIlIIIl() >= 0;
    }
    
    public void llllIIIIlIIIlIlllIll() {
        this.IllIIlllIIIIlllIIlIl = 0;
    }
    
    public void IlIlIlIlIlllllllllIl() {
        ++this.IllIIlllIIIIlllIIlIl;
    }
    
    public int llIllIIIIIllIlIIIIlI() {
        return this.IllIIlllIIIIlllIIlIl;
    }
    
    public IlIlIlIlIlllllllllIl IlIIIlIlIIIllIlIlIIl() {
        return this.llllIIIIlIIIlIlllIll;
    }
    
    public IlIlIlIlIlllllllllIl IlIlIIIllIllIIIIIllI() {
        return this.IlIlIlIlIlllllllllIl;
    }
    
    public int IllIIlllIIIIlllIIlIl() {
        return this.llIllIIIIIllIlIIIIlI.lIIIIlIIIIIlllIllIII() * 2;
    }
    
    public int llllIIIlIlllIlIIIIIl() {
        return this.llIllIIIIIllIlIIIIlI.llIIlIIIlIIIllIlIIIl() * 2;
    }
    
    public int lIIIIlIIIIIlllIllIII() {
        return this.IlIIIlIlIIIllIlIlIIl;
    }
    
    public void llllIIIIlIIIlIlllIll(final int ilIIIlIlIIIllIlIlIIl) {
        this.IlIIIlIlIIIllIlIlIIl = ilIIIlIlIIIllIlIlIIl;
    }
    
    public boolean lIIIlllIIIllIIIllIII() {
        return this.IlIlIIIllIllIIIIIllI;
    }
    
    public void llllIIIIlIIIlIlllIll(final boolean ilIlIIIllIllIIIIIllI) {
        this.IlIlIIIllIllIIIIIllI = ilIlIIIllIllIIIIIllI;
    }
}
