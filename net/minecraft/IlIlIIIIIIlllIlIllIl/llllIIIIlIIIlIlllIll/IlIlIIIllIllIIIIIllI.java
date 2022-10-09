package net.minecraft.IlIlIIIIIIlllIlIllIl.llllIIIIlIIIlIlllIll;

import com.google.common.collect.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.*;
import java.util.*;

class IlIlIIIllIllIIIIIllI implements Runnable
{
    final /* synthetic */ IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll;
    
    IlIlIIIllIllIIIIIllI(final IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
    }
    
    @Override
    public void run() {
        final Iterator<IlIIIlIlIIIllIlIlIIl> iterator = Lists.newArrayList((Iterable)this.llllIIIIlIIIlIlllIll.IIlllIIlllIIIlIlllII().IIIlIIIlIlIIlllIIlll()).iterator();
        while (iterator.hasNext()) {
            this.llllIIIIlIIIlIlllIll.IIlllIIlllIIIlIlllII().IlIlIIIllIllIIIIIllI(iterator.next());
        }
    }
}
