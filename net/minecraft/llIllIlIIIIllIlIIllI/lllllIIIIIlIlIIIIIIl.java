package net.minecraft.llIllIlIIIIllIlIIllI;

import net.minecraft.IlIIIlIlIIIllIlIlIIl.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.IIIlIIIlIlIIlllIIlll.*;

public class lllllIIIIIlIlIIIIIIl extends IlIIIlIlIIIllIlIlIIl
{
    public lllllIIIIIlIlIIIIIIl() {
        this.IlIIIlIlIIIllIlIlIIl(64);
        this.IlIlIlIlIlllllllllIl(1);
        this.llllIIIIlIIIlIlllIll(net.minecraft.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll.lIIIlllIIIllIIIllIII);
    }
    
    @Override
    public boolean IllIIlllIIIIlllIIlIl() {
        return true;
    }
    
    @Override
    public boolean llllIIIlIlllIlIIIIIl() {
        return true;
    }
    
    @Override
    public lllIIIIlIlIllIIlIIIl llllIIIIlIIIlIlllIll(final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl, final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        if (llllIIIIlIIIlIlllIll.Q != null) {
            lllIIIIlIlIllIIlIIIl.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll.Q.lIIIIlIIIIIlllIllIII(), llllIIIIlIIIlIlllIll);
            llllIIIIlIIIlIlllIll.IIlIIIIlllIlllllIlII();
        }
        else {
            illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll((llIllIIIIIllIlIIIIlI)llllIIIIlIIIlIlllIll, "random.bow", 0.5f, 0.4f / (lllllIIIIIlIlIIIIIIl.llIllIIIIIllIlIIIIlI.nextFloat() * 0.4f + 0.8f));
            if (!illlllllIIIlIIIlIlII.IlIlIllllllllIIIIlII) {
                illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(new net.minecraft.llllIIIlIlllIlIIIIIl.lIIIIlIIIIIlllIllIII.IlIIIlIlIIIllIlIlIIl(illlllllIIIlIIIlIlII, llllIIIIlIIIlIlllIll));
            }
            llllIIIIlIIIlIlllIll.IIlIIIIlllIlllllIlII();
            llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(IIIIlllIIIIIIlIIIlll.IlIIllIIllIIllIIlIIl[net.minecraft.llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(this)]);
        }
        return lllIIIIlIlIllIIlIIIl;
    }
    
    @Override
    public boolean llIIlIIIlIIIllIlIIIl(final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl) {
        return super.llIIlIIIlIIIllIlIIIl(lllIIIIlIlIllIIlIIIl);
    }
    
    @Override
    public int IlIlIIIllIIllIlllllI() {
        return 1;
    }
}
