package net.optifine;

import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll.*;
import net.minecraft.llIllIlIIIIllIlIIllI.*;
import java.util.*;
import net.optifine.util.*;
import net.optifine.llllIIIIlIIIlIlllIll.*;
import net.optifine.lIIIIlIIIIIlllIllIII.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.IllIIlllIIIIlllIIlIl.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;

public class lIllIIIIIlllIIlIIllI
{
    private String llIllIIIIIllIlIIIIlI;
    private lIllllIllIllIIllllll IlIIIlIlIIIllIlIlIIl;
    private int IlIlIIIllIllIIIIIllI;
    private int[] IllIIlllIIIIlllIIlIl;
    private lIllllIllIllIIllllll[] llllIIIlIlllIlIIIIIl;
    private int[] lIIIIlIIIIIlllIllIII;
    private llIIlIIIlIIIllIlIIIl[] lIIIlllIIIllIIIllIII;
    private llllIIllllIlIlIIIIll llIIlIIIlIIIllIlIIIl;
    private llllIIllllIlIlIIIIll llIllIlIIIIllIlIIllI;
    private boolean lIlIlIIIllIIllIIIllI;
    private lIlIlIIIllIIllIIIllI IlIlIIIllIIllIlllllI;
    public int[] llllIIIIlIIIlIlllIll;
    public int IlIlIlIlIlllllllllIl;
    private IlIllIlIlIIIlIlIlIII[] IIIIlllIIIIIIlIIIlll;
    private IlIlIlIlIlllllllllIl[] llllIIllllIlIlIIIIll;
    private Boolean IlIllIlIlIIIlIlIlIII;
    private llllIIllllIlIlIIIIll IIlllIIlIllIllIlIIll;
    private llllIIllllIlIlIIIIll lllIIIIlllllIlIIllIl;
    private IIlllIIlIllIllIlIIll[] IlIlIIIIIIlllIlIllIl;
    
    public lIllIIIIIlllIIlIIllI(final Properties properties, final String llIllIIIIIllIlIIIIlI, final lIllllIllIllIIllllll ilIIIlIlIIIllIlIlIIl, final int ilIlIIIllIllIIIIIllI, final String s, final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        this.llIllIIIIIllIlIIIIlI = null;
        this.IlIIIlIlIIIllIlIlIIl = null;
        this.IllIIlllIIIIlllIIlIl = null;
        this.llllIIIlIlllIlIIIIIl = null;
        this.lIIIIlIIIIIlllIllIII = null;
        this.lIIIlllIIIllIIIllIII = null;
        this.llIIlIIIlIIIllIlIIIl = null;
        this.llIllIlIIIIllIlIIllI = null;
        this.lIlIlIIIllIIllIIIllI = false;
        this.IlIlIIIllIIllIlllllI = null;
        this.llllIIIIlIIIlIlllIll = null;
        this.IlIlIlIlIlllllllllIl = 1;
        this.IIIIlllIIIIIIlIIIlll = null;
        this.llllIIllllIlIlIIIIll = null;
        this.IlIllIlIlIIIlIlIlIII = null;
        this.IIlllIIlIllIllIlIIll = null;
        this.lllIIIIlllllIlIIllIl = null;
        this.IlIlIIIIIIlllIlIllIl = null;
        this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
        this.IlIIIlIlIIIllIlIlIIl = ilIIIlIlIIIllIlIlIIl;
        this.IlIlIIIllIllIIIIIllI = ilIlIIIllIllIIIIIllI;
        this.IllIIlllIIIIlllIIlIl = llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII(s);
        this.lIIIIlIIIIIlllIllIII = llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII(properties.getProperty("weights." + ilIlIIIllIllIIIIIllI));
        this.lIIIlllIIIllIIIllIII = llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl(properties.getProperty("biomes." + ilIlIIIllIllIIIIIllI));
        this.llIIlIIIlIIIllIlIIIl = llllIIIIlIIIlIlllIll.lIlIlIIIllIIllIIIllI(properties.getProperty("heights." + ilIlIIIllIllIIIIIllI));
        if (this.llIIlIIIlIIIllIlIIIl == null) {
            this.llIIlIIIlIIIllIlIIIl = this.llllIIIIlIIIlIlllIll(properties, ilIlIIIllIllIIIIIllI);
        }
        final String property = properties.getProperty("health." + ilIlIIIllIllIIIIIllI);
        if (property != null) {
            this.lIlIlIIIllIIllIIIllI = property.contains("%");
            this.llIllIlIIIIllIlIIllI = llllIIIIlIIIlIlllIll.lIlIlIIIllIIllIIIllI(property.replace("%", ""));
        }
        this.IlIlIIIllIIllIlllllI = llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl("name", properties.getProperty("name." + ilIlIIIllIllIIIIIllI));
        this.IIIIlllIIIIIIlIIIlll = llllIIIIlIIIlIlllIll.IIIIlllIIIIIIlIIIlll(properties.getProperty("professions." + ilIlIIIllIllIIIIIllI));
        this.llllIIllllIlIlIIIIll = llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(properties.getProperty("collarColors." + ilIlIIIllIllIIIIIllI), "collar color", net.optifine.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl);
        this.IlIllIlIlIIIlIlIlIII = llllIIIIlIIIlIlllIll.IlIlIIIllIIllIlllllI(properties.getProperty("baby." + ilIlIIIllIllIIIIIllI));
        this.IIlllIIlIllIllIlIIll = llllIIIIlIIIlIlllIll.lIlIlIIIllIIllIIIllI(properties.getProperty("moonPhase." + ilIlIIIllIllIIIIIllI));
        this.lllIIIIlllllIlIIllIl = llllIIIIlIIIlIlllIll.lIlIlIIIllIIllIIIllI(properties.getProperty("dayTime." + ilIlIIIllIllIIIIIllI));
        this.IlIlIIIIIIlllIlIllIl = llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(properties.getProperty("weather." + ilIlIIIllIllIIIIIllI), "weather." + ilIlIIIllIllIIIIIllI, (IIlllIIlIllIllIlIIll[])null);
    }
    
