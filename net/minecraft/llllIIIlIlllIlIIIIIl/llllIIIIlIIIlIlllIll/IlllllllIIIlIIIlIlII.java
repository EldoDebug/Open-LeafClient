package net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll;

import net.minecraft.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;

public class IlllllllIIIlIIIlIlII extends IlIlIIIllIllIIIIIllI
{
    IlIllIlIlIIIlIlIlIII llllIIIIlIIIlIlllIll;
    lllIIIIlllllIlIIllIl IlIlIlIlIlllllllllIl;
    float llIllIIIIIllIlIIIIlI;
    
    public IlllllllIIIlIIIlIlII(final IlIllIlIlIIIlIlIlIII llllIIIIlIIIlIlllIll, final float llIllIIIIIllIlIIIIlI) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
        this.llllIIIIlIIIlIlllIll(5);
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll() {
        this.IlIlIlIlIlllllllllIl = this.llllIIIIlIIIlIlllIll.IIlllIIIlIlllIIlllII();
        if (this.IlIlIlIlIlllllllllIl == null) {
            return false;
        }
        final double ilIlIIIllIllIIIIIllI = this.llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI(this.IlIlIlIlIlllllllllIl);
        return ilIlIIIllIllIIIIIllI >= 4.0 && ilIlIIIllIllIIIIIllI <= 16.0 && this.llllIIIIlIIIlIlllIll.IIIIIllIIIIlIIIIllIl && this.llllIIIIlIIIlIlllIll.B().nextInt(5) == 0;
    }
    
    @Override
    public boolean IlIlIlIlIlllllllllIl() {
        return !this.llllIIIIlIIIlIlllIll.IIIIIllIIIIlIIIIllIl;
    }
    
    @Override
    public void IlIlIIIllIllIIIIIllI() {
        final double n = this.IlIlIlIlIlllllllllIl.IIlllIlIIllIlIlIlIIl - this.llllIIIIlIIIlIlllIll.IIlllIlIIllIlIlIlIIl;
        final double n2 = this.IlIlIlIlIlllllllllIl.lllllIlIIIlIlIIlllII - this.llllIIIIlIIIlIlllIll.lllllIlIIIlIlIIlllII;
        final float llllIIIIlIIIlIlllIll = llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(n * n + n2 * n2);
        final IlIllIlIlIIIlIlIlIII llllIIIIlIIIlIlllIll2 = this.llllIIIIlIIIlIlllIll;
        llllIIIIlIIIlIlllIll2.lIllllllIIllIlIlIlII += n / llllIIIIlIIIlIlllIll * 0.5 * 0.800000011920929 + this.llllIIIIlIIIlIlllIll.lIllllllIIllIlIlIlII * 0.20000000298023224;
        final IlIllIlIlIIIlIlIlIII llllIIIIlIIIlIlllIll3 = this.llllIIIIlIIIlIlllIll;
        llllIIIIlIIIlIlllIll3.IIlllIIIlIlllIIlllII += n2 / llllIIIIlIIIlIlllIll * 0.5 * 0.800000011920929 + this.llllIIIIlIIIlIlllIll.IIlllIIIlIlllIIlllII * 0.20000000298023224;
        this.llllIIIIlIIIlIlllIll.llIIlllIIlllIIllIllI = this.llIllIIIIIllIlIIIIlI;
    }
}
