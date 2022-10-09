package net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl;

import net.minecraft.lIlIlIIIllIIllIIIllI.*;

public class lIIIIlIIIIIlllIllIII
{
    public boolean llllIIIIlIIIlIlllIll;
    public boolean IlIlIlIlIlllllllllIl;
    public boolean llIllIIIIIllIlIIIIlI;
    public boolean IlIIIlIlIIIllIlIlIIl;
    public boolean IlIlIIIllIllIIIIIllI;
    private float IllIIlllIIIIlllIIlIl;
    private float llllIIIlIlllIlIIIIIl;
    
    public lIIIIlIIIIIlllIllIII() {
        this.IlIlIIIllIllIIIIIllI = true;
        this.IllIIlllIIIIlllIIlIl = 0.05f;
        this.llllIIIlIlllIlIIIIIl = 0.1f;
    }
    
    public void llllIIIIlIIIlIlllIll(final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll) {
        final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll2 = new IIIIlllIIIIIIlIIIlll();
        iiiIlllIIIIIIlIIIlll2.llllIIIIlIIIlIlllIll("invulnerable", this.llllIIIIlIIIlIlllIll);
        iiiIlllIIIIIIlIIIlll2.llllIIIIlIIIlIlllIll("flying", this.IlIlIlIlIlllllllllIl);
        iiiIlllIIIIIIlIIIlll2.llllIIIIlIIIlIlllIll("mayfly", this.llIllIIIIIllIlIIIIlI);
        iiiIlllIIIIIIlIIIlll2.llllIIIIlIIIlIlllIll("instabuild", this.IlIIIlIlIIIllIlIlIIl);
        iiiIlllIIIIIIlIIIlll2.llllIIIIlIIIlIlllIll("mayBuild", this.IlIlIIIllIllIIIIIllI);
        iiiIlllIIIIIIlIIIlll2.llllIIIIlIIIlIlllIll("flySpeed", this.IllIIlllIIIIlllIIlIl);
        iiiIlllIIIIIIlIIIlll2.llllIIIIlIIIlIlllIll("walkSpeed", this.llllIIIlIlllIlIIIIIl);
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("abilities", iiiIlllIIIIIIlIIIlll2);
    }
    
    public void IlIlIlIlIlllllllllIl(final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll) {
        if (iiiIlllIIIIIIlIIIlll.IlIlIlIlIlllllllllIl("abilities", 10)) {
            final IIIIlllIIIIIIlIIIlll ilIlIIIllIIllIlllllI = iiiIlllIIIIIIlIIIlll.IlIlIIIllIIllIlllllI("abilities");
            this.llllIIIIlIIIlIlllIll = ilIlIIIllIIllIlllllI.IIIIlllIIIIIIlIIIlll("invulnerable");
            this.IlIlIlIlIlllllllllIl = ilIlIIIllIIllIlllllI.IIIIlllIIIIIIlIIIlll("flying");
            this.llIllIIIIIllIlIIIIlI = ilIlIIIllIIllIlllllI.IIIIlllIIIIIIlIIIlll("mayfly");
            this.IlIIIlIlIIIllIlIlIIl = ilIlIIIllIIllIlllllI.IIIIlllIIIIIIlIIIlll("instabuild");
            if (ilIlIIIllIIllIlllllI.IlIlIlIlIlllllllllIl("flySpeed", 99)) {
                this.IllIIlllIIIIlllIIlIl = ilIlIIIllIIllIlllllI.lIIIIlIIIIIlllIllIII("flySpeed");
                this.llllIIIlIlllIlIIIIIl = ilIlIIIllIIllIlllllI.lIIIIlIIIIIlllIllIII("walkSpeed");
            }
            if (ilIlIIIllIIllIlllllI.IlIlIlIlIlllllllllIl("mayBuild", 1)) {
                this.IlIlIIIllIllIIIIIllI = ilIlIIIllIIllIlllllI.IIIIlllIIIIIIlIIIlll("mayBuild");
            }
        }
    }
    
    public float llllIIIIlIIIlIlllIll() {
        return this.IllIIlllIIIIlllIIlIl;
    }
    
    public void llllIIIIlIIIlIlllIll(final float illIIlllIIIIlllIIlIl) {
        this.IllIIlllIIIIlllIIlIl = illIIlllIIIIlllIIlIl;
    }
    
    public float IlIlIlIlIlllllllllIl() {
        return this.llllIIIlIlllIlIIIIIl;
    }
    
    public void IlIlIlIlIlllllllllIl(final float llllIIIlIlllIlIIIIIl) {
        this.llllIIIlIlllIlIIIIIl = llllIIIlIlllIlIIIIIl;
    }
}
