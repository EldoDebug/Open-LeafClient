package net.minecraft.client.llIllIIIIIllIlIIIIlI;

import net.minecraft.client.llIIlIIIlIIIllIlIIIl.*;
import net.minecraft.client.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.*;

public class IIlIlllIlIlllIlIllll extends IlIIIlIlIIIllIlIlIIl
{
    private float IlIllIlIlIIIlIlIlIII;
    public boolean llllIIllllIlIlIIIIll;
    private String IIlllIIlIllIllIlIIll;
    private final float lllIIIIlllllIlIIllIl;
    private final float IlIlIIIIIIlllIlIllIl;
    private final lIlIIlllIIlIIlIlllIl IIllIIllIIIlIlIIIIlI;
    private lIllllIllIllIIllllll IIIlIIIlIlIIlllIIlll;
    
    public IIlIlllIlIlllIlIllll(final lIlIIlllIIlIIlIlllIl iIllIIllIIIlIlIIIIlI, final int n, final int n2, final int n3, final String iIlllIIlIllIllIlIIll, final float lllIIIIlllllIlIIllIl, final float ilIlIIIIIIlllIlIllIl, final float n4, final lIllllIllIllIIllllll iiIlIIIlIlIIlllIIlll) {
        super(n, n2, n3, 150, 20, "");
        this.IlIllIlIlIIIlIlIlIII = 1.0f;
        this.IIlllIIlIllIllIlIIll = iIlllIIlIllIllIlIIll;
        this.lllIIIIlllllIlIIllIl = lllIIIIlllllIlIIllIl;
        this.IlIlIIIIIIlllIlIllIl = ilIlIIIIIIlllIlIllIl;
        this.IlIllIlIlIIIlIlIlIII = (n4 - lllIIIIlllllIlIIllIl) / (ilIlIIIIIIlllIlIllIl - lllIIIIlllllIlIIllIl);
        this.IIIlIIIlIlIIlllIIlll = iiIlIIIlIlIIlllIIlll;
        this.IIllIIllIIIlIlIIIIlI = iIllIIllIIIlIlIIIIlI;
        this.llIIlIIIlIIIllIlIIIl = this.IlIlIIIllIllIIIIIllI();
    }
    
    public float llIllIIIIIllIlIIIIlI() {
        return this.lllIIIIlllllIlIIllIl + (this.IlIlIIIIIIlllIlIllIl - this.lllIIIIlllllIlIIllIl) * this.IlIllIlIlIIIlIlIlIII;
    }
    
    public void llllIIIIlIIIlIlllIll(final float n, final boolean b) {
        this.IlIllIlIlIIIlIlIlIII = (n - this.lllIIIIlllllIlIIllIl) / (this.IlIlIIIIIIlllIlIllIl - this.lllIIIIlllllIlIIllIl);
        this.llIIlIIIlIIIllIlIIIl = this.IlIlIIIllIllIIIIIllI();
        if (b) {
            this.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll(this.llIllIlIIIIllIlIIllI, this.llIllIIIIIllIlIIIIlI());
        }
    }
    
    public float IlIIIlIlIIIllIlIlIIl() {
        return this.IlIllIlIlIIIlIlIlIII;
    }
    
    private String IlIlIIIllIllIIIIIllI() {
        return (this.IIIlIIIlIlIIlllIIlll == null) ? (String.valueOf(net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(this.IIlllIIlIllIllIlIIll, new Object[0])) + ": " + this.llIllIIIIIllIlIIIIlI()) : this.IIIlIIIlIlIIlllIIlll.llllIIIIlIIIlIlllIll(this.llIllIlIIIIllIlIIllI, net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(this.IIlllIIlIllIllIlIIll, new Object[0]), this.llIllIIIIIllIlIIIIlI());
    }
    
    @Override
    protected int llllIIIIlIIIlIlllIll(final boolean b) {
        return 0;
    }
    
    @Override
    protected void IlIlIlIlIlllllllllIl(final Minecraft minecraft, final int n, final int n2) {
        if (this.IlIlIIIllIIllIlllllI) {
            if (this.llllIIllllIlIlIIIIll) {
                this.IlIllIlIlIIIlIlIlIII = (n - (this.lIIIIlIIIIIlllIllIII + 4)) / (float)(this.IllIIlllIIIIlllIIlIl - 8);
                if (this.IlIllIlIlIIIlIlIlIII < 0.0f) {
                    this.IlIllIlIlIIIlIlIlIII = 0.0f;
                }
                if (this.IlIllIlIlIIIlIlIlIII > 1.0f) {
                    this.IlIllIlIlIIIlIlIlIII = 1.0f;
                }
                this.llIIlIIIlIIIllIlIIIl = this.IlIlIIIllIllIIIIIllI();
                this.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll(this.llIllIlIIIIllIlIIllI, this.llIllIIIIIllIlIIIIlI());
            }
            lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI(1.0f, 1.0f, 1.0f, 1.0f);
            this.IlIlIlIlIlllllllllIl(this.lIIIIlIIIIIlllIllIII + (int)(this.IlIllIlIlIIIlIlIlIII * (this.IllIIlllIIIIlllIIlIl - 8)), this.lIIIlllIIIllIIIllIII, 0, 66, 4, 20);
            this.IlIlIlIlIlllllllllIl(this.lIIIIlIIIIIlllIllIII + (int)(this.IlIllIlIlIIIlIlIlIII * (this.IllIIlllIIIIlllIIlIl - 8)) + 4, this.lIIIlllIIIllIIIllIII, 196, 66, 4, 20);
        }
    }
    
    public void llllIIIIlIIIlIlllIll(final float ilIllIlIlIIIlIlIlIII) {
        this.IlIllIlIlIIIlIlIlIII = ilIllIlIlIIIlIlIlIII;
        this.llIIlIIIlIIIllIlIIIl = this.IlIlIIIllIllIIIIIllI();
        this.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll(this.llIllIlIIIIllIlIIllI, this.llIllIIIIIllIlIIIIlI());
    }
    
    @Override
    public boolean llIllIIIIIllIlIIIIlI(final Minecraft minecraft, final int n, final int n2) {
        if (super.llIllIIIIIllIlIIIIlI(minecraft, n, n2)) {
            this.IlIllIlIlIIIlIlIlIII = (n - (this.lIIIIlIIIIIlllIllIII + 4)) / (float)(this.IllIIlllIIIIlllIIlIl - 8);
            if (this.IlIllIlIlIIIlIlIlIII < 0.0f) {
                this.IlIllIlIlIIIlIlIlIII = 0.0f;
            }
            if (this.IlIllIlIlIIIlIlIlIII > 1.0f) {
                this.IlIllIlIlIIIlIlIlIII = 1.0f;
            }
            this.llIIlIIIlIIIllIlIIIl = this.IlIlIIIllIllIIIIIllI();
            this.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll(this.llIllIlIIIIllIlIIllI, this.llIllIIIIIllIlIIIIlI());
            return this.llllIIllllIlIlIIIIll = true;
        }
        return false;
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final int n, final int n2) {
        this.llllIIllllIlIlIIIIll = false;
    }
}
