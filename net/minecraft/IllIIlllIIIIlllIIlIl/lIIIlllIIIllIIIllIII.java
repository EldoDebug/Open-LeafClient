package net.minecraft.IllIIlllIIIIlllIIlIl;

import net.minecraft.IlllllllIIIlIIIlIlII.*;
import java.util.*;
import net.minecraft.llIllIlIIIIllIlIIllI.*;

public class lIIIlllIIIllIIIllIII extends llllIIIIlIIIlIlllIll
{
    protected lIIIlllIIIllIIIllIII(final int n, final lIllllIllIllIIllllll lIllllIllIllIIllllll, final int n2) {
        super(n, lIllllIllIllIIllllll, n2, net.minecraft.IllIIlllIIIIlllIIlIl.IlIlIllllllllIIIIlII.llIIlIIIlIIIllIlIIIl);
        this.IlIlIlIlIlllllllllIl("durability");
    }
    
    @Override
    public int IlIlIlIlIlllllllllIl(final int n) {
        return 5 + (n - 1) * 8;
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
        return lllIIIIlIlIllIIlIIIl.IlIIIlIlIIIllIlIlIIl() || super.llllIIIIlIIIlIlllIll(lllIIIIlIlIllIIlIIIl);
    }
    
    public static boolean llllIIIIlIIIlIlllIll(final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl, final int n, final Random random) {
        return (!(lllIIIIlIlIllIIlIIIl.llllIIIIlIIIlIlllIll() instanceof IIIlIIlIIIIlllIlllII) || random.nextFloat() >= 0.6f) && random.nextInt(n + 1) > 0;
    }
}
