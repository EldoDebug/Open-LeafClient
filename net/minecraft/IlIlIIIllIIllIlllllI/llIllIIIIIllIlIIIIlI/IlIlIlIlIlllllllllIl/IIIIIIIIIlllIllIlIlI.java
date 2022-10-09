package net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl;

import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.llIllIIIIIllIlIIIIlI.*;
import net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.*;
import net.minecraft.IlIlIIIllIIllIlllllI.*;

public class IIIIIIIIIlllIllIlIlI implements IIlIIIIIllIlIIIlIIll
{
    private IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll;
    private IIllllIIIlIIIIIIllIl[] IlIlIlIlIlllllllllIl;
    
    public IIIIIIIIIlllIllIlIlI() {
    }
    
    public IIIIIIIIIlllIllIlIlI(final int n, final short[] array, final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        this.llllIIIIlIIIlIlllIll = new IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll, llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl);
        this.IlIlIlIlIlllllllllIl = new IIllllIIIlIIIIIIllIl[n];
        for (int i = 0; i < this.IlIlIlIlIlllllllllIl.length; ++i) {
            this.IlIlIlIlIlllllllllIl[i] = new IIllllIIIlIIIIIIllIl(this, array[i], llllIIIIlIIIlIlllIll);
        }
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final llllllIllIllIlIllllI llllllIllIllIlIllllI) {
        this.llllIIIIlIIIlIlllIll = new IlIlIlIlIlllllllllIl(llllllIllIllIlIllllI.readInt(), llllllIllIllIlIllllI.readInt());
        this.IlIlIlIlIlllllllllIl = new IIllllIIIlIIIIIIllIl[llllllIllIllIlIllllI.IlIIIlIlIIIllIlIlIIl()];
        for (int i = 0; i < this.IlIlIlIlIlllllllllIl.length; ++i) {
            this.IlIlIlIlIlllllllllIl[i] = new IIllllIIIlIIIIIIllIl(this, llllllIllIllIlIllllI.readShort(), (llIIlIIIlIIIllIlIIIl)net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(llllllIllIllIlIllllI.IlIIIlIlIIIllIlIlIIl()));
        }
    }
    
    @Override
    public void IlIlIlIlIlllllllllIl(final llllllIllIllIlIllllI llllllIllIllIlIllllI) {
        llllllIllIllIlIllllI.writeInt(this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll);
        llllllIllIllIlIllllI.writeInt(this.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl);
        llllllIllIllIlIllllI.IlIlIlIlIlllllllllIl(this.IlIlIlIlIlllllllllIl.length);
        IIllllIIIlIIIIIIllIl[] ilIlIlIlIlllllllllIl;
        for (int length = (ilIlIlIlIlllllllllIl = this.IlIlIlIlIlllllllllIl).length, i = 0; i < length; ++i) {
            final IIllllIIIlIIIIIIllIl illllIIIlIIIIIIllIl = ilIlIlIlIlllllllllIl[i];
            llllllIllIllIlIllllI.writeShort(illllIIIlIIIIIIllIl.IlIlIlIlIlllllllllIl());
            llllllIllIllIlIllllI.IlIlIlIlIlllllllllIl(net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(illllIIIlIIIIIIllIl.llIllIIIIIllIlIIIIlI()));
        }
    }
    
    public void llllIIIIlIIIlIlllIll(final net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(this);
    }
    
    public IIllllIIIlIIIIIIllIl[] llllIIIIlIIIlIlllIll() {
        return this.IlIlIlIlIlllllllllIl;
    }
}
