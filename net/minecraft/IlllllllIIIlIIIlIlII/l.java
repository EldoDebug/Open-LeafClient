package net.minecraft.IlllllllIIIlIIIlIlII;

import net.minecraft.llIllIlIIIIllIlIIllI.*;
import java.util.*;
import net.minecraft.IllIIlllIIIIlllIIlIl.*;

public class l extends j
{
    private final lllIIIIlIlIllIIlIIIl llllIIIIlIIIlIlllIll;
    private float IlIlIlIlIlllllllllIl;
    private boolean IlIIIlIlIIIllIlIlIIl;
    
    public l(final lllIIIIlIlIllIIlIIIl llllIIIIlIIIlIlllIll, final int n) {
        super(n);
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
    }
    
    public lllIIIIlIlIllIIlIIIl llllIIIIlIIIlIlllIll(final Random random) {
        final lllIIIIlIlIllIIlIIIl llIIlIIIlIIIllIlIIIl = this.llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl();
        if (this.IlIlIlIlIlllllllllIl > 0.0f) {
            final int n = (int)(this.IlIlIlIlIlllllllllIl * this.llllIIIIlIIIlIlllIll.lIIIlllIIIllIIIllIII());
            int n2 = llIIlIIIlIIIllIlIIIl.lIIIlllIIIllIIIllIII() - random.nextInt(random.nextInt(n) + 1);
            if (n2 > n) {
                n2 = n;
            }
            if (n2 < 1) {
                n2 = 1;
            }
            llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl(n2);
        }
        if (this.IlIIIlIlIIIllIlIlIIl) {
            lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll(random, llIIlIIIlIIIllIlIIIl, 30);
        }
        return llIIlIIIlIIIllIlIIIl;
    }
    
    public l llllIIIIlIIIlIlllIll(final float ilIlIlIlIlllllllllIl) {
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
        return this;
    }
    
    public l llllIIIIlIIIlIlllIll() {
        this.IlIIIlIlIIIllIlIlIIl = true;
        return this;
    }
}
