package net.optifine;

import net.minecraft.client.*;
import net.minecraft.client.llIllIlIIIIllIlIIllI.*;
import net.minecraft.IlIllIlIlIIIlIlIlIII.*;
import net.optifine.util.*;
import org.lwjgl.opengl.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.*;
import net.minecraft.client.llIllIIIIIllIlIIIIlI.*;

public class IllIllIlllIllllIIllI
{
    private static Minecraft lIIIlllIIIllIIIllIII;
    private static llllIIIIlIIIlIlllIll llIIlIIIlIIIllIlIIIl;
    private static IlIIIlIlIIIllIlIlIIl llIllIlIIIIllIlIIllI;
    public static boolean llllIIIIlIIIlIlllIll;
    public static llIlIIIIIlIIlIlIIlll IlIlIlIlIlllllllllIl;
    public static llIlIIIIIlIIlIlIIlll llIllIIIIIllIlIIIIlI;
    public static llIlIIIIIlIIlIlIIlll IlIIIlIlIIIllIlIlIIl;
    public static llIlIIIIIlIIlIlIIlll IlIlIIIllIllIIIIIllI;
    public static llIlIIIIIlIIlIlIIlll IllIIlllIIIIlllIIlIl;
    public static llIlIIIIIlIIlIlIIlll llllIIIlIlllIlIIIIIl;
    public static llIlIIIIIlIIlIlIIlll lIIIIlIIIIIlllIllIII;
    private static long[] lIlIlIIIllIIllIIIllI;
    private static long[] IlIlIIIllIIllIlllllI;
    private static long[] IIIIlllIIIIIIlIIIlll;
    private static long[] llllIIllllIlIlIIIIll;
    private static long[] IlIllIlIlIIIlIlIlIII;
    private static long[] IIlllIIlIllIllIlIIll;
    private static long[] lllIIIIlllllIlIIllIl;
    private static long[] IlIlIIIIIIlllIlIllIl;
    private static boolean[] IIllIIllIIIlIlIIIIlI;
    private static int IIIlIIIlIlIIlllIIlll;
    private static long IlIlIIIlIIlIlIIlllIl;
    private static long IlllllllIIIlIIIlIlII;
    
    static {
        IllIllIlllIllllIIllI.llllIIIIlIIIlIlllIll = false;
        IllIllIlllIllllIIllI.IlIlIlIlIlllllllllIl = new llIlIIIIIlIIlIlIIlll();
        IllIllIlllIllllIIllI.llIllIIIIIllIlIIIIlI = new llIlIIIIIlIIlIlIIlll();
        IllIllIlllIllllIIllI.IlIIIlIlIIIllIlIlIIl = new llIlIIIIIlIIlIlIIlll();
        IllIllIlllIllllIIllI.IlIlIIIllIllIIIIIllI = new llIlIIIIIlIIlIlIIlll();
        IllIllIlllIllllIIllI.IllIIlllIIIIlllIIlIl = new llIlIIIIIlIIlIlIIlll();
        IllIllIlllIllllIIllI.llllIIIlIlllIlIIIIIl = new llIlIIIIIlIIlIlIIlll();
        IllIllIlllIllllIIllI.lIIIIlIIIIIlllIllIII = new llIlIIIIIlIIlIlIIlll();
        IllIllIlllIllllIIllI.lIlIlIIIllIIllIIIllI = new long[512];
        IllIllIlllIllllIIllI.IlIlIIIllIIllIlllllI = new long[512];
        IllIllIlllIllllIIllI.IIIIlllIIIIIIlIIIlll = new long[512];
        IllIllIlllIllllIIllI.llllIIllllIlIlIIIIll = new long[512];
        IllIllIlllIllllIIllI.IlIllIlIlIIIlIlIlIII = new long[512];
        IllIllIlllIllllIIllI.IIlllIIlIllIllIlIIll = new long[512];
        IllIllIlllIllllIIllI.lllIIIIlllllIlIIllIl = new long[512];
        IllIllIlllIllllIIllI.IlIlIIIIIIlllIlIllIl = new long[512];
        IllIllIlllIllllIIllI.IIllIIllIIIlIlIIIIlI = new boolean[512];
        IllIllIlllIllllIIllI.IIIlIIIlIlIIlllIIlll = 0;
        IllIllIlllIllllIIllI.IlIlIIIlIIlIlIIlllIl = -1L;
        IllIllIlllIllllIIllI.IlllllllIIIlIIIlIlII = 0L;
    }
    
