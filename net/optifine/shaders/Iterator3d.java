package net.optifine.shaders;

import java.util.*;
import net.optifine.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;

public class Iterator3d implements Iterator
{
    private IteratorAxis llllIIIIlIIIlIlllIll;
    private IlIIIlIlIIIllIlIlIIl IlIlIlIlIlllllllllIl;
    private int llIllIIIIIllIlIIIIlI;
    private int IlIIIlIlIIIllIlIlIIl;
    private int IlIlIIIllIllIIIIIllI;
    private int IllIIlllIIIIlllIIlIl;
    private static final int llllIIIlIlllIlIIIIIl = 0;
    private static final int lIIIIlIIIIIlllIllIII = 1;
    private static final int lIIIlllIIIllIIIllIII = 2;
    
    public Iterator3d(IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll, IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll2, final int n, final int n2) {
        this.IlIlIlIlIlllllllllIl = new IlIIIlIlIIIllIlIlIIl(0, 0, 0);
        this.llIllIIIIIllIlIIIIlI = 0;
        final boolean b = llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII() > llllIIIIlIIIlIlllIll2.lIIIIlIIIIIlllIllIII();
        final boolean b2 = llllIIIIlIIIlIlllIll.lIIIlllIIIllIIIllIII() > llllIIIIlIIIlIlllIll2.lIIIlllIIIllIIIllIII();
        final boolean b3 = llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl() > llllIIIIlIIIlIlllIll2.llIIlIIIlIIIllIlIIIl();
        llllIIIIlIIIlIlllIll = this.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll, b, b2, b3);
        llllIIIIlIIIlIlllIll2 = this.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll2, b, b2, b3);
        this.IlIIIlIlIIIllIlIlIIl = (b ? -1 : 1);
        this.IlIlIIIllIllIIIIIllI = (b2 ? -1 : 1);
        this.IllIIlllIIIIlllIIlIl = (b3 ? -1 : 1);
        final e llllIIIIlIIIlIlllIll3 = new e(llllIIIIlIIIlIlllIll2.lIIIIlIIIIIlllIllIII() - llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII(), llllIIIIlIIIlIlllIll2.lIIIlllIIIllIIIllIII() - llllIIIIlIIIlIlllIll.lIIIlllIIIllIIIllIII(), llllIIIIlIIIlIlllIll2.llIIlIIIlIIIllIlIIIl() - llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl()).llllIIIIlIIIlIlllIll();
        final double abs = Math.abs(llllIIIIlIIIlIlllIll3.IlIlIlIlIlllllllllIl(new e(1.0, 0.0, 0.0)));
        final double abs2 = Math.abs(llllIIIIlIIIlIlllIll3.IlIlIlIlIlllllllllIl(new e(0.0, 1.0, 0.0)));
        final double abs3 = Math.abs(llllIIIIlIIIlIlllIll3.IlIlIlIlIlllllllllIl(new e(0.0, 0.0, 1.0)));
        if (abs3 >= abs2 && abs3 >= abs) {
            this.llIllIIIIIllIlIIIIlI = 2;
            final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl = new IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl(), llllIIIIlIIIlIlllIll.lIIIlllIIIllIIIllIII() - n, llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII() - n2);
            final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl2 = new IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll2.llIIlIIIlIIIllIlIIIl(), llllIIIIlIIIlIlllIll.lIIIlllIIIllIIIllIII() + n + 1, llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII() + n2 + 1);
            final int n3 = llllIIIIlIIIlIlllIll2.llIIlIIIlIIIllIlIIIl() - llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl();
            this.llllIIIIlIIIlIlllIll = new IteratorAxis(ilIlIlIlIlllllllllIl, ilIlIlIlIlllllllllIl2, (llllIIIIlIIIlIlllIll2.lIIIlllIIIllIIIllIII() - llllIIIIlIIIlIlllIll.lIIIlllIIIllIIIllIII()) / (1.0 * n3), (llllIIIIlIIIlIlllIll2.lIIIIlIIIIIlllIllIII() - llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII()) / (1.0 * n3));
        }
        else if (abs2 >= abs && abs2 >= abs3) {
            this.llIllIIIIIllIlIIIIlI = 1;
            final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl3 = new IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll.lIIIlllIIIllIIIllIII(), llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII() - n, llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl() - n2);
            final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl4 = new IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll2.lIIIlllIIIllIIIllIII(), llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII() + n + 1, llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl() + n2 + 1);
            final int n4 = llllIIIIlIIIlIlllIll2.lIIIlllIIIllIIIllIII() - llllIIIIlIIIlIlllIll.lIIIlllIIIllIIIllIII();
            this.llllIIIIlIIIlIlllIll = new IteratorAxis(ilIlIlIlIlllllllllIl3, ilIlIlIlIlllllllllIl4, (llllIIIIlIIIlIlllIll2.lIIIIlIIIIIlllIllIII() - llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII()) / (1.0 * n4), (llllIIIIlIIIlIlllIll2.llIIlIIIlIIIllIlIIIl() - llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl()) / (1.0 * n4));
        }
        else {
            this.llIllIIIIIllIlIIIIlI = 0;
            final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl5 = new IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII(), llllIIIIlIIIlIlllIll.lIIIlllIIIllIIIllIII() - n, llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl() - n2);
            final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl6 = new IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll2.lIIIIlIIIIIlllIllIII(), llllIIIIlIIIlIlllIll.lIIIlllIIIllIIIllIII() + n + 1, llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl() + n2 + 1);
            final int n5 = llllIIIIlIIIlIlllIll2.lIIIIlIIIIIlllIllIII() - llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII();
            this.llllIIIIlIIIlIlllIll = new IteratorAxis(ilIlIlIlIlllllllllIl5, ilIlIlIlIlllllllllIl6, (llllIIIIlIIIlIlllIll2.lIIIlllIIIllIIIllIII() - llllIIIIlIIIlIlllIll.lIIIlllIIIllIIIllIII()) / (1.0 * n5), (llllIIIIlIIIlIlllIll2.llIIlIIIlIIIllIlIIIl() - llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl()) / (1.0 * n5));
        }
    }
    
    private IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll(IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final boolean b, final boolean b2, final boolean b3) {
        if (b) {
            ilIlIlIlIlllllllllIl = new IlIlIlIlIlllllllllIl(-ilIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII(), ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII(), ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl());
        }
        if (b2) {
            ilIlIlIlIlllllllllIl = new IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII(), -ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII(), ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl());
        }
        if (b3) {
            ilIlIlIlIlllllllllIl = new IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII(), ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII(), -ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl());
        }
        return ilIlIlIlIlllllllllIl;
    }
    
    @Override
    public boolean hasNext() {
        return this.llllIIIIlIIIlIlllIll.hasNext();
    }
    
    public IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll() {
        final IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll = this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll();
        switch (this.llIllIIIIIllIlIIIIlI) {
            case 0: {
                this.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII() * this.IlIIIlIlIIIllIlIlIIl, llllIIIIlIIIlIlllIll.lIIIlllIIIllIIIllIII() * this.IlIlIIIllIllIIIIIllI, llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl() * this.IllIIlllIIIIlllIIlIl);
                return this.IlIlIlIlIlllllllllIl;
            }
            case 1: {
                this.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll.lIIIlllIIIllIIIllIII() * this.IlIIIlIlIIIllIlIlIIl, llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII() * this.IlIlIIIllIllIIIIIllI, llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl() * this.IllIIlllIIIIlllIIlIl);
                return this.IlIlIlIlIlllllllllIl;
            }
            case 2: {
                this.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl() * this.IlIIIlIlIIIllIlIlIIl, llllIIIIlIIIlIlllIll.lIIIlllIIIllIIIllIII() * this.IlIlIIIllIllIIIIIllI, llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII() * this.IllIIlllIIIIlllIIlIl);
                return this.IlIlIlIlIlllllllllIl;
            }
            default: {
                this.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII() * this.IlIIIlIlIIIllIlIlIIl, llllIIIIlIIIlIlllIll.lIIIlllIIIllIIIllIII() * this.IlIlIIIllIllIIIIIllI, llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl() * this.IllIIlllIIIIlllIIlIl);
                return this.IlIlIlIlIlllllllllIl;
            }
        }
    }
    
    @Override
    public void remove() {
        throw new RuntimeException("Not supported");
    }
    
    public static void main(final String[] array) {
        final Iterator3d iterator3d = new Iterator3d(new IlIlIlIlIlllllllllIl(10, 20, 30), new IlIlIlIlIlllllllllIl(30, 40, 20), 1, 1);
        while (iterator3d.hasNext()) {
            System.out.println(new StringBuilder().append(iterator3d.llllIIIIlIIIlIlllIll()).toString());
        }
    }
}
