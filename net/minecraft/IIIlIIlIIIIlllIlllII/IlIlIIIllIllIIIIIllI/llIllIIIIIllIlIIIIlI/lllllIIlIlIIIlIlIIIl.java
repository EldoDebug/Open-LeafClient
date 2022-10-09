package net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI;

import net.minecraft.IlllllllIIIlIIIlIlII.*;

class lllllIIlIlIIIlIlIIIl
{
    int llllIIIIlIIIlIlllIll;
    lllllIIlIlIIIlIlIIIl[] IlIlIlIlIlllllllllIl;
    boolean[] llIllIIIIIllIlIIIIlI;
    boolean IlIIIlIlIIIllIlIlIIl;
    boolean IlIlIIIllIllIIIIIllI;
    int IllIIlllIIIIlllIIlIl;
    
    public lllllIIlIlIIIlIlIIIl(final int llllIIIIlIIIlIlllIll) {
        this.IlIlIlIlIlllllllllIl = new lllllIIlIlIIIlIlIIIl[6];
        this.llIllIIIIIllIlIIIIlI = new boolean[6];
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
    }
    
    public void llllIIIIlIIIlIlllIll(final lllIllIIIllllllIllll lllIllIIIllllllIllll, final lllllIIlIlIIIlIlIIIl lllllIIlIlIIIlIlIIIl) {
        this.IlIlIlIlIlllllllllIl[lllIllIIIllllllIllll.IlIlIlIlIlllllllllIl()] = lllllIIlIlIIIlIlIIIl;
        lllllIIlIlIIIlIlIIIl.IlIlIlIlIlllllllllIl[lllIllIIIllllllIllll.IlIlIIIllIllIIIIIllI().IlIlIlIlIlllllllllIl()] = this;
    }
    
    public void llllIIIIlIIIlIlllIll() {
        for (int i = 0; i < 6; ++i) {
            this.llIllIIIIIllIlIIIIlI[i] = (this.IlIlIlIlIlllllllllIl[i] != null);
        }
    }
    
    public boolean llllIIIIlIIIlIlllIll(final int illIIlllIIIIlllIIlIl) {
        if (this.IlIlIIIllIllIIIIIllI) {
            return true;
        }
        this.IllIIlllIIIIlllIIlIl = illIIlllIIIIlllIIlIl;
        for (int i = 0; i < 6; ++i) {
            if (this.IlIlIlIlIlllllllllIl[i] != null && this.llIllIIIIIllIlIIIIlI[i] && this.IlIlIlIlIlllllllllIl[i].IllIIlllIIIIlllIIlIl != illIIlllIIIIlllIIlIl && this.IlIlIlIlIlllllllllIl[i].llllIIIIlIIIlIlllIll(illIIlllIIIIlllIIlIl)) {
                return true;
            }
        }
        return false;
    }
    
    public boolean IlIlIlIlIlllllllllIl() {
        return this.llllIIIIlIIIlIlllIll >= 75;
    }
    
    public int llIllIIIIIllIlIIIIlI() {
        int n = 0;
        for (int i = 0; i < 6; ++i) {
            if (this.llIllIIIIIllIlIIIIlI[i]) {
                ++n;
            }
        }
        return n;
    }
}