    public static void llllIIIIlIIIlIlllIll() {
        if (IllIllIlllIllllIIllI.lIIIlllIIIllIIIllIII == null) {
            IllIllIlllIllllIIllI.lIIIlllIIIllIIIllIII = Minecraft.getMinecraft();
            IllIllIlllIllllIIllI.llIIlIIIlIIIllIlIIIl = IllIllIlllIllllIIllI.lIIIlllIIIllIIIllIII.IIIlIIIlIlIIlllIIlll;
            IllIllIlllIllllIIllI.llIllIlIIIIllIlIIllI = IllIllIlllIllllIIllI.lIIIlllIIIllIIIllIII.llIIIlIlIllIIlIlIlII;
        }
        if (IllIllIlllIllllIIllI.llIIlIIIlIIIllIlIIIl.IIIIIIIllllIlIIIIIII && (IllIllIlllIllllIIllI.llIIlIIIlIIIllIlIIIl.m || IllIllIlllIllllIIllI.llIIlIIIlIIIllIlIIIl.llIlllIlllllIIllIIII)) {
            IllIllIlllIllllIIllI.llllIIIIlIIIlIlllIll = true;
            final long nanoTime = System.nanoTime();
            if (IllIllIlllIllllIIllI.IlIlIIIlIIlIlIIlllIl == -1L) {
                IllIllIlllIllllIIllI.IlIlIIIlIIlIlIIlllIl = nanoTime;
            }
            else {
                final int n = IllIllIlllIllllIIllI.IIIlIIIlIlIIlllIIlll & IllIllIlllIllllIIllI.lIlIlIIIllIIllIIIllI.length - 1;
                ++IllIllIlllIllllIIllI.IIIlIIIlIlIIlllIIlll;
                final boolean ilIIIlIlIIIllIlIlIIl = IIlllIlIIllIlIlIlIIl.IlIIIlIlIIIllIlIlIIl();
                IllIllIlllIllllIIllI.lIlIlIIIllIIllIIIllI[n] = nanoTime - IllIllIlllIllllIIllI.IlIlIIIlIIlIlIIlllIl - IllIllIlllIllllIIllI.IlllllllIIIlIIIlIlII;
                IllIllIlllIllllIIllI.IlIlIIIllIIllIlllllI[n] = IllIllIlllIllllIIllI.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl;
                IllIllIlllIllllIIllI.IIIIlllIIIIIIlIIIlll[n] = IllIllIlllIllllIIllI.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl;
                IllIllIlllIllllIIllI.llllIIllllIlIlIIIIll[n] = IllIllIlllIllllIIllI.IlIIIlIlIIIllIlIlIIl.IlIlIlIlIlllllllllIl;
                IllIllIlllIllllIIllI.IlIllIlIlIIIlIlIlIII[n] = IllIllIlllIllllIIllI.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl;
                IllIllIlllIllllIIllI.IIlllIIlIllIllIlIIll[n] = IllIllIlllIllllIIllI.IllIIlllIIIIlllIIlIl.IlIlIlIlIlllllllllIl;
                IllIllIlllIllllIIllI.lllIIIIlllllIlIIllIl[n] = IllIllIlllIllllIIllI.llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl;
                IllIllIlllIllllIIllI.IlIlIIIIIIlllIlIllIl[n] = IllIllIlllIllllIIllI.lIIIIlIIIIIlllIllIII.IlIlIlIlIlllllllllIl;
                IllIllIlllIllllIIllI.IIllIIllIIIlIlIIIIlI[n] = ilIIIlIlIIIllIlIlIIl;
                IllIllIlllIllllIIllI.IlIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI();
                IllIllIlllIllllIIllI.llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI();
                IllIllIlllIllllIIllI.IllIIlllIIIIlllIIlIl.llIllIIIIIllIlIIIIlI();
                IllIllIlllIllllIIllI.IlIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI();
                IllIllIlllIllllIIllI.IlIIIlIlIIIllIlIlIIl.llIllIIIIIllIlIIIIlI();
                IllIllIlllIllllIIllI.llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI();
                IllIllIlllIllllIIllI.lIIIIlIIIIIlllIllIII.llIllIIIIIllIlIIIIlI();
                IllIllIlllIllllIIllI.IlIlIIIlIIlIlIIlllIl = System.nanoTime();
            }
        }
        else {
            IllIllIlllIllllIIllI.llllIIIIlIIIlIlllIll = false;
            IllIllIlllIllllIIllI.IlIlIIIlIIlIlIIlllIl = -1L;
        }
    }
    
