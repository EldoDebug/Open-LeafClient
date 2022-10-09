package net.optifine.llIllIIIIIllIlIIIIlI;

import java.util.*;
import net.minecraft.client.*;
import net.minecraft.client.llIllIIIIIllIlIIIIlI.*;
import java.awt.*;

public class IIIIlllIIIIIIlIIIlll
{
    private lIIllIIIllllIlllIllI llllIIIIlIIIlIlllIll;
    private llllIIllllIlIlIIIIll IlIlIlIlIlllllllllIl;
    private int llIllIIIIIllIlIIIIlI;
    private int IlIIIlIlIIIllIlIlIIl;
    private long IlIlIIIllIllIIIIIllI;
    
    public IIIIlllIIIIIIlIIIlll(final lIIllIIIllllIlllIllI llllIIIIlIIIlIlllIll, final llllIIllllIlIlIIIIll ilIlIlIlIlllllllllIl) {
        this.llIllIIIIIllIlIIIIlI = 0;
        this.IlIIIlIlIIIllIlIlIIl = 0;
        this.IlIlIIIllIllIIIIIllI = 0L;
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
    }
    
    public void llllIIIIlIIIlIlllIll(final int llIllIIIIIllIlIIIIlI, final int ilIIIlIlIIIllIlIlIIl, final List list) {
        if (Math.abs(llIllIIIIIllIlIIIIlI - this.llIllIIIIIllIlIIIIlI) <= 5 && Math.abs(ilIIIlIlIIIllIlIlIIl - this.IlIIIlIlIIIllIlIlIIl) <= 5) {
            if (System.currentTimeMillis() >= this.IlIlIIIllIllIIIIIllI + 700) {
                final IlIIIlIlIIIllIlIlIIl llllIIIIlIIIlIlllIll = lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI, ilIIIlIlIIIllIlIlIIl, list);
                if (llllIIIIlIIIlIlllIll != null) {
                    final Rectangle llllIIIIlIIIlIlllIll2 = this.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(this.llllIIIIlIIIlIlllIll, llIllIIIIIllIlIIIIlI, ilIIIlIlIIIllIlIlIIl);
                    String[] llllIIIIlIIIlIlllIll3 = this.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll, llllIIIIlIIIlIlllIll2.width);
                    if (llllIIIIlIIIlIlllIll3 != null) {
                        if (llllIIIIlIIIlIlllIll3.length > 8) {
                            llllIIIIlIIIlIlllIll3 = Arrays.copyOf(llllIIIIlIIIlIlllIll3, 8);
                            llllIIIIlIIIlIlllIll3[llllIIIIlIIIlIlllIll3.length - 1] = String.valueOf(llllIIIIlIIIlIlllIll3[llllIIIIlIIIlIlllIll3.length - 1]) + " ...";
                        }
                        if (this.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll()) {
                            this.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll2.x, llllIIIIlIIIlIlllIll2.y, llllIIIIlIIIlIlllIll2.x + llllIIIIlIIIlIlllIll2.width, llllIIIIlIIIlIlllIll2.y + llllIIIIlIIIlIlllIll2.height, -528449408);
                        }
                        llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll2.x, llllIIIIlIIIlIlllIll2.y, llllIIIIlIIIlIlllIll2.x + llllIIIIlIIIlIlllIll2.width, llllIIIIlIIIlIlllIll2.y + llllIIIIlIIIlIlllIll2.height, -536870912);
                        for (int i = 0; i < llllIIIIlIIIlIlllIll3.length; ++i) {
                            final String s = llllIIIIlIIIlIlllIll3[i];
                            int n = 14540253;
                            if (s.endsWith("!")) {
                                n = 16719904;
                            }
                            Minecraft.getMinecraft().lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll(s, (float)(llllIIIIlIIIlIlllIll2.x + 5), (float)(llllIIIIlIIIlIlllIll2.y + 5 + i * 11), n);
                        }
                    }
                }
            }
        }
        else {
            this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
            this.IlIIIlIlIIIllIlIlIIl = ilIIIlIlIIIllIlIlIIl;
            this.IlIlIIIllIllIIIIIllI = System.currentTimeMillis();
        }
    }
    
    private void llllIIIIlIIIlIlllIll(final int n, final int n2, final int n3, final int n4, final int n5) {
        net.minecraft.client.llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(n, n2 - 1, n3, n2, n5);
        net.minecraft.client.llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(n, n4, n3, n4 + 1, n5);
        net.minecraft.client.llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(n - 1, n2, n, n4, n5);
        net.minecraft.client.llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(n3, n2, n3 + 1, n4, n5);
    }
}
