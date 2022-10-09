package net.minecraft.client.IlIIIlIlIIIllIlIlIIl;

import net.minecraft.llllIIIlIlllIlIIIIIl.*;

public class lIIIIlIIIIIlllIllIII extends IlIIIlIlIIIllIlIlIIl
{
    public IIlIIIIIllIlIIIlIIll[] llllIIIIlIIIlIlllIll;
    
    public lIIIIlIIIIIlllIllIII() {
        (this.llllIIIIlIIIlIlllIll = new IIlIIIIIllIlIIIlIIll[5])[0] = new IIlIIIIIllIlIIIlIIll(this, 0, 8);
        this.llllIIIIlIIIlIlllIll[1] = new IIlIIIIIllIlIIIlIIll(this, 0, 0);
        this.llllIIIIlIIIlIlllIll[2] = new IIlIIIIIllIlIIIlIIll(this, 0, 0);
        this.llllIIIIlIIIlIlllIll[3] = new IIlIIIIIllIlIIIlIIll(this, 0, 0);
        this.llllIIIIlIIIlIlllIll[4] = new IIlIIIIIllIlIIIlIIll(this, 0, 0);
        final int n = 24;
        final int n2 = 6;
        final int n3 = 20;
        final int n4 = 4;
        this.llllIIIIlIIIlIlllIll[0].llllIIIIlIIIlIlllIll((float)(-n / 2), (float)(-n3 / 2 + 2), -3.0f, n, n3 - 4, 4, 0.0f);
        this.llllIIIIlIIIlIlllIll[0].llllIIIIlIIIlIlllIll(0.0f, (float)n4, 0.0f);
        this.llllIIIIlIIIlIlllIll[1].llllIIIIlIIIlIlllIll((float)(-n / 2 + 2), (float)(-n2 - 1), -1.0f, n - 4, n2, 2, 0.0f);
        this.llllIIIIlIIIlIlllIll[1].llllIIIIlIIIlIlllIll((float)(-n / 2 + 1), (float)n4, 0.0f);
        this.llllIIIIlIIIlIlllIll[2].llllIIIIlIIIlIlllIll((float)(-n / 2 + 2), (float)(-n2 - 1), -1.0f, n - 4, n2, 2, 0.0f);
        this.llllIIIIlIIIlIlllIll[2].llllIIIIlIIIlIlllIll((float)(n / 2 - 1), (float)n4, 0.0f);
        this.llllIIIIlIIIlIlllIll[3].llllIIIIlIIIlIlllIll((float)(-n / 2 + 2), (float)(-n2 - 1), -1.0f, n - 4, n2, 2, 0.0f);
        this.llllIIIIlIIIlIlllIll[3].llllIIIIlIIIlIlllIll(0.0f, (float)n4, (float)(-n3 / 2 + 1));
        this.llllIIIIlIIIlIlllIll[4].llllIIIIlIIIlIlllIll((float)(-n / 2 + 2), (float)(-n2 - 1), -1.0f, n - 4, n2, 2, 0.0f);
        this.llllIIIIlIIIlIlllIll[4].llllIIIIlIIIlIlllIll(0.0f, (float)n4, (float)(n3 / 2 - 1));
        this.llllIIIIlIIIlIlllIll[0].IllIIlllIIIIlllIIlIl = 1.5707964f;
        this.llllIIIIlIIIlIlllIll[1].llllIIIlIlllIlIIIIIl = 4.712389f;
        this.llllIIIIlIIIlIlllIll[2].llllIIIlIlllIlIIIIIl = 1.5707964f;
        this.llllIIIIlIIIlIlllIll[3].llllIIIlIlllIlIIIIIl = 3.1415927f;
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI, final float n, final float n2, final float n3, final float n4, final float n5, final float n6) {
        for (int i = 0; i < 5; ++i) {
            this.llllIIIIlIIIlIlllIll[i].llllIIIIlIIIlIlllIll(n6);
        }
    }
}
