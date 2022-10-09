package net.minecraft.client.llllIIIlIlllIlIIIIIl;

import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import com.google.common.collect.*;
import net.minecraft.IIllIIllIIIlIlIIIIlI.*;
import java.util.*;
import java.util.concurrent.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI.*;
import net.optifine.lIIIIlIIIIIlllIllIII.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;

public class llIllIIIIIllIlIIIIlI
{
    private static final lIllllIllIllIIllllll IlIlIlIlIlllllllllIl;
    protected IlllllllIIIlIIIlIlII llllIIIIlIIIlIlllIll;
    private List[][] llIllIIIIIllIlIIIIlI;
    private List IlIIIlIlIIIllIlIlIIl;
    private IIlllIIlIllIllIlIIll IlIlIIIllIllIIIIIllI;
    private Random IllIIlllIIIIlllIIlIl;
    private Map llllIIIlIlllIlIIIIIl;
    
    static {
        IlIlIlIlIlllllllllIl = new lIllllIllIllIIllllll("textures/particle/particles.png");
    }
    
    public llIllIIIIIllIlIIIIlI(final IlllllllIIIlIIIlIlII llllIIIIlIIIlIlllIll, final IIlllIIlIllIllIlIIll ilIlIIIllIllIIIIIllI) {
        this.llIllIIIIIllIlIIIIlI = new List[4][];
        this.IlIIIlIlIIIllIlIlIIl = Lists.newArrayList();
        this.IllIIlllIIIIlllIIlIl = new Random();
        this.llllIIIlIlllIlIIIIIl = Maps.newHashMap();
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.IlIlIIIllIllIIIIIllI = ilIlIIIllIllIIIIIllI;
        for (int i = 0; i < 4; ++i) {
            this.llIllIIIIIllIlIIIIlI[i] = new List[2];
            for (int j = 0; j < 2; ++j) {
                this.llIllIIIIIllIlIIIIlI[i][j] = Lists.newArrayList();
            }
        }
        this.llIllIIIIIllIlIIIIlI();
    }
    
