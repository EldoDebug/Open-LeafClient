package net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl;

import org.apache.logging.log4j.*;
import com.mojang.authlib.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.lIlIlIIIllIIllIIIllI.*;
import net.minecraft.llIllIlIIIIllIlIIllI.*;
import net.minecraft.IIIlIIIlIlIIlllIIlll.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll.*;
import com.google.common.collect.*;
import java.util.*;
import net.minecraft.lllIIIIlllllIlIIllIl.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.llllIIIIlIIIlIlllIll.*;
import net.minecraft.IlIlIIIlIIlIlIIlllIl.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import io.netty.buffer.*;
import net.minecraft.IlIlIIIllIIllIlllllI.*;
import net.minecraft.llIIlIIIlIIIllIlIIIl.*;
import net.minecraft.IlIlIIIIIIlllIlIllIl.IlIlIlIlIlllllllllIl.*;
import net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl.*;

public class IlIIIlIlIIIllIlIlIIl extends llllIIIIlIIIlIlllIll implements IlIlIllllllllIIIIlII
{
    private static final Logger llIIlIIIlIIIllIlIIIl;
    private String llIllIlIIIIllIlIIllI;
    public lIIIIlIIIIIlllIllIII llllIIIIlIIIlIlllIll;
    public final net.minecraft.IlIlIIIIIIlllIlIllIl.llllIIIIlIIIlIlllIll IlIlIlIlIlllllllllIl;
    public final net.minecraft.IlIlIIIIIIlllIlIllIl.IlIlIlIlIlllllllllIl.IlIIIlIlIIIllIlIlIIl llIllIIIIIllIlIIIIlI;
    public double IlIIIlIlIIIllIlIlIIl;
    public double IlIlIIIllIllIIIIIllI;
    public final List IllIIlllIIIIlllIIlIl;
    private final List R;
    private final llllIIllllIlIlIIIIll S;
    private float T;
    private float U;
    private int V;
    private boolean W;
    private int X;
    private int Y;
    private IlIlIlIlIlllllllllIl Z;
    private boolean aa;
    private long ab;
    private llIllIIIIIllIlIIIIlI ac;
    private int ad;
    public boolean llllIIIlIlllIlIIIIIl;
    public int lIIIIlIIIIIlllIllIII;
    public boolean lIIIlllIIIllIIIllIII;
    
    static {
        llIIlIIIlIIIllIlIIIl = LogManager.getLogger();
    }
    
