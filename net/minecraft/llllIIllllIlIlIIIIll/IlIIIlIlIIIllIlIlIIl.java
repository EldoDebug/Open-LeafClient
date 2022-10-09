package net.minecraft.llllIIllllIlIlIIIIll;

import org.apache.logging.log4j.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.lIlIlIIIllIIllIIIllI.*;

public class IlIIIlIlIIIllIlIlIIl
{
    private static final Logger llllIIIIlIIIlIlllIll;
    private int IlIlIlIlIlllllllllIl;
    private int llIllIIIIIllIlIIIIlI;
    private int IlIIIlIlIIIllIlIlIIl;
    private boolean IlIlIIIllIllIIIIIllI;
    private boolean IllIIlllIIIIlllIIlIl;
    private boolean llllIIIlIlllIlIIIIIl;
    private boolean lIIIIlIIIIIlllIllIII;
    
    static {
        llllIIIIlIIIlIlllIll = LogManager.getLogger();
    }
    
    public IlIIIlIlIIIllIlIlIIl(final int n, final int n2) {
        this(n, n2, 0);
    }
    
    public IlIIIlIlIIIllIlIlIIl(final int n, final int n2, final int n3) {
        this(n, n2, n3, false, true);
    }
    
    public IlIIIlIlIIIllIlIlIIl(final int ilIlIlIlIlllllllllIl, final int llIllIIIIIllIlIIIIlI, final int ilIIIlIlIIIllIlIlIIl, final boolean illIIlllIIIIlllIIlIl, final boolean liiiIlIIIIIlllIllIII) {
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
        this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
        this.IlIIIlIlIIIllIlIlIIl = ilIIIlIlIIIllIlIlIIl;
        this.IllIIlllIIIIlllIIlIl = illIIlllIIIIlllIIlIl;
        this.lIIIIlIIIIIlllIllIII = liiiIlIIIIIlllIllIII;
    }
    
    public IlIIIlIlIIIllIlIlIIl(final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl) {
        this.IlIlIlIlIlllllllllIl = ilIIIlIlIIIllIlIlIIl.IlIlIlIlIlllllllllIl;
        this.llIllIIIIIllIlIIIIlI = ilIIIlIlIIIllIlIlIIl.llIllIIIIIllIlIIIIlI;
        this.IlIIIlIlIIIllIlIlIIl = ilIIIlIlIIIllIlIlIIl.IlIIIlIlIIIllIlIlIIl;
        this.IllIIlllIIIIlllIIlIl = ilIIIlIlIIIllIlIlIIl.IllIIlllIIIIlllIIlIl;
        this.lIIIIlIIIIIlllIllIII = ilIIIlIlIIIllIlIlIIl.lIIIIlIIIIIlllIllIII;
    }
    
    public void llllIIIIlIIIlIlllIll(final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl) {
        if (this.IlIlIlIlIlllllllllIl != ilIIIlIlIIIllIlIlIIl.IlIlIlIlIlllllllllIl) {
            net.minecraft.llllIIllllIlIlIIIIll.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll.warn("This method should only be called for matching effects!");
        }
        if (ilIIIlIlIIIllIlIlIIl.IlIIIlIlIIIllIlIlIIl > this.IlIIIlIlIIIllIlIlIIl) {
            this.IlIIIlIlIIIllIlIlIIl = ilIIIlIlIIIllIlIlIIl.IlIIIlIlIIIllIlIlIIl;
            this.llIllIIIIIllIlIIIIlI = ilIIIlIlIIIllIlIlIIl.llIllIIIIIllIlIIIIlI;
        }
        else if (ilIIIlIlIIIllIlIlIIl.IlIIIlIlIIIllIlIlIIl == this.IlIIIlIlIIIllIlIlIIl && this.llIllIIIIIllIlIIIIlI < ilIIIlIlIIIllIlIlIIl.llIllIIIIIllIlIIIIlI) {
            this.llIllIIIIIllIlIIIIlI = ilIIIlIlIIIllIlIlIIl.llIllIIIIIllIlIIIIlI;
        }
        else if (!ilIIIlIlIIIllIlIlIIl.IllIIlllIIIIlllIIlIl && this.IllIIlllIIIIlllIIlIl) {
            this.IllIIlllIIIIlllIIlIl = ilIIIlIlIIIllIlIlIIl.IllIIlllIIIIlllIIlIl;
        }
        this.lIIIIlIIIIIlllIllIII = ilIIIlIlIIIllIlIlIIl.lIIIIlIIIIIlllIllIII;
    }
    
