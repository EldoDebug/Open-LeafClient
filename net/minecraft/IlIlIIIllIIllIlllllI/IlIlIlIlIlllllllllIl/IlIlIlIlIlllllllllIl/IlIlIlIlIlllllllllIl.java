package net.minecraft.IlIlIIIllIIllIlllllI.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl;

import java.security.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.IlIlIIIllIIllIlllllI.IlIlIlIlIlllllllllIl.*;
import net.minecraft.IlIlIIIllIIllIlllllI.*;

public class IlIlIlIlIlllllllllIl implements IIlIIIIIllIlIIIlIIll
{
    private String llllIIIIlIIIlIlllIll;
    private PublicKey IlIlIlIlIlllllllllIl;
    private byte[] llIllIIIIIllIlIIIIlI;
    
    public IlIlIlIlIlllllllllIl() {
    }
    
    public IlIlIlIlIlllllllllIl(final String llllIIIIlIIIlIlllIll, final PublicKey ilIlIlIlIlllllllllIl, final byte[] llIllIIIIIllIlIIIIlI) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
        this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final llllllIllIllIlIllllI llllllIllIllIlIllllI) {
        this.llllIIIIlIIIlIlllIll = llllllIllIllIlIllllI.llIllIIIIIllIlIIIIlI(20);
        this.IlIlIlIlIlllllllllIl = lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(llllllIllIllIlIllllI.llllIIIIlIIIlIlllIll());
        this.llIllIIIIIllIlIIIIlI = llllllIllIllIlIllllI.llllIIIIlIIIlIlllIll();
    }
    
    @Override
    public void IlIlIlIlIlllllllllIl(final llllllIllIllIlIllllI llllllIllIllIlIllllI) {
        llllllIllIllIlIllllI.llllIIIIlIIIlIlllIll(this.llllIIIIlIIIlIlllIll);
        llllllIllIllIlIllllI.llllIIIIlIIIlIlllIll(this.IlIlIlIlIlllllllllIl.getEncoded());
        llllllIllIllIlIllllI.llllIIIIlIIIlIlllIll(this.llIllIIIIIllIlIIIIlI);
    }
    
    public void llllIIIIlIIIlIlllIll(final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(this);
    }
    
    public String llllIIIIlIIIlIlllIll() {
        return this.llllIIIIlIIIlIlllIll;
    }
    
    public PublicKey IlIlIlIlIlllllllllIl() {
        return this.IlIlIlIlIlllllllllIl;
    }
    
    public byte[] llIllIIIIIllIlIIIIlI() {
        return this.llIllIIIIIllIlIIIIlI;
    }
}
