package net.minecraft.client.llIllIIIIIllIlIIIIlI;

import net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIIIllIllIIIIIllI.*;
import net.minecraft.llIllIlIIIIllIlIIllI.*;
import net.minecraft.lIIIlllIIIllIIIllIII.*;
import net.minecraft.client.llIIlIIIlIIIllIlIIIl.*;

class IlIlIIIllIIllIlllllI extends lllIIIIlIlIllIIlIIIl
{
    public int llllIIIIlIIIlIlllIll;
    final /* synthetic */ lIlIlIIIllIIllIIIllI IlIlIlIlIlllllllllIl;
    
    public IlIlIIIllIIllIlllllI(final lIlIlIIIllIIllIIIllI ilIlIlIlIlllllllllIl) {
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
        super(ilIlIlIlIlllllllllIl.IlIlIIIllIIllIlllllI, ilIlIlIlIlllllllllIl.llllIIllllIlIlIIIIll, ilIlIlIlIlllllllllIl.IlIllIlIlIIIlIlIlIII, 43, ilIlIlIlIlllllllllIl.IlIllIlIlIIIlIlIlIII - 60, 24);
        this.llllIIIIlIIIlIlllIll = -1;
    }
    
    private void llllIIIIlIIIlIlllIll(final int n, final int n2, final net.minecraft.llIllIlIIIIllIlIIllI.lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl) {
        this.IlIlIIIllIllIIIIIllI(n + 1, n2 + 1);
        lllllIlIIIlIlIIlllII.IlIlIllllllllIIIIlII();
        if (lllIIIIlIlIllIIlIIIl != null && lllIIIIlIlIllIIlIIIl.llllIIIIlIIIlIlllIll() != null) {
            lIlIIlllIIlIIlIlllIl.llIllIIIIIllIlIIIIlI();
            this.IlIlIlIlIlllllllllIl.IIIIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll(lllIIIIlIlIllIIlIIIl, n + 2, n2 + 2);
            lIlIIlllIIlIIlIlllIl.llllIIIIlIIIlIlllIll();
        }
        lllllIlIIIlIlIIlllII.IIlllIlIIllIlIlIlIIl();
    }
    
    private void IlIlIIIllIllIIIIIllI(final int n, final int n2) {
        this.IlIIIlIlIIIllIlIlIIl(n, n2, 0, 0);
    }
    
    private void IlIIIlIlIIIllIlIlIIl(final int n, final int n2, final int n3, final int n4) {
        lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI(1.0f, 1.0f, 1.0f, 1.0f);
        this.llIllIIIIIllIlIIIIlI.lllIllIIIllllllIllll().llllIIIIlIIIlIlllIll(net.minecraft.client.llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl);
        final IIlllIIlllIIIlIlllII llllIIIIlIIIlIlllIll = IIlllIIlllIIIlIlllII.llllIIIIlIIIlIlllIll();
        final lIIllIIIllllIlllIllI llIllIIIIIllIlIIIIlI = llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI();
        llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(7, net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll.lIIIlllIIIllIIIllIII);
        llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(n + 0, n2 + 18, (double)this.IlIlIlIlIlllllllllIl.IlIIIlIlIIIllIlIlIIl).llllIIIIlIIIlIlllIll((n3 + 0) * 0.0078125f, (n4 + 18) * 0.0078125f).IlIlIIIllIllIIIIIllI();
        llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(n + 18, n2 + 18, (double)this.IlIlIlIlIlllllllllIl.IlIIIlIlIIIllIlIlIIl).llllIIIIlIIIlIlllIll((n3 + 18) * 0.0078125f, (n4 + 18) * 0.0078125f).IlIlIIIllIllIIIIIllI();
        llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(n + 18, n2 + 0, (double)this.IlIlIlIlIlllllllllIl.IlIIIlIlIIIllIlIlIIl).llllIIIIlIIIlIlllIll((n3 + 18) * 0.0078125f, (n4 + 0) * 0.0078125f).IlIlIIIllIllIIIIIllI();
        llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(n + 0, n2 + 0, (double)this.IlIlIlIlIlllllllllIl.IlIIIlIlIIIllIlIlIIl).llllIIIIlIIIlIlllIll((n3 + 0) * 0.0078125f, (n4 + 0) * 0.0078125f).IlIlIIIllIllIIIIIllI();
        llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl();
    }
    
