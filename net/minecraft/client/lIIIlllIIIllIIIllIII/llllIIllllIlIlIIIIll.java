package net.minecraft.client.lIIIlllIIIllIIIllIII;

import net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.*;
import net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.*;
import net.minecraft.client.llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl.*;
import com.google.common.collect.*;
import net.minecraft.llllIIIIlIIIlIlllIll.*;
import net.minecraft.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.*;
import java.util.*;

class llllIIllllIlIlIIIIll extends IllIIlllIIIIlllIIlIl
{
    final /* synthetic */ lIIIIlIIIIIlllIllIII llllIIIIlIIIlIlllIll;
    
    llllIIllllIlIlIIIIll(final lIIIIlIIIIIlllIllIII llllIIIIlIIIlIlllIll) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
    }
    
    @Override
    protected llllIIIlIlllIlIIIIIl llllIIIIlIIIlIlllIll(final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl) {
        final LinkedHashMap linkedHashMap = Maps.newLinkedHashMap((Map)llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl());
        final String llllIIIIlIIIlIlllIll = cz.IlllIIIIlIIIlIlIlIIl.llllIIIIlIIIlIlllIll(linkedHashMap.remove(cz.IlllIIIIlIIIlIlIlIIl));
        linkedHashMap.remove(cx.IIllllIIIlIIIIIIllIl);
        return new llllIIIlIlllIlIIIIIl(String.valueOf(llllIIIIlIIIlIlllIll) + "_double_slab", llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(cz.IIllllIIIlIIIIIIllIl) ? "all" : "normal");
    }
}
