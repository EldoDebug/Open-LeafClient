package net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll;

import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import java.util.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.llIllIIIIIllIlIIIIlI.*;
import net.minecraft.lIIIlllIIIllIIIllIII.*;
import net.minecraft.llllIIIIlIIIlIlllIll.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;

public class lIllllllIIllIlIlIlII extends IIIlIIlIIIIlllIlllII
{
    public lIllllllIIllIlIlIlII(final int n, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl) {
        super(n, llIIlIIIlIIIllIlIIIl);
        this.IIllIIIlIIlIlIlIIIII.IIlllIlIIllIlIlIlIIl = 2;
        this.IIllIIIlIIlIlIlIIIII.llIIIlIlIllIIlIlIlII = 2;
        this.IIllIIIlIIlIlIlIIIII.lllllIlIIIlIlIIlllII = 5;
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final Random random, final IllIIlllIIIIlllIIlIl illIIlllIIIIlllIIlIl, final int n, final int n2, final double n3) {
        this.IIlllIIlllIIIlIlllII = net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.lllIllIIIllllllIllll();
        this.IlIIlllllIIllIIlllll = net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl.lllIllIIIllllllIllll();
        if (n3 > 1.75) {
            this.IIlllIIlllIIIlIlllII = net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.lllIllIIIllllllIllll();
            this.IlIIlllllIIllIIlllll = net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.lllIllIIIllllllIllll();
        }
        else if (n3 > -0.5) {
            this.IIlllIIlllIIIlIlllII = net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl.lllIllIIIllllllIllll().llllIIIIlIIIlIlllIll(net.minecraft.llllIIIIlIIIlIlllIll.IllIllIIIIlIIlIlllII.IIIIIIIIIlllIllIlIlI, net.minecraft.llllIIIIlIIIlIlllIll.IlIllllIIlIIlIlIlIll.IlIlIlIlIlllllllllIl);
        }
        this.IlIlIlIlIlllllllllIl(illlllllIIIlIIIlIlII, random, illIIlllIIIIlllIIlIl, n, n2, n3);
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final Random random, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        this.IIllIIIlIIlIlIlIIIII.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, random, this, ilIlIlIlIlllllllllIl);
    }
}
