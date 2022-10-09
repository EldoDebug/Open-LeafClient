package net.minecraft.IlllllllIIIlIIIlIlII;

import com.google.common.collect.*;

class IllIIlllIIIIlllIIlIl extends AbstractIterator
{
    private llllIIIlIlllIlIIIIIl IlIlIlIlIlllllllllIl;
    final /* synthetic */ IlIlIIIllIllIIIIIllI llllIIIIlIIIlIlllIll;
    private final /* synthetic */ IlIlIlIlIlllllllllIl llIllIIIIIllIlIIIIlI;
    private final /* synthetic */ IlIlIlIlIlllllllllIl IlIIIlIlIIIllIlIlIIl;
    
    IllIIlllIIIIlllIIlIl(final IlIlIIIllIllIIIIIllI llllIIIIlIIIlIlllIll, final IlIlIlIlIlllllllllIl llIllIIIIIllIlIIIIlI, final IlIlIlIlIlllllllllIl ilIIIlIlIIIllIlIlIIl) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
        this.IlIIIlIlIIIllIlIlIIl = ilIIIlIlIIIllIlIlIIl;
        this.IlIlIlIlIlllllllllIl = null;
    }
    
    protected llllIIIlIlllIlIIIIIl llllIIIIlIIIlIlllIll() {
        if (this.IlIlIlIlIlllllllllIl == null) {
            return this.IlIlIlIlIlllllllllIl = new llllIIIlIlllIlIIIIIl(this.llIllIIIIIllIlIIIIlI.lIIIIlIIIIIlllIllIII(), this.llIllIIIIIllIlIIIIlI.lIIIlllIIIllIIIllIII(), this.llIllIIIIIllIlIIIIlI.llIIlIIIlIIIllIlIIIl());
        }
        if (this.IlIlIlIlIlllllllllIl.equals(this.IlIIIlIlIIIllIlIlIIl)) {
            return (llllIIIlIlllIlIIIIIl)this.endOfData();
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
        llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll(this.IlIlIlIlIlllllllllIl, n);
        llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl(this.IlIlIlIlIlllllllllIl, n2);
        llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI(this.IlIlIlIlIlllllllllIl, llIIlIIIlIIIllIlIIIl);
        return this.IlIlIlIlIlllllllllIl;
    }
}
