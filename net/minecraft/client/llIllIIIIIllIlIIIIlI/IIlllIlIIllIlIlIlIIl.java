package net.minecraft.client.llIllIIIIIllIlIIIIlI;

import net.minecraft.client.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.client.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.llIIlIIIlIIIllIlIIIl.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.*;

public class IIlllIlIIllIlIlIlIIl extends lIIIlllIIIllIIIllIII
{
    private static final lIllllIllIllIIllllll IlIlIIIllIllIIIIIllI;
    private llIIIlIlIllIIlIlIlII IllIIlllIIIIlllIIlIl;
    private llIIIlIlIllIIlIlIlII llllIIIlIlllIlIIIIIl;
    
    static {
        IlIlIIIllIllIIIIIllI = new lIllllIllIllIIllllll("textures/gui/container/hopper.png");
    }
    
    public IIlllIlIIllIlIlIlIIl(final IllIIlllIIIIlllIIlIl illIIlllIIIIlllIIlIl, final llIIIlIlIllIIlIlIlII llllIIIlIlllIlIIIIIl) {
        super(new llllIIllllIlIlIIIIll(illIIlllIIIIlllIIlIl, llllIIIlIlllIlIIIIIl, Minecraft.getMinecraft().lIIIIlIIIIIlllIllIII));
        this.IllIIlllIIIIlllIIlIl = illIIlllIIIIlllIIlIl;
        this.llllIIIlIlllIlIIIIIl = llllIIIlIlllIlIIIIIl;
        this.IlIlIIIIIIlllIlIllIl = false;
        this.IlllllllIIIlIIIlIlII = 133;
    }
    
    @Override
    protected void llllIIIIlIIIlIlllIll(final int n, final int n2) {
        this.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll(this.llllIIIlIlllIlIIIIIl.v_().lIIIIlIIIIIlllIllIII(), 8, 6, 4210752);
        this.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll(this.IllIIlllIIIIlllIIlIl.v_().lIIIIlIIIIIlllIllIII(), 8, this.IlllllllIIIlIIIlIlII - 96 + 2, 4210752);
    }
    
    @Override
    protected void llllIIIIlIIIlIlllIll(final float n, final int n2, final int n3) {
        net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI(1.0f, 1.0f, 1.0f, 1.0f);
        this.IlIlIIIllIIllIlllllI.lllIllIIIllllllIllll().llllIIIIlIIIlIlllIll(IIlllIlIIllIlIlIlIIl.IlIlIIIllIllIIIIIllI);
        this.IlIlIlIlIlllllllllIl((this.llllIIllllIlIlIIIIll - this.IlIlIIIlIIlIlIIlllIl) / 2, (this.IlIllIlIlIIIlIlIlIII - this.IlllllllIIIlIIIlIlII) / 2, 0, 0, this.IlIlIIIlIIlIlIIlllIl, this.IlllllllIIIlIIIlIlII);
    }
}
