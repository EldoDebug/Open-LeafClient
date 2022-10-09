package net.minecraft.client.lIIIlllIIIllIIIllIII.IlIlIlIlIlllllllllIl;

import org.apache.logging.log4j.*;
import com.google.common.collect.*;
import java.util.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.client.*;
import com.google.common.util.concurrent.*;
import org.lwjgl.opengl.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIlIlllIlIIIIIl.*;
import java.util.concurrent.*;

public class IlIIIlIlIIIllIlIlIIl
{
    private static final Logger llllIIIIlIIIlIlllIll;
    private static final ThreadFactory IlIlIlIlIlllllllllIl;
    private final List llIllIIIIIllIlIIIIlI;
    private final BlockingQueue IlIIIlIlIIIllIlIlIIl;
    private final BlockingQueue IlIlIIIllIllIIIIIllI;
    private final llIllIIlllllllllllll IllIIlllIIIIlllIIlIl;
    private final llllIllllIllllIlIlII llllIIIlIlllIlIIIIIl;
    private final Queue lIIIIlIIIIIlllIllIII;
    private final lIIIIlIIIIIlllIllIII lIIIlllIIIllIIIllIII;
    private final int llIIlIIIlIIIllIlIIIl;
    private List llIllIlIIIIllIlIIllI;
    
    static {
        llllIIIIlIIIlIlllIll = LogManager.getLogger();
        IlIlIlIlIlllllllllIl = new ThreadFactoryBuilder().setNameFormat("Chunk Batcher %d").setDaemon(true).build();
    }
    
    public IlIIIlIlIIIllIlIlIIl() {
        this(-1);
    }
    
    public IlIIIlIlIIIllIlIlIIl(final int llIIlIIIlIIIllIlIIIl) {
        this.llIllIIIIIllIlIIIIlI = Lists.newArrayList();
        this.IlIIIlIlIIIllIlIlIIl = Queues.newArrayBlockingQueue(100);
        this.IllIIlllIIIIlllIIlIl = new llIllIIlllllllllllll();
        this.llllIIIlIlllIlIIIIIl = new llllIllllIllllIlIlII();
        this.lIIIIlIIIIIlllIllIII = Queues.newArrayDeque();
        this.llIllIlIIIIllIlIIllI = new ArrayList();
        final int max = Math.max(1, (int)(Runtime.getRuntime().maxMemory() * 0.3) / 10485760);
        final int max2 = Math.max(1, net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(Runtime.getRuntime().availableProcessors() - 2, 1, max / 5));
        if (llIIlIIIlIIIllIlIIIl < 0) {
            this.llIIlIIIlIIIllIlIIIl = net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(max2 * 8, 1, max);
        }
        else {
            this.llIIlIIIlIIIllIlIIIl = llIIlIIIlIIIllIlIIIl;
        }
        for (int i = 0; i < max2; ++i) {
            final lIIIIlIIIIIlllIllIII liiiIlIIIIIlllIllIII = new lIIIIlIIIIIlllIllIII(this);
            net.minecraft.client.lIIIlllIIIllIIIllIII.IlIlIlIlIlllllllllIl.IlIIIlIlIIIllIlIlIIl.IlIlIlIlIlllllllllIl.newThread(liiiIlIIIIIlllIllIII).start();
            this.llIllIIIIIllIlIIIIlI.add(liiiIlIIIIIlllIllIII);
        }
        this.IlIlIIIllIllIIIIIllI = Queues.newArrayBlockingQueue(this.llIIlIIIlIIIllIlIIIl);
        for (int j = 0; j < this.llIIlIIIlIIIllIlIIIl; ++j) {
            this.IlIlIIIllIllIIIIIllI.add(new IlIIllIIllIIllIIlIIl());
        }
        this.lIIIlllIIIllIIIllIII = new lIIIIlIIIIIlllIllIII(this, new IlIIllIIllIIllIIlIIl());
    }
    
    public String llllIIIIlIIIlIlllIll() {
        return String.format("pC: %03d, pU: %1d, aB: %1d", this.IlIIIlIlIIIllIlIlIIl.size(), this.lIIIIlIIIIIlllIllIII.size(), this.IlIlIIIllIllIIIIIllI.size());
    }
    
    public boolean llllIIIIlIIIlIlllIll(final long n) {
        boolean b = false;
        do {
            boolean b2 = false;
            ListenableFutureTask listenableFutureTask = null;
            synchronized (this.lIIIIlIIIIIlllIllIII) {
                listenableFutureTask = this.lIIIIlIIIIIlllIllIII.poll();
            }
            // monitorexit(this.lIIIIlIIIIIlllIllIII)
            if (listenableFutureTask != null) {
                listenableFutureTask.run();
                b2 = true;
                b = true;
            }
            if (n == 0L) {
                break;
            }
            if (!b2) {
                break;
            }
        } while (n - System.nanoTime() >= 0L);
        return b;
    }
    