    public static void llllIIIIlIIIlIlllIll(final g g) {
        if (IllIllIlllIllllIIllI.llIIlIIIlIIIllIlIIIl != null && (IllIllIlllIllllIIllI.llIIlIIIlIIIllIlIIIl.m || IllIllIlllIllllIIllI.llIIlIIIlIIIllIlIIIl.llIlllIlllllIIllIIII)) {
            final long nanoTime = System.nanoTime();
            lllllIlIIIlIlIIlllII.llIllIlIIIIllIlIIllI(256);
            lllllIlIIIlIlIIlllII.lIlIlIIIllIIllIIIllI(5889);
            lllllIlIIIlIlIIlllII.lllllIlIIIlIlIIlllII();
            lllllIlIIIlIlIIlllII.llllIIIlIlllIlIIIIIl();
            lllllIlIIIlIlIIlllII.llIIIlIlIllIIlIlIlII();
            lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(0.0, IllIllIlllIllllIIllI.lIIIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl, IllIllIlllIllllIIllI.lIIIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI, 0.0, 1000.0, 3000.0);
            lllllIlIIIlIlIIlllII.lIlIlIIIllIIllIIIllI(5888);
            lllllIlIIIlIlIIlllII.lllllIlIIIlIlIIlllII();
            lllllIlIIIlIlIIlllII.llIIIlIlIllIIlIlIlII();
            lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(0.0f, 0.0f, -2000.0f);
            GL11.glLineWidth(1.0f);
            lllllIlIIIlIlIIlllII.IlIlIIIlIIlIlIIlllIl();
            final IIlllIIlllIIIlIlllII llllIIIIlIIIlIlllIll = IIlllIIlllIIIlIlllII.llllIIIIlIIIlIlllIll();
            final lIIllIIIllllIlllIllI llIllIIIIIllIlIIIIlI = llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI();
            llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(1, net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII);
            for (int i = 0; i < IllIllIlllIllllIIllI.lIlIlIIIllIIllIIIllI.length; ++i) {
                int n = (i - IllIllIlllIllllIIllI.IIIlIIIlIlIIlllIIlll & IllIllIlllIllllIIllI.lIlIlIIIllIIllIIIllI.length - 1) * 100 / IllIllIlllIllllIIllI.lIlIlIIIllIIllIIIllI.length;
                n += 155;
                final float n2 = (float)IllIllIlllIllllIIllI.lIIIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI;
                if (IllIllIlllIllllIIllI.IIllIIllIIIlIlIIIIlI[i]) {
                    llllIIIIlIIIlIlllIll(i, IllIllIlllIllllIIllI.lIlIlIIIllIIllIIIllI[i], n, n / 2, 0, n2, llIllIIIIIllIlIIIIlI);
                }
                else {
                    llllIIIIlIIIlIlllIll(i, IllIllIlllIllllIIllI.lIlIlIIIllIIllIIIllI[i], n, n, n, n2, llIllIIIIIllIlIIIIlI);
                    final float n3 = n2 - llllIIIIlIIIlIlllIll(i, IllIllIlllIllllIIllI.IlIlIIIIIIlllIlIllIl[i], n / 2, n / 2, n / 2, n2, llIllIIIIIllIlIIIIlI);
                    final float n4 = n3 - llllIIIIlIIIlIlllIll(i, IllIllIlllIllllIIllI.lllIIIIlllllIlIIllIl[i], 0, n, 0, n3, llIllIIIIIllIlIIIIlI);
                    final float n5 = n4 - llllIIIIlIIIlIlllIll(i, IllIllIlllIllllIIllI.IIlllIIlIllIllIlIIll[i], n, n, 0, n4, llIllIIIIIllIlIIIIlI);
                    final float n6 = n5 - llllIIIIlIIIlIlllIll(i, IllIllIlllIllllIIllI.IlIllIlIlIIIlIlIlIII[i], n, 0, 0, n5, llIllIIIIIllIlIIIIlI);
                    final float n7 = n6 - llllIIIIlIIIlIlllIll(i, IllIllIlllIllllIIllI.llllIIllllIlIlIIIIll[i], n, 0, n, n6, llIllIIIIIllIlIIIIlI);
                    final float n8 = n7 - llllIIIIlIIIlIlllIll(i, IllIllIlllIllllIIllI.IIIIlllIIIIIIlIIIlll[i], 0, 0, n, n7, llIllIIIIIllIlIIIIlI);
                    final float n9 = n8 - llllIIIIlIIIlIlllIll(i, IllIllIlllIllllIIllI.IlIlIIIllIIllIlllllI[i], 0, n, n, n8, llIllIIIIIllIlIIIIlI);
                }
            }
            llllIIIIlIIIlIlllIll(0, IllIllIlllIllllIIllI.lIlIlIIIllIIllIIIllI.length, 33333333L, 196, 196, 196, (float)IllIllIlllIllllIIllI.lIIIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI, llIllIIIIIllIlIIIIlI);
            llllIIIIlIIIlIlllIll(0, IllIllIlllIllllIIllI.lIlIlIIIllIIllIIIllI.length, 16666666L, 196, 196, 196, (float)IllIllIlllIllllIIllI.lIIIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI, llIllIIIIIllIlIIIIlI);
            llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl();
            lllllIlIIIlIlIIlllII.IIIlIIIlIlIIlllIIlll();
            final int n10 = IllIllIlllIllllIIllI.lIIIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI - 80;
            final int n11 = IllIllIlllIllllIIllI.lIIIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI - 160;
            IllIllIlllIllllIIllI.lIIIlllIIIllIIIllIII.lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll("30", 2, n11 + 1, -8947849);
            IllIllIlllIllllIIllI.lIIIlllIIIllIIIllIII.lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll("30", 1, n11, -3881788);
            IllIllIlllIllllIIllI.lIIIlllIIIllIIIllIII.lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll("60", 2, n10 + 1, -8947849);
            IllIllIlllIllllIIllI.lIIIlllIIIllIIIllIII.lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll("60", 1, n10, -3881788);
            lllllIlIIIlIlIIlllII.lIlIlIIIllIIllIIIllI(5889);
            lllllIlIIIlIlIIlllII.lIllllllIIllIlIlIlII();
            lllllIlIIIlIlIIlllII.lIlIlIIIllIIllIIIllI(5888);
            lllllIlIIIlIlIIlllII.lIllllllIIllIlIlIlII();
            lllllIlIIIlIlIIlllII.IIIlIIIlIlIIlllIIlll();
            final float llllIIIIlIIIlIlllIll2 = net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(1.0f - (float)((System.currentTimeMillis() - IIlllIlIIllIlIlIlIIl.IlIlIlIlIlllllllllIl()) / 1000.0), 0.0f, 1.0f);
            final int n12 = (int)(170.0f + llllIIIIlIIIlIlllIll2 * 85.0f) << 16 | (int)(100.0f + llllIIIIlIIIlIlllIll2 * 55.0f) << 8 | (int)(10.0f + llllIIIIlIIIlIlllIll2 * 10.0f);
            final int n13 = 512 / g.IlIlIIIllIllIIIIIllI() + 2;
            final int n14 = IllIllIlllIllllIIllI.lIIIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI / g.IlIlIIIllIllIIIIIllI() - 8;
            final llIIIlIlIllIIlIlIlII lllIIIIlllllIlIIllIl = IllIllIlllIllllIIllI.lIIIlllIIIllIIIllIII.lllIIIIlllllIlIIllIl;
            net.minecraft.client.llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(n13 - 1, n14 - 1, n13 + 50, n14 + 10, -1605349296);
            IllIllIlllIllllIIllI.lIIIlllIIIllIIIllIII.lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll(" " + IIlllIlIIllIlIlIlIIl.IlIlIIIllIllIIIIIllI() + " MB/s", n13, n14, n12);
            IllIllIlllIllllIIllI.IlllllllIIIlIIIlIlII = System.nanoTime() - nanoTime;
        }
    }
    
