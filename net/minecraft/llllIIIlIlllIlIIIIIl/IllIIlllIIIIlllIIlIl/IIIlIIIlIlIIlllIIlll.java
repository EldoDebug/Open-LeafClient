package net.minecraft.llllIIIlIlllIlIIIIIl.IllIIlllIIIIlllIIlIl;

import net.minecraft.llIIlIIIlIIIllIlIIIl.*;
import com.google.common.collect.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.IIIIlllIIIIIIlIIIlll.*;
import net.minecraft.lIIIlllIIIllIIIllIII.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll.*;
import net.minecraft.llIllIlIIIIllIlIIllI.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl.*;
import net.minecraft.lIlIlIIIllIIllIIIllI.*;
import java.util.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;

public class IIIlIIIlIlIIlllIIlll extends IlIlIlIlIlllllllllIl
{
    private final IIlllIIIlIlllIIlllII u;
    private static final Map v;
    private int w;
    private lIlIlIIIllIIllIIIllI x;
    
    static {
        (v = Maps.newEnumMap((Class)net.minecraft.llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl.class)).put(net.minecraft.llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll, new float[] { 1.0f, 1.0f, 1.0f });
        IIIlIIIlIlIIlllIIlll.v.put(net.minecraft.llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl, new float[] { 0.85f, 0.5f, 0.2f });
        IIIlIIIlIlIIlllIIlll.v.put(net.minecraft.llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI, new float[] { 0.7f, 0.3f, 0.85f });
        IIIlIIIlIlIIlllIIlll.v.put(net.minecraft.llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl.IlIIIlIlIIIllIlIlIIl, new float[] { 0.4f, 0.6f, 0.85f });
        IIIlIIIlIlIIlllIIlll.v.put(net.minecraft.llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl.IlIlIIIllIllIIIIIllI, new float[] { 0.9f, 0.9f, 0.2f });
        IIIlIIIlIlIIlllIIlll.v.put(net.minecraft.llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl.IllIIlllIIIIlllIIlIl, new float[] { 0.5f, 0.8f, 0.1f });
        IIIlIIIlIlIIlllIIlll.v.put(net.minecraft.llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl.llllIIIlIlllIlIIIIIl, new float[] { 0.95f, 0.5f, 0.65f });
        IIIlIIIlIlIIlllIIlll.v.put(net.minecraft.llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII, new float[] { 0.3f, 0.3f, 0.3f });
        IIIlIIIlIlIIlllIIlll.v.put(net.minecraft.llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII, new float[] { 0.6f, 0.6f, 0.6f });
        IIIlIIIlIlIIlllIIlll.v.put(net.minecraft.llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl, new float[] { 0.3f, 0.5f, 0.6f });
        IIIlIIIlIlIIlllIIlll.v.put(net.minecraft.llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl.llIllIlIIIIllIlIIllI, new float[] { 0.5f, 0.25f, 0.7f });
        IIIlIIIlIlIIlllIIlll.v.put(net.minecraft.llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl.lIlIlIIIllIIllIIIllI, new float[] { 0.2f, 0.3f, 0.7f });
        IIIlIIIlIlIIlllIIlll.v.put(net.minecraft.llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl.IlIlIIIllIIllIlllllI, new float[] { 0.4f, 0.3f, 0.2f });
        IIIlIIIlIlIIlllIIlll.v.put(net.minecraft.llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl.IIIIlllIIIIIIlIIIlll, new float[] { 0.4f, 0.5f, 0.2f });
        IIIlIIIlIlIIlllIIlll.v.put(net.minecraft.llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl.llllIIllllIlIlIIIIll, new float[] { 0.6f, 0.2f, 0.2f });
        IIIlIIIlIlIIlllIIlll.v.put(net.minecraft.llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl.IlIllIlIlIIIlIlIlIII, new float[] { 0.1f, 0.1f, 0.1f });
    }
    
    public static float[] llllIIIIlIIIlIlllIll(final net.minecraft.llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        return IIIlIIIlIlIIlllIIlll.v.get(ilIlIlIlIlllllllllIl);
    }
    
