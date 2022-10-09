package net.minecraft.client.lIIIlllIIIllIIIllIII.IlIlIlIlIlllllllllIl;

import net.minecraft.client.lIIIlllIIIllIIIllIII.*;
import org.apache.logging.log4j.*;
import net.minecraft.client.*;
import net.minecraft.llIllIIIIIllIlIIIIlI.*;
import com.google.common.collect.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import java.util.*;
import com.google.common.util.concurrent.*;

public class lIIIIlIIIIIlllIllIII implements Runnable
{
    private static final Logger llllIIIIlIIIlIlllIll;
    private final IlIIIlIlIIIllIlIlIIl IlIlIlIlIlllllllllIl;
    private final IlIIllIIllIIllIIlIIl llIllIIIIIllIlIIIIlI;
    
    static {
        llllIIIIlIIIlIlllIll = LogManager.getLogger();
    }
    
    public lIIIIlIIIIIlllIllIII(final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl) {
        this(ilIIIlIlIIIllIlIlIIl, null);
    }
    
    public lIIIIlIIIIIlllIllIII(final IlIIIlIlIIIllIlIlIIl ilIlIlIlIlllllllllIl, final IlIIllIIllIIllIIlIIl llIllIIIIIllIlIIIIlI) {
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
        this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
    }
    
    @Override
    public void run() {
        try {
            while (true) {
                this.llllIIIIlIIIlIlllIll(this.IlIlIlIlIlllllllllIl.IlIIIlIlIIIllIlIlIIl());
            }
        }
        catch (InterruptedException ex) {
            lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll.debug("Stopping due to interrupt");
        }
        catch (Throwable t) {
            Minecraft.getMinecraft().llllIIIIlIIIlIlllIll(Minecraft.getMinecraft().llIllIIIIIllIlIIIIlI(net.minecraft.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(t, "Batching chunks")));
        }
    }
    
    protected void llllIIIIlIIIlIlllIll(final net.minecraft.client.lIIIlllIIIllIIIllIII.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl().lock();
        try {
            if (llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll() != net.minecraft.client.lIIIlllIIIllIIIllIII.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll) {
                if (!llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII()) {
                    lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll.warn("Chunk render task was " + llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll() + " when I expected it to be pending; ignoring task");
                }
                return;
            }
            llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(net.minecraft.client.lIIIlllIIIllIIIllIII.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl);
        }
        finally {
            llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl().unlock();
        }
        llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl().unlock();
        final net.minecraft.llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI liiiIlIlIllllIIlIllI = Minecraft.getMinecraft().lIIIIlIlIllllIIlIllI();
        if (liiiIlIlIllllIIlIllI == null) {
            llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI();
        }
        else {
            llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(this.IlIlIlIlIlllllllllIl());
            final float n = (float)liiiIlIlIllllIIlIllI.IIlllIlIIllIlIlIlIIl;
            final float n2 = (float)liiiIlIlIllllIIlIllI.llIIIlIlIllIIlIlIlII + liiiIlIlIllllIIlIllI.llllIlIllllIIlIIlIlI();
            final float n3 = (float)liiiIlIlIllllIIlIllI.lllllIlIIIlIlIIlllII;
            final llIllIIIIIllIlIIIIlI llllIIIlIlllIlIIIIIl = llllIIIIlIIIlIlllIll.llllIIIlIlllIlIIIIIl();
            if (llllIIIlIlllIlIIIIIl == net.minecraft.client.lIIIlllIIIllIIIllIII.IlIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll) {
                llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl().IlIlIlIlIlllllllllIl(n, n2, n3, llllIIIIlIIIlIlllIll);
            }
            else if (llllIIIlIlllIlIIIIIl == net.minecraft.client.lIIIlllIIIllIIIllIII.IlIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl) {
                llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl().llllIIIIlIIIlIlllIll(n, n2, n3, llllIIIIlIIIlIlllIll);
            }
            llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl().lock();
            try {
                if (llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll() != net.minecraft.client.lIIIlllIIIllIIIllIII.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl) {
                    if (!llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII()) {
                        lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll.warn("Chunk render task was " + llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll() + " when I expected it to be compiling; aborting task");
                    }
                    this.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll);
                    return;
                }
                llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(net.minecraft.client.lIIIlllIIIllIIIllIII.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI);
            }
            finally {
                llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl().unlock();
            }
            llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl().unlock();
            final llIllIlIIIIllIlIIllI llIllIIIIIllIlIIIIlI = llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI();
            final ArrayList arrayList = Lists.newArrayList();
            if (llllIIIlIlllIlIIIIIl == net.minecraft.client.lIIIlllIIIllIIIllIII.IlIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll) {
                IlIIlIlIIIlIIlIlIlII[] values;
                for (int length = (values = IlIIlIlIIIlIIlIlIlII.values()).length, i = 0; i < length; ++i) {
                    final IlIIlIlIIIlIIlIlIlII ilIIlIlIIIlIIlIlIlII = values[i];
                    if (llIllIIIIIllIlIIIIlI.IlIIIlIlIIIllIlIlIIl(ilIIlIlIIIlIIlIlIlII)) {
                        arrayList.add(this.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(ilIIlIlIIIlIIlIlIlII, llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl().llllIIIIlIIIlIlllIll(ilIIlIlIIIlIIlIlIlII), llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(), llIllIIIIIllIlIIIIlI));
                    }
                }
            }
            else if (llllIIIlIlllIlIIIIIl == net.minecraft.client.lIIIlllIIIllIIIllIII.IlIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl) {
                arrayList.add(this.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(IlIIlIlIIIlIIlIlIlII.IlIIIlIlIIIllIlIlIIl, llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl().llllIIIIlIIIlIlllIll(IlIIlIlIIIlIIlIlIlII.IlIIIlIlIIIllIlIlIIl), llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(), llIllIIIIIllIlIIIIlI));
            }
            final ListenableFuture allAsList = Futures.allAsList((Iterable)arrayList);
            llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(new lIIIlllIIIllIIIllIII(this, allAsList));
            Futures.addCallback(allAsList, (FutureCallback)new llIIlIIIlIIIllIlIIIl(this, llllIIIIlIIIlIlllIll, llIllIIIIIllIlIIIIlI));
        }
    }
    
    private IlIIllIIllIIllIIlIIl IlIlIlIlIlllllllllIl() {
        return (this.llIllIIIIIllIlIIIIlI != null) ? this.llIllIIIIIllIlIIIIlI : this.IlIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI();
    }
    
    private void IlIlIlIlIlllllllllIl(final net.minecraft.client.lIIIlllIIIllIIIllIII.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        if (this.llIllIIIIIllIlIIIIlI == null) {
            this.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl());
        }
    }
}
