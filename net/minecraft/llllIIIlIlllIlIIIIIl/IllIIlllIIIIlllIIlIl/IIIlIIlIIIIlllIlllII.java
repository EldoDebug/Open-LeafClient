package net.minecraft.llllIIIlIlllIlIIIIIl.IllIIlllIIIIlllIIlIl;

import net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.lIlIlIIIllIIllIIIllI.*;
import net.minecraft.IlIlIIIIIIlllIlIllIl.IlIlIlIlIlllllllllIl.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import java.util.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;

public abstract class IIIlIIlIIIIlllIlllII extends IlIlIlIlIlllllllllIl implements lIllllllIIllIlIlIlII
{
    protected IllIllIlllIllllIIllI u;
    
    public IIIlIIlIIIIlllIlllII(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII) {
        super(illlllllIIIlIIIlIlII);
        this.u = new IllIllIlllIllllIIllI(this);
        this.ar();
    }
    
    @Override
    protected void a_() {
        super.a_();
        this.IIlllIIlllIIIlIlllII.llllIIIIlIIIlIlllIll(16, (Object)0);
        this.IIlllIIlllIIIlIlllII.llllIIIIlIIIlIlllIll(17, "");
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll) {
        super.llllIIIIlIIIlIlllIll(iiiIlllIIIIIIlIIIlll);
        if (this.IlIlIlIlIlllllllllIl() == null) {
            iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("OwnerUUID", "");
        }
        else {
            iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("OwnerUUID", this.IlIlIlIlIlllllllllIl());
        }
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("Sitting", this.at());
    }
    
    @Override
    public void IlIlIlIlIlllllllllIl(final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll) {
        super.IlIlIlIlIlllllllllIl(iiiIlllIIIIIIlIIIlll);
        String s;
        if (iiiIlllIIIIIIlIIIlll.IlIlIlIlIlllllllllIl("OwnerUUID", 8)) {
            s = iiiIlllIIIIIIlIIIlll.llIIlIIIlIIIllIlIIIl("OwnerUUID");
        }
        else {
            s = net.minecraft.IlIlIIIIIIlllIlIllIl.IlIlIlIlIlllllllllIl.IlIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll(iiiIlllIIIIIIlIIIlll.llIIlIIIlIIIllIlIIIl("Owner"));
        }
        if (s.length() > 0) {
            this.llllIIIIlIIIlIlllIll(s);
            this.lIlIlIIIllIIllIIIllI(true);
        }
        this.u.llllIIIIlIIIlIlllIll(iiiIlllIIIIIIlIIIlll.IIIIlllIIIIIIlIIIlll("Sitting"));
        this.IIIIlllIIIIIIlIIIlll(iiiIlllIIIIIIlIIIlll.IIIIlllIIIIIIlIIIlll("Sitting"));
    }
    
    protected void IlIlIIIllIIllIlllllI(final boolean b) {
        IlIllllIIlIIlIlIlIll ilIllllIIlIIlIlIlIll = net.minecraft.IlllllllIIIlIIIlIlII.IlIllllIIlIIlIlIlIll.IIIllllllIllIIIlllIl;
        if (!b) {
            ilIllllIIlIIlIlIlIll = net.minecraft.IlllllllIIIlIIIlIlII.IlIllllIIlIIlIlIlIll.lIlIlIIIllIIllIIIllI;
        }
        for (int i = 0; i < 7; ++i) {
            this.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(ilIllllIIlIIlIlIlIll, this.IIlllIlIIllIlIlIlIIl + this.IlIIllIIllIIllIIlIIl.nextFloat() * this.IllIllIIIIlIIlIlllII * 2.0f - this.IllIllIIIIlIIlIlllII, this.llIIIlIlIllIIlIlIlII + 0.5 + this.IlIIllIIllIIllIIlIIl.nextFloat() * this.IlIllllIIlIIlIlIlIll, this.lllllIlIIIlIlIIlllII + this.IlIIllIIllIIllIIlIIl.nextFloat() * this.IllIllIIIIlIIlIlllII * 2.0f - this.IllIllIIIIlIIlIlllII, this.IlIIllIIllIIllIIlIIl.nextGaussian() * 0.02, this.IlIIllIIllIIllIIlIIl.nextGaussian() * 0.02, this.IlIIllIIllIIllIIlIIl.nextGaussian() * 0.02, new int[0]);
        }
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final byte b) {
        if (b == 7) {
            this.IlIlIIIllIIllIlllllI(true);
        }
        else if (b == 6) {
            this.IlIlIIIllIIllIlllllI(false);
        }
        else {
            super.llllIIIIlIIIlIlllIll(b);
        }
    }
    
