package net.optifine;

import java.util.regex.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI.*;
import java.io.*;
import java.awt.image.*;
import net.optifine.util.*;
import net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.*;
import net.optifine.llllIIIIlIIIlIlllIll.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import java.util.*;

public class IIlllIIlIllIllIlIIll implements IIlIIIIlllIlllllIlII
{
    public String llllIIIIlIIIlIlllIll;
    public String IlIlIlIlIlllllllllIl;
    private int IlIlIIIllIIllIlllllI;
    private llIIlIIIlIIIllIlIIIl[] IIIIlllIIIIIIlIIIlll;
    private String llllIIllllIlIlIIIIll;
    private int IlIllIlIlIIIlIlIlIII;
    private int IIlllIIlIllIllIlIIll;
    private int lllIIIIlllllIlIIllIl;
    private int IlIlIIIIIIlllIlIllIl;
    private int IIllIIllIIIlIlIIIIlI;
    private int[] IIIlIIIlIlIIlllIIlll;
    private float[][] IlIlIIIlIIlIlIIlllIl;
    private static final int IlllllllIIIlIIIlIlII = -1;
    private static final int IIlIIIIlllIlllllIlII = 0;
    private static final int IIIlIIlIIIIlllIlllII = 1;
    private static final int IlIlIllllllllIIIIlII = 2;
    public static final String llIllIIIIIllIlIIIIlI = "vanilla";
    public static final String IlIIIlIlIIIllIlIlIIl = "grid";
    public static final String IlIlIIIllIllIIIIIllI = "fixed";
    public static final String[] IllIIlllIIIIlllIIlIl;
    public static final String llllIIIlIlllIlIIIIIl = "format";
    public static final String lIIIIlIIIIIlllIllIII = "blocks";
    public static final String lIIIlllIIIllIIIllIII = "source";
    public static final String llIIlIIIlIIIllIlIIIl = "color";
    public static final String llIllIlIIIIllIlIIllI = "yVariance";
    public static final String lIlIlIIIllIIllIIIllI = "yOffset";
    
    static {
        IllIIlllIIIIlllIIlIl = new String[] { "vanilla", "grid", "fixed" };
    }
    
    public IIlllIIlIllIllIlIIll(final Properties properties, final String s, final int ilIlIIIIIIlllIlIllIl, final int iIllIIllIIIlIlIIIIlI, final String s2) {
        this.llllIIIIlIIIlIlllIll = null;
        this.IlIlIlIlIlllllllllIl = null;
        this.IlIlIIIllIIllIlllllI = -1;
        this.IIIIlllIIIIIIlIIIlll = null;
        this.llllIIllllIlIlIIIIll = null;
        this.IlIllIlIlIIIlIlIlIII = -1;
        this.IIlllIIlIllIllIlIIll = 0;
        this.lllIIIIlllllIlIIllIl = 0;
        this.IlIlIIIIIIlllIlIllIl = 0;
        this.IIllIIllIIIlIlIIIIlI = 0;
        this.IIIlIIIlIlIIlllIIlll = null;
        this.IlIlIIIlIIlIlIIlllIl = null;
        final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll = new llllIIIIlIIIlIlllIll("Colormap");
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(s);
        this.IlIlIlIlIlllllllllIl = llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(s);
        this.IlIlIIIllIIllIlllllI = this.llIllIIIIIllIlIIIIlI(properties.getProperty("format", s2));
        this.IIIIlllIIIIIIlIIIlll = llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI(properties.getProperty("blocks"));
        this.llllIIllllIlIlIIIIll = llllIIIIlIIIlIlllIll(properties.getProperty("source"), s, this.IlIlIlIlIlllllllllIl);
        this.IlIllIlIlIIIlIlIlIII = net.optifine.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(properties.getProperty("color"), -1);
        this.IIlllIIlIllIllIlIIll = llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(properties.getProperty("yVariance"), 0);
        this.lllIIIIlllllIlIIllIl = llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(properties.getProperty("yOffset"), 0);
        this.IlIlIIIIIIlllIlIllIl = ilIlIIIIIIlllIlIllIl;
        this.IIllIIllIIIlIlIIIIlI = iIllIIllIIIlIlIIIIlI;
    }
    