    @Override
    protected int llllIIIIlIIIlIlllIll() {
        return this.IlIlIlIlIlllllllllIl.IllIIlllIIIIlllIIlIl.llIllIIIIIllIlIIIIlI().size();
    }
    
    @Override
    protected void llllIIIIlIIIlIlllIll(final int llllIIIIlIIIlIlllIll, final boolean b, final int n, final int n2) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.IlIlIlIlIlllllllllIl.llllIIIlIlllIlIIIIIl();
    }
    
    @Override
    protected boolean llllIIIIlIIIlIlllIll(final int n) {
        return n == this.llllIIIIlIIIlIlllIll;
    }
    
    @Override
    protected void IlIlIlIlIlllllllllIl() {
    }
    
    @Override
    protected void llllIIIIlIIIlIlllIll(final int n, final int n2, final int n3, final int n4, final int n5, final int n6) {
        final llIllIlIIIIllIlIIllI llIllIlIIIIllIlIIllI = this.IlIlIlIlIlllllllllIl.IllIIlllIIIIlllIIlIl.llIllIIIIIllIlIIIIlI().get(this.IlIlIlIlIlllllllllIl.IllIIlllIIIIlllIIlIl.llIllIIIIIllIlIIIIlI().size() - n - 1);
        final net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.llIIlIIIlIIIllIlIIIl ilIlIlIlIlllllllllIl = llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl();
        final net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llIllIIIIIllIlIIIIlI = ilIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI();
        IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl = net.minecraft.llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI);
        net.minecraft.llIllIlIIIIllIlIIllI.lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl = (llIllIIIIIllIlIIIIlI != net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll && ilIIIlIlIIIllIlIlIIl != null) ? new net.minecraft.llIllIlIIIIllIlIIllI.lllIIIIlIlIllIIlIIIl(ilIIIlIlIIIllIlIlIIl, 1, llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI(ilIlIlIlIlllllllllIl)) : null;
        String lllllIlIIIlIlIIlllII = (lllIIIIlIlIllIIlIIIl == null) ? "Air" : ilIIIlIlIIIllIlIlIIl.llllIIIlIlllIlIIIIIl(lllIIIIlIlIllIIlIIIl);
        if (ilIIIlIlIIIllIlIlIIl == null) {
            if (llIllIIIIIllIlIIIIlI != net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl && llIllIIIIIllIlIIIIlI != net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lIIIlllIIIllIIIllIII) {
                if (llIllIIIIIllIlIIIIlI == net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lIlIlIIIllIIllIIIllI || llIllIIIIIllIlIIIIlI == net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llIllIlIIIIllIlIIllI) {
                    ilIIIlIlIIIllIlIlIIl = net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.IlIllllIIIlIllIlIIll;
                }
            }
            else {
                ilIIIlIlIIIllIlIlIIl = net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.lllllIIIIIlIIlllIlIl;
            }
            if (ilIIIlIlIIIllIlIlIIl != null) {
                lllIIIIlIlIllIIlIIIl = new net.minecraft.llIllIlIIIIllIlIIllI.lllIIIIlIlIllIIlIIIl(ilIIIlIlIIIllIlIlIIl, 1, llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI(ilIlIlIlIlllllllllIl));
                lllllIlIIIlIlIIlllII = llIllIIIIIllIlIIIIlI.lllllIlIIIlIlIIlllII();
            }
        }
        this.llllIIIIlIIIlIlllIll(n2, n3, lllIIIIlIlIllIIlIIIl);
        this.IlIlIlIlIlllllllllIl.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll(lllllIlIIIlIlIIlllII, n2 + 18 + 5, n3 + 3, 16777215);
        String s;
        if (n == 0) {
            s = net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("createWorld.customize.flat.layer.top", llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll());
        }
        else if (n == this.IlIlIlIlIlllllllllIl.IllIIlllIIIIlllIIlIl.llIllIIIIIllIlIIIIlI().size() - 1) {
            s = net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("createWorld.customize.flat.layer.bottom", llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll());
        }
        else {
            s = net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("createWorld.customize.flat.layer", llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll());
        }
        this.IlIlIlIlIlllllllllIl.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll(s, n2 + 2 + 213 - this.IlIlIlIlIlllllllllIl.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll(s), n3 + 3, 16777215);
    }
    
    @Override
    protected int llllIIIlIlllIlIIIIIl() {
        return this.IlIIIlIlIIIllIlIlIIl - 70;
    }
}
