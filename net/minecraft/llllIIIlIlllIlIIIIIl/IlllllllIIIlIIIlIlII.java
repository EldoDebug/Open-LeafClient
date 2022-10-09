package net.minecraft.llllIIIlIlllIlIIIIIl;

import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import org.apache.logging.log4j.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.lIIIIlIIIIIlllIllIII.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.IllIIlllIIIIlllIIlIl.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl.*;
import java.util.concurrent.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import com.google.common.collect.*;
import java.util.*;
import net.minecraft.IlIlIIIllIIllIlllllI.*;

public class IlllllllIIIlIIIlIlII
{
    private static final Logger llllIIIIlIIIlIlllIll;
    private final IIIllllllIllIIIlllIl IlIlIlIlIlllllllllIl;
    private Set llIllIIIIIllIlIIIIlI;
    private IIIllIIIlIlIIllIIIlI IlIIIlIlIIIllIlIlIIl;
    private int IlIlIIIllIllIIIIIllI;
    
    static {
        llllIIIIlIIIlIlllIll = LogManager.getLogger();
    }
    
    public IlllllllIIIlIIIlIlII(final IIIllllllIllIIIlllIl ilIlIlIlIlllllllllIl) {
        this.llIllIIIIIllIlIIIIlI = Sets.newHashSet();
        this.IlIIIlIlIIIllIlIlIIl = new IIIllIIIlIlIIllIIIlI();
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
        this.IlIlIIIllIllIIIIIllI = ilIlIlIlIlllllllllIl.llIIIIIIlIllIIlIIIll().IIlllIIlllIIIlIlllII().IlIIIlIlIIIllIlIlIIl();
    }
    
