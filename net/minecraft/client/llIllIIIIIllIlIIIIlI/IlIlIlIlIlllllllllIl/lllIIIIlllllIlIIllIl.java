package net.minecraft.client.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl;

import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.IllIIlllIIIIlllIIlIl.*;
import net.minecraft.client.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.llIIlIIIlIIIllIlIIIl.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.*;

public class lllIIIIlllllIlIIllIl extends lIIIlllIIIllIIIllIII
{
    private static final lIllllIllIllIIllllll IlIlIIIllIllIIIIIllI;
    private llIIIlIlIllIIlIlIlII IllIIlllIIIIlllIIlIl;
    private llIIIlIlIllIIlIlIlII llllIIIlIlllIlIIIIIl;
    private IllIIlllIIIIlllIIlIl lIIIIlIIIIIlllIllIII;
    private float lIIIlllIIIllIIIllIII;
    private float llIIlIIIlIIIllIlIIIl;
    
    static {
        IlIlIIIllIllIIIIIllI = new lIllllIllIllIIllllll("textures/gui/container/horse.png");
    }
    
    public lllIIIIlllllIlIIllIl(final llIIIlIlIllIIlIlIlII illIIlllIIIIlllIIlIl, final llIIIlIlIllIIlIlIlII llllIIIlIlllIlIIIIIl, final IllIIlllIIIIlllIIlIl liiiIlIIIIIlllIllIII) {
        super(new IlIllIlIlIIIlIlIlIII(illIIlllIIIIlllIIlIl, llllIIIlIlllIlIIIIIl, liiiIlIIIIIlllIllIII, Minecraft.getMinecraft().lIIIIlIIIIIlllIllIII));
        this.IllIIlllIIIIlllIIlIl = illIIlllIIIIlllIIlIl;
        this.llllIIIlIlllIlIIIIIl = llllIIIlIlllIlIIIIIl;
        this.lIIIIlIIIIIlllIllIII = liiiIlIIIIIlllIllIII;
        this.IlIlIIIIIIlllIlIllIl = false;
    }
    
    @Override
    protected void llllIIIIlIIIlIlllIll(final int n, final int n2) {
        this.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll(this.llllIIIlIlllIlIIIIIl.v_().lIIIIlIIIIIlllIllIII(), 8, 6, 4210752);
        this.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll(this.IllIIlllIIIIlllIIlIl.v_().lIIIIlIIIIIlllIllIII(), 8, this.IlllllllIIIlIIIlIlII - 96 + 2, 4210752);
    }
    
    @Override
    protected void llllIIIIlIIIlIlllIll(final float n, final int n2, final int n3) {
        net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI(1.0f, 1.0f, 1.0f, 1.0f);
        this.IlIlIIIllIIllIlllllI.lllIllIIIllllllIllll().llllIIIIlIIIlIlllIll(lllIIIIlllllIlIIllIl.IlIlIIIllIllIIIIIllI);
        final int n4 = (this.llllIIllllIlIlIIIIll - this.IlIlIIIlIIlIlIIlllIl) / 2;
        final int n5 = (this.IlIllIlIlIIIlIlIlIII - this.IlllllllIIIlIIIlIlII) / 2;
        this.IlIlIlIlIlllllllllIl(n4, n5, 0, 0, this.IlIlIIIlIIlIlIIlllIl, this.IlllllllIIIlIIIlIlII);
        if (this.lIIIIlIIIIIlllIllIII.ay()) {
            this.IlIlIlIlIlllllllllIl(n4 + 79, n5 + 17, 0, this.IlllllllIIIlIIIlIlII, 90, 54);
        }
        if (this.lIIIIlIIIIIlllIllIII.aP()) {
            this.IlIlIlIlIlllllllllIl(n4 + 7, n5 + 35, 0, this.IlllllllIIIlIIIlIlII + 54, 18, 18);
        }
        net.minecraft.client.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl.IIlllIIlIllIllIlIIll.llllIIIIlIIIlIlllIll(n4 + 51, n5 + 60, 17, n4 + 51 - this.lIIIlllIIIllIIIllIII, n5 + 75 - 50 - this.llIIlIIIlIIIllIlIIIl, this.lIIIIlIIIIIlllIllIII);
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final int n, final int n2, final float n3) {
        this.lIIIlllIIIllIIIllIII = (float)n;
        this.llIIlIIIlIIIllIlIIIl = (float)n2;
        super.llllIIIIlIIIlIlllIll(n, n2, n3);
    }
}
