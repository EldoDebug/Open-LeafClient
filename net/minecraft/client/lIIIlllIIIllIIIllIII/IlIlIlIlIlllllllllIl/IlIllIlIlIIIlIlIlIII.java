package net.minecraft.client.lIIIlllIIIllIIIllIII.IlIlIlIlIlllllllllIl;

import java.util.concurrent.locks.*;
import java.nio.*;
import com.google.common.collect.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.client.*;
import net.optifine.lIIIIlIIIIIlllIllIII.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import java.util.*;
import net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.IllIIlllIIIIlllIIlIl.*;
import net.optifine.lIIIlllIIIllIIIllIII.*;
import net.optifine.*;
import net.minecraft.llllIIIIlIIIlIlllIll.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.*;

public class IlIllIlIlIIIlIlIlIII
{
    private final IlllllllIIIlIIIlIlII lIIIIlIIIIIlllIllIII;
    private final lllllIIIIIlIlIIIIIIl lIIIlllIIIllIIIllIII;
    public static int llllIIIIlIIIlIlllIll;
    private IlIlIlIlIlllllllllIl llIIlIIIlIIIllIlIIIl;
    public llIllIlIIIIllIlIIllI IlIlIlIlIlllllllllIl;
    private final ReentrantLock llIllIlIIIIllIlIIllI;
    private final ReentrantLock lIlIlIIIllIIllIIIllI;
    private llllIIIIlIIIlIlllIll IlIlIIIllIIllIlllllI;
    private final Set IIIIlllIIIIIIlIIIlll;
    private final int llllIIllllIlIlIIIIll;
    private final FloatBuffer IlIllIlIlIIIlIlIlIII;
    private final net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl[] IIlllIIlIllIllIlIIll;
    public net.minecraft.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll llIllIIIIIllIlIIIIlI;
    private int lllIIIIlllllIlIIllIl;
    private boolean IlIlIIIIIIlllIlIllIl;
    private EnumMap IIllIIllIIIlIlIIIIlI;
    private IlIlIlIlIlllllllllIl[] IIIlIIIlIlIIlllIIlll;
    public static final IlIIlIlIIIlIIlIlIlII[] IlIIIlIlIIIllIlIlIIl;
    private final IlIIlIlIIIlIIlIlIlII[] IlIlIIIlIIlIlIIlllIl;
    private final boolean IlllllllIIIlIIIlIlII;
    private final boolean IIlIIIIlllIlllllIlII;
    private boolean IIIlIIlIIIIlllIlllII;
    public int IlIlIIIllIllIIIIIllI;
    public int IllIIlllIIIIlllIIlIl;
    private final IlIllIlIlIIIlIlIlIII[] IlIlIllllllllIIIIlII;
    private boolean IIlllIlIIllIlIlIlIIl;
    private net.minecraft.IIIlIIlIIIIlllIlllII.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll llIIIlIlIllIIlIlIlII;
    private IlIllIlIlIIIlIlIlIII[] lllllIlIIIlIlIIlllII;
    private IlIllIlIlIIIlIlIlIII[] lIllllllIIllIlIlIlII;
    private boolean llIIlllIIlllIIllIllI;
    private lIllIIIIIlllIIlIIllI IIlllIIIlIlllIIlllII;
    public net.optifine.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll llllIIIlIlllIlIIIIIl;
    
    static {
        IlIIIlIlIIIllIlIlIIl = IlIIlIlIIIlIIlIlIlII.values();
    }
    
