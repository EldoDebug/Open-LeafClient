package net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl;

import net.minecraft.lIlIlIIIllIIllIIIllI.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;
import java.util.*;
import net.minecraft.lIIIlllIIIllIIIllIII.*;
import net.minecraft.llIllIlIIIIllIlIIllI.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;

public class llllIIIIlIIIlIlllIll extends lllIIIIlllllIlIIllIl
{
    private static final lllIIIIlIlIllIIlIIIl llllIIIIlIIIlIlllIll;
    private static final lllIIIIlIlIllIIlIIIl IlIlIlIlIlllllllllIl;
    private static final lllIIIIlIlIllIIlIIIl llIllIIIIIllIlIIIIlI;
    private static final lllIIIIlIlIllIIlIIIl IlIIIlIlIIIllIlIlIIl;
    private static final lllIIIIlIlIllIIlIIIl IlIlIIIllIllIIIIIllI;
    private static final lllIIIIlIlIllIIlIIIl IllIIlllIIIIlllIIlIl;
    private final net.minecraft.llIllIlIIIIllIlIIllI.lllIIIIlIlIllIIlIIIl[] llllIIIlIlllIlIIIIIl;
    private boolean lIIIIlIIIIIlllIllIII;
    private long lIIIlllIIIllIIIllIII;
    private int llIIlIIIlIIIllIlIIIl;
    private boolean llIllIlIIIIllIlIIllI;
    private lllIIIIlIlIllIIlIIIl lIlIlIIIllIIllIIIllI;
    private lllIIIIlIlIllIIlIIIl IlIlIIIllIIllIlllllI;
    private lllIIIIlIlIllIIlIIIl t;
    private lllIIIIlIlIllIIlIIIl u;
    private lllIIIIlIlIllIIlIIIl v;
    private lllIIIIlIlIllIIlIIIl w;
    
    static {
        llllIIIIlIIIlIlllIll = new lllIIIIlIlIllIIlIIIl(0.0f, 0.0f, 0.0f);
        IlIlIlIlIlllllllllIl = new lllIIIIlIlIllIIlIIIl(0.0f, 0.0f, 0.0f);
        llIllIIIIIllIlIIIIlI = new lllIIIIlIlIllIIlIIIl(-10.0f, 0.0f, -10.0f);
        IlIIIlIlIIIllIlIlIIl = new lllIIIIlIlIllIIlIIIl(-15.0f, 0.0f, 10.0f);
        IlIlIIIllIllIIIIIllI = new lllIIIIlIlIllIIlIIIl(-1.0f, 0.0f, -1.0f);
        IllIIlllIIIIlllIIlIl = new lllIIIIlIlIllIIlIIIl(1.0f, 0.0f, 1.0f);
    }
    
