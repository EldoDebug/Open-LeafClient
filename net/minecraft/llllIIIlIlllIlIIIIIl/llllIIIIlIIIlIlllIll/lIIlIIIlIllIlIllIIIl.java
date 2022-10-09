package net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll;

import net.minecraft.IlIllIlIlIIIlIlIlIII.*;
import org.apache.logging.log4j.*;
import com.google.common.collect.*;
import java.util.*;

public class lIIlIIIlIllIlIllIIIl
{
    private static final Logger llllIIIIlIIIlIlllIll;
    private List IlIlIlIlIlllllllllIl;
    private List llIllIIIIIllIlIIIIlI;
    private final IlIIIlIlIIIllIlIlIIl IlIIIlIlIIIllIlIlIIl;
    private int IlIlIIIllIllIIIIIllI;
    private int IllIIlllIIIIlllIIlIl;
    
    static {
        llllIIIIlIIIlIlllIll = LogManager.getLogger();
    }
    
    public lIIlIIIlIllIlIllIIIl(final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl) {
        this.IlIlIlIlIlllllllllIl = Lists.newArrayList();
        this.llIllIIIIIllIlIIIIlI = Lists.newArrayList();
        this.IllIIlllIIIIlllIIlIl = 3;
        this.IlIIIlIlIIIllIlIlIIl = ilIIIlIlIIIllIlIlIIl;
    }
    
    public void llllIIIIlIIIlIlllIll(final int n, final IlIlIIIllIllIIIIIllI ilIlIIIllIllIIIIIllI) {
        this.IlIlIlIlIlllllllllIl.add(new IIlIIIlllIllIllIlIII(this, n, ilIlIIIllIllIIIIIllI));
    }
    
    public void llllIIIIlIIIlIlllIll(final IlIlIIIllIllIIIIIllI ilIlIIIllIllIIIIIllI) {
        final Iterator<IIlIIIlllIllIllIlIII> iterator = (Iterator<IIlIIIlllIllIllIlIII>)this.IlIlIlIlIlllllllllIl.iterator();
        while (iterator.hasNext()) {
            final IIlIIIlllIllIllIlIII ilIIIlllIllIllIlIII = iterator.next();
            final IlIlIIIllIllIIIIIllI llllIIIIlIIIlIlllIll = ilIIIlllIllIllIlIII.llllIIIIlIIIlIlllIll;
            if (llllIIIIlIIIlIlllIll == ilIlIIIllIllIIIIIllI) {
                if (this.llIllIIIIIllIlIIIIlI.contains(ilIIIlllIllIllIlIII)) {
                    llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI();
                    this.llIllIIIIIllIlIIIIlI.remove(ilIIIlllIllIllIlIII);
                }
                iterator.remove();
            }
        }
    }
    
    public void llllIIIIlIIIlIlllIll() {
        this.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll("goalSetup");
        if (this.IlIlIIIllIllIIIIIllI++ % this.IllIIlllIIIIlllIIlIl == 0) {
            for (final IIlIIIlllIllIllIlIII ilIIIlllIllIllIlIII : this.IlIlIlIlIlllllllllIl) {
                if (this.llIllIIIIIllIlIIIIlI.contains(ilIIIlllIllIllIlIII)) {
                    if (this.IlIlIlIlIlllllllllIl(ilIIIlllIllIllIlIII) && this.llllIIIIlIIIlIlllIll(ilIIIlllIllIllIlIII)) {
                        continue;
                    }
                    ilIIIlllIllIllIlIII.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI();
                    this.llIllIIIIIllIlIIIIlI.remove(ilIIIlllIllIllIlIII);
                }
                if (this.IlIlIlIlIlllllllllIl(ilIIIlllIllIllIlIII) && ilIIIlllIllIllIlIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll()) {
                    ilIIIlllIllIllIlIII.llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI();
                    this.llIllIIIIIllIlIIIIlI.add(ilIIIlllIllIllIlIII);
                }
            }
        }
        else {
            final Iterator<IIlIIIlllIllIllIlIII> iterator2 = (Iterator<IIlIIIlllIllIllIlIII>)this.llIllIIIIIllIlIIIIlI.iterator();
            while (iterator2.hasNext()) {
                final IIlIIIlllIllIllIlIII ilIIIlllIllIllIlIII2 = iterator2.next();
                if (!this.llllIIIIlIIIlIlllIll(ilIIIlllIllIllIlIII2)) {
                    ilIIIlllIllIllIlIII2.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI();
                    iterator2.remove();
                }
            }
        }
        this.IlIIIlIlIIIllIlIlIIl.IlIlIlIlIlllllllllIl();
        this.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll("goalTick");
        final Iterator<IIlIIIlllIllIllIlIII> iterator3 = this.llIllIIIIIllIlIIIIlI.iterator();
        while (iterator3.hasNext()) {
            iterator3.next().llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl();
        }
        this.IlIIIlIlIIIllIlIlIIl.IlIlIlIlIlllllllllIl();
    }
    
    private boolean llllIIIIlIIIlIlllIll(final IIlIIIlllIllIllIlIII ilIIIlllIllIllIlIII) {
        return ilIIIlllIllIllIlIII.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl();
    }
    
    private boolean IlIlIlIlIlllllllllIl(final IIlIIIlllIllIllIlIII ilIIIlllIllIllIlIII) {
        for (final IIlIIIlllIllIllIlIII ilIIIlllIllIllIlIII2 : this.IlIlIlIlIlllllllllIl) {
            if (ilIIIlllIllIllIlIII2 != ilIIIlllIllIllIlIII) {
                if (ilIIIlllIllIllIlIII.IlIlIlIlIlllllllllIl >= ilIIIlllIllIllIlIII2.IlIlIlIlIlllllllllIl) {
                    if (!this.llllIIIIlIIIlIlllIll(ilIIIlllIllIllIlIII, ilIIIlllIllIllIlIII2) && this.llIllIIIIIllIlIIIIlI.contains(ilIIIlllIllIllIlIII2)) {
                        return false;
                    }
                    continue;
                }
                else {
                    if (!ilIIIlllIllIllIlIII2.llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl() && this.llIllIIIIIllIlIIIIlI.contains(ilIIIlllIllIllIlIII2)) {
                        return false;
                    }
                    continue;
                }
            }
        }
        return true;
    }
    
    private boolean llllIIIIlIIIlIlllIll(final IIlIIIlllIllIllIlIII ilIIIlllIllIllIlIII, final IIlIIIlllIllIllIlIII ilIIIlllIllIllIlIII2) {
        return (ilIIIlllIllIllIlIII.llllIIIIlIIIlIlllIll.llllIIIlIlllIlIIIIIl() & ilIIIlllIllIllIlIII2.llllIIIIlIIIlIlllIll.llllIIIlIlllIlIIIIIl()) == 0x0;
    }
}
