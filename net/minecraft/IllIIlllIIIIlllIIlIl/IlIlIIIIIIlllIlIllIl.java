package net.minecraft.IllIIlllIIIIlllIIlIl;

import net.minecraft.IlllllllIIIlIIIlIlII.*;

public class IlIlIIIIIIlllIlIllIl extends llllIIIIlIIIlIlllIll
{
    protected IlIlIIIIIIlllIlIllIl(final int n, final lIllllIllIllIIllllll lIllllIllIllIIllllll, final int n2, final IlIlIllllllllIIIIlII ilIlIllllllllIIIIlII) {
        super(n, lIllllIllIllIIllllll, n2, ilIlIllllllllIIIIlII);
        if (ilIlIllllllllIIIIlII == net.minecraft.IllIIlllIIIIlllIIlIl.IlIlIllllllllIIIIlII.lIIIIlIIIIIlllIllIII) {
            this.IlIlIlIlIlllllllllIl("lootBonusDigger");
        }
        else if (ilIlIllllllllIIIIlII == net.minecraft.IllIIlllIIIIlllIIlIl.IlIlIllllllllIIIIlII.lIIIlllIIIllIIIllIII) {
            this.IlIlIlIlIlllllllllIl("lootBonusFishing");
        }
        else {
            this.IlIlIlIlIlllllllllIl("lootBonus");
        }
    }
    
    @Override
    public int IlIlIlIlIlllllllllIl(final int n) {
        return 15 + (n - 1) * 9;
    }
    
    @Override
    public int llIllIIIIIllIlIIIIlI(final int n) {
        return super.IlIlIlIlIlllllllllIl(n) + 50;
    }
    
    @Override
    public int IlIIIlIlIIIllIlIlIIl() {
        return 3;
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll(final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        return super.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll) && llllIIIIlIIIlIlllIll.IIlllIlIIllIlIlIlIIl != IlIlIIIIIIlllIlIllIl.lllIIIIlllllIlIIllIl.IIlllIlIIllIlIlIlIIl;
    }
}
