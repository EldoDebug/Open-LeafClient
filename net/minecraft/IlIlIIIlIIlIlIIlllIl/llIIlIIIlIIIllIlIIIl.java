package net.minecraft.IlIlIIIlIIlIlIIlllIl;

import com.google.common.collect.*;
import net.minecraft.llllIIllllIlIlIIIIll.*;
import net.minecraft.llIllIlIIIIllIlIIllI.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.IllIIlllIIIIlllIIlIl.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.llllIIIIlIIIlIlllIll.*;
import java.util.*;
import net.minecraft.IIIlIIIlIlIIlllIIlll.*;
import net.minecraft.IlIlIIIllIIllIlllllI.*;
import net.minecraft.lIlIlIIIllIIllIIIllI.*;
import net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl.*;
import net.minecraft.lIIIlllIIIllIIIllIII.*;
import net.minecraft.llIIlIIIlIIIllIlIIIl.*;

public class llIIlIIIlIIIllIlIIIl extends IlIlIllllllllIIIIlII implements llIIIllIlIllIllIIIIl, llIIIlIlIllIIlIlIlII
{
    public static final llllIIIIlIIIlIlllIll[][] IlIlIIIllIllIIIIIllI;
    private final List IllIIlllIIIIlllIIlIl;
    private long llllIIIlIlllIlIIIIIl;
    private float lIIIIlIIIIIlllIllIII;
    private boolean lIIIlllIIIllIIIllIII;
    private int llIIlIIIlIIIllIlIIIl;
    private int llIllIlIIIIllIlIIllI;
    private int lIlIlIIIllIIllIIIllI;
    private lllIIIIlIlIllIIlIIIl IlIlIIIllIIllIlllllI;
    private String IIIIlllIIIIIIlIIIlll;
    
    static {
        IlIlIIIllIllIIIIIllI = new llllIIIIlIIIlIlllIll[][] { { llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI, llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI }, { llllIIIIlIIIlIlllIll.IlIlIIIllIIllIlllllI, llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl }, { llllIIIIlIIIlIlllIll.llllIIIlIlllIlIIIIIl }, { llllIIIIlIIIlIlllIll.lIlIlIIIllIIllIIIllI } };
    }
    
    public llIIlIIIlIIIllIlIIIl() {
        this.IllIIlllIIIIlllIIlIl = Lists.newArrayList();
        this.llIIlIIIlIIIllIlIIIl = -1;
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll() {
        if (this.llllIIIIlIIIlIlllIll.IIIlIIlIIIIlllIlllII() % 80L == 0L) {
            this.IIIlIIIlIlIIlllIIlll();
        }
    }
    
    public void IIIlIIIlIlIIlllIIlll() {
        this.IIIlIIlIIIIlllIlllII();
        this.IIlIIIIlllIlllllIlII();
    }
    
    private void IIlIIIIlllIlllllIlII() {
        if (this.lIIIlllIIIllIIIllIII && this.llIIlIIIlIIIllIlIIIl > 0 && !this.llllIIIIlIIIlIlllIll.IlIlIllllllllIIIIlII && this.llIllIlIIIIllIlIIllI > 0) {
            final double n = this.llIIlIIIlIIIllIlIIIl * 10 + 10;
            boolean b = false;
            if (this.llIIlIIIlIIIllIlIIIl >= 4 && this.llIllIlIIIIllIlIIllI == this.lIlIlIIIllIIllIIIllI) {
                b = true;
            }
            final int liiiIlIIIIIlllIllIII = this.IlIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII();
            final int liiIlllIIIllIIIllIII = this.IlIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII();
            final int llIIlIIIlIIIllIlIIIl = this.IlIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl();
            final List llllIIIIlIIIlIlllIll = this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll.class, new net.minecraft.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(liiiIlIIIIIlllIllIII, liiIlllIIIllIIIllIII, llIIlIIIlIIIllIlIIIl, liiiIlIIIIIlllIllIII + 1, liiIlllIIIllIIIllIII + 1, llIIlIIIlIIIllIlIIIl + 1).IlIlIlIlIlllllllllIl(n, n, n).llllIIIIlIIIlIlllIll(0.0, this.llllIIIIlIIIlIlllIll.IlIIIlIIIllllIlIlIlI(), 0.0));
            final Iterator<net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll> iterator = llllIIIIlIIIlIlllIll.iterator();
            while (iterator.hasNext()) {
                iterator.next().llllIIIIlIIIlIlllIll(new net.minecraft.llllIIllllIlIlIIIIll.IlIIIlIlIIIllIlIlIIl(this.llIllIlIIIIllIlIIllI, 180, (int)(b ? 1 : 0), true, true));
            }
            if (this.llIIlIIIlIIIllIlIIIl >= 4 && this.llIllIlIIIIllIlIIllI != this.lIlIlIIIllIIllIIIllI && this.lIlIlIIIllIIllIIIllI > 0) {
                final Iterator<net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll> iterator2 = llllIIIIlIIIlIlllIll.iterator();
                while (iterator2.hasNext()) {
                    iterator2.next().llllIIIIlIIIlIlllIll(new net.minecraft.llllIIllllIlIlIIIIll.IlIIIlIlIIIllIlIlIIl(this.lIlIlIIIllIIllIIIllI, 180, 0, true, true));
                }
            }
        }
    }
    
