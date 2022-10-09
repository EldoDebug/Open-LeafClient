package net.minecraft.IlllllllIIIlIIIlIlII;

import org.apache.commons.lang3.*;

public class IIIIIlllIlIIIIIIIllI extends llIlIIIIllIlIIlIlIII
{
    private final Object IlIIIlIlIIIllIlIlIIl;
    private Object IlIlIIIllIllIIIIIllI;
    
    public IIIIIlllIlIIIIIIIllI(final Object ilIIIlIlIIIllIlIlIIl) {
        this.IlIIIlIlIIIllIlIlIIl = ilIIIlIlIIIllIlIlIIl;
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final int n, final Object o, final Object ilIlIIIllIllIIIIIllI) {
        if (this.IlIIIlIlIIIllIlIlIIl.equals(o)) {
            this.IlIlIIIllIllIIIIIllI = ilIlIIIllIllIIIIIllI;
        }
        super.llllIIIIlIIIlIlllIll(n, o, ilIlIIIllIllIIIIIllI);
    }
    
    public void IlIlIlIlIlllllllllIl() {
        Validate.notNull(this.IlIIIlIlIIIllIlIlIIl);
    }
    
    @Override
    public Object llllIIIIlIIIlIlllIll(final Object o) {
        final Object llllIIIIlIIIlIlllIll = super.llllIIIIlIIIlIlllIll(o);
        return (llllIIIIlIIIlIlllIll == null) ? this.IlIlIIIllIllIIIIIllI : llllIIIIlIIIlIlllIll;
    }
    
    @Override
    public Object llllIIIIlIIIlIlllIll(final int n) {
        final Object llllIIIIlIIIlIlllIll = super.llllIIIIlIIIlIlllIll(n);
        return (llllIIIIlIIIlIlllIll == null) ? this.IlIlIIIllIllIIIIIllI : llllIIIIlIIIlIlllIll;
    }
}