    private void llIllIIIIIllIlIIIIlI() {
        this.llllIIIIlIIIlIlllIll(IlIllllIIlIIlIlIlIll.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI(), new llllllIllIllIlIllllI());
        this.llllIIIIlIIIlIlllIll(IlIllllIIlIIlIlIlIll.IlIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI(), new lllIIIIlllllIlIIllIl());
        this.llllIIIIlIIIlIlllIll(IlIllllIIlIIlIlIlIll.IllIIlllIIIIlllIIlIl.llIllIIIIIllIlIIIIlI(), new IlIllllIIIlIllIlIIll());
        this.llllIIIIlIIIlIlllIll(IlIllllIIlIIlIlIlIll.llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI(), new llIllIlIlIIIIIIIllII());
        this.llllIIIIlIIIlIlllIll(IlIllllIIlIIlIlIlIll.IlllIIIIlIIIlIlIlIIl.llIllIIIIIllIlIIIIlI(), new IIlllIIlllIIIlIlllII());
        this.llllIIIIlIIIlIlllIll(IlIllllIIlIIlIlIlIll.lIIIIlIIIIIlllIllIII.llIllIIIIIllIlIIIIlI(), new IIllIIIlIIIIlIIlIIII());
        this.llllIIIIlIIIlIlllIll(IlIllllIIlIIlIlIlIll.lIIIlllIIIllIIIllIII.llIllIIIIIllIlIIIIlI(), new lIIIlllIIIllIIIllIII());
        this.llllIIIIlIIIlIlllIll(IlIllllIIlIIlIlIlIll.llIIlIIIlIIIllIlIIIl.llIllIIIIIllIlIIIIlI(), new IlIlIIIlIIlIlIIlllIl());
        this.llllIIIIlIIIlIlllIll(IlIllllIIlIIlIlIlIll.llIllIlIIIIllIlIIllI.llIllIIIIIllIlIIIIlI(), new net.minecraft.client.llllIIIlIlllIlIIIIIl.IlllllllIIIlIIIlIlII());
        this.llllIIIIlIIIlIlllIll(IlIllllIIlIIlIlIlIll.lIlIlIIIllIIllIIIllI.llIllIIIIIllIlIIIIlI(), new llllIllllIllllIlIlII());
        this.llllIIIIlIIIlIlllIll(IlIllllIIlIIlIlIlIll.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI(), new IIIlIIlIIIIlllIlllII());
        this.llllIIIIlIIIlIlllIll(IlIllllIIlIIlIlIlIll.IIIIlllIIIIIIlIIIlll.llIllIIIIIllIlIIIIlI(), new llIllIIlllllllllllll());
        this.llllIIIIlIIIlIlllIll(IlIllllIIlIIlIlIlIll.llllIIllllIlIlIIIIll.llIllIIIIIllIlIIIIlI(), new lllllIIllIlIllIllllI());
        this.llllIIIIlIIIlIlllIll(IlIllllIIlIIlIlIlIll.IlIllIlIlIIIlIlIlIII.llIllIIIIIllIlIIIIlI(), new IlIIIIIlIIllIIlIlIll());
        this.llllIIIIlIIIlIlllIll(IlIllllIIlIIlIlIlIll.IIlllIIlIllIllIlIIll.llIllIIIIIllIlIIIIlI(), new IIllIIIlIIlIlIlIIIII());
        this.llllIIIIlIIIlIlllIll(IlIllllIIlIIlIlIlIll.lllIIIIlllllIlIIllIl.llIllIIIIIllIlIIIIlI(), new IllllIIlIlIllIIIllII());
        this.llllIIIIlIIIlIlllIll(IlIllllIIlIIlIlIlIll.IlIlIIIIIIlllIlIllIl.llIllIIIIIllIlIIIIlI(), new lIllllllIIllIlIlIlII());
        this.llllIIIIlIIIlIlllIll(IlIllllIIlIIlIlIlIll.IIllIIllIIIlIlIIIIlI.llIllIIIIIllIlIIIIlI(), new lllllIlIIIlIlIIlllII());
        this.llllIIIIlIIIlIlllIll(IlIllllIIlIIlIlIlIll.IIIlIIIlIlIIlllIIlll.llIllIIIIIllIlIIIIlI(), new IlIIlIlIIIlIIlIlIlII());
        this.llllIIIIlIIIlIlllIll(IlIllllIIlIIlIlIlIll.IlIlIIIlIIlIlIIlllIl.llIllIIIIIllIlIIIIlI(), new llIIlIIIlIIIllIlIIIl());
        this.llllIIIIlIIIlIlllIll(IlIllllIIlIIlIlIlIll.IlllllllIIIlIIIlIlII.llIllIIIIIllIlIIIIlI(), new lIIIlllIIIllIIIllIII());
        this.llllIIIIlIIIlIlllIll(IlIllllIIlIIlIlIlIll.IIlIIIIlllIlllllIlII.llIllIIIIIllIlIIIIlI(), new lllllIIIIIlIlIIIIIIl());
        this.llllIIIIlIIIlIlllIll(IlIllllIIlIIlIlIlIll.IIIlIIlIIIIlllIlllII.llIllIIIIIllIlIIIIlI(), new llIIIllIlIllIllIIIIl());
        this.llllIIIIlIIIlIlllIll(IlIllllIIlIIlIlIlIll.IlIlIllllllllIIIIlII.llIllIIIIIllIlIIIIlI(), new IIlllIIIlIlllIIlllII());
        this.llllIIIIlIIIlIlllIll(IlIllllIIlIIlIlIlIll.IIlllIlIIllIlIlIlIIl.llIllIIIIIllIlIIIIlI(), new IllIllIIIIlIIlIlllII());
        this.llllIIIIlIIIlIlllIll(IlIllllIIlIIlIlIlIll.llIIIlIlIllIIlIlIlII.llIllIIIIIllIlIIIIlI(), new llIIIlIlllIllIIlIllI());
        this.llllIIIIlIIIlIlllIll(IlIllllIIlIIlIlIlIll.lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI(), new IllIllIlllIllllIIllI());
        this.llllIIIIlIIIlIlllIll(IlIllllIIlIIlIlIlIll.lIllllllIIllIlIlIlII.llIllIIIIIllIlIIIIlI(), new IIllIIllIIIlIlIIIIlI());
        this.llllIIIIlIIIlIlllIll(IlIllllIIlIIlIlIlIll.llIIlllIIlllIIllIllI.llIllIIIIIllIlIIIIlI(), new lllllIIlIlIIIlIlIIIl());
        this.llllIIIIlIIIlIlllIll(IlIllllIIlIIlIlIlIll.IIlllIIIlIlllIIlllII.llIllIIIIIllIlIIIIlI(), new IlIllIlIlIIIlIlIlIII());
        this.llllIIIIlIIIlIlllIll(IlIllllIIlIIlIlIlIll.IIlIIIIIllIlIIIlIIll.llIllIIIIIllIlIIIIlI(), new lIIllIIIllllIlllIllI());
        this.llllIIIIlIIIlIlllIll(IlIllllIIlIIlIlIlIll.llllllIllIllIlIllllI.llIllIIIIIllIlIIIIlI(), new llllIIllllIlIlIIIIll());
        this.llllIIIIlIIIlIlllIll(IlIllllIIlIIlIlIlIll.IIIllllllIllIIIlllIl.llIllIIIIIllIlIIIIlI(), new IllIlIIllIllIIlIllII());
        this.llllIIIIlIIIlIlllIll(IlIllllIIlIIlIlIlIll.IlIIIlIIIllllIlIlIlI.llIllIIIIIllIlIIIIlI(), new IlIlIlIlIlllllllllIl());
        this.llllIIIIlIIIlIlllIll(IlIllllIIlIIlIlIlIll.IIIIIllIIIIlIIIIllIl.llIllIIIIIllIlIIIIlI(), new IIIIlllIIIIIIlIIIlll());
        this.llllIIIIlIIIlIlllIll(IlIllllIIlIIlIlIlIll.IIIIIIIIIlllIllIlIlI.llIllIIIIIllIlIIIIlI(), new IIlllIlIIllIlIlIlIIl());
        this.llllIIIIlIIIlIlllIll(IlIllllIIlIIlIlIlIll.IIllllIIIlIIIIIIllIl.llIllIIIIIllIlIIIIlI(), new lIlIlIIIllIIllIIIllI());
        this.llllIIIIlIIIlIlllIll(IlIllllIIlIIlIlIlIll.llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI(), new IIlIIIlllIllIllIlIII());
        this.llllIIIIlIIIlIlllIll(IlIllllIIlIIlIlIlIll.IlIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI(), new llIIIIIIlIllIIlIIIll());
        this.llllIIIIlIIIlIlllIll(IlIllllIIlIIlIlIlIll.IlIIIlIlIIIllIlIlIIl.llIllIIIIIllIlIIIIlI(), new IIIIIllIIIIlIIIIllIl());
        this.llllIIIIlIIIlIlllIll(IlIllllIIlIIlIlIlIll.llIllIlIlIIIIIIIllII.llIllIIIIIllIlIIIIlI(), new IIlllIIIllIllIIlIlIl());
    }
    
