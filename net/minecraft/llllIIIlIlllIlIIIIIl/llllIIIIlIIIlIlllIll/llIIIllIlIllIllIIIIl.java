package net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll;

import net.minecraft.IlIlIIIlIIlIlIIlllIl.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl.*;
import net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.*;
import net.minecraft.lIIIlllIIIllIIIllIII.*;
import net.minecraft.lIlIlIIIllIIllIIIllI.*;

public class llIIIllIlIllIllIIIIl extends llIllIlIIIIllIlIIllI
{
    private final IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll;
    
    public llIIIllIlIllIllIIIIl(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII) {
        super(illlllllIIIlIIIlIlII);
        this.llllIIIIlIIIlIlllIll = new IIIllIIIlIlIIllIIIlI(this);
    }
    
    public llIIIllIlIllIllIIIIl(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final double n, final double n2, final double n3) {
        super(illlllllIIIlIIIlIlII, n, n2, n3);
        this.llllIIIIlIIIlIlllIll = new IIIllIIIlIlIIllIIIlI(this);
    }
    
    @Override
    public lIlIlIIIllIIllIIIllI llllIIIlIlllIlIIIIIl() {
        return net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl.lIlIlIIIllIIllIIIllI.IlIlIIIllIllIIIIIllI;
    }
    
    @Override
    public llIIlIIIlIIIllIlIIIl lIIIIlIIIIIlllIllIII() {
        return net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llIIIlIlllIllIIlIllI.lllIllIIIllllllIllll();
    }
    
    @Override
    protected void IlIlIlIlIlllllllllIl(final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll) {
        super.IlIlIlIlIlllllllllIl(iiiIlllIIIIIIlIIIlll);
        this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(iiiIlllIIIIIIlIIIlll);
    }
    
    @Override
    protected void llllIIIIlIIIlIlllIll(final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll) {
        super.llllIIIIlIIIlIlllIll(iiiIlllIIIIIIlIIIlll);
        this.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(iiiIlllIIIIIIlIIIlll);
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final byte b) {
        this.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(b);
    }
    
    @Override
    public void IIllIIllIIIlIlIIIIlI() {
        super.IIllIIllIIIlIlIIIIlI();
        this.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI();
    }
    
    public IlIlIlIlIlllllllllIl lIIIlllIIIllIIIllIII() {
        return this.llllIIIIlIIIlIlllIll;
    }
}
