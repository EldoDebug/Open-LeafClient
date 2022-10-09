package net.minecraft.client.lIIIlllIIIllIIIllIII.IllIIlllIIIIlllIIlIl;

import net.minecraft.IlllllllIIIlIIIlIlII.*;
import java.util.*;
import java.nio.*;
import net.minecraft.IIllIIllIIIlIlIIIIlI.*;
import net.optifine.shaders.*;
import net.minecraft.client.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.*;
import net.minecraft.IlIlIIIlIIlIlIIlllIl.*;

public class lIIIlllIIIllIIIllIII extends IIlllIIlIllIllIlIIll
{
    private static final lIllllIllIllIIllllll IlIIIlIlIIIllIlIlIIl;
    private static final lIllllIllIllIIllllll IlIlIIIllIllIIIIIllI;
    private static final Random IllIIlllIIIIlllIIlIl;
    FloatBuffer llllIIIIlIIIlIlllIll;
    
    static {
        IlIIIlIlIIIllIlIlIIl = new lIllllIllIllIIllllll("textures/environment/end_sky.png");
        IlIlIIIllIllIIIIIllI = new lIllllIllIllIIllllll("textures/entity/end_portal.png");
        IllIIlllIIIIlllIIlIl = new Random(31100L);
    }
    
    public lIIIlllIIIllIIIllIII() {
        this.llllIIIIlIIIlIlllIll = llIIIlIlIllIIlIlIlII.IlIlIIIllIllIIIIIllI(16);
    }
    
