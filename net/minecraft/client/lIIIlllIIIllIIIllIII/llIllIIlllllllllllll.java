package net.minecraft.client.lIIIlllIIIllIIIllIII;

import net.minecraft.IIllIIllIIIlIlIIIIlI.*;
import net.optifine.lIIIIlIIIIIlllIllIII.*;
import org.lwjgl.opengl.*;
import net.optifine.shaders.*;
import java.nio.*;
import java.util.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIlIlllIlIIIIIl.*;

public class llIllIIlllllllllllll
{
    private static volatile /* synthetic */ int[] llllIIIIlIIIlIlllIll;
    
    public void llllIIIIlIIIlIlllIll(final lIIllIIIllllIlllIllI liIllIIIllllIlllIllI) {
        if (liIllIIIllllIlllIllI.lIIIlllIIIllIIIllIII() > 0) {
            if (liIllIIIllllIlllIllI.llIIlIIIlIIIllIlIIIl() == 7 && net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.I()) {
                liIllIIIllllIlllIllI.lllIIIIlllllIlIIllIl();
            }
            final llIllIIIIIllIlIIIIlI liiiIlIIIIIlllIllIII = liIllIIIllllIlllIllI.lIIIIlIIIIIlllIllIII();
            final int llllIIIlIlllIlIIIIIl = liiiIlIIIIIlllIllIII.llllIIIlIlllIlIIIIIl();
            final ByteBuffer llllIIIlIlllIlIIIIIl2 = liIllIIIllllIlllIllI.llllIIIlIlllIlIIIIIl();
            final List liiiIlIIIIIlllIllIII2 = liiiIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII();
            final boolean llIllIIIIIllIlIIIIlI = lIIIIlIIIIIlllIllIII.E.llIllIIIIIllIlIIIIlI();
            final boolean llIllIIIIIllIlIIIIlI2 = lIIIIlIIIIIlllIllIII.F.llIllIIIIIllIlIIIIlI();
            for (int i = 0; i < liiiIlIIIIIlllIllIII2.size(); ++i) {
                final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl = liiiIlIIIIIlllIllIII2.get(i);
                final IllIIlllIIIIlllIIlIl ilIlIlIlIlllllllllIl = ilIIIlIlIIIllIlIlIIl.IlIlIlIlIlllllllllIl();
                if (llIllIIIIIllIlIIIIlI) {
                    lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl, lIIIIlIIIIIlllIllIII.E, liiiIlIIIIIlllIllIII, i, llllIIIlIlllIlIIIIIl, llllIIIlIlllIlIIIIIl2);
                }
                else {
                    final int llIllIIIIIllIlIIIIlI3 = ilIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll().llIllIIIIIllIlIIIIlI();
                    final int ilIIIlIlIIIllIlIlIIl2 = ilIIIlIlIIIllIlIlIIl.IlIIIlIlIIIllIlIlIIl();
                    llllIIIlIlllIlIIIIIl2.position(liiiIlIIIIIlllIllIII.IlIIIlIlIIIllIlIlIIl(i));
                    switch (llllIIIIlIIIlIlllIll()[ilIlIlIlIlllllllllIl.ordinal()]) {
                        case 1: {
                            GL11.glVertexPointer(ilIIIlIlIIIllIlIlIIl.llIllIIIIIllIlIIIIlI(), llIllIIIIIllIlIIIIlI3, llllIIIlIlllIlIIIIIl, llllIIIlIlllIlIIIIIl2);
                            GL11.glEnableClientState(32884);
                            break;
                        }
                        case 4: {
                            lIIIIlIlIllllIIlIllI.lIlIlIIIllIIllIIIllI(lIIIIlIlIllllIIlIllI.IIlllIIlIllIllIlIIll + ilIIIlIlIIIllIlIlIIl2);
                            GL11.glTexCoordPointer(ilIIIlIlIIIllIlIlIIl.llIllIIIIIllIlIIIIlI(), llIllIIIIIllIlIIIIlI3, llllIIIlIlllIlIIIIIl, llllIIIlIlllIlIIIIIl2);
                            GL11.glEnableClientState(32888);
                            lIIIIlIlIllllIIlIllI.lIlIlIIIllIIllIIIllI(lIIIIlIlIllllIIlIllI.IIlllIIlIllIllIlIIll);
                            break;
                        }
                        case 3: {
                            GL11.glColorPointer(ilIIIlIlIIIllIlIlIIl.llIllIIIIIllIlIIIIlI(), llIllIIIIIllIlIIIIlI3, llllIIIlIlllIlIIIIIl, llllIIIlIlllIlIIIIIl2);
                            GL11.glEnableClientState(32886);
                            break;
                        }
                        case 2: {
                            GL11.glNormalPointer(llIllIIIIIllIlIIIIlI3, llllIIIlIlllIlIIIIIl, llllIIIlIlllIlIIIIIl2);
                            GL11.glEnableClientState(32885);
                            break;
                        }
                    }
                }
            }
            if (liIllIIIllllIlllIllI.llIllIlIIIIllIlIIllI()) {
                liIllIIIllllIlllIllI.lIlIlIIIllIIllIIIllI();
            }
            else if (net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.b()) {
                IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(liIllIIIllllIlllIllI.llIIlIIIlIIIllIlIIIl(), 0, liIllIIIllllIlllIllI.lIIIlllIIIllIIIllIII(), liIllIIIllllIlllIllI);
            }
            else {
                GL11.glDrawArrays(liIllIIIllllIlllIllI.llIIlIIIlIIIllIlIIIl(), 0, liIllIIIllllIlllIllI.lIIIlllIIIllIIIllIII());
            }
            for (int j = 0; j < liiiIlIIIIIlllIllIII2.size(); ++j) {
                final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl3 = liiiIlIIIIIlllIllIII2.get(j);
                final IllIIlllIIIIlllIIlIl ilIlIlIlIlllllllllIl2 = ilIIIlIlIIIllIlIlIIl3.IlIlIlIlIlllllllllIl();
                if (llIllIIIIIllIlIIIIlI2) {
                    lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl2, lIIIIlIIIIIlllIllIII.F, liiiIlIIIIIlllIllIII, j, llllIIIlIlllIlIIIIIl, llllIIIlIlllIlIIIIIl2);
                }
                else {
                    final int ilIIIlIlIIIllIlIlIIl4 = ilIIIlIlIIIllIlIlIIl3.IlIIIlIlIIIllIlIlIIl();
                    switch (llllIIIIlIIIlIlllIll()[ilIlIlIlIlllllllllIl2.ordinal()]) {
                        case 1: {
                            GL11.glDisableClientState(32884);
                            break;
                        }
                        case 4: {
                            lIIIIlIlIllllIIlIllI.lIlIlIIIllIIllIIIllI(lIIIIlIlIllllIIlIllI.IIlllIIlIllIllIlIIll + ilIIIlIlIIIllIlIlIIl4);
                            GL11.glDisableClientState(32888);
                            lIIIIlIlIllllIIlIllI.lIlIlIIIllIIllIIIllI(lIIIIlIlIllllIIlIllI.IIlllIIlIllIllIlIIll);
                            break;
                        }
                        case 3: {
                            GL11.glDisableClientState(32886);
                            lllllIlIIIlIlIIlllII.llIIlllIIlllIIllIllI();
                            break;
                        }
                        case 2: {
                            GL11.glDisableClientState(32885);
                            break;
                        }
                    }
                }
            }
        }
        liIllIIIllllIlllIllI.llIllIIIIIllIlIIIIlI();
    }
    
    static /* synthetic */ int[] llllIIIIlIIIlIlllIll() {
        final int[] llllIIIIlIIIlIlllIll = llIllIIlllllllllllll.llllIIIIlIIIlIlllIll;
        if (llllIIIIlIIIlIlllIll != null) {
            return llllIIIIlIIIlIlllIll;
        }
        final int[] llllIIIIlIIIlIlllIll2 = new int[IllIIlllIIIIlllIIlIl.values().length];
        try {
            llllIIIIlIIIlIlllIll2[IllIIlllIIIIlllIIlIl.IllIIlllIIIIlllIIlIl.ordinal()] = 6;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            llllIIIIlIIIlIlllIll2[IllIIlllIIIIlllIIlIl.llIllIIIIIllIlIIIIlI.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError2) {}
        try {
            llllIIIIlIIIlIlllIll2[IllIIlllIIIIlllIIlIl.IlIlIIIllIllIIIIIllI.ordinal()] = 5;
        }
        catch (NoSuchFieldError noSuchFieldError3) {}
        try {
            llllIIIIlIIIlIlllIll2[IllIIlllIIIIlllIIlIl.IlIlIlIlIlllllllllIl.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError4) {}
        try {
            llllIIIIlIIIlIlllIll2[IllIIlllIIIIlllIIlIl.llllIIIlIlllIlIIIIIl.ordinal()] = 7;
        }
        catch (NoSuchFieldError noSuchFieldError5) {}
        try {
            llllIIIIlIIIlIlllIll2[IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError6) {}
        try {
            llllIIIIlIIIlIlllIll2[IllIIlllIIIIlllIIlIl.IlIIIlIlIIIllIlIlIIl.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError7) {}
        return llIllIIlllllllllllll.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll2;
    }
}
