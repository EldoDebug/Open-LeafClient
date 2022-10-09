package net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl;

import net.minecraft.llllIIIlIlllIlIIIIIl.lIIIIlIIIIIlllIllIII.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;

public class IllIIlllIIIIlllIIlIl extends lIIIlllIIIllIIIllIII
{
    public IllIIlllIIIIlllIIlIl(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII) {
        super(illlllllIIIlIIIlIlII);
    }
    
    public IllIIlllIIIIlllIIlIl(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final lllIIIIlllllIlIIllIl lllIIIIlllllIlIIllIl) {
        super(illlllllIIIlIIIlIlII, lllIIIIlllllIlIIllIl);
    }
    
    public IllIIlllIIIIlllIIlIl(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final double n, final double n2, final double n3) {
        super(illlllllIIIlIIIlIlII, n, n2, n3);
    }
    
    @Override
    protected float llllIIIlIlllIlIIIIIl() {
        return 0.07f;
    }
    
    @Override
    protected float lIIIIlIIIIIlllIllIII() {
        return 0.7f;
    }
    
    @Override
    protected float lIIIlllIIIllIIIllIII() {
        return -20.0f;
    }
    
    @Override
    protected void llllIIIIlIIIlIlllIll(final llIlllIlllllIIllIIII llIlllIlllllIIllIIII) {
        if (!this.IlllllllIIIlIIIlIlII.IlIlIllllllllIIIIlII) {
            this.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(2002, new IlIlIlIlIlllllllllIl(this), 0);
            int i = 3 + this.IlllllllIIIlIIIlIlII.llllIIllllIlIlIIIIll.nextInt(5) + this.IlllllllIIIlIIIlIlII.llllIIllllIlIlIIIIll.nextInt(5);
            while (i > 0) {
                final int llllIIIIlIIIlIlllIll = net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl.IlIlIIIlIIlIlIIlllIl.llllIIIIlIIIlIlllIll(i);
                i -= llllIIIIlIIIlIlllIll;
                this.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(new IlIlIIIlIIlIlIIlllIl(this.IlllllllIIIlIIIlIlII, this.IIlllIlIIllIlIlIlIIl, this.llIIIlIlIllIIlIlIlII, this.lllllIlIIIlIlIIlllII, llllIIIIlIIIlIlllIll));
            }
            this.IllIllIIIIlIIlIlllII();
        }
    }
}
