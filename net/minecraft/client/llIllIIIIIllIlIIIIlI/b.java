package net.minecraft.client.llIllIIIIIllIlIIIIlI;

import com.google.common.collect.*;
import net.minecraft.client.llIIlIIIlIIIllIlIIIl.*;
import java.util.*;

public class b extends lIIllIIIllllIlllIllI
{
    protected c IlIlIIIllIllIIIIIllI;
    protected String IllIIlllIIIIlllIIlIl;
    private String llIIlIIIlIIIllIlIIIl;
    private final List llIllIlIIIIllIlIIllI;
    protected String llllIIIlIlllIlIIIIIl;
    protected String lIIIIlIIIIIlllIllIII;
    protected int lIIIlllIIIllIIIllIII;
    private int lIlIlIIIllIIllIIIllI;
    
    public b(final c ilIlIIIllIllIIIIIllI, final String illIIlllIIIIlllIIlIl, final String llIIlIIIlIIIllIlIIIl, final int liiIlllIIIllIIIllIII) {
        this.llIllIlIIIIllIlIIllI = Lists.newArrayList();
        this.IlIlIIIllIllIIIIIllI = ilIlIIIllIllIIIIIllI;
        this.IllIIlllIIIIlllIIlIl = illIIlllIIIIlllIIlIl;
        this.llIIlIIIlIIIllIlIIIl = llIIlIIIlIIIllIlIIIl;
        this.lIIIlllIIIllIIIllIII = liiIlllIIIllIIIllIII;
        this.llllIIIlIlllIlIIIIIl = net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("gui.yes", new Object[0]);
        this.lIIIIlIIIIIlllIllIII = net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("gui.no", new Object[0]);
    }
    
    public b(final c ilIlIIIllIllIIIIIllI, final String illIIlllIIIIlllIIlIl, final String llIIlIIIlIIIllIlIIIl, final String llllIIIlIlllIlIIIIIl, final String liiiIlIIIIIlllIllIII, final int liiIlllIIIllIIIllIII) {
        this.llIllIlIIIIllIlIIllI = Lists.newArrayList();
        this.IlIlIIIllIllIIIIIllI = ilIlIIIllIllIIIIIllI;
        this.IllIIlllIIIIlllIIlIl = illIIlllIIIIlllIIlIl;
        this.llIIlIIIlIIIllIlIIIl = llIIlIIIlIIIllIlIIIl;
        this.llllIIIlIlllIlIIIIIl = llllIIIlIlllIlIIIIIl;
        this.lIIIIlIIIIIlllIllIII = liiiIlIIIIIlllIllIII;
        this.lIIIlllIIIllIIIllIII = liiIlllIIIllIIIllIII;
    }
    
    @Override
    public void n_() {
        this.IIlllIIlIllIllIlIIll.add(new llIlIIIIIlIIlIlIIlll(0, this.llllIIllllIlIlIIIIll / 2 - 155, this.IlIllIlIlIIIlIlIlIII / 6 + 96, this.llllIIIlIlllIlIIIIIl));
        this.IIlllIIlIllIllIlIIll.add(new llIlIIIIIlIIlIlIIlll(1, this.llllIIllllIlIlIIIIll / 2 - 155 + 160, this.IlIllIlIlIIIlIlIlIII / 6 + 96, this.lIIIIlIIIIIlllIllIII));
        this.llIllIlIIIIllIlIIllI.clear();
        this.llIllIlIIIIllIlIIllI.addAll(this.IIllIIllIIIlIlIIIIlI.llIllIIIIIllIlIIIIlI(this.llIIlIIIlIIIllIlIIIl, this.llllIIllllIlIlIIIIll - 50));
    }
    
    @Override
    protected void llllIIIIlIIIlIlllIll(final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl) {
        this.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll(ilIIIlIlIIIllIlIlIIl.llIllIlIIIIllIlIIllI == 0, this.lIIIlllIIIllIIIllIII);
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final int n, final int n2, final float n3) {
        this.IlIlIIIllIIllIlllllI();
        this.llllIIIIlIIIlIlllIll(this.IIllIIllIIIlIlIIIIlI, this.IllIIlllIIIIlllIIlIl, this.llllIIllllIlIlIIIIll / 2, 70, 16777215);
        int n4 = 90;
        final Iterator<String> iterator = this.llIllIlIIIIllIlIIllI.iterator();
        while (iterator.hasNext()) {
            this.llllIIIIlIIIlIlllIll(this.IIllIIllIIIlIlIIIIlI, iterator.next(), this.llllIIllllIlIlIIIIll / 2, n4, 16777215);
            n4 += this.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll;
        }
        super.llllIIIIlIIIlIlllIll(n, n2, n3);
    }
    
    public void llllIIIIlIIIlIlllIll(final int lIlIlIIIllIIllIIIllI) {
        this.lIlIlIIIllIIllIIIllI = lIlIlIIIllIIllIIIllI;
        final Iterator<IlIIIlIlIIIllIlIlIIl> iterator = this.IIlllIIlIllIllIlIIll.iterator();
        while (iterator.hasNext()) {
            iterator.next().lIlIlIIIllIIllIIIllI = false;
        }
    }
    
    @Override
    public void IlIIIlIlIIIllIlIlIIl() {
        super.IlIIIlIlIIIllIlIlIIl();
        final int lIlIlIIIllIIllIIIllI = this.lIlIlIIIllIIllIIIllI - 1;
        this.lIlIlIIIllIIllIIIllI = lIlIlIIIllIIllIIIllI;
        if (lIlIlIIIllIIllIIIllI == 0) {
            final Iterator<IlIIIlIlIIIllIlIlIIl> iterator = (Iterator<IlIIIlIlIIIllIlIlIIl>)this.IIlllIIlIllIllIlIIll.iterator();
            while (iterator.hasNext()) {
                iterator.next().lIlIlIIIllIIllIIIllI = true;
            }
        }
    }
}
