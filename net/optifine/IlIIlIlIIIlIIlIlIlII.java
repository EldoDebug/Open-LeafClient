package net.optifine;

import com.google.common.base.*;
import java.util.regex.*;
import net.minecraft.IIllIIllIIIlIlIIIIlI.*;
import net.minecraft.client.llIIlIIIlIIIllIlIIIl.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import java.io.*;
import org.apache.commons.io.*;
import com.google.common.collect.*;
import java.util.*;

public class IlIIlIlIIIlIIlIlIlII
{
    private static final Splitter llllIIIIlIIIlIlllIll;
    private static final Pattern IlIlIlIlIlllllllllIl;
    
    static {
        llllIIIIlIIIlIlllIll = Splitter.on('=').limit(2);
        IlIlIlIlIlllllllllIl = Pattern.compile("%(\\d+\\$)?[\\d\\.]*[df]");
    }
    
    public static void llllIIIIlIIIlIlllIll() {
        final Map llllIIIIlIIIlIlllIll = llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll();
        final ArrayList<String> list = new ArrayList<String>();
        final String s = "optifine/lang/";
        final String s2 = "en_US";
        final String s3 = ".lang";
        list.add(String.valueOf(s) + s2 + s3);
        if (!net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.c().lllIIIIlIlIllIIlIIIl.equals(s2)) {
            list.add(String.valueOf(s) + net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.c().lllIIIIlIlIllIIlIIIl + s3);
        }
        final String[] array = list.toArray(new String[list.size()]);
        llllIIIIlIIIlIlllIll(net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.lIllIIIIIlllIIlIIllI(), array, llllIIIIlIIIlIlllIll);
        final llllIIllllIlIlIIIIll[] lllllIIIIIlIlIIIIIIl = net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.lllllIIIIIlIlIIIIIIl();
        for (int i = 0; i < lllllIIIIIlIlIIIIIIl.length; ++i) {
            llllIIIIlIIIlIlllIll(lllllIIIIIlIlIIIIIIl[i], array, llllIIIIlIIIlIlllIll);
        }
    }
    
    private static void llllIIIIlIIIlIlllIll(final llllIIllllIlIlIIIIll llllIIllllIlIlIIIIll, final String[] array, final Map map) {
        try {
            for (int i = 0; i < array.length; ++i) {
                final lIllllIllIllIIllllll lIllllIllIllIIllllll = new lIllllIllIllIIllllll(array[i]);
                if (llllIIllllIlIlIIIIll.IlIlIlIlIlllllllllIl(lIllllIllIllIIllllll)) {
                    final InputStream llllIIIIlIIIlIlllIll = llllIIllllIlIlIIIIll.llllIIIIlIIIlIlllIll(lIllllIllIllIIllllll);
                    if (llllIIIIlIIIlIlllIll != null) {
                        llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll, map);
                    }
                }
            }
        }
        catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    
    public static void llllIIIIlIIIlIlllIll(final InputStream inputStream, final Map map) {
        final Iterator<String> iterator = IOUtils.readLines(inputStream, Charsets.UTF_8).iterator();
        inputStream.close();
        while (iterator.hasNext()) {
            final String s = iterator.next();
            if (!s.isEmpty() && s.charAt(0) != '#') {
                final String[] array = (String[])Iterables.toArray(IlIIlIlIIIlIIlIlIlII.llllIIIIlIIIlIlllIll.split((CharSequence)s), (Class)String.class);
                if (array == null || array.length != 2) {
                    continue;
                }
                map.put(array[0], IlIIlIlIIIlIIlIlIlII.IlIlIlIlIlllllllllIl.matcher(array[1]).replaceAll("%$1s"));
            }
        }
    }
    
    public static String llllIIIIlIIIlIlllIll(final String s) {
        return llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(s, new Object[0]);
    }
    
    public static String llllIIIIlIIIlIlllIll(final String s, final String s2) {
        final String llllIIIIlIIIlIlllIll = llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(s, new Object[0]);
        return (llllIIIIlIIIlIlllIll != null && !llllIIIIlIIIlIlllIll.equals(s)) ? llllIIIIlIIIlIlllIll : s2;
    }
    
    public static String IlIlIlIlIlllllllllIl() {
        return llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("options.on", new Object[0]);
    }
    
    public static String llIllIIIIIllIlIIIIlI() {
        return llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("options.off", new Object[0]);
    }
    
    public static String IlIIIlIlIIIllIlIlIIl() {
        return llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("options.graphics.fast", new Object[0]);
    }
    
    public static String IlIlIIIllIllIIIIIllI() {
        return llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("options.graphics.fancy", new Object[0]);
    }
    
    public static String IllIIlllIIIIlllIIlIl() {
        return llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("generator.default", new Object[0]);
    }
}
