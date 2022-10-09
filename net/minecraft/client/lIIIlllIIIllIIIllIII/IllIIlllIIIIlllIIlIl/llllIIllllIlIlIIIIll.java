package net.minecraft.client.lIIIlllIIIllIIIllIII.IllIIlllIIIIlllIIlIl;

import net.minecraft.client.IlIIIlIlIIIllIlIlIIl.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.*;
import net.minecraft.lIIIlllIIIllIIIllIII.*;
import org.lwjgl.opengl.*;
import net.optifine.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.client.llIllIIIIIllIlIIIIlI.*;
import java.util.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.client.*;
import net.minecraft.IlIlIIIlIIlIlIIlllIl.*;

public class llllIIllllIlIlIIIIll extends IIlllIIlIllIllIlIIll
{
    private static final lIllllIllIllIIllllll llllIIIIlIIIlIlllIll;
    private final IlIIIlIIIllllIlIlIlI IlIIIlIlIIIllIlIlIIl;
    private static double IlIlIIIllIllIIIIIllI;
    
    static {
        llllIIIIlIIIlIlllIll = new lIllllIllIllIIllllll("textures/entity/sign.png");
        llllIIllllIlIlIIIIll.IlIlIIIllIllIIIIIllI = 4096.0;
    }
    
    public llllIIllllIlIlIIIIll() {
        this.IlIIIlIlIIIllIlIlIIl = new IlIIIlIIIllllIlIlIlI();
    }
    
    public void llllIIIIlIIIlIlllIll(final llIIlllIIlllIIllIllI llIIlllIIlllIIllIllI, final double n, final double n2, final double n3, final float n4, final int n5) {
        final net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll ilIlIIIllIIllIlllllI = llIIlllIIlllIIllIllI.IlIlIIIllIIllIlllllI();
        lllllIlIIIlIlIIlllII.lllllIlIIIlIlIIlllII();
        final float n6 = 0.6666667f;
        if (ilIlIIIllIIllIlllllI == net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIlllllIllIllIlIlIII) {
            lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl((float)n + 0.5f, (float)n2 + 0.75f * n6, (float)n3 + 0.5f);
            lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(-(llIIlllIIlllIIllIllI.llIIlIIIlIIIllIlIIIl() * 360 / 16.0f), 0.0f, 1.0f, 0.0f);
            this.IlIIIlIlIIIllIlIlIIl.IlIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl = true;
        }
        else {
            final int llIIlIIIlIIIllIlIIIl = llIIlllIIlllIIllIllI.llIIlIIIlIIIllIlIIIl();
            float n7 = 0.0f;
            if (llIIlIIIlIIIllIlIIIl == 2) {
                n7 = 180.0f;
            }
            if (llIIlIIIlIIIllIlIIIl == 4) {
                n7 = 90.0f;
            }
            if (llIIlIIIlIIIllIlIIIl == 5) {
                n7 = -90.0f;
            }
            lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl((float)n + 0.5f, (float)n2 + 0.75f * n6, (float)n3 + 0.5f);
            lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(-n7, 0.0f, 1.0f, 0.0f);
            lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(0.0f, -0.3125f, -0.4375f);
            this.IlIIIlIlIIIllIlIlIIl.IlIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl = false;
        }
        if (n5 >= 0) {
            this.llllIIIIlIIIlIlllIll(llllIIllllIlIlIIIIll.IlIlIlIlIlllllllllIl[n5]);
            lllllIlIIIlIlIIlllII.lIlIlIIIllIIllIIIllI(5890);
            lllllIlIIIlIlIIlllII.lllllIlIIIlIlIIlllII();
            lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(4.0f, 2.0f, 1.0f);
            lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(0.0625f, 0.0625f, 0.0625f);
            lllllIlIIIlIlIIlllII.lIlIlIIIllIIllIIIllI(5888);
        }
        else {
            this.llllIIIIlIIIlIlllIll(llllIIllllIlIlIIIIll.llllIIIIlIIIlIlllIll);
        }
        lllllIlIIIlIlIIlllII.IlIlIllllllllIIIIlII();
        lllllIlIIIlIlIIlllII.lllllIlIIIlIlIIlllII();
        lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(n6, -n6, -n6);
        this.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll();
        lllllIlIIIlIlIIlllII.lIllllllIIllIlIlIlII();
        if (llllIIIIlIIIlIlllIll(llIIlllIIlllIIllIllI)) {
            final FontRenderer ilIIIlIlIIIllIlIlIIl = this.IlIIIlIlIIIllIlIlIIl();
            final float n8 = 0.015625f * n6;
            lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(0.0f, 0.5f * n6, 0.07f * n6);
            lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(n8, -n8, n8);
            GL11.glNormal3f(0.0f, 0.0f, -1.0f * n8);
            lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(false);
            int ilIIIlIlIIIllIlIlIIl2 = 0;
            if (net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.lllIIIIlIlIllIIlIIIl()) {
                ilIIIlIlIIIllIlIlIIl2 = lllIIIIlllllIlIIllIl.IlIIIlIlIIIllIlIlIIl(ilIIIlIlIIIllIlIlIIl2);
            }
            if (n5 < 0) {
                for (int i = 0; i < llIIlllIIlllIIllIllI.IlIlIIIllIllIIIIIllI.length; ++i) {
                    if (llIIlllIIlllIIllIllI.IlIlIIIllIllIIIIIllI[i] != null) {
                        final List llllIIIIlIIIlIlllIll = IlIIlllIIlIlllllIIlI.llllIIIIlIIIlIlllIll(llIIlllIIlllIIllIllI.IlIlIIIllIllIIIIIllI[i], 90, ilIIIlIlIIIllIlIlIIl, false, true);
                        final String s = (llllIIIIlIIIlIlllIll != null && llllIIIIlIIIlIlllIll.size() > 0) ? llllIIIIlIIIlIlllIll.get(0).lIIIlllIIIllIIIllIII() : "";
                        if (i == llIIlllIIlllIIllIllI.IllIIlllIIIIlllIIlIl) {
                            final String string = "> " + s + " <";
                            ilIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(string, -ilIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(string) / 2, i * 10 - llIIlllIIlllIIllIllI.IlIlIIIllIllIIIIIllI.length * 5, ilIIIlIlIIIllIlIlIIl2);
                        }
                        else {
                            ilIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(s, -ilIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(s) / 2, i * 10 - llIIlllIIlllIIllIllI.IlIlIIIllIllIIIIIllI.length * 5, ilIIIlIlIIIllIlIlIIl2);
                        }
                    }
                }
            }
        }
        lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(true);
        lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI(1.0f, 1.0f, 1.0f, 1.0f);
        lllllIlIIIlIlIIlllII.lIllllllIIllIlIlIlII();
        if (n5 >= 0) {
            lllllIlIIIlIlIIlllII.lIlIlIIIllIIllIIIllI(5890);
            lllllIlIIIlIlIIlllII.lIllllllIIllIlIlIlII();
            lllllIlIIIlIlIIlllII.lIlIlIIIllIIllIIIllI(5888);
        }
    }
    