    private static long llllIIIIlIIIlIlllIll(final int n, final long n2, final int n3, final int n4, final int n5, final float n6, final lIIllIIIllllIlllIllI liIllIIIllllIlllIllI) {
        final long n7 = n2 / 200000L;
        if (n7 < 3L) {
            return 0L;
        }
        liIllIIIllllIlllIllI.IlIlIlIlIlllllllllIl(n + 0.5f, n6 - n7 + 0.5f, 0.0).IlIlIlIlIlllllllllIl(n3, n4, n5, 255).IlIlIIIllIllIIIIIllI();
        liIllIIIllllIlllIllI.IlIlIlIlIlllllllllIl(n + 0.5f, n6 + 0.5f, 0.0).IlIlIlIlIlllllllllIl(n3, n4, n5, 255).IlIlIIIllIllIIIIIllI();
        return n7;
    }
    
    private static long llllIIIIlIIIlIlllIll(final int n, final int n2, final long n3, final int n4, final int n5, final int n6, final float n7, final lIIllIIIllllIlllIllI liIllIIIllllIlllIllI) {
        final long n8 = n3 / 200000L;
        if (n8 < 3L) {
            return 0L;
        }
        liIllIIIllllIlllIllI.IlIlIlIlIlllllllllIl(n + 0.5f, n7 - n8 + 0.5f, 0.0).IlIlIlIlIlllllllllIl(n4, n5, n6, 255).IlIlIIIllIllIIIIIllI();
        liIllIIIllllIlllIllI.IlIlIlIlIlllllllllIl(n2 + 0.5f, n7 - n8 + 0.5f, 0.0).IlIlIlIlIlllllllllIl(n4, n5, n6, 255).IlIlIIIllIllIIIIIllI();
        return n8;
    }
    
    public static boolean IlIlIlIlIlllllllllIl() {
        return IllIllIlllIllllIIllI.llllIIIIlIIIlIlllIll;
    }
}
