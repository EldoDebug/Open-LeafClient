package net.minecraft.client.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl;

import net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.llIIlIIIlIIIllIlIIIl.*;
import net.minecraft.client.llIIlIIIlIIIllIlIIIl.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.*;

public class IlIlIIIllIIllIlllllI extends lIIIlllIIIllIIIllIII
{
    private static final lIllllIllIllIIllllll IlIlIIIllIllIIIIIllI;
    
    static {
        IlIlIIIllIllIIIIIllI = new lIllllIllIllIIllllll("textures/gui/container/crafting_table.png");
    }
    
    public IlIlIIIllIIllIlllllI(final IllIIlllIIIIlllIIlIl illIIlllIIIIlllIIlIl, final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII) {
        this(illIIlllIIIIlllIIlIl, illlllllIIIlIIIlIlII, net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll);
    }
    
    public IlIlIIIllIIllIlllllI(final IllIIlllIIIIlllIIlIl illIIlllIIIIlllIIlIl, final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        super(new IIIlIIlIIIIlllIlllII(illIIlllIIIIlllIIlIl, illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl));
    }
    
    @Override
    protected void llllIIIIlIIIlIlllIll(final int n, final int n2) {
        this.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll(net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("container.crafting", new Object[0]), 28, 6, 4210752);
        this.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll(net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("container.inventory", new Object[0]), 8, this.IlllllllIIIlIIIlIlII - 96 + 2, 4210752);
    }
    
    @Override
    protected void llllIIIIlIIIlIlllIll(final float n, final int n2, final int n3) {
        net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI(1.0f, 1.0f, 1.0f, 1.0f);
        this.IlIlIIIllIIllIlllllI.lllIllIIIllllllIllll().llllIIIIlIIIlIlllIll(IlIlIIIllIIllIlllllI.IlIlIIIllIllIIIIIllI);
        this.IlIlIlIlIlllllllllIl((this.llllIIllllIlIlIIIIll - this.IlIlIIIlIIlIlIIlllIl) / 2, (this.IlIllIlIlIIIlIlIlIII - this.IlllllllIIIlIIIlIlII) / 2, 0, 0, this.IlIlIIIlIIlIlIIlllIl, this.IlllllllIIIlIIIlIlII);
    }
}
