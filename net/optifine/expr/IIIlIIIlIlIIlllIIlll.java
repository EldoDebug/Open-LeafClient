package net.optifine.expr;

import java.io.*;
import java.util.*;

public class IIIlIIIlIlIIlllIIlll
{
    public static IIllIIllIIIlIlIIIIlI[] llllIIIIlIIIlIlllIll(final String s) {
        final PushbackReader pushbackReader = new PushbackReader(new StringReader(s));
        final ArrayList<IIllIIllIIIlIlIIIIlI> list = new ArrayList<IIllIIllIIIlIlIIIIlI>();
        while (true) {
            final int read = pushbackReader.read();
            if (read < 0) {
                return list.toArray(new IIllIIllIIIlIlIIIIlI[list.size()]);
            }
            final char c = (char)read;
            if (Character.isWhitespace(c)) {
                continue;
            }
            final IlIlIIIlIIlIlIIlllIl llllIIIIlIIIlIlllIll = IlIlIIIlIIlIlIIlllIl.llllIIIIlIIIlIlllIll(c);
            if (llllIIIIlIIIlIlllIll == null) {
                throw new IlIlIIIIIIlllIlIllIl("Invalid character: '" + c + "', in: " + s);
            }
            list.add(llllIIIIlIIIlIlllIll(c, llllIIIIlIIIlIlllIll, pushbackReader));
        }
    }
    
    private static IIllIIllIIIlIlIIIIlI llllIIIIlIIIlIlllIll(final char c, final IlIlIIIlIIlIlIIlllIl ilIlIIIlIIlIlIIlllIl, final PushbackReader pushbackReader) {
        final StringBuffer sb = new StringBuffer();
        sb.append(c);
        while (true) {
            final int read = pushbackReader.read();
            if (read < 0) {
                break;
            }
            final char c2 = (char)read;
            if (!ilIlIIIlIIlIlIIlllIl.IlIlIlIlIlllllllllIl(c2)) {
                pushbackReader.unread(c2);
                break;
            }
            sb.append(c2);
        }
        return new IIllIIllIIIlIlIIIIlI(ilIlIIIlIIlIlIIlllIl, sb.toString());
    }
}
