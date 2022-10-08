package net.minecraft.IIIIlllIIIIIIlIIIlll;

import net.minecraft.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;

public class IlIlIlIlIlllllllllIl
{
    private final lIIIIlIIIIIlllIllIII[] llllIIIIlIIIlIlllIll;
    private int IlIlIlIlIlllllllllIl;
    private int llIllIIIIIllIlIIIIlI;
    
    public IlIlIlIlIlllllllllIl(final lIIIIlIIIIIlllIllIII[] llllIIIIlIIIlIlllIll) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.llIllIIIIIllIlIIIIlI = llllIIIIlIIIlIlllIll.length;
    }
    
    public void llllIIIIlIIIlIlllIll() {
        ++this.IlIlIlIlIlllllllllIl;
    }
    
    public boolean IlIlIlIlIlllllllllIl() {
        return this.IlIlIlIlIlllllllllIl >= this.llIllIIIIIllIlIIIIlI;
    }
    
    public lIIIIlIIIIIlllIllIII llIllIIIIIllIlIIIIlI() {
        return (this.llIllIIIIIllIlIIIIlI > 0) ? this.llllIIIIlIIIlIlllIll[this.llIllIIIIIllIlIIIIlI - 1] : null;
    }
    
    public lIIIIlIIIIIlllIllIII llllIIIIlIIIlIlllIll(final int n) {
        return this.llllIIIIlIIIlIlllIll[n];
    }
    
    public int IlIIIlIlIIIllIlIlIIl() {
        return this.llIllIIIIIllIlIIIIlI;
    }
    
    public void IlIlIlIlIlllllllllIl(final int llIllIIIIIllIlIIIIlI) {
        this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
    }
    
    public int IlIlIIIllIllIIIIIllI() {
        return this.IlIlIlIlIlllllllllIl;
    }
    
    public void llIllIIIIIllIlIIIIlI(final int ilIlIlIlIlllllllllIl) {
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
    }
    
    public e llllIIIIlIIIlIlllIll(final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI, final int n) {
        return new e(this.llllIIIIlIIIlIlllIll[n].llllIIIIlIIIlIlllIll + (int)(llIllIIIIIllIlIIIIlI.IllIllIIIIlIIlIlllII + 1.0f) * 0.5, this.llllIIIIlIIIlIlllIll[n].IlIlIlIlIlllllllllIl, this.llllIIIIlIIIlIlllIll[n].llIllIIIIIllIlIIIIlI + (int)(llIllIIIIIllIlIIIIlI.IllIllIIIIlIIlIlllII + 1.0f) * 0.5);
    }
    
    public e llllIIIIlIIIlIlllIll(final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI) {
        return this.llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI, this.IlIlIlIlIlllllllllIl);
    }
    
    public boolean llllIIIIlIIIlIlllIll(final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        if (ilIlIlIlIlllllllllIl == null) {
            return false;
        }
        if (ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.length != this.llllIIIIlIIIlIlllIll.length) {
            return false;
        }
        for (int i = 0; i < this.llllIIIIlIIIlIlllIll.length; ++i) {
            if (this.llllIIIIlIIIlIlllIll[i].llllIIIIlIIIlIlllIll != ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll[i].llllIIIIlIIIlIlllIll || this.llllIIIIlIIIlIlllIll[i].IlIlIlIlIlllllllllIl != ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll[i].IlIlIlIlIlllllllllIl || this.llllIIIIlIIIlIlllIll[i].llIllIIIIIllIlIIIIlI != ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll[i].llIllIIIIIllIlIIIIlI) {
                return false;
            }
        }
        return true;
    }
    
    public boolean llllIIIIlIIIlIlllIll(final e e) {
        final lIIIIlIIIIIlllIllIII llIllIIIIIllIlIIIIlI = this.llIllIIIIIllIlIIIIlI();
        return llIllIIIIIllIlIIIIlI != null && (llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll == (int)e.llllIIIIlIIIlIlllIll && llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI == (int)e.llIllIIIIIllIlIIIIlI);
    }
}