    public void llllIIIIlIIIlIlllIll(final IIIlIIIlIlIIlllIIlll iiIlIIIlIlIIlllIIlll, final double n, final double n2, final double n3, final float n4, final int n5) {
        if (!net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.b() || !IIlllIIIlIlllIIlllII.llllIIIIlIIIlIlllIll(iiIlIIIlIlIIlllIIlll, n, n2, n3, n4, n5, 0.75f)) {
            final float n6 = (float)this.llIllIIIIIllIlIIIIlI.lIlIlIIIllIIllIIIllI;
            final float n7 = (float)this.llIllIIIIIllIlIIIIlI.IlIlIIIllIIllIlllllI;
            final float n8 = (float)this.llIllIIIIIllIlIIIIlI.IIIIlllIIIIIIlIIIlll;
            lllllIlIIIlIlIIlllII.IllIIlllIIIIlllIIlIl();
            lIIIlllIIIllIIIllIII.IllIIlllIIIIlllIIlIl.setSeed(31100L);
            final float n9 = 0.75f;
            for (int i = 0; i < 16; ++i) {
                lllllIlIIIlIlIIlllII.lllllIlIIIlIlIIlllII();
                float n10 = (float)(16 - i);
                float n11 = 0.0625f;
                float n12 = 1.0f / (n10 + 1.0f);
                if (i == 0) {
                    this.llllIIIIlIIIlIlllIll(lIIIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl);
                    n12 = 0.1f;
                    n10 = 65.0f;
                    n11 = 0.125f;
                    lllllIlIIIlIlIIlllII.lIlIlIIIllIIllIIIllI();
                    lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(770, 771);
                }
                if (i >= 1) {
                    this.llllIIIIlIIIlIlllIll(lIIIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI);
                }
                if (i == 1) {
                    lllllIlIIIlIlIIlllII.lIlIlIIIllIIllIIIllI();
                    lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(1, 1);
                    n11 = 0.5f;
                }
                final float n13 = (float)(-(n2 + n9));
                lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(n6, (float)(n2 + n9) + (n13 + (float)net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll().IlIlIlIlIlllllllllIl) / (n13 + n10 + (float)net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll().IlIlIlIlIlllllllllIl), n8);
                lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(IllIllIIIIlIIlIlllII.llllIIIIlIIIlIlllIll, 9217);
                lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(IllIllIIIIlIIlIlllII.IlIlIlIlIlllllllllIl, 9217);
                lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(IllIllIIIIlIIlIlllII.llIllIIIIIllIlIIIIlI, 9217);
                lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(IllIllIIIIlIIlIlllII.IlIIIlIlIIIllIlIlIIl, 9216);
                lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(IllIllIIIIlIIlIlllII.llllIIIIlIIIlIlllIll, 9473, this.llllIIIIlIIIlIlllIll(1.0f, 0.0f, 0.0f, 0.0f));
                lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(IllIllIIIIlIIlIlllII.IlIlIlIlIlllllllllIl, 9473, this.llllIIIIlIIIlIlllIll(0.0f, 0.0f, 1.0f, 0.0f));
                lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(IllIllIIIIlIIlIlllII.llIllIIIIIllIlIIIIlI, 9473, this.llllIIIIlIIIlIlllIll(0.0f, 0.0f, 0.0f, 1.0f));
                lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(IllIllIIIIlIIlIlllII.IlIIIlIlIIIllIlIlIIl, 9474, this.llllIIIIlIIIlIlllIll(0.0f, 1.0f, 0.0f, 0.0f));
                lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(IllIllIIIIlIIlIlllII.llllIIIIlIIIlIlllIll);
                lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(IllIllIIIIlIIlIlllII.IlIlIlIlIlllllllllIl);
                lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(IllIllIIIIlIIlIlllII.llIllIIIIIllIlIIIIlI);
                lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(IllIllIIIIlIIlIlllII.IlIIIlIlIIIllIlIlIIl);
                lllllIlIIIlIlIIlllII.lIllllllIIllIlIlIlII();
                lllllIlIIIlIlIIlllII.lIlIlIIIllIIllIIIllI(5890);
                lllllIlIIIlIlIIlllII.lllllIlIIIlIlIIlllII();
                lllllIlIIIlIlIIlllII.llIIIlIlIllIIlIlIlII();
                lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(0.0f, Minecraft.IIIllllllIllIIIlllIl() % 700000L / 700000.0f, 0.0f);
                lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(n11, n11, n11);
                lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(0.5f, 0.5f, 0.0f);
                lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl((i * i * 4321 + i * 9) * 2.0f, 0.0f, 0.0f, 1.0f);
                lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(-0.5f, -0.5f, 0.0f);
                lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(-n6, -n8, -n7);
                final float n14 = n13 + (float)net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll().IlIlIlIlIlllllllllIl;
                lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl((float)net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll().llllIIIIlIIIlIlllIll * n10 / n14, (float)net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll().llIllIIIIIllIlIIIIlI * n10 / n14, -n7);
                final IIlllIIlllIIIlIlllII llllIIIIlIIIlIlllIll = IIlllIIlllIIIlIlllII.llllIIIIlIIIlIlllIll();
                final lIIllIIIllllIlllIllI llIllIIIIIllIlIIIIlI = llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI();
                llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(7, net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII);
                float n15 = (lIIIlllIIIllIIIllIII.IllIIlllIIIIlllIIlIl.nextFloat() * 0.5f + 0.1f) * n12;
                float n16 = (lIIIlllIIIllIIIllIII.IllIIlllIIIIlllIIlIl.nextFloat() * 0.5f + 0.4f) * n12;
                float n17 = (lIIIlllIIIllIIIllIII.IllIIlllIIIIlllIIlIl.nextFloat() * 0.5f + 0.5f) * n12;
                if (i == 0) {
                    n16 = (n15 = (n17 = 1.0f * n12));
                }
                llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(n, n2 + n9, n3).llllIIIIlIIIlIlllIll(n15, n16, n17, 1.0f).IlIlIIIllIllIIIIIllI();
                llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(n, n2 + n9, n3 + 1.0).llllIIIIlIIIlIlllIll(n15, n16, n17, 1.0f).IlIlIIIllIllIIIIIllI();
                llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(n + 1.0, n2 + n9, n3 + 1.0).llllIIIIlIIIlIlllIll(n15, n16, n17, 1.0f).IlIlIIIllIllIIIIIllI();
                llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(n + 1.0, n2 + n9, n3).llllIIIIlIIIlIlllIll(n15, n16, n17, 1.0f).IlIlIIIllIllIIIIIllI();
                llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl();
                lllllIlIIIlIlIIlllII.lIllllllIIllIlIlIlII();
                lllllIlIIIlIlIIlllII.lIlIlIIIllIIllIIIllI(5888);
                this.llllIIIIlIIIlIlllIll(lIIIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl);
            }
            lllllIlIIIlIlIIlllII.llIllIlIIIIllIlIIllI();
            lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(IllIllIIIIlIIlIlllII.llllIIIIlIIIlIlllIll);
            lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(IllIllIIIIlIIlIlllII.IlIlIlIlIlllllllllIl);
            lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(IllIllIIIIlIIlIlllII.llIllIIIIIllIlIIIIlI);
            lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(IllIllIIIIlIIlIlllII.IlIIIlIlIIIllIlIlIIl);
            lllllIlIIIlIlIIlllII.IlIlIIIllIllIIIIIllI();
        }
    }
    
    private FloatBuffer llllIIIIlIIIlIlllIll(final float n, final float n2, final float n3, final float n4) {
        this.llllIIIIlIIIlIlllIll.clear();
        this.llllIIIIlIIIlIlllIll.put(n).put(n2).put(n3).put(n4);
        this.llllIIIIlIIIlIlllIll.flip();
        return this.llllIIIIlIIIlIlllIll;
    }
}
