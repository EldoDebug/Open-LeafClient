package net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl;

import net.minecraft.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.*;
import net.minecraft.lIlIlIIIllIIllIIIllI.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.*;
import net.minecraft.lIIIlllIIIllIIIllIII.*;
import net.minecraft.llIllIlIIIIllIlIIllI.*;
import net.minecraft.IlIlIIIlIIlIlIIlllIl.*;
import com.google.common.collect.*;
import net.minecraft.llllIIIIlIIIlIlllIll.*;
import java.util.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;

public class llllIIIlIlllIlIIIIIl extends llIllIIIIIllIlIIIIlI
{
    private llIIlIIIlIIIllIlIIIl IlIIIlIlIIIllIlIlIIl;
    public int llllIIIIlIIIlIlllIll;
    public boolean IlIlIlIlIlllllllllIl;
    private boolean IlIlIIIllIllIIIIIllI;
    private boolean IllIIlllIIIIlllIIlIl;
    private int llllIIIlIlllIlIIIIIl;
    private float lIIIIlIIIIIlllIllIII;
    public IIIIlllIIIIIIlIIIlll llIllIIIIIllIlIIIIlI;
    
    public llllIIIlIlllIlIIIIIl(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII) {
        super(illlllllIIIlIIIlIlII);
        this.IlIlIlIlIlllllllllIl = true;
        this.llllIIIlIlllIlIIIIIl = 40;
        this.lIIIIlIIIIIlllIllIII = 2.0f;
    }
    
    public llllIIIlIlllIlIIIIIl(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final double iIlIIIIlllIlllllIlII, final double iiIlIIlIIIIlllIlllII, final double ilIlIllllllllIIIIlII, final llIIlIIIlIIIllIlIIIl ilIIIlIlIIIllIlIlIIl) {
        super(illlllllIIIlIIIlIlII);
        this.IlIlIlIlIlllllllllIl = true;
        this.llllIIIlIlllIlIIIIIl = 40;
        this.lIIIIlIIIIIlllIllIII = 2.0f;
        this.IlIIIlIlIIIllIlIlIIl = ilIIIlIlIIIllIlIlIIl;
        this.IlIlIIIIIIlllIlIllIl = true;
        this.llllIIIIlIIIlIlllIll(0.98f, 0.98f);
        this.IlIlIlIlIlllllllllIl(iIlIIIIlllIlllllIlII, iiIlIIlIIIIlllIlllII, ilIlIllllllllIIIIlII);
        this.lIllllllIIllIlIlIlII = 0.0;
        this.llIIlllIIlllIIllIllI = 0.0;
        this.IIlllIIIlIlllIIlllII = 0.0;
        this.IIlIIIIlllIlllllIlII = iIlIIIIlllIlllllIlII;
        this.IIIlIIlIIIIlllIlllII = iiIlIIlIIIIlllIlllII;
        this.IlIlIllllllllIIIIlII = ilIlIllllllllIIIIlII;
    }
    
    @Override
    protected boolean c_() {
        return false;
    }
    
    @Override
    protected void a_() {
    }
    
    @Override
    public boolean IIlllIIlllIIIlIlllII() {
        return !this.IIlIlIlIIlIllIIIIIIl;
    }
    