    public void llllIIIIlIIIlIlllIll(final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI) {
        if (llIllIIIIIllIlIIIIlI instanceof IlIIIlIlIIIllIlIlIIl) {
            this.llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI, 512, 2);
            final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl = (IlIIIlIlIIIllIlIlIIl)llIllIIIIIllIlIIIIlI;
            for (final IIIlIIlIIIIlllIlllII iiIlIIlIIIIlllIlllII : this.llIllIIIIIllIlIIIIlI) {
                if (iiIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll != ilIIIlIlIIIllIlIlIIl) {
                    iiIlIIlIIIIlllIlllII.IlIlIlIlIlllllllllIl(ilIIIlIlIIIllIlIlIIl);
                }
            }
        }
        else if (llIllIIIIIllIlIIIIlI instanceof net.minecraft.llllIIIlIlllIlIIIIIl.lIIIIlIIIIIlllIllIII.IlIIIlIlIIIllIlIlIIl) {
            this.llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI, 64, 5, true);
        }
        else if (llIllIIIIIllIlIIIIlI instanceof llllIIIIlIIIlIlllIll) {
            this.llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI, 64, 20, false);
        }
        else if (llIllIIIIIllIlIIIIlI instanceof llllIIIlIlllIlIIIIIl) {
            this.llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI, 64, 10, false);
        }
        else if (llIllIIIIIllIlIIIIlI instanceof net.minecraft.llllIIIlIlllIlIIIIIl.lIIIIlIIIIIlllIllIII.llIllIIIIIllIlIIIIlI) {
            this.llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI, 64, 10, false);
        }
        else if (llIllIIIIIllIlIIIIlI instanceof lIIIIlIIIIIlllIllIII) {
            this.llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI, 64, 10, true);
        }
        else if (llIllIIIIIllIlIIIIlI instanceof IlIlIIIllIllIIIIIllI) {
            this.llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI, 64, 10, true);
        }
        else if (llIllIIIIIllIlIIIIlI instanceof net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl.IlIIIlIlIIIllIlIlIIl) {
            this.llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI, 64, 4, true);
        }
        else if (llIllIIIIIllIlIIIIlI instanceof IlIlIlIlIlllllllllIl) {
            this.llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI, 64, 10, true);
        }
        else if (llIllIIIIIllIlIIIIlI instanceof IllIIlllIIIIlllIIlIl) {
            this.llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI, 64, 10, true);
        }
        else if (llIllIIIIIllIlIIIIlI instanceof net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl.IllIIlllIIIIlllIIlIl) {
            this.llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI, 64, 10, true);
        }
        else if (llIllIIIIIllIlIIIIlI instanceof net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl.lIIIIlIIIIIlllIllIII) {
            this.llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI, 64, 10, true);
        }
        else if (llIllIIIIIllIlIIIIlI instanceof lIIIlllIIIllIIIllIII) {
            this.llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI, 64, 20, true);
        }
        else if (llIllIIIIIllIlIIIIlI instanceof llIllIlIIIIllIlIIllI) {
            this.llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI, 80, 3, true);
        }
        else if (llIllIIIIIllIlIIIIlI instanceof net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl.IlIlIlIlIlllllllllIl) {
            this.llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI, 80, 3, true);
        }
        else if (llIllIIIIIllIlIIIIlI instanceof net.minecraft.llllIIIlIlllIlIIIIIl.IllIIlllIIIIlllIIlIl.IlllllllIIIlIIIlIlII) {
            this.llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI, 64, 3, true);
        }
        else if (llIllIIIIIllIlIIIIlI instanceof net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl.IlIIIlIlIIIllIlIlIIl) {
            this.llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI, 80, 3, false);
        }
        else if (llIllIIIIIllIlIIIIlI instanceof net.minecraft.llllIIIlIlllIlIIIIIl.IllIIlllIIIIlllIIlIl.llIllIIIIIllIlIIIIlI) {
            this.llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI, 80, 3, false);
        }
        else if (llIllIIIIIllIlIIIIlI instanceof net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl) {
            this.llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI, 160, 3, true);
        }
        else if (llIllIIIIIllIlIIIIlI instanceof IIIIIllIIIIlIIIIllIl) {
            this.llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI, 80, 3, true);
        }
        else if (llIllIIIIIllIlIIIIlI instanceof IIIlIIIlIlIIlllIIlll) {
            this.llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI, 160, 10, true);
        }
        else if (llIllIIIIIllIlIIIIlI instanceof net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl.llllIIIlIlllIlIIIIIl) {
            this.llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI, 160, 20, true);
        }
        else if (llIllIIIIIllIlIIIIlI instanceof lIlIlIIIllIIllIIIllI) {
            this.llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI, 160, Integer.MAX_VALUE, false);
        }
        else if (llIllIIIIIllIlIIIIlI instanceof net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll) {
            this.llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI, 160, 3, true);
        }
        else if (llIllIIIIIllIlIIIIlI instanceof IlIlIIIlIIlIlIIlllIl) {
            this.llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI, 160, 20, true);
        }
        else if (llIllIIIIIllIlIIIIlI instanceof net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl.llIllIIIIIllIlIIIIlI) {
            this.llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI, 256, Integer.MAX_VALUE, false);
        }
    }
    
    public void llllIIIIlIIIlIlllIll(final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI, final int n, final int n2) {
        this.llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI, n, n2, false);
    }
    
    public void llllIIIIlIIIlIlllIll(final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI, int ilIlIIIllIllIIIIIllI, final int n, final boolean b) {
        if (ilIlIIIllIllIIIIIllI > this.IlIlIIIllIllIIIIIllI) {
            ilIlIIIllIllIIIIIllI = this.IlIlIIIllIllIIIIIllI;
        }
        try {
            if (this.IlIIIlIlIIIllIlIlIIl.IlIlIlIlIlllllllllIl(llIllIIIIIllIlIIIIlI.IlllIIIIlIIIlIlIlIIl())) {
                throw new IllegalStateException("Entity is already tracked!");
            }
            final IIIlIIlIIIIlllIlllII iiIlIIlIIIIlllIlllII = new IIIlIIlIIIIlllIlllII(llIllIIIIIllIlIIIIlI, ilIlIIIllIllIIIIIllI, n, b);
            this.llIllIIIIIllIlIIIIlI.add(iiIlIIlIIIIlllIlllII);
            this.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI.IlllIIIIlIIIlIlIlIIl(), iiIlIIlIIIIlllIlllII);
            iiIlIIlIIIIlllIlllII.IlIlIlIlIlllllllllIl(this.IlIlIlIlIlllllllllIl.IllIIlllIIIIlllIIlIl);
        }
        catch (Throwable t) {
            final net.minecraft.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll = net.minecraft.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(t, "Adding entity to track");
            final net.minecraft.llIllIIIIIllIlIIIIlI.lIIIlllIIIllIIIllIII llllIIIIlIIIlIlllIll2 = llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll("Entity To Track");
            llllIIIIlIIIlIlllIll2.llllIIIIlIIIlIlllIll("Tracking range", String.valueOf(ilIlIIIllIllIIIIIllI) + " blocks");
            llllIIIIlIIIlIlllIll2.llllIIIIlIIIlIlllIll("Update interval", new IIlIIIIlllIlllllIlII(this, n));
            llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll2);
            ((IIIlIIlIIIIlllIlllII)this.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI.IlllIIIIlIIIlIlIlIIl())).llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll("Entity That Is Already Tracked"));
            try {
                throw new IIlIlllIlIlllIlIllll(llllIIIIlIIIlIlllIll);
            }
            catch (IIlIlllIlIlllIlIllll ilIlllIlIlllIlIllll) {
                IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll.error("\"Silently\" catching entity tracking error.", (Throwable)ilIlllIlIlllIlIllll);
            }
        }
    }
    
    public void IlIlIlIlIlllllllllIl(final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI) {
        if (llIllIIIIIllIlIIIIlI instanceof IlIIIlIlIIIllIlIlIIl) {
            final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl = (IlIIIlIlIIIllIlIlIIl)llIllIIIIIllIlIIIIlI;
            final Iterator<IIIlIIlIIIIlllIlllII> iterator = (Iterator<IIIlIIlIIIIlllIlllII>)this.llIllIIIIIllIlIIIIlI.iterator();
            while (iterator.hasNext()) {
                iterator.next().llllIIIIlIIIlIlllIll(ilIIIlIlIIIllIlIlIIl);
            }
        }
        final IIIlIIlIIIIlllIlllII iiIlIIlIIIIlllIlllII = (IIIlIIlIIIIlllIlllII)this.IlIIIlIlIIIllIlIlIIl.IlIIIlIlIIIllIlIlIIl(llIllIIIIIllIlIIIIlI.IlllIIIIlIIIlIlIlIIl());
        if (iiIlIIlIIIIlllIlllII != null) {
            this.llIllIIIIIllIlIIIIlI.remove(iiIlIIlIIIIlllIlllII);
            iiIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll();
        }
    }
    
    public void llllIIIIlIIIlIlllIll() {
        final ArrayList arrayList = Lists.newArrayList();
        for (final IIIlIIlIIIIlllIlllII iiIlIIlIIIIlllIlllII : this.llIllIIIIIllIlIIIIlI) {
            iiIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll(this.IlIlIlIlIlllllllllIl.IllIIlllIIIIlllIIlIl);
            if (iiIlIIlIIIIlllIlllII.IIIIlllIIIIIIlIIIlll && iiIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll instanceof IlIIIlIlIIIllIlIlIIl) {
                arrayList.add(iiIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll);
            }
        }
        for (int i = 0; i < arrayList.size(); ++i) {
            final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl = arrayList.get(i);
            for (final IIIlIIlIIIIlllIlllII iiIlIIlIIIIlllIlllII2 : this.llIllIIIIIllIlIIIIlI) {
                if (iiIlIIlIIIIlllIlllII2.llllIIIIlIIIlIlllIll != ilIIIlIlIIIllIlIlIIl) {
                    iiIlIIlIIIIlllIlllII2.IlIlIlIlIlllllllllIl(ilIIIlIlIIIllIlIlIIl);
                }
            }
        }
    }
    
    public void llllIIIIlIIIlIlllIll(final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl) {
        for (final IIIlIIlIIIIlllIlllII iiIlIIlIIIIlllIlllII : this.llIllIIIIIllIlIIIIlI) {
            if (iiIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll == ilIIIlIlIIIllIlIlIIl) {
                iiIlIIlIIIIlllIlllII.IlIlIlIlIlllllllllIl(this.IlIlIlIlIlllllllllIl.IllIIlllIIIIlllIIlIl);
            }
            else {
                iiIlIIlIIIIlllIlllII.IlIlIlIlIlllllllllIl(ilIIIlIlIIIllIlIlIIl);
            }
        }
    }
    
    public void llllIIIIlIIIlIlllIll(final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI, final IIlIIIIIllIlIIIlIIll ilIIIIIllIlIIIlIIll) {
        final IIIlIIlIIIIlllIlllII iiIlIIlIIIIlllIlllII = (IIIlIIlIIIIlllIlllII)this.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI.IlllIIIIlIIIlIlIlIIl());
        if (iiIlIIlIIIIlllIlllII != null) {
            iiIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll(ilIIIIIllIlIIIlIIll);
        }
    }
    
    public void IlIlIlIlIlllllllllIl(final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI, final IIlIIIIIllIlIIIlIIll ilIIIIIllIlIIIlIIll) {
        final IIIlIIlIIIIlllIlllII iiIlIIlIIIIlllIlllII = (IIIlIIlIIIIlllIlllII)this.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI.IlllIIIIlIIIlIlIlIIl());
        if (iiIlIIlIIIIlllIlllII != null) {
            iiIlIIlIIIIlllIlllII.IlIlIlIlIlllllllllIl(ilIIIIIllIlIIIlIIll);
        }
    }
    
    public void IlIlIlIlIlllllllllIl(final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl) {
        final Iterator<IIIlIIlIIIIlllIlllII> iterator = this.llIllIIIIIllIlIIIIlI.iterator();
        while (iterator.hasNext()) {
            iterator.next().IlIIIlIlIIIllIlIlIIl(ilIIIlIlIIIllIlIlIIl);
        }
    }
    
    public void llllIIIIlIIIlIlllIll(final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl, final net.minecraft.IIIlIIlIIIIlllIlllII.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        for (final IIIlIIlIIIIlllIlllII iiIlIIlIIIIlllIlllII : this.llIllIIIIIllIlIIIIlI) {
            if (iiIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll != ilIIIlIlIIIllIlIlIIl && iiIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll.lllllIIlIlIIIlIlIIIl == llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll && iiIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll.llllIllllIllllIlIlII == llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl) {
                iiIlIIlIIIIlllIlllII.IlIlIlIlIlllllllllIl(ilIIIlIlIIIllIlIlIIl);
            }
        }
    }
}
