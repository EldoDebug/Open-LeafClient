package net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI;

import net.minecraft.IlllllllIIIlIIIlIlII.*;
import com.google.common.base.*;
import net.minecraft.lIlIlIIIllIIllIIIllI.*;

public class IlIlIIIlIIlIlIIlllIl
{
    public int llllIIIIlIIIlIlllIll;
    public int IlIlIlIlIlllllllllIl;
    public int llIllIIIIIllIlIIIIlI;
    public int IlIIIlIlIIIllIlIlIIl;
    public int IlIlIIIllIllIIIIIllI;
    public int IllIIlllIIIIlllIIlIl;
    private static volatile /* synthetic */ int[] llllIIIlIlllIlIIIIIl;
    
    public IlIlIIIlIIlIlIIlllIl() {
    }
    
    public IlIlIIIlIIlIlIIlllIl(final int[] array) {
        if (array.length == 6) {
            this.llllIIIIlIIIlIlllIll = array[0];
            this.IlIlIlIlIlllllllllIl = array[1];
            this.llIllIIIIIllIlIIIIlI = array[2];
            this.IlIIIlIlIIIllIlIlIIl = array[3];
            this.IlIlIIIllIllIIIIIllI = array[4];
            this.IllIIlllIIIIlllIIlIl = array[5];
        }
    }
    
    public static IlIlIIIlIIlIlIIlllIl llllIIIIlIIIlIlllIll() {
        return new IlIlIIIlIIlIlIIlllIl(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
    }
    
    public static IlIlIIIlIIlIlIIlllIl llllIIIIlIIIlIlllIll(final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7, final int n8, final int n9, final lllIllIIIllllllIllll lllIllIIIllllllIllll) {
        switch (lIIIIlIIIIIlllIllIII()[lllIllIIIllllllIllll.ordinal()]) {
            case 3: {
                return new IlIlIIIlIIlIlIIlllIl(n + n4, n2 + n5, n3 - n9 + 1 + n6, n + n7 - 1 + n4, n2 + n8 - 1 + n5, n3 + n6);
            }
            case 4: {
                return new IlIlIIIlIIlIlIIlllIl(n + n4, n2 + n5, n3 + n6, n + n7 - 1 + n4, n2 + n8 - 1 + n5, n3 + n9 - 1 + n6);
            }
            case 5: {
                return new IlIlIIIlIIlIlIIlllIl(n - n9 + 1 + n6, n2 + n5, n3 + n4, n + n6, n2 + n8 - 1 + n5, n3 + n7 - 1 + n4);
            }
            case 6: {
                return new IlIlIIIlIIlIlIIlllIl(n + n6, n2 + n5, n3 + n4, n + n9 - 1 + n6, n2 + n8 - 1 + n5, n3 + n7 - 1 + n4);
            }
            default: {
                return new IlIlIIIlIIlIlIIlllIl(n + n4, n2 + n5, n3 + n6, n + n7 - 1 + n4, n2 + n8 - 1 + n5, n3 + n9 - 1 + n6);
            }
        }
    }
    
    public static IlIlIIIlIIlIlIIlllIl llllIIIIlIIIlIlllIll(final int n, final int n2, final int n3, final int n4, final int n5, final int n6) {
        return new IlIlIIIlIIlIlIIlllIl(Math.min(n, n4), Math.min(n2, n5), Math.min(n3, n6), Math.max(n, n4), Math.max(n2, n5), Math.max(n3, n6));
    }
    
    public IlIlIIIlIIlIlIIlllIl(final IlIlIIIlIIlIlIIlllIl ilIlIIIlIIlIlIIlllIl) {
        this.llllIIIIlIIIlIlllIll = ilIlIIIlIIlIlIIlllIl.llllIIIIlIIIlIlllIll;
        this.IlIlIlIlIlllllllllIl = ilIlIIIlIIlIlIIlllIl.IlIlIlIlIlllllllllIl;
        this.llIllIIIIIllIlIIIIlI = ilIlIIIlIIlIlIIlllIl.llIllIIIIIllIlIIIIlI;
        this.IlIIIlIlIIIllIlIlIIl = ilIlIIIlIIlIlIIlllIl.IlIIIlIlIIIllIlIlIIl;
        this.IlIlIIIllIllIIIIIllI = ilIlIIIlIIlIlIIlllIl.IlIlIIIllIllIIIIIllI;
        this.IllIIlllIIIIlllIIlIl = ilIlIIIlIIlIlIIlllIl.IllIIlllIIIIlllIIlIl;
    }
    
    public IlIlIIIlIIlIlIIlllIl(final int llllIIIIlIIIlIlllIll, final int ilIlIlIlIlllllllllIl, final int llIllIIIIIllIlIIIIlI, final int ilIIIlIlIIIllIlIlIIl, final int ilIlIIIllIllIIIIIllI, final int illIIlllIIIIlllIIlIl) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
        this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
        this.IlIIIlIlIIIllIlIlIIl = ilIIIlIlIIIllIlIlIIl;
        this.IlIlIIIllIllIIIIIllI = ilIlIIIllIllIIIIIllI;
        this.IllIIlllIIIIlllIIlIl = illIIlllIIIIlllIIlIl;
    }
    
