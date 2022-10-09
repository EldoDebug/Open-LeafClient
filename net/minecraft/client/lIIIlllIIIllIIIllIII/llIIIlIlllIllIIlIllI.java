package net.minecraft.client.lIIIlllIIIllIIIllIII;

import net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import java.util.*;
import net.minecraft.IlIlIIIlIIlIlIIlllIl.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.llIllIIIIIllIlIIIIlI.*;
import net.optifine.*;

public class llIIIlIlllIllIIlIllI extends llllIIIIlIIIlIlllIll
{
    private static final llIIlIIIlIIIllIlIIIl IllIIlllIIIIlllIIlIl;
    private final IlIlIlIlIlllllllllIl llllIIIlIlllIlIIIIIl;
    private int[] lIIIIlIIIIIlllIllIII;
    private llIIlIIIlIIIllIlIIIl[] lIIIlllIIIllIIIllIII;
    private static ArrayDeque llIIlIIIlIIIllIlIIIl;
    private static ArrayDeque llIllIlIIIIllIlIIllI;
    private static int lIlIlIIIllIIllIIIllI;
    
    static {
        IllIIlllIIIIlllIIlIl = net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.lllIllIIIllllllIllll();
        llIIIlIlllIllIIlIllI.llIIlIIIlIIIllIlIIIl = new ArrayDeque();
        llIIIlIlllIllIIlIllI.llIllIlIIIIllIlIIllI = new ArrayDeque();
        llIIIlIlllIllIIlIllI.lIlIlIIIllIIllIIIllI = net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(Runtime.getRuntime().availableProcessors(), 1, 32);
    }
    
    public llIIIlIlllIllIIlIllI(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl2, final int n) {
        super(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl, ilIlIlIlIlllllllllIl2, n);
        this.llllIIIlIlllIlIIIIIl = ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl(new f(n, n, n));
        Arrays.fill(this.lIIIIlIIIIIlllIllIII = llllIIIIlIIIlIlllIll(8000), -1);
        this.lIIIlllIIIllIIIllIII = IlIlIlIlIlllllllllIl(8000);
    }
    
    @Override
    public IlIIIlIlIIIllIlIlIIl llllIIIIlIIIlIlllIll(final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        return this.llIllIIIIIllIlIIIIlI[(ilIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII() >> 4) - this.llllIIIIlIIIlIlllIll][(ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl() >> 4) - this.IlIlIlIlIlllllllllIl].llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl, net.minecraft.IIIlIIlIIIIlllIlllII.llIllIIIIIllIlIIIIlI.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl);
    }
    
    @Override
    public int llllIIIIlIIIlIlllIll(final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final int n) {
        final int illIIlllIIIIlllIIlIl = this.IllIIlllIIIIlllIIlIl(ilIlIlIlIlllllllllIl);
        int n2 = this.lIIIIlIIIIIlllIllIII[illIIlllIIIIlllIIlIl];
        if (n2 == -1) {
            n2 = super.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl, n);
            if (net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.x() && !this.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl).llIllIIIIIllIlIIIIlI().llllIIllllIlIlIIIIll()) {
                n2 = IlllIIIIlIIIlIlIlIIl.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl, n2);
            }
            this.lIIIIlIIIIIlllIllIII[illIIlllIIIIlllIIlIl] = n2;
        }
        return n2;
    }
    
    @Override
    public llIIlIIIlIIIllIlIIIl IlIlIlIlIlllllllllIl(final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        final int illIIlllIIIIlllIIlIl = this.IllIIlllIIIIlllIIlIl(ilIlIlIlIlllllllllIl);
        llIIlIIIlIIIllIlIIIl ilIlIIIllIllIIIIIllI = this.lIIIlllIIIllIIIllIII[illIIlllIIIIlllIIlIl];
        if (ilIlIIIllIllIIIIIllI == null) {
            ilIlIIIllIllIIIIIllI = this.IlIlIIIllIllIIIIIllI(ilIlIlIlIlllllllllIl);
            this.lIIIlllIIIllIIIllIII[illIIlllIIIIlllIIlIl] = ilIlIIIllIllIIIIIllI;
        }
        return ilIlIIIllIllIIIIIllI;
    }
    
    private llIIlIIIlIIIllIlIIIl IlIlIIIllIllIIIIIllI(final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        return super.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl);
    }
    
    private int IllIIlllIIIIlllIIlIl(final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        return (ilIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII() - this.llllIIIlIlllIlIIIIIl.lIIIIlIIIIIlllIllIII()) * 400 + (ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl() - this.llllIIIlIlllIlIIIIIl.llIIlIIIlIIIllIlIIIl()) * 20 + (ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII() - this.llllIIIlIlllIlIIIIIl.lIIIlllIIIllIIIllIII());
    }
    
    public void llllIIIIlIIIlIlllIll() {
        llllIIIIlIIIlIlllIll(this.lIIIIlIIIIIlllIllIII);
        llllIIIIlIIIlIlllIll(this.lIIIlllIIIllIIIllIII);
    }
    
    private static int[] llllIIIIlIIIlIlllIll(final int n) {
        synchronized (llIIIlIlllIllIIlIllI.llIIlIIIlIIIllIlIIIl) {
            int[] array = llIIIlIlllIllIIlIllI.llIIlIIIlIIIllIlIIIl.pollLast();
            if (array == null || array.length < n) {
                array = new int[n];
            }
            // monitorexit(llIIIlIlllIllIIlIllI.llIIlIIIlIIIllIlIIIl)
            return array;
        }
    }
    
    public static void llllIIIIlIIIlIlllIll(final int[] array) {
        synchronized (llIIIlIlllIllIIlIllI.llIIlIIIlIIIllIlIIIl) {
            if (llIIIlIlllIllIIlIllI.llIIlIIIlIIIllIlIIIl.size() < llIIIlIlllIllIIlIllI.lIlIlIIIllIIllIIIllI) {
                llIIIlIlllIllIIlIllI.llIIlIIIlIIIllIlIIIl.add(array);
            }
        }
        // monitorexit(llIIIlIlllIllIIlIllI.llIIlIIIlIIIllIlIIIl)
    }
    
    private static llIIlIIIlIIIllIlIIIl[] IlIlIlIlIlllllllllIl(final int n) {
        synchronized (llIIIlIlllIllIIlIllI.llIllIlIIIIllIlIIllI) {
            llIIlIIIlIIIllIlIIIl[] array = llIIIlIlllIllIIlIllI.llIllIlIIIIllIlIIllI.pollLast();
            if (array != null && array.length >= n) {
                Arrays.fill(array, null);
            }
            else {
                array = new llIIlIIIlIIIllIlIIIl[n];
            }
            // monitorexit(llIIIlIlllIllIIlIllI.llIllIlIIIIllIlIIllI)
            return array;
        }
    }
    
    public static void llllIIIIlIIIlIlllIll(final llIIlIIIlIIIllIlIIIl[] array) {
        synchronized (llIIIlIlllIllIIlIllI.llIllIlIIIIllIlIIllI) {
            if (llIIIlIlllIllIIlIllI.llIllIlIIIIllIlIIllI.size() < llIIIlIlllIllIIlIllI.lIlIlIIIllIIllIIIllI) {
                llIIIlIlllIllIIlIllI.llIllIlIIIIllIlIIllI.add(array);
            }
        }
        // monitorexit(llIIIlIlllIllIIlIllI.llIllIlIIIIllIlIIllI)
    }
}
