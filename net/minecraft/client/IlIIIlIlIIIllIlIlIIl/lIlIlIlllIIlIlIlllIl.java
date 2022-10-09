package net.minecraft.client.IlIIIlIlIIIllIlIlIIl;

import net.minecraft.IIllIIllIIIlIlIIIIlI.*;
import net.optifine.shaders.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;

public class lIlIlIlllIIlIlIlllIl
{
    public lIIlIIIlIllIlIllIIIl[] llllIIIIlIIIlIlllIll;
    public int IlIlIlIlIlllllllllIl;
    private boolean llIllIIIIIllIlIIIIlI;
    
    public lIlIlIlllIIlIlIlllIl(final lIIlIIIlIllIlIllIIIl[] llllIIIIlIIIlIlllIll) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.IlIlIlIlIlllllllllIl = llllIIIIlIIIlIlllIll.length;
    }
    
    public lIlIlIlllIIlIlIlllIl(final lIIlIIIlIllIlIllIIIl[] array, final int n, final int n2, final int n3, final int n4, final float n5, final float n6) {
        this(array);
        final float n7 = 0.0f / n5;
        final float n8 = 0.0f / n6;
        array[0] = array[0].llllIIIIlIIIlIlllIll(n3 / n5 - n7, n2 / n6 + n8);
        array[1] = array[1].llllIIIIlIIIlIlllIll(n / n5 + n7, n2 / n6 + n8);
        array[2] = array[2].llllIIIIlIIIlIlllIll(n / n5 + n7, n4 / n6 - n8);
        array[3] = array[3].llllIIIIlIIIlIlllIll(n3 / n5 - n7, n4 / n6 - n8);
    }
    
    public void llllIIIIlIIIlIlllIll() {
        final lIIlIIIlIllIlIllIIIl[] llllIIIIlIIIlIlllIll = new lIIlIIIlIllIlIllIIIl[this.llllIIIIlIIIlIlllIll.length];
        for (int i = 0; i < this.llllIIIIlIIIlIlllIll.length; ++i) {
            llllIIIIlIIIlIlllIll[i] = this.llllIIIIlIIIlIlllIll[this.llllIIIIlIIIlIlllIll.length - i - 1];
        }
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
    }
    
    public void llllIIIIlIIIlIlllIll(final lIIllIIIllllIlllIllI liIllIIIllllIlllIllI, final float n) {
        final e llllIIIIlIIIlIlllIll = this.llllIIIIlIIIlIlllIll[1].llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(this.llllIIIIlIIIlIlllIll[2].llllIIIIlIIIlIlllIll).llIllIIIIIllIlIIIIlI(this.llllIIIIlIIIlIlllIll[1].llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(this.llllIIIIlIIIlIlllIll[0].llllIIIIlIIIlIlllIll)).llllIIIIlIIIlIlllIll();
        float n2 = (float)llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll;
        float n3 = (float)llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl;
        float n4 = (float)llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI;
        if (this.llIllIIIIIllIlIIIIlI) {
            n2 = -n2;
            n3 = -n3;
            n4 = -n4;
        }
        if (net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.b()) {
            liIllIIIllllIlllIllI.llllIIIIlIIIlIlllIll(7, IIlIIIIlllIlllllIlII.IlIlIIIllIllIIIIIllI);
        }
        else {
            liIllIIIllllIlllIllI.llllIIIIlIIIlIlllIll(7, net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI);
        }
        for (int i = 0; i < 4; ++i) {
            final lIIlIIIlIllIlIllIIIl liIlIIIlIllIlIllIIIl = this.llllIIIIlIIIlIlllIll[i];
            liIllIIIllllIlllIllI.IlIlIlIlIlllllllllIl(liIlIIIlIllIlIllIIIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll * n, liIlIIIlIllIlIllIIIl.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl * n, liIlIIIlIllIlIllIIIl.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI * n).llllIIIIlIIIlIlllIll(liIlIIIlIllIlIllIIIl.IlIlIlIlIlllllllllIl, liIlIIIlIllIlIllIIIl.llIllIIIIIllIlIIIIlI).llIllIIIIIllIlIIIIlI(n2, n3, n4).IlIlIIIllIllIIIIIllI();
        }
        IIlllIIlllIIIlIlllII.llllIIIIlIIIlIlllIll().IlIlIlIlIlllllllllIl();
    }
}
