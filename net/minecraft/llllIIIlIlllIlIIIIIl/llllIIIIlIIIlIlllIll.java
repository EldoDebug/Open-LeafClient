package net.minecraft.llllIIIlIlllIlIIIIIl;

import net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll.*;
import net.minecraft.llIllIlIIIIllIlIIllI.*;
import java.util.concurrent.locks.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import org.apache.commons.lang3.*;
import net.minecraft.IlIlIIIllIIllIlllllI.*;
import java.util.*;
import com.google.common.collect.*;

public class llllIIIIlIIIlIlllIll
{
    private final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI;
    private boolean IlIIIlIlIIIllIlIlIIl;
    private static final Map IlIlIIIllIllIIIIIllI;
    private final Map IllIIlllIIIIlllIIlIl;
    private boolean llllIIIlIlllIlIIIIIl;
    private ReadWriteLock lIIIIlIIIIIlllIllIII;
    public llIIlIIIlIIIllIlIIIl llllIIIIlIIIlIlllIll;
    public IlIlIlIlIlllllllllIl IlIlIlIlIlllllllllIl;
    
    static {
        (IlIlIIIllIllIIIIIllI = Maps.newHashMap()).put(Byte.class, 0);
        llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI.put(Short.class, 1);
        llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI.put(Integer.class, 2);
        llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI.put(Float.class, 3);
        llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI.put(String.class, 4);
        llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI.put(lllIIIIlIlIllIIlIIIl.class, 5);
        llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI.put(IlIlIlIlIlllllllllIl.class, 6);
        llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI.put(net.minecraft.IlllllllIIIlIIIlIlII.lllIIIIlIlIllIIlIIIl.class, 7);
    }
    
    public llllIIIIlIIIlIlllIll(final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI) {
        this.IlIIIlIlIIIllIlIlIIl = true;
        this.IllIIlllIIIIlllIIlIl = Maps.newHashMap();
        this.lIIIIlIIIIIlllIllIII = new ReentrantReadWriteLock();
        this.llllIIIIlIIIlIlllIll = llIIlIIIlIIIllIlIIIl.IIlllIIlIllIllIlIIll;
        this.IlIlIlIlIlllllllllIl = net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll;
        this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
    }
    
    public void llllIIIIlIIIlIlllIll(final int n, final Object o) {
        final Integer n2 = net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI.get(o.getClass());
        if (n2 == null) {
            throw new IllegalArgumentException("Unknown data type: " + o.getClass());
        }
        if (n > 31) {
            throw new IllegalArgumentException("Data value id is too big with " + n + "! (Max is " + 31 + ")");
        }
        if (this.IllIIlllIIIIlllIIlIl.containsKey(n)) {
            throw new IllegalArgumentException("Duplicate id value for " + n + "!");
        }
        final net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl = new net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl(n2, n, o);
        this.lIIIIlIIIIIlllIllIII.writeLock().lock();
        this.IllIIlllIIIIlllIIlIl.put(n, ilIlIlIlIlllllllllIl);
        this.lIIIIlIIIIIlllIllIII.writeLock().unlock();
        this.IlIIIlIlIIIllIlIlIIl = false;
    }
    
    public void llllIIIIlIIIlIlllIll(final int n, final int n2) {
        final net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl = new net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl(n2, n, null);
        this.lIIIIlIIIIIlllIllIII.writeLock().lock();
        this.IllIIlllIIIIlllIIlIl.put(n, ilIlIlIlIlllllllllIl);
        this.lIIIIlIIIIIlllIllIII.writeLock().unlock();
        this.IlIIIlIlIIIllIlIlIIl = false;
    }
    
    public byte llllIIIIlIIIlIlllIll(final int n) {
        return (byte)this.lIIIlllIIIllIIIllIII(n).IlIlIlIlIlllllllllIl();
    }
    
    public short IlIlIlIlIlllllllllIl(final int n) {
        return (short)this.lIIIlllIIIllIIIllIII(n).IlIlIlIlIlllllllllIl();
    }
    
    public int llIllIIIIIllIlIIIIlI(final int n) {
        return (int)this.lIIIlllIIIllIIIllIII(n).IlIlIlIlIlllllllllIl();
    }
    
    public float IlIIIlIlIIIllIlIlIIl(final int n) {
        return (float)this.lIIIlllIIIllIIIllIII(n).IlIlIlIlIlllllllllIl();
    }
    
    public String IlIlIIIllIllIIIIIllI(final int n) {
        return (String)this.lIIIlllIIIllIIIllIII(n).IlIlIlIlIlllllllllIl();
    }
    
    public lllIIIIlIlIllIIlIIIl IllIIlllIIIIlllIIlIl(final int n) {
        return (lllIIIIlIlIllIIlIIIl)this.lIIIlllIIIllIIIllIII(n).IlIlIlIlIlllllllllIl();
    }
    
