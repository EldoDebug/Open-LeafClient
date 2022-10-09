package net.optifine.shaders.IlIlIlIlIlllllllllIl;

import net.optifine.shaders.*;
import net.optifine.util.*;
import net.minecraft.IIllIIllIIIlIlIIIIlI.*;
import net.minecraft.client.llIIlIIIlIIIllIlIIIl.*;
import net.minecraft.client.llIllIIIIIllIlIIIIlI.*;
import java.util.*;
import net.optifine.*;
import net.minecraft.client.*;

class llllIIIlIlllIlIIIIIl extends lllIIIIlIlIllIIlIIIl
{
    private ArrayList IlIlIlIlIlllllllllIl;
    private int IlllllllIIIlIIIlIlII;
    private long IIlIIIIlllIlllllIlII;
    final IlIlIIIllIllIIIIIllI llllIIIIlIIIlIlllIll;
    
    public llllIIIlIlllIlIIIIIl(final IlIlIIIllIllIIIIIllI llllIIIIlIIIlIlllIll, final int n, final int n2, final int n3, final int n4, final int n5) {
        super(llllIIIIlIIIlIlllIll.llllIIIlIlllIlIIIIIl(), n, n2, n3, n4, n5);
        this.IIlIIIIlllIlllllIlII = 0L;
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.IlIIIlIlIIIllIlIlIIl();
        this.IlIllIlIlIIIlIlIlIII = 0.0f;
        final int n6 = this.IlllllllIIIlIIIlIlII * n5;
        final int n7 = (n4 - n3) / 2;
        if (n6 > n7) {
            this.llllIIIlIlllIlIIIIIl(n6 - n7);
        }
    }
    
    @Override
    public int m_() {
        return this.IlIIIlIlIIIllIlIlIIl - 20;
    }
    
    public void IlIIIlIlIIIllIlIlIIl() {
        this.IlIlIlIlIlllllllllIl = llIIlllIIlllIIllIllI.llllIIIlIlllIlIIIIIl();
        this.IlllllllIIIlIIIlIlII = 0;
        for (int i = 0; i < this.IlIlIlIlIlllllllllIl.size(); ++i) {
            if (((String)this.IlIlIlIlIlllllllllIl.get(i)).equals(llIIlllIIlllIIllIllI.cv)) {
                this.IlllllllIIIlIIIlIlII = i;
                break;
            }
        }
    }
    
    @Override
    protected int llllIIIIlIIIlIlllIll() {
        return this.IlIlIlIlIlllllllllIl.size();
    }
    
    @Override
    protected void llllIIIIlIIIlIlllIll(final int n, final boolean b, final int n2, final int n3) {
        if ((n != this.IlllllllIIIlIIIlIlII || this.lllIIIIlllllIlIIllIl != this.IIlIIIIlllIlllllIlII) && this.llllIIIIlIIIlIlllIll(llIIlllIIlllIIllIllI.IlIlIlIlIlllllllllIl(this.IlIlIlIlIlllllllllIl.get(n)), n)) {
            this.IlIlIlIlIlllllllllIl(n);
        }
    }
    
    private void IlIlIlIlIlllllllllIl(final int illlllllIIIlIIIlIlII) {
        this.IlllllllIIIlIIIlIlII = illlllllIIIlIIIlIlII;
        this.IIlIIIIlllIlllllIlII = this.lllIIIIlllllIlIIllIl;
        llIIlllIIlllIIllIllI.llllIIIIlIIIlIlllIll(this.IlIlIlIlIlllllllllIl.get(illlllllIIIlIIIlIlII));
        llIIlllIIlllIIllIllI.IlllllllIIIlIIIlIlII();
        this.llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI();
    }
    
    private boolean llllIIIIlIIIlIlllIll(final lIlIlIIIllIIllIIIllI lIlIlIIIllIIllIIIllI, final int n) {
        if (lIlIlIIIllIIllIIIllI == null) {
            return true;
        }
        final Properties llllIIIIlIIIlIlllIll = IIlIIIIIllIlIIIlIIll.llllIIIIlIIIlIlllIll(lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll("/shaders/shaders.properties"), "Shaders");
        if (llllIIIIlIIIlIlllIll == null) {
            return true;
        }
        final String property = llllIIIIlIIIlIlllIll.getProperty("version.1.8.9");
        if (property == null) {
            return true;
        }
        final String trim = property.trim();
        if (net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl("M5", trim) >= 0) {
            return true;
        }
        this.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(new b(new lIIIIlIIIIIlllIllIII(this, n), net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("of.message.shaders.nv1", ("HD_U_" + trim).replace('_', ' ')), net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("of.message.shaders.nv2", new Object[0]), 0));
        return false;
    }
    
    @Override
    protected boolean llllIIIIlIIIlIlllIll(final int n) {
        return n == this.IlllllllIIIlIIIlIlII;
    }
    
    @Override
    protected int llllIIIlIlllIlIIIIIl() {
        return this.IlIIIlIlIIIllIlIlIIl - 6;
    }
    
    @Override
    protected int IllIIlllIIIIlllIIlIl() {
        return this.llllIIIIlIIIlIlllIll() * 18;
    }
    
    @Override
    protected void IlIlIlIlIlllllllllIl() {
    }
    
    @Override
    protected void llllIIIIlIIIlIlllIll(final int n, final int n2, final int n3, final int n4, final int n5, final int n6) {
        String s = this.IlIlIlIlIlllllllllIl.get(n);
        if (s.equals("OFF")) {
            s = IlIIlIlIIIlIIlIlIlII.llllIIIIlIIIlIlllIll("of.options.shaders.packNone");
        }
        else if (s.equals("(internal)")) {
            s = IlIIlIlIIIlIIlIlIlII.llllIIIIlIIIlIlllIll("of.options.shaders.packDefault");
        }
        this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(s, this.IlIIIlIlIIIllIlIlIIl / 2, n3 + 1, 14737632);
    }
    
    public int IlIlIIIllIllIIIIIllI() {
        return this.IlllllllIIIlIIIlIlII;
    }
}
