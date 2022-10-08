package net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIIIllIllIIIIIllI;

import java.util.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.llIllIIIIIllIlIIIIlI.*;

public class IlIlIIIllIIllIlllllI
{
    protected int llllIIIIlIIIlIlllIll;
    protected Random IlIlIlIlIlllllllllIl;
    protected IlllllllIIIlIIIlIlII llIllIIIIIllIlIIIIlI;
    
    public IlIlIIIllIIllIlllllI() {
        this.llllIIIIlIIIlIlllIll = 8;
        this.IlIlIlIlIlllllllllIl = new Random();
    }
    
    public void llllIIIIlIIIlIlllIll(final lIIIIlIIIIIlllIllIII liiiIlIIIIIlllIllIII, final IlllllllIIIlIIIlIlII llIllIIIIIllIlIIIIlI, final int n, final int n2, final IllIIlllIIIIlllIIlIl illIIlllIIIIlllIIlIl) {
        final int llllIIIIlIIIlIlllIll = this.llllIIIIlIIIlIlllIll;
        this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
        this.IlIlIlIlIlllllllllIl.setSeed(llIllIIIIIllIlIIIIlI.IIlIIIIlllIlllllIlII());
        final long nextLong = this.IlIlIlIlIlllllllllIl.nextLong();
        final long nextLong2 = this.IlIlIlIlIlllllllllIl.nextLong();
        for (int i = n - llllIIIIlIIIlIlllIll; i <= n + llllIIIIlIIIlIlllIll; ++i) {
            for (int j = n2 - llllIIIIlIIIlIlllIll; j <= n2 + llllIIIIlIIIlIlllIll; ++j) {
                this.IlIlIlIlIlllllllllIl.setSeed(i * nextLong ^ j * nextLong2 ^ llIllIIIIIllIlIIIIlI.IIlIIIIlllIlllllIlII());
                this.llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI, i, j, n, n2, illIIlllIIIIlllIIlIl);
            }
        }
    }
    
    protected void llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final int n, final int n2, final int n3, final int n4, final IllIIlllIIIIlllIIlIl illIIlllIIIIlllIIlIl) {
    }
}
