package net.optifine.IllIIlllIIIIlllIIlIl;

import net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.*;
import net.optifine.*;
import java.util.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.IlIlIIIlIIlIlIIlllIl.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.optifine.lIIIIlIIIIIlllIllIII.*;

public class llllIIIIlIIIlIlllIll implements lIlIlIIIllIIllIIIllI
{
    private final net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll;
    private final int IlIlIlIlIlllllllllIl;
    private final int llIllIIIIIllIlIIIIlI;
    private final int IlIIIlIlIIIllIlIlIIl;
    private final int IlIlIIIllIllIIIIIllI;
    private final int IllIIlllIIIIlllIIlIl;
    private final int llllIIIlIlllIlIIIIIl;
    private final int lIIIIlIIIIIlllIllIII;
    private int[] lIIIlllIIIllIIIllIII;
    private llIIlIIIlIIIllIlIIIl[] llIIlIIIlIIIllIlIIIl;
    private final int llIllIlIIIIllIlIIllI;
    private final boolean lIlIlIIIllIIllIIIllI;
    private static final net.optifine.util.llllIIIIlIIIlIlllIll IlIlIIIllIIllIlllllI;
    private static final net.optifine.util.llllIIIIlIIIlIlllIll IIIIlllIIIIIIlIIIlll;
    
    static {
        IlIlIIIllIIllIlllllI = new net.optifine.util.llllIIIIlIIIlIlllIll(Integer.TYPE, 16);
        IIIIlllIIIIIIlIIIlll = new net.optifine.util.llllIIIIlIIIlIlllIll(llIIlIIIlIIIllIlIIIl.class, 16);
    }
    
    public llllIIIIlIIIlIlllIll(final net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl2, final int n) {
        this.lIlIlIIIllIIllIIIllI = net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.x();
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        final int n2 = ilIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII() - n >> 4;
        final int n3 = ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII() - n >> 4;
        final int n4 = ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl() - n >> 4;
        final int n5 = ilIlIlIlIlllllllllIl2.lIIIIlIIIIIlllIllIII() + n >> 4;
        final int n6 = ilIlIlIlIlllllllllIl2.lIIIlllIIIllIIIllIII() + n >> 4;
        final int n7 = ilIlIlIlIlllllllllIl2.llIIlIIIlIIIllIlIIIl() + n >> 4;
        this.IlIlIIIllIllIIIIIllI = n5 - n2 + 1 << 4;
        this.IllIIlllIIIIlllIIlIl = n6 - n3 + 1 << 4;
        this.llllIIIlIlllIlIIIIIl = n7 - n4 + 1 << 4;
        this.lIIIIlIIIIIlllIllIII = this.IlIlIIIllIllIIIIIllI * this.IllIIlllIIIIlllIIlIl;
        this.llIllIlIIIIllIlIIllI = this.IlIlIIIllIllIIIIIllI * this.IllIIlllIIIIlllIIlIl * this.llllIIIlIlllIlIIIIIl;
        this.IlIlIlIlIlllllllllIl = n2 << 4;
        this.llIllIIIIIllIlIIIIlI = n3 << 4;
        this.IlIIIlIlIIIllIlIlIIl = n4 << 4;
    }
    
    private int IlIlIIIllIllIIIIIllI(final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        final int n = ilIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII() - this.IlIlIlIlIlllllllllIl;
        if (n < 0 || n >= this.IlIlIIIllIllIIIIIllI) {
            return -1;
        }
        final int n2 = ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII() - this.llIllIIIIIllIlIIIIlI;
        if (n2 >= 0 && n2 < this.IllIIlllIIIIlllIIlIl) {
            final int n3 = ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl() - this.IlIIIlIlIIIllIlIlIIl;
            return (n3 >= 0 && n3 < this.llllIIIlIlllIlIIIIIl) ? (n3 * this.lIIIIlIIIIIlllIllIII + n2 * this.IlIlIIIllIllIIIIIllI + n) : -1;
        }
        return -1;
    }
    
