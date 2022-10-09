package net.minecraft.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll;

import net.minecraft.llIIlIIIlIIIllIlIIIl.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import com.google.common.collect.*;
import net.minecraft.llIllIlIIIIllIlIIllI.*;
import java.util.*;

public class llllIIIlIlllIlIIIIIl implements IlIIIlIlIIIllIlIlIIl
{
    @Override
    public boolean llllIIIIlIIIlIlllIll(final IIlllIIIlIlllIIlllII illlIIIlIlllIIlllII, final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII) {
        final ArrayList arrayList = Lists.newArrayList();
        for (int i = 0; i < illlIIIlIlllIIlllII.lIIIlllIIIllIIIllIII(); ++i) {
            final lllIIIIlIlIllIIlIIIl lIlIlIIIllIIllIIIllI = illlIIIlIlllIIlllII.lIlIlIIIllIIllIIIllI(i);
            if (lIlIlIIIllIIllIIIllI != null) {
                arrayList.add(lIlIlIIIllIIllIIIllI);
                if (arrayList.size() > 1) {
                    final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl = arrayList.get(0);
                    if (lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll() != lllIIIIlIlIllIIlIIIl.llllIIIIlIIIlIlllIll() || lllIIIIlIlIllIIlIIIl.IlIlIlIlIlllllllllIl != 1 || lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl != 1 || !lllIIIIlIlIllIIlIIIl.llllIIIIlIIIlIlllIll().IlIIIlIlIIIllIlIlIIl()) {
                        return false;
                    }
                }
            }
        }
        return arrayList.size() == 2;
    }
    
    @Override
    public lllIIIIlIlIllIIlIIIl llllIIIIlIIIlIlllIll(final IIlllIIIlIlllIIlllII illlIIIlIlllIIlllII) {
        final ArrayList arrayList = Lists.newArrayList();
        for (int i = 0; i < illlIIIlIlllIIlllII.lIIIlllIIIllIIIllIII(); ++i) {
            final lllIIIIlIlIllIIlIIIl lIlIlIIIllIIllIIIllI = illlIIIlIlllIIlllII.lIlIlIIIllIIllIIIllI(i);
            if (lIlIlIIIllIIllIIIllI != null) {
                arrayList.add(lIlIlIIIllIIllIIIllI);
                if (arrayList.size() > 1) {
                    final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl = arrayList.get(0);
                    if (lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll() != lllIIIIlIlIllIIlIIIl.llllIIIIlIIIlIlllIll() || lllIIIIlIlIllIIlIIIl.IlIlIlIlIlllllllllIl != 1 || lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl != 1 || !lllIIIIlIlIllIIlIIIl.llllIIIIlIIIlIlllIll().IlIIIlIlIIIllIlIlIIl()) {
                        return null;
                    }
                }
            }
        }
        if (arrayList.size() == 2) {
            final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl2 = arrayList.get(0);
            final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl3 = arrayList.get(1);
            if (lllIIIIlIlIllIIlIIIl2.llllIIIIlIIIlIlllIll() == lllIIIIlIlIllIIlIIIl3.llllIIIIlIIIlIlllIll() && lllIIIIlIlIllIIlIIIl2.IlIlIlIlIlllllllllIl == 1 && lllIIIIlIlIllIIlIIIl3.IlIlIlIlIlllllllllIl == 1 && lllIIIIlIlIllIIlIIIl2.llllIIIIlIIIlIlllIll().IlIIIlIlIIIllIlIlIIl()) {
                final net.minecraft.llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl llllIIIIlIIIlIlllIll = lllIIIIlIlIllIIlIIIl2.llllIIIIlIIIlIlllIll();
                int n = llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI() - (llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI() - lllIIIIlIlIllIIlIIIl2.llllIIIlIlllIlIIIIIl() + (llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI() - lllIIIIlIlIllIIlIIIl3.llllIIIlIlllIlIIIIIl()) + llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI() * 5 / 100);
                if (n < 0) {
                    n = 0;
                }
                return new lllIIIIlIlIllIIlIIIl(lllIIIIlIlIllIIlIIIl2.llllIIIIlIIIlIlllIll(), 1, n);
            }
        }
        return null;
    }
    
    @Override
    public int llllIIIIlIIIlIlllIll() {
        return 4;
    }
    
    @Override
    public lllIIIIlIlIllIIlIIIl IlIlIlIlIlllllllllIl() {
        return null;
    }
    
    @Override
    public lllIIIIlIlIllIIlIIIl[] IlIlIlIlIlllllllllIl(final IIlllIIIlIlllIIlllII illlIIIlIlllIIlllII) {
        final lllIIIIlIlIllIIlIIIl[] array = new lllIIIIlIlIllIIlIIIl[illlIIIlIlllIIlllII.lIIIlllIIIllIIIllIII()];
        for (int i = 0; i < array.length; ++i) {
            final lllIIIIlIlIllIIlIIIl lIlIlIIIllIIllIIIllI = illlIIIlIlllIIlllII.lIlIlIIIllIIllIIIllI(i);
            if (lIlIlIIIllIIllIIIllI != null && lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll().llIllIlIIIIllIlIIllI()) {
                array[i] = new lllIIIIlIlIllIIlIIIl(lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll().llIIlIIIlIIIllIlIIIl());
            }
        }
        return array;
    }
}