    public boolean llllIIIIlIIIlIlllIll(final IlIllIlIlIIIlIlIlIII ilIllIlIlIIIlIlIlIII) {
        ilIllIlIlIIIlIlIlIII.llIllIIIIIllIlIIIIlI().lock();
        boolean b;
        try {
            final llllIIIIlIIIlIlllIll ilIIIlIlIIIllIlIlIIl = ilIllIlIlIIIlIlIlIII.IlIIIlIlIIIllIlIlIIl();
            ilIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(new IlIlIIIllIllIIIIIllI(this, ilIIIlIlIIIllIlIlIIl));
            final boolean offer = this.IlIIIlIlIIIllIlIlIIl.offer(ilIIIlIlIIIllIlIlIIl);
            if (!offer) {
                ilIIIlIlIIIllIlIlIIl.IlIlIIIllIllIIIIIllI();
            }
            b = offer;
        }
        finally {
            ilIllIlIlIIIlIlIlIII.llIllIIIIIllIlIIIIlI().unlock();
        }
        ilIllIlIlIIIlIlIlIII.llIllIIIIIllIlIIIIlI().unlock();
        return b;
    }
    
    public boolean IlIlIlIlIlllllllllIl(final IlIllIlIlIIIlIlIlIII ilIllIlIlIIIlIlIlIII) {
        ilIllIlIlIIIlIlIlIII.llIllIIIIIllIlIIIIlI().lock();
        boolean b;
        try {
            final llllIIIIlIIIlIlllIll ilIIIlIlIIIllIlIlIIl = ilIllIlIlIIIlIlIlIII.IlIIIlIlIIIllIlIlIIl();
            try {
                this.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll(ilIIIlIlIIIllIlIlIIl);
            }
            catch (InterruptedException ex) {}
            b = true;
        }
        finally {
            ilIllIlIlIIIlIlIlIII.llIllIIIIIllIlIIIIlI().unlock();
        }
        ilIllIlIlIIIlIlIlIII.llIllIIIIIllIlIIIIlI().unlock();
        return b;
    }
    
    public void IlIlIlIlIlllllllllIl() {
        this.IlIlIIIllIllIIIIIllI();
        while (this.llllIIIIlIIIlIlllIll(0L)) {}
        final ArrayList arrayList = Lists.newArrayList();
        while (arrayList.size() != this.llIIlIIIlIIIllIlIIIl) {
            try {
                arrayList.add(this.llIllIIIIIllIlIIIIlI());
            }
            catch (InterruptedException ex) {}
        }
        this.IlIlIIIllIllIIIIIllI.addAll(arrayList);
    }
    
    public void llllIIIIlIIIlIlllIll(final IlIIllIIllIIllIIlIIl ilIIllIIllIIllIIlIIl) {
        this.IlIlIIIllIllIIIIIllI.add(ilIIllIIllIIllIIlIIl);
    }
    
    public IlIIllIIllIIllIIlIIl llIllIIIIIllIlIIIIlI() {
        return this.IlIlIIIllIllIIIIIllI.take();
    }
    
    public llllIIIIlIIIlIlllIll IlIIIlIlIIIllIlIlIIl() {
        return this.IlIIIlIlIIIllIlIlIIl.take();
    }
    
    public boolean llIllIIIIIllIlIIIIlI(final IlIllIlIlIIIlIlIlIII ilIllIlIlIIIlIlIlIII) {
        ilIllIlIlIIIlIlIlIII.llIllIIIIIllIlIIIIlI().lock();
        boolean b;
        try {
            final llllIIIIlIIIlIlllIll ilIlIIIllIllIIIIIllI = ilIllIlIlIIIlIlIlIII.IlIlIIIllIllIIIIIllI();
            if (ilIlIIIllIllIIIIIllI != null) {
                ilIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll(new IllIIlllIIIIlllIIlIl(this, ilIlIIIllIllIIIIIllI));
                return this.IlIIIlIlIIIllIlIlIIl.offer(ilIlIIIllIllIIIIIllI);
            }
            b = true;
        }
        finally {
            ilIllIlIlIIIlIlIlIII.llIllIIIIIllIlIIIIlI().unlock();
        }
        ilIllIlIlIIIlIlIlIII.llIllIIIIIllIlIIIIlI().unlock();
        return b;
    }
    