    public IlIllIlIlIIIlIlIlIII(final IlllllllIIIlIIIlIlII liiiIlIIIIIlllIllIII, final lllllIIIIIlIlIIIIIIl liiIlllIIIllIIIllIII, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final int llllIIllllIlIlIIIIll) {
        this.IlIlIlIlIlllllllllIl = net.minecraft.client.lIIIlllIIIllIIIllIII.IlIlIlIlIlllllllllIl.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll;
        this.llIllIlIIIIllIlIIllI = new ReentrantLock();
        this.lIlIlIIIllIIllIIIllI = new ReentrantLock();
        this.IlIlIIIllIIllIlllllI = null;
        this.IIIIlllIIIIIIlIIIlll = Sets.newHashSet();
        this.IlIllIlIlIIIlIlIlIII = net.minecraft.client.lIIIlllIIIllIIIllIII.llIIIlIlIllIIlIlIlII.IlIlIIIllIllIIIIIllI(16);
        this.IIlllIIlIllIllIlIIll = new net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl[IlIIlIlIIIlIIlIlIlII.values().length];
        this.lllIIIIlllllIlIIllIl = -1;
        this.IlIlIIIIIIlllIlIllIl = true;
        this.IIllIIllIIIlIlIIIIlI = null;
        this.IIIlIIIlIlIIlllIIlll = new IlIlIlIlIlllllllllIl[lllIllIIIllllllIllll.llllIIIlIlllIlIIIIIl.length];
        this.IlIlIIIlIIlIlIIlllIl = new IlIIlIlIIIlIIlIlIlII[1];
        this.IlllllllIIIlIIIlIlII = net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIllllIlIlIIIIll();
        this.IIlIIIIlllIlllllIlII = !net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI();
        this.IIIlIIlIIIIlllIlllII = false;
        this.IlIlIllllllllIIIIlII = new IlIllIlIlIIIlIlIlIII[6];
        this.IIlllIlIIllIlIlIlIIl = false;
        this.lllllIlIIIlIlIIlllII = new IlIllIlIlIIIlIlIlIII[lllIllIIIllllllIllll.llllIIIlIlllIlIIIIIl.length];
        this.lIllllllIIllIlIlIlII = new IlIllIlIlIIIlIlIlIII[lllIllIIIllllllIllll.llllIIIlIlllIlIIIIIl.length];
        this.llIIlllIIlllIIllIllI = false;
        this.IIlllIIIlIlllIIlllII = new lIllIIIIIlllIIlIIllI(this, null, 0);
        this.lIIIIlIIIIIlllIllIII = liiiIlIIIIIlllIllIII;
        this.lIIIlllIIIllIIIllIII = liiIlllIIIllIIIllIII;
        this.llllIIllllIlIlIIIIll = llllIIllllIlIlIIIIll;
        if (!ilIlIlIlIlllllllllIl.equals(this.lIIIlllIIIllIIIllIII())) {
            this.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl);
        }
        if (lIIIIlIlIllllIIlIllI.IllIIlllIIIIlllIIlIl()) {
            for (int i = 0; i < IlIIlIlIIIlIIlIlIlII.values().length; ++i) {
                this.IIlllIIlIllIllIlIIll[i] = new net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl(net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll);
            }
        }
    }
    
    public boolean llllIIIIlIIIlIlllIll(final int lllIIIIlllllIlIIllIl) {
        if (this.lllIIIIlllllIlIIllIl == lllIIIIlllllIlIIllIl) {
            return false;
        }
        this.lllIIIIlllllIlIIllIl = lllIIIIlllllIlIIllIl;
        return true;
    }
    
    public net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl IlIlIlIlIlllllllllIl(final int n) {
        return this.IIlllIIlIllIllIlIIll[n];
    }
    
    public void llllIIIIlIIIlIlllIll(final IlIlIlIlIlllllllllIl llIIlIIIlIIIllIlIIIl) {
        this.lIIIIlIIIIIlllIllIII();
        this.llIIlIIIlIIIllIlIIIl = llIIlIIIlIIIllIlIIIl;
        final int n = 8;
        this.IlIlIIIllIllIIIIIllI = llIIlIIIlIIIllIlIIIl.lIIIIlIIIIIlllIllIII() >> n << n;
        this.IllIIlllIIIIlllIIlIl = llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl() >> n << n;
        this.llIllIIIIIllIlIIIIlI = new net.minecraft.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(llIIlIIIlIIIllIlIIIl, llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(16, 16, 16));
        this.IlIllIlIlIIIlIlIlIII();
        for (int i = 0; i < this.IIIlIIIlIlIIlllIIlll.length; ++i) {
            this.IIIlIIIlIlIIlllIIlll[i] = null;
        }
        this.IIlllIlIIllIlIlIlIIl = false;
        this.llIIlllIIlllIIllIllI = false;
        for (int j = 0; j < this.lllllIlIIIlIlIIlllII.length; ++j) {
            final IlIllIlIlIIIlIlIlIII ilIllIlIlIIIlIlIlIII = this.lllllIlIIIlIlIIlllII[j];
            if (ilIllIlIlIIIlIlIlIII != null) {
                ilIllIlIlIIIlIlIlIII.llIIlllIIlllIIllIllI = false;
            }
        }
        this.llIIIlIlIllIIlIlIlII = null;
        this.llllIIIlIlllIlIIIIIl = null;
    }
    
    public void llllIIIIlIIIlIlllIll(final float n, final float n2, final float n3, final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        final llIllIlIIIIllIlIIllI llIllIIIIIllIlIIIIlI = llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI();
        if (llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI() != null && !llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(IlIIlIlIIIlIIlIlIlII.IlIIIlIlIIIllIlIlIIl)) {
            final lIIllIIIllllIlllIllI llllIIIIlIIIlIlllIll2 = llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl().llllIIIIlIIIlIlllIll(IlIIlIlIIIlIIlIlIlII.IlIIIlIlIIIllIlIlIIl);
            this.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll2, this.llIIlIIIlIIIllIlIIIl);
            llllIIIIlIIIlIlllIll2.llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI());
            this.llllIIIIlIIIlIlllIll(IlIIlIlIIIlIIlIlIlII.IlIIIlIlIIIllIlIlIIl, n, n2, n3, llllIIIIlIIIlIlllIll2, llIllIIIIIllIlIIIIlI);
        }
    }
    
    public void IlIlIlIlIlllllllllIl(final float n, final float n2, final float n3, final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        final llIllIlIIIIllIlIIllI llIllIlIIIIllIlIIllI = new llIllIlIIIIllIlIIllI();
        final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl = new IlIlIlIlIlllllllllIl(this.llIIlIIIlIIIllIlIIIl);
        final IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll2 = ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(15, 15, 15);
        llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl().lock();
        try {
            if (llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll() != net.minecraft.client.lIIIlllIIIllIIIllIII.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl) {
                return;
            }
            llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(llIllIlIIIIllIlIIllI);
        }
        finally {
            llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl().unlock();
        }
        llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl().unlock();
        final IlIlIIIIIIlllIlIllIl ilIlIIIIIIlllIlIllIl = new IlIlIIIIIIlllIlIllIl();
        final HashSet hashSet = Sets.newHashSet();
        if (!this.IlIIIlIlIIIllIlIlIIl(ilIlIlIlIlllllllllIl)) {
            ++net.minecraft.client.lIIIlllIIIllIIIllIII.IlIlIlIlIlllllllllIl.IlIllIlIlIIIlIlIlIII.llllIIIIlIIIlIlllIll;
            final net.optifine.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll ilIlIlIlIlllllllllIl2 = this.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl);
            ilIlIlIlIlllllllllIl2.llllIIIIlIIIlIlllIll();
            final boolean[] array = new boolean[net.minecraft.client.lIIIlllIIIllIIIllIII.IlIlIlIlIlllllllllIl.IlIllIlIlIIIlIlIlIII.IlIIIlIlIIIllIlIlIIl.length];
            final net.minecraft.client.lIIIlllIIIllIIIllIII.IlIllIlIlIIIlIlIlIII ilIIllIIllIIllIIlIIl = Minecraft.getMinecraft().IlIIllIIllIIllIIlIIl();
            final boolean llIllIIIIIllIlIIIIlI = net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.lIIIIlIlIllllIIlIllI.llIllIIIIIllIlIIIIlI();
            final boolean llIllIIIIIllIlIIIIlI2 = net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.k.llIllIIIIIllIlIIIIlI();
            for (final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl : net.optifine.IlIIIlIlIIIllIlIlIIl.llIllIIIIIllIlIIIIlI(ilIlIlIlIlllllllllIl, llllIIIIlIIIlIlllIll2)) {
                final llIIlIIIlIIIllIlIIIl ilIlIlIlIlllllllllIl3 = ilIlIlIlIlllllllllIl2.IlIlIlIlIlllllllllIl(ilIIIlIlIIIllIlIlIIl);
                final net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llIllIIIIIllIlIIIIlI3 = ilIlIlIlIlllllllllIl3.llIllIIIIIllIlIIIIlI();
                if (llIllIIIIIllIlIIIIlI3.llllIIllllIlIlIIIIll()) {
                    ilIlIIIIIIlllIlIllIl.llllIIIIlIIIlIlllIll(ilIIIlIlIIIllIlIlIIl);
                }
                if (net.optifine.lIIIIlIIIIIlllIllIII.IIIIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl3)) {
                    final net.minecraft.IlIlIIIlIIlIlIIlllIl.IlIIIlIlIIIllIlIlIIl llllIIIIlIIIlIlllIll3 = ilIlIlIlIlllllllllIl2.llllIIIIlIIIlIlllIll(new IlIlIlIlIlllllllllIl(ilIIIlIlIIIllIlIlIIl));
                    final IIlllIIlIllIllIlIIll llllIIIIlIIIlIlllIll4 = net.minecraft.client.lIIIlllIIIllIIIllIII.IllIIlllIIIIlllIIlIl.IIIIlllIIIIIIlIIIlll.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll3);
                    if (llllIIIIlIIIlIlllIll3 != null && llllIIIIlIIIlIlllIll4 != null) {
                        llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll3);
                        if (llllIIIIlIIIlIlllIll4.llllIIIIlIIIlIlllIll()) {
                            hashSet.add(llllIIIIlIIIlIlllIll3);
                        }
                    }
                }
                IlIIlIlIIIlIIlIlIlII[] array2;
                if (llIllIIIIIllIlIIIIlI) {
                    array2 = net.minecraft.client.lIIIlllIIIllIIIllIII.IlIlIlIlIlllllllllIl.IlIllIlIlIIIlIlIlIII.IlIIIlIlIIIllIlIlIIl;
                }
                else {
                    array2 = this.IlIlIIIlIIlIlIIlllIl;
                    array2[0] = llIllIIIIIllIlIIIIlI3.IIlllIIlIllIllIlIIll();
                }
                for (int i = 0; i < array2.length; ++i) {
                    final IlIIlIlIIIlIIlIlIlII ilIIlIlIIIlIIlIlIlII = array2[i];
                    if (!llIllIIIIIllIlIIIIlI || net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.IlIlIlIlIlllllllllIl(llIllIIIIIllIlIIIIlI3, net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.lIIIIlIlIllllIIlIllI, ilIIlIlIIIlIIlIlIlII)) {
                        if (llIllIIIIIllIlIIIIlI2) {
                            net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll(net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.k, ilIIlIlIIIlIIlIlIlII);
                        }
                        final IlIIlIlIIIlIIlIlIlII llllIIIIlIIIlIlllIll5 = this.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl3, ilIIlIlIIIlIIlIlIlII);
                        final int ordinal = llllIIIIlIIIlIlllIll5.ordinal();
                        if (llIllIIIIIllIlIIIIlI3.llIllIlIIIIllIlIIllI() != -1) {
                            final lIIllIIIllllIlllIllI llllIIIIlIIIlIlllIll6 = llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl().llllIIIIlIIIlIlllIll(ordinal);
                            llllIIIIlIIIlIlllIll6.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll5);
                            final llllIIIlIlllIlIIIIIl llllIIIIlIIIlIlllIll7 = llllIIIIlIIIlIlllIll6.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl3, ilIIIlIlIIIllIlIlIIl);
                            llllIIIIlIIIlIlllIll7.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl());
                            if (!llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl(llllIIIIlIIIlIlllIll5)) {
                                llIllIlIIIIllIlIIllI.llIllIIIIIllIlIIIIlI(llllIIIIlIIIlIlllIll5);
                                this.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll6, ilIlIlIlIlllllllllIl);
                            }
                            final boolean[] array3 = array;
                            final int n4 = ordinal;
                            array3[n4] |= ilIIllIIllIIllIIlIIl.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl3, ilIIIlIlIIIllIlIlIIl, ilIlIlIlIlllllllllIl2, llllIIIIlIIIlIlllIll6);
                            if (llllIIIIlIIIlIlllIll7.IlIllIlIlIIIlIlIlIII()) {
                                this.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl(), llIllIlIIIIllIlIIllI, array);
                                llllIIIIlIIIlIlllIll7.llllIIIIlIIIlIlllIll(false);
                            }
                        }
                    }
                }
                if (llIllIIIIIllIlIIIIlI2) {
                    net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll(net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.k, null);
                }
            }
            IlIIlIlIIIlIIlIlIlII[] ilIIIlIlIIIllIlIlIIl2;
            for (int length = (ilIIIlIlIIIllIlIlIIl2 = net.minecraft.client.lIIIlllIIIllIIIllIII.IlIlIlIlIlllllllllIl.IlIllIlIlIIIlIlIlIII.IlIIIlIlIIIllIlIlIIl).length, j = 0; j < length; ++j) {
                final IlIIlIlIIIlIIlIlIlII ilIIlIlIIIlIIlIlIlII2 = ilIIIlIlIIIllIlIlIIl2[j];
                if (array[ilIIlIlIIIlIIlIlIlII2.ordinal()]) {
                    llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll(ilIIlIlIIIlIIlIlIlII2);
                }
                if (llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl(ilIIlIlIIIlIIlIlIlII2)) {
                    if (net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.b()) {
                        net.optifine.shaders.IlllllllIIIlIIIlIlII.llllIIIlIlllIlIIIIIl(llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl().llllIIIIlIIIlIlllIll(ilIIlIlIIIlIIlIlIlII2));
                    }
                    final lIIllIIIllllIlllIllI llllIIIIlIIIlIlllIll8 = llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl().llllIIIIlIIIlIlllIll(ilIIlIlIIIlIIlIlIlII2);
                    this.llllIIIIlIIIlIlllIll(ilIIlIlIIIlIIlIlIlII2, n, n2, n3, llllIIIIlIIIlIlllIll8, llIllIlIIIIllIlIIllI);
                    if (llllIIIIlIIIlIlllIll8.llllIIIlIlllIlIIIIIl != null) {
                        llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll(ilIIlIlIIIlIIlIlIlII2, (BitSet)llllIIIIlIIIlIlllIll8.llllIIIlIlllIlIIIIIl.clone());
                    }
                }
                else {
                    llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll(ilIIlIlIIIlIIlIlIlII2, null);
                }
            }
            ilIlIlIlIlllllllllIl2.IlIIIlIlIIIllIlIlIIl();
        }
        llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll(ilIlIIIIIIlllIlIllIl.llllIIIIlIIIlIlllIll());
        this.llIllIlIIIIllIlIIllI.lock();
        try {
            final HashSet hashSet2 = Sets.newHashSet((Iterable)hashSet);
            final HashSet hashSet3 = Sets.newHashSet((Iterable)this.IIIIlllIIIIIIlIIIlll);
            hashSet2.removeAll(this.IIIIlllIIIIIIlIIIlll);
            hashSet3.removeAll(hashSet);
            this.IIIIlllIIIIIIlIIIlll.clear();
            this.IIIIlllIIIIIIlIIIlll.addAll(hashSet);
            this.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll(hashSet3, hashSet2);
        }
        finally {
            this.llIllIlIIIIllIlIIllI.unlock();
        }
        this.llIllIlIIIIllIlIIllI.unlock();
    }
    
    protected void IlIlIlIlIlllllllllIl() {
        this.llIllIlIIIIllIlIIllI.lock();
        try {
            if (this.IlIlIIIllIIllIlllllI != null && this.IlIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll() != net.minecraft.client.lIIIlllIIIllIIIllIII.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl.IlIIIlIlIIIllIlIlIIl) {
                this.IlIlIIIllIIllIlllllI.IlIlIIIllIllIIIIIllI();
                this.IlIlIIIllIIllIlllllI = null;
            }
        }
        finally {
            this.llIllIlIIIIllIlIIllI.unlock();
        }
        this.llIllIlIIIIllIlIIllI.unlock();
    }
    
    public ReentrantLock llIllIIIIIllIlIIIIlI() {
        return this.llIllIlIIIIllIlIIllI;
    }
    
    public llllIIIIlIIIlIlllIll IlIIIlIlIIIllIlIlIIl() {
        this.llIllIlIIIIllIlIIllI.lock();
        llllIIIIlIIIlIlllIll ilIlIIIllIIllIlllllI;
        try {
            this.IlIlIlIlIlllllllllIl();
            this.IlIlIIIllIIllIlllllI = new llllIIIIlIIIlIlllIll(this, net.minecraft.client.lIIIlllIIIllIIIllIII.IlIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll);
            ilIlIIIllIIllIlllllI = this.IlIlIIIllIIllIlllllI;
        }
        finally {
            this.llIllIlIIIIllIlIIllI.unlock();
        }
        this.llIllIlIIIIllIlIIllI.unlock();
        return ilIlIIIllIIllIlllllI;
    }
    
    public llllIIIIlIIIlIlllIll IlIlIIIllIllIIIIIllI() {
        this.llIllIlIIIIllIlIIllI.lock();
        llllIIIIlIIIlIlllIll ilIlIIIllIIllIlllllI;
        try {
            if (this.IlIlIIIllIIllIlllllI != null && this.IlIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll() == net.minecraft.client.lIIIlllIIIllIIIllIII.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll) {
                return null;
            }
            if (this.IlIlIIIllIIllIlllllI != null && this.IlIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll() != net.minecraft.client.lIIIlllIIIllIIIllIII.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl.IlIIIlIlIIIllIlIlIIl) {
                this.IlIlIIIllIIllIlllllI.IlIlIIIllIllIIIIIllI();
                this.IlIlIIIllIIllIlllllI = null;
            }
            (this.IlIlIIIllIIllIlllllI = new llllIIIIlIIIlIlllIll(this, net.minecraft.client.lIIIlllIIIllIIIllIII.IlIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl)).llllIIIIlIIIlIlllIll(this.IlIlIlIlIlllllllllIl);
            ilIlIIIllIIllIlllllI = this.IlIlIIIllIIllIlllllI;
        }
        finally {
            this.llIllIlIIIIllIlIIllI.unlock();
        }
        this.llIllIlIIIIllIlIIllI.unlock();
        return ilIlIIIllIIllIlllllI;
    }
    
    private void llllIIIIlIIIlIlllIll(final lIIllIIIllllIlllIllI liIllIIIllllIlllIllI, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        liIllIIIllllIlllIllI.llllIIIIlIIIlIlllIll(7, net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll);
        if (net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.D()) {
            final int n = 8;
            final int n2 = ilIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII() >> n << n;
            final int n3 = ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII() >> n << n;
            final int n4 = ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl() >> n << n;
            liIllIIIllllIlllIllI.llIllIIIIIllIlIIIIlI(-this.IlIlIIIllIllIIIIIllI, -n3, (double)(-this.IllIIlllIIIIlllIIlIl));
        }
        else {
            liIllIIIllllIlllIllI.llIllIIIIIllIlIIIIlI(-ilIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII(), -ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII(), (double)(-ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl()));
        }
    }
    
    private void llllIIIIlIIIlIlllIll(final IlIIlIlIIIlIIlIlIlII ilIIlIlIIIlIIlIlIlII, final float n, final float n2, final float n3, final lIIllIIIllllIlllIllI liIllIIIllllIlllIllI, final llIllIlIIIIllIlIIllI llIllIlIIIIllIlIIllI) {
        if (ilIIlIlIIIlIIlIlIlII == IlIIlIlIIIlIIlIlIlII.IlIIIlIlIIIllIlIlIIl && !llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl(ilIIlIlIIIlIIlIlIlII)) {
            liIllIIIllllIlllIllI.llllIIIIlIIIlIlllIll(n, n2, n3);
            llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll(liIllIIIllllIlllIllI.llllIIIIlIIIlIlllIll());
        }
        liIllIIIllllIlllIllI.IllIIlllIIIIlllIIlIl();
    }
    
    private void IlIllIlIlIIIlIlIlIII() {
        net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.lllllIlIIIlIlIIlllII();
        net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llIIIlIlIllIIlIlIlII();
        final float n = 1.000001f;
        net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(-8.0f, -8.0f, -8.0f);
        net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(n, n, n);
        net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(8.0f, 8.0f, 8.0f);
        net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(2982, this.IlIllIlIlIIIlIlIlIII);
        net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.lIllllllIIllIlIlIlII();
    }
    
    public void IllIIlllIIIIlllIIlIl() {
        net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(this.IlIllIlIlIIIlIlIlIII);
    }
    
    public llIllIlIIIIllIlIIllI llllIIIlIlllIlIIIIIl() {
        return this.IlIlIlIlIlllllllllIl;
    }
    
    public void llllIIIIlIIIlIlllIll(final llIllIlIIIIllIlIIllI ilIlIlIlIlllllllllIl) {
        this.lIlIlIIIllIIllIIIllI.lock();
        try {
            this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
        }
        finally {
            this.lIlIlIIIllIIllIIIllI.unlock();
        }
        this.lIlIlIIIllIIllIIIllI.unlock();
    }
    
    public void lIIIIlIIIIIlllIllIII() {
        this.IlIlIlIlIlllllllllIl();
        this.IlIlIlIlIlllllllllIl = net.minecraft.client.lIIIlllIIIllIIIllIII.IlIlIlIlIlllllllllIl.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll;
    }
    
    public void llllIIIIlIIIlIlllIll() {
        this.lIIIIlIIIIIlllIllIII();
        for (int i = 0; i < IlIIlIlIIIlIIlIlIlII.values().length; ++i) {
            if (this.IIlllIIlIllIllIlIIll[i] != null) {
                this.IIlllIIlIllIllIlIIll[i].llIllIIIIIllIlIIIIlI();
            }
        }
    }
    
    public IlIlIlIlIlllllllllIl lIIIlllIIIllIIIllIII() {
        return this.llIIlIIIlIIIllIlIIIl;
    }
    
    public void llllIIIIlIIIlIlllIll(final boolean ilIlIIIIIIlllIlIllIl) {
        this.IlIlIIIIIIlllIlIllIl = ilIlIIIIIIlllIlIllIl;
        if (ilIlIIIIIIlllIlIllIl) {
            if (this.IIlllIIlIllIllIlIIll()) {
                this.IIIlIIlIIIIlllIlllII = true;
            }
        }
        else {
            this.IIIlIIlIIIIlllIlllII = false;
        }
    }
    
    public boolean llIIlIIIlIIIllIlIIIl() {
        return this.IlIlIIIIIIlllIlIllIl;
    }
    
    public IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll(final lllIllIIIllllllIllll lllIllIIIllllllIllll) {
        return this.IlIlIlIlIlllllllllIl(lllIllIIIllllllIllll);
    }
    
    public IlIlIlIlIlllllllllIl IlIlIlIlIlllllllllIl(final lllIllIIIllllllIllll lllIllIIIllllllIllll) {
        final int ilIlIlIlIlllllllllIl = lllIllIIIllllllIllll.IlIlIlIlIlllllllllIl();
        IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll = this.IIIlIIIlIlIIlllIIlll[ilIlIlIlIlllllllllIl];
        if (llllIIIIlIIIlIlllIll == null) {
            llllIIIIlIIIlIlllIll = this.lIIIlllIIIllIIIllIII().llllIIIIlIIIlIlllIll(lllIllIIIllllllIllll, 16);
            this.IIIlIIIlIlIIlllIIlll[ilIlIlIlIlllllllllIl] = llllIIIIlIIIlIlllIll;
        }
        return llllIIIIlIIIlIlllIll;
    }
    
    private boolean IIlllIIlIllIllIlIIll() {
        return this.lIIIIlIIIIIlllIllIII instanceof net.minecraft.client.IlIlIIIllIllIIIIIllI.llIIlIIIlIIIllIlIIIl && ((net.minecraft.client.IlIlIIIllIllIIIIIllI.llIIlIIIlIIIllIlIIIl)this.lIIIIlIIIIIlllIllIII).lIIIIlIIIIIlllIllIII();
    }
    
    public boolean llIllIlIIIIllIlIIllI() {
        return this.IIIlIIlIIIIlllIlllII;
    }
    
    protected llIIIlIlllIllIIlIllI llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl2, final int n) {
        return new llIIIlIlllIllIIlIllI(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl, ilIlIlIlIlllllllllIl2, n);
    }
    
    private IlIIlIlIIIlIIlIlIlII llllIIIIlIIIlIlllIll(final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final IlIIlIlIIIlIIlIlIlII ilIIlIlIIIlIIlIlIlII) {
        if (net.optifine.llllIIllllIlIlIIIIll.IlIlIlIlIlllllllllIl()) {
            final IlIIlIlIIIlIIlIlIlII llllIIIIlIIIlIlllIll = net.optifine.llllIIllllIlIlIIIIll.llllIIIIlIIIlIlllIll(llIIlIIIlIIIllIlIIIl);
            if (llllIIIIlIIIlIlllIll != null) {
                return llllIIIIlIIIlIlllIll;
            }
        }
        if (!this.IIlIIIIlllIlllllIlII) {
            return ilIIlIlIIIlIIlIlIlII;
        }
        if (this.IlllllllIIIlIIIlIlII) {
            if (ilIIlIlIIIlIIlIlIlII == IlIIlIlIIIlIIlIlIlII.llIllIIIIIllIlIIIIlI) {
                final net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llIllIIIIIllIlIIIIlI = llIIlIIIlIIIllIlIIIl.llIllIIIIIllIlIIIIlI();
                if (llIllIIIIIllIlIIIIlI instanceof bh) {
                    return ilIIlIlIIIlIIlIlIlII;
                }
                if (llIllIIIIIllIlIIIIlI instanceof net.minecraft.llllIIIIlIIIlIlllIll.llIIIlIlIllIIlIlIlII) {
                    return ilIIlIlIIIlIIlIlIlII;
                }
                return IlIIlIlIIIlIIlIlIlII.IlIlIlIlIlllllllllIl;
            }
        }
        else if (ilIIlIlIIIlIIlIlIlII == IlIIlIlIIIlIIlIlIlII.IlIlIlIlIlllllllllIl) {
            return IlIIlIlIIIlIIlIlIlII.llIllIIIIIllIlIIIIlI;
        }
        return ilIIlIlIIIlIIlIlIlII;
    }
    
    private void llllIIIIlIIIlIlllIll(final IlIIllIIllIIllIIlIIl ilIIllIIllIIllIIlIIl, final llIllIlIIIIllIlIIllI llIllIlIIIIllIlIIllI, final boolean[] array) {
        this.llllIIIIlIIIlIlllIll(IlIIlIlIIIlIIlIlIlII.llIllIIIIIllIlIIIIlI, ilIIllIIllIIllIIlIIl, llIllIlIIIIllIlIIllI, array);
        this.llllIIIIlIIIlIlllIll(IlIIlIlIIIlIIlIlIlII.IlIlIlIlIlllllllllIl, ilIIllIIllIIllIIlIIl, llIllIlIIIIllIlIIllI, array);
        this.llllIIIIlIIIlIlllIll(IlIIlIlIIIlIIlIlIlII.IlIIIlIlIIIllIlIlIIl, ilIIllIIllIIllIIlIIl, llIllIlIIIIllIlIIllI, array);
    }
    
    private void llllIIIIlIIIlIlllIll(final IlIIlIlIIIlIIlIlIlII ilIIlIlIIIlIIlIlIlII, final IlIIllIIllIIllIIlIIl ilIIllIIllIIllIIlIIl, final llIllIlIIIIllIlIIllI llIllIlIIIIllIlIIllI, final boolean[] array) {
        if (ilIIllIIllIIllIIlIIl.llllIIIIlIIIlIlllIll(ilIIlIlIIIlIIlIlIlII).IlIlIIIllIIllIlllllI()) {
            llIllIlIIIIllIlIIllI.llIllIIIIIllIlIIIIlI(ilIIlIlIIIlIIlIlIlII);
            array[ilIIlIlIIIlIIlIlIlII.ordinal()] = true;
        }
    }
    
    private net.optifine.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll IlIlIlIlIlllllllllIl(final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        final IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll = ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(-1, -1, -1);
        final IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll2 = ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(16, 16, 16);
        final llIIIlIlllIllIIlIllI llllIIIIlIIIlIlllIll3 = this.llllIIIIlIIIlIlllIll(this.lIIIIlIIIIIlllIllIII, llllIIIIlIIIlIlllIll, llllIIIIlIIIlIlllIll2, 1);
        if (net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.an.llIllIIIIIllIlIIIIlI()) {
            net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.llllIIIlIlllIlIIIIIl(net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.an, this.lIIIIlIIIIIlllIllIII, ilIlIlIlIlllllllllIl, llllIIIIlIIIlIlllIll3);
        }
        return new net.optifine.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll3, llllIIIIlIIIlIlllIll, llllIIIIlIIIlIlllIll2, 1);
    }
    
    public IlIllIlIlIIIlIlIlIII llllIIIIlIIIlIlllIll(final IIlIlIllllIlllIIIIll ilIlIllllIlllIIIIll, final lllIllIIIllllllIllll lllIllIIIllllllIllll) {
        if (!this.IIlllIlIIllIlIlIlIIl) {
            for (int i = 0; i < lllIllIIIllllllIllll.llllIIIlIlllIlIIIIIl.length; ++i) {
                this.IlIlIllllllllIIIIlII[i] = ilIlIllllIlllIIIIll.llllIIIIlIIIlIlllIll(this.llllIIIIlIIIlIlllIll(lllIllIIIllllllIllll.llllIIIlIlllIlIIIIIl[i]));
            }
            this.IIlllIlIIllIlIlIlIIl = true;
        }
        return this.IlIlIllllllllIIIIlII[lllIllIIIllllllIllll.ordinal()];
    }
    
    public net.minecraft.IIIlIIlIIIIlllIlllII.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll lIlIlIIIllIIllIIIllI() {
        return this.llIllIIIIIllIlIIIIlI(this.llIIlIIIlIIIllIlIIIl);
    }
    
    private net.minecraft.IIIlIIlIIIIlllIlllII.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll llIllIIIIIllIlIIIIlI(final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        final net.minecraft.IIIlIIlIIIIlllIlllII.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll llIIIlIlIllIIlIlIlII = this.llIIIlIlIllIIlIlIlII;
        if (llIIIlIlIllIIlIlIlII != null && llIIIlIlIllIIlIlIlII.llllIIllllIlIlIIIIll()) {
            return llIIIlIlIllIIlIlIlII;
        }
        return this.llIIIlIlIllIIlIlIlII = this.lIIIIlIIIIIlllIllIII.llllIIIlIlllIlIIIIIl(ilIlIlIlIlllllllllIl);
    }
    
    public boolean IlIlIIIllIIllIlllllI() {
        return this.IlIIIlIlIIIllIlIlIIl(this.llIIlIIIlIIIllIlIIIl);
    }
    
    private boolean IlIIIlIlIIIllIlIlIIl(final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        final int liiIlllIIIllIIIllIII = ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII();
        return this.llIllIIIIIllIlIIIIlI(ilIlIlIlIlllllllllIl).llIllIIIIIllIlIIIIlI(liiIlllIIIllIIIllIII, liiIlllIIIllIIIllIII + 15);
    }
    
    public void llllIIIIlIIIlIlllIll(final lllIllIIIllllllIllll lllIllIIIllllllIllll, final IlIllIlIlIIIlIlIlIII ilIllIlIlIIIlIlIlIII) {
        this.lllllIlIIIlIlIIlllII[lllIllIIIllllllIllll.ordinal()] = ilIllIlIlIIIlIlIlIII;
        this.lIllllllIIllIlIlIlII[lllIllIIIllllllIllll.ordinal()] = ilIllIlIlIIIlIlIlIII;
    }
    
    public IlIllIlIlIIIlIlIlIII llIllIIIIIllIlIIIIlI(final lllIllIIIllllllIllll lllIllIIIllllllIllll) {
        if (!this.llIIlllIIlllIIllIllI) {
            this.lllIIIIlllllIlIIllIl();
        }
        return this.lIllllllIIllIlIlIlII[lllIllIIIllllllIllll.ordinal()];
    }
    
    public lIllIIIIIlllIIlIIllI IIIIlllIIIIIIlIIIlll() {
        return this.IIlllIIIlIlllIIlllII;
    }
    
    private void lllIIIIlllllIlIIllIl() {
        final int liiiIlIIIIIlllIllIII = this.lIIIlllIIIllIIIllIII().lIIIIlIIIIIlllIllIII();
        final int llIIlIIIlIIIllIlIIIl = this.lIIIlllIIIllIIIllIII().llIIlIIIlIIIllIlIIIl();
        final int ordinal = lllIllIIIllllllIllll.llIllIIIIIllIlIIIIlI.ordinal();
        final int ordinal2 = lllIllIIIllllllIllll.IlIIIlIlIIIllIlIlIIl.ordinal();
        final int ordinal3 = lllIllIIIllllllIllll.IlIlIIIllIllIIIIIllI.ordinal();
        final int ordinal4 = lllIllIIIllllllIllll.IllIIlllIIIIlllIIlIl.ordinal();
        this.lIllllllIIllIlIlIlII[ordinal] = ((this.lllllIlIIIlIlIIlllII[ordinal].lIIIlllIIIllIIIllIII().llIIlIIIlIIIllIlIIIl() == llIIlIIIlIIIllIlIIIl - 16) ? this.lllllIlIIIlIlIIlllII[ordinal] : null);
        this.lIllllllIIllIlIlIlII[ordinal2] = ((this.lllllIlIIIlIlIIlllII[ordinal2].lIIIlllIIIllIIIllIII().llIIlIIIlIIIllIlIIIl() == llIIlIIIlIIIllIlIIIl + 16) ? this.lllllIlIIIlIlIIlllII[ordinal2] : null);
        this.lIllllllIIllIlIlIlII[ordinal3] = ((this.lllllIlIIIlIlIIlllII[ordinal3].lIIIlllIIIllIIIllIII().lIIIIlIIIIIlllIllIII() == liiiIlIIIIIlllIllIII - 16) ? this.lllllIlIIIlIlIIlllII[ordinal3] : null);
        this.lIllllllIIllIlIlIlII[ordinal4] = ((this.lllllIlIIIlIlIIlllII[ordinal4].lIIIlllIIIllIIIllIII().lIIIIlIIIIIlllIllIII() == liiiIlIIIIIlllIllIII + 16) ? this.lllllIlIIIlIlIIlllII[ordinal4] : null);
        this.llIIlllIIlllIIllIllI = true;
    }
    
    public boolean llllIIIIlIIIlIlllIll(final net.minecraft.client.lIIIlllIIIllIIIllIII.llIllIIIIIllIlIIIIlI.IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl, final int n) {
        return this.llllIIllllIlIlIIIIll().llllIIIIlIIIlIlllIll(ilIIIlIlIIIllIlIlIIl, n) || ilIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(this.llIllIIIIIllIlIIIIlI);
    }
    
    public net.optifine.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll llllIIllllIlIlIIIIll() {
        if (this.llllIIIlIlllIlIIIIIl == null) {
            final IlIlIlIlIlllllllllIl liiIlllIIIllIIIllIII = this.lIIIlllIIIllIIIllIII();
            final int liiiIlIIIIIlllIllIII = liiIlllIIIllIIIllIII.lIIIIlIIIIIlllIllIII();
            final int liiIlllIIIllIIIllIII2 = liiIlllIIIllIIIllIII.lIIIlllIIIllIIIllIII();
            final int llIIlIIIlIIIllIlIIIl = liiIlllIIIllIIIllIII.llIIlIIIlIIIllIlIIIl();
            final int n = 5;
            final int n2 = liiiIlIIIIIlllIllIII >> n << n;
            final int n3 = liiIlllIIIllIIIllIII2 >> n << n;
            final int n4 = llIIlIIIlIIIllIlIIIl >> n << n;
            if (n2 != liiiIlIIIIIlllIllIII || n3 != liiIlllIIIllIIIllIII2 || n4 != llIIlIIIlIIIllIlIIIl) {
                final net.optifine.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll llllIIllllIlIlIIIIll = this.lIIIlllIIIllIIIllIII.llIllIIIIIllIlIIIIlI(new IlIlIlIlIlllllllllIl(n2, n3, n4)).llllIIllllIlIlIIIIll();
                if (llllIIllllIlIlIIIIll != null && llllIIllllIlIlIIIIll.llllIIIIlIIIlIlllIll == n2 && llllIIllllIlIlIIIIll.IlIlIlIlIlllllllllIl == n3 && llllIIllllIlIlIIIIll.llIllIIIIIllIlIIIIlI == n4) {
                    this.llllIIIlIlllIlIIIIIl = llllIIllllIlIlIIIIll;
                }
            }
            if (this.llllIIIlIlllIlIIIIIl == null) {
                final int n5 = 1 << n;
                this.llllIIIlIlllIlIIIIIl = new net.optifine.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll(n2, n3, n4, n2 + n5, n3 + n5, n4 + n5);
            }
        }
        return this.llllIIIlIlllIlIIIIIl;
    }
    
    @Override
    public String toString() {
        return "pos: " + this.lIIIlllIIIllIIIllIII() + ", frameIndex: " + this.lllIIIIlllllIlIIllIl;
    }
}
