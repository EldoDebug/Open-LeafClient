package net.optifine.shaders.llllIIIIlIIIlIlllIll;

import org.lwjgl.util.vector.*;
import net.optifine.util.*;
import net.minecraft.IIllIIllIIIlIlIIIIlI.*;

public class llIllIlIIIIllIlIIllI
{
    private int lIIIlllIIIllIIIllIII;
    private String llIIlIIIlIIIllIlIIIl;
    private String llIllIlIIIIllIlIIllI;
    private String lIlIlIIIllIIllIIIllI;
    public static final int llllIIIIlIIIlIlllIll = 1;
    public static final int IlIlIlIlIlllllllllIl = 2;
    public static final int llIllIIIIIllIlIIIIlI = 3;
    public static final int IlIIIlIlIIIllIlIlIIl = 4;
    public static final int IlIlIIIllIllIIIIIllI = 5;
    public static final int IllIIlllIIIIlllIIlIl = 6;
    public static final int llllIIIlIlllIlIIIIIl = 7;
    public static final int lIIIIlIIIIIlllIllIII = 8;
    
    public llIllIlIIIIllIlIIllI(final int liiIlllIIIllIIIllIII, final String llIIlIIIlIIIllIlIIIl, final String llIllIlIIIIllIlIIllI, final String lIlIlIIIllIIllIIIllI) {
        this.lIIIlllIIIllIIIllIII = liiIlllIIIllIIIllIII;
        this.llIIlIIIlIIIllIlIIIl = llIIlIIIlIIIllIlIIIl;
        this.llIllIlIIIIllIlIIllI = llIllIlIIIIllIlIIllI;
        this.lIlIlIIIllIIllIIIllI = lIlIlIIIllIIllIIIllI;
    }
    
    public int llllIIIIlIIIlIlllIll() {
        return this.lIIIlllIIIllIIIllIII;
    }
    
    public String IlIlIlIlIlllllllllIl() {
        return this.llIIlIIIlIIIllIlIIIl;
    }
    
    public String llIllIIIIIllIlIIIIlI() {
        return this.llIllIlIIIIllIlIIllI;
    }
    
    public boolean IlIIIlIlIIIllIlIlIIl() {
        return this.lIIIlllIIIllIIIllIII == 1;
    }
    
    public boolean llllIIIIlIIIlIlllIll(final String s) {
        return this.IlIIIlIlIIIllIlIlIIl() && s.equals(this.llIIlIIIlIIIllIlIIIl);
    }
    
    public boolean IlIlIIIllIllIIIIIllI() {
        return this.lIIIlllIIIllIIIllIII == 2;
    }
    
    public boolean IlIlIlIlIlllllllllIl(final String s) {
        return this.IlIlIIIllIllIIIIIllI() && s.equals(this.llIIlIIIlIIIllIlIIIl);
    }
    
    public boolean IllIIlllIIIIlllIIlIl() {
        return this.lIIIlllIIIllIIIllIII == 6;
    }
    
    public boolean llllIIIlIlllIlIIIIIl() {
        return this.lIIIlllIIIllIIIllIII == 3;
    }
    
    public boolean lIIIIlIIIIIlllIllIII() {
        return this.lIIIlllIIIllIIIllIII == 4;
    }
    
    public boolean lIIIlllIIIllIIIllIII() {
        return this.lIIIlllIIIllIIIllIII == 5;
    }
    
    public boolean llIIlIIIlIIIllIlIIIl() {
        return this.lIIIlllIIIllIIIllIII == 7;
    }
    
    public boolean llIllIlIIIIllIlIIllI() {
        return this.lIIIlllIIIllIIIllIII == 8;
    }
    
    public boolean llIllIIIIIllIlIIIIlI(final String s) {
        return this.IllIIlllIIIIlllIIlIl() && s.equals(this.llIIlIIIlIIIllIlIIIl);
    }
    
    public boolean llllIIIIlIIIlIlllIll(final String s, final String s2) {
        return this.llIllIIIIIllIlIIIIlI(s) && s2.equals(this.llIllIlIIIIllIlIIllI);
    }
    
    public boolean IlIIIlIlIIIllIlIlIIl(final String s) {
        return this.llllIIIlIlllIlIIIIIl() && s.equals(this.llIIlIIIlIIIllIlIIIl);
    }
    
    public boolean IlIlIIIllIllIIIIIllI(final String s) {
        return this.llllIIIlIlllIlIIIIIl() && this.llIIlIIIlIIIllIlIIIl.endsWith(s);
    }
    
    public boolean IllIIlllIIIIlllIIlIl(final String s) {
        return this.lIIIIlIIIIIlllIllIII() && s.equals(this.llIIlIIIlIIIllIlIIIl);
    }
    
