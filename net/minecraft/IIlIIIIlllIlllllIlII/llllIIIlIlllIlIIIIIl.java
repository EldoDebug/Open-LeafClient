package net.minecraft.IIlIIIIlllIlllllIlII;

import net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.*;
import java.util.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIIIllIllIIIIIllI.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;

public class llllIIIlIlllIlIIIIIl
{
    private IlllllllIIIlIIIlIlII llllIIIIlIIIlIlllIll;
    private boolean IlIlIlIlIlllllllllIl;
    private int llIllIIIIIllIlIIIIlI;
    private int IlIIIlIlIIIllIlIlIIl;
    private int IlIlIIIllIllIIIIIllI;
    private llIllIIIIIllIlIIIIlI IllIIlllIIIIlllIIlIl;
    private int llllIIIlIlllIlIIIIIl;
    private int lIIIIlIIIIIlllIllIII;
    private int lIIIlllIIIllIIIllIII;
    
    public llllIIIlIlllIlIIIIIl(final IlllllllIIIlIIIlIlII llllIIIIlIIIlIlllIll) {
        this.llIllIIIIIllIlIIIIlI = -1;
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
    }
    
    public void llllIIIIlIIIlIlllIll() {
        if (this.llllIIIIlIIIlIlllIll.lIlIlIIIllIIllIIIllI()) {
            this.llIllIIIIIllIlIIIIlI = 0;
        }
        else if (this.llIllIIIIIllIlIIIIlI != 2) {
            if (this.llIllIIIIIllIlIIIIlI == 0) {
                final float llIllIIIIIllIlIIIIlI = this.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI(0.0f);
                if (llIllIIIIIllIlIIIIlI < 0.5 || llIllIIIIIllIlIIIIlI > 0.501) {
                    return;
                }
                this.llIllIIIIIllIlIIIIlI = ((this.llllIIIIlIIIlIlllIll.llllIIllllIlIlIIIIll.nextInt(10) == 0) ? 1 : 2);
                this.IlIlIlIlIlllllllllIl = false;
                if (this.llIllIIIIIllIlIIIIlI == 2) {
                    return;
                }
            }
            if (this.llIllIIIIIllIlIIIIlI != -1) {
                if (!this.IlIlIlIlIlllllllllIl) {
                    if (!this.IlIlIlIlIlllllllllIl()) {
                        return;
                    }
                    this.IlIlIlIlIlllllllllIl = true;
                }
                if (this.IlIlIIIllIllIIIIIllI > 0) {
                    --this.IlIlIIIllIllIIIIIllI;
                }
                else {
                    this.IlIlIIIllIllIIIIIllI = 2;
                    if (this.IlIIIlIlIIIllIlIlIIl > 0) {
                        this.llIllIIIIIllIlIIIIlI();
                        --this.IlIIIlIlIIIllIlIlIIl;
                    }
                    else {
                        this.llIllIIIIIllIlIIIIlI = 2;
                    }
                }
            }
        }
    }
    
