package net.minecraft.client.llIllIIIIIllIlIIIIlI;

import com.google.common.collect.*;
import net.minecraft.client.llIIlIIIlIIIllIlIIIl.*;
import net.minecraft.client.llIllIlIIIIllIlIIllI.*;
import java.util.*;

public class lIllIlIIIllllllIIlII extends lIIllIIIllllIlllIllI
{
    private final lIIllIIIllllIlllIllI IlIlIIIllIllIIIIIllI;
    private final llllIIIIlIIIlIlllIll IllIIlllIIIIlllIIlIl;
    private final List llllIIIlIlllIlIIIIIl;
    private final List lIIIIlIIIIIlllIllIII;
    private String lIIIlllIIIllIIIllIII;
    private String[] llIIlIIIlIIIllIlIIIl;
    private IlIllIIllIIlIIIIlIIl llIllIlIIIIllIlIIllI;
    private IlIIIlIlIIIllIlIlIIl lIlIlIIIllIIllIIIllI;
    
    public lIllIlIIIllllllIIlII(final lIIllIIIllllIlllIllI ilIlIIIllIllIIIIIllI, final llllIIIIlIIIlIlllIll illIIlllIIIIlllIIlIl) {
        this.llllIIIlIlllIlIIIIIl = Lists.newArrayList();
        this.lIIIIlIIIIIlllIllIII = Lists.newArrayList();
        this.IlIlIIIllIllIIIIIllI = ilIlIIIllIllIIIIIllI;
        this.IllIIlllIIIIlllIIlIl = illIIlllIIIIlllIIlIl;
    }
    
    @Override
    public void n_() {
        this.lIIIlllIIIllIIIllIII = net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("options.snooper.title", new Object[0]);
        final String llllIIIIlIIIlIlllIll = net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("options.snooper.desc", new Object[0]);
        final ArrayList arrayList = Lists.newArrayList();
        final Iterator iterator = this.IIllIIllIIIlIlIIIIlI.llIllIIIIIllIlIIIIlI(llllIIIIlIIIlIlllIll, this.llllIIllllIlIlIIIIll - 30).iterator();
        while (iterator.hasNext()) {
            arrayList.add(iterator.next());
        }
        this.llIIlIIIlIIIllIlIIIl = arrayList.toArray(new String[arrayList.size()]);
        this.llllIIIlIlllIlIIIIIl.clear();
        this.lIIIIlIIIIIlllIllIII.clear();
        this.IIlllIIlIllIllIlIIll.add(this.lIlIlIIIllIIllIIIllI = new IlIIIlIlIIIllIlIlIIl(1, this.llllIIllllIlIlIIIIll / 2 - 152, this.IlIllIlIlIIIlIlIlIII - 30, 150, 20, this.IllIIlllIIIIlllIIlIl.llIllIIIIIllIlIIIIlI(net.minecraft.client.llIllIlIIIIllIlIIllI.llIllIIIIIllIlIIIIlI.IIIlIIIlIlIIlllIIlll)));
        this.IIlllIIlIllIllIlIIll.add(new IlIIIlIlIIIllIlIlIIl(2, this.llllIIllllIlIlIIIIll / 2 + 2, this.IlIllIlIlIIIlIlIlIII - 30, 150, 20, net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("gui.done", new Object[0])));
        final boolean b = this.IlIlIIIllIIllIlllllI.IIlllIIIlIlllIIlllII() != null && this.IlIlIIIllIIllIlllllI.IIlllIIIlIlllIIlllII().lIIllIIIllllIlllIllI() != null;
        for (final Map.Entry<Object, String> entry : new TreeMap<Object, String>(this.IlIlIIIllIIllIlllllI.llllllIllIllIlIllllI().llIllIIIIIllIlIIIIlI()).entrySet()) {
            this.llllIIIlIlllIlIIIIIl.add(String.valueOf(b ? "C " : "") + entry.getKey());
            this.lIIIIlIIIIIlllIllIII.add(this.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll(entry.getValue(), this.llllIIllllIlIlIIIIll - 220));
        }
        if (b) {
            for (final Map.Entry<String, Object> entry2 : new TreeMap<String, Object>(this.IlIlIIIllIIllIlllllI.IIlllIIIlIlllIIlllII().lIIllIIIllllIlllIllI().llIllIIIIIllIlIIIIlI()).entrySet()) {
                this.llllIIIlIlllIlIIIIIl.add("S " + entry2.getKey());
                this.lIIIIlIIIIIlllIllIII.add(this.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll(entry2.getValue(), this.llllIIllllIlIlIIIIll - 220));
            }
        }
        this.llIllIlIIIIllIlIIllI = new IlIllIIllIIlIIIIlIIl(this);
    }
    
    @Override
    public void IlIlIlIlIlllllllllIl() {
        super.IlIlIlIlIlllllllllIl();
        this.llIllIlIIIIllIlIIllI.lIIIIlIIIIIlllIllIII();
    }
    
    @Override
    protected void llllIIIIlIIIlIlllIll(final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl) {
        if (ilIIIlIlIIIllIlIlIIl.lIlIlIIIllIIllIIIllI) {
            if (ilIIIlIlIIIllIlIlIIl.llIllIlIIIIllIlIIllI == 2) {
                this.IllIIlllIIIIlllIIlIl.IlIlIlIlIlllllllllIl();
                this.IllIIlllIIIIlllIIlIl.IlIlIlIlIlllllllllIl();
                this.IlIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll(this.IlIlIIIllIllIIIIIllI);
            }
            if (ilIIIlIlIIIllIlIlIIl.llIllIlIIIIllIlIIllI == 1) {
                this.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll(net.minecraft.client.llIllIlIIIIllIlIIllI.llIllIIIIIllIlIIIIlI.IIIlIIIlIlIIlllIIlll, 1);
                this.lIlIlIIIllIIllIIIllI.llIIlIIIlIIIllIlIIIl = this.IllIIlllIIIIlllIIlIl.llIllIIIIIllIlIIIIlI(net.minecraft.client.llIllIlIIIIllIlIIllI.llIllIIIIIllIlIIIIlI.IIIlIIIlIlIIlllIIlll);
            }
        }
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final int n, final int n2, final float n3) {
        this.IlIlIIIllIIllIlllllI();
        this.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll(n, n2, n3);
        this.llllIIIIlIIIlIlllIll(this.IIllIIllIIIlIlIIIIlI, this.lIIIlllIIIllIIIllIII, this.llllIIllllIlIlIIIIll / 2, 8, 16777215);
        int n4 = 22;
        String[] llIIlIIIlIIIllIlIIIl;
        for (int length = (llIIlIIIlIIIllIlIIIl = this.llIIlIIIlIIIllIlIIIl).length, i = 0; i < length; ++i) {
            this.llllIIIIlIIIlIlllIll(this.IIllIIllIIIlIlIIIIlI, llIIlIIIlIIIllIlIIIl[i], this.llllIIllllIlIlIIIIll / 2, n4, 8421504);
            n4 += this.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll;
        }
        super.llllIIIIlIIIlIlllIll(n, n2, n3);
    }
}
