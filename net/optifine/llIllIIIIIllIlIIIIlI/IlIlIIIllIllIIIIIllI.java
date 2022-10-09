package net.optifine.llIllIIIIIllIlIIIIlI;

import com.google.common.collect.*;
import net.minecraft.client.llIIlIIIlIIIllIlIIIl.*;
import net.minecraft.client.llIllIIIIIllIlIIIIlI.*;
import net.minecraft.IIllIIllIIIlIlIIIIlI.*;
import java.util.*;

public class IlIlIIIllIllIIIIIllI extends lIIllIIIllllIlllIllI
{
    private lIIllIIIllllIlllIllI IllIIlllIIIIlllIIlIl;
    private String llllIIIlIlllIlIIIIIl;
    private String lIIIIlIIIIIlllIllIII;
    private final List lIIIlllIIIllIIIllIII;
    protected String IlIlIIIllIllIIIIIllI;
    private int llIIlIIIlIIIllIlIIIl;
    
    public IlIlIIIllIllIIIIIllI(final lIIllIIIllllIlllIllI illIIlllIIIIlllIIlIl, final String llllIIIlIlllIlIIIIIl, final String liiiIlIIIIIlllIllIII) {
        this.lIIIlllIIIllIIIllIII = Lists.newArrayList();
        this.IllIIlllIIIIlllIIlIl = illIIlllIIIIlllIIlIl;
        this.llllIIIlIlllIlIIIIIl = llllIIIlIlllIlIIIIIl;
        this.lIIIIlIIIIIlllIllIII = liiiIlIIIIIlllIllIII;
        this.IlIlIIIllIllIIIIIllI = net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("gui.done", new Object[0]);
    }
    
    @Override
    public void n_() {
        this.IIlllIIlIllIllIlIIll.add(new llIlIIIIIlIIlIlIIlll(0, this.llllIIllllIlIlIIIIll / 2 - 74, this.IlIllIlIlIIIlIlIlIII / 6 + 96, this.IlIlIIIllIllIIIIIllI));
        this.lIIIlllIIIllIIIllIII.clear();
        this.lIIIlllIIIllIIIllIII.addAll(this.IIllIIllIIIlIlIIIIlI.llIllIIIIIllIlIIIIlI(this.lIIIIlIIIIIlllIllIII, this.llllIIllllIlIlIIIIll - 50));
    }
    
    @Override
    protected void llllIIIIlIIIlIlllIll(final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl) {
        net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.lIIIIlIlIllllIIlIllI().llllIIIIlIIIlIlllIll(this.IllIIlllIIIIlllIIlIl);
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final int n, final int n2, final float n3) {
        this.IlIlIIIllIIllIlllllI();
        this.llllIIIIlIIIlIlllIll(this.IIllIIllIIIlIlIIIIlI, this.llllIIIlIlllIlIIIIIl, this.llllIIllllIlIlIIIIll / 2, 70, 16777215);
        int n4 = 90;
        final Iterator<String> iterator = this.lIIIlllIIIllIIIllIII.iterator();
        while (iterator.hasNext()) {
            this.llllIIIIlIIIlIlllIll(this.IIllIIllIIIlIlIIIIlI, iterator.next(), this.llllIIllllIlIlIIIIll / 2, n4, 16777215);
            n4 += this.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll;
        }
        super.llllIIIIlIIIlIlllIll(n, n2, n3);
    }
    
    public void llllIIIIlIIIlIlllIll(final int llIIlIIIlIIIllIlIIIl) {
        this.llIIlIIIlIIIllIlIIIl = llIIlIIIlIIIllIlIIIl;
        final Iterator<IlIIIlIlIIIllIlIlIIl> iterator = this.IIlllIIlIllIllIlIIll.iterator();
        while (iterator.hasNext()) {
            iterator.next().lIlIlIIIllIIllIIIllI = false;
        }
    }
    
    @Override
    public void IlIIIlIlIIIllIlIlIIl() {
        super.IlIIIlIlIIIllIlIlIIl();
        final int llIIlIIIlIIIllIlIIIl = this.llIIlIIIlIIIllIlIIIl - 1;
        this.llIIlIIIlIIIllIlIIIl = llIIlIIIlIIIllIlIIIl;
        if (llIIlIIIlIIIllIlIIIl == 0) {
            final Iterator<IlIIIlIlIIIllIlIlIIl> iterator = (Iterator<IlIIIlIlIIIllIlIlIIl>)this.IIlllIIlIllIllIlIIll.iterator();
            while (iterator.hasNext()) {
                iterator.next().lIlIlIIIllIIllIIIllI = true;
            }
        }
    }
}
