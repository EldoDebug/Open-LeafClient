package net.optifine.shaders.llllIIIIlIIIlIlllIll;

import net.minecraft.IIllIIllIIIlIlIIIIlI.*;
import net.optifine.shaders.*;
import java.io.*;
import java.util.*;

public class IlIIIlIlIIIllIlIlIIl
{
    public static InputStream llllIIIIlIIIlIlllIll(final InputStream inputStream, final String s) {
        String s2 = llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(inputStream, "ASCII");
        final String ilIlIlIlIlllllllllIl = IlIlIlIlIlllllllllIl(s2);
        if (!ilIlIlIlIlllllllllIl.isEmpty()) {
            final String string = String.valueOf(ilIlIlIlIlllllllllIl) + s2;
            if (llIIlllIIlllIIllIllI.cY) {
                llIIlllIIlllIIllIllI.llllIIIIlIIIlIlllIll(String.valueOf(s.replace(':', '/')) + ".pre", string);
            }
            s2 = llllIIIIlIIIlIlllIll(string);
        }
        if (llIIlllIIlllIIllIllI.cY) {
            llIIlllIIlllIIllIllI.llllIIIIlIIIlIlllIll(s.replace(':', '/'), s2);
        }
        return new ByteArrayInputStream(s2.getBytes("ASCII"));
    }
    
    public static String llllIIIIlIIIlIlllIll(final String s) {
        final BufferedReader bufferedReader = new BufferedReader(new StringReader(s));
        final IlIlIIIllIllIIIIIllI ilIlIIIllIllIIIIIllI = new IlIlIIIllIllIIIIIllI();
        final StringBuilder sb = new StringBuilder();
        while (true) {
            final String line = bufferedReader.readLine();
            if (line == null) {
                break;
            }
            if (!ilIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll(line) || IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl(line)) {
                continue;
            }
            sb.append(line);
            sb.append("\n");
        }
        return sb.toString();
    }
    
    private static String IlIlIlIlIlllllllllIl(final String s) {
        final StringBuilder sb = new StringBuilder();
        List<lIlIlIIIllIIllIIIllI> list = null;
        final BufferedReader bufferedReader = new BufferedReader(new StringReader(s));
        while (true) {
            final String line = bufferedReader.readLine();
            if (line == null) {
                break;
            }
            if (!IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl(line)) {
                continue;
            }
            if (sb.length() == 0) {
                sb.append(IlIlIIIllIIllIlllllI.IllIIlllIIIIlllIIlIl());
            }
            if (list == null) {
                list = new ArrayList<lIlIlIIIllIIllIIIllI>(Arrays.asList(IlIlIIIllIIllIlllllI.IlIlIIIllIllIIIIIllI()));
            }
            final Iterator<lIlIlIIIllIIllIIIllI> iterator = list.iterator();
            while (iterator.hasNext()) {
                final lIlIlIIIllIIllIIIllI lIlIlIIIllIIllIIIllI = iterator.next();
                if (line.contains(lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll())) {
                    sb.append(lIlIlIIIllIIllIIIllI.llIllIIIIIllIlIIIIlI());
                    sb.append("\n");
                    iterator.remove();
                }
            }
        }
        return sb.toString();
    }
    
    private static List llllIIIIlIIIlIlllIll() {
        final ArrayList<IIIIlllIIIIIIlIIIlll> list = new ArrayList<IIIIlllIIIIIIlIIIlll>();
        final IIIIlllIIIIIIlIIIlll[] ilIlIIIllIllIIIIIllI = llIIlllIIlllIIllIllI.IlIlIIIllIllIIIIIllI();
        for (int i = 0; i < ilIlIIIllIllIIIIIllI.length; ++i) {
            final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll = ilIlIIIllIllIIIIIllI[i];
            final String llllIIllllIlIlIIIIll = iiiIlllIIIIIIlIIIlll.llllIIllllIlIlIIIIll();
            if (llllIIllllIlIlIIIIll != null && llllIIllllIlIlIIIIll.startsWith("#")) {
                list.add(iiiIlllIIIIIIlIIIlll);
            }
        }
        return list;
    }
}
