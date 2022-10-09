package net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIlIlllIlIIIIIl;

import com.google.common.collect.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.llIllIlIIIIllIlIIllI.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl.*;
import net.minecraft.lIlIlIIIllIIllIIIllI.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.IlIlIIIllIIllIlllllI.*;
import java.util.*;

public class IllIIlllIIIIlllIIlIl extends llllllIllIllIlIllllI
{
    public int IlIlIlIlIlllllllllIl;
    public int llIllIIIIIllIlIIIIlI;
    public byte IlIIIlIlIIIllIlIlIIl;
    public byte IlIlIIIllIllIIIIIllI;
    public byte[] IllIIlllIIIIlllIIlIl;
    public List llllIIIlIlllIlIIIIIl;
    private Map lIIIlllIIIllIIIllIII;
    public Map lIIIIlIIIIIlllIllIII;
    
    public IllIIlllIIIIlllIIlIl(final String s) {
        super(s);
        this.IllIIlllIIIIlllIIlIl = new byte[16384];
        this.llllIIIlIlllIlIIIIIl = Lists.newArrayList();
        this.lIIIlllIIIllIIIllIII = Maps.newHashMap();
        this.lIIIIlIIIIIlllIllIII = Maps.newLinkedHashMap();
    }
    
    public void llllIIIIlIIIlIlllIll(final double n, final double n2, final int n3) {
        final int n4 = 128 * (1 << n3);
        final int llIllIIIIIllIlIIIIlI = llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI((n + 64.0) / n4);
        final int llIllIIIIIllIlIIIIlI2 = llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI((n2 + 64.0) / n4);
        this.IlIlIlIlIlllllllllIl = llIllIIIIIllIlIIIIlI * n4 + n4 / 2 - 64;
        this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI2 * n4 + n4 / 2 - 64;
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll) {
        this.IlIIIlIlIIIllIlIlIIl = iiiIlllIIIIIIlIIIlll.IlIIIlIlIIIllIlIlIIl("dimension");
        this.IlIlIlIlIlllllllllIl = iiiIlllIIIIIIlIIIlll.IllIIlllIIIIlllIIlIl("xCenter");
        this.llIllIIIIIllIlIIIIlI = iiiIlllIIIIIIlIIIlll.IllIIlllIIIIlllIIlIl("zCenter");
        this.IlIlIIIllIllIIIIIllI = iiiIlllIIIIIIlIIIlll.IlIIIlIlIIIllIlIlIIl("scale");
        this.IlIlIIIllIllIIIIIllI = (byte)llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(this.IlIlIIIllIllIIIIIllI, 0, 4);
        final short ilIlIIIllIllIIIIIllI = iiiIlllIIIIIIlIIIlll.IlIlIIIllIllIIIIIllI("width");
        final short ilIlIIIllIllIIIIIllI2 = iiiIlllIIIIIIlIIIlll.IlIlIIIllIllIIIIIllI("height");
        if (ilIlIIIllIllIIIIIllI == 128 && ilIlIIIllIllIIIIIllI2 == 128) {
            this.IllIIlllIIIIlllIIlIl = iiiIlllIIIIIIlIIIlll.llIllIlIIIIllIlIIllI("colors");
        }
        else {
            final byte[] llIllIlIIIIllIlIIllI = iiiIlllIIIIIIlIIIlll.llIllIlIIIIllIlIIllI("colors");
            this.IllIIlllIIIIlllIIlIl = new byte[16384];
            final int n = (128 - ilIlIIIllIllIIIIIllI) / 2;
            final int n2 = (128 - ilIlIIIllIllIIIIIllI2) / 2;
            for (short n3 = 0; n3 < ilIlIIIllIllIIIIIllI2; ++n3) {
                final int n4 = n3 + n2;
                if (n4 >= 0 || n4 < 128) {
                    for (short n5 = 0; n5 < ilIlIIIllIllIIIIIllI; ++n5) {
                        final int n6 = n5 + n;
                        if (n6 >= 0 || n6 < 128) {
                            this.IllIIlllIIIIlllIIlIl[n6 + n4 * 128] = llIllIlIIIIllIlIIllI[n5 + n3 * ilIlIIIllIllIIIIIllI];
                        }
                    }
                }
            }
        }
    }
    