    private net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl lIIIlllIIIllIIIllIII(final int n) {
        this.lIIIIlIIIIIlllIllIII.readLock().lock();
        net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl;
        try {
            ilIlIlIlIlllllllllIl = this.IllIIlllIIIIlllIIlIl.get(n);
        }
        catch (Throwable t) {
            final net.minecraft.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll = net.minecraft.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(t, "Getting synched entity data");
            llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll("Synched entity data").llllIIIIlIIIlIlllIll("Data ID", n);
            throw new IIlIlllIlIlllIlIllll(llllIIIIlIIIlIlllIll);
        }
        this.lIIIIlIIIIIlllIllIII.readLock().unlock();
        return ilIlIlIlIlllllllllIl;
    }
    
    public net.minecraft.IlllllllIIIlIIIlIlII.lllIIIIlIlIllIIlIIIl llllIIIlIlllIlIIIIIl(final int n) {
        return (net.minecraft.IlllllllIIIlIIIlIlII.lllIIIIlIlIllIIlIIIl)this.lIIIlllIIIllIIIllIII(n).IlIlIlIlIlllllllllIl();
    }
    
    public void IlIlIlIlIlllllllllIl(final int n, final Object o) {
        final net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl liiIlllIIIllIIIllIII = this.lIIIlllIIIllIIIllIII(n);
        if (ObjectUtils.notEqual(o, liiIlllIIIllIIIllIII.IlIlIlIlIlllllllllIl())) {
            liiIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll(o);
            this.llIllIIIIIllIlIIIIlI.llIIlIIIlIIIllIlIIIl(n);
            liiIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll(true);
            this.llllIIIlIlllIlIIIIIl = true;
        }
    }
    
    public void lIIIIlIIIIIlllIllIII(final int n) {
        net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(this.lIIIlllIIIllIIIllIII(n), true);
        this.llllIIIlIlllIlIIIIIl = true;
    }
    
    public boolean llllIIIIlIIIlIlllIll() {
        return this.llllIIIlIlllIlIIIIIl;
    }
    
    public static void llllIIIIlIIIlIlllIll(final List list, final llllllIllIllIlIllllI llllllIllIllIlIllllI) {
        if (list != null) {
            final Iterator<net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl> iterator = list.iterator();
            while (iterator.hasNext()) {
                llllIIIIlIIIlIlllIll(llllllIllIllIlIllllI, iterator.next());
            }
        }
        llllllIllIllIlIllllI.writeByte(127);
    }
    
    public List IlIlIlIlIlllllllllIl() {
        List<net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl> arrayList = null;
        if (this.llllIIIlIlllIlIIIIIl) {
            this.lIIIIlIIIIIlllIllIII.readLock().lock();
            for (final net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl : this.IllIIlllIIIIlllIIlIl.values()) {
                if (ilIlIlIlIlllllllllIl.IlIIIlIlIIIllIlIlIIl()) {
                    ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(false);
                    if (arrayList == null) {
                        arrayList = (List<net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl>)Lists.newArrayList();
                    }
                    arrayList.add(ilIlIlIlIlllllllllIl);
                }
            }
            this.lIIIIlIIIIIlllIllIII.readLock().unlock();
        }
        this.llllIIIlIlllIlIIIIIl = false;
        return arrayList;
    }
    
    public void llllIIIIlIIIlIlllIll(final llllllIllIllIlIllllI llllllIllIllIlIllllI) {
        this.lIIIIlIIIIIlllIllIII.readLock().lock();
        final Iterator<net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl> iterator = this.IllIIlllIIIIlllIIlIl.values().iterator();
        while (iterator.hasNext()) {
            llllIIIIlIIIlIlllIll(llllllIllIllIlIllllI, iterator.next());
        }
        this.lIIIIlIIIIIlllIllIII.readLock().unlock();
        llllllIllIllIlIllllI.writeByte(127);
    }
    
    public List llIllIIIIIllIlIIIIlI() {
        List<net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl> arrayList = null;
        this.lIIIIlIIIIIlllIllIII.readLock().lock();
        for (final net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl : this.IllIIlllIIIIlllIIlIl.values()) {
            if (arrayList == null) {
                arrayList = (List<net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl>)Lists.newArrayList();
            }
            arrayList.add(ilIlIlIlIlllllllllIl);
        }
        this.lIIIIlIIIIIlllIllIII.readLock().unlock();
        return arrayList;
    }
    
