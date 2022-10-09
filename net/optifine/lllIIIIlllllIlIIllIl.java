package net.optifine;

import net.minecraft.lIIIlllIIIllIIIllIII.*;
import java.io.*;
import org.apache.commons.lang3.tuple.*;
import javax.imageio.*;
import java.awt.image.*;
import net.optifine.util.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.optifine.lIIIlllIIIllIIIllIII.*;
import net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.*;
import net.minecraft.llllIIIIlIIIlIlllIll.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.client.*;
import net.minecraft.llIllIlIIIIllIlIIllI.*;
import java.util.*;

public class lllIIIIlllllIlIIllIl
{
    private static String IlIlIlIlIlllllllllIl;
    private static IIlllIIlIllIllIlIIll llIllIIIIIllIlIIIIlI;
    private static IIlllIIlIllIllIlIIll IlIIIlIlIIIllIlIlIIl;
    private static IIlllIIlIllIllIlIIll IlIlIIIllIllIIIIIllI;
    private static IIlllIIlIllIllIlIIll IllIIlllIIIIlllIIlIl;
    private static IIlllIIlIllIllIlIIll llllIIIlIlllIlIIIIIl;
    private static IIlllIIlIllIllIlIIll[] lIIIIlIIIIIlllIllIII;
    private static IIlllIIlIllIllIlIIll[][] lIIIlllIIIllIIIllIII;
    private static IIlllIIlIllIllIlIIll llIIlIIIlIIIllIlIIIl;
    private static IlIllIlIlIIIlIlIlIII llIllIlIIIIllIlIIllI;
    private static IIlllIIlIllIllIlIIll lIlIlIIIllIIllIIIllI;
    private static IlIllIlIlIIIlIlIlIII IlIlIIIllIIllIlllllI;
    private static IIlllIIlIllIllIlIIll IIIIlllIIIIIIlIIIlll;
    private static IlIllIlIlIIIlIlIlIII llllIIllllIlIlIIIIll;
    private static IIlllIIlIllIllIlIIll IlIllIlIlIIIlIlIlIII;
    private static IlIllIlIlIIIlIlIlIII IIlllIIlIllIllIlIIll;
    private static lIIlIIIlIllIlIllIIIl[] lllIIIIlllllIlIIllIl;
    private static int IlIlIIIIIIlllIlIllIl;
    private static IIlllIIlIllIllIlIIll IIllIIllIIIlIlIIIIlI;
    private static IIlllIIlIllIllIlIIll IIIlIIIlIlIIlllIIlll;
    private static int IlIlIIIlIIlIlIIlllIl;
    private static IIlllIIlIllIllIlIIll IlllllllIIIlIIIlIlII;
    private static IIlllIIlIllIllIlIIll IIlIIIIlllIlllllIlII;
    private static IIlllIIlIllIllIlIIll IIIlIIlIIIIlllIlllII;
    private static IIlllIIlIllIllIlIIll IlIlIllllllllIIIIlII;
    private static IIlllIIlIllIllIlIIll IIlllIlIIllIlIlIlIIl;
    private static boolean llIIIlIlIllIIlIlIlII;
    private static int lllllIlIIIlIlIIlllII;
    private static int lIllllllIIllIlIlIlII;
    private static int llIIlllIIlllIIllIllI;
    private static int IIlllIIIlIlllIIlllII;
    private static int IIlIIIIIllIlIIIlIIll;
    private static int llllllIllIllIlIllllI;
    private static e IIIllllllIllIIIlllIl;
    private static e IlIIIlIIIllllIlIlIlI;
    private static e IIIIIllIIIIlIIIIllIl;
    private static int[] IIIIIIIIIlllIllIlIlI;
    private static int[] IIllllIIIlIIIIIIllIl;
    private static float[][] IlllIIIIlIIIlIlIlIIl;
    private static float[][] lllIllIIIllllllIllll;
    private static int[] llIllIlIlIIIIIIIllII;
    private static int[] IIlIlIlIIlIllIIIIIIl;
    private static int[] IllIllIIIIlIIlIlllII;
    private static final llIIlIIIlIIIllIlIIIl IlIllllIIlIIlIlIlIll;
    private static final llIIlIIIlIIIllIlIIIl IllIllIlllIllllIIllI;
    public static Random llllIIIIlIIIlIlllIll;
    private static final IIlIIIIlllIlllllIlII llIlIIIIIlIIlIlIIlll;
    private static final IIlIIIIlllIlllllIlII IlIIlIlIIIlIIlIlIlII;
    private static final IIlIIIIlllIlllllIlII IllIlIIllIllIIlIllII;
    private static final IIlIIIIlllIlllllIlII lIIlIIIlIllIlIllIIIl;
    private static final IIlIIIIlllIlllllIlII IIlIIIlllIllIllIlIII;
    
    static {
        net.optifine.lllIIIIlllllIlIIllIl.IlIlIlIlIlllllllllIl = "vanilla";
        net.optifine.lllIIIIlllllIlIIllIl.llIllIIIIIllIlIIIIlI = null;
        net.optifine.lllIIIIlllllIlIIllIl.IlIIIlIlIIIllIlIlIIl = null;
        net.optifine.lllIIIIlllllIlIIllIl.IlIlIIIllIllIIIIIllI = null;
        net.optifine.lllIIIIlllllIlIIllIl.IllIIlllIIIIlllIIlIl = null;
        net.optifine.lllIIIIlllllIlIIllIl.llllIIIlIlllIlIIIIIl = null;
        net.optifine.lllIIIIlllllIlIIllIl.lIIIIlIIIIIlllIllIII = null;
        net.optifine.lllIIIIlllllIlIIllIl.lIIIlllIIIllIIIllIII = null;
        net.optifine.lllIIIIlllllIlIIllIl.llIIlIIIlIIIllIlIIIl = null;
        net.optifine.lllIIIIlllllIlIIllIl.llIllIlIIIIllIlIIllI = new IlIllIlIlIIIlIlIlIII();
        net.optifine.lllIIIIlllllIlIIllIl.lIlIlIIIllIIllIIIllI = null;
        net.optifine.lllIIIIlllllIlIIllIl.IlIlIIIllIIllIlllllI = new IlIllIlIlIIIlIlIlIII();
        net.optifine.lllIIIIlllllIlIIllIl.IIIIlllIIIIIIlIIIlll = null;
        net.optifine.lllIIIIlllllIlIIllIl.llllIIllllIlIlIIIIll = new IlIllIlIlIIIlIlIlIII();
        net.optifine.lllIIIIlllllIlIIllIl.IlIllIlIlIIIlIlIlIII = null;
        net.optifine.lllIIIIlllllIlIIllIl.IIlllIIlIllIllIlIIll = new IlIllIlIlIIIlIlIlIII();
        net.optifine.lllIIIIlllllIlIIllIl.lllIIIIlllllIlIIllIl = null;
        net.optifine.lllIIIIlllllIlIIllIl.IlIlIIIIIIlllIlIllIl = 0;
        net.optifine.lllIIIIlllllIlIIllIl.IIllIIllIIIlIlIIIIlI = null;
        net.optifine.lllIIIIlllllIlIIllIl.IIIlIIIlIlIIlllIIlll = null;
        net.optifine.lllIIIIlllllIlIIllIl.IlIlIIIlIIlIlIIlllIl = -1;
        net.optifine.lllIIIIlllllIlIIllIl.IlllllllIIIlIIIlIlII = null;
        net.optifine.lllIIIIlllllIlIIllIl.IIlIIIIlllIlllllIlII = null;
        net.optifine.lllIIIIlllllIlIIllIl.IIIlIIlIIIIlllIlllII = null;
        net.optifine.lllIIIIlllllIlIIllIl.IlIlIllllllllIIIIlII = null;
        net.optifine.lllIIIIlllllIlIIllIl.IIlllIlIIllIlIlIlIIl = null;
        net.optifine.lllIIIIlllllIlIIllIl.llIIIlIlIllIIlIlIlII = true;
        net.optifine.lllIIIIlllllIlIIllIl.lllllIlIIIlIlIIlllII = -1;
        net.optifine.lllIIIIlllllIlIIllIl.lIllllllIIllIlIlIlII = -1;
        net.optifine.lllIIIIlllllIlIIllIl.llIIlllIIlllIIllIllI = -1;
        net.optifine.lllIIIIlllllIlIIllIl.IIlllIIIlIlllIIlllII = -1;
        net.optifine.lllIIIIlllllIlIIllIl.IIlIIIIIllIlIIIlIIll = -1;
        net.optifine.lllIIIIlllllIlIIllIl.llllllIllIllIlIllllI = -1;
        net.optifine.lllIIIIlllllIlIIllIl.IIIllllllIllIIIlllIl = null;
        net.optifine.lllIIIIlllllIlIIllIl.IlIIIlIIIllllIlIlIlI = null;
        net.optifine.lllIIIIlllllIlIIllIl.IIIIIllIIIIlIIIIllIl = null;
        net.optifine.lllIIIIlllllIlIIllIl.IIIIIIIIIlllIllIlIlI = null;
        net.optifine.lllIIIIlllllIlIIllIl.IIllllIIIlIIIIIIllIl = null;
        net.optifine.lllIIIIlllllIlIIllIl.IlllIIIIlIIIlIlIlIIl = null;
        net.optifine.lllIIIIlllllIlIIllIl.lllIllIIIllllllIllll = null;
        net.optifine.lllIIIIlllllIlIIllIl.llIllIlIlIIIIIIIllII = null;
        net.optifine.lllIIIIlllllIlIIllIl.IIlIlIlIIlIllIIIIIIl = null;
        net.optifine.lllIIIIlllllIlIIllIl.IllIllIIIIlIIlIlllII = null;
        IlIllllIIlIIlIlIlIll = net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl.lllIllIIIllllllIllll();
        IllIllIlllIllllIIllI = net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl.lllIllIIIllllllIllll();
        net.optifine.lllIIIIlllllIlIIllIl.llllIIIIlIIIlIlllIll = new Random();
        llIlIIIIIlIIlIlIIlll = new IlIlIIIIIIlllIlIllIl();
        IlIIlIlIIIlIIlIlIlII = new IIllIIllIIIlIlIIIIlI();
        IllIlIIllIllIIlIllII = new IIIlIIIlIlIIlllIIlll();
        lIIlIIIlIllIlIllIIIl = new IlIlIIIlIIlIlIIlllIl();
        IIlIIIlllIllIllIlIII = new IlllllllIIIlIIIlIlII();
    }
    
