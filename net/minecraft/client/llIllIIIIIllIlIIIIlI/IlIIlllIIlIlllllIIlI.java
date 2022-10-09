package net.minecraft.client.llIllIIIIIllIlIIIIlI;

import net.minecraft.client.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import com.google.common.collect.*;
import java.util.*;

public class IlIIlllIIlIlllllIIlI
{
    public static String llllIIIIlIIIlIlllIll(final String s, final boolean b) {
        return (!b && !Minecraft.getMinecraft().IIIlIIIlIlIIlllIIlll.IIIIlllIIIIIIlIIIlll) ? IlllIIIIlIIIlIlIlIIl.llllIIIIlIIIlIlllIll(s) : s;
    }
    
    public static List llllIIIIlIIIlIlllIll(final llIIIIIIlIllIIlIIIll llIIIIIIlIllIIlIIIll, final int n, final FontRenderer fontRenderer, final boolean b, final boolean b2) {
        int n2 = 0;
        IlIlIIIIIIlllIlIllIl ilIlIIIIIIlllIlIllIl = new IlIlIIIIIIlllIlIllIl("");
        final ArrayList arrayList = Lists.newArrayList();
        final ArrayList arrayList2 = Lists.newArrayList((Iterable)llIIIIIIlIllIIlIIIll);
        for (int i = 0; i < arrayList2.size(); ++i) {
            final llIIIIIIlIllIIlIIIll llIIIIIIlIllIIlIIIll2 = arrayList2.get(i);
            String s = llIIIIIIlIllIIlIIIll2.llIllIIIIIllIlIIIIlI();
            boolean b3 = false;
            if (s.contains("\n")) {
                final int index = s.indexOf(10);
                final String substring = s.substring(index + 1);
                s = s.substring(0, index + 1);
                final IlIlIIIIIIlllIlIllIl ilIlIIIIIIlllIlIllIl2 = new IlIlIIIIIIlllIlIllIl(substring);
                ilIlIIIIIIlllIlIllIl2.llllIIIIlIIIlIlllIll(llIIIIIIlIllIIlIIIll2.llllIIIlIlllIlIIIIIl().lIlIlIIIllIIllIIIllI());
                arrayList2.add(i + 1, ilIlIIIIIIlllIlIllIl2);
                b3 = true;
            }
            final String llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll(String.valueOf(llIIIIIIlIllIIlIIIll2.llllIIIlIlllIlIIIIIl().llIllIlIIIIllIlIIllI()) + s, b2);
            final String s2 = llllIIIIlIIIlIlllIll.endsWith("\n") ? llllIIIIlIIIlIlllIll.substring(0, llllIIIIlIIIlIlllIll.length() - 1) : llllIIIIlIIIlIlllIll;
            int n3 = fontRenderer.llllIIIIlIIIlIlllIll(s2);
            IlIlIIIIIIlllIlIllIl ilIlIIIIIIlllIlIllIl3 = new IlIlIIIIIIlllIlIllIl(s2);
            ilIlIIIIIIlllIlIllIl3.llllIIIIlIIIlIlllIll(llIIIIIIlIllIIlIIIll2.llllIIIlIlllIlIIIIIl().lIlIlIIIllIIllIIIllI());
            if (n2 + n3 > n) {
                String s3 = fontRenderer.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll, n - n2, false);
                String substring2 = (s3.length() < llllIIIIlIIIlIlllIll.length()) ? llllIIIIlIIIlIlllIll.substring(s3.length()) : null;
                if (substring2 != null && substring2.length() > 0) {
                    int lastIndex = s3.lastIndexOf(" ");
                    if (lastIndex >= 0 && fontRenderer.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll.substring(0, lastIndex)) > 0) {
                        s3 = llllIIIIlIIIlIlllIll.substring(0, lastIndex);
                        if (b) {
                            ++lastIndex;
                        }
                        substring2 = llllIIIIlIIIlIlllIll.substring(lastIndex);
                    }
                    else if (n2 > 0 && !llllIIIIlIIIlIlllIll.contains(" ")) {
                        s3 = "";
                        substring2 = llllIIIIlIIIlIlllIll;
                    }
                    final IlIlIIIIIIlllIlIllIl ilIlIIIIIIlllIlIllIl4 = new IlIlIIIIIIlllIlIllIl(substring2);
                    ilIlIIIIIIlllIlIllIl4.llllIIIIlIIIlIlllIll(llIIIIIIlIllIIlIIIll2.llllIIIlIlllIlIIIIIl().lIlIlIIIllIIllIIIllI());
                    arrayList2.add(i + 1, ilIlIIIIIIlllIlIllIl4);
                }
                n3 = fontRenderer.llllIIIIlIIIlIlllIll(s3);
                ilIlIIIIIIlllIlIllIl3 = new IlIlIIIIIIlllIlIllIl(s3);
                ilIlIIIIIIlllIlIllIl3.llllIIIIlIIIlIlllIll(llIIIIIIlIllIIlIIIll2.llllIIIlIlllIlIIIIIl().lIlIlIIIllIIllIIIllI());
                b3 = true;
            }
            if (n2 + n3 <= n) {
                n2 += n3;
                ilIlIIIIIIlllIlIllIl.llllIIIIlIIIlIlllIll(ilIlIIIIIIlllIlIllIl3);
            }
            else {
                b3 = true;
            }
            if (b3) {
                arrayList.add(ilIlIIIIIIlllIlIllIl);
                n2 = 0;
                ilIlIIIIIIlllIlIllIl = new IlIlIIIIIIlllIlIllIl("");
            }
        }
        arrayList.add(ilIlIIIIIIlllIlIllIl);
        return arrayList;
    }
}
