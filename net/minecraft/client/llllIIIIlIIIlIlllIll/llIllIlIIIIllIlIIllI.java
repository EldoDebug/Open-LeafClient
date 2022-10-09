package net.minecraft.client.llllIIIIlIIIlIlllIll;

import net.minecraft.IlllllllIIIlIIIlIlII.*;

public abstract class llIllIlIIIIllIlIIllI implements IlIlIlIlIlllllllllIl
{
    protected final lIllllIllIllIIllllll IlIlIlIlIlllllllllIl;
    protected float llIllIIIIIllIlIIIIlI;
    protected float IlIIIlIlIIIllIlIlIIl;
    protected float IlIlIIIllIllIIIIIllI;
    protected float IllIIlllIIIIlllIIlIl;
    protected float llllIIIlIlllIlIIIIIl;
    protected boolean lIIIIlIIIIIlllIllIII;
    protected int lIIIlllIIIllIIIllIII;
    protected llIllIIIIIllIlIIIIlI llIIlIIIlIIIllIlIIIl;
    
    protected llIllIlIIIIllIlIIllI(final lIllllIllIllIIllllll ilIlIlIlIlllllllllIl) {
        this.llIllIIIIIllIlIIIIlI = 1.0f;
        this.IlIIIlIlIIIllIlIlIIl = 1.0f;
        this.lIIIIlIIIIIlllIllIII = false;
        this.lIIIlllIIIllIIIllIII = 0;
        this.llIIlIIIlIIIllIlIIIl = net.minecraft.client.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl;
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
    }
    
    @Override
    public lIllllIllIllIIllllll IlIlIlIlIlllllllllIl() {
        return this.IlIlIlIlIlllllllllIl;
    }
    
    @Override
    public boolean llIllIIIIIllIlIIIIlI() {
        return this.lIIIIlIIIIIlllIllIII;
    }
    
    @Override
    public int IlIIIlIlIIIllIlIlIIl() {
        return this.lIIIlllIIIllIIIllIII;
    }
    
    @Override
    public float IlIlIIIllIllIIIIIllI() {
        return this.llIllIIIIIllIlIIIIlI;
    }
    
    @Override
    public float IllIIlllIIIIlllIIlIl() {
        return this.IlIIIlIlIIIllIlIlIIl;
    }
    
    @Override
    public float llllIIIlIlllIlIIIIIl() {
        return this.IlIlIIIllIllIIIIIllI;
    }
    
    @Override
    public float lIIIIlIIIIIlllIllIII() {
        return this.IllIIlllIIIIlllIIlIl;
    }
    
    @Override
    public float lIIIlllIIIllIIIllIII() {
        return this.llllIIIlIlllIlIIIIIl;
    }
    
    @Override
    public llIllIIIIIllIlIIIIlI llIIlIIIlIIIllIlIIIl() {
        return this.llIIlIIIlIIIllIlIIIl;
    }
}
