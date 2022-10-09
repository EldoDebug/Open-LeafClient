package net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl;

import net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.*;
import net.minecraft.IlIlIIIllIIllIlllllI.*;

public class IIIlIIIlIlIIlllIIlll implements IIlIIIIIllIlIIIlIIll
{
    private int[] llllIIIIlIIIlIlllIll;
    
    public IIIlIIIlIlIIlllIIlll() {
    }
    
    public IIIlIIIlIlIIlllIIlll(final int... llllIIIIlIIIlIlllIll) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final llllllIllIllIlIllllI llllllIllIllIlIllllI) {
        this.llllIIIIlIIIlIlllIll = new int[llllllIllIllIlIllllI.IlIIIlIlIIIllIlIlIIl()];
        for (int i = 0; i < this.llllIIIIlIIIlIlllIll.length; ++i) {
            this.llllIIIIlIIIlIlllIll[i] = llllllIllIllIlIllllI.IlIIIlIlIIIllIlIlIIl();
        }
    }
    
    @Override
    public void IlIlIlIlIlllllllllIl(final llllllIllIllIlIllllI llllllIllIllIlIllllI) {
        llllllIllIllIlIllllI.IlIlIlIlIlllllllllIl(this.llllIIIIlIIIlIlllIll.length);
        for (int i = 0; i < this.llllIIIIlIIIlIlllIll.length; ++i) {
            llllllIllIllIlIllllI.IlIlIlIlIlllllllllIl(this.llllIIIIlIIIlIlllIll[i]);
        }
    }
    
    public void llllIIIIlIIIlIlllIll(final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(this);
    }
    
    public int[] llllIIIIlIIIlIlllIll() {
        return this.llllIIIIlIIIlIlllIll;
    }
}
