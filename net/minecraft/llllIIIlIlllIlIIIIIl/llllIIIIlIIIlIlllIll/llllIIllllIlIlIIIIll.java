package net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll;

import com.google.common.base.*;
import org.apache.logging.log4j.*;
import java.util.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.lllIIIIlllllIlIIllIl.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;

public class llllIIllllIlIlIIIIll extends IlIlIIIllIllIIIIIllI
{
    private static final Logger llllIIIIlIIIlIlllIll;
    private IlIllIlIlIIIlIlIlIII IlIlIlIlIlllllllllIl;
    private final Predicate llIllIIIIIllIlIIIIlI;
    private final IIIllllllIllIIIlllIl IlIIIlIlIIIllIlIlIIl;
    private lllIIIIlllllIlIIllIl IlIlIIIllIllIIIIIllI;
    
    static {
        llllIIIIlIIIlIlllIll = LogManager.getLogger();
    }
    
    public llllIIllllIlIlIIIIll(final IlIllIlIlIIIlIlIlIII ilIlIlIlIlllllllllIl) {
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
        if (ilIlIlIlIlllllllllIl instanceof llIIlIIIlIIIllIlIIIl) {
            llllIIllllIlIlIIIIll.llllIIIIlIIIlIlllIll.warn("Use NearestAttackableTargetGoal.class for PathfinerMob mobs!");
        }
        this.llIllIIIIIllIlIIIIlI = (Predicate)new net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll.IlIllIlIlIIIlIlIlIII(this);
        this.IlIIIlIlIIIllIlIlIIl = new IIIllllllIllIIIlllIl(ilIlIlIlIlllllllllIl);
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll() {
        final double liiiIlIIIIIlllIllIII = this.lIIIIlIIIIIlllIllIII();
        final List llllIIIIlIIIlIlllIll = this.IlIlIlIlIlllllllllIl.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll.class, this.IlIlIlIlIlllllllllIl.IlIIlllIIlIlllllIIlI().IlIlIlIlIlllllllllIl(liiiIlIIIIIlllIllIII, 4.0, liiiIlIIIIIlllIllIII), this.llIllIIIIIllIlIIIIlI);
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
        if (iIlllIIIlIlllIIlllII instanceof llllIIIIlIIIlIlllIll && ((llllIIIIlIIIlIlllIll)iIlllIIIlIlllIIlllII).K.llllIIIIlIIIlIlllIll) {
            return false;
        }
        final IlIlIIIllIIllIlllllI w = this.IlIlIlIlIlllllllllIl.w();
        final IlIlIIIllIIllIlllllI w2 = iIlllIIIlIlllIIlllII.w();
        if (w != null && w2 == w) {
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