    public int llllIIIIlIIIlIlllIll() {
        return this.IlIlIlIlIlllllllllIl;
    }
    
    public int IlIlIlIlIlllllllllIl() {
        return this.llIllIIIIIllIlIIIIlI;
    }
    
    public int llIllIIIIIllIlIIIIlI() {
        return this.IlIIIlIlIIIllIlIlIIl;
    }
    
    public void llllIIIIlIIIlIlllIll(final boolean ilIlIIIllIllIIIIIllI) {
        this.IlIlIIIllIllIIIIIllI = ilIlIIIllIllIIIIIllI;
    }
    
    public boolean IlIIIlIlIIIllIlIlIIl() {
        return this.IllIIlllIIIIlllIIlIl;
    }
    
    public boolean IlIlIIIllIllIIIIIllI() {
        return this.lIIIIlIIIIIlllIllIII;
    }
    
    public boolean llllIIIIlIIIlIlllIll(final lllIIIIlllllIlIIllIl lllIIIIlllllIlIIllIl) {
        if (this.llIllIIIIIllIlIIIIlI > 0) {
            if (net.minecraft.llllIIllllIlIlIIIIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll[this.IlIlIlIlIlllllllllIl].IlIlIlIlIlllllllllIl(this.llIllIIIIIllIlIIIIlI, this.IlIIIlIlIIIllIlIlIIl)) {
                this.IlIlIlIlIlllllllllIl(lllIIIIlllllIlIIllIl);
            }
            this.lIIIIlIIIIIlllIllIII();
        }
        return this.llIllIIIIIllIlIIIIlI > 0;
    }
    
    private int lIIIIlIIIIIlllIllIII() {
        return --this.llIllIIIIIllIlIIIIlI;
    }
    
    public void IlIlIlIlIlllllllllIl(final lllIIIIlllllIlIIllIl lllIIIIlllllIlIIllIl) {
        if (this.llIllIIIIIllIlIIIIlI > 0) {
            net.minecraft.llllIIllllIlIlIIIIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll[this.IlIlIlIlIlllllllllIl].llllIIIIlIIIlIlllIll(lllIIIIlllllIlIIllIl, this.IlIIIlIlIIIllIlIlIIl);
        }
    }
    
    public String IllIIlllIIIIlllIIlIl() {
        return net.minecraft.llllIIllllIlIlIIIIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll[this.IlIlIlIlIlllllllllIl].IlIIIlIlIIIllIlIlIIl();
    }
    
    @Override
    public int hashCode() {
        return this.IlIlIlIlIlllllllllIl;
    }
    
