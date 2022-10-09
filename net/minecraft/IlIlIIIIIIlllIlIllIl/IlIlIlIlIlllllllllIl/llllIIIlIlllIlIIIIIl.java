package net.minecraft.IlIlIIIIIIlllIlIllIl.IlIlIlIlIlllllllllIl;

import java.util.*;
import com.google.common.collect.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.IlIlIIIllIIllIlllllI.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.llIllIIIIIllIlIIIIlI.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl.*;

class llllIIIlIlllIlIIIIIl
{
    private final List IlIlIlIlIlllllllllIl;
    private final IlIlIlIlIlllllllllIl llIllIIIIIllIlIIIIlI;
    private short[] IlIIIlIlIIIllIlIlIIl;
    private int IlIlIIIllIllIIIIIllI;
    private int IllIIlllIIIIlllIIlIl;
    private long llllIIIlIlllIlIIIIIl;
    final /* synthetic */ IllIIlllIIIIlllIIlIl llllIIIIlIIIlIlllIll;
    
    public llllIIIlIlllIlIIIIIl(final IllIIlllIIIIlllIIlIl llllIIIIlIIIlIlllIll, final int n, final int n2) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.IlIlIlIlIlllllllllIl = Lists.newArrayList();
        this.IlIIIlIlIIIllIlIlIIl = new short[64];
        this.llIllIIIIIllIlIIIIlI = new IlIlIlIlIlllllllllIl(n, n2);
        llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll().llIIlllIIlllIIllIllI.llIllIIIIIllIlIIIIlI(n, n2);
    }
    
    public void llllIIIIlIIIlIlllIll(final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl) {
        if (this.IlIlIlIlIlllllllllIl.contains(ilIIIlIlIIIllIlIlIIl)) {
            net.minecraft.IlIlIIIIIIlllIlIllIl.IlIlIlIlIlllllllllIl.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll.debug("Failed to add player. {} already is in chunk {}, {}", new Object[] { ilIIIlIlIIIllIlIlIIl, this.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll, this.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl });
        }
        else {
            if (this.IlIlIlIlIlllllllllIl.isEmpty()) {
                this.llllIIIlIlllIlIIIIIl = this.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.IIIlIIlIIIIlllIlllII();
            }
            this.IlIlIlIlIlllllllllIl.add(ilIIIlIlIIIllIlIlIIl);
            ilIIIlIlIIIllIlIlIIl.IllIIlllIIIIlllIIlIl.add(this.llIllIIIIIllIlIIIIlI);
        }
    }
    
    public void IlIlIlIlIlllllllllIl(final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl) {
        if (this.IlIlIlIlIlllllllllIl.contains(ilIIIlIlIIIllIlIlIIl)) {
            final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll = this.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(this.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll, this.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl);
            if (llllIIIIlIIIlIlllIll.lIIIlllIIIllIIIllIII()) {
                ilIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(new IlIIIlIIIllllIlIlIlI(llllIIIIlIIIlIlllIll, true, 0));
            }
            this.IlIlIlIlIlllllllllIl.remove(ilIIIlIlIIIllIlIlIIl);
            ilIIIlIlIIIllIlIlIIl.IllIIlllIIIIlllIIlIl.remove(this.llIllIIIIIllIlIIIIlI);
            if (this.IlIlIlIlIlllllllllIl.isEmpty()) {
                final long n = this.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll + 2147483647L | this.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl + 2147483647L << 32;
                this.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll);
                this.llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl.IlIIIlIlIIIllIlIlIIl(n);
                this.llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl.remove(this);
                if (this.IlIlIIIllIllIIIIIllI > 0) {
                    this.llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI.remove(this);
                }
                this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll().llIIlllIIlllIIllIllI.IlIlIlIlIlllllllllIl(this.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll, this.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl);
            }
        }
    }
    
    public void llllIIIIlIIIlIlllIll() {
        this.llllIIIIlIIIlIlllIll(this.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(this.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll, this.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl));
    }
    
    private void llllIIIIlIIIlIlllIll(final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI(llllIIIIlIIIlIlllIll.IlllllllIIIlIIIlIlII() + this.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.IIIlIIlIIIIlllIlllII() - this.llllIIIlIlllIlIIIIIl);
        this.llllIIIlIlllIlIIIIIl = this.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.IIIlIIlIIIIlllIlllII();
    }
    
    public void llllIIIIlIIIlIlllIll(final int n, final int n2, final int n3) {
        if (this.IlIlIIIllIllIIIIIllI == 0) {
            this.llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI.add(this);
        }
        this.IllIIlllIIIIlllIIlIl |= 1 << (n2 >> 4);
        if (this.IlIlIIIllIllIIIIIllI < 64) {
            final short n4 = (short)(n << 12 | n3 << 8 | n2);
            for (int i = 0; i < this.IlIlIIIllIllIIIIIllI; ++i) {
                if (this.IlIIIlIlIIIllIlIlIIl[i] == n4) {
                    return;
                }
            }
            this.IlIIIlIlIIIllIlIlIIl[this.IlIlIIIllIllIIIIIllI++] = n4;
        }
    }
    
    public void llllIIIIlIIIlIlllIll(final IIlIIIIIllIlIIIlIIll ilIIIIIllIlIIIlIIll) {
        for (int i = 0; i < this.IlIlIlIlIlllllllllIl.size(); ++i) {
            final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl = this.IlIlIlIlIlllllllllIl.get(i);
            if (!ilIIIlIlIIIllIlIlIIl.IllIIlllIIIIlllIIlIl.contains(this.llIllIIIIIllIlIIIIlI)) {
                ilIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(ilIIIIIllIlIIIlIIll);
            }
        }
    }
    
    public void IlIlIlIlIlllllllllIl() {
        if (this.IlIlIIIllIllIIIIIllI != 0) {
            if (this.IlIlIIIllIllIIIIIllI == 1) {
                final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl = new net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl((this.IlIIIlIlIIIllIlIlIIl[0] >> 12 & 0xF) + this.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll * 16, this.IlIIIlIlIIIllIlIlIIl[0] & 0xFF, (this.IlIIIlIlIIIllIlIlIIl[0] >> 8 & 0xF) + this.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl * 16);
                this.llllIIIIlIIIlIlllIll(new IlllIIIIlIIIlIlIlIIl(this.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl, ilIlIlIlIlllllllllIl));
                if (this.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl).llIllIIIIIllIlIIIIlI().IIIIlllIIIIIIlIIIlll()) {
                    this.llllIIIIlIIIlIlllIll(this.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl));
                }
            }
            else if (this.IlIlIIIllIllIIIIIllI != 64) {
                this.llllIIIIlIIIlIlllIll(new IIIIIIIIIlllIllIlIlI(this.IlIlIIIllIllIIIIIllI, this.IlIIIlIlIIIllIlIlIIl, this.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(this.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll, this.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl)));
                for (int i = 0; i < this.IlIlIIIllIllIIIIIllI; ++i) {
                    final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl2 = new net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl((this.IlIIIlIlIIIllIlIlIIl[i] >> 12 & 0xF) + this.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll * 16, this.IlIIIlIlIIIllIlIlIIl[i] & 0xFF, (this.IlIIIlIlIIIllIlIlIIl[i] >> 8 & 0xF) + this.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl * 16);
                    if (this.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl2).llIllIIIIIllIlIIIIlI().IIIIlllIIIIIIlIIIlll()) {
                        this.llllIIIIlIIIlIlllIll(this.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl2));
                    }
                }
            }
            else {
                final int n = this.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll * 16;
                final int n2 = this.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl * 16;
                this.llllIIIIlIIIlIlllIll(new IlIIIlIIIllllIlIlIlI(this.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(this.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll, this.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl), false, this.IllIIlllIIIIlllIIlIl));
                for (int j = 0; j < 16; ++j) {
                    if ((this.IllIIlllIIIIlllIIlIl & 1 << j) != 0x0) {
                        final int n3 = j << 4;
                        final List llllIIIIlIIIlIlllIll = this.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(n, n3, n2, n + 16, n3 + 16, n2 + 16);
                        for (int k = 0; k < llllIIIIlIIIlIlllIll.size(); ++k) {
                            this.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll.get(k));
                        }
                    }
                }
            }
            this.IlIlIIIllIllIIIIIllI = 0;
            this.IllIIlllIIIIlllIIlIl = 0;
        }
    }
    
    private void llllIIIIlIIIlIlllIll(final net.minecraft.IlIlIIIlIIlIlIIlllIl.IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl) {
        if (ilIIIlIlIIIllIlIlIIl != null) {
            final IIlIIIIIllIlIIIlIIll iiiIlllIIIIIIlIIIlll = ilIIIlIlIIIllIlIlIIl.IIIIlllIIIIIIlIIIlll();
            if (iiiIlllIIIIIIlIIIlll != null) {
                this.llllIIIIlIIIlIlllIll(iiiIlllIIIIIIlIIIlll);
            }
        }
    }
}
