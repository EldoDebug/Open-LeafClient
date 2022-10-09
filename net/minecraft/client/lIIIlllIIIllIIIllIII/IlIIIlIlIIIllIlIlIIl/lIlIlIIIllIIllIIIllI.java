package net.minecraft.client.lIIIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl;

import net.minecraft.client.IlIIIlIlIIIllIlIlIIl.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;

public class lIlIlIIIllIIllIIIllI extends IIllllIIIlIIIIIIllIl
{
    private static final lIllllIllIllIIllllll llllIIIIlIIIlIlllIll;
    
    static {
        llllIIIIlIIIlIlllIll = new lIllllIllIllIIllllll("textures/entity/creeper/creeper.png");
    }
    
    public lIlIlIIIllIIllIIIllI(final lllIllIIIllllllIllll lllIllIIIllllllIllll) {
        super(lllIllIIIllllllIllll, new IIIIlllIIIIIIlIIIlll(), 0.5f);
        this.llllIIIIlIIIlIlllIll(new IlIlIIIllIllIIIIIllI(this));
    }
    
    protected void llllIIIIlIIIlIlllIll(final net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIIIllIllIIIIIllI.IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl, final float n) {
        final float ilIIIlIlIIIllIlIlIIl2 = ilIIIlIlIIIllIlIlIIl.IlIIIlIlIIIllIlIlIIl(n);
        final float n2 = 1.0f + llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(ilIIIlIlIIIllIlIlIIl2 * 100.0f) * ilIIIlIlIIIllIlIlIIl2 * 0.01f;
        final float llllIIIIlIIIlIlllIll = llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(ilIIIlIlIIIllIlIlIIl2, 0.0f, 1.0f);
        final float n3 = llllIIIIlIIIlIlllIll * llllIIIIlIIIlIlllIll;
        final float n4 = n3 * n3;
        final float n5 = (1.0f + n4 * 0.4f) * n2;
        lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(n5, (1.0f + n4 * 0.1f) / n2, n5);
    }
    
    protected int llllIIIIlIIIlIlllIll(final net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIIIllIllIIIIIllI.IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl, final float n, final float n2) {
        final float ilIIIlIlIIIllIlIlIIl2 = ilIIIlIlIIIllIlIlIIl.IlIIIlIlIIIllIlIlIIl(n2);
        if ((int)(ilIIIlIlIIIllIlIlIIl2 * 10.0f) % 2 == 0) {
            return 0;
        }
        return llIllIIlllllllllllll.llllIIIIlIIIlIlllIll((int)(ilIIIlIlIIIllIlIlIIl2 * 0.2f * 255.0f), 0, 255) << 24 | 0xFFFFFF;
    }
    
    protected lIllllIllIllIIllllll llllIIIIlIIIlIlllIll(final net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIIIllIllIIIIIllI.IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl) {
        return lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll;
    }
}