    public boolean as() {
        return (this.IIlllIIlllIIIlIlllII.llllIIIIlIIIlIlllIll(16) & 0x4) != 0x0;
    }
    
    public void lIlIlIIIllIIllIIIllI(final boolean b) {
        final byte llllIIIIlIIIlIlllIll = this.IIlllIIlllIIIlIlllII.llllIIIIlIIIlIlllIll(16);
        if (b) {
            this.IIlllIIlllIIIlIlllII.IlIlIlIlIlllllllllIl(16, (byte)(llllIIIIlIIIlIlllIll | 0x4));
        }
        else {
            this.IIlllIIlllIIIlIlllII.IlIlIlIlIlllllllllIl(16, (byte)(llllIIIIlIIIlIlllIll & 0xFFFFFFFB));
        }
        this.ar();
    }
    
    protected void ar() {
    }
    
    public boolean at() {
        return (this.IIlllIIlllIIIlIlllII.llllIIIIlIIIlIlllIll(16) & 0x1) != 0x0;
    }
    
    public void IIIIlllIIIIIIlIIIlll(final boolean b) {
        final byte llllIIIIlIIIlIlllIll = this.IIlllIIlllIIIlIlllII.llllIIIIlIIIlIlllIll(16);
        if (b) {
            this.IIlllIIlllIIIlIlllII.IlIlIlIlIlllllllllIl(16, (byte)(llllIIIIlIIIlIlllIll | 0x1));
        }
        else {
            this.IIlllIIlllIIIlIlllII.IlIlIlIlIlllllllllIl(16, (byte)(llllIIIIlIIIlIlllIll & 0xFFFFFFFE));
        }
    }
    
    @Override
    public String IlIlIlIlIlllllllllIl() {
        return this.IIlllIIlllIIIlIlllII.IlIlIIIllIllIIIIIllI(17);
    }
    
    public void llllIIIIlIIIlIlllIll(final String s) {
        this.IIlllIIlllIIIlIlllII.IlIlIlIlIlllllllllIl(17, s);
    }
    
    public lllIIIIlllllIlIIllIl au() {
        try {
            final UUID fromString = UUID.fromString(this.IlIlIlIlIlllllllllIl());
            return (fromString == null) ? null : this.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(fromString);
        }
        catch (IllegalArgumentException ex) {
            return null;
        }
    }
    
    public boolean IlIlIIIllIllIIIIIllI(final lllIIIIlllllIlIIllIl lllIIIIlllllIlIIllIl) {
        return lllIIIIlllllIlIIllIl == this.au();
    }
    
    public IllIllIlllIllllIIllI av() {
        return this.u;
    }
    
    public boolean llllIIIIlIIIlIlllIll(final lllIIIIlllllIlIIllIl lllIIIIlllllIlIIllIl, final lllIIIIlllllIlIIllIl lllIIIIlllllIlIIllIl2) {
        return true;
    }
    
    @Override
    public net.minecraft.lllIIIIlllllIlIIllIl.IlIlIIIllIIllIlllllI w() {
        if (this.as()) {
            final lllIIIIlllllIlIIllIl au = this.au();
            if (au != null) {
                return au.w();
            }
        }
        return super.w();
    }
    
    @Override
    public boolean IlIIIlIlIIIllIlIlIIl(final lllIIIIlllllIlIIllIl lllIIIIlllllIlIIllIl) {
        if (this.as()) {
            final lllIIIIlllllIlIIllIl au = this.au();
            if (lllIIIIlllllIlIIllIl == au) {
                return true;
            }
            if (au != null) {
                return au.IlIIIlIlIIIllIlIlIIl(lllIIIIlllllIlIIllIl);
            }
        }
        return super.IlIIIlIlIIIllIlIlIIl(lllIIIIlllllIlIIllIl);
    }
    
    @Override
    public void IlIlIlIlIlllllllllIl(final net.minecraft.IlllllllIIIlIIIlIlII.lIllllllIIllIlIlIlII lIllllllIIllIlIlIlII) {
        if (!this.IlllllllIIIlIIIlIlII.IlIlIllllllllIIIIlII && this.IlllllllIIIlIIIlIlII.llIIlllIIlllIIllIllI().IlIlIlIlIlllllllllIl("showDeathMessages") && this.w_() && this.au() instanceof IlIIIlIlIIIllIlIlIIl) {
            ((IlIIIlIlIIIllIlIlIIl)this.au()).llllIIIIlIIIlIlllIll(this.S().IlIlIlIlIlllllllllIl());
        }
        super.IlIlIlIlIlllllllllIl(lIllllllIIllIlIlIlII);
    }
}
