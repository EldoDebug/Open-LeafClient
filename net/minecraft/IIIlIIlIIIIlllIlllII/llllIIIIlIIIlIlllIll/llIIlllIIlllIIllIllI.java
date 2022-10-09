package net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll;

import net.minecraft.lIIIlllIIIllIIIllIII.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import java.util.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll.*;

public class llIIlllIIlllIIllIllI extends llIIlIIIlIIIllIlIIIl
{
    private boolean IIlllIIIllIllIIlIlIl;
    private IIIlIIIlIlIIlllIIlll llIlllIlllllIIllIIII;
    private IIllIIllIIIlIlIIIIlI lllllIlIlIlllIlllIlI;
    
    public llIIlllIIlllIIllIllI(final int n, final boolean iIlllIIIllIllIIlIlIl) {
        super(n);
        this.llIlllIlllllIIllIIII = new IIIlIIIlIlIIlllIIlll();
        this.lllllIlIlIlllIlllIlI = new IIllIIllIIIlIlIIIIlI(4);
        this.IIlllIIIllIllIIlIlIl = iIlllIIIllIllIIlIlIl;
        if (iIlllIIIllIllIIlIlIl) {
            this.IIlllIIlllIIIlIlllII = net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIIIIlllIlIIIIIIIllI.lllIllIIIllllllIllll();
        }
        this.lllllIIllIlIllIllllI.clear();
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final Random random, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        if (this.IIlllIIIllIllIIlIlIl) {
            for (int i = 0; i < 3; ++i) {
                this.llIlllIlllllIIllIIII.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, random, illlllllIIIlIIIlIlII.IIIIlllIIIIIIlIIIlll(ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(random.nextInt(16) + 8, 0, random.nextInt(16) + 8)));
            }
            for (int j = 0; j < 2; ++j) {
                this.lllllIlIlIlllIlllIlI.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, random, illlllllIIIlIIIlIlII.IIIIlllIIIIIIlIIIlll(ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(random.nextInt(16) + 8, 0, random.nextInt(16) + 8)));
            }
        }
        super.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, random, ilIlIlIlIlllllllllIl);
    }
    
    @Override
    public net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll(final Random random) {
        return new IlIIIlIIIllllIlIlIlI(false);
    }
    
    @Override
    protected llIIlIIIlIIIllIlIIIl IlIIIlIlIIIllIlIlIIl(final int n) {
        final llIIlIIIlIIIllIlIIIl llllIIIIlIIIlIlllIll = new llIIlllIIlllIIllIllI(n, true).llllIIIIlIIIlIlllIll(13828095, true).llllIIIIlIIIlIlllIll(String.valueOf(this.lIlIIlllIIlIIlIlllIl) + " Spikes").llIllIIIIIllIlIIIIlI().llllIIIIlIIIlIlllIll(0.0f, 0.5f).llllIIIIlIIIlIlllIll(new llIllIlIIIIllIlIIllI(this.IIlllllIllIllIlIlIII + 0.1f, this.llllIllllIllllIlIlII + 0.1f));
        llllIIIIlIIIlIlllIll.IIlllllIllIllIlIlIII = this.IIlllllIllIllIlIlIII + 0.3f;
        llllIIIIlIIIlIlllIll.llllIllllIllllIlIlII = this.llllIllllIllllIlIlII + 0.4f;
        return llllIIIIlIIIlIlllIll;
    }
}
