package net.minecraft.llllIIIlIlllIlIIIIIl.IllIIlllIIIIlllIIlIl;

import com.google.common.base.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll.*;
import net.minecraft.llIllIlIIIIllIlIIllI.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import java.util.*;
import net.minecraft.llIIlIIIlIIIllIlIIIl.*;
import net.minecraft.lIlIlIIIllIIllIIIllI.*;
import net.minecraft.IlIlIIIIIIlllIlIllIl.IlIlIlIlIlllllllllIl.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;

public class IllIIlllIIIIlllIIlIl extends IlIlIlIlIlllllllllIl implements IIlllIlIIllIlIlIlIIl
{
    private static final Predicate z;
    private static final IlIIIlIlIIIllIlIlIIl A;
    private static final String[] B;
    private static final String[] C;
    private static final int[] D;
    private static final String[] E;
    private static final String[] F;
    private static final String[] G;
    private static final String[] H;
    private int I;
    private int J;
    private int K;
    public int u;
    public int v;
    protected boolean w;
    private llllIIIIlIIIlIlllIll L;
    private boolean M;
    protected int x;
    protected float y;
    private boolean N;
    private float O;
    private float P;
    private float Q;
    private float R;
    private float S;
    private float T;
    private int U;
    private String V;
    private String[] W;
    private boolean X;
    
    static {
        z = (Predicate)new llllIIIlIlllIlIIIIIl();
        A = new net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIlIlllIlIIIIIl(null, "horse.jumpStrength", 0.7, 0.0, 2.0).llllIIIIlIIIlIlllIll("Jump Strength").llllIIIIlIIIlIlllIll(true);
        B = new String[] { null, "textures/entity/horse/armor/horse_armor_iron.png", "textures/entity/horse/armor/horse_armor_gold.png", "textures/entity/horse/armor/horse_armor_diamond.png" };
        C = new String[] { "", "meo", "goo", "dio" };
        D = new int[] { 0, 5, 7, 11 };
        E = new String[] { "textures/entity/horse/horse_white.png", "textures/entity/horse/horse_creamy.png", "textures/entity/horse/horse_chestnut.png", "textures/entity/horse/horse_brown.png", "textures/entity/horse/horse_black.png", "textures/entity/horse/horse_gray.png", "textures/entity/horse/horse_darkbrown.png" };
        F = new String[] { "hwh", "hcr", "hch", "hbr", "hbl", "hgr", "hdb" };
        G = new String[] { null, "textures/entity/horse/horse_markings_white.png", "textures/entity/horse/horse_markings_whitefield.png", "textures/entity/horse/horse_markings_whitedots.png", "textures/entity/horse/horse_markings_blackdots.png" };
        H = new String[] { "", "wo_", "wmo", "wdo", "bdo" };
    }
    
    public IllIIlllIIIIlllIIlIl(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII) {
        super(illlllllIIIlIIIlIlII);
        this.W = new String[3];
        this.X = false;
        this.llllIIIIlIIIlIlllIll(1.4f, 1.6f);
        this.llllIIllllIlIlIIIIll(this.IIIllIIIlIlIIllIIIlI = false);
        ((net.minecraft.IIIIlllIIIIIIlIIIlll.IllIIlllIIIIlllIIlIl)this.lIllllllIIllIlIlIlII()).llllIIIIlIIIlIlllIll(true);
        this.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll(0, new llIlIIIIIlIIlIlIIlll(this));
        this.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll(1, new lllIllIIIllllllIllll(this, 1.2));
        this.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll(1, new IlIllllIIlIIlIlIlIll(this, 1.2));
        this.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll(2, new net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll.IIlllIlIIllIlIlIlIIl(this, 1.0));
        this.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll(4, new IIllIIllIIIlIlIIIIlI(this, 1.0));
        this.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll(6, new IlIIllIIllIIllIIlIIl(this, 0.7));
        this.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll(7, new lllllIIIIIlIlIIIIIIl(this, net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll.class, 6.0f));
        this.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll(8, new IlIlIllllllllIIIIlII(this));
        this.aX();
    }
    
    @Override
    protected void a_() {
        super.a_();
        this.IIlllIIlllIIIlIlllII.llllIIIIlIIIlIlllIll(16, (Object)0);
        this.IIlllIIlllIIIlIlllII.llllIIIIlIIIlIlllIll(19, (Object)0);
        this.IIlllIIlllIIIlIlllII.llllIIIIlIIIlIlllIll(20, (Object)0);
        this.IIlllIIlllIIIlIlllII.llllIIIIlIIIlIlllIll(21, String.valueOf(""));
        this.IIlllIIlllIIIlIlllII.llllIIIIlIIIlIlllIll(22, (Object)0);
    }
    
    public void lllIIIIlllllIlIIllIl(final int n) {
        this.IIlllIIlllIIIlIlllII.IlIlIlIlIlllllllllIl(19, (byte)n);
        this.aZ();
    }
    
    public int aq() {
        return this.IIlllIIlllIIIlIlllII.llllIIIIlIIIlIlllIll(19);
    }
    
    public void IlIlIIIIIIlllIlIllIl(final int n) {
        this.IIlllIIlllIIIlIlllII.IlIlIlIlIlllllllllIl(20, n);
        this.aZ();
    }
    
    public int ar() {
        return this.IIlllIIlllIIIlIlllII.llIllIIIIIllIlIIIIlI(20);
    }
    
    @Override
    public String s_() {
        if (this.w_()) {
            return this.lIllIlIIIllllllIIlII();
        }
        switch (this.aq()) {
            default: {
                return net.minecraft.IlllllllIIIlIIIlIlII.lIIlllIlllllIIlllIll.llllIIIIlIIIlIlllIll("entity.horse.name");
            }
            case 1: {
                return net.minecraft.IlllllllIIIlIIIlIlII.lIIlllIlllllIIlllIll.llllIIIIlIIIlIlllIll("entity.donkey.name");
            }
            case 2: {
                return net.minecraft.IlllllllIIIlIIIlIlII.lIIlllIlllllIIlllIll.llllIIIIlIIIlIlllIll("entity.mule.name");
            }
            case 3: {
                return net.minecraft.IlllllllIIIlIIIlIlII.lIIlllIlllllIIlllIll.llllIIIIlIIIlIlllIll("entity.zombiehorse.name");
            }
            case 4: {
                return net.minecraft.IlllllllIIIlIIIlIlII.lIIlllIlllllIIlllIll.llllIIIIlIIIlIlllIll("entity.skeletonhorse.name");
            }
        }
    }
    
    private boolean IlllllllIIIlIIIlIlII(final int n) {
        return (this.IIlllIIlllIIIlIlllII.llIllIIIIIllIlIIIIlI(16) & n) != 0x0;
    }
    
    private void llIllIIIIIllIlIIIIlI(final int n, final boolean b) {
        final int llIllIIIIIllIlIIIIlI = this.IIlllIIlllIIIlIlllII.llIllIIIIIllIlIIIIlI(16);
        if (b) {
            this.IIlllIIlllIIIlIlllII.IlIlIlIlIlllllllllIl(16, llIllIIIIIllIlIIIIlI | n);
        }
        else {
            this.IIlllIIlllIIIlIlllII.IlIlIlIlIlllllllllIl(16, llIllIIIIIllIlIIIIlI & ~n);
        }
    }
    
    public boolean as() {
        return !this.e_();
    }
    
    public boolean at() {
        return this.IlllllllIIIlIIIlIlII(2);
    }
    
    public boolean au() {
        return this.as();
    }
    
    public String av() {
        return this.IIlllIIlllIIIlIlllII.IlIlIIIllIllIIIIIllI(21);
    }
    
    public void llllIIIIlIIIlIlllIll(final String s) {
        this.IIlllIIlllIIIlIlllII.IlIlIlIlIlllllllllIl(21, s);
    }
    
    public float aw() {
        return 0.5f;
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final boolean b) {
        if (b) {
            this.IlIIIlIlIIIllIlIlIIl(this.aw());
        }
        else {
            this.IlIIIlIlIIIllIlIlIIl(1.0f);
        }
    }
    
    public boolean ax() {
        return this.w;
    }
    
    public void lIlIlIIIllIIllIIIllI(final boolean b) {
        this.llIllIIIIIllIlIIIIlI(2, b);
    }
    
    public void IlIlIIIllIIllIlllllI(final boolean w) {
        this.w = w;
    }
    
    @Override
    public boolean s() {
        return !this.aR() && super.s();
    }
    