    public void llllIIIIlIIIlIlllIll(final int n, final IIIllIIllIIIIIIlIIlI iiIllIIllIIIIIIlIIlI) {
        this.llllIIIlIlllIlIIIIIl.put(n, iiIllIIllIIIIIIlIIlI);
    }
    
    public void llllIIIIlIIIlIlllIll(final net.minecraft.llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI, final IlIllllIIlIIlIlIlIll ilIllllIIlIIlIlIlIll) {
        this.IlIIIlIlIIIllIlIlIIl.add(new IllIIlllllIIllIIllIl(this.llllIIIIlIIIlIlllIll, llIllIIIIIllIlIIIIlI, ilIllllIIlIIlIlIlIll));
    }
    
    public IIIllllllIllIIIlllIl llllIIIIlIIIlIlllIll(final int n, final double n2, final double n3, final double n4, final double n5, final double n6, final double n7, final int... array) {
        final IIIllIIllIIIIIIlIIlI iiIllIIllIIIIIIlIIlI = this.llllIIIlIlllIlIIIIIl.get(n);
        if (iiIllIIllIIIIIIlIIlI != null) {
            final IIIllllllIllIIIlllIl llllIIIIlIIIlIlllIll = iiIllIIllIIIIIIlIIlI.llllIIIIlIIIlIlllIll(n, this.llllIIIIlIIIlIlllIll, n2, n3, n4, n5, n6, n7, array);
            if (llllIIIIlIIIlIlllIll != null) {
                this.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll);
                return llllIIIIlIIIlIlllIll;
            }
        }
        return null;
    }
    
    public void llllIIIIlIIIlIlllIll(final IIIllllllIllIIIlllIl iiIllllllIllIIIlllIl) {
        if (iiIllllllIllIIIlllIl != null && (!(iiIllllllIllIIIlllIl instanceof IIllllIIIlIIIIIIllIl) || net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.lIlIlIlllIIlIlIlllIl())) {
            final int ilIIIlIlIIIllIlIlIIl = iiIllllllIllIIIlllIl.IlIIIlIlIIIllIlIlIIl();
            final int n = (iiIllllllIllIIIlllIl.lIIIlllIIIllIIIllIII() == 1.0f) ? 1 : 0;
            if (this.llIllIIIIIllIlIIIIlI[ilIIIlIlIIIllIlIlIIl][n].size() >= 4000) {
                this.llIllIIIIIllIlIIIIlI[ilIIIlIlIIIllIlIlIIl][n].remove(0);
            }
            this.llIllIIIIIllIlIIIIlI[ilIIIlIlIIIllIlIlIIl][n].add(iiIllllllIllIIIlllIl);
        }
    }
    
    public void llllIIIIlIIIlIlllIll() {
        for (int i = 0; i < 4; ++i) {
            this.llllIIIIlIIIlIlllIll(i);
        }
        final ArrayList arrayList = Lists.newArrayList();
        for (final IllIIlllllIIllIIllIl illIIlllllIIllIIllIl : this.IlIIIlIlIIIllIlIlIIl) {
            illIIlllllIIllIIllIl.IIllIIllIIIlIlIIIIlI();
            if (illIIlllllIIllIIllIl.IIlIlIlIIlIllIIIIIIl) {
                arrayList.add(illIIlllllIIllIIllIl);
            }
        }
        this.IlIIIlIlIIIllIlIlIIl.removeAll(arrayList);
    }
    
    private void llllIIIIlIIIlIlllIll(final int n) {
        for (int i = 0; i < 2; ++i) {
            this.llllIIIIlIIIlIlllIll(this.llIllIIIIIllIlIIIIlI[n][i]);
        }
    }
    
    private void llllIIIIlIIIlIlllIll(final List list) {
        final ArrayList arrayList = Lists.newArrayList();
        final long currentTimeMillis = System.currentTimeMillis();
        int size = list.size();
        for (int i = 0; i < list.size(); ++i) {
            final IIIllllllIllIIIlllIl iiIllllllIllIIIlllIl = list.get(i);
            this.IlIIIlIlIIIllIlIlIIl(iiIllllllIllIIIlllIl);
            if (iiIllllllIllIIIlllIl.IIlIlIlIIlIllIIIIIIl) {
                arrayList.add(iiIllllllIllIIIlllIl);
            }
            --size;
            if (System.currentTimeMillis() > currentTimeMillis + 20L) {
                break;
            }
        }
        if (size > 0) {
            int n = size;
            for (Iterator<IIIllllllIllIIIlllIl> iterator = list.iterator(); iterator.hasNext() && n > 0; --n) {
                iterator.next().IllIllIIIIlIIlIlllII();
                iterator.remove();
            }
        }
        list.removeAll(arrayList);
    }
    
    private void IlIIIlIlIIIllIlIlIIl(final IIIllllllIllIIIlllIl iiIllllllIllIIIlllIl) {
        try {
            iiIllllllIllIIIlllIl.IIllIIllIIIlIlIIIIlI();
        }
        catch (Throwable t) {
            final net.minecraft.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll = net.minecraft.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(t, "Ticking Particle");
            final net.minecraft.llIllIIIIIllIlIIIIlI.lIIIlllIIIllIIIllIII llllIIIIlIIIlIlllIll2 = llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll("Particle being ticked");
            final int ilIIIlIlIIIllIlIlIIl = iiIllllllIllIIIlllIl.IlIIIlIlIIIllIlIlIIl();
            llllIIIIlIIIlIlllIll2.llllIIIIlIIIlIlllIll("Particle", new IlIIIlIlIIIllIlIlIIl(this, iiIllllllIllIIIlllIl));
            llllIIIIlIIIlIlllIll2.llllIIIIlIIIlIlllIll("Particle Type", new IlIlIIIllIllIIIIIllI(this, ilIIIlIlIIIllIlIlIIl));
            throw new IIlIlllIlIlllIlIllll(llllIIIIlIIIlIlllIll);
        }
    }
    
    public void llllIIIIlIIIlIlllIll(final net.minecraft.llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI, final float n) {
        final float ilIlIlIlIlllllllllIl = net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl();
        final float ilIIIlIlIIIllIlIlIIl = net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl();
        final float ilIlIIIllIllIIIIIllI = net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI();
        final float illIIlllIIIIlllIIlIl = net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl();
        final float llIllIIIIIllIlIIIIlI2 = net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI();
        IIIllllllIllIIIlllIl.llllIIllllIlIlIIIIll = llIllIIIIIllIlIIIIlI.lIIlIIIlIllIlIllIIIl + (llIllIIIIIllIlIIIIlI.IIlllIlIIllIlIlIlIIl - llIllIIIIIllIlIIIIlI.lIIlIIIlIllIlIllIIIl) * n;
        IIIllllllIllIIIlllIl.IlIllIlIlIIIlIlIlIII = llIllIIIIIllIlIIIIlI.IIlIIIlllIllIllIlIII + (llIllIIIIIllIlIIIIlI.llIIIlIlIllIIlIlIlII - llIllIIIIIllIlIIIIlI.IIlIIIlllIllIllIlIII) * n;
        IIIllllllIllIIIlllIl.IIlllIIlIllIllIlIIll = llIllIIIIIllIlIIIIlI.lIlIlIlllIIlIlIlllIl + (llIllIIIIIllIlIIIIlI.lllllIlIIIlIlIIlllII - llIllIIIIIllIlIIIIlI.lIlIlIlllIIlIlIlllIl) * n;
        net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.lIlIlIIIllIIllIIIllI();
        net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(770, 771);
        net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(516, 0.003921569f);
        final boolean b = net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(this.llllIIIIlIIIlIlllIll, llIllIIIIIllIlIIIIlI, n).IllIIlllIIIIlllIIlIl() == net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII;
        for (int i = 0; i < 3; ++i) {
            for (int j = 0; j < 2; ++j) {
                final int n2 = i;
                if (!this.llIllIIIIIllIlIIIIlI[i][j].isEmpty()) {
                    switch (j) {
                        case 0: {
                            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(false);
                            break;
                        }
                        case 1: {
                            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(true);
                            break;
                        }
                    }
                    switch (i) {
                        default: {
                            this.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl);
                            break;
                        }
                        case 1: {
                            this.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll(IlIlIIIIIIlllIlIllIl.IlIlIlIlIlllllllllIl);
                            break;
                        }
                    }
                    net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI(1.0f, 1.0f, 1.0f, 1.0f);
                    final net.minecraft.client.lIIIlllIIIllIIIllIII.IIlllIIlllIIIlIlllII llllIIIIlIIIlIlllIll = net.minecraft.client.lIIIlllIIIllIIIllIII.IIlllIIlllIIIlIlllII.llllIIIIlIIIlIlllIll();
                    final net.minecraft.client.lIIIlllIIIllIIIllIII.lIIllIIIllllIlllIllI llIllIIIIIllIlIIIIlI3 = llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI();
                    llIllIIIIIllIlIIIIlI3.llllIIIIlIIIlIlllIll(7, net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl);
                    for (int k = 0; k < this.llIllIIIIIllIlIIIIlI[i][j].size(); ++k) {
                        final IIIllllllIllIIIlllIl iiIllllllIllIIIlllIl = this.llIllIIIIIllIlIIIIlI[i][j].get(k);
                        try {
                            if (b || !(iiIllllllIllIIIlllIl instanceof lIIIIIlIlIIIlIIIIlIl)) {
                                iiIllllllIllIIIlllIl.llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI3, llIllIIIIIllIlIIIIlI, n, ilIlIlIlIlllllllllIl, llIllIIIIIllIlIIIIlI2, ilIIIlIlIIIllIlIlIIl, ilIlIIIllIllIIIIIllI, illIIlllIIIIlllIIlIl);
                            }
                        }
                        catch (Throwable t) {
                            final net.minecraft.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll2 = net.minecraft.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(t, "Rendering Particle");
                            final net.minecraft.llIllIIIIIllIlIIIIlI.lIIIlllIIIllIIIllIII llllIIIIlIIIlIlllIll3 = llllIIIIlIIIlIlllIll2.llllIIIIlIIIlIlllIll("Particle being rendered");
                            llllIIIIlIIIlIlllIll3.llllIIIIlIIIlIlllIll("Particle", new IllIIlllIIIIlllIIlIl(this, iiIllllllIllIIIlllIl));
                            llllIIIIlIIIlIlllIll3.llllIIIIlIIIlIlllIll("Particle Type", new llllIIIlIlllIlIIIIIl(this, n2));
                            throw new IIlIlllIlIlllIlIllll(llllIIIIlIIIlIlllIll2);
                        }
                    }
                    llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl();
                }
            }
        }
        net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(true);
        net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llIllIlIIIIllIlIIllI();
        net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(516, 0.1f);
    }
    
    public void IlIlIlIlIlllllllllIl(final net.minecraft.llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI, final float n) {
        final float ilIlIlIlIlllllllllIl = net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.IlIlIlIlIlllllllllIl(llIllIIIIIllIlIIIIlI.IIlIIIIIllIlIIIlIIll * 0.017453292f);
        final float llllIIIIlIIIlIlllIll = net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI.IIlIIIIIllIlIIIlIIll * 0.017453292f);
        final float n2 = -llllIIIIlIIIlIlllIll * net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI.llllllIllIllIlIllllI * 0.017453292f);
        final float n3 = ilIlIlIlIlllllllllIl * net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI.llllllIllIllIlIllllI * 0.017453292f);
        final float ilIlIlIlIlllllllllIl2 = net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.IlIlIlIlIlllllllllIl(llIllIIIIIllIlIIIIlI.llllllIllIllIlIllllI * 0.017453292f);
        for (int i = 0; i < 2; ++i) {
            final List list = this.llIllIIIIIllIlIIIIlI[3][i];
            if (!list.isEmpty()) {
                final net.minecraft.client.lIIIlllIIIllIIIllIII.lIIllIIIllllIlllIllI llIllIIIIIllIlIIIIlI2 = net.minecraft.client.lIIIlllIIIllIIIllIII.IIlllIIlllIIIlIlllII.llllIIIIlIIIlIlllIll().llIllIIIIIllIlIIIIlI();
                for (int j = 0; j < list.size(); ++j) {
                    list.get(j).llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI2, llIllIIIIIllIlIIIIlI, n, ilIlIlIlIlllllllllIl, ilIlIlIlIlllllllllIl2, llllIIIIlIIIlIlllIll, n2, n3);
                }
            }
        }
    }
    
    public void llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII llllIIIIlIIIlIlllIll) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        for (int i = 0; i < 4; ++i) {
            for (int j = 0; j < 2; ++j) {
                this.llIllIIIIIllIlIIIIlI[i][j].clear();
            }
        }
        this.IlIIIlIlIIIllIlIlIIl.clear();
    }
    
    public void llllIIIIlIIIlIlllIll(final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.llIIlIIIlIIIllIlIIIl llllIIIIlIIIlIlllIll) {
        boolean b;
        if (lIIIIlIIIIIlllIllIII.IIlIIIlllIllIllIlIII.llIllIIIIIllIlIIIIlI() && lIIIIlIIIIIlllIllIII.llIIIllIlIllIllIIIIl.llIllIIIIIllIlIIIIlI()) {
            final net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llIllIIIIIllIlIIIIlI = llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI();
            b = (!lIIIIlIIIIIlllIllIII.IlIlIlIlIlllllllllIl(llIllIIIIIllIlIIIIlI, lIIIIlIIIIIlllIllIII.llIIIllIlIllIllIIIIl, this.llllIIIIlIIIlIlllIll, ilIlIlIlIlllllllllIl) && !lIIIIlIIIIIlllIllIII.IlIlIlIlIlllllllllIl(llIllIIIIIllIlIIIIlI, lIIIIlIIIIIlllIllIII.IIlIIIlllIllIllIlIII, this.llllIIIIlIIIlIlllIll, ilIlIlIlIlllllllllIl, this));
        }
        else {
            b = (llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI().IllIIlllIIIIlllIIlIl() != net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll);
        }
        if (b) {
            llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI().llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll, this.llllIIIIlIIIlIlllIll, ilIlIlIlIlllllllllIl);
            for (int n = 4, i = 0; i < n; ++i) {
                for (int j = 0; j < n; ++j) {
                    for (int k = 0; k < n; ++k) {
                        final double n2 = ilIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII() + (i + 0.5) / n;
                        final double n3 = ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII() + (j + 0.5) / n;
                        final double n4 = ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl() + (k + 0.5) / n;
                        this.llllIIIIlIIIlIlllIll(new IlIlIllllllllIIIIlII(this.llllIIIIlIIIlIlllIll, n2, n3, n4, n2 - ilIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII() - 0.5, n3 - ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII() - 0.5, n4 - ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl() - 0.5, llllIIIIlIIIlIlllIll).llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl));
                    }
                }
            }
        }
    }
    
    public void llllIIIIlIIIlIlllIll(final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final lllIllIIIllllllIllll lllIllIIIllllllIllll) {
        final net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.llIIlIIIlIIIllIlIIIl ilIlIlIlIlllllllllIl2 = this.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl);
        final net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llIllIIIIIllIlIIIIlI = ilIlIlIlIlllllllllIl2.llIllIIIIIllIlIIIIlI();
        if (llIllIIIIIllIlIIIIlI.llIllIlIIIIllIlIIllI() != -1) {
            final int liiiIlIIIIIlllIllIII = ilIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII();
            final int liiIlllIIIllIIIllIII = ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII();
            final int llIIlIIIlIIIllIlIIIl = ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl();
            final float n = 0.1f;
            double n2 = liiiIlIIIIIlllIllIII + this.IllIIlllIIIIlllIIlIl.nextDouble() * (llIllIIIIIllIlIIIIlI.IlIlIIIIIIlllIlIllIl() - llIllIIIIIllIlIIIIlI.lllIIIIlllllIlIIllIl() - n * 2.0f) + n + llIllIIIIIllIlIIIIlI.lllIIIIlllllIlIIllIl();
            double n3 = liiIlllIIIllIIIllIII + this.IllIIlllIIIIlllIIlIl.nextDouble() * (llIllIIIIIllIlIIIIlI.IIIlIIIlIlIIlllIIlll() - llIllIIIIIllIlIIIIlI.IIllIIllIIIlIlIIIIlI() - n * 2.0f) + n + llIllIIIIIllIlIIIIlI.IIllIIllIIIlIlIIIIlI();
            double n4 = llIIlIIIlIIIllIlIIIl + this.IllIIlllIIIIlllIIlIl.nextDouble() * (llIllIIIIIllIlIIIIlI.IlllllllIIIlIIIlIlII() - llIllIIIIIllIlIIIIlI.IlIlIIIlIIlIlIIlllIl() - n * 2.0f) + n + llIllIIIIIllIlIIIIlI.IlIlIIIlIIlIlIIlllIl();
            if (lllIllIIIllllllIllll == lllIllIIIllllllIllll.llllIIIIlIIIlIlllIll) {
                n3 = liiIlllIIIllIIIllIII + llIllIIIIIllIlIIIIlI.IIllIIllIIIlIlIIIIlI() - n;
            }
            if (lllIllIIIllllllIllll == lllIllIIIllllllIllll.IlIlIlIlIlllllllllIl) {
                n3 = liiIlllIIIllIIIllIII + llIllIIIIIllIlIIIIlI.IIIlIIIlIlIIlllIIlll() + n;
            }
            if (lllIllIIIllllllIllll == lllIllIIIllllllIllll.llIllIIIIIllIlIIIIlI) {
                n4 = llIIlIIIlIIIllIlIIIl + llIllIIIIIllIlIIIIlI.IlIlIIIlIIlIlIIlllIl() - n;
            }
            if (lllIllIIIllllllIllll == lllIllIIIllllllIllll.IlIIIlIlIIIllIlIlIIl) {
                n4 = llIIlIIIlIIIllIlIIIl + llIllIIIIIllIlIIIIlI.IlllllllIIIlIIIlIlII() + n;
            }
            if (lllIllIIIllllllIllll == lllIllIIIllllllIllll.IlIlIIIllIllIIIIIllI) {
                n2 = liiiIlIIIIIlllIllIII + llIllIIIIIllIlIIIIlI.lllIIIIlllllIlIIllIl() - n;
            }
            if (lllIllIIIllllllIllll == lllIllIIIllllllIllll.IllIIlllIIIIlllIIlIl) {
                n2 = liiiIlIIIIIlllIllIII + llIllIIIIIllIlIIIIlI.IlIlIIIIIIlllIlIllIl() + n;
            }
            this.llllIIIIlIIIlIlllIll(new IlIlIllllllllIIIIlII(this.llllIIIIlIIIlIlllIll, n2, n3, n4, 0.0, 0.0, 0.0, ilIlIlIlIlllllllllIl2).llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl).IlIIIlIlIIIllIlIlIIl(0.2f).IlIlIIIllIllIIIIIllI(0.6f));
        }
    }
    
    public void IlIlIlIlIlllllllllIl(final IIIllllllIllIIIlllIl iiIllllllIllIIIlllIl) {
        this.llllIIIIlIIIlIlllIll(iiIllllllIllIIIlllIl, 1, 0);
    }
    
    public void llIllIIIIIllIlIIIIlI(final IIIllllllIllIIIlllIl iiIllllllIllIIIlllIl) {
        this.llllIIIIlIIIlIlllIll(iiIllllllIllIIIlllIl, 0, 1);
    }
    
    private void llllIIIIlIIIlIlllIll(final IIIllllllIllIIIlllIl iiIllllllIllIIIlllIl, final int n, final int n2) {
        for (int i = 0; i < 4; ++i) {
            if (this.llIllIIIIIllIlIIIIlI[i][n].contains(iiIllllllIllIIIlllIl)) {
                this.llIllIIIIIllIlIIIIlI[i][n].remove(iiIllllllIllIIIlllIl);
                this.llIllIIIIIllIlIIIIlI[i][n2].add(iiIllllllIllIIIlllIl);
            }
        }
    }
    
    public String IlIlIlIlIlllllllllIl() {
        int n = 0;
        for (int i = 0; i < 4; ++i) {
            for (int j = 0; j < 2; ++j) {
                n += this.llIllIIIIIllIlIIIIlI[i][j].size();
            }
        }
        return new StringBuilder().append(n).toString();
    }
    
    public void llllIIIIlIIIlIlllIll(final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final llIlllIlllllIIllIIII llIlllIlllllIIllIIII) {
        final net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.llIIlIIIlIIIllIlIIIl ilIlIlIlIlllllllllIl2 = this.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl);
        if (ilIlIlIlIlllllllllIl2 != null) {
            final boolean ilIlIlIlIlllllllllIl3 = lIIIIlIIIIIlllIllIII.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl2.llIllIIIIIllIlIIIIlI(), lIIIIlIIIIIlllIllIII.lIlIlIlllIIlIlIlllIl, this.llllIIIIlIIIlIlllIll, llIlllIlllllIIllIIII, this);
            if (ilIlIlIlIlllllllllIl2 != null && !ilIlIlIlIlllllllllIl3) {
                this.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl, llIlllIlllllIIllIIII.IlIlIlIlIlllllllllIl);
            }
        }
    }
}
