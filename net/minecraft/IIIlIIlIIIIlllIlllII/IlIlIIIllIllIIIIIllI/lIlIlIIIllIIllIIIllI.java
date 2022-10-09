package net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIIIllIllIIIIIllI;

import net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll.*;
import net.minecraft.llllIIIIlIIIlIlllIll.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import java.util.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;

public class lIlIlIIIllIIllIIIllI extends lllIllIIIllllllIllll
{
    private IIlIIIIlllIlllllIlII llllIIIIlIIIlIlllIll;
    
    public lIlIlIIIllIIllIIIllI(final IIlIIIIlllIlllllIlII llllIIIIlIIIlIlllIll) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final Random random, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        for (int i = 0; i < 64; ++i) {
            final IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll = ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(random.nextInt(8) - random.nextInt(8), random.nextInt(4) - random.nextInt(4), random.nextInt(8) - random.nextInt(8));
            if (illlllllIIIlIIIlIlII.IlIIIlIlIIIllIlIlIIl(llllIIIIlIIIlIlllIll) && (!illlllllIIIlIIIlIlII.IlIllIlIlIIIlIlIlIII.llllIIllllIlIlIIIIll() || llllIIIIlIIIlIlllIll.lIIIlllIIIllIIIllIII() < 255) && this.llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl(illlllllIIIlIIIlIlII, llllIIIIlIIIlIlllIll, this.llllIIIIlIIIlIlllIll.lllIllIIIllllllIllll())) {
                illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll, this.llllIIIIlIIIlIlllIll.lllIllIIIllllllIllll(), 2);
            }
        }
        return true;
    }
}
