package net.minecraft.IIlIIIIlllIlllllIlII;

import net.minecraft.llIllIlIIIIllIlIIllI.*;
import net.minecraft.lIlIlIIIllIIllIIIllI.*;

public class llllIIIIlIIIlIlllIll
{
    private lllIIIIlIlIllIIlIIIl llllIIIIlIIIlIlllIll;
    private lllIIIIlIlIllIIlIIIl IlIlIlIlIlllllllllIl;
    private lllIIIIlIlIllIIlIIIl llIllIIIIIllIlIIIIlI;
    private int IlIIIlIlIIIllIlIlIIl;
    private int IlIlIIIllIllIIIIIllI;
    private boolean IllIIlllIIIIlllIIlIl;
    
    public llllIIIIlIIIlIlllIll(final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll) {
        this.llllIIIIlIIIlIlllIll(iiiIlllIIIIIIlIIIlll);
    }
    
    public llllIIIIlIIIlIlllIll(final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl, final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl2, final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl3) {
        this(lllIIIIlIlIllIIlIIIl, lllIIIIlIlIllIIlIIIl2, lllIIIIlIlIllIIlIIIl3, 0, 7);
    }
    
    public llllIIIIlIIIlIlllIll(final lllIIIIlIlIllIIlIIIl llllIIIIlIIIlIlllIll, final lllIIIIlIlIllIIlIIIl ilIlIlIlIlllllllllIl, final lllIIIIlIlIllIIlIIIl llIllIIIIIllIlIIIIlI, final int ilIIIlIlIIIllIlIlIIl, final int ilIlIIIllIllIIIIIllI) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
        this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
        this.IlIIIlIlIIIllIlIlIIl = ilIIIlIlIIIllIlIlIIl;
        this.IlIlIIIllIllIIIIIllI = ilIlIIIllIllIIIIIllI;
        this.IllIIlllIIIIlllIIlIl = true;
    }
    
    public llllIIIIlIIIlIlllIll(final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl, final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl2) {
        this(lllIIIIlIlIllIIlIIIl, null, lllIIIIlIlIllIIlIIIl2);
    }
    
    public llllIIIIlIIIlIlllIll(final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl, final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl) {
        this(lllIIIIlIlIllIIlIIIl, new lllIIIIlIlIllIIlIIIl(ilIIIlIlIIIllIlIlIIl));
    }
    
    public lllIIIIlIlIllIIlIIIl llllIIIIlIIIlIlllIll() {
        return this.llllIIIIlIIIlIlllIll;
    }
    
    public lllIIIIlIlIllIIlIIIl IlIlIlIlIlllllllllIl() {
        return this.IlIlIlIlIlllllllllIl;
    }
    
    public boolean llIllIIIIIllIlIIIIlI() {
        return this.IlIlIlIlIlllllllllIl != null;
    }
    
    public lllIIIIlIlIllIIlIIIl IlIIIlIlIIIllIlIlIIl() {
        return this.llIllIIIIIllIlIIIIlI;
    }
    
    public int IlIlIIIllIllIIIIIllI() {
        return this.IlIIIlIlIIIllIlIlIIl;
    }
    
    public int IllIIlllIIIIlllIIlIl() {
        return this.IlIlIIIllIllIIIIIllI;
    }
    
    public void llllIIIlIlllIlIIIIIl() {
        ++this.IlIIIlIlIIIllIlIlIIl;
    }
    
    public void llllIIIIlIIIlIlllIll(final int n) {
        this.IlIlIIIllIllIIIIIllI += n;
    }
    
    public boolean lIIIIlIIIIIlllIllIII() {
        return this.IlIIIlIlIIIllIlIlIIl >= this.IlIlIIIllIllIIIIIllI;
    }
    
    public void lIIIlllIIIllIIIllIII() {
        this.IlIIIlIlIIIllIlIlIIl = this.IlIlIIIllIllIIIIIllI;
    }
    
    public boolean llIIlIIIlIIIllIlIIIl() {
        return this.IllIIlllIIIIlllIIlIl;
    }
    
    public void llllIIIIlIIIlIlllIll(final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll) {
        this.llllIIIIlIIIlIlllIll = lllIIIIlIlIllIIlIIIl.llllIIIIlIIIlIlllIll(iiiIlllIIIIIIlIIIlll.IlIlIIIllIIllIlllllI("buy"));
        this.llIllIIIIIllIlIIIIlI = lllIIIIlIlIllIIlIIIl.llllIIIIlIIIlIlllIll(iiiIlllIIIIIIlIIIlll.IlIlIIIllIIllIlllllI("sell"));
        if (iiiIlllIIIIIIlIIIlll.IlIlIlIlIlllllllllIl("buyB", 10)) {
            this.IlIlIlIlIlllllllllIl = lllIIIIlIlIllIIlIIIl.llllIIIIlIIIlIlllIll(iiiIlllIIIIIIlIIIlll.IlIlIIIllIIllIlllllI("buyB"));
        }
        if (iiiIlllIIIIIIlIIIlll.IlIlIlIlIlllllllllIl("uses", 99)) {
            this.IlIIIlIlIIIllIlIlIIl = iiiIlllIIIIIIlIIIlll.IllIIlllIIIIlllIIlIl("uses");
        }
        if (iiiIlllIIIIIIlIIIlll.IlIlIlIlIlllllllllIl("maxUses", 99)) {
            this.IlIlIIIllIllIIIIIllI = iiiIlllIIIIIIlIIIlll.IllIIlllIIIIlllIIlIl("maxUses");
        }
        else {
            this.IlIlIIIllIllIIIIIllI = 7;
        }
        if (iiiIlllIIIIIIlIIIlll.IlIlIlIlIlllllllllIl("rewardExp", 1)) {
            this.IllIIlllIIIIlllIIlIl = iiiIlllIIIIIIlIIIlll.IIIIlllIIIIIIlIIIlll("rewardExp");
        }
        else {
            this.IllIIlllIIIIlllIIlIl = true;
        }
    }
    
    public IIIIlllIIIIIIlIIIlll llIllIlIIIIllIlIIllI() {
        final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll = new IIIIlllIIIIIIlIIIlll();
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("buy", this.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(new IIIIlllIIIIIIlIIIlll()));
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("sell", this.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(new IIIIlllIIIIIIlIIIlll()));
        if (this.IlIlIlIlIlllllllllIl != null) {
            iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("buyB", this.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl(new IIIIlllIIIIIIlIIIlll()));
        }
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("uses", this.IlIIIlIlIIIllIlIlIIl);
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("maxUses", this.IlIlIIIllIllIIIIIllI);
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("rewardExp", this.IllIIlllIIIIlllIIlIl);
        return iiiIlllIIIIIIlIIIlll;
    }
}
