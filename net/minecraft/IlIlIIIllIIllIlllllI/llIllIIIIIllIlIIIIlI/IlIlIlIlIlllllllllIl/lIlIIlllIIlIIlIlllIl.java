package net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl;

import net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.*;
import com.google.common.collect.*;
import net.minecraft.IIIlIIIlIlIIlllIIlll.*;
import java.util.*;
import net.minecraft.IlIlIIIllIIllIlllllI.*;

public class lIlIIlllIIlIIlIlllIl implements IIlIIIIIllIlIIIlIIll
{
    private Map llllIIIIlIIIlIlllIll;
    
    public lIlIIlllIIlIIlIlllIl() {
    }
    
    public lIlIIlllIIlIIlIlllIl(final Map llllIIIIlIIIlIlllIll) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
    }
    
    public void llllIIIIlIIIlIlllIll(final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(this);
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final llllllIllIllIlIllllI llllllIllIllIlIllllI) {
        final int ilIIIlIlIIIllIlIlIIl = llllllIllIllIlIllllI.IlIIIlIlIIIllIlIlIIl();
        this.llllIIIIlIIIlIlllIll = Maps.newHashMap();
        for (int i = 0; i < ilIIIlIlIIIllIlIlIIl; ++i) {
            final IllIIlllIIIIlllIIlIl llllIIIIlIIIlIlllIll = IIIIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll(llllllIllIllIlIllllI.llIllIIIIIllIlIIIIlI(32767));
            final int ilIIIlIlIIIllIlIlIIl2 = llllllIllIllIlIllllI.IlIIIlIlIIIllIlIlIIl();
            if (llllIIIIlIIIlIlllIll != null) {
                this.llllIIIIlIIIlIlllIll.put(llllIIIIlIIIlIlllIll, ilIIIlIlIIIllIlIlIIl2);
            }
        }
    }
    
    @Override
    public void IlIlIlIlIlllllllllIl(final llllllIllIllIlIllllI llllllIllIllIlIllllI) {
        llllllIllIllIlIllllI.IlIlIlIlIlllllllllIl(this.llllIIIIlIIIlIlllIll.size());
        for (final Map.Entry<IllIIlllIIIIlllIIlIl, V> entry : this.llllIIIIlIIIlIlllIll.entrySet()) {
            llllllIllIllIlIllllI.llllIIIIlIIIlIlllIll(entry.getKey().IlIlIIIllIllIIIIIllI);
            llllllIllIllIlIllllI.IlIlIlIlIlllllllllIl((int)entry.getValue());
        }
    }
    
    public Map llllIIIIlIIIlIlllIll() {
        return this.llllIIIIlIIIlIlllIll;
    }
}
