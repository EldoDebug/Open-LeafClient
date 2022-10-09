package net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll;

import net.minecraft.llllIIIlIlllIlIIIIIl.IllIIlllIIIIlllIIlIl.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;
import java.util.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;

public class llIllIlIlIIIIIIIllII extends IlIlIIIllIllIIIIIllI
{
    private IlIlIllllllllIIIIlII llllIIIIlIIIlIlllIll;
    private lllIIIIlllllIlIIllIl IlIlIlIlIlllllllllIl;
    private double llIllIIIIIllIlIIIIlI;
    private int IlIIIlIlIIIllIlIlIIl;
    
    public llIllIlIlIIIIIIIllII(final IlIlIllllllllIIIIlII llllIIIIlIIIlIlllIll, final double llIllIIIIIllIlIIIIlI) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
        this.llllIIIIlIIIlIlllIll(1);
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll() {
        if (this.llllIIIIlIIIlIlllIll.llllIIIlIlllIlIIIIIl() >= 0) {
            return false;
        }
        if (this.llllIIIIlIIIlIlllIll.B().nextInt(400) != 0) {
            return false;
        }
        final List llllIIIIlIIIlIlllIll = this.llllIIIIlIIIlIlllIll.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(IlIlIllllllllIIIIlII.class, this.llllIIIIlIIIlIlllIll.IlIIlllIIlIlllllIIlI().IlIlIlIlIlllllllllIl(6.0, 3.0, 6.0));
        double n = Double.MAX_VALUE;
        for (final IlIlIllllllllIIIIlII ilIlIlIlIlllllllllIl : llllIIIIlIIIlIlllIll) {
            if (ilIlIlIlIlllllllllIl != this.llllIIIIlIIIlIlllIll && !ilIlIlIlIlllllllllIl.ap() && ilIlIlIlIlllllllllIl.llllIIIlIlllIlIIIIIl() < 0) {
                final double ilIlIIIllIllIIIIIllI = ilIlIlIlIlllllllllIl.IlIlIIIllIllIIIIIllI(this.llllIIIIlIIIlIlllIll);
                if (ilIlIIIllIllIIIIIllI > n) {
                    continue;
                }
                n = ilIlIIIllIllIIIIIllI;
                this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
            }
        }
        return this.IlIlIlIlIlllllllllIl != null || lllllIIlIlIIIlIlIIIl.llllIIIIlIIIlIlllIll(this.llllIIIIlIIIlIlllIll, 16, 3) != null;
    }
    
    @Override
    public boolean IlIlIlIlIlllllllllIl() {
        return this.IlIIIlIlIIIllIlIlIIl > 0;
    }
    
    @Override
    public void IlIlIIIllIllIIIIIllI() {
        if (this.IlIlIlIlIlllllllllIl != null) {
            this.llllIIIIlIIIlIlllIll.IlIlIIIllIIllIlllllI(true);
        }
        this.IlIIIlIlIIIllIlIlIIl = 1000;
    }
    
    @Override
    public void llIllIIIIIllIlIIIIlI() {
        this.llllIIIIlIIIlIlllIll.IlIlIIIllIIllIlllllI(false);
        this.IlIlIlIlIlllllllllIl = null;
    }
    
    @Override
    public void IlIIIlIlIIIllIlIlIIl() {
        --this.IlIIIlIlIIIllIlIlIIl;
        if (this.IlIlIlIlIlllllllllIl != null) {
            if (this.llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI(this.IlIlIlIlIlllllllllIl) > 4.0) {
                this.llllIIIIlIIIlIlllIll.lIllllllIIllIlIlIlII().llllIIIIlIIIlIlllIll(this.IlIlIlIlIlllllllllIl, this.llIllIIIIIllIlIIIIlI);
            }
        }
        else if (this.llllIIIIlIIIlIlllIll.lIllllllIIllIlIlIlII().IllIIlllIIIIlllIIlIl()) {
            final e llllIIIIlIIIlIlllIll = lllllIIlIlIIIlIlIIIl.llllIIIIlIIIlIlllIll(this.llllIIIIlIIIlIlllIll, 16, 3);
            if (llllIIIIlIIIlIlllIll == null) {
                return;
            }
            this.llllIIIIlIIIlIlllIll.lIllllllIIllIlIlIlII().llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll, llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl, llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI, this.llIllIIIIIllIlIIIIlI);
        }
    }
}
