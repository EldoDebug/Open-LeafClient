package net.minecraft.IIIlIIlIIIIlllIlllII;

import net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.*;

public enum lllIllIIIllllllIllll
{
    llllIIIIlIIIlIlllIll("NOT_SET", 0, -1, ""), 
    IlIlIlIlIlllllllllIl("SURVIVAL", 1, 0, "survival"), 
    llIllIIIIIllIlIIIIlI("CREATIVE", 2, 1, "creative"), 
    IlIIIlIlIIIllIlIlIIl("ADVENTURE", 3, 2, "adventure"), 
    IlIlIIIllIllIIIIIllI("SPECTATOR", 4, 3, "spectator");
    
    int IllIIlllIIIIlllIIlIl;
    String llllIIIlIlllIlIIIIIl;
    
    static {
        lIIIIlIIIIIlllIllIII = new lllIllIIIllllllIllll[] { lllIllIIIllllllIllll.llllIIIIlIIIlIlllIll, lllIllIIIllllllIllll.IlIlIlIlIlllllllllIl, lllIllIIIllllllIllll.llIllIIIIIllIlIIIIlI, lllIllIIIllllllIllll.IlIIIlIlIIIllIlIlIIl, lllIllIIIllllllIllll.IlIlIIIllIllIIIIIllI };
    }
    
    private lllIllIIIllllllIllll(final String s, final int n, final int illIIlllIIIIlllIIlIl, final String llllIIIlIlllIlIIIIIl) {
        this.IllIIlllIIIIlllIIlIl = illIIlllIIIIlllIIlIl;
        this.llllIIIlIlllIlIIIIIl = llllIIIlIlllIlIIIIIl;
    }
    
    public int llllIIIIlIIIlIlllIll() {
        return this.IllIIlllIIIIlllIIlIl;
    }
    
    public String IlIlIlIlIlllllllllIl() {
        return this.llllIIIlIlllIlIIIIIl;
    }
    
    public void llllIIIIlIIIlIlllIll(final lIIIIlIIIIIlllIllIII liiiIlIIIIIlllIllIII) {
        if (this == lllIllIIIllllllIllll.llIllIIIIIllIlIIIIlI) {
            liiiIlIIIIIlllIllIII.llIllIIIIIllIlIIIIlI = true;
            liiiIlIIIIIlllIllIII.IlIIIlIlIIIllIlIlIIl = true;
            liiiIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll = true;
        }
        else if (this == lllIllIIIllllllIllll.IlIlIIIllIllIIIIIllI) {
            liiiIlIIIIIlllIllIII.llIllIIIIIllIlIIIIlI = true;
            liiiIlIIIIIlllIllIII.IlIIIlIlIIIllIlIlIIl = false;
            liiiIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll = true;
            liiiIlIIIIIlllIllIII.IlIlIlIlIlllllllllIl = true;
        }
        else {
            liiiIlIIIIIlllIllIII.llIllIIIIIllIlIIIIlI = false;
            liiiIlIIIIIlllIllIII.IlIIIlIlIIIllIlIlIIl = false;
            liiiIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll = false;
            liiiIlIIIIIlllIllIII.IlIlIlIlIlllllllllIl = false;
        }
        liiiIlIIIIIlllIllIII.IlIlIIIllIllIIIIIllI = !this.llIllIIIIIllIlIIIIlI();
    }
    
    public boolean llIllIIIIIllIlIIIIlI() {
        return this == lllIllIIIllllllIllll.IlIIIlIlIIIllIlIlIIl || this == lllIllIIIllllllIllll.IlIlIIIllIllIIIIIllI;
    }
    
    public boolean IlIIIlIlIIIllIlIlIIl() {
        return this == lllIllIIIllllllIllll.llIllIIIIIllIlIIIIlI;
    }
    
    public boolean IlIlIIIllIllIIIIIllI() {
        return this == lllIllIIIllllllIllll.IlIlIlIlIlllllllllIl || this == lllIllIIIllllllIllll.IlIIIlIlIIIllIlIlIIl;
    }
    
    public static lllIllIIIllllllIllll llllIIIIlIIIlIlllIll(final int n) {
        lllIllIIIllllllIllll[] values;
        for (int length = (values = values()).length, i = 0; i < length; ++i) {
            final lllIllIIIllllllIllll lllIllIIIllllllIllll = values[i];
            if (lllIllIIIllllllIllll.IllIIlllIIIIlllIIlIl == n) {
                return lllIllIIIllllllIllll;
            }
        }
        return lllIllIIIllllllIllll.IlIlIlIlIlllllllllIl;
    }
    
    public static lllIllIIIllllllIllll llllIIIIlIIIlIlllIll(final String s) {
        lllIllIIIllllllIllll[] values;
        for (int length = (values = values()).length, i = 0; i < length; ++i) {
            final lllIllIIIllllllIllll lllIllIIIllllllIllll = values[i];
            if (lllIllIIIllllllIllll.llllIIIlIlllIlIIIIIl.equals(s)) {
                return lllIllIIIllllllIllll;
            }
        }
        return lllIllIIIllllllIllll.IlIlIlIlIlllllllllIl;
    }
}
