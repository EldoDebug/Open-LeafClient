package net.minecraft.client.lIIIlllIIIllIIIllIII;

import java.nio.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import org.lwjgl.opengl.*;

public class lIlIIlllIIlIIlIlllIl
{
    private static FloatBuffer llllIIIIlIIIlIlllIll;
    private static final e IlIlIlIlIlllllllllIl;
    private static final e llIllIIIIIllIlIIIIlI;
    
    static {
        lIlIIlllIIlIIlIlllIl.llllIIIIlIIIlIlllIll = llIIIlIlIllIIlIlIlII.IlIlIIIllIllIIIIIllI(16);
        IlIlIlIlIlllllllllIl = new e(0.20000000298023224, 1.0, -0.699999988079071).llllIIIIlIIIlIlllIll();
        llIllIIIIIllIlIIIIlI = new e(-0.20000000298023224, 1.0, 0.699999988079071).llllIIIIlIIIlIlllIll();
    }
    
    public static void llllIIIIlIIIlIlllIll() {
        lllllIlIIIlIlIIlllII.IllIIlllIIIIlllIIlIl();
        lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(0);
        lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(1);
        lllllIlIIIlIlIIlllII.lIIIIlIIIIIlllIllIII();
    }
    
    public static void IlIlIlIlIlllllllllIl() {
        lllllIlIIIlIlIIlllII.IlIlIIIllIllIIIIIllI();
        lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(0);
        lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(1);
        lllllIlIIIlIlIIlllII.llllIIIlIlllIlIIIIIl();
        lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(1032, 5634);
        final float n = 0.4f;
        final float n2 = 0.6f;
        final float n3 = 0.0f;
        GL11.glLight(16384, 4611, llllIIIIlIIIlIlllIll(lIlIIlllIIlIIlIlllIl.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll, lIlIIlllIIlIIlIlllIl.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl, lIlIIlllIIlIIlIlllIl.IlIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI, 0.0));
        GL11.glLight(16384, 4609, llllIIIIlIIIlIlllIll(n2, n2, n2, 1.0f));
        GL11.glLight(16384, 4608, llllIIIIlIIIlIlllIll(0.0f, 0.0f, 0.0f, 1.0f));
        GL11.glLight(16384, 4610, llllIIIIlIIIlIlllIll(n3, n3, n3, 1.0f));
        GL11.glLight(16385, 4611, llllIIIIlIIIlIlllIll(lIlIIlllIIlIIlIlllIl.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll, lIlIIlllIIlIIlIlllIl.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl, lIlIIlllIIlIIlIlllIl.llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI, 0.0));
        GL11.glLight(16385, 4609, llllIIIIlIIIlIlllIll(n2, n2, n2, 1.0f));
        GL11.glLight(16385, 4608, llllIIIIlIIIlIlllIll(0.0f, 0.0f, 0.0f, 1.0f));
        GL11.glLight(16385, 4610, llllIIIIlIIIlIlllIll(n3, n3, n3, 1.0f));
        lllllIlIIIlIlIIlllII.llIIlIIIlIIIllIlIIIl(7424);
        GL11.glLightModel(2899, llllIIIIlIIIlIlllIll(n, n, n, 1.0f));
    }
    
    private static FloatBuffer llllIIIIlIIIlIlllIll(final double n, final double n2, final double n3, final double n4) {
        return llllIIIIlIIIlIlllIll((float)n, (float)n2, (float)n3, (float)n4);
    }
    
    private static FloatBuffer llllIIIIlIIIlIlllIll(final float n, final float n2, final float n3, final float n4) {
        lIlIIlllIIlIIlIlllIl.llllIIIIlIIIlIlllIll.clear();
        lIlIIlllIIlIIlIlllIl.llllIIIIlIIIlIlllIll.put(n).put(n2).put(n3).put(n4);
        lIlIIlllIIlIIlIlllIl.llllIIIIlIIIlIlllIll.flip();
        return lIlIIlllIIlIIlIlllIl.llllIIIIlIIIlIlllIll;
    }
    
    public static void llIllIIIIIllIlIIIIlI() {
        lllllIlIIIlIlIIlllII.lllllIlIIIlIlIIlllII();
        lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(-30.0f, 0.0f, 1.0f, 0.0f);
        lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(165.0f, 1.0f, 0.0f, 0.0f);
        IlIlIlIlIlllllllllIl();
        lllllIlIIIlIlIIlllII.lIllllllIIllIlIlIlII();
    }
}
