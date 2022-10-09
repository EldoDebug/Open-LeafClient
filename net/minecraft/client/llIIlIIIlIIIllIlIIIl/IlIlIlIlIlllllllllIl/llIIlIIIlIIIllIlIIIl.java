package net.minecraft.client.llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl;

import net.minecraft.client.lIIIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.*;
import java.util.*;
import com.google.common.collect.*;

public class llIIlIIIlIIIllIlIIIl
{
    private final List llllIIIIlIIIlIlllIll;
    private final List IlIlIlIlIlllllllllIl;
    private final boolean llIllIIIIIllIlIIIIlI;
    private IlIlIIIllIIllIlllllI IlIIIlIlIIIllIlIlIIl;
    private boolean IlIlIIIllIllIIIIIllI;
    private llIllIlIIIIllIlIIllI IllIIlllIIIIlllIIlIl;
    
    public llIIlIIIlIIIllIlIIIl(final IlIlIIIIIIlllIlIllIl ilIlIIIIIIlllIlIllIl) {
        this(ilIlIIIIIIlllIlIllIl.IlIlIlIlIlllllllllIl(), ilIlIIIIIIlllIlIllIl.llIllIIIIIllIlIIIIlI(), ilIlIIIIIIlllIlIllIl.llllIIIlIlllIlIIIIIl());
    }
    
    public llIIlIIIlIIIllIlIIIl(final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final IlIlIIIllIIllIlllllI ilIlIIIllIIllIlllllI) {
        this(ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl(), ilIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI(), ilIlIlIlIlllllllllIl.IllIIlllIIIIlllIIlIl());
        this.IlIIIlIlIIIllIlIlIIl = ilIlIlIlIlllllllllIl.IlIlIIIllIllIIIIIllI();
        lllIllIIIllllllIllll[] values;
        for (int length = (values = lllIllIIIllllllIllll.values()).length, i = 0; i < length; ++i) {
            this.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl, ilIlIIIllIIllIlllllI, values[i]);
        }
        this.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl, ilIlIIIllIIllIlllllI);
    }
    
    private void llllIIIIlIIIlIlllIll(final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final IlIlIIIllIIllIlllllI ilIlIIIllIIllIlllllI, final lllIllIIIllllllIllll lllIllIIIllllllIllll) {
        final Iterator<llllIIIIlIIIlIlllIll> iterator = ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(lllIllIIIllllllIllll).iterator();
        while (iterator.hasNext()) {
            this.llllIIIIlIIIlIlllIll(lllIllIIIllllllIllll, new lIIIlllIIIllIIIllIII(iterator.next(), ilIlIIIllIIllIlllllI));
        }
    }
    
    private void llllIIIIlIIIlIlllIll(final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final IlIlIIIllIIllIlllllI ilIlIIIllIIllIlllllI) {
        final Iterator<llllIIIIlIIIlIlllIll> iterator = ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll().iterator();
        while (iterator.hasNext()) {
            this.llllIIIIlIIIlIlllIll(new lIIIlllIIIllIIIllIII(iterator.next(), ilIlIIIllIIllIlllllI));
        }
    }
    
    private llIIlIIIlIIIllIlIIIl(final boolean llIllIIIIIllIlIIIIlI, final boolean ilIlIIIllIllIIIIIllI, final llIllIlIIIIllIlIIllI illIIlllIIIIlllIIlIl) {
        this.llllIIIIlIIIlIlllIll = Lists.newArrayList();
        this.IlIlIlIlIlllllllllIl = Lists.newArrayListWithCapacity(6);
        lllIllIIIllllllIllll[] values;
        for (int length = (values = lllIllIIIllllllIllll.values()).length, i = 0; i < length; ++i) {
            final lllIllIIIllllllIllll lllIllIIIllllllIllll = values[i];
            this.IlIlIlIlIlllllllllIl.add(Lists.newArrayList());
        }
        this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
        this.IlIlIIIllIllIIIIIllI = ilIlIIIllIllIIIIIllI;
        this.IllIIlllIIIIlllIIlIl = illIIlllIIIIlllIIlIl;
    }
    
    public llIIlIIIlIIIllIlIIIl llllIIIIlIIIlIlllIll(final lllIllIIIllllllIllll lllIllIIIllllllIllll, final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        this.IlIlIlIlIlllllllllIl.get(lllIllIIIllllllIllll.ordinal()).add(llllIIIIlIIIlIlllIll);
        return this;
    }
    
    public llIIlIIIlIIIllIlIIIl llllIIIIlIIIlIlllIll(final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        this.llllIIIIlIIIlIlllIll.add(llllIIIIlIIIlIlllIll);
        return this;
    }
    
    public llIIlIIIlIIIllIlIIIl llllIIIIlIIIlIlllIll(final IlIlIIIllIIllIlllllI ilIIIlIlIIIllIlIlIIl) {
        this.IlIIIlIlIIIllIlIlIIl = ilIIIlIlIIIllIlIlIIl;
        return this;
    }
    
    public IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll() {
        if (this.IlIIIlIlIIIllIlIlIIl == null) {
            throw new RuntimeException("Missing particle!");
        }
        return new net.minecraft.client.llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII(this.llllIIIIlIIIlIlllIll, this.IlIlIlIlIlllllllllIl, this.llIllIIIIIllIlIIIIlI, this.IlIlIIIllIllIIIIIllI, this.IlIIIlIlIIIllIlIlIIl, this.IllIIlllIIIIlllIIlIl);
    }
}
