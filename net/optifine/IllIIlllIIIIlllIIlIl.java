package net.optifine;

import com.google.common.collect.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;

class IllIIlllIIIIlllIIlIl extends AbstractIterator
{
    private IlIIIlIlIIIllIlIlIIl IlIlIlIlIlllllllllIl;
    final /* synthetic */ IlIlIIIllIllIIIIIllI llllIIIIlIIIlIlllIll;
    private final /* synthetic */ IlIlIlIlIlllllllllIl llIllIIIIIllIlIIIIlI;
    private final /* synthetic */ IlIlIlIlIlllllllllIl IlIIIlIlIIIllIlIlIIl;
    
    IllIIlllIIIIlllIIlIl(final IlIlIIIllIllIIIIIllI llllIIIIlIIIlIlllIll, final IlIlIlIlIlllllllllIl llIllIIIIIllIlIIIIlI, final IlIlIlIlIlllllllllIl ilIIIlIlIIIllIlIlIIl) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
        this.IlIIIlIlIIIllIlIlIIl = ilIIIlIlIIIllIlIlIIl;
        this.IlIlIlIlIlllllllllIl = null;
    }
    
    protected IlIIIlIlIIIllIlIlIIl llllIIIIlIIIlIlllIll() {
        if (this.IlIlIlIlIlllllllllIl == null) {
            return this.IlIlIlIlIlllllllllIl = new IlIIIlIlIIIllIlIlIIl(this.llIllIIIIIllIlIIIIlI.lIIIIlIIIIIlllIllIII(), this.llIllIIIIIllIlIIIIlI.lIIIlllIIIllIIIllIII(), this.llIllIIIIIllIlIIIIlI.llIIlIIIlIIIllIlIIIl(), 3);
        }
        if (this.IlIlIlIlIlllllllllIl.equals(this.IlIIIlIlIIIllIlIlIIl)) {
            return (IlIIIlIlIIIllIlIlIIl)this.endOfData();
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
        this.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl(n, n2, llIIlIIIlIIIllIlIIIl);
        return this.IlIlIlIlIlllllllllIl;
    }
    
    protected Object computeNext() {
        return this.llllIIIIlIIIlIlllIll();
    }
}
