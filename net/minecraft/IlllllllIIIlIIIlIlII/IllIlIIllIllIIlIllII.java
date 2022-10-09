package net.minecraft.IlllllllIIIlIIIlIlII;

import net.minecraft.llIllIlIIIIllIlIIllI.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.lIlIlIIIllIIllIIIllI.*;

public class IllIlIIllIllIIlIllII
{
    private int llllIIIIlIIIlIlllIll;
    private float IlIlIlIlIlllllllllIl;
    private float llIllIIIIIllIlIIIIlI;
    private int IlIIIlIlIIIllIlIlIIl;
    private int IlIlIIIllIllIIIIIllI;
    
    public IllIlIIllIllIIlIllII() {
        this.llllIIIIlIIIlIlllIll = 20;
        this.IlIlIlIlIlllllllllIl = 5.0f;
        this.IlIlIIIllIllIIIIIllI = 20;
    }
    
    public void llllIIIIlIIIlIlllIll(final int n, final float n2) {
        this.llllIIIIlIIIlIlllIll = Math.min(n + this.llllIIIIlIIIlIlllIll, 20);
        this.IlIlIlIlIlllllllllIl = Math.min(this.IlIlIlIlIlllllllllIl + n * n2 * 2.0f, (float)this.llllIIIIlIIIlIlllIll);
    }
    
    public void llllIIIIlIIIlIlllIll(final lIllIIIIIlllIIlIIllI lIllIIIIIlllIIlIIllI, final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl) {
        this.llllIIIIlIIIlIlllIll(lIllIIIIIlllIIlIIllI.llIllIlIIIIllIlIIllI(lllIIIIlIlIllIIlIIIl), lIllIIIIIlllIIlIIllI.lIlIlIIIllIIllIIIllI(lllIIIIlIlIllIIlIIIl));
    }
    
    public void llllIIIIlIIIlIlllIll(final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        final IllIIlllIIIIlllIIlIl lllIllIIIllllllIllll = llllIIIIlIIIlIlllIll.IlllllllIIIlIIIlIlII.lllIllIIIllllllIllll();
        this.IlIlIIIllIllIIIIIllI = this.llllIIIIlIIIlIlllIll;
        if (this.llIllIIIIIllIlIIIIlI > 4.0f) {
            this.llIllIIIIIllIlIIIIlI -= 4.0f;
            if (this.IlIlIlIlIlllllllllIl > 0.0f) {
                this.IlIlIlIlIlllllllllIl = Math.max(this.IlIlIlIlIlllllllllIl - 1.0f, 0.0f);
            }
            else if (lllIllIIIllllllIllll != IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll) {
                this.llllIIIIlIIIlIlllIll = Math.max(this.llllIIIIlIIIlIlllIll - 1, 0);
            }
        }
        if (llllIIIIlIIIlIlllIll.IlllllllIIIlIIIlIlII.llIIlllIIlllIIllIllI().IlIlIlIlIlllllllllIl("naturalRegeneration") && this.llllIIIIlIIIlIlllIll >= 18 && llllIIIIlIIIlIlllIll.ar()) {
            ++this.IlIIIlIlIIIllIlIlIIl;
            if (this.IlIIIlIlIIIllIlIlIIl >= 80) {
                llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(1.0f);
                this.llllIIIIlIIIlIlllIll(3.0f);
                this.IlIIIlIlIIIllIlIlIIl = 0;
            }
        }
        else if (this.llllIIIIlIIIlIlllIll <= 0) {
            ++this.IlIIIlIlIIIllIlIlIIl;
            if (this.IlIIIlIlIIIllIlIlIIl >= 80) {
                if (llllIIIIlIIIlIlllIll.N() > 10.0f || lllIllIIIllllllIllll == IllIIlllIIIIlllIIlIl.IlIIIlIlIIIllIlIlIIl || (llllIIIIlIIIlIlllIll.N() > 1.0f && lllIllIIIllllllIllll == IllIIlllIIIIlllIIlIl.llIllIIIIIllIlIIIIlI)) {
                    llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(lIllllllIIllIlIlIlII.llllIIIlIlllIlIIIIIl, 1.0f);
                }
                this.IlIIIlIlIIIllIlIlIIl = 0;
            }
        }
        else {
            this.IlIIIlIlIIIllIlIlIIl = 0;
        }
    }
    
    public void llllIIIIlIIIlIlllIll(final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll) {
        if (iiiIlllIIIIIIlIIIlll.IlIlIlIlIlllllllllIl("foodLevel", 99)) {
            this.llllIIIIlIIIlIlllIll = iiiIlllIIIIIIlIIIlll.IllIIlllIIIIlllIIlIl("foodLevel");
            this.IlIIIlIlIIIllIlIlIIl = iiiIlllIIIIIIlIIIlll.IllIIlllIIIIlllIIlIl("foodTickTimer");
            this.IlIlIlIlIlllllllllIl = iiiIlllIIIIIIlIIIlll.lIIIIlIIIIIlllIllIII("foodSaturationLevel");
            this.llIllIIIIIllIlIIIIlI = iiiIlllIIIIIIlIIIlll.lIIIIlIIIIIlllIllIII("foodExhaustionLevel");
        }
    }
    
    public void IlIlIlIlIlllllllllIl(final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll) {
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("foodLevel", this.llllIIIIlIIIlIlllIll);
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("foodTickTimer", this.IlIIIlIlIIIllIlIlIIl);
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("foodSaturationLevel", this.IlIlIlIlIlllllllllIl);
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("foodExhaustionLevel", this.llIllIIIIIllIlIIIIlI);
    }
    
    public int llllIIIIlIIIlIlllIll() {
        return this.llllIIIIlIIIlIlllIll;
    }
    
    public int IlIlIlIlIlllllllllIl() {
        return this.IlIlIIIllIllIIIIIllI;
    }
    
    public boolean llIllIIIIIllIlIIIIlI() {
        return this.llllIIIIlIIIlIlllIll < 20;
    }
    
    public void llllIIIIlIIIlIlllIll(final float n) {
        this.llIllIIIIIllIlIIIIlI = Math.min(this.llIllIIIIIllIlIIIIlI + n, 40.0f);
    }
    
    public float IlIIIlIlIIIllIlIlIIl() {
        return this.IlIlIlIlIlllllllllIl;
    }
    
    public void llllIIIIlIIIlIlllIll(final int llllIIIIlIIIlIlllIll) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
    }
    
    public void IlIlIlIlIlllllllllIl(final float ilIlIlIlIlllllllllIl) {
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
    }
}
