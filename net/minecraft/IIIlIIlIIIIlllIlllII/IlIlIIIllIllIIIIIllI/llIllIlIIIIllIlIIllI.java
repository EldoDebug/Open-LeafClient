package net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIIIllIllIIIIIllI;

import net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.*;
import net.minecraft.llllIIIIlIIIlIlllIll.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;

public class llIllIlIIIIllIlIIllI
{
    private final int llllIIIIlIIIlIlllIll;
    private llIIlIIIlIIIllIlIIIl IlIlIlIlIlllllllllIl;
    private int llIllIIIIIllIlIIIIlI;
    private int IlIIIlIlIIIllIlIlIIl;
    
    public llIllIlIIIIllIlIIllI(final int n, final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        this(3, n, llllIIIIlIIIlIlllIll);
    }
    
    public llIllIlIIIIllIlIIllI(final int llllIIIIlIIIlIlllIll, final int llIllIIIIIllIlIIIIlI, final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll2) {
        this.llIllIIIIIllIlIIIIlI = 1;
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
        this.IlIlIlIlIlllllllllIl = llllIIIIlIIIlIlllIll2.lllIllIIIllllllIllll();
    }
    
    public llIllIlIIIIllIlIIllI(final int n, final int n2, final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final int n3) {
        this(n, n2, llllIIIIlIIIlIlllIll);
        this.IlIlIlIlIlllllllllIl = llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI(n3);
    }
    
    public int llllIIIIlIIIlIlllIll() {
        return this.llIllIIIIIllIlIIIIlI;
    }
    
    public llIIlIIIlIIIllIlIIIl IlIlIlIlIlllllllllIl() {
        return this.IlIlIlIlIlllllllllIl;
    }
    
    private llllIIIIlIIIlIlllIll IlIIIlIlIIIllIlIlIIl() {
        return this.IlIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI();
    }
    
    private int IlIlIIIllIllIIIIIllI() {
        return this.IlIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI().llIllIIIIIllIlIIIIlI(this.IlIlIlIlIlllllllllIl);
    }
    
    public int llIllIIIIIllIlIIIIlI() {
        return this.IlIIIlIlIIIllIlIlIIl;
    }
    
    public void llllIIIIlIIIlIlllIll(final int ilIIIlIlIIIllIlIlIIl) {
        this.IlIIIlIlIIIllIlIlIIl = ilIIIlIlIIIllIlIlIIl;
    }
    
    @Override
    public String toString() {
        String s;
        if (this.llllIIIIlIIIlIlllIll >= 3) {
            final lIllllIllIllIIllllll lIllllIllIllIIllllll = (lIllllIllIllIIllllll)net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(this.IlIIIlIlIIIllIlIlIIl());
            s = ((lIllllIllIllIIllllll == null) ? "null" : lIllllIllIllIIllllll.toString());
            if (this.llIllIIIIIllIlIIIIlI > 1) {
                s = String.valueOf(this.llIllIIIIIllIlIIIIlI) + "*" + s;
            }
        }
        else {
            s = Integer.toString(net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(this.IlIIIlIlIIIllIlIlIIl()));
            if (this.llIllIIIIIllIlIIIIlI > 1) {
                s = String.valueOf(this.llIllIIIIIllIlIIIIlI) + "x" + s;
            }
        }
        final int ilIlIIIllIllIIIIIllI = this.IlIlIIIllIllIIIIIllI();
        if (ilIlIIIllIllIIIIIllI > 0) {
            s = String.valueOf(s) + ":" + ilIlIIIllIllIIIIIllI;
        }
        return s;
    }
}