    public static void llllIIIIlIIIlIlllIll() {
        net.optifine.lllIIIIlllllIlIIllIl.IlIlIlIlIlllllllllIl = "vanilla";
        net.optifine.lllIIIIlllllIlIIllIl.llIllIIIIIllIlIIIIlI = null;
        net.optifine.lllIIIIlllllIlIIllIl.IlIlIIIllIllIIIIIllI = null;
        net.optifine.lllIIIIlllllIlIIllIl.IlIIIlIlIIIllIlIlIIl = null;
        net.optifine.lllIIIIlllllIlIIllIl.llllIIIlIlllIlIIIIIl = null;
        net.optifine.lllIIIIlllllIlIIllIl.IllIIlllIIIIlllIIlIl = null;
        net.optifine.lllIIIIlllllIlIIllIl.llIIlIIIlIIIllIlIIIl = null;
        net.optifine.lllIIIIlllllIlIIllIl.lIlIlIIIllIIllIIIllI = null;
        net.optifine.lllIIIIlllllIlIIllIl.IIIIlllIIIIIIlIIIlll = null;
        net.optifine.lllIIIIlllllIlIIllIl.IlIllIlIlIIIlIlIlIII = null;
        net.optifine.lllIIIIlllllIlIIllIl.IIllIIllIIIlIlIIIIlI = null;
        net.optifine.lllIIIIlllllIlIIllIl.IIIlIIIlIlIIlllIIlll = null;
        net.optifine.lllIIIIlllllIlIIllIl.IlIlIIIlIIlIlIIlllIl = -1;
        net.optifine.lllIIIIlllllIlIIllIl.IlllllllIIIlIIIlIlII = null;
        net.optifine.lllIIIIlllllIlIIllIl.IIlIIIIlllIlllllIlII = null;
        net.optifine.lllIIIIlllllIlIIllIl.IIlllIlIIllIlIlIlIIl = null;
        net.optifine.lllIIIIlllllIlIIllIl.lllIIIIlllllIlIIllIl = null;
        net.optifine.lllIIIIlllllIlIIllIl.lllllIlIIIlIlIIlllII = -1;
        net.optifine.lllIIIIlllllIlIIllIl.lIllllllIIllIlIlIlII = -1;
        net.optifine.lllIIIIlllllIlIIllIl.llIIlllIIlllIIllIllI = -1;
        net.optifine.lllIIIIlllllIlIIllIl.IIlllIIIlIlllIIlllII = -1;
        net.optifine.lllIIIIlllllIlIIllIl.IIlIIIIIllIlIIIlIIll = -1;
        net.optifine.lllIIIIlllllIlIIllIl.llllllIllIllIlIllllI = -1;
        net.optifine.lllIIIIlllllIlIIllIl.IIIllllllIllIIIlllIl = null;
        net.optifine.lllIIIIlllllIlIIllIl.IlIIIlIIIllllIlIlIlI = null;
        net.optifine.lllIIIIlllllIlIIllIl.IIIIIllIIIIlIIIIllIl = null;
        net.optifine.lllIIIIlllllIlIIllIl.lIIIIlIIIIIlllIllIII = null;
        net.optifine.lllIIIIlllllIlIIllIl.lIIIlllIIIllIIIllIII = null;
        net.optifine.lllIIIIlllllIlIIllIl.llIIIlIlIllIIlIlIlII = true;
        net.optifine.lllIIIIlllllIlIIllIl.IIIIIIIIIlllIllIlIlI = null;
        net.optifine.lllIIIIlllllIlIIllIl.IIllllIIIlIIIIIIllIl = null;
        net.optifine.lllIIIIlllllIlIIllIl.IlllIIIIlIIIlIlIlIIl = null;
        net.optifine.lllIIIIlllllIlIIllIl.lllIllIIIllllllIllll = null;
        net.optifine.lllIIIIlllllIlIIllIl.llIllIlIlIIIIIIIllII = null;
        llllIIIIlIIIlIlllIll(net.optifine.lllIIIIlllllIlIIllIl.IIlIlIlIIlIllIIIIIIl);
        net.optifine.lllIIIIlllllIlIIllIl.IllIllIIIIlIIlIlllII = null;
        net.optifine.lllIIIIlllllIlIIllIl.IlIlIlIlIlllllllllIl = llllIIIIlIIIlIlllIll("mcpatcher/color.properties", "palette.format", net.optifine.IIlllIIlIllIllIlIIll.IllIIlllIIIIlllIIlIl, "vanilla");
        final String s = "mcpatcher/colormap/";
        net.optifine.lllIIIIlllllIlIIllIl.llIllIIIIIllIlIIIIlI = llllIIIIlIIIlIlllIll(s, new String[] { "water.png", "watercolorX.png" }, 256, 256);
        IlIlIlIlIlllllllllIl();
        if (net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.lllIIIIlIlIllIIlIIIl()) {
            net.optifine.lllIIIIlllllIlIIllIl.IlIIIlIlIIIllIlIlIIl = llllIIIIlIIIlIlllIll(s, new String[] { "pine.png", "pinecolor.png" }, 256, 256);
            net.optifine.lllIIIIlllllIlIIllIl.IlIlIIIllIllIIIIIllI = llllIIIIlIIIlIlllIll(s, new String[] { "birch.png", "birchcolor.png" }, 256, 256);
            net.optifine.lllIIIIlllllIlIIllIl.llllIIIlIlllIlIIIIIl = llllIIIIlIIIlIlllIll(s, new String[] { "swampgrass.png", "swampgrasscolor.png" }, 256, 256);
            net.optifine.lllIIIIlllllIlIIllIl.IllIIlllIIIIlllIIlIl = llllIIIIlIIIlIlllIll(s, new String[] { "swampfoliage.png", "swampfoliagecolor.png" }, 256, 256);
            net.optifine.lllIIIIlllllIlIIllIl.llIIlIIIlIIIllIlIIIl = llllIIIIlIIIlIlllIll(s, new String[] { "sky0.png", "skycolor0.png" }, 256, 256);
            net.optifine.lllIIIIlllllIlIIllIl.lIlIlIIIllIIllIIIllI = llllIIIIlIIIlIlllIll(s, new String[] { "fog0.png", "fogcolor0.png" }, 256, 256);
            net.optifine.lllIIIIlllllIlIIllIl.IIIIlllIIIIIIlIIIlll = llllIIIIlIIIlIlllIll(s, new String[] { "underwater.png", "underwatercolor.png" }, 256, 256);
            net.optifine.lllIIIIlllllIlIIllIl.IlIllIlIlIIIlIlIlIII = llllIIIIlIIIlIlllIll(s, new String[] { "underlava.png", "underlavacolor.png" }, 256, 256);
            net.optifine.lllIIIIlllllIlIIllIl.IIllIIllIIIlIlIIIIlI = llllIIIIlIIIlIlllIll(s, new String[] { "redstone.png", "redstonecolor.png" }, 16, 1);
            net.optifine.lllIIIIlllllIlIIllIl.IIIlIIIlIlIIlllIIlll = llllIIIIlIIIlIlllIll(String.valueOf(s) + "xporb.png", -1, -1);
            net.optifine.lllIIIIlllllIlIIllIl.IlllllllIIIlIIIlIlII = llllIIIIlIIIlIlllIll(String.valueOf(s) + "durability.png", -1, -1);
            net.optifine.lllIIIIlllllIlIIllIl.IIlIIIIlllIlllllIlII = llllIIIIlIIIlIlllIll(s, new String[] { "stem.png", "stemcolor.png" }, 8, 1);
            net.optifine.lllIIIIlllllIlIIllIl.IlIlIllllllllIIIIlII = llllIIIIlIIIlIlllIll(String.valueOf(s) + "pumpkinstem.png", 8, 1);
            net.optifine.lllIIIIlllllIlIIllIl.IIIlIIlIIIIlllIlllII = llllIIIIlIIIlIlllIll(String.valueOf(s) + "melonstem.png", 8, 1);
            net.optifine.lllIIIIlllllIlIIllIl.IIlllIlIIllIlIlIlIIl = llllIIIIlIIIlIlllIll(s, new String[] { "myceliumparticle.png", "myceliumparticlecolor.png" }, -1, -1);
            final Pair liiiIlIIIIIlllIllIII = lIIIIlIIIIIlllIllIII();
            net.optifine.lllIIIIlllllIlIIllIl.lllIIIIlllllIlIIllIl = (lIIlIIIlIllIlIllIIIl[])liiiIlIIIIIlllIllIII.getLeft();
            net.optifine.lllIIIIlllllIlIIllIl.IlIlIIIIIIlllIlIllIl = (int)liiiIlIIIIIlllIllIII.getRight();
            llllIIIIlIIIlIlllIll("mcpatcher/color.properties");
            net.optifine.lllIIIIlllllIlIIllIl.lIIIlllIIIllIIIllIII = llllIIIIlIIIlIlllIll(new String[] { String.valueOf(s) + "custom/", String.valueOf(s) + "blocks/" }, net.optifine.lllIIIIlllllIlIIllIl.lIIIIlIIIIIlllIllIII, 256, 256);
            IlIlIlIlIlllllllllIl();
        }
    }
    
    private static String llllIIIIlIIIlIlllIll(final String s, final String s2, final String[] array, final String s3) {
        try {
            final InputStream llllIIIIlIIIlIlllIll = net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(new lIllllIllIllIIllllll(s));
            if (llllIIIIlIIIlIlllIll == null) {
                return s3;
            }
            final llIIlllIIlllIIllIllI llIIlllIIlllIIllIllI = new llIIlllIIlllIIllIllI();
            llIIlllIIlllIIllIllI.load(llllIIIIlIIIlIlllIll);
            llllIIIIlIIIlIlllIll.close();
            final String property = llIIlllIIlllIIllIllI.getProperty(s2);
            if (property == null) {
                return s3;
            }
            if (!Arrays.asList(array).contains(property)) {
                IllIIlllIIIIlllIIlIl("Invalid value: " + s2 + "=" + property);
                IllIIlllIIIIlllIIlIl("Expected values: " + net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(array));
                return s3;
            }
            IlIlIIIllIllIIIIIllI(s2 + "=" + property);
            return property;
        }
        catch (FileNotFoundException ex2) {
            return s3;
        }
        catch (IOException ex) {
            ex.printStackTrace();
            return s3;
        }
    }
    
