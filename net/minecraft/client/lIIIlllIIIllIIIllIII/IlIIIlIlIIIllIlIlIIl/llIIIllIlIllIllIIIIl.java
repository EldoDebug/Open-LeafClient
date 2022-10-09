package net.minecraft.client.lIIIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl;

import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.client.IlIIIlIlIIIllIlIlIIl.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.IllIIlllIIIIlllIIlIl.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;

public class llIIIllIlIllIllIIIIl extends IIllllIIIlIIIIIIllIl
{
    private static final lIllllIllIllIIllllll llllIIIIlIIIlIlllIll;
    
    static {
        llllIIIIlIIIlIlllIll = new lIllllIllIllIIllllll("textures/entity/squid.png");
    }
    
    public llIIIllIlIllIllIIIIl(final lllIllIIIllllllIllll lllIllIIIllllllIllll, final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl, final float n) {
        super(lllIllIIIllllllIllll, ilIIIlIlIIIllIlIlIIl, n);
    }
    
    protected lIllllIllIllIIllllll llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII) {
        return llIIIllIlIllIllIIIIl.llllIIIIlIIIlIlllIll;
    }
    
    protected void llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final float n, final float n2, final float n3) {
        final float n4 = illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl + (illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll - illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl) * n3;
        final float n5 = illlllllIIIlIIIlIlII.IlIIIlIlIIIllIlIlIIl + (illlllllIIIlIIIlIlII.llIllIIIIIllIlIIIIlI - illlllllIIIlIIIlIlII.IlIIIlIlIIIllIlIlIIl) * n3;
        lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(0.0f, 0.5f, 0.0f);
        lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(180.0f - n2, 0.0f, 1.0f, 0.0f);
        lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(n4, 1.0f, 0.0f, 0.0f);
        lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(n5, 0.0f, 1.0f, 0.0f);
        lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(0.0f, -1.2f, 0.0f);
    }
    
    protected float llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final float n) {
        return illlllllIIIlIIIlIlII.v + (illlllllIIIlIIIlIlII.u - illlllllIIIlIIIlIlII.v) * n;
    }
}
