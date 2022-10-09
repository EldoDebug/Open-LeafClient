package net.minecraft.client.lIIIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll;

import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl.*;
import net.minecraft.client.IlIIIlIlIIIllIlIlIIl.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.IllIIlllIIIIlllIIlIl.*;
import net.minecraft.llIllIlIIIIllIlIIllI.*;
import net.minecraft.IIllIIllIIIlIlIIIIlI.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;

public class lllIIIIlllllIlIIllIl implements IlIllIlIlIIIlIlIlIII
{
    private static final lIllllIllIllIIllllll IlIlIlIlIlllllllllIl;
    private final llIIIIIIlIllIIlIIIll llIllIIIIIllIlIIIIlI;
    public llllllIllIllIlIllllI llllIIIIlIIIlIlllIll;
    
    static {
        IlIlIlIlIlllllllllIl = new lIllllIllIllIIllllll("textures/entity/sheep/sheep_fur.png");
    }
    
    public lllIIIIlllllIlIIllIl(final llIIIIIIlIllIIlIIIll llIllIIIIIllIlIIIIlI) {
        this.llllIIIIlIIIlIlllIll = new llllllIllIllIlIllllI();
        this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
    }
    
    public void llllIIIIlIIIlIlllIll(final IIIlIIIlIlIIlllIIlll iiIlIIIlIlIIlllIIlll, final float n, final float n2, final float n3, final float n4, final float n5, final float n6, final float n7) {
        if (!iiIlIIIlIlIIlllIIlll.ar() && !iiIlIIIlIlIIlllIIlll.IIIIIIIllllIlIIIIIII()) {
            this.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(lllIIIIlllllIlIIllIl.IlIlIlIlIlllllllllIl);
            if (iiIlIIIlIlIIlllIIlll.w_() && "jeb_".equals(iiIlIIIlIlIIlllIIlll.lIllIlIIIllllllIIlII())) {
                final int n8 = iiIlIIIlIlIIlllIIlll.lllllIIIIIlIlIIIIIIl / 25 + iiIlIIIlIlIIlllIIlll.IlllIIIIlIIIlIlIlIIl();
                final int length = net.minecraft.llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl.values().length;
                final int n9 = n8 % length;
                final int n10 = (n8 + 1) % length;
                final float n11 = (iiIlIIIlIlIIlllIIlll.lllllIIIIIlIlIIIIIIl % 25 + n3) / 25.0f;
                float[] array = IIIlIIIlIlIIlllIIlll.llllIIIIlIIIlIlllIll(net.minecraft.llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl(n9));
                float[] array2 = IIIlIIIlIlIIlllIIlll.llllIIIIlIIIlIlllIll(net.minecraft.llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl(n10));
                if (net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.lllIIIIlIlIllIIlIIIl()) {
                    array = net.optifine.lllIIIIlllllIlIIllIl.IlIlIlIlIlllllllllIl(net.minecraft.llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl(n9), array);
                    array2 = net.optifine.lllIIIIlllllIlIIllIl.IlIlIlIlIlllllllllIl(net.minecraft.llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl(n10), array2);
                }
                lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI(array[0] * (1.0f - n11) + array2[0] * n11, array[1] * (1.0f - n11) + array2[1] * n11, array[2] * (1.0f - n11) + array2[2] * n11);
            }
            else {
                float[] array3 = IIIlIIIlIlIIlllIIlll.llllIIIIlIIIlIlllIll(iiIlIIIlIlIIlllIIlll.aq());
                if (net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.lllIIIIlIlIllIIlIIIl()) {
                    array3 = net.optifine.lllIIIIlllllIlIIllIl.IlIlIlIlIlllllllllIl(iiIlIIIlIlIIlllIIlll.aq(), array3);
                }
                lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI(array3[0], array3[1], array3[2]);
            }
            this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(this.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl());
            this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(iiIlIIIlIlIIlllIIlll, n, n2, n3);
            this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(iiIlIIIlIlIIlllIIlll, n, n2, n4, n5, n6, n7);
        }
    }
    
    @Override
    public boolean IlIlIlIlIlllllllllIl() {
        return true;
    }
}
