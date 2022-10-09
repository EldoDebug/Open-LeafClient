package net.minecraft.client.lIIIlllIIIllIIIllIII.IllIIlllIIIIlllIIlIl;

import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.client.IlIIIlIlIIIllIlIlIIl.*;
import java.util.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.*;
import net.minecraft.llllIIIIlIIIlIlllIll.*;
import net.minecraft.IlIlIIIlIIlIlIIlllIl.*;

public class llllIIIlIlllIlIIIIIl extends IIlllIIlIllIllIlIIll
{
    private static final lIllllIllIllIIllllll llllIIIIlIIIlIlllIll;
    private static final lIllllIllIllIIllllll IlIIIlIlIIIllIlIlIIl;
    private static final lIllllIllIllIIllllll IlIlIIIllIllIIIIIllI;
    private static final lIllllIllIllIIllllll IllIIlllIIIIlllIIlIl;
    private static final lIllllIllIllIIllllll llllIIIlIlllIlIIIIIl;
    private static final lIllllIllIllIIllllll lIIIIlIIIIIlllIllIII;
    private llIllIlIIIIllIlIIllI lIIIlllIIIllIIIllIII;
    private llIllIlIIIIllIlIIllI llIIlIIIlIIIllIlIIIl;
    private boolean llIllIlIIIIllIlIIllI;
    
    static {
        llllIIIIlIIIlIlllIll = new lIllllIllIllIIllllll("textures/entity/chest/trapped_double.png");
        IlIIIlIlIIIllIlIlIIl = new lIllllIllIllIIllllll("textures/entity/chest/christmas_double.png");
        IlIlIIIllIllIIIIIllI = new lIllllIllIllIIllllll("textures/entity/chest/normal_double.png");
        IllIIlllIIIIlllIIlIl = new lIllllIllIllIIllllll("textures/entity/chest/trapped.png");
        llllIIIlIlllIlIIIIIl = new lIllllIllIllIIllllll("textures/entity/chest/christmas.png");
        lIIIIlIIIIIlllIllIII = new lIllllIllIllIIllllll("textures/entity/chest/normal.png");
    }
    
    public llllIIIlIlllIlIIIIIl() {
        this.lIIIlllIIIllIIIllIII = new llIllIlIIIIllIlIIllI();
        this.llIIlIIIlIIIllIlIIIl = new IIlIIIIlllIlllllIlII();
        final Calendar instance = Calendar.getInstance();
        if (instance.get(2) + 1 == 12 && instance.get(5) >= 24 && instance.get(5) <= 26) {
            this.llIllIlIIIIllIlIIllI = true;
        }
    }
    
