package net.minecraft.llIllIlIIIIllIlIIllI;

import net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import com.google.common.collect.*;
import net.minecraft.lIlIlIIIllIIllIIIllI.*;
import java.util.*;

public class llIIIIIIlIllIIlIIIll extends IlIIIlIlIIIllIlIlIIl
{
    @Override
    public boolean llllIIIIlIIIlIlllIll(final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl, final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final lllIllIIIllllllIllll lllIllIIIllllllIllll, final float n, final float n2, final float n3) {
        if (!illlllllIIIlIIIlIlII.IlIlIllllllllIIIIlII) {
            illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(new lIIIIlIIIIIlllIllIII(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII() + n, ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII() + n2, ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl() + n3, lllIIIIlIlIllIIlIIIl));
            if (!llllIIIIlIIIlIlllIll.K.IlIIIlIlIIIllIlIlIIl) {
                --lllIIIIlIlIllIIlIIIl.IlIlIlIlIlllllllllIl;
            }
            return true;
        }
        return false;
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl, final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final List list, final boolean b) {
        if (lllIIIIlIlIllIIlIIIl.IIIIlllIIIIIIlIIIlll()) {
            final IIIIlllIIIIIIlIIIlll ilIlIIIllIIllIlllllI = lllIIIIlIlIllIIlIIIl.llllIIllllIlIlIIIIll().IlIlIIIllIIllIlllllI("Fireworks");
            if (ilIlIIIllIIllIlllllI != null) {
                if (ilIlIIIllIIllIlllllI.IlIlIlIlIlllllllllIl("Flight", 99)) {
                    list.add(String.valueOf(lIIlllIlllllIIlllIll.llllIIIIlIIIlIlllIll("item.fireworks.flight")) + " " + ilIlIIIllIIllIlllllI.IlIIIlIlIIIllIlIlIIl("Flight"));
                }
                final IlIlIIIlIIlIlIIlllIl llIllIIIIIllIlIIIIlI = ilIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI("Explosions", 10);
                if (llIllIIIIIllIlIIIIlI != null && llIllIIIIIllIlIIIIlI.IlIlIIIllIllIIIIIllI() > 0) {
                    for (int i = 0; i < llIllIIIIIllIlIIIIlI.IlIlIIIllIllIIIIIllI(); ++i) {
                        final IIIIlllIIIIIIlIIIlll ilIlIlIlIlllllllllIl = llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(i);
                        final ArrayList arrayList = Lists.newArrayList();
                        lIIIIlIlIllllIIlIllI.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl, arrayList);
                        if (arrayList.size() > 0) {
                            for (int j = 1; j < arrayList.size(); ++j) {
                                arrayList.set(j, "  " + (String)arrayList.get(j));
                            }
                            list.addAll(arrayList);
                        }
                    }
                }
            }
        }
    }
}
