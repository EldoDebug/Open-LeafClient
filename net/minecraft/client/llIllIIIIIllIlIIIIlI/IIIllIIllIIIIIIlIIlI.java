package net.minecraft.client.llIllIIIIIllIlIIIIlI;

import net.minecraft.IIlllIIlIllIllIlIIll.*;
import com.google.common.collect.*;
import net.minecraft.llIllIlIIIIllIlIIllI.*;
import java.util.*;

public class IIIllIIllIIIIIIlIIlI extends lIIllIIIllllIlllIllI
{
    private IIIIlllIIIIIIlIIIlll IlIlIIIllIllIIIIIllI;
    
    public IIIllIIllIIIIIIlIIlI(final IIIIlllIIIIIIlIIIlll ilIlIIIllIllIIIIIllI) {
        this.IlIlIIIllIllIIIIIllI = ilIlIIIllIllIIIIIllI;
        super.IIlllIIlIllIllIlIIll = Collections.synchronizedList((List<Object>)Lists.newArrayList());
    }
    
    public IIIIlllIIIIIIlIIIlll IlIlIIIllIllIIIIIllI() {
        return this.IlIlIIIllIllIIIIIllI;
    }
    
    @Override
    public void n_() {
        this.IlIlIIIllIllIIIIIllI.init();
        super.n_();
    }
    
    public void llllIIIIlIIIlIlllIll(final String s, final int n, final int n2, final int n3) {
        super.llllIIIIlIIIlIlllIll(this.IIllIIllIIIlIlIIIIlI, s, n, n2, n3);
    }
    
    public void llllIIIIlIIIlIlllIll(final String s, final int n, final int n2, final int n3, final boolean b) {
        if (b) {
            super.IlIlIlIlIlllllllllIl(this.IIllIIllIIIlIlIIIIlI, s, n, n2, n3);
        }
        else {
            this.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll(s, n, n2, n3);
        }
    }
    
    @Override
    public void IlIlIlIlIlllllllllIl(final int n, final int n2, final int n3, final int n4, final int n5, final int n6) {
        this.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll(n, n2, n3, n4, n5, n6);
        super.IlIlIlIlIlllllllllIl(n, n2, n3, n4, n5, n6);
    }
    
    public void llllIIIIlIIIlIlllIll(final int n, final int n2, final int n3, final int n4, final int n5, final int n6) {
        super.llllIIIIlIIIlIlllIll(n, n2, n3, n4, n5, n6);
    }
    
    @Override
    public void IlIlIIIllIIllIlllllI() {
        super.IlIlIIIllIIllIlllllI();
    }
    
    @Override
    public boolean IllIIlllIIIIlllIIlIl() {
        return super.IllIIlllIIIIlllIIlIl();
    }
    
    @Override
    public void IlIlIlIlIlllllllllIl(final int n) {
        super.IlIlIlIlIlllllllllIl(n);
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final int n, final int n2, final float n3) {
        this.IlIlIIIllIllIIIIIllI.render(n, n2, n3);
    }
    
    public void llllIIIIlIIIlIlllIll(final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl, final int n, final int n2) {
        super.llllIIIIlIIIlIlllIll(lllIIIIlIlIllIIlIIIl, n, n2);
    }
    
    public void llllIIIIlIIIlIlllIll(final String s, final int n, final int n2) {
        super.llllIIIIlIIIlIlllIll(s, n, n2);
    }
    
    public void llllIIIIlIIIlIlllIll(final List list, final int n, final int n2) {
        super.llllIIIIlIIIlIlllIll(list, n, n2);
    }
    
    @Override
    public void IlIIIlIlIIIllIlIlIIl() {
        this.IlIlIIIllIllIIIIIllI.tick();
        super.IlIIIlIlIIIllIlIlIIl();
    }
    
    public int llllIIIlIlllIlIIIIIl() {
        return this.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll;
    }
    
    public int llllIIIIlIIIlIlllIll(final String s) {
        return this.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll(s);
    }
    
    public void IlIlIlIlIlllllllllIl(final String s, final int n, final int n2, final int n3) {
        this.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll(s, (float)n, (float)n2, n3);
    }
    
    public List llllIIIIlIIIlIlllIll(final String s, final int n) {
        return this.IIllIIllIIIlIlIIIIlI.llIllIIIIIllIlIIIIlI(s, n);
    }
    
    public final void llllIIIIlIIIlIlllIll(final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl) {
        this.IlIlIIIllIllIIIIIllI.buttonClicked(((IllIIlllIIIIlllIIlIl)ilIIIlIlIIIllIlIlIIl).IllIIlllIIIIlllIIlIl());
    }
    
    public void lIIIIlIIIIIlllIllIII() {
        super.IIlllIIlIllIllIlIIll.clear();
    }
    
    public void llllIIIIlIIIlIlllIll(final net.minecraft.IIlllIIlIllIllIlIIll.IllIIlllIIIIlllIIlIl illIIlllIIIIlllIIlIl) {
        super.IIlllIIlIllIllIlIIll.add(illIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll());
    }
    
    public List lIIIlllIIIllIIIllIII() {
        final ArrayList arrayListWithExpectedSize = Lists.newArrayListWithExpectedSize(super.IIlllIIlIllIllIlIIll.size());
        final Iterator<IlIIIlIlIIIllIlIlIIl> iterator = super.IIlllIIlIllIllIlIIll.iterator();
        while (iterator.hasNext()) {
            arrayListWithExpectedSize.add(((IllIIlllIIIIlllIIlIl)iterator.next()).IllIIlllIIIIlllIIlIl());
        }
        return arrayListWithExpectedSize;
    }
    
    public void IlIlIlIlIlllllllllIl(final net.minecraft.IIlllIIlIllIllIlIIll.IllIIlllIIIIlllIIlIl illIIlllIIIIlllIIlIl) {
        super.IIlllIIlIllIllIlIIll.remove(illIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll());
    }
    
    public void llllIIIIlIIIlIlllIll(final int n, final int n2, final int n3) {
        this.IlIlIIIllIllIIIIIllI.mouseClicked(n, n2, n3);
        super.llllIIIIlIIIlIlllIll(n, n2, n3);
    }
    
    @Override
    public void IlIlIlIlIlllllllllIl() {
        this.IlIlIIIllIllIIIIIllI.mouseEvent();
        super.IlIlIlIlIlllllllllIl();
    }
    
    @Override
    public void lIlIlIIIllIIllIIIllI() {
        this.IlIlIIIllIllIIIIIllI.lIIIlllIIIllIIIllIII();
        super.lIlIlIIIllIIllIIIllI();
    }
    
    public void IlIlIlIlIlllllllllIl(final int n, final int n2, final int n3) {
        this.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll(n, n2, n3);
    }
    
    public void llllIIIIlIIIlIlllIll(final int n, final int n2, final int n3, final long n4) {
        this.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll(n, n2, n3, n4);
    }
    
    public void llllIIIIlIIIlIlllIll(final char c, final int n) {
        this.IlIlIIIllIllIIIIIllI.keyPressed(c, n);
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final boolean b, final int n) {
        this.IlIlIIIllIllIIIIIllI.confirmResult(b, n);
    }
    
    @Override
    public void o_() {
        this.IlIlIIIllIllIIIIIllI.removed();
        super.o_();
    }
}
