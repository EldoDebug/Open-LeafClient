package net.minecraft.llIllIIIIIllIlIIIIlI;

import java.util.concurrent.*;
import java.lang.management.*;
import java.util.*;

class llllIIIlIlllIlIIIIIl implements Callable
{
    final /* synthetic */ llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll;
    
    llllIIIlIlllIlIIIIIl(final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
    }
    
    public String llllIIIIlIIIlIlllIll() {
        final List<String> inputArguments = ManagementFactory.getRuntimeMXBean().getInputArguments();
        int n = 0;
        final StringBuilder sb = new StringBuilder();
        for (final String s : inputArguments) {
            if (s.startsWith("-X")) {
                if (n++ > 0) {
                    sb.append(" ");
                }
                sb.append(s);
            }
        }
        return String.format("%d total; %s", n, sb.toString());
    }
}
