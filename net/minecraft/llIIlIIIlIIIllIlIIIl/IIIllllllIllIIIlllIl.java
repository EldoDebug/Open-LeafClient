package net.minecraft.llIIlIIIlIIIllIlIIIl;

import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.llIllIlIIIIllIlIIllI.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.*;

public class IIIllllllIllIIIlllIl implements IIIIlllIIIIIIlIIIlll
{
    private String llllIIIIlIIIlIlllIll;
    private IIIIlllIIIIIIlIIIlll IlIlIlIlIlllllllllIl;
    private IIIIlllIIIIIIlIIIlll llIllIIIIIllIlIIIIlI;
    
    public IIIllllllIllIIIlllIl(final String llllIIIIlIIIlIlllIll, IIIIlllIIIIIIlIIIlll ilIlIlIlIlllllllllIl, IIIIlllIIIIIIlIIIlll llIllIIIIIllIlIIIIlI) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        if (ilIlIlIlIlllllllllIl == null) {
            ilIlIlIlIlllllllllIl = llIllIIIIIllIlIIIIlI;
        }
        if (llIllIIIIIllIlIIIIlI == null) {
            llIllIIIIIllIlIIIIlI = ilIlIlIlIlllllllllIl;
        }
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
        this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
        if (ilIlIlIlIlllllllllIl.IllIIlllIIIIlllIIlIl()) {
            llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl.u_());
        }
        else if (llIllIIIIIllIlIIIIlI.IllIIlllIIIIlllIIlIl()) {
            ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI.u_());
        }
    }
    
    @Override
    public int lIIIlllIIIllIIIllIII() {
        return this.IlIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII() + this.llIllIIIIIllIlIIIIlI.lIIIlllIIIllIIIllIII();
    }
    
    public boolean llllIIIIlIIIlIlllIll(final llIIIlIlIllIIlIlIlII llIIIlIlIllIIlIlIlII) {
        return this.IlIlIlIlIlllllllllIl == llIIIlIlIllIIlIlIlII || this.llIllIIIIIllIlIIIIlI == llIIIlIlIllIIlIlIlII;
    }
    
    @Override
    public String s_() {
        return this.IlIlIlIlIlllllllllIl.w_() ? this.IlIlIlIlIlllllllllIl.s_() : (this.llIllIIIIIllIlIIIIlI.w_() ? this.llIllIIIIIllIlIIIIlI.s_() : this.llllIIIIlIIIlIlllIll);
    }
    
    @Override
    public boolean w_() {
        return this.IlIlIlIlIlllllllllIl.w_() || this.llIllIIIIIllIlIIIIlI.w_();
    }
    
    @Override
    public llIIIIIIlIllIIlIIIll v_() {
        return this.w_() ? new IlIlIIIIIIlllIlIllIl(this.s_()) : new IIllIIllIIIlIlIIIIlI(this.s_(), new Object[0]);
    }
    
    @Override
    public lllIIIIlIlIllIIlIIIl lIlIlIIIllIIllIIIllI(final int n) {
        return (n >= this.IlIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII()) ? this.llIllIIIIIllIlIIIIlI.lIlIlIIIllIIllIIIllI(n - this.IlIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII()) : this.IlIlIlIlIlllllllllIl.lIlIlIIIllIIllIIIllI(n);
    }
    
    @Override
    public lllIIIIlIlIllIIlIIIl IlIlIlIlIlllllllllIl(final int n, final int n2) {
        return (n >= this.IlIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII()) ? this.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(n - this.IlIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII(), n2) : this.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl(n, n2);
    }
    
    @Override
    public lllIIIIlIlIllIIlIIIl IlIlIIIllIIllIlllllI(final int n) {
        return (n >= this.IlIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII()) ? this.llIllIIIIIllIlIIIIlI.IlIlIIIllIIllIlllllI(n - this.IlIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII()) : this.IlIlIlIlIlllllllllIl.IlIlIIIllIIllIlllllI(n);
    }
    
    @Override
    public void llIllIIIIIllIlIIIIlI(final int n, final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl) {
        if (n >= this.IlIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII()) {
            this.llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI(n - this.IlIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII(), lllIIIIlIlIllIIlIIIl);
        }
        else {
            this.IlIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI(n, lllIIIIlIlIllIIlIIIl);
        }
    }
    
    @Override
    public int lllllIlIIIlIlIIlllII() {
        return this.IlIlIlIlIlllllllllIl.lllllIlIIIlIlIIlllII();
    }
    
    @Override
    public void llIIIlIlIllIIlIlIlII() {
        this.IlIlIlIlIlllllllllIl.llIIIlIlIllIIlIlIlII();
        this.llIllIIIIIllIlIIIIlI.llIIIlIlIllIIlIlIlII();
    }
    
    @Override
    public boolean IlIIIlIlIIIllIlIlIIl(final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        return this.IlIlIlIlIlllllllllIl.IlIIIlIlIIIllIlIlIIl(llllIIIIlIIIlIlllIll) && this.llIllIIIIIllIlIIIIlI.IlIIIlIlIIIllIlIlIIl(llllIIIIlIIIlIlllIll);
    }
    
    @Override
    public void IlIlIIIllIllIIIIIllI(final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        this.IlIlIlIlIlllllllllIl.IlIlIIIllIllIIIIIllI(llllIIIIlIIIlIlllIll);
        this.llIllIIIIIllIlIIIIlI.IlIlIIIllIllIIIIIllI(llllIIIIlIIIlIlllIll);
    }
    
    @Override
    public void IllIIlllIIIIlllIIlIl(final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        this.IlIlIlIlIlllllllllIl.IllIIlllIIIIlllIIlIl(llllIIIIlIIIlIlllIll);
        this.llIllIIIIIllIlIIIIlI.IllIIlllIIIIlllIIlIl(llllIIIIlIIIlIlllIll);
    }
    
    @Override
    public boolean IlIIIlIlIIIllIlIlIIl(final int n, final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl) {
        return true;
    }
    
    @Override
    public int llllIIIIlIIIlIlllIll(final int n) {
        return 0;
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final int n, final int n2) {
    }
    
    @Override
    public int IlIlIIIllIllIIIIIllI() {
        return 0;
    }
    
    @Override
    public boolean IllIIlllIIIIlllIIlIl() {
        return this.IlIlIlIlIlllllllllIl.IllIIlllIIIIlllIIlIl() || this.llIllIIIIIllIlIIIIlI.IllIIlllIIIIlllIIlIl();
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final IIlllIIlIllIllIlIIll illlIIlIllIllIlIIll) {
        this.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(illlIIlIllIllIlIIll);
        this.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(illlIIlIllIllIlIIll);
    }
    
    @Override
    public IIlllIIlIllIllIlIIll u_() {
        return this.IlIlIlIlIlllllllllIl.u_();
    }
    
    @Override
    public String IlIIIlIlIIIllIlIlIIl() {
        return this.IlIlIlIlIlllllllllIl.IlIIIlIlIIIllIlIlIIl();
    }
    
    @Override
    public IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll(final IllIIlllIIIIlllIIlIl illIIlllIIIIlllIIlIl, final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        return new lIIIIlIIIIIlllIllIII(illIIlllIIIIlllIIlIl, this, llllIIIIlIIIlIlllIll);
    }
    
    @Override
    public void lIllllllIIllIlIlIlII() {
        this.IlIlIlIlIlllllllllIl.lIllllllIIllIlIlIlII();
        this.llIllIIIIIllIlIIIIlI.lIllllllIIllIlIlIlII();
    }
}
