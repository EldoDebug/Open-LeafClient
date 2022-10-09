package net.optifine.shaders.llIllIIIIIllIlIIIIlI;

import net.optifine.expr.*;
import java.util.*;

public class IlIlIlIlIlllllllllIl
{
    private llllIIIIlIIIlIlllIll[] llllIIIIlIIIlIlllIll;
    private lIlIlIIIllIIllIIIllI[] IlIlIlIlIlllllllllIl;
    
    public IlIlIlIlIlllllllllIl(final llllIIIIlIIIlIlllIll[] llllIIIIlIIIlIlllIll, final Map map) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        final ArrayList<lIlIlIIIllIIllIIIllI> list = new ArrayList<lIlIlIIIllIIllIIIllI>();
        final Iterator<String> iterator = map.keySet().iterator();
        while (iterator.hasNext()) {
            final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl = (llIIlIIIlIIIllIlIIIl)map.get(iterator.next());
            if (llIIlIIIlIIIllIlIIIl instanceof lIlIlIIIllIIllIIIllI) {
                list.add((lIlIlIIIllIIllIIIllI)llIIlIIIlIIIllIlIIIl);
            }
        }
        this.IlIlIlIlIlllllllllIl = list.toArray(new lIlIlIIIllIIllIIIllI[list.size()]);
    }
    
    public void llllIIIIlIIIlIlllIll(final int n) {
        for (int i = 0; i < this.llllIIIIlIIIlIlllIll.length; ++i) {
            this.llllIIIIlIIIlIlllIll[i].llllIIIIlIIIlIlllIll(n);
        }
    }
    
    public void llllIIIIlIIIlIlllIll() {
        this.llIllIIIIIllIlIIIIlI();
        for (int i = 0; i < this.llllIIIIlIIIlIlllIll.length; ++i) {
            this.llllIIIIlIIIlIlllIll[i].llllIIIIlIIIlIlllIll();
        }
    }
    
    private void llIllIIIIIllIlIIIIlI() {
        for (int i = 0; i < this.IlIlIlIlIlllllllllIl.length; ++i) {
            this.IlIlIlIlIlllllllllIl[i].llIllIIIIIllIlIIIIlI();
        }
    }
    
    public void IlIlIlIlIlllllllllIl() {
        for (int i = 0; i < this.llllIIIIlIIIlIlllIll.length; ++i) {
            this.llllIIIIlIIIlIlllIll[i].IlIlIlIlIlllllllllIl();
        }
    }
}
