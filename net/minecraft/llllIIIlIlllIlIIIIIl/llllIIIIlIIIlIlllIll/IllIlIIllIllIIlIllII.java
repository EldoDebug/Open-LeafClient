package net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll;

import net.minecraft.llllIIIlIlllIlIIIIIl.IllIIlllIIIIlllIIlIl.*;
import com.google.common.base.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;

public class IllIlIIllIllIIlIllII extends IIlIIIIIllIlIIIlIIll
{
    private IIIlIIlIIIIlllIlllII llllIIIlIlllIlIIIIIl;
    
    public IllIlIIllIllIIlIllII(final IIIlIIlIIIIlllIlllII llllIIIlIlllIlIIIIIl, final Class clazz, final boolean b, final Predicate predicate) {
        super(llllIIIlIlllIlIIIIIl, clazz, 10, b, false, predicate);
        this.llllIIIlIlllIlIIIIIl = llllIIIlIlllIlIIIIIl;
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll() {
        return !this.llllIIIlIlllIlIIIIIl.as() && super.llllIIIIlIIIlIlllIll();
    }
}
