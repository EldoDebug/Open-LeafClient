package net.minecraft.client.llllIIIlIlllIlIIIIIl;

import net.minecraft.IIIlIIlIIIIlllIlllII.*;

public class lllllIIIIIlIIlllIlIl extends IIIllIIIlIlIIllIIIlI
{
    protected lllllIIIIIlIIlllIlIl(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final double n, final double n2, final double n3, final double lIllllllIIllIlIlIlII, final double n4, final double iIlllIIIlIlllIIlllII) {
        super(illlllllIIIlIIIlIlII, n, n2, n3);
        this.lIIIlllIIIllIIIllIII = 0.04f;
        this.lIlIlIIIllIIllIIIllI();
        if (n4 == 0.0 && (lIllllllIIllIlIlIlII != 0.0 || iIlllIIIlIlllIIlllII != 0.0)) {
            this.lIllllllIIllIlIlIlII = lIllllllIIllIlIlIlII;
            this.llIIlllIIlllIIllIllI = n4 + 0.1;
            this.IIlllIIIlIlllIIlllII = iIlllIIIlIlllIIlllII;
        }
    }
}
