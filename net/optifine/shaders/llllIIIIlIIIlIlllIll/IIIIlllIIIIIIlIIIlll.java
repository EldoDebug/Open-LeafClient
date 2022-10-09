package net.optifine.shaders.llllIIIIlIIIlIlllIll;

import net.minecraft.IIllIIllIIIlIlIIIIlI.*;
import net.optifine.util.*;
import net.optifine.shaders.*;
import java.util.*;

public abstract class IIIIlllIIIIIIlIIIlll
{
    private String IlIIIlIlIIIllIlIlIIl;
    private String IlIlIIIllIllIIIIIllI;
    private String IllIIlllIIIIlllIIlIl;
    private String[] llllIIIlIlllIlIIIIIl;
    private String lIIIIlIIIIIlllIllIII;
    private String[] lIIIlllIIIllIIIllIII;
    private boolean llIIlIIIlIIIllIlIIIl;
    private boolean llIllIlIIIIllIlIIllI;
    public static final String llllIIIIlIIIlIlllIll = "Åòa";
    public static final String IlIlIlIlIlllllllllIl = "Åòc";
    public static final String llIllIIIIIllIlIIIIlI = "Åò9";
    
    public IIIIlllIIIIIIlIIIlll(final String ilIIIlIlIIIllIlIlIIl, final String ilIlIIIllIllIIIIIllI, final String illIIlllIIIIlllIIlIl, final String[] llllIIIlIlllIlIIIIIl, final String liiiIlIIIIIlllIllIII, final String s) {
        this.IlIIIlIlIIIllIlIlIIl = null;
        this.IlIlIIIllIllIIIIIllI = null;
        this.IllIIlllIIIIlllIIlIl = null;
        this.llllIIIlIlllIlIIIIIl = null;
        this.lIIIIlIIIIIlllIllIII = null;
        this.lIIIlllIIIllIIIllIII = null;
        this.llIIlIIIlIIIllIlIIIl = true;
        this.llIllIlIIIIllIlIIllI = true;
        this.IlIIIlIlIIIllIlIlIIl = ilIIIlIlIIIllIlIlIIl;
        this.IlIlIIIllIllIIIIIllI = ilIlIIIllIllIIIIIllI;
        this.IllIIlllIIIIlllIIlIl = illIIlllIIIIlllIIlIl;
        this.llllIIIlIlllIlIIIIIl = llllIIIlIlllIlIIIIIl;
        this.lIIIIlIIIIIlllIllIII = liiiIlIIIIIlllIllIII;
        if (s != null) {
            this.lIIIlllIIIllIIIllIII = new String[] { s };
        }
    }
    
    public String llllIIIIlIIIlIlllIll() {
        return this.IlIIIlIlIIIllIlIlIIl;
    }
    
    public String IlIlIlIlIlllllllllIl() {
        return this.IlIlIIIllIllIIIIIllI;
    }
    
    public String llIllIIIIIllIlIIIIlI() {
        return llIIlllIIlllIIllIllI.IlIlIlIlIlllllllllIl("option." + this.llllIIIIlIIIlIlllIll() + ".comment", IIIllllllIllIIIlllIl.IlIIIlIlIIIllIlIlIIl(net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII(this.IlIlIIIllIllIIIIIllI), "//"));
    }
    
    public void llllIIIIlIIIlIlllIll(final String ilIlIIIllIllIIIIIllI) {
        this.IlIlIIIllIllIIIIIllI = ilIlIIIllIllIIIIIllI;
    }
    
    public String IlIIIlIlIIIllIlIlIIl() {
        return this.IllIIlllIIIIlllIIlIl;
    }
    
    public boolean IlIlIlIlIlllllllllIl(final String illIIlllIIIIlllIIlIl) {
        if (llllIIIIlIIIlIlllIll(illIIlllIIIIlllIIlIl, this.llllIIIlIlllIlIIIIIl) < 0) {
            return false;
        }
        this.IllIIlllIIIIlllIIlIl = illIIlllIIIIlllIIlIl;
        return true;
    }
    
    public String IlIlIIIllIllIIIIIllI() {
        return this.lIIIIlIIIIIlllIllIII;
    }
    
    public void IllIIlllIIIIlllIIlIl() {
        this.IllIIlllIIIIlllIIlIl = this.lIIIIlIIIIIlllIllIII;
    }
    
    public void llllIIIlIlllIlIIIIIl() {
        final int llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll(this.IllIIlllIIIIlllIIlIl, this.llllIIIlIlllIlIIIIIl);
        if (llllIIIIlIIIlIlllIll >= 0) {
            this.IllIIlllIIIIlllIIlIl = this.llllIIIlIlllIlIIIIIl[(llllIIIIlIIIlIlllIll + 1) % this.llllIIIlIlllIlIIIIIl.length];
        }
    }
    
