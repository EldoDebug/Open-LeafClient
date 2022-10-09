package net.minecraft.IlllllllIIIlIIIlIlII;

import java.util.concurrent.locks.*;
import java.lang.reflect.*;

public class IlIIlllIIlIlllllIIlI
{
    private final Object[] llllIIIIlIIIlIlllIll;
    private final Class IlIlIlIlIlllllllllIl;
    private final ReadWriteLock llIllIIIIIllIlIIIIlI;
    private int IlIIIlIlIIIllIlIlIIl;
    private int IlIlIIIllIllIIIIIllI;
    
    public IlIIlllIIlIlllllIIlI(final Class ilIlIlIlIlllllllllIl, final int n) {
        this.llIllIIIIIllIlIIIIlI = new ReentrantReadWriteLock();
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
        this.llllIIIIlIIIlIlllIll = (Object[])Array.newInstance(ilIlIlIlIlllllllllIl, n);
    }
    
    public Object llllIIIIlIIIlIlllIll(final Object o) {
        this.llIllIIIIIllIlIIIIlI.writeLock().lock();
        this.llllIIIIlIIIlIlllIll[this.IlIlIIIllIllIIIIIllI] = o;
        this.IlIlIIIllIllIIIIIllI = (this.IlIlIIIllIllIIIIIllI + 1) % this.llllIIIIlIIIlIlllIll();
        if (this.IlIIIlIlIIIllIlIlIIl < this.llllIIIIlIIIlIlllIll()) {
            ++this.IlIIIlIlIIIllIlIlIIl;
        }
        this.llIllIIIIIllIlIIIIlI.writeLock().unlock();
        return o;
    }
    
    public int llllIIIIlIIIlIlllIll() {
        this.llIllIIIIIllIlIIIIlI.readLock().lock();
        final int length = this.llllIIIIlIIIlIlllIll.length;
        this.llIllIIIIIllIlIIIIlI.readLock().unlock();
        return length;
    }
    
    public Object[] IlIlIlIlIlllllllllIl() {
        final Object[] array = (Object[])Array.newInstance(this.IlIlIlIlIlllllllllIl, this.IlIIIlIlIIIllIlIlIIl);
        this.llIllIIIIIllIlIIIIlI.readLock().lock();
        for (int i = 0; i < this.IlIIIlIlIIIllIlIlIIl; ++i) {
            int n = (this.IlIlIIIllIllIIIIIllI - this.IlIIIlIlIIIllIlIlIIl + i) % this.llllIIIIlIIIlIlllIll();
            if (n < 0) {
                n += this.llllIIIIlIIIlIlllIll();
            }
            array[i] = this.llllIIIIlIIIlIlllIll[n];
        }
        this.llIllIIIIIllIlIIIIlI.readLock().unlock();
        return array;
    }
}