    private static boolean llllIIIIlIIIlIlllIll(final llIIlllIIlllIIllIllI llIIlllIIlllIIllIllI) {
        if (net.optifine.shaders.llIIlllIIlllIIllIllI.IIlllIIlIllIllIlIIll) {
            return false;
        }
        if (net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.lIIIIlIlIllllIIlIllI().IIIIlllIIIIIIlIIIlll instanceof net.minecraft.client.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl.llllIIllllIlIlIIIIll) {
            return true;
        }
        if (!net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIllllIlIlIIIIll && llIIlllIIlllIIllIllI.IllIIlllIIIIlllIIlIl < 0) {
            final llIllIIIIIllIlIIIIlI liiiIlIlIllllIIlIllI = net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.lIIIIlIlIllllIIlIllI().lIIIIlIlIllllIIlIllI();
            if (llIIlllIIlllIIllIllI.llllIIIIlIIIlIlllIll(liiiIlIlIllllIIlIllI.IIlllIlIIllIlIlIlIIl, liiiIlIlIllllIIlIllI.llIIIlIlIllIIlIlIlII, liiiIlIlIllllIIlIllI.lllllIlIIIlIlIIlllII) > llllIIllllIlIlIIIIll.IlIlIIIllIllIIIIIllI) {
                return false;
            }
        }
        return true;
    }
    
    public static void IlIlIlIlIlllllllllIl() {
        final Minecraft liiiIlIlIllllIIlIllI = net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.lIIIIlIlIllllIIlIllI();
        final double max = Math.max(1.5 * liiiIlIlIllllIIlIllI.IlIlIIIllIllIIIIIllI / net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(liiiIlIlIllllIIlIllI.IIIlIIIlIlIIlllIIlll.llIlIIIIllIlIIlIlIII, 1.0f, 120.0f), 16.0);
        llllIIllllIlIlIIIIll.IlIlIIIllIllIIIIIllI = max * max;
    }
}
