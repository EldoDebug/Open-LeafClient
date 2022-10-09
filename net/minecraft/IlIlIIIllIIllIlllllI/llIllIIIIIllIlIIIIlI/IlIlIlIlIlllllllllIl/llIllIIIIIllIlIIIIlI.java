package net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl;

import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.*;
import leaf.*;
import net.minecraft.IlIlIIIllIIllIlllllI.*;

public class llIllIIIIIllIlIIIIlI implements IIlIIIIIllIlIIIlIIll
{
    private llIIIIIIlIllIIlIIIll llllIIIIlIIIlIlllIll;
    private byte IlIlIlIlIlllllllllIl;
    
    public llIllIIIIIllIlIIIIlI() {
    }
    
    public llIllIIIIIllIlIIIIlI(final llIIIIIIlIllIIlIIIll llIIIIIIlIllIIlIIIll) {
        this(llIIIIIIlIllIIlIIIll, (byte)1);
    }
    
    public llIllIIIIIllIlIIIIlI(final llIIIIIIlIllIIlIIIll llllIIIIlIIIlIlllIll, final byte ilIlIlIlIlllllllllIl) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final llllllIllIllIlIllllI llllllIllIllIlIllllI) {
        this.llllIIIIlIIIlIlllIll = llllllIllIllIlIllllI.llIllIIIIIllIlIIIIlI();
        this.IlIlIlIlIlllllllllIl = llllllIllIllIlIllllI.readByte();
    }
    
    @Override
    public void IlIlIlIlIlllllllllIl(final llllllIllIllIlIllllI llllllIllIllIlIllllI) {
        llllllIllIllIlIllllI.llllIIIIlIIIlIlllIll(this.llllIIIIlIIIlIlllIll);
        llllllIllIllIlIllllI.writeByte(this.IlIlIlIlIlllllllllIl);
    }
    
    public void llllIIIIlIIIlIlllIll(final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        if (!Leaf.instance.modManager.chatMod.access) {
            llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(this);
        }
    }
    
    public llIIIIIIlIllIIlIIIll llllIIIIlIIIlIlllIll() {
        return this.llllIIIIlIIIlIlllIll;
    }
    
    public boolean IlIlIlIlIlllllllllIl() {
        return this.IlIlIlIlIlllllllllIl == 1 || this.IlIlIlIlIlllllllllIl == 2;
    }
    
    public byte llIllIIIIIllIlIIIIlI() {
        return this.IlIlIlIlIlllllllllIl;
    }
}
