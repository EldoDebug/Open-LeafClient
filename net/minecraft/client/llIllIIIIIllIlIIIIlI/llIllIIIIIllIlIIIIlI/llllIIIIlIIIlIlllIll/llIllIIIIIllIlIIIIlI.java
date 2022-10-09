package net.minecraft.client.llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll;

import java.util.*;
import net.minecraft.client.IllIIlllIIIIlllIIlIl.*;
import com.google.common.collect.*;

class llIllIIIIIllIlIIIIlI implements Comparator
{
    public int llllIIIIlIIIlIlllIll(final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll, final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll2) {
        return ComparisonChain.start().compare((Comparable)iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll().getId(), (Comparable)iiiIlllIIIIIIlIIIlll2.llllIIIIlIIIlIlllIll().getId()).result();
    }
}
