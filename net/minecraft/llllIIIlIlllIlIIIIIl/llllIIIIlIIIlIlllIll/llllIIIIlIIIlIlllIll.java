package net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll;

import net.minecraft.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;

public class llllIIIIlIIIlIlllIll extends IlIlIIIllIllIIIIIllI
{
    private final IlIllIlIlIIIlIlIlIII llllIIIIlIIIlIlllIll;
    private final llllllIllIllIlIllllI IlIlIlIlIlllllllllIl;
    private lllIIIIlllllIlIIllIl llIllIIIIIllIlIIIIlI;
    private int IlIIIlIlIIIllIlIlIIl;
    private double IlIlIIIllIllIIIIIllI;
    private int IllIIlllIIIIlllIIlIl;
    private int llllIIIlIlllIlIIIIIl;
    private int lIIIIlIIIIIlllIllIII;
    private float lIIIlllIIIllIIIllIII;
    private float llIIlIIIlIIIllIlIIIl;
    
    public llllIIIIlIIIlIlllIll(final llllllIllIllIlIllllI llllllIllIllIlIllllI, final double n, final int n2, final float n3) {
        this(llllllIllIllIlIllllI, n, n2, n2, n3);
    }
    
    public llllIIIIlIIIlIlllIll(final llllllIllIllIlIllllI ilIlIlIlIlllllllllIl, final double ilIlIIIllIllIIIIIllI, final int llllIIIlIlllIlIIIIIl, final int liiiIlIIIIIlllIllIII, final float liiIlllIIIllIIIllIII) {
        this.IlIIIlIlIIIllIlIlIIl = -1;
        if (!(ilIlIlIlIlllllllllIl instanceof lllIIIIlllllIlIIllIl)) {
            throw new IllegalArgumentException("ArrowAttackGoal requires Mob implements RangedAttackMob");
        }
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
        this.llllIIIIlIIIlIlllIll = (IlIllIlIlIIIlIlIlIII)ilIlIlIlIlllllllllIl;
        this.IlIlIIIllIllIIIIIllI = ilIlIIIllIllIIIIIllI;
        this.llllIIIlIlllIlIIIIIl = llllIIIlIlllIlIIIIIl;
        this.lIIIIlIIIIIlllIllIII = liiiIlIIIIIlllIllIII;
        this.lIIIlllIIIllIIIllIII = liiIlllIIIllIIIllIII;
        this.llIIlIIIlIIIllIlIIIl = liiIlllIIIllIIIllIII * liiIlllIIIllIIIllIII;
        this.llllIIIIlIIIlIlllIll(3);
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll() {
        final lllIIIIlllllIlIIllIl iIlllIIIlIlllIIlllII = this.llllIIIIlIIIlIlllIll.IIlllIIIlIlllIIlllII();
        if (iIlllIIIlIlllIIlllII == null) {
            return false;
        }
        this.llIllIIIIIllIlIIIIlI = iIlllIIIlIlllIIlllII;
        return true;
    }
    
    @Override
    public boolean IlIlIlIlIlllllllllIl() {
        return this.llllIIIIlIIIlIlllIll() || !this.llllIIIIlIIIlIlllIll.lIllllllIIllIlIlIlII().IllIIlllIIIIlllIIlIl();
    }
    
    @Override
    public void llIllIIIIIllIlIIIIlI() {
        this.llIllIIIIIllIlIIIIlI = null;
        this.IllIIlllIIIIlllIIlIl = 0;
        this.IlIIIlIlIIIllIlIlIIl = -1;
    }
    
    @Override
    public void IlIIIlIlIIIllIlIlIIl() {
        final double ilIlIIIllIllIIIIIllI = this.llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI(this.llIllIIIIIllIlIIIIlI.IIlllIlIIllIlIlIlIIl, this.llIllIIIIIllIlIIIIlI.IlIIlllIIlIlllllIIlI().IlIlIlIlIlllllllllIl, this.llIllIIIIIllIlIIIIlI.lllllIlIIIlIlIIlllII);
        final boolean llllIIIIlIIIlIlllIll = this.llllIIIIlIIIlIlllIll.llIIlllIIlllIIllIllI().llllIIIIlIIIlIlllIll(this.llIllIIIIIllIlIIIIlI);
        if (llllIIIIlIIIlIlllIll) {
            ++this.IllIIlllIIIIlllIIlIl;
        }
        else {
            this.IllIIlllIIIIlllIIlIl = 0;
        }
        if (ilIlIIIllIllIIIIIllI <= this.llIIlIIIlIIIllIlIIIl && this.IllIIlllIIIIlllIIlIl >= 20) {
            this.llllIIIIlIIIlIlllIll.lIllllllIIllIlIlIlII().llllIIIlIlllIlIIIIIl();
        }
        else {
            this.llllIIIIlIIIlIlllIll.lIllllllIIllIlIlIlII().llllIIIIlIIIlIlllIll(this.llIllIIIIIllIlIIIIlI, this.IlIlIIIllIllIIIIIllI);
        }
        this.llllIIIIlIIIlIlllIll.IIlllIlIIllIlIlIlIIl().llllIIIIlIIIlIlllIll(this.llIllIIIIIllIlIIIIlI, 30.0f, 30.0f);
        final int ilIIIlIlIIIllIlIlIIl = this.IlIIIlIlIIIllIlIlIIl - 1;
        this.IlIIIlIlIIIllIlIlIIl = ilIIIlIlIIIllIlIlIIl;
        if (ilIIIlIlIIIllIlIlIIl == 0) {
            if (ilIlIIIllIllIIIIIllI > this.llIIlIIIlIIIllIlIIIl || !llllIIIIlIIIlIlllIll) {
                return;
            }
            final float n = llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(ilIlIIIllIllIIIIIllI) / this.lIIIlllIIIllIIIllIII;
            this.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(this.llIllIIIIIllIlIIIIlI, llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(n, 0.1f, 1.0f));
            this.IlIIIlIlIIIllIlIlIIl = llIllIIlllllllllllll.IlIIIlIlIIIllIlIlIIl(n * (this.lIIIIlIIIIIlllIllIII - this.llllIIIlIlllIlIIIIIl) + this.llllIIIlIlllIlIIIIIl);
        }
        else if (this.IlIIIlIlIIIllIlIlIIl < 0) {
            this.IlIIIlIlIIIllIlIlIIl = llIllIIlllllllllllll.IlIIIlIlIIIllIlIlIIl(llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(ilIlIIIllIllIIIIIllI) / this.lIIIlllIIIllIIIllIII * (this.lIIIIlIIIIIlllIllIII - this.llllIIIlIlllIlIIIIIl) + this.llllIIIlIlllIlIIIIIl);
        }
    }
}
