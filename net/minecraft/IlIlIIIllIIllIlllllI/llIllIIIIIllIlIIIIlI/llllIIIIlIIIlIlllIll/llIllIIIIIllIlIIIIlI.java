package net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll;

import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.IlIlIIIllIIllIlllllI.*;

public class llIllIIIIIllIlIIIIlI implements IIlIIIIIllIlIIIlIIll
{
    private int llllIIIIlIIIlIlllIll;
    private IlIIIlIlIIIllIlIlIIl IlIlIlIlIlllllllllIl;
    private e llIllIIIIIllIlIIIIlI;
    
    public llIllIIIIIllIlIIIIlI() {
    }
    
    public llIllIIIIIllIlIIIIlI(final net.minecraft.llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI, final IlIIIlIlIIIllIlIlIIl ilIlIlIlIlllllllllIl) {
        this.llllIIIIlIIIlIlllIll = llIllIIIIIllIlIIIIlI.IlllIIIIlIIIlIlIlIIl();
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
    }
    
    public llIllIIIIIllIlIIIIlI(final net.minecraft.llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI, final e llIllIIIIIllIlIIIIlI2) {
        this(llIllIIIIIllIlIIIIlI, IlIIIlIlIIIllIlIlIIl.llIllIIIIIllIlIIIIlI);
        this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI2;
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final llllllIllIllIlIllllI llllllIllIllIlIllllI) {
        this.llllIIIIlIIIlIlllIll = llllllIllIllIlIllllI.IlIIIlIlIIIllIlIlIIl();
        this.IlIlIlIlIlllllllllIl = (IlIIIlIlIIIllIlIlIIl)llllllIllIllIlIllllI.llllIIIIlIIIlIlllIll(IlIIIlIlIIIllIlIlIIl.class);
        if (this.IlIlIlIlIlllllllllIl == IlIIIlIlIIIllIlIlIIl.llIllIIIIIllIlIIIIlI) {
            this.llIllIIIIIllIlIIIIlI = new e(llllllIllIllIlIllllI.readFloat(), llllllIllIllIlIllllI.readFloat(), llllllIllIllIlIllllI.readFloat());
        }
    }
    
    @Override
    public void IlIlIlIlIlllllllllIl(final llllllIllIllIlIllllI llllllIllIllIlIllllI) {
        llllllIllIllIlIllllI.IlIlIlIlIlllllllllIl(this.llllIIIIlIIIlIlllIll);
        llllllIllIllIlIllllI.llllIIIIlIIIlIlllIll(this.IlIlIlIlIlllllllllIl);
        if (this.IlIlIlIlIlllllllllIl == IlIIIlIlIIIllIlIlIIl.llIllIIIIIllIlIIIIlI) {
            llllllIllIllIlIllllI.writeFloat((float)this.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll);
            llllllIllIllIlIllllI.writeFloat((float)this.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl);
            llllllIllIllIlIllllI.writeFloat((float)this.llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI);
        }
    }
    
    public void llllIIIIlIIIlIlllIll(final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(this);
    }
    
    public net.minecraft.llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII) {
        return illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(this.llllIIIIlIIIlIlllIll);
    }
    
    public IlIIIlIlIIIllIlIlIIl llllIIIIlIIIlIlllIll() {
        return this.IlIlIlIlIlllllllllIl;
    }
    
    public e IlIlIlIlIlllllllllIl() {
        return this.llIllIIIIIllIlIIIIlI;
    }
}
