package net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIlIlllIlIIIIIl;

import net.minecraft.IIIlIIlIIIIlllIlllII.*;

public class llIIlIIIlIIIllIlIIIl implements Comparable
{
    private final String llllIIIIlIIIlIlllIll;
    private final String IlIlIlIlIlllllllllIl;
    private final long llIllIIIIIllIlIIIIlI;
    private final long IlIIIlIlIIIllIlIlIIl;
    private final boolean IlIlIIIllIllIIIIIllI;
    private final lllIllIIIllllllIllll IllIIlllIIIIlllIIlIl;
    private final boolean llllIIIlIlllIlIIIIIl;
    private final boolean lIIIIlIIIIIlllIllIII;
    
    public llIIlIIIlIIIllIlIIIl(final String llllIIIIlIIIlIlllIll, final String ilIlIlIlIlllllllllIl, final long llIllIIIIIllIlIIIIlI, final long ilIIIlIlIIIllIlIlIIl, final lllIllIIIllllllIllll illIIlllIIIIlllIIlIl, final boolean ilIlIIIllIllIIIIIllI, final boolean llllIIIlIlllIlIIIIIl, final boolean liiiIlIIIIIlllIllIII) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
        this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
        this.IlIIIlIlIIIllIlIlIIl = ilIIIlIlIIIllIlIlIIl;
        this.IllIIlllIIIIlllIIlIl = illIIlllIIIIlllIIlIl;
        this.IlIlIIIllIllIIIIIllI = ilIlIIIllIllIIIIIllI;
        this.llllIIIlIlllIlIIIIIl = llllIIIlIlllIlIIIIIl;
        this.lIIIIlIIIIIlllIllIII = liiiIlIIIIIlllIllIII;
    }
    
    public String llllIIIIlIIIlIlllIll() {
        return this.llllIIIIlIIIlIlllIll;
    }
    
    public String IlIlIlIlIlllllllllIl() {
        return this.IlIlIlIlIlllllllllIl;
    }
    
    public long llIllIIIIIllIlIIIIlI() {
        return this.IlIIIlIlIIIllIlIlIIl;
    }
    
    public boolean IlIIIlIlIIIllIlIlIIl() {
        return this.IlIlIIIllIllIIIIIllI;
    }
    
    public long IlIlIIIllIllIIIIIllI() {
        return this.llIllIIIIIllIlIIIIlI;
    }
    
    public int llllIIIIlIIIlIlllIll(final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl) {
        return (this.llIllIIIIIllIlIIIIlI < llIIlIIIlIIIllIlIIIl.llIllIIIIIllIlIIIIlI) ? 1 : ((this.llIllIIIIIllIlIIIIlI > llIIlIIIlIIIllIlIIIl.llIllIIIIIllIlIIIIlI) ? -1 : this.llllIIIIlIIIlIlllIll.compareTo(llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll));
    }
    
    public lllIllIIIllllllIllll IllIIlllIIIIlllIIlIl() {
        return this.IllIIlllIIIIlllIIlIl;
    }
    
    public boolean llllIIIlIlllIlIIIIIl() {
        return this.llllIIIlIlllIlIIIIIl;
    }
    
    public boolean lIIIIlIIIIIlllIllIII() {
        return this.lIIIIlIIIIIlllIllIII;
    }
}