    private static void llllIIIIlIIIlIlllIll(final llllllIllIllIlIllllI llllllIllIllIlIllllI, final net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        llllllIllIllIlIllllI.writeByte((ilIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI() << 5 | (ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll() & 0x1F)) & 0xFF);
        switch (ilIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI()) {
            case 0: {
                llllllIllIllIlIllllI.writeByte((byte)ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl());
                break;
            }
            case 1: {
                llllllIllIllIlIllllI.writeShort((short)ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl());
                break;
            }
            case 2: {
                llllllIllIllIlIllllI.writeInt((int)ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl());
                break;
            }
            case 3: {
                llllllIllIllIlIllllI.writeFloat((float)ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl());
                break;
            }
            case 4: {
                llllllIllIllIlIllllI.llllIIIIlIIIlIlllIll((String)ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl());
                break;
            }
            case 5: {
                llllllIllIllIlIllllI.llllIIIIlIIIlIlllIll((lllIIIIlIlIllIIlIIIl)ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl());
                break;
            }
            case 6: {
                final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl2 = (IlIlIlIlIlllllllllIl)ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl();
                llllllIllIllIlIllllI.writeInt(ilIlIlIlIlllllllllIl2.lIIIIlIIIIIlllIllIII());
                llllllIllIllIlIllllI.writeInt(ilIlIlIlIlllllllllIl2.lIIIlllIIIllIIIllIII());
                llllllIllIllIlIllllI.writeInt(ilIlIlIlIlllllllllIl2.llIIlIIIlIIIllIlIIIl());
                break;
            }
            case 7: {
                final net.minecraft.IlllllllIIIlIIIlIlII.lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl = (net.minecraft.IlllllllIIIlIIIlIlII.lllIIIIlIlIllIIlIIIl)ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl();
                llllllIllIllIlIllllI.writeFloat(lllIIIIlIlIllIIlIIIl.IlIlIlIlIlllllllllIl());
                llllllIllIllIlIllllI.writeFloat(lllIIIIlIlIllIIlIIIl.llIllIIIIIllIlIIIIlI());
                llllllIllIllIlIllllI.writeFloat(lllIIIIlIlIllIIlIIIl.IlIIIlIlIIIllIlIlIIl());
                break;
            }
        }
    }
    
    public static List IlIlIlIlIlllllllllIl(final llllllIllIllIlIllllI llllllIllIllIlIllllI) {
        List<Object> arrayList = null;
        for (byte b = llllllIllIllIlIllllI.readByte(); b != 127; b = llllllIllIllIlIllllI.readByte()) {
            if (arrayList == null) {
                arrayList = (List<Object>)Lists.newArrayList();
            }
            final int n = (b & 0xE0) >> 5;
            final int n2 = b & 0x1F;
            Object o = null;
            switch (n) {
                case 0: {
                    o = new net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl(n, n2, llllllIllIllIlIllllI.readByte());
                    break;
                }
                case 1: {
                    o = new net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl(n, n2, llllllIllIllIlIllllI.readShort());
                    break;
                }
                case 2: {
                    o = new net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl(n, n2, llllllIllIllIlIllllI.readInt());
                    break;
                }
                case 3: {
                    o = new net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl(n, n2, llllllIllIllIlIllllI.readFloat());
                    break;
                }
                case 4: {
                    o = new net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl(n, n2, llllllIllIllIlIllllI.llIllIIIIIllIlIIIIlI(32767));
                    break;
                }
                case 5: {
                    o = new net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl(n, n2, llllllIllIllIlIllllI.lIIIIlIIIIIlllIllIII());
                    break;
                }
                case 6: {
                    o = new net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl(n, n2, new IlIlIlIlIlllllllllIl(llllllIllIllIlIllllI.readInt(), llllllIllIllIlIllllI.readInt(), llllllIllIllIlIllllI.readInt()));
                    break;
                }
                case 7: {
                    o = new net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl(n, n2, new net.minecraft.IlllllllIIIlIIIlIlII.lllIIIIlIlIllIIlIIIl(llllllIllIllIlIllllI.readFloat(), llllllIllIllIlIllllI.readFloat(), llllllIllIllIlIllllI.readFloat()));
                    break;
                }
            }
            arrayList.add(o);
        }
        return arrayList;
    }
    
    public void llllIIIIlIIIlIlllIll(final List list) {
        this.lIIIIlIIIIIlllIllIII.writeLock().lock();
        for (final net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl : list) {
            final net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl2 = this.IllIIlllIIIIlllIIlIl.get(ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll());
            if (ilIlIlIlIlllllllllIl2 != null) {
                ilIlIlIlIlllllllllIl2.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl());
                this.llIllIIIIIllIlIIIIlI.llIIlIIIlIIIllIlIIIl(ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll());
            }
        }
        this.lIIIIlIIIIIlllIllIII.writeLock().unlock();
        this.llllIIIlIlllIlIIIIIl = true;
    }
    
    public boolean IlIIIlIlIIIllIlIlIIl() {
        return this.IlIIIlIlIIIllIlIlIIl;
    }
    
    public void IlIlIIIllIllIIIIIllI() {
        this.llllIIIlIlllIlIIIIIl = false;
    }
}
