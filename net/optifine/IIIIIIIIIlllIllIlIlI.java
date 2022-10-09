package net.optifine;

import net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.optifine.lIIIlllIIIllIIIllIII.*;
import java.util.*;
import net.minecraft.client.*;
import net.optifine.llllIIIIlIIIlIlllIll.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;
import net.optifine.util.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.*;

public class IIIIIIIIIlllIllIlIlI
{
    public String llllIIIIlIIIlIlllIll;
    private int IllIIlllIIIIlllIIlIl;
    private int llllIIIlIlllIlIIIIIl;
    private int lIIIIlIIIIIlllIllIII;
    private int lIIIlllIIIllIIIllIII;
    private int llIIlIIIlIIIllIlIIIl;
    private boolean llIllIlIIIIllIlIIllI;
    private float lIlIlIIIllIIllIIIllI;
    private float[] IlIlIIIllIIllIlllllI;
    private llllIIllllIlIlIIIIll IIIIlllIIIIIIlIIIlll;
    private int llllIIllllIlIlIIIIll;
    private boolean IlIllIlIlIIIlIlIlIII;
    private boolean IIlllIIlIllIllIlIIll;
    private boolean lllIIIIlllllIlIIllIl;
    public llIIlIIIlIIIllIlIIIl[] IlIlIlIlIlllllllllIl;
    public llllIIllllIlIlIIIIll llIllIIIIIllIlIIIIlI;
    private float IlIlIIIIIIlllIlIllIl;
    private llllllIllIllIlIllllI IIllIIllIIIlIlIIIIlI;
    public int IlIIIlIlIIIllIlIlIIl;
    private IlllllllIIIlIIIlIlII IIIlIIIlIlIIlllIIlll;
    public static final float[] IlIlIIIllIllIIIIIllI;
    private static final String IlIlIIIlIIlIlIIlllIl = "clear";
    private static final String IlllllllIIIlIIIlIlII = "rain";
    private static final String IIlIIIIlllIlllllIlII = "thunder";
    
    static {
        IlIlIIIllIllIIIIIllI = new float[] { 1.0f, 0.0f, 0.0f };
    }
    
    public IIIIIIIIIlllIllIlIlI(final Properties properties, final String s) {
        this.llllIIIIlIIIlIlllIll = null;
        this.IllIIlllIIIIlllIIlIl = -1;
        this.llllIIIlIlllIlIIIIIl = -1;
        this.lIIIIlIIIIIlllIllIII = -1;
        this.lIIIlllIIIllIIIllIII = -1;
        this.llIIlIIIlIIIllIlIIIl = 1;
        this.llIllIlIIIIllIlIIllI = false;
        this.lIlIlIIIllIIllIIIllI = 1.0f;
        this.IlIlIIIllIIllIlllllI = IIIIIIIIIlllIllIlIlI.IlIlIIIllIllIIIIIllI;
        this.IIIIlllIIIIIIlIIIlll = null;
        this.llllIIllllIlIlIIIIll = 8;
        this.IlIllIlIlIIIlIlIlIII = true;
        this.IIlllIIlIllIllIlIIll = false;
        this.lllIIIIlllllIlIIllIl = false;
        this.IlIlIlIlIlllllllllIl = null;
        this.llIllIIIIIllIlIIIIlI = null;
        this.IlIlIIIIIIlllIlIllIl = 1.0f;
        this.IIllIIllIIIlIlIIIIlI = null;
        this.IlIIIlIlIIIllIlIlIIl = -1;
        this.IIIlIIIlIlIIlllIIlll = null;
        final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll = new llllIIIIlIIIlIlllIll("CustomSky");
        this.llllIIIIlIIIlIlllIll = properties.getProperty("source", s);
        this.IllIIlllIIIIlllIIlIl = this.llIllIIIIIllIlIIIIlI(properties.getProperty("startFadeIn"));
        this.llllIIIlIlllIlIIIIIl = this.llIllIIIIIllIlIIIIlI(properties.getProperty("endFadeIn"));
        this.lIIIIlIIIIIlllIllIII = this.llIllIIIIIllIlIIIIlI(properties.getProperty("startFadeOut"));
        this.lIIIlllIIIllIIIllIII = this.llIllIIIIIllIlIIIIlI(properties.getProperty("endFadeOut"));
        this.llIIlIIIlIIIllIlIIIl = net.optifine.lIIIlllIIIllIIIllIII.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(properties.getProperty("blend"));
        this.llIllIlIIIIllIlIIllI = this.llllIIIIlIIIlIlllIll(properties.getProperty("rotate"), true);
        this.lIlIlIIIllIIllIIIllI = this.llllIIIIlIIIlIlllIll(properties.getProperty("speed"), 1.0f);
        this.IlIlIIIllIIllIlllllI = this.llllIIIIlIIIlIlllIll(properties.getProperty("axis"), IIIIIIIIIlllIllIlIlI.IlIlIIIllIllIIIIIllI);
        this.IIIIlllIIIIIIlIIIlll = llllIIIIlIIIlIlllIll.lIlIlIIIllIIllIIIllI(properties.getProperty("days"));
        this.llllIIllllIlIlIIIIll = llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(properties.getProperty("daysLoop"), 8);
        final List ilIlIlIlIlllllllllIl = this.IlIlIlIlIlllllllllIl(properties.getProperty("weather", "clear"));
        this.IlIllIlIlIIIlIlIlIII = ilIlIlIlIlllllllllIl.contains("clear");
        this.IIlllIIlIllIllIlIIll = ilIlIlIlIlllllllllIl.contains("rain");
        this.lllIIIIlllllIlIIllIl = ilIlIlIlIlllllllllIl.contains("thunder");
        this.IlIlIlIlIlllllllllIl = llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl(properties.getProperty("biomes"));
        this.llIllIIIIIllIlIIIIlI = llllIIIIlIIIlIlllIll.lIlIlIIIllIIllIIIllI(properties.getProperty("heights"));
        this.IlIlIIIIIIlllIlIllIl = this.llllIIIIlIIIlIlllIll(properties.getProperty("transition"), 1.0f);
    }
    
