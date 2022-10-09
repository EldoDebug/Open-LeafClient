package net.minecraft.client.llIllIIIIIllIlIIIIlI;

import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.client.*;
import com.google.common.collect.*;
import java.util.*;

public class lIIIIlIlIllllIIlIllI extends IIIIIllIIIIlIIIIllIl
{
    private final List llllIIIIlIIIlIlllIll;
    private final IIIllIIIlIlIIllIIIlI IlIlIlIlIlllllllllIl;
    private final List IlllllllIIIlIIIlIlII;
    private final lIllIIIIIlllIIlIIllI[][] IIlIIIIlllIlllllIlII;
    private int IIIlIIlIIIIlllIlllII;
    private lIlIIlllIIlIIlIlllIl IlIlIllllllllIIIIlII;
    private llIllIIIIIllIlIIIIlI IIlllIlIIllIlIlIlIIl;
    
    public lIIIIlIlIllllIIlIllI(final Minecraft minecraft, final int n, final int n2, final int n3, final int n4, final int n5, final lIlIIlllIIlIIlIlllIl ilIlIllllllllIIIIlII, final lIllIIIIIlllIIlIIllI[]... iIlIIIIlllIlllllIlII) {
        super(minecraft, n, n2, n3, n4, n5);
        this.llllIIIIlIIIlIlllIll = Lists.newArrayList();
        this.IlIlIlIlIlllllllllIl = new IIIllIIIlIlIIllIIIlI();
        this.IlllllllIIIlIIIlIlII = Lists.newArrayList();
        this.IlIlIllllllllIIIIlII = ilIlIllllllllIIIIlII;
        this.IIlIIIIlllIlllllIlII = iIlIIIIlllIlllllIlII;
        this.IlIlIIIllIIllIlllllI = false;
        this.IIlllIIlIllIllIlIIll();
        this.lllIIIIlllllIlIIllIl();
    }
    
    private void IIlllIIlIllIllIlIIll() {
        lIllIIIIIlllIIlIIllI[][] iIlIIIIlllIlllllIlII;
        for (int length = (iIlIIIIlllIlllllIlII = this.IIlIIIIlllIlllllIlII).length, i = 0; i < length; ++i) {
            final lIllIIIIIlllIIlIIllI[] array = iIlIIIIlllIlllllIlII[i];
            for (int j = 0; j < array.length; j += 2) {
                final lIllIIIIIlllIIlIIllI lIllIIIIIlllIIlIIllI = array[j];
                final lIllIIIIIlllIIlIIllI lIllIIIIIlllIIlIIllI2 = (j < array.length - 1) ? array[j + 1] : null;
                final llIllIIIIIllIlIIIIlI llllIIIIlIIIlIlllIll = this.llllIIIIlIIIlIlllIll(lIllIIIIIlllIIlIIllI, 0, lIllIIIIIlllIIlIIllI2 == null);
                final llIllIIIIIllIlIIIIlI llllIIIIlIIIlIlllIll2 = this.llllIIIIlIIIlIlllIll(lIllIIIIIlllIIlIIllI2, 160, lIllIIIIIlllIIlIIllI == null);
                this.llllIIIIlIIIlIlllIll.add(new lllllIIIIIlIlIIIIIIl(llllIIIIlIIIlIlllIll, llllIIIIlIIIlIlllIll2));
                if (lIllIIIIIlllIIlIIllI != null && llllIIIIlIIIlIlllIll != null) {
                    this.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(lIllIIIIIlllIIlIIllI.IlIlIlIlIlllllllllIl(), llllIIIIlIIIlIlllIll);
                    if (llllIIIIlIIIlIlllIll instanceof lIIlIIIIIIIlIIlIlIIl) {
                        this.IlllllllIIIlIIIlIlII.add(llllIIIIlIIIlIlllIll);
                    }
                }
                if (lIllIIIIIlllIIlIIllI2 != null && llllIIIIlIIIlIlllIll2 != null) {
                    this.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(lIllIIIIIlllIIlIIllI2.IlIlIlIlIlllllllllIl(), llllIIIIlIIIlIlllIll2);
                    if (llllIIIIlIIIlIlllIll2 instanceof lIIlIIIIIIIlIIlIlIIl) {
                        this.IlllllllIIIlIIIlIlII.add(llllIIIIlIIIlIlllIll2);
                    }
                }
            }
        }
    }
    
