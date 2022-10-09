package net.minecraft.client.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl;

import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.llIIlIIIlIIIllIlIIIl.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.*;
import net.minecraft.IlIlIIIlIIlIlIIlllIl.*;

public class IlIllIlIlIIIlIlIlIII extends lIIIlllIIIllIIIllIII
{
    private static final lIllllIllIllIIllllll IlIlIIIllIllIIIIIllI;
    private final IllIIlllIIIIlllIIlIl IllIIlllIIIIlllIIlIl;
    private llIIIlIlIllIIlIlIlII llllIIIlIlllIlIIIIIl;
    
    static {
        IlIlIIIllIllIIIIIllI = new lIllllIllIllIIllllll("textures/gui/container/furnace.png");
    }
    
    public IlIllIlIlIIIlIlIlIII(final IllIIlllIIIIlllIIlIl illIIlllIIIIlllIIlIl, final llIIIlIlIllIIlIlIlII llllIIIlIlllIlIIIIIl) {
        super(new IIIIlllIIIIIIlIIIlll(illIIlllIIIIlllIIlIl, llllIIIlIlllIlIIIIIl));
        this.IllIIlllIIIIlllIIlIl = illIIlllIIIIlllIIlIl;
        this.llllIIIlIlllIlIIIIIl = llllIIIlIlllIlIIIIIl;
    }
    
    @Override
    protected void llllIIIIlIIIlIlllIll(final int n, final int n2) {
        final String liiiIlIIIIIlllIllIII = this.llllIIIlIlllIlIIIIIl.v_().lIIIIlIIIIIlllIllIII();
        this.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll(liiiIlIIIIIlllIllIII, this.IlIlIIIlIIlIlIIlllIl / 2 - this.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll(liiiIlIIIIIlllIllIII) / 2, 6, 4210752);
        this.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll(this.IllIIlllIIIIlllIIlIl.v_().lIIIIlIIIIIlllIllIII(), 8, this.IlllllllIIIlIIIlIlII - 96 + 2, 4210752);
    }
    
    @Override
    protected void llllIIIIlIIIlIlllIll(final float n, final int n2, final int n3) {
        net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI(1.0f, 1.0f, 1.0f, 1.0f);
        this.IlIlIIIllIIllIlllllI.lllIllIIIllllllIllll().llllIIIIlIIIlIlllIll(IlIllIlIlIIIlIlIlIII.IlIlIIIllIllIIIIIllI);
        final int n4 = (this.llllIIllllIlIlIIIIll - this.IlIlIIIlIIlIlIIlllIl) / 2;
        final int n5 = (this.IlIllIlIlIIIlIlIlIII - this.IlllllllIIIlIIIlIlII) / 2;
        this.IlIlIlIlIlllllllllIl(n4, n5, 0, 0, this.IlIlIIIlIIlIlIIlllIl, this.IlllllllIIIlIIIlIlII);
        if (net.minecraft.IlIlIIIlIIlIlIIlllIl.IIlIIIIlllIlllllIlII.llllIIIIlIIIlIlllIll(this.llllIIIlIlllIlIIIIIl)) {
            final int liiIlllIIIllIIIllIII = this.lIIIlllIIIllIIIllIII(13);
            this.IlIlIlIlIlllllllllIl(n4 + 56, n5 + 36 + 12 - liiIlllIIIllIIIllIII, 176, 12 - liiIlllIIIllIIIllIII, 14, liiIlllIIIllIIIllIII + 1);
        }
        this.IlIlIlIlIlllllllllIl(n4 + 79, n5 + 34, 176, 14, this.lIIIIlIIIIIlllIllIII(24) + 1, 16);
    }
    
    private int lIIIIlIIIIIlllIllIII(final int n) {
        final int llllIIIIlIIIlIlllIll = this.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll(2);
        final int llllIIIIlIIIlIlllIll2 = this.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll(3);
        return (llllIIIIlIIIlIlllIll2 != 0 && llllIIIIlIIIlIlllIll != 0) ? (llllIIIIlIIIlIlllIll * n / llllIIIIlIIIlIlllIll2) : 0;
    }
    
    private int lIIIlllIIIllIIIllIII(final int n) {
        int llllIIIIlIIIlIlllIll = this.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll(1);
        if (llllIIIIlIIIlIlllIll == 0) {
            llllIIIIlIIIlIlllIll = 200;
        }
        return this.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll(0) * n / llllIIIIlIIIlIlllIll;
    }
}
