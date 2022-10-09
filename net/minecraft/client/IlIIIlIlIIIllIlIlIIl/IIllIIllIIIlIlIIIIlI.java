package net.minecraft.client.IlIIIlIlIIIllIlIlIIl;

import net.minecraft.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIIIllIllIIIIIllI.*;
import net.minecraft.client.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;

public class IIllIIllIIIlIlIIIIlI extends IlIIIlIlIIIllIlIlIIl
{
    private IIlIIIIIllIlIIIlIIll llllIIIIlIIIlIlllIll;
    private IIlIIIIIllIlIIIlIIll IlIlIlIlIlllllllllIl;
    private IIlIIIIIllIlIIIlIIll[] llIllIIIIIllIlIIIIlI;
    private IIlIIIIIllIlIIIlIIll[] IlIIIlIlIIIllIlIlIIl;
    
    public IIllIIllIIIlIlIIIIlI() {
        this.lIIIlllIIIllIIIllIII = 64;
        this.llIIlIIIlIIIllIlIIIl = 64;
        this.llIllIIIIIllIlIIIIlI = new IIlIIIIIllIlIIIlIIll[12];
        this.llllIIIIlIIIlIlllIll = new IIlIIIIIllIlIIIlIIll(this);
        this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(0, 0).llllIIIIlIIIlIlllIll(-6.0f, 10.0f, -8.0f, 12, 12, 16);
        this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(0, 28).llllIIIIlIIIlIlllIll(-8.0f, 10.0f, -6.0f, 2, 12, 12);
        this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(0, 28).llllIIIIlIIIlIlllIll(6.0f, 10.0f, -6.0f, 2, 12, 12, true);
        this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(16, 40).llllIIIIlIIIlIlllIll(-6.0f, 8.0f, -6.0f, 12, 2, 12);
        this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(16, 40).llllIIIIlIIIlIlllIll(-6.0f, 22.0f, -6.0f, 12, 2, 12);
        for (int i = 0; i < this.llIllIIIIIllIlIIIIlI.length; ++i) {
            (this.llIllIIIIIllIlIIIIlI[i] = new IIlIIIIIllIlIIIlIIll(this, 0, 0)).llllIIIIlIIIlIlllIll(-1.0f, -4.5f, -1.0f, 2, 9, 2);
            this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(this.llIllIIIIIllIlIIIIlI[i]);
        }
        (this.IlIlIlIlIlllllllllIl = new IIlIIIIIllIlIIIlIIll(this, 8, 0)).llllIIIIlIIIlIlllIll(-1.0f, 15.0f, 0.0f, 2, 2, 1);
        this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(this.IlIlIlIlIlllllllllIl);
        this.IlIIIlIlIIIllIlIlIIl = new IIlIIIIIllIlIIIlIIll[3];
        (this.IlIIIlIlIIIllIlIlIIl[0] = new IIlIIIIIllIlIIIlIIll(this, 40, 0)).llllIIIIlIIIlIlllIll(-2.0f, 14.0f, 7.0f, 4, 4, 8);
        (this.IlIIIlIlIIIllIlIlIIl[1] = new IIlIIIIIllIlIIIlIIll(this, 0, 54)).llllIIIIlIIIlIlllIll(0.0f, 14.0f, 0.0f, 3, 3, 7);
        this.IlIIIlIlIIIllIlIlIIl[2] = new IIlIIIIIllIlIIIlIIll(this);
        this.IlIIIlIlIIIllIlIlIIl[2].llllIIIIlIIIlIlllIll(41, 32).llllIIIIlIIIlIlllIll(0.0f, 14.0f, 0.0f, 2, 2, 6);
        this.IlIIIlIlIIIllIlIlIIl[2].llllIIIIlIIIlIlllIll(25, 19).llllIIIIlIIIlIlllIll(1.0f, 10.5f, 3.0f, 1, 9, 9);
        this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(this.IlIIIlIlIIIllIlIlIIl[0]);
        this.IlIIIlIlIIIllIlIlIIl[0].llllIIIIlIIIlIlllIll(this.IlIIIlIlIIIllIlIlIIl[1]);
        this.IlIIIlIlIIIllIlIlIIl[1].llllIIIIlIIIlIlllIll(this.IlIIIlIlIIIllIlIlIIl[2]);
    }
    