    public boolean llllIIIlIlllIlIIIIIl(final String s) {
        return this.lIIIlllIIIllIIIllIII() && s.equals(this.llIIlIIIlIIIllIlIIIl);
    }
    
    public boolean lIIIIlIIIIIlllIllIII(final String s) {
        return this.llIIlIIIlIIIllIlIIIl() && s.equals(this.llIIlIIIlIIIllIlIIIl);
    }
    
    public boolean lIIIlllIIIllIIIllIII(final String s) {
        return this.lIIIlllIIIllIIIllIII() && this.llIIlIIIlIIIllIlIIIl.endsWith(s);
    }
    
    public boolean llllIIIIlIIIlIlllIll(final String s, final boolean b) {
        return this.lIIIlllIIIllIIIllIII(s) && this.llllIIllllIlIlIIIIll() == b;
    }
    
    public boolean IlIlIlIlIlllllllllIl(final String s, final String s2) {
        return this.llllIIIlIlllIlIIIIIl(s) || this.llllIIIlIlllIlIIIIIl(s2);
    }
    
    public boolean llllIIIIlIIIlIlllIll(final String s, final String s2, final String s3) {
        return this.llllIIIlIlllIlIIIIIl(s) || this.llllIIIlIlllIlIIIIIl(s2) || this.llllIIIlIlllIlIIIIIl(s3);
    }
    
    public boolean IlIlIlIlIlllllllllIl(final String s, final boolean b) {
        return this.llllIIIlIlllIlIIIIIl(s) && this.llllIIllllIlIlIIIIll() == b;
    }
    
    public boolean llllIIIIlIIIlIlllIll(final String s, final String s2, final boolean b) {
        return this.IlIlIlIlIlllllllllIl(s, s2) && this.llllIIllllIlIlIIIIll() == b;
    }
    
    public boolean llllIIIIlIIIlIlllIll(final String s, final String s2, final String s3, final boolean b) {
        return this.llllIIIIlIIIlIlllIll(s, s2, s3) && this.llllIIllllIlIlIIIIll() == b;
    }
    
    public boolean llIIlIIIlIIIllIlIIIl(final String s) {
        return this.llIllIlIIIIllIlIIllI() && this.llIIlIIIlIIIllIlIIIl.endsWith(s);
    }
    
    public int lIlIlIIIllIIllIIIllI() {
        try {
            return Integer.parseInt(this.llIllIlIIIIllIlIIllI);
        }
        catch (NumberFormatException ex) {
            throw new NumberFormatException("Invalid integer: " + this.llIllIlIIIIllIlIIllI + ", line: " + this.lIlIlIIIllIIllIIIllI);
        }
    }
    
    public float IlIlIIIllIIllIlllllI() {
        try {
            return Float.parseFloat(this.llIllIlIIIIllIlIIllI);
        }
        catch (NumberFormatException ex) {
            throw new NumberFormatException("Invalid float: " + this.llIllIlIIIIllIlIIllI + ", line: " + this.lIlIlIIIllIIllIIIllI);
        }
    }
    
    public Vector4f IIIIlllIIIIIIlIIIlll() {
        if (this.llIllIlIIIIllIlIIllI == null) {
            return null;
        }
        final String[] llllIIIIlIIIlIlllIll = net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(IIIllllllIllIIIlllIl.lIIIIlIIIIIlllIllIII(IIIllllllIllIIIlllIl.IlIIIlIlIIIllIlIlIIl(this.llIllIlIIIIllIlIIllI.trim(), "vec4"), " ()"), ", ");
        if (llllIIIIlIIIlIlllIll.length != 4) {
            return null;
        }
        final float[] array = new float[4];
        for (int i = 0; i < llllIIIIlIIIlIlllIll.length; ++i) {
            final float llllIIIIlIIIlIlllIll2 = net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(IIIllllllIllIIIlllIl.llIllIIIIIllIlIIIIlI(llllIIIIlIIIlIlllIll[i], new String[] { "F", "f" }), Float.MAX_VALUE);
            if (llllIIIIlIIIlIlllIll2 == Float.MAX_VALUE) {
                return null;
            }
            array[i] = llllIIIIlIIIlIlllIll2;
        }
        return new Vector4f(array[0], array[1], array[2], array[3]);
    }
    
    public boolean llllIIllllIlIlIIIIll() {
        final String lowerCase = this.llIllIlIIIIllIlIIllI.toLowerCase();
        if (!lowerCase.equals("true") && !lowerCase.equals("false")) {
            throw new RuntimeException("Invalid boolean: " + this.llIllIlIIIIllIlIIllI + ", line: " + this.lIlIlIIIllIIllIIIllI);
        }
        return Boolean.valueOf(this.llIllIlIIIIllIlIIllI);
    }
}
