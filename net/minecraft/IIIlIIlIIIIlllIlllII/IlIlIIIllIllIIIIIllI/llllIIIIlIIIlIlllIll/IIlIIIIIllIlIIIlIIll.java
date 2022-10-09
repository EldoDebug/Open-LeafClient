package net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll;

import net.minecraft.llllIIIIlIIIlIlllIll.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import java.util.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl.*;

public class IIlIIIIIllIlIIIlIIll extends lllIllIIIllllllIllll
{
    private llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll;
    
    public IIlIIIIIllIlIIIlIIll(final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final Random random, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        if (illlllllIIIlIIIlIlII.IlIIIlIlIIIllIlIlIIl(ilIlIlIlIlllllllllIl) && illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl()).llIllIIIIIllIlIIIIlI() == this.llllIIIIlIIIlIlllIll) {
            final int n = random.nextInt(32) + 6;
            final int n2 = random.nextInt(4) + 1;
            final llllIIIlIlllIlIIIIIl llllIIIlIlllIlIIIIIl = new llllIIIlIlllIlIIIIIl();
            for (int i = ilIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII() - n2; i <= ilIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII() + n2; ++i) {
                for (int j = ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl() - n2; j <= ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl() + n2; ++j) {
                    final int n3 = i - ilIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII();
                    final int n4 = j - ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl();
                    if (n3 * n3 + n4 * n4 <= n2 * n2 + 1 && illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl(i, ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII() - 1, j)).llIllIIIIIllIlIIIIlI() != this.llllIIIIlIIIlIlllIll) {
                        return false;
                    }
                }
            }
            for (int liiIlllIIIllIIIllIII = ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII(); liiIlllIIIllIIIllIII < ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII() + n && liiIlllIIIllIIIllIII < 256; ++liiIlllIIIllIIIllIII) {
                for (int k = ilIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII() - n2; k <= ilIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII() + n2; ++k) {
                    for (int l = ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl() - n2; l <= ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl() + n2; ++l) {
                        final int n5 = k - ilIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII();
                        final int n6 = l - ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl();
                        if (n5 * n5 + n6 * n6 <= n2 * n2 + 1) {
                            illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(new IlIlIlIlIlllllllllIl(k, liiIlllIIIllIIIllIII, l), net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lIlIlIlllIIlIlIlllIl.lllIllIIIllllllIllll(), 2);
                        }
                    }
                }
            }
            final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI = new llIllIIIIIllIlIIIIlI(illlllllIIIlIIIlIlII);
            llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII() + 0.5f, ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII() + n, ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl() + 0.5f, random.nextFloat() * 360.0f, 0.0f);
            illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI);
            illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(n), net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII.lllIllIIIllllllIllll(), 2);
            return true;
        }
        return false;
    }
}
