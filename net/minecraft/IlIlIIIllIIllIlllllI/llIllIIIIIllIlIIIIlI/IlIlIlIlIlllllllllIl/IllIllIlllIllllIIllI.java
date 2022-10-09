package net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl;

import org.apache.commons.lang3.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.*;
import net.minecraft.IlIlIIIllIIllIlllllI.*;

public class IllIllIlllIllllIIllI implements IIlIIIIIllIlIIIlIIll
{
    private String llllIIIIlIIIlIlllIll;
    private int IlIlIlIlIlllllllllIl;
    private int llIllIIIIIllIlIIIIlI;
    private int IlIIIlIlIIIllIlIlIIl;
    private float IlIlIIIllIllIIIIIllI;
    private int IllIIlllIIIIlllIIlIl;
    
    public IllIllIlllIllllIIllI() {
        this.llIllIIIIIllIlIIIIlI = Integer.MAX_VALUE;
    }
    
    public IllIllIlllIllllIIllI(final String llllIIIIlIIIlIlllIll, final double n, final double n2, final double n3, final float ilIlIIIllIllIIIIIllI, float llllIIIIlIIIlIlllIll2) {
        this.llIllIIIIIllIlIIIIlI = Integer.MAX_VALUE;
        Validate.notNull((Object)llllIIIIlIIIlIlllIll, "name", new Object[0]);
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.IlIlIlIlIlllllllllIl = (int)(n * 8.0);
        this.llIllIIIIIllIlIIIIlI = (int)(n2 * 8.0);
        this.IlIIIlIlIIIllIlIlIIl = (int)(n3 * 8.0);
        this.IlIlIIIllIllIIIIIllI = ilIlIIIllIllIIIIIllI;
        this.IllIIlllIIIIlllIIlIl = (int)(llllIIIIlIIIlIlllIll2 * 63.0f);
        llllIIIIlIIIlIlllIll2 = llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll2, 0.0f, 255.0f);
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final llllllIllIllIlIllllI llllllIllIllIlIllllI) {
        this.llllIIIIlIIIlIlllIll = llllllIllIllIlIllllI.llIllIIIIIllIlIIIIlI(256);
        this.IlIlIlIlIlllllllllIl = llllllIllIllIlIllllI.readInt();
        this.llIllIIIIIllIlIIIIlI = llllllIllIllIlIllllI.readInt();
        this.IlIIIlIlIIIllIlIlIIl = llllllIllIllIlIllllI.readInt();
        this.IlIlIIIllIllIIIIIllI = llllllIllIllIlIllllI.readFloat();
        this.IllIIlllIIIIlllIIlIl = llllllIllIllIlIllllI.readUnsignedByte();
    }
    
    @Override
    public void IlIlIlIlIlllllllllIl(final llllllIllIllIlIllllI llllllIllIllIlIllllI) {
        llllllIllIllIlIllllI.llllIIIIlIIIlIlllIll(this.llllIIIIlIIIlIlllIll);
        llllllIllIllIlIllllI.writeInt(this.IlIlIlIlIlllllllllIl);
        llllllIllIllIlIllllI.writeInt(this.llIllIIIIIllIlIIIIlI);
        llllllIllIllIlIllllI.writeInt(this.IlIIIlIlIIIllIlIlIIl);
        llllllIllIllIlIllllI.writeFloat(this.IlIlIIIllIllIIIIIllI);
        llllllIllIllIlIllllI.writeByte(this.IllIIlllIIIIlllIIlIl);
    }
    
    public String llllIIIIlIIIlIlllIll() {
        return this.llllIIIIlIIIlIlllIll;
    }
    
    public double IlIlIlIlIlllllllllIl() {
        return this.IlIlIlIlIlllllllllIl / 8.0f;
    }
    
    public double llIllIIIIIllIlIIIIlI() {
        return this.llIllIIIIIllIlIIIIlI / 8.0f;
    }
    
    public double IlIIIlIlIIIllIlIlIIl() {
        return this.IlIIIlIlIIIllIlIlIIl / 8.0f;
    }
    
    public float IlIlIIIllIllIIIIIllI() {
        return this.IlIlIIIllIllIIIIIllI;
    }
    
    public float IllIIlllIIIIlllIIlIl() {
        return this.IllIIlllIIIIlllIIlIl / 63.0f;
    }
    
    public void llllIIIIlIIIlIlllIll(final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(this);
    }
}
