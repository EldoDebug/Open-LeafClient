package net.minecraft.llIIlIIIlIIIllIlIIIl;

import net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.llIllIlIIIIllIlIIllI.*;
import net.minecraft.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl.*;
import net.minecraft.lIIIlllIIIllIIIllIII.*;
import net.minecraft.IIIlIIIlIlIIlllIIlll.*;

public class IlllIIIIlIIIlIlIlIIl extends IIIIIllIIIIlIIIIllIl
{
    private llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll;
    private int IllIIlllIIIIlllIIlIl;
    
    public IlllIIIIlIIIlIlIlIIl(final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final llIIIlIlIllIIlIlIlII llIIIlIlIllIIlIlIlII, final int n, final int n2, final int n3) {
        super(llIIIlIlIllIIlIlIlII, n, n2, n3);
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll(final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl) {
        return false;
    }
    
    @Override
    public lllIIIIlIlIllIIlIIIl llllIIIIlIIIlIlllIll(final int n) {
        if (this.IlIlIlIlIlllllllllIl()) {
            this.IllIIlllIIIIlllIIlIl += Math.min(n, this.llllIIIIlIIIlIlllIll().IlIlIlIlIlllllllllIl);
        }
        return super.llllIIIIlIIIlIlllIll(n);
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl) {
        this.IlIlIIIllIllIIIIIllI(lllIIIIlIlIllIIlIIIl);
        super.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll, lllIIIIlIlIllIIlIIIl);
    }
    
    @Override
    protected void llllIIIIlIIIlIlllIll(final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl, final int n) {
        this.IllIIlllIIIIlllIIlIl += n;
        this.IlIlIIIllIllIIIIIllI(lllIIIIlIlIllIIlIIIl);
    }
    
    @Override
    protected void IlIlIIIllIllIIIIIllI(final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl) {
        lllIIIIlIlIllIIlIIIl.llllIIIIlIIIlIlllIll(this.llllIIIIlIIIlIlllIll.IlllllllIIIlIIIlIlII, this.llllIIIIlIIIlIlllIll, this.IllIIlllIIIIlllIIlIl);
        if (!this.llllIIIIlIIIlIlllIll.IlllllllIIIlIIIlIlII.IlIlIllllllllIIIIlII) {
            int i = this.IllIIlllIIIIlllIIlIl;
            final float ilIlIlIlIlllllllllIl = net.minecraft.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll().IlIlIlIlIlllllllllIl(lllIIIIlIlIllIIlIIIl);
            if (ilIlIlIlIlllllllllIl == 0.0f) {
                i = 0;
            }
            else if (ilIlIlIlIlllllllllIl < 1.0f) {
                int ilIIIlIlIIIllIlIlIIl = llIllIIlllllllllllll.IlIIIlIlIIIllIlIlIIl(i * ilIlIlIlIlllllllllIl);
                if (ilIIIlIlIIIllIlIlIIl < llIllIIlllllllllllll.IllIIlllIIIIlllIIlIl(i * ilIlIlIlIlllllllllIl) && Math.random() < i * ilIlIlIlIlllllllllIl - ilIIIlIlIIIllIlIlIIl) {
                    ++ilIIIlIlIIIllIlIlIIl;
                }
                i = ilIIIlIlIIIllIlIlIIl;
            }
            while (i > 0) {
                final int llllIIIIlIIIlIlllIll = IlIlIIIlIIlIlIIlllIl.llllIIIIlIIIlIlllIll(i);
                i -= llllIIIIlIIIlIlllIll;
                this.llllIIIIlIIIlIlllIll.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(new IlIlIIIlIIlIlIIlllIl(this.llllIIIIlIIIlIlllIll.IlllllllIIIlIIIlIlII, this.llllIIIIlIIIlIlllIll.IIlllIlIIllIlIlIlIIl, this.llllIIIIlIIIlIlllIll.llIIIlIlIllIIlIlIlII + 0.5, this.llllIIIIlIIIlIlllIll.lllllIlIIIlIlIIlllII + 0.5, llllIIIIlIIIlIlllIll));
            }
        }
        this.IllIIlllIIIIlllIIlIl = 0;
        if (lllIIIIlIlIllIIlIIIl.llllIIIIlIIIlIlllIll() == IIllIIllIIIlIlIIIIlI.llIIlIIIlIIIllIlIIIl) {
            this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(net.minecraft.IIIlIIIlIlIIlllIIlll.IlIlIlIlIlllllllllIl.llIllIlIIIIllIlIIllI);
        }
        if (lllIIIIlIlIllIIlIIIl.llllIIIIlIIIlIlllIll() == IIllIIllIIIlIlIIIIlI.llllIlIllllIIlIIlIlI) {
            this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(net.minecraft.IIIlIIIlIlIIlllIIlll.IlIlIlIlIlllllllllIl.IlIllIlIlIIIlIlIlIII);
        }
    }
}
