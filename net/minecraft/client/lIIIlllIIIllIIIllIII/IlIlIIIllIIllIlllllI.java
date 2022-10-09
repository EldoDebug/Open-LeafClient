package net.minecraft.client.lIIIlllIIIllIIIllIII;

import net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.*;
import net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.*;
import net.minecraft.client.llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl.*;
import com.google.common.collect.*;
import net.minecraft.llllIIIIlIIIlIlllIll.*;
import net.minecraft.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.*;
import java.util.*;

class IlIlIIIllIIllIlllllI extends IllIIlllIIIIlllIIlIl
{
    final /* synthetic */ lIIIIlIIIIIlllIllIII llllIIIIlIIIlIlllIll;
    
    IlIlIIIllIIllIlllllI(final lIIIIlIIIIIlllIllIII llllIIIIlIIIlIlllIll) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
    }
    
    @Override
    protected llllIIIlIlllIlIIIIIl llllIIIIlIIIlIlllIll(final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl) {
        final LinkedHashMap linkedHashMap = Maps.newLinkedHashMap((Map)llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl());
        final String llllIIIIlIIIlIlllIll = IllIllIIIIlIIlIlllII.IIIIIIIIIlllIllIlIlI.llllIIIIlIIIlIlllIll(linkedHashMap.remove(IllIllIIIIlIIlIlllII.IIIIIIIIIlllIllIlIlI));
        if (IlIllllIIlIIlIlIlIll.llIllIIIIIllIlIIIIlI != llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(IllIllIIIIlIIlIlllII.IIIIIIIIIlllIllIlIlI)) {
            linkedHashMap.remove(IllIllIIIIlIIlIlllII.IIllllIIIlIIIIIIllIl);
        }
        return new llllIIIlIlllIlIIIIIl(llllIIIIlIIIlIlllIll, this.llllIIIIlIIIlIlllIll(linkedHashMap));
    }
}
