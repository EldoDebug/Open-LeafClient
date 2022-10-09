package net.minecraft.llllIIIIlIIIlIlllIll;

import com.google.common.base.*;
import net.minecraft.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.*;
import net.minecraft.lIIIlllIIIllIIIllIII.*;
import net.minecraft.llIllIlIIIIllIlIIllI.*;
import java.util.*;
import net.minecraft.IIIlIIIlIlIIlllIIlll.*;

public class i extends lIllIlIIIllllllIIlII
{
    public static final IlIIIlIlIIIllIlIlIIl IllIllIIIIlIIlIlllII;
    
    static {
        IllIllIIIIlIIlIlllII = net.minecraft.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll("variant", aa.class, (Predicate)new j());
    }
    
    public i() {
        this.lIIIIlIIIIIlllIllIII(this.IIIIIllIIIIlIIIIllIl.IlIlIlIlIlllllllllIl().llllIIIIlIIIlIlllIll(i.IllIllIIIIlIIlIlllII, aa.IlIlIIIllIllIIIIIllI).llllIIIIlIIIlIlllIll(i.IIllllIIIlIIIIIIllIl, true).llllIIIIlIIIlIlllIll(i.IIIIIIIIIlllIllIlIlI, true));
    }
    
    @Override
    protected void IlIlIlIlIlllllllllIl(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final int n) {
        if (llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(i.IllIllIIIIlIIlIlllII) == aa.IllIIlllIIIIlllIIlIl && illlllllIIIlIIIlIlII.llllIIllllIlIlIIIIll.nextInt(n) == 0) {
            net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl, new lllIIIIlIlIllIIlIIIl(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.IlIlIIIllIllIIIIIllI, 1, 0));
        }
    }
    
    @Override
    public int IlIIIlIlIIIllIlIlIIl(final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl) {
        return ((aa)llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(i.IllIllIIIIlIIlIlllII)).IlIlIlIlIlllllllllIl();
    }
    
    @Override
    public int IllIIlllIIIIlllIIlIl(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        final llIIlIIIlIIIllIlIIIl ilIlIlIlIlllllllllIl2 = illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl);
        return ilIlIlIlIlllllllllIl2.llIllIIIIIllIlIIIIlI().llIllIIIIIllIlIIIIlI(ilIlIlIlIlllllllllIl2) & 0x3;
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final net.minecraft.llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl, final net.minecraft.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final List list) {
        list.add(new lllIIIIlIlIllIIlIIIl(ilIIIlIlIIIllIlIlIIl, 1, 0));
        list.add(new lllIIIIlIlIllIIlIIIl(ilIIIlIlIIIllIlIlIIl, 1, 1));
    }
    
    @Override
    protected lllIIIIlIlIllIIlIIIl IllIIlllIIIIlllIIlIl(final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl) {
        return new lllIIIIlIlIllIIlIIIl(net.minecraft.llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(this), 1, ((aa)llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(i.IllIllIIIIlIIlIlllII)).IlIlIlIlIlllllllllIl() - 4);
    }
    
    @Override
    public llIIlIIIlIIIllIlIIIl llIllIIIIIllIlIIIIlI(final int n) {
        return this.lllIllIIIllllllIllll().llllIIIIlIIIlIlllIll(i.IllIllIIIIlIIlIlllII, this.IlIlIIIllIllIIIIIllI(n)).llllIIIIlIIIlIlllIll(i.IIIIIIIIIlllIllIlIlI, (n & 0x4) == 0x0).llllIIIIlIIIlIlllIll(i.IIllllIIIlIIIIIIllIl, (n & 0x8) > 0);
    }
    
    @Override
    public int llIllIIIIIllIlIIIIlI(final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl) {
        int n = 0x0 | ((aa)llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(i.IllIllIIIIlIIlIlllII)).IlIlIlIlIlllllllllIl() - 4;
        if (!(boolean)llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(i.IIIIIIIIIlllIllIlIlI)) {
            n |= 0x4;
        }
        if (llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(i.IIllllIIIlIIIIIIllIl)) {
            n |= 0x8;
        }
        return n;
    }
    
    @Override
    public aa IlIlIIIllIllIIIIIllI(final int n) {
        return aa.llllIIIIlIIIlIlllIll((n & 0x3) + 4);
    }
    
    @Override
    protected net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl IIllllIIIlIIIIIIllIl() {
        return new net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(this, new net.minecraft.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll[] { i.IllIllIIIIlIIlIlllII, i.IIllllIIIlIIIIIIllIl, i.IIIIIIIIIlllIllIlIlI });
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final net.minecraft.IlIlIIIlIIlIlIIlllIl.IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl) {
        if (!illlllllIIIlIIIlIlII.IlIlIllllllllIIIIlII && llllIIIIlIIIlIlllIll.p() != null && llllIIIIlIIIlIlllIll.p().llllIIIIlIIIlIlllIll() == net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.i) {
            llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(net.minecraft.IIIlIIIlIlIIlllIIlll.IIIIlllIIIIIIlIIIlll.lIIIIlIlIllllIIlIllI[llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(this)]);
            llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl, new lllIIIIlIlIllIIlIIIl(net.minecraft.llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(this), 1, ((aa)llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(i.IllIllIIIIlIIlIlllII)).IlIlIlIlIlllllllllIl() - 4));
        }
        else {
            super.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, llllIIIIlIIIlIlllIll, ilIlIlIlIlllllllllIl, llIIlIIIlIIIllIlIIIl, ilIIIlIlIIIllIlIlIIl);
        }
    }
}
