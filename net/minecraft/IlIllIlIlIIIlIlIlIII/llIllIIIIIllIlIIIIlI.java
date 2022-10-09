package net.minecraft.IlIllIlIlIIIlIlIlIII;

import com.google.common.collect.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import java.util.*;

class llIllIIIIIllIlIIIIlI extends TimerTask
{
    final /* synthetic */ IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll;
    
    llIllIIIIIllIlIIIIlI(final IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
    }
    
    @Override
    public void run() {
        if (this.llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI.llIIIlIlIllIIlIlIlII()) {
            final HashMap hashMap;
            synchronized (this.llllIIIIlIIIlIlllIll.llllIIIlIlllIlIIIIIl) {
                hashMap = Maps.newHashMap(this.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl);
                if (this.llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl == 0) {
                    hashMap.putAll(this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll);
                }
                final HashMap<Object, Object> hashMap2 = (HashMap<Object, Object>)hashMap;
                final String s = "snooper_count";
                final IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll = this.llllIIIIlIIIlIlllIll;
                final int ilIIIlIlIIIllIlIlIIl = llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl;
                IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll, ilIIIlIlIIIllIlIlIIl + 1);
                hashMap2.put(s, ilIIIlIlIIIllIlIlIIl);
                hashMap.put("snooper_token", this.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI);
            }
            // monitorexit(IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl(this.llllIIIIlIIIlIlllIll))
            IIlIIIlllIllIllIlIII.llllIIIIlIIIlIlllIll(this.llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl, hashMap, true);
        }
    }
}
