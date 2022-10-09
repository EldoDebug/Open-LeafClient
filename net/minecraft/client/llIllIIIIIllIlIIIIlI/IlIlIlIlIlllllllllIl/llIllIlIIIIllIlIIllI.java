package net.minecraft.client.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl;

import java.util.*;
import com.google.common.collect.*;
import net.minecraft.llIIlIIIlIIIllIlIIIl.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.llIllIlIIIIllIlIIllI.*;

class llIllIlIIIIllIlIIllI extends IlIlIlIlIlllllllllIl
{
    public List llllIIIIlIIIlIlllIll;
    
    public llIllIlIIIIllIlIIllI(final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        this.llllIIIIlIIIlIlllIll = Lists.newArrayList();
        final IllIIlllIIIIlllIIlIl lIlIlIIIllIIllIIIllI = llllIIIIlIIIlIlllIll.lIlIlIIIllIIllIIIllI;
        for (int i = 0; i < 5; ++i) {
            for (int j = 0; j < 9; ++j) {
                this.IlIlIlIlIlllllllllIl(new IIIIIllIIIIlIIIIllIl(llIIlIIIlIIIllIlIIIl.IllIIlllIIIIlllIIlIl, i * 9 + j, 9 + j * 18, 18 + i * 18));
            }
        }
        for (int k = 0; k < 9; ++k) {
            this.IlIlIlIlIlllllllllIl(new IIIIIllIIIIlIIIIllIl(lIlIlIIIllIIllIIIllI, k, 9 + k * 18, 112));
        }
        this.llllIIIIlIIIlIlllIll(0.0f);
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll(final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        return true;
    }
    
    public void llllIIIIlIIIlIlllIll(final float n) {
        int n2 = (int)(n * ((this.llllIIIIlIIIlIlllIll.size() + 9 - 1) / 9 - 5) + 0.5);
        if (n2 < 0) {
            n2 = 0;
        }
        for (int i = 0; i < 5; ++i) {
            for (int j = 0; j < 9; ++j) {
                final int n3 = j + (i + n2) * 9;
                if (n3 >= 0 && n3 < this.llllIIIIlIIIlIlllIll.size()) {
                    llIIlIIIlIIIllIlIIIl.IllIIlllIIIIlllIIlIl.llIllIIIIIllIlIIIIlI(j + i * 9, (lllIIIIlIlIllIIlIIIl)this.llllIIIIlIIIlIlllIll.get(n3));
                }
                else {
                    llIIlIIIlIIIllIlIIIl.IllIIlllIIIIlllIIlIl.llIllIIIIIllIlIIIIlI(j + i * 9, null);
                }
            }
        }
    }
    
    public boolean llllIIIIlIIIlIlllIll() {
        return this.llllIIIIlIIIlIlllIll.size() > 45;
    }
    
    @Override
    protected void llllIIIIlIIIlIlllIll(final int n, final int n2, final boolean b, final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
    }
    
    @Override
    public lllIIIIlIlIllIIlIIIl llllIIIIlIIIlIlllIll(final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final int n) {
        if (n >= this.llIllIIIIIllIlIIIIlI.size() - 9 && n < this.llIllIIIIIllIlIIIIlI.size()) {
            final IIIIIllIIIIlIIIIllIl iiiiIllIIIIlIIIIllIl = this.llIllIIIIIllIlIIIIlI.get(n);
            if (iiiiIllIIIIlIIIIllIl != null && iiiiIllIIIIlIIIIllIl.IlIlIlIlIlllllllllIl()) {
                iiiiIllIIIIlIIIIllIl.IlIlIlIlIlllllllllIl(null);
            }
        }
        return null;
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll(final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl, final IIIIIllIIIIlIIIIllIl iiiiIllIIIIlIIIIllIl) {
        return iiiiIllIIIIlIIIIllIl.IlIlIIIllIllIIIIIllI > 90;
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll(final IIIIIllIIIIlIIIIllIl iiiiIllIIIIlIIIIllIl) {
        return iiiiIllIIIIlIIIIllIl.IlIlIlIlIlllllllllIl instanceof IllIIlllIIIIlllIIlIl || (iiiiIllIIIIlIIIIllIl.IlIlIIIllIllIIIIIllI > 90 && iiiiIllIIIIlIIIIllIl.IlIIIlIlIIIllIlIlIIl <= 162);
    }
}
