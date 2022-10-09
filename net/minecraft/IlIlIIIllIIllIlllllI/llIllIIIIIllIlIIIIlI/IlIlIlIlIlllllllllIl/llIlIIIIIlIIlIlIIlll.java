package net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl;

import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.*;
import net.minecraft.IlIlIIIllIIllIlllllI.*;

public class llIlIIIIIlIIlIlIIlll implements IIlIIIIIllIlIIIlIIll
{
    private IlIllllIIlIIlIlIlIll llllIIIIlIIIlIlllIll;
    private float IlIlIlIlIlllllllllIl;
    private float llIllIIIIIllIlIIIIlI;
    private float IlIIIlIlIIIllIlIlIIl;
    private float IlIlIIIllIllIIIIIllI;
    private float IllIIlllIIIIlllIIlIl;
    private float llllIIIlIlllIlIIIIIl;
    private float lIIIIlIIIIIlllIllIII;
    private int lIIIlllIIIllIIIllIII;
    private boolean llIIlIIIlIIIllIlIIIl;
    private int[] llIllIlIIIIllIlIIllI;
    
    public llIlIIIIIlIIlIlIIlll() {
    }
    
    public llIlIIIIIlIIlIlIIlll(final IlIllllIIlIIlIlIlIll llllIIIIlIIIlIlllIll, final boolean llIIlIIIlIIIllIlIIIl, final float ilIlIlIlIlllllllllIl, final float llIllIIIIIllIlIIIIlI, final float ilIIIlIlIIIllIlIlIIl, final float ilIlIIIllIllIIIIIllI, final float illIIlllIIIIlllIIlIl, final float llllIIIlIlllIlIIIIIl, final float liiiIlIIIIIlllIllIII, final int liiIlllIIIllIIIllIII, final int... llIllIlIIIIllIlIIllI) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.llIIlIIIlIIIllIlIIIl = llIIlIIIlIIIllIlIIIl;
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
        this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
        this.IlIIIlIlIIIllIlIlIIl = ilIIIlIlIIIllIlIlIIl;
        this.IlIlIIIllIllIIIIIllI = ilIlIIIllIllIIIIIllI;
        this.IllIIlllIIIIlllIIlIl = illIIlllIIIIlllIIlIl;
        this.llllIIIlIlllIlIIIIIl = llllIIIlIlllIlIIIIIl;
        this.lIIIIlIIIIIlllIllIII = liiiIlIIIIIlllIllIII;
        this.lIIIlllIIIllIIIllIII = liiIlllIIIllIIIllIII;
        this.llIllIlIIIIllIlIIllI = llIllIlIIIIllIlIIllI;
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final llllllIllIllIlIllllI llllllIllIllIlIllllI) {
        this.llllIIIIlIIIlIlllIll = IlIllllIIlIIlIlIlIll.llllIIIIlIIIlIlllIll(llllllIllIllIlIllllI.readInt());
        if (this.llllIIIIlIIIlIlllIll == null) {
            this.llllIIIIlIIIlIlllIll = IlIllllIIlIIlIlIlIll.IlIIIlIIIllllIlIlIlI;
        }
        this.llIIlIIIlIIIllIlIIIl = llllllIllIllIlIllllI.readBoolean();
        this.IlIlIlIlIlllllllllIl = llllllIllIllIlIllllI.readFloat();
        this.llIllIIIIIllIlIIIIlI = llllllIllIllIlIllllI.readFloat();
        this.IlIIIlIlIIIllIlIlIIl = llllllIllIllIlIllllI.readFloat();
        this.IlIlIIIllIllIIIIIllI = llllllIllIllIlIllllI.readFloat();
        this.IllIIlllIIIIlllIIlIl = llllllIllIllIlIllllI.readFloat();
        this.llllIIIlIlllIlIIIIIl = llllllIllIllIlIllllI.readFloat();
        this.lIIIIlIIIIIlllIllIII = llllllIllIllIlIllllI.readFloat();
        this.lIIIlllIIIllIIIllIII = llllllIllIllIlIllllI.readInt();
        final int ilIIIlIlIIIllIlIlIIl = this.llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl();
        this.llIllIlIIIIllIlIIllI = new int[ilIIIlIlIIIllIlIlIIl];
        for (int i = 0; i < ilIIIlIlIIIllIlIlIIl; ++i) {
            this.llIllIlIIIIllIlIIllI[i] = llllllIllIllIlIllllI.IlIIIlIlIIIllIlIlIIl();
        }
    }
    
    @Override
    public void IlIlIlIlIlllllllllIl(final llllllIllIllIlIllllI llllllIllIllIlIllllI) {
        llllllIllIllIlIllllI.writeInt(this.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI());
        llllllIllIllIlIllllI.writeBoolean(this.llIIlIIIlIIIllIlIIIl);
        llllllIllIllIlIllllI.writeFloat(this.IlIlIlIlIlllllllllIl);
        llllllIllIllIlIllllI.writeFloat(this.llIllIIIIIllIlIIIIlI);
        llllllIllIllIlIllllI.writeFloat(this.IlIIIlIlIIIllIlIlIIl);
        llllllIllIllIlIllllI.writeFloat(this.IlIlIIIllIllIIIIIllI);
        llllllIllIllIlIllllI.writeFloat(this.IllIIlllIIIIlllIIlIl);
        llllllIllIllIlIllllI.writeFloat(this.llllIIIlIlllIlIIIIIl);
        llllllIllIllIlIllllI.writeFloat(this.lIIIIlIIIIIlllIllIII);
        llllllIllIllIlIllllI.writeInt(this.lIIIlllIIIllIIIllIII);
        for (int ilIIIlIlIIIllIlIlIIl = this.llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl(), i = 0; i < ilIIIlIlIIIllIlIlIIl; ++i) {
            llllllIllIllIlIllllI.IlIlIlIlIlllllllllIl(this.llIllIlIIIIllIlIIllI[i]);
        }
    }
    
    public IlIllllIIlIIlIlIlIll llllIIIIlIIIlIlllIll() {
        return this.llllIIIIlIIIlIlllIll;
    }
    
    public boolean IlIlIlIlIlllllllllIl() {
        return this.llIIlIIIlIIIllIlIIIl;
    }
    
    public double llIllIIIIIllIlIIIIlI() {
        return this.IlIlIlIlIlllllllllIl;
    }
    
    public double IlIIIlIlIIIllIlIlIIl() {
        return this.llIllIIIIIllIlIIIIlI;
    }
    
    public double IlIlIIIllIllIIIIIllI() {
        return this.IlIIIlIlIIIllIlIlIIl;
    }
    
    public float IllIIlllIIIIlllIIlIl() {
        return this.IlIlIIIllIllIIIIIllI;
    }
    
    public float llllIIIlIlllIlIIIIIl() {
        return this.IllIIlllIIIIlllIIlIl;
    }
    
    public float lIIIIlIIIIIlllIllIII() {
        return this.llllIIIlIlllIlIIIIIl;
    }
    
    public float lIIIlllIIIllIIIllIII() {
        return this.lIIIIlIIIIIlllIllIII;
    }
    
    public int llIIlIIIlIIIllIlIIIl() {
        return this.lIIIlllIIIllIIIllIII;
    }
    
    public int[] llIllIlIIIIllIlIIllI() {
        return this.llIllIlIIIIllIlIIllI;
    }
    
    public void llllIIIIlIIIlIlllIll(final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(this);
    }
}
