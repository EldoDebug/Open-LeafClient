package net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll;

import net.minecraft.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.llllIIIIlIIIlIlllIll.*;

public class llllIIIlIlllIlIIIIIl extends llIllIlIIIIllIlIIllI
{
    private int llllIIIlIlllIlIIIIIl;
    private int lIIIIlIIIIIlllIllIII;
    
    public llllIIIlIlllIlIIIIIl(final IlIllIlIlIIIlIlIlIII ilIllIlIlIIIlIlIlIII) {
        super(ilIllIlIlIIIlIlIlIII);
        this.lIIIIlIIIIIlllIllIII = -1;
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll() {
        if (!super.llllIIIIlIIIlIlllIll()) {
            return false;
        }
        if (!this.llllIIIIlIIIlIlllIll.IlllllllIIIlIIIlIlII.llIIlllIIlllIIllIllI().IlIlIlIlIlllllllllIl("mobGriefing")) {
            return false;
        }
        final llIlIIIIIlIIlIlIIlll llIllIIIIIllIlIIIIlI = this.llIllIIIIIllIlIIIIlI;
        return !llIlIIIIIlIIlIlIIlll.IllIIlllIIIIlllIIlIl((lIlIlIIIllIIllIIIllI)this.llllIIIIlIIIlIlllIll.IlllllllIIIlIIIlIlII, this.IlIlIlIlIlllllllllIl);
    }
    
    @Override
    public void IlIlIIIllIllIIIIIllI() {
        super.IlIlIIIllIllIIIIIllI();
        this.llllIIIlIlllIlIIIIIl = 0;
    }
    
    @Override
    public boolean IlIlIlIlIlllllllllIl() {
        final double ilIlIlIlIlllllllllIl = this.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(this.IlIlIlIlIlllllllllIl);
        if (this.llllIIIlIlllIlIIIIIl <= 240) {
            final llIlIIIIIlIIlIlIIlll llIllIIIIIllIlIIIIlI = this.llIllIIIIIllIlIIIIlI;
            if (!llIlIIIIIlIIlIlIIlll.IllIIlllIIIIlllIIlIl((lIlIlIIIllIIllIIIllI)this.llllIIIIlIIIlIlllIll.IlllllllIIIlIIIlIlII, this.IlIlIlIlIlllllllllIl) && ilIlIlIlIlllllllllIl < 4.0) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public void llIllIIIIIllIlIIIIlI() {
        super.llIllIIIIIllIlIIIIlI();
        this.llllIIIIlIIIlIlllIll.IlllllllIIIlIIIlIlII.llIllIIIIIllIlIIIIlI(this.llllIIIIlIIIlIlllIll.IlllIIIIlIIIlIlIlIIl(), this.IlIlIlIlIlllllllllIl, -1);
    }
    
    @Override
    public void IlIIIlIlIIIllIlIlIIl() {
        super.IlIIIlIlIIIllIlIlIIl();
        if (this.llllIIIIlIIIlIlllIll.B().nextInt(20) == 0) {
            this.llllIIIIlIIIlIlllIll.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(1010, this.IlIlIlIlIlllllllllIl, 0);
        }
        ++this.llllIIIlIlllIlIIIIIl;
        final int liiiIlIIIIIlllIllIII = (int)(this.llllIIIlIlllIlIIIIIl / 240.0f * 10.0f);
        if (liiiIlIIIIIlllIllIII != this.lIIIIlIIIIIlllIllIII) {
            this.llllIIIIlIIIlIlllIll.IlllllllIIIlIIIlIlII.llIllIIIIIllIlIIIIlI(this.llllIIIIlIIIlIlllIll.IlllIIIIlIIIlIlIlIIl(), this.IlIlIlIlIlllllllllIl, liiiIlIIIIIlllIllIII);
            this.lIIIIlIIIIIlllIllIII = liiiIlIIIIIlllIllIII;
        }
        if (this.llllIIIlIlllIlIIIIIl == 240 && this.llllIIIIlIIIlIlllIll.IlllllllIIIlIIIlIlII.lllIllIIIllllllIllll() == net.minecraft.IIIlIIlIIIIlllIlllII.IllIIlllIIIIlllIIlIl.IlIIIlIlIIIllIlIlIIl) {
            this.llllIIIIlIIIlIlllIll.IlllllllIIIlIIIlIlII.lIIIIlIIIIIlllIllIII(this.IlIlIlIlIlllllllllIl);
            this.llllIIIIlIIIlIlllIll.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(1012, this.IlIlIlIlIlllllllllIl, 0);
            this.llllIIIIlIIIlIlllIll.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(2001, this.IlIlIlIlIlllllllllIl, net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(this.llIllIIIIIllIlIIIIlI));
        }
    }
}
