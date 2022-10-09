package net.minecraft.client;

import java.util.concurrent.*;
import java.util.*;

class lIIIIlIIIIIlllIllIII implements Callable
{
    final /* synthetic */ Minecraft llllIIIIlIIIlIlllIll;
    
    lIIIIlIIIIIlllIllIII(final Minecraft llllIIIIlIIIlIlllIll) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
    }
    
    public String llllIIIIlIIIlIlllIll() {
        final StringBuilder sb = new StringBuilder();
        for (final String s : this.llllIIIIlIIIlIlllIll.IIIlIIIlIlIIlllIIlll.llIllIlIIIIllIlIIllI) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append(s);
            if (this.llllIIIIlIIIlIlllIll.IIIlIIIlIlIIlllIIlll.lIlIlIIIllIIllIIIllI.contains(s)) {
                sb.append(" (incompatible)");
            }
        }
        return sb.toString();
    }
}
