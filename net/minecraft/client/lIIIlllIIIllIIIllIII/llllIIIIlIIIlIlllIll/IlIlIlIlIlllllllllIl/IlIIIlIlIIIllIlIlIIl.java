package net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl;

import net.minecraft.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.*;
import net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.*;
import net.minecraft.client.llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl.*;
import com.google.common.collect.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import java.util.*;

public class IlIIIlIlIIIllIlIlIIl extends IllIIlllIIIIlllIIlIl
{
    private final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll;
    private final String llIllIIIIIllIlIIIIlI;
    private final List IlIIIlIlIIIllIlIlIIl;
    
    private IlIIIlIlIIIllIlIlIIl(final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final String llIllIIIIIllIlIIIIlI, final List ilIIIlIlIIIllIlIlIIl) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
        this.IlIIIlIlIIIllIlIlIIl = ilIIIlIlIIIllIlIlIIl;
    }
    
    @Override
    protected llllIIIlIlllIlIIIIIl llllIIIIlIIIlIlllIll(final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl) {
        final LinkedHashMap linkedHashMap = Maps.newLinkedHashMap((Map)llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl());
        String s;
        if (this.llllIIIIlIIIlIlllIll == null) {
            s = ((lIllllIllIllIIllllll)net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(llIIlIIIlIIIllIlIIIl.llIllIIIIIllIlIIIIlI())).toString();
        }
        else {
            s = this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(linkedHashMap.remove(this.llllIIIIlIIIlIlllIll));
        }
        if (this.llIllIIIIIllIlIIIIlI != null) {
            s = String.valueOf(s) + this.llIllIIIIIllIlIIIIlI;
        }
        final Iterator<llllIIIIlIIIlIlllIll> iterator = (Iterator<llllIIIIlIIIlIlllIll>)this.IlIIIlIlIIIllIlIlIIl.iterator();
        while (iterator.hasNext()) {
            linkedHashMap.remove(iterator.next());
        }
        return new llllIIIlIlllIlIIIIIl(s, this.llllIIIIlIIIlIlllIll(linkedHashMap));
    }
}
