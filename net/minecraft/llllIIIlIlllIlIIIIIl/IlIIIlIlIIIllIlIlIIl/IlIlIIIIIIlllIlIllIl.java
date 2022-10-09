package net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl;

import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import com.google.common.collect.*;
import java.util.*;
import net.minecraft.lIlIlIIIllIIllIIIllI.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.llIllIlIIIIllIlIIllI.*;

public class IlIlIIIIIIlllIlIllIl extends lIlIlIIIllIIllIIIllI
{
    public IIllIIllIIIlIlIIIIlI llIllIIIIIllIlIIIIlI;
    
    public IlIlIIIIIIlllIlIllIl(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII) {
        super(illlllllIIIlIIIlIlII);
    }
    
    public IlIlIIIIIIlllIlIllIl(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final lllIllIIIllllllIllll lllIllIIIllllllIllll) {
        super(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl);
        final ArrayList arrayList = Lists.newArrayList();
        IIllIIllIIIlIlIIIIlI[] values;
        for (int length = (values = net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl.IIllIIllIIIlIlIIIIlI.values()).length, i = 0; i < length; ++i) {
            final IIllIIllIIIlIlIIIIlI llIllIIIIIllIlIIIIlI = values[i];
            this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
            this.llllIIIIlIIIlIlllIll(lllIllIIIllllllIllll);
            if (this.llllIIIlIlllIlIIIIIl()) {
                arrayList.add(llIllIIIIIllIlIIIIlI);
            }
        }
        if (!arrayList.isEmpty()) {
            this.llIllIIIIIllIlIIIIlI = (IIllIIllIIIlIlIIIIlI)arrayList.get(this.IlIIllIIllIIllIIlIIl.nextInt(arrayList.size()));
        }
        this.llllIIIIlIIIlIlllIll(lllIllIIIllllllIllll);
    }
    
    public IlIlIIIIIIlllIlIllIl(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final lllIllIIIllllllIllll lllIllIIIllllllIllll, final String s) {
        this(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl, lllIllIIIllllllIllll);
        IIllIIllIIIlIlIIIIlI[] values;
        for (int length = (values = net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl.IIllIIllIIIlIlIIIIlI.values()).length, i = 0; i < length; ++i) {
            final IIllIIllIIIlIlIIIIlI llIllIIIIIllIlIIIIlI = values[i];
            if (llIllIIIIIllIlIIIIlI.llIIIlIlIllIIlIlIlII.equals(s)) {
                this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
                break;
            }
        }
        this.llllIIIIlIIIlIlllIll(lllIllIIIllllllIllll);
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll) {
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("Motive", this.llIllIIIIIllIlIIIIlI.llIIIlIlIllIIlIlIlII);
        super.llllIIIIlIIIlIlllIll(iiiIlllIIIIIIlIIIlll);
    }
    
    @Override
    public void IlIlIlIlIlllllllllIl(final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll) {
        final String llIIlIIIlIIIllIlIIIl = iiiIlllIIIIIIlIIIlll.llIIlIIIlIIIllIlIIIl("Motive");
        IIllIIllIIIlIlIIIIlI[] values;
        for (int length = (values = net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl.IIllIIllIIIlIlIIIIlI.values()).length, i = 0; i < length; ++i) {
            final IIllIIllIIIlIlIIIIlI llIllIIIIIllIlIIIIlI = values[i];
            if (llIllIIIIIllIlIIIIlI.llIIIlIlIllIIlIlIlII.equals(llIIlIIIlIIIllIlIIIl)) {
                this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
            }
        }
        if (this.llIllIIIIIllIlIIIIlI == null) {
            this.llIllIIIIIllIlIIIIlI = net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll;
        }
        super.IlIlIlIlIlllllllllIl(iiiIlllIIIIIIlIIIlll);
    }
    
    @Override
    public int lIIIIlIIIIIlllIllIII() {
        return this.llIllIIIIIllIlIIIIlI.lllllIlIIIlIlIIlllII;
    }
    
    @Override
    public int lIIIlllIIIllIIIllIII() {
        return this.llIllIIIIIllIlIIIIlI.lIllllllIIllIlIlIlII;
    }
    
    @Override
    public void IlIlIlIlIlllllllllIl(final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI) {
        if (this.IlllllllIIIlIIIlIlII.llIIlllIIlllIIllIllI().IlIlIlIlIlllllllllIl("doEntityDrops")) {
            if (llIllIIIIIllIlIIIIlI instanceof llllIIIIlIIIlIlllIll && ((llllIIIIlIIIlIlllIll)llIllIIIIIllIlIIIIlI).K.IlIIIlIlIIIllIlIlIIl) {
                return;
            }
            this.llllIIIIlIIIlIlllIll(new lllIIIIlIlIllIIlIIIl(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.IIlllllIllIllIlIlIII), 0.0f);
        }
    }
    
    @Override
    public void IlIlIlIlIlllllllllIl(final double n, final double n2, final double n3, final float n4, final float n5) {
        final IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll = this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(n - this.IIlllIlIIllIlIlIlIIl, n2 - this.llIIIlIlIllIIlIlIlII, n3 - this.lllllIlIIIlIlIIlllII);
        this.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII(), llllIIIIlIIIlIlllIll.lIIIlllIIIllIIIllIII(), (double)llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl());
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final double n, final double n2, final double n3, final float n4, final float n5, final int n6, final boolean b) {
        final IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll = this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(n - this.IIlllIlIIllIlIlIlIIl, n2 - this.llIIIlIlIllIIlIlIlII, n3 - this.lllllIlIIIlIlIIlllII);
        this.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII(), llllIIIIlIIIlIlllIll.lIIIlllIIIllIIIllIII(), (double)llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl());
    }
}
