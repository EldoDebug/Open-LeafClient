package net.minecraft.client.llIllIIIIIllIlIIIIlI;

import net.minecraft.client.llIllIlIIIIllIlIIllI.*;
import net.minecraft.client.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.*;

public class IlIIlIlIIIlIIlIlIlII extends IlIIIlIlIIIllIlIlIIl
{
    private float IlIllIlIlIIIlIlIlIII;
    public boolean llllIIllllIlIlIIIIll;
    private net.minecraft.client.llIllIlIIIIllIlIIllI.llIllIIIIIllIlIIIIlI IIlllIIlIllIllIlIIll;
    private final float lllIIIIlllllIlIIllIl;
    private final float IlIlIIIIIIlllIlIllIl;
    
    public IlIIlIlIIIlIIlIlIlII(final int n, final int n2, final int n3, final net.minecraft.client.llIllIlIIIIllIlIIllI.llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI) {
        this(n, n2, n3, llIllIIIIIllIlIIIIlI, 0.0f, 1.0f);
    }
    
    public IlIIlIlIIIlIIlIlIlII(final int n, final int n2, final int n3, final net.minecraft.client.llIllIlIIIIllIlIIllI.llIllIIIIIllIlIIIIlI iIlllIIlIllIllIlIIll, final float lllIIIIlllllIlIIllIl, final float ilIlIIIIIIlllIlIllIl) {
        super(n, n2, n3, 150, 20, "");
        this.IlIllIlIlIIIlIlIlIII = 1.0f;
        this.IIlllIIlIllIllIlIIll = iIlllIIlIllIllIlIIll;
        this.lllIIIIlllllIlIIllIl = lllIIIIlllllIlIIllIl;
        this.IlIlIIIIIIlllIlIllIl = ilIlIIIIIIlllIlIllIl;
        final Minecraft minecraft = Minecraft.getMinecraft();
        this.IlIllIlIlIIIlIlIlIII = iIlllIIlIllIllIlIIll.IlIlIlIlIlllllllllIl(minecraft.IIIlIIIlIlIIlllIIlll.llllIIIIlIIIlIlllIll(iIlllIIlIllIllIlIIll));
        this.llIIlIIIlIIIllIlIIIl = minecraft.IIIlIIIlIlIIlllIIlll.llIllIIIIIllIlIIIIlI(iIlllIIlIllIllIlIIll);
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
                this.IlIllIlIlIIIlIlIlIII = llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(this.IlIllIlIlIIIlIlIlIII, 0.0f, 1.0f);
                final float llIllIIIIIllIlIIIIlI = this.IIlllIIlIllIllIlIIll.llIllIIIIIllIlIIIIlI(this.IlIllIlIlIIIlIlIlIII);
                minecraft.IIIlIIIlIlIIlllIIlll.llllIIIIlIIIlIlllIll(this.IIlllIIlIllIllIlIIll, llIllIIIIIllIlIIIIlI);
                this.IlIllIlIlIIIlIlIlIII = this.IIlllIIlIllIllIlIIll.IlIlIlIlIlllllllllIl(llIllIIIIIllIlIIIIlI);
                this.llIIlIIIlIIIllIlIIIl = minecraft.IIIlIIIlIlIIlllIIlll.llIllIIIIIllIlIIIIlI(this.IIlllIIlIllIllIlIIll);
            }
            minecraft.lllIllIIIllllllIllll().llllIIIIlIIIlIlllIll(IlIIlIlIIIlIIlIlIlII.IlIlIIIllIllIIIIIllI);
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
            minecraft.IIIlIIIlIlIIlllIIlll.llllIIIIlIIIlIlllIll(this.IIlllIIlIllIllIlIIll, this.IIlllIIlIllIllIlIIll.llIllIIIIIllIlIIIIlI(this.IlIllIlIlIIIlIlIlIII));
            this.llIIlIIIlIIIllIlIIIl = minecraft.IIIlIIIlIlIIlllIIlll.llIllIIIIIllIlIIIIlI(this.IIlllIIlIllIllIlIIll);
            return this.llllIIllllIlIlIIIIll = true;
        }
        return false;
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final int n, final int n2) {
        this.llllIIllllIlIlIIIIll = false;
    }
}
