package net.minecraft.IlIlIIIlIIlIlIIlllIl;

import net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.*;
import com.google.common.collect.*;
import net.minecraft.lIIIlllIIIllIIIllIII.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;
import java.util.*;
import net.minecraft.lIlIlIIIllIIllIIIllI.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;

public class lIllllllIIllIlIlIlII extends IlIIIlIlIIIllIlIlIIl implements llIIIllIlIllIllIIIIl
{
    private llIIlIIIlIIIllIlIIIl IlIlIIIllIllIIIIIllI;
    private lllIllIIIllllllIllll IllIIlllIIIIlllIIlIl;
    private boolean llllIIIlIlllIlIIIIIl;
    private boolean lIIIIlIIIIIlllIllIII;
    private float lIIIlllIIIllIIIllIII;
    private float llIIlIIIlIIIllIlIIIl;
    private List llIllIlIIIIllIlIIllI;
    private static volatile /* synthetic */ int[] lIlIlIIIllIIllIIIllI;
    
    public lIllllllIIllIlIlIlII() {
        this.llIllIlIIIIllIlIIllI = Lists.newArrayList();
    }
    
    public lIllllllIIllIlIlIlII(final llIIlIIIlIIIllIlIIIl ilIlIIIllIllIIIIIllI, final lllIllIIIllllllIllll illIIlllIIIIlllIIlIl, final boolean llllIIIlIlllIlIIIIIl, final boolean liiiIlIIIIIlllIllIII) {
        this.llIllIlIIIIllIlIIllI = Lists.newArrayList();
        this.IlIlIIIllIllIIIIIllI = ilIlIIIllIllIIIIIllI;
        this.IllIIlllIIIIlllIIlIl = illIIlllIIIIlllIIlIl;
        this.llllIIIlIlllIlIIIIIl = llllIIIlIlllIlIIIIIl;
        this.lIIIIlIIIIIlllIllIII = liiiIlIIIIIlllIllIII;
    }
    
    public llIIlIIIlIIIllIlIIIl IlIlIlIlIlllllllllIl() {
        return this.IlIlIIIllIllIIIIIllI;
    }
    
    @Override
    public int llIIlIIIlIIIllIlIIIl() {
        return 0;
    }
    
    public boolean llIllIIIIIllIlIIIIlI() {
        return this.llllIIIlIlllIlIIIIIl;
    }
    
    public lllIllIIIllllllIllll IlIIIlIlIIIllIlIlIIl() {
        return this.IllIIlllIIIIlllIIlIl;
    }
    
    public boolean IlIlIIIllIllIIIIIllI() {
        return this.lIIIIlIIIIIlllIllIII;
    }
    
    public float llllIIIIlIIIlIlllIll(float n) {
        if (n > 1.0f) {
            n = 1.0f;
        }
        return this.llIIlIIIlIIIllIlIIIl + (this.lIIIlllIIIllIIIllIII - this.llIIlIIIlIIIllIlIIIl) * n;
    }
    
    public float IlIlIlIlIlllllllllIl(final float n) {
        return this.llllIIIlIlllIlIIIIIl ? ((this.llllIIIIlIIIlIlllIll(n) - 1.0f) * this.IllIIlllIIIIlllIIlIl.lIIIIlIIIIIlllIllIII()) : ((1.0f - this.llllIIIIlIIIlIlllIll(n)) * this.IllIIlllIIIIlllIIlIl.lIIIIlIIIIIlllIllIII());
    }
    
    public float llIllIIIIIllIlIIIIlI(final float n) {
        return this.llllIIIlIlllIlIIIIIl ? ((this.llllIIIIlIIIlIlllIll(n) - 1.0f) * this.IllIIlllIIIIlllIIlIl.lIIIlllIIIllIIIllIII()) : ((1.0f - this.llllIIIIlIIIlIlllIll(n)) * this.IllIIlllIIIIlllIIlIl.lIIIlllIIIllIIIllIII());
    }
    
