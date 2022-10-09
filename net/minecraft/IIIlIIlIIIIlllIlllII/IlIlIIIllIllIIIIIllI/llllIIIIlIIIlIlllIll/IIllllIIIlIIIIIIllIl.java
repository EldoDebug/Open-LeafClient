package net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll;

import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import java.util.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.lIIIlllIIIllIIIllIII.*;
import net.minecraft.llllIIIIlIIIlIlllIll.*;

public class IIllllIIIlIIIIIIllIl extends lllIllIIIllllllIllll
{
    @Override
    public boolean llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final Random random, IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        while (ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII() < 128) {
            if (illlllllIIIlIIIlIlII.IlIIIlIlIIIllIlIlIIl(ilIlIlIlIlllllllllIl)) {
                net.minecraft.IlllllllIIIlIIIlIlII.lllIllIIIllllllIllll[] llllIIIIlIIIlIlllIll;
                for (int length = (llllIIIIlIIIlIlllIll = IllIllIIIIlIIlIlllII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll()).length, i = 0; i < length; ++i) {
                    final net.minecraft.IlllllllIIIlIIIlIlII.lllIllIIIllllllIllll lllIllIIIllllllIllll = llllIIIIlIIIlIlllIll[i];
                    if (net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.r.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl, lllIllIIIllllllIllll)) {
                        illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.r.lllIllIIIllllllIllll().llllIIIIlIIIlIlllIll(dk.IIllllIIIlIIIIIIllIl, lllIllIIIllllllIllll == net.minecraft.IlllllllIIIlIIIlIlII.lllIllIIIllllllIllll.llIllIIIIIllIlIIIIlI).llllIIIIlIIIlIlllIll(dk.IlllIIIIlIIIlIlIlIIl, lllIllIIIllllllIllll == net.minecraft.IlllllllIIIlIIIlIlII.lllIllIIIllllllIllll.IllIIlllIIIIlllIIlIl).llllIIIIlIIIlIlllIll(dk.lllIllIIIllllllIllll, lllIllIIIllllllIllll == net.minecraft.IlllllllIIIlIIIlIlII.lllIllIIIllllllIllll.IlIIIlIlIIIllIlIlIIl).llllIIIIlIIIlIlllIll(dk.llIllIlIlIIIIIIIllII, lllIllIIIllllllIllll == net.minecraft.IlllllllIIIlIIIlIlII.lllIllIIIllllllIllll.IlIlIIIllIllIIIIIllI), 2);
                        break;
                    }
                }
            }
            else {
                ilIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(random.nextInt(4) - random.nextInt(4), 0, random.nextInt(4) - random.nextInt(4));
            }
            ilIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll();
        }
        return true;
    }
}
