package net.minecraft.client.lIIIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl;

import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.client.IlIIIlIlIIIllIlIlIIl.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;

public class IlIlIllllllllIIIIlII extends IIllllIIIlIIIIIIllIl
{
    private static final lIllllIllIllIIllllll llllIIIIlIIIlIlllIll;
    
    static {
        llllIIIIlIIIlIlllIll = new lIllllIllIllIIllllll("textures/entity/iron_golem.png");
    }
    
    public IlIlIllllllllIIIIlII(final lllIllIIIllllllIllll lllIllIIIllllllIllll) {
        super(lllIllIIIllllllIllll, new IlllllllIIIlIIIlIlII(), 0.5f);
        this.llllIIIIlIIIlIlllIll(new IIIIlllIIIIIIlIIIlll(this));
    }
    
    protected lIllllIllIllIIllllll llllIIIIlIIIlIlllIll(final net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIIIllIllIIIIIllI.IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII) {
        return IlIlIllllllllIIIIlII.llllIIIIlIIIlIlllIll;
    }
    
    protected void llllIIIIlIIIlIlllIll(final net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIIIllIllIIIIIllI.IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final float n, final float n2, final float n3) {
        super.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, n, n2, n3);
        if (illlllllIIIlIIIlIlII.llIlIIIIllIlIIlIlIII >= 0.01) {
            final float n4 = 13.0f;
            lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(6.5f * ((Math.abs((illlllllIIIlIIIlIlII.IIIIIlllIlIIIIIIIllI - illlllllIIIlIIIlIlII.llIlIIIIllIlIIlIlIII * (1.0f - n3) + 6.0f) % n4 - n4 * 0.5f) - n4 * 0.25f) / (n4 * 0.25f)), 0.0f, 0.0f, 1.0f);
        }
    }
}
