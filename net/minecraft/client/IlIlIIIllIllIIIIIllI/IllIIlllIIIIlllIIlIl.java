package net.minecraft.client.IlIlIIIllIllIIIIIllI;

import net.minecraft.lIlIlIIIllIIllIIIllI.*;

public class IllIIlllIIIIlllIIlIl
{
    public String llllIIIIlIIIlIlllIll;
    public String IlIlIlIlIlllllllllIl;
    public String llIllIIIIIllIlIIIIlI;
    public String IlIIIlIlIIIllIlIlIIl;
    public long IlIlIIIllIllIIIIIllI;
    public int IllIIlllIIIIlllIIlIl;
    public String llllIIIlIlllIlIIIIIl;
    public boolean lIIIIlIIIIIlllIllIII;
    public String lIIIlllIIIllIIIllIII;
    private llllIIIlIlllIlIIIIIl llIIlIIIlIIIllIlIIIl;
    private String llIllIlIIIIllIlIIllI;
    private boolean lIlIlIIIllIIllIIIllI;
    
    public IllIIlllIIIIlllIIlIl(final String llllIIIIlIIIlIlllIll, final String ilIlIlIlIlllllllllIl, final boolean lIlIlIIIllIIllIIIllI) {
        this.IllIIlllIIIIlllIIlIl = 47;
        this.llllIIIlIlllIlIIIIIl = "1.8.9";
        this.llIIlIIIlIIIllIlIIIl = net.minecraft.client.IlIlIIIllIllIIIIIllI.llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI;
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
        this.lIlIlIIIllIIllIIIllI = lIlIlIIIllIIllIIIllI;
    }
    
    public IIIIlllIIIIIIlIIIlll llllIIIIlIIIlIlllIll() {
        final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll = new IIIIlllIIIIIIlIIIlll();
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("name", this.llllIIIIlIIIlIlllIll);
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("ip", this.IlIlIlIlIlllllllllIl);
        if (this.llIllIlIIIIllIlIIllI != null) {
            iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("icon", this.llIllIlIIIIllIlIIllI);
        }
        if (this.llIIlIIIlIIIllIlIIIl == net.minecraft.client.IlIlIIIllIllIIIIIllI.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll) {
            iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("acceptTextures", true);
        }
        else if (this.llIIlIIIlIIIllIlIIIl == net.minecraft.client.IlIlIIIllIllIIIIIllI.llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl) {
            iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("acceptTextures", false);
        }
        return iiiIlllIIIIIIlIIIlll;
    }
    
    public llllIIIlIlllIlIIIIIl IlIlIlIlIlllllllllIl() {
        return this.llIIlIIIlIIIllIlIIIl;
    }
    
    public void llllIIIIlIIIlIlllIll(final llllIIIlIlllIlIIIIIl llIIlIIIlIIIllIlIIIl) {
        this.llIIlIIIlIIIllIlIIIl = llIIlIIIlIIIllIlIIIl;
    }
    
    public static IllIIlllIIIIlllIIlIl llllIIIIlIIIlIlllIll(final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll) {
        final IllIIlllIIIIlllIIlIl illIIlllIIIIlllIIlIl = new IllIIlllIIIIlllIIlIl(iiiIlllIIIIIIlIIIlll.llIIlIIIlIIIllIlIIIl("name"), iiiIlllIIIIIIlIIIlll.llIIlIIIlIIIllIlIIIl("ip"), false);
        if (iiiIlllIIIIIIlIIIlll.IlIlIlIlIlllllllllIl("icon", 8)) {
            illIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll(iiiIlllIIIIIIlIIIlll.llIIlIIIlIIIllIlIIIl("icon"));
        }
        if (iiiIlllIIIIIIlIIIlll.IlIlIlIlIlllllllllIl("acceptTextures", 1)) {
            if (iiiIlllIIIIIIlIIIlll.IIIIlllIIIIIIlIIIlll("acceptTextures")) {
                illIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll(llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll);
            }
            else {
                illIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll(llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl);
            }
        }
        else {
            illIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll(llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI);
        }
        return illIIlllIIIIlllIIlIl;
    }
    
    public String llIllIIIIIllIlIIIIlI() {
        return this.llIllIlIIIIllIlIIllI;
    }
    
    public void llllIIIIlIIIlIlllIll(final String llIllIlIIIIllIlIIllI) {
        this.llIllIlIIIIllIlIIllI = llIllIlIIIIllIlIIllI;
    }
    
    public boolean IlIIIlIlIIIllIlIlIIl() {
        return this.lIlIlIIIllIIllIIIllI;
    }
    
    public void llllIIIIlIIIlIlllIll(final IllIIlllIIIIlllIIlIl illIIlllIIIIlllIIlIl) {
        this.IlIlIlIlIlllllllllIl = illIIlllIIIIlllIIlIl.IlIlIlIlIlllllllllIl;
        this.llllIIIIlIIIlIlllIll = illIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll;
        this.llllIIIIlIIIlIlllIll(illIIlllIIIIlllIIlIl.IlIlIlIlIlllllllllIl());
        this.llIllIlIIIIllIlIIllI = illIIlllIIIIlllIIlIl.llIllIlIIIIllIlIIllI;
        this.lIlIlIIIllIIllIIIllI = illIIlllIIIIlllIIlIl.lIlIlIIIllIIllIIIllI;
    }
}
