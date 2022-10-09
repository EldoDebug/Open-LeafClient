package net.minecraft.client.lIIIlllIIIllIIIllIII;

import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.llllIIIIlIIIlIlllIll.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import java.util.*;

public class IlIIIlIlIIIllIlIlIIl
{
    private final float[] llllIIIIlIIIlIlllIll;
    private final int[] IlIlIlIlIlllllllllIl;
    
    public IlIIIlIlIIIllIlIlIIl() {
        this(null);
    }
    
    public IlIIIlIlIIIllIlIlIIl(final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI) {
        this.llllIIIIlIIIlIlllIll = new float[4];
        this.IlIlIlIlIlllllllllIl = new int[4];
    }
    
    public void llllIIIIlIIIlIlllIll() {
        final int n = 240;
        final int[] ilIlIlIlIlllllllllIl = this.IlIlIlIlIlllllllllIl;
        final int n2 = 0;
        ilIlIlIlIlllllllllIl[n2] |= n;
        final int[] ilIlIlIlIlllllllllIl2 = this.IlIlIlIlIlllllllllIl;
        final int n3 = 1;
        ilIlIlIlIlllllllllIl2[n3] |= n;
        final int[] ilIlIlIlIlllllllllIl3 = this.IlIlIlIlIlllllllllIl;
        final int n4 = 2;
        ilIlIlIlIlllllllllIl3[n4] |= n;
        final int[] ilIlIlIlIlllllllllIl4 = this.IlIlIlIlIlllllllllIl;
        final int n5 = 3;
        ilIlIlIlIlllllllllIl4[n5] |= n;
        this.llllIIIIlIIIlIlllIll[0] = 1.0f;
        this.llllIIIIlIIIlIlllIll[1] = 1.0f;
        this.llllIIIIlIIIlIlllIll[2] = 1.0f;
        this.llllIIIIlIIIlIlllIll[3] = 1.0f;
    }
    