    public int llllIIIIlIIIlIlllIll() {
        return 54;
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI, final float n, final float n2, final float n3, final float n4, final float n5, final float n6) {
        this.llllIIIIlIIIlIlllIll(n, n2, n3, n4, n5, n6, llIllIIIIIllIlIIIIlI);
        this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(n6);
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final float n, final float n2, final float n3, final float n4, final float n5, final float n6, final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI) {
        final lllIIIIlllllIlIIllIl lllIIIIlllllIlIIllIl = (lllIIIIlllllIlIIllIl)llIllIIIIIllIlIIIIlI;
        final float n7 = n3 - lllIIIIlllllIlIIllIl.lllllIIIIIlIlIIIIIIl;
        this.llllIIIIlIIIlIlllIll.llllIIIlIlllIlIIIIIl = n4 / 57.295776f;
        this.llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl = n5 / 57.295776f;
        final float[] array = { 1.75f, 0.25f, 0.0f, 0.0f, 0.5f, 0.5f, 0.5f, 0.5f, 1.25f, 0.75f, 0.0f, 0.0f };
        final float[] array2 = { 0.0f, 0.0f, 0.0f, 0.0f, 0.25f, 1.75f, 1.25f, 0.75f, 0.0f, 0.0f, 0.0f, 0.0f };
        final float[] array3 = { 0.0f, 0.0f, 0.25f, 1.75f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.75f, 1.25f };
        final float[] array4 = { 0.0f, 0.0f, 8.0f, -8.0f, -8.0f, 8.0f, 8.0f, -8.0f, 0.0f, 0.0f, 8.0f, -8.0f };
        final float[] array5 = { -8.0f, -8.0f, -8.0f, -8.0f, 0.0f, 0.0f, 0.0f, 0.0f, 8.0f, 8.0f, 8.0f, 8.0f };
        final float[] array6 = { 8.0f, -8.0f, 0.0f, 0.0f, -8.0f, -8.0f, 8.0f, 8.0f, 8.0f, -8.0f, 0.0f, 0.0f };
        final float n8 = (1.0f - lllIIIIlllllIlIIllIl.llllIIllllIlIlIIIIll(n7)) * 0.55f;
        for (int i = 0; i < 12; ++i) {
            this.llIllIIIIIllIlIIIIlI[i].IllIIlllIIIIlllIIlIl = 3.1415927f * array[i];
            this.llIllIIIIIllIlIIIIlI[i].llllIIIlIlllIlIIIIIl = 3.1415927f * array2[i];
            this.llIllIIIIIllIlIIIIlI[i].lIIIIlIIIIIlllIllIII = 3.1415927f * array3[i];
            this.llIllIIIIIllIlIIIIlI[i].llIllIIIIIllIlIIIIlI = array4[i] * (1.0f + llIllIIlllllllllllll.IlIlIlIlIlllllllllIl(n3 * 1.5f + i) * 0.01f - n8);
            this.llIllIIIIIllIlIIIIlI[i].IlIIIlIlIIIllIlIlIIl = 16.0f + array5[i] * (1.0f + llIllIIlllllllllllll.IlIlIlIlIlllllllllIl(n3 * 1.5f + i) * 0.01f - n8);
            this.llIllIIIIIllIlIIIIlI[i].IlIlIIIllIllIIIIIllI = array6[i] * (1.0f + llIllIIlllllllllllll.IlIlIlIlIlllllllllIl(n3 * 1.5f + i) * 0.01f - n8);
        }
        this.IlIlIlIlIlllllllllIl.IlIlIIIllIllIIIIIllI = -8.25f;
        llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI2 = Minecraft.getMinecraft().lIIIIlIlIllllIIlIllI();
        if (lllIIIIlllllIlIIllIl.ar()) {
            llIllIIIIIllIlIIIIlI2 = lllIIIIlllllIlIIllIl.as();
        }
        if (llIllIIIIIllIlIIIIlI2 != null) {
            final e llllIIIlIlllIlIIIIIl = llIllIIIIIllIlIIIIlI2.llllIIIlIlllIlIIIIIl(0.0f);
            final e llllIIIlIlllIlIIIIIl2 = llIllIIIIIllIlIIIIlI.llllIIIlIlllIlIIIIIl(0.0f);
            if (llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl - llllIIIlIlllIlIIIIIl2.IlIlIlIlIlllllllllIl > 0.0) {
                this.IlIlIlIlIlllllllllIl.IlIIIlIlIIIllIlIlIIl = 0.0f;
            }
            else {
                this.IlIlIlIlIlllllllllIl.IlIIIlIlIIIllIlIlIIl = 1.0f;
            }
            final e llllIIIIlIIIlIlllIll = llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(0.0f);
            final double ilIlIlIlIlllllllllIl = new e(llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll, 0.0, llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI).IlIlIlIlIlllllllllIl(new e(llllIIIlIlllIlIIIIIl2.llllIIIIlIIIlIlllIll - llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll, 0.0, llllIIIlIlllIlIIIIIl2.llIllIIIIIllIlIIIIlI - llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI).llllIIIIlIIIlIlllIll().IlIlIlIlIlllllllllIl(1.5707964f));
            this.IlIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI = llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI((float)Math.abs(ilIlIlIlIlllllllllIl)) * 2.0f * (float)Math.signum(ilIlIlIlIlllllllllIl);
        }
        this.IlIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl = true;
        final float ilIIIlIlIIIllIlIlIIl = lllIIIIlllllIlIIllIl.IlIIIlIlIIIllIlIlIIl(n7);
        this.IlIIIlIlIIIllIlIlIIl[0].llllIIIlIlllIlIIIIIl = llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(ilIIIlIlIIIllIlIlIIl) * 3.1415927f * 0.05f;
        this.IlIIIlIlIIIllIlIlIIl[1].llllIIIlIlllIlIIIIIl = llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(ilIIIlIlIIIllIlIlIIl) * 3.1415927f * 0.1f;
        this.IlIIIlIlIIIllIlIlIIl[1].llIllIIIIIllIlIIIIlI = -1.5f;
        this.IlIIIlIlIIIllIlIlIIl[1].IlIIIlIlIIIllIlIlIIl = 0.5f;
        this.IlIIIlIlIIIllIlIlIIl[1].IlIlIIIllIllIIIIIllI = 14.0f;
        this.IlIIIlIlIIIllIlIlIIl[2].llllIIIlIlllIlIIIIIl = llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(ilIIIlIlIIIllIlIlIIl) * 3.1415927f * 0.15f;
        this.IlIIIlIlIIIllIlIlIIl[2].llIllIIIIIllIlIIIIlI = 0.5f;
        this.IlIIIlIlIIIllIlIlIIl[2].IlIIIlIlIIIllIlIlIIl = 0.5f;
        this.IlIIIlIlIIIllIlIlIIl[2].IlIlIIIllIllIIIIIllI = 6.0f;
    }
}