    private void lllIIIIlllllIlIIllIl() {
        this.llllIIIIlIIIlIlllIll.clear();
        for (int i = 0; i < this.IIlIIIIlllIlllllIlII[this.IIIlIIlIIIIlllIlllII].length; i += 2) {
            final lIllIIIIIlllIIlIIllI lIllIIIIIlllIIlIIllI = this.IIlIIIIlllIlllllIlII[this.IIIlIIlIIIIlllIlllII][i];
            final lIllIIIIIlllIIlIIllI lIllIIIIIlllIIlIIllI2 = (i < this.IIlIIIIlllIlllllIlII[this.IIIlIIlIIIIlllIlllII].length - 1) ? this.IIlIIIIlllIlllllIlII[this.IIIlIIlIIIIlllIlllII][i + 1] : null;
            this.llllIIIIlIIIlIlllIll.add(new lllllIIIIIlIlIIIIIIl((llIllIIIIIllIlIIIIlI)this.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(lIllIIIIIlllIIlIIllI.IlIlIlIlIlllllllllIl()), (lIllIIIIIlllIIlIIllI2 != null) ? ((llIllIIIIIllIlIIIIlI)this.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(lIllIIIIIlllIIlIIllI2.IlIlIlIlIlllllllllIl())) : null));
        }
    }
    
    public void llIllIIIIIllIlIIIIlI(final int iiIlIIlIIIIlllIlllII) {
        if (iiIlIIlIIIIlllIlllII != this.IIIlIIlIIIIlllIlllII) {
            final int iiIlIIlIIIIlllIlllII2 = this.IIIlIIlIIIIlllIlllII;
            this.IIIlIIlIIIIlllIlllII = iiIlIIlIIIIlllIlllII;
            this.lllIIIIlllllIlIIllIl();
            this.IlIlIIIllIllIIIIIllI(iiIlIIlIIIIlllIlllII2, iiIlIIlIIIIlllIlllII);
            this.IlIllIlIlIIIlIlIlIII = 0.0f;
        }
    }
    
    public int IlIIIlIlIIIllIlIlIIl() {
        return this.IIIlIIlIIIIlllIlllII;
    }
    
    public int IlIlIIIllIllIIIIIllI() {
        return this.IIlIIIIlllIlllllIlII.length;
    }
    
    public llIllIIIIIllIlIIIIlI lIIIlllIIIllIIIllIII() {
        return this.IIlllIlIIllIlIlIlIIl;
    }
    
    public void llIIlIIIlIIIllIlIIIl() {
        if (this.IIIlIIlIIIIlllIlllII > 0) {
            this.llIllIIIIIllIlIIIIlI(this.IIIlIIlIIIIlllIlllII - 1);
        }
    }
    
    public void llIllIlIIIIllIlIIllI() {
        if (this.IIIlIIlIIIIlllIlllII < this.IIlIIIIlllIlllllIlII.length - 1) {
            this.llIllIIIIIllIlIIIIlI(this.IIIlIIlIIIIlllIlllII + 1);
        }
    }
    
    public llIllIIIIIllIlIIIIlI IlIIIlIlIIIllIlIlIIl(final int n) {
        return (llIllIIIIIllIlIIIIlI)this.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(n);
    }
    
    private void IlIlIIIllIllIIIIIllI(final int n, final int n2) {
        lIllIIIIIlllIIlIIllI[] array;
        for (int length = (array = this.IIlIIIIlllIlllllIlII[n]).length, i = 0; i < length; ++i) {
            final lIllIIIIIlllIIlIIllI lIllIIIIIlllIIlIIllI = array[i];
            if (lIllIIIIIlllIIlIIllI != null) {
                this.llllIIIIlIIIlIlllIll((llIllIIIIIllIlIIIIlI)this.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(lIllIIIIIlllIIlIIllI.IlIlIlIlIlllllllllIl()), false);
            }
        }
        lIllIIIIIlllIIlIIllI[] array2;
        for (int length2 = (array2 = this.IIlIIIIlllIlllllIlII[n2]).length, j = 0; j < length2; ++j) {
            final lIllIIIIIlllIIlIIllI lIllIIIIIlllIIlIIllI2 = array2[j];
            if (lIllIIIIIlllIIlIIllI2 != null) {
                this.llllIIIIlIIIlIlllIll((llIllIIIIIllIlIIIIlI)this.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(lIllIIIIIlllIIlIIllI2.IlIlIlIlIlllllllllIl()), true);
            }
        }
    }
    
