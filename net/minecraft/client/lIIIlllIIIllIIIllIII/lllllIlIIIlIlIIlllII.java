package net.minecraft.client.lIIIlllIIIllIIIllIII;

import net.optifine.util.*;
import net.optifine.lIIIlllIIIllIIIllIII.*;
import net.minecraft.IIllIIllIIIlIlIIIIlI.*;
import net.optifine.*;
import java.nio.*;
import org.lwjgl.opengl.*;

public class lllllIlIIIlIlIIlllII
{
    private static lIllllllIIllIlIlIlII IlIlIlIlIlllllllllIl;
    private static IIlllIIIlIlllIIlllII llIllIIIIIllIlIIIIlI;
    private static IIlllIIIlIlllIIlllII[] IlIIIlIlIIIllIlIlIIl;
    private static IIIIIllIIIIlIIIIllIl IlIlIIIllIllIIIIIllI;
    private static llIIlllIIlllIIllIllI IllIIlllIIIIlllIIlIl;
    private static IIllllIIIlIIIIIIllIl llllIIIlIlllIlIIIIIl;
    private static IlllIIIIlIIIlIlIlIIl lIIIIlIIIIIlllIllIII;
    private static IIIIIIIIIlllIllIlIlI lIIIlllIIIllIIIllIII;
    private static lllIllIIIllllllIllll llIIlIIIlIIIllIlIIIl;
    private static IIIllllllIllIIIlllIl llIllIlIIIIllIlIIllI;
    private static IllIllIlllIllllIIllI lIlIlIIIllIIllIIIllI;
    private static IIlIIIIIllIlIIIlIIll IlIlIIIllIIllIlllllI;
    private static IIlIlIlIIlIllIIIIIIl IIIIlllIIIIIIlIIIlll;
    private static IIlllIIIlIlllIIlllII llllIIllllIlIlIIIIll;
    private static int IlIllIlIlIIIlIlIlIII;
    private static llIlIIIIIlIIlIlIIlll[] IIlllIIlIllIllIlIIll;
    private static int lllIIIIlllllIlIIllIl;
    private static IIlllIIIlIlllIIlllII IlIlIIIIIIlllIlIllIl;
    private static IlIIIlIIIllllIlIlIlI IIllIIllIIIlIlIIIIlI;
    private static llllllIllIllIlIllllI IIIlIIIlIlIIlllIIlll;
    public static boolean llllIIIIlIIIlIlllIll;
    private static IlllllllIIIlIIIlIlII IlIlIIIlIIlIlIIlllIl;
    private static IlIlIIIllIllIIIIIllI IlllllllIIIlIIIlIlII;
    private static IlllllllIIIlIIIlIlII IIlIIIIlllIlllllIlII;
    private static IllIIlllIIIIlllIIlIl IIIlIIlIIIIlllIlllII;
    private static boolean IlIlIllllllllIIIIlII;
    private static volatile /* synthetic */ int[] IIlllIlIIllIlIlIlIIl;
    
    static {
        lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl = new lIllllllIIllIlIlIlII(null);
        lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI = new IIlllIIIlIlllIIlllII(2896);
        lllllIlIIIlIlIIlllII.IlIIIlIlIIIllIlIlIIl = new IIlllIIIlIlllIIlllII[8];
        lllllIlIIIlIlIIlllII.IlIlIIIllIllIIIIIllI = new IIIIIllIIIIlIIIIllIl(null);
        lllllIlIIIlIlIIlllII.IllIIlllIIIIlllIIlIl = new llIIlllIIlllIIllIllI(null);
        lllllIlIIIlIlIIlllII.llllIIIlIlllIlIIIIIl = new IIllllIIIlIIIIIIllIl(null);
        lllllIlIIIlIlIIlllII.lIIIIlIIIIIlllIllIII = new IlllIIIIlIIIlIlIlIIl(null);
        lllllIlIIIlIlIIlllII.lIIIlllIIIllIIIllIII = new IIIIIIIIIlllIllIlIlI(null);
        lllllIlIIIlIlIIlllII.llIIlIIIlIIIllIlIIIl = new lllIllIIIllllllIllll(null);
        lllllIlIIIlIlIIlllII.llIllIlIIIIllIlIIllI = new IIIllllllIllIIIlllIl(null);
        lllllIlIIIlIlIIlllII.lIlIlIIIllIIllIIIllI = new IllIllIlllIllllIIllI(null);
        lllllIlIIIlIlIIlllII.IlIlIIIllIIllIlllllI = new IIlIIIIIllIlIIIlIIll(null);
        lllllIlIIIlIlIIlllII.IIIIlllIIIIIIlIIIlll = new IIlIlIlIIlIllIIIIIIl(null);
        lllllIlIIIlIlIIlllII.llllIIllllIlIlIIIIll = new IIlllIIIlIlllIIlllII(2977);
        lllllIlIIIlIlIIlllII.IlIllIlIlIIIlIlIlIII = 0;
        lllllIlIIIlIlIIlllII.IIlllIIlIllIllIlIIll = new llIlIIIIIlIIlIlIIlll[32];
        lllllIlIIIlIlIIlllII.lllIIIIlllllIlIIllIl = 7425;
        lllllIlIIIlIlIIlllII.IlIlIIIIIIlllIlIllIl = new IIlllIIIlIlllIIlllII(32826);
        lllllIlIIIlIlIIlllII.IIllIIllIIIlIlIIIIlI = new IlIIIlIIIllllIlIlIlI(null);
        lllllIlIIIlIlIIlllII.IIIlIIIlIlIIlllIIlll = new llllllIllIllIlIllllI();
        lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll = true;
        lllllIlIIIlIlIIlllII.IlIlIIIlIIlIlIIlllIl = new IlllllllIIIlIIIlIlII();
        lllllIlIIIlIlIIlllII.IlllllllIIIlIIIlIlII = new IlIlIIIllIllIIIIIllI();
        lllllIlIIIlIlIIlllII.IIlIIIIlllIlllllIlII = new IlllllllIIIlIIIlIlII();
        lllllIlIIIlIlIIlllII.IIIlIIlIIIIlllIlllII = new IllIIlllIIIIlllIIlIl();
        lllllIlIIIlIlIIlllII.IlIlIllllllllIIIIlII = false;
        for (int i = 0; i < 8; ++i) {
            lllllIlIIIlIlIIlllII.IlIIIlIlIIIllIlIlIIl[i] = new IIlllIIIlIlllIIlllII(16384 + i);
        }
        for (int j = 0; j < lllllIlIIIlIlIIlllII.IIlllIIlIllIllIlIIll.length; ++j) {
            lllllIlIIIlIlIIlllII.IIlllIIlIllIllIlIIll[j] = new llIlIIIIIlIIlIlIIlll(null);
        }
    }
    
