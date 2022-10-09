package net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll;

import net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.*;
import net.minecraft.llllIIIIlIIIlIlllIll.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import java.util.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;

public class IIIIlllIIIIIIlIIIlll extends lllIllIIIllllllIllll
{
    private lIIllIIIllllIlllIllI llllIIIIlIIIlIlllIll;
    private llIIlIIIlIIIllIlIIIl IlIlIlIlIlllllllllIl;
    
    public IIIIlllIIIIIIlIIIlll(final lIIllIIIllllIlllIllI liIllIIIllllIlllIllI, final llIllIIlllllllllllll llIllIIlllllllllllll) {
        this.llllIIIIlIIIlIlllIll(liIllIIIllllIlllIllI, llIllIIlllllllllllll);
    }
    
    public void llllIIIIlIIIlIlllIll(final lIIllIIIllllIlllIllI llllIIIIlIIIlIlllIll, final llIllIIlllllllllllll llIllIIlllllllllllll) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.IlIlIlIlIlllllllllIl = llllIIIIlIIIlIlllIll.lllIllIIIllllllIllll().llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll.IlIllllIIlIIlIlIlIll(), llIllIIlllllllllllll);
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final Random random, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        for (int i = 0; i < 64; ++i) {
            final IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll = ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(random.nextInt(8) - random.nextInt(8), random.nextInt(4) - random.nextInt(4), random.nextInt(8) - random.nextInt(8));
            if (illlllllIIIlIIIlIlII.IlIIIlIlIIIllIlIlIIl(llllIIIIlIIIlIlllIll) && (!illlllllIIIlIIIlIlII.IlIllIlIlIIIlIlIlIII.llllIIllllIlIlIIIIll() || llllIIIIlIIIlIlllIll.lIIIlllIIIllIIIllIII() < 255) && this.llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl(illlllllIIIlIIIlIlII, llllIIIIlIIIlIlllIll, this.IlIlIlIlIlllllllllIl)) {
                illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll, this.IlIlIlIlIlllllllllIl, 2);
            }
        }
        return true;
    }
}
