package net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll;

import net.minecraft.llllIIIlIlllIlIIIIIl.IllIIlllIIIIlllIIlIl.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.llllIIIIlIIIlIlllIll.*;
import net.minecraft.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.*;
import net.minecraft.lIIIlllIIIllIIIllIII.*;
import net.minecraft.llIllIlIIIIllIlIIllI.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;

public class IIIlIIIlIlIIlllIIlll extends lIllllllIIllIlIlIlII
{
    private final IlIlIllllllllIIIIlII llIllIIIIIllIlIIIIlI;
    private boolean IlIIIlIlIIIllIlIlIIl;
    private boolean IlIlIIIllIllIIIIIllI;
    private int IllIIlllIIIIlllIIlIl;
    
    public IIIlIIIlIlIIlllIIlll(final IlIlIllllllllIIIIlII llIllIIIIIllIlIIIIlI, final double n) {
        super(llIllIIIIIllIlIIIIlI, n, 16);
        this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll() {
        if (this.llllIIIIlIIIlIlllIll <= 0) {
            if (!this.llIllIIIIIllIlIIIIlI.IlllllllIIIlIIIlIlII.llIIlllIIlllIIllIllI().IlIlIlIlIlllllllllIl("mobGriefing")) {
                return false;
            }
            this.IllIIlllIIIIlllIIlIl = -1;
            this.IlIIIlIlIIIllIlIlIIl = this.llIllIIIIIllIlIIIIlI.aw();
            this.IlIlIIIllIllIIIIIllI = this.llIllIIIIIllIlIIIIlI.av();
        }
        return super.llllIIIIlIIIlIlllIll();
    }
    
    @Override
    public boolean IlIlIlIlIlllllllllIl() {
        return this.IllIIlllIIIIlllIIlIl >= 0 && super.IlIlIlIlIlllllllllIl();
    }
    
    @Override
    public void IlIlIIIllIllIIIIIllI() {
        super.IlIlIIIllIllIIIIIllI();
    }
    
    @Override
    public void llIllIIIIIllIlIIIIlI() {
        super.llIllIIIIIllIlIIIIlI();
    }
    
    @Override
    public void IlIIIlIlIIIllIlIlIIl() {
        super.IlIIIlIlIIIllIlIlIIl();
        this.llIllIIIIIllIlIIIIlI.IIlllIlIIllIlIlIlIIl().llllIIIIlIIIlIlllIll(this.IlIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII() + 0.5, this.IlIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII() + 1, this.IlIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl() + 0.5, 10.0f, (float)this.llIllIIIIIllIlIIIIlI.j());
        if (this.lIIIIlIIIIIlllIllIII()) {
            final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII = this.llIllIIIIIllIlIIIIlI.IlllllllIIIlIIIlIlII;
            final IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll = this.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll();
            final net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.llIIlIIIlIIIllIlIIIl ilIlIlIlIlllllllllIl = illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll);
            final net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llIllIIIIIllIlIIIIlI = ilIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI();
            if (this.IllIIlllIIIIlllIIlIl == 0 && llIllIIIIIllIlIIIIlI instanceof IlllIIIIlIIIlIlIlIIl && (int)ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(IlllIIIIlIIIlIlIlIIl.IIIIIIIIIlllIllIlIlI) == 7) {
                illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll, true);
            }
            else if (this.IllIIlllIIIIlllIIlIl == 1 && llIllIIIIIllIlIIIIlI == net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll) {
                final net.minecraft.llIIlIIIlIIIllIlIIIl.lIllllllIIllIlIlIlII as = this.llIllIIIIIllIlIIIIlI.as();
                int i = 0;
                while (i < as.lIIIlllIIIllIIIllIII()) {
                    final lllIIIIlIlIllIIlIIIl lIlIlIIIllIIllIIIllI = as.lIlIlIIIllIIllIIIllI(i);
                    boolean b = false;
                    if (lIlIlIIIllIIllIIIllI != null) {
                        if (lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll() == IIllIIllIIIlIlIIIIlI.IlllIIIIlIIIlIlIlIIl) {
                            illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIIllIIIlIlIIllIIIlI.lllIllIIIllllllIllll(), 3);
                            b = true;
                        }
                        else if (lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll() == IIllIIllIIIlIlIIIIlI.W) {
                            illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.ag.lllIllIIIllllllIllll(), 3);
                            b = true;
                        }
                        else if (lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll() == IIllIIllIIIlIlIIIIlI.V) {
                            illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.af.lllIllIIIllllllIllll(), 3);
                            b = true;
                        }
                    }
                    if (b) {
                        final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl = lIlIlIIIllIIllIIIllI;
                        --lllIIIIlIlIllIIlIIIl.IlIlIlIlIlllllllllIl;
                        if (lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl <= 0) {
                            as.llIllIIIIIllIlIIIIlI(i, null);
                            break;
                        }
                        break;
                    }
                    else {
                        ++i;
                    }
                }
            }
            this.IllIIlllIIIIlllIIlIl = -1;
            this.llllIIIIlIIIlIlllIll = 10;
        }
    }
    
    @Override
    protected boolean llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll) {
        if (illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll).llIllIIIIIllIlIIIIlI() == net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIlllIIlllIIIlIlllII) {
            llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll();
            final net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.llIIlIIIlIIIllIlIIIl ilIlIlIlIlllllllllIl = illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll);
            final net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llIllIIIIIllIlIIIIlI = ilIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI();
            if (llIllIIIIIllIlIIIIlI instanceof IlllIIIIlIIIlIlIlIIl && (int)ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(IlllIIIIlIIIlIlIlIIl.IIIIIIIIIlllIllIlIlI) == 7 && this.IlIlIIIllIllIIIIIllI && (this.IllIIlllIIIIlllIIlIl == 0 || this.IllIIlllIIIIlllIIlIl < 0)) {
                this.IllIIlllIIIIlllIIlIl = 0;
                return true;
            }
            if (llIllIIIIIllIlIIIIlI == net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll && this.IlIIIlIlIIIllIlIlIIl && (this.IllIIlllIIIIlllIIlIl == 1 || this.IllIIlllIIIIlllIIlIl < 0)) {
                this.IllIIlllIIIIlllIIlIl = 1;
                return true;
            }
        }
        return false;
    }
}