    public float IlIIIlIlIIIllIlIlIIl(final float n) {
        return this.llllIIIlIlllIlIIIIIl ? ((this.llllIIIIlIIIlIlllIll(n) - 1.0f) * this.IllIIlllIIIIlllIIlIl.llIIlIIIlIIIllIlIIIl()) : ((1.0f - this.llllIIIIlIIIlIlllIll(n)) * this.IllIIlllIIIIlllIIlIl.llIIlIIIlIIIllIlIIIl());
    }
    
    private void llllIIIIlIIIlIlllIll(float n, final float n2) {
        if (this.llllIIIlIlllIlIIIIIl) {
            n = 1.0f - n;
        }
        else {
            --n;
        }
        final net.minecraft.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll = net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIllllIIIlIIIIIIllIl.llllIIIIlIIIlIlllIll(this.llllIIIIlIIIlIlllIll, this.IlIlIlIlIlllllllllIl, this.IlIlIIIllIllIIIIIllI, n, this.IllIIlllIIIIlllIIlIl);
        if (llllIIIIlIIIlIlllIll != null) {
            final List ilIlIlIlIlllllllllIl = this.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(null, llllIIIIlIIIlIlllIll);
            if (!ilIlIlIlIlllllllllIl.isEmpty()) {
                this.llIllIlIIIIllIlIIllI.addAll(ilIlIlIlIlllllllllIl);
                for (final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI : this.llIllIlIIIIllIlIIllI) {
                    if (this.IlIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI() == net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.aI && this.llllIIIlIlllIlIIIIIl) {
                        switch (llllIIIlIlllIlIIIIIl()[this.IllIIlllIIIIlllIIlIl.lIlIlIIIllIIllIIIllI().ordinal()]) {
                            case 1: {
                                llIllIIIIIllIlIIIIlI.lIllllllIIllIlIlIlII = this.IllIIlllIIIIlllIIlIl.lIIIIlIIIIIlllIllIII();
                                continue;
                            }
                            case 2: {
                                llIllIIIIIllIlIIIIlI.llIIlllIIlllIIllIllI = this.IllIIlllIIIIlllIIlIl.lIIIlllIIIllIIIllIII();
                                continue;
                            }
                            case 3: {
                                llIllIIIIIllIlIIIIlI.IIlllIIIlIlllIIlllII = this.IllIIlllIIIIlllIIlIl.llIIlIIIlIIIllIlIIIl();
                                continue;
                            }
                        }
                    }
                    else {
                        llIllIIIIIllIlIIIIlI.IlIIIlIlIIIllIlIlIIl(n2 * this.IllIIlllIIIIlllIIlIl.lIIIIlIIIIIlllIllIII(), n2 * this.IllIIlllIIIIlllIIlIl.lIIIlllIIIllIIIllIII(), n2 * this.IllIIlllIIIIlllIIlIl.llIIlIIIlIIIllIlIIIl());
                    }
                }
                this.llIllIlIIIIllIlIIllI.clear();
            }
        }
    }
    
