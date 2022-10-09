package net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIIIllIllIIIIIllI;

import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import com.google.common.collect.*;
import java.util.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.llIllIIIIIllIlIIIIlI.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;

public class llllIIIIlIIIlIlllIll implements lIIIIlIIIIIlllIllIII
{
    private static final List llllIIIIlIIIlIlllIll;
    private static final int IlIlIlIlIlllllllllIl;
    private static final int llIllIIIIIllIlIIIIlI;
    private final IlllllllIIIlIIIlIlII IlIIIlIlIIIllIlIlIIl;
    
    static {
        llllIIIIlIIIlIlllIll = Lists.newArrayList();
        final Iterator iterator = net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.iterator();
        while (iterator.hasNext()) {
            net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.addAll((Collection)iterator.next().IlllIIIIlIIIlIlIlIIl().llllIIIIlIIIlIlllIll());
        }
        IlIlIlIlIlllllllllIl = llIllIIlllllllllllll.IllIIlllIIIIlllIIlIl(llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI((float)net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.size()));
        llIllIIIIIllIlIIIIlI = llIllIIlllllllllllll.IllIIlllIIIIlllIIlIl(net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.size() / (float)net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl);
    }
    
    public llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII ilIIIlIlIIIllIlIlIIl) {
        this.IlIIIlIlIIIllIlIlIIl = ilIIIlIlIIIllIlIlIIl;
    }
    
    @Override
    public net.minecraft.IIIlIIlIIIIlllIlllII.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll IlIIIlIlIIIllIlIlIIl(final int n, final int n2) {
        final IllIIlllIIIIlllIIlIl illIIlllIIIIlllIIlIl = new IllIIlllIIIIlllIIlIl();
        for (int i = 0; i < 16; ++i) {
            for (int j = 0; j < 16; ++j) {
                final int n3 = n * 16 + i;
                final int n4 = n2 * 16 + j;
                illIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll(i, 60, j, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.az.lllIllIIIllllllIllll());
                final net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.llIIlIIIlIIIllIlIIIl ilIlIlIlIlllllllllIl = IlIlIlIlIlllllllllIl(n3, n4);
                if (ilIlIlIlIlllllllllIl != null) {
                    illIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll(i, 70, j, ilIlIlIlIlllllllllIl);
                }
            }
        }
        final net.minecraft.IIIlIIlIIIIlllIlllII.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll = new net.minecraft.IIIlIIlIIIIlllIlllII.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(this.IlIIIlIlIIIllIlIlIIl, illIIlllIIIIlllIIlIl, n, n2);
        llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl();
        final llIIlIIIlIIIllIlIIIl[] ilIlIlIlIlllllllllIl2 = this.IlIIIlIlIIIllIlIlIIl.llIIlIIIlIIIllIlIIIl().IlIlIlIlIlllllllllIl(null, n * 16, n2 * 16, 16, 16);
        final byte[] llIllIlIIIIllIlIIllI = llllIIIIlIIIlIlllIll.llIllIlIIIIllIlIIllI();
        for (int k = 0; k < llIllIlIIIIllIlIIllI.length; ++k) {
            llIllIlIIIIllIlIIllI[k] = (byte)ilIlIlIlIlllllllllIl2[k].lIIIIIlIlIIIlIIIIlIl;
        }
        llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl();
        return llllIIIIlIIIlIlllIll;
    }
    
    public static net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.llIIlIIIlIIIllIlIIIl IlIlIlIlIlllllllllIl(int n, int n2) {
        net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl = null;
        if (n > 0 && n2 > 0 && n % 2 != 0 && n2 % 2 != 0) {
            n /= 2;
            n2 /= 2;
            if (n <= net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl && n2 <= net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI) {
                final int llllIIIIlIIIlIlllIll = llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(n * net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl + n2);
                if (llllIIIIlIIIlIlllIll < net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.size()) {
                    llIIlIIIlIIIllIlIIIl = (net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.llIIlIIIlIIIllIlIIIl)net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.get(llllIIIIlIIIlIlllIll);
                }
            }
        }
        return llIIlIIIlIIIllIlIIIl;
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll(final int n, final int n2) {
        return true;
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final lIIIIlIIIIIlllIllIII liiiIlIIIIIlllIllIII, final int n, final int n2) {
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll(final lIIIIlIIIIIlllIllIII liiiIlIIIIIlllIllIII, final net.minecraft.IIIlIIlIIIIlllIlllII.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final int n, final int n2) {
        return false;
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll(final boolean b, final lllllIIIIIlIlIIIIIIl lllllIIIIIlIlIIIIIIl) {
        return true;
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll() {
    }
    
    @Override
    public boolean IlIlIlIlIlllllllllIl() {
        return false;
    }
    
    @Override
    public boolean llIllIIIIIllIlIIIIlI() {
        return true;
    }
    
    @Override
    public String IlIIIlIlIIIllIlIlIIl() {
        return "DebugLevelSource";
    }
    
    @Override
    public List llllIIIIlIIIlIlllIll(final IIlllIlIIllIlIlIlIIl illlIlIIllIlIlIlIIl, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        return this.IlIIIlIlIIIllIlIlIIl.llIllIIIIIllIlIIIIlI(ilIlIlIlIlllllllllIl).llllIIIIlIIIlIlllIll(illlIlIIllIlIlIlIIl);
    }
    
    @Override
    public IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final String s, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        return null;
    }
    
    @Override
    public int IlIlIIIllIllIIIIIllI() {
        return 0;
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final net.minecraft.IIIlIIlIIIIlllIlllII.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final int n, final int n2) {
    }
    
    @Override
    public net.minecraft.IIIlIIlIIIIlllIlllII.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll(final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        return this.IlIIIlIlIIIllIlIlIIl(ilIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII() >> 4, ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl() >> 4);
    }
}
