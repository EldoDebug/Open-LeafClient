package net.minecraft.llIIlIIIlIIIllIlIIIl;

import net.minecraft.IlIlIIIlIIlIlIIlllIl.*;
import net.minecraft.llIllIlIIIIllIlIIllI.*;
import net.minecraft.lIlIlIIIllIIllIIIllI.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.*;

public class IIlIIIIIllIlIIIlIIll extends lIllllllIIllIlIlIlII
{
    private IlIlIIIlIIlIlIIlllIl llllIIIIlIIIlIlllIll;
    
    public IIlIIIIIllIlIIIlIIll() {
        super("container.enderchest", false, 27);
    }
    
    public void llllIIIIlIIIlIlllIll(final IlIlIIIlIIlIlIIlllIl llllIIIIlIIIlIlllIll) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
    }
    
    public void llllIIIIlIIIlIlllIll(final net.minecraft.lIlIlIIIllIIllIIIllI.IlIlIIIlIIlIlIIlllIl ilIlIIIlIIlIlIIlllIl) {
        for (int i = 0; i < this.lIIIlllIIIllIIIllIII(); ++i) {
            this.llIllIIIIIllIlIIIIlI(i, null);
        }
        for (int j = 0; j < ilIlIIIlIIlIlIIlllIl.IlIlIIIllIllIIIIIllI(); ++j) {
            final IIIIlllIIIIIIlIIIlll ilIlIlIlIlllllllllIl = ilIlIIIlIIlIlIIlllIl.IlIlIlIlIlllllllllIl(j);
            final int n = ilIlIlIlIlllllllllIl.IlIIIlIlIIIllIlIlIIl("Slot") & 0xFF;
            if (n >= 0 && n < this.lIIIlllIIIllIIIllIII()) {
                this.llIllIIIIIllIlIIIIlI(n, lllIIIIlIlIllIIlIIIl.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl));
            }
        }
    }
    
    public net.minecraft.lIlIlIIIllIIllIIIllI.IlIlIIIlIIlIlIIlllIl IlIIIlIlIIIllIlIlIIl() {
        final net.minecraft.lIlIlIIIllIIllIIIllI.IlIlIIIlIIlIlIIlllIl ilIlIIIlIIlIlIIlllIl = new net.minecraft.lIlIlIIIllIIllIIIllI.IlIlIIIlIIlIlIIlllIl();
        for (int i = 0; i < this.lIIIlllIIIllIIIllIII(); ++i) {
            final lllIIIIlIlIllIIlIIIl lIlIlIIIllIIllIIIllI = this.lIlIlIIIllIIllIIIllI(i);
            if (lIlIlIIIllIIllIIIllI != null) {
                final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll = new IIIIlllIIIIIIlIIIlll();
                iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("Slot", (byte)i);
                lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl(iiiIlllIIIIIIlIIIlll);
                ilIlIIIlIIlIlIIlllIl.llllIIIIlIIIlIlllIll(iiiIlllIIIIIIlIIIlll);
            }
        }
        return ilIlIIIlIIlIlIIlllIl;
    }
    
    @Override
    public boolean IlIIIlIlIIIllIlIlIIl(final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        return (this.llllIIIIlIIIlIlllIll == null || this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll)) && super.IlIIIlIlIIIllIlIlIIl(llllIIIIlIIIlIlllIll);
    }
    
    @Override
    public void IlIlIIIllIllIIIIIllI(final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        if (this.llllIIIIlIIIlIlllIll != null) {
            this.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl();
        }
        super.IlIlIIIllIllIIIIIllI(llllIIIIlIIIlIlllIll);
    }
    
    @Override
    public void IllIIlllIIIIlllIIlIl(final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        if (this.llllIIIIlIIIlIlllIll != null) {
            this.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI();
        }
        super.IllIIlllIIIIlllIIlIl(llllIIIIlIIIlIlllIll);
        this.llllIIIIlIIIlIlllIll = null;
    }
}