    private List IlIlIlIlIlllllllllIl(final String s) {
        final List<String> list = Arrays.asList("clear", "rain", "thunder");
        final ArrayList<String> list2 = new ArrayList<String>();
        final String[] llllIIIIlIIIlIlllIll = net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(s, " ");
        for (int i = 0; i < llllIIIIlIIIlIlllIll.length; ++i) {
            final String s2 = llllIIIIlIIIlIlllIll[i];
            if (!list.contains(s2)) {
                net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI("Unknown weather: " + s2);
            }
            else {
                list2.add(s2);
            }
        }
        return list2;
    }
    
    private int llIllIIIIIllIlIIIIlI(final String s) {
        if (s == null) {
            return -1;
        }
        final String[] llllIIIIlIIIlIlllIll = net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(s, ":");
        if (llllIIIIlIIIlIlllIll.length != 2) {
            net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI("Invalid time: " + s);
            return -1;
        }
        final String s2 = llllIIIIlIIIlIlllIll[0];
        final String s3 = llllIIIIlIIIlIlllIll[1];
        int llllIIIIlIIIlIlllIll2 = net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(s2, -1);
        final int llllIIIIlIIIlIlllIll3 = net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(s3, -1);
        if (llllIIIIlIIIlIlllIll2 >= 0 && llllIIIIlIIIlIlllIll2 <= 23 && llllIIIIlIIIlIlllIll3 >= 0 && llllIIIIlIIIlIlllIll3 <= 59) {
            llllIIIIlIIIlIlllIll2 -= 6;
            if (llllIIIIlIIIlIlllIll2 < 0) {
                llllIIIIlIIIlIlllIll2 += 24;
            }
            return llllIIIIlIIIlIlllIll2 * 1000 + (int)(llllIIIIlIIIlIlllIll3 / 60.0 * 1000.0);
        }
        net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI("Invalid time: " + s);
        return -1;
    }
    
    private boolean llllIIIIlIIIlIlllIll(final String s, final boolean b) {
        if (s == null) {
            return b;
        }
        if (s.toLowerCase().equals("true")) {
            return true;
        }
        if (s.toLowerCase().equals("false")) {
            return false;
        }
        net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI("Unknown boolean: " + s);
        return b;
    }
    
    private float llllIIIIlIIIlIlllIll(final String s, final float n) {
        if (s == null) {
            return n;
        }
        final float llllIIIIlIIIlIlllIll = net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(s, Float.MIN_VALUE);
        if (llllIIIIlIIIlIlllIll == Float.MIN_VALUE) {
            net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI("Invalid value: " + s);
            return n;
        }
        return llllIIIIlIIIlIlllIll;
    }
    
