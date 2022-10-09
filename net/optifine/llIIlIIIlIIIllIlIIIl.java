package net.optifine;

import net.minecraft.lIIIlllIIIllIIIllIII.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.optifine.lIIIlllIIIllIIIllIII.*;
import net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.*;
import net.minecraft.llllIIIIlIIIlIlllIll.*;
import net.minecraft.client.*;
import net.optifine.lIIIIlIIIIIlllIllIII.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI.*;
import net.minecraft.client.llIIlIIIlIIIllIlIIIl.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.optifine.util.*;
import java.io.*;
import java.util.*;

public class llIIlIIIlIIIllIlIIIl
{
    private static Map[] llIIlIIIlIIIllIlIIIl;
    private static Map[] llIllIlIIIIllIlIIllI;
    private static Map[][] lIlIlIIIllIIllIIIllI;
    private static lIIIlllIIIllIIIllIII[][] IlIlIIIllIIllIlllllI;
    private static lIIIlllIIIllIIIllIII[][] IIIIlllIIIIIIlIIIlll;
    private static boolean llllIIllllIlIlIIIIll;
    protected static final int llllIIIIlIIIlIlllIll = -1;
    protected static final int IlIlIlIlIlllllllllIl = 0;
    protected static final int llIllIIIIIllIlIIIIlI = 1;
    protected static final int IlIIIlIlIIIllIlIlIIl = 2;
    protected static final int IlIlIIIllIllIIIIIllI = 3;
    protected static final int IllIIlllIIIIlllIIlIl = 4;
    protected static final int llllIIIlIlllIlIIIIIl = 5;
    private static final int IlIllIlIlIIIlIlIlIII = 0;
    private static final int IIlllIIlIllIllIlIIll = 1;
    private static final int lllIIIIlllllIlIIllIl = 2;
    public static final net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.llIIlIIIlIIIllIlIIIl lIIIIlIIIIIlllIllIII;
    private static IlIlIIIllIIllIlllllI IlIlIIIIIIlllIlIllIl;
    private static final llIllIIIIIllIlIIIIlI[] IIllIIllIIIlIlIIIIlI;
    private static final llIllIIIIIllIlIIIIlI[] IIIlIIIlIlIIlllIIlll;
    private static final llIllIIIIIllIlIIIIlI[] IlIlIIIlIIlIlIIlllIl;
    private static final llIllIIIIIllIlIIIIlI[] IlllllllIIIlIIIlIlII;
    private static final llIllIIIIIllIlIIIIlI[] IIlIIIIlllIlllllIlII;
    private static final llIllIIIIIllIlIIIIlI[] IIIlIIlIIIIlllIlllII;
    private static final llIllIIIIIllIlIIIIlI[] IlIlIllllllllIIIIlII;
    private static final llIllIIIIIllIlIIIIlI[] IIlllIlIIllIlIlIlIIl;
    private static final llIllIIIIIllIlIIIIlI[] llIIIlIlIllIIlIlIlII;
    private static final llIllIIIIIllIlIIIIlI[] lllllIlIIIlIlIIlllII;
    private static final llIllIIIIIllIlIIIIlI[] lIllllllIIllIlIlIlII;
    private static final llIllIIIIIllIlIIIIlI[] llIIlllIIlllIIllIllI;
    private static final llIllIIIIIllIlIIIIlI[] IIlllIIIlIlllIIlllII;
    private static final llIllIIIIIllIlIIIIlI[] IIlIIIIIllIlIIIlIIll;
    private static final llIllIIIIIllIlIIIIlI[] llllllIllIllIlIllllI;
    private static final llIllIIIIIllIlIIIIlI[] IIIllllllIllIIIlllIl;
    public static final IlIlIIIllIIllIlllllI lIIIlllIIIllIIIllIII;
    private static volatile /* synthetic */ int[] IlIIIlIIIllllIlIlIlI;
    
    static {
        net.optifine.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl = null;
        net.optifine.llIIlIIIlIIIllIlIIIl.llIllIlIIIIllIlIIllI = null;
        net.optifine.llIIlIIIlIIIllIlIIIl.lIlIlIIIllIIllIIIllI = null;
        net.optifine.llIIlIIIlIIIllIlIIIl.IlIlIIIllIIllIlllllI = null;
        net.optifine.llIIlIIIlIIIllIlIIIl.IIIIlllIIIIIIlIIIlll = null;
        net.optifine.llIIlIIIlIIIllIlIIIl.llllIIllllIlIlIIIIll = false;
        lIIIIlIIIIIlllIllIII = net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.lllIllIIIllllllIllll();
        net.optifine.llIIlIIIlIIIllIlIIIl.IlIlIIIIIIlllIlIllIl = null;
        IIllIIllIIIlIlIIIIlI = new llIllIIIIIllIlIIIIlI[] { net.optifine.llIllIIIIIllIlIIIIlI.IlIlIIIllIllIIIIIllI, net.optifine.llIllIIIIIllIlIIIIlI.IllIIlllIIIIlllIIlIl, net.optifine.llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI, net.optifine.llIllIIIIIllIlIIIIlI.IlIIIlIlIIIllIlIlIIl };
        IIIlIIIlIlIIlllIIlll = new llIllIIIIIllIlIIIIlI[] { net.optifine.llIllIIIIIllIlIIIIlI.IlIlIIIllIllIIIIIllI, net.optifine.llIllIIIIIllIlIIIIlI.IllIIlllIIIIlllIIlIl, net.optifine.llIllIIIIIllIlIIIIlI.IlIIIlIlIIIllIlIlIIl, net.optifine.llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI };
        IlIlIIIlIIlIlIIlllIl = new llIllIIIIIllIlIIIIlI[] { net.optifine.llIllIIIIIllIlIIIIlI.IllIIlllIIIIlllIIlIl, net.optifine.llIllIIIIIllIlIIIIlI.IlIlIIIllIllIIIIIllI, net.optifine.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll, net.optifine.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl };
        IlllllllIIIlIIIlIlII = new llIllIIIIIllIlIIIIlI[] { net.optifine.llIllIIIIIllIlIIIIlI.IlIlIIIllIllIIIIIllI, net.optifine.llIllIIIIIllIlIIIIlI.IllIIlllIIIIlllIIlIl, net.optifine.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll, net.optifine.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl };
        IIlIIIIlllIlllllIlII = new llIllIIIIIllIlIIIIlI[] { net.optifine.llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI, net.optifine.llIllIIIIIllIlIIIIlI.IlIIIlIlIIIllIlIlIIl, net.optifine.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll, net.optifine.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl };
        IIIlIIlIIIIlllIlllII = new llIllIIIIIllIlIIIIlI[] { net.optifine.llIllIIIIIllIlIIIIlI.IlIIIlIlIIIllIlIlIIl, net.optifine.llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI, net.optifine.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll, net.optifine.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl };
        IlIlIllllllllIIIIlII = new llIllIIIIIllIlIIIIlI[] { net.optifine.llIllIIIIIllIlIIIIlI.IlIlIIIllIllIIIIIllI, net.optifine.llIllIIIIIllIlIIIIlI.IllIIlllIIIIlllIIlIl, net.optifine.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl, net.optifine.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll };
        IIlllIlIIllIlIlIlIIl = new llIllIIIIIllIlIIIIlI[] { net.optifine.llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI, net.optifine.llIllIIIIIllIlIIIIlI.IlIIIlIlIIIllIlIlIIl, net.optifine.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl, net.optifine.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll };
        llIIIlIlIllIIlIlIlII = new llIllIIIIIllIlIIIIlI[] { net.optifine.llIllIIIIIllIlIIIIlI.lIIIIlIIIIIlllIllIII, net.optifine.llIllIIIIIllIlIIIIlI.llllIIIlIlllIlIIIIIl, net.optifine.llIllIIIIIllIlIIIIlI.llIIlIIIlIIIllIlIIIl, net.optifine.llIllIIIIIllIlIIIIlI.lIIIlllIIIllIIIllIII };
        lllllIlIIIlIlIIlllII = new llIllIIIIIllIlIIIIlI[] { net.optifine.llIllIIIIIllIlIIIIlI.llIIlIIIlIIIllIlIIIl, net.optifine.llIllIIIIIllIlIIIIlI.lIIIlllIIIllIIIllIII, net.optifine.llIllIIIIIllIlIIIIlI.lIIIIlIIIIIlllIllIII, net.optifine.llIllIIIIIllIlIIIIlI.llllIIIlIlllIlIIIIIl };
        lIllllllIIllIlIlIlII = new llIllIIIIIllIlIIIIlI[] { net.optifine.llIllIIIIIllIlIIIIlI.llllIIllllIlIlIIIIll, net.optifine.llIllIIIIIllIlIIIIlI.IlIllIlIlIIIlIlIlIII, net.optifine.llIllIIIIIllIlIIIIlI.IIlllIIlIllIllIlIIll, net.optifine.llIllIIIIIllIlIIIIlI.lllIIIIlllllIlIIllIl };
        llIIlllIIlllIIllIllI = new llIllIIIIIllIlIIIIlI[] { net.optifine.llIllIIIIIllIlIIIIlI.IlIllIlIlIIIlIlIlIII, net.optifine.llIllIIIIIllIlIIIIlI.llllIIllllIlIlIIIIll, net.optifine.llIllIIIIIllIlIIIIlI.lllIIIIlllllIlIIllIl, net.optifine.llIllIIIIIllIlIIIIlI.IIlllIIlIllIllIlIIll };
        IIlllIIIlIlllIIlllII = new llIllIIIIIllIlIIIIlI[] { net.optifine.llIllIIIIIllIlIIIIlI.lIlIlIIIllIIllIIIllI, net.optifine.llIllIIIIIllIlIIIIlI.llIllIlIIIIllIlIIllI, net.optifine.llIllIIIIIllIlIIIIlI.IIIIlllIIIIIIlIIIlll, net.optifine.llIllIIIIIllIlIIIIlI.IlIlIIIllIIllIlllllI };
        IIlIIIIIllIlIIIlIIll = new llIllIIIIIllIlIIIIlI[] { net.optifine.llIllIIIIIllIlIIIIlI.llIllIlIIIIllIlIIllI, net.optifine.llIllIIIIIllIlIIIIlI.lIlIlIIIllIIllIIIllI, net.optifine.llIllIIIIIllIlIIIIlI.IlIlIIIllIIllIlllllI, net.optifine.llIllIIIIIllIlIIIIlI.IIIIlllIIIIIIlIIIlll };
        llllllIllIllIlIllllI = new llIllIIIIIllIlIIIIlI[] { net.optifine.llIllIIIIIllIlIIIIlI.lllIIIIlllllIlIIllIl, net.optifine.llIllIIIIIllIlIIIIlI.IIlllIIlIllIllIlIIll, net.optifine.llIllIIIIIllIlIIIIlI.IlIllIlIlIIIlIlIlIII, net.optifine.llIllIIIIIllIlIIIIlI.llllIIllllIlIlIIIIll };
        IIIllllllIllIIIlllIl = new llIllIIIIIllIlIIIIlI[] { net.optifine.llIllIIIIIllIlIIIIlI.IIIIlllIIIIIIlIIIlll, net.optifine.llIllIIIIIllIlIIIIlI.IlIlIIIllIIllIlllllI, net.optifine.llIllIIIIIllIlIIIIlI.lIlIlIIIllIIllIIIllI, net.optifine.llIllIIIIIllIlIIIIlI.llIllIlIIIIllIlIIllI };
        lIIIlllIIIllIIIllIII = new IlIlIIIllIIllIlllllI("<default>");
    }
    
