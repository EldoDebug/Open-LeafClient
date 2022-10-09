package net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll;

import net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.*;
import net.minecraft.lIIIlllIIIllIIIllIII.*;
import net.minecraft.llllIIIIlIIIlIlllIll.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import java.util.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;

public class IIIIIllIIIIlIIIIllIl extends lllIllIIIllllllIllll
{
    private final llIIlIIIlIIIllIlIIIl llllIIIIlIIIlIlllIll;
    
    public IIIIIllIIIIlIIIIllIl(final dd dd) {
        this.llllIIIIlIIIlIlllIll = net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllllIllIllIlIllllI.lllIllIIIllllllIllll().llllIIIIlIIIlIlllIll(dc.IIIIIIIIIlllIllIlIlI, dd);
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final Random random, IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llIllIIIIIllIlIIIIlI;
        while (((llIllIIIIIllIlIIIIlI = illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl).llIllIIIIIllIlIIIIlI()).IllIIlllIIIIlllIIlIl() == net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll || llIllIIIIIllIlIIIIlI.IllIIlllIIIIlllIIlIl() == net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl) && ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII() > 0) {
            ilIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl();
        }
        for (int i = 0; i < 128; ++i) {
            final IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll = ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(random.nextInt(8) - random.nextInt(8), random.nextInt(4) - random.nextInt(4), random.nextInt(8) - random.nextInt(8));
            if (illlllllIIIlIIIlIlII.IlIIIlIlIIIllIlIlIIl(llllIIIIlIIIlIlllIll) && net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllllIllIllIlIllllI.IllIIlllIIIIlllIIlIl(illlllllIIIlIIIlIlII, llllIIIIlIIIlIlllIll, this.llllIIIIlIIIlIlllIll)) {
                illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll, this.llllIIIIlIIIlIlllIll, 2);
            }
        }
        return true;
    }
}
