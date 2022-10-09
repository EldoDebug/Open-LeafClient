package net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll;

import net.minecraft.IlllllllIIIlIIIlIlII.*;
import java.util.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;

public class IlIlIIIlIIlIlIIlllIl extends IlIIlIlIIIlIIlIlIlII
{
    private boolean llllIIIIlIIIlIlllIll;
    private int IlIlIlIlIlllllllllIl;
    private final Class[] llIllIIIIIllIlIIIIlI;
    
    public IlIlIIIlIIlIlIIlllIl(final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final boolean llllIIIIlIIIlIlllIll, final Class... llIllIIIIIllIlIIIIlI) {
        super(llIIlIIIlIIIllIlIIIl, false);
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
        this.llllIIIIlIIIlIlllIll(1);
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll() {
        return this.IlIlIIIllIllIIIIIllI.D() != this.IlIlIlIlIlllllllllIl && this.llllIIIIlIIIlIlllIll(this.IlIlIIIllIllIIIIIllI.C(), false);
    }
    
    @Override
    public void IlIlIIIllIllIIIIIllI() {
        this.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl(this.IlIlIIIllIllIIIIIllI.C());
        this.IlIlIlIlIlllllllllIl = this.IlIlIIIllIllIIIIIllI.D();
        if (this.llllIIIIlIIIlIlllIll) {
            final double liiiIlIIIIIlllIllIII = this.lIIIIlIIIIIlllIllIII();
            for (final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl : this.IlIlIIIllIllIIIIIllI.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(this.IlIlIIIllIllIIIIIllI.getClass(), new llllIIIIlIIIlIlllIll(this.IlIlIIIllIllIIIIIllI.IIlllIlIIllIlIlIlIIl, this.IlIlIIIllIllIIIIIllI.llIIIlIlIllIIlIlIlII, this.IlIlIIIllIllIIIIIllI.lllllIlIIIlIlIIlllII, this.IlIlIIIllIllIIIIIllI.IIlllIlIIllIlIlIlIIl + 1.0, this.IlIlIIIllIllIIIIIllI.llIIIlIlIllIIlIlIlII + 1.0, this.IlIlIIIllIllIIIIIllI.lllllIlIIIlIlIIlllII + 1.0).IlIlIlIlIlllllllllIl(liiiIlIIIIIlllIllIII, 10.0, liiiIlIIIIIlllIllIII))) {
                if (this.IlIlIIIllIllIIIIIllI != llIIlIIIlIIIllIlIIIl && llIIlIIIlIIIllIlIIIl.IIlllIIIlIlllIIlllII() == null && !llIIlIIIlIIIllIlIIIl.IlIIIlIlIIIllIlIlIIl(this.IlIlIIIllIllIIIIIllI.C())) {
                    boolean b = false;
                    Class[] llIllIIIIIllIlIIIIlI;
                    for (int length = (llIllIIIIIllIlIIIIlI = this.llIllIIIIIllIlIIIIlI).length, i = 0; i < length; ++i) {
                        if (llIIlIIIlIIIllIlIIIl.getClass() == llIllIIIIIllIlIIIIlI[i]) {
                            b = true;
                            break;
                        }
                    }
                    if (b) {
                        continue;
                    }
                    this.llllIIIIlIIIlIlllIll(llIIlIIIlIIIllIlIIIl, this.IlIlIIIllIllIIIIIllI.C());
                }
            }
        }
        super.IlIlIIIllIllIIIIIllI();
    }
    
    protected void llllIIIIlIIIlIlllIll(final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final lllIIIIlllllIlIIllIl lllIIIIlllllIlIIllIl) {
        llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl(lllIIIIlllllIlIIllIl);
    }
}
