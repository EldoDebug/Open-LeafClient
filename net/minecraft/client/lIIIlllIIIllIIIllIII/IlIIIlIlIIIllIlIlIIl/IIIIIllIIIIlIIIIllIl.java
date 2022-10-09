package net.minecraft.client.lIIIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl;

import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.client.IlIIIlIlIIIllIlIlIIl.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.*;

public class IIIIIllIIIIlIIIIllIl extends llIllIIIIIllIlIIIIlI
{
    private static final lIllllIllIllIIllllll llllIIIIlIIIlIlllIll;
    private IIIlIIlIIIIlllIlllII IlIlIIIllIllIIIIIllI;
    
    static {
        llllIIIIlIIIlIlllIll = new lIllllIllIllIIllllll("textures/entity/lead_knot.png");
    }
    
    public IIIIIllIIIIlIIIIllIl(final lllIllIIIllllllIllll lllIllIIIllllllIllll) {
        super(lllIllIIIllllllIllll);
        this.IlIlIIIllIllIIIIIllI = new IIIlIIlIIIIlllIlllII();
    }
    
    public void llllIIIIlIIIlIlllIll(final IlIlIIIllIIllIlllllI ilIlIIIllIIllIlllllI, final double n, final double n2, final double n3, final float n4, final float n5) {
        lllllIlIIIlIlIIlllII.lllllIlIIIlIlIIlllII();
        lllllIlIIIlIlIIlllII.IlIllIlIlIIIlIlIlIII();
        lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl((float)n, (float)n2, (float)n3);
        final float n6 = 0.0625f;
        lllllIlIIIlIlIIlllII.IlIlIllllllllIIIIlII();
        lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(-1.0f, -1.0f, 1.0f);
        lllllIlIIIlIlIIlllII.IlIIIlIlIIIllIlIlIIl();
        this.llIllIIIIIllIlIIIIlI(ilIlIIIllIIllIlllllI);
        this.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll(ilIlIIIllIIllIlllllI, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, n6);
        lllllIlIIIlIlIIlllII.lIllllllIIllIlIlIlII();
        super.llllIIIIlIIIlIlllIll(ilIlIIIllIIllIlllllI, n, n2, n3, n4, n5);
    }
    
    protected lIllllIllIllIIllllll llllIIIIlIIIlIlllIll(final IlIlIIIllIIllIlllllI ilIlIIIllIIllIlllllI) {
        return IIIIIllIIIIlIIIIllIl.llllIIIIlIIIlIlllIll;
    }
}
