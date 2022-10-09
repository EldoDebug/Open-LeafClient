package net.minecraft.client.lIIIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl;

import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.client.IlIIIlIlIIIllIlIlIIl.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;

public class IIlllllIllIllIlIlIII extends IIllllIIIlIIIIIIllIl
{
    private static final lIllllIllIllIIllllll llllIIIIlIIIlIlllIll;
    private static final lIllllIllIllIIllllll IlIlIIIllIllIIIIIllI;
    
    static {
        llllIIIIlIIIlIlllIll = new lIllllIllIllIIllllll("textures/entity/wither/wither_invulnerable.png");
        IlIlIIIllIllIIIIIllI = new lIllllIllIllIIllllll("textures/entity/wither/wither.png");
    }
    
    public IIlllllIllIllIlIlIII(final lllIllIIIllllllIllll lllIllIIIllllllIllll) {
        super(lllIllIIIllllllIllll, new IllIllIlllIllllIIllI(0.0f), 1.0f);
        this.llllIIIIlIIIlIlllIll(new IlllllllIIIlIIIlIlII(this));
    }
    
    public void llllIIIIlIIIlIlllIll(final net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl.IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl, final double n, final double n2, final double n3, final float n4, final float n5) {
        net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(ilIIIlIlIIIllIlIlIIl, true);
        super.llllIIIIlIIIlIlllIll(ilIIIlIlIIIllIlIlIIl, n, n2, n3, n4, n5);
    }
    
    protected lIllllIllIllIIllllll llllIIIIlIIIlIlllIll(final net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl.IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl) {
        final int an = ilIIIlIlIIIllIlIlIIl.an();
        return (an > 0 && (an > 80 || an / 5 % 2 != 1)) ? IIlllllIllIllIlIlIII.llllIIIIlIIIlIlllIll : IIlllllIllIllIlIlIII.IlIlIIIllIllIIIIIllI;
    }
    
    protected void llllIIIIlIIIlIlllIll(final net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl.IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl, final float n) {
        float n2 = 2.0f;
        final int an = ilIIIlIlIIIllIlIlIIl.an();
        if (an > 0) {
            n2 -= (an - n) / 220.0f * 0.5f;
        }
        lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(n2, n2, n2);
    }
}
