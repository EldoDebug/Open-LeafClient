package net.minecraft.IlllllllIIIlIIIlIlII;

import java.util.regex.*;
import com.google.common.base.*;
import org.apache.commons.io.*;
import com.google.common.collect.*;
import java.io.*;
import java.util.*;

public class lIllIIlIlIlllllIIIII
{
    private static final Pattern llllIIIIlIIIlIlllIll;
    private static final Splitter IlIlIlIlIlllllllllIl;
    private static lIllIIlIlIlllllIIIII llIllIIIIIllIlIIIIlI;
    private final Map IlIIIlIlIIIllIlIlIIl;
    private long IlIlIIIllIllIIIIIllI;
    
    static {
        llllIIIIlIIIlIlllIll = Pattern.compile("%(\\d+\\$)?[\\d\\.]*[df]");
        IlIlIlIlIlllllllllIl = Splitter.on('=').limit(2);
        lIllIIlIlIlllllIIIII.llIllIIIIIllIlIIIIlI = new lIllIIlIlIlllllIIIII();
    }
    
    public lIllIIlIlIlllllIIIII() {
        this.IlIIIlIlIIIllIlIlIIl = Maps.newHashMap();
        try {
            for (final String s : IOUtils.readLines(lIllIIlIlIlllllIIIII.class.getResourceAsStream("/assets/minecraft/lang/en_US.lang"), Charsets.UTF_8)) {
                if (!s.isEmpty() && s.charAt(0) != '#') {
                    final String[] array = (String[])Iterables.toArray(lIllIIlIlIlllllIIIII.IlIlIlIlIlllllllllIl.split((CharSequence)s), (Class)String.class);
                    if (array == null || array.length != 2) {
                        continue;
                    }
                    this.IlIIIlIlIIIllIlIlIIl.put(array[0], lIllIIlIlIlllllIIIII.llllIIIIlIIIlIlllIll.matcher(array[1]).replaceAll("%$1s"));
                }
            }
            this.IlIlIIIllIllIIIIIllI = System.currentTimeMillis();
        }
        catch (IOException ex) {}
    }
    
    static lIllIIlIlIlllllIIIII llllIIIIlIIIlIlllIll() {
        return lIllIIlIlIlllllIIIII.llIllIIIIIllIlIIIIlI;
    }
    
    public static synchronized void llllIIIIlIIIlIlllIll(final Map map) {
        lIllIIlIlIlllllIIIII.llIllIIIIIllIlIIIIlI.IlIIIlIlIIIllIlIlIIl.clear();
        lIllIIlIlIlllllIIIII.llIllIIIIIllIlIIIIlI.IlIIIlIlIIIllIlIlIIl.putAll(map);
        lIllIIlIlIlllllIIIII.llIllIIIIIllIlIIIIlI.IlIlIIIllIllIIIIIllI = System.currentTimeMillis();
    }
    
    public synchronized String llllIIIIlIIIlIlllIll(final String s) {
        return this.llIllIIIIIllIlIIIIlI(s);
    }
    
    public synchronized String llllIIIIlIIIlIlllIll(final String s, final Object... array) {
        final String llIllIIIIIllIlIIIIlI = this.llIllIIIIIllIlIIIIlI(s);
        try {
            return String.format(llIllIIIIIllIlIIIIlI, array);
        }
        catch (IllegalFormatException ex) {
            return "Format error: " + llIllIIIIIllIlIIIIlI;
        }
    }
    
    private String llIllIIIIIllIlIIIIlI(final String s) {
        final String s2 = this.IlIIIlIlIIIllIlIlIIl.get(s);
        return (s2 == null) ? s : s2;
    }
    
    public synchronized boolean IlIlIlIlIlllllllllIl(final String s) {
        return this.IlIIIlIlIIIllIlIlIIl.containsKey(s);
    }
    
    public long IlIlIlIlIlllllllllIl() {
        return this.IlIlIIIllIllIIIIIllI;
    }
}
