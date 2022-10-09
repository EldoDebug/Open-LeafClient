package net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll;

import net.minecraft.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import java.util.*;

public class IIlllIIlIllIllIlIIll extends IlIlIIIllIllIIIIIllI
{
    private llIIlIIIlIIIllIlIIIl llllIIIIlIIIlIlllIll;
    private double IlIlIlIlIlllllllllIl;
    private double llIllIIIIIllIlIIIIlI;
    private double IlIIIlIlIIIllIlIlIIl;
    private double IlIlIIIllIllIIIIIllI;
    private IlllllllIIIlIIIlIlII IllIIlllIIIIlllIIlIl;
    
    public IIlllIIlIllIllIlIIll(final llIIlIIIlIIIllIlIIIl llllIIIIlIIIlIlllIll, final double ilIlIIIllIllIIIIIllI) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.IlIlIIIllIllIIIIIllI = ilIlIIIllIllIIIIIllI;
        this.IllIIlllIIIIlllIIlIl = llllIIIIlIIIlIlllIll.IlllllllIIIlIIIlIlII;
        this.llllIIIIlIIIlIlllIll(1);
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll() {
        if (!this.IllIIlllIIIIlllIIlIl.lIlIlIIIllIIllIIIllI()) {
            return false;
        }
        if (!this.llllIIIIlIIIlIlllIll.lIIIIIlIlIIIlIIIIlIl()) {
            return false;
        }
        if (!this.IllIIlllIIIIlllIIlIl.llIIlIIIlIIIllIlIIIl(new IlIlIlIlIlllllllllIl(this.llllIIIIlIIIlIlllIll.IIlllIlIIllIlIlIlIIl, this.llllIIIIlIIIlIlllIll.IlIIlllIIlIlllllIIlI().IlIlIlIlIlllllllllIl, this.llllIIIIlIIIlIlllIll.lllllIlIIIlIlIIlllII))) {
            return false;
        }
        final e liiiIlIIIIIlllIllIII = this.lIIIIlIIIIIlllIllIII();
        if (liiiIlIIIIIlllIllIII == null) {
            return false;
        }
        this.IlIlIlIlIlllllllllIl = liiiIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll;
        this.llIllIIIIIllIlIIIIlI = liiiIlIIIIIlllIllIII.IlIlIlIlIlllllllllIl;
        this.IlIIIlIlIIIllIlIlIIl = liiiIlIIIIIlllIllIII.llIllIIIIIllIlIIIIlI;
        return true;
    }
    
    @Override
    public boolean IlIlIlIlIlllllllllIl() {
        return !this.llllIIIIlIIIlIlllIll.lIllllllIIllIlIlIlII().IllIIlllIIIIlllIIlIl();
    }
    
    @Override
    public void IlIlIIIllIllIIIIIllI() {
        this.llllIIIIlIIIlIlllIll.lIllllllIIllIlIlIlII().llllIIIIlIIIlIlllIll(this.IlIlIlIlIlllllllllIl, this.llIllIIIIIllIlIIIIlI, this.IlIIIlIlIIIllIlIlIIl, this.IlIlIIIllIllIIIIIllI);
    }
    
    private e lIIIIlIIIIIlllIllIII() {
        final Random b = this.llllIIIIlIIIlIlllIll.B();
        final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl = new IlIlIlIlIlllllllllIl(this.llllIIIIlIIIlIlllIll.IIlllIlIIllIlIlIlIIl, this.llllIIIIlIIIlIlllIll.IlIIlllIIlIlllllIIlI().IlIlIlIlIlllllllllIl, this.llllIIIIlIIIlIlllIll.lllllIlIIIlIlIIlllII);
        for (int i = 0; i < 10; ++i) {
            final IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll = ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(b.nextInt(20) - 10, b.nextInt(6) - 3, b.nextInt(20) - 10);
            if (!this.IllIIlllIIIIlllIIlIl.llIIlIIIlIIIllIlIIIl(llllIIIIlIIIlIlllIll) && this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll) < 0.0f) {
                return new e(llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII(), llllIIIIlIIIlIlllIll.lIIIlllIIIllIIIllIII(), llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl());
            }
        }
        return null;
    }
}
