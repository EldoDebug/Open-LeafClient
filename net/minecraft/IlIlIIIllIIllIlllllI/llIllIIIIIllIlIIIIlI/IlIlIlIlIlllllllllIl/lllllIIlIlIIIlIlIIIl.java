package net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl;

import net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.*;
import net.minecraft.IlIlIIIllIIllIlllllI.*;

public class lllllIIlIlIIIlIlIIIl implements IIlIIIIIllIlIIIlIIll
{
    private String[] llllIIIIlIIIlIlllIll;
    
    public lllllIIlIlIIIlIlIIIl() {
    }
    
    public lllllIIlIlIIIlIlIIIl(final String[] llllIIIIlIIIlIlllIll) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final llllllIllIllIlIllllI llllllIllIllIlIllllI) {
        this.llllIIIIlIIIlIlllIll = new String[llllllIllIllIlIllllI.IlIIIlIlIIIllIlIlIIl()];
        for (int i = 0; i < this.llllIIIIlIIIlIlllIll.length; ++i) {
            this.llllIIIIlIIIlIlllIll[i] = llllllIllIllIlIllllI.llIllIIIIIllIlIIIIlI(32767);
        }
    }
    
    @Override
    public void IlIlIlIlIlllllllllIl(final llllllIllIllIlIllllI llllllIllIllIlIllllI) {
        llllllIllIllIlIllllI.IlIlIlIlIlllllllllIl(this.llllIIIIlIIIlIlllIll.length);
        String[] llllIIIIlIIIlIlllIll;
        for (int length = (llllIIIIlIIIlIlllIll = this.llllIIIIlIIIlIlllIll).length, i = 0; i < length; ++i) {
            llllllIllIllIlIllllI.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll[i]);
        }
    }
    
    public void llllIIIIlIIIlIlllIll(final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(this);
    }
    
    public String[] llllIIIIlIIIlIlllIll() {
        return this.llllIIIIlIIIlIlllIll;
    }
}