    private llllIIllllIlIlIIIIll llllIIIIlIIIlIlllIll(final Properties properties, final int n) {
        final String property = properties.getProperty("minHeight." + n);
        final String property2 = properties.getProperty("maxHeight." + n);
        if (property == null && property2 == null) {
            return null;
        }
        int llllIIIIlIIIlIlllIll = 0;
        if (property != null) {
            llllIIIIlIIIlIlllIll = net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(property, -1);
            if (llllIIIIlIIIlIlllIll < 0) {
                net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI("Invalid minHeight: " + property);
                return null;
            }
        }
        int llllIIIIlIIIlIlllIll2 = 256;
        if (property2 != null) {
            llllIIIIlIIIlIlllIll2 = net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(property2, -1);
            if (llllIIIIlIIIlIlllIll2 < 0) {
                net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI("Invalid maxHeight: " + property2);
                return null;
            }
        }
        if (llllIIIIlIIIlIlllIll2 < 0) {
            net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI("Invalid minHeight, maxHeight: " + property + ", " + property2);
            return null;
        }
        final llllIIllllIlIlIIIIll llllIIllllIlIlIIIIll = new llllIIllllIlIlIIIIll();
        llllIIllllIlIlIIIIll.llllIIIIlIIIlIlllIll(new IIIIlllIIIIIIlIIIlll(llllIIIIlIIIlIlllIll, llllIIIIlIIIlIlllIll2));
        return llllIIllllIlIlIIIIll;
    }
    