    private void llllIIIIlIIIlIlllIll(final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI, final boolean b) {
        if (llIllIIIIIllIlIIIIlI instanceof IlIIIlIlIIIllIlIlIIl) {
            ((IlIIIlIlIIIllIlIlIIl)llIllIIIIIllIlIIIIlI).IlIlIIIllIIllIlllllI = b;
        }
        else if (llIllIIIIIllIlIIIIlI instanceof lIIlIIIIIIIlIIlIlIIl) {
            ((lIIlIIIIIIIlIIlIlIIl)llIllIIIIIllIlIIIIlI).IlIlIIIllIllIIIIIllI(b);
        }
        else if (llIllIIIIIllIlIIIIlI instanceof IIlIIIIIllIlIIIlIIll) {
            ((IIlIIIIIllIlIIIlIIll)llIllIIIIIllIlIIIIlI).llIIlIIIlIIIllIlIIIl = b;
        }
    }
    
    private llIllIIIIIllIlIIIIlI llllIIIIlIIIlIlllIll(final lIllIIIIIlllIIlIIllI lIllIIIIIlllIIlIIllI, final int n, final boolean b) {
        return (lIllIIIIIlllIIlIIllI instanceof llIIIllIlIllIllIIIIl) ? this.llllIIIIlIIIlIlllIll(this.IlIIIlIlIIIllIlIlIIl / 2 - 155 + n, 0, (llIIIllIlIllIllIIIIl)lIllIIIIIlllIIlIIllI) : ((lIllIIIIIlllIIlIIllI instanceof IlIIllIIllIIllIIlIIl) ? this.llllIIIIlIIIlIlllIll(this.IlIIIlIlIIIllIlIlIIl / 2 - 155 + n, 0, (IlIIllIIllIIllIIlIIl)lIllIIIIIlllIIlIIllI) : ((lIllIIIIIlllIIlIIllI instanceof llIIIlIlllIllIIlIllI) ? this.llllIIIIlIIIlIlllIll(this.IlIIIlIlIIIllIlIlIIl / 2 - 155 + n, 0, (llIIIlIlllIllIIlIllI)lIllIIIIIlllIIlIIllI) : ((lIllIIIIIlllIIlIIllI instanceof IllIIlllllIIllIIllIl) ? this.llllIIIIlIIIlIlllIll(this.IlIIIlIlIIIllIlIlIIl / 2 - 155 + n, 0, (IllIIlllllIIllIIllIl)lIllIIIIIlllIIlIIllI, b) : null)));
    }
    
    public void llllIIIIlIIIlIlllIll(final boolean b) {
        for (final lllllIIIIIlIlIIIIIIl lllllIIIIIlIlIIIIIIl : this.llllIIIIlIIIlIlllIll) {
            if (lllllIIIIIlIlIIIIIIl.IlIlIlIlIlllllllllIl instanceof IlIIIlIlIIIllIlIlIIl) {
                ((IlIIIlIlIIIllIlIlIIl)lllllIIIIIlIlIIIIIIl.IlIlIlIlIlllllllllIl).lIlIlIIIllIIllIIIllI = b;
            }
            if (lllllIIIIIlIlIIIIIIl.llIllIIIIIllIlIIIIlI instanceof IlIIIlIlIIIllIlIlIIl) {
                ((IlIIIlIlIIIllIlIlIIl)lllllIIIIIlIlIIIIIIl.llIllIIIIIllIlIIIIlI).lIlIlIIIllIIllIIIllI = b;
            }
        }
    }
    
    @Override
    public boolean IlIlIlIlIlllllllllIl(final int n, final int n2, final int n3) {
        final boolean ilIlIlIlIlllllllllIl = super.IlIlIlIlIlllllllllIl(n, n2, n3);
        final int llIllIIIIIllIlIIIIlI = this.llIllIIIIIllIlIIIIlI(n, n2);
        if (llIllIIIIIllIlIIIIlI >= 0) {
            final lllllIIIIIlIlIIIIIIl ilIlIIIllIllIIIIIllI = this.IlIlIIIllIllIIIIIllI(llIllIIIIIllIlIIIIlI);
            if (this.IIlllIlIIllIlIlIlIIl != ilIlIIIllIllIIIIIllI.IlIIIlIlIIIllIlIlIIl && this.IIlllIlIIllIlIlIlIIl != null && this.IIlllIlIIllIlIlIlIIl instanceof lIIlIIIIIIIlIIlIlIIl) {
                ((lIIlIIIIIIIlIIlIlIIl)this.IIlllIlIIllIlIlIlIIl).IlIlIlIlIlllllllllIl(false);
            }
            this.IIlllIlIIllIlIlIlIIl = ilIlIIIllIllIIIIIllI.IlIIIlIlIIIllIlIlIIl;
        }
        return ilIlIlIlIlllllllllIl;
    }
    
