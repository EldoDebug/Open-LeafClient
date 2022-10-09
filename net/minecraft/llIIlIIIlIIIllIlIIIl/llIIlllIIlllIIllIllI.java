package net.minecraft.llIIlIIIlIIIllIlIIIl;

import net.minecraft.llIllIlIIIIllIlIIllI.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.*;

public class llIIlllIIlllIIllIllI implements llIIIlIlIllIIlIlIlII
{
    private lllIIIIlIlIllIIlIIIl[] llllIIIIlIIIlIlllIll;
    
    public llIIlllIIlllIIllIllI() {
        this.llllIIIIlIIIlIlllIll = new lllIIIIlIlIllIIlIIIl[1];
    }
    
    @Override
    public int lIIIlllIIIllIIIllIII() {
        return 1;
    }
    
    @Override
    public lllIIIIlIlIllIIlIIIl lIlIlIIIllIIllIIIllI(final int n) {
        return this.llllIIIIlIIIlIlllIll[0];
    }
    
    @Override
    public String s_() {
        return "Result";
    }
    
    @Override
    public boolean w_() {
        return false;
    }
    
    @Override
    public llIIIIIIlIllIIlIIIll v_() {
        return this.w_() ? new IlIlIIIIIIlllIlIllIl(this.s_()) : new IIllIIllIIIlIlIIIIlI(this.s_(), new Object[0]);
    }
    
    @Override
    public lllIIIIlIlIllIIlIIIl IlIlIlIlIlllllllllIl(final int n, final int n2) {
        if (this.llllIIIIlIIIlIlllIll[0] != null) {
            final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl = this.llllIIIIlIIIlIlllIll[0];
            this.llllIIIIlIIIlIlllIll[0] = null;
            return lllIIIIlIlIllIIlIIIl;
        }
        return null;
    }
    
    @Override
    public lllIIIIlIlIllIIlIIIl IlIlIIIllIIllIlllllI(final int n) {
        if (this.llllIIIIlIIIlIlllIll[0] != null) {
            final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl = this.llllIIIIlIIIlIlllIll[0];
            this.llllIIIIlIIIlIlllIll[0] = null;
            return lllIIIIlIlIllIIlIIIl;
        }
        return null;
    }
    
    @Override
    public void llIllIIIIIllIlIIIIlI(final int n, final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl) {
        this.llllIIIIlIIIlIlllIll[0] = lllIIIIlIlIllIIlIIIl;
    }
    
    @Override
    public int lllllIlIIIlIlIIlllII() {
        return 64;
    }
    
    @Override
    public void llIIIlIlIllIIlIlIlII() {
    }
    
    @Override
    public boolean IlIIIlIlIIIllIlIlIIl(final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        return true;
    }
    
    @Override
    public void IlIlIIIllIllIIIIIllI(final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
    }
    
    @Override
    public void IllIIlllIIIIlllIIlIl(final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
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
    public void lIllllllIIllIlIlIlII() {
        for (int i = 0; i < this.llllIIIIlIIIlIlllIll.length; ++i) {
            this.llllIIIIlIIIlIlllIll[i] = null;
        }
    }
}
