package net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll;

import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import java.util.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.lIIIlllIIIllIIIllIII.*;

public class IlllIIIIlIIIlIlIlIIl extends lllIllIIIllllllIllll
{
    @Override
    public boolean llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final Random random, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        for (int i = 0; i < 10; ++i) {
            final int n = ilIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII() + random.nextInt(8) - random.nextInt(8);
            final int n2 = ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII() + random.nextInt(4) - random.nextInt(4);
            final int n3 = ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl() + random.nextInt(8) - random.nextInt(8);
            if (illlllllIIIlIIIlIlII.IlIIIlIlIIIllIlIlIIl(new IlIlIlIlIlllllllllIl(n, n2, n3)) && net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.B.IlIIIlIlIIIllIlIlIIl(illlllllIIIlIIIlIlII, new IlIlIlIlIlllllllllIl(n, n2, n3))) {
                illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(new IlIlIlIlIlllllllllIl(n, n2, n3), net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.B.lllIllIIIllllllIllll(), 2);
            }
        }
        return true;
    }
}