    @Override
    protected void IlIlIIIllIllIIIIIllI(final float n) {
        if (n > 6.0f && this.aA()) {
            this.lllIIIIlllllIlIIllIl(false);
        }
    }
    
    public boolean ay() {
        return this.IlllllllIIIlIIIlIlII(8);
    }
    
    public int az() {
        return this.IIlllIIlllIIIlIlllII.llIllIIIIIllIlIIIIlI(22);
    }
    
    private int IllIIlllIIIIlllIIlIl(final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl) {
        if (lllIIIIlIlIllIIlIIIl == null) {
            return 0;
        }
        final net.minecraft.llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl llllIIIIlIIIlIlllIll = lllIIIIlIlIllIIlIIIl.llllIIIIlIIIlIlllIll();
        return (llllIIIIlIIIlIlllIll == net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.ao) ? 1 : ((llllIIIIlIIIlIlllIll == net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.ap) ? 2 : ((llllIIIIlIIIlIlllIll == net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.aq) ? 3 : 0));
    }
    
    public boolean aA() {
        return this.IlllllllIIIlIIIlIlII(32);
    }
    
    public boolean aB() {
        return this.IlllllllIIIlIIIlIlII(64);
    }
    
    public boolean aC() {
        return this.IlllllllIIIlIIIlIlII(16);
    }
    
    public boolean aD() {
        return this.M;
    }
    
    public void IlIlIIIllIllIIIIIllI(final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl) {
        this.IIlllIIlllIIIlIlllII.IlIlIlIlIlllllllllIl(22, this.IllIIlllIIIIlllIIlIl(lllIIIIlIlIllIIlIIIl));
        this.aZ();
    }
    
    public void IIIIlllIIIIIIlIIIlll(final boolean b) {
        this.llIllIIIIIllIlIIIIlI(16, b);
    }
    
    public void llllIIllllIlIlIIIIll(final boolean b) {
        this.llIllIIIIIllIlIIIIlI(8, b);
    }
    
    public void IlIllIlIlIIIlIlIlIII(final boolean m) {
        this.M = m;
    }
    
    public void IIlllIIlIllIllIlIIll(final boolean b) {
        this.llIllIIIIIllIlIIIIlI(4, b);
    }
    
    public int aE() {
        return this.x;
    }
    
    public void IIllIIllIIIlIlIIIIlI(final int x) {
        this.x = x;
    }
    
    public int IIIlIIIlIlIIlllIIlll(final int n) {
        final int llllIIIIlIIIlIlllIll = net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(this.aE() + n, 0, this.aK());
        this.IIllIIllIIIlIlIIIIlI(llllIIIIlIIIlIlllIll);
        return llllIIIIlIIIlIlllIll;
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll(final lIllllllIIllIlIlIlII lIllllllIIllIlIlIlII, final float n) {
        final llIllIIIIIllIlIIIIlI llIIlIIIlIIIllIlIIIl = lIllllllIIllIlIlIlII.llIIlIIIlIIIllIlIIIl();
        return (this.IIllIIllIIIlIlIIIIlI == null || !this.IIllIIllIIIlIlIIIIlI.equals(llIIlIIIlIIIllIlIIIl)) && super.llllIIIIlIIIlIlllIll(lIllllllIIllIlIlIlII, n);
    }
    
    @Override
    public int R() {
        return IllIIlllIIIIlllIIlIl.D[this.az()];
    }
    
    @Override
    public boolean g_() {
        return this.IIllIIllIIIlIlIIIIlI == null;
    }
    
    public boolean aF() {
        this.IlllllllIIIlIIIlIlII.llIllIIIIIllIlIIIIlI(new net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(this.IIlllIlIIllIlIlIlIIl), 0, net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(this.lllllIlIIIlIlIIlllII)));
        return true;
    }
    
