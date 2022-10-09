package net.minecraft.client.lIIIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl;

import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.client.IlIIIlIlIIIllIlIlIIl.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;

public class IlllIIIIlIIIlIlIlIIl extends IIllllIIIlIIIIIIllIl
{
    private static final lIllllIllIllIIllllll llllIIIIlIIIlIlllIll;
    
    static {
        llllIIIIlIIIlIlllIll = new lIllllIllIllIIllllll("textures/entity/slime/magmacube.png");
    }
    
    public IlllIIIIlIIIlIlIlIIl(final lllIllIIIllllllIllll lllIllIIIllllllIllll) {
        super(lllIllIIIllllllIllll, new IlIlIllllllllIIIIlII(), 0.25f);
    }
    
    protected lIllllIllIllIIllllll llllIIIIlIIIlIlllIll(final net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIIIllIllIIIIIllI.IlIlIllllllllIIIIlII ilIlIllllllllIIIIlII) {
        return IlllIIIIlIIIlIlIlIIl.llllIIIIlIIIlIlllIll;
    }
    
    protected void llllIIIIlIIIlIlllIll(final net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIIIllIllIIIIIllI.IlIlIllllllllIIIIlII ilIlIllllllllIIIIlII, final float n) {
        final int ao = ilIlIllllllllIIIIlII.ao();
        final float n2 = 1.0f / ((ilIlIllllllllIIIIlII.llIllIIIIIllIlIIIIlI + (ilIlIllllllllIIIIlII.IlIlIlIlIlllllllllIl - ilIlIllllllllIIIIlII.llIllIIIIIllIlIIIIlI) * n) / (ao * 0.5f + 1.0f) + 1.0f);
        final float n3 = (float)ao;
        lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(n2 * n3, 1.0f / n2 * n3, n2 * n3);
    }
}
