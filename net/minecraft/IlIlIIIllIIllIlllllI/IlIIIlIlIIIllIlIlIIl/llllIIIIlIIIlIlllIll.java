package net.minecraft.IlIlIIIllIIllIlllllI.IlIIIlIlIIIllIlIlIIl;

import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.IlIlIlIlIlllllllllIl.*;

public class llllIIIIlIIIlIlllIll implements IllIlIIllIllIIlIllII
{
    private static final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll;
    private StringBuffer IlIlIlIlIlllllllllIl;
    
    static {
        llllIIIIlIIIlIlllIll = new llllIIIIlIIIlIlllIll();
    }
    
    public llllIIIIlIIIlIlllIll() {
        this.IlIlIlIlIlllllllllIl = new StringBuffer();
    }
    
    @Override
    public String s_() {
        return "Rcon";
    }
    
    @Override
    public llIIIIIIlIllIIlIIIll v_() {
        return new IlIlIIIIIIlllIlIllIl(this.s_());
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final llIIIIIIlIllIIlIIIll llIIIIIIlIllIIlIIIll) {
        this.IlIlIlIlIlllllllllIl.append(llIIIIIIlIllIIlIIIll.lIIIIlIIIIIlllIllIII());
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll(final int n, final String s) {
        return true;
    }
    
    @Override
    public IlIlIlIlIlllllllllIl IlIlIIIlIIlIlIIlllIl() {
        return new IlIlIlIlIlllllllllIl(0, 0, 0);
    }
    
    @Override
    public e j_() {
        return new e(0.0, 0.0, 0.0);
    }
    
    @Override
    public IlllllllIIIlIIIlIlII k_() {
        return net.minecraft.IlIlIIIIIIlllIlIllIl.llllIIIIlIIIlIlllIll.IIIIIllIIIIlIIIIllIl().k_();
    }
    
    @Override
    public llIllIIIIIllIlIIIIlI l_() {
        return null;
    }
    
    @Override
    public boolean d_() {
        return true;
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final lIllllllIIllIlIlIlII lIllllllIIllIlIlIlII, final int n) {
    }
}
