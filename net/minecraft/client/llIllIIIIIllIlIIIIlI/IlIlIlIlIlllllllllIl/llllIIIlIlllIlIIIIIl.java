package net.minecraft.client.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl;

import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.llIIlIIIlIIIllIlIIIl.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.*;

public class llllIIIlIlllIlIIIIIl extends lIIIlllIIIllIIIllIII
{
    private static final lIllllIllIllIIllllll IlIlIIIllIllIIIIIllI;
    private final IllIIlllIIIIlllIIlIl IllIIlllIIIIlllIIlIl;
    private llIIIlIlIllIIlIlIlII llllIIIlIlllIlIIIIIl;
    
    static {
        IlIlIIIllIllIIIIIllI = new lIllllIllIllIIllllll("textures/gui/container/brewing_stand.png");
    }
    
    public llllIIIlIlllIlIIIIIl(final IllIIlllIIIIlllIIlIl illIIlllIIIIlllIIlIl, final llIIIlIlIllIIlIlIlII llllIIIlIlllIlIIIIIl) {
        super(new IlIlIIIllIllIIIIIllI(illIIlllIIIIlllIIlIl, llllIIIlIlllIlIIIIIl));
        this.IllIIlllIIIIlllIIlIl = illIIlllIIIIlllIIlIl;
        this.llllIIIlIlllIlIIIIIl = llllIIIlIlllIlIIIIIl;
    }
    
    @Override
    protected void llllIIIIlIIIlIlllIll(final int n, final int n2) {
        final String liiiIlIIIIIlllIllIII = this.llllIIIlIlllIlIIIIIl.v_().lIIIIlIIIIIlllIllIII();
        this.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll(liiiIlIIIIIlllIllIII, this.IlIlIIIlIIlIlIIlllIl / 2 - this.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll(liiiIlIIIIIlllIllIII) / 2, 6, 4210752);
        this.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll(this.IllIIlllIIIIlllIIlIl.v_().lIIIIlIIIIIlllIllIII(), 8, this.IlllllllIIIlIIIlIlII - 96 + 2, 4210752);
    }
    
    @Override
    protected void llllIIIIlIIIlIlllIll(final float n, final int n2, final int n3) {
        net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI(1.0f, 1.0f, 1.0f, 1.0f);
        this.IlIlIIIllIIllIlllllI.lllIllIIIllllllIllll().llllIIIIlIIIlIlllIll(net.minecraft.client.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl.llllIIIlIlllIlIIIIIl.IlIlIIIllIllIIIIIllI);
        final int n4 = (this.llllIIllllIlIlIIIIll - this.IlIlIIIlIIlIlIIlllIl) / 2;
        final int n5 = (this.IlIllIlIlIIIlIlIlIII - this.IlllllllIIIlIIIlIlII) / 2;
        this.IlIlIlIlIlllllllllIl(n4, n5, 0, 0, this.IlIlIIIlIIlIlIIlllIl, this.IlllllllIIIlIIIlIlII);
        final int llllIIIIlIIIlIlllIll = this.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll(0);
        if (llllIIIIlIIIlIlllIll > 0) {
            int n6 = (int)(28.0f * (1.0f - llllIIIIlIIIlIlllIll / 400.0f));
            if (n6 > 0) {
                this.IlIlIlIlIlllllllllIl(n4 + 97, n5 + 16, 176, 0, 9, n6);
            }
            switch (llllIIIIlIIIlIlllIll / 2 % 7) {
                case 0: {
                    n6 = 29;
                    break;
                }
                case 1: {
                    n6 = 24;
                    break;
                }
                case 2: {
                    n6 = 20;
                    break;
                }
                case 3: {
                    n6 = 16;
                    break;
                }
                case 4: {
                    n6 = 11;
                    break;
                }
                case 5: {
                    n6 = 6;
                    break;
                }
                case 6: {
                    n6 = 0;
                    break;
                }
            }
            if (n6 > 0) {
                this.IlIlIlIlIlllllllllIl(n4 + 65, n5 + 14 + 29 - n6, 185, 29 - n6, 12, n6);
            }
        }
    }
}