    public IlIIIlIlIIIllIlIlIIl(final net.minecraft.IlIlIIIIIIlllIlIllIl.llllIIIIlIIIlIlllIll ilIlIlIlIlllllllllIl, final IIIllllllIllIIIlllIl iiIllllllIllIIIlllIl, final GameProfile gameProfile, final net.minecraft.IlIlIIIIIIlllIlIllIl.IlIlIlIlIlllllllllIl.IlIIIlIlIIIllIlIlIIl llIllIIIIIllIlIIIIlI) {
        super(iiIllllllIllIIIlllIl, gameProfile);
        this.llIllIlIIIIllIlIIllI = "en_US";
        this.IllIIlllIIIIlllIIlIl = Lists.newLinkedList();
        this.R = Lists.newLinkedList();
        this.T = Float.MIN_VALUE;
        this.U = -1.0E8f;
        this.V = -99999999;
        this.W = true;
        this.X = -99999999;
        this.Y = 60;
        this.aa = true;
        this.ab = System.currentTimeMillis();
        this.ac = null;
        llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl = this;
        this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
        net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl2 = iiIllllllIllIIIlllIl.IIlllIlIIllIlIlIlIIl();
        if (!iiIllllllIllIIIlllIl.IlIllIlIlIIIlIlIlIII.llllIIllllIlIlIIIIll() && iiIllllllIllIIIlllIl.lIllllllIIllIlIlIlII().IIlllIIlIllIllIlIIll() != net.minecraft.IIIlIIlIIIIlllIlllII.lllIllIIIllllllIllll.IlIIIlIlIIIllIlIlIIl) {
            int max = Math.max(5, ilIlIlIlIlllllllllIl.IllIlIllIllIlllIIlll() - 6);
            final int llIllIIIIIllIlIIIIlI2 = net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(iiIllllllIllIIIlllIl.IllIllIlllIllllIIllI().llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl2.lIIIIlIIIIIlllIllIII(), ilIlIlIlIlllllllllIl2.llIIlIIIlIIIllIlIIIl()));
            if (llIllIIIIIllIlIIIIlI2 < max) {
                max = llIllIIIIIllIlIIIIlI2;
            }
            if (llIllIIIIIllIlIIIIlI2 <= 1) {
                max = 1;
            }
            ilIlIlIlIlllllllllIl2 = iiIllllllIllIIIlllIl.lllIIIIlllllIlIIllIl(ilIlIlIlIlllllllllIl2.llllIIIIlIIIlIlllIll(this.IlIIllIIllIIllIIlIIl.nextInt(max * 2) - max, 0, this.IlIIllIIllIIllIIlIIl.nextInt(max * 2) - max));
        }
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
        this.S = ilIlIlIlIlllllllllIl.IIlllIIlllIIIlIlllII().llllIIIIlIIIlIlllIll((llllIIIIlIIIlIlllIll)this);
        this.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl2, this.llIIIIIIlIllIIlIIIll = 0.0f, 0.0f);
        while (!iiIllllllIllIIIlllIl.llllIIIIlIIIlIlllIll(this, this.IlIIlllIIlIlllllIIlI()).isEmpty() && this.llIIIlIlIllIIlIlIlII < 255.0) {
            this.IlIlIlIlIlllllllllIl(this.IIlllIlIIllIlIlIlIIl, this.llIIIlIlIllIIlIlIlII + 1.0, this.lllllIlIIIlIlIIlllII);
        }
    }
    
    @Override
    public void IlIlIlIlIlllllllllIl(final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll) {
        super.IlIlIlIlIlllllllllIl(iiiIlllIIIIIIlIIIlll);
        if (iiiIlllIIIIIIlIIIlll.IlIlIlIlIlllllllllIl("playerGameType", 99)) {
            if (net.minecraft.IlIlIIIIIIlllIlIllIl.llllIIIIlIIIlIlllIll.IIIIIllIIIIlIIIIllIl().IIllIIIlIIlIlIlIIIII()) {
                this.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(net.minecraft.IlIlIIIIIIlllIlIllIl.llllIIIIlIIIlIlllIll.IIIIIllIIIIlIIIIllIl().lIlIlIIIllIIllIIIllI());
            }
            else {
                this.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(net.minecraft.IIIlIIlIIIIlllIlllII.lllIllIIIllllllIllll.llllIIIIlIIIlIlllIll(iiiIlllIIIIIIlIIIlll.IllIIlllIIIIlllIIlIl("playerGameType")));
            }
        }
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll) {
        super.llllIIIIlIIIlIlllIll(iiiIlllIIIIIIlIIIlll);
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("playerGameType", this.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll().llllIIIIlIIIlIlllIll());
    }
    
    @Override
    public void IIllIIllIIIlIlIIIIlI(final int n) {
        super.IIllIIllIIIlIlIIIIlI(n);
        this.X = -1;
    }
    
    @Override
    public void IlIlIIIIIIlllIlIllIl(final int n) {
        super.IlIlIIIIIIlllIlIllIl(n);
        this.X = -1;
    }
    
    public void lIIIIlIIIIIlllIllIII() {
        this.t.llllIIIIlIIIlIlllIll((IlIlIllllllllIIIIlII)this);
    }
    
    @Override
    public void ak() {
        super.ak();
        this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(new IlIIIIIlIIllIIlIlIll(this.S(), net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl.IllllIIlIlIllIIIllII.llllIIIIlIIIlIlllIll));
    }
    
    @Override
    public void al() {
        super.al();
        this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(new IlIIIIIlIIllIIlIlIll(this.S(), net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl.IllllIIlIlIllIIIllII.IlIlIlIlIlllllllllIl));
    }
    
    @Override
    public void IIllIIllIIIlIlIIIIlI() {
        this.llIllIIIIIllIlIIIIlI.IlIIIlIlIIIllIlIlIIl();
        --this.Y;
        if (this.lIlIIlllIIlIIlIlllIl > 0) {
            --this.lIlIIlllIIlIIlIlllIl;
        }
        this.t.llIllIIIIIllIlIIIIlI();
        if (!this.IlllllllIIIlIIIlIlII.IlIlIllllllllIIIIlII && !this.t.llllIIIIlIIIlIlllIll((llllIIIIlIIIlIlllIll)this)) {
            this.b_();
            this.t = this.IlIlIIIllIIllIlllllI;
        }
        while (!this.R.isEmpty()) {
            final int min = Math.min(this.R.size(), Integer.MAX_VALUE);
            final int[] array = new int[min];
            final Iterator<Integer> iterator = (Iterator<Integer>)this.R.iterator();
            int n = 0;
            while (iterator.hasNext() && n < min) {
                array[n++] = iterator.next();
                iterator.remove();
            }
            this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(new IIIlIIIlIlIIlllIIlll(array));
        }
        if (!this.IllIIlllIIIIlllIIlIl.isEmpty()) {
            final ArrayList arrayList = Lists.newArrayList();
            final Iterator<net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIlIlIlllllllllIl> iterator2 = (Iterator<net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIlIlIlllllllllIl>)this.IllIIlllIIIIlllIIlIl.iterator();
            final ArrayList arrayList2 = Lists.newArrayList();
            while (iterator2.hasNext() && arrayList.size() < 10) {
                final net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl = iterator2.next();
                if (ilIlIlIlIlllllllllIl != null) {
                    if (!this.IlllllllIIIlIIIlIlII.IllIIlllIIIIlllIIlIl(new net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll << 4, 0, ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl << 4))) {
                        continue;
                    }
                    final net.minecraft.IIIlIIlIIIIlllIlllII.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll = this.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll, ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl);
                    if (!llllIIIIlIIIlIlllIll.lIIIlllIIIllIIIllIII()) {
                        continue;
                    }
                    arrayList.add(llllIIIIlIIIlIlllIll);
                    arrayList2.addAll(((IIIllllllIllIIIlllIl)this.IlllllllIIIlIIIlIlII).llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll * 16, 0, ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl * 16, ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll * 16 + 16, 256, ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl * 16 + 16));
                    iterator2.remove();
                }
                else {
                    iterator2.remove();
                }
            }
            if (!arrayList.isEmpty()) {
                if (arrayList.size() == 1) {
                    this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(new IlIIIlIIIllllIlIlIlI((net.minecraft.IIIlIIlIIIIlllIlllII.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll)arrayList.get(0), true, 65535));
                }
                else {
                    this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(new IIlIlIlIIlIllIIIIIIl(arrayList));
                }
                final Iterator<net.minecraft.IlIlIIIlIIlIlIIlllIl.IlIIIlIlIIIllIlIlIIl> iterator3 = arrayList2.iterator();
                while (iterator3.hasNext()) {
                    this.llllIIIIlIIIlIlllIll(iterator3.next());
                }
                final Iterator<net.minecraft.IIIlIIlIIIIlllIlllII.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll> iterator4 = arrayList.iterator();
                while (iterator4.hasNext()) {
                    this.IlllllllIIIlIIIlIlII().lIIIIlIlIllllIIlIllI().llllIIIIlIIIlIlllIll(this, iterator4.next());
                }
            }
        }
        final llIllIIIIIllIlIIIIlI iIlIIIIIllIlIIIlIIll = this.IIlIIIIIllIlIIIlIIll();
        if (iIlIIIIIllIlIIIlIIll != this) {
            if (!iIlIIIIIllIlIIIlIIll.llllIllllIllllIlIlII()) {
                this.IIIlIIIlIlIIlllIIlll(this);
            }
            else {
                this.a_(iIlIIIIIllIlIIIlIIll.IIlllIlIIllIlIlIlIIl, iIlIIIIIllIlIIIlIIll.llIIIlIlIllIIlIlIlII, iIlIIIIIllIlIIIlIIll.lllllIlIIIlIlIIlllII, iIlIIIIIllIlIIIlIIll.IIlIIIIIllIlIIIlIIll, iIlIIIIIllIlIIIlIIll.llllllIllIllIlIllllI);
                this.IlIlIlIlIlllllllllIl.IIlllIIlllIIIlIlllII().IlIIIlIlIIIllIlIlIIl(this);
                if (this.IIIIIllIIIIlIIIIllIl()) {
                    this.IIIlIIIlIlIIlllIIlll(this);
                }
            }
        }
    }
    
    public void lIlIlIIIllIIllIIIllI() {
        try {
            super.IIllIIllIIIlIlIIIIlI();
            for (int i = 0; i < this.lIlIlIIIllIIllIIIllI.lIIIlllIIIllIIIllIII(); ++i) {
                final lllIIIIlIlIllIIlIIIl lIlIlIIIllIIllIIIllI = this.lIlIlIIIllIIllIIIllI.lIlIlIIIllIIllIIIllI(i);
                if (lIlIlIIIllIIllIIIllI != null && lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll().lIlIlIIIllIIllIIIllI()) {
                    final IIlIIIIIllIlIIIlIIll ilIIIlIlIIIllIlIlIIl = ((llllIllllIllllIlIlII)lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll()).IlIIIlIlIIIllIlIlIIl(lIlIlIIIllIIllIIIllI, this.IlllllllIIIlIIIlIlII, this);
                    if (ilIIIlIlIIIllIlIlIIl != null) {
                        this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(ilIIIlIlIIIllIlIlIIl);
                    }
                }
            }
            if (this.N() != this.U || this.V != this.u.llllIIIIlIIIlIlllIll() || this.u.IlIIIlIlIIIllIlIlIIl() == 0.0f != this.W) {
                this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(new llllIIIlIlllIlIIIIIl(this.N(), this.u.llllIIIIlIIIlIlllIll(), this.u.IlIIIlIlIIIllIlIlIIl()));
                this.U = this.N();
                this.V = this.u.llllIIIIlIIIlIlllIll();
                this.W = (this.u.IlIIIlIlIIIllIlIlIIl() == 0.0f);
            }
            if (this.N() + this.aj() != this.T) {
                this.T = this.N() + this.aj();
                final Iterator<net.minecraft.lllIIIIlllllIlIIllIl.lIIIIlIIIIIlllIllIII> iterator = this.au().llllIIIIlIIIlIlllIll(net.minecraft.lllIIIIlllllIlIIllIl.IlIlIlIlIlllllllllIl.llllIIIlIlllIlIIIIIl).iterator();
                while (iterator.hasNext()) {
                    this.au().IlIlIlIlIlllllllllIl(this.s_(), iterator.next()).llllIIIIlIIIlIlllIll(Arrays.asList(this));
                }
            }
            if (this.M != this.X) {
                this.X = this.M;
                this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(new net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl.IIlIIIIIllIlIIIlIIll(this.N, this.M, this.L));
            }
            if (this.lllllIIIIIlIlIIIIIIl % 20 * 5 == 0 && !this.IIlllIIIlIlllIIlllII().llllIIIIlIIIlIlllIll(net.minecraft.IIIlIIIlIlIIlllIIlll.IlIlIlIlIlllllllllIl.IIIIIIIIIlllIllIlIlI)) {
                this.llllIIllllIlIlIIIIll();
            }
        }
        catch (Throwable t) {
            final net.minecraft.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll = net.minecraft.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(t, "Ticking player");
            this.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll("Player being ticked"));
            throw new IIlIlllIlIlllIlIllll(llllIIIIlIIIlIlllIll);
        }
    }
    
    protected void llllIIllllIlIlIIIIll() {
        final String lIlIIlllIIlIIlIlllIl = this.IlllllllIIIlIIIlIlII.llIllIIIIIllIlIIIIlI(new net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(this.IIlllIlIIllIlIlIlIIl), 0, net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(this.lllllIlIIIlIlIIlllII))).lIlIIlllIIlIIlIlllIl;
        lllllIIlIlIIIlIlIIIl lllllIIlIlIIIlIlIIIl = (lllllIIlIlIIIlIlIIIl)this.IIlllIIIlIlllIIlllII().IlIlIlIlIlllllllllIl((IllIIlllIIIIlllIIlIl)net.minecraft.IIIlIIIlIlIIlllIIlll.IlIlIlIlIlllllllllIl.IIIIIIIIIlllIllIlIlI);
        if (lllllIIlIlIIIlIlIIIl == null) {
            lllllIIlIlIIIlIlIIIl = (lllllIIlIlIIIlIlIIIl)this.IIlllIIIlIlllIIlllII().llllIIIIlIIIlIlllIll(net.minecraft.IIIlIIIlIlIIlllIIlll.IlIlIlIlIlllllllllIl.IIIIIIIIIlllIllIlIlI, new lllllIIlIlIIIlIlIIIl());
        }
        lllllIIlIlIIIlIlIIIl.add((Object)lIlIIlllIIlIIlIlllIl);
        if (this.IIlllIIIlIlllIIlllII().IlIlIlIlIlllllllllIl(net.minecraft.IIIlIIIlIlIIlllIIlll.IlIlIlIlIlllllllllIl.IIIIIIIIIlllIllIlIlI) && lllllIIlIlIIIlIlIIIl.size() >= net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl.IIIIlllIIIIIIlIIIlll.size()) {
            final HashSet hashSet = Sets.newHashSet((Iterable)net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl.IIIIlllIIIIIIlIIIlll);
            for (final String s : lllllIIlIlIIIlIlIIIl) {
                final Iterator<llIIlIIIlIIIllIlIIIl> iterator2 = hashSet.iterator();
                while (iterator2.hasNext()) {
                    if (iterator2.next().lIlIIlllIIlIIlIlllIl.equals(s)) {
                        iterator2.remove();
                    }
                }
                if (hashSet.isEmpty()) {
                    break;
                }
            }
            if (hashSet.isEmpty()) {
                this.llllIIIIlIIIlIlllIll(net.minecraft.IIIlIIIlIlIIlllIIlll.IlIlIlIlIlllllllllIl.IIIIIIIIIlllIllIlIlI);
            }
        }
    }
    
    @Override
    public void IlIlIlIlIlllllllllIl(final lIllllllIIllIlIlIlII lIllllllIIllIlIlIlII) {
        if (this.IlllllllIIIlIIIlIlII.llIIlllIIlllIIllIllI().IlIlIlIlIlllllllllIl("showDeathMessages")) {
            final IlIlIIIllIIllIlllllI w = this.w();
            if (w != null && w.lIIIlllIIIllIIIllIII() != net.minecraft.lllIIIIlllllIlIIllIl.IIIIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll) {
                if (w.lIIIlllIIIllIIIllIII() == net.minecraft.lllIIIIlllllIlIIllIl.IIIIlllIIIIIIlIIIlll.llIllIIIIIllIlIIIIlI) {
                    this.IlIlIlIlIlllllllllIl.IIlllIIlllIIIlIlllII().llllIIIIlIIIlIlllIll(this, this.S().IlIlIlIlIlllllllllIl());
                }
                else if (w.lIIIlllIIIllIIIllIII() == net.minecraft.lllIIIIlllllIlIIllIl.IIIIlllIIIIIIlIIIlll.IlIIIlIlIIIllIlIlIIl) {
                    this.IlIlIlIlIlllllllllIl.IIlllIIlllIIIlIlllII().IlIlIlIlIlllllllllIl(this, this.S().IlIlIlIlIlllllllllIl());
                }
            }
            else {
                this.IlIlIlIlIlllllllllIl.IIlllIIlllIIIlIlllII().llllIIIIlIIIlIlllIll(this.S().IlIlIlIlIlllllllllIl());
            }
        }
        if (!this.IlllllllIIIlIIIlIlII.llIIlllIIlllIIllIllI().IlIlIlIlIlllllllllIl("keepInventory")) {
            this.lIlIlIIIllIIllIIIllI.llIllIlIIIIllIlIIllI();
        }
        final Iterator<net.minecraft.lllIIIIlllllIlIIllIl.lIIIIlIIIIIlllIllIII> iterator = this.IlllllllIIIlIIIlIlII.IlllIIIIlIIIlIlIlIIl().llllIIIIlIIIlIlllIll(net.minecraft.lllIIIIlllllIlIIllIl.IlIlIlIlIlllllllllIl.IlIIIlIlIIIllIlIlIIl).iterator();
        while (iterator.hasNext()) {
            this.au().IlIlIlIlIlllllllllIl(this.s_(), iterator.next()).llllIIIIlIIIlIlllIll();
        }
        final lllIIIIlllllIlIIllIl t = this.T();
        if (t != null) {
            final net.minecraft.llllIIIlIlllIlIIIIIl.llllIIllllIlIlIIIIll llllIIllllIlIlIIIIll = net.minecraft.llllIIIlIlllIlIIIIIl.IIIIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll.get(net.minecraft.llllIIIlIlllIlIIIIIl.IIIIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll(t));
            if (llllIIllllIlIlIIIIll != null) {
                this.llllIIIIlIIIlIlllIll(llllIIllllIlIlIIIIll.IlIlIIIllIllIIIIIllI);
            }
            t.llllIIIIlIIIlIlllIll(this, this.h);
        }
        this.llllIIIIlIIIlIlllIll(net.minecraft.IIIlIIIlIlIIlllIIlll.IIIIlllIIIIIIlIIIlll.IIIlIIlIIIIlllIlllII);
        this.IlIlIlIlIlllllllllIl(net.minecraft.IIIlIIIlIlIIlllIIlll.IIIIlllIIIIIIlIIIlll.lIIIIlIIIIIlllIllIII);
        this.S().IlIlIIIllIllIIIIIllI();
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll(final lIllllllIIllIlIlIlII lIllllllIIllIlIlIlII, final float n) {
        if (this.llllIIIIlIIIlIlllIll(lIllllllIIllIlIlIlII)) {
            return false;
        }
        if ((!this.IlIlIlIlIlllllllllIl.IIlIIIlllIllIllIlIII() || !this.IIllllIIIlIIIIIIllIl() || !"fall".equals(lIllllllIIllIlIlIlII.IlIllIlIlIIIlIlIlIII)) && this.Y > 0 && lIllllllIIllIlIlIlII != lIllllllIIllIlIlIlII.llIIlIIIlIIIllIlIIIl) {
            return false;
        }
        if (lIllllllIIllIlIlIlII instanceof IIlllIIIlIlllIIlllII) {
            final llIllIIIIIllIlIIIIlI llIIlIIIlIIIllIlIIIl = lIllllllIIllIlIlIlII.llIIlIIIlIIIllIlIIIl();
            if (llIIlIIIlIIIllIlIIIl instanceof llllIIIIlIIIlIlllIll && !this.IlIIIlIlIIIllIlIlIIl((llllIIIIlIIIlIlllIll)llIIlIIIlIIIllIlIIIl)) {
                return false;
            }
            if (llIIlIIIlIIIllIlIIIl instanceof net.minecraft.llllIIIlIlllIlIIIIIl.lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll) {
                final net.minecraft.llllIIIlIlllIlIIIIIl.lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll = (net.minecraft.llllIIIlIlllIlIIIIIl.lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll)llIIlIIIlIIIllIlIIIl;
                if (llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI instanceof llllIIIIlIIIlIlllIll && !this.IlIIIlIlIIIllIlIlIIl((llllIIIIlIIIlIlllIll)llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI)) {
                    return false;
                }
            }
        }
        return super.llllIIIIlIIIlIlllIll(lIllllllIIllIlIlIlII, n);
    }
    
    @Override
    public boolean IlIIIlIlIIIllIlIlIIl(final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        return this.IIllllIIIlIIIIIIllIl() && super.IlIIIlIlIIIllIlIlIIl(llllIIIIlIIIlIlllIll);
    }
    
    private boolean IIllllIIIlIIIIIIllIl() {
        return this.IlIlIlIlIlllllllllIl.lllllIIIIIlIlIIIIIIl();
    }
    
    @Override
    public void lIIIlllIIIllIIIllIII(int n) {
        if (this.lllllIIIIIlIIlllIlIl == 1 && n == 1) {
            this.llllIIIIlIIIlIlllIll(net.minecraft.IIIlIIIlIlIIlllIIlll.IlIlIlIlIlllllllllIl.lIllllllIIllIlIlIlII);
            this.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(this);
            this.lIIIlllIIIllIIIllIII = true;
            this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(new IlIIlIlIIIlIIlIlIlII(4, 0.0f));
        }
        else {
            if (this.lllllIIIIIlIIlllIlIl == 0 && n == 1) {
                this.llllIIIIlIIIlIlllIll(net.minecraft.IIIlIIIlIlIIlllIIlll.IlIlIlIlIlllllllllIl.lllllIlIIIlIlIIlllII);
                final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl illIlIIllIllIIlIllII = this.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(n).IllIlIIllIllIIlIllII();
                if (illIlIIllIllIIlIllII != null) {
                    this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(illIlIIllIllIIlIllII.lIIIIlIIIIIlllIllIII(), illIlIIllIllIIlIllII.lIIIlllIIIllIIIllIII(), illIlIIllIllIIlIllII.llIIlIIIlIIIllIlIIIl(), 0.0f, 0.0f);
                }
                n = 1;
            }
            else {
                this.llllIIIIlIIIlIlllIll(net.minecraft.IIIlIIIlIlIIlllIIlll.IlIlIlIlIlllllllllIl.IIIlIIlIIIIlllIlllII);
            }
            this.IlIlIlIlIlllllllllIl.IIlllIIlllIIIlIlllII().llllIIIIlIIIlIlllIll(this, n);
            this.X = -1;
            this.U = -1.0f;
            this.V = -1;
        }
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll(final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl) {
        return ilIIIlIlIIIllIlIlIIl.IlIIIlIlIIIllIlIlIIl() ? (this.IIlIIIIIllIlIIIlIIll() == this) : (!this.IlIIIlIlIIIllIlIlIIl() && super.llllIIIIlIIIlIlllIll(ilIIIlIlIIIllIlIlIIl));
    }
    
    private void llllIIIIlIIIlIlllIll(final net.minecraft.IlIlIIIlIIlIlIIlllIl.IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl) {
        if (ilIIIlIlIIIllIlIlIIl != null) {
            final IIlIIIIIllIlIIIlIIll iiiIlllIIIIIIlIIIlll = ilIIIlIlIIIllIlIlIIl.IIIIlllIIIIIIlIIIlll();
            if (iiiIlllIIIIIIlIIIlll != null) {
                this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(iiiIlllIIIIIIlIIIlll);
            }
        }
    }
    
    @Override
    public void IlIlIlIlIlllllllllIl(final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI, final int n) {
        super.IlIlIlIlIlllllllllIl(llIllIIIIIllIlIIIIlI, n);
        this.t.llIllIIIIIllIlIIIIlI();
    }
    
    @Override
    public net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI llllIIIIlIIIlIlllIll(final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        final net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI llllIIIIlIIIlIlllIll = super.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl);
        if (llllIIIIlIIIlIlllIll == net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll) {
            final lIlIlIIIllIIllIIIllI lIlIlIIIllIIllIIIllI = new lIlIlIIIllIIllIIIllI(this, ilIlIlIlIlllllllllIl);
            this.IlllllllIIIlIIIlIlII().lIIIIlIlIllllIIlIllI().llllIIIIlIIIlIlllIll(this, lIlIlIIIllIIllIIIllI);
            this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(this.IIlllIlIIllIlIlIlIIl, this.llIIIlIlIllIIlIlIlII, this.lllllIlIIIlIlIIlllII, this.IIlIIIIIllIlIIIlIIll, this.llllllIllIllIlIllllI);
            this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(lIlIlIIIllIIllIIIllI);
        }
        return llllIIIIlIIIlIlllIll;
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final boolean b, final boolean b2, final boolean b3) {
        if (this.ah()) {
            this.IlllllllIIIlIIIlIlII().lIIIIlIlIllllIIlIllI().IlIlIlIlIlllllllllIl(this, new net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl.IlIlIIIllIIllIlllllI(this, 2));
        }
        super.llllIIIIlIIIlIlllIll(b, b2, b3);
        if (this.llllIIIIlIIIlIlllIll != null) {
            this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(this.IIlllIlIIllIlIlIlIIl, this.llIIIlIlIllIIlIlIlII, this.lllllIlIIIlIlIIlllII, this.IIlIIIIIllIlIIIlIIll, this.llllllIllIllIlIllllI);
        }
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI) {
        final llIllIIIIIllIlIIIIlI iiIlIIIlIlIIlllIIlll = this.IIIlIIIlIlIIlllIIlll;
        super.llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI);
        if (llIllIIIIIllIlIIIIlI != iiIlIIIlIlIIlllIIlll) {
            this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(new lllllIlIIIlIlIIlllII(0, this, this.IIIlIIIlIlIIlllIIlll));
            this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(this.IIlllIlIIllIlIlIlIIl, this.llIIIlIlIllIIlIlIlII, this.lllllIlIIIlIlIIlllII, this.IIlIIIIIllIlIIIlIIll, this.llllllIllIllIlIllllI);
        }
    }
    
    @Override
    protected void llllIIIIlIIIlIlllIll(final double n, final boolean b, final net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
    }
    
    public void llllIIIIlIIIlIlllIll(final double n, final boolean b) {
        net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl = new net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(this.IIlllIlIIllIlIlIlIIl), net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(this.llIIIlIlIllIIlIlIlII - 0.20000000298023224), net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(this.lllllIlIIIlIlIIlllII));
        net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll = this.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl).llIllIIIIIllIlIIIIlI();
        if (llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl() == net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll) {
            final net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llIllIIIIIllIlIIIIlI = this.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl()).llIllIIIIIllIlIIIIlI();
            if (llIllIIIIIllIlIIIIlI instanceof IIlllllIllIllIlIlIII || llIllIIIIIllIlIIIIlI instanceof dl || llIllIIIIIllIlIIIIlI instanceof net.minecraft.llllIIIIlIIIlIlllIll.llllIllllIllllIlIlII) {
                ilIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl();
                llllIIIIlIIIlIlllIll = this.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl).llIllIIIIIllIlIIIIlI();
            }
        }
        super.llllIIIIlIIIlIlllIll(n, b, llllIIIIlIIIlIlllIll, ilIlIlIlIlllllllllIl);
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final llIIlllIIlllIIllIllI llIIlllIIlllIIllIllI) {
        llIIlllIIlllIIllIllI.llllIIIIlIIIlIlllIll(this);
        this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(new lIllIIIIIlllIIlIIllI(llIIlllIIlllIIllIllI.lIlIlIIIllIIllIIIllI()));
    }
    
    private void ax() {
        this.ad = this.ad % 100 + 1;
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIIIllIIllIlllllI ilIlIIIllIIllIlllllI) {
        this.ax();
        this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(new lIIlIIIlIllIlIllIIIl(this.ad, ilIlIIIllIIllIlllllI.IlIIIlIlIIIllIlIlIIl(), ilIlIIIllIIllIlllllI.v_()));
        this.t = ilIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll(this.lIlIlIIIllIIllIIIllI, this);
        this.t.IlIIIlIlIIIllIlIlIIl = this.ad;
        this.t.llllIIIIlIIIlIlllIll((IlIlIllllllllIIIIlII)this);
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final llIIIlIlIllIIlIlIlII llIIIlIlIllIIlIlIlII) {
        if (this.t != this.IlIlIIIllIIllIlllllI) {
            this.b_();
        }
        if (llIIIlIlIllIIlIlIlII instanceof net.minecraft.IIIlIIlIIIIlllIlllII.IIIIlllIIIIIIlIIIlll) {
            final net.minecraft.IIIlIIlIIIIlllIlllII.IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll = (net.minecraft.IIIlIIlIIIIlllIlllII.IIIIlllIIIIIIlIIIlll)llIIIlIlIllIIlIlIlII;
            if (iiiIlllIIIIIIlIIIlll.IllIIlllIIIIlllIIlIl() && !this.llllIIIIlIIIlIlllIll(iiiIlllIIIIIIlIIIlll.u_()) && !this.IlIIIlIlIIIllIlIlIIl()) {
                this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(new net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI(new IIllIIllIIIlIlIIIIlI("container.isLocked", new Object[] { llIIIlIlIllIIlIlIlII.v_() }), (byte)2));
                this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(new IllIllIlllIllllIIllI("random.door_close", this.IIlllIlIIllIlIlIlIIl, this.llIIIlIlIllIIlIlIlII, this.lllllIlIIIlIlIIlllII, 1.0f, 1.0f));
                return;
            }
        }
        this.ax();
        if (llIIIlIlIllIIlIlIlII instanceof net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIIIllIIllIlllllI) {
            this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(new lIIlIIIlIllIlIllIIIl(this.ad, ((net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIIIllIIllIlllllI)llIIIlIlIllIIlIlIlII).IlIIIlIlIIIllIlIlIIl(), llIIIlIlIllIIlIlIlII.v_(), llIIIlIlIllIIlIlIlII.lIIIlllIIIllIIIllIII()));
            this.t = ((net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIIIllIIllIlllllI)llIIIlIlIllIIlIlIlII).llllIIIIlIIIlIlllIll(this.lIlIlIIIllIIllIIIllI, this);
        }
        else {
            this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(new lIIlIIIlIllIlIllIIIl(this.ad, "minecraft:container", llIIIlIlIllIIlIlIlII.v_(), llIIIlIlIllIIlIlIlII.lIIIlllIIIllIIIllIII()));
            this.t = new net.minecraft.llIIlIIIlIIIllIlIIIl.lIIIIlIIIIIlllIllIII(this.lIlIlIIIllIIllIIIllI, llIIIlIlIllIIlIlIlII, this);
        }
        this.t.IlIIIlIlIIIllIlIlIIl = this.ad;
        this.t.llllIIIIlIIIlIlllIll((IlIlIllllllllIIIIlII)this);
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final net.minecraft.llllIIIlIlllIlIIIIIl.llIIlllIIlllIIllIllI llIIlllIIlllIIllIllI) {
        this.ax();
        this.t = new IlIlIIIIIIlllIlIllIl(this.lIlIlIIIllIIllIIIllI, llIIlllIIlllIIllIllI, this.IlllllllIIIlIIIlIlII);
        this.t.IlIIIlIlIIIllIlIlIIl = this.ad;
        this.t.llllIIIIlIIIlIlllIll((IlIlIllllllllIIIIlII)this);
        this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(new lIIlIIIlIllIlIllIIIl(this.ad, "minecraft:villager", llIIlllIIlllIIllIllI.v_(), ((IlIlIIIIIIlllIlIllIl)this.t).llllIIIIlIIIlIlllIll().lIIIlllIIIllIIIllIII()));
        final net.minecraft.IIlIIIIlllIlllllIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl = llIIlllIIlllIIllIllI.IlIlIlIlIlllllllllIl(this);
        if (ilIlIlIlIlllllllllIl != null) {
            final llllllIllIllIlIllllI llllllIllIllIlIllllI = new llllllIllIllIlIllllI(Unpooled.buffer());
            llllllIllIllIlIllllI.writeInt(this.ad);
            ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(llllllIllIllIlIllllI);
            this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(new IIllIIIlIIlIlIlIIIII("MC|TrList", llllllIllIllIlIllllI));
        }
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final net.minecraft.llllIIIlIlllIlIIIIIl.IllIIlllIIIIlllIIlIl.IllIIlllIIIIlllIIlIl illIIlllIIIIlllIIlIl, final llIIIlIlIllIIlIlIlII llIIIlIlIllIIlIlIlII) {
        if (this.t != this.IlIlIIIllIIllIlllllI) {
            this.b_();
        }
        this.ax();
        this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(new lIIlIIIlIllIlIllIIIl(this.ad, "EntityHorse", llIIIlIlIllIIlIlIlII.v_(), llIIIlIlIllIIlIlIlII.lIIIlllIIIllIIIllIII(), illIIlllIIIIlllIIlIl.IlllIIIIlIIIlIlIlIIl()));
        this.t = new IlIllIlIlIIIlIlIlIII(this.lIlIlIIIllIIllIIIllI, llIIIlIlIllIIlIlIlII, illIIlllIIIIlllIIlIl, this);
        this.t.IlIIIlIlIIIllIlIlIIl = this.ad;
        this.t.llllIIIIlIIIlIlllIll((IlIlIllllllllIIIIlII)this);
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl) {
        if (lllIIIIlIlIllIIlIIIl.llllIIIIlIIIlIlllIll() == net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.R) {
            this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(new IIllIIIlIIlIlIlIIIII("MC|BOpen", new llllllIllIllIlIllllI(Unpooled.buffer())));
        }
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final net.minecraft.llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final int n, final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl) {
        if (!(ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(n) instanceof IIIIIIIIIlllIllIlIlI) && !this.llllIIIlIlllIlIIIIIl) {
            this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(new lIlIlIlllIIlIlIlllIl(ilIlIlIlIlllllllllIl.IlIIIlIlIIIllIlIlIIl, n, lllIIIIlIlIllIIlIIIl));
        }
    }
    
    public void llllIIIIlIIIlIlllIll(final net.minecraft.llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        this.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl, ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl());
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final net.minecraft.llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final List list) {
        this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(new net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl.llIIIIIIlIllIIlIIIll(ilIlIlIlIlllllllllIl.IlIIIlIlIIIllIlIlIIl, list));
        this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(new lIlIlIlllIIlIlIlllIl(-1, -1, this.lIlIlIIIllIIllIIIllI.lIlIlIIIllIIllIIIllI()));
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final net.minecraft.llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final int n, final int n2) {
        this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(new lIIIIlIlIllllIIlIllI(ilIlIlIlIlllllllllIl.IlIIIlIlIIIllIlIlIIl, n, n2));
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final net.minecraft.llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final llIIIlIlIllIIlIlIlII llIIIlIlIllIIlIlIlII) {
        for (int i = 0; i < llIIIlIlIllIIlIlIlII.IlIlIIIllIllIIIIIllI(); ++i) {
            this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(new lIIIIlIlIllllIIlIllI(ilIlIlIlIlllllllllIl.IlIIIlIlIIIllIlIlIIl, i, llIIIlIlIllIIlIlIlII.llllIIIIlIIIlIlllIll(i)));
        }
    }
    
    public void b_() {
        this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(new IIlIIIlllIllIllIlIII(this.t.IlIIIlIlIIIllIlIlIIl));
        this.IIlllIIlIllIllIlIIll();
    }
    
    public void IlIllIlIlIIIlIlIlIII() {
        if (!this.llllIIIlIlllIlIIIIIl) {
            this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(new lIlIlIlllIIlIlIlllIl(-1, -1, this.lIlIlIIIllIIllIIIllI.lIlIlIIIllIIllIIIllI()));
        }
    }
    
    public void IIlllIIlIllIllIlIIll() {
        this.t.IlIlIlIlIlllllllllIl((llllIIIIlIIIlIlllIll)this);
        this.t = this.IlIlIIIllIIllIlllllI;
    }
    
    public void llllIIIIlIIIlIlllIll(final float k, final float l, final boolean j, final boolean b) {
        if (this.IIIlIIIlIlIIlllIIlll != null) {
            if (k >= -1.0f && k <= 1.0f) {
                this.k = k;
            }
            if (l >= -1.0f && l <= 1.0f) {
                this.l = l;
            }
            this.j = j;
            this.IlIlIIIllIllIIIIIllI(b);
        }
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final IllIIlllIIIIlllIIlIl illIIlllIIIIlllIIlIl, final int n) {
        if (illIIlllIIIIlllIIlIl != null) {
            this.S.llllIIIIlIIIlIlllIll(this, illIIlllIIIIlllIIlIl, n);
            final Iterator<net.minecraft.lllIIIIlllllIlIIllIl.lIIIIlIIIIIlllIllIII> iterator = this.au().llllIIIIlIIIlIlllIll(illIIlllIIIIlllIIlIl.llIllIlIIIIllIlIIllI()).iterator();
            while (iterator.hasNext()) {
                this.au().IlIlIlIlIlllllllllIl(this.s_(), iterator.next()).llllIIIIlIIIlIlllIll(n);
            }
            if (this.S.IlIlIIIllIllIIIIIllI()) {
                this.S.llllIIIIlIIIlIlllIll(this);
            }
        }
    }
    
    @Override
    public void IlIlIlIlIlllllllllIl(final IllIIlllIIIIlllIIlIl illIIlllIIIIlllIIlIl) {
        if (illIIlllIIIIlllIIlIl != null) {
            this.S.IlIlIlIlIlllllllllIl(this, illIIlllIIIIlllIIlIl, 0);
            final Iterator<net.minecraft.lllIIIIlllllIlIIllIl.lIIIIlIIIIIlllIllIII> iterator = this.au().llllIIIIlIIIlIlllIll(illIIlllIIIIlllIIlIl.llIllIlIIIIllIlIIllI()).iterator();
            while (iterator.hasNext()) {
                this.au().IlIlIlIlIlllllllllIl(this.s_(), iterator.next()).llIllIIIIIllIlIIIIlI(0);
            }
            if (this.S.IlIlIIIllIllIIIIIllI()) {
                this.S.llllIIIIlIIIlIlllIll(this);
            }
        }
    }
    
    public void lllIIIIlllllIlIIllIl() {
        if (this.IIllIIllIIIlIlIIIIlI != null) {
            this.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll((llIllIIIIIllIlIIIIlI)this);
        }
        if (this.F) {
            this.llllIIIIlIIIlIlllIll(true, false, false);
        }
    }
    
    public void IlIlIIIIIIlllIlIllIl() {
        this.U = -1.0E8f;
    }
    
    @Override
    public void IlIlIlIlIlllllllllIl(final llIIIIIIlIllIIlIIIll llIIIIIIlIllIIlIIIll) {
        this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(new net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI(llIIIIIIlIllIIlIIIll));
    }
    
    @Override
    protected void l() {
        this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(new net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl.llIIIlIlIllIIlIlIlII(this, (byte)9));
        super.l();
    }
    
    @Override
    public void IlIlIlIlIlllllllllIl(final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl, final int n) {
        super.IlIlIlIlIlllllllllIl(lllIIIIlIlIllIIlIIIl, n);
        if (lllIIIIlIlIllIIlIIIl != null && lllIIIIlIlIllIIlIIIl.llllIIIIlIIIlIlllIll() != null && lllIIIIlIlIllIIlIIIl.llllIIIIlIIIlIlllIll().llIllIIIIIllIlIIIIlI(lllIIIIlIlIllIIlIIIl) == net.minecraft.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl) {
            this.IlllllllIIIlIIIlIlII().lIIIIlIlIllllIIlIllI().IlIlIlIlIlllllllllIl(this, new net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl.IlIlIIIllIIllIlllllI(this, 3));
        }
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final boolean b) {
        super.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll, b);
        this.X = -1;
        this.U = -1.0f;
        this.V = -1;
        this.R.addAll(((IlIIIlIlIIIllIlIlIIl)llllIIIIlIIIlIlllIll).R);
    }
    
    @Override
    protected void llIllIIIIIllIlIIIIlI(final net.minecraft.llllIIllllIlIlIIIIll.IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl) {
        super.llIllIIIIIllIlIIIIlI(ilIIIlIlIIIllIlIlIIl);
        this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(new net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl.llIIlllIIlllIIllIllI(this.IlllIIIIlIIIlIlIlIIl(), ilIIIlIlIIIllIlIlIIl));
    }
    
    @Override
    protected void llllIIIIlIIIlIlllIll(final net.minecraft.llllIIllllIlIlIIIIll.IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl, final boolean b) {
        super.llllIIIIlIIIlIlllIll(ilIIIlIlIIIllIlIlIIl, b);
        this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(new net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl.llIIlllIIlllIIllIllI(this.IlllIIIIlIIIlIlIlIIl(), ilIIIlIlIIIllIlIlIIl));
    }
    
    @Override
    protected void IlIIIlIlIIIllIlIlIIl(final net.minecraft.llllIIllllIlIlIIIIll.IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl) {
        super.IlIIIlIlIIIllIlIlIIl(ilIIIlIlIIIllIlIlIIl);
        this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(new net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl.IIlllIIIlIlllIIlllII(this.IlllIIIIlIIIlIlIlIIl(), ilIIIlIlIIIllIlIlIIl));
    }
    
    @Override
    public void llIIlIIIlIIIllIlIIIl(final double n, final double n2, final double n3) {
        this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(n, n2, n3, this.IIlIIIIIllIlIIIlIIll, this.llllllIllIllIlIllllI);
    }
    
    @Override
    public void IlIlIlIlIlllllllllIl(final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI) {
        this.IlllllllIIIlIIIlIlII().lIIIIlIlIllllIIlIllI().IlIlIlIlIlllllllllIl(this, new net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl.IlIlIIIllIIllIlllllI(llIllIIIIIllIlIIIIlI, 4));
    }
    
    @Override
    public void llIllIIIIIllIlIIIIlI(final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI) {
        this.IlllllllIIIlIIIlIlII().lIIIIlIlIllllIIlIllI().IlIlIlIlIlllllllllIl(this, new net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl.IlIlIIIllIIllIlllllI(llIllIIIIIllIlIIIIlI, 5));
    }
    
    @Override
    public void llIIIlIlIllIIlIlIlII() {
        if (this.llllIIIIlIIIlIlllIll != null) {
            this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(new IlIIlllllIIllIIlllll(this.K));
            this.I();
        }
    }
    
    public IIIllllllIllIIIlllIl IlllllllIIIlIIIlIlII() {
        return (IIIllllllIllIIIlllIl)this.IlllllllIIIlIIIlIlII;
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final lllIllIIIllllllIllll lllIllIIIllllllIllll) {
        this.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(lllIllIIIllllllIllll);
        this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(new IlIIlIlIIIlIIlIlIlII(3, (float)lllIllIIIllllllIllll.llllIIIIlIIIlIlllIll()));
        if (lllIllIIIllllllIllll == lllIllIIIllllllIllll.IlIlIIIllIllIIIIIllI) {
            this.llllIIIIlIIIlIlllIll((llIllIIIIIllIlIIIIlI)null);
        }
        else {
            this.IIIlIIIlIlIIlllIIlll(this);
        }
        this.llIIIlIlIllIIlIlIlII();
        this.am();
    }
    
    @Override
    public boolean IlIIIlIlIIIllIlIlIIl() {
        return this.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll() == net.minecraft.IIIlIIlIIIIlllIlllII.lllIllIIIllllllIllll.IlIlIIIllIllIIIIIllI;
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final llIIIIIIlIllIIlIIIll llIIIIIIlIllIIlIIIll) {
        this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(new net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI(llIIIIIIlIllIIlIIIll));
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll(final int n, final String s) {
        if ("seed".equals(s) && !this.IlIlIlIlIlllllllllIl.IIlIIIlllIllIllIlIII()) {
            return true;
        }
        if ("tell".equals(s) || "help".equals(s) || "me".equals(s) || "trigger".equals(s)) {
            return true;
        }
        if (this.IlIlIlIlIlllllllllIl.IIlllIIlllIIIlIlllII().IlIlIIIllIllIIIIIllI(this.r())) {
            final IIIlIIlIIIIlllIlllII iiIlIIlIIIIlllIlllII = (IIIlIIlIIIIlllIlllII)this.IlIlIlIlIlllllllllIl.IIlllIIlllIIIlIlllII().IlIlIIIllIIllIlllllI().llllIIIIlIIIlIlllIll(this.r());
            return (iiIlIIlIIIIlllIlllII != null) ? (iiIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll() >= n) : (this.IlIlIlIlIlllllllllIl.llllIIllllIlIlIIIIll() >= n);
        }
        return false;
    }
    
    public String IIlllIlIIllIlIlIlIIl() {
        final String string = this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl().toString();
        final String substring = string.substring(string.indexOf("/") + 1);
        return substring.substring(0, substring.indexOf(":"));
    }
    
    public void llllIIIIlIIIlIlllIll(final net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll.IIIlIIlIIIIlllIlllII iiIlIIlIIIIlllIlllII) {
        this.llIllIlIIIIllIlIIllI = iiIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll();
        this.Z = iiIlIIlIIIIlllIlllII.IlIlIlIlIlllllllllIl();
        this.aa = iiIlIIlIIIIlllIlllII.llIllIIIIIllIlIIIIlI();
        this.llIllIlIlIIIIIIIllII().IlIlIlIlIlllllllllIl(10, (byte)iiIlIIlIIIIlllIlllII.IlIIIlIlIIIllIlIlIIl());
    }
    
    public IlIlIlIlIlllllllllIl lIllllllIIllIlIlIlII() {
        return this.Z;
    }
    
    public void llllIIIIlIIIlIlllIll(final String s, final String s2) {
        this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(new llIlllIlllllIIllIIII(s, s2));
    }
    
    @Override
    public net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl IlIlIIIlIIlIlIIlllIl() {
        return new net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(this.IIlllIlIIllIlIlIlIIl, this.llIIIlIlIllIIlIlIlII + 0.5, this.lllllIlIIIlIlIIlllII);
    }
    
    public void llIIlllIIlllIIllIllI() {
        this.ab = net.minecraft.IlIlIIIIIIlllIlIllIl.llllIIIIlIIIlIlllIll.lllllIIllIlIllIllllI();
    }
    
    public llllIIllllIlIlIIIIll IIlllIIIlIlllIIlllII() {
        return this.S;
    }
    
    public void IIllIIllIIIlIlIIIIlI(final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI) {
        if (llIllIIIIIllIlIIIIlI instanceof llllIIIIlIIIlIlllIll) {
            this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(new IIIlIIIlIlIIlllIIlll(new int[] { llIllIIIIIllIlIIIIlI.IlllIIIIlIIIlIlIlIIl() }));
        }
        else {
            this.R.add(llIllIIIIIllIlIIIIlI.IlllIIIIlIIIlIlIlIIl());
        }
    }
    
    @Override
    protected void I() {
        if (this.IlIIIlIlIIIllIlIlIIl()) {
            this.J();
            this.IllIIlllIIIIlllIIlIl(true);
        }
        else {
            super.I();
        }
        this.IlllllllIIIlIIIlIlII().lIIIIlIlIllllIIlIllI().llllIIIIlIIIlIlllIll(this);
    }
    
    public llIllIIIIIllIlIIIIlI IIlIIIIIllIlIIIlIIll() {
        return (this.ac == null) ? this : this.ac;
    }
    
    public void IIIlIIIlIlIIlllIIlll(final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI) {
        final llIllIIIIIllIlIIIIlI iIlIIIIIllIlIIIlIIll = this.IIlIIIIIllIlIIIlIIll();
        this.ac = ((llIllIIIIIllIlIIIIlI == null) ? this : llIllIIIIIllIlIIIIlI);
        if (iIlIIIIIllIlIIIlIIll != this.ac) {
            this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(new lllllIIIIIlIIlllIlIl(this.ac));
            this.llIIlIIIlIIIllIlIIIl(this.ac.IIlllIlIIllIlIlIlIIl, this.ac.llIIIlIlIllIIlIlIlII, this.ac.lllllIlIIIlIlIIlllII);
        }
    }
    
    @Override
    public void IlIlIIIIIIlllIlIllIl(final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI) {
        if (this.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll() == net.minecraft.IIIlIIlIIIIlllIlllII.lllIllIIIllllllIllll.IlIlIIIllIllIIIIIllI) {
            this.IIIlIIIlIlIIlllIIlll(llIllIIIIIllIlIIIIlI);
        }
        else {
            super.IlIlIIIIIIlllIlIllIl(llIllIIIIIllIlIIIIlI);
        }
    }
    
    public long IIIllllllIllIIIlllIl() {
        return this.ab;
    }
    
    public llIIIIIIlIllIIlIIIll IlIIIlIIIllllIlIlIlI() {
        return null;
    }
}
