package net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl;

import java.util.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.IlIlIIIllIIllIlllllI.*;

public class lIllllllIIllIlIlIlII implements IIlIIIIIllIlIIIlIIll
{
    private int llllIIIIlIIIlIlllIll;
    private List IlIlIlIlIlllllllllIl;
    
    public lIllllllIIllIlIlIlII() {
    }
    
    public lIllllllIIllIlIlIlII(final int llllIIIIlIIIlIlllIll, final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll2, final boolean b) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        if (b) {
            this.IlIlIlIlIlllllllllIl = llllIIIIlIIIlIlllIll2.llIllIIIIIllIlIIIIlI();
        }
        else {
            this.IlIlIlIlIlllllllllIl = llllIIIIlIIIlIlllIll2.IlIlIlIlIlllllllllIl();
        }
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final llllllIllIllIlIllllI llllllIllIllIlIllllI) {
        this.llllIIIIlIIIlIlllIll = llllllIllIllIlIllllI.IlIIIlIlIIIllIlIlIIl();
        this.IlIlIlIlIlllllllllIl = net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(llllllIllIllIlIllllI);
    }
    
    @Override
    public void IlIlIlIlIlllllllllIl(final llllllIllIllIlIllllI llllllIllIllIlIllllI) {
        llllllIllIllIlIllllI.IlIlIlIlIlllllllllIl(this.llllIIIIlIIIlIlllIll);
        net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(this.IlIlIlIlIlllllllllIl, llllllIllIllIlIllllI);
    }
    
    public void llllIIIIlIIIlIlllIll(final net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(this);
    }
    
    public List llllIIIIlIIIlIlllIll() {
        return this.IlIlIlIlIlllllllllIl;
    }
    
    public int IlIlIlIlIlllllllllIl() {
        return this.llllIIIIlIIIlIlllIll;
    }
}
