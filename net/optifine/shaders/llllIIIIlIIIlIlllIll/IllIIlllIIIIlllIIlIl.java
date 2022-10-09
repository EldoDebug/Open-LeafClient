package net.optifine.shaders.llllIIIIlIIIlIlllIll;

import org.apache.commons.lang3.*;
import net.minecraft.IIllIIllIIIlIlIIIIlI.*;
import java.util.*;

public class IllIIlllIIIIlllIIlIl
{
    private int llllIIIIlIIIlIlllIll;
    private String IlIlIlIlIlllllllllIl;
    private String[] llIllIIIIIllIlIIIIlI;
    private String IlIIIlIlIIIllIlIlIIl;
    private String[] IlIlIIIllIllIIIIIllI;
    private int IllIIlllIIIIlllIIlIl;
    
    public IllIIlllIIIIlllIIlIl(final String ilIlIlIlIlllllllllIl, final String[] llIllIIIIIllIlIIIIlI, final String ilIIIlIlIIIllIlIlIIl, final String[] ilIlIIIllIllIIIIIllI, final int n) {
        this.llllIIIIlIIIlIlllIll = 0;
        this.IlIlIlIlIlllllllllIl = null;
        this.llIllIIIIIllIlIIIIlI = null;
        this.IlIIIlIlIIIllIlIlIIl = null;
        this.IlIlIIIllIllIIIIIllI = null;
        this.IllIIlllIIIIlllIIlIl = 0;
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
        this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
        this.IlIIIlIlIIIllIlIlIIl = ilIIIlIlIIIllIlIlIIl;
        this.IlIlIIIllIllIIIIIllI = ilIlIIIllIllIIIIIllI;
        this.llllIIIIlIIIlIlllIll = n;
        if (llIllIIIIIllIlIIIIlI.length != ilIlIIIllIllIIIIIllI.length) {
            throw new IllegalArgumentException("Property and user values have different lengths: " + llIllIIIIIllIlIIIIlI.length + " != " + ilIlIIIllIllIIIIIllI.length);
        }
        if (n >= 0 && n < llIllIIIIIllIlIIIIlI.length) {
            this.IllIIlllIIIIlllIIlIl = n;
            return;
        }
        throw new IllegalArgumentException("Invalid default value: " + n);
    }
    
    public boolean llllIIIIlIIIlIlllIll(final String s) {
        if (s == null) {
            this.IllIIlllIIIIlllIIlIl = this.llllIIIIlIIIlIlllIll;
            return false;
        }
        this.IllIIlllIIIIlllIIlIl = ArrayUtils.indexOf((Object[])this.llIllIIIIIllIlIIIIlI, (Object)s);
        if (this.IllIIlllIIIIlllIIlIl >= 0 && this.IllIIlllIIIIlllIIlIl < this.llIllIIIIIllIlIIIIlI.length) {
            return true;
        }
        this.IllIIlllIIIIlllIIlIl = this.llllIIIIlIIIlIlllIll;
        return false;
    }
    
    public void llllIIIIlIIIlIlllIll(final boolean b) {
        final int illIIlllIIIIlllIIlIl = 0;
        final int illIIlllIIIIlllIIlIl2 = this.llIllIIIIIllIlIIIIlI.length - 1;
        this.IllIIlllIIIIlllIIlIl = net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(this.IllIIlllIIIIlllIIlIl, illIIlllIIIIlllIIlIl, illIIlllIIIIlllIIlIl2);
        if (b) {
            ++this.IllIIlllIIIIlllIIlIl;
            if (this.IllIIlllIIIIlllIIlIl > illIIlllIIIIlllIIlIl2) {
                this.IllIIlllIIIIlllIIlIl = illIIlllIIIIlllIIlIl;
            }
        }
        else {
            --this.IllIIlllIIIIlllIIlIl;
            if (this.IllIIlllIIIIlllIIlIl < illIIlllIIIIlllIIlIl) {
                this.IllIIlllIIIIlllIIlIl = illIIlllIIIIlllIIlIl2;
            }
        }
    }
    
    public void llllIIIIlIIIlIlllIll(final int illIIlllIIIIlllIIlIl) {
        this.IllIIlllIIIIlllIIlIl = illIIlllIIIIlllIIlIl;
        if (this.IllIIlllIIIIlllIIlIl < 0 || this.IllIIlllIIIIlllIIlIl >= this.llIllIIIIIllIlIIIIlI.length) {
            this.IllIIlllIIIIlllIIlIl = this.llllIIIIlIIIlIlllIll;
        }
    }
    
    public int llllIIIIlIIIlIlllIll() {
        return this.IllIIlllIIIIlllIIlIl;
    }
    
    public String IlIlIlIlIlllllllllIl() {
        return this.IlIlIIIllIllIIIIIllI[this.IllIIlllIIIIlllIIlIl];
    }
    
    public String llIllIIIIIllIlIIIIlI() {
        return this.llIllIIIIIllIlIIIIlI[this.IllIIlllIIIIlllIIlIl];
    }
    
    public String IlIIIlIlIIIllIlIlIIl() {
        return this.IlIIIlIlIIIllIlIlIIl;
    }
    
    public String IlIlIIIllIllIIIIIllI() {
        return this.IlIlIlIlIlllllllllIl;
    }
    
    public void IllIIlllIIIIlllIIlIl() {
        this.IllIIlllIIIIlllIIlIl = this.llllIIIIlIIIlIlllIll;
    }
    
    public boolean llllIIIIlIIIlIlllIll(final Properties properties) {
        this.IllIIlllIIIIlllIIlIl();
        if (properties == null) {
            return false;
        }
        final String property = properties.getProperty(this.IlIlIlIlIlllllllllIl);
        return property != null && this.llllIIIIlIIIlIlllIll(property);
    }
    
    public void IlIlIlIlIlllllllllIl(final Properties properties) {
        if (properties != null) {
            properties.setProperty(this.IlIlIIIllIllIIIIIllI(), this.llIllIIIIIllIlIIIIlI());
        }
    }
    
    @Override
    public String toString() {
        return this.IlIlIlIlIlllllllllIl + "=" + this.llIllIIIIIllIlIIIIlI() + " [" + net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(this.llIllIIIIIllIlIIIIlI) + "], value: " + this.IllIIlllIIIIlllIIlIl;
    }
}
