package net.minecraft.client.lIIIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl;

import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.client.IlIIIlIlIIIllIlIlIIl.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIIIllIllIIIIIllI.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;

public class lllllIIIIIlIlIIIIIIl extends IIllllIIIlIIIIIIllIl
{
    private static final lIllllIllIllIIllllll llllIIIIlIIIlIlllIll;
    
    static {
        llllIIIIlIIIlIlllIll = new lIllllIllIllIIllllll("textures/entity/slime/slime.png");
    }
    
    public lllllIIIIIlIlIIIIIIl(final lllIllIIIllllllIllll lllIllIIIllllllIllll, final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl, final float n) {
        super(lllIllIIIllllllIllll, ilIIIlIlIIIllIlIlIIl, n);
        this.llllIIIIlIIIlIlllIll(new IlIlIIIIIIlllIlIllIl(this));
    }
    
    public void llllIIIIlIIIlIlllIll(final IIIllllllIllIIIlllIl iiIllllllIllIIIlllIl, final double n, final double n2, final double n3, final float n4, final float n5) {
        this.llIllIIIIIllIlIIIIlI = 0.25f * iiIllllllIllIIIlllIl.ao();
        super.llllIIIIlIIIlIlllIll(iiIllllllIllIIIlllIl, n, n2, n3, n4, n5);
    }
    
    protected void llllIIIIlIIIlIlllIll(final IIIllllllIllIIIlllIl iiIllllllIllIIIlllIl, final float n) {
        final float n2 = (float)iiIllllllIllIIIlllIl.ao();
        final float n3 = 1.0f / ((iiIllllllIllIIIlllIl.llIllIIIIIllIlIIIIlI + (iiIllllllIllIIIlllIl.IlIlIlIlIlllllllllIl - iiIllllllIllIIIlllIl.llIllIIIIIllIlIIIIlI) * n) / (n2 * 0.5f + 1.0f) + 1.0f);
        lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(n3 * n2, 1.0f / n3 * n2, n3 * n2);
    }
    
    protected lIllllIllIllIIllllll llllIIIIlIIIlIlllIll(final IIIllllllIllIIIlllIl iiIllllllIllIIIlllIl) {
        return lllllIIIIIlIlIIIIIIl.llllIIIIlIIIlIlllIll;
    }
}
