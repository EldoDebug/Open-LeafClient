package net.minecraft.client.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl;

import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.llIIlIIIlIIIllIlIIIl.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.*;

public class IIIIlllIIIIIIlIIIlll extends lIIIlllIIIllIIIllIII
{
    private static final lIllllIllIllIIllllll IllIIlllIIIIlllIIlIl;
    private final IllIIlllIIIIlllIIlIl llllIIIlIlllIlIIIIIl;
    public llIIIlIlIllIIlIlIlII IlIlIIIllIllIIIIIllI;
    
    static {
        IllIIlllIIIIlllIIlIl = new lIllllIllIllIIllllll("textures/gui/container/dispenser.png");
    }
    
    public IIIIlllIIIIIIlIIIlll(final IllIIlllIIIIlllIIlIl llllIIIlIlllIlIIIIIl, final llIIIlIlIllIIlIlIlII ilIlIIIllIllIIIIIllI) {
        super(new net.minecraft.llIIlIIIlIIIllIlIIIl.lIIIlllIIIllIIIllIII(llllIIIlIlllIlIIIIIl, ilIlIIIllIllIIIIIllI));
        this.llllIIIlIlllIlIIIIIl = llllIIIlIlllIlIIIIIl;
        this.IlIlIIIllIllIIIIIllI = ilIlIIIllIllIIIIIllI;
    }
    
    @Override
    protected void llllIIIIlIIIlIlllIll(final int n, final int n2) {
        final String liiiIlIIIIIlllIllIII = this.IlIlIIIllIllIIIIIllI.v_().lIIIIlIIIIIlllIllIII();
        this.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll(liiiIlIIIIIlllIllIII, this.IlIlIIIlIIlIlIIlllIl / 2 - this.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll(liiiIlIIIIIlllIllIII) / 2, 6, 4210752);
        this.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll(this.llllIIIlIlllIlIIIIIl.v_().lIIIIlIIIIIlllIllIII(), 8, this.IlllllllIIIlIIIlIlII - 96 + 2, 4210752);
    }
    
    @Override
    protected void llllIIIIlIIIlIlllIll(final float n, final int n2, final int n3) {
        net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI(1.0f, 1.0f, 1.0f, 1.0f);
        this.IlIlIIIllIIllIlllllI.lllIllIIIllllllIllll().llllIIIIlIIIlIlllIll(IIIIlllIIIIIIlIIIlll.IllIIlllIIIIlllIIlIl);
        this.IlIlIlIlIlllllllllIl((this.llllIIllllIlIlIIIIll - this.IlIlIIIlIIlIlIIlllIl) / 2, (this.IlIllIlIlIIIlIlIlIII - this.IlllllllIIIlIIIlIlII) / 2, 0, 0, this.IlIlIIIlIIlIlIIlllIl, this.IlllllllIIIlIIIlIlII);
    }
}