    private int llIllIIIIIllIlIIIIlI(String trim) {
        if (trim == null) {
            return 0;
        }
        trim = trim.trim();
        if (trim.equals("vanilla")) {
            return 0;
        }
        if (trim.equals("grid")) {
            return 1;
        }
        if (trim.equals("fixed")) {
            return 2;
        }
        IlIlIIIllIllIIIIIllI("Unknown format: " + trim);
        return -1;
    }
    
    public boolean llllIIIIlIIIlIlllIll(final String s) {
        if (this.IlIlIIIllIIllIlllllI != 0 && this.IlIlIIIllIIllIlllllI != 1) {
            if (this.IlIlIIIllIIllIlllllI != 2) {
                return false;
            }
            if (this.IlIllIlIlIIIlIlIlIII < 0) {
                this.IlIllIlIlIIIlIlIlIII = 16777215;
            }
        }
        else {
            if (this.llllIIllllIlIlIIIIll == null) {
                IlIlIIIllIllIIIIIllI("Source not defined: " + s);
                return false;
            }
            this.lIIIlllIIIllIIIllIII();
            if (this.IIIlIIIlIlIIlllIIlll == null) {
                return false;
            }
            if (this.IlIllIlIlIIIlIlIlIII < 0) {
                if (this.IlIlIIIllIIllIlllllI == 0) {
                    this.IlIllIlIlIIIlIlIlIII = this.llllIIIIlIIIlIlllIll(127, 127);
                }
                if (this.IlIlIIIllIIllIlllllI == 1) {
                    this.IlIllIlIlIIIlIlIlIII = this.llIllIIIIIllIlIIIIlI(net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl.IIlllIIlIllIllIlIIll, new IlIlIlIlIlllllllllIl(0, 64, 0));
                }
            }
        }
        return true;
    }
    
    public boolean IlIlIlIlIlllllllllIl(final String s) {
        if (this.IIIIlllIIIIIIlIIIlll == null) {
            this.IIIIlllIIIIIIlIIIlll = this.lIIIIlIIIIIlllIllIII();
            if (this.IIIIlllIIIIIIlIIIlll == null) {
                IlIlIIIllIllIIIIIllI("Match blocks not defined: " + s);
                return false;
            }
        }
        return true;
    }
    
