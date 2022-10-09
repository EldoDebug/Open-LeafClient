package net.optifine;

import net.minecraft.IIllIIllIIIlIlIIIIlI.*;
import java.util.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;

public class llIIIIIIlIllIIlIIIll
{
    public int llllIIIIlIIIlIlllIll;
    public boolean IlIlIlIlIlllllllllIl;
    private Map[] llIllIIIIIllIlIIIIlI;
    
    public llIIIIIIlIllIIlIIIll(final String s) {
        this.llllIIIIlIIIlIlllIll = 1;
        this.IlIlIlIlIlllllllllIl = false;
        this.llIllIIIIIllIlIIIIlI = new Map[8];
        if (s.equals("4")) {
            this.llllIIIIlIIIlIlllIll = 4;
        }
        else if (s.equals("2")) {
            this.llllIIIIlIIIlIlllIll = 2;
        }
        else if (s.equals("F")) {
            this.IlIlIlIlIlllllllllIl = true;
        }
        else if (s.equals("4F")) {
            this.llllIIIIlIIIlIlllIll = 4;
            this.IlIlIlIlIlllllllllIl = true;
        }
        else if (s.equals("2F")) {
            this.llllIIIIlIIIlIlllIll = 2;
            this.IlIlIlIlIlllllllllIl = true;
        }
        else {
            net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI("NaturalTextures: Unknown type: " + s);
        }
    }
    
    public boolean llllIIIIlIIIlIlllIll() {
        return this.llllIIIIlIIIlIlllIll == 2 || this.llllIIIIlIIIlIlllIll == 4 || this.IlIlIlIlIlllllllllIl;
    }
    
    public synchronized net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll(final net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final int n, final boolean b) {
        int n2 = n;
        if (b) {
            n2 = (n | 0x4);
        }
        if (n2 > 0 && n2 < this.llIllIIIIIllIlIIIIlI.length) {
            Map<net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll, net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll> map = (Map<net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll, net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll>)this.llIllIIIIIllIlIIIIlI[n2];
            if (map == null) {
                map = new IdentityHashMap<net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll, net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll>(1);
                this.llIllIIIIIllIlIIIIlI[n2] = map;
            }
            net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll ilIlIlIlIlllllllllIl = map.get(llllIIIIlIIIlIlllIll);
            if (ilIlIlIlIlllllllllIl == null) {
                ilIlIlIlIlllllllllIl = this.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll, n, b);
                map.put(llllIIIIlIIIlIlllIll, ilIlIlIlIlllllllllIl);
            }
            return ilIlIlIlIlllllllllIl;
        }
        return llllIIIIlIIIlIlllIll;
    }
    
    private net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll IlIlIlIlIlllllllllIl(final net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, int n, final boolean b) {
        final int[] ilIlIlIlIlllllllllIl = llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl();
        final int ilIIIlIlIIIllIlIlIIl = llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl();
        final lllIllIIIllllllIllll ilIlIIIllIllIIIIIllI = llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI();
        final IlIlIIIllIIllIlllllI llllIIIIlIIIlIlllIll2 = llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll();
        if (!this.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll)) {
            n = 0;
        }
        return new net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(this.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl, n, b), ilIIIlIlIIIllIlIlIIl, ilIlIIIllIllIIIIIllI, llllIIIIlIIIlIlllIll2);
    }
    
    private int[] llllIIIIlIIIlIlllIll(final int[] array, final int n, final boolean b) {
        final int[] array2 = array.clone();
        int n2 = 4 - n;
        if (b) {
            n2 += 3;
        }
        int n3 = n2 % 4;
        final int n4 = array2.length / 4;
        for (int i = 0; i < 4; ++i) {
            final int n5 = i * n4;
            final int n6 = n3 * n4;
            array2[n6 + 4] = array[n5 + 4];
            array2[n6 + 4 + 1] = array[n5 + 4 + 1];
            if (b) {
                if (--n3 < 0) {
                    n3 = 3;
                }
            }
            else if (++n3 > 3) {
                n3 = 0;
            }
        }
        return array2;
    }
    
    private boolean llllIIIIlIIIlIlllIll(final net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        final IlIlIIIllIIllIlllllI llllIIIIlIIIlIlllIll2 = llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll();
        final float ilIlIIIllIllIIIIIllI = llllIIIIlIIIlIlllIll2.IlIlIIIllIllIIIIIllI();
        final float illIIlllIIIIlllIIlIl = llllIIIIlIIIlIlllIll2.IllIIlllIIIIlllIIlIl();
        final float n = (illIIlllIIIIlllIIlIl - ilIlIIIllIllIIIIIllI) / 256.0f;
        final float llllIIIlIlllIlIIIIIl = llllIIIIlIIIlIlllIll2.llllIIIlIlllIlIIIIIl();
        final float liiiIlIIIIIlllIllIII = llllIIIIlIIIlIlllIll2.lIIIIlIIIIIlllIllIII();
        final float n2 = (liiiIlIIIIIlllIllIII - llllIIIlIlllIlIIIIIl) / 256.0f;
        final int[] ilIlIlIlIlllllllllIl = llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl();
        final int n3 = ilIlIlIlIlllllllllIl.length / 4;
        for (int i = 0; i < 4; ++i) {
            final int n4 = i * n3;
            final float intBitsToFloat = Float.intBitsToFloat(ilIlIlIlIlllllllllIl[n4 + 4]);
            final float intBitsToFloat2 = Float.intBitsToFloat(ilIlIlIlIlllllllllIl[n4 + 4 + 1]);
            if (!this.llllIIIIlIIIlIlllIll(intBitsToFloat, ilIlIIIllIllIIIIIllI, n) && !this.llllIIIIlIIIlIlllIll(intBitsToFloat, illIIlllIIIIlllIIlIl, n)) {
                return false;
            }
            if (!this.llllIIIIlIIIlIlllIll(intBitsToFloat2, llllIIIlIlllIlIIIIIl, n2) && !this.llllIIIIlIIIlIlllIll(intBitsToFloat2, liiiIlIIIIIlllIllIII, n2)) {
                return false;
            }
        }
        return true;
    }
    
    private boolean llllIIIIlIIIlIlllIll(final float n, final float n2, final float n3) {
        return llIllIIlllllllllllll.IlIlIIIllIllIIIIIllI(n - n2) < n3;
    }
}
