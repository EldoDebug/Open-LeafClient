package net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl;

import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.lIIIlllIIIllIIIllIII.*;
import net.minecraft.lIlIlIIIllIIllIIIllI.*;

public class llIllIIIIIllIlIIIIlI extends net.minecraft.llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI
{
    public int llllIIIIlIIIlIlllIll;
    public int IlIlIlIlIlllllllllIl;
    
    public llIllIIIIIllIlIIIIlI(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII) {
        super(illlllllIIIlIIIlIlII);
        this.IlIlIIIIIIlllIlIllIl = true;
        this.llllIIIIlIIIlIlllIll(2.0f, 2.0f);
        this.IlIlIlIlIlllllllllIl = 5;
        this.llllIIIIlIIIlIlllIll = this.IlIIllIIllIIllIIlIIl.nextInt(100000);
    }
    
    public llIllIIIIIllIlIIIIlI(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final double n, final double n2, final double n3) {
        this(illlllllIIIlIIIlIlII);
        this.IlIlIlIlIlllllllllIl(n, n2, n3);
    }
    
    @Override
    protected boolean c_() {
        return false;
    }
    
    @Override
    protected void a_() {
        this.IIlllIIlllIIIlIlllII.llllIIIIlIIIlIlllIll(8, (Object)this.IlIlIlIlIlllllllllIl);
    }
    
    @Override
    public void IIllIIllIIIlIlIIIIlI() {
        this.IIlIIIIlllIlllllIlII = this.IIlllIlIIllIlIlIlIIl;
        this.IIIlIIlIIIIlllIlllII = this.llIIIlIlIllIIlIlIlII;
        this.IlIlIllllllllIIIIlII = this.lllllIlIIIlIlIIlllII;
        ++this.llllIIIIlIIIlIlllIll;
        this.IIlllIIlllIIIlIlllII.IlIlIlIlIlllllllllIl(8, this.IlIlIlIlIlllllllllIl);
        final int llIllIIIIIllIlIIIIlI = net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(this.IIlllIlIIllIlIlIlIIl);
        final int llIllIIIIIllIlIIIIlI2 = net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(this.llIIIlIlIllIIlIlIlII);
        final int llIllIIIIIllIlIIIIlI3 = net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(this.lllllIlIIIlIlIIlllII);
        if (this.IlllllllIIIlIIIlIlII.IlIllIlIlIIIlIlIlIII instanceof lIllllllIIllIlIlIlII && this.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(new IlIlIlIlIlllllllllIl(llIllIIIIIllIlIIIIlI, llIllIIIIIllIlIIIIlI2, llIllIIIIIllIlIIIIlI3)).llIllIIIIIllIlIIIIlI() != net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lIIIIlIlIllllIIlIllI) {
            this.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(new IlIlIlIlIlllllllllIl(llIllIIIIIllIlIIIIlI, llIllIIIIIllIlIIIIlI2, llIllIIIIIllIlIIIIlI3), net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lIIIIlIlIllllIIlIllI.lllIllIIIllllllIllll());
        }
    }
    
    @Override
    protected void llllIIIIlIIIlIlllIll(final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll) {
    }
    
    @Override
    protected void IlIlIlIlIlllllllllIl(final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll) {
    }
    
    @Override
    public boolean IIlllIIlllIIIlIlllII() {
        return true;
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll(final net.minecraft.IlllllllIIIlIIIlIlII.lIllllllIIllIlIlIlII lIllllllIIllIlIlIlII, final float n) {
        if (this.llllIIIIlIIIlIlllIll(lIllllllIIllIlIlIlII)) {
            return false;
        }
        if (!this.IIlIlIlIIlIllIIIIIIl && !this.IlllllllIIIlIIIlIlII.IlIlIllllllllIIIIlII) {
            this.IlIlIlIlIlllllllllIl = 0;
            if (this.IlIlIlIlIlllllllllIl <= 0) {
                this.IllIllIIIIlIIlIlllII();
                if (!this.IlllllllIIIlIIIlIlII.IlIlIllllllllIIIIlII) {
                    this.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(null, this.IIlllIlIIllIlIlIlIIl, this.llIIIlIlIllIIlIlIlII, this.lllllIlIIIlIlIIlllII, 6.0f, true);
                }
            }
        }
        return true;
    }
}
