package net.minecraft.llllIIIIlIIIlIlllIll;

import net.minecraft.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.*;
import net.minecraft.IlIIIlIlIIIllIlIlIIl.*;
import java.util.*;
import net.minecraft.llIllIlIIIIllIlIIllI.*;
import com.google.common.base.*;
import net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.*;

public abstract class lIIllIIIllllIlllIllI extends IIlIIIIlllIlllllIlII
{
    protected IlIIIlIlIIIllIlIlIIl IIIIIIIIIlllIllIlIlI;
    
    protected lIIllIIIllllIlllIllI() {
        this.lIIIIlIIIIIlllIllIII(this.IIIIIllIIIIlIIIIllIl.IlIlIlIlIlllllllllIl().llllIIIIlIIIlIlllIll(this.IlIllllIIlIIlIlIlIll(), (this.IllIllIIIIlIIlIlllII() == IIllIIIlIIlIlIlIIIII.IlIlIlIlIlllllllllIl) ? llIllIIlllllllllllll.IlIlIlIlIlllllllllIl : llIllIIlllllllllllll.llllIIIIlIIIlIlllIll));
    }
    
    @Override
    public int IlIIIlIlIIIllIlIlIIl(final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl) {
        return ((llIllIIlllllllllllll)llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(this.IlIllllIIlIIlIlIlIll())).llIllIIIIIllIlIIIIlI();
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final net.minecraft.llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl, final net.minecraft.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final List list) {
        llIllIIlllllllllllll[] llllIIIIlIIIlIlllIll2;
        for (int length = (llllIIIIlIIIlIlllIll2 = llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(this.IllIllIIIIlIIlIlllII())).length, i = 0; i < length; ++i) {
            list.add(new lllIIIIlIlIllIIlIIIl(ilIIIlIlIIIllIlIlIIl, 1, llllIIIIlIIIlIlllIll2[i].llIllIIIIIllIlIIIIlI()));
        }
    }
    
    @Override
    public llIIlIIIlIIIllIlIIIl llIllIIIIIllIlIIIIlI(final int n) {
        return this.lllIllIIIllllllIllll().llllIIIIlIIIlIlllIll(this.IlIllllIIlIIlIlIlIll(), llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(this.IllIllIIIIlIIlIlllII(), n));
    }
    
    public abstract IIllIIIlIIlIlIlIIIII IllIllIIIIlIIlIlllII();
    
    public net.minecraft.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll IlIllllIIlIIlIlIlIll() {
        if (this.IIIIIIIIIlllIllIlIlI == null) {
            this.IIIIIIIIIlllIllIlIlI = net.minecraft.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll("type", llIllIIlllllllllllll.class, (Predicate)new IllIlIllIllIlllIIlll(this));
        }
        return this.IIIIIIIIIlllIllIlIlI;
    }
    
    @Override
    public int llIllIIIIIllIlIIIIlI(final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl) {
        return ((llIllIIlllllllllllll)llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(this.IlIllllIIlIIlIlIlIll())).llIllIIIIIllIlIIIIlI();
    }
    
    @Override
    protected IlIlIlIlIlllllllllIl IIllllIIIlIIIIIIllIl() {
        return new IlIlIlIlIlllllllllIl(this, new net.minecraft.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll[] { this.IlIllllIIlIIlIlIlIll() });
    }
    
    @Override
    public IllIIlllIIIIlllIIlIl llIllIlIlIIIIIIIllII() {
        return net.minecraft.llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl.IlIlIlIlIlllllllllIl;
    }
}
