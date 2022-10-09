package net.minecraft.client.IlIIIlIlIIIllIlIlIIl;

import java.util.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.*;

public class IlIlIIIIIIlllIlIllIl extends IlIIIlIlIIIllIlIlIIl
{
    IIlIIIIIllIlIIIlIIll llllIIIIlIIIlIlllIll;
    IIlIIIIIllIlIIIlIIll[] IlIlIlIlIlllllllllIl;
    
    public IlIlIIIIIIlllIlIllIl() {
        this.IlIlIlIlIlllllllllIl = new IIlIIIIIllIlIIIlIIll[9];
        final int n = -16;
        (this.llllIIIIlIIIlIlllIll = new IIlIIIIIllIlIIIlIIll(this, 0, 0)).llllIIIIlIIIlIlllIll(-8.0f, -8.0f, -8.0f, 16, 16, 16);
        final IIlIIIIIllIlIIIlIIll llllIIIIlIIIlIlllIll = this.llllIIIIlIIIlIlllIll;
        llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl += 24 + n;
        final Random random = new Random(1660L);
        for (int i = 0; i < this.IlIlIlIlIlllllllllIl.length; ++i) {
            this.IlIlIlIlIlllllllllIl[i] = new IIlIIIIIllIlIIIlIIll(this, 0, 0);
            final float llIllIIIIIllIlIIIIlI = ((i % 3 - i / 3 % 2 * 0.5f + 0.25f) / 2.0f * 2.0f - 1.0f) * 5.0f;
            final float ilIlIIIllIllIIIIIllI = (i / 3 / 2.0f * 2.0f - 1.0f) * 5.0f;
            this.IlIlIlIlIlllllllllIl[i].llllIIIIlIIIlIlllIll(-1.0f, 0.0f, -1.0f, 2, random.nextInt(7) + 8, 2);
            this.IlIlIlIlIlllllllllIl[i].llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
            this.IlIlIlIlIlllllllllIl[i].IlIlIIIllIllIIIIIllI = ilIlIIIllIllIIIIIllI;
            this.IlIlIlIlIlllllllllIl[i].IlIIIlIlIIIllIlIlIIl = (float)(31 + n);
        }
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final float n, final float n2, final float n3, final float n4, final float n5, final float n6, final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI) {
        for (int i = 0; i < this.IlIlIlIlIlllllllllIl.length; ++i) {
            this.IlIlIlIlIlllllllllIl[i].IllIIlllIIIIlllIIlIl = 0.2f * llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(n3 * 0.3f + i) + 0.4f;
        }
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI, final float n, final float n2, final float n3, final float n4, final float n5, final float n6) {
        this.llllIIIIlIIIlIlllIll(n, n2, n3, n4, n5, n6, llIllIIIIIllIlIIIIlI);
        lllllIlIIIlIlIIlllII.lllllIlIIIlIlIIlllII();
        lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(0.0f, 0.6f, 0.0f);
        this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(n6);
        IIlIIIIIllIlIIIlIIll[] ilIlIlIlIlllllllllIl;
        for (int length = (ilIlIlIlIlllllllllIl = this.IlIlIlIlIlllllllllIl).length, i = 0; i < length; ++i) {
            ilIlIlIlIlllllllllIl[i].llllIIIIlIIIlIlllIll(n6);
        }
        lllllIlIIIlIlIIlllII.lIllllllIIllIlIlIlII();
    }
}
