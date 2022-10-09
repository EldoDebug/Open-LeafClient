package net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll;

import com.google.common.base.*;
import org.apache.logging.log4j.*;
import java.util.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;

public class IlIlIIIllIIllIlllllI extends IlIlIIIllIllIIIIIllI
{
    private static final Logger llllIIIIlIIIlIlllIll;
    private IlIllIlIlIIIlIlIlIII IlIlIlIlIlllllllllIl;
    private final Predicate llIllIIIIIllIlIIIIlI;
    private final IIIllllllIllIIIlllIl IlIIIlIlIIIllIlIlIIl;
    private lllIIIIlllllIlIIllIl IlIlIIIllIllIIIIIllI;
    private Class IllIIlllIIIIlllIIlIl;
    
    static {
        llllIIIIlIIIlIlllIll = LogManager.getLogger();
    }
    
    public IlIlIIIllIIllIlllllI(final IlIllIlIlIIIlIlIlIII ilIlIlIlIlllllllllIl, final Class illIIlllIIIIlllIIlIl) {
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
        this.IllIIlllIIIIlllIIlIl = illIIlllIIIIlllIIlIl;
        if (ilIlIlIlIlllllllllIl instanceof llIIlIIIlIIIllIlIIIl) {
            IlIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll.warn("Use NearestAttackableTargetGoal.class for PathfinerMob mobs!");
        }
        this.llIllIIIIIllIlIIIIlI = (Predicate)new IIIIlllIIIIIIlIIIlll(this);
        this.IlIIIlIlIIIllIlIlIIl = new IIIllllllIllIIIlllIl(ilIlIlIlIlllllllllIl);
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll() {
        final double liiiIlIIIIIlllIllIII = this.lIIIIlIIIIIlllIllIII();
        final List llllIIIIlIIIlIlllIll = this.IlIlIlIlIlllllllllIl.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(this.IllIIlllIIIIlllIIlIl, this.IlIlIlIlIlllllllllIl.IlIIlllIIlIlllllIIlI().IlIlIlIlIlllllllllIl(liiiIlIIIIIlllIllIII, 4.0, liiiIlIIIIIlllIllIII), this.llIllIIIIIllIlIIIIlI);
        Collections.sort((List<Object>)llllIIIIlIIIlIlllIll, this.IlIIIlIlIIIllIlIlIIl);
        if (llllIIIIlIIIlIlllIll.isEmpty()) {
            return false;
        }
        this.IlIlIIIllIllIIIIIllI = llllIIIIlIIIlIlllIll.get(0);
        return true;
    }
    
    @Override
    public boolean IlIlIlIlIlllllllllIl() {
        final lllIIIIlllllIlIIllIl iIlllIIIlIlllIIlllII = this.IlIlIlIlIlllllllllIl.IIlllIIIlIlllIIlllII();
        if (iIlllIIIlIlllIIlllII == null) {
            return false;
        }
        if (!iIlllIIIlIlllIIlllII.llllIllllIllllIlIlII()) {
            return false;
        }
        final double liiiIlIIIIIlllIllIII = this.lIIIIlIIIIIlllIllIII();
        return this.IlIlIlIlIlllllllllIl.IlIlIIIllIllIIIIIllI(iIlllIIIlIlllIIlllII) <= liiiIlIIIIIlllIllIII * liiiIlIIIIIlllIllIII && (!(iIlllIIIlIlllIIlllII instanceof IlIIIlIlIIIllIlIlIIl) || !((IlIIIlIlIIIllIlIlIIl)iIlllIIIlIlllIIlllII).llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI());
    }
    
    @Override
    public void IlIlIIIllIllIIIIIllI() {
        this.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl(this.IlIlIIIllIllIIIIIllI);
        super.IlIlIIIllIllIIIIIllI();
    }
    
    @Override
    public void llIllIIIIIllIlIIIIlI() {
        this.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl((lllIIIIlllllIlIIllIl)null);
        super.IlIlIIIllIllIIIIIllI();
    }
    
    protected double lIIIIlIIIIIlllIllIII() {
        final net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI llllIIIIlIIIlIlllIll = this.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(IlIIIlIIIllllIlIlIlI.IlIlIlIlIlllllllllIl);
        return (llllIIIIlIIIlIlllIll == null) ? 16.0 : llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI();
    }
}