    private IIlIlllIlIlllIlIllll llllIIIIlIIIlIlllIll(final int n, final int n2, final llIIIllIlIllIllIIIIl llIIIllIlIllIllIIIIl) {
        final IIlIlllIlIlllIlIllll ilIlllIlIlllIlIllll = new IIlIlllIlIlllIlIllll(this.IlIlIllllllllIIIIlII, llIIIllIlIllIllIIIIl.IlIlIlIlIlllllllllIl(), n, n2, llIIIllIlIllIllIIIIl.llIllIIIIIllIlIIIIlI(), llIIIllIlIllIllIIIIl.IlIlIIIllIllIIIIIllI(), llIIIllIlIllIllIIIIl.IllIIlllIIIIlllIIlIl(), llIIIllIlIllIllIIIIl.llllIIIlIlllIlIIIIIl(), llIIIllIlIllIllIIIIl.llllIIIIlIIIlIlllIll());
        ilIlllIlIlllIlIllll.IlIlIIIllIIllIlllllI = llIIIllIlIllIllIIIIl.IlIIIlIlIIIllIlIlIIl();
        return ilIlllIlIlllIlIllll;
    }
    
    private IlIIIlIIIllllIlIlIlI llllIIIIlIIIlIlllIll(final int n, final int n2, final IlIIllIIllIIllIIlIIl ilIIllIIllIIllIIlIIl) {
        final IlIIIlIIIllllIlIlIlI ilIIIlIIIllllIlIlIlI = new IlIIIlIIIllllIlIlIlI(this.IlIlIllllllllIIIIlII, ilIIllIIllIIllIIlIIl.IlIlIlIlIlllllllllIl(), n, n2, ilIIllIIllIIllIIlIIl.llIllIIIIIllIlIIIIlI(), ilIIllIIllIIllIIlIIl.llllIIIIlIIIlIlllIll());
        ilIIIlIIIllllIlIlIlI.IlIlIIIllIIllIlllllI = ilIIllIIllIIllIIlIIl.IlIIIlIlIIIllIlIlIIl();
        return ilIIIlIIIllllIlIlIlI;
    }
    
    private lIIlIIIIIIIlIIlIlIIl llllIIIIlIIIlIlllIll(final int n, final int n2, final llIIIlIlllIllIIlIllI llIIIlIlllIllIIlIllI) {
        final lIIlIIIIIIIlIIlIlIIl liIlIIIIIIIlIIlIlIIl = new lIIlIIIIIIIlIIlIlIIl(llIIIlIlllIllIIlIllI.IlIlIlIlIlllllllllIl(), this.llIllIIIIIllIlIIIIlI.lIlIlIIIllIIllIIIllI, n, n2, 150, 20);
        liIlIIIIIIIlIIlIlIIl.llllIIIIlIIIlIlllIll(llIIIlIlllIllIIlIllI.llIllIIIIIllIlIIIIlI());
        liIlIIIIIIIlIIlIlIIl.llllIIIIlIIIlIlllIll(this.IlIlIllllllllIIIIlII);
        liIlIIIIIIIlIIlIlIIl.IlIlIIIllIllIIIIIllI(llIIIlIlllIllIIlIllI.IlIIIlIlIIIllIlIlIIl());
        liIlIIIIIIIlIIlIlIIl.llllIIIIlIIIlIlllIll(llIIIlIlllIllIIlIllI.llllIIIIlIIIlIlllIll());
        return liIlIIIIIIIlIIlIlIIl;
    }
    
    private IIlIIIIIllIlIIIlIIll llllIIIIlIIIlIlllIll(final int n, final int n2, final IllIIlllllIIllIIllIl illIIlllllIIllIIllIl, final boolean b) {
        IIlIIIIIllIlIIIlIIll ilIIIIIllIlIIIlIIll;
        if (b) {
            ilIIIIIllIlIIIlIIll = new IIlIIIIIllIlIIIlIIll(this.llIllIIIIIllIlIIIIlI.lIlIlIIIllIIllIIIllI, illIIlllllIIllIIllIl.IlIlIlIlIlllllllllIl(), n, n2, this.IlIIIlIlIIIllIlIlIIl - n * 2, 20, -1);
        }
        else {
            ilIIIIIllIlIIIlIIll = new IIlIIIIIllIlIIIlIIll(this.llIllIIIIIllIlIIIIlI.lIlIlIIIllIIllIIIllI, illIIlllllIIllIIllIl.IlIlIlIlIlllllllllIl(), n, n2, 150, 20, -1);
        }
        ilIIIIIllIlIIIlIIll.llIIlIIIlIIIllIlIIIl = illIIlllllIIllIIllIl.IlIIIlIlIIIllIlIlIIl();
        ilIIIIIllIlIIIlIIll.llllIIIIlIIIlIlllIll(illIIlllllIIllIIllIl.llIllIIIIIllIlIIIIlI());
        ilIIIIIllIlIIIlIIll.llllIIIIlIIIlIlllIll();
        return ilIIIIIllIlIIIlIIll;
    }
    
