package net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI;

import com.google.common.collect.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIIIllIllIIIIIllI.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import java.util.*;

public class llIIlIIIlIIIllIlIIIl extends IIIIlllIIIIIIlIIIlll
{
    private static final List IlIlIIIllIllIIIIIllI;
    private List IllIIlllIIIIlllIIlIl;
    private int llllIIIlIlllIlIIIIIl;
    private int lIIIIlIIIIIlllIllIII;
    
    static {
        IlIlIIIllIllIIIIIllI = Arrays.asList(net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl.lllIIIIlllllIlIIllIl, net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl.IIlIIIIIllIlIIIlIIll, net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl.IIIIIllIIIIlIIIIllIl, net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl.IIIIIIIIIlllIllIlIlI, net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl.IlIlIIIlIIlIlIIlllIl);
    }
    
    public llIIlIIIlIIIllIlIIIl() {
        this.IllIIlllIIIIlllIIlIl = Lists.newArrayList();
        this.llllIIIlIlllIlIIIIIl = 32;
        this.lIIIIlIIIIIlllIllIII = 8;
        this.IllIIlllIIIIlllIIlIl.add(new lIlIlIIIllIIllIIIllI(IllIllIlllIllllIIllI.class, 1, 1, 1));
    }
    
    public llIIlIIIlIIIllIlIIIl(final Map map) {
        this();
        for (final Map.Entry<String, V> entry : map.entrySet()) {
            if (entry.getKey().equals("distance")) {
                this.llllIIIlIlllIlIIIIIl = llIllIIlllllllllllll.llllIIIIlIIIlIlllIll((String)entry.getValue(), this.llllIIIlIlllIlIIIIIl, this.lIIIIlIIIIIlllIllIII + 1);
            }
        }
    }
    
    @Override
    public String llllIIIIlIIIlIlllIll() {
        return "Temple";
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
        final Random ilIlIlIlIlllllllllIl = this.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(n5, n6, 14357617);
        final int n7 = n5 * this.llllIIIlIlllIlIIIIIl;
        final int n8 = n6 * this.llllIIIlIlllIlIIIIIl;
        final int n9 = n7 + ilIlIlIlIlllllllllIl.nextInt(this.llllIIIlIlllIlIIIIIl - this.lIIIIlIIIIIlllIllIII);
        final int n10 = n8 + ilIlIlIlIlllllllllIl.nextInt(this.llllIIIlIlllIlIIIIIl - this.lIIIIlIIIIIlllIllIII);
        if (n3 == n9 && n4 == n10) {
            final net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl llllIIIIlIIIlIlllIll = this.llIllIIIIIllIlIIIIlI.llIIlIIIlIIIllIlIIIl().llllIIIIlIIIlIlllIll(new IlIlIlIlIlllllllllIl(n3 * 16 + 8, 0, n4 * 16 + 8));
            if (llllIIIIlIIIlIlllIll == null) {
                return false;
            }
            final Iterator<net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl> iterator = llIIlIIIlIIIllIlIIIl.IlIlIIIllIllIIIIIllI.iterator();
            while (iterator.hasNext()) {
                if (llllIIIIlIIIlIlllIll == iterator.next()) {
                    return true;
                }
            }
        }
        return false;
    }
    
    @Override
    protected IlIIIIIlIIllIIlIlIll IlIlIlIlIlllllllllIl(final int n, final int n2) {
        return new llIllIlIIIIllIlIIllI(this.llIllIIIIIllIlIIIIlI, this.IlIlIlIlIlllllllllIl, n, n2);
    }
    
    public boolean llllIIIIlIIIlIlllIll(final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        final IlIIIIIlIIllIIlIlIll llIllIIIIIllIlIIIIlI = this.llIllIIIIIllIlIIIIlI(ilIlIlIlIlllllllllIl);
        return llIllIIIIIllIlIIIIlI != null && llIllIIIIIllIlIIIIlI instanceof llIllIlIIIIllIlIIllI && !llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll.isEmpty() && ((IlllllllIIIlIIIlIlII)llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll.getFirst()) instanceof IllIIlllIIIIlllIIlIl;
    }
    
    public List IlIlIlIlIlllllllllIl() {
        return this.IllIIlllIIIIlllIIlIl;
    }
}
