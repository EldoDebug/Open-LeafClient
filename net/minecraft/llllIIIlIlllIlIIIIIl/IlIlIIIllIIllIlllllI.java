package net.minecraft.llllIIIlIlllIlIIIIIl;

import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.lIlIlIIIllIIllIIIllI.*;
import net.minecraft.lIIIlllIIIllIIIllIII.*;
import net.minecraft.llIllIlIIIIllIlIIllI.*;
import java.util.*;
import net.minecraft.llllIIIIlIIIlIlllIll.*;

public class IlIlIIIllIIllIlllllI extends lIlIlIIIllIIllIIIllI
{
    public IlIlIIIllIIllIlllllI(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII) {
        super(illlllllIIIlIIIlIlII);
    }
    
    public IlIlIIIllIIllIlllllI(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        super(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl);
        this.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII() + 0.5, ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII() + 0.5, ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl() + 0.5);
        this.llllIIIIlIIIlIlllIll(new llllIIIIlIIIlIlllIll(this.IIlllIlIIllIlIlIlIIl - 0.1875, this.llIIIlIlIllIIlIlIlII - 0.25 + 0.125, this.lllllIlIIIlIlIIlllII - 0.1875, this.IIlllIlIIllIlIlIlIIl + 0.1875, this.llIIIlIlIllIIlIlIlII + 0.25 + 0.125, this.lllllIlIIIlIlIIlllII + 0.1875));
    }
    
    @Override
    protected void a_() {
        super.a_();
    }
    
    public void llllIIIIlIIIlIlllIll(final lllIllIIIllllllIllll lllIllIIIllllllIllll) {
    }
    
    @Override
    public int lIIIIlIIIIIlllIllIII() {
        return 9;
    }
    
    @Override
    public int lIIIlllIIIllIIIllIII() {
        return 9;
    }
    
    @Override
    public float llllIlIllllIIlIIlIlI() {
        return -0.0625f;
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll(final double n) {
        return n < 1024.0;
    }
    
    @Override
    public void IlIlIlIlIlllllllllIl(final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI) {
    }
    
    @Override
    public boolean IlIIIlIlIIIllIlIlIIl(final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll) {
        return false;
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll) {
    }
    
    @Override
    public void IlIlIlIlIlllllllllIl(final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll) {
    }
    
    @Override
    public boolean a_(final net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        final lllIIIIlIlIllIIlIIIl n = llllIIIIlIIIlIlllIll.n();
        boolean b = false;
        if (n != null && n.llllIIIIlIIIlIlllIll() == net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.ar && !this.IlllllllIIIlIIIlIlII.IlIlIllllllllIIIIlII) {
            final double n2 = 7.0;
            for (final IlIllIlIlIIIlIlIlIII ilIllIlIlIIIlIlIlIII : this.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(IlIllIlIlIIIlIlIlIII.class, new llllIIIIlIIIlIlllIll(this.IIlllIlIIllIlIlIlIIl - n2, this.llIIIlIlIllIIlIlIlII - n2, this.lllllIlIIIlIlIIlllII - n2, this.IIlllIlIIllIlIlIlIIl + n2, this.llIIIlIlIllIIlIlIlII + n2, this.lllllIlIIIlIlIIlllII + n2))) {
                if (ilIllIlIlIIIlIlIlIII.t() && ilIllIlIlIIIlIlIlIII.u() == llllIIIIlIIIlIlllIll) {
                    ilIllIlIlIIIlIlIlIII.llllIIIIlIIIlIlllIll(this, true);
                    b = true;
                }
            }
        }
        if (!this.IlllllllIIIlIIIlIlII.IlIlIllllllllIIIIlII && !b) {
            this.IllIllIIIIlIIlIlllII();
            if (llllIIIIlIIIlIlllIll.K.IlIIIlIlIIIllIlIlIIl) {
                final double n3 = 7.0;
                for (final IlIllIlIlIIIlIlIlIII ilIllIlIlIIIlIlIlIII2 : this.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(IlIllIlIlIIIlIlIlIII.class, new llllIIIIlIIIlIlllIll(this.IIlllIlIIllIlIlIlIIl - n3, this.llIIIlIlIllIIlIlIlII - n3, this.lllllIlIIIlIlIIlllII - n3, this.IIlllIlIIllIlIlIlIIl + n3, this.llIIIlIlIllIIlIlIlII + n3, this.lllllIlIIIlIlIIlllII + n3))) {
                    if (ilIllIlIlIIIlIlIlIII2.t() && ilIllIlIlIIIlIlIlIII2.u() == this) {
                        ilIllIlIlIIIlIlIlIII2.llllIIIIlIIIlIlllIll(true, false);
                    }
                }
            }
        }
        return true;
    }
    
    @Override
    public boolean llllIIIlIlllIlIIIIIl() {
        return this.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(this.llllIIIIlIIIlIlllIll).llIllIIIIIllIlIIIIlI() instanceof IIlllllIllIllIlIlIII;
    }
    
    public static IlIlIIIllIIllIlllllI llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        final IlIlIIIllIIllIlllllI ilIlIIIllIIllIlllllI = new IlIlIIIllIIllIlllllI(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl);
        ilIlIIIllIIllIlllllI.IlIlIIIlIIlIlIIlllIl = true;
        illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(ilIlIIIllIIllIlllllI);
        return ilIlIIIllIIllIlllllI;
    }
    
    public static IlIlIIIllIIllIlllllI IlIlIlIlIlllllllllIl(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        final int liiiIlIIIIIlllIllIII = ilIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII();
        final int liiIlllIIIllIIIllIII = ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII();
        final int llIIlIIIlIIIllIlIIIl = ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl();
        for (final IlIlIIIllIIllIlllllI ilIlIIIllIIllIlllllI : illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(IlIlIIIllIIllIlllllI.class, new llllIIIIlIIIlIlllIll(liiiIlIIIIIlllIllIII - 1.0, liiIlllIIIllIIIllIII - 1.0, llIIlIIIlIIIllIlIIIl - 1.0, liiiIlIIIIIlllIllIII + 1.0, liiIlllIIIllIIIllIII + 1.0, llIIlIIIlIIIllIlIIIl + 1.0))) {
            if (ilIlIIIllIIllIlllllI.lIlIlIIIllIIllIIIllI().equals(ilIlIlIlIlllllllllIl)) {
                return ilIlIIIllIIllIlllllI;
            }
        }
        return null;
    }
}
