package net.minecraft.client.llIIlIIIlIIIllIlIIIl;

import com.google.common.base.*;
import java.util.regex.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import java.io.*;
import org.apache.commons.io.*;
import com.google.common.collect.*;
import java.util.*;

public class lllIIIIlllllIlIIllIl
{
    private static final Splitter IlIlIlIlIlllllllllIl;
    private static final Pattern llIllIIIIIllIlIIIIlI;
    Map llllIIIIlIIIlIlllIll;
    private boolean IlIIIlIlIIIllIlIlIIl;
    
    static {
        IlIlIlIlIlllllllllIl = Splitter.on('=').limit(2);
        llIllIIIIIllIlIIIIlI = Pattern.compile("%(\\d+\\$)?[\\d\\.]*[df]");
    }
    
    public lllIIIIlllllIlIIllIl() {
        this.llllIIIIlIIIlIlllIll = Maps.newHashMap();
    }
    
    public synchronized void llllIIIIlIIIlIlllIll(final IlIlIIIllIIllIlllllI ilIlIIIllIIllIlllllI, final List list) {
        this.llllIIIIlIIIlIlllIll.clear();
        final Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            final String format = String.format("lang/%s.lang", iterator.next());
            for (final String s : ilIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll()) {
                try {
                    this.llllIIIIlIIIlIlllIll(ilIlIIIllIIllIlllllI.IlIlIlIlIlllllllllIl(new lIllllIllIllIIllllll(s, format)));
                }
                catch (IOException ex) {}
            }
        }
        this.IlIlIlIlIlllllllllIl();
    }
    
    public boolean llllIIIIlIIIlIlllIll() {
        return this.IlIIIlIlIIIllIlIlIIl;
    }
    
    private void IlIlIlIlIlllllllllIl() {
        this.IlIIIlIlIIIllIlIlIIl = false;
        int n = 0;
        int n2 = 0;
        for (final String s : this.llllIIIIlIIIlIlllIll.values()) {
            final int length = s.length();
            n2 += length;
            for (int i = 0; i < length; ++i) {
                if (s.charAt(i) >= '\u0100') {
                    ++n;
                }
            }
        }
        this.IlIIIlIlIIIllIlIlIIl = (n / (float)n2 > 0.1);
    }
    
    private void llllIIIIlIIIlIlllIll(final List list) {
        final Iterator<lIlIlIIIllIIllIIIllI> iterator = list.iterator();
        while (iterator.hasNext()) {
            final InputStream ilIlIlIlIlllllllllIl = iterator.next().IlIlIlIlIlllllllllIl();
            try {
                this.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl);
            }
            finally {
                IOUtils.closeQuietly(ilIlIlIlIlllllllllIl);
            }
            IOUtils.closeQuietly(ilIlIlIlIlllllllllIl);
        }
    }
    
    private void llllIIIIlIIIlIlllIll(final InputStream inputStream) {
        for (final String s : IOUtils.readLines(inputStream, Charsets.UTF_8)) {
            if (!s.isEmpty() && s.charAt(0) != '#') {
                final String[] array = (String[])Iterables.toArray(lllIIIIlllllIlIIllIl.IlIlIlIlIlllllllllIl.split((CharSequence)s), (Class)String.class);
                if (array == null || array.length != 2) {
                    continue;
                }
                this.llllIIIIlIIIlIlllIll.put(array[0], lllIIIIlllllIlIIllIl.llIllIIIIIllIlIIIIlI.matcher(array[1]).replaceAll("%$1s"));
            }
        }
    }
    
    private String llllIIIIlIIIlIlllIll(final String s) {
        final String s2 = this.llllIIIIlIIIlIlllIll.get(s);
        return (s2 == null) ? s : s2;
    }
    
    public String llllIIIIlIIIlIlllIll(final String s, final Object[] array) {
        final String llllIIIIlIIIlIlllIll = this.llllIIIIlIIIlIlllIll(s);
        try {
            return String.format(llllIIIIlIIIlIlllIll, array);
        }
        catch (IllegalFormatException ex) {
            return "Format error: " + llllIIIIlIIIlIlllIll;
        }
    }
}