    @Override
    public void llIllIIIIIllIlIIIIlI(final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll) {
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("dimension", this.IlIIIlIlIIIllIlIlIIl);
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("xCenter", this.IlIlIlIlIlllllllllIl);
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("zCenter", this.llIllIIIIIllIlIIIIlI);
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("scale", this.IlIlIIIllIllIIIIIllI);
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("width", (short)128);
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("height", (short)128);
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("colors", this.IllIIlllIIIIlllIIlIl);
    }
    
    public void llllIIIIlIIIlIlllIll(final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl) {
        if (!this.lIIIlllIIIllIIIllIII.containsKey(llllIIIIlIIIlIlllIll)) {
            final llllIIIlIlllIlIIIIIl llllIIIlIlllIlIIIIIl = new llllIIIlIlllIlIIIIIl(this, llllIIIIlIIIlIlllIll);
            this.lIIIlllIIIllIIIllIII.put(llllIIIIlIIIlIlllIll, llllIIIlIlllIlIIIIIl);
            this.llllIIIlIlllIlIIIIIl.add(llllIIIlIlllIlIIIIIl);
        }
        if (!llllIIIIlIIIlIlllIll.lIlIlIIIllIIllIIIllI.llIllIIIIIllIlIIIIlI(lllIIIIlIlIllIIlIIIl)) {
            this.lIIIIlIIIIIlllIllIII.remove(llllIIIIlIIIlIlllIll.s_());
        }
        for (int i = 0; i < this.llllIIIlIlllIlIIIIIl.size(); ++i) {
            final llllIIIlIlllIlIIIIIl llllIIIlIlllIlIIIIIl2 = this.llllIIIlIlllIlIIIIIl.get(i);
            if (!llllIIIlIlllIlIIIIIl2.llllIIIIlIIIlIlllIll.IIlIlIlIIlIllIIIIIIl && (llllIIIlIlllIlIIIIIl2.llllIIIIlIIIlIlllIll.lIlIlIIIllIIllIIIllI.llIllIIIIIllIlIIIIlI(lllIIIIlIlIllIIlIIIl) || lllIIIIlIlIllIIlIIIl.IIIlIIlIIIIlllIlllII())) {
                if (!lllIIIIlIlIllIIlIIIl.IIIlIIlIIIIlllIlllII() && llllIIIlIlllIlIIIIIl2.llllIIIIlIIIlIlllIll.lllllIIIIIlIIlllIlIl == this.IlIIIlIlIIIllIlIlIIl) {
                    this.llllIIIIlIIIlIlllIll(0, llllIIIlIlllIlIIIIIl2.llllIIIIlIIIlIlllIll.IlllllllIIIlIIIlIlII, llllIIIlIlllIlIIIIIl2.llllIIIIlIIIlIlllIll.s_(), llllIIIlIlllIlIIIIIl2.llllIIIIlIIIlIlllIll.IIlllIlIIllIlIlIlIIl, llllIIIlIlllIlIIIIIl2.llllIIIIlIIIlIlllIll.lllllIlIIIlIlIIlllII, llllIIIlIlllIlIIIIIl2.llllIIIIlIIIlIlllIll.IIlIIIIIllIlIIIlIIll);
                }
            }
            else {
                this.lIIIlllIIIllIIIllIII.remove(llllIIIlIlllIlIIIIIl2.llllIIIIlIIIlIlllIll);
                this.llllIIIlIlllIlIIIIIl.remove(llllIIIlIlllIlIIIIIl2);
            }
        }
        if (lllIIIIlIlIllIIlIIIl.IIIlIIlIIIIlllIlllII()) {
            final llIIlIIIlIIIllIlIIIl ilIlIllllllllIIIIlII = lllIIIIlIlIllIIlIIIl.IlIlIllllllllIIIIlII();
            final IlIlIlIlIlllllllllIl lIlIlIIIllIIllIIIllI = ilIlIllllllllIIIIlII.lIlIlIIIllIIllIIIllI();
            this.llllIIIIlIIIlIlllIll(1, llllIIIIlIIIlIlllIll.IlllllllIIIlIIIlIlII, "frame-" + ilIlIllllllllIIIIlII.IlllIIIIlIIIlIlIlIIl(), lIlIlIIIllIIllIIIllI.lIIIIlIIIIIlllIllIII(), lIlIlIIIllIIllIIIllI.llIIlIIIlIIIllIlIIIl(), ilIlIllllllllIIIIlII.IlIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI() * 90);
        }
        if (lllIIIIlIlIllIIlIIIl.IIIIlllIIIIIIlIIIlll() && lllIIIIlIlIllIIlIIIl.llllIIllllIlIlIIIIll().IlIlIlIlIlllllllllIl("Decorations", 9)) {
            final IlIlIIIlIIlIlIIlllIl llIllIIIIIllIlIIIIlI = lllIIIIlIlIllIIlIIIl.llllIIllllIlIlIIIIll().llIllIIIIIllIlIIIIlI("Decorations", 10);
            for (int j = 0; j < llIllIIIIIllIlIIIIlI.IlIlIIIllIllIIIIIllI(); ++j) {
                final IIIIlllIIIIIIlIIIlll ilIlIlIlIlllllllllIl = llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(j);
                if (!this.lIIIIlIIIIIlllIllIII.containsKey(ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl("id"))) {
                    this.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl.IlIIIlIlIIIllIlIlIIl("type"), llllIIIIlIIIlIlllIll.IlllllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl("id"), ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII("x"), ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII("z"), ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII("rot"));
                }
            }
        }
    }
    
    private void llllIIIIlIIIlIlllIll(int n, final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final String s, final double n2, final double n3, double n4) {
        final int n5 = 1 << this.IlIlIIIllIllIIIIIllI;
        final float n6 = (float)(n2 - this.IlIlIlIlIlllllllllIl) / n5;
        final float n7 = (float)(n3 - this.llIllIIIIIllIlIIIIlI) / n5;
        byte b = (byte)(n6 * 2.0f + 0.5);
        byte b2 = (byte)(n7 * 2.0f + 0.5);
        final int n8 = 63;
        byte b3;
        if (n6 >= -n8 && n7 >= -n8 && n6 <= n8 && n7 <= n8) {
            n4 += ((n4 < 0.0) ? -8.0 : 8.0);
            b3 = (byte)(n4 * 16.0 / 360.0);
            if (this.IlIIIlIlIIIllIlIlIIl < 0) {
                final int n9 = (int)(illlllllIIIlIIIlIlII.lIllllllIIllIlIlIlII().llllIIIlIlllIlIIIIIl() / 10L);
                b3 = (byte)(n9 * n9 * 34187121 + n9 * 121 >> 15 & 0xF);
            }
        }
        else {
            if (Math.abs(n6) >= 320.0f || Math.abs(n7) >= 320.0f) {
                this.lIIIIlIIIIIlllIllIII.remove(s);
                return;
            }
            n = 6;
            b3 = 0;
            if (n6 <= -n8) {
                b = (byte)(n8 * 2 + 2.5);
            }
            if (n7 <= -n8) {
                b2 = (byte)(n8 * 2 + 2.5);
            }
            if (n6 >= n8) {
                b = (byte)(n8 * 2 + 1);
            }
            if (n7 >= n8) {
                b2 = (byte)(n8 * 2 + 1);
            }
        }
        this.lIIIIlIIIIIlllIllIII.put(s, new g((byte)n, b, b2, b3));
    }
    
    public IIlIIIIIllIlIIIlIIll llllIIIIlIIIlIlllIll(final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl, final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        final llllIIIlIlllIlIIIIIl llllIIIlIlllIlIIIIIl = this.lIIIlllIIIllIIIllIII.get(llllIIIIlIIIlIlllIll);
        return (llllIIIlIlllIlIIIIIl == null) ? null : llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll(lllIIIIlIlIllIIlIIIl);
    }
    
    public void llllIIIIlIIIlIlllIll(final int n, final int n2) {
        super.IlIIIlIlIIIllIlIlIIl();
        final Iterator<llllIIIlIlllIlIIIIIl> iterator = this.llllIIIlIlllIlIIIIIl.iterator();
        while (iterator.hasNext()) {
            iterator.next().llllIIIIlIIIlIlllIll(n, n2);
        }
    }
    
    public llllIIIlIlllIlIIIIIl llllIIIIlIIIlIlllIll(final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        llllIIIlIlllIlIIIIIl llllIIIlIlllIlIIIIIl = this.lIIIlllIIIllIIIllIII.get(llllIIIIlIIIlIlllIll);
        if (llllIIIlIlllIlIIIIIl == null) {
            llllIIIlIlllIlIIIIIl = new llllIIIlIlllIlIIIIIl(this, llllIIIIlIIIlIlllIll);
            this.lIIIlllIIIllIIIllIII.put(llllIIIIlIIIlIlllIll, llllIIIlIlllIlIIIIIl);
            this.llllIIIlIlllIlIIIIIl.add(llllIIIlIlllIlIIIIIl);
        }
        return llllIIIlIlllIlIIIIIl;
    }
}
