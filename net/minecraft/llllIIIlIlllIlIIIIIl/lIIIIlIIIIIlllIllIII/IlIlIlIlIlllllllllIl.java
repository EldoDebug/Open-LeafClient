package net.minecraft.llllIIIlIlllIlIIIIIl.lIIIIlIIIIIlllIllIII;

import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.IllIIlllIIIIlllIIlIl.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.lIIIlllIIIllIIIllIII.*;

public class IlIlIlIlIlllllllllIl extends lIIIlllIIIllIIIllIII
{
    public IlIlIlIlIlllllllllIl(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII) {
        super(illlllllIIIlIIIlIlII);
    }
    
    public IlIlIlIlIlllllllllIl(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final lllIIIIlllllIlIIllIl lllIIIIlllllIlIIllIl) {
        super(illlllllIIIlIIIlIlII, lllIIIIlllllIlIIllIl);
    }
    
    public IlIlIlIlIlllllllllIl(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final double n, final double n2, final double n3) {
        super(illlllllIIIlIIIlIlII, n, n2, n3);
    }
    
    @Override
    protected void llllIIIIlIIIlIlllIll(final llIlllIlllllIIllIIII llIlllIlllllIIllIIII) {
        if (llIlllIlllllIIllIIII.IlIIIlIlIIIllIlIlIIl != null) {
            llIlllIlllllIIllIIII.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(net.minecraft.IlllllllIIIlIIIlIlII.lIllllllIIllIlIlIlII.llllIIIIlIIIlIlllIll(this, this.llllIIllllIlIlIIIIll()), 0.0f);
        }
        if (!this.IlllllllIIIlIIIlIlII.IlIlIllllllllIIIIlII && this.IlIIllIIllIIllIIlIIl.nextInt(8) == 0) {
            int n = 1;
            if (this.IlIIllIIllIIllIIlIIl.nextInt(32) == 0) {
                n = 4;
            }
            for (int i = 0; i < n; ++i) {
                final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl = new IlIIIlIlIIIllIlIlIIl(this.IlllllllIIIlIIIlIlII);
                ilIIIlIlIIIllIlIlIIl.IlIlIlIlIlllllllllIl(-24000);
                ilIIIlIlIIIllIlIlIIl.IlIlIlIlIlllllllllIl(this.IIlllIlIIllIlIlIlIIl, this.llIIIlIlIllIIlIlIlII, this.lllllIlIIIlIlIIlllII, this.IIlIIIIIllIlIIIlIIll, 0.0f);
                this.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(ilIIIlIlIIIllIlIlIIl);
            }
        }
        for (int j = 0; j < 8; ++j) {
            this.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(net.minecraft.IlllllllIIIlIIIlIlII.IlIllllIIlIIlIlIlIll.IIIIIllIIIIlIIIIllIl, this.IIlllIlIIllIlIlIlIIl, this.llIIIlIlIllIIlIlIlII, this.lllllIlIIIlIlIIlllII, (this.IlIIllIIllIIllIIlIIl.nextFloat() - 0.5) * 0.08, (this.IlIIllIIllIIllIIlIIl.nextFloat() - 0.5) * 0.08, (this.IlIIllIIllIIllIIlIIl.nextFloat() - 0.5) * 0.08, net.minecraft.llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.lIllIlIIIllllllIIlII));
        }
        if (!this.IlllllllIIIlIIIlIlII.IlIlIllllllllIIIIlII) {
            this.IllIllIIIIlIIlIlllII();
        }
    }
}
