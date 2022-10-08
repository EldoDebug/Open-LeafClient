package net.minecraft.IIIIlllIIIIIIlIIIlll;

import net.minecraft.IIIlIIlIIIIlllIlllII.*;

public class llIllIIIIIllIlIIIIlI
{
    private llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll;
    private lIIIIlIIIIIlllIllIII[] IlIlIlIlIlllllllllIl;
    private net.minecraft.IIIlIIlIIIIlllIlllII.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll llIllIIIIIllIlIIIIlI;
    
    public llIllIIIIIllIlIIIIlI(final net.minecraft.IIIlIIlIIIIlllIlllII.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll llIllIIIIIllIlIIIIlI) {
        this.llllIIIIlIIIlIlllIll = new llllIIIIlIIIlIlllIll();
        this.IlIlIlIlIlllllllllIl = new lIIIIlIIIIIlllIllIII[32];
        this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
    }
    
    public IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll(final lIlIlIIIllIIllIIIllI lIlIlIIIllIIllIIIllI, final net.minecraft.llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI, final net.minecraft.llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI2, final float n) {
        return this.llllIIIIlIIIlIlllIll(lIlIlIIIllIIllIIIllI, llIllIIIIIllIlIIIIlI, llIllIIIIIllIlIIIIlI2.IIlllIlIIllIlIlIlIIl, llIllIIIIIllIlIIIIlI2.IlIIlllIIlIlllllIIlI().IlIlIlIlIlllllllllIl, llIllIIIIIllIlIIIIlI2.lllllIlIIIlIlIIlllII, n);
    }
    
    public IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll(final lIlIlIIIllIIllIIIllI lIlIlIIIllIIllIIIllI, final net.minecraft.llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final float n) {
        return this.llllIIIIlIIIlIlllIll(lIlIlIIIllIIllIIIllI, llIllIIIIIllIlIIIIlI, ilIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII() + 0.5f, ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII() + 0.5f, ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl() + 0.5f, n);
    }
    
