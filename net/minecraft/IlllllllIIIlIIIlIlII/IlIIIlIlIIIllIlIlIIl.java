package net.minecraft.IlllllllIIIlIIIlIlII;

import com.google.common.collect.*;

class IlIIIlIlIIIllIlIlIIl extends AbstractIterator
{
    private IlIlIlIlIlllllllllIl IlIlIlIlIlllllllllIl;
    final /* synthetic */ llIllIIIIIllIlIIIIlI llllIIIIlIIIlIlllIll;
    private final /* synthetic */ IlIlIlIlIlllllllllIl llIllIIIIIllIlIIIIlI;
    private final /* synthetic */ IlIlIlIlIlllllllllIl IlIIIlIlIIIllIlIlIIl;
    
    IlIIIlIlIIIllIlIlIIl(final llIllIIIIIllIlIIIIlI llllIIIIlIIIlIlllIll, final IlIlIlIlIlllllllllIl llIllIIIIIllIlIIIIlI, final IlIlIlIlIlllllllllIl ilIIIlIlIIIllIlIlIIl) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
        this.IlIIIlIlIIIllIlIlIIl = ilIIIlIlIIIllIlIlIIl;
        this.IlIlIlIlIlllllllllIl = null;
    }
    
    protected IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll() {
        if (this.IlIlIlIlIlllllllllIl == null) {
            return this.IlIlIlIlIlllllllllIl = this.llIllIIIIIllIlIIIIlI;
        }
        if (this.IlIlIlIlIlllllllllIl.equals(this.IlIIIlIlIIIllIlIlIIl)) {
            return (IlIlIlIlIlllllllllIl)this.endOfData();
        }
        int n = this.IlIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII();
        int n2 = this.IlIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII();
        int llIIlIIIlIIIllIlIIIl = this.IlIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl();
        if (n < this.IlIIIlIlIIIllIlIlIIl.lIIIIlIIIIIlllIllIII()) {
            ++n;
        }
        else if (n2 < this.IlIIIlIlIIIllIlIlIIl.lIIIlllIIIllIIIllIII()) {
            n = this.llIllIIIIIllIlIIIIlI.lIIIIlIIIIIlllIllIII();
            ++n2;
        }
        else if (llIIlIIIlIIIllIlIIIl < this.IlIIIlIlIIIllIlIlIIl.llIIlIIIlIIIllIlIIIl()) {
            n = this.llIllIIIIIllIlIIIIlI.lIIIIlIIIIIlllIllIII();
            n2 = this.llIllIIIIIllIlIIIIlI.lIIIlllIIIllIIIllIII();
            ++llIIlIIIlIIIllIlIIIl;
        }
        return this.IlIlIlIlIlllllllllIl = new IlIlIlIlIlllllllllIl(n, n2, llIIlIIIlIIIllIlIIIl);
    }
}
