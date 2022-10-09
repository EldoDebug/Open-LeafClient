package net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIlIlllIlIIIIIl;

import com.google.common.collect.*;
import java.util.*;

public class IIIIlllIIIIIIlIIIlll implements Runnable
{
    private static final IIIIlllIIIIIIlIIIlll llllIIIIlIIIlIlllIll;
    private List IlIlIlIlIlllllllllIl;
    private volatile long llIllIIIIIllIlIIIIlI;
    private volatile long IlIIIlIlIIIllIlIlIIl;
    private volatile boolean IlIlIIIllIllIIIIIllI;
    
    static {
        llllIIIIlIIIlIlllIll = new IIIIlllIIIIIIlIIIlll();
    }
    
    private IIIIlllIIIIIIlIIIlll() {
        this.IlIlIlIlIlllllllllIl = Collections.synchronizedList((List<Object>)Lists.newArrayList());
        final Thread thread = new Thread(this, "File IO Thread");
        thread.setPriority(1);
        thread.start();
    }
    
    public static IIIIlllIIIIIIlIIIlll llllIIIIlIIIlIlllIll() {
        return IIIIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll;
    }
    
    @Override
    public void run() {
        while (true) {
            this.llIllIIIIIllIlIIIIlI();
        }
    }
    
    private void llIllIIIIIllIlIIIIlI() {
        for (int i = 0; i < this.IlIlIlIlIlllllllllIl.size(); ++i) {
            if (!((IlIlIIIllIllIIIIIllI)this.IlIlIlIlIlllllllllIl.get(i)).llllIIIIlIIIlIlllIll()) {
                this.IlIlIlIlIlllllllllIl.remove(i--);
                ++this.IlIIIlIlIIIllIlIlIIl;
            }
            try {
                Thread.sleep(this.IlIlIIIllIllIIIIIllI ? 0L : 10L);
            }
            catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
        if (this.IlIlIlIlIlllllllllIl.isEmpty()) {
            try {
                Thread.sleep(25L);
            }
            catch (InterruptedException ex2) {
                ex2.printStackTrace();
            }
        }
    }
    
    public void llllIIIIlIIIlIlllIll(final IlIlIIIllIllIIIIIllI ilIlIIIllIllIIIIIllI) {
        if (!this.IlIlIlIlIlllllllllIl.contains(ilIlIIIllIllIIIIIllI)) {
            ++this.llIllIIIIIllIlIIIIlI;
            this.IlIlIlIlIlllllllllIl.add(ilIlIIIllIllIIIIIllI);
        }
    }
    
    public void IlIlIlIlIlllllllllIl() {
        this.IlIlIIIllIllIIIIIllI = true;
        while (this.llIllIIIIIllIlIIIIlI != this.IlIIIlIlIIIllIlIlIIl) {
            Thread.sleep(10L);
        }
        this.IlIlIIIllIllIIIIIllI = false;
    }
}