    private llIIlIIIlIIIllIlIIIl[] lIIIIlIIIIIlllIllIII() {
        final net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll = net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(this.llllIIIIlIIIlIlllIll);
        if (llllIIIIlIIIlIlllIll != null) {
            return new llIIlIIIlIIIllIlIIIl[] { new llIIlIIIlIIIllIlIIIl(net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll)) };
        }
        final Matcher matcher = Pattern.compile("^block([0-9]+).*$").matcher(this.llllIIIIlIIIlIlllIll);
        if (matcher.matches()) {
            final int llllIIIIlIIIlIlllIll2 = net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(matcher.group(1), -1);
            if (llllIIIIlIIIlIlllIll2 >= 0) {
                return new llIIlIIIlIIIllIlIIIl[] { new llIIlIIIlIIIllIlIIIl(llllIIIIlIIIlIlllIll2) };
            }
        }
        final llIIlIIIlIIIllIlIIIl[] ilIIIlIlIIIllIlIlIIl = new llllIIIIlIIIlIlllIll("Colormap").IlIIIlIlIIIllIlIlIIl(this.llllIIIIlIIIlIlllIll);
        return (llIIlIIIlIIIllIlIIIl[])((ilIIIlIlIIIllIlIlIIl != null) ? ilIIIlIlIIIllIlIlIIl : null);
    }
    
    private void lIIIlllIIIllIIIllIII() {
        try {
            this.IIIlIIIlIlIIlllIIlll = null;
            if (this.llllIIllllIlIlIIIIll == null) {
                return;
            }
            final String string = String.valueOf(this.llllIIllllIlIlIIIIll) + ".png";
            final InputStream llllIIIIlIIIlIlllIll = net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(new lIllllIllIllIIllllll(string));
            if (llllIIIIlIIIlIlllIll == null) {
                return;
            }
            final BufferedImage llllIIIIlIIIlIlllIll2 = net.minecraft.client.lIIIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll);
            if (llllIIIIlIIIlIlllIll2 == null) {
                return;
            }
            final int width = llllIIIIlIIIlIlllIll2.getWidth();
            final int height = llllIIIIlIIIlIlllIll2.getHeight();
            final boolean b = this.IlIlIIIIIIlllIlIllIl < 0 || this.IlIlIIIIIIlllIlIllIl == width;
            final boolean b2 = this.IIllIIllIIIlIlIIIIlI < 0 || this.IIllIIllIIIlIlIIIIlI == height;
            if (!b || !b2) {
                IlIIIlIlIIIllIlIlIIl("Non-standard palette size: " + width + "x" + height + ", should be: " + this.IlIlIIIIIIlllIlIllIl + "x" + this.IIllIIllIIIlIlIIIIlI + ", path: " + string);
            }
            this.IlIlIIIIIIlllIlIllIl = width;
            this.IIllIIllIIIlIlIIIIlI = height;
            if (this.IlIlIIIIIIlllIlIllIl <= 0 || this.IIllIIllIIIlIlIIIIlI <= 0) {
                IlIlIIIllIllIIIIIllI("Invalid palette size: " + width + "x" + height + ", path: " + string);
                return;
            }
            llllIIIIlIIIlIlllIll2.getRGB(0, 0, width, height, this.IIIlIIIlIlIIlllIIlll = new int[width * height], 0, width);
        }
        catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    
    private static void IlIIIlIlIIIllIlIlIIl(final String s) {
        net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl("CustomColors: " + s);
    }
    
    private static void IlIlIIIllIllIIIIIllI(final String s) {
        net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI("CustomColors: " + s);
    }
    
    private static String llllIIIIlIIIlIlllIll(String s, final String s2, final String s3) {
        if (s != null) {
            s = s.trim();
            final String s4 = ".png";
            if (s.endsWith(s4)) {
                s = s.substring(0, s.length() - s4.length());
            }
            s = llllIIIIlIIIlIlllIll(s, s3);
            return s;
        }
        String s5 = s2;
        final int lastIndex = s2.lastIndexOf(47);
        if (lastIndex >= 0) {
            s5 = s2.substring(lastIndex + 1);
        }
        final int lastIndex2 = s5.lastIndexOf(46);
        if (lastIndex2 >= 0) {
            s5 = s5.substring(0, lastIndex2);
        }
        return llllIIIIlIIIlIlllIll(s5, s3);
    }
    
    private static String llllIIIIlIIIlIlllIll(String s, final String s2) {
        s = IlIIIlIIIllllIlIlIlI.llllIIIIlIIIlIlllIll(s, s2);
        if (!s.startsWith(s2) && !s.startsWith("textures/") && !s.startsWith("mcpatcher/")) {
            s = String.valueOf(s2) + "/" + s;
        }
        if (s.endsWith(".png")) {
            s = s.substring(0, s.length() - 4);
        }
        final String s3 = "textures/blocks/";
        if (s.startsWith(s3)) {
            s = s.substring(s3.length());
        }
        if (s.startsWith("/")) {
            s = s.substring(1);
        }
        return s;
    }
    
    public boolean llllIIIIlIIIlIlllIll(final IllIIlllIIIIlllIIlIl illIIlllIIIIlllIIlIl) {
        return net.optifine.llllIIIIlIIIlIlllIll.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll(illIIlllIIIIlllIIlIl, this.IIIIlllIIIIIIlIIIlll);
    }
    
    public int llllIIIIlIIIlIlllIll() {
        if (this.IlIlIIIllIIllIlllllI == 2) {
            return this.IlIllIlIlIIIlIlIlIII;
        }
        return this.IIIlIIIlIlIIlllIIlll[net.optifine.lllIIIIlllllIlIIllIl.llllIIIIlIIIlIlllIll.nextInt(this.IIIlIIIlIlIIlllIIlll.length)];
    }
    
    public int llllIIIIlIIIlIlllIll(int llllIIIIlIIIlIlllIll) {
        llllIIIIlIIIlIlllIll = net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll, 0, this.IIIlIIIlIlIIlllIIlll.length - 1);
        return this.IIIlIIIlIlIIlllIIlll[llllIIIIlIIIlIlllIll] & 0xFFFFFF;
    }
    
    public int llllIIIIlIIIlIlllIll(int llllIIIIlIIIlIlllIll, int llllIIIIlIIIlIlllIll2) {
        llllIIIIlIIIlIlllIll = net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll, 0, this.IlIlIIIIIIlllIlIllIl - 1);
        llllIIIIlIIIlIlllIll2 = net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll2, 0, this.IIllIIllIIIlIlIIIIlI - 1);
        return this.IIIlIIIlIlIIlllIIlll[llllIIIIlIIIlIlllIll2 * this.IlIlIIIIIIlllIlIllIl + llllIIIIlIIIlIlllIll] & 0xFFFFFF;
    }
    
    public float[][] IlIlIlIlIlllllllllIl() {
        if (this.IlIlIIIlIIlIlIIlllIl == null) {
            this.IlIlIIIlIIlIlIIlllIl = llllIIIIlIIIlIlllIll(this.IIIlIIIlIlIIlllIIlll);
        }
        return this.IlIlIIIlIIlIlIIlllIl;
    }
    
    @Override
    public int llllIIIIlIIIlIlllIll(final net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final lIlIlIIIllIIllIIIllI lIlIlIIIllIIllIIIllI, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        return this.llllIIIIlIIIlIlllIll(lIlIlIIIllIIllIIIllI, ilIlIlIlIlllllllllIl);
    }
    
    public int llllIIIIlIIIlIlllIll(final lIlIlIIIllIIllIIIllI lIlIlIIIllIIllIIIllI, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        return this.llllIIIIlIIIlIlllIll(net.optifine.lllIIIIlllllIlIIllIl.llllIIIIlIIIlIlllIll(lIlIlIIIllIIllIIIllI, ilIlIlIlIlllllllllIl), ilIlIlIlIlllllllllIl);
    }
    
    @Override
    public boolean llIllIIIIIllIlIIIIlI() {
        return this.IlIlIIIllIIllIlllllI == 2;
    }
    
    public int llllIIIIlIIIlIlllIll(final net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        return (this.IlIlIIIllIIllIlllllI == 0) ? this.IlIlIlIlIlllllllllIl(llIIlIIIlIIIllIlIIIl, ilIlIlIlIlllllllllIl) : ((this.IlIlIIIllIIllIlllllI == 1) ? this.llIllIIIIIllIlIIIIlI(llIIlIIIlIIIllIlIIIl, ilIlIlIlIlllllllllIl) : this.IlIllIlIlIIIlIlIlIII);
    }
    
    public int llllIIIIlIIIlIlllIll(final lIlIlIIIllIIllIIIllI lIlIlIIIllIIllIIIllI, final double n, final double n2, final double n3, final int n4) {
        if (this.IlIlIIIllIIllIlllllI == 2) {
            return this.IlIllIlIlIIIlIlIlIII;
        }
        final int llIllIIIIIllIlIIIIlI = llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(n);
        final int llIllIIIIIllIlIIIIlI2 = llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(n2);
        final int llIllIIIIIllIlIIIIlI3 = llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(n3);
        int n5 = 0;
        int n6 = 0;
        int n7 = 0;
        int n8 = 0;
        final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl = new IlIIIlIlIIIllIlIlIIl(0, 0, 0);
        for (int i = llIllIIIIIllIlIIIIlI - n4; i <= llIllIIIIIllIlIIIIlI + n4; ++i) {
            for (int j = llIllIIIIIllIlIIIIlI3 - n4; j <= llIllIIIIIllIlIIIIlI3 + n4; ++j) {
                ilIIIlIlIIIllIlIlIIl.IlIlIlIlIlllllllllIl(i, llIllIIIIIllIlIIIIlI2, j);
                final int llllIIIIlIIIlIlllIll = this.llllIIIIlIIIlIlllIll(lIlIlIIIllIIllIIIllI, ilIIIlIlIIIllIlIlIIl);
                n5 += (llllIIIIlIIIlIlllIll >> 16 & 0xFF);
                n6 += (llllIIIIlIIIlIlllIll >> 8 & 0xFF);
                n7 += (llllIIIIlIIIlIlllIll & 0xFF);
                ++n8;
            }
        }
        return n5 / n8 << 16 | n6 / n8 << 8 | n7 / n8;
    }
    
    private int IlIlIlIlIlllllllllIl(final net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        final double n = llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl), 0.0f, 1.0f);
        return this.llllIIIIlIIIlIlllIll((int)((1.0 - n) * (this.IlIlIIIIIIlllIlIllIl - 1)), (int)((1.0 - llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(llIIlIIIlIIIllIlIIIl.lIIIlllIIIllIIIllIII(), 0.0f, 1.0f) * n) * (this.IIllIIllIIIlIlIIIIlI - 1)));
    }
    
    private int llIllIIIIIllIlIIIIlI(final net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        final int liiiiIlIlIIIlIIIIlIl = llIIlIIIlIIIllIlIIIl.lIIIIIlIlIIIlIIIIlIl;
        int n = ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII() - this.lllIIIIlllllIlIIllIl;
        if (this.IIlllIIlIllIllIlIIll > 0) {
            n += (net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII() << 16 + ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl()) & 0xFF) % (this.IIlllIIlIllIllIlIIll * 2 + 1) - this.IIlllIIlIllIllIlIIll;
        }
        return this.llllIIIIlIIIlIlllIll(liiiiIlIlIIIlIIIIlIl, n);
    }
    
    public int IlIIIlIlIIIllIlIlIIl() {
        return (this.IlIlIIIllIIllIlllllI == 2) ? 1 : this.IIIlIIIlIlIIlllIIlll.length;
    }
    
    public int IlIlIIIllIllIIIIIllI() {
        return this.IlIlIIIIIIlllIlIllIl;
    }
    
    public int IllIIlllIIIIlllIIlIl() {
        return this.IIllIIllIIIlIlIIIIlI;
    }
    
    private static float[][] llllIIIIlIIIlIlllIll(final int[] array) {
        final float[][] array2 = new float[array.length][3];
        for (int i = 0; i < array.length; ++i) {
            final int n = array[i];
            final float n2 = (n >> 16 & 0xFF) / 255.0f;
            final float n3 = (n >> 8 & 0xFF) / 255.0f;
            final float n4 = (n & 0xFF) / 255.0f;
            final float[] array3 = array2[i];
            array3[0] = n2;
            array3[1] = n3;
            array3[2] = n4;
        }
        return array2;
    }
    
    public void llllIIIIlIIIlIlllIll(final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl) {
        if (this.IIIIlllIIIIIIlIIIlll == null) {
            this.IIIIlllIIIIIIlIIIlll = new llIIlIIIlIIIllIlIIIl[0];
        }
        this.IIIIlllIIIIIIlIIIlll = (llIIlIIIlIIIllIlIIIl[])net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(this.IIIIlllIIIIIIlIIIlll, llIIlIIIlIIIllIlIIIl);
    }
    
    public void IlIlIlIlIlllllllllIl(final int n, final int n2) {
        final llIIlIIIlIIIllIlIIIl ilIlIlIlIlllllllllIl = this.IlIlIlIlIlllllllllIl(n);
        if (ilIlIlIlIlllllllllIl != null) {
            if (n2 >= 0) {
                ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(n2);
            }
        }
        else {
            this.llllIIIIlIIIlIlllIll(new llIIlIIIlIIIllIlIIIl(n, n2));
        }
    }
    
    private llIIlIIIlIIIllIlIIIl IlIlIlIlIlllllllllIl(final int n) {
        if (this.IIIIlllIIIIIIlIIIlll == null) {
            return null;
        }
        for (int i = 0; i < this.IIIIlllIIIIIIlIIIlll.length; ++i) {
            final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl = this.IIIIlllIIIIIIlIIIlll[i];
            if (llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll() == n) {
                return llIIlIIIlIIIllIlIIIl;
            }
        }
        return null;
    }
    
    public int[] llllIIIlIlllIlIIIIIl() {
        if (this.IIIIlllIIIIIIlIIIlll == null) {
            return null;
        }
        final HashSet<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < this.IIIIlllIIIIIIlIIIlll.length; ++i) {
            final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl = this.IIIIlllIIIIIIlIIIlll[i];
            if (llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll() >= 0) {
                set.add(llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll());
            }
        }
        final Integer[] array = set.toArray(new Integer[set.size()]);
        final int[] array2 = new int[array.length];
        for (int j = 0; j < array.length; ++j) {
            array2[j] = array[j];
        }
        return array2;
    }
    
    @Override
    public String toString() {
        return this.IlIlIlIlIlllllllllIl + "/" + this.llllIIIIlIIIlIlllIll + ", blocks: " + net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(this.IIIIlllIIIIIIlIIIlll) + ", source: " + this.llllIIllllIlIlIIIIll;
    }
}