    public ListenableFuture llllIIIIlIIIlIlllIll(final IlIIlIlIIIlIIlIlIlII ilIIlIlIIIlIIlIlIlII, final lIIllIIIllllIlllIllI liIllIIIllllIlllIllI, final IlIllIlIlIIIlIlIlIII ilIllIlIlIIIlIlIlIII, final llIllIlIIIIllIlIIllI llIllIlIIIIllIlIIllI) {
        if (Minecraft.getMinecraft().llIIIlIlllIllIIlIllI()) {
            if (lIIIIlIlIllllIIlIllI.IllIIlllIIIIlllIIlIl()) {
                this.llllIIIIlIIIlIlllIll(liIllIIIllllIlllIllI, ilIllIlIlIIIlIlIlIII.IlIlIlIlIlllllllllIl(ilIIlIlIIIlIIlIlIlII.ordinal()));
            }
            else {
                this.llllIIIIlIIIlIlllIll(liIllIIIllllIlllIllI, ((llllIIllllIlIlIIIIll)ilIllIlIlIIIlIlIlIII).llllIIIIlIIIlIlllIll(ilIIlIlIIIlIIlIlIlII, llIllIlIIIIllIlIIllI), ilIllIlIlIIIlIlIlIII);
            }
            liIllIIIllllIlllIllI.llIllIIIIIllIlIIIIlI(0.0, 0.0, 0.0);
            return Futures.immediateFuture((Object)null);
        }
        final ListenableFutureTask create = ListenableFutureTask.create((Runnable)new llllIIIlIlllIlIIIIIl(this, ilIIlIlIIIlIIlIlIlII, liIllIIIllllIlllIllI, ilIllIlIlIIIlIlIlIII, llIllIlIIIIllIlIIllI), (Object)null);
        synchronized (this.lIIIIlIIIIIlllIllIII) {
            this.lIIIIlIIIIIlllIllIII.add(create);
            final ListenableFutureTask listenableFutureTask = create;
            // monitorexit(this.lIIIIlIIIIIlllIllIII)
            return (ListenableFuture)listenableFutureTask;
        }
    }
    
    private void llllIIIIlIIIlIlllIll(final lIIllIIIllllIlllIllI liIllIIIllllIlllIllI, final int n, final IlIllIlIlIIIlIlIlIII ilIllIlIlIIIlIlIlIII) {
        GL11.glNewList(n, 4864);
        lllllIlIIIlIlIIlllII.lllllIlIIIlIlIIlllII();
        ilIllIlIlIIIlIlIlIII.IllIIlllIIIIlllIIlIl();
        this.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll(liIllIIIllllIlllIllI);
        lllllIlIIIlIlIIlllII.lIllllllIIllIlIlIlII();
        GL11.glEndList();
    }
    
    private void llllIIIIlIIIlIlllIll(final lIIllIIIllllIlllIllI liIllIIIllllIlllIllI, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        this.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl);
        this.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll(liIllIIIllllIlllIllI);
    }
    
    public void IlIlIIIllIllIIIIIllI() {
        while (!this.IlIIIlIlIIIllIlIlIIl.isEmpty()) {
            final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll = (llllIIIIlIIIlIlllIll)this.IlIIIlIlIIIllIlIlIIl.poll();
            if (llllIIIIlIIIlIlllIll != null) {
                llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI();
            }
        }
    }
    
    public boolean IllIIlllIIIIlllIIlIl() {
        return this.IlIIIlIlIIIllIlIlIIl.isEmpty() && this.lIIIIlIIIIIlllIllIII.isEmpty();
    }
    
    public void llllIIIlIlllIlIIIIIl() {
        while (this.llIllIlIIIIllIlIIllI.size() != this.llIIlIIIlIIIllIlIIIl) {
            try {
                this.llllIIIIlIIIlIlllIll(Long.MAX_VALUE);
                final IlIIllIIllIIllIIlIIl ilIIllIIllIIllIIlIIl = this.IlIlIIIllIllIIIIIllI.poll(100L, TimeUnit.MILLISECONDS);
                if (ilIIllIIllIIllIIlIIl == null) {
                    continue;
                }
                this.llIllIlIIIIllIlIIllI.add(ilIIllIIllIIllIIlIIl);
            }
            catch (InterruptedException ex) {}
        }
    }
    
    public void lIIIIlIIIIIlllIllIII() {
        this.IlIlIIIllIllIIIIIllI.addAll(this.llIllIlIIIIllIlIIllI);
        this.llIllIlIIIIllIlIIllI.clear();
    }
}
