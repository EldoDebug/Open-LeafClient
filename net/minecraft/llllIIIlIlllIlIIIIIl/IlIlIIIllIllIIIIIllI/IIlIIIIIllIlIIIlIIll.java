package net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIIIllIllIIIIIllI;

import net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.lIIIlllIIIllIIIllIII.*;
import net.minecraft.llllIIIIlIIIlIlllIll.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import java.util.*;
import net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.*;

class IIlIIIIIllIlIIIlIIll extends IlIlIIIllIllIIIIIllI
{
    private llIIlllIIlllIIllIllI llllIIIIlIIIlIlllIll;
    private int IlIlIlIlIlllllllllIl;
    
    public IIlIIIIIllIlIIIlIIll(final llIIlllIIlllIIllIllI llllIIIIlIIIlIlllIll) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
    }
    
    public void lIIIIlIIIIIlllIllIII() {
        if (this.IlIlIlIlIlllllllllIl == 0) {
            this.IlIlIlIlIlllllllllIl = 20;
        }
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll() {
        return this.IlIlIlIlIlllllllllIl > 0;
    }
    
    @Override
    public void IlIIIlIlIIIllIlIlIIl() {
        --this.IlIlIlIlIlllllllllIl;
        if (this.IlIlIlIlIlllllllllIl <= 0) {
            final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII = this.llllIIIIlIIIlIlllIll.IlllllllIIIlIIIlIlII;
            final Random b = this.llllIIIIlIIIlIlllIll.B();
            final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl = new IlIlIlIlIlllllllllIl(this.llllIIIIlIIIlIlllIll);
            for (int n = 0; n <= 5 && n >= -5; n = ((n <= 0) ? (1 - n) : (0 - n))) {
                for (int n2 = 0; n2 <= 10 && n2 >= -10; n2 = ((n2 <= 0) ? (1 - n2) : (0 - n2))) {
                    for (int n3 = 0; n3 <= 10 && n3 >= -10; n3 = ((n3 <= 0) ? (1 - n3) : (0 - n3))) {
                        final IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll = ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(n2, n, n3);
                        final llIIlIIIlIIIllIlIIIl ilIlIlIlIlllllllllIl2 = illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll);
                        if (ilIlIlIlIlllllllllIl2.llIllIIIIIllIlIIIIlI() == net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.i) {
                            if (illlllllIIIlIIIlIlII.llIIlllIIlllIIllIllI().IlIlIlIlIlllllllllIl("mobGriefing")) {
                                illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll, true);
                            }
                            else {
                                illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll, ((bt)ilIlIlIlIlllllllllIl2.llllIIIIlIIIlIlllIll(bs.IIIIIIIIIlllIllIlIlI)).IlIIIlIlIIIllIlIlIIl(), 3);
                            }
                            if (b.nextBoolean()) {
                                return;
                            }
                        }
                    }
                }
            }
        }
    }
}
