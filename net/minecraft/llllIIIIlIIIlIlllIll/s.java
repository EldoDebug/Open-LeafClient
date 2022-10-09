package net.minecraft.llllIIIIlIIIlIlllIll;

import net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.*;
import net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.*;
import java.util.*;
import net.minecraft.llIllIlIIIIllIlIIllI.*;
import net.minecraft.lIIIlllIIIllIIIllIII.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;

public class s extends llllIIIIlIIIlIlllIll
{
    public s() {
        this(net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.IlIlIIIllIllIIIIIllI.IlIllIlIlIIIlIlIlIII());
    }
    
    public s(final net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        super(net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.IlIlIIIllIllIIIIIllI, llllIIIIlIIIlIlllIll);
        this.llllIIIIlIIIlIlllIll(net.minecraft.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl);
    }
    
    @Override
    public IlIIIlIlIIIllIlIlIIl llllIIIIlIIIlIlllIll(final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final Random random, final int n) {
        return (this == net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIlllIIlIllIllIlIIll) ? net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.lIIIIlIIIIIlllIllIII : ((this == net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lIllIIIIIlllIIlIIllI) ? net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.lIIIlllIIIllIIIllIII : ((this == net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIlIIIIlllIlllllIlII) ? net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.a : ((this == net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.T) ? net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.S : ((this == net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.as) ? net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.ak : net.minecraft.llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(this)))));
    }
    
    @Override
    public int llllIIIIlIIIlIlllIll(final Random random) {
        return (this == net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIlIIIIlllIlllllIlII) ? (4 + random.nextInt(5)) : 1;
    }
    
    @Override
    public int llllIIIIlIIIlIlllIll(final int n, final Random random) {
        if (n > 0 && net.minecraft.llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(this) != this.llllIIIIlIIIlIlllIll((llIIlIIIlIIIllIlIIIl)this.IlllIIIIlIIIlIlIlIIl().llllIIIIlIIIlIlllIll().iterator().next(), random, n)) {
            int n2 = random.nextInt(n + 2) - 1;
            if (n2 < 0) {
                n2 = 0;
            }
            return this.llllIIIIlIIIlIlllIll(random) * (n2 + 1);
        }
        return this.llllIIIIlIIIlIlllIll(random);
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final float n, final int n2) {
        super.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl, llIIlIIIlIIIllIlIIIl, n, n2);
        if (this.llllIIIIlIIIlIlllIll(llIIlIIIlIIIllIlIIIl, illlllllIIIlIIIlIlII.llllIIllllIlIlIIIIll, n2) != net.minecraft.llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(this)) {
            int n3 = 0;
            if (this == net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIlllIIlIllIllIlIIll) {
                n3 = llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII.llllIIllllIlIlIIIIll, 0, 2);
            }
            else if (this == net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lIllIIIIIlllIIlIIllI) {
                n3 = llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII.llllIIllllIlIlIIIIll, 3, 7);
            }
            else if (this == net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.T) {
                n3 = llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII.llllIIllllIlIlIIIIll, 3, 7);
            }
            else if (this == net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIlIIIIlllIlllllIlII) {
                n3 = llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII.llllIIllllIlIlIIIIll, 2, 5);
            }
            else if (this == net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.as) {
                n3 = llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII.llllIIllllIlIlIIIIll, 2, 5);
            }
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl, n3);
        }
    }
    
    @Override
    public int IllIIlllIIIIlllIIlIl(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        return 0;
    }
    
    @Override
    public int IlIIIlIlIIIllIlIlIIl(final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl) {
        return (this == net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIlIIIIlllIlllllIlII) ? net.minecraft.llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl.lIlIlIIIllIIllIIIllI.llIllIIIIIllIlIIIIlI() : 0;
    }
}
