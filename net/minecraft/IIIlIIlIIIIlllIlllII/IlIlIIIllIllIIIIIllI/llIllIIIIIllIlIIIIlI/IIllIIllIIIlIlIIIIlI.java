package net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI;

import net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import java.util.*;

public class IIllIIllIIIlIlIIIIlI extends IIIIlllIIIIIIlIIIlll
{
    public static final List IlIlIIIllIllIIIIIllI;
    private int IllIIlllIIIIlllIIlIl;
    private int llllIIIlIlllIlIIIIIl;
    private int lIIIIlIIIIIlllIllIII;
    
    static {
        IlIlIIIllIllIIIIIllI = Arrays.asList(llIIlIIIlIIIllIlIIIl.IIlllIIlIllIllIlIIll, llIIlIIIlIIIllIlIIIl.lllIIIIlllllIlIIllIl, llIIlIIIlIIIllIlIIIl.IIlIIIlllIllIllIlIII);
    }
    
    public IIllIIllIIIlIlIIIIlI() {
        this.llllIIIlIlllIlIIIIIl = 32;
        this.lIIIIlIIIIIlllIllIII = 8;
    }
    
    public IIllIIllIIIlIlIIIIlI(final Map map) {
        this();
        for (final Map.Entry<String, V> entry : map.entrySet()) {
            if (entry.getKey().equals("size")) {
                this.IllIIlllIIIIlllIIlIl = llIllIIlllllllllllll.llllIIIIlIIIlIlllIll((String)entry.getValue(), this.IllIIlllIIIIlllIIlIl, 0);
            }
            else {
                if (!entry.getKey().equals("distance")) {
                    continue;
                }
                this.llllIIIlIlllIlIIIIIl = llIllIIlllllllllllll.llllIIIIlIIIlIlllIll((String)entry.getValue(), this.llllIIIlIlllIlIIIIIl, this.lIIIIlIIIIIlllIllIII + 1);
            }
        }
    }
    
    @Override
    public String llllIIIIlIIIlIlllIll() {
        return "Village";
    }
    
    @Override
    protected boolean llllIIIIlIIIlIlllIll(int n, int n2) {
        final int n3 = n;
        final int n4 = n2;
        if (n < 0) {
            n -= this.llllIIIlIlllIlIIIIIl - 1;
        }
        if (n2 < 0) {
            n2 -= this.llllIIIlIlllIlIIIIIl - 1;
        }
        final int n5 = n / this.llllIIIlIlllIlIIIIIl;
        final int n6 = n2 / this.llllIIIlIlllIlIIIIIl;
        final Random ilIlIlIlIlllllllllIl = this.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(n5, n6, 10387312);
        final int n7 = n5 * this.llllIIIlIlllIlIIIIIl;
        final int n8 = n6 * this.llllIIIlIlllIlIIIIIl;
        final int n9 = n7 + ilIlIlIlIlllllllllIl.nextInt(this.llllIIIlIlllIlIIIIIl - this.lIIIIlIIIIIlllIllIII);
        final int n10 = n8 + ilIlIlIlIlllllllllIl.nextInt(this.llllIIIlIlllIlIIIIIl - this.lIIIIlIIIIIlllIllIII);
        return n3 == n9 && n4 == n10 && this.llIllIIIIIllIlIIIIlI.llIIlIIIlIIIllIlIIIl().llllIIIIlIIIlIlllIll(n3 * 16 + 8, n4 * 16 + 8, 0, IIllIIllIIIlIlIIIIlI.IlIlIIIllIllIIIIIllI);
    }
    
    @Override
    protected IlIIIIIlIIllIIlIlIll IlIlIlIlIlllllllllIl(final int n, final int n2) {
        return new IIIlIIIlIlIIlllIIlll(this.llIllIIIIIllIlIIIIlI, this.IlIlIlIlIlllllllllIl, n, n2, this.IllIIlllIIIIlllIIlIl);
    }
}