    public void IllIIlllIIIIlllIIlIl() {
        if (this.llIIlIIIlIIIllIlIIIl < 1.0f && this.llllIIIIlIIIlIlllIll != null) {
            final float n = 1.0f;
            this.lIIIlllIIIllIIIllIII = n;
            this.llIIlIIIlIIIllIlIIIl = n;
            this.llllIIIIlIIIlIlllIll.IlIlIIIIIIlllIlIllIl(this.IlIlIlIlIlllllllllIl);
            this.IlIllIlIlIIIlIlIlIII();
            if (this.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(this.IlIlIlIlIlllllllllIl).llIllIIIIIllIlIIIIlI() == net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIllllIIIlIIIIIIllIl) {
                this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(this.IlIlIlIlIlllllllllIl, this.IlIlIIIllIllIIIIIllI, 3);
                this.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI(this.IlIlIlIlIlllllllllIl, this.IlIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI());
            }
        }
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll() {
        this.llIIlIIIlIIIllIlIIIl = this.lIIIlllIIIllIIIllIII;
        if (this.llIIlIIIlIIIllIlIIIl >= 1.0f) {
            this.llllIIIIlIIIlIlllIll(1.0f, 0.25f);
            this.llllIIIIlIIIlIlllIll.IlIlIIIIIIlllIlIllIl(this.IlIlIlIlIlllllllllIl);
            this.IlIllIlIlIIIlIlIlIII();
            if (this.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(this.IlIlIlIlIlllllllllIl).llIllIIIIIllIlIIIIlI() == net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIllllIIIlIIIIIIllIl) {
                this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(this.IlIlIlIlIlllllllllIl, this.IlIlIIIllIllIIIIIllI, 3);
                this.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI(this.IlIlIlIlIlllllllllIl, this.IlIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI());
            }
        }
        else {
            this.lIIIlllIIIllIIIllIII += 0.5f;
            if (this.lIIIlllIIIllIIIllIII >= 1.0f) {
                this.lIIIlllIIIllIIIllIII = 1.0f;
            }
            if (this.llllIIIlIlllIlIIIIIl) {
                this.llllIIIIlIIIlIlllIll(this.lIIIlllIIIllIIIllIII, this.lIIIlllIIIllIIIllIII - this.llIIlIIIlIIIllIlIIIl + 0.0625f);
            }
        }
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll) {
        super.llllIIIIlIIIlIlllIll(iiiIlllIIIIIIlIIIlll);
        this.IlIlIIIllIllIIIIIllI = net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(iiiIlllIIIIIIlIIIlll.IllIIlllIIIIlllIIlIl("blockId")).llIllIIIIIllIlIIIIlI(iiiIlllIIIIIIlIIIlll.IllIIlllIIIIlllIIlIl("blockData"));
        this.IllIIlllIIIIlllIIlIl = lllIllIIIllllllIllll.llllIIIIlIIIlIlllIll(iiiIlllIIIIIIlIIIlll.IllIIlllIIIIlllIIlIl("facing"));
        final float liiiIlIIIIIlllIllIII = iiiIlllIIIIIIlIIIlll.lIIIIlIIIIIlllIllIII("progress");
        this.lIIIlllIIIllIIIllIII = liiiIlIIIIIlllIllIII;
        this.llIIlIIIlIIIllIlIIIl = liiiIlIIIIIlllIllIII;
        this.llllIIIlIlllIlIIIIIl = iiiIlllIIIIIIlIIIlll.IIIIlllIIIIIIlIIIlll("extending");
    }
    
    @Override
    public void IlIlIlIlIlllllllllIl(final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll) {
        super.IlIlIlIlIlllllllllIl(iiiIlllIIIIIIlIIIlll);
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("blockId", net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(this.IlIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI()));
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("blockData", this.IlIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI().llIllIIIIIllIlIIIIlI(this.IlIlIIIllIllIIIIIllI));
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("facing", this.IllIIlllIIIIlllIIlIl.IlIlIlIlIlllllllllIl());
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("progress", this.llIIlIIIlIIIllIlIIIl);
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("extending", this.llllIIIlIlllIlIIIIIl);
    }
    
    static /* synthetic */ int[] llllIIIlIlllIlIIIIIl() {
        final int[] lIlIlIIIllIIllIIIllI = lIllllllIIllIlIlIlII.lIlIlIIIllIIllIIIllI;
        if (lIlIlIIIllIIllIIIllI != null) {
            return lIlIlIIIllIIllIIIllI;
        }
        final int[] lIlIlIIIllIIllIIIllI2 = new int[llIllIlIlIIIIIIIllII.values().length];
        try {
            lIlIlIIIllIIllIIIllI2[llIllIlIlIIIIIIIllII.llllIIIIlIIIlIlllIll.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            lIlIlIIIllIIllIIIllI2[llIllIlIlIIIIIIIllII.IlIlIlIlIlllllllllIl.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError2) {}
        try {
            lIlIlIIIllIIllIIIllI2[llIllIlIlIIIIIIIllII.llIllIIIIIllIlIIIIlI.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError3) {}
        return lIllllllIIllIlIlIlII.lIlIlIIIllIIllIIIllI = lIlIlIIIllIIllIIIllI2;
    }
}