    private IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll(final lIlIlIIIllIIllIIIllI lIlIlIIIllIIllIIIllI, final net.minecraft.llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI, final double n, final double n2, final double n3, final float n4) {
        this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll();
        this.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(lIlIlIIIllIIllIIIllI, llIllIIIIIllIlIIIIlI);
        final IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll = this.llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI, this.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI), this.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI, n, n2, n3), n4);
        this.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll();
        return llllIIIIlIIIlIlllIll;
    }
    
    private IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll(final net.minecraft.llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI, final lIIIIlIIIIIlllIllIII liiiIlIIIIIlllIllIII, final lIIIIlIIIIIlllIllIII liiiIlIIIIIlllIllIII2, final float n) {
        liiiIlIIIIIlllIllIII.IlIlIIIllIllIIIIIllI = 0.0f;
        liiiIlIIIIIlllIllIII.IllIIlllIIIIlllIIlIl = liiiIlIIIIIlllIllIII.IlIlIlIlIlllllllllIl(liiiIlIIIIIlllIllIII2);
        liiiIlIIIIIlllIllIII.llllIIIlIlllIlIIIIIl = liiiIlIIIIIlllIllIII.IllIIlllIIIIlllIIlIl;
        this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll();
        this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(liiiIlIIIIIlllIllIII);
        lIIIIlIIIIIlllIllIII liiiIlIIIIIlllIllIII3 = liiiIlIIIIIlllIllIII;
        while (!this.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI()) {
            final lIIIIlIIIIIlllIllIII ilIlIlIlIlllllllllIl = this.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl();
            if (ilIlIlIlIlllllllllIl.equals(liiiIlIIIIIlllIllIII2)) {
                return this.llllIIIIlIIIlIlllIll(liiiIlIIIIIlllIllIII, liiiIlIIIIIlllIllIII2);
            }
            if (ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl(liiiIlIIIIIlllIllIII2) < liiiIlIIIIIlllIllIII3.IlIlIlIlIlllllllllIl(liiiIlIIIIIlllIllIII2)) {
                liiiIlIIIIIlllIllIII3 = ilIlIlIlIlllllllllIl;
            }
            ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII = true;
            for (int llllIIIIlIIIlIlllIll = this.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(this.IlIlIlIlIlllllllllIl, llIllIIIIIllIlIIIIlI, ilIlIlIlIlllllllllIl, liiiIlIIIIIlllIllIII2, n), i = 0; i < llllIIIIlIIIlIlllIll; ++i) {
                final lIIIIlIIIIIlllIllIII liiiIlIIIIIlllIllIII4 = this.IlIlIlIlIlllllllllIl[i];
                final float ilIlIIIllIllIIIIIllI = ilIlIlIlIlllllllllIl.IlIlIIIllIllIIIIIllI + ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl(liiiIlIIIIIlllIllIII4);
                if (ilIlIIIllIllIIIIIllI < n * 2.0f && (!liiiIlIIIIIlllIllIII4.llllIIIIlIIIlIlllIll() || ilIlIIIllIllIIIIIllI < liiiIlIIIIIlllIllIII4.IlIlIIIllIllIIIIIllI)) {
                    liiiIlIIIIIlllIllIII4.lIIIIlIIIIIlllIllIII = ilIlIlIlIlllllllllIl;
                    liiiIlIIIIIlllIllIII4.IlIlIIIllIllIIIIIllI = ilIlIIIllIllIIIIIllI;
                    liiiIlIIIIIlllIllIII4.IllIIlllIIIIlllIIlIl = liiiIlIIIIIlllIllIII4.IlIlIlIlIlllllllllIl(liiiIlIIIIIlllIllIII2);
                    if (liiiIlIIIIIlllIllIII4.llllIIIIlIIIlIlllIll()) {
                        this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(liiiIlIIIIIlllIllIII4, liiiIlIIIIIlllIllIII4.IlIlIIIllIllIIIIIllI + liiiIlIIIIIlllIllIII4.IllIIlllIIIIlllIIlIl);
                    }
                    else {
                        liiiIlIIIIIlllIllIII4.llllIIIlIlllIlIIIIIl = liiiIlIIIIIlllIllIII4.IlIlIIIllIllIIIIIllI + liiiIlIIIIIlllIllIII4.IllIIlllIIIIlllIIlIl;
                        this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(liiiIlIIIIIlllIllIII4);
                    }
                }
            }
        }
        if (liiiIlIIIIIlllIllIII3 == liiiIlIIIIIlllIllIII) {
            return null;
        }
        return this.llllIIIIlIIIlIlllIll(liiiIlIIIIIlllIllIII, liiiIlIIIIIlllIllIII3);
    }
    
    private IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll(final lIIIIlIIIIIlllIllIII liiiIlIIIIIlllIllIII, final lIIIIlIIIIIlllIllIII liiiIlIIIIIlllIllIII2) {
        int n = 1;
        for (lIIIIlIIIIIlllIllIII liiiIlIIIIIlllIllIII3 = liiiIlIIIIIlllIllIII2; liiiIlIIIIIlllIllIII3.lIIIIlIIIIIlllIllIII != null; liiiIlIIIIIlllIllIII3 = liiiIlIIIIIlllIllIII3.lIIIIlIIIIIlllIllIII) {
            ++n;
        }
        final lIIIIlIIIIIlllIllIII[] array = new lIIIIlIIIIIlllIllIII[n];
        lIIIIlIIIIIlllIllIII liiiIlIIIIIlllIllIII4 = liiiIlIIIIIlllIllIII2;
        --n;
        array[n] = liiiIlIIIIIlllIllIII2;
        while (liiiIlIIIIIlllIllIII4.lIIIIlIIIIIlllIllIII != null) {
            liiiIlIIIIIlllIllIII4 = liiiIlIIIIIlllIllIII4.lIIIIlIIIIIlllIllIII;
            --n;
            array[n] = liiiIlIIIIIlllIllIII4;
        }
        return new IlIlIlIlIlllllllllIl(array);
    }
}
