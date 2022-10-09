package net.optifine.shaders.llllIIIIlIIIlIlllIll;

import java.util.*;
import net.optifine.expr.*;

public class IlIllIlIlIIIlIlIlIII implements llllIIllllIlIlIIIIll
{
    private Map llllIIIIlIIIlIlllIll;
    
    public IlIllIlIlIIIlIlIlIII(final IIIIlllIIIIIIlIIIlll[] array) {
        this.llllIIIIlIIIlIlllIll = new HashMap();
        for (int i = 0; i < array.length; ++i) {
            final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll = array[i];
            if (iiiIlllIIIIIIlIIIlll instanceof IlIlIIIIIIlllIlIllIl) {
                this.llllIIIIlIIIlIlllIll.put(iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll(), new IlIlIlIlIlllllllllIl((IlIlIIIIIIlllIlIllIl)iiiIlllIIIIIIlIIIlll));
            }
        }
    }
    
    @Override
    public llIIlIIIlIIIllIlIIIl llIllIIIIIllIlIIIIlI(final String s) {
        return this.llllIIIIlIIIlIlllIll.get(s);
    }
}
