package net.minecraft.IIlllIIlIllIllIlIIll;

import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.client.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.*;

public class IlIlIIIlIIlIlIIlllIl extends IllIIlllIIIIlllIIlIl
{
    public float IlIlIlIlIlllllllllIl;
    public boolean llIllIIIIIllIlIIIIlI;
    private final float IlIIIlIlIIIllIlIlIIl;
    private final float IlIlIIIllIllIIIIIllI;
    private int IllIIlllIIIIlllIIlIl;
    
    public IlIlIIIlIIlIlIIlllIl(final int n, final int n2, final int n3, final int n4, final int n5, final int n6) {
        this(n, n2, n3, n4, n6, 0, 1.0f, (float)n5);
    }
    
    public IlIlIIIlIIlIlIIlllIl(final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final float ilIIIlIlIIIllIlIlIIl, final float ilIlIIIllIllIIIIIllI) {
        super(n, n2, n3, n4, 20, "");
        this.IlIlIlIlIlllllllllIl = 1.0f;
        this.IlIIIlIlIIIllIlIlIIl = ilIIIlIlIIIllIlIlIIl;
        this.IlIlIIIllIllIIIIIllI = ilIlIIIllIllIIIIIllI;
        this.IlIlIlIlIlllllllllIl = this.llllIIIIlIIIlIlllIll((float)n6);
        this.llllIIIIlIIIlIlllIll().llIIlIIIlIIIllIlIIIl = this.llllIIIlIlllIlIIIIIl();
    }
    
    public String llllIIIlIlllIlIIIIIl() {
        return "";
    }
    
    public float llllIIIIlIIIlIlllIll(final float n) {
        return llIllIIlllllllllllll.llllIIIIlIIIlIlllIll((this.llIllIIIIIllIlIIIIlI(n) - this.IlIIIlIlIIIllIlIlIIl) / (this.IlIlIIIllIllIIIIIllI - this.IlIIIlIlIIIllIlIlIIl), 0.0f, 1.0f);
    }
    
    public float IlIlIlIlIlllllllllIl(final float n) {
        return this.llIllIIIIIllIlIIIIlI(this.IlIIIlIlIIIllIlIlIIl + (this.IlIlIIIllIllIIIIIllI - this.IlIIIlIlIIIllIlIlIIl) * llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(n, 0.0f, 1.0f));
    }
    
    public float llIllIIIIIllIlIIIIlI(float ilIIIlIlIIIllIlIlIIl) {
        ilIIIlIlIIIllIlIlIIl = this.IlIIIlIlIIIllIlIlIIl(ilIIIlIlIIIllIlIlIIl);
        return llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(ilIIIlIlIIIllIlIlIIl, this.IlIIIlIlIIIllIlIlIIl, this.IlIlIIIllIllIIIIIllI);
    }
    
    protected float IlIIIlIlIIIllIlIlIIl(float n) {
        if (this.IllIIlllIIIIlllIIlIl > 0) {
            n = (float)(this.IllIIlllIIIIlllIIlIl * Math.round(n / this.IllIIlllIIIIlllIIlIl));
        }
        return n;
    }
    
    @Override
    public int IlIlIlIlIlllllllllIl(final boolean b) {
        return 0;
    }
    
    @Override
    public void IlIIIlIlIIIllIlIlIIl(final int n, final int n2) {
        if (this.llllIIIIlIIIlIlllIll().IlIlIIIllIIllIlllllI) {
            if (this.llIllIIIIIllIlIIIIlI) {
                this.IlIlIlIlIlllllllllIl = (n - (this.llllIIIIlIIIlIlllIll().lIIIIlIIIIIlllIllIII + 4)) / (float)(this.llllIIIIlIIIlIlllIll().IlIlIlIlIlllllllllIl() - 8);
                this.IlIlIlIlIlllllllllIl = llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(this.IlIlIlIlIlllllllllIl, 0.0f, 1.0f);
                final float ilIlIlIlIlllllllllIl = this.IlIlIlIlIlllllllllIl(this.IlIlIlIlIlllllllllIl);
                this.IlIlIIIllIllIIIIIllI(ilIlIlIlIlllllllllIl);
                this.IlIlIlIlIlllllllllIl = this.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl);
                this.llllIIIIlIIIlIlllIll().llIIlIIIlIIIllIlIIIl = this.llllIIIlIlllIlIIIIIl();
            }
            Minecraft.getMinecraft().lllIllIIIllllllIllll().llllIIIIlIIIlIlllIll(IlIlIIIlIIlIlIIlllIl.llllIIIIlIIIlIlllIll);
            lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI(1.0f, 1.0f, 1.0f, 1.0f);
            this.llllIIIIlIIIlIlllIll(this.llllIIIIlIIIlIlllIll().lIIIIlIIIIIlllIllIII + (int)(this.IlIlIlIlIlllllllllIl * (this.llllIIIIlIIIlIlllIll().IlIlIlIlIlllllllllIl() - 8)), this.llllIIIIlIIIlIlllIll().lIIIlllIIIllIIIllIII, 0, 66, 4, 20);
            this.llllIIIIlIIIlIlllIll(this.llllIIIIlIIIlIlllIll().lIIIIlIIIIIlllIllIII + (int)(this.IlIlIlIlIlllllllllIl * (this.llllIIIIlIIIlIlllIll().IlIlIlIlIlllllllllIl() - 8)) + 4, this.llllIIIIlIIIlIlllIll().lIIIlllIIIllIIIllIII, 196, 66, 4, 20);
        }
    }
    
    @Override
    public void IlIlIlIlIlllllllllIl(final int n, final int n2) {
        this.IlIlIlIlIlllllllllIl = (n - (this.llllIIIIlIIIlIlllIll().lIIIIlIIIIIlllIllIII + 4)) / (float)(this.llllIIIIlIIIlIlllIll().IlIlIlIlIlllllllllIl() - 8);
        this.IlIlIlIlIlllllllllIl = llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(this.IlIlIlIlIlllllllllIl, 0.0f, 1.0f);
        this.IlIlIIIllIllIIIIIllI(this.IlIlIlIlIlllllllllIl(this.IlIlIlIlIlllllllllIl));
        this.llllIIIIlIIIlIlllIll().llIIlIIIlIIIllIlIIIl = this.llllIIIlIlllIlIIIIIl();
        this.llIllIIIIIllIlIIIIlI = true;
    }
    
    public void IlIlIIIllIllIIIIIllI(final float n) {
    }
    
    @Override
    public void llIllIIIIIllIlIIIIlI(final int n, final int n2) {
        this.llIllIIIIIllIlIIIIlI = false;
    }
}
