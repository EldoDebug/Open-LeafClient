package net.minecraft.client.llIllIIIIIllIlIIIIlI;

import net.minecraft.client.llIIlIIIlIIIllIlIIIl.*;
import net.minecraft.client.llIllIlIIIIllIlIIllI.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;

public class IIlllIIIlIlllIIlllII implements IIIIIIIIIlllIllIlIlI
{
    private final IlIIIlIlIIIllIlIlIIl IlIlIlIlIlllllllllIl;
    private final String llIllIIIIIllIlIIIIlI;
    private final net.minecraft.client.llIllIIIIIllIlIIIIlI.IlIIIlIlIIIllIlIlIIl IlIIIlIlIIIllIlIlIIl;
    private final net.minecraft.client.llIllIIIIIllIlIIIIlI.IlIIIlIlIIIllIlIlIIl IlIlIIIllIllIIIIIllI;
    final /* synthetic */ lIllllllIIllIlIlIlII llllIIIIlIIIlIlllIll;
    
    private IIlllIIIlIlllIIlllII(final lIllllllIIllIlIlIlII llllIIIIlIIIlIlllIll, final IlIIIlIlIIIllIlIlIIl ilIlIlIlIlllllllllIl) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
        this.llIllIIIIIllIlIIIIlI = llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl.llllIIIlIlllIlIIIIIl(), new Object[0]);
        this.IlIIIlIlIIIllIlIlIIl = new net.minecraft.client.llIllIIIIIllIlIIIIlI.IlIIIlIlIIIllIlIlIIl(0, 0, 0, 75, 20, llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl.llllIIIlIlllIlIIIIIl(), new Object[0]));
        this.IlIlIIIllIllIIIIIllI = new net.minecraft.client.llIllIIIIIllIlIIIIlI.IlIIIlIlIIIllIlIlIIl(0, 0, 0, 50, 20, llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("controls.reset", new Object[0]));
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7, final boolean b) {
        final boolean b2 = this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl == this.IlIlIlIlIlllllllllIl;
        this.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll(this.llIllIIIIIllIlIIIIlI, n2 + 90 - this.llllIIIIlIIIlIlllIll.IIlIIIIlllIlllllIlII, n3 + n5 / 2 - this.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll / 2, 16777215);
        this.IlIlIIIllIllIIIIIllI.lIIIIlIIIIIlllIllIII = n2 + 190;
        this.IlIlIIIllIllIIIIIllI.lIIIlllIIIllIIIllIII = n3;
        this.IlIlIIIllIllIIIIIllI.lIlIlIIIllIIllIIIllI = (this.IlIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII() != this.IlIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII());
        this.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll(this.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl, n6, n7);
        this.IlIIIlIlIIIllIlIlIIl.lIIIIlIIIIIlllIllIII = n2 + 105;
        this.IlIIIlIlIIIllIlIlIIl.lIIIlllIIIllIIIllIII = n3;
        this.IlIIIlIlIIIllIlIlIIl.llIIlIIIlIIIllIlIIIl = net.minecraft.client.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(this.IlIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII());
        boolean b3 = false;
        if (this.IlIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII() != 0) {
            IlIIIlIlIIIllIlIlIIl[] lllllIIIIIlIIlllIlIl;
            for (int length = (lllllIIIIIlIIlllIlIl = this.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.IIIlIIIlIlIIlllIIlll.lllllIIIIIlIIlllIlIl).length, i = 0; i < length; ++i) {
                final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl = lllllIIIIIlIIlllIlIl[i];
                if (ilIIIlIlIIIllIlIlIIl != this.IlIlIlIlIlllllllllIl && ilIIIlIlIIIllIlIlIIl.lIIIlllIIIllIIIllIII() == this.IlIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII()) {
                    b3 = true;
                    break;
                }
            }
        }
        if (b2) {
            this.IlIIIlIlIIIllIlIlIIl.llIIlIIIlIIIllIlIIIl = IlllIIIIlIIIlIlIlIIl.IlIllIlIlIIIlIlIlIII + "> " + IlllIIIIlIIIlIlIlIIl.llllIIllllIlIlIIIIll + this.IlIIIlIlIIIllIlIlIIl.llIIlIIIlIIIllIlIIIl + IlllIIIIlIIIlIlIlIIl.IlIllIlIlIIIlIlIlIII + " <";
        }
        else if (b3) {
            this.IlIIIlIlIIIllIlIlIIl.llIIlIIIlIIIllIlIIIl = IlllIIIIlIIIlIlIlIIl.IlIlIIIllIIllIlllllI + this.IlIIIlIlIIIllIlIlIIl.llIIlIIIlIIIllIlIIIl;
        }
        this.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(this.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl, n6, n7);
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll(final int n, final int n2, final int n3, final int n4, final int n5, final int n6) {
        if (this.IlIIIlIlIIIllIlIlIIl.llIllIIIIIllIlIIIIlI(this.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl, n2, n3)) {
            this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl = this.IlIlIlIlIlllllllllIl;
            return true;
        }
        if (this.IlIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI(this.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl, n2, n3)) {
            this.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.IIIlIIIlIlIIlllIIlll.llllIIIIlIIIlIlllIll(this.IlIlIlIlIlllllllllIl, this.IlIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII());
            net.minecraft.client.llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl.IlIlIlIlIlllllllllIl();
            return true;
        }
        return false;
    }
    
    @Override
    public void IlIlIlIlIlllllllllIl(final int n, final int n2, final int n3, final int n4, final int n5, final int n6) {
        this.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(n2, n3);
        this.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll(n2, n3);
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final int n, final int n2, final int n3) {
    }
}