    public static net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll[] llllIIIIlIIIlIlllIll(final lIlIlIIIllIIllIIIllI lIlIlIIIllIIllIIIllI, final net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final llllIIIlIlllIlIIIIIl llllIIIlIlllIlIIIIIl) {
        if (llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll() == null) {
            return llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll);
        }
        llIIlIIIlIIIllIlIIIl.llIllIIIIIllIlIIIIlI();
        if (IlIlIlIlIlllllllllIl(lIlIlIIIllIIllIIIllI, llIIlIIIlIIIllIlIIIl, ilIlIlIlIlllllllllIl, llllIIIIlIIIlIlllIll, llllIIIlIlllIlIIIIIl)) {
            llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll(llIIlIIIlIIIllIlIIIl.IlIlIIIIIIlllIlIllIl, llllIIIIlIIIlIlllIll);
            return llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll);
        }
        return llllIIIIlIIIlIlllIll(lIlIlIIIllIIllIIIllI, llIIlIIIlIIIllIlIIIl, ilIlIlIlIlllllllllIl, llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI(), llllIIIIlIIIlIlllIll, llllIIIlIlllIlIIIIIl);
    }
    
    private static boolean IlIlIlIlIlllllllllIl(final lIlIlIIIllIIllIIIllI lIlIlIIIllIIllIIIllI, final net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final llllIIIlIlllIlIIIIIl llllIIIlIlllIlIIIIIl) {
        final net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llIllIIIIIllIlIIIIlI = llIIlIIIlIIIllIlIIIl.llIllIIIIIllIlIIIIlI();
        if (llIllIIIIIllIlIIIIlI instanceof u && llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll().lIIIlllIIIllIIIllIII().startsWith("minecraft:blocks/glass_pane_top")) {
            return lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI())) == llIIlIIIlIIIllIlIIIl;
        }
        if (llIllIIIIIllIlIIIIlI instanceof u) {
            final lllIllIIIllllllIllll ilIlIIIllIllIIIIIllI = llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI();
            if (ilIlIIIllIllIIIIIllI != lllIllIIIllllllIllll.IlIlIlIlIlllllllllIl && ilIlIIIllIllIIIIIllI != lllIllIIIllllllIllll.llllIIIIlIIIlIlllIll) {
                return false;
            }
            if (!llllIIIIlIIIlIlllIll.lIlIlIIIllIIllIIIllI()) {
                return false;
            }
            final IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll2 = ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI());
            final net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.llIIlIIIlIIIllIlIIIl ilIlIlIlIlllllllllIl2 = lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll2);
            if (ilIlIlIlIlllllllllIl2.llIllIIIIIllIlIIIIlI() != llIllIIIIIllIlIIIIlI) {
                return false;
            }
            if (llIllIIIIIllIlIIIIlI == llllIIIIlIIIlIlllIll.aL && ilIlIlIlIlllllllllIl2.llllIIIIlIIIlIlllIll(cl.llIllIlIlIIIIIIIllII) != llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(cl.llIllIlIlIIIIIIIllII)) {
                return false;
            }
            final net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.llIIlIIIlIIIllIlIIIl llllIIIIlIIIlIlllIll3 = ilIlIlIlIlllllllllIl2.llIllIIIIIllIlIIIIlI().llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl2, lIlIlIIIllIIllIIIllI, llllIIIIlIIIlIlllIll2);
            final double n = llllIIIIlIIIlIlllIll.lIIIlllIIIllIIIllIII();
            if (n < 0.4) {
                if (llllIIIIlIIIlIlllIll3.llllIIIIlIIIlIlllIll(u.lllIllIIIllllllIllll)) {
                    return true;
                }
            }
            else if (n > 0.6) {
                if (llllIIIIlIIIlIlllIll3.llllIIIIlIIIlIlllIll(u.IIllllIIIlIIIIIIllIl)) {
                    return true;
                }
            }
            else {
                final double llIllIlIIIIllIlIIllI = llllIIIIlIIIlIlllIll.llIllIlIIIIllIlIIllI();
                if (llIllIlIIIIllIlIIllI < 0.4) {
                    if (llllIIIIlIIIlIlllIll3.llllIIIIlIIIlIlllIll(u.IIIIIIIIIlllIllIlIlI)) {
                        return true;
                    }
                }
                else {
                    if (llIllIlIIIIllIlIIllI <= 0.6) {
                        return true;
                    }
                    if (llllIIIIlIIIlIlllIll3.llllIIIIlIIIlIlllIll(u.IlllIIIIlIIIlIlIlIIl)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
    
    protected static net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll[] llllIIIIlIIIlIlllIll(final IlIlIIIllIIllIlllllI ilIlIIIllIIllIlllllI, final net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final llllIIIlIlllIlIIIIIl llllIIIlIlllIlIIIIIl) {
        if (ilIlIIIllIIllIlllllI == null) {
            return null;
        }
        if (ilIlIIIllIIllIlllllI == net.optifine.llIIlIIIlIIIllIlIIIl.lIIIlllIIIllIIIllIII) {
            return llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll);
        }
        return llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll(ilIlIIIllIIllIlllllI, llllIIIIlIIIlIlllIll));
    }
    
    private static synchronized net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll(final IlIlIIIllIIllIlllllI ilIlIIIllIIllIlllllI, final net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        if (net.optifine.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl == null) {
            return llllIIIIlIIIlIlllIll;
        }
        final int iiiIlllIIIIIIlIIIlll = ilIlIIIllIIllIlllllI.IIIIlllIIIIIIlIIIlll();
        if (iiiIlllIIIIIIlIIIlll >= 0 && iiiIlllIIIIIIlIIIlll < net.optifine.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.length) {
            Map<Object, net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll> map = (Map<Object, net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll>)net.optifine.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl[iiiIlllIIIIIIlIIIlll];
            if (map == null) {
                map = (Map<Object, net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll>)new IdentityHashMap<net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll, net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll>(1);
                net.optifine.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl[iiiIlllIIIIIIlIIIlll] = map;
            }
            net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll2 = map.get(llllIIIIlIIIlIlllIll);
            if (llllIIIIlIIIlIlllIll2 == null) {
                llllIIIIlIIIlIlllIll2 = llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll, ilIlIIIllIIllIlllllI);
                map.put(llllIIIIlIIIlIlllIll, llllIIIIlIIIlIlllIll2);
            }
            return llllIIIIlIIIlIlllIll2;
        }
        return llllIIIIlIIIlIlllIll;
    }
    
    private static synchronized net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll(final IlIlIIIllIIllIlllllI ilIlIIIllIIllIlllllI, final net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final int n) {
        if (net.optifine.llIIlIIIlIIIllIlIIIl.llIllIlIIIIllIlIIllI == null) {
            return null;
        }
        if (ilIlIIIllIIllIlllllI == null) {
            return null;
        }
        final int iiiIlllIIIIIIlIIIlll = ilIlIIIllIIllIlllllI.IIIIlllIIIIIIlIIIlll();
        if (iiiIlllIIIIIIlIIIlll >= 0 && iiiIlllIIIIIIlIIIlll < net.optifine.llIIlIIIlIIIllIlIIIl.llIllIlIIIIllIlIIllI.length) {
            Map<Object, net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll> map = (Map<Object, net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll>)net.optifine.llIIlIIIlIIIllIlIIIl.llIllIlIIIIllIlIIllI[iiiIlllIIIIIIlIIIlll];
            if (map == null) {
                map = (Map<Object, net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll>)new EnumMap<lllIllIIIllllllIllll, net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll>(lllIllIIIllllllIllll.class);
                net.optifine.llIIlIIIlIIIllIlIIIl.llIllIlIIIIllIlIIllI[iiiIlllIIIIIIlIIIlll] = map;
            }
            final lllIllIIIllllllIllll ilIlIIIllIllIIIIIllI = llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI();
            net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll2 = map.get(ilIlIIIllIllIIIIIllI);
            if (llllIIIIlIIIlIlllIll2 == null) {
                llllIIIIlIIIlIlllIll2 = net.optifine.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(ilIlIIIllIllIIIIIllI, ilIlIIIllIIllIlllllI, n);
                map.put(ilIlIIIllIllIIIIIllI, llllIIIIlIIIlIlllIll2);
            }
            return llllIIIIlIIIlIlllIll2;
        }
        return null;
    }
    
    private static net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll(final net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final IlIlIIIllIIllIlllllI ilIlIIIllIIllIlllllI) {
        final int[] array = llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl().clone();
        final IlIlIIIllIIllIlllllI llllIIIIlIIIlIlllIll2 = llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll();
        for (int i = 0; i < 4; ++i) {
            llllIIIIlIIIlIlllIll(array, i, llllIIIIlIIIlIlllIll2, ilIlIIIllIIllIlllllI);
        }
        return new net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(array, llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl(), llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI(), ilIlIIIllIIllIlllllI);
    }
    
    private static void llllIIIIlIIIlIlllIll(final int[] array, final int n, final IlIlIIIllIIllIlllllI ilIlIIIllIIllIlllllI, final IlIlIIIllIIllIlllllI ilIlIIIllIIllIlllllI2) {
        final int n2 = array.length / 4 * n;
        final float intBitsToFloat = Float.intBitsToFloat(array[n2 + 4]);
        final float intBitsToFloat2 = Float.intBitsToFloat(array[n2 + 4 + 1]);
        final double llllIIIIlIIIlIlllIll = ilIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll(intBitsToFloat);
        final double ilIlIlIlIlllllllllIl = ilIlIIIllIIllIlllllI.IlIlIlIlIlllllllllIl(intBitsToFloat2);
        array[n2 + 4] = Float.floatToRawIntBits(ilIlIIIllIIllIlllllI2.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll));
        array[n2 + 4 + 1] = Float.floatToRawIntBits(ilIlIIIllIIllIlllllI2.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl));
    }
    
    private static net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll[] llllIIIIlIIIlIlllIll(final lIlIlIIIllIIllIIIllI lIlIlIIIllIIllIIIllI, final net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final lllIllIIIllllllIllll lllIllIIIllllllIllll, final net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final llllIIIlIlllIlIIIIIl llllIIIlIlllIlIIIIIl) {
        final net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll[] llllIIIIlIIIlIlllIll2 = llllIIIIlIIIlIlllIll(lIlIlIIIllIIllIIIllI, llIIlIIIlIIIllIlIIIl, ilIlIlIlIlllllllllIl, lllIllIIIllllllIllll, llllIIIIlIIIlIlllIll, true, 0, llllIIIlIlllIlIIIIIl);
        if (!llIIlIIIlIIIllIlIIIl.llllIIllllIlIlIIIIll) {
            return llllIIIIlIIIlIlllIll2;
        }
        if (llllIIIIlIIIlIlllIll2.length == 1 && llllIIIIlIIIlIlllIll2[0] == llllIIIIlIIIlIlllIll) {
            return llllIIIIlIIIlIlllIll2;
        }
        final List llllIIIIlIIIlIlllIll3 = llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll2);
        for (int i = 0; i < llllIIIIlIIIlIlllIll3.size(); ++i) {
            net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll4 = llllIIIIlIIIlIlllIll3.get(i);
            for (int j = 0; j < 3; ++j) {
                final net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll[] llllIIIIlIIIlIlllIll5 = llllIIIIlIIIlIlllIll(lIlIlIIIllIIllIIIllI, llIIlIIIlIIIllIlIIIl, ilIlIlIlIlllllllllIl, lllIllIIIllllllIllll, llllIIIIlIIIlIlllIll4, false, j + 1, llllIIIlIlllIlIIIIIl);
                if (llllIIIIlIIIlIlllIll5.length != 1) {
                    break;
                }
                if (llllIIIIlIIIlIlllIll5[0] == llllIIIIlIIIlIlllIll4) {
                    break;
                }
                llllIIIIlIIIlIlllIll4 = llllIIIIlIIIlIlllIll5[0];
            }
            llllIIIIlIIIlIlllIll3.set(i, llllIIIIlIIIlIlllIll4);
        }
        for (int k = 0; k < llllIIIIlIIIlIlllIll2.length; ++k) {
            llllIIIIlIIIlIlllIll2[k] = llllIIIIlIIIlIlllIll3.get(k);
        }
        return llllIIIIlIIIlIlllIll2;
    }
    
    public static net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll[] llllIIIIlIIIlIlllIll(final lIlIlIIIllIIllIIIllI lIlIlIIIllIIllIIIllI, final net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final lllIllIIIllllllIllll lllIllIIIllllllIllll, final net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final boolean b, final int n, final llllIIIlIlllIlIIIIIl llllIIIlIlllIlIIIIIl) {
        llIIlIIIlIIIllIlIIIl.llIllIIIIIllIlIIIIlI();
        if (!(llIIlIIIlIIIllIlIIIl instanceof IllIIlllIIIIlllIIlIl)) {
            return llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll);
        }
        final IllIIlllIIIIlllIIlIl illIIlllIIIIlllIIlIl = (IllIIlllIIIIlllIIlIl)llIIlIIIlIIIllIlIIIl;
        final IlIlIIIllIIllIlllllI llllIIIIlIIIlIlllIll2 = llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll();
        if (llIIlIIIlIIIllIlIIIl.IIIIlllIIIIIIlIIIlll != null) {
            final int iiiIlllIIIIIIlIIIlll = llllIIIIlIIIlIlllIll2.IIIIlllIIIIIIlIIIlll();
            if (iiiIlllIIIIIIlIIIlll >= 0 && iiiIlllIIIIIIlIIIlll < llIIlIIIlIIIllIlIIIl.IIIIlllIIIIIIlIIIlll.length) {
                final lIIIlllIIIllIIIllIII[] array = llIIlIIIlIIIllIlIIIl.IIIIlllIIIIIIlIIIlll[iiiIlllIIIIIIlIIIlll];
                if (array != null) {
                    final int llllIIIIlIIIlIlllIll3 = llllIIIIlIIIlIlllIll(lllIllIIIllllllIllll);
                    for (int i = 0; i < array.length; ++i) {
                        final lIIIlllIIIllIIIllIII liiIlllIIIllIIIllIII = array[i];
                        if (liiIlllIIIllIIIllIII != null && liiIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll(illIIlllIIIIlllIIlIl.IlIIIlIlIIIllIlIlIIl())) {
                            final net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll[] llllIIIIlIIIlIlllIll4 = llllIIIIlIIIlIlllIll(liiIlllIIIllIIIllIII, lIlIlIIIllIIllIIIllI, illIIlllIIIIlllIIlIl, ilIlIlIlIlllllllllIl, llllIIIIlIIIlIlllIll3, llllIIIIlIIIlIlllIll, n, llllIIIlIlllIlIIIIIl);
                            if (llllIIIIlIIIlIlllIll4 != null) {
                                return llllIIIIlIIIlIlllIll4;
                            }
                        }
                    }
                }
            }
        }
        if (llIIlIIIlIIIllIlIIIl.IlIlIIIllIIllIlllllI != null && b) {
            final int llllIIIIlIIIlIlllIll5 = llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll();
            if (llllIIIIlIIIlIlllIll5 >= 0 && llllIIIIlIIIlIlllIll5 < llIIlIIIlIIIllIlIIIl.IlIlIIIllIIllIlllllI.length) {
                final lIIIlllIIIllIIIllIII[] array2 = llIIlIIIlIIIllIlIIIl.IlIlIIIllIIllIlllllI[llllIIIIlIIIlIlllIll5];
                if (array2 != null) {
                    final int llllIIIIlIIIlIlllIll6 = llllIIIIlIIIlIlllIll(lllIllIIIllllllIllll);
                    for (int j = 0; j < array2.length; ++j) {
                        final lIIIlllIIIllIIIllIII liiIlllIIIllIIIllIII2 = array2[j];
                        if (liiIlllIIIllIIIllIII2 != null && liiIlllIIIllIIIllIII2.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll2)) {
                            final net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll[] llllIIIIlIIIlIlllIll7 = llllIIIIlIIIlIlllIll(liiIlllIIIllIIIllIII2, lIlIlIIIllIIllIIIllI, illIIlllIIIIlllIIlIl, ilIlIlIlIlllllllllIl, llllIIIIlIIIlIlllIll6, llllIIIIlIIIlIlllIll, n, llllIIIlIlllIlIIIIIl);
                            if (llllIIIIlIIIlIlllIll7 != null) {
                                return llllIIIIlIIIlIlllIll7;
                            }
                        }
                    }
                }
            }
        }
        return llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll);
    }
    
    public static int llllIIIIlIIIlIlllIll(final lllIllIIIllllllIllll lllIllIIIllllllIllll) {
        if (lllIllIIIllllllIllll == null) {
            return -1;
        }
        switch (IlIlIlIlIlllllllllIl()[lllIllIIIllllllIllll.ordinal()]) {
            case 1: {
                return 0;
            }
            case 2: {
                return 1;
            }
            case 6: {
                return 5;
            }
            case 5: {
                return 4;
            }
            case 3: {
                return 2;
            }
            case 4: {
                return 3;
            }
            default: {
                return -1;
            }
        }
    }
    
    private static lllIllIIIllllllIllll llllIIIIlIIIlIlllIll(final int n) {
        switch (n) {
            case 0: {
                return lllIllIIIllllllIllll.llllIIIIlIIIlIlllIll;
            }
            case 1: {
                return lllIllIIIllllllIllll.IlIlIlIlIlllllllllIl;
            }
            case 2: {
                return lllIllIIIllllllIllll.llIllIIIIIllIlIIIIlI;
            }
            case 3: {
                return lllIllIIIllllllIllll.IlIIIlIlIIIllIlIlIIl;
            }
            case 4: {
                return lllIllIIIllllllIllll.IlIlIIIllIllIIIIIllI;
            }
            case 5: {
                return lllIllIIIllllllIllll.IllIIlllIIIIlllIIlIl;
            }
            default: {
                return lllIllIIIllllllIllll.IlIlIlIlIlllllllllIl;
            }
        }
    }
    
    private static net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll[] llllIIIIlIIIlIlllIll(final lIIIlllIIIllIIIllIII liiIlllIIIllIIIllIII, final lIlIlIIIllIIllIIIllI lIlIlIIIllIIllIIIllI, final IllIIlllIIIIlllIIlIl illIIlllIIIIlllIIlIl, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final int n, final net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final int n2, final llllIIIlIlllIlIIIIIl llllIIIlIlllIlIIIIIl) {
        int n3 = 0;
        int illIIlllIIIIlllIIlIl2;
        final int n4 = illIIlllIIIIlllIIlIl2 = illIIlllIIIIlllIIlIl.IllIIlllIIIIlllIIlIl();
        final net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llIllIIIIIllIlIIIIlI = illIIlllIIIIlllIIlIl.llIllIIIIIllIlIIIIlI();
        if (llIllIIIIIllIlIIIIlI instanceof bk) {
            n3 = IlIlIlIlIlllllllllIl(n, n4);
            if (liiIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll() <= 3) {
                illIIlllIIIIlllIIlIl2 = (n4 & 0x3);
            }
        }
        if (llIllIIIIIllIlIIIIlI instanceof al) {
            n3 = llIllIIIIIllIlIIIIlI(n, n4);
            if (liiIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll() <= 2 && illIIlllIIIIlllIIlIl2 > 2) {
                illIIlllIIIIlllIIlIl2 = 2;
            }
        }
        if (!liiIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll(illIIlllIIIIlllIIlIl.IlIIIlIlIIIllIlIlIIl(), illIIlllIIIIlllIIlIl2)) {
            return null;
        }
        if (n >= 0 && liiIlllIIIllIIIllIII.lIIIlllIIIllIIIllIII != 63) {
            int llllIIIIlIIIlIlllIll2 = n;
            if (n3 != 0) {
                llllIIIIlIIIlIlllIll2 = llllIIIIlIIIlIlllIll(n, n3);
            }
            if ((1 << llllIIIIlIIIlIlllIll2 & liiIlllIIIllIIIllIII.lIIIlllIIIllIIIllIII) == 0x0) {
                return null;
            }
        }
        final int liiIlllIIIllIIIllIII2 = ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII();
        if (liiIlllIIIllIIIllIII.llIllIlIIIIllIlIIllI != null && !liiIlllIIIllIIIllIII.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll(liiIlllIIIllIIIllIII2)) {
            return null;
        }
        if (liiIlllIIIllIIIllIII.llIIlIIIlIIIllIlIIIl != null && !liiIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll(lIlIlIIIllIIllIIIllI.llIllIIIIIllIlIIIIlI(ilIlIlIlIlllllllllIl))) {
            return null;
        }
        if (liiIlllIIIllIIIllIII.IIIlIIIlIlIIlllIIlll != null && !liiIlllIIIllIIIllIII.IIIlIIIlIlIIlllIIlll.llllIIIIlIIIlIlllIll(IIllllIIIlIIIIIIllIl.llllIIIIlIIIlIlllIll(lIlIlIIIllIIllIIIllI, ilIlIlIlIlllllllllIl))) {
            return null;
        }
        final IlIlIIIllIIllIlllllI llllIIIIlIIIlIlllIll3 = llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll();
        switch (liiIlllIIIllIIIllIII.IllIIlllIIIIlllIIlIl) {
            case 1: {
                return llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll(liiIlllIIIllIIIllIII, lIlIlIIIllIIllIIIllI, illIIlllIIIIlllIIlIl, ilIlIlIlIlllllllllIl, n3, n, llllIIIIlIIIlIlllIll3, n4, llllIIIlIlllIlIIIIIl), llllIIIIlIIIlIlllIll, llllIIIlIlllIlIIIIIl);
            }
            case 2: {
                return llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll(liiIlllIIIllIIIllIII, lIlIlIIIllIIllIIIllI, illIIlllIIIIlllIIlIl, ilIlIlIlIlllllllllIl, n3, n, llllIIIIlIIIlIlllIll3, n4), llllIIIIlIIIlIlllIll, llllIIIlIlllIlIIIIIl);
            }
            case 3: {
                return llllIIIIlIIIlIlllIll(IlIlIIIllIllIIIIIllI(liiIlllIIIllIIIllIII, lIlIlIIIllIIllIIIllI, illIIlllIIIIlllIIlIl, ilIlIlIlIlllllllllIl, n3, n, llllIIIIlIIIlIlllIll3, n4), llllIIIIlIIIlIlllIll, llllIIIlIlllIlIIIIIl);
            }
            case 4: {
                return llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll(liiIlllIIIllIIIllIII, lIlIlIIIllIIllIIIllI, illIIlllIIIIlllIIlIl, ilIlIlIlIlllllllllIl, n), llllIIIIlIIIlIlllIll, llllIIIlIlllIlIIIIIl);
            }
            case 5: {
                return llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll(liiIlllIIIllIIIllIII, ilIlIlIlIlllllllllIl, n), llllIIIIlIIIlIlllIll, llllIIIlIlllIlIIIIIl);
            }
            case 6: {
                return llllIIIIlIIIlIlllIll(IlIlIlIlIlllllllllIl(liiIlllIIIllIIIllIII, lIlIlIIIllIIllIIIllI, illIIlllIIIIlllIIlIl, ilIlIlIlIlllllllllIl, n3, n, llllIIIIlIIIlIlllIll3, n4), llllIIIIlIIIlIlllIll, llllIIIlIlllIlIIIIIl);
            }
            case 7: {
                return llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll(liiIlllIIIllIIIllIII), llllIIIIlIIIlIlllIll, llllIIIlIlllIlIIIIIl);
            }
            case 8: {
                return llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI(liiIlllIIIllIIIllIII, lIlIlIIIllIIllIIIllI, illIIlllIIIIlllIIlIl, ilIlIlIlIlllllllllIl, n3, n, llllIIIIlIIIlIlllIll3, n4), llllIIIIlIIIlIlllIll, llllIIIlIlllIlIIIIIl);
            }
            case 9: {
                return llllIIIIlIIIlIlllIll(IlIIIlIlIIIllIlIlIIl(liiIlllIIIllIIIllIII, lIlIlIIIllIIllIIIllI, illIIlllIIIIlllIIlIl, ilIlIlIlIlllllllllIl, n3, n, llllIIIIlIIIlIlllIll3, n4), llllIIIIlIIIlIlllIll, llllIIIlIlllIlIIIIIl);
            }
            case 10: {
                if (n2 == 0) {
                    return llllIIIIlIIIlIlllIll(liiIlllIIIllIIIllIII, lIlIlIIIllIIllIIIllI, illIIlllIIIIlllIIlIl, ilIlIlIlIlllllllllIl, n3, n, llllIIIIlIIIlIlllIll, n4, llllIIIlIlllIlIIIIIl);
                }
                break;
            }
            case 11: {
                return IlIlIlIlIlllllllllIl(liiIlllIIIllIIIllIII, lIlIlIIIllIIllIIIllI, illIIlllIIIIlllIIlIl, ilIlIlIlIlllllllllIl, n3, n, llllIIIIlIIIlIlllIll, n4, llllIIIlIlllIlIIIIIl);
            }
            case 12: {
                return llllIIIIlIIIlIlllIll(liiIlllIIIllIIIllIII, llllIIIIlIIIlIlllIll, llllIIIlIlllIlIIIIIl);
            }
            case 13: {
                return llllIIIIlIIIlIlllIll(liiIlllIIIllIIIllIII, lIlIlIIIllIIllIIIllI, illIIlllIIIIlllIIlIl, ilIlIlIlIlllllllllIl, n, llllIIIIlIIIlIlllIll, llllIIIlIlllIlIIIIIl);
            }
            case 14: {
                return llllIIIIlIIIlIlllIll(liiIlllIIIllIIIllIII, ilIlIlIlIlllllllllIl, n, llllIIIIlIIIlIlllIll, llllIIIlIlllIlIIIIIl);
            }
            case 15: {
                return llIllIIIIIllIlIIIIlI(liiIlllIIIllIIIllIII, lIlIlIIIllIIllIIIllI, illIIlllIIIIlllIIlIl, ilIlIlIlIlllllllllIl, n3, n, llllIIIIlIIIlIlllIll, n4, llllIIIlIlllIlIIIIIl);
            }
        }
        return null;
    }
    
    private static int llllIIIIlIIIlIlllIll(final int n, final int n2) {
        switch (n2) {
            case 0: {
                return n;
            }
            case 1: {
                switch (n) {
                    case 0: {
                        return 2;
                    }
                    case 1: {
                        return 3;
                    }
                    case 2: {
                        return 1;
                    }
                    case 3: {
                        return 0;
                    }
                    default: {
                        return n;
                    }
                }
                break;
            }
            case 2: {
                switch (n) {
                    case 0: {
                        return 4;
                    }
                    case 1: {
                        return 5;
                    }
                    default: {
                        return n;
                    }
                    case 4: {
                        return 1;
                    }
                    case 5: {
                        return 0;
                    }
                }
                break;
            }
            default: {
                return n;
            }
        }
    }
    
    private static int IlIlIlIlIlllllllllIl(final int n, final int n2) {
        switch ((n2 & 0xC) >> 2) {
            case 1: {
                return 2;
            }
            case 2: {
                return 1;
            }
            default: {
                return 0;
            }
        }
    }
    
    private static int llIllIIIIIllIlIIIIlI(final int n, final int n2) {
        switch (n2) {
            case 3: {
                return 2;
            }
            case 4: {
                return 1;
            }
            default: {
                return 0;
            }
        }
    }
    
    private static IlIlIIIllIIllIlllllI llllIIIIlIIIlIlllIll(final lIIIlllIIIllIIIllIII liiIlllIIIllIIIllIII, final lIlIlIIIllIIllIIIllI lIlIlIIIllIIllIIIllI, final IllIIlllIIIIlllIIlIl illIIlllIIIIlllIIlIl, IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final int n) {
        if (liiIlllIIIllIIIllIII.IIIlIIlIIIIlllIlllII.length == 1) {
            return liiIlllIIIllIIIllIII.IIIlIIlIIIIlllIlllII[0];
        }
        final int n2 = n / liiIlllIIIllIIIllIII.IlIlIIIIIIlllIlIllIl * liiIlllIIIllIIIllIII.IlIlIIIIIIlllIlIllIl;
        if (liiIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI) {
            IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl2 = ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl();
            for (net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl = lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl2); llIIlIIIlIIIllIlIIIl.llIllIIIIIllIlIIIIlI() == illIIlllIIIIlllIIlIl.llIllIIIIIllIlIIIIlI(); llIIlIIIlIIIllIlIIIl = lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl2)) {
                ilIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl2;
                ilIlIlIlIlllllllllIl2 = ilIlIlIlIlllllllllIl2.IlIlIlIlIlllllllllIl();
                if (ilIlIlIlIlllllllllIl2.lIIIlllIIIllIIIllIII() < 0) {
                    break;
                }
            }
        }
        int llllIIIIlIIIlIlllIll = net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl, n2) & Integer.MAX_VALUE;
        for (int i = 0; i < liiIlllIIIllIIIllIII.lllIIIIlllllIlIIllIl; ++i) {
            llllIIIIlIIIlIlllIll = net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll);
        }
        int n3 = 0;
        if (liiIlllIIIllIIIllIII.IIlllIIlIllIllIlIIll == null) {
            n3 = llllIIIIlIIIlIlllIll % liiIlllIIIllIIIllIII.IIIlIIlIIIIlllIlllII.length;
        }
        else {
            final int n4 = llllIIIIlIIIlIlllIll % liiIlllIIIllIIIllIII.IlllllllIIIlIIIlIlII;
            final int[] ilIlIIIlIIlIlIIlllIl = liiIlllIIIllIIIllIII.IlIlIIIlIIlIlIIlllIl;
            for (int j = 0; j < ilIlIIIlIIlIlIIlllIl.length; ++j) {
                if (n4 < ilIlIIIlIIlIlIIlllIl[j]) {
                    n3 = j;
                    break;
                }
            }
        }
        return liiIlllIIIllIIIllIII.IIIlIIlIIIIlllIlllII[n3];
    }
    
    private static IlIlIIIllIIllIlllllI llllIIIIlIIIlIlllIll(final lIIIlllIIIllIIIllIII liiIlllIIIllIIIllIII) {
        return liiIlllIIIllIIIllIII.IIIlIIlIIIIlllIlllII[0];
    }
    
    private static IlIlIIIllIIllIlllllI llllIIIIlIIIlIlllIll(final lIIIlllIIIllIIIllIII liiIlllIIIllIIIllIII, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final int n) {
        if (liiIlllIIIllIIIllIII.IIIlIIlIIIIlllIlllII.length == 1) {
            return liiIlllIIIllIIIllIII.IIIlIIlIIIIlllIlllII[0];
        }
        final int liiiIlIIIIIlllIllIII = ilIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII();
        final int liiIlllIIIllIIIllIII2 = ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII();
        final int llIIlIIIlIIIllIlIIIl = ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl();
        int n2 = 0;
        int n3 = 0;
        switch (n) {
            case 0: {
                n2 = liiiIlIIIIIlllIllIII;
                n3 = -llIIlIIIlIIIllIlIIIl - 1;
                break;
            }
            case 1: {
                n2 = liiiIlIIIIIlllIllIII;
                n3 = llIIlIIIlIIIllIlIIIl;
                break;
            }
            case 2: {
                n2 = -liiiIlIIIIIlllIllIII - 1;
                n3 = -liiIlllIIIllIIIllIII2;
                break;
            }
            case 3: {
                n2 = liiiIlIIIIIlllIllIII;
                n3 = -liiIlllIIIllIIIllIII2;
                break;
            }
            case 4: {
                n2 = llIIlIIIlIIIllIlIIIl;
                n3 = -liiIlllIIIllIIIllIII2;
                break;
            }
            case 5: {
                n2 = -llIIlIIIlIIIllIlIIIl - 1;
                n3 = -liiIlllIIIllIIIllIII2;
                break;
            }
        }
        int n4 = n2 % liiIlllIIIllIIIllIII.llllIIllllIlIlIIIIll;
        int n5 = n3 % liiIlllIIIllIIIllIII.IlIllIlIlIIIlIlIlIII;
        if (n4 < 0) {
            n4 += liiIlllIIIllIIIllIII.llllIIllllIlIlIIIIll;
        }
        if (n5 < 0) {
            n5 += liiIlllIIIllIIIllIII.IlIllIlIlIIIlIlIlIII;
        }
        return liiIlllIIIllIIIllIII.IIIlIIlIIIIlllIlllII[n5 * liiIlllIIIllIIIllIII.llllIIllllIlIlIIIIll + n4];
    }
    
    private static IlIlIIIllIIllIlllllI llllIIIIlIIIlIlllIll(final lIIIlllIIIllIIIllIII liiIlllIIIllIIIllIII, final lIlIlIIIllIIllIIIllI lIlIlIIIllIIllIIIllI, final net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final int n, final int n2, final IlIlIIIllIIllIlllllI ilIlIIIllIIllIlllllI, final int n3, final llllIIIlIlllIlIIIIIl llllIIIlIlllIlIIIIIl) {
        return liiIlllIIIllIIIllIII.IIIlIIlIIIIlllIlllII[IlIlIlIlIlllllllllIl(liiIlllIIIllIIIllIII, lIlIlIIIllIIllIIIllI, llIIlIIIlIIIllIlIIIl, ilIlIlIlIlllllllllIl, n, n2, ilIlIIIllIIllIlllllI, n3, llllIIIlIlllIlIIIIIl)];
    }
    
    private static synchronized net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll[] llllIIIIlIIIlIlllIll(final lIIIlllIIIllIIIllIII liiIlllIIIllIIIllIII, final lIlIlIIIllIIllIIIllI lIlIlIIIllIIllIIIllI, final net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final int n, final int n2, final net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final int n3, final llllIIIlIlllIlIIIIIl llllIIIlIlllIlIIIIIl) {
        return net.optifine.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll(IlIlIlIlIlllllllllIl(liiIlllIIIllIIIllIII, lIlIlIIIllIIllIIIllI, llIIlIIIlIIIllIlIIIl, ilIlIlIlIlllllllllIl, n, n2, llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(), n3, llllIIIlIlllIlIIIIIl), liiIlllIIIllIIIllIII, n2, llllIIIIlIIIlIlllIll, llllIIIlIlllIlIIIIIl);
    }
    
    private static net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll[] IlIlIlIlIlllllllllIl(final lIIIlllIIIllIIIllIII liiIlllIIIllIIIllIII, final lIlIlIIIllIIllIIIllI lIlIlIIIllIIllIIIllI, final net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final int n, final int n2, final net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final int n3, final llllIIIlIlllIlIIIIIl llllIIIlIlllIlIIIIIl) {
        if (!llllIIIIlIIIlIlllIll.IlIlIIIllIIllIlllllI()) {
            return null;
        }
        final IlIlIIIllIIllIlllllI llllIIIIlIIIlIlllIll2 = llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll();
        final llIllIIIIIllIlIIIIlI[] ilIIIlIlIIIllIlIlIIl = IlIIIlIlIIIllIlIlIIl(n2, n);
        final boolean[] liiIlllIIIllIIIllIII2 = llllIIIlIlllIlIIIIIl.lIIIlllIIIllIIIllIII();
        for (int i = 0; i < 4; ++i) {
            liiIlllIIIllIIIllIII2[i] = llllIIIIlIIIlIlllIll(liiIlllIIIllIIIllIII, lIlIlIIIllIIllIIIllI, llIIlIIIlIIIllIlIIIl, ilIIIlIlIIIllIlIlIIl[i].llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl), n2, llllIIIIlIIIlIlllIll2, n3);
        }
        final net.optifine.IlIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI llllIIIIlIIIlIlllIll3 = llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll(liiIlllIIIllIIIllIII.llIIlllIIlllIIllIllI);
        net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll[] array;
        try {
            if (!liiIlllIIIllIIIllIII2[0] || !liiIlllIIIllIIIllIII2[1] || !liiIlllIIIllIIIllIII2[2] || !liiIlllIIIllIIIllIII2[3]) {
                if (liiIlllIIIllIIIllIII2[0] && liiIlllIIIllIIIllIII2[1] && liiIlllIIIllIIIllIII2[2]) {
                    llllIIIIlIIIlIlllIll3.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll(liiIlllIIIllIIIllIII.IIIlIIlIIIIlllIlllII[5], llllIIIIlIIIlIlllIll, liiIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII), liiIlllIIIllIIIllIII.lIllllllIIllIlIlIlII);
                    array = null;
                    return array;
                }
                if (liiIlllIIIllIIIllIII2[0] && liiIlllIIIllIIIllIII2[2] && liiIlllIIIllIIIllIII2[3]) {
                    llllIIIIlIIIlIlllIll3.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll(liiIlllIIIllIIIllIII.IIIlIIlIIIIlllIlllII[6], llllIIIIlIIIlIlllIll, liiIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII), liiIlllIIIllIIIllIII.lIllllllIIllIlIlIlII);
                    array = null;
                    return array;
                }
                if (liiIlllIIIllIIIllIII2[1] && liiIlllIIIllIIIllIII2[2] && liiIlllIIIllIIIllIII2[3]) {
                    llllIIIIlIIIlIlllIll3.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll(liiIlllIIIllIIIllIII.IIIlIIlIIIIlllIlllII[12], llllIIIIlIIIlIlllIll, liiIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII), liiIlllIIIllIIIllIII.lIllllllIIllIlIlIlII);
                    array = null;
                    return array;
                }
                if (liiIlllIIIllIIIllIII2[0] && liiIlllIIIllIIIllIII2[1] && liiIlllIIIllIIIllIII2[3]) {
                    llllIIIIlIIIlIlllIll3.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll(liiIlllIIIllIIIllIII.IIIlIIlIIIIlllIlllII[13], llllIIIIlIIIlIlllIll, liiIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII), liiIlllIIIllIIIllIII.lIllllllIIllIlIlIlII);
                    array = null;
                    return array;
                }
                final llIllIIIIIllIlIIIIlI[] ilIlIIIllIllIIIIIllI = IlIlIIIllIllIIIIIllI(n2, n);
                final boolean[] llIIlIIIlIIIllIlIIIl2 = llllIIIlIlllIlIIIIIl.llIIlIIIlIIIllIlIIIl();
                for (int j = 0; j < 4; ++j) {
                    llIIlIIIlIIIllIlIIIl2[j] = llllIIIIlIIIlIlllIll(liiIlllIIIllIIIllIII, lIlIlIIIllIIllIIIllI, llIIlIIIlIIIllIlIIIl, ilIlIIIllIllIIIIIllI[j].llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl), n2, llllIIIIlIIIlIlllIll2, n3);
                }
                if (liiIlllIIIllIIIllIII2[1] && liiIlllIIIllIIIllIII2[2]) {
                    llllIIIIlIIIlIlllIll3.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll(liiIlllIIIllIIIllIII.IIIlIIlIIIIlllIlllII[3], llllIIIIlIIIlIlllIll, liiIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII), liiIlllIIIllIIIllIII.lIllllllIIllIlIlIlII);
                    if (llIIlIIIlIIIllIlIIIl2[3]) {
                        llllIIIIlIIIlIlllIll3.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll(liiIlllIIIllIIIllIII.IIIlIIlIIIIlllIlllII[16], llllIIIIlIIIlIlllIll, liiIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII), liiIlllIIIllIIIllIII.lIllllllIIllIlIlIlII);
                    }
                    return null;
                }
                if (liiIlllIIIllIIIllIII2[0] && liiIlllIIIllIIIllIII2[2]) {
                    llllIIIIlIIIlIlllIll3.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll(liiIlllIIIllIIIllIII.IIIlIIlIIIIlllIlllII[4], llllIIIIlIIIlIlllIll, liiIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII), liiIlllIIIllIIIllIII.lIllllllIIllIlIlIlII);
                    if (llIIlIIIlIIIllIlIIIl2[2]) {
                        llllIIIIlIIIlIlllIll3.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll(liiIlllIIIllIIIllIII.IIIlIIlIIIIlllIlllII[14], llllIIIIlIIIlIlllIll, liiIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII), liiIlllIIIllIIIllIII.lIllllllIIllIlIlIlII);
                    }
                    return null;
                }
                if (liiIlllIIIllIIIllIII2[1] && liiIlllIIIllIIIllIII2[3]) {
                    llllIIIIlIIIlIlllIll3.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll(liiIlllIIIllIIIllIII.IIIlIIlIIIIlllIlllII[10], llllIIIIlIIIlIlllIll, liiIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII), liiIlllIIIllIIIllIII.lIllllllIIllIlIlIlII);
                    if (llIIlIIIlIIIllIlIIIl2[1]) {
                        llllIIIIlIIIlIlllIll3.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll(liiIlllIIIllIIIllIII.IIIlIIlIIIIlllIlllII[2], llllIIIIlIIIlIlllIll, liiIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII), liiIlllIIIllIIIllIII.lIllllllIIllIlIlIlII);
                    }
                    return null;
                }
                if (liiIlllIIIllIIIllIII2[0] && liiIlllIIIllIIIllIII2[3]) {
                    llllIIIIlIIIlIlllIll3.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll(liiIlllIIIllIIIllIII.IIIlIIlIIIIlllIlllII[11], llllIIIIlIIIlIlllIll, liiIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII), liiIlllIIIllIIIllIII.lIllllllIIllIlIlIlII);
                    if (llIIlIIIlIIIllIlIIIl2[0]) {
                        llllIIIIlIIIlIlllIll3.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll(liiIlllIIIllIIIllIII.IIIlIIlIIIIlllIlllII[0], llllIIIIlIIIlIlllIll, liiIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII), liiIlllIIIllIIIllIII.lIllllllIIllIlIlIlII);
                    }
                    return null;
                }
                final boolean[] llIllIlIIIIllIlIIllI = llllIIIlIlllIlIIIIIl.llIllIlIIIIllIlIIllI();
                for (int k = 0; k < 4; ++k) {
                    llIllIlIIIIllIlIIllI[k] = IlIlIlIlIlllllllllIl(liiIlllIIIllIIIllIII, lIlIlIIIllIIllIIIllI, llIIlIIIlIIIllIlIIIl, ilIIIlIlIIIllIlIlIIl[k].llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl), n2, llllIIIIlIIIlIlllIll2, n3);
                }
                if (liiIlllIIIllIIIllIII2[0]) {
                    llllIIIIlIIIlIlllIll3.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll(liiIlllIIIllIIIllIII.IIIlIIlIIIIlllIlllII[9], llllIIIIlIIIlIlllIll, liiIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII), liiIlllIIIllIIIllIII.lIllllllIIllIlIlIlII);
                }
                if (liiIlllIIIllIIIllIII2[1]) {
                    llllIIIIlIIIlIlllIll3.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll(liiIlllIIIllIIIllIII.IIIlIIlIIIIlllIlllII[7], llllIIIIlIIIlIlllIll, liiIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII), liiIlllIIIllIIIllIII.lIllllllIIllIlIlIlII);
                }
                if (liiIlllIIIllIIIllIII2[2]) {
                    llllIIIIlIIIlIlllIll3.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll(liiIlllIIIllIIIllIII.IIIlIIlIIIIlllIlllII[1], llllIIIIlIIIlIlllIll, liiIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII), liiIlllIIIllIIIllIII.lIllllllIIllIlIlIlII);
                }
                if (liiIlllIIIllIIIllIII2[3]) {
                    llllIIIIlIIIlIlllIll3.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll(liiIlllIIIllIIIllIII.IIIlIIlIIIIlllIlllII[15], llllIIIIlIIIlIlllIll, liiIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII), liiIlllIIIllIIIllIII.lIllllllIIllIlIlIlII);
                }
                if (llIIlIIIlIIIllIlIIIl2[0] && (llIllIlIIIIllIlIIllI[1] || llIllIlIIIIllIlIIllI[2]) && !liiIlllIIIllIIIllIII2[1] && !liiIlllIIIllIIIllIII2[2]) {
                    llllIIIIlIIIlIlllIll3.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll(liiIlllIIIllIIIllIII.IIIlIIlIIIIlllIlllII[0], llllIIIIlIIIlIlllIll, liiIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII), liiIlllIIIllIIIllIII.lIllllllIIllIlIlIlII);
                }
                if (llIIlIIIlIIIllIlIIIl2[1] && (llIllIlIIIIllIlIIllI[0] || llIllIlIIIIllIlIIllI[2]) && !liiIlllIIIllIIIllIII2[0] && !liiIlllIIIllIIIllIII2[2]) {
                    llllIIIIlIIIlIlllIll3.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll(liiIlllIIIllIIIllIII.IIIlIIlIIIIlllIlllII[2], llllIIIIlIIIlIlllIll, liiIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII), liiIlllIIIllIIIllIII.lIllllllIIllIlIlIlII);
                }
                if (llIIlIIIlIIIllIlIIIl2[2] && (llIllIlIIIIllIlIIllI[1] || llIllIlIIIIllIlIIllI[3]) && !liiIlllIIIllIIIllIII2[1] && !liiIlllIIIllIIIllIII2[3]) {
                    llllIIIIlIIIlIlllIll3.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll(liiIlllIIIllIIIllIII.IIIlIIlIIIIlllIlllII[14], llllIIIIlIIIlIlllIll, liiIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII), liiIlllIIIllIIIllIII.lIllllllIIllIlIlIlII);
                }
                if (llIIlIIIlIIIllIlIIIl2[3] && (llIllIlIIIIllIlIIllI[0] || llIllIlIIIIllIlIIllI[3]) && !liiIlllIIIllIIIllIII2[0] && !liiIlllIIIllIIIllIII2[3]) {
                    llllIIIIlIIIlIlllIll3.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll(liiIlllIIIllIIIllIII.IIIlIIlIIIIlllIlllII[16], llllIIIIlIIIlIlllIll, liiIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII), liiIlllIIIllIIIllIII.lIllllllIIllIlIlIlII);
                }
                return null;
            }
            else {
                llllIIIIlIIIlIlllIll3.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll(liiIlllIIIllIIIllIII.IIIlIIlIIIIlllIlllII[8], llllIIIIlIIIlIlllIll, liiIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII), liiIlllIIIllIIIllIII.lIllllllIIllIlIlIlII);
                array = null;
            }
        }
        finally {
            if (llllIIIIlIIIlIlllIll3.llllIIIIlIIIlIlllIll() > 0) {
                llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll(true);
            }
        }
        if (llllIIIIlIIIlIlllIll3.llllIIIIlIIIlIlllIll() > 0) {
            llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll(true);
        }
        return array;
    }
    
    private static net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll[] llllIIIIlIIIlIlllIll(final lIIIlllIIIllIIIllIII liiIlllIIIllIIIllIII, final net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final llllIIIlIlllIlIIIIIl llllIIIlIlllIlIIIIIl) {
        if (!llllIIIIlIIIlIlllIll.IlIlIIIllIIllIlllllI()) {
            return null;
        }
        final net.optifine.IlIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI llllIIIIlIIIlIlllIll2 = llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll(liiIlllIIIllIIIllIII.llIIlllIIlllIIllIllI);
        net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll[] array;
        try {
            final IlIlIIIllIIllIlllllI llllIIIIlIIIlIlllIll3 = llllIIIIlIIIlIlllIll(liiIlllIIIllIIIllIII);
            if (llllIIIIlIIIlIlllIll3 != null) {
                llllIIIIlIIIlIlllIll2.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll3, llllIIIIlIIIlIlllIll, liiIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII), liiIlllIIIllIIIllIII.lIllllllIIllIlIlIlII);
            }
            array = null;
        }
        finally {
            if (llllIIIIlIIIlIlllIll2.llllIIIIlIIIlIlllIll() > 0) {
                llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll(true);
            }
        }
        if (llllIIIIlIIIlIlllIll2.llllIIIIlIIIlIlllIll() > 0) {
            llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll(true);
        }
        return array;
    }
    
    private static net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll[] llllIIIIlIIIlIlllIll(final lIIIlllIIIllIIIllIII liiIlllIIIllIIIllIII, final lIlIlIIIllIIllIIIllI lIlIlIIIllIIllIIIllI, final IllIIlllIIIIlllIIlIl illIIlllIIIIlllIIlIl, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final int n, final net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final llllIIIlIlllIlIIIIIl llllIIIlIlllIlIIIIIl) {
        if (!llllIIIIlIIIlIlllIll.IlIlIIIllIIllIlllllI()) {
            return null;
        }
        final net.optifine.IlIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI llllIIIIlIIIlIlllIll2 = llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll(liiIlllIIIllIIIllIII.llIIlllIIlllIIllIllI);
        net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll[] array;
        try {
            final IlIlIIIllIIllIlllllI llllIIIIlIIIlIlllIll3 = llllIIIIlIIIlIlllIll(liiIlllIIIllIIIllIII, lIlIlIIIllIIllIIIllI, illIIlllIIIIlllIIlIl, ilIlIlIlIlllllllllIl, n);
            if (llllIIIIlIIIlIlllIll3 != null) {
                llllIIIIlIIIlIlllIll2.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll3, llllIIIIlIIIlIlllIll, liiIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII), liiIlllIIIllIIIllIII.lIllllllIIllIlIlIlII);
            }
            array = null;
        }
        finally {
            if (llllIIIIlIIIlIlllIll2.llllIIIIlIIIlIlllIll() > 0) {
                llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll(true);
            }
        }
        if (llllIIIIlIIIlIlllIll2.llllIIIIlIIIlIlllIll() > 0) {
            llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll(true);
        }
        return array;
    }
    
    private static net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll[] llllIIIIlIIIlIlllIll(final lIIIlllIIIllIIIllIII liiIlllIIIllIIIllIII, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final int n, final net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final llllIIIlIlllIlIIIIIl llllIIIlIlllIlIIIIIl) {
        if (!llllIIIIlIIIlIlllIll.IlIlIIIllIIllIlllllI()) {
            return null;
        }
        final net.optifine.IlIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI llllIIIIlIIIlIlllIll2 = llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll(liiIlllIIIllIIIllIII.llIIlllIIlllIIllIllI);
        net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll[] array;
        try {
            final IlIlIIIllIIllIlllllI llllIIIIlIIIlIlllIll3 = llllIIIIlIIIlIlllIll(liiIlllIIIllIIIllIII, ilIlIlIlIlllllllllIl, n);
            if (llllIIIIlIIIlIlllIll3 != null) {
                llllIIIIlIIIlIlllIll2.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll3, llllIIIIlIIIlIlllIll, liiIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII), liiIlllIIIllIIIllIII.lIllllllIIllIlIlIlII);
            }
            array = null;
        }
        finally {
            if (llllIIIIlIIIlIlllIll2.llllIIIIlIIIlIlllIll() > 0) {
                llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll(true);
            }
        }
        if (llllIIIIlIIIlIlllIll2.llllIIIIlIIIlIlllIll() > 0) {
            llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll(true);
        }
        return array;
    }
    
    private static net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll[] llIllIIIIIllIlIIIIlI(final lIIIlllIIIllIIIllIII liiIlllIIIllIIIllIII, final lIlIlIIIllIIllIIIllI lIlIlIIIllIIllIIIllI, final net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final int n, final int n2, final net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final int n3, final llllIIIlIlllIlIIIIIl llllIIIlIlllIlIIIIIl) {
        if (!llllIIIIlIIIlIlllIll.IlIlIIIllIIllIlllllI()) {
            return null;
        }
        final net.optifine.IlIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI llllIIIIlIIIlIlllIll2 = llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll(liiIlllIIIllIIIllIII.llIIlllIIlllIIllIllI);
        net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll[] array;
        try {
            final IlIlIIIllIIllIlllllI llllIIIIlIIIlIlllIll3 = llllIIIIlIIIlIlllIll(liiIlllIIIllIIIllIII, lIlIlIIIllIIllIIIllI, llIIlIIIlIIIllIlIIIl, ilIlIlIlIlllllllllIl, n, n2, llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(), n3, llllIIIlIlllIlIIIIIl);
            if (llllIIIIlIIIlIlllIll3 != null) {
                llllIIIIlIIIlIlllIll2.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll3, llllIIIIlIIIlIlllIll, liiIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII), liiIlllIIIllIIIllIII.lIllllllIIllIlIlIlII);
            }
            array = null;
        }
        finally {
            if (llllIIIIlIIIlIlllIll2.llllIIIIlIIIlIlllIll() > 0) {
                llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll(true);
            }
        }
        if (llllIIIIlIIIlIlllIll2.llllIIIIlIIIlIlllIll() > 0) {
            llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll(true);
        }
        return array;
    }
    
    private static llIllIIIIIllIlIIIIlI[] IlIIIlIlIIIllIlIlIIl(final int n, final int n2) {
        switch (n) {
            case 0: {
                return net.optifine.llIIlIIIlIIIllIlIIIl.IIllIIllIIIlIlIIIIlI;
            }
            case 1: {
                return net.optifine.llIIlIIIlIIIllIlIIIl.IIIlIIIlIlIIlllIIlll;
            }
            case 2: {
                if (n2 == 1) {
                    return net.optifine.llIIlIIIlIIIllIlIIIl.IlIlIllllllllIIIIlII;
                }
                return net.optifine.llIIlIIIlIIIllIlIIIl.IlIlIIIlIIlIlIIlllIl;
            }
            case 3: {
                return net.optifine.llIIlIIIlIIIllIlIIIl.IlllllllIIIlIIIlIlII;
            }
            case 4: {
                return net.optifine.llIIlIIIlIIIllIlIIIl.IIlIIIIlllIlllllIlII;
            }
            case 5: {
                if (n2 == 2) {
                    return net.optifine.llIIlIIIlIIIllIlIIIl.IIlllIlIIllIlIlIlIIl;
                }
                return net.optifine.llIIlIIIlIIIllIlIIIl.IIIlIIlIIIIlllIlllII;
            }
            default: {
                throw new IllegalArgumentException("Unknown side: " + n);
            }
        }
    }
    
    private static llIllIIIIIllIlIIIIlI[] IlIlIIIllIllIIIIIllI(final int n, final int n2) {
        switch (n) {
            case 0: {
                return net.optifine.llIIlIIIlIIIllIlIIIl.llIIIlIlIllIIlIlIlII;
            }
            case 1: {
                return net.optifine.llIIlIIIlIIIllIlIIIl.lllllIlIIIlIlIIlllII;
            }
            case 2: {
                if (n2 == 1) {
                    return net.optifine.llIIlIIIlIIIllIlIIIl.llllllIllIllIlIllllI;
                }
                return net.optifine.llIIlIIIlIIIllIlIIIl.lIllllllIIllIlIlIlII;
            }
            case 3: {
                return net.optifine.llIIlIIIlIIIllIlIIIl.llIIlllIIlllIIllIllI;
            }
            case 4: {
                return net.optifine.llIIlIIIlIIIllIlIIIl.IIlllIIIlIlllIIlllII;
            }
            case 5: {
                if (n2 == 2) {
                    return net.optifine.llIIlIIIlIIIllIlIIIl.IIIllllllIllIIIlllIl;
                }
                return net.optifine.llIIlIIIlIIIllIlIIIl.IIlIIIIIllIlIIIlIIll;
            }
            default: {
                throw new IllegalArgumentException("Unknown side: " + n);
            }
        }
    }
    
    protected static Map[][] llllIIIIlIIIlIlllIll() {
        return net.optifine.llIIlIIIlIIIllIlIIIl.lIlIlIIIllIIllIIIllI;
    }
    
    private static int IlIlIlIlIlllllllllIl(final lIIIlllIIIllIIIllIII liiIlllIIIllIIIllIII, final lIlIlIIIllIIllIIIllI lIlIlIIIllIIllIIIllI, final net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final int n, final int n2, final IlIlIIIllIIllIlllllI ilIlIIIllIIllIlllllI, final int n3, final llllIIIlIlllIlIIIIIl llllIIIlIlllIlIIIIIl) {
        final boolean[] liiIlllIIIllIIIllIII2 = llllIIIlIlllIlIIIIIl.lIIIlllIIIllIIIllIII();
        switch (n2) {
            case 0: {
                liiIlllIIIllIIIllIII2[0] = llIllIIIIIllIlIIIIlI(liiIlllIIIllIIIllIII, lIlIlIIIllIIllIIIllI, llIIlIIIlIIIllIlIIIl, ilIlIlIlIlllllllllIl.IlIlIIIllIllIIIIIllI(), n2, ilIlIIIllIIllIlllllI, n3);
                liiIlllIIIllIIIllIII2[1] = llIllIIIIIllIlIIIIlI(liiIlllIIIllIIIllIII, lIlIlIIIllIIllIIIllI, llIIlIIIlIIIllIlIIIl, ilIlIlIlIlllllllllIl.IllIIlllIIIIlllIIlIl(), n2, ilIlIIIllIIllIlllllI, n3);
                liiIlllIIIllIIIllIII2[2] = llIllIIIIIllIlIIIIlI(liiIlllIIIllIIIllIII, lIlIlIIIllIIllIIIllI, llIIlIIIlIIIllIlIIIl, ilIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI(), n2, ilIlIIIllIIllIlllllI, n3);
                liiIlllIIIllIIIllIII2[3] = llIllIIIIIllIlIIIIlI(liiIlllIIIllIIIllIII, lIlIlIIIllIIllIIIllI, llIIlIIIlIIIllIlIIIl, ilIlIlIlIlllllllllIl.IlIIIlIlIIIllIlIlIIl(), n2, ilIlIIIllIIllIlllllI, n3);
                if (liiIlllIIIllIIIllIII.IlIlIIIllIIllIlllllI) {
                    final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl2 = ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl();
                    liiIlllIIIllIIIllIII2[0] = (liiIlllIIIllIIIllIII2[0] && !llIllIIIIIllIlIIIIlI(liiIlllIIIllIIIllIII, lIlIlIIIllIIllIIIllI, llIIlIIIlIIIllIlIIIl, ilIlIlIlIlllllllllIl2.IlIlIIIllIllIIIIIllI(), n2, ilIlIIIllIIllIlllllI, n3));
                    liiIlllIIIllIIIllIII2[1] = (liiIlllIIIllIIIllIII2[1] && !llIllIIIIIllIlIIIIlI(liiIlllIIIllIIIllIII, lIlIlIIIllIIllIIIllI, llIIlIIIlIIIllIlIIIl, ilIlIlIlIlllllllllIl2.IllIIlllIIIIlllIIlIl(), n2, ilIlIIIllIIllIlllllI, n3));
                    liiIlllIIIllIIIllIII2[2] = (liiIlllIIIllIIIllIII2[2] && !llIllIIIIIllIlIIIIlI(liiIlllIIIllIIIllIII, lIlIlIIIllIIllIIIllI, llIIlIIIlIIIllIlIIIl, ilIlIlIlIlllllllllIl2.llIllIIIIIllIlIIIIlI(), n2, ilIlIIIllIIllIlllllI, n3));
                    liiIlllIIIllIIIllIII2[3] = (liiIlllIIIllIIIllIII2[3] && !llIllIIIIIllIlIIIIlI(liiIlllIIIllIIIllIII, lIlIlIIIllIIllIIIllI, llIIlIIIlIIIllIlIIIl, ilIlIlIlIlllllllllIl2.IlIIIlIlIIIllIlIlIIl(), n2, ilIlIIIllIIllIlllllI, n3));
                    break;
                }
                break;
            }
            case 1: {
                liiIlllIIIllIIIllIII2[0] = llIllIIIIIllIlIIIIlI(liiIlllIIIllIIIllIII, lIlIlIIIllIIllIIIllI, llIIlIIIlIIIllIlIIIl, ilIlIlIlIlllllllllIl.IlIlIIIllIllIIIIIllI(), n2, ilIlIIIllIIllIlllllI, n3);
                liiIlllIIIllIIIllIII2[1] = llIllIIIIIllIlIIIIlI(liiIlllIIIllIIIllIII, lIlIlIIIllIIllIIIllI, llIIlIIIlIIIllIlIIIl, ilIlIlIlIlllllllllIl.IllIIlllIIIIlllIIlIl(), n2, ilIlIIIllIIllIlllllI, n3);
                liiIlllIIIllIIIllIII2[2] = llIllIIIIIllIlIIIIlI(liiIlllIIIllIIIllIII, lIlIlIIIllIIllIIIllI, llIIlIIIlIIIllIlIIIl, ilIlIlIlIlllllllllIl.IlIIIlIlIIIllIlIlIIl(), n2, ilIlIIIllIIllIlllllI, n3);
                liiIlllIIIllIIIllIII2[3] = llIllIIIIIllIlIIIIlI(liiIlllIIIllIIIllIII, lIlIlIIIllIIllIIIllI, llIIlIIIlIIIllIlIIIl, ilIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI(), n2, ilIlIIIllIIllIlllllI, n3);
                if (liiIlllIIIllIIIllIII.IlIlIIIllIIllIlllllI) {
                    final IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll = ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll();
                    liiIlllIIIllIIIllIII2[0] = (liiIlllIIIllIIIllIII2[0] && !llIllIIIIIllIlIIIIlI(liiIlllIIIllIIIllIII, lIlIlIIIllIIllIIIllI, llIIlIIIlIIIllIlIIIl, llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI(), n2, ilIlIIIllIIllIlllllI, n3));
                    liiIlllIIIllIIIllIII2[1] = (liiIlllIIIllIIIllIII2[1] && !llIllIIIIIllIlIIIIlI(liiIlllIIIllIIIllIII, lIlIlIIIllIIllIIIllI, llIIlIIIlIIIllIlIIIl, llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl(), n2, ilIlIIIllIIllIlllllI, n3));
                    liiIlllIIIllIIIllIII2[2] = (liiIlllIIIllIIIllIII2[2] && !llIllIIIIIllIlIIIIlI(liiIlllIIIllIIIllIII, lIlIlIIIllIIllIIIllI, llIIlIIIlIIIllIlIIIl, llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl(), n2, ilIlIIIllIIllIlllllI, n3));
                    liiIlllIIIllIIIllIII2[3] = (liiIlllIIIllIIIllIII2[3] && !llIllIIIIIllIlIIIIlI(liiIlllIIIllIIIllIII, lIlIlIIIllIIllIIIllI, llIIlIIIlIIIllIlIIIl, llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI(), n2, ilIlIIIllIIllIlllllI, n3));
                    break;
                }
                break;
            }
            case 2: {
                liiIlllIIIllIIIllIII2[0] = llIllIIIIIllIlIIIIlI(liiIlllIIIllIIIllIII, lIlIlIIIllIIllIIIllI, llIIlIIIlIIIllIlIIIl, ilIlIlIlIlllllllllIl.IllIIlllIIIIlllIIlIl(), n2, ilIlIIIllIIllIlllllI, n3);
                liiIlllIIIllIIIllIII2[1] = llIllIIIIIllIlIIIIlI(liiIlllIIIllIIIllIII, lIlIlIIIllIIllIIIllI, llIIlIIIlIIIllIlIIIl, ilIlIlIlIlllllllllIl.IlIlIIIllIllIIIIIllI(), n2, ilIlIIIllIIllIlllllI, n3);
                liiIlllIIIllIIIllIII2[2] = llIllIIIIIllIlIIIIlI(liiIlllIIIllIIIllIII, lIlIlIIIllIIllIIIllI, llIIlIIIlIIIllIlIIIl, ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl(), n2, ilIlIIIllIIllIlllllI, n3);
                liiIlllIIIllIIIllIII2[3] = llIllIIIIIllIlIIIIlI(liiIlllIIIllIIIllIII, lIlIlIIIllIIllIIIllI, llIIlIIIlIIIllIlIIIl, ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(), n2, ilIlIIIllIIllIlllllI, n3);
                if (liiIlllIIIllIIIllIII.IlIlIIIllIIllIlllllI) {
                    final IlIlIlIlIlllllllllIl llIllIIIIIllIlIIIIlI = ilIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI();
                    liiIlllIIIllIIIllIII2[0] = (liiIlllIIIllIIIllIII2[0] && !llIllIIIIIllIlIIIIlI(liiIlllIIIllIIIllIII, lIlIlIIIllIIllIIIllI, llIIlIIIlIIIllIlIIIl, llIllIIIIIllIlIIIIlI.IllIIlllIIIIlllIIlIl(), n2, ilIlIIIllIIllIlllllI, n3));
                    liiIlllIIIllIIIllIII2[1] = (liiIlllIIIllIIIllIII2[1] && !llIllIIIIIllIlIIIIlI(liiIlllIIIllIIIllIII, lIlIlIIIllIIllIIIllI, llIIlIIIlIIIllIlIIIl, llIllIIIIIllIlIIIIlI.IlIlIIIllIllIIIIIllI(), n2, ilIlIIIllIIllIlllllI, n3));
                    liiIlllIIIllIIIllIII2[2] = (liiIlllIIIllIIIllIII2[2] && !llIllIIIIIllIlIIIIlI(liiIlllIIIllIIIllIII, lIlIlIIIllIIllIIIllI, llIIlIIIlIIIllIlIIIl, llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(), n2, ilIlIIIllIIllIlllllI, n3));
                    liiIlllIIIllIIIllIII2[3] = (liiIlllIIIllIIIllIII2[3] && !llIllIIIIIllIlIIIIlI(liiIlllIIIllIIIllIII, lIlIlIIIllIIllIIIllI, llIIlIIIlIIIllIlIIIl, llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(), n2, ilIlIIIllIIllIlllllI, n3));
                }
                if (n == 1) {
                    llllIIIIlIIIlIlllIll(0, 1, liiIlllIIIllIIIllIII2);
                    llllIIIIlIIIlIlllIll(2, 3, liiIlllIIIllIIIllIII2);
                    break;
                }
                break;
            }
            case 3: {
                liiIlllIIIllIIIllIII2[0] = llIllIIIIIllIlIIIIlI(liiIlllIIIllIIIllIII, lIlIlIIIllIIllIIIllI, llIIlIIIlIIIllIlIIIl, ilIlIlIlIlllllllllIl.IlIlIIIllIllIIIIIllI(), n2, ilIlIIIllIIllIlllllI, n3);
                liiIlllIIIllIIIllIII2[1] = llIllIIIIIllIlIIIIlI(liiIlllIIIllIIIllIII, lIlIlIIIllIIllIIIllI, llIIlIIIlIIIllIlIIIl, ilIlIlIlIlllllllllIl.IllIIlllIIIIlllIIlIl(), n2, ilIlIIIllIIllIlllllI, n3);
                liiIlllIIIllIIIllIII2[2] = llIllIIIIIllIlIIIIlI(liiIlllIIIllIIIllIII, lIlIlIIIllIIllIIIllI, llIIlIIIlIIIllIlIIIl, ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl(), n2, ilIlIIIllIIllIlllllI, n3);
                liiIlllIIIllIIIllIII2[3] = llIllIIIIIllIlIIIIlI(liiIlllIIIllIIIllIII, lIlIlIIIllIIllIIIllI, llIIlIIIlIIIllIlIIIl, ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(), n2, ilIlIIIllIIllIlllllI, n3);
                if (liiIlllIIIllIIIllIII.IlIlIIIllIIllIlllllI) {
                    final IlIlIlIlIlllllllllIl ilIIIlIlIIIllIlIlIIl = ilIlIlIlIlllllllllIl.IlIIIlIlIIIllIlIlIIl();
                    liiIlllIIIllIIIllIII2[0] = (liiIlllIIIllIIIllIII2[0] && !llIllIIIIIllIlIIIIlI(liiIlllIIIllIIIllIII, lIlIlIIIllIIllIIIllI, llIIlIIIlIIIllIlIIIl, ilIIIlIlIIIllIlIlIIl.IlIlIIIllIllIIIIIllI(), n2, ilIlIIIllIIllIlllllI, n3));
                    liiIlllIIIllIIIllIII2[1] = (liiIlllIIIllIIIllIII2[1] && !llIllIIIIIllIlIIIIlI(liiIlllIIIllIIIllIII, lIlIlIIIllIIllIIIllI, llIIlIIIlIIIllIlIIIl, ilIIIlIlIIIllIlIlIIl.IllIIlllIIIIlllIIlIl(), n2, ilIlIIIllIIllIlllllI, n3));
                    liiIlllIIIllIIIllIII2[2] = (liiIlllIIIllIIIllIII2[2] && !llIllIIIIIllIlIIIIlI(liiIlllIIIllIIIllIII, lIlIlIIIllIIllIIIllI, llIIlIIIlIIIllIlIIIl, ilIIIlIlIIIllIlIlIIl.IlIlIlIlIlllllllllIl(), n2, ilIlIIIllIIllIlllllI, n3));
                    liiIlllIIIllIIIllIII2[3] = (liiIlllIIIllIIIllIII2[3] && !llIllIIIIIllIlIIIIlI(liiIlllIIIllIIIllIII, lIlIlIIIllIIllIIIllI, llIIlIIIlIIIllIlIIIl, ilIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(), n2, ilIlIIIllIIllIlllllI, n3));
                    break;
                }
                break;
            }
            case 4: {
                liiIlllIIIllIIIllIII2[0] = llIllIIIIIllIlIIIIlI(liiIlllIIIllIIIllIII, lIlIlIIIllIIllIIIllI, llIIlIIIlIIIllIlIIIl, ilIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI(), n2, ilIlIIIllIIllIlllllI, n3);
                liiIlllIIIllIIIllIII2[1] = llIllIIIIIllIlIIIIlI(liiIlllIIIllIIIllIII, lIlIlIIIllIIllIIIllI, llIIlIIIlIIIllIlIIIl, ilIlIlIlIlllllllllIl.IlIIIlIlIIIllIlIlIIl(), n2, ilIlIIIllIIllIlllllI, n3);
                liiIlllIIIllIIIllIII2[2] = llIllIIIIIllIlIIIIlI(liiIlllIIIllIIIllIII, lIlIlIIIllIIllIIIllI, llIIlIIIlIIIllIlIIIl, ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl(), n2, ilIlIIIllIIllIlllllI, n3);
                liiIlllIIIllIIIllIII2[3] = llIllIIIIIllIlIIIIlI(liiIlllIIIllIIIllIII, lIlIlIIIllIIllIIIllI, llIIlIIIlIIIllIlIIIl, ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(), n2, ilIlIIIllIIllIlllllI, n3);
                if (liiIlllIIIllIIIllIII.IlIlIIIllIIllIlllllI) {
                    final IlIlIlIlIlllllllllIl ilIlIIIllIllIIIIIllI = ilIlIlIlIlllllllllIl.IlIlIIIllIllIIIIIllI();
                    liiIlllIIIllIIIllIII2[0] = (liiIlllIIIllIIIllIII2[0] && !llIllIIIIIllIlIIIIlI(liiIlllIIIllIIIllIII, lIlIlIIIllIIllIIIllI, llIIlIIIlIIIllIlIIIl, ilIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI(), n2, ilIlIIIllIIllIlllllI, n3));
                    liiIlllIIIllIIIllIII2[1] = (liiIlllIIIllIIIllIII2[1] && !llIllIIIIIllIlIIIIlI(liiIlllIIIllIIIllIII, lIlIlIIIllIIllIIIllI, llIIlIIIlIIIllIlIIIl, ilIlIIIllIllIIIIIllI.IlIIIlIlIIIllIlIlIIl(), n2, ilIlIIIllIIllIlllllI, n3));
                    liiIlllIIIllIIIllIII2[2] = (liiIlllIIIllIIIllIII2[2] && !llIllIIIIIllIlIIIIlI(liiIlllIIIllIIIllIII, lIlIlIIIllIIllIIIllI, llIIlIIIlIIIllIlIIIl, ilIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl(), n2, ilIlIIIllIIllIlllllI, n3));
                    liiIlllIIIllIIIllIII2[3] = (liiIlllIIIllIIIllIII2[3] && !llIllIIIIIllIlIIIIlI(liiIlllIIIllIIIllIII, lIlIlIIIllIIllIIIllI, llIIlIIIlIIIllIlIIIl, ilIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll(), n2, ilIlIIIllIIllIlllllI, n3));
                    break;
                }
                break;
            }
            case 5: {
                liiIlllIIIllIIIllIII2[0] = llIllIIIIIllIlIIIIlI(liiIlllIIIllIIIllIII, lIlIlIIIllIIllIIIllI, llIIlIIIlIIIllIlIIIl, ilIlIlIlIlllllllllIl.IlIIIlIlIIIllIlIlIIl(), n2, ilIlIIIllIIllIlllllI, n3);
                liiIlllIIIllIIIllIII2[1] = llIllIIIIIllIlIIIIlI(liiIlllIIIllIIIllIII, lIlIlIIIllIIllIIIllI, llIIlIIIlIIIllIlIIIl, ilIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI(), n2, ilIlIIIllIIllIlllllI, n3);
                liiIlllIIIllIIIllIII2[2] = llIllIIIIIllIlIIIIlI(liiIlllIIIllIIIllIII, lIlIlIIIllIIllIIIllI, llIIlIIIlIIIllIlIIIl, ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl(), n2, ilIlIIIllIIllIlllllI, n3);
                liiIlllIIIllIIIllIII2[3] = llIllIIIIIllIlIIIIlI(liiIlllIIIllIIIllIII, lIlIlIIIllIIllIIIllI, llIIlIIIlIIIllIlIIIl, ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(), n2, ilIlIIIllIIllIlllllI, n3);
                if (liiIlllIIIllIIIllIII.IlIlIIIllIIllIlllllI) {
                    final IlIlIlIlIlllllllllIl illIIlllIIIIlllIIlIl = ilIlIlIlIlllllllllIl.IllIIlllIIIIlllIIlIl();
                    liiIlllIIIllIIIllIII2[0] = (liiIlllIIIllIIIllIII2[0] && !llIllIIIIIllIlIIIIlI(liiIlllIIIllIIIllIII, lIlIlIIIllIIllIIIllI, llIIlIIIlIIIllIlIIIl, illIIlllIIIIlllIIlIl.IlIIIlIlIIIllIlIlIIl(), n2, ilIlIIIllIIllIlllllI, n3));
                    liiIlllIIIllIIIllIII2[1] = (liiIlllIIIllIIIllIII2[1] && !llIllIIIIIllIlIIIIlI(liiIlllIIIllIIIllIII, lIlIlIIIllIIllIIIllI, llIIlIIIlIIIllIlIIIl, illIIlllIIIIlllIIlIl.llIllIIIIIllIlIIIIlI(), n2, ilIlIIIllIIllIlllllI, n3));
                    liiIlllIIIllIIIllIII2[2] = (liiIlllIIIllIIIllIII2[2] && !llIllIIIIIllIlIIIIlI(liiIlllIIIllIIIllIII, lIlIlIIIllIIllIIIllI, llIIlIIIlIIIllIlIIIl, illIIlllIIIIlllIIlIl.IlIlIlIlIlllllllllIl(), n2, ilIlIIIllIIllIlllllI, n3));
                    liiIlllIIIllIIIllIII2[3] = (liiIlllIIIllIIIllIII2[3] && !llIllIIIIIllIlIIIIlI(liiIlllIIIllIIIllIII, lIlIlIIIllIIllIIIllI, llIIlIIIlIIIllIlIIIl, illIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll(), n2, ilIlIIIllIIllIlllllI, n3));
                }
                if (n == 2) {
                    llllIIIIlIIIlIlllIll(0, 1, liiIlllIIIllIIIllIII2);
                    llllIIIIlIIIlIlllIll(2, 3, liiIlllIIIllIIIllIII2);
                    break;
                }
                break;
            }
        }
        int n4 = 0;
        if (liiIlllIIIllIIIllIII2[0] & !liiIlllIIIllIIIllIII2[1] & !liiIlllIIIllIIIllIII2[2] & !liiIlllIIIllIIIllIII2[3]) {
            n4 = 3;
        }
        else if (!liiIlllIIIllIIIllIII2[0] & liiIlllIIIllIIIllIII2[1] & !liiIlllIIIllIIIllIII2[2] & !liiIlllIIIllIIIllIII2[3]) {
            n4 = 1;
        }
        else if (!liiIlllIIIllIIIllIII2[0] & !liiIlllIIIllIIIllIII2[1] & liiIlllIIIllIIIllIII2[2] & !liiIlllIIIllIIIllIII2[3]) {
            n4 = 12;
        }
        else if (!liiIlllIIIllIIIllIII2[0] & !liiIlllIIIllIIIllIII2[1] & !liiIlllIIIllIIIllIII2[2] & liiIlllIIIllIIIllIII2[3]) {
            n4 = 36;
        }
        else if (liiIlllIIIllIIIllIII2[0] & liiIlllIIIllIIIllIII2[1] & !liiIlllIIIllIIIllIII2[2] & !liiIlllIIIllIIIllIII2[3]) {
            n4 = 2;
        }
        else if (!liiIlllIIIllIIIllIII2[0] & !liiIlllIIIllIIIllIII2[1] & liiIlllIIIllIIIllIII2[2] & liiIlllIIIllIIIllIII2[3]) {
            n4 = 24;
        }
        else if (liiIlllIIIllIIIllIII2[0] & !liiIlllIIIllIIIllIII2[1] & liiIlllIIIllIIIllIII2[2] & !liiIlllIIIllIIIllIII2[3]) {
            n4 = 15;
        }
        else if (liiIlllIIIllIIIllIII2[0] & !liiIlllIIIllIIIllIII2[1] & !liiIlllIIIllIIIllIII2[2] & liiIlllIIIllIIIllIII2[3]) {
            n4 = 39;
        }
        else if (!liiIlllIIIllIIIllIII2[0] & liiIlllIIIllIIIllIII2[1] & liiIlllIIIllIIIllIII2[2] & !liiIlllIIIllIIIllIII2[3]) {
            n4 = 13;
        }
        else if (!liiIlllIIIllIIIllIII2[0] & liiIlllIIIllIIIllIII2[1] & !liiIlllIIIllIIIllIII2[2] & liiIlllIIIllIIIllIII2[3]) {
            n4 = 37;
        }
        else if (!liiIlllIIIllIIIllIII2[0] & liiIlllIIIllIIIllIII2[1] & liiIlllIIIllIIIllIII2[2] & liiIlllIIIllIIIllIII2[3]) {
            n4 = 25;
        }
        else if (liiIlllIIIllIIIllIII2[0] & !liiIlllIIIllIIIllIII2[1] & liiIlllIIIllIIIllIII2[2] & liiIlllIIIllIIIllIII2[3]) {
            n4 = 27;
        }
        else if (liiIlllIIIllIIIllIII2[0] & liiIlllIIIllIIIllIII2[1] & !liiIlllIIIllIIIllIII2[2] & liiIlllIIIllIIIllIII2[3]) {
            n4 = 38;
        }
        else if (liiIlllIIIllIIIllIII2[0] & liiIlllIIIllIIIllIII2[1] & liiIlllIIIllIIIllIII2[2] & !liiIlllIIIllIIIllIII2[3]) {
            n4 = 14;
        }
        else if (liiIlllIIIllIIIllIII2[0] & liiIlllIIIllIIIllIII2[1] & liiIlllIIIllIIIllIII2[2] & liiIlllIIIllIIIllIII2[3]) {
            n4 = 26;
        }
        if (n4 == 0) {
            return n4;
        }
        if (!net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IlIIlllIIlIlllllIIlI()) {
            return n4;
        }
        switch (n2) {
            case 0: {
                liiIlllIIIllIIIllIII2[0] = !llIllIIIIIllIlIIIIlI(liiIlllIIIllIIIllIII, lIlIlIIIllIIllIIIllI, llIIlIIIlIIIllIlIIIl, ilIlIlIlIlllllllllIl.IllIIlllIIIIlllIIlIl().llIllIIIIIllIlIIIIlI(), n2, ilIlIIIllIIllIlllllI, n3);
                liiIlllIIIllIIIllIII2[1] = !llIllIIIIIllIlIIIIlI(liiIlllIIIllIIIllIII, lIlIlIIIllIIllIIIllI, llIIlIIIlIIIllIlIIIl, ilIlIlIlIlllllllllIl.IlIlIIIllIllIIIIIllI().llIllIIIIIllIlIIIIlI(), n2, ilIlIIIllIIllIlllllI, n3);
                liiIlllIIIllIIIllIII2[2] = !llIllIIIIIllIlIIIIlI(liiIlllIIIllIIIllIII, lIlIlIIIllIIllIIIllI, llIIlIIIlIIIllIlIIIl, ilIlIlIlIlllllllllIl.IllIIlllIIIIlllIIlIl().IlIIIlIlIIIllIlIlIIl(), n2, ilIlIIIllIIllIlllllI, n3);
                liiIlllIIIllIIIllIII2[3] = !llIllIIIIIllIlIIIIlI(liiIlllIIIllIIIllIII, lIlIlIIIllIIllIIIllI, llIIlIIIlIIIllIlIIIl, ilIlIlIlIlllllllllIl.IlIlIIIllIllIIIIIllI().IlIIIlIlIIIllIlIlIIl(), n2, ilIlIIIllIIllIlllllI, n3);
                if (liiIlllIIIllIIIllIII.IlIlIIIllIIllIlllllI) {
                    final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl3 = ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl();
                    liiIlllIIIllIIIllIII2[0] = (liiIlllIIIllIIIllIII2[0] || llIllIIIIIllIlIIIIlI(liiIlllIIIllIIIllIII, lIlIlIIIllIIllIIIllI, llIIlIIIlIIIllIlIIIl, ilIlIlIlIlllllllllIl3.IllIIlllIIIIlllIIlIl().llIllIIIIIllIlIIIIlI(), n2, ilIlIIIllIIllIlllllI, n3));
                    liiIlllIIIllIIIllIII2[1] = (liiIlllIIIllIIIllIII2[1] || llIllIIIIIllIlIIIIlI(liiIlllIIIllIIIllIII, lIlIlIIIllIIllIIIllI, llIIlIIIlIIIllIlIIIl, ilIlIlIlIlllllllllIl3.IlIlIIIllIllIIIIIllI().llIllIIIIIllIlIIIIlI(), n2, ilIlIIIllIIllIlllllI, n3));
                    liiIlllIIIllIIIllIII2[2] = (liiIlllIIIllIIIllIII2[2] || llIllIIIIIllIlIIIIlI(liiIlllIIIllIIIllIII, lIlIlIIIllIIllIIIllI, llIIlIIIlIIIllIlIIIl, ilIlIlIlIlllllllllIl3.IllIIlllIIIIlllIIlIl().IlIIIlIlIIIllIlIlIIl(), n2, ilIlIIIllIIllIlllllI, n3));
                    liiIlllIIIllIIIllIII2[3] = (liiIlllIIIllIIIllIII2[3] || llIllIIIIIllIlIIIIlI(liiIlllIIIllIIIllIII, lIlIlIIIllIIllIIIllI, llIIlIIIlIIIllIlIIIl, ilIlIlIlIlllllllllIl3.IlIlIIIllIllIIIIIllI().IlIIIlIlIIIllIlIlIIl(), n2, ilIlIIIllIIllIlllllI, n3));
                    break;
                }
                break;
            }
            case 1: {
                liiIlllIIIllIIIllIII2[0] = !llIllIIIIIllIlIIIIlI(liiIlllIIIllIIIllIII, lIlIlIIIllIIllIIIllI, llIIlIIIlIIIllIlIIIl, ilIlIlIlIlllllllllIl.IllIIlllIIIIlllIIlIl().IlIIIlIlIIIllIlIlIIl(), n2, ilIlIIIllIIllIlllllI, n3);
                liiIlllIIIllIIIllIII2[1] = !llIllIIIIIllIlIIIIlI(liiIlllIIIllIIIllIII, lIlIlIIIllIIllIIIllI, llIIlIIIlIIIllIlIIIl, ilIlIlIlIlllllllllIl.IlIlIIIllIllIIIIIllI().IlIIIlIlIIIllIlIlIIl(), n2, ilIlIIIllIIllIlllllI, n3);
                liiIlllIIIllIIIllIII2[2] = !llIllIIIIIllIlIIIIlI(liiIlllIIIllIIIllIII, lIlIlIIIllIIllIIIllI, llIIlIIIlIIIllIlIIIl, ilIlIlIlIlllllllllIl.IllIIlllIIIIlllIIlIl().llIllIIIIIllIlIIIIlI(), n2, ilIlIIIllIIllIlllllI, n3);
                liiIlllIIIllIIIllIII2[3] = !llIllIIIIIllIlIIIIlI(liiIlllIIIllIIIllIII, lIlIlIIIllIIllIIIllI, llIIlIIIlIIIllIlIIIl, ilIlIlIlIlllllllllIl.IlIlIIIllIllIIIIIllI().llIllIIIIIllIlIIIIlI(), n2, ilIlIIIllIIllIlllllI, n3);
                if (liiIlllIIIllIIIllIII.IlIlIIIllIIllIlllllI) {
                    final IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll2 = ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll();
                    liiIlllIIIllIIIllIII2[0] = (liiIlllIIIllIIIllIII2[0] || llIllIIIIIllIlIIIIlI(liiIlllIIIllIIIllIII, lIlIlIIIllIIllIIIllI, llIIlIIIlIIIllIlIIIl, llllIIIIlIIIlIlllIll2.IllIIlllIIIIlllIIlIl().IlIIIlIlIIIllIlIlIIl(), n2, ilIlIIIllIIllIlllllI, n3));
                    liiIlllIIIllIIIllIII2[1] = (liiIlllIIIllIIIllIII2[1] || llIllIIIIIllIlIIIIlI(liiIlllIIIllIIIllIII, lIlIlIIIllIIllIIIllI, llIIlIIIlIIIllIlIIIl, llllIIIIlIIIlIlllIll2.IlIlIIIllIllIIIIIllI().IlIIIlIlIIIllIlIlIIl(), n2, ilIlIIIllIIllIlllllI, n3));
                    liiIlllIIIllIIIllIII2[2] = (liiIlllIIIllIIIllIII2[2] || llIllIIIIIllIlIIIIlI(liiIlllIIIllIIIllIII, lIlIlIIIllIIllIIIllI, llIIlIIIlIIIllIlIIIl, llllIIIIlIIIlIlllIll2.IllIIlllIIIIlllIIlIl().llIllIIIIIllIlIIIIlI(), n2, ilIlIIIllIIllIlllllI, n3));
                    liiIlllIIIllIIIllIII2[3] = (liiIlllIIIllIIIllIII2[3] || llIllIIIIIllIlIIIIlI(liiIlllIIIllIIIllIII, lIlIlIIIllIIllIIIllI, llIIlIIIlIIIllIlIIIl, llllIIIIlIIIlIlllIll2.IlIlIIIllIllIIIIIllI().llIllIIIIIllIlIIIIlI(), n2, ilIlIIIllIIllIlllllI, n3));
                    break;
                }
                break;
            }
            case 2: {
                liiIlllIIIllIIIllIII2[0] = !llIllIIIIIllIlIIIIlI(liiIlllIIIllIIIllIII, lIlIlIIIllIIllIIIllI, llIIlIIIlIIIllIlIIIl, ilIlIlIlIlllllllllIl.IlIlIIIllIllIIIIIllI().IlIlIlIlIlllllllllIl(), n2, ilIlIIIllIIllIlllllI, n3);
                liiIlllIIIllIIIllIII2[1] = !llIllIIIIIllIlIIIIlI(liiIlllIIIllIIIllIII, lIlIlIIIllIIllIIIllI, llIIlIIIlIIIllIlIIIl, ilIlIlIlIlllllllllIl.IllIIlllIIIIlllIIlIl().IlIlIlIlIlllllllllIl(), n2, ilIlIIIllIIllIlllllI, n3);
                liiIlllIIIllIIIllIII2[2] = !llIllIIIIIllIlIIIIlI(liiIlllIIIllIIIllIII, lIlIlIIIllIIllIIIllI, llIIlIIIlIIIllIlIIIl, ilIlIlIlIlllllllllIl.IlIlIIIllIllIIIIIllI().llllIIIIlIIIlIlllIll(), n2, ilIlIIIllIIllIlllllI, n3);
                liiIlllIIIllIIIllIII2[3] = !llIllIIIIIllIlIIIIlI(liiIlllIIIllIIIllIII, lIlIlIIIllIIllIIIllI, llIIlIIIlIIIllIlIIIl, ilIlIlIlIlllllllllIl.IllIIlllIIIIlllIIlIl().llllIIIIlIIIlIlllIll(), n2, ilIlIIIllIIllIlllllI, n3);
                if (liiIlllIIIllIIIllIII.IlIlIIIllIIllIlllllI) {
                    final IlIlIlIlIlllllllllIl llIllIIIIIllIlIIIIlI2 = ilIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI();
                    liiIlllIIIllIIIllIII2[0] = (liiIlllIIIllIIIllIII2[0] || llIllIIIIIllIlIIIIlI(liiIlllIIIllIIIllIII, lIlIlIIIllIIllIIIllI, llIIlIIIlIIIllIlIIIl, llIllIIIIIllIlIIIIlI2.IlIlIIIllIllIIIIIllI().IlIlIlIlIlllllllllIl(), n2, ilIlIIIllIIllIlllllI, n3));
                    liiIlllIIIllIIIllIII2[1] = (liiIlllIIIllIIIllIII2[1] || llIllIIIIIllIlIIIIlI(liiIlllIIIllIIIllIII, lIlIlIIIllIIllIIIllI, llIIlIIIlIIIllIlIIIl, llIllIIIIIllIlIIIIlI2.IllIIlllIIIIlllIIlIl().IlIlIlIlIlllllllllIl(), n2, ilIlIIIllIIllIlllllI, n3));
                    liiIlllIIIllIIIllIII2[2] = (liiIlllIIIllIIIllIII2[2] || llIllIIIIIllIlIIIIlI(liiIlllIIIllIIIllIII, lIlIlIIIllIIllIIIllI, llIIlIIIlIIIllIlIIIl, llIllIIIIIllIlIIIIlI2.IlIlIIIllIllIIIIIllI().llllIIIIlIIIlIlllIll(), n2, ilIlIIIllIIllIlllllI, n3));
                    liiIlllIIIllIIIllIII2[3] = (liiIlllIIIllIIIllIII2[3] || llIllIIIIIllIlIIIIlI(liiIlllIIIllIIIllIII, lIlIlIIIllIIllIIIllI, llIIlIIIlIIIllIlIIIl, llIllIIIIIllIlIIIIlI2.IllIIlllIIIIlllIIlIl().llllIIIIlIIIlIlllIll(), n2, ilIlIIIllIIllIlllllI, n3));
                }
                if (n == 1) {
                    llllIIIIlIIIlIlllIll(0, 3, liiIlllIIIllIIIllIII2);
                    llllIIIIlIIIlIlllIll(1, 2, liiIlllIIIllIIIllIII2);
                    break;
                }
                break;
            }
            case 3: {
                liiIlllIIIllIIIllIII2[0] = !llIllIIIIIllIlIIIIlI(liiIlllIIIllIIIllIII, lIlIlIIIllIIllIIIllI, llIIlIIIlIIIllIlIIIl, ilIlIlIlIlllllllllIl.IllIIlllIIIIlllIIlIl().IlIlIlIlIlllllllllIl(), n2, ilIlIIIllIIllIlllllI, n3);
                liiIlllIIIllIIIllIII2[1] = !llIllIIIIIllIlIIIIlI(liiIlllIIIllIIIllIII, lIlIlIIIllIIllIIIllI, llIIlIIIlIIIllIlIIIl, ilIlIlIlIlllllllllIl.IlIlIIIllIllIIIIIllI().IlIlIlIlIlllllllllIl(), n2, ilIlIIIllIIllIlllllI, n3);
                liiIlllIIIllIIIllIII2[2] = !llIllIIIIIllIlIIIIlI(liiIlllIIIllIIIllIII, lIlIlIIIllIIllIIIllI, llIIlIIIlIIIllIlIIIl, ilIlIlIlIlllllllllIl.IllIIlllIIIIlllIIlIl().llllIIIIlIIIlIlllIll(), n2, ilIlIIIllIIllIlllllI, n3);
                liiIlllIIIllIIIllIII2[3] = !llIllIIIIIllIlIIIIlI(liiIlllIIIllIIIllIII, lIlIlIIIllIIllIIIllI, llIIlIIIlIIIllIlIIIl, ilIlIlIlIlllllllllIl.IlIlIIIllIllIIIIIllI().llllIIIIlIIIlIlllIll(), n2, ilIlIIIllIIllIlllllI, n3);
                if (liiIlllIIIllIIIllIII.IlIlIIIllIIllIlllllI) {
                    final IlIlIlIlIlllllllllIl ilIIIlIlIIIllIlIlIIl2 = ilIlIlIlIlllllllllIl.IlIIIlIlIIIllIlIlIIl();
                    liiIlllIIIllIIIllIII2[0] = (liiIlllIIIllIIIllIII2[0] || llIllIIIIIllIlIIIIlI(liiIlllIIIllIIIllIII, lIlIlIIIllIIllIIIllI, llIIlIIIlIIIllIlIIIl, ilIIIlIlIIIllIlIlIIl2.IllIIlllIIIIlllIIlIl().IlIlIlIlIlllllllllIl(), n2, ilIlIIIllIIllIlllllI, n3));
                    liiIlllIIIllIIIllIII2[1] = (liiIlllIIIllIIIllIII2[1] || llIllIIIIIllIlIIIIlI(liiIlllIIIllIIIllIII, lIlIlIIIllIIllIIIllI, llIIlIIIlIIIllIlIIIl, ilIIIlIlIIIllIlIlIIl2.IlIlIIIllIllIIIIIllI().IlIlIlIlIlllllllllIl(), n2, ilIlIIIllIIllIlllllI, n3));
                    liiIlllIIIllIIIllIII2[2] = (liiIlllIIIllIIIllIII2[2] || llIllIIIIIllIlIIIIlI(liiIlllIIIllIIIllIII, lIlIlIIIllIIllIIIllI, llIIlIIIlIIIllIlIIIl, ilIIIlIlIIIllIlIlIIl2.IllIIlllIIIIlllIIlIl().llllIIIIlIIIlIlllIll(), n2, ilIlIIIllIIllIlllllI, n3));
                    liiIlllIIIllIIIllIII2[3] = (liiIlllIIIllIIIllIII2[3] || llIllIIIIIllIlIIIIlI(liiIlllIIIllIIIllIII, lIlIlIIIllIIllIIIllI, llIIlIIIlIIIllIlIIIl, ilIIIlIlIIIllIlIlIIl2.IlIlIIIllIllIIIIIllI().llllIIIIlIIIlIlllIll(), n2, ilIlIIIllIIllIlllllI, n3));
                    break;
                }
                break;
            }
            case 4: {
                liiIlllIIIllIIIllIII2[0] = !llIllIIIIIllIlIIIIlI(liiIlllIIIllIIIllIII, lIlIlIIIllIIllIIIllI, llIIlIIIlIIIllIlIIIl, ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl().IlIIIlIlIIIllIlIlIIl(), n2, ilIlIIIllIIllIlllllI, n3);
                liiIlllIIIllIIIllIII2[1] = !llIllIIIIIllIlIIIIlI(liiIlllIIIllIIIllIII, lIlIlIIIllIIllIIIllI, llIIlIIIlIIIllIlIIIl, ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl().llIllIIIIIllIlIIIIlI(), n2, ilIlIIIllIIllIlllllI, n3);
                liiIlllIIIllIIIllIII2[2] = !llIllIIIIIllIlIIIIlI(liiIlllIIIllIIIllIII, lIlIlIIIllIIllIIIllI, llIIlIIIlIIIllIlIIIl, ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll().IlIIIlIlIIIllIlIlIIl(), n2, ilIlIIIllIIllIlllllI, n3);
                liiIlllIIIllIIIllIII2[3] = !llIllIIIIIllIlIIIIlI(liiIlllIIIllIIIllIII, lIlIlIIIllIIllIIIllI, llIIlIIIlIIIllIlIIIl, ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll().llIllIIIIIllIlIIIIlI(), n2, ilIlIIIllIIllIlllllI, n3);
                if (liiIlllIIIllIIIllIII.IlIlIIIllIIllIlllllI) {
                    final IlIlIlIlIlllllllllIl ilIlIIIllIllIIIIIllI2 = ilIlIlIlIlllllllllIl.IlIlIIIllIllIIIIIllI();
                    liiIlllIIIllIIIllIII2[0] = (liiIlllIIIllIIIllIII2[0] || llIllIIIIIllIlIIIIlI(liiIlllIIIllIIIllIII, lIlIlIIIllIIllIIIllI, llIIlIIIlIIIllIlIIIl, ilIlIIIllIllIIIIIllI2.IlIlIlIlIlllllllllIl().IlIIIlIlIIIllIlIlIIl(), n2, ilIlIIIllIIllIlllllI, n3));
                    liiIlllIIIllIIIllIII2[1] = (liiIlllIIIllIIIllIII2[1] || llIllIIIIIllIlIIIIlI(liiIlllIIIllIIIllIII, lIlIlIIIllIIllIIIllI, llIIlIIIlIIIllIlIIIl, ilIlIIIllIllIIIIIllI2.IlIlIlIlIlllllllllIl().llIllIIIIIllIlIIIIlI(), n2, ilIlIIIllIIllIlllllI, n3));
                    liiIlllIIIllIIIllIII2[2] = (liiIlllIIIllIIIllIII2[2] || llIllIIIIIllIlIIIIlI(liiIlllIIIllIIIllIII, lIlIlIIIllIIllIIIllI, llIIlIIIlIIIllIlIIIl, ilIlIIIllIllIIIIIllI2.llllIIIIlIIIlIlllIll().IlIIIlIlIIIllIlIlIIl(), n2, ilIlIIIllIIllIlllllI, n3));
                    liiIlllIIIllIIIllIII2[3] = (liiIlllIIIllIIIllIII2[3] || llIllIIIIIllIlIIIIlI(liiIlllIIIllIIIllIII, lIlIlIIIllIIllIIIllI, llIIlIIIlIIIllIlIIIl, ilIlIIIllIllIIIIIllI2.llllIIIIlIIIlIlllIll().llIllIIIIIllIlIIIIlI(), n2, ilIlIIIllIIllIlllllI, n3));
                    break;
                }
                break;
            }
            case 5: {
                liiIlllIIIllIIIllIII2[0] = !llIllIIIIIllIlIIIIlI(liiIlllIIIllIIIllIII, lIlIlIIIllIIllIIIllI, llIIlIIIlIIIllIlIIIl, ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl().llIllIIIIIllIlIIIIlI(), n2, ilIlIIIllIIllIlllllI, n3);
                liiIlllIIIllIIIllIII2[1] = !llIllIIIIIllIlIIIIlI(liiIlllIIIllIIIllIII, lIlIlIIIllIIllIIIllI, llIIlIIIlIIIllIlIIIl, ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl().IlIIIlIlIIIllIlIlIIl(), n2, ilIlIIIllIIllIlllllI, n3);
                liiIlllIIIllIIIllIII2[2] = !llIllIIIIIllIlIIIIlI(liiIlllIIIllIIIllIII, lIlIlIIIllIIllIIIllI, llIIlIIIlIIIllIlIIIl, ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll().llIllIIIIIllIlIIIIlI(), n2, ilIlIIIllIIllIlllllI, n3);
                liiIlllIIIllIIIllIII2[3] = !llIllIIIIIllIlIIIIlI(liiIlllIIIllIIIllIII, lIlIlIIIllIIllIIIllI, llIIlIIIlIIIllIlIIIl, ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll().IlIIIlIlIIIllIlIlIIl(), n2, ilIlIIIllIIllIlllllI, n3);
                if (liiIlllIIIllIIIllIII.IlIlIIIllIIllIlllllI) {
                    final IlIlIlIlIlllllllllIl illIIlllIIIIlllIIlIl2 = ilIlIlIlIlllllllllIl.IllIIlllIIIIlllIIlIl();
                    liiIlllIIIllIIIllIII2[0] = (liiIlllIIIllIIIllIII2[0] || llIllIIIIIllIlIIIIlI(liiIlllIIIllIIIllIII, lIlIlIIIllIIllIIIllI, llIIlIIIlIIIllIlIIIl, illIIlllIIIIlllIIlIl2.IlIlIlIlIlllllllllIl().llIllIIIIIllIlIIIIlI(), n2, ilIlIIIllIIllIlllllI, n3));
                    liiIlllIIIllIIIllIII2[1] = (liiIlllIIIllIIIllIII2[1] || llIllIIIIIllIlIIIIlI(liiIlllIIIllIIIllIII, lIlIlIIIllIIllIIIllI, llIIlIIIlIIIllIlIIIl, illIIlllIIIIlllIIlIl2.IlIlIlIlIlllllllllIl().IlIIIlIlIIIllIlIlIIl(), n2, ilIlIIIllIIllIlllllI, n3));
                    liiIlllIIIllIIIllIII2[2] = (liiIlllIIIllIIIllIII2[2] || llIllIIIIIllIlIIIIlI(liiIlllIIIllIIIllIII, lIlIlIIIllIIllIIIllI, llIIlIIIlIIIllIlIIIl, illIIlllIIIIlllIIlIl2.llllIIIIlIIIlIlllIll().llIllIIIIIllIlIIIIlI(), n2, ilIlIIIllIIllIlllllI, n3));
                    liiIlllIIIllIIIllIII2[3] = (liiIlllIIIllIIIllIII2[3] || llIllIIIIIllIlIIIIlI(liiIlllIIIllIIIllIII, lIlIlIIIllIIllIIIllI, llIIlIIIlIIIllIlIIIl, illIIlllIIIIlllIIlIl2.llllIIIIlIIIlIlllIll().IlIIIlIlIIIllIlIlIIl(), n2, ilIlIIIllIIllIlllllI, n3));
                }
                if (n == 2) {
                    llllIIIIlIIIlIlllIll(0, 3, liiIlllIIIllIIIllIII2);
                    llllIIIIlIIIlIlllIll(1, 2, liiIlllIIIllIIIllIII2);
                    break;
                }
                break;
            }
        }
        if (n4 == 13 && liiIlllIIIllIIIllIII2[0]) {
            n4 = 4;
        }
        else if (n4 == 15 && liiIlllIIIllIIIllIII2[1]) {
            n4 = 5;
        }
        else if (n4 == 37 && liiIlllIIIllIIIllIII2[2]) {
            n4 = 16;
        }
        else if (n4 == 39 && liiIlllIIIllIIIllIII2[3]) {
            n4 = 17;
        }
        else if (n4 == 14 && liiIlllIIIllIIIllIII2[0] && liiIlllIIIllIIIllIII2[1]) {
            n4 = 7;
        }
        else if (n4 == 25 && liiIlllIIIllIIIllIII2[0] && liiIlllIIIllIIIllIII2[2]) {
            n4 = 6;
        }
        else if (n4 == 27 && liiIlllIIIllIIIllIII2[3] && liiIlllIIIllIIIllIII2[1]) {
            n4 = 19;
        }
        else if (n4 == 38 && liiIlllIIIllIIIllIII2[3] && liiIlllIIIllIIIllIII2[2]) {
            n4 = 18;
        }
        else if (n4 == 14 && !liiIlllIIIllIIIllIII2[0] && liiIlllIIIllIIIllIII2[1]) {
            n4 = 31;
        }
        else if (n4 == 25 && liiIlllIIIllIIIllIII2[0] && !liiIlllIIIllIIIllIII2[2]) {
            n4 = 30;
        }
        else if (n4 == 27 && !liiIlllIIIllIIIllIII2[3] && liiIlllIIIllIIIllIII2[1]) {
            n4 = 41;
        }
        else if (n4 == 38 && liiIlllIIIllIIIllIII2[3] && !liiIlllIIIllIIIllIII2[2]) {
            n4 = 40;
        }
        else if (n4 == 14 && liiIlllIIIllIIIllIII2[0] && !liiIlllIIIllIIIllIII2[1]) {
            n4 = 29;
        }
        else if (n4 == 25 && !liiIlllIIIllIIIllIII2[0] && liiIlllIIIllIIIllIII2[2]) {
            n4 = 28;
        }
        else if (n4 == 27 && liiIlllIIIllIIIllIII2[3] && !liiIlllIIIllIIIllIII2[1]) {
            n4 = 43;
        }
        else if (n4 == 38 && !liiIlllIIIllIIIllIII2[3] && liiIlllIIIllIIIllIII2[2]) {
            n4 = 42;
        }
        else if (n4 == 26 && liiIlllIIIllIIIllIII2[0] && liiIlllIIIllIIIllIII2[1] && liiIlllIIIllIIIllIII2[2] && liiIlllIIIllIIIllIII2[3]) {
            n4 = 46;
        }
        else if (n4 == 26 && !liiIlllIIIllIIIllIII2[0] && liiIlllIIIllIIIllIII2[1] && liiIlllIIIllIIIllIII2[2] && liiIlllIIIllIIIllIII2[3]) {
            n4 = 9;
        }
        else if (n4 == 26 && liiIlllIIIllIIIllIII2[0] && !liiIlllIIIllIIIllIII2[1] && liiIlllIIIllIIIllIII2[2] && liiIlllIIIllIIIllIII2[3]) {
            n4 = 21;
        }
        else if (n4 == 26 && liiIlllIIIllIIIllIII2[0] && liiIlllIIIllIIIllIII2[1] && !liiIlllIIIllIIIllIII2[2] && liiIlllIIIllIIIllIII2[3]) {
            n4 = 8;
        }
        else if (n4 == 26 && liiIlllIIIllIIIllIII2[0] && liiIlllIIIllIIIllIII2[1] && liiIlllIIIllIIIllIII2[2] && !liiIlllIIIllIIIllIII2[3]) {
            n4 = 20;
        }
        else if (n4 == 26 && liiIlllIIIllIIIllIII2[0] && liiIlllIIIllIIIllIII2[1] && !liiIlllIIIllIIIllIII2[2] && !liiIlllIIIllIIIllIII2[3]) {
            n4 = 11;
        }
        else if (n4 == 26 && !liiIlllIIIllIIIllIII2[0] && !liiIlllIIIllIIIllIII2[1] && liiIlllIIIllIIIllIII2[2] && liiIlllIIIllIIIllIII2[3]) {
            n4 = 22;
        }
        else if (n4 == 26 && !liiIlllIIIllIIIllIII2[0] && liiIlllIIIllIIIllIII2[1] && !liiIlllIIIllIIIllIII2[2] && liiIlllIIIllIIIllIII2[3]) {
            n4 = 23;
        }
        else if (n4 == 26 && liiIlllIIIllIIIllIII2[0] && !liiIlllIIIllIIIllIII2[1] && liiIlllIIIllIIIllIII2[2] && !liiIlllIIIllIIIllIII2[3]) {
            n4 = 10;
        }
        else if (n4 == 26 && liiIlllIIIllIIIllIII2[0] && !liiIlllIIIllIIIllIII2[1] && !liiIlllIIIllIIIllIII2[2] && liiIlllIIIllIIIllIII2[3]) {
            n4 = 34;
        }
        else if (n4 == 26 && !liiIlllIIIllIIIllIII2[0] && liiIlllIIIllIIIllIII2[1] && liiIlllIIIllIIIllIII2[2] && !liiIlllIIIllIIIllIII2[3]) {
            n4 = 35;
        }
        else if (n4 == 26 && liiIlllIIIllIIIllIII2[0] && !liiIlllIIIllIIIllIII2[1] && !liiIlllIIIllIIIllIII2[2] && !liiIlllIIIllIIIllIII2[3]) {
            n4 = 32;
        }
        else if (n4 == 26 && !liiIlllIIIllIIIllIII2[0] && liiIlllIIIllIIIllIII2[1] && !liiIlllIIIllIIIllIII2[2] && !liiIlllIIIllIIIllIII2[3]) {
            n4 = 33;
        }
        else if (n4 == 26 && !liiIlllIIIllIIIllIII2[0] && !liiIlllIIIllIIIllIII2[1] && liiIlllIIIllIIIllIII2[2] && !liiIlllIIIllIIIllIII2[3]) {
            n4 = 44;
        }
        else if (n4 == 26 && !liiIlllIIIllIIIllIII2[0] && !liiIlllIIIllIIIllIII2[1] && !liiIlllIIIllIIIllIII2[2] && liiIlllIIIllIIIllIII2[3]) {
            n4 = 45;
        }
        return n4;
    }
    
    private static void llllIIIIlIIIlIlllIll(final int n, final int n2, final boolean[] array) {
        final boolean b = array[n];
        array[n] = array[n2];
        array[n2] = b;
    }
    
    private static boolean llllIIIIlIIIlIlllIll(final lIIIlllIIIllIIIllIII liiIlllIIIllIIIllIII, final lIlIlIIIllIIllIIIllI lIlIlIIIllIIllIIIllI, final net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final int n, final IlIlIIIllIIllIlllllI ilIlIIIllIIllIlllllI, final int n2) {
        final net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.llIIlIIIlIIIllIlIIIl ilIlIlIlIlllllllllIl2 = lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl);
        if (!llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl2)) {
            return false;
        }
        if (liiIlllIIIllIIIllIII.IlIlIllllllllIIIIlII != null) {
            final IllIIlllIIIIlllIIlIl illIIlllIIIIlllIIlIl = (IllIIlllIIIIlllIIlIl)ilIlIlIlIlllllllllIl2;
            if (!net.optifine.llllIIIIlIIIlIlllIll.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll(illIIlllIIIIlllIIlIl.IlIIIlIlIIIllIlIlIIl(), illIIlllIIIIlllIIlIl.IllIIlllIIIIlllIIlIl(), liiIlllIIIllIIIllIII.IlIlIllllllllIIIIlII)) {
                return false;
            }
        }
        if (liiIlllIIIllIIIllIII.llIIIlIlIllIIlIlIlII != null && !net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll(lIlIlIIIllIIllIIIllI, llIIlIIIlIIIllIlIIIl, ilIlIlIlIlllllllllIl, ilIlIlIlIlllllllllIl2, n), liiIlllIIIllIIIllIII.llIIIlIlIllIIlIlIlII)) {
            return false;
        }
        final net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.llIIlIIIlIIIllIlIIIl ilIlIlIlIlllllllllIl3 = lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll(n)));
        return !ilIlIlIlIlllllllllIl3.llIllIIIIIllIlIIIIlI().llllIIllllIlIlIIIIll() && (n != 1 || ilIlIlIlIlllllllllIl3.llIllIIIIIllIlIIIIlI() != net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lllIlIIIIIlIlllllIlI) && !llllIIIIlIIIlIlllIll(liiIlllIIIllIIIllIII, lIlIlIIIllIIllIIIllI, llIIlIIIlIIIllIlIIIl, ilIlIlIlIlllllllllIl, ilIlIlIlIlllllllllIl2, n, ilIlIIIllIIllIlllllI, n2);
    }
    
    private static boolean llllIIIIlIIIlIlllIll(final net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl) {
        if (llIIlIIIlIIIllIlIIIl.llIllIIIIIllIlIIIIlI().llIIlIIIlIIIllIlIIIl()) {
            return true;
        }
        final net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llIllIIIIIllIlIIIIlI = llIIlIIIlIIIllIlIIIl.llIllIIIIIllIlIIIIlI();
        return llIllIIIIIllIlIIIIlI instanceof IlIllllIIIlIllIlIIll || llIllIIIIIllIlIIIIlI instanceof ck;
    }
    
    private static boolean IlIlIlIlIlllllllllIl(final lIIIlllIIIllIIIllIII liiIlllIIIllIIIllIII, final lIlIlIIIllIIllIIIllI lIlIlIIIllIIllIIIllI, final net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final int n, final IlIlIIIllIIllIlllllI ilIlIIIllIIllIlllllI, final int n2) {
        final net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.llIIlIIIlIIIllIlIIIl ilIlIlIlIlllllllllIl2 = lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl);
        if (ilIlIlIlIlllllllllIl2 == llIIlIIIlIIIllIlIIIl.lIIIIlIIIIIlllIllIII) {
            return false;
        }
        if (liiIlllIIIllIIIllIII.llIllIIIIIllIlIIIIlI != null && ilIlIlIlIlllllllllIl2 instanceof IllIIlllIIIIlllIIlIl) {
            final IllIIlllIIIIlllIIlIl illIIlllIIIIlllIIlIl = (IllIIlllIIIIlllIIlIl)ilIlIlIlIlllllllllIl2;
            if (!liiIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll(illIIlllIIIIlllIIlIl.IlIIIlIlIIIllIlIlIIl(), illIIlllIIIIlllIIlIl.IllIIlllIIIIlllIIlIl())) {
                return false;
            }
        }
        if (liiIlllIIIllIIIllIII.IIlIIIIlllIlllllIlII != null && llllIIIIlIIIlIlllIll(lIlIlIIIllIIllIIIllI, llIIlIIIlIIIllIlIIIl, ilIlIlIlIlllllllllIl, ilIlIlIlIlllllllllIl2, n) != ilIlIIIllIIllIlllllI) {
            return false;
        }
        final net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.llIIlIIIlIIIllIlIIIl ilIlIlIlIlllllllllIl3 = lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll(n)));
        return !ilIlIlIlIlllllllllIl3.llIllIIIIIllIlIIIIlI().llllIIllllIlIlIIIIll() && (n != 1 || ilIlIlIlIlllllllllIl3.llIllIIIIIllIlIIIIlI() != net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lllIlIIIIIlIlllllIlI);
    }
    
    private static boolean llIllIIIIIllIlIIIIlI(final lIIIlllIIIllIIIllIII liiIlllIIIllIIIllIII, final lIlIlIIIllIIllIIIllI lIlIlIIIllIIllIIIllI, final net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final int n, final IlIlIIIllIIllIlllllI ilIlIIIllIIllIlllllI, final int n2) {
        return llllIIIIlIIIlIlllIll(liiIlllIIIllIIIllIII, lIlIlIIIllIIllIIIllI, llIIlIIIlIIIllIlIIIl, ilIlIlIlIlllllllllIl, lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl), n, ilIlIIIllIIllIlllllI, n2);
    }
    
    private static boolean llllIIIIlIIIlIlllIll(final lIIIlllIIIllIIIllIII liiIlllIIIllIIIllIII, final lIlIlIIIllIIllIIIllI lIlIlIIIllIIllIIIllI, final net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl2, final int n, final IlIlIIIllIIllIlllllI ilIlIIIllIIllIlllllI, final int n2) {
        if (llIIlIIIlIIIllIlIIIl == llIIlIIIlIIIllIlIIIl2) {
            return true;
        }
        if (liiIlllIIIllIIIllIII.lIIIIlIIIIIlllIllIII == 2) {
            return llIIlIIIlIIIllIlIIIl2 != null && llIIlIIIlIIIllIlIIIl2 != llIIlIIIlIIIllIlIIIl.lIIIIlIIIIIlllIllIII && llllIIIIlIIIlIlllIll(lIlIlIIIllIIllIIIllI, llIIlIIIlIIIllIlIIIl, ilIlIlIlIlllllllllIl, llIIlIIIlIIIllIlIIIl2, n) == ilIlIIIllIIllIlllllI;
        }
        if (liiIlllIIIllIIIllIII.lIIIIlIIIIIlllIllIII == 3) {
            return llIIlIIIlIIIllIlIIIl2 != null && llIIlIIIlIIIllIlIIIl2 != llIIlIIIlIIIllIlIIIl.lIIIIlIIIIIlllIllIII && llIIlIIIlIIIllIlIIIl2.llIllIIIIIllIlIIIIlI().IllIIlllIIIIlllIIlIl() == llIIlIIIlIIIllIlIIIl.llIllIIIIIllIlIIIIlI().IllIIlllIIIIlllIIlIl();
        }
        if (!(llIIlIIIlIIIllIlIIIl2 instanceof IllIIlllIIIIlllIIlIl)) {
            return false;
        }
        final IllIIlllIIIIlllIIlIl illIIlllIIIIlllIIlIl = (IllIIlllIIIIlllIIlIl)llIIlIIIlIIIllIlIIIl2;
        final net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llIllIIIIIllIlIIIIlI = illIIlllIIIIlllIIlIl.llIllIIIIIllIlIIIIlI();
        final int illIIlllIIIIlllIIlIl2 = illIIlllIIIIlllIIlIl.IllIIlllIIIIlllIIlIl();
        return llIllIIIIIllIlIIIIlI == llIIlIIIlIIIllIlIIIl.llIllIIIIIllIlIIIIlI() && illIIlllIIIIlllIIlIl2 == n2;
    }
    
    private static IlIlIIIllIIllIlllllI llllIIIIlIIIlIlllIll(final lIlIlIIIllIIllIIIllI lIlIlIIIllIIllIIIllI, final net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.llIIlIIIlIIIllIlIIIl llllIIIIlIIIlIlllIll, final int n) {
        llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI().llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll, lIlIlIIIllIIllIIIllI, ilIlIlIlIlllllllllIl);
        final net.minecraft.client.llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl2 = Minecraft.getMinecraft().IlIIllIIllIIllIIlIIl().llllIIIIlIIIlIlllIll().IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll);
        if (ilIlIlIlIlllllllllIl2 == null) {
            return null;
        }
        if (net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.lllllIIIIIlIlIIIIIIl.llIllIIIIIllIlIIIIlI()) {
            llllIIIIlIIIlIlllIll = (net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.llIIlIIIlIIIllIlIIIl)net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.llllIIIlIlllIlIIIIIl(llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI(), net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.lllllIIIIIlIlIIIIIIl, llllIIIIlIIIlIlllIll, lIlIlIIIllIIllIIIllI, ilIlIlIlIlllllllllIl);
        }
        final lllIllIIIllllllIllll llllIIIIlIIIlIlllIll2 = llllIIIIlIIIlIlllIll(n);
        List list = ilIlIlIlIlllllllllIl2.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll2);
        if (list == null) {
            return null;
        }
        if (net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIIIllIlIllIllIIIIl()) {
            list = llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(lIlIlIIIllIIllIIIllI, llllIIIIlIIIlIlllIll, ilIlIlIlIlllllllllIl, llllIIIIlIIIlIlllIll2, list);
        }
        if (list.size() > 0) {
            return list.get(0).llllIIIIlIIIlIlllIll();
        }
        final List llllIIIIlIIIlIlllIll3 = ilIlIlIlIlllllllllIl2.llllIIIIlIIIlIlllIll();
        if (llllIIIIlIIIlIlllIll3 == null) {
            return null;
        }
        for (int i = 0; i < llllIIIIlIIIlIlllIll3.size(); ++i) {
            final net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll4 = llllIIIIlIIIlIlllIll3.get(i);
            if (llllIIIIlIIIlIlllIll4.IlIlIIIllIllIIIIIllI() == llllIIIIlIIIlIlllIll2) {
                return llllIIIIlIIIlIlllIll4.llllIIIIlIIIlIlllIll();
            }
        }
        return null;
    }
    
    private static IlIlIIIllIIllIlllllI llllIIIIlIIIlIlllIll(final lIIIlllIIIllIIIllIII liiIlllIIIllIIIllIII, final lIlIlIIIllIIllIIIllI lIlIlIIIllIIllIIIllI, final net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final int n, final int n2, final IlIlIIIllIIllIlllllI ilIlIIIllIIllIlllllI, final int n3) {
        boolean b = false;
        boolean b2 = false;
        Label_0859: {
            switch (n) {
                case 0: {
                    switch (n2) {
                        case 0: {
                            b = llIllIIIIIllIlIIIIlI(liiIlllIIIllIIIllIII, lIlIlIIIllIIllIIIllI, llIIlIIIlIIIllIlIIIl, ilIlIlIlIlllllllllIl.IlIlIIIllIllIIIIIllI(), n2, ilIlIIIllIIllIlllllI, n3);
                            b2 = llIllIIIIIllIlIIIIlI(liiIlllIIIllIIIllIII, lIlIlIIIllIIllIIIllI, llIIlIIIlIIIllIlIIIl, ilIlIlIlIlllllllllIl.IllIIlllIIIIlllIIlIl(), n2, ilIlIIIllIIllIlllllI, n3);
                            break;
                        }
                        case 1: {
                            b = llIllIIIIIllIlIIIIlI(liiIlllIIIllIIIllIII, lIlIlIIIllIIllIIIllI, llIIlIIIlIIIllIlIIIl, ilIlIlIlIlllllllllIl.IlIlIIIllIllIIIIIllI(), n2, ilIlIIIllIIllIlllllI, n3);
                            b2 = llIllIIIIIllIlIIIIlI(liiIlllIIIllIIIllIII, lIlIlIIIllIIllIIIllI, llIIlIIIlIIIllIlIIIl, ilIlIlIlIlllllllllIl.IllIIlllIIIIlllIIlIl(), n2, ilIlIIIllIIllIlllllI, n3);
                            break;
                        }
                        case 2: {
                            b = llIllIIIIIllIlIIIIlI(liiIlllIIIllIIIllIII, lIlIlIIIllIIllIIIllI, llIIlIIIlIIIllIlIIIl, ilIlIlIlIlllllllllIl.IllIIlllIIIIlllIIlIl(), n2, ilIlIIIllIIllIlllllI, n3);
                            b2 = llIllIIIIIllIlIIIIlI(liiIlllIIIllIIIllIII, lIlIlIIIllIIllIIIllI, llIIlIIIlIIIllIlIIIl, ilIlIlIlIlllllllllIl.IlIlIIIllIllIIIIIllI(), n2, ilIlIIIllIIllIlllllI, n3);
                            break;
                        }
                        case 3: {
                            b = llIllIIIIIllIlIIIIlI(liiIlllIIIllIIIllIII, lIlIlIIIllIIllIIIllI, llIIlIIIlIIIllIlIIIl, ilIlIlIlIlllllllllIl.IlIlIIIllIllIIIIIllI(), n2, ilIlIIIllIIllIlllllI, n3);
                            b2 = llIllIIIIIllIlIIIIlI(liiIlllIIIllIIIllIII, lIlIlIIIllIIllIIIllI, llIIlIIIlIIIllIlIIIl, ilIlIlIlIlllllllllIl.IllIIlllIIIIlllIIlIl(), n2, ilIlIIIllIIllIlllllI, n3);
                            break;
                        }
                        case 4: {
                            b = llIllIIIIIllIlIIIIlI(liiIlllIIIllIIIllIII, lIlIlIIIllIIllIIIllI, llIIlIIIlIIIllIlIIIl, ilIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI(), n2, ilIlIIIllIIllIlllllI, n3);
                            b2 = llIllIIIIIllIlIIIIlI(liiIlllIIIllIIIllIII, lIlIlIIIllIIllIIIllI, llIIlIIIlIIIllIlIIIl, ilIlIlIlIlllllllllIl.IlIIIlIlIIIllIlIlIIl(), n2, ilIlIIIllIIllIlllllI, n3);
                            break;
                        }
                        case 5: {
                            b = llIllIIIIIllIlIIIIlI(liiIlllIIIllIIIllIII, lIlIlIIIllIIllIIIllI, llIIlIIIlIIIllIlIIIl, ilIlIlIlIlllllllllIl.IlIIIlIlIIIllIlIlIIl(), n2, ilIlIIIllIIllIlllllI, n3);
                            b2 = llIllIIIIIllIlIIIIlI(liiIlllIIIllIIIllIII, lIlIlIIIllIIllIIIllI, llIIlIIIlIIIllIlIIIl, ilIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI(), n2, ilIlIIIllIIllIlllllI, n3);
                            break;
                        }
                    }
                    break;
                }
                case 1: {
                    switch (n2) {
                        case 0: {
                            b = llIllIIIIIllIlIIIIlI(liiIlllIIIllIIIllIII, lIlIlIIIllIIllIIIllI, llIIlIIIlIIIllIlIIIl, ilIlIlIlIlllllllllIl.IllIIlllIIIIlllIIlIl(), n2, ilIlIIIllIIllIlllllI, n3);
                            b2 = llIllIIIIIllIlIIIIlI(liiIlllIIIllIIIllIII, lIlIlIIIllIIllIIIllI, llIIlIIIlIIIllIlIIIl, ilIlIlIlIlllllllllIl.IlIlIIIllIllIIIIIllI(), n2, ilIlIIIllIIllIlllllI, n3);
                            break;
                        }
                        case 1: {
                            b = llIllIIIIIllIlIIIIlI(liiIlllIIIllIIIllIII, lIlIlIIIllIIllIIIllI, llIIlIIIlIIIllIlIIIl, ilIlIlIlIlllllllllIl.IlIlIIIllIllIIIIIllI(), n2, ilIlIIIllIIllIlllllI, n3);
                            b2 = llIllIIIIIllIlIIIIlI(liiIlllIIIllIIIllIII, lIlIlIIIllIIllIIIllI, llIIlIIIlIIIllIlIIIl, ilIlIlIlIlllllllllIl.IllIIlllIIIIlllIIlIl(), n2, ilIlIIIllIIllIlllllI, n3);
                            break;
                        }
                        case 2: {
                            b = llIllIIIIIllIlIIIIlI(liiIlllIIIllIIIllIII, lIlIlIIIllIIllIIIllI, llIIlIIIlIIIllIlIIIl, ilIlIlIlIlllllllllIl.IlIlIIIllIllIIIIIllI(), n2, ilIlIIIllIIllIlllllI, n3);
                            b2 = llIllIIIIIllIlIIIIlI(liiIlllIIIllIIIllIII, lIlIlIIIllIIllIIIllI, llIIlIIIlIIIllIlIIIl, ilIlIlIlIlllllllllIl.IllIIlllIIIIlllIIlIl(), n2, ilIlIIIllIIllIlllllI, n3);
                            break;
                        }
                        case 3: {
                            b = llIllIIIIIllIlIIIIlI(liiIlllIIIllIIIllIII, lIlIlIIIllIIllIIIllI, llIIlIIIlIIIllIlIIIl, ilIlIlIlIlllllllllIl.IlIlIIIllIllIIIIIllI(), n2, ilIlIIIllIIllIlllllI, n3);
                            b2 = llIllIIIIIllIlIIIIlI(liiIlllIIIllIIIllIII, lIlIlIIIllIIllIIIllI, llIIlIIIlIIIllIlIIIl, ilIlIlIlIlllllllllIl.IllIIlllIIIIlllIIlIl(), n2, ilIlIIIllIIllIlllllI, n3);
                            break;
                        }
                        case 4: {
                            b = llIllIIIIIllIlIIIIlI(liiIlllIIIllIIIllIII, lIlIlIIIllIIllIIIllI, llIIlIIIlIIIllIlIIIl, ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl(), n2, ilIlIIIllIIllIlllllI, n3);
                            b2 = llIllIIIIIllIlIIIIlI(liiIlllIIIllIIIllIII, lIlIlIIIllIIllIIIllI, llIIlIIIlIIIllIlIIIl, ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(), n2, ilIlIIIllIIllIlllllI, n3);
                            break;
                        }
                        case 5: {
                            b = llIllIIIIIllIlIIIIlI(liiIlllIIIllIIIllIII, lIlIlIIIllIIllIIIllI, llIIlIIIlIIIllIlIIIl, ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(), n2, ilIlIIIllIIllIlllllI, n3);
                            b2 = llIllIIIIIllIlIIIIlI(liiIlllIIIllIIIllIII, lIlIlIIIllIIllIIIllI, llIIlIIIlIIIllIlIIIl, ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl(), n2, ilIlIIIllIIllIlllllI, n3);
                            break;
                        }
                    }
                    break;
                }
                case 2: {
                    switch (n2) {
                        case 0: {
                            b = llIllIIIIIllIlIIIIlI(liiIlllIIIllIIIllIII, lIlIlIIIllIIllIIIllI, llIIlIIIlIIIllIlIIIl, ilIlIlIlIlllllllllIl.IlIIIlIlIIIllIlIlIIl(), n2, ilIlIIIllIIllIlllllI, n3);
                            b2 = llIllIIIIIllIlIIIIlI(liiIlllIIIllIIIllIII, lIlIlIIIllIIllIIIllI, llIIlIIIlIIIllIlIIIl, ilIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI(), n2, ilIlIIIllIIllIlllllI, n3);
                            break Label_0859;
                        }
                        case 1: {
                            b = llIllIIIIIllIlIIIIlI(liiIlllIIIllIIIllIII, lIlIlIIIllIIllIIIllI, llIIlIIIlIIIllIlIIIl, ilIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI(), n2, ilIlIIIllIIllIlllllI, n3);
                            b2 = llIllIIIIIllIlIIIIlI(liiIlllIIIllIIIllIII, lIlIlIIIllIIllIIIllI, llIIlIIIlIIIllIlIIIl, ilIlIlIlIlllllllllIl.IlIIIlIlIIIllIlIlIIl(), n2, ilIlIIIllIIllIlllllI, n3);
                            break Label_0859;
                        }
                        case 2: {
                            b = llIllIIIIIllIlIIIIlI(liiIlllIIIllIIIllIII, lIlIlIIIllIIllIIIllI, llIIlIIIlIIIllIlIIIl, ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl(), n2, ilIlIIIllIIllIlllllI, n3);
                            b2 = llIllIIIIIllIlIIIIlI(liiIlllIIIllIIIllIII, lIlIlIIIllIIllIIIllI, llIIlIIIlIIIllIlIIIl, ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(), n2, ilIlIIIllIIllIlllllI, n3);
                            break Label_0859;
                        }
                        case 3: {
                            b = llIllIIIIIllIlIIIIlI(liiIlllIIIllIIIllIII, lIlIlIIIllIIllIIIllI, llIIlIIIlIIIllIlIIIl, ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(), n2, ilIlIIIllIIllIlllllI, n3);
                            b2 = llIllIIIIIllIlIIIIlI(liiIlllIIIllIIIllIII, lIlIlIIIllIIllIIIllI, llIIlIIIlIIIllIlIIIl, ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl(), n2, ilIlIIIllIIllIlllllI, n3);
                            break Label_0859;
                        }
                        case 4: {
                            b = llIllIIIIIllIlIIIIlI(liiIlllIIIllIIIllIII, lIlIlIIIllIIllIIIllI, llIIlIIIlIIIllIlIIIl, ilIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI(), n2, ilIlIIIllIIllIlllllI, n3);
                            b2 = llIllIIIIIllIlIIIIlI(liiIlllIIIllIIIllIII, lIlIlIIIllIIllIIIllI, llIIlIIIlIIIllIlIIIl, ilIlIlIlIlllllllllIl.IlIIIlIlIIIllIlIlIIl(), n2, ilIlIIIllIIllIlllllI, n3);
                            break Label_0859;
                        }
                        case 5: {
                            b = llIllIIIIIllIlIIIIlI(liiIlllIIIllIIIllIII, lIlIlIIIllIIllIIIllI, llIIlIIIlIIIllIlIIIl, ilIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI(), n2, ilIlIIIllIIllIlllllI, n3);
                            b2 = llIllIIIIIllIlIIIIlI(liiIlllIIIllIIIllIII, lIlIlIIIllIIllIIIllI, llIIlIIIlIIIllIlIIIl, ilIlIlIlIlllllllllIl.IlIIIlIlIIIllIlIlIIl(), n2, ilIlIIIllIIllIlllllI, n3);
                            break Label_0859;
                        }
                    }
                    break;
                }
            }
        }
        int n4;
        if (b) {
            if (b2) {
                n4 = 1;
            }
            else {
                n4 = 2;
            }
        }
        else if (b2) {
            n4 = 0;
        }
        else {
            n4 = 3;
        }
        return liiIlllIIIllIIIllIII.IIIlIIlIIIIlllIlllII[n4];
    }
    
    private static IlIlIIIllIIllIlllllI IlIlIlIlIlllllllllIl(final lIIIlllIIIllIIIllIII liiIlllIIIllIIIllIII, final lIlIlIIIllIIllIIIllI lIlIlIIIllIIllIIIllI, final net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final int n, final int n2, final IlIlIIIllIIllIlllllI ilIlIIIllIIllIlllllI, final int n3) {
        boolean b = false;
        boolean b2 = false;
        switch (n) {
            case 0: {
                if (n2 == 1) {
                    b = llIllIIIIIllIlIIIIlI(liiIlllIIIllIIIllIII, lIlIlIIIllIIllIIIllI, llIIlIIIlIIIllIlIIIl, ilIlIlIlIlllllllllIl.IlIIIlIlIIIllIlIlIIl(), n2, ilIlIIIllIIllIlllllI, n3);
                    b2 = llIllIIIIIllIlIIIIlI(liiIlllIIIllIIIllIII, lIlIlIIIllIIllIIIllI, llIIlIIIlIIIllIlIIIl, ilIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI(), n2, ilIlIIIllIIllIlllllI, n3);
                    break;
                }
                if (n2 == 0) {
                    b = llIllIIIIIllIlIIIIlI(liiIlllIIIllIIIllIII, lIlIlIIIllIIllIIIllI, llIIlIIIlIIIllIlIIIl, ilIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI(), n2, ilIlIIIllIIllIlllllI, n3);
                    b2 = llIllIIIIIllIlIIIIlI(liiIlllIIIllIIIllIII, lIlIlIIIllIIllIIIllI, llIIlIIIlIIIllIlIIIl, ilIlIlIlIlllllllllIl.IlIIIlIlIIIllIlIlIIl(), n2, ilIlIIIllIIllIlllllI, n3);
                    break;
                }
                b = llIllIIIIIllIlIIIIlI(liiIlllIIIllIIIllIII, lIlIlIIIllIIllIIIllI, llIIlIIIlIIIllIlIIIl, ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl(), n2, ilIlIIIllIIllIlllllI, n3);
                b2 = llIllIIIIIllIlIIIIlI(liiIlllIIIllIIIllIII, lIlIlIIIllIIllIIIllI, llIIlIIIlIIIllIlIIIl, ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(), n2, ilIlIIIllIIllIlllllI, n3);
                break;
            }
            case 1: {
                if (n2 == 3) {
                    b = llIllIIIIIllIlIIIIlI(liiIlllIIIllIIIllIII, lIlIlIIIllIIllIIIllI, llIIlIIIlIIIllIlIIIl, ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl(), n2, ilIlIIIllIIllIlllllI, n3);
                    b2 = llIllIIIIIllIlIIIIlI(liiIlllIIIllIIIllIII, lIlIlIIIllIIllIIIllI, llIIlIIIlIIIllIlIIIl, ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(), n2, ilIlIIIllIIllIlllllI, n3);
                    break;
                }
                if (n2 == 2) {
                    b = llIllIIIIIllIlIIIIlI(liiIlllIIIllIIIllIII, lIlIlIIIllIIllIIIllI, llIIlIIIlIIIllIlIIIl, ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(), n2, ilIlIIIllIIllIlllllI, n3);
                    b2 = llIllIIIIIllIlIIIIlI(liiIlllIIIllIIIllIII, lIlIlIIIllIIllIIIllI, llIIlIIIlIIIllIlIIIl, ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl(), n2, ilIlIIIllIIllIlllllI, n3);
                    break;
                }
                b = llIllIIIIIllIlIIIIlI(liiIlllIIIllIIIllIII, lIlIlIIIllIIllIIIllI, llIIlIIIlIIIllIlIIIl, ilIlIlIlIlllllllllIl.IlIIIlIlIIIllIlIlIIl(), n2, ilIlIIIllIIllIlllllI, n3);
                b2 = llIllIIIIIllIlIIIIlI(liiIlllIIIllIIIllIII, lIlIlIIIllIIllIIIllI, llIIlIIIlIIIllIlIIIl, ilIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI(), n2, ilIlIIIllIIllIlllllI, n3);
                break;
            }
            case 2: {
                if (n2 == 5) {
                    b = llIllIIIIIllIlIIIIlI(liiIlllIIIllIIIllIII, lIlIlIIIllIIllIIIllI, llIIlIIIlIIIllIlIIIl, ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(), n2, ilIlIIIllIIllIlllllI, n3);
                    b2 = llIllIIIIIllIlIIIIlI(liiIlllIIIllIIIllIII, lIlIlIIIllIIllIIIllI, llIIlIIIlIIIllIlIIIl, ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl(), n2, ilIlIIIllIIllIlllllI, n3);
                    break;
                }
                if (n2 == 4) {
                    b = llIllIIIIIllIlIIIIlI(liiIlllIIIllIIIllIII, lIlIlIIIllIIllIIIllI, llIIlIIIlIIIllIlIIIl, ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl(), n2, ilIlIIIllIIllIlllllI, n3);
                    b2 = llIllIIIIIllIlIIIIlI(liiIlllIIIllIIIllIII, lIlIlIIIllIIllIIIllI, llIIlIIIlIIIllIlIIIl, ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(), n2, ilIlIIIllIIllIlllllI, n3);
                    break;
                }
                b = llIllIIIIIllIlIIIIlI(liiIlllIIIllIIIllIII, lIlIlIIIllIIllIIIllI, llIIlIIIlIIIllIlIIIl, ilIlIlIlIlllllllllIl.IlIlIIIllIllIIIIIllI(), n2, ilIlIIIllIIllIlllllI, n3);
                b2 = llIllIIIIIllIlIIIIlI(liiIlllIIIllIIIllIII, lIlIlIIIllIIllIIIllI, llIIlIIIlIIIllIlIIIl, ilIlIlIlIlllllllllIl.IllIIlllIIIIlllIIlIl(), n2, ilIlIIIllIIllIlllllI, n3);
                break;
            }
        }
        int n4;
        if (b) {
            if (b2) {
                n4 = 1;
            }
            else {
                n4 = 2;
            }
        }
        else if (b2) {
            n4 = 0;
        }
        else {
            n4 = 3;
        }
        return liiIlllIIIllIIIllIII.IIIlIIlIIIIlllIlllII[n4];
    }
    
    private static IlIlIIIllIIllIlllllI llIllIIIIIllIlIIIIlI(final lIIIlllIIIllIIIllIII liiIlllIIIllIIIllIII, final lIlIlIIIllIIllIIIllI lIlIlIIIllIIllIIIllI, final net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final int n, final int n2, final IlIlIIIllIIllIlllllI ilIlIIIllIIllIlllllI, final int n3) {
        final IlIlIIIllIIllIlllllI[] iiIlIIlIIIIlllIlllII = liiIlllIIIllIIIllIII.IIIlIIlIIIIlllIlllII;
        final IlIlIIIllIIllIlllllI llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll(liiIlllIIIllIIIllIII, lIlIlIIIllIIllIIIllI, llIIlIIIlIIIllIlIIIl, ilIlIlIlIlllllllllIl, n, n2, ilIlIIIllIIllIlllllI, n3);
        if (llllIIIIlIIIlIlllIll != null && llllIIIIlIIIlIlllIll != ilIlIIIllIIllIlllllI && llllIIIIlIIIlIlllIll != iiIlIIlIIIIlllIlllII[3]) {
            return llllIIIIlIIIlIlllIll;
        }
        final IlIlIIIllIIllIlllllI ilIlIlIlIlllllllllIl2 = IlIlIlIlIlllllllllIl(liiIlllIIIllIIIllIII, lIlIlIIIllIIllIIIllI, llIIlIIIlIIIllIlIIIl, ilIlIlIlIlllllllllIl, n, n2, ilIlIIIllIIllIlllllI, n3);
        return (ilIlIlIlIlllllllllIl2 == iiIlIIlIIIIlllIlllII[0]) ? iiIlIIlIIIIlllIlllII[4] : ((ilIlIlIlIlllllllllIl2 == iiIlIIlIIIIlllIlllII[1]) ? iiIlIIlIIIIlllIlllII[5] : ((ilIlIlIlIlllllllllIl2 == iiIlIIlIIIIlllIlllII[2]) ? iiIlIIlIIIIlllIlllII[6] : ilIlIlIlIlllllllllIl2));
    }
    
    private static IlIlIIIllIIllIlllllI IlIIIlIlIIIllIlIlIIl(final lIIIlllIIIllIIIllIII liiIlllIIIllIIIllIII, final lIlIlIIIllIIllIIIllI lIlIlIIIllIIllIIIllI, final net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final int n, final int n2, final IlIlIIIllIIllIlllllI ilIlIIIllIIllIlllllI, final int n3) {
        final IlIlIIIllIIllIlllllI[] iiIlIIlIIIIlllIlllII = liiIlllIIIllIIIllIII.IIIlIIlIIIIlllIlllII;
        final IlIlIIIllIIllIlllllI ilIlIlIlIlllllllllIl2 = IlIlIlIlIlllllllllIl(liiIlllIIIllIIIllIII, lIlIlIIIllIIllIIIllI, llIIlIIIlIIIllIlIIIl, ilIlIlIlIlllllllllIl, n, n2, ilIlIIIllIIllIlllllI, n3);
        if (ilIlIlIlIlllllllllIl2 != null && ilIlIlIlIlllllllllIl2 != ilIlIIIllIIllIlllllI && ilIlIlIlIlllllllllIl2 != iiIlIIlIIIIlllIlllII[3]) {
            return ilIlIlIlIlllllllllIl2;
        }
        final IlIlIIIllIIllIlllllI llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll(liiIlllIIIllIIIllIII, lIlIlIIIllIIllIIIllI, llIIlIIIlIIIllIlIIIl, ilIlIlIlIlllllllllIl, n, n2, ilIlIIIllIIllIlllllI, n3);
        return (llllIIIIlIIIlIlllIll == iiIlIIlIIIIlllIlllII[0]) ? iiIlIIlIIIIlllIlllII[4] : ((llllIIIIlIIIlIlllIll == iiIlIIlIIIIlllIlllII[1]) ? iiIlIIlIIIIlllIlllII[5] : ((llllIIIIlIIIlIlllIll == iiIlIIlIIIIlllIlllII[2]) ? iiIlIIlIIIIlllIlllII[6] : llllIIIIlIIIlIlllIll));
    }
    
    private static IlIlIIIllIIllIlllllI IlIlIIIllIllIIIIIllI(final lIIIlllIIIllIIIllIII liiIlllIIIllIIIllIII, final lIlIlIIIllIIllIIIllI lIlIlIIIllIIllIIIllI, final net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final int n, final int n2, final IlIlIIIllIIllIlllllI ilIlIIIllIIllIlllllI, final int n3) {
        boolean b = false;
        switch (n) {
            case 0: {
                if (n2 == 1 || n2 == 0) {
                    return null;
                }
                b = llIllIIIIIllIlIIIIlI(liiIlllIIIllIIIllIII, lIlIlIIIllIIllIIIllI, llIIlIIIlIIIllIlIIIl, ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(), n2, ilIlIIIllIIllIlllllI, n3);
                break;
            }
            case 1: {
                if (n2 == 3 || n2 == 2) {
                    return null;
                }
                b = llIllIIIIIllIlIIIIlI(liiIlllIIIllIIIllIII, lIlIlIIIllIIllIIIllI, llIIlIIIlIIIllIlIIIl, ilIlIlIlIlllllllllIl.IlIIIlIlIIIllIlIlIIl(), n2, ilIlIIIllIIllIlllllI, n3);
                break;
            }
            case 2: {
                if (n2 == 5 || n2 == 4) {
                    return null;
                }
                b = llIllIIIIIllIlIIIIlI(liiIlllIIIllIIIllIII, lIlIlIIIllIIllIIIllI, llIIlIIIlIIIllIlIIIl, ilIlIlIlIlllllllllIl.IllIIlllIIIIlllIIlIl(), n2, ilIlIIIllIIllIlllllI, n3);
                break;
            }
        }
        if (b) {
            return liiIlllIIIllIIIllIII.IIIlIIlIIIIlllIlllII[0];
        }
        return null;
    }
    
    public static void llllIIIIlIIIlIlllIll(final IlIlIIIIIIlllIlIllIl ilIlIIIIIIlllIlIllIl) {
        net.optifine.llIIlIIIlIIIllIlIIIl.IlIlIIIllIIllIlllllI = null;
        net.optifine.llIIlIIIlIIIllIlIIIl.IIIIlllIIIIIIlIIIlll = null;
        net.optifine.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl = null;
        net.optifine.llIIlIIIlIIIllIlIIIl.lIlIlIIIllIIllIIIllI = null;
        if (net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.lIIlllIlllllIIlllIll()) {
            final llllIIllllIlIlIIIIll[] lllllIIIIIlIlIIIIIIl = net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.lllllIIIIIlIlIIIIIIl();
            for (int i = lllllIIIIIlIlIIIIIIl.length - 1; i >= 0; --i) {
                llllIIIIlIIIlIlllIll(ilIlIIIIIIlllIlIllIl, lllllIIIIIlIlIIIIIIl[i]);
            }
            llllIIIIlIIIlIlllIll(ilIlIIIIIIlllIlIllIl, net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.lIllIIIIIlllIIlIIllI());
            net.optifine.llIIlIIIlIIIllIlIIIl.IlIlIIIIIIlllIlIllIl = ilIlIIIIIIlllIlIllIl.IlIlIlIlIlllllllllIl(new lIllllIllIllIIllllll("mcpatcher/ctm/default/empty"));
            net.optifine.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl = new Map[ilIlIIIIIIlllIlIllIl.llIIlIIIlIIIllIlIIIl() + 1];
            net.optifine.llIIlIIIlIIIllIlIIIl.llIllIlIIIIllIlIIllI = new Map[ilIlIIIIIIlllIlIllIl.llIIlIIIlIIIllIlIIIl() + 1];
            net.optifine.llIIlIIIlIIIllIlIIIl.lIlIlIIIllIIllIIIllI = new Map[ilIlIIIIIIlllIlIllIl.llIIlIIIlIIIllIlIIIl() + 1][];
            if (net.optifine.llIIlIIIlIIIllIlIIIl.IlIlIIIllIIllIlllllI.length <= 0) {
                net.optifine.llIIlIIIlIIIllIlIIIl.IlIlIIIllIIllIlllllI = null;
            }
            if (net.optifine.llIIlIIIlIIIllIlIIIl.IIIIlllIIIIIIlIIIlll.length <= 0) {
                net.optifine.llIIlIIIlIIIllIlIIIl.IIIIlllIIIIIIlIIIlll = null;
            }
        }
    }
    
    private static void IlIlIlIlIlllllllllIl(final IlIlIIIIIIlllIlIllIl ilIlIIIIIIlllIlIllIl) {
    }
    
    public static void llllIIIIlIIIlIlllIll(final IlIlIIIIIIlllIlIllIl ilIlIIIIIIlllIlIllIl, final llllIIllllIlIlIIIIll llllIIllllIlIlIIIIll) {
        final String[] llllIIIIlIIIlIlllIll = net.optifine.util.IIlIIIIIllIlIIIlIIll.llllIIIIlIIIlIlllIll(llllIIllllIlIlIIIIll, "mcpatcher/ctm/", ".properties", IlIIIlIlIIIllIlIlIIl());
        Arrays.sort(llllIIIIlIIIlIlllIll);
        final List llllIIIIlIIIlIlllIll2 = llllIIIIlIIIlIlllIll(net.optifine.llIIlIIIlIIIllIlIIIl.IIIIlllIIIIIIlIIIlll);
        final List llllIIIIlIIIlIlllIll3 = llllIIIIlIIIlIlllIll(net.optifine.llIIlIIIlIIIllIlIIIl.IlIlIIIllIIllIlllllI);
        for (int i = 0; i < llllIIIIlIIIlIlllIll.length; ++i) {
            final String s = llllIIIIlIIIlIlllIll[i];
            net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl("ConnectedTextures: " + s);
            try {
                final InputStream llllIIIIlIIIlIlllIll4 = llllIIllllIlIlIIIIll.llllIIIIlIIIlIlllIll(new lIllllIllIllIIllllll(s));
                if (llllIIIIlIIIlIlllIll4 == null) {
                    net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI("ConnectedTextures file not found: " + s);
                }
                else {
                    final llIIlllIIlllIIllIllI llIIlllIIlllIIllIllI = new llIIlllIIlllIIllIllI();
                    llIIlllIIlllIIllIllI.load(llllIIIIlIIIlIlllIll4);
                    llllIIIIlIIIlIlllIll4.close();
                    final lIIIlllIIIllIIIllIII liiIlllIIIllIIIllIII = new lIIIlllIIIllIIIllIII(llIIlllIIlllIIllIllI, s);
                    if (liiIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll(s)) {
                        liiIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll(ilIlIIIIIIlllIlIllIl);
                        llllIIIIlIIIlIlllIll(liiIlllIIIllIIIllIII, llllIIIIlIIIlIlllIll2);
                        IlIlIlIlIlllllllllIl(liiIlllIIIllIIIllIII, llllIIIIlIIIlIlllIll3);
                    }
                }
            }
            catch (FileNotFoundException ex2) {
                net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI("ConnectedTextures file not found: " + s);
            }
            catch (Exception ex) {
                ex.printStackTrace();
            }
        }
        net.optifine.llIIlIIIlIIIllIlIIIl.IlIlIIIllIIllIlllllI = llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll3);
        net.optifine.llIIlIIIlIIIllIlIIIl.IIIIlllIIIIIIlIIIlll = llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll2);
        net.optifine.llIIlIIIlIIIllIlIIIl.llllIIllllIlIlIIIIll = llIllIIIIIllIlIIIIlI();
        net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl("Multipass connected textures: " + net.optifine.llIIlIIIlIIIllIlIIIl.llllIIllllIlIlIIIIll);
    }
    
    private static List llllIIIIlIIIlIlllIll(final lIIIlllIIIllIIIllIII[][] array) {
        final ArrayList<ArrayList> list = new ArrayList<ArrayList>();
        if (array != null) {
            for (int i = 0; i < array.length; ++i) {
                final lIIIlllIIIllIIIllIII[] array2 = array[i];
                ArrayList list2 = null;
                if (array2 != null) {
                    list2 = new ArrayList(Arrays.asList(array2));
                }
                list.add(list2);
            }
        }
        return list;
    }
    
    private static boolean llIllIIIIIllIlIIIIlI() {
        final ArrayList list = new ArrayList();
        for (int i = 0; i < net.optifine.llIIlIIIlIIIllIlIIIl.IIIIlllIIIIIIlIIIlll.length; ++i) {
            final lIIIlllIIIllIIIllIII[] array = net.optifine.llIIlIIIlIIIllIlIIIl.IIIIlllIIIIIIlIIIlll[i];
            if (array != null) {
                list.addAll(Arrays.asList(array));
            }
        }
        for (int j = 0; j < net.optifine.llIIlIIIlIIIllIlIIIl.IlIlIIIllIIllIlllllI.length; ++j) {
            final lIIIlllIIIllIIIllIII[] array2 = net.optifine.llIIlIIIlIIIllIlIIIl.IlIlIIIllIIllIlllllI[j];
            if (array2 != null) {
                list.addAll(Arrays.asList(array2));
            }
        }
        final lIIIlllIIIllIIIllIII[] array3 = (lIIIlllIIIllIIIllIII[])list.toArray(new lIIIlllIIIllIIIllIII[list.size()]);
        final HashSet set = new HashSet();
        final HashSet set2 = new HashSet();
        for (int k = 0; k < array3.length; ++k) {
            final lIIIlllIIIllIIIllIII liiIlllIIIllIIIllIII = array3[k];
            if (liiIlllIIIllIIIllIII.IIlIIIIlllIlllllIlII != null) {
                set.addAll(Arrays.asList(liiIlllIIIllIIIllIII.IIlIIIIlllIlllllIlII));
            }
            if (liiIlllIIIllIIIllIII.IIIlIIlIIIIlllIlllII != null) {
                set2.addAll(Arrays.asList(liiIlllIIIllIIIllIII.IIIlIIlIIIIlllIlllII));
            }
        }
        set.retainAll(set2);
        return !set.isEmpty();
    }
    
    private static lIIIlllIIIllIIIllIII[][] llllIIIIlIIIlIlllIll(final List list) {
        final lIIIlllIIIllIIIllIII[][] array = new lIIIlllIIIllIIIllIII[list.size()][];
        for (int i = 0; i < list.size(); ++i) {
            final List list2 = list.get(i);
            if (list2 != null) {
                array[i] = (lIIIlllIIIllIIIllIII[])list2.toArray(new lIIIlllIIIllIIIllIII[list2.size()]);
            }
        }
        return array;
    }
    
    private static void llllIIIIlIIIlIlllIll(final lIIIlllIIIllIIIllIII liiIlllIIIllIIIllIII, final List list) {
        if (liiIlllIIIllIIIllIII.IIlIIIIlllIlllllIlII != null) {
            for (int i = 0; i < liiIlllIIIllIIIllIII.IIlIIIIlllIlllllIlII.length; ++i) {
                final IlIlIIIllIIllIlllllI ilIlIIIllIIllIlllllI = liiIlllIIIllIIIllIII.IIlIIIIlllIlllllIlII[i];
                if (!(ilIlIIIllIIllIlllllI instanceof IlIlIIIllIIllIlllllI)) {
                    net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI("TextureAtlasSprite is not TextureAtlasSprite: " + ilIlIIIllIIllIlllllI + ", name: " + ilIlIIIllIIllIlllllI.lIIIlllIIIllIIIllIII());
                }
                else {
                    final int iiiIlllIIIIIIlIIIlll = ilIlIIIllIIllIlllllI.IIIIlllIIIIIIlIIIlll();
                    if (iiiIlllIIIIIIlIIIlll < 0) {
                        net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI("Invalid tile ID: " + iiiIlllIIIIIIlIIIlll + ", icon: " + ilIlIIIllIIllIlllllI.lIIIlllIIIllIIIllIII());
                    }
                    else {
                        llllIIIIlIIIlIlllIll(liiIlllIIIllIIIllIII, list, iiiIlllIIIIIIlIIIlll);
                    }
                }
            }
        }
    }
    
    private static void IlIlIlIlIlllllllllIl(final lIIIlllIIIllIIIllIII liiIlllIIIllIIIllIII, final List list) {
        if (liiIlllIIIllIIIllIII.llIllIIIIIllIlIIIIlI != null) {
            for (int i = 0; i < liiIlllIIIllIIIllIII.llIllIIIIIllIlIIIIlI.length; ++i) {
                final int llllIIIIlIIIlIlllIll = liiIlllIIIllIIIllIII.llIllIIIIIllIlIIIIlI[i].llllIIIIlIIIlIlllIll();
                if (llllIIIIlIIIlIlllIll < 0) {
                    net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI("Invalid block ID: " + llllIIIIlIIIlIlllIll);
                }
                else {
                    llllIIIIlIIIlIlllIll(liiIlllIIIllIIIllIII, list, llllIIIIlIIIlIlllIll);
                }
            }
        }
    }
    
    private static void llllIIIIlIIIlIlllIll(final lIIIlllIIIllIIIllIII liiIlllIIIllIIIllIII, final List list, final int i) {
        while (i >= list.size()) {
            list.add(null);
        }
        List<lIIIlllIIIllIIIllIII> list2 = list.get(i);
        if (list2 == null) {
            list2 = new ArrayList<lIIIlllIIIllIIIllIII>();
            list.set(i, list2);
        }
        list2.add(liiIlllIIIllIIIllIII);
    }
    
    private static String[] IlIIIlIlIIIllIlIlIIl() {
        final ArrayList<String> list = new ArrayList<String>();
        final String s = "mcpatcher/ctm/default/";
        if (net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl(new lIllllIllIllIIllllll("textures/blocks/glass.png"))) {
            list.add(String.valueOf(s) + "glass.properties");
            list.add(String.valueOf(s) + "glasspane.properties");
        }
        if (net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl(new lIllllIllIllIIllllll("textures/blocks/bookshelf.png"))) {
            list.add(String.valueOf(s) + "bookshelf.properties");
        }
        if (net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl(new lIllllIllIllIIllllll("textures/blocks/sandstone_normal.png"))) {
            list.add(String.valueOf(s) + "sandstone.properties");
        }
        final String[] array = { "white", "orange", "magenta", "light_blue", "yellow", "lime", "pink", "gray", "silver", "cyan", "purple", "blue", "brown", "green", "red", "black" };
        for (int i = 0; i < array.length; ++i) {
            final String s2 = array[i];
            if (net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl(new lIllllIllIllIIllllll("textures/blocks/glass_" + s2 + ".png"))) {
                list.add(String.valueOf(s) + i + "_glass_" + s2 + "/glass_" + s2 + ".properties");
                list.add(String.valueOf(s) + i + "_glass_" + s2 + "/glass_pane_" + s2 + ".properties");
            }
        }
        return list.toArray(new String[list.size()]);
    }
    
    static /* synthetic */ int[] IlIlIlIlIlllllllllIl() {
        final int[] ilIIIlIIIllllIlIlIlI = net.optifine.llIIlIIIlIIIllIlIIIl.IlIIIlIIIllllIlIlIlI;
        if (ilIIIlIIIllllIlIlIlI != null) {
            return ilIIIlIIIllllIlIlIlI;
        }
        final int[] ilIIIlIIIllllIlIlIlI2 = new int[lllIllIIIllllllIllll.values().length];
        try {
            ilIIIlIIIllllIlIlIlI2[lllIllIIIllllllIllll.llllIIIIlIIIlIlllIll.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            ilIIIlIIIllllIlIlIlI2[lllIllIIIllllllIllll.IllIIlllIIIIlllIIlIl.ordinal()] = 6;
        }
        catch (NoSuchFieldError noSuchFieldError2) {}
        try {
            ilIIIlIIIllllIlIlIlI2[lllIllIIIllllllIllll.llIllIIIIIllIlIIIIlI.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError3) {}
        try {
            ilIIIlIIIllllIlIlIlI2[lllIllIIIllllllIllll.IlIIIlIlIIIllIlIlIIl.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError4) {}
        try {
            ilIIIlIIIllllIlIlIlI2[lllIllIIIllllllIllll.IlIlIlIlIlllllllllIl.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError5) {}
        try {
            ilIIIlIIIllllIlIlIlI2[lllIllIIIllllllIllll.IlIlIIIllIllIIIIIllI.ordinal()] = 5;
        }
        catch (NoSuchFieldError noSuchFieldError6) {}
        return net.optifine.llIIlIIIlIIIllIlIIIl.IlIIIlIIIllllIlIlIlI = ilIIIlIIIllllIlIlIlI2;
    }
}