    private boolean IlIlIlIlIlllllllllIl() {
        for (final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll : this.llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl) {
            if (!llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl()) {
                this.IllIIlllIIIIlllIIlIl = this.llllIIIIlIIIlIlllIll.IlIllllIIlIIlIlIlIll().llllIIIIlIIIlIlllIll(new IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll), 1);
                if (this.IllIIlllIIIIlllIIlIl == null || this.IllIIlllIIIIlllIIlIl.llIllIIIIIllIlIIIIlI() < 10 || this.IllIIlllIIIIlllIIlIl.IlIIIlIlIIIllIlIlIIl() < 20 || this.IllIIlllIIIIlllIIlIl.IlIlIIIllIllIIIIIllI() < 20) {
                    continue;
                }
                final IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll2 = this.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll();
                final float n = (float)this.IllIIlllIIIIlllIIlIl.IlIlIlIlIlllllllllIl();
                boolean b = false;
                for (int i = 0; i < 10; ++i) {
                    final float n2 = this.llllIIIIlIIIlIlllIll.llllIIllllIlIlIIIIll.nextFloat() * 3.1415927f * 2.0f;
                    this.llllIIIlIlllIlIIIIIl = llllIIIIlIIIlIlllIll2.lIIIIlIIIIIlllIllIII() + (int)(llIllIIlllllllllllll.IlIlIlIlIlllllllllIl(n2) * n * 0.9);
                    this.lIIIIlIIIIIlllIllIII = llllIIIIlIIIlIlllIll2.lIIIlllIIIllIIIllIII();
                    this.lIIIlllIIIllIIIllIII = llllIIIIlIIIlIlllIll2.llIIlIIIlIIIllIlIIIl() + (int)(llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(n2) * n * 0.9);
                    b = false;
                    for (final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI : this.llllIIIIlIIIlIlllIll.IlIllllIIlIIlIlIlIll().IlIlIlIlIlllllllllIl()) {
                        if (llIllIIIIIllIlIIIIlI != this.IllIIlllIIIIlllIIlIl && llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(new IlIlIlIlIlllllllllIl(this.llllIIIlIlllIlIIIIIl, this.lIIIIlIIIIIlllIllIII, this.lIIIlllIIIllIIIllIII))) {
                            b = true;
                            break;
                        }
                    }
                    if (!b) {
                        break;
                    }
                }
                if (b) {
                    return false;
                }
                if (this.llllIIIIlIIIlIlllIll(new IlIlIlIlIlllllllllIl(this.llllIIIlIlllIlIIIIIl, this.lIIIIlIIIIIlllIllIII, this.lIIIlllIIIllIIIllIII)) != null) {
                    this.IlIlIIIllIllIIIIIllI = 0;
                    this.IlIIIlIlIIIllIlIlIIl = 20;
                    return true;
                }
                continue;
            }
        }
        return false;
    }
    
    private boolean llIllIIIIIllIlIIIIlI() {
        final e llllIIIIlIIIlIlllIll = this.llllIIIIlIIIlIlllIll(new IlIlIlIlIlllllllllIl(this.llllIIIlIlllIlIIIIIl, this.lIIIIlIIIIIlllIllIII, this.lIIIlllIIIllIIIllIII));
        if (llllIIIIlIIIlIlllIll == null) {
            return false;
        }
        llIlIIIIIlIIlIlIIlll llIlIIIIIlIIlIlIIlll;
        try {
            llIlIIIIIlIIlIlIIlll = new llIlIIIIIlIIlIlIIlll(this.llllIIIIlIIIlIlllIll);
            llIlIIIIIlIIlIlIIlll.llllIIIIlIIIlIlllIll(this.llllIIIIlIIIlIlllIll.lIllllllIIllIlIlIlII(new IlIlIlIlIlllllllllIl(llIlIIIIIlIIlIlIIlll)), null);
            llIlIIIIIlIIlIlIIlll.IlIlIIIllIIllIlllllI(false);
        }
        catch (Exception ex) {
            ex.printStackTrace();
            return false;
        }
        llIlIIIIIlIIlIlIIlll.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll, llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl, llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI, this.llllIIIIlIIIlIlllIll.llllIIllllIlIlIIIIll.nextFloat() * 360.0f, 0.0f);
        this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(llIlIIIIIlIIlIlIIlll);
        llIlIIIIIlIIlIlIIlll.llllIIIIlIIIlIlllIll(this.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll(), this.IllIIlllIIIIlllIIlIl.IlIlIlIlIlllllllllIl());
        return true;
    }
    
    private e llllIIIIlIIIlIlllIll(final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        for (int i = 0; i < 10; ++i) {
            final IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll = ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(this.llllIIIIlIIIlIlllIll.llllIIllllIlIlIIIIll.nextInt(16) - 8, this.llllIIIIlIIIlIlllIll.llllIIllllIlIlIIIIll.nextInt(6) - 3, this.llllIIIIlIIIlIlllIll.llllIIllllIlIlIIIIll.nextInt(16) - 8);
            if (this.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll) && IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll(IIlllIIlIllIllIlIIll.llllIIIIlIIIlIlllIll, this.llllIIIIlIIIlIlllIll, llllIIIIlIIIlIlllIll)) {
                return new e(llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII(), llllIIIIlIIIlIlllIll.lIIIlllIIIllIIIllIII(), llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl());
            }
        }
        return null;
    }
}