    private float[] llllIIIIlIIIlIlllIll(final String s, final float[] array) {
        if (s == null) {
            return array;
        }
        final String[] llllIIIIlIIIlIlllIll = net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(s, " ");
        if (llllIIIIlIIIlIlllIll.length != 3) {
            net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI("Invalid axis: " + s);
            return array;
        }
        final float[] array2 = new float[3];
        for (int i = 0; i < llllIIIIlIIIlIlllIll.length; ++i) {
            array2[i] = net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll[i], Float.MIN_VALUE);
            if (array2[i] == Float.MIN_VALUE) {
                net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI("Invalid axis: " + s);
                return array;
            }
            if (array2[i] < -1.0f || array2[i] > 1.0f) {
                net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI("Invalid axis values: " + s);
                return array;
            }
        }
        final float n = array2[0];
        final float n2 = array2[1];
        final float n3 = array2[2];
        if (n * n + n2 * n2 + n3 * n3 < 1.0E-5f) {
            net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI("Invalid axis values: " + s);
            return array;
        }
        return new float[] { n3, n2, -n };
    }
    
    public boolean llllIIIIlIIIlIlllIll(final String s) {
        if (this.llllIIIIlIIIlIlllIll == null) {
            net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI("No source texture: " + s);
            return false;
        }
        this.llllIIIIlIIIlIlllIll = IlIIIlIIIllllIlIlIlI.llllIIIIlIIIlIlllIll(this.llllIIIIlIIIlIlllIll, IlIIIlIIIllllIlIlIlI.llllIIIIlIIIlIlllIll(s));
        if (this.IllIIlllIIIIlllIIlIl < 0 || this.llllIIIlIlllIlIIIIIl < 0 || this.lIIIlllIIIllIIIllIII < 0) {
            net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI("Invalid times, required are: startFadeIn, endFadeIn and endFadeOut.");
            return false;
        }
        final int llllIIIIlIIIlIlllIll = this.llllIIIIlIIIlIlllIll(this.llllIIIlIlllIlIIIIIl - this.IllIIlllIIIIlllIIlIl);
        if (this.lIIIIlIIIIIlllIllIII < 0) {
            this.lIIIIlIIIIIlllIllIII = this.llllIIIIlIIIlIlllIll(this.lIIIlllIIIllIIIllIII - llllIIIIlIIIlIlllIll);
            if (this.llllIIIIlIIIlIlllIll(this.lIIIIlIIIIIlllIllIII, this.IllIIlllIIIIlllIIlIl, this.llllIIIlIlllIlIIIIIl)) {
                this.lIIIIlIIIIIlllIllIII = this.llllIIIlIlllIlIIIIIl;
            }
        }
        final int n = llllIIIIlIIIlIlllIll + this.llllIIIIlIIIlIlllIll(this.lIIIIlIIIIIlllIllIII - this.llllIIIlIlllIlIIIIIl) + this.llllIIIIlIIIlIlllIll(this.lIIIlllIIIllIIIllIII - this.lIIIIlIIIIIlllIllIII) + this.llllIIIIlIIIlIlllIll(this.IllIIlllIIIIlllIIlIl - this.lIIIlllIIIllIIIllIII);
        if (n != 24000) {
            net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI("Invalid fadeIn/fadeOut times, sum is not 24h: " + n);
            return false;
        }
        if (this.lIlIlIIIllIIllIIIllI < 0.0f) {
            net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI("Invalid speed: " + this.lIlIlIIIllIIllIIIllI);
            return false;
        }
        if (this.llllIIllllIlIlIIIIll <= 0) {
            net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI("Invalid daysLoop: " + this.llllIIllllIlIlIIIIll);
            return false;
        }
        return true;
    }
    
    private int llllIIIIlIIIlIlllIll(int i) {
        while (i >= 24000) {
            i -= 24000;
        }
        while (i < 0) {
            i += 24000;
        }
        return i;
    }
    
    public void llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final int n, final float n2, final float n3, final float n4) {
        final float llllIIIIlIIIlIlllIll = net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII) * this.llllIIIIlIIIlIlllIll(n3, n4) * this.IlIlIlIlIlllllllllIl(n), 0.0f, 1.0f);
        if (llllIIIIlIIIlIlllIll >= 1.0E-4f) {
            lllllIlIIIlIlIIlllII.lIIIlllIIIllIIIllIII(this.IlIIIlIlIIIllIlIlIIl);
            net.optifine.lIIIlllIIIllIIIllIII.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(this.llIIlIIIlIIIllIlIIIl, llllIIIIlIIIlIlllIll);
            lllllIlIIIlIlIIlllII.lllllIlIIIlIlIIlllII();
            if (this.llIllIlIIIIllIlIIllI) {
                float n5 = 0.0f;
                if (this.lIlIlIIIllIIllIIIllI != Math.round(this.lIlIlIIIllIIllIIIllI)) {
                    n5 = (float)((illlllllIIIlIIIlIlII.IlIlIllllllllIIIIlII() + 18000L) / 24000L * (double)(this.lIlIlIIIllIIllIIIllI % 1.0f) % 1.0);
                }
                lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(360.0f * (n5 + n2 * this.lIlIlIIIllIIllIIIllI), this.IlIlIIIllIIllIlllllI[0], this.IlIlIIIllIIllIlllllI[1], this.IlIlIIIllIIllIlllllI[2]);
            }
            final IIlllIIlllIIIlIlllII llllIIIIlIIIlIlllIll2 = IIlllIIlllIIIlIlllII.llllIIIIlIIIlIlllIll();
            lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(90.0f, 1.0f, 0.0f, 0.0f);
            lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(-90.0f, 0.0f, 0.0f, 1.0f);
            this.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll2, 4);
            lllllIlIIIlIlIIlllII.lllllIlIIIlIlIIlllII();
            lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(90.0f, 1.0f, 0.0f, 0.0f);
            this.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll2, 1);
            lllllIlIIIlIlIIlllII.lIllllllIIllIlIlIlII();
            lllllIlIIIlIlIIlllII.lllllIlIIIlIlIIlllII();
            lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(-90.0f, 1.0f, 0.0f, 0.0f);
            this.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll2, 0);
            lllllIlIIIlIlIIlllII.lIllllllIIllIlIlIlII();
            lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(90.0f, 0.0f, 0.0f, 1.0f);
            this.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll2, 5);
            lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(90.0f, 0.0f, 0.0f, 1.0f);
            this.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll2, 2);
            lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(90.0f, 0.0f, 0.0f, 1.0f);
            this.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll2, 3);
            lllllIlIIIlIlIIlllII.lIllllllIIllIlIlIlII();
        }
    }
    
    private float llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII) {
        if (this.IlIlIlIlIlllllllllIl == null && this.llIllIIIIIllIlIIIIlI == null) {
            return 1.0f;
        }
        final float ilIlIlIlIlllllllllIl = this.IlIlIlIlIlllllllllIl(illlllllIIIlIIIlIlII);
        if (this.IIllIIllIIIlIlIIIIlI == null) {
            this.IIllIIllIIIlIlIIIIlI = new llllllIllIllIlIllllI(ilIlIlIlIlllllllllIl, this.IlIlIIIIIIlllIlIllIl);
        }
        return this.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl);
    }
    
    private float IlIlIlIlIlllllllllIl(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII) {
        final llIllIIIIIllIlIIIIlI liiiIlIlIllllIIlIllI = Minecraft.getMinecraft().lIIIIlIlIllllIIlIllI();
        if (liiiIlIlIllllIIlIllI == null) {
            return 0.0f;
        }
        final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIIIlIIlIlIIlllIl = liiiIlIlIllllIIlIllI.IlIlIIIlIIlIlIIlllIl();
        if (this.IlIlIlIlIlllllllllIl != null) {
            final llIIlIIIlIIIllIlIIIl llIllIIIIIllIlIIIIlI = illlllllIIIlIIIlIlII.llIllIIIIIllIlIIIIlI(ilIlIIIlIIlIlIIlllIl);
            if (llIllIIIIIllIlIIIIlI == null) {
                return 0.0f;
            }
            if (!net.optifine.llllIIIIlIIIlIlllIll.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI, this.IlIlIlIlIlllllllllIl)) {
                return 0.0f;
            }
        }
        return (this.llIllIIIIIllIlIIIIlI != null && !this.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(ilIlIIIlIIlIlIIlllIl.lIIIlllIIIllIIIllIII())) ? 0.0f : 1.0f;
    }
    
    private float llllIIIIlIIIlIlllIll(final float n, final float n2) {
        final float n3 = 1.0f - n;
        final float n4 = n - n2;
        float n5 = 0.0f;
        if (this.IlIllIlIlIIIlIlIlIII) {
            n5 += n3;
        }
        if (this.IIlllIIlIllIllIlIIll) {
            n5 += n4;
        }
        if (this.lllIIIIlllllIlIIllIl) {
            n5 += n2;
        }
        return lIllllllIIllIlIlIlII.llllIIIIlIIIlIlllIll(n5, 0.0f, 1.0f);
    }
    
    private float IlIlIlIlIlllllllllIl(final int n) {
        if (this.llllIIIIlIIIlIlllIll(n, this.IllIIlllIIIIlllIIlIl, this.llllIIIlIlllIlIIIIIl)) {
            return this.llllIIIIlIIIlIlllIll(n - this.IllIIlllIIIIlllIIlIl) / (float)this.llllIIIIlIIIlIlllIll(this.llllIIIlIlllIlIIIIIl - this.IllIIlllIIIIlllIIlIl);
        }
        if (this.llllIIIIlIIIlIlllIll(n, this.llllIIIlIlllIlIIIIIl, this.lIIIIlIIIIIlllIllIII)) {
            return 1.0f;
        }
        if (this.llllIIIIlIIIlIlllIll(n, this.lIIIIlIIIIIlllIllIII, this.lIIIlllIIIllIIIllIII)) {
            return 1.0f - this.llllIIIIlIIIlIlllIll(n - this.lIIIIlIIIIIlllIllIII) / (float)this.llllIIIIlIIIlIlllIll(this.lIIIlllIIIllIIIllIII - this.lIIIIlIIIIIlllIllIII);
        }
        return 0.0f;
    }
    
    private void llllIIIIlIIIlIlllIll(final IIlllIIlllIIIlIlllII illlIIlllIIIlIlllII, final int n) {
        final lIIllIIIllllIlllIllI llIllIIIIIllIlIIIIlI = illlIIlllIIIlIlllII.llIllIIIIIllIlIIIIlI();
        final double n2 = n % 3 / 3.0;
        final double n3 = n / 3 / 2.0;
        llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(7, net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll.lIIIlllIIIllIIIllIII);
        llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(-100.0, -100.0, -100.0).llllIIIIlIIIlIlllIll(n2, n3).IlIlIIIllIllIIIIIllI();
        llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(-100.0, -100.0, 100.0).llllIIIIlIIIlIlllIll(n2, n3 + 0.5).IlIlIIIllIllIIIIIllI();
        llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(100.0, -100.0, 100.0).llllIIIIlIIIlIlllIll(n2 + 0.3333333333333333, n3 + 0.5).IlIlIIIllIllIIIIIllI();
        llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(100.0, -100.0, -100.0).llllIIIIlIIIlIlllIll(n2 + 0.3333333333333333, n3).IlIlIIIllIllIIIIIllI();
        illlIIlllIIIlIlllII.IlIlIlIlIlllllllllIl();
    }
    
    public boolean llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII iiIlIIIlIlIIlllIIlll, final int n) {
        if (iiIlIIIlIlIIlllIIlll != this.IIIlIIIlIlIIlllIIlll) {
            this.IIIlIIIlIlIIlllIIlll = iiIlIIIlIlIIlllIIlll;
            this.IIllIIllIIIlIlIIIIlI = null;
        }
        if (this.llllIIIIlIIIlIlllIll(n, this.lIIIlllIIIllIIIllIII, this.IllIIlllIIIIlllIIlIl)) {
            return false;
        }
        if (this.IIIIlllIIIIIIlIIIlll != null) {
            long n2;
            for (n2 = iiIlIIIlIlIIlllIIlll.IlIlIllllllllIIIIlII() - this.IllIIlllIIIIlllIIlIl; n2 < 0L; n2 += 24000 * this.llllIIllllIlIlIIIIll) {}
            if (!this.IIIIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll((int)(n2 / 24000L) % this.llllIIllllIlIlIIIIll)) {
                return false;
            }
        }
        return true;
    }
    
    private boolean llllIIIIlIIIlIlllIll(final int n, final int n2, final int n3) {
        return (n2 <= n3) ? (n >= n2 && n <= n3) : (n >= n2 || n <= n3);
    }
    
    @Override
    public String toString() {
        return this.llllIIIIlIIIlIlllIll + ", " + this.IllIIlllIIIIlllIIlIl + "-" + this.llllIIIlIlllIlIIIIIl + " " + this.lIIIIlIIIIIlllIllIII + "-" + this.lIIIlllIIIllIIIllIII;
    }
}
