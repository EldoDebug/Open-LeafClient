package net.minecraft.IIIlIIlIIIIlllIlllII.llIllIIIIIllIlIIIIlI;

import net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.*;
import net.minecraft.lIIIlllIIIllIIIllIII.*;

public class IllIIlllIIIIlllIIlIl
{
    private final short[] llllIIIIlIIIlIlllIll;
    private final llIIlIIIlIIIllIlIIIl IlIlIlIlIlllllllllIl;
    
    public IllIIlllIIIIlllIIlIl() {
        this.llllIIIIlIIIlIlllIll = new short[65536];
        this.IlIlIlIlIlllllllllIl = net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.lllIllIIIllllllIllll();
    }
    
    public llIIlIIIlIIIllIlIIIl llllIIIIlIIIlIlllIll(final int n, final int n2, final int n3) {
        return this.llllIIIIlIIIlIlllIll(n << 12 | n3 << 8 | n2);
    }
    
    public llIIlIIIlIIIllIlIIIl llllIIIIlIIIlIlllIll(final int n) {
        if (n >= 0 && n < this.llllIIIIlIIIlIlllIll.length) {
            final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl = (llIIlIIIlIIIllIlIIIl)net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(this.llllIIIIlIIIlIlllIll[n]);
            return (llIIlIIIlIIIllIlIIIl != null) ? llIIlIIIlIIIllIlIIIl : this.IlIlIlIlIlllllllllIl;
        }
        throw new IndexOutOfBoundsException("The coordinate is out of range");
    }
    
    public void llllIIIIlIIIlIlllIll(final int n, final int n2, final int n3, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl) {
        this.llllIIIIlIIIlIlllIll(n << 12 | n3 << 8 | n2, llIIlIIIlIIIllIlIIIl);
    }
    
    public void llllIIIIlIIIlIlllIll(final int n, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl) {
        if (n >= 0 && n < this.llllIIIIlIIIlIlllIll.length) {
            this.llllIIIIlIIIlIlllIll[n] = (short)net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(llIIlIIIlIIIllIlIIIl);
            return;
        }
        throw new IndexOutOfBoundsException("The coordinate is out of range");
    }
}
