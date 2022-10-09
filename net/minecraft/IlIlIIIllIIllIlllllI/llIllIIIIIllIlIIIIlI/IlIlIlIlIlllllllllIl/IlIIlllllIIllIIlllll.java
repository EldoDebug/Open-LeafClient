package net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl;

import net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.*;
import net.minecraft.IlIlIIIllIIllIlllllI.*;

public class IlIIlllllIIllIIlllll implements IIlIIIIIllIlIIIlIIll
{
    private boolean llllIIIIlIIIlIlllIll;
    private boolean IlIlIlIlIlllllllllIl;
    private boolean llIllIIIIIllIlIIIIlI;
    private boolean IlIIIlIlIIIllIlIlIIl;
    private float IlIlIIIllIllIIIIIllI;
    private float IllIIlllIIIIlllIIlIl;
    
    public IlIIlllllIIllIIlllll() {
    }
    
    public IlIIlllllIIllIIlllll(final lIIIIlIIIIIlllIllIII liiiIlIIIIIlllIllIII) {
        this.llllIIIIlIIIlIlllIll(liiiIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll);
        this.IlIlIlIlIlllllllllIl(liiiIlIIIIIlllIllIII.IlIlIlIlIlllllllllIl);
        this.llIllIIIIIllIlIIIIlI(liiiIlIIIIIlllIllIII.llIllIIIIIllIlIIIIlI);
        this.IlIIIlIlIIIllIlIlIIl(liiiIlIIIIIlllIllIII.IlIIIlIlIIIllIlIlIIl);
        this.llllIIIIlIIIlIlllIll(liiiIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll());
        this.IlIlIlIlIlllllllllIl(liiiIlIIIIIlllIllIII.IlIlIlIlIlllllllllIl());
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final llllllIllIllIlIllllI llllllIllIllIlIllllI) {
        final byte byte1 = llllllIllIllIlIllllI.readByte();
        this.llllIIIIlIIIlIlllIll((byte1 & 0x1) > 0);
        this.IlIlIlIlIlllllllllIl((byte1 & 0x2) > 0);
        this.llIllIIIIIllIlIIIIlI((byte1 & 0x4) > 0);
        this.IlIIIlIlIIIllIlIlIIl((byte1 & 0x8) > 0);
        this.llllIIIIlIIIlIlllIll(llllllIllIllIlIllllI.readFloat());
        this.IlIlIlIlIlllllllllIl(llllllIllIllIlIllllI.readFloat());
    }
    
    @Override
    public void IlIlIlIlIlllllllllIl(final llllllIllIllIlIllllI llllllIllIllIlIllllI) {
        int n = 0;
        if (this.llllIIIIlIIIlIlllIll()) {
            n = (byte)(n | 0x1);
        }
        if (this.IlIlIlIlIlllllllllIl()) {
            n = (byte)(n | 0x2);
        }
        if (this.llIllIIIIIllIlIIIIlI()) {
            n = (byte)(n | 0x4);
        }
        if (this.IlIIIlIlIIIllIlIlIIl()) {
            n = (byte)(n | 0x8);
        }
        llllllIllIllIlIllllI.writeByte(n);
        llllllIllIllIlIllllI.writeFloat(this.IlIlIIIllIllIIIIIllI);
        llllllIllIllIlIllllI.writeFloat(this.IllIIlllIIIIlllIIlIl);
    }
    
    public void llllIIIIlIIIlIlllIll(final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(this);
    }
    
    public boolean llllIIIIlIIIlIlllIll() {
        return this.llllIIIIlIIIlIlllIll;
    }
    
    public void llllIIIIlIIIlIlllIll(final boolean llllIIIIlIIIlIlllIll) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
    }
    
    public boolean IlIlIlIlIlllllllllIl() {
        return this.IlIlIlIlIlllllllllIl;
    }
    
    public void IlIlIlIlIlllllllllIl(final boolean ilIlIlIlIlllllllllIl) {
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
    }
    
    public boolean llIllIIIIIllIlIIIIlI() {
        return this.llIllIIIIIllIlIIIIlI;
    }
    
    public void llIllIIIIIllIlIIIIlI(final boolean llIllIIIIIllIlIIIIlI) {
        this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
    }
    
    public boolean IlIIIlIlIIIllIlIlIIl() {
        return this.IlIIIlIlIIIllIlIlIIl;
    }
    
    public void IlIIIlIlIIIllIlIlIIl(final boolean ilIIIlIlIIIllIlIlIIl) {
        this.IlIIIlIlIIIllIlIlIIl = ilIIIlIlIIIllIlIlIIl;
    }
    
    public float IlIlIIIllIllIIIIIllI() {
        return this.IlIlIIIllIllIIIIIllI;
    }
    
    public void llllIIIIlIIIlIlllIll(final float ilIlIIIllIllIIIIIllI) {
        this.IlIlIIIllIllIIIIIllI = ilIlIIIllIllIIIIIllI;
    }
    
    public float IllIIlllIIIIlllIIlIl() {
        return this.IllIIlllIIIIlllIIlIl;
    }
    
    public void IlIlIlIlIlllllllllIl(final float illIIlllIIIIlllIIlIl) {
        this.IllIIlllIIIIlllIIlIl = illIIlllIIIIlllIIlIl;
    }
}
