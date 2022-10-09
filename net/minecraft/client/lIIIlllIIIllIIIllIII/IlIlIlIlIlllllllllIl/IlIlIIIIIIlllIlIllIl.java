package net.minecraft.client.lIIIlllIIIllIIIllIII.IlIlIlIlIlllllllllIl;

import java.util.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;

public class IlIlIIIIIIlllIlIllIl
{
    private static final int llllIIIIlIIIlIlllIll;
    private static final int IlIlIlIlIlllllllllIl;
    private static final int llIllIIIIIllIlIIIIlI;
    private final BitSet IlIIIlIlIIIllIlIlIIl;
    private static final int[] IlIlIIIllIllIIIIIllI;
    private int IllIIlllIIIIlllIIlIl;
    private static volatile /* synthetic */ int[] llllIIIlIlllIlIIIIIl;
    
    static {
        llllIIIIlIIIlIlllIll = (int)Math.pow(16.0, 0.0);
        IlIlIlIlIlllllllllIl = (int)Math.pow(16.0, 1.0);
        llIllIIIIIllIlIIIIlI = (int)Math.pow(16.0, 2.0);
        IlIlIIIllIllIIIIIllI = new int[1352];
        int n = 0;
        for (int i = 0; i < 16; ++i) {
            for (int j = 0; j < 16; ++j) {
                for (int k = 0; k < 16; ++k) {
                    if (i == 0 || i == 15 || j == 0 || j == 15 || k == 0 || k == 15) {
                        IlIlIIIIIIlllIlIllIl.IlIlIIIllIllIIIIIllI[n++] = llllIIIIlIIIlIlllIll(i, j, k);
                    }
                }
            }
        }
    }
    
    public IlIlIIIIIIlllIlIllIl() {
        this.IlIIIlIlIIIllIlIlIIl = new BitSet(4096);
        this.IllIIlllIIIIlllIIlIl = 4096;
    }
    
    public void llllIIIIlIIIlIlllIll(final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        this.IlIIIlIlIIIllIlIlIIl.set(llIllIIIIIllIlIIIIlI(ilIlIlIlIlllllllllIl), true);
        --this.IllIIlllIIIIlllIIlIl;
    }
    
