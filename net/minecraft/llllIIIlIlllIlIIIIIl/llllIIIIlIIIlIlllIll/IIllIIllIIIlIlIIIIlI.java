package net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll;

import net.minecraft.llllIIIlIlllIlIIIIIl.IllIIlllIIIIlllIIlIl.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;
import java.util.*;

public class IIllIIllIIIlIlIIIIlI extends IlIlIIIllIllIIIIIllI
{
    IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll;
    IlIlIlIlIlllllllllIl IlIlIlIlIlllllllllIl;
    double llIllIIIIIllIlIIIIlI;
    private int IlIIIlIlIIIllIlIlIIl;
    
    public IIllIIllIIIlIlIIIIlI(final IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll, final double llIllIIIIIllIlIIIIlI) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll() {
        if (this.llllIIIIlIIIlIlllIll.llllIIIlIlllIlIIIIIl() >= 0) {
            return false;
        }
        final List llllIIIIlIIIlIlllIll = this.llllIIIIlIIIlIlllIll.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(this.llllIIIIlIIIlIlllIll.getClass(), this.llllIIIIlIIIlIlllIll.IlIIlllIIlIlllllIIlI().IlIlIlIlIlllllllllIl(8.0, 4.0, 8.0));
        IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl = null;
        double n = Double.MAX_VALUE;
        for (final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl2 : llllIIIIlIIIlIlllIll) {
            if (ilIlIlIlIlllllllllIl2.llllIIIlIlllIlIIIIIl() >= 0) {
                final double ilIlIIIllIllIIIIIllI = this.llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI(ilIlIlIlIlllllllllIl2);
                if (ilIlIIIllIllIIIIIllI > n) {
                    continue;
                }
                n = ilIlIIIllIllIIIIIllI;
                ilIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl2;
            }
        }
        if (ilIlIlIlIlllllllllIl == null) {
            return false;
        }
        if (n < 9.0) {
            return false;
        }
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
        return true;
    }
    
    @Override
    public boolean IlIlIlIlIlllllllllIl() {
        if (this.llllIIIIlIIIlIlllIll.llllIIIlIlllIlIIIIIl() >= 0) {
            return false;
        }
        if (!this.IlIlIlIlIlllllllllIl.llllIllllIllllIlIlII()) {
            return false;
        }
        final double ilIlIIIllIllIIIIIllI = this.llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI(this.IlIlIlIlIlllllllllIl);
        return ilIlIIIllIllIIIIIllI >= 9.0 && ilIlIIIllIllIIIIIllI <= 256.0;
    }
    
    @Override
    public void IlIlIIIllIllIIIIIllI() {
        this.IlIIIlIlIIIllIlIlIIl = 0;
    }
    
    @Override
    public void llIllIIIIIllIlIIIIlI() {
        this.IlIlIlIlIlllllllllIl = null;
    }
    
    @Override
    public void IlIIIlIlIIIllIlIlIIl() {
        final int ilIIIlIlIIIllIlIlIIl = this.IlIIIlIlIIIllIlIlIIl - 1;
        this.IlIIIlIlIIIllIlIlIIl = ilIIIlIlIIIllIlIlIIl;
        if (ilIIIlIlIIIllIlIlIIl <= 0) {
            this.IlIIIlIlIIIllIlIlIIl = 10;
            this.llllIIIIlIIIlIlllIll.lIllllllIIllIlIlIlII().llllIIIIlIIIlIlllIll(this.IlIlIlIlIlllllllllIl, this.llIllIIIIIllIlIIIIlI);
        }
    }
}