    private static Pair lIIIIlIIIIIlllIllIII() {
        final String s = "mcpatcher/lightmap/world";
        final String s2 = ".png";
        final String[] llllIIIIlIIIlIlllIll = net.optifine.util.IIlIIIIIllIlIIIlIIll.llllIIIIlIIIlIlllIll(s, s2);
        final HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
        for (int i = 0; i < llllIIIIlIIIlIlllIll.length; ++i) {
            final String s3 = llllIIIIlIIIlIlllIll[i];
            final String llIllIIIIIllIlIIIIlI = net.optifine.util.IIIllllllIllIIIlllIl.llIllIIIIIllIlIIIIlI(s3, s, s2);
            final int llllIIIIlIIIlIlllIll2 = net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI, Integer.MIN_VALUE);
            if (llllIIIIlIIIlIlllIll2 == Integer.MIN_VALUE) {
                IllIIlllIIIIlllIIlIl("Invalid dimension ID: " + llIllIIIIIllIlIIIIlI + ", path: " + s3);
            }
            else {
                hashMap.put(llllIIIIlIIIlIlllIll2, s3);
            }
        }
        final Set<Object> keySet = hashMap.keySet();
        final Integer[] array = keySet.toArray(new Integer[keySet.size()]);
        Arrays.sort(array);
        if (array.length <= 0) {
            return (Pair)new ImmutablePair((Object)null, (Object)0);
        }
        final int intValue = array[0];
        final IIlllIIlIllIllIlIIll[] array2 = new IIlllIIlIllIllIlIIll[array[array.length - 1] - intValue + 1];
        for (int j = 0; j < array.length; ++j) {
            final Integer n = array[j];
            final String s4 = hashMap.get(n);
            final IIlllIIlIllIllIlIIll llllIIIIlIIIlIlllIll3 = llllIIIIlIIIlIlllIll(s4, -1, -1);
            if (llllIIIIlIIIlIlllIll3 != null) {
                if (llllIIIIlIIIlIlllIll3.IlIlIIIllIllIIIIIllI() < 16) {
                    IllIIlllIIIIlllIIlIl("Invalid lightmap width: " + llllIIIIlIIIlIlllIll3.IlIlIIIllIllIIIIIllI() + ", path: " + s4);
                }
                else {
                    array2[n - intValue] = llllIIIIlIIIlIlllIll3;
                }
            }
        }
        final lIIlIIIlIllIlIllIIIl[] array3 = new lIIlIIIlIllIlIllIIIl[array2.length];
        for (int k = 0; k < array2.length; ++k) {
            final IIlllIIlIllIllIlIIll illlIIlIllIllIlIIll = array2[k];
            if (illlIIlIllIllIlIIll != null) {
                final String llllIIIIlIIIlIlllIll4 = illlIIlIllIllIlIIll.llllIIIIlIIIlIlllIll;
                final String ilIlIlIlIlllllllllIl = illlIIlIllIllIlIIll.IlIlIlIlIlllllllllIl;
                final IIlllIIlIllIllIlIIll llllIIIIlIIIlIlllIll5 = llllIIIIlIIIlIlllIll(String.valueOf(ilIlIlIlIlllllllllIl) + "/" + llllIIIIlIIIlIlllIll4 + "_rain.png", -1, -1);
                final IIlllIIlIllIllIlIIll llllIIIIlIIIlIlllIll6 = llllIIIIlIIIlIlllIll(String.valueOf(ilIlIlIlIlllllllllIl) + "/" + llllIIIIlIIIlIlllIll4 + "_thunder.png", -1, -1);
                array3[k] = new lIIlIIIlIllIlIllIIIl(new IllIlIIllIllIIlIllII(illlIIlIllIllIlIIll), (llllIIIIlIIIlIlllIll5 != null) ? new IllIlIIllIllIIlIllII(llllIIIIlIIIlIlllIll5) : null, (llllIIIIlIIIlIlllIll6 != null) ? new IllIlIIllIllIIlIllII(llllIIIIlIIIlIlllIll6) : null);
            }
        }
        return (Pair)new ImmutablePair((Object)array3, (Object)intValue);
    }
    
    private static int llllIIIIlIIIlIlllIll(final String s, final int n) {
        try {
            final InputStream llllIIIIlIIIlIlllIll = net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(new lIllllIllIllIIllllll(s));
            if (llllIIIIlIIIlIlllIll == null) {
                return n;
            }
            final BufferedImage read = ImageIO.read(llllIIIIlIIIlIlllIll);
            llllIIIIlIIIlIlllIll.close();
            return (read == null) ? n : read.getHeight();
        }
        catch (IOException ex) {
            return n;
        }
    }
    
    private static void llllIIIIlIIIlIlllIll(final String s) {
        try {
            final InputStream llllIIIIlIIIlIlllIll = net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(new lIllllIllIllIIllllll(s));
            if (llllIIIIlIIIlIlllIll == null) {
                return;
            }
            IlIlIIIllIllIIIIIllI("Loading " + s);
            final llIIlllIIlllIIllIllI llIIlllIIlllIIllIllI = new llIIlllIIlllIIllIllI();
            llIIlllIIlllIIllIllI.load(llllIIIIlIIIlIlllIll);
            llllIIIIlIIIlIlllIll.close();
            net.optifine.lllIIIIlllllIlIIllIl.lllllIlIIIlIlIIlllII = llllIIIIlIIIlIlllIll(llIIlllIIlllIIllIllI, new String[] { "particle.water", "drop.water" });
            net.optifine.lllIIIIlllllIlIIllIl.lIllllllIIllIlIlIlII = IlIlIlIlIlllllllllIl(llIIlllIIlllIIllIllI, "particle.portal");
            net.optifine.lllIIIIlllllIlIIllIl.llIIlllIIlllIIllIllI = IlIlIlIlIlllllllllIl(llIIlllIIlllIIllIllI, "lilypad");
            net.optifine.lllIIIIlllllIlIIllIl.IIlllIIIlIlllIIlllII = IlIlIlIlIlllllllllIl(llIIlllIIlllIIllIllI, "text.xpbar");
            net.optifine.lllIIIIlllllIlIIllIl.IIlIIIIIllIlIIIlIIll = IlIlIlIlIlllllllllIl(llIIlllIIlllIIllIllI, "text.boss");
            net.optifine.lllIIIIlllllIlIIllIl.llllllIllIllIlIllllI = IlIlIlIlIlllllllllIl(llIIlllIIlllIIllIllI, "text.sign");
            net.optifine.lllIIIIlllllIlIIllIl.IIIllllllIllIIIlllIl = llIllIIIIIllIlIIIIlI(llIIlllIIlllIIllIllI, "fog.nether");
            net.optifine.lllIIIIlllllIlIIllIl.IlIIIlIIIllllIlIlIlI = llIllIIIIIllIlIIIIlI(llIIlllIIlllIIllIllI, "fog.end");
            net.optifine.lllIIIIlllllIlIIllIl.IIIIIllIIIIlIIIIllIl = llIllIIIIIllIlIIIIlI(llIIlllIIlllIIllIllI, "sky.end");
            net.optifine.lllIIIIlllllIlIIllIl.lIIIIlIIIIIlllIllIII = llllIIIIlIIIlIlllIll(llIIlllIIlllIIllIllI, s);
            net.optifine.lllIIIIlllllIlIIllIl.IIIIIIIIIlllIllIlIlI = llllIIIIlIIIlIlllIll(llIIlllIIlllIIllIllI, s, "egg.shell.", "Spawn egg shell");
            net.optifine.lllIIIIlllllIlIIllIl.IIllllIIIlIIIIIIllIl = llllIIIIlIIIlIlllIll(llIIlllIIlllIIllIllI, s, "egg.spots.", "Spawn egg spot");
            net.optifine.lllIIIIlllllIlIIllIl.IlllIIIIlIIIlIlIlIIl = IlIlIlIlIlllllllllIl(llIIlllIIlllIIllIllI, s, "collar.", "Wolf collar");
            net.optifine.lllIIIIlllllIlIIllIl.lllIllIIIllllllIllll = IlIlIlIlIlllllllllIl(llIIlllIIlllIIllIllI, s, "sheep.", "Sheep");
            net.optifine.lllIIIIlllllIlIIllIl.llIllIlIlIIIIIIIllII = llIllIIIIIllIlIIIIlI(llIIlllIIlllIIllIllI, s, "text.code.", "Text");
            final int[] ilIIIlIlIIIllIlIlIIl = IlIIIlIlIIIllIlIlIIl(llIIlllIIlllIIllIllI, s, "map.", "Map");
            if (ilIIIlIlIIIllIlIlIIl != null) {
                if (net.optifine.lllIIIIlllllIlIIllIl.IIlIlIlIIlIllIIIIIIl == null) {
                    net.optifine.lllIIIIlllllIlIIllIl.IIlIlIlIIlIllIIIIIIl = lIIIlllIIIllIIIllIII();
                }
                llllIIIIlIIIlIlllIll(ilIIIlIlIIIllIlIlIIl);
            }
            net.optifine.lllIIIIlllllIlIIllIl.IllIllIIIIlIIlIlllII = IlIlIIIllIllIIIIIllI(llIIlllIIlllIIllIllI, s, "potion.", "Potion");
            net.optifine.lllIIIIlllllIlIIllIl.IlIlIIIlIIlIlIIlllIl = net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(llIIlllIIlllIIllIllI.getProperty("xporb.time"), -1);
        }
        catch (FileNotFoundException ex2) {}
        catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    
    private static IIlllIIlIllIllIlIIll[] llllIIIIlIIIlIlllIll(final Properties properties, final String s) {
        final ArrayList<IIlllIIlIllIllIlIIll> list = new ArrayList<IIlllIIlIllIllIlIIll>();
        final String s2 = "palette.block.";
        final HashMap<String, String> hashMap = new HashMap<String, String>();
        for (final String s3 : ((Hashtable<String, V>)properties).keySet()) {
            final String property = properties.getProperty(s3);
            if (s3.startsWith(s2)) {
                hashMap.put(s3, property);
            }
        }
        final String[] array = hashMap.keySet().toArray(new String[hashMap.size()]);
        for (int i = 0; i < array.length; ++i) {
            final String s4 = array[i];
            final String property2 = properties.getProperty(s4);
            IlIlIIIllIllIIIIIllI("Block palette: " + s4 + " = " + property2);
            final String llllIIIIlIIIlIlllIll = net.optifine.util.IlIIIlIIIllllIlIlIlI.llllIIIIlIIIlIlllIll(s4.substring(s2.length()), net.optifine.util.IlIIIlIIIllllIlIlIlI.llllIIIIlIIIlIlllIll(s));
            final IIlllIIlIllIllIlIIll llllIIIIlIIIlIlllIll2 = llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll, 256, 256);
            if (llllIIIIlIIIlIlllIll2 == null) {
                IllIIlllIIIIlllIIlIl("Colormap not found: " + llllIIIIlIIIlIlllIll);
            }
            else {
                final net.optifine.llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl[] llIllIIIIIllIlIIIIlI = new net.optifine.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll("CustomColors").llIllIIIIIllIlIIIIlI(property2);
                if (llIllIIIIIllIlIIIIlI != null && llIllIIIIIllIlIIIIlI.length > 0) {
                    for (int j = 0; j < llIllIIIIIllIlIIIIlI.length; ++j) {
                        llllIIIIlIIIlIlllIll2.llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI[j]);
                    }
                    list.add(llllIIIIlIIIlIlllIll2);
                }
                else {
                    IllIIlllIIIIlllIIlIl("Invalid match blocks: " + property2);
                }
            }
        }
        if (list.size() <= 0) {
            return null;
        }
        return list.toArray(new IIlllIIlIllIllIlIIll[list.size()]);
    }
    
    private static IIlllIIlIllIllIlIIll[][] llllIIIIlIIIlIlllIll(final String[] array, final IIlllIIlIllIllIlIIll[] array2, final int n, final int n2) {
        final String[] llllIIIIlIIIlIlllIll = net.optifine.util.IIlIIIIIllIlIIIlIIll.llllIIIIlIIIlIlllIll(array, new String[] { ".properties" });
        Arrays.sort(llllIIIIlIIIlIlllIll);
        final ArrayList list = new ArrayList();
        for (int i = 0; i < llllIIIIlIIIlIlllIll.length; ++i) {
            final String s = llllIIIIlIIIlIlllIll[i];
            IlIlIIIllIllIIIIIllI("Block colormap: " + s);
            try {
                final InputStream llllIIIIlIIIlIlllIll2 = net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(new lIllllIllIllIIllllll("minecraft", s));
                if (llllIIIIlIIIlIlllIll2 == null) {
                    IllIIlllIIIIlllIIlIl("File not found: " + s);
                }
                else {
                    final llIIlllIIlllIIllIllI llIIlllIIlllIIllIllI = new llIIlllIIlllIIllIllI();
                    llIIlllIIlllIIllIllI.load(llllIIIIlIIIlIlllIll2);
                    llllIIIIlIIIlIlllIll2.close();
                    final IIlllIIlIllIllIlIIll illlIIlIllIllIlIIll = new IIlllIIlIllIllIlIIll(llIIlllIIlllIIllIllI, s, n, n2, net.optifine.lllIIIIlllllIlIIllIl.IlIlIlIlIlllllllllIl);
                    if (illlIIlIllIllIlIIll.llllIIIIlIIIlIlllIll(s) && illlIIlIllIllIlIIll.IlIlIlIlIlllllllllIl(s)) {
                        llllIIIIlIIIlIlllIll(illlIIlIllIllIlIIll, list);
                    }
                }
            }
            catch (FileNotFoundException ex2) {
                IllIIlllIIIIlllIIlIl("File not found: " + s);
            }
            catch (Exception ex) {
                ex.printStackTrace();
            }
        }
        if (array2 != null) {
            for (int j = 0; j < array2.length; ++j) {
                llllIIIIlIIIlIlllIll(array2[j], list);
            }
        }
        if (list.size() <= 0) {
            return null;
        }
        return llllIIIIlIIIlIlllIll(list);
    }
    
    private static void llllIIIIlIIIlIlllIll(final IIlllIIlIllIllIlIIll illlIIlIllIllIlIIll, final List list) {
        final int[] llllIIIlIlllIlIIIIIl = illlIIlIllIllIlIIll.llllIIIlIlllIlIIIIIl();
        if (llllIIIlIlllIlIIIIIl != null && llllIIIlIlllIlIIIIIl.length > 0) {
            for (int i = 0; i < llllIIIlIlllIlIIIIIl.length; ++i) {
                final int n = llllIIIlIlllIlIIIIIl[i];
                if (n < 0) {
                    IllIIlllIIIIlllIIlIl("Invalid block ID: " + n);
                }
                else {
                    llllIIIIlIIIlIlllIll(illlIIlIllIllIlIIll, list, n);
                }
            }
        }
        else {
            IllIIlllIIIIlllIIlIl("No match blocks: " + net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(llllIIIlIlllIlIIIIIl));
        }
    }
    
    private static void llllIIIIlIIIlIlllIll(final IIlllIIlIllIllIlIIll illlIIlIllIllIlIIll, final List list, final int i) {
        while (i >= list.size()) {
            list.add(null);
        }
        List<IIlllIIlIllIllIlIIll> list2 = list.get(i);
        if (list2 == null) {
            list2 = new ArrayList<IIlllIIlIllIllIlIIll>();
            list.set(i, list2);
        }
        list2.add(illlIIlIllIllIlIIll);
    }
    
    private static IIlllIIlIllIllIlIIll[][] llllIIIIlIIIlIlllIll(final List list) {
        final IIlllIIlIllIllIlIIll[][] array = new IIlllIIlIllIllIlIIll[list.size()][];
        for (int i = 0; i < list.size(); ++i) {
            final List list2 = list.get(i);
            if (list2 != null) {
                array[i] = (IIlllIIlIllIllIlIIll[])list2.toArray(new IIlllIIlIllIllIlIIll[list2.size()]);
            }
        }
        return array;
    }
    
    private static int llllIIIIlIIIlIlllIll(final Properties properties, final String[] array) {
        for (int i = 0; i < array.length; ++i) {
            final int ilIlIlIlIlllllllllIl = IlIlIlIlIlllllllllIl(properties, array[i]);
            if (ilIlIlIlIlllllllllIl >= 0) {
                return ilIlIlIlIlllllllllIl;
            }
        }
        return -1;
    }
    
    private static int IlIlIlIlIlllllllllIl(final Properties properties, final String s) {
        final String property = properties.getProperty(s);
        if (property == null) {
            return -1;
        }
        final String trim = property.trim();
        final int ilIlIlIlIlllllllllIl = IlIlIlIlIlllllllllIl(trim);
        if (ilIlIlIlIlllllllllIl < 0) {
            IllIIlllIIIIlllIIlIl("Invalid color: " + s + " = " + trim);
            return ilIlIlIlIlllllllllIl;
        }
        IlIlIIIllIllIIIIIllI(String.valueOf(s) + " = " + trim);
        return ilIlIlIlIlllllllllIl;
    }
    
    private static int IlIlIlIlIlllllllllIl(String trim) {
        if (trim == null) {
            return -1;
        }
        trim = trim.trim();
        try {
            return Integer.parseInt(trim, 16) & 0xFFFFFF;
        }
        catch (NumberFormatException ex) {
            return -1;
        }
    }
    
    private static e llIllIIIIIllIlIIIIlI(final Properties properties, final String s) {
        final int ilIlIlIlIlllllllllIl = IlIlIlIlIlllllllllIl(properties, s);
        if (ilIlIlIlIlllllllllIl < 0) {
            return null;
        }
        return new e((ilIlIlIlIlllllllllIl >> 16 & 0xFF) / 255.0f, (ilIlIlIlIlllllllllIl >> 8 & 0xFF) / 255.0f, (ilIlIlIlIlllllllllIl & 0xFF) / 255.0f);
    }
    
    private static IIlllIIlIllIllIlIIll llllIIIIlIIIlIlllIll(final String s, final String[] array, final int n, final int n2) {
        for (int i = 0; i < array.length; ++i) {
            final IIlllIIlIllIllIlIIll llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll(String.valueOf(s) + array[i], n, n2);
            if (llllIIIIlIIIlIlllIll != null) {
                return llllIIIIlIIIlIlllIll;
            }
        }
        return null;
    }
    
    public static IIlllIIlIllIllIlIIll llllIIIIlIIIlIlllIll(final String s, final int n, final int n2) {
        try {
            if (!net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI(new lIllllIllIllIIllllll(s))) {
                return null;
            }
            IlIlIIIllIllIIIIIllI("Colormap " + s);
            final llIIlllIIlllIIllIllI llIIlllIIlllIIllIllI = new llIIlllIIlllIIllIllI();
            String llllIIIIlIIIlIlllIll = net.optifine.util.IIIllllllIllIIIlllIl.llllIIIIlIIIlIlllIll(s, ".png", ".properties");
            final lIllllIllIllIIllllll lIllllIllIllIIllllll = new lIllllIllIllIIllllll(llllIIIIlIIIlIlllIll);
            if (net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI(lIllllIllIllIIllllll)) {
                final InputStream llllIIIIlIIIlIlllIll2 = net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(lIllllIllIllIIllllll);
                llIIlllIIlllIIllIllI.load(llllIIIIlIIIlIlllIll2);
                llllIIIIlIIIlIlllIll2.close();
                IlIlIIIllIllIIIIIllI("Colormap properties: " + llllIIIIlIIIlIlllIll);
            }
            else {
                ((Hashtable<String, String>)llIIlllIIlllIIllIllI).put("format", net.optifine.lllIIIIlllllIlIIllIl.IlIlIlIlIlllllllllIl);
                ((Hashtable<String, String>)llIIlllIIlllIIllIllI).put("source", s);
                llllIIIIlIIIlIlllIll = s;
            }
            final IIlllIIlIllIllIlIIll illlIIlIllIllIlIIll = new IIlllIIlIllIllIlIIll(llIIlllIIlllIIllIllI, llllIIIIlIIIlIlllIll, n, n2, net.optifine.lllIIIIlllllIlIIllIl.IlIlIlIlIlllllllllIl);
            return illlIIlIllIllIlIIll.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll) ? illlIIlIllIllIlIIll : null;
        }
        catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }
    
    public static void IlIlIlIlIlllllllllIl() {
        net.optifine.lllIIIIlllllIlIIllIl.llIIIlIlIllIIlIlIlII = (net.optifine.lllIIIIlllllIlIIllIl.IlIlIIIllIllIIIIIllI == null && net.optifine.lllIIIIlllllIlIIllIl.IlIIIlIlIIIllIlIlIIl == null && net.optifine.lllIIIIlllllIlIIllIl.llllIIIlIlllIlIIIIIl == null && net.optifine.lllIIIIlllllIlIIllIl.IllIIlllIIIIlllIIlIl == null && net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llllllIIIIIIIlllIIll() && net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.lIllllIllIllIIllllll());
    }
    
    public static int llllIIIIlIIIlIlllIll(final net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final lIlIlIIIllIIllIIIllI lIlIlIIIllIIllIIIllI, IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final llllIIIlIlllIlIIIIIl llllIIIlIlllIlIIIIIl) {
        final net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llIllIIIIIllIlIIIIlI = llIIlIIIlIIIllIlIIIl.llIllIIIIIllIlIIIIlI();
        llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl2 = llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl();
        if (net.optifine.lllIIIIlllllIlIIllIl.lIIIlllIIIllIIIllIII != null) {
            if (!llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI()) {
                if (llIllIIIIIllIlIIIIlI == llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI) {
                    llIIlIIIlIIIllIlIIIl2 = net.optifine.lllIIIIlllllIlIIllIl.IlIllllIIlIIlIlIlIll;
                }
                if (llIllIIIIIllIlIIIIlI == llllIIIIlIIIlIlllIll.IllIIlllllIIllIIllIl) {
                    return -1;
                }
            }
            if (llIllIIIIIllIlIIIIlI == llllIIIIlIIIlIlllIll.aJ && llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl() >= 8) {
                ilIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl();
                llIIlIIIlIIIllIlIIIl2 = lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl);
            }
            final IIlllIIlIllIllIlIIll llllIIIIlIIIlIlllIll2 = llllIIIIlIIIlIlllIll(llIIlIIIlIIIllIlIIIl2);
            if (llllIIIIlIIIlIlllIll2 != null) {
                if (net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.lIllllIllIllIIllllll() && !llllIIIIlIIIlIlllIll2.llIllIIIIIllIlIIIIlI()) {
                    return llllIIIIlIIIlIlllIll(llIIlIIIlIIIllIlIIIl, lIlIlIIIllIIllIIIllI, ilIlIlIlIlllllllllIl, llllIIIIlIIIlIlllIll2, llllIIIlIlllIlIIIIIl.lIIIIlIIIIIlllIllIII());
                }
                return llllIIIIlIIIlIlllIll2.llllIIIIlIIIlIlllIll(lIlIlIIIllIIllIIIllI, ilIlIlIlIlllllllllIl);
            }
        }
        if (!llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI()) {
            return -1;
        }
        if (llIllIIIIIllIlIIIIlI == llllIIIIlIIIlIlllIll.B) {
            return IlIlIlIlIlllllllllIl(lIlIlIIIllIIllIIIllI, ilIlIlIlIlllllllllIl);
        }
        if (llIllIIIIIllIlIIIIlI == llllIIIIlIIIlIlllIll.IllIIlllllIIllIIllIl) {
            return IlIlIlIlIlllllllllIl(llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl());
        }
        if (llIllIIIIIllIlIIIIlI instanceof cr) {
            return llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI, lIlIlIIIllIIllIIIllI, ilIlIlIlIlllllllllIl, llllIIIlIlllIlIIIIIl);
        }
        if (net.optifine.lllIIIIlllllIlIIllIl.llIIIlIlIllIIlIlIlII) {
            return -1;
        }
        final int ilIlIlIlIlllllllllIl2 = llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl();
        IIlIIIIlllIlllllIlII ilIIIIlllIlllllIlII;
        if (llIllIIIIIllIlIIIIlI != llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI && llIllIIIIIllIlIIIIlI != llllIIIIlIIIlIlllIll.llllllIllIllIlIllllI && llIllIIIIIllIlIIIIlI != llllIIIIlIIIlIlllIll.aJ) {
            if (llIllIIIIIllIlIIIIlI == llllIIIIlIIIlIlllIll.aJ) {
                ilIIIIlllIlllllIlII = net.optifine.lllIIIIlllllIlIIllIl.llIlIIIIIlIIlIlIIlll;
                if (ilIlIlIlIlllllllllIl2 >= 8) {
                    ilIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl();
                }
            }
            else if (llIllIIIIIllIlIIIIlI == llllIIIIlIIIlIlllIll.IIllIIllIIIlIlIIIIlI) {
                switch (ilIlIlIlIlllllllllIl2 & 0x3) {
                    case 0: {
                        ilIIIIlllIlllllIlII = net.optifine.lllIIIIlllllIlIIllIl.IlIIlIlIIIlIIlIlIlII;
                        break;
                    }
                    case 1: {
                        ilIIIIlllIlllllIlII = net.optifine.lllIIIIlllllIlIIllIl.IllIlIIllIllIIlIllII;
                        break;
                    }
                    case 2: {
                        ilIIIIlllIlllllIlII = net.optifine.lllIIIIlllllIlIIllIl.lIIlIIIlIllIlIllIIIl;
                        break;
                    }
                    default: {
                        ilIIIIlllIlllllIlII = net.optifine.lllIIIIlllllIlIIllIl.IlIIlIlIIIlIIlIlIlII;
                        break;
                    }
                }
            }
            else if (llIllIIIIIllIlIIIIlI == llllIIIIlIIIlIlllIll.IIIlIIIlIlIIlllIIlll) {
                ilIIIIlllIlllllIlII = net.optifine.lllIIIIlllllIlIIllIl.IlIIlIlIIIlIIlIlIlII;
            }
            else {
                if (llIllIIIIIllIlIIIIlI != llllIIIIlIIIlIlllIll.r) {
                    return -1;
                }
                ilIIIIlllIlllllIlII = net.optifine.lllIIIIlllllIlIIllIl.IlIIlIlIIIlIIlIlIlII;
            }
        }
        else {
            ilIIIIlllIlllllIlII = net.optifine.lllIIIIlllllIlIIllIl.llIlIIIIIlIIlIlIIlll;
        }
        return (net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.lIllllIllIllIIllllll() && !ilIIIIlllIlllllIlII.llIllIIIIIllIlIIIIlI()) ? llllIIIIlIIIlIlllIll(llIIlIIIlIIIllIlIIIl, lIlIlIIIllIIllIIIllI, ilIlIlIlIlllllllllIl, ilIIIIlllIlllllIlII, llllIIIlIlllIlIIIIIl.lIIIIlIIIIIlllIllIII()) : ilIIIIlllIlllllIlII.llllIIIIlIIIlIlllIll(llIIlIIIlIIIllIlIIIl2, lIlIlIIIllIIllIIIllI, ilIlIlIlIlllllllllIl);
    }
    
    protected static net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl llllIIIIlIIIlIlllIll(final lIlIlIIIllIIllIIIllI lIlIlIIIllIIllIIIllI, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl = lIlIlIIIllIIllIIIllI.llIllIIIIIllIlIIIIlI(ilIlIlIlIlllllllllIl);
        if (llIIlIIIlIIIllIlIIIl == net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl.IlIlIIIlIIlIlIIlllIl && !net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llllllIIIIIIIlllIIll()) {
            llIIlIIIlIIIllIlIIIl = net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl.IIlllIIlIllIllIlIIll;
        }
        return llIIlIIIlIIIllIlIIIl;
    }
    
    private static IIlllIIlIllIllIlIIll llllIIIIlIIIlIlllIll(final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl) {
        if (net.optifine.lllIIIIlllllIlIIllIl.lIIIlllIIIllIIIllIII == null) {
            return null;
        }
        if (!(llIIlIIIlIIIllIlIIIl instanceof IllIIlllIIIIlllIIlIl)) {
            return null;
        }
        final IllIIlllIIIIlllIIlIl illIIlllIIIIlllIIlIl = (IllIIlllIIIIlllIIlIl)llIIlIIIlIIIllIlIIIl;
        final int ilIIIlIlIIIllIlIlIIl = illIIlllIIIIlllIIlIl.IlIIIlIlIIIllIlIlIIl();
        if (ilIIIlIlIIIllIlIlIIl < 0 || ilIIIlIlIIIllIlIlIIl >= net.optifine.lllIIIIlllllIlIIllIl.lIIIlllIIIllIIIllIII.length) {
            return null;
        }
        final IIlllIIlIllIllIlIIll[] array = net.optifine.lllIIIIlllllIlIIllIl.lIIIlllIIIllIIIllIII[ilIIIlIlIIIllIlIlIIl];
        if (array == null) {
            return null;
        }
        for (int i = 0; i < array.length; ++i) {
            final IIlllIIlIllIllIlIIll illlIIlIllIllIlIIll = array[i];
            if (illlIIlIllIllIlIIll.llllIIIIlIIIlIlllIll(illIIlllIIIIlllIIlIl)) {
                return illlIIlIllIllIlIIll;
            }
        }
        return null;
    }
    
    private static int llllIIIIlIIIlIlllIll(final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final lIlIlIIIllIIllIIIllI lIlIlIIIllIIllIIIllI, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final IIlIIIIlllIlllllIlII ilIIIIlllIlllllIlII, final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl) {
        int n = 0;
        int n2 = 0;
        int n3 = 0;
        final int liiiIlIIIIIlllIllIII = ilIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII();
        final int liiIlllIIIllIIIllIII = ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII();
        final int llIIlIIIlIIIllIlIIIl2 = ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl();
        for (int i = liiiIlIIIIIlllIllIII - 1; i <= liiiIlIIIIIlllIllIII + 1; ++i) {
            for (int j = llIIlIIIlIIIllIlIIIl2 - 1; j <= llIIlIIIlIIIllIlIIIl2 + 1; ++j) {
                ilIIIlIlIIIllIlIlIIl.IlIlIlIlIlllllllllIl(i, liiIlllIIIllIIIllIII, j);
                final int llllIIIIlIIIlIlllIll = ilIIIIlllIlllllIlII.llllIIIIlIIIlIlllIll(llIIlIIIlIIIllIlIIIl, lIlIlIIIllIIllIIIllI, ilIIIlIlIIIllIlIlIIl);
                n += (llllIIIIlIIIlIlllIll >> 16 & 0xFF);
                n2 += (llllIIIIlIIIlIlllIll >> 8 & 0xFF);
                n3 += (llllIIIIlIIIlIlllIll & 0xFF);
            }
        }
        return n / 9 << 16 | n2 / 9 << 8 | n3 / 9;
    }
    
    public static int llllIIIIlIIIlIlllIll(final lIlIlIIIllIIllIIIllI lIlIlIIIllIIllIIIllI, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final llllIIIlIlllIlIIIIIl llllIIIlIlllIlIIIIIl) {
        final net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llIllIIIIIllIlIIIIlI = llIIlIIIlIIIllIlIIIl.llIllIIIIIllIlIIIIlI();
        IIlIIIIlllIlllllIlII ilIIIIlllIlllllIlII = llllIIIIlIIIlIlllIll(llIIlIIIlIIIllIlIIIl);
        if (ilIIIIlllIlllllIlII == null && llIIlIIIlIIIllIlIIIl.llIllIIIIIllIlIIIIlI().IllIIlllIIIIlllIIlIl() == net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII) {
            ilIIIIlllIlllllIlII = net.optifine.lllIIIIlllllIlIIllIl.IIlIIIlllIllIllIlIII;
        }
        return (ilIIIIlllIlllllIlII == null) ? llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(lIlIlIIIllIIllIIIllI, ilIlIlIlIlllllllllIl, 0) : ((net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.lIllllIllIllIIllllll() && !ilIIIIlllIlllllIlII.llIllIIIIIllIlIIIIlI()) ? llllIIIIlIIIlIlllIll(llIIlIIIlIIIllIlIIIl, lIlIlIIIllIIllIIIllI, ilIlIlIlIlllllllllIl, ilIIIIlllIlllllIlII, llllIIIlIlllIlIIIIIl.lIIIIlIIIIIlllIllIII()) : ilIIIIlllIlllllIlII.llllIIIIlIIIlIlllIll(llIIlIIIlIIIllIlIIIl, lIlIlIIIllIIllIIIllI, ilIlIlIlIlllllllllIl));
    }
    
    public static void llllIIIIlIIIlIlllIll(final net.minecraft.client.llllIIIlIlllIlIIIIIl.IIIllllllIllIIIlllIl iiIllllllIllIIIlllIl) {
        if (net.optifine.lllIIIIlllllIlIIllIl.lIllllllIIllIlIlIlII >= 0) {
            final int lIllllllIIllIlIlIlII = net.optifine.lllIIIIlllllIlIIllIl.lIllllllIIllIlIlIlII;
            iiIllllllIllIIIlllIl.llllIIIIlIIIlIlllIll((lIllllllIIllIlIlIlII >> 16 & 0xFF) / 255.0f, (lIllllllIIllIlIlIlII >> 8 & 0xFF) / 255.0f, (lIllllllIIllIlIlIlII & 0xFF) / 255.0f);
        }
    }
    
    public static void IlIlIlIlIlllllllllIl(final net.minecraft.client.llllIIIlIlllIlIIIIIl.IIIllllllIllIIIlllIl iiIllllllIllIIIlllIl) {
        if (net.optifine.lllIIIIlllllIlIIllIl.IIlllIlIIllIlIlIlIIl != null) {
            final int llllIIIIlIIIlIlllIll = net.optifine.lllIIIIlllllIlIIllIl.IIlllIlIIllIlIlIlIIl.llllIIIIlIIIlIlllIll();
            iiIllllllIllIIIlllIl.llllIIIIlIIIlIlllIll((llllIIIIlIIIlIlllIll >> 16 & 0xFF) / 255.0f, (llllIIIIlIIIlIlllIll >> 8 & 0xFF) / 255.0f, (llllIIIIlIIIlIlllIll & 0xFF) / 255.0f);
        }
    }
    
    private static int IlIlIlIlIlllllllllIl(final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl) {
        if (net.optifine.lllIIIIlllllIlIIllIl.IIllIIllIIIlIlIIIIlI == null) {
            return -1;
        }
        return net.optifine.lllIIIIlllllIlIIllIl.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll(llIIlIIIlIIIllIlIIIl, 15));
    }
    
    public static void llllIIIIlIIIlIlllIll(final net.minecraft.client.llllIIIlIlllIlIIIIIl.IIIllllllIllIIIlllIl iiIllllllIllIIIlllIl, final lIlIlIIIllIIllIIIllI lIlIlIIIllIIllIIIllI, final double n, final double n2, final double n3) {
        if (net.optifine.lllIIIIlllllIlIIllIl.IIllIIllIIIlIlIIIIlI != null) {
            final int llllIIIIlIIIlIlllIll = net.optifine.lllIIIIlllllIlIIllIl.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll(lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl(new IlIlIlIlIlllllllllIl(n, n2, n3)), 15));
            iiIllllllIllIIIlllIl.llllIIIIlIIIlIlllIll((llllIIIIlIIIlIlllIll >> 16 & 0xFF) / 255.0f, (llllIIIIlIIIlIlllIll >> 8 & 0xFF) / 255.0f, (llllIIIIlIIIlIlllIll & 0xFF) / 255.0f);
        }
    }
    
    private static int llllIIIIlIIIlIlllIll(final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final int n) {
        if (!(llIIlIIIlIIIllIlIIIl.llIllIIIIIllIlIIIIlI() instanceof bh)) {
            return n;
        }
        final Comparable llllIIIIlIIIlIlllIll = llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(bh.llIllIlIlIIIIIIIllII);
        if (!(llllIIIIlIIIlIlllIll instanceof Integer)) {
            return n;
        }
        return (int)llllIIIIlIIIlIlllIll;
    }
    
    public static float llllIIIIlIIIlIlllIll(final float n) {
        if (net.optifine.lllIIIIlllllIlIIllIl.IlIlIIIlIIlIlIIlllIl <= 0) {
            return n;
        }
        return n * (628.0f / net.optifine.lllIIIIlllllIlIIllIl.IlIlIIIlIIlIlIIlllIl);
    }
    
    public static int IlIlIlIlIlllllllllIl(final float n) {
        if (net.optifine.lllIIIIlllllIlIIllIl.IIIlIIIlIlIIlllIIlll == null) {
            return -1;
        }
        return net.optifine.lllIIIIlllllIlIIllIl.IIIlIIIlIlIIlllIIlll.llllIIIIlIIIlIlllIll((int)Math.round((llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(n) + 1.0f) * (net.optifine.lllIIIIlllllIlIIllIl.IIIlIIIlIlIIlllIIlll.IlIIIlIlIIIllIlIlIIl() - 1) / 2.0));
    }
    
    public static int llllIIIIlIIIlIlllIll(final int n) {
        if (net.optifine.lllIIIIlllllIlIIllIl.IlllllllIIIlIIIlIlII == null) {
            return -1;
        }
        return net.optifine.lllIIIIlllllIlIIllIl.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(n * net.optifine.lllIIIIlllllIlIIllIl.IlllllllIIIlIIIlIlII.IlIIIlIlIIIllIlIlIIl() / 255);
    }
    
    public static void llllIIIIlIIIlIlllIll(final net.minecraft.client.llllIIIlIlllIlIIIIIl.IIIllllllIllIIIlllIl iiIllllllIllIIIlllIl, final lIlIlIIIllIIllIIIllI lIlIlIIIllIIllIIIllI, final double n, final double n2, final double n3, final llllIIIlIlllIlIIIIIl llllIIIlIlllIlIIIIIl) {
        if (net.optifine.lllIIIIlllllIlIIllIl.llIllIIIIIllIlIIIIlI != null || net.optifine.lllIIIIlllllIlIIllIl.lIIIlllIIIllIIIllIII != null || net.optifine.lllIIIIlllllIlIIllIl.lllllIlIIIlIlIIlllII >= 0) {
            final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl = new IlIlIlIlIlllllllllIl(n, n2, n3);
            llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll(net.optifine.lllIIIIlllllIlIIllIl.IllIllIlllIllllIIllI, ilIlIlIlIlllllllllIl);
            final int llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll(lIlIlIIIllIIllIIIllI, net.optifine.lllIIIIlllllIlIIllIl.IllIllIlllIllllIIllI, ilIlIlIlIlllllllllIl, llllIIIlIlllIlIIIIIl);
            final int n4 = llllIIIIlIIIlIlllIll >> 16 & 0xFF;
            final int n5 = llllIIIIlIIIlIlllIll >> 8 & 0xFF;
            final int n6 = llllIIIIlIIIlIlllIll & 0xFF;
            float n7 = n4 / 255.0f;
            float n8 = n5 / 255.0f;
            float n9 = n6 / 255.0f;
            if (net.optifine.lllIIIIlllllIlIIllIl.lllllIlIIIlIlIIlllII >= 0) {
                final int n10 = net.optifine.lllIIIIlllllIlIIllIl.lllllIlIIIlIlIIlllII >> 16 & 0xFF;
                final int n11 = net.optifine.lllIIIIlllllIlIIllIl.lllllIlIIIlIlIIlllII >> 8 & 0xFF;
                final int n12 = net.optifine.lllIIIIlllllIlIIllIl.lllllIlIIIlIlIIlllII & 0xFF;
                n7 *= n10 / 255.0f;
                n8 *= n11 / 255.0f;
                n9 *= n12 / 255.0f;
            }
            iiIllllllIllIIIlllIl.llllIIIIlIIIlIlllIll(n7, n8, n9);
        }
    }
    
    private static int IlIlIlIlIlllllllllIl(final lIlIlIIIllIIllIIIllI lIlIlIIIllIIllIIIllI, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        return (net.optifine.lllIIIIlllllIlIIllIl.llIIlllIIlllIIllIllI < 0) ? net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.B.IlIIIlIlIIIllIlIlIIl(lIlIlIIIllIIllIIIllI, ilIlIlIlIlllllllllIl) : net.optifine.lllIIIIlllllIlIIllIl.llIIlllIIlllIIllIllI;
    }
    
    private static e llllIIIIlIIIlIlllIll(final e e) {
        return (net.optifine.lllIIIIlllllIlIIllIl.IIIllllllIllIIIlllIl == null) ? e : net.optifine.lllIIIIlllllIlIIllIl.IIIllllllIllIIIlllIl;
    }
    
    private static e IlIlIlIlIlllllllllIl(final e e) {
        return (net.optifine.lllIIIIlllllIlIIllIl.IlIIIlIIIllllIlIlIlI == null) ? e : net.optifine.lllIIIIlllllIlIIllIl.IlIIIlIIIllllIlIlIlI;
    }
    
    private static e llIllIIIIIllIlIIIIlI(final e e) {
        return (net.optifine.lllIIIIlllllIlIIllIl.IIIIIllIIIIlIIIIllIl == null) ? e : net.optifine.lllIIIIlllllIlIIllIl.IIIIIllIIIIlIIIIllIl;
    }
    
    public static e llllIIIIlIIIlIlllIll(final e e, final lIlIlIIIllIIllIIIllI lIlIlIIIllIIllIIIllI, final double n, final double n2, final double n3) {
        if (net.optifine.lllIIIIlllllIlIIllIl.llIIlIIIlIIIllIlIIIl == null) {
            return e;
        }
        final int llllIIIIlIIIlIlllIll = net.optifine.lllIIIIlllllIlIIllIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(lIlIlIIIllIIllIIIllI, n, n2, n3, 3);
        return net.optifine.lllIIIIlllllIlIIllIl.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll((llllIIIIlIIIlIlllIll >> 16 & 0xFF) / 255.0f * ((float)e.llllIIIIlIIIlIlllIll / 0.5f), (llllIIIIlIIIlIlllIll >> 8 & 0xFF) / 255.0f * ((float)e.IlIlIlIlIlllllllllIl / 0.66275f), (llllIIIIlIIIlIlllIll & 0xFF) / 255.0f * (float)e.llIllIIIIIllIlIIIIlI);
    }
    
    private static e IlIlIlIlIlllllllllIl(final e e, final lIlIlIIIllIIllIIIllI lIlIlIIIllIIllIIIllI, final double n, final double n2, final double n3) {
        if (net.optifine.lllIIIIlllllIlIIllIl.lIlIlIIIllIIllIIIllI == null) {
            return e;
        }
        final int llllIIIIlIIIlIlllIll = net.optifine.lllIIIIlllllIlIIllIl.lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll(lIlIlIIIllIIllIIIllI, n, n2, n3, 3);
        return net.optifine.lllIIIIlllllIlIIllIl.IlIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll((llllIIIIlIIIlIlllIll >> 16 & 0xFF) / 255.0f * ((float)e.llllIIIIlIIIlIlllIll / 0.753f), (llllIIIIlIIIlIlllIll >> 8 & 0xFF) / 255.0f * ((float)e.IlIlIlIlIlllllllllIl / 0.8471f), (llllIIIIlIIIlIlllIll & 0xFF) / 255.0f * (float)e.llIllIIIIIllIlIIIIlI);
    }
    
    public static e llllIIIIlIIIlIlllIll(final lIlIlIIIllIIllIIIllI lIlIlIIIllIIllIIIllI, final double n, final double n2, final double n3) {
        return llllIIIIlIIIlIlllIll(lIlIlIIIllIIllIIIllI, n, n2, n3, net.optifine.lllIIIIlllllIlIIllIl.IIIIlllIIIIIIlIIIlll, net.optifine.lllIIIIlllllIlIIllIl.llllIIllllIlIlIIIIll);
    }
    
    public static e IlIlIlIlIlllllllllIl(final lIlIlIIIllIIllIIIllI lIlIlIIIllIIllIIIllI, final double n, final double n2, final double n3) {
        return llllIIIIlIIIlIlllIll(lIlIlIIIllIIllIIIllI, n, n2, n3, net.optifine.lllIIIIlllllIlIIllIl.IlIllIlIlIIIlIlIlIII, net.optifine.lllIIIIlllllIlIIllIl.IIlllIIlIllIllIlIIll);
    }
    
    public static e llllIIIIlIIIlIlllIll(final lIlIlIIIllIIllIIIllI lIlIlIIIllIIllIIIllI, final double n, final double n2, final double n3, final IIlllIIlIllIllIlIIll illlIIlIllIllIlIIll, final IlIllIlIlIIIlIlIlIII ilIllIlIlIIIlIlIlIII) {
        if (illlIIlIllIllIlIIll == null) {
            return null;
        }
        final int llllIIIIlIIIlIlllIll = illlIIlIllIllIlIIll.llllIIIIlIIIlIlllIll(lIlIlIIIllIIllIIIllI, n, n2, n3, 3);
        return ilIllIlIlIIIlIlIlIII.llllIIIIlIIIlIlllIll((llllIIIIlIIIlIlllIll >> 16 & 0xFF) / 255.0f, (llllIIIIlIIIlIlllIll >> 8 & 0xFF) / 255.0f, (llllIIIIlIIIlIlllIll & 0xFF) / 255.0f);
    }
    
    private static int llllIIIIlIIIlIlllIll(final net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final lIlIlIIIllIIllIIIllI lIlIlIIIllIIllIIIllI, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final llllIIIlIlllIlIIIIIl llllIIIlIlllIlIIIIIl) {
        IIlllIIlIllIllIlIIll illlIIlIllIllIlIIll = net.optifine.lllIIIIlllllIlIIllIl.IIlIIIIlllIlllllIlII;
        if (llllIIIIlIIIlIlllIll == llllIIIIlIIIlIlllIll.p && net.optifine.lllIIIIlllllIlIIllIl.IlIlIllllllllIIIIlII != null) {
            illlIIlIllIllIlIIll = net.optifine.lllIIIIlllllIlIIllIl.IlIlIllllllllIIIIlII;
        }
        if (llllIIIIlIIIlIlllIll == llllIIIIlIIIlIlllIll.q && net.optifine.lllIIIIlllllIlIIllIl.IIIlIIlIIIIlllIlllII != null) {
            illlIIlIllIllIlIIll = net.optifine.lllIIIIlllllIlIIllIl.IIIlIIlIIIIlllIlllII;
        }
        if (illlIIlIllIllIlIIll == null) {
            return -1;
        }
        return illlIIlIllIllIlIIll.llllIIIIlIIIlIlllIll(llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl());
    }
    
    public static boolean llllIIIIlIIIlIlllIll(final net.minecraft.IIIlIIlIIIIlllIlllII.IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final float n, final int[] array, final boolean b, final float n2) {
        if (illlllllIIIlIIIlIlII == null) {
            return false;
        }
        if (net.optifine.lllIIIIlllllIlIIllIl.lllIIIIlllllIlIIllIl == null) {
            return false;
        }
        final int n3 = illlllllIIIlIIIlIlII.IlIllIlIlIIIlIlIlIII.IIlllIIlIllIllIlIIll() - net.optifine.lllIIIIlllllIlIIllIl.IlIlIIIIIIlllIlIllIl;
        if (n3 >= 0 && n3 < net.optifine.lllIIIIlllllIlIIllIl.lllIIIIlllllIlIIllIl.length) {
            final lIIlIIIlIllIlIllIIIl liIlIIIlIllIlIllIIIl = net.optifine.lllIIIIlllllIlIIllIl.lllIIIIlllllIlIIllIl[n3];
            return liIlIIIlIllIlIllIIIl != null && liIlIIIlIllIlIllIIIl.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, n, array, b, n2);
        }
        return false;
    }
    
    public static e llllIIIIlIIIlIlllIll(e e, final net.minecraft.IIIlIIlIIIIlllIlllII.IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI, final float n) {
        switch (illlllllIIIlIIIlIlII.IlIllIlIlIIIlIlIlIII.IIlllIIlIllIllIlIIll()) {
            case -1: {
                e = llllIIIIlIIIlIlllIll(e);
                break;
            }
            case 0: {
                e = IlIlIlIlIlllllllllIl(e, Minecraft.getMinecraft().IllIIlllIIIIlllIIlIl, llIllIIIIIllIlIIIIlI.IIlllIlIIllIlIlIlIIl, llIllIIIIIllIlIIIIlI.llIIIlIlIllIIlIlIlII + 1.0, llIllIIIIIllIlIIIIlI.lllllIlIIIlIlIIlllII);
                break;
            }
            case 1: {
                e = IlIlIlIlIlllllllllIl(e);
                break;
            }
        }
        return e;
    }
    
    public static e IlIlIlIlIlllllllllIl(e e, final net.minecraft.IIIlIIlIIIIlllIlllII.IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI, final float n) {
        switch (illlllllIIIlIIIlIlII.IlIllIlIlIIIlIlIlIII.IIlllIIlIllIllIlIIll()) {
            case 0: {
                e = llllIIIIlIIIlIlllIll(e, Minecraft.getMinecraft().IllIIlllIIIIlllIIlIl, llIllIIIIIllIlIIIIlI.IIlllIlIIllIlIlIlIIl, llIllIIIIIllIlIIIIlI.llIIIlIlIllIIlIlIlII + 1.0, llIllIIIIIllIlIIIIlI.lllllIlIIIlIlIIlllII);
                break;
            }
            case 1: {
                e = llIllIIIIIllIlIIIIlI(e);
                break;
            }
        }
        return e;
    }
    
    private static int[] llllIIIIlIIIlIlllIll(final Properties properties, final String s, final String s2, final String s3) {
        final ArrayList<Integer> list = new ArrayList<Integer>();
        final Set<String> keySet = ((Hashtable<String, V>)properties).keySet();
        int n = 0;
        for (final String s4 : keySet) {
            final String property = properties.getProperty(s4);
            if (s4.startsWith(s2)) {
                final int llllIIIIlIIIlIlllIll = net.optifine.util.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(net.optifine.util.IIIllllllIllIIIlllIl.IlIIIlIlIIIllIlIlIIl(s4, s2));
                if (llllIIIIlIIIlIlllIll < 0) {
                    IllIIlllIIIIlllIIlIl("Invalid spawn egg name: " + s4);
                }
                else {
                    final int ilIlIlIlIlllllllllIl = IlIlIlIlIlllllllllIl(property);
                    if (ilIlIlIlIlllllllllIl < 0) {
                        IllIIlllIIIIlllIIlIl("Invalid spawn egg color: " + s4 + " = " + property);
                    }
                    else {
                        while (list.size() <= llllIIIIlIIIlIlllIll) {
                            list.add(-1);
                        }
                        list.set(llllIIIIlIIIlIlllIll, ilIlIlIlIlllllllllIl);
                        ++n;
                    }
                }
            }
        }
        if (n <= 0) {
            return null;
        }
        IlIlIIIllIllIIIIIllI(String.valueOf(s3) + " colors: " + n);
        final int[] array = new int[list.size()];
        for (int i = 0; i < array.length; ++i) {
            array[i] = (int)list.get(i);
        }
        return array;
    }
    
    private static int llllIIIIlIIIlIlllIll(final IllIlIllIllIlllIIlll illIlIllIllIlllIIlll, final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl, final int n, final int n2) {
        final int liiiIlIIIIIlllIllIII = lllIIIIlIlIllIIlIIIl.lIIIIlIIIIIlllIllIII();
        final int[] array = (n == 0) ? net.optifine.lllIIIIlllllIlIIllIl.IIIIIIIIIlllIllIlIlI : net.optifine.lllIIIIlllllIlIIllIl.IIllllIIIlIIIIIIllIl;
        if (array == null) {
            return n2;
        }
        if (liiiIlIIIIIlllIllIII >= 0 && liiiIlIIIIIlllIllIII < array.length) {
            final int n3 = array[liiiIlIIIIIlllIllIII];
            return (n3 < 0) ? n2 : n3;
        }
        return n2;
    }
    
    public static int llllIIIIlIIIlIlllIll(final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl, final int n, final int n2) {
        if (lllIIIIlIlIllIIlIIIl == null) {
            return n2;
        }
        final net.minecraft.llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl llllIIIIlIIIlIlllIll = lllIIIIlIlIllIIlIIIl.llllIIIIlIIIlIlllIll();
        return (llllIIIIlIIIlIlllIll == null) ? n2 : ((llllIIIIlIIIlIlllIll instanceof IllIlIllIllIlllIIlll) ? llllIIIIlIIIlIlllIll((IllIlIllIllIlllIIlll)llllIIIIlIIIlIlllIll, lllIIIIlIlIllIIlIIIl, n, n2) : n2);
    }
    
    private static float[][] IlIlIlIlIlllllllllIl(final Properties properties, final String s, final String s2, final String s3) {
        final net.minecraft.llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl[] values = net.minecraft.llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl.values();
        final HashMap<Object, net.minecraft.llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl> hashMap = new HashMap<Object, net.minecraft.llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl>();
        for (int i = 0; i < values.length; ++i) {
            final net.minecraft.llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl = values[i];
            hashMap.put(ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(), ilIlIlIlIlllllllllIl);
        }
        final float[][] array = new float[values.length][];
        int n = 0;
        for (final String s4 : ((Hashtable<String, V>)properties).keySet()) {
            final String property = properties.getProperty(s4);
            if (s4.startsWith(s2)) {
                String ilIIIlIlIIIllIlIlIIl = net.optifine.util.IIIllllllIllIIIlllIl.IlIIIlIlIIIllIlIlIIl(s4, s2);
                if (ilIIIlIlIIIllIlIlIIl.equals("lightBlue")) {
                    ilIIIlIlIIIllIlIlIIl = "light_blue";
                }
                final net.minecraft.llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl2 = hashMap.get(ilIIIlIlIIIllIlIlIIl);
                final int ilIlIlIlIlllllllllIl3 = IlIlIlIlIlllllllllIl(property);
                if (ilIlIlIlIlllllllllIl2 != null && ilIlIlIlIlllllllllIl3 >= 0) {
                    array[ilIlIlIlIlllllllllIl2.ordinal()] = new float[] { (ilIlIlIlIlllllllllIl3 >> 16 & 0xFF) / 255.0f, (ilIlIlIlIlllllllllIl3 >> 8 & 0xFF) / 255.0f, (ilIlIlIlIlllllllllIl3 & 0xFF) / 255.0f };
                    ++n;
                }
                else {
                    IllIIlllIIIIlllIIlIl("Invalid color: " + s4 + " = " + property);
                }
            }
        }
        if (n <= 0) {
            return null;
        }
        IlIlIIIllIllIIIIIllI(String.valueOf(s3) + " colors: " + n);
        return array;
    }
    
    private static float[] llllIIIIlIIIlIlllIll(final net.minecraft.llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final float[][] array, final float[] array2) {
        if (array == null) {
            return array2;
        }
        if (ilIlIlIlIlllllllllIl == null) {
            return array2;
        }
        final float[] array3 = array[ilIlIlIlIlllllllllIl.ordinal()];
        return (array3 == null) ? array2 : array3;
    }
    
    public static float[] llllIIIIlIIIlIlllIll(final net.minecraft.llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final float[] array) {
        return llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl, net.optifine.lllIIIIlllllIlIIllIl.IlllIIIIlIIIlIlIlIIl, array);
    }
    
    public static float[] IlIlIlIlIlllllllllIl(final net.minecraft.llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final float[] array) {
        return llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl, net.optifine.lllIIIIlllllIlIIllIl.lllIllIIIllllllIllll, array);
    }
    
    private static int[] llIllIIIIIllIlIIIIlI(final Properties properties, final String s, final String s2, final String s3) {
        final int[] array = new int[32];
        Arrays.fill(array, -1);
        int n = 0;
        for (final String s4 : ((Hashtable<String, V>)properties).keySet()) {
            final String property = properties.getProperty(s4);
            if (s4.startsWith(s2)) {
                final int llllIIIIlIIIlIlllIll = net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(net.optifine.util.IIIllllllIllIIIlllIl.IlIIIlIlIIIllIlIlIIl(s4, s2), -1);
                final int ilIlIlIlIlllllllllIl = IlIlIlIlIlllllllllIl(property);
                if (llllIIIIlIIIlIlllIll >= 0 && llllIIIIlIIIlIlllIll < array.length && ilIlIlIlIlllllllllIl >= 0) {
                    array[llllIIIIlIIIlIlllIll] = ilIlIlIlIlllllllllIl;
                    ++n;
                }
                else {
                    IllIIlllIIIIlllIIlIl("Invalid color: " + s4 + " = " + property);
                }
            }
        }
        if (n <= 0) {
            return null;
        }
        IlIlIIIllIllIIIIIllI(String.valueOf(s3) + " colors: " + n);
        return array;
    }
    
    public static int llllIIIIlIIIlIlllIll(final int n, final int n2) {
        if (net.optifine.lllIIIIlllllIlIIllIl.llIllIlIlIIIIIIIllII == null) {
            return n2;
        }
        if (n >= 0 && n < net.optifine.lllIIIIlllllIlIIllIl.llIllIlIlIIIIIIIllII.length) {
            final int n3 = net.optifine.lllIIIIlllllIlIIllIl.llIllIlIlIIIIIIIllII[n];
            return (n3 < 0) ? n2 : n3;
        }
        return n2;
    }
    
    private static int[] IlIIIlIlIIIllIlIlIIl(final Properties properties, final String s, final String s2, final String s3) {
        final int[] array = new int[net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.length];
        Arrays.fill(array, -1);
        int n = 0;
        for (final String s4 : ((Hashtable<String, V>)properties).keySet()) {
            final String property = properties.getProperty(s4);
            if (s4.startsWith(s2)) {
                final int ilIIIlIlIIIllIlIlIIl = IlIIIlIlIIIllIlIlIIl(net.optifine.util.IIIllllllIllIIIlllIl.IlIIIlIlIIIllIlIlIIl(s4, s2));
                final int ilIlIlIlIlllllllllIl = IlIlIlIlIlllllllllIl(property);
                if (ilIIIlIlIIIllIlIlIIl >= 0 && ilIIIlIlIIIllIlIlIIl < array.length && ilIlIlIlIlllllllllIl >= 0) {
                    array[ilIIIlIlIIIllIlIlIIl] = ilIlIlIlIlllllllllIl;
                    ++n;
                }
                else {
                    IllIIlllIIIIlllIIlIl("Invalid color: " + s4 + " = " + property);
                }
            }
        }
        if (n <= 0) {
            return null;
        }
        IlIlIIIllIllIIIIIllI(String.valueOf(s3) + " colors: " + n);
        return array;
    }
    
    private static int[] IlIlIIIllIllIIIIIllI(final Properties properties, final String s, final String s2, final String s3) {
        final int[] array = new int[net.minecraft.llllIIllllIlIlIIIIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.length];
        Arrays.fill(array, -1);
        int n = 0;
        for (final String s4 : ((Hashtable<String, V>)properties).keySet()) {
            final String property = properties.getProperty(s4);
            if (s4.startsWith(s2)) {
                final int llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI(s4);
                final int ilIlIlIlIlllllllllIl = IlIlIlIlIlllllllllIl(property);
                if (llIllIIIIIllIlIIIIlI >= 0 && llIllIIIIIllIlIIIIlI < array.length && ilIlIlIlIlllllllllIl >= 0) {
                    array[llIllIIIIIllIlIIIIlI] = ilIlIlIlIlllllllllIl;
                    ++n;
                }
                else {
                    IllIIlllIIIIlllIIlIl("Invalid color: " + s4 + " = " + property);
                }
            }
        }
        if (n <= 0) {
            return null;
        }
        IlIlIIIllIllIIIIIllI(String.valueOf(s3) + " colors: " + n);
        return array;
    }
    
    private static int llIllIIIIIllIlIIIIlI(final String s) {
        if (s.equals("potion.water")) {
            return 0;
        }
        final net.minecraft.llllIIllllIlIlIIIIll.llllIIIIlIIIlIlllIll[] llllIIIIlIIIlIlllIll = net.minecraft.llllIIllllIlIlIIIIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll;
        for (int i = 0; i < llllIIIIlIIIlIlllIll.length; ++i) {
            final net.minecraft.llllIIllllIlIlIIIIll.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll2 = llllIIIIlIIIlIlllIll[i];
            if (llllIIIIlIIIlIlllIll2 != null && llllIIIIlIIIlIlllIll2.IlIIIlIlIIIllIlIlIIl().equals(s)) {
                return llllIIIIlIIIlIlllIll2.IlIlIlIlIlllllllllIl();
            }
        }
        return -1;
    }
    
    public static int IlIlIlIlIlllllllllIl(final int n, final int n2) {
        if (net.optifine.lllIIIIlllllIlIIllIl.IllIllIIIIlIIlIlllII == null) {
            return n2;
        }
        if (n >= 0 && n < net.optifine.lllIIIIlllllIlIIllIl.IllIllIIIIlIIlIlllII.length) {
            final int n3 = net.optifine.lllIIIIlllllIlIIllIl.IllIllIIIIlIIlIlllII[n];
            return (n3 < 0) ? n2 : n3;
        }
        return n2;
    }
    
    private static int IlIIIlIlIIIllIlIlIIl(final String s) {
        return (s == null) ? -1 : (s.equals("air") ? net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.IIllllIIIlIIIIIIllIl : (s.equals("grass") ? net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.IIllllIIIlIIIIIIllIl : (s.equals("sand") ? net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl.IIllllIIIlIIIIIIllIl : (s.equals("cloth") ? net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI.IIllllIIIlIIIIIIllIl : (s.equals("tnt") ? net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl.IIllllIIIlIIIIIIllIl : (s.equals("ice") ? net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIlIlllIlIIIIIl.IIllllIIIlIIIIIIllIl : (s.equals("iron") ? net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII.IIllllIIIlIIIIIIllIl : (s.equals("foliage") ? net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.lIIIlllIIIllIIIllIII.IIllllIIIlIIIIIIllIl : (s.equals("clay") ? net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llIllIlIIIIllIlIIllI.IIllllIIIlIIIIIIllIl : (s.equals("dirt") ? net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.lIlIlIIIllIIllIIIllI.IIllllIIIlIIIIIIllIl : (s.equals("stone") ? net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIIIllIIllIlllllI.IIllllIIIlIIIIIIllIl : (s.equals("water") ? net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IIIIlllIIIIIIlIIIlll.IIllllIIIlIIIIIIllIl : (s.equals("wood") ? net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIllllIlIlIIIIll.IIllllIIIlIIIIIIllIl : (s.equals("quartz") ? net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIllIlIlIIIlIlIlIII.IIllllIIIlIIIIIIllIl : (s.equals("gold") ? net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IIlllIIIlIlllIIlllII.IIllllIIIlIIIIIIllIl : (s.equals("diamond") ? net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IIlIIIIIllIlIIIlIIll.IIllllIIIlIIIIIIllIl : (s.equals("lapis") ? net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllllIllIllIlIllllI.IIllllIIIlIIIIIIllIl : (s.equals("emerald") ? net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IIIllllllIllIIIlllIl.IIllllIIIlIIIIIIllIl : (s.equals("podzol") ? net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIIIlIIIllllIlIlIlI.IIllllIIIlIIIIIIllIl : (s.equals("netherrack") ? net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IIIIIllIIIIlIIIIllIl.IIllllIIIlIIIIIIllIl : ((!s.equals("snow") && !s.equals("white")) ? ((!s.equals("adobe") && !s.equals("orange")) ? (s.equals("magenta") ? net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.lllIIIIlllllIlIIllIl.IIllllIIIlIIIIIIllIl : ((!s.equals("light_blue") && !s.equals("lightBlue")) ? (s.equals("yellow") ? net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IIllIIllIIIlIlIIIIlI.IIllllIIIlIIIIIIllIl : (s.equals("lime") ? net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IIIlIIIlIlIIlllIIlll.IIllllIIIlIIIIIIllIl : (s.equals("pink") ? net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIIIlIIlIlIIlllIl.IIllllIIIlIIIIIIllIl : (s.equals("gray") ? net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlllllllIIIlIIIlIlII.IIllllIIIlIIIIIIllIl : (s.equals("silver") ? net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IIlIIIIlllIlllllIlII.IIllllIIIlIIIIIIllIl : (s.equals("cyan") ? net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IIIlIIlIIIIlllIlllII.IIllllIIIlIIIIIIllIl : (s.equals("purple") ? net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIllllllllIIIIlII.IIllllIIIlIIIIIIllIl : (s.equals("blue") ? net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IIlllIlIIllIlIlIlIIl.IIllllIIIlIIIIIIllIl : (s.equals("brown") ? net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llIIIlIlIllIIlIlIlII.IIllllIIIlIIIIIIllIl : (s.equals("green") ? net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.lllllIlIIIlIlIIlllII.IIllllIIIlIIIIIIllIl : (s.equals("red") ? net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.lIllllllIIllIlIlIlII.IIllllIIIlIIIIIIllIl : (s.equals("black") ? net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llIIlllIIlllIIllIllI.IIllllIIIlIIIIIIllIl : -1)))))))))))) : net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIIIIIIlllIlIllIl.IIllllIIIlIIIIIIllIl)) : net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IIlllIIlIllIllIlIIll.IIllllIIIlIIIIIIllIl) : net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl.IIllllIIIlIIIIIIllIl)))))))))))))))))))));
    }
    
    private static int[] lIIIlllIIIllIIIllIII() {
        final net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll[] llllIIIIlIIIlIlllIll = net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll;
        final int[] array = new int[llllIIIIlIIIlIlllIll.length];
        Arrays.fill(array, -1);
        for (int n = 0; n < llllIIIIlIIIlIlllIll.length && n < array.length; ++n) {
            final net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll2 = llllIIIIlIIIlIlllIll[n];
            if (llllIIIIlIIIlIlllIll2 != null) {
                array[n] = llllIIIIlIIIlIlllIll2.IIIIIIIIIlllIllIlIlI;
            }
        }
        return array;
    }
    
    private static void llllIIIIlIIIlIlllIll(final int[] array) {
        if (array != null) {
            final net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll[] llllIIIIlIIIlIlllIll = net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll;
            boolean b = false;
            for (int n = 0; n < llllIIIIlIIIlIlllIll.length && n < array.length; ++n) {
                final net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll2 = llllIIIIlIIIlIlllIll[n];
                if (llllIIIIlIIIlIlllIll2 != null) {
                    final int iiiiiiiiIlllIllIlIlI = array[n];
                    if (iiiiiiiiIlllIllIlIlI >= 0 && llllIIIIlIIIlIlllIll2.IIIIIIIIIlllIllIlIlI != iiiiiiiiIlllIllIlIlI) {
                        llllIIIIlIIIlIlllIll2.IIIIIIIIIlllIllIlIlI = iiiiiiiiIlllIllIlIlI;
                        b = true;
                    }
                }
            }
            if (b) {
                Minecraft.getMinecraft().lllIllIIIllllllIllll().llllIIIIlIIIlIlllIll();
            }
        }
    }
    
    private static void IlIlIIIllIllIIIIIllI(final String s) {
        net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl("CustomColors: " + s);
    }
    
    private static void IllIIlllIIIIlllIIlIl(final String s) {
        net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI("CustomColors: " + s);
    }
    
    public static int IlIlIlIlIlllllllllIl(final int n) {
        return (net.optifine.lllIIIIlllllIlIIllIl.IIlllIIIlIlllIIlllII < 0) ? n : net.optifine.lllIIIIlllllIlIIllIl.IIlllIIIlIlllIIlllII;
    }
    
    public static int llIllIIIIIllIlIIIIlI(final int n) {
        return (net.optifine.lllIIIIlllllIlIIllIl.IIlIIIIIllIlIIIlIIll < 0) ? n : net.optifine.lllIIIIlllllIlIIllIl.IIlIIIIIllIlIIIlIIll;
    }
    
    public static int IlIIIlIlIIIllIlIlIIl(final int n) {
        return (net.optifine.lllIIIIlllllIlIIllIl.llllllIllIllIlIllllI < 0) ? n : net.optifine.lllIIIIlllllIlIIllIl.llllllIllIllIlIllllI;
    }
}
