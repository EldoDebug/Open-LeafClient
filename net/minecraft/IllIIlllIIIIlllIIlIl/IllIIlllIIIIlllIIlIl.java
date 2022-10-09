package net.minecraft.IllIIlllIIIIlllIIlIl;

import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.llIllIlIIIIllIlIIllI.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.llllIIllllIlIlIIIIll.*;

public class IllIIlllIIIIlllIIlIl extends llllIIIIlIIIlIlllIll
{
    private static final String[] llIIlllIIlllIIllIllI;
    private static final int[] IIlllIIIlIlllIIlllII;
    private static final int[] IIlIIIIIllIlIIIlIIll;
    private static final int[] llllllIllIllIlIllllI;
    public final int lIllllllIIllIlIlIlII;
    
    static {
        llIIlllIIlllIIllIllI = new String[] { "all", "undead", "arthropods" };
        IIlllIIIlIlllIIlllII = new int[] { 1, 5, 5 };
        IIlIIIIIllIlIIIlIIll = new int[] { 11, 8, 8 };
        llllllIllIllIlIllllI = new int[] { 20, 20, 20 };
    }
    
    public IllIIlllIIIIlllIIlIl(final int n, final lIllllIllIllIIllllll lIllllIllIllIIllllll, final int n2, final int lIllllllIIllIlIlIlII) {
        super(n, lIllllIllIllIIllllll, n2, net.minecraft.IllIIlllIIIIlllIIlIl.IlIlIllllllllIIIIlII.llllIIIlIlllIlIIIIIl);
        this.lIllllllIIllIlIlIlII = lIllllllIIllIlIlIlII;
    }
    
    @Override
    public int IlIlIlIlIlllllllllIl(final int n) {
        return IllIIlllIIIIlllIIlIl.IIlllIIIlIlllIIlllII[this.lIllllllIIllIlIlIlII] + (n - 1) * IllIIlllIIIIlllIIlIl.IIlIIIIIllIlIIIlIIll[this.lIllllllIIllIlIlIlII];
    }
    
    @Override
    public int llIllIIIIIllIlIIIIlI(final int n) {
        return this.IlIlIlIlIlllllllllIl(n) + IllIIlllIIIIlllIIlIl.llllllIllIllIlIllllI[this.lIllllllIIllIlIlIlII];
    }
    
    @Override
    public int IlIIIlIlIIIllIlIlIIl() {
        return 5;
    }
    
    @Override
    public float llllIIIIlIIIlIlllIll(final int n, final net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIllllllllIIIIlII ilIlIllllllllIIIIlII) {
        return (this.lIllllllIIllIlIlIlII == 0) ? (n * 1.25f) : ((this.lIllllllIIllIlIlIlII == 1 && ilIlIllllllllIIIIlII == net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIllllllllIIIIlII.IlIlIlIlIlllllllllIl) ? (n * 2.5f) : ((this.lIllllllIIllIlIlIlII == 2 && ilIlIllllllllIIIIlII == net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIllllllllIIIIlII.llIllIIIIIllIlIIIIlI) ? (n * 2.5f) : 0.0f));
    }
    
    @Override
    public String IlIlIIIllIllIIIIIllI() {
        return "enchantment.damage." + IllIIlllIIIIlllIIlIl.llIIlllIIlllIIllIllI[this.lIllllllIIllIlIlIlII];
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll(final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        return !(llllIIIIlIIIlIlllIll instanceof IllIIlllIIIIlllIIlIl);
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll(final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl) {
        return lllIIIIlIlIllIIlIIIl.llllIIIIlIIIlIlllIll() instanceof lllllIlIIIlIlIIlllII || super.llllIIIIlIIIlIlllIll(lllIIIIlIlIllIIlIIIl);
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final lllIIIIlllllIlIIllIl lllIIIIlllllIlIIllIl, final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI, final int n) {
        if (llIllIIIIIllIlIIIIlI instanceof lllIIIIlllllIlIIllIl) {
            final lllIIIIlllllIlIIllIl lllIIIIlllllIlIIllIl2 = (lllIIIIlllllIlIIllIl)llIllIIIIIllIlIIIIlI;
            if (this.lIllllllIIllIlIlIlII == 2 && lllIIIIlllllIlIIllIl2.Y() == net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIllllllllIIIIlII.llIllIIIIIllIlIIIIlI) {
                lllIIIIlllllIlIIllIl2.llllIIIIlIIIlIlllIll(new IlIIIlIlIIIllIlIlIIl(net.minecraft.llllIIllllIlIlIIIIll.llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl.llllllIllIllIlIllllI, 20 + lllIIIIlllllIlIIllIl.B().nextInt(10 * n), 3));
            }
        }
    }
}
