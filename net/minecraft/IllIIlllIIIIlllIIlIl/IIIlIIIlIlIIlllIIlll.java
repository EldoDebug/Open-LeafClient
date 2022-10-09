package net.minecraft.IllIIlllIIIIlllIIlIl;

import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;

public class IIIlIIIlIlIIlllIIlll extends llllIIIIlIIIlIlllIll
{
    private static final String[] llIIlllIIlllIIllIllI;
    private static final int[] IIlllIIIlIlllIIlllII;
    private static final int[] IIlIIIIIllIlIIIlIIll;
    private static final int[] llllllIllIllIlIllllI;
    public final int lIllllllIIllIlIlIlII;
    
    static {
        llIIlllIIlllIIllIllI = new String[] { "all", "fire", "fall", "explosion", "projectile" };
        IIlllIIIlIlllIIlllII = new int[] { 1, 10, 5, 5, 3 };
        IIlIIIIIllIlIIIlIIll = new int[] { 11, 8, 6, 8, 6 };
        llllllIllIllIlIllllI = new int[] { 20, 12, 10, 12, 15 };
    }
    
    public IIIlIIIlIlIIlllIIlll(final int n, final lIllllIllIllIIllllll lIllllIllIllIIllllll, final int n2, final int lIllllllIIllIlIlIlII) {
        super(n, lIllllIllIllIIllllll, n2, net.minecraft.IllIIlllIIIIlllIIlIl.IlIlIllllllllIIIIlII.IlIlIlIlIlllllllllIl);
        this.lIllllllIIllIlIlIlII = lIllllllIIllIlIlIlII;
        if (lIllllllIIllIlIlIlII == 2) {
            this.llIIIlIlIllIIlIlIlII = net.minecraft.IllIIlllIIIIlllIIlIl.IlIlIllllllllIIIIlII.llIllIIIIIllIlIIIIlI;
        }
    }
    
    @Override
    public int IlIlIlIlIlllllllllIl(final int n) {
        return IIIlIIIlIlIIlllIIlll.IIlllIIIlIlllIIlllII[this.lIllllllIIllIlIlIlII] + (n - 1) * IIIlIIIlIlIIlllIIlll.IIlIIIIIllIlIIIlIIll[this.lIllllllIIllIlIlIlII];
    }
    
    @Override
    public int llIllIIIIIllIlIIIIlI(final int n) {
        return this.IlIlIlIlIlllllllllIl(n) + IIIlIIIlIlIIlllIIlll.llllllIllIllIlIllllI[this.lIllllllIIllIlIlIlII];
    }
    
    @Override
    public int IlIIIlIlIIIllIlIlIIl() {
        return 4;
    }
    
    @Override
    public int llllIIIIlIIIlIlllIll(final int n, final lIllllllIIllIlIlIlII lIllllllIIllIlIlIlII) {
        if (lIllllllIIllIlIlIlII.llllIIIlIlllIlIIIIIl()) {
            return 0;
        }
        final float n2 = (6 + n * n) / 3.0f;
        return (this.lIllllllIIllIlIlIlII == 0) ? llIllIIlllllllllllll.IlIIIlIlIIIllIlIlIIl(n2 * 0.75f) : ((this.lIllllllIIllIlIlIlII == 1 && lIllllllIIllIlIlIlII.llllIIllllIlIlIIIIll()) ? llIllIIlllllllllllll.IlIIIlIlIIIllIlIlIIl(n2 * 1.25f) : ((this.lIllllllIIllIlIlIlII == 2 && lIllllllIIllIlIlIlII == lIllllllIIllIlIlIlII.lIIIlllIIIllIIIllIII) ? llIllIIlllllllllllll.IlIIIlIlIIIllIlIlIIl(n2 * 2.5f) : ((this.lIllllllIIllIlIlIlII == 3 && lIllllllIIllIlIlIlII.llIllIIIIIllIlIIIIlI()) ? llIllIIlllllllllllll.IlIIIlIlIIIllIlIlIIl(n2 * 1.5f) : ((this.lIllllllIIllIlIlIlII == 4 && lIllllllIIllIlIlIlII.llllIIIIlIIIlIlllIll()) ? llIllIIlllllllllllll.IlIIIlIlIIIllIlIlIIl(n2 * 1.5f) : 0))));
    }
    
    @Override
    public String IlIlIIIllIllIIIIIllI() {
        return "enchantment.protect." + IIIlIIIlIlIIlllIIlll.llIIlllIIlllIIllIllI[this.lIllllllIIllIlIlIlII];
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll(final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        if (llllIIIIlIIIlIlllIll instanceof IIIlIIIlIlIIlllIIlll) {
            final IIIlIIIlIlIIlllIIlll iiIlIIIlIlIIlllIIlll = (IIIlIIIlIlIIlllIIlll)llllIIIIlIIIlIlllIll;
            return iiIlIIIlIlIIlllIIlll.lIllllllIIllIlIlIlII != this.lIllllllIIllIlIlIlII && (this.lIllllllIIllIlIlIlII == 2 || iiIlIIIlIlIIlllIIlll.lIllllllIIllIlIlIlII == 2);
        }
        return super.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll);
    }
    
    public static int llllIIIIlIIIlIlllIll(final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI, int n) {
        final int llllIIIIlIIIlIlllIll = net.minecraft.IllIIlllIIIIlllIIlIl.lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll(net.minecraft.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.IIlllIlIIllIlIlIlIIl, llIllIIIIIllIlIIIIlI.IlIllllIIIlIllIlIIll());
        if (llllIIIIlIIIlIlllIll > 0) {
            n -= llIllIIlllllllllllll.IlIIIlIlIIIllIlIlIIl(n * (float)llllIIIIlIIIlIlllIll * 0.15f);
        }
        return n;
    }
    
    public static double llllIIIIlIIIlIlllIll(final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI, double n) {
        final int llllIIIIlIIIlIlllIll = net.minecraft.IllIIlllIIIIlllIIlIl.lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll(net.minecraft.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI.IIlllIlIIllIlIlIlIIl, llIllIIIIIllIlIIIIlI.IlIllllIIIlIllIlIIll());
        if (llllIIIIlIIIlIlllIll > 0) {
            n -= llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(n * (llllIIIIlIIIlIlllIll * 0.15f));
        }
        return n;
    }
}
