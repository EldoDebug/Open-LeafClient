package net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll;

import net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.IllIIlllIIIIlllIIlIl.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.lIIIlllIIIllIIIllIII.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.llIllIlIIIIllIlIIllI.*;
import net.minecraft.llllIIIIlIIIlIlllIll.*;

public class lIIIIlIIIIIlllIllIII extends IlIlIIIllIllIIIIIllI
{
    private final IlIllIlIlIIIlIlIlIII llllIIIIlIIIlIlllIll;
    private final float IlIlIlIlIlllllllllIl;
    private float llIllIIIIIllIlIIIIlI;
    private boolean IlIIIlIlIIIllIlIlIIl;
    private int IlIlIIIllIllIIIIIllI;
    private int IllIIlllIIIIlllIIlIl;
    
    public lIIIIlIIIIIlllIllIII(final IlIllIlIlIIIlIlIlIII llllIIIIlIIIlIlllIll, final float ilIlIlIlIlllllllllIl) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
        this.llllIIIIlIIIlIlllIll(7);
    }
    
    @Override
    public void IlIlIIIllIllIIIIIllI() {
        this.llIllIIIIIllIlIIIIlI = 0.0f;
    }
    
    @Override
    public void llIllIIIIIllIlIIIIlI() {
        this.IlIIIlIlIIIllIlIlIIl = false;
        this.llIllIIIIIllIlIIIIlI = 0.0f;
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll() {
        return this.llllIIIIlIIIlIlllIll.llllIllllIllllIlIlII() && this.llllIIIIlIIIlIlllIll.IIllIIllIIIlIlIIIIlI != null && this.llllIIIIlIIIlIlllIll.IIllIIllIIIlIlIIIIlI instanceof llllIIIIlIIIlIlllIll && (this.IlIIIlIlIIIllIlIlIIl || this.llllIIIIlIIIlIlllIll.o());
    }
    
    @Override
    public void IlIIIlIlIIIllIlIlIIl() {
        final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll = (llllIIIIlIIIlIlllIll)this.llllIIIIlIIIlIlllIll.IIllIIllIIIlIlIIIIlI;
        final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl = (llIIlIIIlIIIllIlIIIl)this.llllIIIIlIIIlIlllIll;
        float n = llIllIIlllllllllllll.llllIIIlIlllIlIIIIIl(llllIIIIlIIIlIlllIll.IIlIIIIIllIlIIIlIIll - this.llllIIIIlIIIlIlllIll.IIlIIIIIllIlIIIlIIll) * 0.5f;
        if (n > 5.0f) {
            n = 5.0f;
        }
        if (n < -5.0f) {
            n = -5.0f;
        }
        this.llllIIIIlIIIlIlllIll.IIlIIIIIllIlIIIlIIll = llIllIIlllllllllllll.llllIIIlIlllIlIIIIIl(this.llllIIIIlIIIlIlllIll.IIlIIIIIllIlIIIlIIll + n);
        if (this.llIllIIIIIllIlIIIIlI < this.IlIlIlIlIlllllllllIl) {
            this.llIllIIIIIllIlIIIIlI += (this.IlIlIlIlIlllllllllIl - this.llIllIIIIIllIlIIIIlI) * 0.01f;
        }
        if (this.llIllIIIIIllIlIIIIlI > this.IlIlIlIlIlllllllllIl) {
            this.llIllIIIIIllIlIIIIlI = this.IlIlIlIlIlllllllllIl;
        }
        final int llIllIIIIIllIlIIIIlI = llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(this.llllIIIIlIIIlIlllIll.IIlllIlIIllIlIlIlIIl);
        final int llIllIIIIIllIlIIIIlI2 = llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(this.llllIIIIlIIIlIlllIll.llIIIlIlIllIIlIlIlII);
        final int llIllIIIIIllIlIIIIlI3 = llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(this.llllIIIIlIIIlIlllIll.lllllIlIIIlIlIIlllII);
        float llIllIIIIIllIlIIIIlI4 = this.llIllIIIIIllIlIIIIlI;
        if (this.IlIIIlIlIIIllIlIlIIl) {
            if (this.IlIlIIIllIllIIIIIllI++ > this.IllIIlllIIIIlllIIlIl) {
                this.IlIIIlIlIIIllIlIlIIl = false;
            }
            llIllIIIIIllIlIIIIlI4 += llIllIIIIIllIlIIIIlI4 * 1.15f * llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(this.IlIlIIIllIllIIIIIllI / (float)this.IllIIlllIIIIlllIIlIl * 3.1415927f);
        }
        float n2 = 0.91f;
        if (this.llllIIIIlIIIlIlllIll.IIIIIllIIIIlIIIIllIl) {
            n2 = this.llllIIIIlIIIlIlllIll.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(new IlIlIlIlIlllllllllIl(llIllIIlllllllllllll.IlIIIlIlIIIllIlIlIIl((float)llIllIIIIIllIlIIIIlI), llIllIIlllllllllllll.IlIIIlIlIIIllIlIlIIl((float)llIllIIIIIllIlIIIIlI2) - 1, llIllIIlllllllllllll.IlIIIlIlIIIllIlIlIIl((float)llIllIIIIIllIlIIIIlI3))).llIllIIIIIllIlIIIIlI().IlIIIlIIIllllIlIlIlI * 0.91f;
        }
        final float n3 = 0.16277136f / (n2 * n2 * n2);
        final float llllIIIIlIIIlIlllIll2 = llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(llIIlIIIlIIIllIlIIIl.IIlIIIIIllIlIIIlIIll * 3.1415927f / 180.0f);
        final float ilIlIlIlIlllllllllIl = llIllIIlllllllllllll.IlIlIlIlIlllllllllIl(llIIlIIIlIIIllIlIIIl.IIlIIIIIllIlIIIlIIll * 3.1415927f / 180.0f);
        final float n4 = llIllIIIIIllIlIIIIlI4 * (llIIlIIIlIIIllIlIIIl.ag() * n3 / Math.max(llIllIIIIIllIlIIIIlI4, 1.0f));
        float n5 = -(n4 * llllIIIIlIIIlIlllIll2);
        float n6 = n4 * ilIlIlIlIlllllllllIl;
        if (llIllIIlllllllllllll.IlIlIIIllIllIIIIIllI(n5) > llIllIIlllllllllllll.IlIlIIIllIllIIIIIllI(n6)) {
            if (n5 < 0.0f) {
                n5 -= this.llllIIIIlIIIlIlllIll.IllIllIIIIlIIlIlllII / 2.0f;
            }
            if (n5 > 0.0f) {
                n5 += this.llllIIIIlIIIlIlllIll.IllIllIIIIlIIlIlllII / 2.0f;
            }
            n6 = 0.0f;
        }
        else {
            n5 = 0.0f;
            if (n6 < 0.0f) {
                n6 -= this.llllIIIIlIIIlIlllIll.IllIllIIIIlIIlIlllII / 2.0f;
            }
            if (n6 > 0.0f) {
                n6 += this.llllIIIIlIIIlIlllIll.IllIllIIIIlIIlIlllII / 2.0f;
            }
        }
        final int llIllIIIIIllIlIIIIlI5 = llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(this.llllIIIIlIIIlIlllIll.IIlllIlIIllIlIlIlIIl + n5);
        final int llIllIIIIIllIlIIIIlI6 = llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(this.llllIIIIlIIIlIlllIll.lllllIlIIIlIlIIlllII + n6);
        final int ilIIIlIlIIIllIlIlIIl = llIllIIlllllllllllll.IlIIIlIlIIIllIlIlIIl(this.llllIIIIlIIIlIlllIll.IllIllIIIIlIIlIlllII + 1.0f);
        final int ilIIIlIlIIIllIlIlIIl2 = llIllIIlllllllllllll.IlIIIlIlIIIllIlIlIIl(this.llllIIIIlIIIlIlllIll.IlIllllIIlIIlIlIlIll + llllIIIIlIIIlIlllIll.IlIllllIIlIIlIlIlIll + 1.0f);
        final int ilIIIlIlIIIllIlIlIIl3 = llIllIIlllllllllllll.IlIIIlIlIIIllIlIlIIl(this.llllIIIIlIIIlIlllIll.IllIllIIIIlIIlIlllII + 1.0f);
        if (llIllIIIIIllIlIIIIlI != llIllIIIIIllIlIIIIlI5 || llIllIIIIIllIlIIIIlI3 != llIllIIIIIllIlIIIIlI6) {
            final net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llIllIIIIIllIlIIIIlI7 = this.llllIIIIlIIIlIlllIll.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(new IlIlIlIlIlllllllllIl(llIllIIIIIllIlIIIIlI, llIllIIIIIllIlIIIIlI2, llIllIIIIIllIlIIIIlI3)).llIllIIIIIllIlIIIIlI();
            if (!this.llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI7) && (llIllIIIIIllIlIIIIlI7.IllIIlllIIIIlllIIlIl() != net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll || !this.llllIIIIlIIIlIlllIll(this.llllIIIIlIIIlIlllIll.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(new IlIlIlIlIlllllllllIl(llIllIIIIIllIlIIIIlI, llIllIIIIIllIlIIIIlI2 - 1, llIllIIIIIllIlIIIIlI3)).llIllIIIIIllIlIIIIlI())) && net.minecraft.IIIlIIlIIIIlllIlllII.IllIIlllIIIIlllIIlIl.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(this.llllIIIIlIIIlIlllIll.IlllllllIIIlIIIlIlII, this.llllIIIIlIIIlIlllIll, llIllIIIIIllIlIIIIlI5, llIllIIIIIllIlIIIIlI2, llIllIIIIIllIlIIIIlI6, ilIIIlIlIIIllIlIlIIl, ilIIIlIlIIIllIlIlIIl2, ilIIIlIlIIIllIlIlIIl3, false, false, true) == 0 && 1 == net.minecraft.IIIlIIlIIIIlllIlllII.IllIIlllIIIIlllIIlIl.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(this.llllIIIIlIIIlIlllIll.IlllllllIIIlIIIlIlII, this.llllIIIIlIIIlIlllIll, llIllIIIIIllIlIIIIlI, llIllIIIIIllIlIIIIlI2 + 1, llIllIIIIIllIlIIIIlI3, ilIIIlIlIIIllIlIlIIl, ilIIIlIlIIIllIlIlIIl2, ilIIIlIlIIIllIlIlIIl3, false, false, true) && 1 == net.minecraft.IIIlIIlIIIIlllIlllII.IllIIlllIIIIlllIIlIl.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(this.llllIIIIlIIIlIlllIll.IlllllllIIIlIIIlIlII, this.llllIIIIlIIIlIlllIll, llIllIIIIIllIlIIIIlI5, llIllIIIIIllIlIIIIlI2 + 1, llIllIIIIIllIlIIIIlI6, ilIIIlIlIIIllIlIlIIl, ilIIIlIlIIIllIlIlIIl2, ilIIIlIlIIIllIlIlIIl3, false, false, true)) {
                llIIlIIIlIIIllIlIIIl.lllllIlIIIlIlIIlllII().llllIIIIlIIIlIlllIll();
            }
        }
        if (!llllIIIIlIIIlIlllIll.K.IlIIIlIlIIIllIlIlIIl && this.llIllIIIIIllIlIIIIlI >= this.IlIlIlIlIlllllllllIl * 0.5f && this.llllIIIIlIIIlIlllIll.B().nextFloat() < 0.006f && !this.IlIIIlIlIIIllIlIlIIl) {
            final lllIIIIlIlIllIIlIIIl n7 = llllIIIIlIIIlIlllIll.n();
            if (n7 != null && n7.llllIIIIlIIIlIlllIll() == IIllIIllIIIlIlIIIIlI.ac) {
                n7.llllIIIIlIIIlIlllIll(1, llllIIIIlIIIlIlllIll);
                if (n7.IlIlIlIlIlllllllllIl == 0) {
                    final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl = new lllIIIIlIlIllIIlIIIl(IIllIIllIIIlIlIIIIlI.lIIlllIlllllIIlllIll);
                    lllIIIIlIlIllIIlIIIl.IlIIIlIlIIIllIlIlIIl(n7.llllIIllllIlIlIIIIll());
                    llllIIIIlIIIlIlllIll.lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll[llllIIIIlIIIlIlllIll.lIlIlIIIllIIllIIIllI.llIllIIIIIllIlIIIIlI] = lllIIIIlIlIllIIlIIIl;
                }
            }
        }
        this.llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl(0.0f, llIllIIIIIllIlIIIIlI4);
    }
    
    private boolean llllIIIIlIIIlIlllIll(final net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        return llllIIIIlIIIlIlllIll instanceof cm || llllIIIIlIIIlIlllIll instanceof cc;
    }
    
    public boolean lIIIIlIIIIIlllIllIII() {
        return this.IlIIIlIlIIIllIlIlIIl;
    }
    
    public void lIIIlllIIIllIIIllIII() {
        this.IlIIIlIlIIIllIlIlIIl = true;
        this.IlIlIIIllIllIIIIIllI = 0;
        this.IllIIlllIIIIlllIIlIl = this.llllIIIIlIIIlIlllIll.B().nextInt(841) + 140;
    }
    
    public boolean llIIlIIIlIIIllIlIIIl() {
        return !this.lIIIIlIIIIIlllIllIII() && this.llIllIIIIIllIlIIIIlI > this.IlIlIlIlIlllllllllIl * 0.3f;
    }
}
