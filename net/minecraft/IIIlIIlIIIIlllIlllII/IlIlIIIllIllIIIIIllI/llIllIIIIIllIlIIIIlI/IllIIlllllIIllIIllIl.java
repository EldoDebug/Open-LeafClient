package net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI;

import net.minecraft.IlllllllIIIlIIIlIlII.*;
import java.util.*;

class IllIIlllllIIllIIllIl implements IIIllIIIlIlIIllIIIlI
{
    private IllIIlllllIIllIIllIl() {
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll(final lllllIIlIlIIIlIlIIIl lllllIIlIlIIIlIlIIIl) {
        return true;
    }
    
    @Override
    public IlIIlllllIIllIIlllll llllIIIIlIIIlIlllIll(final lllIllIIIllllllIllll lllIllIIIllllllIllll, final lllllIIlIlIIIlIlIIIl lllllIIlIlIIIlIlIIIl, final Random random) {
        lllllIIlIlIIIlIlIIIl.IlIIIlIlIIIllIlIlIIl = true;
        return new IIlllllIllIllIlIlIII(lllIllIIIllllllIllll, lllllIIlIlIIIlIlIIIl, random);
    }
}