    public void aG() {
        if (!this.IlllllllIIIlIIIlIlII.IlIlIllllllllIIIIlII && this.ay()) {
            this.llllIIIIlIIIlIlllIll(net.minecraft.llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lllllIIIIIlIlIIIIIIl), 1);
            this.llllIIllllIlIlIIIIll(false);
        }
    }
    
    private void aV() {
        this.bc();
        if (!this.lIlIlIlllIIlIlIlllIl()) {
            this.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(this, "eating", 1.0f, 1.0f + (this.IlIIllIIllIIllIIlIIl.nextFloat() - this.IlIIllIIllIIllIIlIIl.nextFloat()) * 0.2f);
        }
    }
    
    @Override
    public void IlIIIlIlIIIllIlIlIIl(final float n, final float n2) {
        if (n > 1.0f) {
            this.llllIIIIlIIIlIlllIll("mob.horse.land", 0.4f, 1.0f);
        }
        final int illIIlllIIIIlllIIlIl = net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.IllIIlllIIIIlllIIlIl((n * 0.5f - 3.0f) * n2);
        if (illIIlllIIIIlllIIlIl > 0) {
            this.llllIIIIlIIIlIlllIll(net.minecraft.IlllllllIIIlIIIlIlII.lIllllllIIllIlIlIlII.lIIIlllIIIllIIIllIII, (float)illIIlllIIIIlllIIlIl);
            if (this.IIllIIllIIIlIlIIIIlI != null) {
                this.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll(net.minecraft.IlllllllIIIlIIIlIlII.lIllllllIIllIlIlIlII.lIIIlllIIIllIIIllIII, (float)illIIlllIIIIlllIIlIl);
            }
            final net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llIllIIIIIllIlIIIIlI = this.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(new net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(this.IIlllIlIIllIlIlIlIIl, this.llIIIlIlIllIIlIlIlII - 0.2 - this.IIIllllllIllIIIlllIl, this.lllllIlIIIlIlIIlllII)).llIllIIIIIllIlIIIIlI();
            if (llIllIIIIIllIlIIIIlI.IllIIlllIIIIlllIIlIl() != net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll && !this.lIlIlIlllIIlIlIlllIl()) {
                final net.minecraft.llllIIIIlIIIlIlllIll.llllIIIlIlllIlIIIIIl iIlllIIIlIlllIIlllII = llIllIIIIIllIlIIIIlI.IIlllIIIlIlllIIlllII;
                this.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(this, iIlllIIIlIlllIIlllII.llIllIIIIIllIlIIIIlI(), iIlllIIIlIlllIIlllII.IlIIIlIlIIIllIlIlIIl() * 0.5f, iIlllIIIlIlllIIlllII.IlIlIIIllIllIIIIIllI() * 0.75f);
            }
        }
    }
    
    private int aW() {
        final int aq = this.aq();
        return (!this.ay() || (aq != 1 && aq != 2)) ? 2 : 17;
    }
    
    private void aX() {
        final llllIIIIlIIIlIlllIll l = this.L;
        (this.L = new llllIIIIlIIIlIlllIll("HorseChest", this.aW())).llllIIIIlIIIlIlllIll(this.s_());
        if (l != null) {
            l.IlIlIlIlIlllllllllIl(this);
            for (int min = Math.min(l.lIIIlllIIIllIIIllIII(), this.L.lIIIlllIIIllIIIllIII()), i = 0; i < min; ++i) {
                final lllIIIIlIlIllIIlIIIl lIlIlIIIllIIllIIIllI = l.lIlIlIIIllIIllIIIllI(i);
                if (lIlIlIIIllIIllIIIllI != null) {
                    this.L.llIllIIIIIllIlIIIIlI(i, lIlIlIIIllIIllIIIllI.llIIlIIIlIIIllIlIIIl());
                }
            }
        }
        this.L.llllIIIIlIIIlIlllIll(this);
        this.aY();
    }
    
    private void aY() {
        if (!this.IlllllllIIIlIIIlIlII.IlIlIllllllllIIIIlII) {
            this.IIlllIIlIllIllIlIIll(this.L.lIlIlIIIllIIllIIIllI(0) != null);
            if (this.aP()) {
                this.IlIlIIIllIllIIIIIllI(this.L.lIlIlIIIllIIllIIIllI(1));
            }
        }
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final net.minecraft.llIIlIIIlIIIllIlIIIl.lIllllllIIllIlIlIlII lIllllllIIllIlIlIlII) {
        final int az = this.az();
        final boolean ai = this.aI();
        this.aY();
        if (this.lllllIIIIIlIlIIIIIIl > 20) {
            if (az == 0 && az != this.az()) {
                this.llllIIIIlIIIlIlllIll("mob.horse.armor", 0.5f, 1.0f);
            }
            else if (az != this.az()) {
                this.llllIIIIlIIIlIlllIll("mob.horse.armor", 0.5f, 1.0f);
            }
            if (!ai && this.aI()) {
                this.llllIIIIlIIIlIlllIll("mob.horse.leather", 0.5f, 1.0f);
            }
        }
    }
    
    @Override
    public boolean lIlIlIIIllIIllIIIllI() {
        this.aF();
        return super.lIlIlIIIllIIllIIIllI();
    }
    
    protected IllIIlllIIIIlllIIlIl llllIIIIlIIIlIlllIll(final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI, final double n) {
        double n2 = Double.MAX_VALUE;
        llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI2 = null;
        for (final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI3 : this.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI, llIllIIIIIllIlIIIIlI.IlIIlllIIlIlllllIIlI().llllIIIIlIIIlIlllIll(n, n, n), IllIIlllIIIIlllIIlIl.z)) {
            final double ilIlIIIllIllIIIIIllI = llIllIIIIIllIlIIIIlI3.IlIlIIIllIllIIIIIllI(llIllIIIIIllIlIIIIlI.IIlllIlIIllIlIlIlIIl, llIllIIIIIllIlIIIIlI.llIIIlIlIllIIlIlIlII, llIllIIIIIllIlIIIIlI.lllllIlIIIlIlIIlllII);
            if (ilIlIIIllIllIIIIIllI < n2) {
                llIllIIIIIllIlIIIIlI2 = llIllIIIIIllIlIIIIlI3;
                n2 = ilIlIIIllIllIIIIIllI;
            }
        }
        return (IllIIlllIIIIlllIIlIl)llIllIIIIIllIlIIIIlI2;
    }
    
    public double aH() {
        return this.llllIIIIlIIIlIlllIll(IllIIlllIIIIlllIIlIl.A).IlIlIIIllIllIIIIIllI();
    }
    
    @Override
    protected String P() {
        this.bc();
        final int aq = this.aq();
        return (aq == 3) ? "mob.horse.zombie.death" : ((aq == 4) ? "mob.horse.skeleton.death" : ((aq != 1 && aq != 2) ? "mob.horse.death" : "mob.horse.donkey.death"));
    }
    
    @Override
    protected net.minecraft.llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl f() {
        final boolean b = this.IlIIllIIllIIllIIlIIl.nextInt(4) == 0;
        final int aq = this.aq();
        return (aq == 4) ? net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.b : ((aq == 3) ? (b ? null : net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.x) : net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.lllllIlIlIlllIlllIlI);
    }
    
    @Override
    protected String O() {
        this.bc();
        if (this.IlIIllIIllIIllIIlIIl.nextInt(3) == 0) {
            this.be();
        }
        final int aq = this.aq();
        return (aq == 3) ? "mob.horse.zombie.hit" : ((aq == 4) ? "mob.horse.skeleton.hit" : ((aq != 1 && aq != 2) ? "mob.horse.hit" : "mob.horse.donkey.hit"));
    }
    
    public boolean aI() {
        return this.IlllllllIIIlIIIlIlII(4);
    }
    
    @Override
    protected String e() {
        this.bc();
        if (this.IlIIllIIllIIllIIlIIl.nextInt(10) == 0 && !this.ab()) {
            this.be();
        }
        final int aq = this.aq();
        return (aq == 3) ? "mob.horse.zombie.idle" : ((aq == 4) ? "mob.horse.skeleton.idle" : ((aq != 1 && aq != 2) ? "mob.horse.idle" : "mob.horse.donkey.idle"));
    }
    
    protected String aJ() {
        this.bc();
        this.be();
        final int aq = this.aq();
        return (aq != 3 && aq != 4) ? ((aq != 1 && aq != 2) ? "mob.horse.angry" : "mob.horse.donkey.angry") : null;
    }
    
    @Override
    protected void llllIIIIlIIIlIlllIll(final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        net.minecraft.llllIIIIlIIIlIlllIll.llllIIIlIlllIlIIIIIl llllIIIlIlllIlIIIIIl = llllIIIIlIIIlIlllIll.IIlllIIIlIlllIIlllII;
        if (this.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll()).llIllIIIIIllIlIIIIlI() == net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lllIlIIIIIlIlllllIlI) {
            llllIIIlIlllIlIIIIIl = net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lllIlIIIIIlIlllllIlI.IIlllIIIlIlllIIlllII;
        }
        if (!llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl().llllIIIIlIIIlIlllIll()) {
            final int aq = this.aq();
            if (this.IIllIIllIIIlIlIIIIlI != null && aq != 1 && aq != 2) {
                ++this.U;
                if (this.U > 5 && this.U % 3 == 0) {
                    this.llllIIIIlIIIlIlllIll("mob.horse.gallop", llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl() * 0.15f, llllIIIlIlllIlIIIIIl.IlIlIIIllIllIIIIIllI());
                    if (aq == 0 && this.IlIIllIIllIIllIIlIIl.nextInt(10) == 0) {
                        this.llllIIIIlIIIlIlllIll("mob.horse.breathe", llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl() * 0.6f, llllIIIlIlllIlIIIIIl.IlIlIIIllIllIIIIIllI());
                    }
                }
                else if (this.U <= 5) {
                    this.llllIIIIlIIIlIlllIll("mob.horse.wood", llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl() * 0.15f, llllIIIlIlllIlIIIIIl.IlIlIIIllIllIIIIIllI());
                }
            }
            else if (llllIIIlIlllIlIIIIIl == net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl) {
                this.llllIIIIlIIIlIlllIll("mob.horse.wood", llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl() * 0.15f, llllIIIlIlllIlIIIIIl.IlIlIIIllIllIIIIIllI());
            }
            else {
                this.llllIIIIlIIIlIlllIll("mob.horse.soft", llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl() * 0.15f, llllIIIlIlllIlIIIIIl.IlIlIIIllIllIIIIIllI());
            }
        }
    }
    
    @Override
    protected void IlIlIllllllllIIIIlII() {
        super.IlIlIllllllllIIIIlII();
        this.X().IlIlIlIlIlllllllllIl(IllIIlllIIIIlllIIlIl.A);
        this.llllIIIIlIIIlIlllIll(net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIIIllllIlIlIlI.llllIIIIlIIIlIlllIll).llllIIIIlIIIlIlllIll(53.0);
        this.llllIIIIlIIIlIlllIll(net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIIIllllIlIlIlI.IlIIIlIlIIIllIlIlIIl).llllIIIIlIIIlIlllIll(0.22499999403953552);
    }
    
    @Override
    public int m() {
        return 6;
    }
    
    public int aK() {
        return 100;
    }
    
    @Override
    protected float Z() {
        return 0.8f;
    }
    
    @Override
    public int IIIllllllIllIIIlllIl() {
        return 400;
    }
    
    public boolean aL() {
        return this.aq() == 0 || this.az() > 0;
    }
    
    private void aZ() {
        this.V = null;
    }
    
    public boolean aM() {
        return this.X;
    }
    
    private void ba() {
        this.V = "horse/";
        this.W[0] = null;
        this.W[1] = null;
        this.W[2] = null;
        final int aq = this.aq();
        final int ar = this.ar();
        if (aq == 0) {
            final int n = ar & 0xFF;
            final int n2 = (ar & 0xFF00) >> 8;
            if (n >= IllIIlllIIIIlllIIlIl.E.length) {
                this.X = false;
                return;
            }
            this.W[0] = IllIIlllIIIIlllIIlIl.E[n];
            this.V = String.valueOf(this.V) + IllIIlllIIIIlllIIlIl.F[n];
            if (n2 >= IllIIlllIIIIlllIIlIl.G.length) {
                this.X = false;
                return;
            }
            this.W[1] = IllIIlllIIIIlllIIlIl.G[n2];
            this.V = String.valueOf(this.V) + IllIIlllIIIIlllIIlIl.H[n2];
        }
        else {
            this.W[0] = "";
            this.V = String.valueOf(this.V) + "_" + aq + "_";
        }
        final int az = this.az();
        if (az >= IllIIlllIIIIlllIIlIl.B.length) {
            this.X = false;
        }
        else {
            this.W[2] = IllIIlllIIIIlllIIlIl.B[az];
            this.V = String.valueOf(this.V) + IllIIlllIIIIlllIIlIl.C[az];
            this.X = true;
        }
    }
    
    public String aN() {
        if (this.V == null) {
            this.ba();
        }
        return this.V;
    }
    
    public String[] aO() {
        if (this.V == null) {
            this.ba();
        }
        return this.W;
    }
    
    public void llllIIIlIlllIlIIIIIl(final net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        if (!this.IlllllllIIIlIIIlIlII.IlIlIllllllllIIIIlII && (this.IIllIIllIIIlIlIIIIlI == null || this.IIllIIllIIIlIlIIIIlI == llllIIIIlIIIlIlllIll) && this.at()) {
            this.L.llllIIIIlIIIlIlllIll(this.s_());
            llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(this, this.L);
        }
    }
    
    @Override
    public boolean IlIIIlIlIIIllIlIlIIl(final net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        final lllIIIIlIlIllIIlIIIl ilIIIlIlIIIllIlIlIIl = llllIIIIlIIIlIlllIll.lIlIlIIIllIIllIIIllI.IlIIIlIlIIIllIlIlIIl();
        if (ilIIIlIlIIIllIlIlIIl != null && ilIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll() == net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.N) {
            return super.IlIIIlIlIIIllIlIlIIl(llllIIIIlIIIlIlllIll);
        }
        if (!this.at() && this.aR()) {
            return false;
        }
        if (this.at() && this.as() && llllIIIIlIIIlIlllIll.IIIIIllIIIIlIIIIllIl()) {
            this.llllIIIlIlllIlIIIIIl(llllIIIIlIIIlIlllIll);
            return true;
        }
        if (this.au() && this.IIllIIllIIIlIlIIIIlI != null) {
            return super.IlIIIlIlIIIllIlIlIIl(llllIIIIlIIIlIlllIll);
        }
        if (ilIIIlIlIIIllIlIlIIl != null) {
            int n = 0;
            if (this.aP()) {
                int n2 = -1;
                if (ilIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll() == net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.ao) {
                    n2 = 1;
                }
                else if (ilIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll() == net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.ap) {
                    n2 = 2;
                }
                else if (ilIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll() == net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.aq) {
                    n2 = 3;
                }
                if (n2 >= 0) {
                    if (!this.at()) {
                        this.aT();
                        return true;
                    }
                    this.llllIIIlIlllIlIIIIIl(llllIIIIlIIIlIlllIll);
                    return true;
                }
            }
            if (n == 0 && !this.aR()) {
                float n3 = 0.0f;
                int n4 = 0;
                int n5 = 0;
                if (ilIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll() == net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.lllIllIIIllllllIllll) {
                    n3 = 2.0f;
                    n4 = 20;
                    n5 = 3;
                }
                else if (ilIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll() == net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.c) {
                    n3 = 1.0f;
                    n4 = 30;
                    n5 = 3;
                }
                else if (net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(ilIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll()) == net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.aB) {
                    n3 = 20.0f;
                    n4 = 180;
                }
                else if (ilIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll() == net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.IlIlIIIllIllIIIIIllI) {
                    n3 = 3.0f;
                    n4 = 60;
                    n5 = 3;
                }
                else if (ilIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll() == net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.aa) {
                    n3 = 4.0f;
                    n4 = 60;
                    n5 = 5;
                    if (this.at() && this.llllIIIlIlllIlIIIIIl() == 0) {
                        n = 1;
                        this.IllIIlllIIIIlllIIlIl(llllIIIIlIIIlIlllIll);
                    }
                }
                else if (ilIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll() == net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.llllIllllIllllIlIlII) {
                    n3 = 10.0f;
                    n4 = 240;
                    n5 = 10;
                    if (this.at() && this.llllIIIlIlllIlIIIIIl() == 0) {
                        n = 1;
                        this.IllIIlllIIIIlllIIlIl(llllIIIIlIIIlIlllIll);
                    }
                }
                if (this.N() < this.U() && n3 > 0.0f) {
                    this.IlIlIlIlIlllllllllIl(n3);
                    n = 1;
                }
                if (!this.as() && n4 > 0) {
                    this.llllIIIIlIIIlIlllIll(n4);
                    n = 1;
                }
                if (n5 > 0 && (n != 0 || !this.at()) && n5 < this.aK()) {
                    n = 1;
                    this.IIIlIIIlIlIIlllIIlll(n5);
                }
                if (n != 0) {
                    this.aV();
                }
            }
            if (!this.at() && n == 0) {
                if (ilIIIlIlIIIllIlIlIIl != null && ilIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll, this)) {
                    return true;
                }
                this.aT();
                return true;
            }
            else {
                if (n == 0 && this.aQ() && !this.ay() && ilIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll() == net.minecraft.llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lllllIIIIIlIlIIIIIIl)) {
                    this.llllIIllllIlIlIIIIll(true);
                    this.llllIIIIlIIIlIlllIll("mob.chickenplop", 1.0f, (this.IlIIllIIllIIllIIlIIl.nextFloat() - this.IlIIllIIllIIllIIlIIl.nextFloat()) * 0.2f + 1.0f);
                    n = 1;
                    this.aX();
                }
                if (n == 0 && this.au() && !this.aI() && ilIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll() == net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.IIllIIIlIIIIlIIlIIII) {
                    this.llllIIIlIlllIlIIIIIl(llllIIIIlIIIlIlllIll);
                    return true;
                }
                if (n != 0) {
                    if (!llllIIIIlIIIlIlllIll.K.IlIIIlIlIIIllIlIlIIl) {
                        final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl = ilIIIlIlIIIllIlIlIIl;
                        if (--lllIIIIlIlIllIIlIIIl.IlIlIlIlIlllllllllIl == 0) {
                            llllIIIIlIIIlIlllIll.lIlIlIIIllIIllIIIllI.llIllIIIIIllIlIIIIlI(llllIIIIlIIIlIlllIll.lIlIlIIIllIIllIIIllI.llIllIIIIIllIlIIIIlI, null);
                        }
                    }
                    return true;
                }
            }
        }
        if (!this.au() || this.IIllIIllIIIlIlIIIIlI != null) {
            return super.IlIIIlIlIIIllIlIlIIl(llllIIIIlIIIlIlllIll);
        }
        if (ilIIIlIlIIIllIlIlIIl != null && ilIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll, this)) {
            return true;
        }
        this.lIIIlllIIIllIIIllIII(llllIIIIlIIIlIlllIll);
        return true;
    }
    
    private void lIIIlllIIIllIIIllIII(final net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        llllIIIIlIIIlIlllIll.IIlIIIIIllIlIIIlIIll = this.IIlIIIIIllIlIIIlIIll;
        llllIIIIlIIIlIlllIll.llllllIllIllIlIllllI = this.llllllIllIllIlIllllI;
        this.lllIIIIlllllIlIIllIl(false);
        this.IlIlIIIIIIlllIlIllIl(false);
        if (!this.IlllllllIIIlIIIlIlII.IlIlIllllllllIIIIlII) {
            llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll((llIllIIIIIllIlIIIIlI)this);
        }
    }
    
    public boolean aP() {
        return this.aq() == 0;
    }
    
    public boolean aQ() {
        final int aq = this.aq();
        return aq == 2 || aq == 1;
    }
    
    @Override
    protected boolean ab() {
        return (this.IIllIIllIIIlIlIIIIlI != null && this.aI()) || this.aA() || this.aB();
    }
    
    public boolean aR() {
        final int aq = this.aq();
        return aq == 3 || aq == 4;
    }
    
    public boolean aS() {
        return this.aR() || this.aq() == 2;
    }
    
    @Override
    public boolean IlIIIlIlIIIllIlIlIIl(final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl) {
        return false;
    }
    
    private void bb() {
        this.u = 1;
    }
    
    @Override
    public void IlIlIlIlIlllllllllIl(final lIllllllIIllIlIlIlII lIllllllIIllIlIlIlII) {
        super.IlIlIlIlIlllllllllIl(lIllllllIIllIlIlIlII);
        if (!this.IlllllllIIIlIIIlIlII.IlIlIllllllllIIIIlII) {
            this.aU();
        }
    }
    
    @Override
    public void IIIlIIIlIlIIlllIIlll() {
        if (this.IlIIllIIllIIllIIlIIl.nextInt(200) == 0) {
            this.bb();
        }
        super.IIIlIIIlIlIIlllIIlll();
        if (!this.IlllllllIIIlIIIlIlII.IlIlIllllllllIIIIlII) {
            if (this.IlIIllIIllIIllIIlIIl.nextInt(900) == 0 && this.llIlllIlllllIIllIIII == 0) {
                this.IlIlIlIlIlllllllllIl(1.0f);
            }
            if (!this.aA() && this.IIllIIllIIIlIlIIIIlI == null && this.IlIIllIIllIIllIIlIIl.nextInt(300) == 0 && this.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(new net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(this.IIlllIlIIllIlIlIlIIl), net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(this.llIIIlIlIllIIlIlIlII) - 1, net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(this.lllllIlIIIlIlIIlllII))).llIllIIIIIllIlIIIIlI() == net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI) {
                this.lllIIIIlllllIlIIllIl(true);
            }
            if (this.aA() && ++this.I > 50) {
                this.I = 0;
                this.lllIIIIlllllIlIIllIl(false);
            }
            if (this.aC() && !this.as() && !this.aA()) {
                final IllIIlllIIIIlllIIlIl llllIIIIlIIIlIlllIll = this.llllIIIIlIIIlIlllIll(this, 16.0);
                if (llllIIIIlIIIlIlllIll != null && this.IlIlIIIllIllIIIIIllI(llllIIIIlIIIlIlllIll) > 4.0) {
                    this.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll);
                }
            }
        }
    }
    
    @Override
    public void IIllIIllIIIlIlIIIIlI() {
        super.IIllIIllIIIlIlIIIIlI();
        if (this.IlllllllIIIlIIIlIlII.IlIlIllllllllIIIIlII && this.IIlllIIlllIIIlIlllII.llllIIIIlIIIlIlllIll()) {
            this.IIlllIIlllIIIlIlllII.IlIlIIIllIllIIIIIllI();
            this.aZ();
        }
        if (this.J > 0 && ++this.J > 30) {
            this.J = 0;
            this.llIllIIIIIllIlIIIIlI(128, false);
        }
        if (!this.IlllllllIIIlIIIlIlII.IlIlIllllllllIIIIlII && this.K > 0 && ++this.K > 20) {
            this.K = 0;
            this.IlIlIIIIIIlllIlIllIl(false);
        }
        if (this.u > 0 && ++this.u > 8) {
            this.u = 0;
        }
        if (this.v > 0) {
            ++this.v;
            if (this.v > 300) {
                this.v = 0;
            }
        }
        this.P = this.O;
        if (this.aA()) {
            this.O += (1.0f - this.O) * 0.4f + 0.05f;
            if (this.O > 1.0f) {
                this.O = 1.0f;
            }
        }
        else {
            this.O += (0.0f - this.O) * 0.4f - 0.05f;
            if (this.O < 0.0f) {
                this.O = 0.0f;
            }
        }
        this.R = this.Q;
        if (this.aB()) {
            final float n = 0.0f;
            this.O = n;
            this.P = n;
            this.Q += (1.0f - this.Q) * 0.4f + 0.05f;
            if (this.Q > 1.0f) {
                this.Q = 1.0f;
            }
        }
        else {
            this.N = false;
            this.Q += (0.8f * this.Q * this.Q * this.Q - this.Q) * 0.6f - 0.05f;
            if (this.Q < 0.0f) {
                this.Q = 0.0f;
            }
        }
        this.T = this.S;
        if (this.IlllllllIIIlIIIlIlII(128)) {
            this.S += (1.0f - this.S) * 0.7f + 0.05f;
            if (this.S > 1.0f) {
                this.S = 1.0f;
            }
        }
        else {
            this.S += (0.0f - this.S) * 0.7f - 0.05f;
            if (this.S < 0.0f) {
                this.S = 0.0f;
            }
        }
    }
    
    private void bc() {
        if (!this.IlllllllIIIlIIIlIlII.IlIlIllllllllIIIIlII) {
            this.J = 1;
            this.llIllIIIIIllIlIIIIlI(128, true);
        }
    }
    
    private boolean bd() {
        return this.IIllIIllIIIlIlIIIIlI == null && this.IIIlIIIlIlIIlllIIlll == null && this.at() && this.as() && !this.aS() && this.N() >= this.U() && this.ao();
    }
    
    @Override
    public void llllIIIlIlllIlIIIIIl(final boolean b) {
        this.llIllIIIIIllIlIIIIlI(32, b);
    }
    
    public void lllIIIIlllllIlIIllIl(final boolean b) {
        this.llllIIIlIlllIlIIIIIl(b);
    }
    
    public void IlIlIIIIIIlllIlIllIl(final boolean b) {
        if (b) {
            this.lllIIIIlllllIlIIllIl(false);
        }
        this.llIllIIIIIllIlIIIIlI(64, b);
    }
    
    private void be() {
        if (!this.IlllllllIIIlIIIlIlII.IlIlIllllllllIIIIlII) {
            this.K = 1;
            this.IlIlIIIIIIlllIlIllIl(true);
        }
    }
    
    public void aT() {
        this.be();
        final String aj = this.aJ();
        if (aj != null) {
            this.llllIIIIlIIIlIlllIll(aj, this.Z(), this.aa());
        }
    }
    
    public void aU() {
        this.llllIIIIlIIIlIlllIll(this, this.L);
        this.aG();
    }
    
    private void llllIIIIlIIIlIlllIll(final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI, final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        if (llllIIIIlIIIlIlllIll != null && !this.IlllllllIIIlIIIlIlII.IlIlIllllllllIIIIlII) {
            for (int i = 0; i < llllIIIIlIIIlIlllIll.lIIIlllIIIllIIIllIII(); ++i) {
                final lllIIIIlIlIllIIlIIIl lIlIlIIIllIIllIIIllI = llllIIIIlIIIlIlllIll.lIlIlIIIllIIllIIIllI(i);
                if (lIlIlIIIllIIllIIIllI != null) {
                    this.llllIIIIlIIIlIlllIll(lIlIlIIIllIIllIIIllI, 0.0f);
                }
            }
        }
    }
    
    public boolean lIIIIlIIIIIlllIllIII(final net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        this.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll.lllIIIIlIlIllIIlIIIl().toString());
        this.lIlIlIIIllIIllIIIllI(true);
        return true;
    }
    
    @Override
    public void IllIIlllIIIIlllIIlIl(float n, float l) {
        if (this.IIllIIllIIIlIlIIIIlI != null && this.IIllIIllIIIlIlIIIIlI instanceof lllIIIIlllllIlIIllIl && this.aI()) {
            final float iIlIIIIIllIlIIIlIIll = this.IIllIIllIIIlIlIIIIlI.IIlIIIIIllIlIIIlIIll;
            this.IIlIIIIIllIlIIIlIIll = iIlIIIIIllIlIIIlIIll;
            this.IIIllllllIllIIIlllIl = iIlIIIIIllIlIIIlIIll;
            this.llllllIllIllIlIllllI = this.IIllIIllIIIlIlIIIIlI.llllllIllIllIlIllllI * 0.5f;
            this.IlIlIlIlIlllllllllIl(this.IIlIIIIIllIlIIIlIIll, this.llllllIllIllIlIllllI);
            final float iIlIIIIIllIlIIIlIIll2 = this.IIlIIIIIllIlIIIlIIll;
            this.lIllIlIIIllllllIIlII = iIlIIIIIllIlIIIlIIll2;
            this.lIIlllIlllllIIlllIll = iIlIIIIIllIlIIIlIIll2;
            n = ((lllIIIIlllllIlIIllIl)this.IIllIIllIIIlIlIIIIlI).k * 0.5f;
            l = ((lllIIIIlllllIlIIllIl)this.IIllIIllIIIlIlIIIIlI).l;
            if (l <= 0.0f) {
                l *= 0.25f;
                this.U = 0;
            }
            if (this.IIIIIllIIIIlIIIIllIl && this.y == 0.0f && this.aB() && !this.N) {
                n = 0.0f;
                l = 0.0f;
            }
            if (this.y > 0.0f && !this.ax() && this.IIIIIllIIIIlIIIIllIl) {
                this.llIIlllIIlllIIllIllI = this.aH() * this.y;
                if (this.llllIIIIlIIIlIlllIll(net.minecraft.llllIIllllIlIlIIIIll.llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl)) {
                    this.llIIlllIIlllIIllIllI += (this.IlIlIlIlIlllllllllIl(net.minecraft.llllIIllllIlIlIIIIll.llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl).llIllIIIIIllIlIIIIlI() + 1) * 0.1f;
                }
                this.IlIlIIIllIIllIlllllI(true);
                this.llIllIIlllllllllllll = true;
                if (l > 0.0f) {
                    final float llllIIIIlIIIlIlllIll = net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(this.IIlIIIIIllIlIIIlIIll * 3.1415927f / 180.0f);
                    final float ilIlIlIlIlllllllllIl = net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.IlIlIlIlIlllllllllIl(this.IIlIIIIIllIlIIIlIIll * 3.1415927f / 180.0f);
                    this.lIllllllIIllIlIlIlII += -0.4f * llllIIIIlIIIlIlllIll * this.y;
                    this.IIlllIIIlIlllIIlllII += 0.4f * ilIlIlIlIlllllllllIl * this.y;
                    this.llllIIIIlIIIlIlllIll("mob.horse.jump", 0.4f, 1.0f);
                }
                this.y = 0.0f;
            }
            this.llIIIIIIlIllIIlIIIll = 1.0f;
            this.lIIlIIIIIIIlIIlIlIIl = this.ag() * 0.1f;
            if (!this.IlllllllIIIlIIIlIlII.IlIlIllllllllIIIIlII) {
                this.llIIlIIIlIIIllIlIIIl((float)this.llllIIIIlIIIlIlllIll(net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIIIllllIlIlIlI.IlIIIlIlIIIllIlIlIIl).IlIlIIIllIllIIIIIllI());
                super.IllIIlllIIIIlllIIlIl(n, l);
            }
            if (this.IIIIIllIIIIlIIIIllIl) {
                this.y = 0.0f;
                this.IlIlIIIllIIllIlllllI(false);
            }
            this.lllIlIIIIIlIlllllIlI = this.llIlIIIIllIlIIlIlIII;
            final double n2 = this.IIlllIlIIllIlIlIlIIl - this.IIlIIIIlllIlllllIlII;
            final double n3 = this.lllllIlIIIlIlIIlllII - this.IlIlIllllllllIIIIlII;
            float n4 = net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(n2 * n2 + n3 * n3) * 4.0f;
            if (n4 > 1.0f) {
                n4 = 1.0f;
            }
            this.llIlIIIIllIlIIlIlIII += (n4 - this.llIlIIIIllIlIIlIlIII) * 0.4f;
            this.IIIIIlllIlIIIIIIIllI += this.llIlIIIIllIlIIlIlIII;
        }
        else {
            this.llIIIIIIlIllIIlIIIll = 0.5f;
            this.lIIlIIIIIIIlIIlIlIIl = 0.02f;
            super.IllIIlllIIIIlllIIlIl(n, l);
        }
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll) {
        super.llllIIIIlIIIlIlllIll(iiiIlllIIIIIIlIIIlll);
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("EatingHaystack", this.aA());
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("ChestedHorse", this.ay());
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("HasReproduced", this.aD());
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("Bred", this.aC());
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("Type", this.aq());
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("Variant", this.ar());
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("Temper", this.aE());
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("Tame", this.at());
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("OwnerUUID", this.av());
        if (this.ay()) {
            final IlIlIIIlIIlIlIIlllIl ilIlIIIlIIlIlIIlllIl = new IlIlIIIlIIlIlIIlllIl();
            for (int i = 2; i < this.L.lIIIlllIIIllIIIllIII(); ++i) {
                final lllIIIIlIlIllIIlIIIl lIlIlIIIllIIllIIIllI = this.L.lIlIlIIIllIIllIIIllI(i);
                if (lIlIlIIIllIIllIIIllI != null) {
                    final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll2 = new IIIIlllIIIIIIlIIIlll();
                    iiiIlllIIIIIIlIIIlll2.llllIIIIlIIIlIlllIll("Slot", (byte)i);
                    lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl(iiiIlllIIIIIIlIIIlll2);
                    ilIlIIIlIIlIlIIlllIl.llllIIIIlIIIlIlllIll(iiiIlllIIIIIIlIIIlll2);
                }
            }
            iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("Items", ilIlIIIlIIlIlIIlllIl);
        }
        if (this.L.lIlIlIIIllIIllIIIllI(1) != null) {
            iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("ArmorItem", this.L.lIlIlIIIllIIllIIIllI(1).IlIlIlIlIlllllllllIl(new IIIIlllIIIIIIlIIIlll()));
        }
        if (this.L.lIlIlIIIllIIllIIIllI(0) != null) {
            iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("SaddleItem", this.L.lIlIlIIIllIIllIIIllI(0).IlIlIlIlIlllllllllIl(new IIIIlllIIIIIIlIIIlll()));
        }
    }
    
    @Override
    public void IlIlIlIlIlllllllllIl(final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll) {
        super.IlIlIlIlIlllllllllIl(iiiIlllIIIIIIlIIIlll);
        this.lllIIIIlllllIlIIllIl(iiiIlllIIIIIIlIIIlll.IIIIlllIIIIIIlIIIlll("EatingHaystack"));
        this.IIIIlllIIIIIIlIIIlll(iiiIlllIIIIIIlIIIlll.IIIIlllIIIIIIlIIIlll("Bred"));
        this.llllIIllllIlIlIIIIll(iiiIlllIIIIIIlIIIlll.IIIIlllIIIIIIlIIIlll("ChestedHorse"));
        this.IlIllIlIlIIIlIlIlIII(iiiIlllIIIIIIlIIIlll.IIIIlllIIIIIIlIIIlll("HasReproduced"));
        this.lllIIIIlllllIlIIllIl(iiiIlllIIIIIIlIIIlll.IllIIlllIIIIlllIIlIl("Type"));
        this.IlIlIIIIIIlllIlIllIl(iiiIlllIIIIIIlIIIlll.IllIIlllIIIIlllIIlIl("Variant"));
        this.IIllIIllIIIlIlIIIIlI(iiiIlllIIIIIIlIIIlll.IllIIlllIIIIlllIIlIl("Temper"));
        this.lIlIlIIIllIIllIIIllI(iiiIlllIIIIIIlIIIlll.IIIIlllIIIIIIlIIIlll("Tame"));
        String s;
        if (iiiIlllIIIIIIlIIIlll.IlIlIlIlIlllllllllIl("OwnerUUID", 8)) {
            s = iiiIlllIIIIIIlIIIlll.llIIlIIIlIIIllIlIIIl("OwnerUUID");
        }
        else {
            s = net.minecraft.IlIlIIIIIIlllIlIllIl.IlIlIlIlIlllllllllIl.IlIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll(iiiIlllIIIIIIlIIIlll.llIIlIIIlIIIllIlIIIl("Owner"));
        }
        if (s.length() > 0) {
            this.llllIIIIlIIIlIlllIll(s);
        }
        final net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI llllIIIIlIIIlIlllIll = this.X().llllIIIIlIIIlIlllIll("Speed");
        if (llllIIIIlIIIlIlllIll != null) {
            this.llllIIIIlIIIlIlllIll(net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIIIllllIlIlIlI.IlIIIlIlIIIllIlIlIIl).llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl() * 0.25);
        }
        if (this.ay()) {
            final IlIlIIIlIIlIlIIlllIl llIllIIIIIllIlIIIIlI = iiiIlllIIIIIIlIIIlll.llIllIIIIIllIlIIIIlI("Items", 10);
            this.aX();
            for (int i = 0; i < llIllIIIIIllIlIIIIlI.IlIlIIIllIllIIIIIllI(); ++i) {
                final IIIIlllIIIIIIlIIIlll ilIlIlIlIlllllllllIl = llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(i);
                final int n = ilIlIlIlIlllllllllIl.IlIIIlIlIIIllIlIlIIl("Slot") & 0xFF;
                if (n >= 2 && n < this.L.lIIIlllIIIllIIIllIII()) {
                    this.L.llIllIIIIIllIlIIIIlI(n, net.minecraft.llIllIlIIIIllIlIIllI.lllIIIIlIlIllIIlIIIl.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl));
                }
            }
        }
        if (iiiIlllIIIIIIlIIIlll.IlIlIlIlIlllllllllIl("ArmorItem", 10)) {
            final lllIIIIlIlIllIIlIIIl llllIIIIlIIIlIlllIll2 = net.minecraft.llIllIlIIIIllIlIIllI.lllIIIIlIlIllIIlIIIl.llllIIIIlIIIlIlllIll(iiiIlllIIIIIIlIIIlll.IlIlIIIllIIllIlllllI("ArmorItem"));
            if (llllIIIIlIIIlIlllIll2 != null && llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll2.llllIIIIlIIIlIlllIll())) {
                this.L.llIllIIIIIllIlIIIIlI(1, llllIIIIlIIIlIlllIll2);
            }
        }
        if (iiiIlllIIIIIIlIIIlll.IlIlIlIlIlllllllllIl("SaddleItem", 10)) {
            final lllIIIIlIlIllIIlIIIl llllIIIIlIIIlIlllIll3 = net.minecraft.llIllIlIIIIllIlIIllI.lllIIIIlIlIllIIlIIIl.llllIIIIlIIIlIlllIll(iiiIlllIIIIIIlIIIlll.IlIlIIIllIIllIlllllI("SaddleItem"));
            if (llllIIIIlIIIlIlllIll3 != null && llllIIIIlIIIlIlllIll3.llllIIIIlIIIlIlllIll() == net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.IIllIIIlIIIIlIIlIIII) {
                this.L.llIllIIIIIllIlIIIIlI(0, llllIIIIlIIIlIlllIll3);
            }
        }
        else if (iiiIlllIIIIIIlIIIlll.IIIIlllIIIIIIlIIIlll("Saddle")) {
            this.L.llIllIIIIIllIlIIIIlI(0, new lllIIIIlIlIllIIlIIIl(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.IIllIIIlIIIIlIIlIIII));
        }
        this.aY();
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll(final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        if (ilIlIlIlIlllllllllIl == this) {
            return false;
        }
        if (ilIlIlIlIlllllllllIl.getClass() != this.getClass()) {
            return false;
        }
        final IllIIlllIIIIlllIIlIl illIIlllIIIIlllIIlIl = (IllIIlllIIIIlllIIlIl)ilIlIlIlIlllllllllIl;
        if (this.bd() && illIIlllIIIIlllIIlIl.bd()) {
            final int aq = this.aq();
            final int aq2 = illIIlllIIIIlllIIlIl.aq();
            return aq == aq2 || (aq == 0 && aq2 == 1) || (aq == 1 && aq2 == 0);
        }
        return false;
    }
    
    @Override
    public lIIIIlIIIIIlllIllIII llllIIIIlIIIlIlllIll(final lIIIIlIIIIIlllIllIII liiiIlIIIIIlllIllIII) {
        final IllIIlllIIIIlllIIlIl illIIlllIIIIlllIIlIl = (IllIIlllIIIIlllIIlIl)liiiIlIIIIIlllIllIII;
        final IllIIlllIIIIlllIIlIl illIIlllIIIIlllIIlIl2 = new IllIIlllIIIIlllIIlIl(this.IlllllllIIIlIIIlIlII);
        final int aq = this.aq();
        final int aq2 = illIIlllIIIIlllIIlIl.aq();
        int n = 0;
        if (aq == aq2) {
            n = aq;
        }
        else if ((aq == 0 && aq2 == 1) || (aq == 1 && aq2 == 0)) {
            n = 2;
        }
        if (n == 0) {
            final int nextInt = this.IlIIllIIllIIllIIlIIl.nextInt(9);
            int nextInt2;
            if (nextInt < 4) {
                nextInt2 = (this.ar() & 0xFF);
            }
            else if (nextInt < 8) {
                nextInt2 = (illIIlllIIIIlllIIlIl.ar() & 0xFF);
            }
            else {
                nextInt2 = this.IlIIllIIllIIllIIlIIl.nextInt(7);
            }
            final int nextInt3 = this.IlIIllIIllIIllIIlIIl.nextInt(5);
            int n2;
            if (nextInt3 < 2) {
                n2 = (nextInt2 | (this.ar() & 0xFF00));
            }
            else if (nextInt3 < 4) {
                n2 = (nextInt2 | (illIIlllIIIIlllIIlIl.ar() & 0xFF00));
            }
            else {
                n2 = (nextInt2 | (this.IlIIllIIllIIllIIlIIl.nextInt(5) << 8 & 0xFF00));
            }
            illIIlllIIIIlllIIlIl2.IlIlIIIIIIlllIlIllIl(n2);
        }
        illIIlllIIIIlllIIlIl2.lllIIIIlllllIlIIllIl(n);
        illIIlllIIIIlllIIlIl2.llllIIIIlIIIlIlllIll(net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIIIllllIlIlIlI.llllIIIIlIIIlIlllIll).llllIIIIlIIIlIlllIll((this.llllIIIIlIIIlIlllIll(net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIIIllllIlIlIlI.llllIIIIlIIIlIlllIll).IlIlIlIlIlllllllllIl() + liiiIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll(net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIIIllllIlIlIlI.llllIIIIlIIIlIlllIll).IlIlIlIlIlllllllllIl() + this.bf()) / 3.0);
        illIIlllIIIIlllIIlIl2.llllIIIIlIIIlIlllIll(IllIIlllIIIIlllIIlIl.A).llllIIIIlIIIlIlllIll((this.llllIIIIlIIIlIlllIll(IllIIlllIIIIlllIIlIl.A).IlIlIlIlIlllllllllIl() + liiiIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll(IllIIlllIIIIlllIIlIl.A).IlIlIlIlIlllllllllIl() + this.bg()) / 3.0);
        illIIlllIIIIlllIIlIl2.llllIIIIlIIIlIlllIll(net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIIIllllIlIlIlI.IlIIIlIlIIIllIlIlIIl).llllIIIIlIIIlIlllIll((this.llllIIIIlIIIlIlllIll(net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIIIllllIlIlIlI.IlIIIlIlIIIllIlIlIIl).IlIlIlIlIlllllllllIl() + liiiIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll(net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIIIllllIlIlIlI.IlIIIlIlIIIllIlIlIIl).IlIlIlIlIlllllllllIl() + this.bh()) / 3.0);
        return illIIlllIIIIlllIIlIl2;
    }
    
    @Override
    public net.minecraft.llllIIIlIlllIlIIIIIl.llIIIlIlIllIIlIlIlII llllIIIIlIIIlIlllIll(final net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIIIllIllIIIIIllI ilIlIIIllIllIIIIIllI, net.minecraft.llllIIIlIlllIlIIIIIl.llIIIlIlIllIIlIlIlII llllIIIIlIIIlIlllIll) {
        llllIIIIlIIIlIlllIll = super.llllIIIIlIIIlIlllIll(ilIlIIIllIllIIIIIllI, (net.minecraft.llllIIIlIlllIlIIIIIl.llIIIlIlIllIIlIlIlII)llllIIIIlIIIlIlllIll);
        int n = 0;
        int llllIIIIlIIIlIlllIll2;
        if (llllIIIIlIIIlIlllIll instanceof net.minecraft.llllIIIlIlllIlIIIIIl.IllIIlllIIIIlllIIlIl.lIIIIlIIIIIlllIllIII) {
            llllIIIIlIIIlIlllIll2 = ((net.minecraft.llllIIIlIlllIlIIIIIl.IllIIlllIIIIlllIIlIl.lIIIIlIIIIIlllIllIII)llllIIIIlIIIlIlllIll).llllIIIIlIIIlIlllIll;
            n = ((((net.minecraft.llllIIIlIlllIlIIIIIl.IllIIlllIIIIlllIIlIl.lIIIIlIIIIIlllIllIII)llllIIIIlIIIlIlllIll).IlIlIlIlIlllllllllIl & 0xFF) | this.IlIIllIIllIIllIIlIIl.nextInt(5) << 8);
        }
        else {
            if (this.IlIIllIIllIIllIIlIIl.nextInt(10) == 0) {
                llllIIIIlIIIlIlllIll2 = 1;
            }
            else {
                final int nextInt = this.IlIIllIIllIIllIIlIIl.nextInt(7);
                final int nextInt2 = this.IlIIllIIllIIllIIlIIl.nextInt(5);
                llllIIIIlIIIlIlllIll2 = 0;
                n = (nextInt | nextInt2 << 8);
            }
            llllIIIIlIIIlIlllIll = new net.minecraft.llllIIIlIlllIlIIIIIl.IllIIlllIIIIlllIIlIl.lIIIIlIIIIIlllIllIII(llllIIIIlIIIlIlllIll2, n);
        }
        this.lllIIIIlllllIlIIllIl(llllIIIIlIIIlIlllIll2);
        this.IlIlIIIIIIlllIlIllIl(n);
        if (this.IlIIllIIllIIllIIlIIl.nextInt(5) == 0) {
            this.IlIlIlIlIlllllllllIl(-24000);
        }
        if (llllIIIIlIIIlIlllIll2 != 4 && llllIIIIlIIIlIlllIll2 != 3) {
            this.llllIIIIlIIIlIlllIll(net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIIIllllIlIlIlI.llllIIIIlIIIlIlllIll).llllIIIIlIIIlIlllIll(this.bf());
            if (llllIIIIlIIIlIlllIll2 == 0) {
                this.llllIIIIlIIIlIlllIll(net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIIIllllIlIlIlI.IlIIIlIlIIIllIlIlIIl).llllIIIIlIIIlIlllIll(this.bh());
            }
            else {
                this.llllIIIIlIIIlIlllIll(net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIIIllllIlIlIlI.IlIIIlIlIIIllIlIlIIl).llllIIIIlIIIlIlllIll(0.17499999701976776);
            }
        }
        else {
            this.llllIIIIlIIIlIlllIll(net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIIIllllIlIlIlI.llllIIIIlIIIlIlllIll).llllIIIIlIIIlIlllIll(15.0);
            this.llllIIIIlIIIlIlllIll(net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIIIllllIlIlIlI.IlIIIlIlIIIllIlIlIIl).llllIIIIlIIIlIlllIll(0.20000000298023224);
        }
        if (llllIIIIlIIIlIlllIll2 != 2 && llllIIIIlIIIlIlllIll2 != 1) {
            this.llllIIIIlIIIlIlllIll(IllIIlllIIIIlllIIlIl.A).llllIIIIlIIIlIlllIll(this.bg());
        }
        else {
            this.llllIIIIlIIIlIlllIll(IllIIlllIIIIlllIIlIl.A).llllIIIIlIIIlIlllIll(0.5);
        }
        this.llIllIlIIIIllIlIIllI(this.U());
        return (net.minecraft.llllIIIlIlllIlIIIIIl.llIIIlIlIllIIlIlIlII)llllIIIIlIIIlIlllIll;
    }
    
    public float llllIIllllIlIlIIIIll(final float n) {
        return this.P + (this.O - this.P) * n;
    }
    
    public float IlIllIlIlIIIlIlIlIII(final float n) {
        return this.R + (this.Q - this.R) * n;
    }
    
    public float IIlllIIlIllIllIlIIll(final float n) {
        return this.T + (this.S - this.T) * n;
    }
    
    public void IlIlIIIlIIlIlIIlllIl(int n) {
        if (this.aI()) {
            if (n < 0) {
                n = 0;
            }
            else {
                this.N = true;
                this.be();
            }
            if (n >= 90) {
                this.y = 1.0f;
            }
            else {
                this.y = 0.4f + 0.4f * n / 90.0f;
            }
        }
    }
    
    protected void IIllIIllIIIlIlIIIIlI(final boolean b) {
        final net.minecraft.IlllllllIIIlIIIlIlII.IlIllllIIlIIlIlIlIll ilIllllIIlIIlIlIlIll = b ? net.minecraft.IlllllllIIIlIIIlIlII.IlIllllIIlIIlIlIlIll.IIIllllllIllIIIlllIl : net.minecraft.IlllllllIIIlIIIlIlII.IlIllllIIlIIlIlIlIll.lIlIlIIIllIIllIIIllI;
        for (int i = 0; i < 7; ++i) {
            this.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(ilIllllIIlIIlIlIlIll, this.IIlllIlIIllIlIlIlIIl + this.IlIIllIIllIIllIIlIIl.nextFloat() * this.IllIllIIIIlIIlIlllII * 2.0f - this.IllIllIIIIlIIlIlllII, this.llIIIlIlIllIIlIlIlII + 0.5 + this.IlIIllIIllIIllIIlIIl.nextFloat() * this.IlIllllIIlIIlIlIlIll, this.lllllIlIIIlIlIIlllII + this.IlIIllIIllIIllIIlIIl.nextFloat() * this.IllIllIIIIlIIlIlllII * 2.0f - this.IllIllIIIIlIIlIlllII, this.IlIIllIIllIIllIIlIIl.nextGaussian() * 0.02, this.IlIIllIIllIIllIIlIIl.nextGaussian() * 0.02, this.IlIIllIIllIIllIIlIIl.nextGaussian() * 0.02, new int[0]);
        }
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final byte b) {
        if (b == 7) {
            this.IIllIIllIIIlIlIIIIlI(true);
        }
        else if (b == 6) {
            this.IIllIIllIIIlIlIIIIlI(false);
        }
        else {
            super.llllIIIIlIIIlIlllIll(b);
        }
    }
    
    @Override
    public void IllIlIllIllIlllIIlll() {
        super.IllIlIllIllIlllIIlll();
        if (this.R > 0.0f) {
            final float llllIIIIlIIIlIlllIll = net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(this.lIllIlIIIllllllIIlII * 3.1415927f / 180.0f);
            final float ilIlIlIlIlllllllllIl = net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.IlIlIlIlIlllllllllIl(this.lIllIlIIIllllllIIlII * 3.1415927f / 180.0f);
            final float n = 0.7f * this.R;
            this.IIllIIllIIIlIlIIIIlI.IlIlIlIlIlllllllllIl(this.IIlllIlIIllIlIlIlIIl + n * llllIIIIlIIIlIlllIll, this.llIIIlIlIllIIlIlIlII + this.llIllIIlllllllllllll() + this.IIllIIllIIIlIlIIIIlI.IIllIIIlIIlIlIlIIIII() + 0.15f * this.R, this.lllllIlIIIlIlIIlllII - n * ilIlIlIlIlllllllllIl);
            if (this.IIllIIllIIIlIlIIIIlI instanceof lllIIIIlllllIlIIllIl) {
                ((lllIIIIlllllIlIIllIl)this.IIllIIllIIIlIlIIIIlI).lIllIlIIIllllllIIlII = this.lIllIlIIIllllllIIlII;
            }
        }
    }
    
    private float bf() {
        return 15.0f + this.IlIIllIIllIIllIIlIIl.nextInt(8) + this.IlIIllIIllIIllIIlIIl.nextInt(9);
    }
    
    private double bg() {
        return 0.4000000059604645 + this.IlIIllIIllIIllIIlIIl.nextDouble() * 0.2 + this.IlIIllIIllIIllIIlIIl.nextDouble() * 0.2 + this.IlIIllIIllIIllIIlIIl.nextDouble() * 0.2;
    }
    
    private double bh() {
        return (0.44999998807907104 + this.IlIIllIIllIIllIIlIIl.nextDouble() * 0.3 + this.IlIIllIIllIIllIIlIIl.nextDouble() * 0.3 + this.IlIIllIIllIIllIIlIIl.nextDouble() * 0.3) * 0.25;
    }
    
    public static boolean llllIIIIlIIIlIlllIll(final net.minecraft.llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl) {
        return ilIIIlIlIIIllIlIlIIl == net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.ao || ilIIIlIlIIIllIlIlIIl == net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.ap || ilIIIlIlIIIllIlIlIIl == net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.aq;
    }
    
    @Override
    public boolean f_() {
        return false;
    }
    
    @Override
    public float llllIlIllllIIlIIlIlI() {
        return this.IlIllllIIlIIlIlIlIll;
    }
    
    @Override
    public boolean IlIlIlIlIlllllllllIl(final int n, final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl) {
        if (n == 499 && this.aQ()) {
            if (lllIIIIlIlIllIIlIIIl == null && this.ay()) {
                this.llllIIllllIlIlIIIIll(false);
                this.aX();
                return true;
            }
            if (lllIIIIlIlIllIIlIIIl != null && lllIIIIlIlIllIIlIIIl.llllIIIIlIIIlIlllIll() == net.minecraft.llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lllllIIIIIlIlIIIIIIl) && !this.ay()) {
                this.llllIIllllIlIlIIIIll(true);
                this.aX();
                return true;
            }
        }
        final int n2 = n - 400;
        if (n2 >= 0 && n2 < 2 && n2 < this.L.lIIIlllIIIllIIIllIII()) {
            if (n2 == 0 && lllIIIIlIlIllIIlIIIl != null && lllIIIIlIlIllIIlIIIl.llllIIIIlIIIlIlllIll() != net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.IIllIIIlIIIIlIIlIIII) {
                return false;
            }
            if (n2 != 1 || ((lllIIIIlIlIllIIlIIIl == null || llllIIIIlIIIlIlllIll(lllIIIIlIlIllIIlIIIl.llllIIIIlIIIlIlllIll())) && this.aP())) {
                this.L.llIllIIIIIllIlIIIIlI(n2, lllIIIIlIlIllIIlIIIl);
                this.aY();
                return true;
            }
            return false;
        }
        else {
            final int n3 = n - 500 + 2;
            if (n3 >= 2 && n3 < this.L.lIIIlllIIIllIIIllIII()) {
                this.L.llIllIIIIIllIlIIIIlI(n3, lllIIIIlIlIllIIlIIIl);
                return true;
            }
            return false;
        }
    }
}