    public boolean llllIIIIlIIIlIlllIll(final String s) {
        if (this.IllIIlllIIIIlllIIlIl == null || this.IllIIlllIIIIlllIIlIl.length == 0) {
            net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI("Invalid skins for rule: " + this.IlIlIIIllIllIIIIIllI);
            return false;
        }
        if (this.llllIIIlIlllIlIIIIIl != null) {
            return true;
        }
        this.llllIIIlIlllIlIIIIIl = new lIllllIllIllIIllllll[this.IllIIlllIIIIlllIIlIl.length];
        final lIllllIllIllIIllllll llllIIIIlIIIlIlllIll = IlIIllIIllIIllIIlIIl.llllIIIIlIIIlIlllIll(this.IlIIIlIlIIIllIlIlIIl, this.llIllIIIIIllIlIIIIlI.startsWith("mcpatcher/mob/"));
        if (llllIIIIlIIIlIlllIll == null) {
            net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI("Invalid path: " + this.IlIIIlIlIIIllIlIlIIl.IlIlIlIlIlllllllllIl());
            return false;
        }
        for (int i = 0; i < this.llllIIIlIlllIlIIIIIl.length; ++i) {
            final int n = this.IllIIlllIIIIlllIIlIl[i];
            if (n <= 1) {
                this.llllIIIlIlllIlIIIIIl[i] = this.IlIIIlIlIIIllIlIlIIl;
            }
            else {
                final lIllllIllIllIIllllll llllIIIIlIIIlIlllIll2 = IlIIllIIllIIllIIlIIl.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll, n);
                if (llllIIIIlIIIlIlllIll2 == null) {
                    net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI("Invalid path: " + this.IlIIIlIlIIIllIlIlIIl.IlIlIlIlIlllllllllIl());
                    return false;
                }
                if (!net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI(llllIIIIlIIIlIlllIll2)) {
                    net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI("Texture not found: " + llllIIIIlIIIlIlllIll2.IlIlIlIlIlllllllllIl());
                    return false;
                }
                this.llllIIIlIlllIlIIIIIl[i] = llllIIIIlIIIlIlllIll2;
            }
        }
        if (this.lIIIIlIIIIIlllIllIII != null) {
            if (this.lIIIIlIIIIIlllIllIII.length > this.llllIIIlIlllIlIIIIIl.length) {
                net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI("More weights defined than skins, trimming weights: " + s);
                final int[] liiiIlIIIIIlllIllIII = new int[this.llllIIIlIlllIlIIIIIl.length];
                System.arraycopy(this.lIIIIlIIIIIlllIllIII, 0, liiiIlIIIIIlllIllIII, 0, liiiIlIIIIIlllIllIII.length);
                this.lIIIIlIIIIIlllIllIII = liiiIlIIIIIlllIllIII;
            }
            if (this.lIIIIlIIIIIlllIllIII.length < this.llllIIIlIlllIlIIIIIl.length) {
                net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI("Less weights defined than skins, expanding weights: " + s);
                final int[] liiiIlIIIIIlllIllIII2 = new int[this.llllIIIlIlllIlIIIIIl.length];
                System.arraycopy(this.lIIIIlIIIIIlllIllIII, 0, liiiIlIIIIIlllIllIII2, 0, this.lIIIIlIIIIIlllIllIII.length);
                final int llllIIIIlIIIlIlllIll3 = IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll(this.lIIIIlIIIIIlllIllIII);
                for (int j = this.lIIIIlIIIIIlllIllIII.length; j < liiiIlIIIIIlllIllIII2.length; ++j) {
                    liiiIlIIIIIlllIllIII2[j] = llllIIIIlIIIlIlllIll3;
                }
                this.lIIIIlIIIIIlllIllIII = liiiIlIIIIIlllIllIII2;
            }
            this.llllIIIIlIIIlIlllIll = new int[this.lIIIIlIIIIIlllIllIII.length];
            int ilIlIlIlIlllllllllIl = 0;
            for (int k = 0; k < this.lIIIIlIIIIIlllIllIII.length; ++k) {
                if (this.lIIIIlIIIIIlllIllIII[k] < 0) {
                    net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI("Invalid weight: " + this.lIIIIlIIIIIlllIllIII[k]);
                    return false;
                }
                ilIlIlIlIlllllllllIl += this.lIIIIlIIIIIlllIllIII[k];
                this.llllIIIIlIIIlIlllIll[k] = ilIlIlIlIlllllllllIl;
            }
            this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
            if (this.IlIlIlIlIlllllllllIl <= 0) {
                net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI("Invalid sum of all weights: " + ilIlIlIlIlllllllllIl);
                this.IlIlIlIlIlllllllllIl = 1;
            }
        }
        if (this.IIIIlllIIIIIIlIIIlll == net.optifine.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll) {
            net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI("Invalid professions or careers: " + s);
            return false;
        }
        if (this.llllIIllllIlIlIIIIll == net.optifine.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl) {
            net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI("Invalid collar colors: " + s);
            return false;
        }
        return true;
    }
    
    public boolean llllIIIIlIIIlIlllIll(final IlIllllIIlIIlIlIlIll ilIllllIIlIIlIlIlIll) {
        if (this.lIIIlllIIIllIIIllIII != null && !net.optifine.llllIIIIlIIIlIlllIll.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll(ilIllllIIlIIlIlIlIll.llIllIIIIIllIlIIIIlI(), this.lIIIlllIIIllIIIllIII)) {
            return false;
        }
        if (this.llIIlIIIlIIIllIlIIIl != null) {
            final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl = ilIllllIIlIIlIlIlIll.IlIlIlIlIlllllllllIl();
            if (ilIlIlIlIlllllllllIl != null && !this.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII())) {
                return false;
            }
        }
        if (this.llIllIlIIIIllIlIIllI != null) {
            int ilIlIIIllIllIIIIIllI = ilIllllIIlIIlIlIlIll.IlIlIIIllIllIIIIIllI();
            if (this.lIlIlIIIllIIllIIIllI) {
                final int illIIlllIIIIlllIIlIl = ilIllllIIlIIlIlIlIll.IllIIlllIIIIlllIIlIl();
                if (illIIlllIIIIlllIIlIl > 0) {
                    ilIlIIIllIllIIIIIllI = (int)(ilIlIIIllIllIIIIIllI * 100 / (double)illIIlllIIIIlllIIlIl);
                }
            }
            if (!this.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll(ilIlIIIllIllIIIIIllI)) {
                return false;
            }
        }
        if (this.IlIlIIIllIIllIlllllI != null && !this.IlIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll(ilIllllIIlIIlIlIlIll.IlIIIlIlIIIllIlIlIIl())) {
            return false;
        }
        if (this.IIIIlllIIIIIIlIIIlll != null && ilIllllIIlIIlIlIlIll instanceof lllllIIIIIlIlIIIIIIl) {
            final llIllIIIIIllIlIIIIlI llllIIIlIlllIlIIIIIl = ((lllllIIIIIlIlIIIIIIl)ilIllllIIlIIlIlIlIll).llllIIIlIlllIlIIIIIl();
            if (llllIIIlIlllIlIIIIIl instanceof IlIlIllllllllIIIIlII) {
                final IlIlIllllllllIIIIlII ilIlIllllllllIIIIlII = (IlIlIllllllllIIIIlII)llllIIIlIlllIlIIIIIl;
                final int an = ilIlIllllllllIIIIlII.an();
                final int llllIIIIlIIIlIlllIll = net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll(ilIlIllllllllIIIIlII, net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.aS, -1);
                if (an < 0 || llllIIIIlIIIlIlllIll < 0) {
                    return false;
                }
                boolean b = false;
                for (int i = 0; i < this.IIIIlllIIIIIIlIIIlll.length; ++i) {
                    if (this.IIIIlllIIIIIIlIIIlll[i].llllIIIIlIIIlIlllIll(an, llllIIIIlIIIlIlllIll)) {
                        b = true;
                        break;
                    }
                }
                if (!b) {
                    return false;
                }
            }
        }
        if (this.llllIIllllIlIlIIIIll != null && ilIllllIIlIIlIlIlIll instanceof lllllIIIIIlIlIIIIIIl) {
            final llIllIIIIIllIlIIIIlI llllIIIlIlllIlIIIIIl2 = ((lllllIIIIIlIlIIIIIIl)ilIllllIIlIIlIlIlIll).llllIIIlIlllIlIIIIIl();
            if (llllIIIlIlllIlIIIIIl2 instanceof IIIllllllIllIIIlllIl) {
                final IIIllllllIllIIIlllIl iiIllllllIllIIIlllIl = (IIIllllllIllIIIlllIl)llllIIIlIlllIlIIIIIl2;
                if (!iiIllllllIllIIIlllIl.as()) {
                    return false;
                }
                if (!net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(iiIllllllIllIIIlllIl.ay(), this.llllIIllllIlIlIIIIll)) {
                    return false;
                }
            }
        }
        if (this.IlIllIlIlIIIlIlIlIII != null && ilIllllIIlIIlIlIlIll instanceof lllllIIIIIlIlIIIIIIl) {
            final llIllIIIIIllIlIIIIlI llllIIIlIlllIlIIIIIl3 = ((lllllIIIIIlIlIIIIIIl)ilIllllIIlIIlIlIlIll).llllIIIlIlllIlIIIIIl();
            if (llllIIIlIlllIlIIIIIl3 instanceof net.minecraft.llllIIIlIlllIlIIIIIl.IlIllIlIlIIIlIlIlIII && ((net.minecraft.llllIIIlIlllIlIIIIIl.IlIllIlIlIIIlIlIlIII)llllIIIlIlllIlIIIIIl3).e_() != this.IlIllIlIlIIIlIlIlIII) {
                return false;
            }
        }
        if (this.IIlllIIlIllIllIlIIll != null) {
            final net.minecraft.client.IlIlIIIllIllIIIIIllI.llIIlIIIlIIIllIlIIIl illIIlllIIIIlllIIlIl2 = net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.lIIIIlIlIllllIIlIllI().IllIIlllIIIIlllIIlIl;
            if (illIIlllIIIIlllIIlIl2 != null && !this.IIlllIIlIllIllIlIIll.llllIIIIlIIIlIlllIll(illIIlllIIIIlllIIlIl2.IlIlIIIllIIllIlllllI())) {
                return false;
            }
        }
        if (this.lllIIIIlllllIlIIllIl != null) {
            final net.minecraft.client.IlIlIIIllIllIIIIIllI.llIIlIIIlIIIllIlIIIl illIIlllIIIIlllIIlIl3 = net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.lIIIIlIlIllllIIlIllI().IllIIlllIIIIlllIIlIl;
            if (illIIlllIIIIlllIIlIl3 != null && !this.lllIIIIlllllIlIIllIl.llllIIIIlIIIlIlllIll((int)illIIlllIIIIlllIIlIl3.lIllllllIIllIlIlIlII().llllIIIlIlllIlIIIIIl())) {
                return false;
            }
        }
        if (this.IlIlIIIIIIlllIlIllIl != null) {
            final net.minecraft.client.IlIlIIIllIllIIIIIllI.llIIlIIIlIIIllIlIIIl illIIlllIIIIlllIIlIl4 = net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.lIIIIlIlIllllIIlIllI().IllIIlllIIIIlllIIlIl;
            if (illIIlllIIIIlllIIlIl4 != null && !net.optifine.util.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(this.IlIlIIIIIIlllIlIllIl, net.optifine.llllIIIIlIIIlIlllIll.IIlllIIlIllIllIlIIll.llllIIIIlIIIlIlllIll(illIIlllIIIIlllIIlIl4, 0.0f))) {
                return false;
            }
        }
        return true;
    }
    
    public lIllllIllIllIIllllll llllIIIIlIIIlIlllIll(final lIllllIllIllIIllllll lIllllIllIllIIllllll, final int n) {
        if (this.llllIIIlIlllIlIIIIIl != null && this.llllIIIlIlllIlIIIIIl.length != 0) {
            int n2 = 0;
            if (this.lIIIIlIIIIIlllIllIII == null) {
                n2 = n % this.llllIIIlIlllIlIIIIIl.length;
            }
            else {
                final int n3 = n % this.IlIlIlIlIlllllllllIl;
                for (int i = 0; i < this.llllIIIIlIIIlIlllIll.length; ++i) {
                    if (this.llllIIIIlIIIlIlllIll[i] > n3) {
                        n2 = i;
                        break;
                    }
                }
            }
            return this.llllIIIlIlllIlIIIIIl[n2];
        }
        return lIllllIllIllIIllllll;
    }
}