    @Override
    public int llllIIIIlIIIlIlllIll(final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final int n) {
        final int ilIlIIIllIllIIIIIllI = this.IlIlIIIllIllIIIIIllI(ilIlIlIlIlllllllllIl);
        if (ilIlIIIllIllIIIIIllI >= 0 && ilIlIIIllIllIIIIIllI < this.llIllIlIIIIllIlIIllI && this.lIIIlllIIIllIIIllIII != null) {
            int ilIlIlIlIlllllllllIl2 = this.lIIIlllIIIllIIIllIII[ilIlIIIllIllIIIIIllI];
            if (ilIlIlIlIlllllllllIl2 == -1) {
                ilIlIlIlIlllllllllIl2 = this.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl, n);
                this.lIIIlllIIIllIIIllIII[ilIlIIIllIllIIIIIllI] = ilIlIlIlIlllllllllIl2;
            }
            return ilIlIlIlIlllllllllIl2;
        }
        return this.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl, n);
    }
    
    private int IlIlIlIlIlllllllllIl(final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final int n) {
        int n2 = this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl, n);
        if (this.lIlIlIIIllIIllIIIllI && !this.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl).llIllIIIIIllIlIIIIlI().llllIIllllIlIlIIIIll()) {
            n2 = IlllIIIIlIIIlIlIlIIl.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl, n2);
        }
        return n2;
    }
    
    @Override
    public llIIlIIIlIIIllIlIIIl IlIlIlIlIlllllllllIl(final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        final int ilIlIIIllIllIIIIIllI = this.IlIlIIIllIllIIIIIllI(ilIlIlIlIlllllllllIl);
        if (ilIlIIIllIllIIIIIllI >= 0 && ilIlIIIllIllIIIIIllI < this.llIllIlIIIIllIlIIllI && this.llIIlIIIlIIIllIlIIIl != null) {
            llIIlIIIlIIIllIlIIIl ilIlIlIlIlllllllllIl2 = this.llIIlIIIlIIIllIlIIIl[ilIlIIIllIllIIIIIllI];
            if (ilIlIlIlIlllllllllIl2 == null) {
                ilIlIlIlIlllllllllIl2 = this.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl);
                this.llIIlIIIlIIIllIlIIIl[ilIlIIIllIllIIIIIllI] = ilIlIlIlIlllllllllIl2;
            }
            return ilIlIlIlIlllllllllIl2;
        }
        return this.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl);
    }
    
    public void llllIIIIlIIIlIlllIll() {
        if (this.lIIIlllIIIllIIIllIII == null) {
            this.lIIIlllIIIllIIIllIII = (int[])net.optifine.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll.IlIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll(this.llIllIlIIIIllIlIIllI);
        }
        Arrays.fill(this.lIIIlllIIIllIIIllIII, -1);
        if (this.llIIlIIIlIIIllIlIIIl == null) {
            this.llIIlIIIlIIIllIlIIIl = (llIIlIIIlIIIllIlIIIl[])net.optifine.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll.IIIIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll(this.llIllIlIIIIllIlIIllI);
        }
        Arrays.fill(this.llIIlIIIlIIIllIlIIIl, null);
    }
    
    public void IlIIIlIlIIIllIlIlIIl() {
        net.optifine.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll.IlIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll(this.lIIIlllIIIllIIIllIII);
        this.lIIIlllIIIllIIIllIII = null;
        net.optifine.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll.IIIIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll(this.llIIlIIIlIIIllIlIIIl);
        this.llIIlIIIlIIIllIlIIIl = null;
    }
    
    @Override
    public boolean q_() {
        return this.llllIIIIlIIIlIlllIll.q_();
    }
    
    @Override
    public net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl llIllIIIIIllIlIIIIlI(final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        return this.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI(ilIlIlIlIlllllllllIl);
    }
    
    @Override
    public int llllIIIIlIIIlIlllIll(final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final lllIllIIIllllllIllll lllIllIIIllllllIllll) {
        return this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl, lllIllIIIllllllIllll);
    }
    
    @Override
    public IlIIIlIlIIIllIlIlIIl llllIIIIlIIIlIlllIll(final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        return this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl);
    }
    
    @Override
    public llIllIlIlIIIIIIIllII p_() {
        return this.llllIIIIlIIIlIlllIll.p_();
    }
    
    @Override
    public boolean IlIIIlIlIIIllIlIlIIl(final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        return this.llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl(ilIlIlIlIlllllllllIl);
    }
    
    public boolean llllIIIIlIIIlIlllIll(final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final lllIllIIIllllllIllll lllIllIIIllllllIllll, final boolean b) {
        return net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.IlIlIlIlIlllllllllIl(this.llllIIIIlIIIlIlllIll, net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.IIlllllIllIllIlIlIII, ilIlIlIlIlllllllllIl, lllIllIIIllllllIllll, b);
    }
}
