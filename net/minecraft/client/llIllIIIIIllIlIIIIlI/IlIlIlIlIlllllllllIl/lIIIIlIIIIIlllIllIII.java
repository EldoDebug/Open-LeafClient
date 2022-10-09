package net.minecraft.client.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl;

import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.client.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.llIIlIIIlIIIllIlIIIl.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.*;

public class lIIIIlIIIIIlllIllIII extends lIIIlllIIIllIIIllIII
{
    private static final lIllllIllIllIIllllll IlIlIIIllIllIIIIIllI;
    private llIIIlIlIllIIlIlIlII IllIIlllIIIIlllIIlIl;
    private llIIIlIlIllIIlIlIlII llllIIIlIlllIlIIIIIl;
    private int lIIIIlIIIIIlllIllIII;
    
    static {
        IlIlIIIllIllIIIIIllI = new lIllllIllIllIIllllll("textures/gui/container/generic_54.png");
    }
    
    public lIIIIlIIIIIlllIllIII(final llIIIlIlIllIIlIlIlII illIIlllIIIIlllIIlIl, final llIIIlIlIllIIlIlIlII llllIIIlIlllIlIIIIIl) {
        super(new net.minecraft.llIIlIIIlIIIllIlIIIl.lIIIIlIIIIIlllIllIII(illIIlllIIIIlllIIlIl, llllIIIlIlllIlIIIIIl, Minecraft.getMinecraft().lIIIIlIIIIIlllIllIII));
        this.IllIIlllIIIIlllIIlIl = illIIlllIIIIlllIIlIl;
        this.llllIIIlIlllIlIIIIIl = llllIIIlIlllIlIIIIIl;
        this.IlIlIIIIIIlllIlIllIl = false;
        final int n = 222 - 108;
        this.lIIIIlIIIIIlllIllIII = llllIIIlIlllIlIIIIIl.lIIIlllIIIllIIIllIII() / 9;
        this.IlllllllIIIlIIIlIlII = n + this.lIIIIlIIIIIlllIllIII * 18;
    }
    
    @Override
    protected void llllIIIIlIIIlIlllIll(final int n, final int n2) {
        this.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll(this.llllIIIlIlllIlIIIIIl.v_().lIIIIlIIIIIlllIllIII(), 8, 6, 4210752);
        this.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll(this.IllIIlllIIIIlllIIlIl.v_().lIIIIlIIIIIlllIllIII(), 8, this.IlllllllIIIlIIIlIlII - 96 + 2, 4210752);
    }
    
    @Override
    protected void llllIIIIlIIIlIlllIll(final float n, final int n2, final int n3) {
        net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI(1.0f, 1.0f, 1.0f, 1.0f);
        this.IlIlIIIllIIllIlllllI.lllIllIIIllllllIllll().llllIIIIlIIIlIlllIll(net.minecraft.client.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII.IlIlIIIllIllIIIIIllI);
        final int n4 = (this.llllIIllllIlIlIIIIll - this.IlIlIIIlIIlIlIIlllIl) / 2;
        final int n5 = (this.IlIllIlIlIIIlIlIlIII - this.IlllllllIIIlIIIlIlII) / 2;
        this.IlIlIlIlIlllllllllIl(n4, n5, 0, 0, this.IlIlIIIlIIlIlIIlllIl, this.lIIIIlIIIIIlllIllIII * 18 + 17);
        this.IlIlIlIlIlllllllllIl(n4, n5 + this.lIIIIlIIIIIlllIllIII * 18 + 17, 0, 126, this.IlIlIIIlIIlIlIIlllIl, 96);
    }
}
