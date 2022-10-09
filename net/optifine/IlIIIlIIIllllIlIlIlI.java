package net.optifine;

import net.minecraft.IlllllllIIIlIIIlIlII.*;
import java.util.*;
import net.optifine.llllIIIIlIIIlIlllIll.*;

public class IlIIIlIIIllllIlIlIlI
{
    private String llllIIIIlIIIlIlllIll;
    private lIllllIllIllIIllllll[] IlIlIlIlIlllllllllIl;
    private int llIllIIIIIllIlIIIIlI;
    private int IlIIIlIlIIIllIlIlIIl;
    private int IlIlIIIllIllIIIIIllI;
    private int IllIIlllIIIIlllIIlIl;
    private int llllIIIlIlllIlIIIIIl;
    private int lIIIIlIIIIIlllIllIII;
    private int lIIIlllIIIllIIIllIII;
    private int llIIlIIIlIIIllIlIIIl;
    
    public IlIIIlIIIllllIlIlIlI(final String llllIIIIlIIIlIlllIll, final Properties properties) {
        this.llIllIIIIIllIlIIIIlI = 1;
        this.IlIIIlIlIIIllIlIlIIl = 64;
        this.IlIlIIIllIllIIIIIllI = 3;
        this.IllIIlllIIIIlllIIlIl = 3;
        this.llllIIIlIlllIlIIIIIl = -2130706433;
        this.lIIIIlIIIIIlllIllIII = 16777215;
        this.lIIIlllIIIllIIIllIII = 0;
        this.llIIlIIIlIIIllIlIIIl = Integer.MIN_VALUE;
        final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll2 = new llllIIIIlIIIlIlllIll("CustomPanorama");
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.IlIlIlIlIlllllllllIl = new lIllllIllIllIIllllll[6];
        for (int i = 0; i < this.IlIlIlIlIlllllllllIl.length; ++i) {
            this.IlIlIlIlIlllllllllIl[i] = new lIllllIllIllIIllllll(String.valueOf(llllIIIIlIIIlIlllIll) + "/panorama_" + i + ".png");
        }
        this.llIllIIIIIllIlIIIIlI = llllIIIIlIIIlIlllIll2.llllIIIIlIIIlIlllIll(properties.getProperty("weight"), 1);
        this.IlIIIlIlIIIllIlIlIIl = llllIIIIlIIIlIlllIll2.llllIIIIlIIIlIlllIll(properties.getProperty("blur1"), 64);
        this.IlIlIIIllIllIIIIIllI = llllIIIIlIIIlIlllIll2.llllIIIIlIIIlIlllIll(properties.getProperty("blur2"), 3);
        this.IllIIlllIIIIlllIIlIl = llllIIIIlIIIlIlllIll2.llllIIIIlIIIlIlllIll(properties.getProperty("blur3"), 3);
        this.llllIIIlIlllIlIIIIIl = net.optifine.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI(properties.getProperty("overlay1.top"), -2130706433);
        this.lIIIIlIIIIIlllIllIII = net.optifine.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI(properties.getProperty("overlay1.bottom"), 16777215);
        this.lIIIlllIIIllIIIllIII = net.optifine.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI(properties.getProperty("overlay2.top"), 0);
        this.llIIlIIIlIIIllIlIIIl = net.optifine.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI(properties.getProperty("overlay2.bottom"), Integer.MIN_VALUE);
    }
    
    public lIllllIllIllIIllllll[] llllIIIIlIIIlIlllIll() {
        return this.IlIlIlIlIlllllllllIl;
    }
    
    public int IlIlIlIlIlllllllllIl() {
        return this.llIllIIIIIllIlIIIIlI;
    }
    
    public int llIllIIIIIllIlIIIIlI() {
        return this.IlIIIlIlIIIllIlIlIIl;
    }
    
    public int IlIIIlIlIIIllIlIlIIl() {
        return this.IlIlIIIllIllIIIIIllI;
    }
    
    public int IlIlIIIllIllIIIIIllI() {
        return this.IllIIlllIIIIlllIIlIl;
    }
    
    public int IllIIlllIIIIlllIIlIl() {
        return this.llllIIIlIlllIlIIIIIl;
    }
    
    public int llllIIIlIlllIlIIIIIl() {
        return this.lIIIIlIIIIIlllIllIII;
    }
    
    public int lIIIIlIIIIIlllIllIII() {
        return this.lIIIlllIIIllIIIllIII;
    }
    
    public int lIIIlllIIIllIIIllIII() {
        return this.llIIlIIIlIIIllIlIIIl;
    }
    
    @Override
    public String toString() {
        return this.llllIIIIlIIIlIlllIll + ", weight: " + this.llIllIIIIIllIlIIIIlI + ", blur: " + this.IlIIIlIlIIIllIlIlIIl + " " + this.IlIlIIIllIllIIIIIllI + " " + this.IllIIlllIIIIlllIIlIl + ", overlay: " + this.llllIIIlIlllIlIIIIIl + " " + this.lIIIIlIIIIIlllIllIII + " " + this.lIIIlllIIIllIIIllIII + " " + this.llIIlIIIlIIIllIlIIIl;
    }
}
