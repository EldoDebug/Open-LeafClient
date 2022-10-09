package net.optifine.shaders.IlIlIlIlIlllllllllIl;

import net.optifine.shaders.llllIIIIlIIIlIlllIll.*;
import net.minecraft.client.*;
import net.minecraft.client.llIllIIIIIllIlIIIIlI.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.*;

public class IllIIlllIIIIlllIIlIl extends llIllIIIIIllIlIIIIlI
{
    private float IlIllIlIlIIIlIlIlIII;
    public boolean llllIIllllIlIlIIIIll;
    private IIIIlllIIIIIIlIIIlll IIlllIIlIllIllIlIIll;
    
    public IllIIlllIIIIlllIIlIl(final int n, final int n2, final int n3, final int n4, final int n5, final IIIIlllIIIIIIlIIIlll iIlllIIlIllIllIlIIll, final String s) {
        super(n, n2, n3, n4, n5, iIlllIIlIllIllIlIIll, s);
        this.IlIllIlIlIIIlIlIlIII = 1.0f;
        this.IIlllIIlIllIllIlIIll = null;
        this.IIlllIIlIllIllIlIIll = iIlllIIlIllIllIlIIll;
        this.IlIllIlIlIIIlIlIlIII = iIlllIIlIllIllIlIIll.IIlllIIlIllIllIlIIll();
        this.llIIlIIIlIIIllIlIIIl = net.optifine.shaders.IlIlIlIlIlllllllllIl.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(iIlllIIlIllIllIlIIll, this.IllIIlllIIIIlllIIlIl);
    }
    
    @Override
    protected int llllIIIIlIIIlIlllIll(final boolean b) {
        return 0;
    }
    
    @Override
    protected void IlIlIlIlIlllllllllIl(final Minecraft minecraft, final int n, final int n2) {
        if (this.IlIlIIIllIIllIlllllI) {
            if (this.llllIIllllIlIlIIIIll && !lIIllIIIllllIlllIllI.llllIIllllIlIlIIIIll()) {
                this.IlIllIlIlIIIlIlIlIII = (n - (this.lIIIIlIIIIIlllIllIII + 4)) / (float)(this.IllIIlllIIIIlllIIlIl - 8);
                this.IlIllIlIlIIIlIlIlIII = llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(this.IlIllIlIlIIIlIlIlIII, 0.0f, 1.0f);
                this.IIlllIIlIllIllIlIIll.llllIIIIlIIIlIlllIll(this.IlIllIlIlIIIlIlIlIII);
                this.IlIllIlIlIIIlIlIlIII = this.IIlllIIlIllIllIlIIll.IIlllIIlIllIllIlIIll();
                this.llIIlIIIlIIIllIlIIIl = net.optifine.shaders.IlIlIlIlIlllllllllIl.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(this.IIlllIIlIllIllIlIIll, this.IllIIlllIIIIlllIIlIl);
            }
            minecraft.lllIllIIIllllllIllll().llllIIIIlIIIlIlllIll(IllIIlllIIIIlllIIlIl.IlIlIIIllIllIIIIIllI);
            lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI(1.0f, 1.0f, 1.0f, 1.0f);
            this.IlIlIlIlIlllllllllIl(this.lIIIIlIIIIIlllIllIII + (int)(this.IlIllIlIlIIIlIlIlIII * (this.IllIIlllIIIIlllIIlIl - 8)), this.lIIIlllIIIllIIIllIII, 0, 66, 4, 20);
            this.IlIlIlIlIlllllllllIl(this.lIIIIlIIIIIlllIllIII + (int)(this.IlIllIlIlIIIlIlIlIII * (this.IllIIlllIIIIlllIIlIl - 8)) + 4, this.lIIIlllIIIllIIIllIII, 196, 66, 4, 20);
        }
    }
    
    @Override
    public boolean llIllIIIIIllIlIIIIlI(final Minecraft minecraft, final int n, final int n2) {
        if (super.llIllIIIIIllIlIIIIlI(minecraft, n, n2)) {
            this.IlIllIlIlIIIlIlIlIII = (n - (this.lIIIIlIIIIIlllIllIII + 4)) / (float)(this.IllIIlllIIIIlllIIlIl - 8);
            this.IlIllIlIlIIIlIlIlIII = llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(this.IlIllIlIlIIIlIlIlIII, 0.0f, 1.0f);
            this.IIlllIIlIllIllIlIIll.llllIIIIlIIIlIlllIll(this.IlIllIlIlIIIlIlIlIII);
            this.llIIlIIIlIIIllIlIIIl = net.optifine.shaders.IlIlIlIlIlllllllllIl.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(this.IIlllIIlIllIllIlIIll, this.IllIIlllIIIIlllIIlIl);
            return this.llllIIllllIlIlIIIIll = true;
        }
        return false;
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final int n, final int n2) {
        this.llllIIllllIlIlIIIIll = false;
    }
    
    @Override
    public void IlIIIlIlIIIllIlIlIIl() {
        this.IlIllIlIlIIIlIlIlIII = this.IIlllIIlIllIllIlIIll.IIlllIIlIllIllIlIIll();
    }
    
    @Override
    public boolean IlIlIIIllIllIIIIIllI() {
        return false;
    }
}