    private void IIIlIIlIIIIlllIlllII() {
        final int llIIlIIIlIIIllIlIIIl = this.llIIlIIIlIIIllIlIIIl;
        final int liiiIlIIIIIlllIllIII = this.IlIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII();
        final int liiIlllIIIllIIIllIII = this.IlIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII();
        final int llIIlIIIlIIIllIlIIIl2 = this.IlIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl();
        this.llIIlIIIlIIIllIlIIIl = 0;
        this.IllIIlllIIIIlllIIlIl.clear();
        this.lIIIlllIIIllIIIllIII = true;
        llIllIlIIIIllIlIIllI llIllIlIIIIllIlIIllI = new llIllIlIIIIllIlIIllI(IIIlIIIlIlIIlllIIlll.llllIIIIlIIIlIlllIll(net.minecraft.llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll));
        this.IllIIlllIIIIlllIIlIl.add(llIllIlIIIIllIlIIllI);
        int n = 1;
        final llllIIIlIlllIlIIIIIl llllIIIlIlllIlIIIIIl = new llllIIIlIlllIlIIIIIl();
        for (int i = liiIlllIIIllIIIllIII + 1; i < 256; ++i) {
            final net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.llIIlIIIlIIIllIlIIIl ilIlIlIlIlllllllllIl = this.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl(liiiIlIIIIIlllIllIII, i, llIIlIIIlIIIllIlIIIl2));
            float[] array;
            if (ilIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI() == net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.aK) {
                array = IIIlIIIlIlIIlllIIlll.llllIIIIlIIIlIlllIll((IlIlIlIlIlllllllllIl)ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(ck.IIIIIIIIIlllIllIlIlI));
            }
            else if (ilIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI() != net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.aL) {
                if (ilIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI().IlIlIlIlIlllllllllIl() >= 15 && ilIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI() != net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII) {
                    this.lIIIlllIIIllIIIllIII = false;
                    this.IllIIlllIIIIlllIIlIl.clear();
                    break;
                }
                llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll();
                continue;
            }
            else {
                array = IIIlIIIlIlIIlllIIlll.llllIIIIlIIIlIlllIll((IlIlIlIlIlllllllllIl)ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(cl.llIllIlIlIIIIIIIllII));
            }
            if (n == 0) {
                array = new float[] { (llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl()[0] + array[0]) / 2.0f, (llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl()[1] + array[1]) / 2.0f, (llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl()[2] + array[2]) / 2.0f };
            }
            if (Arrays.equals(array, llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl())) {
                llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll();
            }
            else {
                llIllIlIIIIllIlIIllI = new llIllIlIIIIllIlIIllI(array);
                this.IllIIlllIIIIlllIIlIl.add(llIllIlIIIIllIlIIllI);
            }
            n = 0;
        }
        if (this.lIIIlllIIIllIIIllIII) {
            for (int j = 1; j <= 4; this.llIIlIIIlIIIllIlIIIl = j++) {
                final int n2 = liiIlllIIIllIIIllIII - j;
                if (n2 < 0) {
                    break;
                }
                boolean b = true;
                for (int n3 = liiiIlIIIIIlllIllIII - j; n3 <= liiiIlIIIIIlllIllIII + j && b; ++n3) {
                    for (int k = llIIlIIIlIIIllIlIIIl2 - j; k <= llIIlIIIlIIIllIlIIIl2 + j; ++k) {
                        final net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llIllIIIIIllIlIIIIlI = this.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(new net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(n3, n2, k)).llIllIIIIIllIlIIIIlI();
                        if (llIllIIIIIllIlIIIIlI != net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.X && llIllIIIIIllIlIIIIlI != net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IllIllIIIIlIIlIlllII && llIllIIIIIllIlIIIIlI != net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lIlIIlllIIlIIlIlllIl && llIllIIIIIllIlIIIIlI != net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIllllIIlIIlIlIlIll) {
                            b = false;
                            break;
                        }
                    }
                }
                if (!b) {
                    break;
                }
            }
            if (this.llIIlIIIlIIIllIlIIIl == 0) {
                this.lIIIlllIIIllIIIllIII = false;
            }
        }
        if (!this.llllIIIIlIIIlIlllIll.IlIlIllllllllIIIIlII && this.llIIlIIIlIIIllIlIIIl == 4 && llIIlIIIlIIIllIlIIIl < this.llIIlIIIlIIIllIlIIIl) {
            final Iterator iterator = this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll.class, new net.minecraft.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(liiiIlIIIIIlllIllIII, liiIlllIIIllIIIllIII, llIIlIIIlIIIllIlIIIl2, liiiIlIIIIIlllIllIII, liiIlllIIIllIIIllIII - 4, llIIlIIIlIIIllIlIIIl2).IlIlIlIlIlllllllllIl(10.0, 5.0, 10.0)).iterator();
            while (iterator.hasNext()) {
                iterator.next().llllIIIIlIIIlIlllIll(net.minecraft.IIIlIIIlIlIIlllIIlll.IlIlIlIlIlllllllllIl.IIIIIllIIIIlIIIIllIl);
            }
        }
    }
    
    public List IlIlIIIlIIlIlIIlllIl() {
        return this.IllIIlllIIIIlllIIlIl;
    }
    
    public float IlllllllIIIlIIIlIlII() {
        if (!this.lIIIlllIIIllIIIllIII) {
            return 0.0f;
        }
        final int n = (int)(this.llllIIIIlIIIlIlllIll.IIIlIIlIIIIlllIlllII() - this.llllIIIlIlllIlIIIIIl);
        this.llllIIIlIlllIlIIIIIl = this.llllIIIIlIIIlIlllIll.IIIlIIlIIIIlllIlllII();
        if (n > 1) {
            this.lIIIIlIIIIIlllIllIII -= n / 40.0f;
            if (this.lIIIIlIIIIIlllIllIII < 0.0f) {
                this.lIIIIlIIIIIlllIllIII = 0.0f;
            }
        }
        this.lIIIIlIIIIIlllIllIII += 0.025f;
        if (this.lIIIIlIIIIIlllIllIII > 1.0f) {
            this.lIIIIlIIIIIlllIllIII = 1.0f;
        }
        return this.lIIIIlIIIIIlllIllIII;
    }
    
    @Override
    public IIlIIIIIllIlIIIlIIll IIIIlllIIIIIIlIIIlll() {
        final net.minecraft.lIlIlIIIllIIllIIIllI.IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll = new net.minecraft.lIlIlIIIllIIllIIIllI.IIIIlllIIIIIIlIIIlll();
        this.IlIlIlIlIlllllllllIl(iiiIlllIIIIIIlIIIlll);
        return new IllIIlllllIIllIIllIl(this.IlIlIlIlIlllllllllIl, 3, iiiIlllIIIIIIlIIIlll);
    }
    
    @Override
    public double llIllIlIIIIllIlIIllI() {
        return 65536.0;
    }
    
    private int IlIlIlIlIlllllllllIl(final int n) {
        if (n >= 0 && n < net.minecraft.llllIIllllIlIlIIIIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.length && net.minecraft.llllIIllllIlIlIIIIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll[n] != null) {
            final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll = net.minecraft.llllIIllllIlIlIIIIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll[n];
            return (llllIIIIlIIIlIlllIll != net.minecraft.llllIIllllIlIlIIIIll.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI && llllIIIIlIIIlIlllIll != net.minecraft.llllIIllllIlIlIIIIll.llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI && llllIIIIlIIIlIlllIll != net.minecraft.llllIIllllIlIlIIIIll.llllIIIIlIIIlIlllIll.IlIlIIIllIIllIlllllI && llllIIIIlIIIlIlllIll != net.minecraft.llllIIllllIlIlIIIIll.llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl && llllIIIIlIIIlIlllIll != net.minecraft.llllIIllllIlIlIIIIll.llllIIIIlIIIlIlllIll.llllIIIlIlllIlIIIIIl && llllIIIIlIIIlIlllIll != net.minecraft.llllIIllllIlIlIIIIll.llllIIIIlIIIlIlllIll.lIlIlIIIllIIllIIIllI) ? 0 : n;
        }
        return 0;
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final net.minecraft.lIlIlIIIllIIllIIIllI.IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll) {
        super.llllIIIIlIIIlIlllIll(iiiIlllIIIIIIlIIIlll);
        this.llIllIlIIIIllIlIIllI = this.IlIlIlIlIlllllllllIl(iiiIlllIIIIIIlIIIlll.IllIIlllIIIIlllIIlIl("Primary"));
        this.lIlIlIIIllIIllIIIllI = this.IlIlIlIlIlllllllllIl(iiiIlllIIIIIIlIIIlll.IllIIlllIIIIlllIIlIl("Secondary"));
        this.llIIlIIIlIIIllIlIIIl = iiiIlllIIIIIIlIIIlll.IllIIlllIIIIlllIIlIl("Levels");
    }
    
    @Override
    public void IlIlIlIlIlllllllllIl(final net.minecraft.lIlIlIIIllIIllIIIllI.IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll) {
        super.IlIlIlIlIlllllllllIl(iiiIlllIIIIIIlIIIlll);
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("Primary", this.llIllIlIIIIllIlIIllI);
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("Secondary", this.lIlIlIIIllIIllIIIllI);
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("Levels", this.llIIlIIIlIIIllIlIIIl);
    }
    
    @Override
    public int lIIIlllIIIllIIIllIII() {
        return 1;
    }
    
    @Override
    public lllIIIIlIlIllIIlIIIl lIlIlIIIllIIllIIIllI(final int n) {
        return (n == 0) ? this.IlIlIIIllIIllIlllllI : null;
    }
    
    @Override
    public lllIIIIlIlIllIIlIIIl IlIlIlIlIlllllllllIl(final int n, final int n2) {
        if (n != 0 || this.IlIlIIIllIIllIlllllI == null) {
            return null;
        }
        if (n2 >= this.IlIlIIIllIIllIlllllI.IlIlIlIlIlllllllllIl) {
            final lllIIIIlIlIllIIlIIIl ilIlIIIllIIllIlllllI = this.IlIlIIIllIIllIlllllI;
            this.IlIlIIIllIIllIlllllI = null;
            return ilIlIIIllIIllIlllllI;
        }
        final lllIIIIlIlIllIIlIIIl ilIlIIIllIIllIlllllI2 = this.IlIlIIIllIIllIlllllI;
        ilIlIIIllIIllIlllllI2.IlIlIlIlIlllllllllIl -= n2;
        return new lllIIIIlIlIllIIlIIIl(this.IlIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll(), n2, this.IlIlIIIllIIllIlllllI.lIIIIlIIIIIlllIllIII());
    }
    
    @Override
    public lllIIIIlIlIllIIlIIIl IlIlIIIllIIllIlllllI(final int n) {
        if (n == 0 && this.IlIlIIIllIIllIlllllI != null) {
            final lllIIIIlIlIllIIlIIIl ilIlIIIllIIllIlllllI = this.IlIlIIIllIIllIlllllI;
            this.IlIlIIIllIIllIlllllI = null;
            return ilIlIIIllIIllIlllllI;
        }
        return null;
    }
    
    @Override
    public void llIllIIIIIllIlIIIIlI(final int n, final lllIIIIlIlIllIIlIIIl ilIlIIIllIIllIlllllI) {
        if (n == 0) {
            this.IlIlIIIllIIllIlllllI = ilIlIIIllIIllIlllllI;
        }
    }
    
    @Override
    public String s_() {
        return this.w_() ? this.IIIIlllIIIIIIlIIIlll : "container.beacon";
    }
    
    @Override
    public boolean w_() {
        return this.IIIIlllIIIIIIlIIIlll != null && this.IIIIlllIIIIIIlIIIlll.length() > 0;
    }
    
    public void llllIIIIlIIIlIlllIll(final String iiiIlllIIIIIIlIIIlll) {
        this.IIIIlllIIIIIIlIIIlll = iiiIlllIIIIIIlIIIlll;
    }
    
    @Override
    public int lllllIlIIIlIlIIlllII() {
        return 1;
    }
    
    @Override
    public boolean IlIIIlIlIIIllIlIlIIl(final net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        return this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(this.IlIlIlIlIlllllllllIl) == this && llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI(this.IlIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII() + 0.5, this.IlIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII() + 0.5, this.IlIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl() + 0.5) <= 64.0;
    }
    
    @Override
    public void IlIlIIIllIllIIIIIllI(final net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
    }
    
    @Override
    public void IllIIlllIIIIlllIIlIl(final net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
    }
    
    @Override
    public boolean IlIIIlIlIIIllIlIlIIl(final int n, final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl) {
        return lllIIIIlIlIllIIlIIIl.llllIIIIlIIIlIlllIll() == IIllIIllIIIlIlIIIIlI.S || lllIIIIlIlIllIIlIIIl.llllIIIIlIIIlIlllIll() == IIllIIllIIIlIlIIIIlI.lIIIlllIIIllIIIllIII || lllIIIIlIlIllIIlIIIl.llllIIIIlIIIlIlllIll() == IIllIIllIIIlIlIIIIlI.llIllIlIIIIllIlIIllI || lllIIIIlIlIllIIlIIIl.llllIIIIlIIIlIlllIll() == IIllIIllIIIlIlIIIIlI.llIIlIIIlIIIllIlIIIl;
    }
    
    @Override
    public String IlIIIlIlIIIllIlIlIIl() {
        return "minecraft:beacon";
    }
    
    @Override
    public net.minecraft.llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll(final net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.IllIIlllIIIIlllIIlIl illIIlllIIIIlllIIlIl, final net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        return new llIllIIIIIllIlIIIIlI(illIIlllIIIIlllIIlIl, this);
    }
    
    @Override
    public int llllIIIIlIIIlIlllIll(final int n) {
        switch (n) {
            case 0: {
                return this.llIIlIIIlIIIllIlIIIl;
            }
            case 1: {
                return this.llIllIlIIIIllIlIIllI;
            }
            case 2: {
                return this.lIlIlIIIllIIllIIIllI;
            }
            default: {
                return 0;
            }
        }
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final int n, final int llIIlIIIlIIIllIlIIIl) {
        switch (n) {
            case 0: {
                this.llIIlIIIlIIIllIlIIIl = llIIlIIIlIIIllIlIIIl;
                break;
            }
            case 1: {
                this.llIllIlIIIIllIlIIllI = this.IlIlIlIlIlllllllllIl(llIIlIIIlIIIllIlIIIl);
                break;
            }
            case 2: {
                this.lIlIlIIIllIIllIIIllI = this.IlIlIlIlIlllllllllIl(llIIlIIIlIIIllIlIIIl);
                break;
            }
        }
    }
    
    @Override
    public int IlIlIIIllIllIIIIIllI() {
        return 3;
    }
    
    @Override
    public void lIllllllIIllIlIlIlII() {
        this.IlIlIIIllIIllIlllllI = null;
    }
    
    @Override
    public boolean llIllIIIIIllIlIIIIlI(final int n, final int n2) {
        if (n == 1) {
            this.IIIlIIIlIlIIlllIIlll();
            return true;
        }
        return super.llIllIIIIIllIlIIIIlI(n, n2);
    }
}