    public void llllIIIIlIIIlIlllIll(final IlIlIIIllIIllIlllllI ilIlIIIllIIllIlllllI, final double n, final double n2, final double n3, final float n4, final int n5) {
        lllllIlIIIlIlIIlllII.llIIlIIIlIIIllIlIIIl();
        lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI(515);
        lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(true);
        int n6;
        if (!ilIlIIIllIIllIlllllI.lIIIIlIIIIIlllIllIII()) {
            n6 = 0;
        }
        else {
            final llllIIIIlIIIlIlllIll ilIlIIIllIIllIlllllI2 = ilIlIIIllIIllIlllllI.IlIlIIIllIIllIlllllI();
            n6 = ilIlIIIllIIllIlllllI.llIIlIIIlIIIllIlIIIl();
            if (ilIlIIIllIIllIlllllI2 instanceof IIlIIIIIllIlIIIlIIll && n6 == 0) {
                ((IIlIIIIIllIlIIIlIIll)ilIlIIIllIIllIlllllI2).IlIlIIIllIllIIIIIllI(ilIlIIIllIIllIlllllI.IIlllIIIlIlllIIlllII(), ilIlIIIllIIllIlllllI.lIlIlIIIllIIllIIIllI(), ilIlIIIllIIllIlllllI.IIlllIIIlIlllIIlllII().IlIlIlIlIlllllllllIl(ilIlIIIllIIllIlllllI.lIlIlIIIllIIllIIIllI()));
                n6 = ilIlIIIllIIllIlllllI.llIIlIIIlIIIllIlIIIl();
            }
            ilIlIIIllIIllIlllllI.IIIlIIIlIlIIlllIIlll();
        }
        if (ilIlIIIllIIllIlllllI.IllIIlllIIIIlllIIlIl == null && ilIlIIIllIIllIlllllI.lIIIIlIIIIIlllIllIII == null) {
            llIllIlIIIIllIlIIllI llIllIlIIIIllIlIIllI;
            if (ilIlIIIllIIllIlllllI.llllIIIlIlllIlIIIIIl == null && ilIlIIIllIIllIlllllI.lIIIlllIIIllIIIllIII == null) {
                llIllIlIIIIllIlIIllI = this.lIIIlllIIIllIIIllIII;
                if (n5 >= 0) {
                    this.llllIIIIlIIIlIlllIll(net.minecraft.client.lIIIlllIIIllIIIllIII.IllIIlllIIIIlllIIlIl.llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl[n5]);
                    lllllIlIIIlIlIIlllII.lIlIlIIIllIIllIIIllI(5890);
                    lllllIlIIIlIlIIlllII.lllllIlIIIlIlIIlllII();
                    lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(4.0f, 4.0f, 1.0f);
                    lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(0.0625f, 0.0625f, 0.0625f);
                    lllllIlIIIlIlIIlllII.lIlIlIIIllIIllIIIllI(5888);
                }
                else if (this.llIllIlIIIIllIlIIllI) {
                    this.llllIIIIlIIIlIlllIll(net.minecraft.client.lIIIlllIIIllIIIllIII.IllIIlllIIIIlllIIlIl.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl);
                }
                else if (ilIlIIIllIIllIlllllI.IlIlIIIlIIlIlIIlllIl() == 1) {
                    this.llllIIIIlIIIlIlllIll(net.minecraft.client.lIIIlllIIIllIIIllIII.IllIIlllIIIIlllIIlIl.llllIIIlIlllIlIIIIIl.IllIIlllIIIIlllIIlIl);
                }
                else {
                    this.llllIIIIlIIIlIlllIll(net.minecraft.client.lIIIlllIIIllIIIllIII.IllIIlllIIIIlllIIlIl.llllIIIlIlllIlIIIIIl.lIIIIlIIIIIlllIllIII);
                }
            }
            else {
                llIllIlIIIIllIlIIllI = this.llIIlIIIlIIIllIlIIIl;
                if (n5 >= 0) {
                    this.llllIIIIlIIIlIlllIll(net.minecraft.client.lIIIlllIIIllIIIllIII.IllIIlllIIIIlllIIlIl.llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl[n5]);
                    lllllIlIIIlIlIIlllII.lIlIlIIIllIIllIIIllI(5890);
                    lllllIlIIIlIlIIlllII.lllllIlIIIlIlIIlllII();
                    lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(8.0f, 4.0f, 1.0f);
                    lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(0.0625f, 0.0625f, 0.0625f);
                    lllllIlIIIlIlIIlllII.lIlIlIIIllIIllIIIllI(5888);
                }
                else if (this.llIllIlIIIIllIlIIllI) {
                    this.llllIIIIlIIIlIlllIll(net.minecraft.client.lIIIlllIIIllIIIllIII.IllIIlllIIIIlllIIlIl.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl);
                }
                else if (ilIlIIIllIIllIlllllI.IlIlIIIlIIlIlIIlllIl() == 1) {
                    this.llllIIIIlIIIlIlllIll(net.minecraft.client.lIIIlllIIIllIIIllIII.IllIIlllIIIIlllIIlIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll);
                }
                else {
                    this.llllIIIIlIIIlIlllIll(net.minecraft.client.lIIIlllIIIllIIIllIII.IllIIlllIIIIlllIIlIl.llllIIIlIlllIlIIIIIl.IlIlIIIllIllIIIIIllI);
                }
            }
            lllllIlIIIlIlIIlllII.lllllIlIIIlIlIIlllII();
            lllllIlIIIlIlIIlllII.IlIlIllllllllIIIIlII();
            if (n5 < 0) {
                lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI(1.0f, 1.0f, 1.0f, 1.0f);
            }
            lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl((float)n, (float)n2 + 1.0f, (float)n3 + 1.0f);
            lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(1.0f, -1.0f, -1.0f);
            lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(0.5f, 0.5f, 0.5f);
            int n7 = 0;
            if (n6 == 2) {
                n7 = 180;
            }
            if (n6 == 3) {
                n7 = 0;
            }
            if (n6 == 4) {
                n7 = 90;
            }
            if (n6 == 5) {
                n7 = -90;
            }
            if (n6 == 2 && ilIlIIIllIIllIlllllI.llllIIIlIlllIlIIIIIl != null) {
                lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(1.0f, 0.0f, 0.0f);
            }
            if (n6 == 5 && ilIlIIIllIIllIlllllI.lIIIlllIIIllIIIllIII != null) {
                lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(0.0f, 0.0f, -1.0f);
            }
            lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl((float)n7, 0.0f, 1.0f, 0.0f);
            lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(-0.5f, -0.5f, -0.5f);
            float n8 = ilIlIIIllIIllIlllllI.llIllIlIIIIllIlIIllI + (ilIlIIIllIIllIlllllI.llIIlIIIlIIIllIlIIIl - ilIlIIIllIIllIlllllI.llIllIlIIIIllIlIIllI) * n4;
            if (ilIlIIIllIIllIlllllI.IllIIlllIIIIlllIIlIl != null) {
                final float n9 = ilIlIIIllIIllIlllllI.IllIIlllIIIIlllIIlIl.llIllIlIIIIllIlIIllI + (ilIlIIIllIIllIlllllI.IllIIlllIIIIlllIIlIl.llIIlIIIlIIIllIlIIIl - ilIlIIIllIIllIlllllI.IllIIlllIIIIlllIIlIl.llIllIlIIIIllIlIIllI) * n4;
                if (n9 > n8) {
                    n8 = n9;
                }
            }
            if (ilIlIIIllIIllIlllllI.lIIIIlIIIIIlllIllIII != null) {
                final float n10 = ilIlIIIllIIllIlllllI.lIIIIlIIIIIlllIllIII.llIllIlIIIIllIlIIllI + (ilIlIIIllIIllIlllllI.lIIIIlIIIIIlllIllIII.llIIlIIIlIIIllIlIIIl - ilIlIIIllIIllIlllllI.lIIIIlIIIIIlllIllIII.llIllIlIIIIllIlIIllI) * n4;
                if (n10 > n8) {
                    n8 = n10;
                }
            }
            final float n11 = 1.0f - n8;
            llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl = -((1.0f - n11 * n11 * n11) * 3.1415927f / 2.0f);
            llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll();
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
}