    public void lIIIIlIIIIIlllIllIII() {
        final int llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll(this.IllIIlllIIIIlllIIlIl, this.llllIIIlIlllIlIIIIIl);
        if (llllIIIIlIIIlIlllIll >= 0) {
            this.IllIIlllIIIIlllIIlIl = this.llllIIIlIlllIlIIIIIl[(llllIIIIlIIIlIlllIll - 1 + this.llllIIIlIlllIlIIIIIl.length) % this.llllIIIlIlllIlIIIIIl.length];
        }
    }
    
    private static int llllIIIIlIIIlIlllIll(final String s, final String[] array) {
        for (int i = 0; i < array.length; ++i) {
            if (array[i].equals(s)) {
                return i;
            }
        }
        return -1;
    }
    
    public String[] lIIIlllIIIllIIIllIII() {
        return this.lIIIlllIIIllIIIllIII;
    }
    
    public void llllIIIIlIIIlIlllIll(final String[] array) {
        final List<String> list = Arrays.asList(this.lIIIlllIIIllIIIllIII);
        for (int i = 0; i < array.length; ++i) {
            final String s = array[i];
            if (!list.contains(s)) {
                this.lIIIlllIIIllIIIllIII = (String[])net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(this.lIIIlllIIIllIIIllIII, (Object)s);
            }
        }
    }
    
    public boolean llIIlIIIlIIIllIlIIIl() {
        return this.llIIlIIIlIIIllIlIIIl;
    }
    
    public void llllIIIIlIIIlIlllIll(final boolean llIIlIIIlIIIllIlIIIl) {
        this.llIIlIIIlIIIllIlIIIl = llIIlIIIlIIIllIlIIIl;
    }
    
    public boolean llIllIlIIIIllIlIIllI() {
        return !net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(this.IllIIlllIIIIlllIIlIl, (Object)this.lIIIIlIIIIIlllIllIII);
    }
    
    public boolean lIlIlIIIllIIllIIIllI() {
        return this.llIllIlIIIIllIlIIllI;
    }
    
    public void IlIlIlIlIlllllllllIl(final boolean llIllIlIIIIllIlIIllI) {
        this.llIllIlIIIIllIlIIllI = llIllIlIIIIllIlIIllI;
    }
    
    public boolean llIllIIIIIllIlIIIIlI(final String s) {
        return llllIIIIlIIIlIlllIll(s, this.llllIIIlIlllIlIIIIIl) >= 0;
    }
    
    public String IlIlIIIllIIllIlllllI() {
        return llIIlllIIlllIIllIllI.IlIlIlIlIlllllllllIl("option." + this.IlIIIlIlIIIllIlIlIIl, this.IlIIIlIlIIIllIlIlIIl);
    }
    
    public String IlIIIlIlIIIllIlIlIIl(final String s) {
        return llIIlllIIlllIIllIllI.IlIlIlIlIlllllllllIl("value." + this.IlIIIlIlIIIllIlIlIIl + "." + s, s);
    }
    
    public String IlIlIIIllIllIIIIIllI(final String s) {
        return "";
    }
    
    public boolean IllIIlllIIIIlllIIlIl(final String s) {
        return false;
    }
    
    public boolean IIIIlllIIIIIIlIIIlll() {
        return false;
    }
    
    public boolean llllIIIlIlllIlIIIIIl(final String s) {
        return false;
    }
    
    public String llllIIllllIlIlIIIIll() {
        return null;
    }
    
    public String[] IlIllIlIlIIIlIlIlIII() {
        return this.llllIIIlIlllIlIIIIIl.clone();
    }
    
    public float IIlllIIlIllIllIlIIll() {
        if (this.llllIIIlIlllIlIIIIIl.length <= 1) {
            return 0.0f;
        }
        final int llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll(this.IllIIlllIIIIlllIIlIl, this.llllIIIlIlllIlIIIIIl);
        if (llllIIIIlIIIlIlllIll < 0) {
            return 0.0f;
        }
        return 1.0f * llllIIIIlIIIlIlllIll / (this.llllIIIlIlllIlIIIIIl.length - 1.0f);
    }
    
    public void llllIIIIlIIIlIlllIll(float llllIIIIlIIIlIlllIll) {
        if (this.llllIIIlIlllIlIIIIIl.length > 1) {
            llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll, 0.0f, 1.0f);
            this.IllIIlllIIIIlllIIlIl = this.llllIIIlIlllIlIIIIIl[Math.round(llllIIIIlIIIlIlllIll * (this.llllIIIlIlllIlIIIIIl.length - 1))];
        }
    }
    
    @Override
    public String toString() {
        return this.IlIIIlIlIIIllIlIlIIl + ", value: " + this.IllIIlllIIIIlllIIlIl + ", valueDefault: " + this.lIIIIlIIIIIlllIllIII + ", paths: " + net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(this.lIIIlllIIIllIIIllIII);
    }
}
