package net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll;

import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.lIIIlllIIIllIIIllIII.*;
import net.minecraft.llllIIIIlIIIlIlllIll.*;
import com.google.common.base.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;

public class lIlIlIIIllIIllIIIllI extends IlIlIIIllIllIIIIIllI
{
    private static final Predicate IlIlIlIlIlllllllllIl;
    private IlIllIlIlIIIlIlIlIII llIllIIIIIllIlIIIIlI;
    private IlllllllIIIlIIIlIlII IlIIIlIlIIIllIlIlIIl;
    int llllIIIIlIIIlIlllIll;
    
    static {
        IlIlIlIlIlllllllllIl = (Predicate)net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll.llllllIllIllIlIllllI).llllIIIIlIIIlIlllIll(dc.IIIIIIIIIlllIllIlIlI, Predicates.equalTo((Object)dd.IlIlIlIlIlllllllllIl));
    }
    
    public lIlIlIIIllIIllIIIllI(final IlIllIlIlIIIlIlIlIII llIllIIIIIllIlIIIIlI) {
        this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
        this.IlIIIlIlIIIllIlIlIIl = llIllIIIIIllIlIIIIlI.IlllllllIIIlIIIlIlII;
        this.llllIIIIlIIIlIlllIll(7);
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll() {
        if (this.llIllIIIIIllIlIIIIlI.B().nextInt(this.llIllIIIIIllIlIIIIlI.e_() ? 50 : 1000) != 0) {
            return false;
        }
        final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl = new IlIlIlIlIlllllllllIl(this.llIllIIIIIllIlIIIIlI.IIlllIlIIllIlIlIlIIl, this.llIllIIIIIllIlIIIIlI.llIIIlIlIllIIlIlIlII, this.llIllIIIIIllIlIIIIlI.lllllIlIIIlIlIIlllII);
        return lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl.apply((Object)this.IlIIIlIlIIIllIlIlIIl.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl)) || this.IlIIIlIlIIIllIlIlIIl.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl()).llIllIIIIIllIlIIIIlI() == net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI;
    }
    
    @Override
    public void IlIlIIIllIllIIIIIllI() {
        this.llllIIIIlIIIlIlllIll = 40;
        this.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(this.llIllIIIIIllIlIIIIlI, (byte)10);
        this.llIllIIIIIllIlIIIIlI.lIllllllIIllIlIlIlII().llllIIIlIlllIlIIIIIl();
    }
    
    @Override
    public void llIllIIIIIllIlIIIIlI() {
        this.llllIIIIlIIIlIlllIll = 0;
    }
    
    @Override
    public boolean IlIlIlIlIlllllllllIl() {
        return this.llllIIIIlIIIlIlllIll > 0;
    }
    
    public int lIIIIlIIIIIlllIllIII() {
        return this.llllIIIIlIIIlIlllIll;
    }
    
    @Override
    public void IlIIIlIlIIIllIlIlIIl() {
        this.llllIIIIlIIIlIlllIll = Math.max(0, this.llllIIIIlIIIlIlllIll - 1);
        if (this.llllIIIIlIIIlIlllIll == 4) {
            final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl = new IlIlIlIlIlllllllllIl(this.llIllIIIIIllIlIIIIlI.IIlllIlIIllIlIlIlIIl, this.llIllIIIIIllIlIIIIlI.llIIIlIlIllIIlIlIlII, this.llIllIIIIIllIlIIIIlI.lllllIlIIIlIlIIlllII);
            if (lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl.apply((Object)this.IlIIIlIlIIIllIlIlIIl.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl))) {
                if (this.IlIIIlIlIIIllIlIlIIl.llIIlllIIlllIIllIllI().IlIlIlIlIlllllllllIl("mobGriefing")) {
                    this.IlIIIlIlIIIllIlIlIIl.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl, false);
                }
                this.llIllIIIIIllIlIIIIlI.IIlIIIIIllIlIIIlIIll();
            }
            else {
                final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl2 = ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl();
                if (this.IlIIIlIlIIIllIlIlIIl.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl2).llIllIIIIIllIlIIIIlI() == net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI) {
                    if (this.IlIIIlIlIIIllIlIlIIl.llIIlllIIlllIIllIllI().IlIlIlIlIlllllllllIl("mobGriefing")) {
                        this.IlIIIlIlIIIllIlIlIIl.IlIlIlIlIlllllllllIl(2001, ilIlIlIlIlllllllllIl2, net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI));
                        this.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl2, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl.lllIllIIIllllllIllll(), 2);
                    }
                    this.llIllIIIIIllIlIIIIlI.IIlIIIIIllIlIIIlIIll();
                }
            }
        }
    }
}
