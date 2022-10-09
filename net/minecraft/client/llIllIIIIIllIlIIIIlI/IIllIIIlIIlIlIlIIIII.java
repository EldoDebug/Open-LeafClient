package net.minecraft.client.llIllIIIIIllIlIIIIlI;

import com.google.common.base.*;
import java.net.*;

class IIllIIIlIIlIlIlIIIII implements Predicate
{
    final /* synthetic */ IllIlIllIllIlllIIlll llllIIIIlIIIlIlllIll;
    
    IIllIIIlIIlIlIlIIIII(final IllIlIllIllIlllIIlll llllIIIIlIIIlIlllIll) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
    }
    
    public boolean llllIIIIlIIIlIlllIll(final String s) {
        if (s.length() == 0) {
            return true;
        }
        final String[] split = s.split(":");
        if (split.length == 0) {
            return true;
        }
        try {
            IDN.toASCII(split[0]);
            return true;
        }
        catch (IllegalArgumentException ex) {
            return false;
        }
    }
}
