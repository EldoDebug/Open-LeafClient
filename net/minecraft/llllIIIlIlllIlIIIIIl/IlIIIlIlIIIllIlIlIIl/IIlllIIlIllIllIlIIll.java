package net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl;

import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.IlIlIIIlIIlIlIIlllIl.*;
import java.util.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.llIllIlIIIIllIlIIllI.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.llIIlIIIlIIIllIlIIIl.*;

public class IIlllIIlIllIllIlIIll extends IIIIlllIIIIIIlIIIlll implements llllIIIIlIIIlIlllIll
{
    private boolean llllIIIIlIIIlIlllIll;
    private int IlIlIlIlIlllllllllIl;
    private IlIlIlIlIlllllllllIl llIllIIIIIllIlIIIIlI;
    
    public IIlllIIlIllIllIlIIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII) {
        super(illlllllIIIlIIIlIlII);
        this.llllIIIIlIIIlIlllIll = true;
        this.IlIlIlIlIlllllllllIl = -1;
        this.llIllIIIIIllIlIIIIlI = net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll;
    }
    
    public IIlllIIlIllIllIlIIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final double n, final double n2, final double n3) {
        super(illlllllIIIlIIIlIlII, n, n2, n3);
        this.llllIIIIlIIIlIlllIll = true;
        this.IlIlIlIlIlllllllllIl = -1;
        this.llIllIIIIIllIlIIIIlI = net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll;
    }
    
    @Override
    public lIlIlIIIllIIllIIIllI llllIIIlIlllIlIIIIIl() {
        return net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl.lIlIlIIIllIIllIIIllI.IllIIlllIIIIlllIIlIl;
    }
    
    @Override
    public llIIlIIIlIIIllIlIIIl lIIIIlIIIIIlllIllIII() {
        return net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.at.lllIllIIIllllllIllll();
    }
    
    @Override
    public int IIlIIIIlllIlllllIlII() {
        return 1;
    }
    
    @Override
    public int lIIIlllIIIllIIIllIII() {
        return 5;
    }
    
    @Override
    public boolean a_(final net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        if (!this.IlllllllIIIlIIIlIlII.IlIlIllllllllIIIIlII) {
            llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll((llIIIlIlIllIIlIlIlII)this);
        }
        return true;
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final int n, final int n2, final int n3, final boolean b) {
        final boolean b2 = !b;
        if (b2 != this.llIIlllIIlllIIllIllI()) {
            this.IlIlIlIlIlllllllllIl(b2);
        }
    }
    
    public boolean llIIlllIIlllIIllIllI() {
        return this.llllIIIIlIIIlIlllIll;
    }
    
    public void IlIlIlIlIlllllllllIl(final boolean llllIIIIlIIIlIlllIll) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
    }
    
    @Override
    public IlllllllIIIlIIIlIlII IIlllIIIlIlllIIlllII() {
        return this.IlllllllIIIlIIIlIlII;
    }
    
    @Override
    public double IIlIIIIIllIlIIIlIIll() {
        return this.IIlllIlIIllIlIlIlIIl;
    }
    
    @Override
    public double llllllIllIllIlIllllI() {
        return this.llIIIlIlIllIIlIlIlII + 0.5;
    }
    
    @Override
    public double IIIllllllIllIIIlllIl() {
        return this.lllllIlIIIlIlIIlllII;
    }
    
    @Override
    public void IIllIIllIIIlIlIIIIlI() {
        super.IIllIIllIIIlIlIIIIlI();
        if (!this.IlllllllIIIlIIIlIlII.IlIlIllllllllIIIIlII && this.llllIllllIllllIlIlII() && this.llIIlllIIlllIIllIllI()) {
            if (new IlIlIlIlIlllllllllIl(this).equals(this.llIllIIIIIllIlIIIIlI)) {
                --this.IlIlIlIlIlllllllllIl;
            }
            else {
                this.IIIIlllIIIIIIlIIIlll(0);
            }
            if (!this.IIIIIIIIIlllIllIlIlI()) {
                this.IIIIlllIIIIIIlIIIlll(0);
                if (this.IlIIIlIIIllllIlIlIlI()) {
                    this.IIIIlllIIIIIIlIIIlll(4);
                    this.llIIIlIlIllIIlIlIlII();
                }
            }
        }
    }
    
    public boolean IlIIIlIIIllllIlIlIlI() {
        if (net.minecraft.IlIlIIIlIIlIlIIlllIl.IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll(this)) {
            return true;
        }
        final List llllIIIIlIIIlIlllIll = this.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(lIIIlllIIIllIIIllIII.class, this.IlIIlllIIlIlllllIIlI().IlIlIlIlIlllllllllIl(0.25, 0.0, 0.25), net.minecraft.IlllllllIIIlIIIlIlII.llllllIllIllIlIllllI.llllIIIIlIIIlIlllIll);
        if (llllIIIIlIIIlIlllIll.size() > 0) {
            net.minecraft.IlIlIIIlIIlIlIIlllIl.IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll(this, llllIIIIlIIIlIlllIll.get(0));
        }
        return false;
    }
    
    @Override
    public void IlIlIlIlIlllllllllIl(final lIllllllIIllIlIlIlII lIllllllIIllIlIlIlII) {
        super.IlIlIlIlIlllllllllIl(lIllllllIIllIlIlIlII);
        if (this.IlllllllIIIlIIIlIlII.llIIlllIIlllIIllIllI().IlIlIlIlIlllllllllIl("doEntityDrops")) {
            this.llllIIIIlIIIlIlllIll(net.minecraft.llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.at), 1, 0.0f);
        }
    }
    
    @Override
    protected void llllIIIIlIIIlIlllIll(final net.minecraft.lIlIlIIIllIIllIIIllI.IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll) {
        super.llllIIIIlIIIlIlllIll(iiiIlllIIIIIIlIIIlll);
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("TransferCooldown", this.IlIlIlIlIlllllllllIl);
    }
    
    @Override
    protected void IlIlIlIlIlllllllllIl(final net.minecraft.lIlIlIIIllIIllIIIllI.IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll) {
        super.IlIlIlIlIlllllllllIl(iiiIlllIIIIIIlIIIlll);
        this.IlIlIlIlIlllllllllIl = iiiIlllIIIIIIlIIIlll.IllIIlllIIIIlllIIlIl("TransferCooldown");
    }
    
    public void IIIIlllIIIIIIlIIIlll(final int ilIlIlIlIlllllllllIl) {
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
    }
    
    public boolean IIIIIIIIIlllIllIlIlI() {
        return this.IlIlIlIlIlllllllllIl > 0;
    }
    
    @Override
    public String IlIIIlIlIIIllIlIlIIl() {
        return "minecraft:hopper";
    }
    
    @Override
    public net.minecraft.llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll(final IllIIlllIIIIlllIIlIl illIIlllIIIIlllIIlIl, final net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        return new llllIIllllIlIlIIIIll(illIIlllIIIIlllIIlIl, this, llllIIIIlIIIlIlllIll);
    }
}
