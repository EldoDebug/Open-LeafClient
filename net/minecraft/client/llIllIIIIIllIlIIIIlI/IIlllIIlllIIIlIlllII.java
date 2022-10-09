package net.minecraft.client.llIllIIIIIllIlIIIIlI;

import java.util.*;
import net.minecraft.client.IllIIlllIIIIlllIIlIl.*;
import com.google.common.collect.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.lllIIIIlllllIlIIllIl.*;

class IIlllIIlllIIIlIlllII implements Comparator
{
    private IIlllIIlllIIIlIlllII() {
    }
    
    public int llllIIIIlIIIlIlllIll(final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll, final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll2) {
        final lIIIlllIIIllIIIllIII liiiIlIIIIIlllIllIII = iiiIlllIIIIIIlIIIlll.lIIIIlIIIIIlllIllIII();
        final lIIIlllIIIllIIIllIII liiiIlIIIIIlllIllIII2 = iiiIlllIIIIIIlIIIlll2.lIIIIlIIIIIlllIllIII();
        return ComparisonChain.start().compareTrueFirst(iiiIlllIIIIIIlIIIlll.IlIlIlIlIlllllllllIl() != lllIllIIIllllllIllll.IlIlIIIllIllIIIIIllI, iiiIlllIIIIIIlIIIlll2.IlIlIlIlIlllllllllIl() != lllIllIIIllllllIllll.IlIlIIIllIllIIIIIllI).compare((Comparable)((liiiIlIIIIIlllIllIII != null) ? liiiIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll() : ""), (Comparable)((liiiIlIIIIIlllIllIII2 != null) ? liiiIlIIIIIlllIllIII2.llllIIIIlIIIlIlllIll() : "")).compare((Comparable)iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll().getName(), (Comparable)iiiIlllIIIIIIlIIIlll2.llllIIIIlIIIlIlllIll().getName()).result();
    }
}
