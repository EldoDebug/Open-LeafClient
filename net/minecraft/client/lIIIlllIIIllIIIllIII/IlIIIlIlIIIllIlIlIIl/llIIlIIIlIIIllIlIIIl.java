package net.minecraft.client.lIIIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl;

import net.minecraft.client.IlIIIlIlIIIllIlIlIIl.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;

public class llIIlIIIlIIIllIlIIIl extends IIllllIIIlIIIIIIllIl
{
    private static final lIllllIllIllIIllllll llllIIIIlIIIlIlllIll;
    
    static {
        llllIIIIlIIIlIlllIll = new lIllllIllIllIIllllll("textures/entity/chicken.png");
    }
    
    public llIIlIIIlIIIllIlIIIl(final lllIllIIIllllllIllll lllIllIIIllllllIllll, final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl, final float n) {
        super(lllIllIIIllllllIllll, ilIIIlIlIIIllIlIlIIl, n);
    }
    
    protected lIllllIllIllIIllllll llllIIIIlIIIlIlllIll(final net.minecraft.llllIIIlIlllIlIIIIIl.IllIIlllIIIIlllIIlIl.IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl) {
        return llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll;
    }
    
    protected float llllIIIIlIIIlIlllIll(final net.minecraft.llllIIIlIlllIlIIIIIl.IllIIlllIIIIlllIIlIl.IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl, final float n) {
        return (llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(ilIIIlIlIIIllIlIlIIl.x + (ilIIIlIlIIIllIlIlIIl.u - ilIIIlIlIIIllIlIlIIl.x) * n) + 1.0f) * (ilIIIlIlIIIllIlIlIIl.w + (ilIIIlIlIIIllIlIlIIl.v - ilIIIlIlIIIllIlIlIIl.w) * n);
    }
}