    public void llllIIIIlIIIlIlllIll(final char c, final int n) {
        if (this.IIlllIlIIllIlIlIlIIl instanceof lIIlIIIIIIIlIIlIlIIl) {
            final lIIlIIIIIIIlIIlIlIIl liIlIIIIIIIlIIlIlIIl = (lIIlIIIIIIIlIIlIlIIl)this.IIlllIlIIllIlIlIlIIl;
            if (!lIIllIIIllllIlllIllI.IlIlIIIllIllIIIIIllI(n)) {
                if (n == 15) {
                    liIlIIIIIIIlIIlIlIIl.IlIlIlIlIlllllllllIl(false);
                    int index = this.IlllllllIIIlIIIlIlII.indexOf(this.IIlllIlIIllIlIlIlIIl);
                    if (lIIllIIIllllIlllIllI.llllIIllllIlIlIIIIll()) {
                        if (index == 0) {
                            index = this.IlllllllIIIlIIIlIlII.size() - 1;
                        }
                        else {
                            --index;
                        }
                    }
                    else if (index == this.IlllllllIIIlIIIlIlII.size() - 1) {
                        index = 0;
                    }
                    else {
                        ++index;
                    }
                    this.IIlllIlIIllIlIlIlIIl = (llIllIIIIIllIlIIIIlI)this.IlllllllIIIlIIIlIlII.get(index);
                    final lIIlIIIIIIIlIIlIlIIl liIlIIIIIIIlIIlIlIIl2 = (lIIlIIIIIIIlIIlIlIIl)this.IIlllIlIIllIlIlIlIIl;
                    liIlIIIIIIIlIIlIlIIl2.IlIlIlIlIlllllllllIl(true);
                    final int n2 = liIlIIIIIIIlIIlIlIIl2.IllIIlllIIIIlllIIlIl + this.llIIlIIIlIIIllIlIIIl;
                    final int illIIlllIIIIlllIIlIl = liIlIIIIIIIlIIlIlIIl2.IllIIlllIIIIlllIIlIl;
                    if (n2 > this.llllIIIlIlllIlIIIIIl) {
                        this.IlIllIlIlIIIlIlIlIII += n2 - this.llllIIIlIlllIlIIIIIl;
                    }
                    else if (illIIlllIIIIlllIIlIl < this.IllIIlllIIIIlllIIlIl) {
                        this.IlIllIlIlIIIlIlIlIII = (float)illIIlllIIIIlllIIlIl;
                    }
                }
                else {
                    liIlIIIIIIIlIIlIlIIl.llllIIIIlIIIlIlllIll(c, n);
                }
            }
            else {
                final String[] split = lIIllIIIllllIlllIllI.llIIlIIIlIIIllIlIIIl().split(";");
                int index2;
                final int n3 = index2 = this.IlllllllIIIlIIIlIlII.indexOf(this.IIlllIlIIllIlIlIlIIl);
                String[] array;
                for (int length = (array = split).length, i = 0; i < length; ++i) {
                    this.IlllllllIIIlIIIlIlII.get(index2).llllIIIIlIIIlIlllIll(array[i]);
                    if (index2 == this.IlllllllIIIlIIIlIlII.size() - 1) {
                        index2 = 0;
                    }
                    else {
                        ++index2;
                    }
                    if (index2 == n3) {
                        break;
                    }
                }
            }
        }
    }
    
    public lllllIIIIIlIlIIIIIIl IlIlIIIllIllIIIIIllI(final int n) {
        return this.llllIIIIlIIIlIlllIll.get(n);
    }
    
    public int llllIIIIlIIIlIlllIll() {
        return this.llllIIIIlIIIlIlllIll.size();
    }
    
    @Override
    public int m_() {
        return 400;
    }
    
    @Override
    protected int llllIIIlIlllIlIIIIIl() {
        return super.llllIIIlIlllIlIIIIIl() + 32;
    }
}
