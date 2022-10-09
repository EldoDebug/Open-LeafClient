package net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll;

import net.minecraft.llllIIIIlIIIlIlllIll.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import java.util.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.lIIIlllIIIllIIIllIII.*;

public class llIllIlIIIIllIlIIllI extends lllIllIIIllllllIllll
{
    private lIlIlIlllIIlIlIlllIl llllIIIIlIIIlIlllIll;
    
    public void llllIIIIlIIIlIlllIll(final lIlIlIlllIIlIlIlllIl llllIIIIlIIIlIlllIll) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final Random random, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        boolean b = false;
        for (int i = 0; i < 64; ++i) {
            final IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll = ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(random.nextInt(8) - random.nextInt(8), random.nextInt(4) - random.nextInt(4), random.nextInt(8) - random.nextInt(8));
            if (illlllllIIIlIIIlIlII.IlIIIlIlIIIllIlIlIIl(llllIIIIlIIIlIlllIll) && (!illlllllIIIlIIIlIlII.IlIllIlIlIIIlIlIlIII.llllIIllllIlIlIIIIll() || llllIIIIlIIIlIlllIll.lIIIlllIIIllIIIllIII() < 254) && net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.aJ.IlIIIlIlIIIllIlIlIIl(illlllllIIIlIIIlIlII, llllIIIIlIIIlIlllIll)) {
                net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.aJ.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, llllIIIIlIIIlIlllIll, this.llllIIIIlIIIlIlllIll, 2);
                b = true;
            }
        }
        return b;
    }
}
