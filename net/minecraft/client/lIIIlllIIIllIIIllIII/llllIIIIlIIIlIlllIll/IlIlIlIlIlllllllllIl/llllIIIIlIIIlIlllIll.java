package net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl;

import com.google.common.collect.*;
import com.google.common.base.*;
import java.util.*;

public class llllIIIIlIIIlIlllIll
{
    private Map llllIIIIlIIIlIlllIll;
    private Set IlIlIlIlIlllllllllIl;
    
    public llllIIIIlIIIlIlllIll() {
        this.llllIIIIlIIIlIlllIll = Maps.newIdentityHashMap();
        this.IlIlIlIlIlllllllllIl = Sets.newIdentityHashSet();
    }
    
    public void llllIIIIlIIIlIlllIll(final net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI) {
        this.llllIIIIlIIIlIlllIll.put(llllIIIIlIIIlIlllIll, llIllIIIIIllIlIIIIlI);
    }
    
    public void llllIIIIlIIIlIlllIll(final net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll... array) {
        Collections.addAll(this.IlIlIlIlIlllllllllIl, array);
    }
    
    public Map llllIIIIlIIIlIlllIll() {
        final IdentityHashMap identityHashMap = Maps.newIdentityHashMap();
        for (final net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll : net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll) {
            if (!this.IlIlIlIlIlllllllllIl.contains(llllIIIIlIIIlIlllIll)) {
                identityHashMap.putAll(((llIllIIIIIllIlIIIIlI)Objects.firstNonNull((Object)this.llllIIIIlIIIlIlllIll.get(llllIIIIlIIIlIlllIll), (Object)new IlIlIlIlIlllllllllIl())).llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll));
            }
        }
        return identityHashMap;
    }
}