    public void llllIIIIlIIIlIlllIll(final lIlIlIIIllIIllIIIllI lIlIlIIIllIIllIIIllI, final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final lllIllIIIllllllIllll lllIllIIIllllllIllll, final float[] array, final BitSet set) {
        final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl2 = set.get(0) ? ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(lllIllIIIllllllIllll) : ilIlIlIlIlllllllllIl;
        final IlIlIIIllIllIIIIIllI llllIIIIlIIIlIlllIll2 = IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll(lllIllIIIllllllIllll);
        final IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll3 = ilIlIlIlIlllllllllIl2.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll2.llllIIIlIlllIlIIIIIl[0]);
        final IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll4 = ilIlIlIlIlllllllllIl2.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll2.llllIIIlIlllIlIIIIIl[1]);
        final IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll5 = ilIlIlIlIlllllllllIl2.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll2.llllIIIlIlllIlIIIIIl[2]);
        final IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll6 = ilIlIlIlIlllllllllIl2.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll2.llllIIIlIlllIlIIIIIl[3]);
        final int ilIlIlIlIlllllllllIl3 = llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(lIlIlIIIllIIllIIIllI, llllIIIIlIIIlIlllIll3);
        final int ilIlIlIlIlllllllllIl4 = llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(lIlIlIIIllIIllIIIllI, llllIIIIlIIIlIlllIll4);
        final int ilIlIlIlIlllllllllIl5 = llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(lIlIlIIIllIIllIIIllI, llllIIIIlIIIlIlllIll5);
        final int ilIlIlIlIlllllllllIl6 = llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(lIlIlIIIllIIllIIIllI, llllIIIIlIIIlIlllIll6);
        final float llllIIIIlIIIlIlllIll7 = llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll3).llIllIIIIIllIlIIIIlI().llllllIllIllIlIllllI());
        final float llllIIIIlIIIlIlllIll8 = llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll4).llIllIIIIIllIlIIIIlI().llllllIllIllIlIllllI());
        final float llllIIIIlIIIlIlllIll9 = llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll5).llIllIIIIIllIlIIIIlI().llllllIllIllIlIllllI());
        final float llllIIIIlIIIlIlllIll10 = llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll6).llIllIIIIIllIlIIIIlI().llllllIllIllIlIllllI());
        final boolean llIllIIIIIllIlIIIIlI = lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll3.llllIIIIlIIIlIlllIll(lllIllIIIllllllIllll)).llIllIIIIIllIlIIIIlI().llIllIIIIIllIlIIIIlI();
        final boolean llIllIIIIIllIlIIIIlI2 = lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll4.llllIIIIlIIIlIlllIll(lllIllIIIllllllIllll)).llIllIIIIIllIlIIIIlI().llIllIIIIIllIlIIIIlI();
        final boolean llIllIIIIIllIlIIIIlI3 = lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll5.llllIIIIlIIIlIlllIll(lllIllIIIllllllIllll)).llIllIIIIIllIlIIIIlI().llIllIIIIIllIlIIIIlI();
        final boolean llIllIIIIIllIlIIIIlI4 = lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll6.llllIIIIlIIIlIlllIll(lllIllIIIllllllIllll)).llIllIIIIIllIlIIIIlI().llIllIIIIIllIlIIIIlI();
        float llllIIIIlIIIlIlllIll11;
        int ilIlIlIlIlllllllllIl7;
        if (!llIllIIIIIllIlIIIIlI3 && !llIllIIIIIllIlIIIIlI) {
            llllIIIIlIIIlIlllIll11 = llllIIIIlIIIlIlllIll7;
            ilIlIlIlIlllllllllIl7 = ilIlIlIlIlllllllllIl3;
        }
        else {
            final IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll12 = llllIIIIlIIIlIlllIll3.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll2.llllIIIlIlllIlIIIIIl[2]);
            llllIIIIlIIIlIlllIll11 = net.minecraft.client.lIIIlllIIIllIIIllIII.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll12).llIllIIIIIllIlIIIIlI().llllllIllIllIlIllllI());
            ilIlIlIlIlllllllllIl7 = llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(lIlIlIIIllIIllIIIllI, llllIIIIlIIIlIlllIll12);
        }
        float llllIIIIlIIIlIlllIll13;
        int ilIlIlIlIlllllllllIl8;
        if (!llIllIIIIIllIlIIIIlI4 && !llIllIIIIIllIlIIIIlI) {
            llllIIIIlIIIlIlllIll13 = llllIIIIlIIIlIlllIll7;
            ilIlIlIlIlllllllllIl8 = ilIlIlIlIlllllllllIl3;
        }
        else {
            final IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll14 = llllIIIIlIIIlIlllIll3.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll2.llllIIIlIlllIlIIIIIl[3]);
            llllIIIIlIIIlIlllIll13 = net.minecraft.client.lIIIlllIIIllIIIllIII.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll14).llIllIIIIIllIlIIIIlI().llllllIllIllIlIllllI());
            ilIlIlIlIlllllllllIl8 = llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(lIlIlIIIllIIllIIIllI, llllIIIIlIIIlIlllIll14);
        }
        float llllIIIIlIIIlIlllIll15;
        int ilIlIlIlIlllllllllIl9;
        if (!llIllIIIIIllIlIIIIlI3 && !llIllIIIIIllIlIIIIlI2) {
            llllIIIIlIIIlIlllIll15 = llllIIIIlIIIlIlllIll8;
            ilIlIlIlIlllllllllIl9 = ilIlIlIlIlllllllllIl4;
        }
        else {
            final IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll16 = llllIIIIlIIIlIlllIll4.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll2.llllIIIlIlllIlIIIIIl[2]);
            llllIIIIlIIIlIlllIll15 = net.minecraft.client.lIIIlllIIIllIIIllIII.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll16).llIllIIIIIllIlIIIIlI().llllllIllIllIlIllllI());
            ilIlIlIlIlllllllllIl9 = llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(lIlIlIIIllIIllIIIllI, llllIIIIlIIIlIlllIll16);
        }
        float llllIIIIlIIIlIlllIll17;
        int ilIlIlIlIlllllllllIl10;
        if (!llIllIIIIIllIlIIIIlI4 && !llIllIIIIIllIlIIIIlI2) {
            llllIIIIlIIIlIlllIll17 = llllIIIIlIIIlIlllIll8;
            ilIlIlIlIlllllllllIl10 = ilIlIlIlIlllllllllIl4;
        }
        else {
            final IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll18 = llllIIIIlIIIlIlllIll4.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll2.llllIIIlIlllIlIIIIIl[3]);
            llllIIIIlIIIlIlllIll17 = net.minecraft.client.lIIIlllIIIllIIIllIII.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll18).llIllIIIIIllIlIIIIlI().llllllIllIllIlIllllI());
            ilIlIlIlIlllllllllIl10 = llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(lIlIlIIIllIIllIIIllI, llllIIIIlIIIlIlllIll18);
        }
        int n = llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(lIlIlIIIllIIllIIIllI, ilIlIlIlIlllllllllIl);
        if (set.get(0) || !lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(lllIllIIIllllllIllll)).llIllIIIIIllIlIIIIlI().llllIIllllIlIlIIIIll()) {
            n = llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(lIlIlIIIllIIllIIIllI, ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(lllIllIIIllllllIllll));
        }
        final float llllIIIIlIIIlIlllIll19 = net.minecraft.client.lIIIlllIIIllIIIllIII.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(set.get(0) ? lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl2).llIllIIIIIllIlIIIIlI().llllllIllIllIlIllllI() : lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl).llIllIIIIIllIlIIIIlI().llllllIllIllIlIllllI());
        final llllIIIlIlllIlIIIIIl llllIIIIlIIIlIlllIll20 = llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll(lllIllIIIllllllIllll);
        if (set.get(1) && llllIIIIlIIIlIlllIll2.lIIIlllIIIllIIIllIII) {
            final float n2 = (llllIIIIlIIIlIlllIll10 + llllIIIIlIIIlIlllIll7 + llllIIIIlIIIlIlllIll13 + llllIIIIlIIIlIlllIll19) * 0.25f;
            final float n3 = (llllIIIIlIIIlIlllIll9 + llllIIIIlIIIlIlllIll7 + llllIIIIlIIIlIlllIll11 + llllIIIIlIIIlIlllIll19) * 0.25f;
            final float n4 = (llllIIIIlIIIlIlllIll9 + llllIIIIlIIIlIlllIll8 + llllIIIIlIIIlIlllIll15 + llllIIIIlIIIlIlllIll19) * 0.25f;
            final float n5 = (llllIIIIlIIIlIlllIll10 + llllIIIIlIIIlIlllIll8 + llllIIIIlIIIlIlllIll17 + llllIIIIlIIIlIlllIll19) * 0.25f;
            final float n6 = array[llllIIIIlIIIlIlllIll2.llIIlIIIlIIIllIlIIIl[0].IlIlIIIllIIllIlllllI] * array[llllIIIIlIIIlIlllIll2.llIIlIIIlIIIllIlIIIl[1].IlIlIIIllIIllIlllllI];
            final float n7 = array[llllIIIIlIIIlIlllIll2.llIIlIIIlIIIllIlIIIl[2].IlIlIIIllIIllIlllllI] * array[llllIIIIlIIIlIlllIll2.llIIlIIIlIIIllIlIIIl[3].IlIlIIIllIIllIlllllI];
            final float n8 = array[llllIIIIlIIIlIlllIll2.llIIlIIIlIIIllIlIIIl[4].IlIlIIIllIIllIlllllI] * array[llllIIIIlIIIlIlllIll2.llIIlIIIlIIIllIlIIIl[5].IlIlIIIllIIllIlllllI];
            final float n9 = array[llllIIIIlIIIlIlllIll2.llIIlIIIlIIIllIlIIIl[6].IlIlIIIllIIllIlllllI] * array[llllIIIIlIIIlIlllIll2.llIIlIIIlIIIllIlIIIl[7].IlIlIIIllIIllIlllllI];
            final float n10 = array[llllIIIIlIIIlIlllIll2.llIllIlIIIIllIlIIllI[0].IlIlIIIllIIllIlllllI] * array[llllIIIIlIIIlIlllIll2.llIllIlIIIIllIlIIllI[1].IlIlIIIllIIllIlllllI];
            final float n11 = array[llllIIIIlIIIlIlllIll2.llIllIlIIIIllIlIIllI[2].IlIlIIIllIIllIlllllI] * array[llllIIIIlIIIlIlllIll2.llIllIlIIIIllIlIIllI[3].IlIlIIIllIIllIlllllI];
            final float n12 = array[llllIIIIlIIIlIlllIll2.llIllIlIIIIllIlIIllI[4].IlIlIIIllIIllIlllllI] * array[llllIIIIlIIIlIlllIll2.llIllIlIIIIllIlIIllI[5].IlIlIIIllIIllIlllllI];
            final float n13 = array[llllIIIIlIIIlIlllIll2.llIllIlIIIIllIlIIllI[6].IlIlIIIllIIllIlllllI] * array[llllIIIIlIIIlIlllIll2.llIllIlIIIIllIlIIllI[7].IlIlIIIllIIllIlllllI];
            final float n14 = array[llllIIIIlIIIlIlllIll2.lIlIlIIIllIIllIIIllI[0].IlIlIIIllIIllIlllllI] * array[llllIIIIlIIIlIlllIll2.lIlIlIIIllIIllIIIllI[1].IlIlIIIllIIllIlllllI];
            final float n15 = array[llllIIIIlIIIlIlllIll2.lIlIlIIIllIIllIIIllI[2].IlIlIIIllIIllIlllllI] * array[llllIIIIlIIIlIlllIll2.lIlIlIIIllIIllIIIllI[3].IlIlIIIllIIllIlllllI];
            final float n16 = array[llllIIIIlIIIlIlllIll2.lIlIlIIIllIIllIIIllI[4].IlIlIIIllIIllIlllllI] * array[llllIIIIlIIIlIlllIll2.lIlIlIIIllIIllIIIllI[5].IlIlIIIllIIllIlllllI];
            final float n17 = array[llllIIIIlIIIlIlllIll2.lIlIlIIIllIIllIIIllI[6].IlIlIIIllIIllIlllllI] * array[llllIIIIlIIIlIlllIll2.lIlIlIIIllIIllIIIllI[7].IlIlIIIllIIllIlllllI];
            final float n18 = array[llllIIIIlIIIlIlllIll2.IlIlIIIllIIllIlllllI[0].IlIlIIIllIIllIlllllI] * array[llllIIIIlIIIlIlllIll2.IlIlIIIllIIllIlllllI[1].IlIlIIIllIIllIlllllI];
            final float n19 = array[llllIIIIlIIIlIlllIll2.IlIlIIIllIIllIlllllI[2].IlIlIIIllIIllIlllllI] * array[llllIIIIlIIIlIlllIll2.IlIlIIIllIIllIlllllI[3].IlIlIIIllIIllIlllllI];
            final float n20 = array[llllIIIIlIIIlIlllIll2.IlIlIIIllIIllIlllllI[4].IlIlIIIllIIllIlllllI] * array[llllIIIIlIIIlIlllIll2.IlIlIIIllIIllIlllllI[5].IlIlIIIllIIllIlllllI];
            final float n21 = array[llllIIIIlIIIlIlllIll2.IlIlIIIllIIllIlllllI[6].IlIlIIIllIIllIlllllI] * array[llllIIIIlIIIlIlllIll2.IlIlIIIllIIllIlllllI[7].IlIlIIIllIIllIlllllI];
            this.llllIIIIlIIIlIlllIll[llllIIIIlIIIlIlllIll20.llllIIIlIlllIlIIIIIl] = n2 * n6 + n3 * n7 + n4 * n8 + n5 * n9;
            this.llllIIIIlIIIlIlllIll[llllIIIIlIIIlIlllIll20.lIIIIlIIIIIlllIllIII] = n2 * n10 + n3 * n11 + n4 * n12 + n5 * n13;
            this.llllIIIIlIIIlIlllIll[llllIIIIlIIIlIlllIll20.lIIIlllIIIllIIIllIII] = n2 * n14 + n3 * n15 + n4 * n16 + n5 * n17;
            this.llllIIIIlIIIlIlllIll[llllIIIIlIIIlIlllIll20.llIIlIIIlIIIllIlIIIl] = n2 * n18 + n3 * n19 + n4 * n20 + n5 * n21;
            final int llllIIIIlIIIlIlllIll21 = this.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl6, ilIlIlIlIlllllllllIl3, ilIlIlIlIlllllllllIl8, n);
            final int llllIIIIlIIIlIlllIll22 = this.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl5, ilIlIlIlIlllllllllIl3, ilIlIlIlIlllllllllIl7, n);
            final int llllIIIIlIIIlIlllIll23 = this.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl5, ilIlIlIlIlllllllllIl4, ilIlIlIlIlllllllllIl9, n);
            final int llllIIIIlIIIlIlllIll24 = this.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl6, ilIlIlIlIlllllllllIl4, ilIlIlIlIlllllllllIl10, n);
            this.IlIlIlIlIlllllllllIl[llllIIIIlIIIlIlllIll20.llllIIIlIlllIlIIIIIl] = this.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll21, llllIIIIlIIIlIlllIll22, llllIIIIlIIIlIlllIll23, llllIIIIlIIIlIlllIll24, n6, n7, n8, n9);
            this.IlIlIlIlIlllllllllIl[llllIIIIlIIIlIlllIll20.lIIIIlIIIIIlllIllIII] = this.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll21, llllIIIIlIIIlIlllIll22, llllIIIIlIIIlIlllIll23, llllIIIIlIIIlIlllIll24, n10, n11, n12, n13);
            this.IlIlIlIlIlllllllllIl[llllIIIIlIIIlIlllIll20.lIIIlllIIIllIIIllIII] = this.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll21, llllIIIIlIIIlIlllIll22, llllIIIIlIIIlIlllIll23, llllIIIIlIIIlIlllIll24, n14, n15, n16, n17);
            this.IlIlIlIlIlllllllllIl[llllIIIIlIIIlIlllIll20.llIIlIIIlIIIllIlIIIl] = this.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll21, llllIIIIlIIIlIlllIll22, llllIIIIlIIIlIlllIll23, llllIIIIlIIIlIlllIll24, n18, n19, n20, n21);
        }
        else {
            final float n22 = (llllIIIIlIIIlIlllIll10 + llllIIIIlIIIlIlllIll7 + llllIIIIlIIIlIlllIll13 + llllIIIIlIIIlIlllIll19) * 0.25f;
            final float n23 = (llllIIIIlIIIlIlllIll9 + llllIIIIlIIIlIlllIll7 + llllIIIIlIIIlIlllIll11 + llllIIIIlIIIlIlllIll19) * 0.25f;
            final float n24 = (llllIIIIlIIIlIlllIll9 + llllIIIIlIIIlIlllIll8 + llllIIIIlIIIlIlllIll15 + llllIIIIlIIIlIlllIll19) * 0.25f;
            final float n25 = (llllIIIIlIIIlIlllIll10 + llllIIIIlIIIlIlllIll8 + llllIIIIlIIIlIlllIll17 + llllIIIIlIIIlIlllIll19) * 0.25f;
            this.IlIlIlIlIlllllllllIl[llllIIIIlIIIlIlllIll20.llllIIIlIlllIlIIIIIl] = this.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl6, ilIlIlIlIlllllllllIl3, ilIlIlIlIlllllllllIl8, n);
            this.IlIlIlIlIlllllllllIl[llllIIIIlIIIlIlllIll20.lIIIIlIIIIIlllIllIII] = this.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl5, ilIlIlIlIlllllllllIl3, ilIlIlIlIlllllllllIl7, n);
            this.IlIlIlIlIlllllllllIl[llllIIIIlIIIlIlllIll20.lIIIlllIIIllIIIllIII] = this.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl5, ilIlIlIlIlllllllllIl4, ilIlIlIlIlllllllllIl9, n);
            this.IlIlIlIlIlllllllllIl[llllIIIIlIIIlIlllIll20.llIIlIIIlIIIllIlIIIl] = this.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl6, ilIlIlIlIlllllllllIl4, ilIlIlIlIlllllllllIl10, n);
            this.llllIIIIlIIIlIlllIll[llllIIIIlIIIlIlllIll20.llllIIIlIlllIlIIIIIl] = n22;
            this.llllIIIIlIIIlIlllIll[llllIIIIlIIIlIlllIll20.lIIIIlIIIIIlllIllIII] = n23;
            this.llllIIIIlIIIlIlllIll[llllIIIIlIIIlIlllIll20.lIIIlllIIIllIIIllIII] = n24;
            this.llllIIIIlIIIlIlllIll[llllIIIIlIIIlIlllIll20.llIIlIIIlIIIllIlIIIl] = n25;
        }
    }
    
    private int llllIIIIlIIIlIlllIll(int n, int n2, int n3, final int n4) {
        if (n == 0) {
            n = n4;
        }
        if (n2 == 0) {
            n2 = n4;
        }
        if (n3 == 0) {
            n3 = n4;
        }
        return n + n2 + n3 + n4 >> 2 & 0xFF00FF;
    }
    
    private int llllIIIIlIIIlIlllIll(final int n, final int n2, final int n3, final int n4, final float n5, final float n6, final float n7, final float n8) {
        return ((int)((n >> 16 & 0xFF) * n5 + (n2 >> 16 & 0xFF) * n6 + (n3 >> 16 & 0xFF) * n7 + (n4 >> 16 & 0xFF) * n8) & 0xFF) << 16 | ((int)((n & 0xFF) * n5 + (n2 & 0xFF) * n6 + (n3 & 0xFF) * n7 + (n4 & 0xFF) * n8) & 0xFF);
    }
}
