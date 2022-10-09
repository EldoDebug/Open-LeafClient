package net.minecraft.client.lIIIlllIIIllIIIllIII.IlIlIlIlIlllllllllIl;

import java.util.concurrent.locks.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.*;
import com.google.common.collect.*;
import java.util.*;

public class llllIIIIlIIIlIlllIll
{
    private final IlIllIlIlIIIlIlIlIII llllIIIIlIIIlIlllIll;
    private final ReentrantLock IlIlIlIlIlllllllllIl;
    private final List llIllIIIIIllIlIIIIlI;
    private final llIllIIIIIllIlIIIIlI IlIIIlIlIIIllIlIlIIl;
    private IlIIllIIllIIllIIlIIl IlIlIIIllIllIIIIIllI;
    private llIllIlIIIIllIlIIllI IllIIlllIIIIlllIIlIl;
    private IlIlIlIlIlllllllllIl llllIIIlIlllIlIIIIIl;
    private boolean lIIIIlIIIIIlllIllIII;
    
    public llllIIIIlIIIlIlllIll(final IlIllIlIlIIIlIlIlIII llllIIIIlIIIlIlllIll, final llIllIIIIIllIlIIIIlI ilIIIlIlIIIllIlIlIIl) {
        this.IlIlIlIlIlllllllllIl = new ReentrantLock();
        this.llIllIIIIIllIlIIIIlI = Lists.newArrayList();
        this.llllIIIlIlllIlIIIIIl = net.minecraft.client.lIIIlllIIIllIIIllIII.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll;
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.IlIIIlIlIIIllIlIlIIl = ilIIIlIlIIIllIlIlIIl;
    }
    
    public IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll() {
        return this.llllIIIlIlllIlIIIIIl;
    }
    
    public IlIllIlIlIIIlIlIlIII IlIlIlIlIlllllllllIl() {
        return this.llllIIIIlIIIlIlllIll;
    }
    
    public llIllIlIIIIllIlIIllI llIllIIIIIllIlIIIIlI() {
        return this.IllIIlllIIIIlllIIlIl;
    }
    
    public void llllIIIIlIIIlIlllIll(final llIllIlIIIIllIlIIllI illIIlllIIIIlllIIlIl) {
        this.IllIIlllIIIIlllIIlIl = illIIlllIIIIlllIIlIl;
    }
    
    public IlIIllIIllIIllIIlIIl IlIIIlIlIIIllIlIlIIl() {
        return this.IlIlIIIllIllIIIIIllI;
    }
    
    public void llllIIIIlIIIlIlllIll(final IlIIllIIllIIllIIlIIl ilIlIIIllIllIIIIIllI) {
        this.IlIlIIIllIllIIIIIllI = ilIlIIIllIllIIIIIllI;
    }
    
    public void llllIIIIlIIIlIlllIll(final IlIlIlIlIlllllllllIl llllIIIlIlllIlIIIIIl) {
        this.IlIlIlIlIlllllllllIl.lock();
        try {
            this.llllIIIlIlllIlIIIIIl = llllIIIlIlllIlIIIIIl;
        }
        finally {
            this.IlIlIlIlIlllllllllIl.unlock();
        }
        this.IlIlIlIlIlllllllllIl.unlock();
    }
    
    public void IlIlIIIllIllIIIIIllI() {
        this.IlIlIlIlIlllllllllIl.lock();
        try {
            if (this.IlIIIlIlIIIllIlIlIIl == net.minecraft.client.lIIIlllIIIllIIIllIII.IlIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll && this.llllIIIlIlllIlIIIIIl != net.minecraft.client.lIIIlllIIIllIIIllIII.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl.IlIIIlIlIIIllIlIlIIl) {
                this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(true);
            }
            this.lIIIIlIIIIIlllIllIII = true;
            this.llllIIIlIlllIlIIIIIl = net.minecraft.client.lIIIlllIIIllIIIllIII.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl.IlIIIlIlIIIllIlIlIIl;
            final Iterator<Runnable> iterator = this.llIllIIIIIllIlIIIIlI.iterator();
            while (iterator.hasNext()) {
                iterator.next().run();
            }
        }
        finally {
            this.IlIlIlIlIlllllllllIl.unlock();
        }
        this.IlIlIlIlIlllllllllIl.unlock();
    }
    
    public void llllIIIIlIIIlIlllIll(final Runnable runnable) {
        this.IlIlIlIlIlllllllllIl.lock();
        try {
            this.llIllIIIIIllIlIIIIlI.add(runnable);
            if (this.lIIIIlIIIIIlllIllIII) {
                runnable.run();
            }
        }
        finally {
            this.IlIlIlIlIlllllllllIl.unlock();
        }
        this.IlIlIlIlIlllllllllIl.unlock();
    }
    
    public ReentrantLock IllIIlllIIIIlllIIlIl() {
        return this.IlIlIlIlIlllllllllIl;
    }
    
    public llIllIIIIIllIlIIIIlI llllIIIlIlllIlIIIIIl() {
        return this.IlIIIlIlIIIllIlIlIIl;
    }
    
    public boolean lIIIIlIIIIIlllIllIII() {
        return this.lIIIIlIIIIIlllIllIII;
    }
}
