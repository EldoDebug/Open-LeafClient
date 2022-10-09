package net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll;

import net.minecraft.IlllllllIIIlIIIlIlII.*;
import org.apache.commons.lang3.*;
import net.minecraft.IlIlIIIllIIllIlllllI.*;

public class IIlIIIIlllIlllllIlII implements IIlIIIIIllIlIIIlIIll
{
    private String llllIIIIlIIIlIlllIll;
    private IlIlIlIlIlllllllllIl IlIlIlIlIlllllllllIl;
    
    public IIlIIIIlllIlllllIlII() {
    }
    
    public IIlIIIIlllIlllllIlII(final String s) {
        this(s, null);
    }
    
    public IIlIIIIlllIlllllIlII(final String llllIIIIlIIIlIlllIll, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final llllllIllIllIlIllllI llllllIllIllIlIllllI) {
        this.llllIIIIlIIIlIlllIll = llllllIllIllIlIllllI.llIllIIIIIllIlIIIIlI(32767);
        if (llllllIllIllIlIllllI.readBoolean()) {
            this.IlIlIlIlIlllllllllIl = llllllIllIllIlIllllI.IlIlIlIlIlllllllllIl();
        }
    }
    
    @Override
    public void IlIlIlIlIlllllllllIl(final llllllIllIllIlIllllI llllllIllIllIlIllllI) {
        llllllIllIllIlIllllI.llllIIIIlIIIlIlllIll(StringUtils.substring(this.llllIIIIlIIIlIlllIll, 0, 32767));
        final boolean b = this.IlIlIlIlIlllllllllIl != null;
        llllllIllIllIlIllllI.writeBoolean(b);
        if (b) {
            llllllIllIllIlIllllI.llllIIIIlIIIlIlllIll(this.IlIlIlIlIlllllllllIl);
        }
    }
    
    public void llllIIIIlIIIlIlllIll(final net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(this);
    }
    
    public String llllIIIIlIIIlIlllIll() {
        return this.llllIIIIlIIIlIlllIll;
    }
    
    public IlIlIlIlIlllllllllIl IlIlIlIlIlllllllllIl() {
        return this.IlIlIlIlIlllllllllIl;
    }
}
