package net.minecraft.lllIIIIlllllIlIIllIl;

import java.util.*;

public class IlIIIlIlIIIllIlIlIIl
{
    public static final Comparator llllIIIIlIIIlIlllIll;
    private final llIIlIIIlIIIllIlIIIl IlIlIlIlIlllllllllIl;
    private final lIIIIlIIIIIlllIllIII llIllIIIIIllIlIIIIlI;
    private final String IlIIIlIlIIIllIlIlIIl;
    private int IlIlIIIllIllIIIIIllI;
    private boolean IllIIlllIIIIlllIIlIl;
    private boolean llllIIIlIlllIlIIIIIl;
    
    static {
        llllIIIIlIIIlIlllIll = new IlIlIIIllIllIIIIIllI();
    }
    
    public IlIIIlIlIIIllIlIlIIl(final llIIlIIIlIIIllIlIIIl ilIlIlIlIlllllllllIl, final lIIIIlIIIIIlllIllIII llIllIIIIIllIlIIIIlI, final String ilIIIlIlIIIllIlIlIIl) {
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
        this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
        this.IlIIIlIlIIIllIlIlIIl = ilIIIlIlIIIllIlIlIIl;
        this.llllIIIlIlllIlIIIIIl = true;
    }
    
    public void llllIIIIlIIIlIlllIll(final int n) {
        if (this.llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI().IlIlIlIlIlllllllllIl()) {
            throw new IllegalStateException("Cannot modify read-only score");
        }
        this.llIllIIIIIllIlIIIIlI(this.IlIlIlIlIlllllllllIl() + n);
    }
    
    public void IlIlIlIlIlllllllllIl(final int n) {
        if (this.llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI().IlIlIlIlIlllllllllIl()) {
            throw new IllegalStateException("Cannot modify read-only score");
        }
        this.llIllIIIIIllIlIIIIlI(this.IlIlIlIlIlllllllllIl() - n);
    }
    
    public void llllIIIIlIIIlIlllIll() {
        if (this.llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI().IlIlIlIlIlllllllllIl()) {
            throw new IllegalStateException("Cannot modify read-only score");
        }
        this.llllIIIIlIIIlIlllIll(1);
    }
    
    public int IlIlIlIlIlllllllllIl() {
        return this.IlIlIIIllIllIIIIIllI;
    }
    
    public void llIllIIIIIllIlIIIIlI(final int ilIlIIIllIllIIIIIllI) {
        final int ilIlIIIllIllIIIIIllI2 = this.IlIlIIIllIllIIIIIllI;
        this.IlIlIIIllIllIIIIIllI = ilIlIIIllIllIIIIIllI;
        if (ilIlIIIllIllIIIIIllI2 != ilIlIIIllIllIIIIIllI || this.llllIIIlIlllIlIIIIIl) {
            this.llllIIIlIlllIlIIIIIl = false;
            this.IlIlIIIllIllIIIIIllI().llllIIIIlIIIlIlllIll(this);
        }
    }
    
    public lIIIIlIIIIIlllIllIII llIllIIIIIllIlIIIIlI() {
        return this.llIllIIIIIllIlIIIIlI;
    }
    
    public String IlIIIlIlIIIllIlIlIIl() {
        return this.IlIIIlIlIIIllIlIlIIl;
    }
    
    public llIIlIIIlIIIllIlIIIl IlIlIIIllIllIIIIIllI() {
        return this.IlIlIlIlIlllllllllIl;
    }
    
    public boolean IllIIlllIIIIlllIIlIl() {
        return this.IllIIlllIIIIlllIIlIl;
    }
    
    public void llllIIIIlIIIlIlllIll(final boolean illIIlllIIIIlllIIlIl) {
        this.IllIIlllIIIIlllIIlIl = illIIlllIIIIlllIIlIl;
    }
    
    public void llllIIIIlIIIlIlllIll(final List list) {
        this.llIllIIIIIllIlIIIIlI(this.llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI().llllIIIIlIIIlIlllIll(list));
    }
}