    public static void llllIIIIlIIIlIlllIll() {
        GL11.glPushAttrib(8256);
    }
    
    public static void IlIlIlIlIlllllllllIl() {
        GL11.glPopAttrib();
    }
    
    public static void llIllIIIIIllIlIIIIlI() {
        if (lllllIlIIIlIlIIlllII.IlIlIIIlIIlIlIIlllIl.llIllIIIIIllIlIIIIlI()) {
            lllllIlIIIlIlIIlllII.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl();
        }
        else {
            lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll();
        }
    }
    
    public static void IlIIIlIlIIIllIlIlIIl() {
        if (lllllIlIIIlIlIIlllII.IlIlIIIlIIlIlIIlllIl.llIllIIIIIllIlIIIIlI()) {
            lllllIlIIIlIlIIlllII.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll();
        }
        else {
            lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl();
        }
    }
    
    public static void llllIIIIlIIIlIlllIll(final int ilIlIlIlIlllllllllIl, final float llIllIIIIIllIlIIIIlI) {
        if (lllllIlIIIlIlIIlllII.IlIlIIIlIIlIlIIlllIl.llIllIIIIIllIlIIIIlI()) {
            lllllIlIIIlIlIIlllII.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl, llIllIIIIIllIlIIIIlI);
        }
        else if (ilIlIlIlIlllllllllIl != lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl || llIllIIIIIllIlIIIIlI != lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI) {
            GL11.glAlphaFunc(lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl, lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI);
        }
    }
    
    public static void IlIlIIIllIllIIIIIllI() {
        lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl();
    }
    
    public static void IllIIlllIIIIlllIIlIl() {
        lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll();
    }
    
    public static void llllIIIIlIIIlIlllIll(final int n) {
        lllllIlIIIlIlIIlllII.IlIIIlIlIIIllIlIlIIl[n].IlIlIlIlIlllllllllIl();
    }
    
    public static void IlIlIlIlIlllllllllIl(final int n) {
        lllllIlIIIlIlIIlllII.IlIIIlIlIIIllIlIlIIl[n].llllIIIIlIIIlIlllIll();
    }
    
    public static void llllIIIlIlllIlIIIIIl() {
        lllllIlIIIlIlIIlllII.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl();
    }
    
    public static void lIIIIlIIIIIlllIllIII() {
        lllllIlIIIlIlIIlllII.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll();
    }
    
    public static void llllIIIIlIIIlIlllIll(final int ilIlIlIlIlllllllllIl, final int llIllIIIIIllIlIIIIlI) {
        if (ilIlIlIlIlllllllllIl != lllllIlIIIlIlIIlllII.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl || llIllIIIIIllIlIIIIlI != lllllIlIIIlIlIIlllII.IlIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI) {
            GL11.glColorMaterial(lllllIlIIIlIlIIlllII.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl, lllllIlIIIlIlIIlllII.IlIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI);
        }
    }
    
    public static void lIIIlllIIIllIIIllIII() {
        lllllIlIIIlIlIIlllII.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll();
    }
    
    public static void llIIlIIIlIIIllIlIIIl() {
        lllllIlIIIlIlIIlllII.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl();
    }
    
    public static void llIllIIIIIllIlIIIIlI(final int llIllIIIIIllIlIIIIlI) {
        if (llIllIIIIIllIlIIIIlI != lllllIlIIIlIlIIlllII.llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI) {
            GL11.glDepthFunc(lllllIlIIIlIlIIlllII.llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI);
        }
    }
    
    public static void llllIIIIlIIIlIlllIll(final boolean ilIlIlIlIlllllllllIl) {
        if (ilIlIlIlIlllllllllIl != lllllIlIIIlIlIIlllII.llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl) {
            GL11.glDepthMask(lllllIlIIIlIlIIlllII.llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl);
        }
    }
    
    public static void llIllIlIIIIllIlIIllI() {
        if (lllllIlIIIlIlIIlllII.IIlIIIIlllIlllllIlII.llIllIIIIIllIlIIIIlI()) {
            lllllIlIIIlIlIIlllII.IIIlIIlIIIIlllIlllII.IlIlIlIlIlllllllllIl();
        }
        else {
            lllllIlIIIlIlIIlllII.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll();
        }
    }
    
    public static void lIlIlIIIllIIllIIIllI() {
        if (lllllIlIIIlIlIIlllII.IIlIIIIlllIlllllIlII.llIllIIIIIllIlIIIIlI()) {
            lllllIlIIIlIlIIlllII.IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll();
        }
        else {
            lllllIlIIIlIlIIlllII.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl();
        }
    }
    
    public static void IlIlIlIlIlllllllllIl(final int n, final int n2) {
        if (lllllIlIIIlIlIIlllII.IIlIIIIlllIlllllIlII.llIllIIIIIllIlIIIIlI()) {
            lllllIlIIIlIlIIlllII.IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll(n, n2);
        }
        else if (n != lllllIlIIIlIlIIlllII.IllIIlllIIIIlllIIlIl.IlIlIlIlIlllllllllIl || n2 != lllllIlIIIlIlIIlllII.IllIIlllIIIIlllIIlIl.llIllIIIIIllIlIIIIlI || n != lllllIlIIIlIlIIlllII.IllIIlllIIIIlllIIlIl.IlIIIlIlIIIllIlIlIIl || n2 != lllllIlIIIlIlIIlllII.IllIIlllIIIIlllIIlIl.IlIlIIIllIllIIIIIllI) {
            lllllIlIIIlIlIIlllII.IllIIlllIIIIlllIIlIl.IlIlIlIlIlllllllllIl = n;
            lllllIlIIIlIlIIlllII.IllIIlllIIIIlllIIlIl.llIllIIIIIllIlIIIIlI = n2;
            lllllIlIIIlIlIIlllII.IllIIlllIIIIlllIIlIl.IlIIIlIlIIIllIlIlIIl = n;
            lllllIlIIIlIlIIlllII.IllIIlllIIIIlllIIlIl.IlIlIIIllIllIIIIIllI = n2;
            if (net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.b()) {
                net.optifine.shaders.llIIlllIIlllIIllIllI.aq.llllIIIIlIIIlIlllIll(n, n2, n, n2);
            }
            GL11.glBlendFunc(n, n2);
        }
    }
    
    public static void llllIIIIlIIIlIlllIll(final int ilIlIlIlIlllllllllIl, final int llIllIIIIIllIlIIIIlI, final int ilIIIlIlIIIllIlIlIIl, final int ilIlIIIllIllIIIIIllI) {
        if (lllllIlIIIlIlIIlllII.IIlIIIIlllIlllllIlII.llIllIIIIIllIlIIIIlI()) {
            lllllIlIIIlIlIIlllII.IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl, llIllIIIIIllIlIIIIlI, ilIIIlIlIIIllIlIlIIl, ilIlIIIllIllIIIIIllI);
        }
        else if (ilIlIlIlIlllllllllIl != lllllIlIIIlIlIIlllII.IllIIlllIIIIlllIIlIl.IlIlIlIlIlllllllllIl || llIllIIIIIllIlIIIIlI != lllllIlIIIlIlIIlllII.IllIIlllIIIIlllIIlIl.llIllIIIIIllIlIIIIlI || ilIIIlIlIIIllIlIlIIl != lllllIlIIIlIlIIlllII.IllIIlllIIIIlllIIlIl.IlIIIlIlIIIllIlIlIIl || ilIlIIIllIllIIIIIllI != lllllIlIIIlIlIIlllII.IllIIlllIIIIlllIIlIl.IlIlIIIllIllIIIIIllI) {
            lllllIlIIIlIlIIlllII.IllIIlllIIIIlllIIlIl.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
            lllllIlIIIlIlIIlllII.IllIIlllIIIIlllIIlIl.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
            lllllIlIIIlIlIIlllII.IllIIlllIIIIlllIIlIl.IlIIIlIlIIIllIlIlIIl = ilIIIlIlIIIllIlIlIIl;
            lllllIlIIIlIlIIlllII.IllIIlllIIIIlllIIlIl.IlIlIIIllIllIIIIIllI = ilIlIIIllIllIIIIIllI;
            if (net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.b()) {
                net.optifine.shaders.llIIlllIIlllIIllIllI.aq.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl, llIllIIIIIllIlIIIIlI, ilIIIlIlIIIllIlIlIIl, ilIlIIIllIllIIIIIllI);
            }
            lIIIIlIlIllllIIlIllI.llIllIIIIIllIlIIIIlI(ilIlIlIlIlllllllllIl, llIllIIIIIllIlIIIIlI, ilIIIlIlIIIllIlIlIIl, ilIlIIIllIllIIIIIllI);
        }
    }
    
    public static void IlIlIIIllIIllIlllllI() {
        lllllIlIIIlIlIIlllII.lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl();
    }
    
    public static void IIIIlllIIIIIIlIIIlll() {
        lllllIlIIIlIlIIlllII.lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll();
    }
    
    public static void IlIIIlIlIIIllIlIlIIl(final int ilIlIlIlIlllllllllIl) {
        if (ilIlIlIlIlllllllllIl != lllllIlIIIlIlIIlllII.lIIIIlIIIIIlllIllIII.IlIlIlIlIlllllllllIl) {
            GL11.glFogi(2917, lllllIlIIIlIlIIlllII.lIIIIlIIIIIlllIllIII.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl);
            if (net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.b()) {
                net.optifine.shaders.llIIlllIIlllIIllIllI.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl);
            }
        }
    }
    
    public static void llllIIIIlIIIlIlllIll(float llIllIIIIIllIlIIIIlI) {
        if (llIllIIIIIllIlIIIIlI < 0.0f) {
            llIllIIIIIllIlIIIIlI = 0.0f;
        }
        if (llIllIIIIIllIlIIIIlI != lllllIlIIIlIlIIlllII.lIIIIlIIIIIlllIllIII.llIllIIIIIllIlIIIIlI) {
            GL11.glFogf(2914, lllllIlIIIlIlIIlllII.lIIIIlIIIIIlllIllIII.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI);
            if (net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.b()) {
                net.optifine.shaders.llIIlllIIlllIIllIllI.llIllIIIIIllIlIIIIlI(llIllIIIIIllIlIIIIlI);
            }
        }
    }
    
    public static void IlIlIlIlIlllllllllIl(final float ilIIIlIlIIIllIlIlIIl) {
        if (ilIIIlIlIIIllIlIlIIl != lllllIlIIIlIlIIlllII.lIIIIlIIIIIlllIllIII.IlIIIlIlIIIllIlIlIIl) {
            GL11.glFogf(2915, lllllIlIIIlIlIIlllII.lIIIIlIIIIIlllIllIII.IlIIIlIlIIIllIlIlIIl = ilIIIlIlIIIllIlIlIIl);
        }
    }
    
    public static void llIllIIIIIllIlIIIIlI(final float ilIlIIIllIllIIIIIllI) {
        if (ilIlIIIllIllIIIIIllI != lllllIlIIIlIlIIlllII.lIIIIlIIIIIlllIllIII.IlIlIIIllIllIIIIIllI) {
            GL11.glFogf(2916, lllllIlIIIlIlIIlllII.lIIIIlIIIIIlllIllIII.IlIlIIIllIllIIIIIllI = ilIlIIIllIllIIIIIllI);
        }
    }
    
    public static void llllIIIIlIIIlIlllIll(final int n, final FloatBuffer floatBuffer) {
        GL11.glFog(n, floatBuffer);
    }
    
    public static void llIllIIIIIllIlIIIIlI(final int n, final int n2) {
        GL11.glFogi(n, n2);
    }
    
    public static void llllIIllllIlIlIIIIll() {
        lllllIlIIIlIlIIlllII.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl();
    }
    
    public static void IlIllIlIlIIIlIlIlIII() {
        lllllIlIIIlIlIIlllII.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll();
    }
    
    public static void IlIlIIIllIllIIIIIllI(final int ilIlIlIlIlllllllllIl) {
        if (ilIlIlIlIlllllllllIl != lllllIlIIIlIlIIlllII.lIIIlllIIIllIIIllIII.IlIlIlIlIlllllllllIl) {
            GL11.glCullFace(lllllIlIIIlIlIIlllII.lIIIlllIIIllIIIllIII.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl);
        }
    }
    
    public static void IIlllIIlIllIllIlIIll() {
        lllllIlIIIlIlIIlllII.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl();
    }
    
    public static void lllIIIIlllllIlIIllIl() {
        lllllIlIIIlIlIIlllII.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll();
    }
    
    public static void llllIIIIlIIIlIlllIll(final float llIllIIIIIllIlIIIIlI, final float ilIIIlIlIIIllIlIlIIl) {
        if (llIllIIIIIllIlIIIIlI != lllllIlIIIlIlIIlllII.llIIlIIIlIIIllIlIIIl.llIllIIIIIllIlIIIIlI || ilIIIlIlIIIllIlIlIIl != lllllIlIIIlIlIIlllII.llIIlIIIlIIIllIlIIIl.IlIIIlIlIIIllIlIlIIl) {
            GL11.glPolygonOffset(lllllIlIIIlIlIIlllII.llIIlIIIlIIIllIlIIIl.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI, lllllIlIIIlIlIIlllII.llIIlIIIlIIIllIlIIIl.IlIIIlIlIIIllIlIlIIl = ilIIIlIlIIIllIlIlIIl);
        }
    }
    
    public static void IlIlIIIIIIlllIlIllIl() {
        lllllIlIIIlIlIIlllII.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl();
    }
    
    public static void IIllIIllIIIlIlIIIIlI() {
        lllllIlIIIlIlIIlllII.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll();
    }
    
    public static void IllIIlllIIIIlllIIlIl(final int ilIlIlIlIlllllllllIl) {
        if (ilIlIlIlIlllllllllIl != lllllIlIIIlIlIIlllII.llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl) {
            GL11.glLogicOp(lllllIlIIIlIlIIlllII.llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl);
        }
    }
    
    public static void llllIIIIlIIIlIlllIll(final IllIllIIIIlIIlIlllII illIllIIIIlIIlIlllII) {
        llIllIIIIIllIlIIIIlI(illIllIIIIlIIlIlllII).llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl();
    }
    
    public static void IlIlIlIlIlllllllllIl(final IllIllIIIIlIIlIlllII illIllIIIIlIIlIlllII) {
        llIllIIIIIllIlIIIIlI(illIllIIIIlIIlIlllII).llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll();
    }
    
    public static void llllIIIIlIIIlIlllIll(final IllIllIIIIlIIlIlllII illIllIIIIlIIlIlllII, final int llIllIIIIIllIlIIIIlI) {
        final IlIllllIIlIIlIlIlIll llIllIIIIIllIlIIIIlI2 = llIllIIIIIllIlIIIIlI(illIllIIIIlIIlIlllII);
        if (llIllIIIIIllIlIIIIlI != llIllIIIIIllIlIIIIlI2.llIllIIIIIllIlIIIIlI) {
            llIllIIIIIllIlIIIIlI2.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
            GL11.glTexGeni(llIllIIIIIllIlIIIIlI2.IlIlIlIlIlllllllllIl, 9472, llIllIIIIIllIlIIIIlI);
        }
    }
    
    public static void llllIIIIlIIIlIlllIll(final IllIllIIIIlIIlIlllII illIllIIIIlIIlIlllII, final int n, final FloatBuffer floatBuffer) {
        GL11.glTexGen(llIllIIIIIllIlIIIIlI(illIllIIIIlIIlIlllII).IlIlIlIlIlllllllllIl, n, floatBuffer);
    }
    
    private static IlIllllIIlIIlIlIlIll llIllIIIIIllIlIIIIlI(final IllIllIIIIlIIlIlllII illIllIIIIlIIlIlllII) {
        switch (llIllIlIlIIIIIIIllII()[illIllIIIIlIIlIlllII.ordinal()]) {
            case 1: {
                return lllllIlIIIlIlIIlllII.lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll;
            }
            case 2: {
                return lllllIlIIIlIlIIlllII.lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl;
            }
            case 3: {
                return lllllIlIIIlIlIIlllII.lIlIlIIIllIIllIIIllI.llIllIIIIIllIlIIIIlI;
            }
            case 4: {
                return lllllIlIIIlIlIIlllII.lIlIlIIIllIIllIIIllI.IlIIIlIlIIIllIlIlIIl;
            }
            default: {
                return lllllIlIIIlIlIIlllII.lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll;
            }
        }
    }
    
    public static void llllIIIlIlllIlIIIIIl(final int n) {
        if (lllllIlIIIlIlIIlllII.IlIllIlIlIIIlIlIlIII != n - lIIIIlIlIllllIIlIllI.IIlllIIlIllIllIlIIll) {
            lllllIlIIIlIlIIlllII.IlIllIlIlIIIlIlIlIII = n - lIIIIlIlIllllIIlIllI.IIlllIIlIllIllIlIIll;
            lIIIIlIlIllllIIlIllI.llIllIlIIIIllIlIIllI(n);
        }
    }
    
    public static void IIIlIIIlIlIIlllIIlll() {
        lllllIlIIIlIlIIlllII.IIlllIIlIllIllIlIIll[lllllIlIIIlIlIIlllII.IlIllIlIlIIIlIlIlIII].llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl();
    }
    
    public static void IlIlIIIlIIlIlIIlllIl() {
        lllllIlIIIlIlIIlllII.IIlllIIlIllIllIlIIll[lllllIlIIIlIlIIlllII.IlIllIlIlIIIlIlIlIII].llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll();
    }
    
    public static int IlllllllIIIlIIIlIlII() {
        return GL11.glGenTextures();
    }
    
    public static void lIIIIlIIIIIlllIllIII(final int n) {
        if (n != 0) {
            GL11.glDeleteTextures(n);
            llIlIIIIIlIIlIlIIlll[] iIlllIIlIllIllIlIIll;
            for (int length = (iIlllIIlIllIllIlIIll = lllllIlIIIlIlIIlllII.IIlllIIlIllIllIlIIll).length, i = 0; i < length; ++i) {
                final llIlIIIIIlIIlIlIIlll llIlIIIIIlIIlIlIIlll = iIlllIIlIllIllIlIIll[i];
                if (llIlIIIIIlIIlIlIIlll.IlIlIlIlIlllllllllIl == n) {
                    llIlIIIIIlIIlIlIIlll.IlIlIlIlIlllllllllIl = 0;
                }
            }
        }
    }
    
    public static void lIIIlllIIIllIIIllIII(final int ilIlIlIlIlllllllllIl) {
        if (ilIlIlIlIlllllllllIl != lllllIlIIIlIlIIlllII.IIlllIIlIllIllIlIIll[lllllIlIIIlIlIIlllII.IlIllIlIlIIIlIlIlIII].IlIlIlIlIlllllllllIl) {
            GL11.glBindTexture(3553, lllllIlIIIlIlIIlllII.IIlllIIlIllIllIlIIll[lllllIlIIIlIlIIlllII.IlIllIlIlIIIlIlIlIII].IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl);
            if (llIIIllIlIllIllIIIIl.llllIIIIlIIIlIlllIll()) {
                llIIIllIlIllIllIIIIl.llIllIIIIIllIlIIIIlI(ilIlIlIlIlllllllllIl);
            }
        }
    }
    
    public static void IIlIIIIlllIlllllIlII() {
        lllllIlIIIlIlIIlllII.llllIIllllIlIlIIIIll.IlIlIlIlIlllllllllIl();
    }
    
    public static void IIIlIIlIIIIlllIlllII() {
        lllllIlIIIlIlIIlllII.llllIIllllIlIlIIIIll.llllIIIIlIIIlIlllIll();
    }
    
    public static void llIIlIIIlIIIllIlIIIl(final int lllIIIIlllllIlIIllIl) {
        if (lllIIIIlllllIlIIllIl != lllllIlIIIlIlIIlllII.lllIIIIlllllIlIIllIl) {
            GL11.glShadeModel(lllllIlIIIlIlIIlllII.lllIIIIlllllIlIIllIl = lllIIIIlllllIlIIllIl);
        }
    }
    
    public static void IlIlIllllllllIIIIlII() {
        lllllIlIIIlIlIIlllII.IlIlIIIIIIlllIlIllIl.IlIlIlIlIlllllllllIl();
    }
    
    public static void IIlllIlIIllIlIlIlIIl() {
        lllllIlIIIlIlIIlllII.IlIlIIIIIIlllIlIllIl.llllIIIIlIIIlIlllIll();
    }
    
    public static void IlIlIlIlIlllllllllIl(final int n, final int n2, final int n3, final int n4) {
        GL11.glViewport(n, n2, n3, n4);
    }
    
    public static void llllIIIIlIIIlIlllIll(final boolean llllIIIIlIIIlIlllIll, final boolean ilIlIlIlIlllllllllIl, final boolean llIllIIIIIllIlIIIIlI, final boolean ilIIIlIlIIIllIlIlIIl) {
        if (llllIIIIlIIIlIlllIll != lllllIlIIIlIlIIlllII.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll || ilIlIlIlIlllllllllIl != lllllIlIIIlIlIIlllII.IIllIIllIIIlIlIIIIlI.IlIlIlIlIlllllllllIl || llIllIIIIIllIlIIIIlI != lllllIlIIIlIlIIlllII.IIllIIllIIIlIlIIIIlI.llIllIIIIIllIlIIIIlI || ilIIIlIlIIIllIlIlIIl != lllllIlIIIlIlIIlllII.IIllIIllIIIlIlIIIIlI.IlIIIlIlIIIllIlIlIIl) {
            GL11.glColorMask(lllllIlIIIlIlIIlllII.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll, lllllIlIIIlIlIIlllII.IIllIIllIIIlIlIIIIlI.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl, lllllIlIIIlIlIIlllII.IIllIIllIIIlIlIIIIlI.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI, lllllIlIIIlIlIIlllII.IIllIIllIIIlIlIIIIlI.IlIIIlIlIIIllIlIlIIl = ilIIIlIlIIIllIlIlIIl);
        }
    }
    
    public static void llllIIIIlIIIlIlllIll(final double llllIIIIlIIIlIlllIll) {
        if (llllIIIIlIIIlIlllIll != lllllIlIIIlIlIIlllII.IlIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll) {
            GL11.glClearDepth(lllllIlIIIlIlIIlllII.IlIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll);
        }
    }
    
    public static void llllIIIIlIIIlIlllIll(final float llllIIIIlIIIlIlllIll, final float ilIlIlIlIlllllllllIl, final float llIllIIIIIllIlIIIIlI, final float ilIIIlIlIIIllIlIlIIl) {
        if (llllIIIIlIIIlIlllIll != lllllIlIIIlIlIIlllII.IlIlIIIllIIllIlllllI.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll || ilIlIlIlIlllllllllIl != lllllIlIIIlIlIIlllII.IlIlIIIllIIllIlllllI.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl || llIllIIIIIllIlIIIIlI != lllllIlIIIlIlIIlllII.IlIlIIIllIIllIlllllI.IlIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI || ilIIIlIlIIIllIlIlIIl != lllllIlIIIlIlIIlllII.IlIlIIIllIIllIlllllI.IlIlIlIlIlllllllllIl.IlIIIlIlIIIllIlIlIIl) {
            GL11.glClearColor(lllllIlIIIlIlIIlllII.IlIlIIIllIIllIlllllI.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll, lllllIlIIIlIlIIlllII.IlIlIIIllIIllIlllllI.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl, lllllIlIIIlIlIIlllII.IlIlIIIllIIllIlllllI.IlIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI, lllllIlIIIlIlIIlllII.IlIlIIIllIIllIlllllI.IlIlIlIlIlllllllllIl.IlIIIlIlIIIllIlIlIIl = ilIIIlIlIIIllIlIlIIl);
        }
    }
    
    public static void llIllIlIIIIllIlIIllI(final int n) {
        if (lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll) {
            GL11.glClear(n);
        }
    }
    
    public static void lIlIlIIIllIIllIIIllI(final int n) {
        GL11.glMatrixMode(n);
    }
    
    public static void llIIIlIlIllIIlIlIlII() {
        GL11.glLoadIdentity();
    }
    
    public static void lllllIlIIIlIlIIlllII() {
        GL11.glPushMatrix();
    }
    
    public static void lIllllllIIllIlIlIlII() {
        GL11.glPopMatrix();
    }
    
    public static void IlIlIlIlIlllllllllIl(final int n, final FloatBuffer floatBuffer) {
        GL11.glGetFloat(n, floatBuffer);
    }
    
    public static void llllIIIIlIIIlIlllIll(final double n, final double n2, final double n3, final double n4, final double n5, final double n6) {
        GL11.glOrtho(n, n2, n3, n4, n5, n6);
    }
    
    public static void IlIlIlIlIlllllllllIl(final float n, final float n2, final float n3, final float n4) {
        GL11.glRotatef(n, n2, n3, n4);
    }
    
    public static void llllIIIIlIIIlIlllIll(final float n, final float n2, final float n3) {
        GL11.glScalef(n, n2, n3);
    }
    
    public static void llllIIIIlIIIlIlllIll(final double n, final double n2, final double n3) {
        GL11.glScaled(n, n2, n3);
    }
    
    public static void IlIlIlIlIlllllllllIl(final float n, final float n2, final float n3) {
        GL11.glTranslatef(n, n2, n3);
    }
    
    public static void IlIlIlIlIlllllllllIl(final double n, final double n2, final double n3) {
        GL11.glTranslated(n, n2, n3);
    }
    
    public static void llllIIIIlIIIlIlllIll(final FloatBuffer floatBuffer) {
        GL11.glMultMatrix(floatBuffer);
    }
    
    public static void llIllIIIIIllIlIIIIlI(final float llllIIIIlIIIlIlllIll, final float ilIlIlIlIlllllllllIl, final float llIllIIIIIllIlIIIIlI, final float ilIIIlIlIIIllIlIlIIl) {
        if (llllIIIIlIIIlIlllIll != lllllIlIIIlIlIIlllII.IIIlIIIlIlIIlllIIlll.llllIIIIlIIIlIlllIll || ilIlIlIlIlllllllllIl != lllllIlIIIlIlIIlllII.IIIlIIIlIlIIlllIIlll.IlIlIlIlIlllllllllIl || llIllIIIIIllIlIIIIlI != lllllIlIIIlIlIIlllII.IIIlIIIlIlIIlllIIlll.llIllIIIIIllIlIIIIlI || ilIIIlIlIIIllIlIlIIl != lllllIlIIIlIlIIlllII.IIIlIIIlIlIIlllIIlll.IlIIIlIlIIIllIlIlIIl) {
            GL11.glColor4f(lllllIlIIIlIlIIlllII.IIIlIIIlIlIIlllIIlll.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll, lllllIlIIIlIlIIlllII.IIIlIIIlIlIIlllIIlll.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl, lllllIlIIIlIlIIlllII.IIIlIIIlIlIIlllIIlll.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI, lllllIlIIIlIlIIlllII.IIIlIIIlIlIIlllIIlll.IlIIIlIlIIIllIlIlIIl = ilIIIlIlIIIllIlIlIIl);
        }
    }
    
    public static void llIllIIIIIllIlIIIIlI(final float n, final float n2, final float n3) {
        llIllIIIIIllIlIIIIlI(n, n2, n3, 1.0f);
    }
    
    public static void llIIlllIIlllIIllIllI() {
        final llllllIllIllIlIllllI iiIlIIIlIlIIlllIIlll = lllllIlIIIlIlIIlllII.IIIlIIIlIlIIlllIIlll;
        final llllllIllIllIlIllllI iiIlIIIlIlIIlllIIlll2 = lllllIlIIIlIlIIlllII.IIIlIIIlIlIIlllIIlll;
        final llllllIllIllIlIllllI iiIlIIIlIlIIlllIIlll3 = lllllIlIIIlIlIIlllII.IIIlIIIlIlIIlllIIlll;
        final llllllIllIllIlIllllI iiIlIIIlIlIIlllIIlll4 = lllllIlIIIlIlIIlllII.IIIlIIIlIlIIlllIIlll;
        final float n = -1.0f;
        iiIlIIIlIlIIlllIIlll4.IlIIIlIlIIIllIlIlIIl = n;
        iiIlIIIlIlIIlllIIlll3.llIllIIIIIllIlIIIIlI = n;
        iiIlIIIlIlIIlllIIlll2.IlIlIlIlIlllllllllIl = n;
        iiIlIIIlIlIIlllIIlll.llllIIIIlIIIlIlllIll = n;
    }
    
    public static void llllIIIIlIIIlIlllIll(final int n, final int n2, final ByteBuffer byteBuffer) {
        GL11.glNormalPointer(n, n2, byteBuffer);
    }
    
    public static void llIllIIIIIllIlIIIIlI(final int n, final int n2, final int n3, final int n4) {
        GL11.glTexCoordPointer(n, n2, n3, (long)n4);
    }
    
    public static void llllIIIIlIIIlIlllIll(final int n, final int n2, final int n3, final ByteBuffer byteBuffer) {
        GL11.glTexCoordPointer(n, n2, n3, byteBuffer);
    }
    
    public static void IlIIIlIlIIIllIlIlIIl(final int n, final int n2, final int n3, final int n4) {
        GL11.glVertexPointer(n, n2, n3, (long)n4);
    }
    
    public static void IlIlIlIlIlllllllllIl(final int n, final int n2, final int n3, final ByteBuffer byteBuffer) {
        GL11.glVertexPointer(n, n2, n3, byteBuffer);
    }
    
    public static void IlIlIIIllIllIIIIIllI(final int n, final int n2, final int n3, final int n4) {
        GL11.glColorPointer(n, n2, n3, (long)n4);
    }
    
    public static void llIllIIIIIllIlIIIIlI(final int n, final int n2, final int n3, final ByteBuffer byteBuffer) {
        GL11.glColorPointer(n, n2, n3, byteBuffer);
    }
    
    public static void IlIlIIIllIIllIlllllI(final int n) {
        GL11.glDisableClientState(n);
    }
    
    public static void IIIIlllIIIIIIlIIIlll(final int n) {
        GL11.glEnableClientState(n);
    }
    
    public static void llllIIllllIlIlIIIIll(final int n) {
        GL11.glBegin(n);
    }
    
    public static void IIlllIIIlIlllIIlllII() {
        GL11.glEnd();
    }
    
    public static void llllIIIIlIIIlIlllIll(final int n, final int n2, final int n3) {
        GL11.glDrawArrays(n, n2, n3);
        if (net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.b() && !lllllIlIIIlIlIIlllII.IlIlIllllllllIIIIlII) {
            final int iiiIlllIIIIIIlIIIlll = net.optifine.shaders.llIIlllIIlllIIllIllI.bM.IIIIlllIIIIIIlIIIlll();
            if (iiiIlllIIIIIIlIIIlll > 1) {
                for (int i = 1; i < iiiIlllIIIIIIlIIIlll; ++i) {
                    net.optifine.shaders.llIIlllIIlllIIllIllI.ar.IlIlIlIlIlllllllllIl(i);
                    GL11.glDrawArrays(n, n2, n3);
                }
                net.optifine.shaders.llIIlllIIlllIIllIllI.ar.IlIlIlIlIlllllllllIl(0);
            }
        }
    }
    
    public static void IlIllIlIlIIIlIlIlIII(final int n) {
        GL11.glCallList(n);
        if (net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.b() && !lllllIlIIIlIlIIlllII.IlIlIllllllllIIIIlII) {
            final int iiiIlllIIIIIIlIIIlll = net.optifine.shaders.llIIlllIIlllIIllIllI.bM.IIIIlllIIIIIIlIIIlll();
            if (iiiIlllIIIIIIlIIIlll > 1) {
                for (int i = 1; i < iiiIlllIIIIIIlIIIlll; ++i) {
                    net.optifine.shaders.llIIlllIIlllIIllIllI.ar.IlIlIlIlIlllllllllIl(i);
                    GL11.glCallList(n);
                }
                net.optifine.shaders.llIIlllIIlllIIllIllI.ar.IlIlIlIlIlllllllllIl(0);
            }
        }
    }
    
    public static void llllIIIIlIIIlIlllIll(final IntBuffer intBuffer) {
        GL11.glCallLists(intBuffer);
        if (net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.b() && !lllllIlIIIlIlIIlllII.IlIlIllllllllIIIIlII) {
            final int iiiIlllIIIIIIlIIIlll = net.optifine.shaders.llIIlllIIlllIIllIllI.bM.IIIIlllIIIIIIlIIIlll();
            if (iiiIlllIIIIIIlIIIlll > 1) {
                for (int i = 1; i < iiiIlllIIIIIIlIIIlll; ++i) {
                    net.optifine.shaders.llIIlllIIlllIIllIllI.ar.IlIlIlIlIlllllllllIl(i);
                    GL11.glCallLists(intBuffer);
                }
                net.optifine.shaders.llIIlllIIlllIIllIllI.ar.IlIlIlIlIlllllllllIl(0);
            }
        }
    }
    
    public static void IlIIIlIlIIIllIlIlIIl(final int n, final int n2) {
        GL11.glDeleteLists(n, n2);
    }
    
    public static void IlIlIIIllIllIIIIIllI(final int n, final int n2) {
        GL11.glNewList(n, n2);
        lllllIlIIIlIlIIlllII.IlIlIllllllllIIIIlII = true;
    }
    
    public static void IIlIIIIIllIlIIIlIIll() {
        GL11.glEndList();
        lllllIlIIIlIlIIlllII.IlIlIllllllllIIIIlII = false;
    }
    
    public static int llllllIllIllIlIllllI() {
        return GL11.glGetError();
    }
    
    public static void llllIIIIlIIIlIlllIll(final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7, final int n8, final IntBuffer intBuffer) {
        GL11.glTexImage2D(n, n2, n3, n4, n5, n6, n7, n8, intBuffer);
    }
    
    public static void IlIlIlIlIlllllllllIl(final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7, final int n8, final IntBuffer intBuffer) {
        GL11.glTexSubImage2D(n, n2, n3, n4, n5, n6, n7, n8, intBuffer);
    }
    
    public static void llllIIIIlIIIlIlllIll(final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7, final int n8) {
        GL11.glCopyTexSubImage2D(n, n2, n3, n4, n5, n6, n7, n8);
    }
    
    public static void llllIIIIlIIIlIlllIll(final int n, final int n2, final int n3, final int n4, final IntBuffer intBuffer) {
        GL11.glGetTexImage(n, n2, n3, n4, intBuffer);
    }
    
    public static void llllIIIIlIIIlIlllIll(final int n, final int n2, final float n3) {
        GL11.glTexParameterf(n, n2, n3);
    }
    
    public static void IlIlIlIlIlllllllllIl(final int n, final int n2, final int n3) {
        GL11.glTexParameteri(n, n2, n3);
    }
    
    public static int llIllIIIIIllIlIIIIlI(final int n, final int n2, final int n3) {
        return GL11.glGetTexLevelParameteri(n, n2, n3);
    }
    
    public static int IIIllllllIllIIIlllIl() {
        return lIIIIlIlIllllIIlIllI.IIlllIIlIllIllIlIIll + lllllIlIIIlIlIIlllII.IlIllIlIlIIIlIlIlIII;
    }
    
    public static void IlIIIlIIIllllIlIlIlI() {
        GL11.glBindTexture(3553, lllllIlIIIlIlIIlllII.IIlllIIlIllIllIlIIll[lllllIlIIIlIlIIlllII.IlIllIlIlIIIlIlIlIII].IlIlIlIlIlllllllllIl);
    }
    
    public static int IIIIIllIIIIlIIIIllIl() {
        return lllllIlIIIlIlIIlllII.IIlllIIlIllIllIlIIll[lllllIlIIIlIlIIlllII.IlIllIlIlIIIlIlIlIII].IlIlIlIlIlllllllllIl;
    }
    
    public static void IIIIIIIIIlllIllIlIlI() {
        if (net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IIIIlllIIIIIIlIIIlll()) {
            final int glGetInteger = GL11.glGetInteger(34016);
            final int glGetInteger2 = GL11.glGetInteger(32873);
            final int iiIllllllIllIIIlllIl = IIIllllllIllIIIlllIl();
            final int iiiiIllIIIIlIIIIllIl = IIIIIllIIIIlIIIIllIl();
            if (iiiiIllIIIIlIIIIllIl > 0 && (glGetInteger != iiIllllllIllIIIlllIl || glGetInteger2 != iiiiIllIIIIlIIIIllIl)) {
                net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl("checkTexture: act: " + iiIllllllIllIIIlllIl + ", glAct: " + glGetInteger + ", tex: " + iiiiIllIIIIlIIIIllIl + ", glTex: " + glGetInteger2);
            }
        }
    }
    
    public static void IlIlIlIlIlllllllllIl(final IntBuffer intBuffer) {
        intBuffer.rewind();
        while (intBuffer.position() < intBuffer.limit()) {
            lIIIIlIIIIIlllIllIII(intBuffer.get());
        }
        intBuffer.rewind();
    }
    
    public static boolean IIllllIIIlIIIIIIllIl() {
        return lllllIlIIIlIlIIlllII.lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl;
    }
    
    public static void IlIlIlIlIlllllllllIl(final boolean b) {
        lllllIlIIIlIlIIlllII.lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(b);
    }
    
    public static void llllIIIIlIIIlIlllIll(final IlIlIIIllIllIIIIIllI ilIlIIIllIllIIIIIllI) {
        if (!lllllIlIIIlIlIIlllII.IlIlIIIlIIlIlIIlllIl.llIllIIIIIllIlIIIIlI()) {
            IlIlIlIlIlllllllllIl(lllllIlIIIlIlIIlllII.IlllllllIIIlIIIlIlII);
            llIllIIIIIllIlIIIIlI(ilIlIIIllIllIIIIIllI);
            lllllIlIIIlIlIIlllII.IlIlIIIlIIlIlIIlllIl.llllIIIIlIIIlIlllIll();
        }
    }
    
    public static void IlllIIIIlIIIlIlIlIIl() {
        if (lllllIlIIIlIlIIlllII.IlIlIIIlIIlIlIIlllIl.IlIlIlIlIlllllllllIl()) {
            llIllIIIIIllIlIIIIlI(lllllIlIIIlIlIIlllII.IlllllllIIIlIIIlIlII);
        }
    }
    
    public static void IlIlIlIlIlllllllllIl(final IlIlIIIllIllIIIIIllI ilIlIIIllIllIIIIIllI) {
        if (lllllIlIIIlIlIIlllII.IlIlIIIlIIlIlIIlllIl.llIllIIIIIllIlIIIIlI()) {
            ilIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll(lllllIlIIIlIlIIlllII.IlllllllIIIlIIIlIlII);
        }
        else {
            ilIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll(lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl, lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl, lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI);
        }
    }
    
    public static void llIllIIIIIllIlIIIIlI(final IlIlIIIllIllIIIIIllI ilIlIIIllIllIIIIIllI) {
        if (lllllIlIIIlIlIIlllII.IlIlIIIlIIlIlIIlllIl.llIllIIIIIllIlIIIIlI()) {
            lllllIlIIIlIlIIlllII.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(ilIlIIIllIllIIIIIllI);
        }
        else {
            lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(ilIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI());
            llllIIIIlIIIlIlllIll(ilIlIIIllIllIIIIIllI.IlIIIlIlIIIllIlIlIIl(), ilIlIIIllIllIIIIIllI.IlIlIIIllIllIIIIIllI());
        }
    }
    
    public static void llllIIIIlIIIlIlllIll(final IllIIlllIIIIlllIIlIl illIIlllIIIIlllIIlIl) {
        if (!lllllIlIIIlIlIIlllII.IIlIIIIlllIlllllIlII.llIllIIIIIllIlIIIIlI()) {
            IlIlIlIlIlllllllllIl(lllllIlIIIlIlIIlllII.IIIlIIlIIIIlllIlllII);
            llIllIIIIIllIlIIIIlI(illIIlllIIIIlllIIlIl);
            lllllIlIIIlIlIIlllII.IIlIIIIlllIlllllIlII.llllIIIIlIIIlIlllIll();
        }
    }
    
    public static void lllIllIIIllllllIllll() {
        if (lllllIlIIIlIlIIlllII.IIlIIIIlllIlllllIlII.IlIlIlIlIlllllllllIl()) {
            llIllIIIIIllIlIIIIlI(lllllIlIIIlIlIIlllII.IIIlIIlIIIIlllIlllII);
        }
    }
    
    public static void IlIlIlIlIlllllllllIl(final IllIIlllIIIIlllIIlIl illIIlllIIIIlllIIlIl) {
        if (lllllIlIIIlIlIIlllII.IIlIIIIlllIlllllIlII.llIllIIIIIllIlIIIIlI()) {
            illIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll(lllllIlIIIlIlIIlllII.IIIlIIlIIIIlllIlllII);
        }
        else {
            illIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll(lllllIlIIIlIlIIlllII.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl, lllllIlIIIlIlIIlllII.IllIIlllIIIIlllIIlIl.IlIlIlIlIlllllllllIl, lllllIlIIIlIlIIlllII.IllIIlllIIIIlllIIlIl.llIllIIIIIllIlIIIIlI, lllllIlIIIlIlIIlllII.IllIIlllIIIIlllIIlIl.IlIIIlIlIIIllIlIlIIl, lllllIlIIIlIlIIlllII.IllIIlllIIIIlllIIlIl.IlIlIIIllIllIIIIIllI);
        }
    }
    
    public static void llIllIIIIIllIlIIIIlI(final IllIIlllIIIIlllIIlIl illIIlllIIIIlllIIlIl) {
        if (lllllIlIIIlIlIIlllII.IIlIIIIlllIlllllIlII.llIllIIIIIllIlIIIIlI()) {
            lllllIlIIIlIlIIlllII.IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll(illIIlllIIIIlllIIlIl);
        }
        else {
            lllllIlIIIlIlIIlllII.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(illIIlllIIIIlllIIlIl.llIllIIIIIllIlIIIIlI());
            if (!illIIlllIIIIlllIIlIl.lIIIIlIIIIIlllIllIII()) {
                IlIlIlIlIlllllllllIl(illIIlllIIIIlllIIlIl.IlIIIlIlIIIllIlIlIIl(), illIIlllIIIIlllIIlIl.IlIlIIIllIllIIIIIllI());
            }
            else {
                llllIIIIlIIIlIlllIll(illIIlllIIIIlllIIlIl.IlIIIlIlIIIllIlIlIIl(), illIIlllIIIIlllIIlIl.IlIlIIIllIllIIIIIllI(), illIIlllIIIIlllIIlIl.IllIIlllIIIIlllIIlIl(), illIIlllIIIIlllIIlIl.llllIIIlIlllIlIIIIIl());
            }
        }
    }
    
    public static void llllIIIIlIIIlIlllIll(final int n, final IntBuffer intBuffer, final IntBuffer intBuffer2) {
        GL14.glMultiDrawArrays(n, intBuffer, intBuffer2);
        if (net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.b() && !lllllIlIIIlIlIIlllII.IlIlIllllllllIIIIlII) {
            final int iiiIlllIIIIIIlIIIlll = net.optifine.shaders.llIIlllIIlllIIllIllI.bM.IIIIlllIIIIIIlIIIlll();
            if (iiiIlllIIIIIIlIIIlll > 1) {
                for (int i = 1; i < iiiIlllIIIIIIlIIIlll; ++i) {
                    net.optifine.shaders.llIIlllIIlllIIllIllI.ar.IlIlIlIlIlllllllllIl(i);
                    GL14.glMultiDrawArrays(n, intBuffer, intBuffer2);
                }
                net.optifine.shaders.llIIlllIIlllIIllIllI.ar.IlIlIlIlIlllllllllIl(0);
            }
        }
    }
    
    static /* synthetic */ int[] llIllIlIlIIIIIIIllII() {
        final int[] iIlllIlIIllIlIlIlIIl = lllllIlIIIlIlIIlllII.IIlllIlIIllIlIlIlIIl;
        if (iIlllIlIIllIlIlIlIIl != null) {
            return iIlllIlIIllIlIlIlIIl;
        }
        final int[] iIlllIlIIllIlIlIlIIl2 = new int[IllIllIIIIlIIlIlllII.values().length];
        try {
            iIlllIlIIllIlIlIlIIl2[IllIllIIIIlIIlIlllII.IlIIIlIlIIIllIlIlIIl.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            iIlllIlIIllIlIlIlIIl2[IllIllIIIIlIIlIlllII.llIllIIIIIllIlIIIIlI.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError2) {}
        try {
            iIlllIlIIllIlIlIlIIl2[IllIllIIIIlIIlIlllII.llllIIIIlIIIlIlllIll.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError3) {}
        try {
            iIlllIlIIllIlIlIlIIl2[IllIllIIIIlIIlIlllII.IlIlIlIlIlllllllllIl.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError4) {}
        return lllllIlIIIlIlIIlllII.IIlllIlIIllIlIlIlIIl = iIlllIlIIllIlIlIlIIl2;
    }
}
