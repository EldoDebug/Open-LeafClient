package net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll;

import net.minecraft.llllIIIlIlllIlIIIIIl.*;
import com.google.common.base.*;
import java.util.*;

public class IIlIIIIIllIlIIIlIIll extends IlIIlIlIIIlIIlIlIlII
{
    protected final Class llllIIIIlIIIlIlllIll;
    private final int llllIIIlIlllIlIIIIIl;
    protected final IIIllllllIllIIIlllIl IlIlIlIlIlllllllllIl;
    protected Predicate llIllIIIIIllIlIIIIlI;
    protected lllIIIIlllllIlIIllIl IlIIIlIlIIIllIlIlIIl;
    
    public IIlIIIIIllIlIIIlIIll(final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final Class clazz, final boolean b) {
        this(llIIlIIIlIIIllIlIIIl, clazz, b, false);
    }
    
    public IIlIIIIIllIlIIIlIIll(final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final Class clazz, final boolean b, final boolean b2) {
        this(llIIlIIIlIIIllIlIIIl, clazz, 10, b, b2, null);
    }
    
    public IIlIIIIIllIlIIIlIIll(final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final Class llllIIIIlIIIlIlllIll, final int llllIIIlIlllIlIIIIIl, final boolean b, final boolean b2, final Predicate predicate) {
        super(llIIlIIIlIIIllIlIIIl, b, b2);
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.llllIIIlIlllIlIIIIIl = llllIIIlIlllIlIIIIIl;
        this.IlIlIlIlIlllllllllIl = new IIIllllllIllIIIlllIl(llIIlIIIlIIIllIlIIIl);
        this.llllIIIIlIIIlIlllIll(1);
        this.llIllIIIIIllIlIIIIlI = (Predicate)new llllllIllIllIlIllllI(this, predicate);
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll() {
        if (this.llllIIIlIlllIlIIIIIl > 0 && this.IlIlIIIllIllIIIIIllI.B().nextInt(this.llllIIIlIlllIlIIIIIl) != 0) {
            return false;
        }
        final double liiiIlIIIIIlllIllIII = this.lIIIIlIIIIIlllIllIII();
        final List llllIIIIlIIIlIlllIll = this.IlIlIIIllIllIIIIIllI.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(this.llllIIIIlIIIlIlllIll, this.IlIlIIIllIllIIIIIllI.IlIIlllIIlIlllllIIlI().IlIlIlIlIlllllllllIl(liiiIlIIIIIlllIllIII, 4.0, liiiIlIIIIIlllIllIII), Predicates.and(this.llIllIIIIIllIlIIIIlI, net.minecraft.IlllllllIIIlIIIlIlII.llllllIllIllIlIllllI.IlIIIlIlIIIllIlIlIIl));
        Collections.sort((List<Object>)llllIIIIlIIIlIlllIll, this.IlIlIlIlIlllllllllIl);
        if (llllIIIIlIIIlIlllIll.isEmpty()) {
            return false;
        }
        this.IlIIIlIlIIIllIlIlIIl = llllIIIIlIIIlIlllIll.get(0);
        return true;
    }
    
    @Override
    public void IlIlIIIllIllIIIIIllI() {
        this.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl(this.IlIIIlIlIIIllIlIlIIl);
        super.IlIlIIIllIllIIIIIllI();
    }
}
