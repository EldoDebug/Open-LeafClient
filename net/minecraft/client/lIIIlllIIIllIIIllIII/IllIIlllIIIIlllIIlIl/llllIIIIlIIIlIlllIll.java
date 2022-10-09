package net.minecraft.client.lIIIlllIIIllIIIllIII.IllIIlllIIIIlllIIlIl;

import net.minecraft.client.lIIIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl.*;
import net.minecraft.client.IlIIIlIlIIIllIlIlIIl.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;

public class llllIIIIlIIIlIlllIll extends llIllIIIIIllIlIIIIlI
{
    private static final lIllllIllIllIIllllll llllIIIIlIIIlIlllIll;
    private IlIIIlIlIIIllIlIlIIl IlIlIIIllIllIIIIIllI;
    
    static {
        llllIIIIlIIIlIlllIll = new lIllllIllIllIIllllll("textures/entity/endercrystal/endercrystal.png");
    }
    
    public llllIIIIlIIIlIlllIll(final lllIllIIIllllllIllll lllIllIIIllllllIllll) {
        super(lllIllIIIllllllIllll);
        this.IlIlIIIllIllIIIIIllI = new IlIllIlIlIIIlIlIlIII(0.0f, true);
        this.llIllIIIIIllIlIIIIlI = 0.5f;
    }
    
    public void llllIIIIlIIIlIlllIll(final net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl.llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI, final double n, final double n2, final double n3, final float n4, final float n5) {
        final float n6 = llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll + n5;
        lllllIlIIIlIlIIlllII.lllllIlIIIlIlIIlllII();
        lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl((float)n, (float)n2, (float)n3);
        this.llllIIIIlIIIlIlllIll(net.minecraft.client.lIIIlllIIIllIIIllIII.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll);
        final float n7 = llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(n6 * 0.2f) / 2.0f + 0.5f;
        this.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI, 0.0f, n6 * 3.0f, (n7 * n7 + n7) * 0.2f, 0.0f, 0.0f, 0.0625f);
        lllllIlIIIlIlIIlllII.lIllllllIIllIlIlIlII();
        super.llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI, n, n2, n3, n4, n5);
    }
    
    protected lIllllIllIllIIllllll llllIIIIlIIIlIlllIll(final net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl.llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI) {
        return net.minecraft.client.lIIIlllIIIllIIIllIII.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll;
    }
}