    public IlIlIIIlIIlIlIIlllIl(final f f, final f f2) {
        this.llllIIIIlIIIlIlllIll = Math.min(f.lIIIIlIIIIIlllIllIII(), f2.lIIIIlIIIIIlllIllIII());
        this.IlIlIlIlIlllllllllIl = Math.min(f.lIIIlllIIIllIIIllIII(), f2.lIIIlllIIIllIIIllIII());
        this.llIllIIIIIllIlIIIIlI = Math.min(f.llIIlIIIlIIIllIlIIIl(), f2.llIIlIIIlIIIllIlIIIl());
        this.IlIIIlIlIIIllIlIlIIl = Math.max(f.lIIIIlIIIIIlllIllIII(), f2.lIIIIlIIIIIlllIllIII());
        this.IlIlIIIllIllIIIIIllI = Math.max(f.lIIIlllIIIllIIIllIII(), f2.lIIIlllIIIllIIIllIII());
        this.IllIIlllIIIIlllIIlIl = Math.max(f.llIIlIIIlIIIllIlIIIl(), f2.llIIlIIIlIIIllIlIIIl());
    }
    
    public IlIlIIIlIIlIlIIlllIl(final int llllIIIIlIIIlIlllIll, final int llIllIIIIIllIlIIIIlI, final int ilIIIlIlIIIllIlIlIIl, final int illIIlllIIIIlllIIlIl) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
        this.IlIIIlIlIIIllIlIlIIl = ilIIIlIlIIIllIlIlIIl;
        this.IllIIlllIIIIlllIIlIl = illIIlllIIIIlllIIlIl;
        this.IlIlIlIlIlllllllllIl = 1;
        this.IlIlIIIllIllIIIIIllI = 512;
    }
    
    public boolean llllIIIIlIIIlIlllIll(final IlIlIIIlIIlIlIIlllIl ilIlIIIlIIlIlIIlllIl) {
        return this.IlIIIlIlIIIllIlIlIIl >= ilIlIIIlIIlIlIIlllIl.llllIIIIlIIIlIlllIll && this.llllIIIIlIIIlIlllIll <= ilIlIIIlIIlIlIIlllIl.IlIIIlIlIIIllIlIlIIl && this.IllIIlllIIIIlllIIlIl >= ilIlIIIlIIlIlIIlllIl.llIllIIIIIllIlIIIIlI && this.llIllIIIIIllIlIIIIlI <= ilIlIIIlIIlIlIIlllIl.IllIIlllIIIIlllIIlIl && this.IlIlIIIllIllIIIIIllI >= ilIlIIIlIIlIlIIlllIl.IlIlIlIlIlllllllllIl && this.IlIlIlIlIlllllllllIl <= ilIlIIIlIIlIlIIlllIl.IlIlIIIllIllIIIIIllI;
    }
    
    public boolean llllIIIIlIIIlIlllIll(final int n, final int n2, final int n3, final int n4) {
        return this.IlIIIlIlIIIllIlIlIIl >= n && this.llllIIIIlIIIlIlllIll <= n3 && this.IllIIlllIIIIlllIIlIl >= n2 && this.llIllIIIIIllIlIIIIlI <= n4;
    }
    
    public void IlIlIlIlIlllllllllIl(final IlIlIIIlIIlIlIIlllIl ilIlIIIlIIlIlIIlllIl) {
        this.llllIIIIlIIIlIlllIll = Math.min(this.llllIIIIlIIIlIlllIll, ilIlIIIlIIlIlIIlllIl.llllIIIIlIIIlIlllIll);
        this.IlIlIlIlIlllllllllIl = Math.min(this.IlIlIlIlIlllllllllIl, ilIlIIIlIIlIlIIlllIl.IlIlIlIlIlllllllllIl);
        this.llIllIIIIIllIlIIIIlI = Math.min(this.llIllIIIIIllIlIIIIlI, ilIlIIIlIIlIlIIlllIl.llIllIIIIIllIlIIIIlI);
        this.IlIIIlIlIIIllIlIlIIl = Math.max(this.IlIIIlIlIIIllIlIlIIl, ilIlIIIlIIlIlIIlllIl.IlIIIlIlIIIllIlIlIIl);
        this.IlIlIIIllIllIIIIIllI = Math.max(this.IlIlIIIllIllIIIIIllI, ilIlIIIlIIlIlIIlllIl.IlIlIIIllIllIIIIIllI);
        this.IllIIlllIIIIlllIIlIl = Math.max(this.IllIIlllIIIIlllIIlIl, ilIlIIIlIIlIlIIlllIl.IllIIlllIIIIlllIIlIl);
    }
    
    public void llllIIIIlIIIlIlllIll(final int n, final int n2, final int n3) {
        this.llllIIIIlIIIlIlllIll += n;
        this.IlIlIlIlIlllllllllIl += n2;
        this.llIllIIIIIllIlIIIIlI += n3;
        this.IlIIIlIlIIIllIlIlIIl += n;
        this.IlIlIIIllIllIIIIIllI += n2;
        this.IllIIlllIIIIlllIIlIl += n3;
    }
    
    public boolean llllIIIIlIIIlIlllIll(final f f) {
        return f.lIIIIlIIIIIlllIllIII() >= this.llllIIIIlIIIlIlllIll && f.lIIIIlIIIIIlllIllIII() <= this.IlIIIlIlIIIllIlIlIIl && f.llIIlIIIlIIIllIlIIIl() >= this.llIllIIIIIllIlIIIIlI && f.llIIlIIIlIIIllIlIIIl() <= this.IllIIlllIIIIlllIIlIl && f.lIIIlllIIIllIIIllIII() >= this.IlIlIlIlIlllllllllIl && f.lIIIlllIIIllIIIllIII() <= this.IlIlIIIllIllIIIIIllI;
    }
    
    public f IlIlIlIlIlllllllllIl() {
        return new f(this.IlIIIlIlIIIllIlIlIIl - this.llllIIIIlIIIlIlllIll, this.IlIlIIIllIllIIIIIllI - this.IlIlIlIlIlllllllllIl, this.IllIIlllIIIIlllIIlIl - this.llIllIIIIIllIlIIIIlI);
    }
    
    public int llIllIIIIIllIlIIIIlI() {
        return this.IlIIIlIlIIIllIlIlIIl - this.llllIIIIlIIIlIlllIll + 1;
    }
    
    public int IlIIIlIlIIIllIlIlIIl() {
        return this.IlIlIIIllIllIIIIIllI - this.IlIlIlIlIlllllllllIl + 1;
    }
    
    public int IlIlIIIllIllIIIIIllI() {
        return this.IllIIlllIIIIlllIIlIl - this.llIllIIIIIllIlIIIIlI + 1;
    }
    
    public f IllIIlllIIIIlllIIlIl() {
        return new IlIlIlIlIlllllllllIl(this.llllIIIIlIIIlIlllIll + (this.IlIIIlIlIIIllIlIlIIl - this.llllIIIIlIIIlIlllIll + 1) / 2, this.IlIlIlIlIlllllllllIl + (this.IlIlIIIllIllIIIIIllI - this.IlIlIlIlIlllllllllIl + 1) / 2, this.llIllIIIIIllIlIIIIlI + (this.IllIIlllIIIIlllIIlIl - this.llIllIIIIIllIlIIIIlI + 1) / 2);
    }
    
    @Override
    public String toString() {
        return Objects.toStringHelper((Object)this).add("x0", this.llllIIIIlIIIlIlllIll).add("y0", this.IlIlIlIlIlllllllllIl).add("z0", this.llIllIIIIIllIlIIIIlI).add("x1", this.IlIIIlIlIIIllIlIlIIl).add("y1", this.IlIlIIIllIllIIIIIllI).add("z1", this.IllIIlllIIIIlllIIlIl).toString();
    }
    
    public IIIlIIIlIlIIlllIIlll llllIIIlIlllIlIIIIIl() {
        return new IIIlIIIlIlIIlllIIlll(new int[] { this.llllIIIIlIIIlIlllIll, this.IlIlIlIlIlllllllllIl, this.llIllIIIIIllIlIIIIlI, this.IlIIIlIlIIIllIlIlIIl, this.IlIlIIIllIllIIIIIllI, this.IllIIlllIIIIlllIIlIl });
    }
    
    static /* synthetic */ int[] lIIIIlIIIIIlllIllIII() {
        final int[] llllIIIlIlllIlIIIIIl = IlIlIIIlIIlIlIIlllIl.llllIIIlIlllIlIIIIIl;
        if (llllIIIlIlllIlIIIIIl != null) {
            return llllIIIlIlllIlIIIIIl;
        }
        final int[] llllIIIlIlllIlIIIIIl2 = new int[lllIllIIIllllllIllll.values().length];
        try {
            llllIIIlIlllIlIIIIIl2[lllIllIIIllllllIllll.llllIIIIlIIIlIlllIll.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            llllIIIlIlllIlIIIIIl2[lllIllIIIllllllIllll.IllIIlllIIIIlllIIlIl.ordinal()] = 6;
        }
        catch (NoSuchFieldError noSuchFieldError2) {}
        try {
            llllIIIlIlllIlIIIIIl2[lllIllIIIllllllIllll.llIllIIIIIllIlIIIIlI.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError3) {}
        try {
            llllIIIlIlllIlIIIIIl2[lllIllIIIllllllIllll.IlIIIlIlIIIllIlIlIIl.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError4) {}
        try {
            llllIIIlIlllIlIIIIIl2[lllIllIIIllllllIllll.IlIlIlIlIlllllllllIl.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError5) {}
        try {
            llllIIIlIlllIlIIIIIl2[lllIllIIIllllllIllll.IlIlIIIllIllIIIIIllI.ordinal()] = 5;
        }
        catch (NoSuchFieldError noSuchFieldError6) {}
        return IlIlIIIlIIlIlIIlllIl.llllIIIlIlllIlIIIIIl = llllIIIlIlllIlIIIIIl2;
    }
}
