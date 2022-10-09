package net.optifine.expr;

import java.io.*;

public class TestExpressions
{
    public static void main(final String[] array) {
        final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl = new IlIIIlIlIIIllIlIlIIl(null);
    Label_0009_Outer:
        while (true) {
            while (true) {
                try {
                    while (true) {
                        final String line = new BufferedReader(new InputStreamReader(System.in)).readLine();
                        if (line.length() <= 0) {
                            break;
                        }
                        final llIIlIIIlIIIllIlIIIl llIllIIIIIllIlIIIIlI = ilIIIlIlIIIllIlIlIIl.llIllIIIIIllIlIIIIlI(line);
                        if (llIllIIIIIllIlIIIIlI instanceof IlIlIIIllIIllIlllllI) {
                            System.out.println(new StringBuilder().append(((IlIlIIIllIIllIlllllI)llIllIIIIIllIlIIIIlI).IlIlIlIlIlllllllllIl()).toString());
                        }
                        if (!(llIllIIIIIllIlIIIIlI instanceof llIllIlIIIIllIlIIllI)) {
                            continue Label_0009_Outer;
                        }
                        System.out.println(new StringBuilder().append(((llIllIlIIIIllIlIIllI)llIllIIIIIllIlIIIIlI).llIllIIIIIllIlIIIIlI()).toString());
                    }
                    return;
                }
                catch (Exception ex) {
                    ex.printStackTrace();
                    continue Label_0009_Outer;
                }
                continue;
            }
        }
    }
}