    public IIIlIIIlIlIIlllIIlll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII) {
        super(illlllllIIIlIIIlIlII);
        this.u = new IIlllIIIlIlllIIlllII(new IlIlIIIlIIlIlIIlllIl(this), 2, 1);
        this.x = new lIlIlIIIllIIllIIIllI(this);
        this.llllIIIIlIIIlIlllIll(0.9f, 1.3f);
        ((IllIIlllIIIIlllIIlIl)this.lIllllllIIllIlIlIlII()).llllIIIIlIIIlIlllIll(true);
        this.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll(0, new llIlIIIIIlIIlIlIIlll(this));
        this.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll(1, new lllIllIIIllllllIllll(this, 1.25));
        this.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll(2, new IIlllIlIIllIlIlIlIIl(this, 1.0));
        this.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll(3, new lIlIlIlllIIlIlIlllIl(this, 1.1, net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.lllIllIIIllllllIllll, false));
        this.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll(4, new net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll.IIllIIllIIIlIlIIIIlI(this, 1.1));
        this.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll(5, this.x);
        this.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll(6, new IlIIllIIllIIllIIlIIl(this, 1.0));
        this.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll(7, new lllllIIIIIlIlIIIIIIl(this, llllIIIIlIIIlIlllIll.class, 6.0f));
        this.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll(8, new IlIlIllllllllIIIIlII(this));
        this.u.llIllIIIIIllIlIIIIlI(0, new lllIIIIlIlIllIIlIIIl(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.a, 1, 0));
        this.u.llIllIIIIIllIlIIIIlI(1, new lllIIIIlIlIllIIlIIIl(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.a, 1, 0));
    }
    
    @Override
    protected void i() {
        this.w = this.x.lIIIIlIIIIIlllIllIII();
        super.i();
    }
    
    @Override
    public void IIIlIIIlIlIIlllIIlll() {
        if (this.IlllllllIIIlIIIlIlII.IlIlIllllllllIIIIlII) {
            this.w = Math.max(0, this.w - 1);
        }
        super.IIIlIIIlIlIIlllIIlll();
    }
    
    @Override
    protected void IlIlIllllllllIIIIlII() {
        super.IlIlIllllllllIIIIlII();
        this.llllIIIIlIIIlIlllIll(net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIIIllllIlIlIlI.llllIIIIlIIIlIlllIll).llllIIIIlIIIlIlllIll(8.0);
        this.llllIIIIlIIIlIlllIll(net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIIIllllIlIlIlI.IlIIIlIlIIIllIlIlIIl).llllIIIIlIIIlIlllIll(0.23000000417232513);
    }
    
    @Override
    protected void a_() {
        super.a_();
        this.IIlllIIlllIIIlIlllII.llllIIIIlIIIlIlllIll(16, new Byte((byte)0));
    }
    
    @Override
    protected void llllIIIIlIIIlIlllIll(final boolean b, final int n) {
        if (!this.ar()) {
            this.llllIIIIlIIIlIlllIll(new lllIIIIlIlIllIIlIIIl(net.minecraft.llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIIIIIIIIlllIllIlIlI), 1, this.aq().IlIlIlIlIlllllllllIl()), 0.0f);
        }
        for (int n2 = this.IlIIllIIllIIllIIlIIl.nextInt(2) + 1 + this.IlIIllIIllIIllIIlIIl.nextInt(1 + n), i = 0; i < n2; ++i) {
            if (this.lIIIIIlIlIIIlIIIIlIl()) {
                this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.r, 1);
            }
            else {
                this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.q, 1);
            }
        }
    }
    
    @Override
    protected IlIIIlIlIIIllIlIlIIl f() {
        return net.minecraft.llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIIIIIIIIlllIllIlIlI);
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final byte b) {
        if (b == 10) {
            this.w = 40;
        }
        else {
            super.llllIIIIlIIIlIlllIll(b);
        }
    }
    
    public float llllIIllllIlIlIIIIll(final float n) {
        return (this.w <= 0) ? 0.0f : ((this.w >= 4 && this.w <= 36) ? 1.0f : ((this.w < 4) ? ((this.w - n) / 4.0f) : (-(this.w - 40 - n) / 4.0f)));
    }
    
    public float IlIllIlIlIIIlIlIlIII(final float n) {
        if (this.w > 4 && this.w <= 36) {
            return 0.62831855f + 0.2199115f * net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.llllIIIIlIIIlIlllIll((this.w - 4 - n) / 32.0f * 28.7f);
        }
        return (this.w > 0) ? 0.62831855f : (this.llllllIllIllIlIllllI / 57.295776f);
    }
    
    @Override
    public boolean IlIIIlIlIIIllIlIlIIl(final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        final lllIIIIlIlIllIIlIIIl ilIIIlIlIIIllIlIlIIl = llllIIIIlIIIlIlllIll.lIlIlIIIllIIllIIIllI.IlIIIlIlIIIllIlIlIIl();
        if (ilIIIlIlIIIllIlIlIIl != null && ilIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll() == net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.i && !this.ar() && !this.e_()) {
            if (!this.IlllllllIIIlIIIlIlII.IlIlIllllllllIIIIlII) {
                this.lIlIlIIIllIIllIIIllI(true);
                for (int n = 1 + this.IlIIllIIllIIllIIlIIl.nextInt(3), i = 0; i < n; ++i) {
                    final lIIIlllIIIllIIIllIII llllIIIIlIIIlIlllIll2;
                    final lIIIlllIIIllIIIllIII liiIlllIIIllIIIllIII = llllIIIIlIIIlIlllIll2 = this.llllIIIIlIIIlIlllIll(new lllIIIIlIlIllIIlIIIl(net.minecraft.llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIIIIIIIIlllIllIlIlI), 1, this.aq().IlIlIlIlIlllllllllIl()), 1.0f);
                    llllIIIIlIIIlIlllIll2.llIIlllIIlllIIllIllI += this.IlIIllIIllIIllIIlIIl.nextFloat() * 0.05f;
                    final lIIIlllIIIllIIIllIII liiIlllIIIllIIIllIII2 = liiIlllIIIllIIIllIII;
                    liiIlllIIIllIIIllIII2.lIllllllIIllIlIlIlII += (this.IlIIllIIllIIllIIlIIl.nextFloat() - this.IlIIllIIllIIllIIlIIl.nextFloat()) * 0.1f;
                    final lIIIlllIIIllIIIllIII liiIlllIIIllIIIllIII3 = liiIlllIIIllIIIllIII;
                    liiIlllIIIllIIIllIII3.IIlllIIIlIlllIIlllII += (this.IlIIllIIllIIllIIlIIl.nextFloat() - this.IlIIllIIllIIllIIlIIl.nextFloat()) * 0.1f;
                }
            }
            ilIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(1, llllIIIIlIIIlIlllIll);
            this.llllIIIIlIIIlIlllIll("mob.sheep.shear", 1.0f, 1.0f);
        }
        return super.IlIIIlIlIIIllIlIlIIl(llllIIIIlIIIlIlllIll);
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll) {
        super.llllIIIIlIIIlIlllIll(iiiIlllIIIIIIlIIIlll);
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("Sheared", this.ar());
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("Color", (byte)this.aq().IlIlIlIlIlllllllllIl());
    }
    
    @Override
    public void IlIlIlIlIlllllllllIl(final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll) {
        super.IlIlIlIlIlllllllllIl(iiiIlllIIIIIIlIIIlll);
        this.lIlIlIIIllIIllIIIllI(iiiIlllIIIIIIlIIIlll.IIIIlllIIIIIIlIIIlll("Sheared"));
        this.IlIlIlIlIlllllllllIl(net.minecraft.llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl(iiiIlllIIIIIIlIIIlll.IlIIIlIlIIIllIlIlIIl("Color")));
    }
    
    @Override
    protected String e() {
        return "mob.sheep.say";
    }
    
    @Override
    protected String O() {
        return "mob.sheep.say";
    }
    
    @Override
    protected String P() {
        return "mob.sheep.say";
    }
    
    @Override
    protected void llllIIIIlIIIlIlllIll(final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        this.llllIIIIlIIIlIlllIll("mob.sheep.step", 0.15f, 1.0f);
    }
    
    public net.minecraft.llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl aq() {
        return net.minecraft.llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl(this.IIlllIIlllIIIlIlllII.llllIIIIlIIIlIlllIll(16) & 0xF);
    }
    
    public void IlIlIlIlIlllllllllIl(final net.minecraft.llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        this.IIlllIIlllIIIlIlllII.IlIlIlIlIlllllllllIl(16, (byte)((this.IIlllIIlllIIIlIlllII.llllIIIIlIIIlIlllIll(16) & 0xF0) | (ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl() & 0xF)));
    }
    
    public boolean ar() {
        return (this.IIlllIIlllIIIlIlllII.llllIIIIlIIIlIlllIll(16) & 0x10) != 0x0;
    }
    
    public void lIlIlIIIllIIllIIIllI(final boolean b) {
        final byte llllIIIIlIIIlIlllIll = this.IIlllIIlllIIIlIlllII.llllIIIIlIIIlIlllIll(16);
        if (b) {
            this.IIlllIIlllIIIlIlllII.IlIlIlIlIlllllllllIl(16, (byte)(llllIIIIlIIIlIlllIll | 0x10));
        }
        else {
            this.IIlllIIlllIIIlIlllII.IlIlIlIlIlllllllllIl(16, (byte)(llllIIIIlIIIlIlllIll & 0xFFFFFFEF));
        }
    }
    
    public static net.minecraft.llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll(final Random random) {
        final int nextInt = random.nextInt(100);
        return (nextInt < 5) ? net.minecraft.llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl.IlIllIlIlIIIlIlIlIII : ((nextInt < 10) ? net.minecraft.llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII : ((nextInt < 15) ? net.minecraft.llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII : ((nextInt < 18) ? net.minecraft.llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl.IlIlIIIllIIllIlllllI : ((random.nextInt(500) == 0) ? net.minecraft.llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl.llllIIIlIlllIlIIIIIl : net.minecraft.llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll))));
    }
    
    public IIIlIIIlIlIIlllIIlll IlIlIlIlIlllllllllIl(final lIIIIlIIIIIlllIllIII liiiIlIIIIIlllIllIII) {
        final IIIlIIIlIlIIlllIIlll iiIlIIIlIlIIlllIIlll = (IIIlIIIlIlIIlllIIlll)liiiIlIIIIIlllIllIII;
        final IIIlIIIlIlIIlllIIlll iiIlIIIlIlIIlllIIlll2 = new IIIlIIIlIlIIlllIIlll(this.IlllllllIIIlIIIlIlII);
        iiIlIIIlIlIIlllIIlll2.IlIlIlIlIlllllllllIl(this.llllIIIIlIIIlIlllIll(this, iiIlIIIlIlIIlllIIlll));
        return iiIlIIIlIlIIlllIIlll2;
    }
    
    @Override
    public void IIlIIIIIllIlIIIlIIll() {
        this.lIlIlIIIllIIllIIIllI(false);
        if (this.e_()) {
            this.llllIIIIlIIIlIlllIll(60);
        }
    }
    
    @Override
    public llIIIlIlIllIIlIlIlII llllIIIIlIIIlIlllIll(final net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIIIllIllIIIIIllI ilIlIIIllIllIIIIIllI, llIIIlIlIllIIlIlIlII llllIIIIlIIIlIlllIll) {
        llllIIIIlIIIlIlllIll = super.llllIIIIlIIIlIlllIll(ilIlIIIllIllIIIIIllI, llllIIIIlIIIlIlllIll);
        this.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll(this.IlllllllIIIlIIIlIlII.llllIIllllIlIlIIIIll));
        return llllIIIIlIIIlIlllIll;
    }
    
    private net.minecraft.llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll(final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl2) {
        final int llIllIIIIIllIlIIIIlI = ((IIIlIIIlIlIIlllIIlll)ilIlIlIlIlllllllllIl).aq().llIllIIIIIllIlIIIIlI();
        final int llIllIIIIIllIlIIIIlI2 = ((IIIlIIIlIlIIlllIIlll)ilIlIlIlIlllllllllIl2).aq().llIllIIIIIllIlIIIIlI();
        this.u.lIlIlIIIllIIllIIIllI(0).IlIlIlIlIlllllllllIl(llIllIIIIIllIlIIIIlI);
        this.u.lIlIlIIIllIIllIIIllI(1).IlIlIlIlIlllllllllIl(llIllIIIIIllIlIIIIlI2);
        final lllIIIIlIlIllIIlIIIl llllIIIIlIIIlIlllIll = net.minecraft.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll().llllIIIIlIIIlIlllIll(this.u, ((IIIlIIIlIlIIlllIIlll)ilIlIlIlIlllllllllIl).IlllllllIIIlIIIlIlII);
        int liiiIlIIIIIlllIllIII;
        if (llllIIIIlIIIlIlllIll != null && llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll() == net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.a) {
            liiiIlIIIIIlllIllIII = llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII();
        }
        else {
            liiiIlIIIIIlllIllIII = (this.IlllllllIIIlIIIlIlII.llllIIllllIlIlIIIIll.nextBoolean() ? llIllIIIIIllIlIIIIlI : llIllIIIIIllIlIIIIlI2);
        }
        return net.minecraft.llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(liiiIlIIIIIlllIllIII);
    }
    
    @Override
    public float llllIlIllllIIlIIlIlI() {
        return 0.95f * this.IlIllllIIlIIlIlIlIll;
    }
}
