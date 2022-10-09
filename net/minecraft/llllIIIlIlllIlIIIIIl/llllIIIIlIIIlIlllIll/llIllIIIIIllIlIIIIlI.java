package net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll;

import net.minecraft.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.IIIIlllIIIIIIlIIIlll.*;
import com.google.common.base.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import java.util.*;

public class llIllIIIIIllIlIIIIlI extends IlIlIIIllIllIIIIIllI
{
    private final Predicate llIllIIIIIllIlIIIIlI;
    protected llIIlIIIlIIIllIlIIIl llllIIIIlIIIlIlllIll;
    private double IlIIIlIlIIIllIlIlIIl;
    private double IlIlIIIllIllIIIIIllI;
    protected net.minecraft.llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI IlIlIlIlIlllllllllIl;
    private float IllIIlllIIIIlllIIlIl;
    private IlIlIlIlIlllllllllIl llllIIIlIlllIlIIIIIl;
    private IlIIIlIlIIIllIlIlIIl lIIIIlIIIIIlllIllIII;
    private Class lIIIlllIIIllIIIllIII;
    private Predicate llIIlIIIlIIIllIlIIIl;
    
    public llIllIIIIIllIlIIIIlI(final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final Class clazz, final float n, final double n2, final double n3) {
        this(llIIlIIIlIIIllIlIIIl, clazz, Predicates.alwaysTrue(), n, n2, n3);
    }
    
    public llIllIIIIIllIlIIIIlI(final llIIlIIIlIIIllIlIIIl llllIIIIlIIIlIlllIll, final Class liiIlllIIIllIIIllIII, final Predicate llIIlIIIlIIIllIlIIIl, final float illIIlllIIIIlllIIlIl, final double ilIIIlIlIIIllIlIlIIl, final double ilIlIIIllIllIIIIIllI) {
        this.llIllIIIIIllIlIIIIlI = (Predicate)new net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl(this);
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.lIIIlllIIIllIIIllIII = liiIlllIIIllIIIllIII;
        this.llIIlIIIlIIIllIlIIIl = llIIlIIIlIIIllIlIIIl;
        this.IllIIlllIIIIlllIIlIl = illIIlllIIIIlllIIlIl;
        this.IlIIIlIlIIIllIlIlIIl = ilIIIlIlIIIllIlIlIIl;
        this.IlIlIIIllIllIIIIIllI = ilIlIIIllIllIIIIIllI;
        this.lIIIIlIIIIIlllIllIII = llllIIIIlIIIlIlllIll.lIllllllIIllIlIlIlII();
        this.llllIIIIlIIIlIlllIll(1);
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll() {
        final List llllIIIIlIIIlIlllIll = this.llllIIIIlIIIlIlllIll.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(this.lIIIlllIIIllIIIllIII, this.llllIIIIlIIIlIlllIll.IlIIlllIIlIlllllIIlI().IlIlIlIlIlllllllllIl(this.IllIIlllIIIIlllIIlIl, 3.0, this.IllIIlllIIIIlllIIlIl), Predicates.and(new Predicate[] { llllllIllIllIlIllllI.IlIIIlIlIIIllIlIlIIl, this.llIllIIIIIllIlIIIIlI, this.llIIlIIIlIIIllIlIIIl }));
        if (llllIIIIlIIIlIlllIll.isEmpty()) {
            return false;
        }
        this.IlIlIlIlIlllllllllIl = llllIIIIlIIIlIlllIll.get(0);
        final e ilIlIlIlIlllllllllIl = lllllIIlIlIIIlIlIIIl.IlIlIlIlIlllllllllIl(this.llllIIIIlIIIlIlllIll, 16, 7, new e(this.IlIlIlIlIlllllllllIl.IIlllIlIIllIlIlIlIIl, this.IlIlIlIlIlllllllllIl.llIIIlIlIllIIlIlIlII, this.IlIlIlIlIlllllllllIl.lllllIlIIIlIlIIlllII));
        if (ilIlIlIlIlllllllllIl == null) {
            return false;
        }
        if (this.IlIlIlIlIlllllllllIl.IlIlIIIllIllIIIIIllI(ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll, ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl, ilIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI) < this.IlIlIlIlIlllllllllIl.IlIlIIIllIllIIIIIllI(this.llllIIIIlIIIlIlllIll)) {
            return false;
        }
        this.llllIIIlIlllIlIIIIIl = this.lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll, ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl, ilIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI);
        return this.llllIIIlIlllIlIIIIIl != null && this.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl);
    }
    
    @Override
    public boolean IlIlIlIlIlllllllllIl() {
        return !this.lIIIIlIIIIIlllIllIII.IllIIlllIIIIlllIIlIl();
    }
    
    @Override
    public void IlIlIIIllIllIIIIIllI() {
        this.lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll(this.llllIIIlIlllIlIIIIIl, this.IlIIIlIlIIIllIlIlIIl);
    }
    
    @Override
    public void llIllIIIIIllIlIIIIlI() {
        this.IlIlIlIlIlllllllllIl = null;
    }
    
    @Override
    public void IlIIIlIlIIIllIlIlIIl() {
        if (this.llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI(this.IlIlIlIlIlllllllllIl) < 49.0) {
            this.llllIIIIlIIIlIlllIll.lIllllllIIllIlIlIlII().llllIIIIlIIIlIlllIll(this.IlIlIIIllIllIIIIIllI);
        }
        else {
            this.llllIIIIlIIIlIlllIll.lIllllllIIllIlIlIlII().llllIIIIlIIIlIlllIll(this.IlIIIlIlIIIllIlIlIIl);
        }
    }
}