    public llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII) {
        super(illlllllIIIlIIIlIlII);
        this.llllIIIlIlllIlIIIIIl = new net.minecraft.llIllIlIIIIllIlIIllI.lllIIIIlIlIllIIlIIIl[5];
        this.lIlIlIIIllIIllIIIllI = net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll;
        this.IlIlIIIllIIllIlllllI = net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl;
        this.t = net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI;
        this.u = net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl;
        this.v = net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI;
        this.w = net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl;
        this.IlIIIlIlIIIllIlIlIIl(true);
        this.lIIIIlIlIllllIIlIllI = this.lIlIlIIIllIIllIIIllI();
        this.llllIIIIlIIIlIlllIll(0.5f, 1.975f);
    }
    
    public llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final double n, final double n2, final double n3) {
        this(illlllllIIIlIIIlIlII);
        this.IlIlIlIlIlllllllllIl(n, n2, n3);
    }
    
    @Override
    public boolean llllllIllIllIlIllllI() {
        return super.llllllIllIllIlIllllI() && !this.lIlIlIIIllIIllIIIllI();
    }
    
    @Override
    protected void a_() {
        super.a_();
        this.IIlllIIlllIIIlIlllII.llllIIIIlIIIlIlllIll(10, (Object)0);
        this.IIlllIIlllIIIlIlllII.llllIIIIlIIIlIlllIll(11, net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll);
        this.IIlllIIlllIIIlIlllII.llllIIIIlIIIlIlllIll(12, net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl);
        this.IIlllIIlllIIIlIlllII.llllIIIIlIIIlIlllIll(13, net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI);
        this.IIlllIIlllIIIlIlllII.llllIIIIlIIIlIlllIll(14, net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl);
        this.IIlllIIlllIIIlIlllII.llllIIIIlIIIlIlllIll(15, net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI);
        this.IIlllIIlllIIIlIlllII.llllIIIIlIIIlIlllIll(16, net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl);
    }
    
    @Override
    public net.minecraft.llIllIlIIIIllIlIIllI.lllIIIIlIlIllIIlIIIl n() {
        return this.llllIIIlIlllIlIIIIIl[0];
    }
    
    @Override
    public net.minecraft.llIllIlIIIIllIlIIllI.lllIIIIlIlIllIIlIIIl llIllIIIIIllIlIIIIlI(final int n) {
        return this.llllIIIlIlllIlIIIIIl[n];
    }
    
    @Override
    public net.minecraft.llIllIlIIIIllIlIIllI.lllIIIIlIlIllIIlIIIl llIllIlIIIIllIlIIllI(final int n) {
        return this.llllIIIlIlllIlIIIIIl[n + 1];
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final int n, final net.minecraft.llIllIlIIIIllIlIIllI.lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl) {
        this.llllIIIlIlllIlIIIIIl[n] = lllIIIIlIlIllIIlIIIl;
    }
    
    @Override
    public net.minecraft.llIllIlIIIIllIlIIllI.lllIIIIlIlIllIIlIIIl[] IlIllllIIIlIllIlIIll() {
        return this.llllIIIlIlllIlIIIIIl;
    }
    
    @Override
    public boolean IlIlIlIlIlllllllllIl(final int n, final net.minecraft.llIllIlIIIIllIlIIllI.lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl) {
        int n2;
        if (n == 99) {
            n2 = 0;
        }
        else {
            n2 = n - 100 + 1;
            if (n2 < 0 || n2 >= this.llllIIIlIlllIlIIIIIl.length) {
                return false;
            }
        }
        if (lllIIIIlIlIllIIlIIIl != null && net.minecraft.llllIIIlIlllIlIIIIIl.IlIllIlIlIIIlIlIlIII.IlIlIlIlIlllllllllIl(lllIIIIlIlIllIIlIIIl) != n2 && (n2 != 4 || !(lllIIIIlIlIllIIlIIIl.llllIIIIlIIIlIlllIll() instanceof IIlllIIIlIlllIIlllII))) {
            return false;
        }
        this.llllIIIIlIIIlIlllIll(n2, lllIIIIlIlIllIIlIIIl);
        return true;
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll) {
        super.llllIIIIlIIIlIlllIll(iiiIlllIIIIIIlIIIlll);
        final IlIlIIIlIIlIlIIlllIl ilIlIIIlIIlIlIIlllIl = new IlIlIIIlIIlIlIIlllIl();
        for (int i = 0; i < this.llllIIIlIlllIlIIIIIl.length; ++i) {
            final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll2 = new IIIIlllIIIIIIlIIIlll();
            if (this.llllIIIlIlllIlIIIIIl[i] != null) {
                this.llllIIIlIlllIlIIIIIl[i].IlIlIlIlIlllllllllIl(iiiIlllIIIIIIlIIIlll2);
            }
            ilIlIIIlIIlIlIIlllIl.llllIIIIlIIIlIlllIll(iiiIlllIIIIIIlIIIlll2);
        }
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("Equipment", ilIlIIIlIIlIlIIlllIl);
        if (this.IlIllIIllIIlIIIIlIIl() && (this.lIllIlIIIllllllIIlII() == null || this.lIllIlIIIllllllIIlII().length() == 0)) {
            iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("CustomNameVisible", this.IlIllIIllIIlIIIIlIIl());
        }
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("Invisible", this.IIIIIIIllllIlIIIIIII());
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("Small", this.lIIIIlIIIIIlllIllIII());
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("ShowArms", this.llllIIllllIlIlIIIIll());
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("DisabledSlots", this.llIIlIIIlIIIllIlIIIl);
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("NoGravity", this.lIlIlIIIllIIllIIIllI());
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("NoBasePlate", this.IlIllIlIlIIIlIlIlIII());
        if (this.IIlllIIlIllIllIlIIll()) {
            iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("Marker", this.IIlllIIlIllIllIlIIll());
        }
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("Pose", this.lllllIlIIIlIlIIlllII());
    }
    
    @Override
    public void IlIlIlIlIlllllllllIl(final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll) {
        super.IlIlIlIlIlllllllllIl(iiiIlllIIIIIIlIIIlll);
        if (iiiIlllIIIIIIlIIIlll.IlIlIlIlIlllllllllIl("Equipment", 9)) {
            final IlIlIIIlIIlIlIIlllIl llIllIIIIIllIlIIIIlI = iiiIlllIIIIIIlIIIlll.llIllIIIIIllIlIIIIlI("Equipment", 10);
            for (int i = 0; i < this.llllIIIlIlllIlIIIIIl.length; ++i) {
                this.llllIIIlIlllIlIIIIIl[i] = net.minecraft.llIllIlIIIIllIlIIllI.lllIIIIlIlIllIIlIIIl.llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(i));
            }
        }
        this.IllIIlllIIIIlllIIlIl(iiiIlllIIIIIIlIIIlll.IIIIlllIIIIIIlIIIlll("Invisible"));
        this.IlIlIlIlIlllllllllIl(iiiIlllIIIIIIlIIIlll.IIIIlllIIIIIIlIIIlll("Small"));
        this.lIlIlIIIllIIllIIIllI(iiiIlllIIIIIIlIIIlll.IIIIlllIIIIIIlIIIlll("ShowArms"));
        this.llIIlIIIlIIIllIlIIIl = iiiIlllIIIIIIlIIIlll.IllIIlllIIIIlllIIlIl("DisabledSlots");
        this.llIIlIIIlIIIllIlIIIl(iiiIlllIIIIIIlIIIlll.IIIIlllIIIIIIlIIIlll("NoGravity"));
        this.IlIlIIIllIIllIlllllI(iiiIlllIIIIIIlIIIlll.IIIIlllIIIIIIlIIIlll("NoBasePlate"));
        this.IIIIlllIIIIIIlIIIlll(iiiIlllIIIIIIlIIIlll.IIIIlllIIIIIIlIIIlll("Marker"));
        this.llIllIlIIIIllIlIIllI = !this.IIlllIIlIllIllIlIIll();
        this.lIIIIlIlIllllIIlIllI = this.lIlIlIIIllIIllIIIllI();
        this.lIIIIlIIIIIlllIllIII(iiiIlllIIIIIIlIIIlll.IlIlIIIllIIllIlllllI("Pose"));
    }
    
    private void lIIIIlIIIIIlllIllIII(final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll) {
        final IlIlIIIlIIlIlIIlllIl llIllIIIIIllIlIIIIlI = iiiIlllIIIIIIlIIIlll.llIllIIIIIllIlIIIIlI("Head", 5);
        if (llIllIIIIIllIlIIIIlI.IlIlIIIllIllIIIIIllI() > 0) {
            this.llllIIIIlIIIlIlllIll(new lllIIIIlIlIllIIlIIIl(llIllIIIIIllIlIIIIlI));
        }
        else {
            this.llllIIIIlIIIlIlllIll(net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll);
        }
        final IlIlIIIlIIlIlIIlllIl llIllIIIIIllIlIIIIlI2 = iiiIlllIIIIIIlIIIlll.llIllIIIIIllIlIIIIlI("Body", 5);
        if (llIllIIIIIllIlIIIIlI2.IlIlIIIllIllIIIIIllI() > 0) {
            this.IlIlIlIlIlllllllllIl(new lllIIIIlIlIllIIlIIIl(llIllIIIIIllIlIIIIlI2));
        }
        else {
            this.IlIlIlIlIlllllllllIl(net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl);
        }
        final IlIlIIIlIIlIlIIlllIl llIllIIIIIllIlIIIIlI3 = iiiIlllIIIIIIlIIIlll.llIllIIIIIllIlIIIIlI("LeftArm", 5);
        if (llIllIIIIIllIlIIIIlI3.IlIlIIIllIllIIIIIllI() > 0) {
            this.llIllIIIIIllIlIIIIlI(new lllIIIIlIlIllIIlIIIl(llIllIIIIIllIlIIIIlI3));
        }
        else {
            this.llIllIIIIIllIlIIIIlI(net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI);
        }
        final IlIlIIIlIIlIlIIlllIl llIllIIIIIllIlIIIIlI4 = iiiIlllIIIIIIlIIIlll.llIllIIIIIllIlIIIIlI("RightArm", 5);
        if (llIllIIIIIllIlIIIIlI4.IlIlIIIllIllIIIIIllI() > 0) {
            this.IlIIIlIlIIIllIlIlIIl(new lllIIIIlIlIllIIlIIIl(llIllIIIIIllIlIIIIlI4));
        }
        else {
            this.IlIIIlIlIIIllIlIlIIl(net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl);
        }
        final IlIlIIIlIIlIlIIlllIl llIllIIIIIllIlIIIIlI5 = iiiIlllIIIIIIlIIIlll.llIllIIIIIllIlIIIIlI("LeftLeg", 5);
        if (llIllIIIIIllIlIIIIlI5.IlIlIIIllIllIIIIIllI() > 0) {
            this.IlIlIIIllIllIIIIIllI(new lllIIIIlIlIllIIlIIIl(llIllIIIIIllIlIIIIlI5));
        }
        else {
            this.IlIlIIIllIllIIIIIllI(net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI);
        }
        final IlIlIIIlIIlIlIIlllIl llIllIIIIIllIlIIIIlI6 = iiiIlllIIIIIIlIIIlll.llIllIIIIIllIlIIIIlI("RightLeg", 5);
        if (llIllIIIIIllIlIIIIlI6.IlIlIIIllIllIIIIIllI() > 0) {
            this.IllIIlllIIIIlllIIlIl(new lllIIIIlIlIllIIlIIIl(llIllIIIIIllIlIIIIlI6));
        }
        else {
            this.IllIIlllIIIIlllIIlIl(net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl);
        }
    }
    
    private IIIIlllIIIIIIlIIIlll lllllIlIIIlIlIIlllII() {
        final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll = new IIIIlllIIIIIIlIIIlll();
        if (!net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.equals(this.lIlIlIIIllIIllIIIllI)) {
            iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("Head", this.lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll());
        }
        if (!net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.equals(this.IlIlIIIllIIllIlllllI)) {
            iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("Body", this.IlIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll());
        }
        if (!net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.equals(this.t)) {
            iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("LeftArm", this.t.llllIIIIlIIIlIlllIll());
        }
        if (!net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl.equals(this.u)) {
            iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("RightArm", this.u.llllIIIIlIIIlIlllIll());
        }
        if (!net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI.equals(this.v)) {
            iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("LeftLeg", this.v.llllIIIIlIIIlIlllIll());
        }
        if (!net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl.equals(this.w)) {
            iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("RightLeg", this.w.llllIIIIlIIIlIlllIll());
        }
        return iiiIlllIIIIIIlIIIlll;
    }
    
    @Override
    public boolean g_() {
        return false;
    }
    
    @Override
    protected void IlIllIlIlIIIlIlIlIII(final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI) {
    }
    
    @Override
    protected void ai() {
        final List ilIlIlIlIlllllllllIl = this.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(this, this.IlIIlllIIlIlllllIIlI());
        if (ilIlIlIlIlllllllllIl != null && !ilIlIlIlIlllllllllIl.isEmpty()) {
            for (int i = 0; i < ilIlIlIlIlllllllllIl.size(); ++i) {
                final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI = ilIlIlIlIlllllllllIl.get(i);
                if (llIllIIIIIllIlIIIIlI instanceof llIllIlIIIIllIlIIllI && ((llIllIlIIIIllIlIIllI)llIllIIIIIllIlIIIIlI).llllIIIlIlllIlIIIIIl() == net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl.lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll && this.IlIlIIIllIllIIIIIllI(llIllIIIIIllIlIIIIlI) <= 0.2) {
                    llIllIIIIIllIlIIIIlI.IllIIlllIIIIlllIIlIl(this);
                }
            }
        }
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll(final net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final e e) {
        if (this.IIlllIIlIllIllIlIIll()) {
            return false;
        }
        if (this.IlllllllIIIlIIIlIlII.IlIlIllllllllIIIIlII || llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl()) {
            return true;
        }
        int n = 0;
        final net.minecraft.llIllIlIIIIllIlIIllI.lllIIIIlIlIllIIlIIIl p2 = llllIIIIlIIIlIlllIll.p();
        final boolean b = p2 != null;
        if (b && p2.llllIIIIlIIIlIlllIll() instanceof IIIlIIlIIIIlllIlllII) {
            final IIIlIIlIIIIlllIlllII iiIlIIlIIIIlllIlllII = (IIIlIIlIIIIlllIlllII)p2.llllIIIIlIIIlIlllIll();
            if (iiIlIIlIIIIlllIlllII.lIIIIlIIIIIlllIllIII == 3) {
                n = 1;
            }
            else if (iiIlIIlIIIIlllIlllII.lIIIIlIIIIIlllIllIII == 2) {
                n = 2;
            }
            else if (iiIlIIlIIIIlllIlllII.lIIIIlIIIIIlllIllIII == 1) {
                n = 3;
            }
            else if (iiIlIIlIIIIlllIlllII.lIIIIlIIIIIlllIllIII == 0) {
                n = 4;
            }
        }
        if (b && (p2.llllIIIIlIIIlIlllIll() == net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.ab || p2.llllIIIIlIIIlIlllIll() == net.minecraft.llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIIlllIIlIlllllIIlI))) {
            n = 4;
        }
        int n2 = 0;
        final boolean liiiIlIIIIIlllIllIII = this.lIIIIlIIIIIlllIllIII();
        final double n3 = liiiIlIIIIIlllIllIII ? (e.IlIlIlIlIlllllllllIl * 2.0) : e.IlIlIlIlIlllllllllIl;
        if (n3 >= 0.1 && n3 < 0.1 + (liiiIlIIIIIlllIllIII ? 0.8 : 0.45) && this.llllIIIlIlllIlIIIIIl[1] != null) {
            n2 = 1;
        }
        else if (n3 >= 0.9 + (liiiIlIIIIIlllIllIII ? 0.3 : 0.0) && n3 < 0.9 + (liiiIlIIIIIlllIllIII ? 1.0 : 0.7) && this.llllIIIlIlllIlIIIIIl[3] != null) {
            n2 = 3;
        }
        else if (n3 >= 0.4 && n3 < 0.4 + (liiiIlIIIIIlllIllIII ? 1.0 : 0.8) && this.llllIIIlIlllIlIIIIIl[2] != null) {
            n2 = 2;
        }
        else if (n3 >= 1.6 && this.llllIIIlIlllIlIIIIIl[4] != null) {
            n2 = 4;
        }
        final boolean b2 = this.llllIIIlIlllIlIIIIIl[n2] != null;
        if ((this.llIIlIIIlIIIllIlIIIl & 1 << n2) != 0x0 || (this.llIIlIIIlIIIllIlIIIl & 1 << n) != 0x0) {
            n2 = n;
            if ((this.llIIlIIIlIIIllIlIIIl & 1 << n) != 0x0) {
                if ((this.llIIlIIIlIIIllIlIIIl & 0x1) != 0x0) {
                    return true;
                }
                n2 = 0;
            }
        }
        if (b && n == 0 && !this.llllIIllllIlIlIIIIll()) {
            return true;
        }
        if (b) {
            this.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll, n);
        }
        else if (b2) {
            this.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll, n2);
        }
        return true;
    }
    
    private void llllIIIIlIIIlIlllIll(final net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final int n) {
        final net.minecraft.llIllIlIIIIllIlIIllI.lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl = this.llllIIIlIlllIlIIIIIl[n];
        if ((lllIIIIlIlIllIIlIIIl == null || (this.llIIlIIIlIIIllIlIIIl & 1 << n + 8) == 0x0) && (lllIIIIlIlIllIIlIIIl != null || (this.llIIlIIIlIIIllIlIIIl & 1 << n + 16) == 0x0)) {
            final int llIllIIIIIllIlIIIIlI = llllIIIIlIIIlIlllIll.lIlIlIIIllIIllIIIllI.llIllIIIIIllIlIIIIlI;
            final net.minecraft.llIllIlIIIIllIlIIllI.lllIIIIlIlIllIIlIIIl lIlIlIIIllIIllIIIllI = llllIIIIlIIIlIlllIll.lIlIlIIIllIIllIIIllI.lIlIlIIIllIIllIIIllI(llIllIIIIIllIlIIIIlI);
            if (llllIIIIlIIIlIlllIll.K.IlIIIlIlIIIllIlIlIIl && (lllIIIIlIlIllIIlIIIl == null || lllIIIIlIlIllIIlIIIl.llllIIIIlIIIlIlllIll() == net.minecraft.llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll)) && lIlIlIIIllIIllIIIllI != null) {
                final net.minecraft.llIllIlIIIIllIlIIllI.lllIIIIlIlIllIIlIIIl llIIlIIIlIIIllIlIIIl = lIlIlIIIllIIllIIIllI.llIIlIIIlIIIllIlIIIl();
                llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl = 1;
                this.llllIIIIlIIIlIlllIll(n, llIIlIIIlIIIllIlIIIl);
            }
            else if (lIlIlIIIllIIllIIIllI != null && lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl > 1) {
                if (lllIIIIlIlIllIIlIIIl == null) {
                    final net.minecraft.llIllIlIIIIllIlIIllI.lllIIIIlIlIllIIlIIIl llIIlIIIlIIIllIlIIIl2 = lIlIlIIIllIIllIIIllI.llIIlIIIlIIIllIlIIIl();
                    llIIlIIIlIIIllIlIIIl2.IlIlIlIlIlllllllllIl = 1;
                    this.llllIIIIlIIIlIlllIll(n, llIIlIIIlIIIllIlIIIl2);
                    final net.minecraft.llIllIlIIIIllIlIIllI.lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl2 = lIlIlIIIllIIllIIIllI;
                    --lllIIIIlIlIllIIlIIIl2.IlIlIlIlIlllllllllIl;
                }
            }
            else {
                this.llllIIIIlIIIlIlllIll(n, lIlIlIIIllIIllIIIllI);
                llllIIIIlIIIlIlllIll.lIlIlIIIllIIllIIIllI.llIllIIIIIllIlIIIIlI(llIllIIIIIllIlIIIIlI, lllIIIIlIlIllIIlIIIl);
            }
        }
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll(final lIllllllIIllIlIlIlII lIllllllIIllIlIlIlII, final float n) {
        if (this.IlllllllIIIlIIIlIlII.IlIlIllllllllIIIIlII) {
            return false;
        }
        if (lIllllllIIllIlIlIlII.llIIlIIIlIIIllIlIIIl.equals(lIllllllIIllIlIlIlII)) {
            this.IllIllIIIIlIIlIlllII();
            return false;
        }
        if (this.llllIIIIlIIIlIlllIll(lIllllllIIllIlIlIlII) || this.lIIIIlIIIIIlllIllIII || this.IIlllIIlIllIllIlIIll()) {
            return false;
        }
        if (lIllllllIIllIlIlIlII.llIllIIIIIllIlIIIIlI()) {
            this.IIlllIIIlIlllIIlllII();
            this.IllIllIIIIlIIlIlllII();
            return false;
        }
        if (lIllllllIIllIlIlIlII.llllIIIIlIIIlIlllIll.equals(lIllllllIIllIlIlIlII)) {
            if (!this.lIIIIIlIlIIIlIIIIlIl()) {
                this.IlIlIIIllIllIIIIIllI(5);
            }
            else {
                this.IlIIIlIlIIIllIlIlIIl(0.15f);
            }
            return false;
        }
        if (lIllllllIIllIlIlIlII.llIllIIIIIllIlIIIIlI.equals(lIllllllIIllIlIlIlII) && this.N() > 0.5f) {
            this.IlIIIlIlIIIllIlIlIIl(4.0f);
            return false;
        }
        final boolean equals = "arrow".equals(lIllllllIIllIlIlIlII.IlIllIlIlIIIlIlIlIII());
        if (!"player".equals(lIllllllIIllIlIlIlII.IlIllIlIlIIIlIlIlIII()) && !equals) {
            return false;
        }
        if (lIllllllIIllIlIlIlII.lIIIlllIIIllIIIllIII() instanceof net.minecraft.llllIIIlIlllIlIIIIIl.lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll) {
            lIllllllIIllIlIlIlII.lIIIlllIIIllIIIllIII().IllIllIIIIlIIlIlllII();
        }
        if (lIllllllIIllIlIlIlII.llIIlIIIlIIIllIlIIIl() instanceof net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll && !((net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll)lIllllllIIllIlIlIlII.llIIlIIIlIIIllIlIIIl()).K.IlIlIIIllIllIIIIIllI) {
            return false;
        }
        if (lIllllllIIllIlIlIlII.IIIlIIIlIlIIlllIIlll()) {
            this.lIllllllIIllIlIlIlII();
            this.IllIllIIIIlIIlIlllII();
            return false;
        }
        final long iiIlIIlIIIIlllIlllII = this.IlllllllIIIlIIIlIlII.IIIlIIlIIIIlllIlllII();
        if (iiIlIIlIIIIlllIlllII - this.lIIIlllIIIllIIIllIII > 5L && !equals) {
            this.lIIIlllIIIllIIIllIII = iiIlIIlIIIIlllIlllII;
        }
        else {
            this.llIIlllIIlllIIllIllI();
            this.lIllllllIIllIlIlIlII();
            this.IllIllIIIIlIIlIlllII();
        }
        return false;
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll(final double n) {
        double n2 = this.IlIIlllIIlIlllllIIlI().llllIIIIlIIIlIlllIll() * 4.0;
        if (Double.isNaN(n2) || n2 == 0.0) {
            n2 = 4.0;
        }
        final double n3 = n2 * 64.0;
        return n < n3 * n3;
    }
    
    private void lIllllllIIllIlIlIlII() {
        if (this.IlllllllIIIlIIIlIlII instanceof IIIllllllIllIIIlllIl) {
            ((IIIllllllIllIIIlllIl)this.IlllllllIIIlIIIlIlII).llllIIIIlIIIlIlllIll(net.minecraft.IlllllllIIIlIIIlIlII.IlIllllIIlIIlIlIlIll.IIllllIIIlIIIIIIllIl, this.IIlllIlIIllIlIlIlIIl, this.llIIIlIlIllIIlIlIlII + this.IlIllllIIlIIlIlIlIll / 1.5, this.lllllIlIIIlIlIIlllII, 10, this.IllIllIIIIlIIlIlllII / 4.0f, this.IlIllllIIlIIlIlIlIll / 4.0f, this.IllIllIIIIlIIlIlllII / 4.0f, 0.05, net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl.lllIllIIIllllllIllll()));
        }
    }
    
    private void IlIIIlIlIIIllIlIlIIl(final float n) {
        final float n2 = this.N() - n;
        if (n2 <= 0.5f) {
            this.IIlllIIIlIlllIIlllII();
            this.IllIllIIIIlIIlIlllII();
        }
        else {
            this.llIllIlIIIIllIlIIllI(n2);
        }
    }
    
    private void llIIlllIIlllIIllIllI() {
        net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(this.IlllllllIIIlIIIlIlII, new IlIlIlIlIlllllllllIl(this), new net.minecraft.llIllIlIIIIllIlIIllI.lllIIIIlIlIllIIlIIIl(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.an));
        this.IIlllIIIlIlllIIlllII();
    }
    
    private void IIlllIIIlIlllIIlllII() {
        for (int i = 0; i < this.llllIIIlIlllIlIIIIIl.length; ++i) {
            if (this.llllIIIlIlllIlIIIIIl[i] != null && this.llllIIIlIlllIlIIIIIl[i].IlIlIlIlIlllllllllIl > 0) {
                if (this.llllIIIlIlllIlIIIIIl[i] != null) {
                    net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(this.IlllllllIIIlIIIlIlII, new IlIlIlIlIlllllllllIl(this).llllIIIIlIIIlIlllIll(), this.llllIIIlIlllIlIIIIIl[i]);
                }
                this.llllIIIlIlllIlIIIIIl[i] = null;
            }
        }
    }
    
    @Override
    protected float llllIIIlIlllIlIIIIIl(final float n, final float n2) {
        this.IlIllIIllIIlIIIIlIIl = this.IIIllllllIllIIIlllIl;
        this.lIllIlIIIllllllIIlII = this.IIlIIIIIllIlIIIlIIll;
        return 0.0f;
    }
    
    @Override
    public float llllIlIllllIIlIIlIlI() {
        return this.e_() ? (this.IlIllllIIlIIlIlIlIll * 0.5f) : (this.IlIllllIIlIIlIlIlIll * 0.9f);
    }
    
    @Override
    public void IllIIlllIIIIlllIIlIl(final float n, final float n2) {
        if (!this.lIlIlIIIllIIllIIIllI()) {
            super.IllIIlllIIIIlllIIlIl(n, n2);
        }
    }
    
    @Override
    public void IIllIIllIIIlIlIIIIlI() {
        super.IIllIIllIIIlIlIIIIlI();
        final lllIIIIlIlIllIIlIIIl llllIIIlIlllIlIIIIIl = this.IIlllIIlllIIIlIlllII.llllIIIlIlllIlIIIIIl(11);
        if (!this.lIlIlIIIllIIllIIIllI.equals(llllIIIlIlllIlIIIIIl)) {
            this.llllIIIIlIIIlIlllIll(llllIIIlIlllIlIIIIIl);
        }
        final lllIIIIlIlIllIIlIIIl llllIIIlIlllIlIIIIIl2 = this.IIlllIIlllIIIlIlllII.llllIIIlIlllIlIIIIIl(12);
        if (!this.IlIlIIIllIIllIlllllI.equals(llllIIIlIlllIlIIIIIl2)) {
            this.IlIlIlIlIlllllllllIl(llllIIIlIlllIlIIIIIl2);
        }
        final lllIIIIlIlIllIIlIIIl llllIIIlIlllIlIIIIIl3 = this.IIlllIIlllIIIlIlllII.llllIIIlIlllIlIIIIIl(13);
        if (!this.t.equals(llllIIIlIlllIlIIIIIl3)) {
            this.llIllIIIIIllIlIIIIlI(llllIIIlIlllIlIIIIIl3);
        }
        final lllIIIIlIlIllIIlIIIl llllIIIlIlllIlIIIIIl4 = this.IIlllIIlllIIIlIlllII.llllIIIlIlllIlIIIIIl(14);
        if (!this.u.equals(llllIIIlIlllIlIIIIIl4)) {
            this.IlIIIlIlIIIllIlIlIIl(llllIIIlIlllIlIIIIIl4);
        }
        final lllIIIIlIlIllIIlIIIl llllIIIlIlllIlIIIIIl5 = this.IIlllIIlllIIIlIlllII.llllIIIlIlllIlIIIIIl(15);
        if (!this.v.equals(llllIIIlIlllIlIIIIIl5)) {
            this.IlIlIIIllIllIIIIIllI(llllIIIlIlllIlIIIIIl5);
        }
        final lllIIIIlIlIllIIlIIIl llllIIIlIlllIlIIIIIl6 = this.IIlllIIlllIIIlIlllII.llllIIIlIlllIlIIIIIl(16);
        if (!this.w.equals(llllIIIlIlllIlIIIIIl6)) {
            this.IllIIlllIIIIlllIIlIl(llllIIIlIlllIlIIIIIl6);
        }
        final boolean iIlllIIlIllIllIlIIll = this.IIlllIIlIllIllIlIIll();
        if (!this.llIllIlIIIIllIlIIllI && iIlllIIlIllIllIlIIll) {
            this.llllIIIIlIIIlIlllIll(false);
        }
        else {
            if (!this.llIllIlIIIIllIlIIllI || iIlllIIlIllIllIlIIll) {
                return;
            }
            this.llllIIIIlIIIlIlllIll(true);
        }
        this.llIllIlIIIIllIlIIllI = iIlllIIlIllIllIlIIll;
    }
    
    private void llllIIIIlIIIlIlllIll(final boolean b) {
        final double iIlllIlIIllIlIlIlIIl = this.IIlllIlIIllIlIlIlIIl;
        final double llIIIlIlIllIIlIlIlII = this.llIIIlIlIllIIlIlIlII;
        final double lllllIlIIIlIlIIlllII = this.lllllIlIIIlIlIIlllII;
        if (b) {
            this.llllIIIIlIIIlIlllIll(0.5f, 1.975f);
        }
        else {
            this.llllIIIIlIIIlIlllIll(0.0f, 0.0f);
        }
        this.IlIlIlIlIlllllllllIl(iIlllIlIIllIlIlIlIIl, llIIIlIlIllIIlIlIlII, lllllIlIIIlIlIIlllII);
    }
    
    @Override
    protected void I() {
        this.IllIIlllIIIIlllIIlIl(this.lIIIIlIIIIIlllIllIII);
    }
    
    @Override
    public void IllIIlllIIIIlllIIlIl(final boolean liiiIlIIIIIlllIllIII) {
        super.IllIIlllIIIIlllIIlIl(this.lIIIIlIIIIIlllIllIII = liiiIlIIIIIlllIllIII);
    }
    
    @Override
    public boolean e_() {
        return this.lIIIIlIIIIIlllIllIII();
    }
    
    @Override
    public void lllIllIIIllllllIllll() {
        this.IllIllIIIIlIIlIlllII();
    }
    
    @Override
    public boolean d() {
        return this.IIIIIIIllllIlIIIIIII();
    }
    
    private void IlIlIlIlIlllllllllIl(final boolean b) {
        final byte llllIIIIlIIIlIlllIll = this.IIlllIIlllIIIlIlllII.llllIIIIlIIIlIlllIll(10);
        byte b2;
        if (b) {
            b2 = (byte)(llllIIIIlIIIlIlllIll | 0x1);
        }
        else {
            b2 = (byte)(llllIIIIlIIIlIlllIll & 0xFFFFFFFE);
        }
        this.IIlllIIlllIIIlIlllII.IlIlIlIlIlllllllllIl(10, b2);
    }
    
    public boolean lIIIIlIIIIIlllIllIII() {
        return (this.IIlllIIlllIIIlIlllII.llllIIIIlIIIlIlllIll(10) & 0x1) != 0x0;
    }
    
    private void llIIlIIIlIIIllIlIIIl(final boolean b) {
        final byte llllIIIIlIIIlIlllIll = this.IIlllIIlllIIIlIlllII.llllIIIIlIIIlIlllIll(10);
        byte b2;
        if (b) {
            b2 = (byte)(llllIIIIlIIIlIlllIll | 0x2);
        }
        else {
            b2 = (byte)(llllIIIIlIIIlIlllIll & 0xFFFFFFFD);
        }
        this.IIlllIIlllIIIlIlllII.IlIlIlIlIlllllllllIl(10, b2);
    }
    
    public boolean lIlIlIIIllIIllIIIllI() {
        return (this.IIlllIIlllIIIlIlllII.llllIIIIlIIIlIlllIll(10) & 0x2) != 0x0;
    }
    
    private void lIlIlIIIllIIllIIIllI(final boolean b) {
        final byte llllIIIIlIIIlIlllIll = this.IIlllIIlllIIIlIlllII.llllIIIIlIIIlIlllIll(10);
        byte b2;
        if (b) {
            b2 = (byte)(llllIIIIlIIIlIlllIll | 0x4);
        }
        else {
            b2 = (byte)(llllIIIIlIIIlIlllIll & 0xFFFFFFFB);
        }
        this.IIlllIIlllIIIlIlllII.IlIlIlIlIlllllllllIl(10, b2);
    }
    
    public boolean llllIIllllIlIlIIIIll() {
        return (this.IIlllIIlllIIIlIlllII.llllIIIIlIIIlIlllIll(10) & 0x4) != 0x0;
    }
    
    private void IlIlIIIllIIllIlllllI(final boolean b) {
        final byte llllIIIIlIIIlIlllIll = this.IIlllIIlllIIIlIlllII.llllIIIIlIIIlIlllIll(10);
        byte b2;
        if (b) {
            b2 = (byte)(llllIIIIlIIIlIlllIll | 0x8);
        }
        else {
            b2 = (byte)(llllIIIIlIIIlIlllIll & 0xFFFFFFF7);
        }
        this.IIlllIIlllIIIlIlllII.IlIlIlIlIlllllllllIl(10, b2);
    }
    
    public boolean IlIllIlIlIIIlIlIlIII() {
        return (this.IIlllIIlllIIIlIlllII.llllIIIIlIIIlIlllIll(10) & 0x8) != 0x0;
    }
    
    private void IIIIlllIIIIIIlIIIlll(final boolean b) {
        final byte llllIIIIlIIIlIlllIll = this.IIlllIIlllIIIlIlllII.llllIIIIlIIIlIlllIll(10);
        byte b2;
        if (b) {
            b2 = (byte)(llllIIIIlIIIlIlllIll | 0x10);
        }
        else {
            b2 = (byte)(llllIIIIlIIIlIlllIll & 0xFFFFFFEF);
        }
        this.IIlllIIlllIIIlIlllII.IlIlIlIlIlllllllllIl(10, b2);
    }
    
    public boolean IIlllIIlIllIllIlIIll() {
        return (this.IIlllIIlllIIIlIlllII.llllIIIIlIIIlIlllIll(10) & 0x10) != 0x0;
    }
    
    public void llllIIIIlIIIlIlllIll(final lllIIIIlIlIllIIlIIIl lIlIlIIIllIIllIIIllI) {
        this.lIlIlIIIllIIllIIIllI = lIlIlIIIllIIllIIIllI;
        this.IIlllIIlllIIIlIlllII.IlIlIlIlIlllllllllIl(11, lIlIlIIIllIIllIIIllI);
    }
    
    public void IlIlIlIlIlllllllllIl(final lllIIIIlIlIllIIlIIIl ilIlIIIllIIllIlllllI) {
        this.IlIlIIIllIIllIlllllI = ilIlIIIllIIllIlllllI;
        this.IIlllIIlllIIIlIlllII.IlIlIlIlIlllllllllIl(12, ilIlIIIllIIllIlllllI);
    }
    
    public void llIllIIIIIllIlIIIIlI(final lllIIIIlIlIllIIlIIIl t) {
        this.t = t;
        this.IIlllIIlllIIIlIlllII.IlIlIlIlIlllllllllIl(13, t);
    }
    
    public void IlIIIlIlIIIllIlIlIIl(final lllIIIIlIlIllIIlIIIl u) {
        this.u = u;
        this.IIlllIIlllIIIlIlllII.IlIlIlIlIlllllllllIl(14, u);
    }
    
    public void IlIlIIIllIllIIIIIllI(final lllIIIIlIlIllIIlIIIl v) {
        this.v = v;
        this.IIlllIIlllIIIlIlllII.IlIlIlIlIlllllllllIl(15, v);
    }
    
    public void IllIIlllIIIIlllIIlIl(final lllIIIIlIlIllIIlIIIl w) {
        this.w = w;
        this.IIlllIIlllIIIlIlllII.IlIlIlIlIlllllllllIl(16, w);
    }
    
    public lllIIIIlIlIllIIlIIIl lllIIIIlllllIlIIllIl() {
        return this.lIlIlIIIllIIllIIIllI;
    }
    
    public lllIIIIlIlIllIIlIIIl IlIlIIIIIIlllIlIllIl() {
        return this.IlIlIIIllIIllIlllllI;
    }
    
    public lllIIIIlIlIllIIlIIIl IlllllllIIIlIIIlIlII() {
        return this.t;
    }
    
    public lllIIIIlIlIllIIlIIIl IIIlIIlIIIIlllIlllII() {
        return this.u;
    }
    
    public lllIIIIlIlIllIIlIIIl IIlllIlIIllIlIlIlIIl() {
        return this.v;
    }
    
    public lllIIIIlIlIllIIlIIIl llIIIlIlIllIIlIlIlII() {
        return this.w;
    }
    
    @Override
    public boolean IIlllIIlllIIIlIlllII() {
        return super.IIlllIIlllIIIlIlllII() && !this.IIlllIIlIllIllIlIIll();
    }
}
