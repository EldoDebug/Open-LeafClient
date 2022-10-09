package net.minecraft.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll;

import net.minecraft.llIllIlIIIIllIlIIllI.*;
import net.minecraft.llIIlIIIlIIIllIlIIIl.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import com.google.common.collect.*;
import java.util.*;

public class IlIlIIIlIIlIlIIlllIl implements IlIIIlIlIIIllIlIlIIl
{
    private final lllIIIIlIlIllIIlIIIl llllIIIIlIIIlIlllIll;
    private final List IlIlIlIlIlllllllllIl;
    
    public IlIlIIIlIIlIlIIlllIl(final lllIIIIlIlIllIIlIIIl llllIIIIlIIIlIlllIll, final List ilIlIlIlIlllllllllIl) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
    }
    
    @Override
    public lllIIIIlIlIllIIlIIIl IlIlIlIlIlllllllllIl() {
        return this.llllIIIIlIIIlIlllIll;
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
    
    @Override
    public boolean llllIIIIlIIIlIlllIll(final IIlllIIIlIlllIIlllII illlIIIlIlllIIlllII, final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII) {
        final ArrayList arrayList = Lists.newArrayList((Iterable)this.IlIlIlIlIlllllllllIl);
        for (int i = 0; i < illlIIIlIlllIIlllII.IlIIIlIlIIIllIlIlIIl(); ++i) {
            for (int j = 0; j < illlIIIlIlllIIlllII.IllIIlllIIIIlllIIlIl(); ++j) {
                final lllIIIIlIlIllIIlIIIl llIllIIIIIllIlIIIIlI = illlIIIlIlllIIlllII.llIllIIIIIllIlIIIIlI(j, i);
                if (llIllIIIIIllIlIIIIlI != null) {
                    boolean b = false;
                    for (final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl : arrayList) {
                        if (llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll() == lllIIIIlIlIllIIlIIIl.llllIIIIlIIIlIlllIll() && (lllIIIIlIlIllIIlIIIl.lIIIIlIIIIIlllIllIII() == 32767 || llIllIIIIIllIlIIIIlI.lIIIIlIIIIIlllIllIII() == lllIIIIlIlIllIIlIIIl.lIIIIlIIIIIlllIllIII())) {
                            b = true;
                            arrayList.remove(lllIIIIlIlIllIIlIIIl);
                            break;
                        }
                    }
                    if (!b) {
                        return false;
                    }
                }
            }
        }
        return arrayList.isEmpty();
    }
    
    @Override
    public lllIIIIlIlIllIIlIIIl llllIIIIlIIIlIlllIll(final IIlllIIIlIlllIIlllII illlIIIlIlllIIlllII) {
        return this.llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl();
    }
    
    @Override
    public int llllIIIIlIIIlIlllIll() {
        return this.IlIlIlIlIlllllllllIl.size();
    }
}
