package net.minecraft.client.lIIIlllIIIllIIIllIII.IllIIlllIIIIlllIIlIl;

import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.client.IlIIIlIlIIIllIlIlIIl.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.lIIIIlIIIIIlllIllIII.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.*;

public class llIllIIIIIllIlIIIIlI extends net.minecraft.client.lIIIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl.llIllIIIIIllIlIIIIlI
{
    private static final lIllllIllIllIIllllll llllIIIIlIIIlIlllIll;
    private static final lIllllIllIllIIllllll IlIlIIIllIllIIIIIllI;
    private final IIllllIIIlIIIIIIllIl IllIIlllIIIIlllIIlIl;
    
    static {
        llllIIIIlIIIlIlllIll = new lIllllIllIllIIllllll("textures/entity/wither/wither_invulnerable.png");
        IlIlIIIllIllIIIIIllI = new lIllllIllIllIIllllll("textures/entity/wither/wither.png");
    }
    
    public llIllIIIIIllIlIIIIlI(final lllIllIIIllllllIllll lllIllIIIllllllIllll) {
        super(lllIllIIIllllllIllll);
        this.IllIIlllIIIIlllIIlIl = new IIllllIIIlIIIIIIllIl();
    }
    
    private float llllIIIIlIIIlIlllIll(final float n, final float n2, final float n3) {
        float n4;
        for (n4 = n2 - n; n4 < -180.0f; n4 += 360.0f) {}
        while (n4 >= 180.0f) {
            n4 -= 360.0f;
        }
        return n + n3 * n4;
    }
    
    public void llllIIIIlIIIlIlllIll(final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final double n, final double n2, final double n3, final float n4, final float n5) {
        lllllIlIIIlIlIIlllII.lllllIlIIIlIlIIlllII();
        lllllIlIIIlIlIIlllII.IlIllIlIlIIIlIlIlIII();
        final float llllIIIIlIIIlIlllIll = this.llllIIIIlIIIlIlllIll(llIIlIIIlIIIllIlIIIl.IIIllllllIllIIIlllIl, llIIlIIIlIIIllIlIIIl.IIlIIIIIllIlIIIlIIll, n5);
        final float n6 = llIIlIIIlIIIllIlIIIl.IlIIIlIIIllllIlIlIlI + (llIIlIIIlIIIllIlIIIl.llllllIllIllIlIllllI - llIIlIIIlIIIllIlIIIl.IlIIIlIIIllllIlIlIlI) * n5;
        lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl((float)n, (float)n2, (float)n3);
        final float n7 = 0.0625f;
        lllllIlIIIlIlIIlllII.IlIlIllllllllIIIIlII();
        lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(-1.0f, -1.0f, 1.0f);
        lllllIlIIIlIlIIlllII.IlIIIlIlIIIllIlIlIIl();
        this.llIllIIIIIllIlIIIIlI(llIIlIIIlIIIllIlIIIl);
        this.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll(llIIlIIIlIIIllIlIIIl, 0.0f, 0.0f, 0.0f, llllIIIIlIIIlIlllIll, n6, n7);
        lllllIlIIIlIlIIlllII.lIllllllIIllIlIlIlII();
        super.llllIIIIlIIIlIlllIll(llIIlIIIlIIIllIlIIIl, n, n2, n3, n4, n5);
    }
    
    protected lIllllIllIllIIllllll llllIIIIlIIIlIlllIll(final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl) {
        return llIIlIIIlIIIllIlIIIl.lIIIIlIIIIIlllIllIII() ? llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll : llIllIIIIIllIlIIIIlI.IlIlIIIllIllIIIIIllI;
    }
}
