package net.minecraft.client.lIIIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl;

import net.minecraft.client.IlIIIlIlIIIllIlIlIIl.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;

public class lIIIIlIIIIIlllIllIII extends llIllIIIIIllIlIIIIlI
{
    private static final lIllllIllIllIIllllll IlIlIIIllIllIIIIIllI;
    protected IlIIIlIlIIIllIlIlIIl llllIIIIlIIIlIlllIll;
    
    static {
        IlIlIIIllIllIIIIIllI = new lIllllIllIllIIllllll("textures/entity/boat.png");
    }
    
    public lIIIIlIIIIIlllIllIII(final lllIllIIIllllllIllll lllIllIIIllllllIllll) {
        super(lllIllIIIllllllIllll);
        this.llllIIIIlIIIlIlllIll = new net.minecraft.client.IlIIIlIlIIIllIlIlIIl.lIIIIlIIIIIlllIllIII();
        this.llIllIIIIIllIlIIIIlI = 0.5f;
    }
    
    public void llllIIIIlIIIlIlllIll(final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final double n, final double n2, final double n3, final float n4, final float n5) {
        lllllIlIIIlIlIIlllII.lllllIlIIIlIlIIlllII();
        lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl((float)n, (float)n2 + 0.25f, (float)n3);
        lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(180.0f - n4, 0.0f, 1.0f, 0.0f);
        final float n6 = ilIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII() - n5;
        float n7 = ilIlIlIlIlllllllllIl.llllIIIlIlllIlIIIIIl() - n5;
        if (n7 < 0.0f) {
            n7 = 0.0f;
        }
        if (n6 > 0.0f) {
            lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(n6) * n6 * n7 / 10.0f * ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII(), 1.0f, 0.0f, 0.0f);
        }
        final float n8 = 0.75f;
        lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(n8, n8, n8);
        lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(1.0f / n8, 1.0f / n8, 1.0f / n8);
        this.llIllIIIIIllIlIIIIlI(ilIlIlIlIlllllllllIl);
        lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(-1.0f, -1.0f, 1.0f);
        this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl, 0.0f, 0.0f, -0.1f, 0.0f, 0.0f, 0.0625f);
        lllllIlIIIlIlIIlllII.lIllllllIIllIlIlIlII();
        super.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl, n, n2, n3, n4, n5);
    }
    
    protected lIllllIllIllIIllllll llllIIIIlIIIlIlllIll(final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        return lIIIIlIIIIIlllIllIII.IlIlIIIllIllIIIIIllI;
    }
}