    @Override
    public void IIllIIllIIIlIlIIIIlI() {
        final net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llIllIIIIIllIlIIIIlI = this.IlIIIlIlIIIllIlIlIIl.llIllIIIIIllIlIIIIlI();
        if (llIllIIIIIllIlIIIIlI.IllIIlllIIIIlllIIlIl() == net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll) {
            this.IllIllIIIIlIIlIlllII();
        }
        else {
            this.IIlIIIIlllIlllllIlII = this.IIlllIlIIllIlIlIlIIl;
            this.IIIlIIlIIIIlllIlllII = this.llIIIlIlIllIIlIlIlII;
            this.IlIlIllllllllIIIIlII = this.lllllIlIIIlIlIIlllII;
            if (this.llllIIIIlIIIlIlllIll++ == 0) {
                final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl = new net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(this);
                if (this.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl).llIllIIIIIllIlIIIIlI() == llIllIIIIIllIlIIIIlI) {
                    this.IlllllllIIIlIIIlIlII.lIIIIlIIIIIlllIllIII(ilIlIlIlIlllllllllIl);
                }
                else if (!this.IlllllllIIIlIIIlIlII.IlIlIllllllllIIIIlII) {
                    this.IllIllIIIIlIIlIlllII();
                    return;
                }
            }
            this.llIIlllIIlllIIllIllI -= 0.03999999910593033;
            this.IlIIIlIlIIIllIlIlIIl(this.lIllllllIIllIlIlIlII, this.llIIlllIIlllIIllIllI, this.IIlllIIIlIlllIIlllII);
            this.lIllllllIIllIlIlIlII *= 0.9800000190734863;
            this.llIIlllIIlllIIllIllI *= 0.9800000190734863;
            this.IIlllIIIlIlllIIlllII *= 0.9800000190734863;
            if (!this.IlllllllIIIlIIIlIlII.IlIlIllllllllIIIIlII) {
                final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl2 = new net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(this);
                if (this.IIIIIllIIIIlIIIIllIl) {
                    this.lIllllllIIllIlIlIlII *= 0.699999988079071;
                    this.IIlllIIIlIlllIIlllII *= 0.699999988079071;
                    this.llIIlllIIlllIIllIllI *= -0.5;
                    if (this.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl2).llIllIIIIIllIlIIIIlI() != net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIllllIIIlIIIIIIllIl) {
                        this.IllIllIIIIlIIlIlllII();
                        if (!this.IlIlIIIllIllIIIIIllI) {
                            if (this.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI, ilIlIlIlIlllllllllIl2, true, net.minecraft.IlllllllIIIlIIIlIlII.lllIllIIIllllllIllll.IlIlIlIlIlllllllllIl, null, null) && !net.minecraft.llllIIIIlIIIlIlllIll.IlIIlllllIIllIIlllll.llIIlIIIlIIIllIlIIIl(this.IlllllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl2.IlIlIlIlIlllllllllIl()) && this.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl2, this.IlIIIlIlIIIllIlIlIIl, 3)) {
                                if (llIllIIIIIllIlIIIIlI instanceof IlIIlllllIIllIIlllll) {
                                    ((IlIIlllllIIllIIlllll)llIllIIIIIllIlIIIIlI).lIIIlllIIIllIIIllIII(this.IlllllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl2);
                                }
                                if (this.llIllIIIIIllIlIIIIlI != null && llIllIIIIIllIlIIIIlI instanceof du) {
                                    final IlIIIlIlIIIllIlIlIIl llllIIIIlIIIlIlllIll = this.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl2);
                                    if (llllIIIIlIIIlIlllIll != null) {
                                        final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll = new IIIIlllIIIIIIlIIIlll();
                                        llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(iiiIlllIIIIIIlIIIlll);
                                        for (final String s : this.llIllIIIIIllIlIIIIlI.IlIlIIIllIllIIIIIllI()) {
                                            final net.minecraft.lIlIlIIIllIIllIIIllI.llllIIIlIlllIlIIIIIl llllIIIIlIIIlIlllIll2 = this.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(s);
                                            if (!s.equals("x") && !s.equals("y") && !s.equals("z")) {
                                                iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll(s, llllIIIIlIIIlIlllIll2.IlIlIlIlIlllllllllIl());
                                            }
                                        }
                                        llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(iiiIlllIIIIIIlIIIlll);
                                        llllIIIIlIIIlIlllIll.llIIIlIlIllIIlIlIlII();
                                    }
                                }
                            }
                            else if (this.IlIlIlIlIlllllllllIl && this.IlllllllIIIlIIIlIlII.llIIlllIIlllIIllIllI().IlIlIlIlIlllllllllIl("doEntityDrops")) {
                                this.llllIIIIlIIIlIlllIll(new lllIIIIlIlIllIIlIIIl(llIllIIIIIllIlIIIIlI, 1, llIllIIIIIllIlIIIIlI.IlIIIlIlIIIllIlIlIIl(this.IlIIIlIlIIIllIlIlIIl)), 0.0f);
                            }
                        }
                    }
                }
                else if ((this.llllIIIIlIIIlIlllIll > 100 && !this.IlllllllIIIlIIIlIlII.IlIlIllllllllIIIIlII && (ilIlIlIlIlllllllllIl2.lIIIlllIIIllIIIllIII() < 1 || ilIlIlIlIlllllllllIl2.lIIIlllIIIllIIIllIII() > 256)) || this.llllIIIIlIIIlIlllIll > 600) {
                    if (this.IlIlIlIlIlllllllllIl && this.IlllllllIIIlIIIlIlII.llIIlllIIlllIIllIllI().IlIlIlIlIlllllllllIl("doEntityDrops")) {
                        this.llllIIIIlIIIlIlllIll(new lllIIIIlIlIllIIlIIIl(llIllIIIIIllIlIIIIlI, 1, llIllIIIIIllIlIIIIlI.IlIIIlIlIIIllIlIlIIl(this.IlIIIlIlIIIllIlIlIIl)), 0.0f);
                    }
                    this.IllIllIIIIlIIlIlllII();
                }
            }
        }
    }
    
    @Override
    public void IlIIIlIlIIIllIlIlIIl(final float n, final float n2) {
        final net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llIllIIIIIllIlIIIIlI = this.IlIIIlIlIIIllIlIlIIl.llIllIIIIIllIlIIIIlI();
        if (this.IllIIlllIIIIlllIIlIl) {
            final int illIIlllIIIIlllIIlIl = net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.IllIIlllIIIIlllIIlIl(n - 1.0f);
            if (illIIlllIIIIlllIIlIl > 0) {
                final ArrayList arrayList = Lists.newArrayList((Iterable)this.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(this, this.IlIIlllIIlIlllllIIlI()));
                final boolean b = llIllIIIIIllIlIIIIlI == net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.aj;
                final lIllllllIIllIlIlIlII lIllllllIIllIlIlIlII = b ? net.minecraft.IlllllllIIIlIIIlIlII.lIllllllIIllIlIlIlII.IIIIlllIIIIIIlIIIlll : net.minecraft.IlllllllIIIlIIIlIlII.lIllllllIIllIlIlIlII.llllIIllllIlIlIIIIll;
                final Iterator<llIllIIIIIllIlIIIIlI> iterator = (Iterator<llIllIIIIIllIlIIIIlI>)arrayList.iterator();
                while (iterator.hasNext()) {
                    iterator.next().llllIIIIlIIIlIlllIll(lIllllllIIllIlIlIlII, (float)Math.min(net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.IlIIIlIlIIIllIlIlIIl(illIIlllIIIIlllIIlIl * this.lIIIIlIIIIIlllIllIII), this.llllIIIlIlllIlIIIIIl));
                }
                if (b && this.IlIIllIIllIIllIIlIIl.nextFloat() < 0.05000000074505806 + illIIlllIIIIlllIIlIl * 0.05) {
                    int intValue = (int)this.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(net.minecraft.llllIIIIlIIIlIlllIll.lIIIlllIIIllIIIllIII.IIllllIIIlIIIIIIllIl);
                    if (++intValue > 2) {
                        this.IlIlIIIllIllIIIIIllI = true;
                    }
                    else {
                        this.IlIIIlIlIIIllIlIlIIl = this.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(net.minecraft.llllIIIIlIIIlIlllIll.lIIIlllIIIllIIIllIII.IIllllIIIlIIIIIIllIl, intValue);
                    }
                }
            }
        }
    }
    
    @Override
    protected void llllIIIIlIIIlIlllIll(final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll) {
        final net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll = (this.IlIIIlIlIIIllIlIlIIl != null) ? this.IlIIIlIlIIIllIlIlIIl.llIllIIIIIllIlIIIIlI() : net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll;
        final lIllllIllIllIIllllll lIllllIllIllIIllllll = (lIllllIllIllIIllllll)net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll);
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("Block", (lIllllIllIllIIllllll == null) ? "" : lIllllIllIllIIllllll.toString());
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("Data", (byte)llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI(this.IlIIIlIlIIIllIlIlIIl));
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("Time", (byte)this.llllIIIIlIIIlIlllIll);
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("DropItem", this.IlIlIlIlIlllllllllIl);
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("HurtEntities", this.IllIIlllIIIIlllIIlIl);
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("FallHurtAmount", this.lIIIIlIIIIIlllIllIII);
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("FallHurtMax", this.llllIIIlIlllIlIIIIIl);
        if (this.llIllIIIIIllIlIIIIlI != null) {
            iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("TileEntityData", this.llIllIIIIIllIlIIIIlI);
        }
    }
    
    @Override
    protected void IlIlIlIlIlllllllllIl(final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll) {
        final int n = iiiIlllIIIIIIlIIIlll.IlIIIlIlIIIllIlIlIIl("Data") & 0xFF;
        if (iiiIlllIIIIIIlIIIlll.IlIlIlIlIlllllllllIl("Block", 8)) {
            this.IlIIIlIlIIIllIlIlIIl = net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(iiiIlllIIIIIIlIIIlll.llIIlIIIlIIIllIlIIIl("Block")).llIllIIIIIllIlIIIIlI(n);
        }
        else if (iiiIlllIIIIIIlIIIlll.IlIlIlIlIlllllllllIl("TileID", 99)) {
            this.IlIIIlIlIIIllIlIlIIl = net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(iiiIlllIIIIIIlIIIlll.IllIIlllIIIIlllIIlIl("TileID")).llIllIIIIIllIlIIIIlI(n);
        }
        else {
            this.IlIIIlIlIIIllIlIlIIl = net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(iiiIlllIIIIIIlIIIlll.IlIIIlIlIIIllIlIlIIl("Tile") & 0xFF).llIllIIIIIllIlIIIIlI(n);
        }
        this.llllIIIIlIIIlIlllIll = (iiiIlllIIIIIIlIIIlll.IlIIIlIlIIIllIlIlIIl("Time") & 0xFF);
        final net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llIllIIIIIllIlIIIIlI = this.IlIIIlIlIIIllIlIlIIl.llIllIIIIIllIlIIIIlI();
        if (iiiIlllIIIIIIlIIIlll.IlIlIlIlIlllllllllIl("HurtEntities", 99)) {
            this.IllIIlllIIIIlllIIlIl = iiiIlllIIIIIIlIIIlll.IIIIlllIIIIIIlIIIlll("HurtEntities");
            this.lIIIIlIIIIIlllIllIII = iiiIlllIIIIIIlIIIlll.lIIIIlIIIIIlllIllIII("FallHurtAmount");
            this.llllIIIlIlllIlIIIIIl = iiiIlllIIIIIIlIIIlll.IllIIlllIIIIlllIIlIl("FallHurtMax");
        }
        else if (llIllIIIIIllIlIIIIlI == net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.aj) {
            this.IllIIlllIIIIlllIIlIl = true;
        }
        if (iiiIlllIIIIIIlIIIlll.IlIlIlIlIlllllllllIl("DropItem", 99)) {
            this.IlIlIlIlIlllllllllIl = iiiIlllIIIIIIlIIIlll.IIIIlllIIIIIIlIIIlll("DropItem");
        }
        if (iiiIlllIIIIIIlIIIlll.IlIlIlIlIlllllllllIl("TileEntityData", 10)) {
            this.llIllIIIIIllIlIIIIlI = iiiIlllIIIIIIlIIIlll.IlIlIIIllIIllIlllllI("TileEntityData");
        }
        if (llIllIIIIIllIlIIIIlI == null || llIllIIIIIllIlIIIIlI.IllIIlllIIIIlllIIlIl() == net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll) {
            this.IlIIIlIlIIIllIlIlIIl = net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIlIIIllIIllIlllllI.lllIllIIIllllllIllll();
        }
    }
    
    public IlllllllIIIlIIIlIlII llllIIIlIlllIlIIIIIl() {
        return this.IlllllllIIIlIIIlIlII;
    }
    
    public void llllIIIIlIIIlIlllIll(final boolean illIIlllIIIIlllIIlIl) {
        this.IllIIlllIIIIlllIIlIl = illIIlllIIIIlllIIlIl;
    }
    
    @Override
    public boolean lIllllIllIllIIllllll() {
        return false;
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final net.minecraft.llIllIIIIIllIlIIIIlI.lIIIlllIIIllIIIllIII liiIlllIIIllIIIllIII) {
        super.llllIIIIlIIIlIlllIll(liiIlllIIIllIIIllIII);
        if (this.IlIIIlIlIIIllIlIlIIl != null) {
            final net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llIllIIIIIllIlIIIIlI = this.IlIIIlIlIIIllIlIlIIl.llIllIIIIIllIlIIIIlI();
            liiIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll("Immitating block ID", net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI));
            liiIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll("Immitating block data", llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI(this.IlIIIlIlIIIllIlIlIIl));
        }
    }
    
    public llIIlIIIlIIIllIlIIIl lIIIIlIIIIIlllIllIII() {
        return this.IlIIIlIlIIIllIlIlIIl;
    }
}
