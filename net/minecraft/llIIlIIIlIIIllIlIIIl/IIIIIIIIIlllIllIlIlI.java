package net.minecraft.llIIlIIIlIIIllIlIIIl;

import net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.IIIlIIIlIlIIlllIIlll.*;
import net.minecraft.lIIIlllIIIllIIIllIII.*;
import net.minecraft.llIllIlIIIIllIlIIllI.*;

public class IIIIIIIIIlllIllIlIlI extends IIIIIllIIIIlIIIIllIl
{
    private final IIlllIIIlIlllIIlllII llllIIIIlIIIlIlllIll;
    private final llllIIIIlIIIlIlllIll IllIIlllIIIIlllIIlIl;
    private int llllIIIlIlllIlIIIIIl;
    
    public IIIIIIIIIlllIllIlIlI(final llllIIIIlIIIlIlllIll illIIlllIIIIlllIIlIl, final IIlllIIIlIlllIIlllII llllIIIIlIIIlIlllIll, final llIIIlIlIllIIlIlIlII llIIIlIlIllIIlIlIlII, final int n, final int n2, final int n3) {
        super(llIIIlIlIllIIlIlIlII, n, n2, n3);
        this.IllIIlllIIIIlllIIlIl = illIIlllIIIIlllIIlIl;
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll(final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl) {
        return false;
    }
    
    @Override
    public lllIIIIlIlIllIIlIIIl llllIIIIlIIIlIlllIll(final int n) {
        if (this.IlIlIlIlIlllllllllIl()) {
            this.llllIIIlIlllIlIIIIIl += Math.min(n, this.llllIIIIlIIIlIlllIll().IlIlIlIlIlllllllllIl);
        }
        return super.llllIIIIlIIIlIlllIll(n);
    }
    
    @Override
    protected void llllIIIIlIIIlIlllIll(final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl, final int n) {
        this.llllIIIlIlllIlIIIIIl += n;
        this.IlIlIIIllIllIIIIIllI(lllIIIIlIlIllIIlIIIl);
    }
    
    @Override
    protected void IlIlIIIllIllIIIIIllI(final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl) {
        if (this.llllIIIlIlllIlIIIIIl > 0) {
            lllIIIIlIlIllIIlIIIl.llllIIIIlIIIlIlllIll(this.IllIIlllIIIIlllIIlIl.IlllllllIIIlIIIlIlII, this.IllIIlllIIIIlllIIlIl, this.llllIIIlIlllIlIIIIIl);
        }
        this.llllIIIlIlllIlIIIIIl = 0;
        if (lllIIIIlIlIllIIlIIIl.llllIIIIlIIIlIlllIll() == net.minecraft.llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llIIIllIlIllIllIIIIl)) {
            this.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll(net.minecraft.IIIlIIIlIlIIlllIIlll.IlIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII);
        }
        if (lllIIIIlIlIllIIlIIIl.llllIIIIlIIIlIlllIll() instanceof IlIIIIIlIIllIIlIlIll) {
            this.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll(net.minecraft.IIIlIIIlIlIIlllIIlll.IlIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII);
        }
        if (lllIIIIlIlIllIIlIIIl.llllIIIIlIIIlIlllIll() == net.minecraft.llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIIlllllIIllIIlllll)) {
            this.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll(net.minecraft.IIIlIIIlIlIIlllIIlll.IlIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl);
        }
        if (lllIIIIlIlIllIIlIIIl.llllIIIIlIIIlIlllIll() instanceof IIIllIIIlIlIIllIIIlI) {
            this.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll(net.minecraft.IIIlIIIlIlIIlllIIlll.IlIlIlIlIlllllllllIl.lIlIlIIIllIIllIIIllI);
        }
        if (lllIIIIlIlIllIIlIIIl.llllIIIIlIIIlIlllIll() == IIllIIllIIIlIlIIIIlI.llIllIlIlIIIIIIIllII) {
            this.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll(net.minecraft.IIIlIIIlIlIIlllIIlll.IlIlIlIlIlllllllllIl.IlIlIIIllIIllIlllllI);
        }
        if (lllIIIIlIlIllIIlIIIl.llllIIIIlIIIlIlllIll() == IIllIIllIIIlIlIIIIlI.d) {
            this.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll(net.minecraft.IIIlIIIlIlIIlllIIlll.IlIlIlIlIlllllllllIl.IIIIlllIIIIIIlIIIlll);
        }
        if (lllIIIIlIlIllIIlIIIl.llllIIIIlIIIlIlllIll() instanceof IlIIIIIlIIllIIlIlIll && ((IlIIIIIlIIllIIlIlIll)lllIIIIlIlIllIIlIIIl.llllIIIIlIIIlIlllIll()).lllIIIIlllllIlIIllIl() != IlIlIIIlIIlIlIIlllIl.llllIIIIlIIIlIlllIll) {
            this.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll(net.minecraft.IIIlIIIlIlIIlllIIlll.IlIlIlIlIlllllllllIl.llllIIllllIlIlIIIIll);
        }
        if (lllIIIIlIlIllIIlIIIl.llllIIIIlIIIlIlllIll() instanceof IllIlllIllIIIIllllII) {
            this.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll(net.minecraft.IIIlIIIlIlIIlllIIlll.IlIlIlIlIlllllllllIl.lllIIIIlllllIlIIllIl);
        }
        if (lllIIIIlIlIllIIlIIIl.llllIIIIlIIIlIlllIll() == net.minecraft.llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.G)) {
            this.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll(net.minecraft.IIIlIIIlIlIIlllIIlll.IlIlIlIlIlllllllllIl.llIIlllIIlllIIllIllI);
        }
        if (lllIIIIlIlIllIIlIIIl.llllIIIIlIIIlIlllIll() == net.minecraft.llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lIIlIIIlIllIlIllIIIl)) {
            this.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll(net.minecraft.IIIlIIIlIlIIlllIIlll.IlIlIlIlIlllllllllIl.IIlIIIIIllIlIIIlIIll);
        }
        if (lllIIIIlIlIllIIlIIIl.llllIIIIlIIIlIlllIll() == IIllIIllIIIlIlIIIIlI.llllIllllIllllIlIlII && lllIIIIlIlIllIIlIIIl.lIIIIlIIIIIlllIllIII() == 1) {
            this.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll(net.minecraft.IIIlIIIlIlIIlllIIlll.IlIlIlIlIlllllllllIl.IIllllIIIlIIIIIIllIl);
        }
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl) {
        this.IlIlIIIllIllIIIIIllI(lllIIIIlIlIllIIlIIIl);
        final lllIIIIlIlIllIIlIIIl[] ilIlIlIlIlllllllllIl = net.minecraft.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll().IlIlIlIlIlllllllllIl(this.llllIIIIlIIIlIlllIll, llllIIIIlIIIlIlllIll.IlllllllIIIlIIIlIlII);
        for (int i = 0; i < ilIlIlIlIlllllllllIl.length; ++i) {
            final lllIIIIlIlIllIIlIIIl lIlIlIIIllIIllIIIllI = this.llllIIIIlIIIlIlllIll.lIlIlIIIllIIllIIIllI(i);
            final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl2 = ilIlIlIlIlllllllllIl[i];
            if (lIlIlIIIllIIllIIIllI != null) {
                this.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(i, 1);
            }
            if (lllIIIIlIlIllIIlIIIl2 != null) {
                if (this.llllIIIIlIIIlIlllIll.lIlIlIIIllIIllIIIllI(i) == null) {
                    this.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI(i, lllIIIIlIlIllIIlIIIl2);
                }
                else if (!this.IllIIlllIIIIlllIIlIl.lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll(lllIIIIlIlIllIIlIIIl2)) {
                    this.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll(lllIIIIlIlIllIIlIIIl2, false);
                }
            }
        }
    }
}
