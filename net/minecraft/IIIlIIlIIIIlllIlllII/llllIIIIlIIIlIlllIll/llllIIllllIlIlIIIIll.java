package net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll;

import net.minecraft.lIIIlllIIIllIIIllIII.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import java.util.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;

public class llllIIllllIlIlIIIIll extends llIIlIIIlIIIllIlIIIl
{
    public llllIIllllIlIlIIIIll(final int n) {
        super(n);
        this.lllllIIllIlIllIllllI.clear();
        this.IIlllIIlllIIIlIlllII = net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIlIIIllIIllIlllllI.lllIllIIIllllllIllll();
        this.IlIIlllllIIllIIlllll = net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIlIIIllIIllIlllllI.lllIllIIIllllllIllll();
        this.IIllIIIlIIlIlIlIIIII.IIlllIlIIllIlIlIlIIl = -999;
        this.IIllIIIlIIlIlIlIIIII.lIllllllIIllIlIlIlII = 2;
        this.IIllIIIlIIlIlIlIIIII.IIlllIIIlIlllIIlllII = 50;
        this.IIllIIIlIIlIlIlIIIII.IIlIIIIIllIlIIIlIIll = 10;
        this.lllllIIllIlIllIllllI.clear();
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final Random random, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        super.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, random, ilIlIlIlIlllllllllIl);
        if (random.nextInt(1000) == 0) {
            new net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl().llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, random, illlllllIIIlIIIlIlII.IIIIlllIIIIIIlIIIlll(ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(random.nextInt(16) + 8, 0, random.nextInt(16) + 8)).llllIIIIlIIIlIlllIll());
        }
    }
}
