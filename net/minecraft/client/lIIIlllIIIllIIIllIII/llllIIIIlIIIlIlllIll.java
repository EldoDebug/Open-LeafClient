package net.minecraft.client.lIIIlllIIIllIIIllIII;

import java.nio.*;
import org.lwjgl.opengl.*;
import org.lwjgl.util.glu.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.llllIIIIlIIIlIlllIll.*;
import net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.*;

public class llllIIIIlIIIlIlllIll
{
    private static final IntBuffer llllIIIIlIIIlIlllIll;
    private static final FloatBuffer IlIlIlIlIlllllllllIl;
    private static final FloatBuffer llIllIIIIIllIlIIIIlI;
    private static final FloatBuffer IlIIIlIlIIIllIlIlIIl;
    private static e IlIlIIIllIllIIIIIllI;
    private static float IllIIlllIIIIlllIIlIl;
    private static float llllIIIlIlllIlIIIIIl;
    private static float lIIIIlIIIIIlllIllIII;
    private static float lIIIlllIIIllIIIllIII;
    private static float llIIlIIIlIIIllIlIIIl;
    
    static {
        llllIIIIlIIIlIlllIll = llIIIlIlIllIIlIlIlII.IlIIIlIlIIIllIlIlIIl(16);
        IlIlIlIlIlllllllllIl = llIIIlIlIllIIlIlIlII.IlIlIIIllIllIIIIIllI(16);
        llIllIIIIIllIlIIIIlI = llIIIlIlIllIIlIlIlII.IlIlIIIllIllIIIIIllI(16);
        IlIIIlIlIIIllIlIlIIl = llIIIlIlIllIIlIlIlII.IlIlIIIllIllIIIIIllI(3);
        net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI = new e(0.0, 0.0, 0.0);
    }
    
    public static void llllIIIIlIIIlIlllIll(final net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final boolean b) {
        lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(2982, llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl);
        lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(2983, llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI);
        GL11.glGetInteger(2978, llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll);
        GLU.gluUnProject((float)((llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.get(0) + llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.get(2)) / 2), (float)((llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.get(1) + llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.get(3)) / 2), 0.0f, llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl, llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI, llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll, llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl);
        llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI = new e(llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl.get(0), llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl.get(1), llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl.get(2));
        final int n = b ? 1 : 0;
        final float llllllIllIllIlIllllI = llllIIIIlIIIlIlllIll.llllllIllIllIlIllllI;
        final float iIlIIIIIllIlIIIlIIll = llllIIIIlIIIlIlllIll.IIlIIIIIllIlIIIlIIll;
        llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl = llIllIIlllllllllllll.IlIlIlIlIlllllllllIl(iIlIIIIIllIlIIIlIIll * 3.1415927f / 180.0f) * (1 - n * 2);
        llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII = llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(iIlIIIIIllIlIIIlIIll * 3.1415927f / 180.0f) * (1 - n * 2);
        llllIIIIlIIIlIlllIll.lIIIlllIIIllIIIllIII = -llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII * llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(llllllIllIllIlIllllI * 3.1415927f / 180.0f) * (1 - n * 2);
        llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl = llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl * llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(llllllIllIllIlIllllI * 3.1415927f / 180.0f) * (1 - n * 2);
        llllIIIIlIIIlIlllIll.llllIIIlIlllIlIIIIIl = llIllIIlllllllllllll.IlIlIlIlIlllllllllIl(llllllIllIllIlIllllI * 3.1415927f / 180.0f);
    }
    
    public static e llllIIIIlIIIlIlllIll(final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI, final double n) {
        return new e(llIllIIIIIllIlIIIIlI.IIlIIIIlllIlllllIlII + (llIllIIIIIllIlIIIIlI.IIlllIlIIllIlIlIlIIl - llIllIIIIIllIlIIIIlI.IIlIIIIlllIlllllIlII) * n + net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll, llIllIIIIIllIlIIIIlI.IIIlIIlIIIIlllIlllII + (llIllIIIIIllIlIIIIlI.llIIIlIlIllIIlIlIlII - llIllIIIIIllIlIIIIlI.IIIlIIlIIIIlllIlllII) * n + net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl, llIllIIIIIllIlIIIIlI.IlIlIllllllllIIIIlII + (llIllIIIIIllIlIIIIlI.lllllIlIIIlIlIIlllII - llIllIIIIIllIlIIIIlI.IlIlIllllllllIIIIlII) * n + net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI);
    }
    
    public static net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI, final float n) {
        final e llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI, n);
        final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl = new IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll);
        final llIIlIIIlIIIllIlIIIl ilIlIlIlIlllllllllIl2 = illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl);
        net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll2 = ilIlIlIlIlllllllllIl2.llIllIIIIIllIlIIIIlI();
        if (llllIIIIlIIIlIlllIll2.IllIIlllIIIIlllIIlIl().llllIIIIlIIIlIlllIll()) {
            float n2 = 0.0f;
            if (ilIlIlIlIlllllllllIl2.llIllIIIIIllIlIIIIlI() instanceof IlIIlllIIlIlllllIIlI) {
                n2 = IlIIlllIIlIlllllIIlI.IlIlIIIllIllIIIIIllI((int)ilIlIlIlIlllllllllIl2.llllIIIIlIIIlIlllIll(IlIIlllIIlIlllllIIlI.IIllllIIIlIIIIIIllIl)) - 0.11111111f;
            }
            if (llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl >= ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII() + 1 - n2) {
                llllIIIIlIIIlIlllIll2 = illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll()).llIllIIIIIllIlIIIIlI();
            }
        }
        return llllIIIIlIIIlIlllIll2;
    }
    
    public static e llllIIIIlIIIlIlllIll() {
        return net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI;
    }
    
    public static float IlIlIlIlIlllllllllIl() {
        return net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl;
    }
    
    public static float llIllIIIIIllIlIIIIlI() {
        return net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIlIlllIlIIIIIl;
    }
    
    public static float IlIIIlIlIIIllIlIlIIl() {
        return net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII;
    }
    
    public static float IlIlIIIllIllIIIIIllI() {
        return net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lIIIlllIIIllIIIllIII;
    }
    
    public static float IllIIlllIIIIlllIIlIl() {
        return net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl;
    }
}
