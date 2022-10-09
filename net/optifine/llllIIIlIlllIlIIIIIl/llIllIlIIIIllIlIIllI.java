package net.optifine.llllIIIlIlllIlIIIIIl;

import net.minecraft.client.lIIIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.IIllIIllIIIlIlIIIIlI.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.*;
import net.minecraft.client.IlIIIlIlIIIllIlIlIIl.*;
import java.util.*;

public class llIllIlIIIIllIlIIllI implements IlIllIlIlIIIlIlIlIII
{
    private lIIlIIIlIllIlIllIIIl llllIIIIlIIIlIlllIll;
    
    public llIllIlIIIIllIlIIllI(final lIIlIIIlIllIlIllIIIl llllIIIIlIIIlIlllIll) {
        this.llllIIIIlIIIlIlllIll = null;
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final lllIIIIlllllIlIIllIl lllIIIIlllllIlIIllIl, final float n, final float n2, final float n3, final float n4, final float n5, final float n6, final float n7) {
        this.llllIIIIlIIIlIlllIll(lllIIIIlllllIlIIllIl, n7, n3);
    }
    
    protected void llllIIIIlIIIlIlllIll(final lllIIIIlllllIlIIllIl lllIIIIlllllIlIIllIl, final float n, final float n2) {
        if (net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IlIllIIllIIlIIIIlIIl() && lllIIIIlllllIlIIllIl instanceof net.minecraft.client.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll) {
            final net.minecraft.client.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll = (net.minecraft.client.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll)lllIIIIlllllIlIIllIl;
            lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI(1.0f, 1.0f, 1.0f, 1.0f);
            lllllIlIIIlIlIIlllII.IIlllIlIIllIlIlIlIIl();
            lllllIlIIIlIlIIlllII.llllIIllllIlIlIIIIll();
            llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll(this.llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII(), llllIIIIlIIIlIlllIll, n, n2);
            lllllIlIIIlIlIIlllII.IlIllIlIlIIIlIlIlIII();
        }
    }
    
    @Override
    public boolean IlIlIlIlIlllllllllIl() {
        return false;
    }
    
    public static void llllIIIIlIIIlIlllIll(final Map map) {
        final Set<Object> keySet = map.keySet();
        boolean b = false;
        final Iterator<Object> iterator = keySet.iterator();
        while (iterator.hasNext()) {
            final V value = map.get(iterator.next());
            if (value instanceof lIIlIIIlIllIlIllIIIl) {
                final lIIlIIIlIllIlIllIIIl liIlIIIlIllIlIllIIIl = (lIIlIIIlIllIlIllIIIl)value;
                liIlIIIlIllIlIllIIIl.llllIIIIlIIIlIlllIll(new llIllIlIIIIllIlIIllI(liIlIIIlIllIlIllIIIl));
                b = true;
            }
        }
        if (!b) {
            llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI("PlayerItemsLayer not registered");
        }
    }
}
