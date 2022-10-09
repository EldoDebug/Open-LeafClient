package net.minecraft.client.llIllIIIIIllIlIIIIlI;

import net.minecraft.client.*;

public class lllllIIIIIlIlIIIIIIl implements IIIIIIIIIlllIllIlIlI
{
    private final Minecraft llllIIIIlIIIlIlllIll;
    private final llIllIIIIIllIlIIIIlI IlIlIlIlIlllllllllIl;
    private final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI;
    private llIllIIIIIllIlIIIIlI IlIIIlIlIIIllIlIlIIl;
    
    public lllllIIIIIlIlIIIIIIl(final llIllIIIIIllIlIIIIlI ilIlIlIlIlllllllllIl, final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI) {
        this.llllIIIIlIIIlIlllIll = Minecraft.getMinecraft();
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
        this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
    }
    
    public llIllIIIIIllIlIIIIlI llllIIIIlIIIlIlllIll() {
        return this.IlIlIlIlIlllllllllIl;
    }
    
    public llIllIIIIIllIlIIIIlI IlIlIlIlIlllllllllIl() {
        return this.llIllIIIIIllIlIIIIlI;
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7, final boolean b) {
        this.llllIIIIlIIIlIlllIll(this.IlIlIlIlIlllllllllIl, n3, n6, n7, false);
        this.llllIIIIlIIIlIlllIll(this.llIllIIIIIllIlIIIIlI, n3, n6, n7, false);
    }
    
    private void llllIIIIlIIIlIlllIll(final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI, final int n, final int n2, final int n3, final boolean b) {
        if (llIllIIIIIllIlIIIIlI != null) {
            if (llIllIIIIIllIlIIIIlI instanceof IlIIIlIlIIIllIlIlIIl) {
                this.llllIIIIlIIIlIlllIll((IlIIIlIlIIIllIlIlIIl)llIllIIIIIllIlIIIIlI, n, n2, n3, b);
            }
            else if (llIllIIIIIllIlIIIIlI instanceof lIIlIIIIIIIlIIlIlIIl) {
                this.llllIIIIlIIIlIlllIll((lIIlIIIIIIIlIIlIlIIl)llIllIIIIIllIlIIIIlI, n, b);
            }
            else if (llIllIIIIIllIlIIIIlI instanceof IIlIIIIIllIlIIIlIIll) {
                this.llllIIIIlIIIlIlllIll((IIlIIIIIllIlIIIlIIll)llIllIIIIIllIlIIIIlI, n, n2, n3, b);
            }
        }
    }
    
    private void llllIIIIlIIIlIlllIll(final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl, final int liiIlllIIIllIIIllIII, final int n, final int n2, final boolean b) {
        ilIIIlIlIIIllIlIlIIl.lIIIlllIIIllIIIllIII = liiIlllIIIllIIIllIII;
        if (!b) {
            ilIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(this.llllIIIIlIIIlIlllIll, n, n2);
        }
    }
    
    private void llllIIIIlIIIlIlllIll(final lIIlIIIIIIIlIIlIlIIl liIlIIIIIIIlIIlIlIIl, final int illIIlllIIIIlllIIlIl, final boolean b) {
        liIlIIIIIIIlIIlIlIIl.IllIIlllIIIIlllIIlIl = illIIlllIIIIlllIIlIl;
        if (!b) {
            liIlIIIIIIIlIIlIlIIl.llllIIIlIlllIlIIIIIl();
        }
    }
    
    private void llllIIIIlIIIlIlllIll(final IIlIIIIIllIlIIIlIIll ilIIIIIllIlIIIlIIll, final int liiiIlIIIIIlllIllIII, final int n, final int n2, final boolean b) {
        ilIIIIIllIlIIIlIIll.lIIIIlIIIIIlllIllIII = liiiIlIIIIIlllIllIII;
        if (!b) {
            ilIIIIIllIlIIIlIIll.llllIIIIlIIIlIlllIll(this.llllIIIIlIIIlIlllIll, n, n2);
        }
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final int n, final int n2, final int n3) {
        this.llllIIIIlIIIlIlllIll(this.IlIlIlIlIlllllllllIl, n3, 0, 0, true);
        this.llllIIIIlIIIlIlllIll(this.llIllIIIIIllIlIIIIlI, n3, 0, 0, true);
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll(final int n, final int n2, final int n3, final int n4, final int n5, final int n6) {
        final boolean llllIIIIlIIIlIlllIll = this.llllIIIIlIIIlIlllIll(this.IlIlIlIlIlllllllllIl, n2, n3, n4);
        final boolean llllIIIIlIIIlIlllIll2 = this.llllIIIIlIIIlIlllIll(this.llIllIIIIIllIlIIIIlI, n2, n3, n4);
        return llllIIIIlIIIlIlllIll || llllIIIIlIIIlIlllIll2;
    }
    
    private boolean llllIIIIlIIIlIlllIll(final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI, final int n, final int n2, final int n3) {
        if (llIllIIIIIllIlIIIIlI == null) {
            return false;
        }
        if (llIllIIIIIllIlIIIIlI instanceof IlIIIlIlIIIllIlIlIIl) {
            return this.llllIIIIlIIIlIlllIll((IlIIIlIlIIIllIlIlIIl)llIllIIIIIllIlIIIIlI, n, n2, n3);
        }
        if (llIllIIIIIllIlIIIIlI instanceof lIIlIIIIIIIlIIlIlIIl) {
            this.llllIIIIlIIIlIlllIll((lIIlIIIIIIIlIIlIlIIl)llIllIIIIIllIlIIIIlI, n, n2, n3);
        }
        return false;
    }
    
    private boolean llllIIIIlIIIlIlllIll(final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl, final int n, final int n2, final int n3) {
        final boolean llIllIIIIIllIlIIIIlI = ilIIIlIlIIIllIlIlIIl.llIllIIIIIllIlIIIIlI(this.llllIIIIlIIIlIlllIll, n, n2);
        if (llIllIIIIIllIlIIIIlI) {
            this.IlIIIlIlIIIllIlIlIIl = ilIIIlIlIIIllIlIlIIl;
        }
        return llIllIIIIIllIlIIIIlI;
    }
    
    private void llllIIIIlIIIlIlllIll(final lIIlIIIIIIIlIIlIlIIl ilIIIlIlIIIllIlIlIIl, final int n, final int n2, final int n3) {
        ilIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(n, n2, n3);
        if (ilIIIlIlIIIllIlIlIIl.llIllIlIIIIllIlIIllI()) {
            this.IlIIIlIlIIIllIlIlIIl = ilIIIlIlIIIllIlIlIIl;
        }
    }
    
    @Override
    public void IlIlIlIlIlllllllllIl(final int n, final int n2, final int n3, final int n4, final int n5, final int n6) {
        this.IlIlIlIlIlllllllllIl(this.IlIlIlIlIlllllllllIl, n2, n3, n4);
        this.IlIlIlIlIlllllllllIl(this.llIllIIIIIllIlIIIIlI, n2, n3, n4);
    }
    
    private void IlIlIlIlIlllllllllIl(final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI, final int n, final int n2, final int n3) {
        if (llIllIIIIIllIlIIIIlI != null && llIllIIIIIllIlIIIIlI instanceof IlIIIlIlIIIllIlIlIIl) {
            this.IlIlIlIlIlllllllllIl((IlIIIlIlIIIllIlIlIIl)llIllIIIIIllIlIIIIlI, n, n2, n3);
        }
    }
    
    private void IlIlIlIlIlllllllllIl(final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl, final int n, final int n2, final int n3) {
        ilIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(n, n2);
    }
}
