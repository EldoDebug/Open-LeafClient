package net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI;

import com.google.common.collect.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIIIllIllIIIIIllI.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import java.util.*;

public class IllIlIIllIllIIlIllII extends IIIIlllIIIIIIlIIIlll
{
    private int IllIIlllIIIIlllIIlIl;
    private int llllIIIlIlllIlIIIIIl;
    public static final List IlIlIIIllIllIIIIIllI;
    private static final List lIIIIlIIIIIlllIllIII;
    
    static {
        IlIlIIIllIllIIIIIllI = Arrays.asList(llIIlIIIlIIIllIlIIIl.IlIllIlIlIIIlIlIlIII, llIIlIIIlIIIllIlIIIl.IlllIIIIlIIIlIlIlIIl, llIIlIIIlIIIllIlIIIl.IlllllllIIIlIIIlIlII, llIIlIIIlIIIllIlIIIl.IlIlIllllllllIIIIlII, llIIlIIIlIIIllIlIIIl.IIlllIlIIllIlIlIlIIl);
        (lIIIIlIIIIIlllIllIII = Lists.newArrayList()).add(new lIlIlIIIllIIllIIIllI(lllIIIIlllllIlIIllIl.class, 1, 2, 4));
    }
    
    public IllIlIIllIllIIlIllII() {
        this.IllIIlllIIIIlllIIlIl = 32;
        this.llllIIIlIlllIlIIIIIl = 5;
    }
    
    public IllIlIIllIllIIlIllII(final Map map) {
        this();
        for (final Map.Entry<String, V> entry : map.entrySet()) {
            if (entry.getKey().equals("spacing")) {
                this.IllIIlllIIIIlllIIlIl = llIllIIlllllllllllll.llllIIIIlIIIlIlllIll((String)entry.getValue(), this.IllIIlllIIIIlllIIlIl, 1);
            }
            else {
                if (!entry.getKey().equals("separation")) {
                    continue;
                }
                this.llllIIIlIlllIlIIIIIl = llIllIIlllllllllllll.llllIIIIlIIIlIlllIll((String)entry.getValue(), this.llllIIIlIlllIlIIIIIl, 1);
            }
        }
    }
    
    @Override
    public String llllIIIIlIIIlIlllIll() {
        return "Monument";
    }
    
    @Override
    protected boolean llllIIIIlIIIlIlllIll(int n, int n2) {
        final int n3 = n;
        final int n4 = n2;
        if (n < 0) {
            n -= this.IllIIlllIIIIlllIIlIl - 1;
        }
        if (n2 < 0) {
            n2 -= this.IllIIlllIIIIlllIIlIl - 1;
        }
        final int n5 = n / this.IllIIlllIIIIlllIIlIl;
        final int n6 = n2 / this.IllIIlllIIIIlllIIlIl;
        final Random ilIlIlIlIlllllllllIl = this.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(n5, n6, 10387313);
        final int n7 = n5 * this.IllIIlllIIIIlllIIlIl;
        final int n8 = n6 * this.IllIIlllIIIIlllIIlIl;
        final int n9 = n7 + (ilIlIlIlIlllllllllIl.nextInt(this.IllIIlllIIIIlllIIlIl - this.llllIIIlIlllIlIIIIIl) + ilIlIlIlIlllllllllIl.nextInt(this.IllIIlllIIIIlllIIlIl - this.llllIIIlIlllIlIIIIIl)) / 2;
        final int n10 = n8 + (ilIlIlIlIlllllllllIl.nextInt(this.IllIIlllIIIIlllIIlIl - this.llllIIIlIlllIlIIIIIl) + ilIlIlIlIlllllllllIl.nextInt(this.IllIIlllIIIIlllIIlIl - this.llllIIIlIlllIlIIIIIl)) / 2;
        if (n3 == n9 && n4 == n10) {
            if (this.llIllIIIIIllIlIIIIlI.llIIlIIIlIIIllIlIIIl().llllIIIIlIIIlIlllIll(new IlIlIlIlIlllllllllIl(n3 * 16 + 8, 64, n4 * 16 + 8), null) != llIIlIIIlIIIllIlIIIl.IlllIIIIlIIIlIlIlIIl) {
                return false;
            }
            if (this.llIllIIIIIllIlIIIIlI.llIIlIIIlIIIllIlIIIl().llllIIIIlIIIlIlllIll(n3 * 16 + 8, n4 * 16 + 8, 29, IllIlIIllIllIIlIllII.IlIlIIIllIllIIIIIllI)) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    protected IlIIIIIlIIllIIlIlIll IlIlIlIlIlllllllllIl(final int n, final int n2) {
        return new lIIlIIIlIllIlIllIIIl(this.llIllIIIIIllIlIIIIlI, this.IlIlIlIlIlllllllllIl, n, n2);
    }
    
    public List llIllIIIIIllIlIIIIlI() {
        return IllIlIIllIllIIlIllII.lIIIIlIIIIIlllIllIII;
    }
}
