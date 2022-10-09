package net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI;

import com.google.common.base.*;
import java.util.*;
import net.minecraft.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.*;

class llllIIIlIlllIlIIIIIl implements Function
{
    public String llllIIIIlIIIlIlllIll(final Map.Entry entry) {
        if (entry == null) {
            return "<NULL>";
        }
        final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll = entry.getKey();
        return String.valueOf(llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll()) + "=" + llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll((Comparable)entry.getValue());
    }
}