    @Override
    public String toString() {
        String s;
        if (this.llIllIIIIIllIlIIIIlI() > 0) {
            s = String.valueOf(this.IllIIlllIIIIlllIIlIl()) + " x " + (this.llIllIIIIIllIlIIIIlI() + 1) + ", Duration: " + this.IlIlIlIlIlllllllllIl();
        }
        else {
            s = String.valueOf(this.IllIIlllIIIIlllIIlIl()) + ", Duration: " + this.IlIlIlIlIlllllllllIl();
        }
        if (this.IlIlIIIllIllIIIIIllI) {
            s = String.valueOf(s) + ", Splash: true";
        }
        if (!this.lIIIIlIIIIIlllIllIII) {
            s = String.valueOf(s) + ", Particles: false";
        }
        return net.minecraft.llllIIllllIlIlIIIIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll[this.IlIlIlIlIlllllllllIl].lIIIlllIIIllIIIllIII() ? ("(" + s + ")") : s;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (!(o instanceof IlIIIlIlIIIllIlIlIIl)) {
            return false;
        }
        final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl = (IlIIIlIlIIIllIlIlIIl)o;
        return this.IlIlIlIlIlllllllllIl == ilIIIlIlIIIllIlIlIIl.IlIlIlIlIlllllllllIl && this.IlIIIlIlIIIllIlIlIIl == ilIIIlIlIIIllIlIlIIl.IlIIIlIlIIIllIlIlIIl && this.llIllIIIIIllIlIIIIlI == ilIIIlIlIIIllIlIlIIl.llIllIIIIIllIlIIIIlI && this.IlIlIIIllIllIIIIIllI == ilIIIlIlIIIllIlIlIIl.IlIlIIIllIllIIIIIllI && this.IllIIlllIIIIlllIIlIl == ilIIIlIlIIIllIlIlIIl.IllIIlllIIIIlllIIlIl;
    }
    
    public IIIIlllIIIIIIlIIIlll llllIIIIlIIIlIlllIll(final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll) {
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("Id", (byte)this.llllIIIIlIIIlIlllIll());
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("Amplifier", (byte)this.llIllIIIIIllIlIIIIlI());
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("Duration", this.IlIlIlIlIlllllllllIl());
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("Ambient", this.IlIIIlIlIIIllIlIlIIl());
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("ShowParticles", this.IlIlIIIllIllIIIIIllI());
        return iiiIlllIIIIIIlIIIlll;
    }
    
    public static IlIIIlIlIIIllIlIlIIl IlIlIlIlIlllllllllIl(final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll) {
        final byte ilIIIlIlIIIllIlIlIIl = iiiIlllIIIIIIlIIIlll.IlIIIlIlIIIllIlIlIIl("Id");
        if (ilIIIlIlIIIllIlIlIIl >= 0 && ilIIIlIlIIIllIlIlIIl < net.minecraft.llllIIllllIlIlIIIIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.length && net.minecraft.llllIIllllIlIlIIIIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll[ilIIIlIlIIIllIlIlIIl] != null) {
            final byte ilIIIlIlIIIllIlIlIIl2 = iiiIlllIIIIIIlIIIlll.IlIIIlIlIIIllIlIlIIl("Amplifier");
            final int illIIlllIIIIlllIIlIl = iiiIlllIIIIIIlIIIlll.IllIIlllIIIIlllIIlIl("Duration");
            final boolean iiiIlllIIIIIIlIIIlll2 = iiiIlllIIIIIIlIIIlll.IIIIlllIIIIIIlIIIlll("Ambient");
            boolean iiiIlllIIIIIIlIIIlll3 = true;
            if (iiiIlllIIIIIIlIIIlll.IlIlIlIlIlllllllllIl("ShowParticles", 1)) {
                iiiIlllIIIIIIlIIIlll3 = iiiIlllIIIIIIlIIIlll.IIIIlllIIIIIIlIIIlll("ShowParticles");
            }
            return new IlIIIlIlIIIllIlIlIIl(ilIIIlIlIIIllIlIlIIl, illIIlllIIIIlllIIlIl, ilIIIlIlIIIllIlIlIIl2, iiiIlllIIIIIIlIIIlll2, iiiIlllIIIIIIlIIIlll3);
        }
        return null;
    }
    
    public void IlIlIlIlIlllllllllIl(final boolean llllIIIlIlllIlIIIIIl) {
        this.llllIIIlIlllIlIIIIIl = llllIIIlIlllIlIIIIIl;
    }
    
    public boolean llllIIIlIlllIlIIIIIl() {
        return this.llllIIIlIlllIlIIIIIl;
    }
}