    private static int llIllIIIIIllIlIIIIlI(final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        return llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII() & 0xF, ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII() & 0xF, ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl() & 0xF);
    }
    
    private static int llllIIIIlIIIlIlllIll(final int n, final int n2, final int n3) {
        return n << 0 | n2 << 8 | n3 << 4;
    }
    
    public IIlllIIlIllIllIlIIll llllIIIIlIIIlIlllIll() {
        final IIlllIIlIllIllIlIIll illlIIlIllIllIlIIll = new IIlllIIlIllIllIlIIll();
        if (4096 - this.IllIIlllIIIIlllIIlIl < 256) {
            illlIIlIllIllIlIIll.llllIIIIlIIIlIlllIll(true);
        }
        else if (this.IllIIlllIIIIlllIIlIl == 0) {
            illlIIlIllIllIlIIll.llllIIIIlIIIlIlllIll(false);
        }
        else {
            int[] ilIlIIIllIllIIIIIllI;
            for (int length = (ilIlIIIllIllIIIIIllI = IlIlIIIIIIlllIlIllIl.IlIlIIIllIllIIIIIllI).length, i = 0; i < length; ++i) {
                final int n = ilIlIIIllIllIIIIIllI[i];
                if (!this.IlIIIlIlIIIllIlIlIIl.get(n)) {
                    illlIIlIllIllIlIIll.llllIIIIlIIIlIlllIll(this.llllIIIIlIIIlIlllIll(n));
                }
            }
        }
        return illlIIlIllIllIlIIll;
    }
    
    public Set IlIlIlIlIlllllllllIl(final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        return this.llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI(ilIlIlIlIlllllllllIl));
    }
    
    private Set llllIIIIlIIIlIlllIll(final int n) {
        final EnumSet<lllIllIIIllllllIllll> none = EnumSet.noneOf(lllIllIIIllllllIllll.class);
        final ArrayDeque<Integer> arrayDeque = new ArrayDeque<Integer>(384);
        arrayDeque.add(IlIIlllllIIllIIlllll.llllIIIIlIIIlIlllIll(n));
        this.IlIIIlIlIIIllIlIlIIl.set(n, true);
        while (!arrayDeque.isEmpty()) {
            final int intValue = arrayDeque.poll();
            this.llllIIIIlIIIlIlllIll(intValue, none);
            lllIllIIIllllllIllll[] llllIIIlIlllIlIIIIIl;
            for (int length = (llllIIIlIlllIlIIIIIl = lllIllIIIllllllIllll.llllIIIlIlllIlIIIIIl).length, i = 0; i < length; ++i) {
                final int llllIIIIlIIIlIlllIll = this.llllIIIIlIIIlIlllIll(intValue, llllIIIlIlllIlIIIIIl[i]);
                if (llllIIIIlIIIlIlllIll >= 0 && !this.IlIIIlIlIIIllIlIlIIl.get(llllIIIIlIIIlIlllIll)) {
                    this.IlIIIlIlIIIllIlIlIIl.set(llllIIIIlIIIlIlllIll, true);
                    arrayDeque.add(IlIIlllllIIllIIlllll.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll));
                }
            }
        }
        return none;
    }
    
    private void llllIIIIlIIIlIlllIll(final int n, final Set set) {
        final int n2 = n >> 0 & 0xF;
        if (n2 == 0) {
            set.add(lllIllIIIllllllIllll.IlIlIIIllIllIIIIIllI);
        }
        else if (n2 == 15) {
            set.add(lllIllIIIllllllIllll.IllIIlllIIIIlllIIlIl);
        }
        final int n3 = n >> 8 & 0xF;
        if (n3 == 0) {
            set.add(lllIllIIIllllllIllll.llllIIIIlIIIlIlllIll);
        }
        else if (n3 == 15) {
            set.add(lllIllIIIllllllIllll.IlIlIlIlIlllllllllIl);
        }
        final int n4 = n >> 4 & 0xF;
        if (n4 == 0) {
            set.add(lllIllIIIllllllIllll.llIllIIIIIllIlIIIIlI);
        }
        else if (n4 == 15) {
            set.add(lllIllIIIllllllIllll.IlIIIlIlIIIllIlIlIIl);
        }
    }
    
    private int llllIIIIlIIIlIlllIll(final int n, final lllIllIIIllllllIllll lllIllIIIllllllIllll) {
        switch (IlIlIlIlIlllllllllIl()[lllIllIIIllllllIllll.ordinal()]) {
            case 1: {
                if ((n >> 8 & 0xF) == 0x0) {
                    return -1;
                }
                return n - IlIlIIIIIIlllIlIllIl.llIllIIIIIllIlIIIIlI;
            }
            case 2: {
                if ((n >> 8 & 0xF) == 0xF) {
                    return -1;
                }
                return n + IlIlIIIIIIlllIlIllIl.llIllIIIIIllIlIIIIlI;
            }
            case 3: {
                if ((n >> 4 & 0xF) == 0x0) {
                    return -1;
                }
                return n - IlIlIIIIIIlllIlIllIl.IlIlIlIlIlllllllllIl;
            }
            case 4: {
                if ((n >> 4 & 0xF) == 0xF) {
                    return -1;
                }
                return n + IlIlIIIIIIlllIlIllIl.IlIlIlIlIlllllllllIl;
            }
            case 5: {
                if ((n >> 0 & 0xF) == 0x0) {
                    return -1;
                }
                return n - IlIlIIIIIIlllIlIllIl.llllIIIIlIIIlIlllIll;
            }
            case 6: {
                if ((n >> 0 & 0xF) == 0xF) {
                    return -1;
                }
                return n + IlIlIIIIIIlllIlIllIl.llllIIIIlIIIlIlllIll;
            }
            default: {
                return -1;
            }
        }
    }
    
    static /* synthetic */ int[] IlIlIlIlIlllllllllIl() {
        final int[] llllIIIlIlllIlIIIIIl = IlIlIIIIIIlllIlIllIl.llllIIIlIlllIlIIIIIl;
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
        return IlIlIIIIIIlllIlIllIl.llllIIIlIlllIlIIIIIl = llllIIIlIlllIlIIIIIl2;
    }
}
