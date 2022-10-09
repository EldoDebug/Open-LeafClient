package net.minecraft.IIlllIIlIllIllIlIIll;

import net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIlIlllIlIIIIIl.*;

public class lIlIlIIIllIIllIIIllI implements Comparable
{
    private llIIlIIIlIIIllIlIIIl llllIIIIlIIIlIlllIll;
    
    public lIlIlIIIllIIllIIIllI(final llIIlIIIlIIIllIlIIIl llllIIIIlIIIlIlllIll) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
    }
    
    public int llllIIIIlIIIlIlllIll() {
        return this.llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl().llllIIIIlIIIlIlllIll();
    }
    
    public String IlIlIlIlIlllllllllIl() {
        return this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll();
    }
    
    public boolean llIllIIIIIllIlIIIIlI() {
        return this.llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII();
    }
    
    public boolean IlIIIlIlIIIllIlIlIIl() {
        return this.llllIIIIlIIIlIlllIll.llllIIIlIlllIlIIIIIl();
    }
    
    public boolean IlIlIIIllIllIIIIIllI() {
        return this.llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl();
    }
    
    public String IllIIlllIIIIlllIIlIl() {
        return this.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl();
    }
    
    public long llllIIIlIlllIlIIIIIl() {
        return this.llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI();
    }
    
    public int llllIIIIlIIIlIlllIll(final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl) {
        return this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(llIIlIIIlIIIllIlIIIl);
    }
    
    public long lIIIIlIIIIIlllIllIII() {
        return this.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI();
    }
    
    public int llllIIIIlIIIlIlllIll(final lIlIlIIIllIIllIIIllI lIlIlIIIllIIllIIIllI) {
        return (this.llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI() < lIlIlIIIllIIllIIIllI.llllIIIlIlllIlIIIIIl()) ? 1 : ((this.llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI() > lIlIlIIIllIIllIIIllI.llllIIIlIlllIlIIIIIl()) ? -1 : this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll().compareTo(lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl()));
    }
}
