package net.minecraft.client.lIIIlllIIIllIIIllIII.IllIIlllIIIIlllIIlIl;

import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.client.IlIIIlIlIIIllIlIlIIl.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.*;
import net.minecraft.IlIlIIIlIIlIlIIlllIl.*;

public class llIIlIIIlIIIllIlIIIl extends IIlllIIlIllIllIlIIll
{
    private static final lIllllIllIllIIllllll llllIIIIlIIIlIlllIll;
    private llIllIlIIIIllIlIIllI IlIIIlIlIIIllIlIlIIl;
    
    static {
        llllIIIIlIIIlIlllIll = new lIllllIllIllIIllllll("textures/entity/chest/ender.png");
    }
    
    public llIIlIIIlIIIllIlIIIl() {
        this.IlIIIlIlIIIllIlIlIIl = new llIllIlIIIIllIlIIllI();
    }
    
    public void llllIIIIlIIIlIlllIll(final IlIlIIIlIIlIlIIlllIl ilIlIIIlIIlIlIIlllIl, final double n, final double n2, final double n3, final float n4, final int n5) {
        int llIIlIIIlIIIllIlIIIl = 0;
        if (ilIlIIIlIIlIlIIlllIl.lIIIIlIIIIIlllIllIII()) {
            llIIlIIIlIIIllIlIIIl = ilIlIIIlIIlIlIIlllIl.llIIlIIIlIIIllIlIIIl();
        }
        if (n5 >= 0) {
            this.llllIIIIlIIIlIlllIll(net.minecraft.client.lIIIlllIIIllIIIllIII.IllIIlllIIIIlllIIlIl.llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl[n5]);
            lllllIlIIIlIlIIlllII.lIlIlIIIllIIllIIIllI(5890);
            lllllIlIIIlIlIIlllII.lllllIlIIIlIlIIlllII();
            lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(4.0f, 4.0f, 1.0f);
            lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(0.0625f, 0.0625f, 0.0625f);
            lllllIlIIIlIlIIlllII.lIlIlIIIllIIllIIIllI(5888);
        }
        else {
            this.llllIIIIlIIIlIlllIll(net.minecraft.client.lIIIlllIIIllIIIllIII.IllIIlllIIIIlllIIlIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll);
        }
        lllllIlIIIlIlIIlllII.lllllIlIIIlIlIIlllII();
        lllllIlIIIlIlIIlllII.IlIlIllllllllIIIIlII();
        lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI(1.0f, 1.0f, 1.0f, 1.0f);
        lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl((float)n, (float)n2 + 1.0f, (float)n3 + 1.0f);
        lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(1.0f, -1.0f, -1.0f);
        lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(0.5f, 0.5f, 0.5f);
        int n6 = 0;
        if (llIIlIIIlIIIllIlIIIl == 2) {
            n6 = 180;
        }
        if (llIIlIIIlIIIllIlIIIl == 3) {
            n6 = 0;
        }
        if (llIIlIIIlIIIllIlIIIl == 4) {
            n6 = 90;
        }
        if (llIIlIIIlIIIllIlIIIl == 5) {
            n6 = -90;
        }
        lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl((float)n6, 0.0f, 1.0f, 0.0f);
        lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(-0.5f, -0.5f, -0.5f);
        final float n7 = 1.0f - (ilIlIIIlIIlIlIIlllIl.IllIIlllIIIIlllIIlIl + (ilIlIIIlIIlIlIIlllIl.IlIlIIIllIllIIIIIllI - ilIlIIIlIIlIlIIlllIl.IllIIlllIIIIlllIIlIl) * n4);
        this.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl = -((1.0f - n7 * n7 * n7) * 3.1415927f / 2.0f);
        this.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll();
        lllllIlIIIlIlIIlllII.IIlllIlIIllIlIlIlIIl();
        lllllIlIIIlIlIIlllII.lIllllllIIllIlIlIlII();
        lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI(1.0f, 1.0f, 1.0f, 1.0f);
        if (n5 >= 0) {
            lllllIlIIIlIlIIlllII.lIlIlIIIllIIllIIIllI(5890);
            lllllIlIIIlIlIIlllII.lIllllllIIllIlIlIlII();
            lllllIlIIIlIlIIlllII.lIlIlIIIllIIllIIIllI(5888);
        }
    }
}
