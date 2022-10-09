package net.minecraft.IllIIlllIIIIlllIIlIl;

import net.minecraft.llIllIlIIIIllIlIIllI.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import java.util.*;

public class IlIlIIIlIIlIlIIlllIl extends llllIIIIlIIIlIlllIll
{
    public IlIlIIIlIIlIlIIlllIl(final int n, final lIllllIllIllIIllllll lIllllIllIllIIllllll, final int n2) {
        super(n, lIllllIllIllIIllllll, n2, net.minecraft.IllIIlllIIIIlllIIlIl.IlIlIllllllllIIIIlII.IlIlIIIllIllIIIIIllI);
        this.IlIlIlIlIlllllllllIl("thorns");
    }
    
    @Override
    public int IlIlIlIlIlllllllllIl(final int n) {
        return 10 + 20 * (n - 1);
    }
    
    @Override
    public int llIllIIIIIllIlIIIIlI(final int n) {
        return super.IlIlIlIlIlllllllllIl(n) + 50;
    }
    
    @Override
    public int IlIIIlIlIIIllIlIlIIl() {
        return 3;
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll(final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl) {
        return lllIIIIlIlIllIIlIIIl.llllIIIIlIIIlIlllIll() instanceof IIIlIIlIIIIlllIlllII || super.llllIIIIlIIIlIlllIll(lllIIIIlIlIllIIlIIIl);
    }
    
    @Override
    public void IlIlIlIlIlllllllllIl(final lllIIIIlllllIlIIllIl lllIIIIlllllIlIIllIl, final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI, final int n) {
        final Random b = lllIIIIlllllIlIIllIl.B();
        final lllIIIIlIlIllIIlIIIl llllIIIIlIIIlIlllIll = net.minecraft.IllIIlllIIIIlllIIlIl.lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll(net.minecraft.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll.lIIIlllIIIllIIIllIII, lllIIIIlllllIlIIllIl);
        if (llllIIIIlIIIlIlllIll(n, b)) {
            if (llIllIIIIIllIlIIIIlI != null) {
                llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(net.minecraft.IlllllllIIIlIIIlIlII.lIllllllIIllIlIlIlII.llllIIIIlIIIlIlllIll((llIllIIIIIllIlIIIIlI)lllIIIIlllllIlIIllIl), (float)IlIlIlIlIlllllllllIl(n, b));
                llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll("damage.thorns", 0.5f, 1.0f);
            }
            if (llllIIIIlIIIlIlllIll != null) {
                llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(3, lllIIIIlllllIlIIllIl);
            }
        }
        else if (llllIIIIlIIIlIlllIll != null) {
            llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(1, lllIIIIlllllIlIIllIl);
        }
    }
    
    public static boolean llllIIIIlIIIlIlllIll(final int n, final Random random) {
        return n > 0 && random.nextFloat() < 0.15f * n;
    }
    
    public static int IlIlIlIlIlllllllllIl(final int n, final Random random) {
        return (n > 10) ? (n - 10) : (1 + random.nextInt(4));
    }
}
