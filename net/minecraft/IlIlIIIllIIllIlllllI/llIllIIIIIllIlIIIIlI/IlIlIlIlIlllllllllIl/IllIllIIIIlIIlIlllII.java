package net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl;

import com.google.common.collect.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import java.util.*;
import net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.*;
import net.minecraft.IlIlIIIllIIllIlllllI.*;

public class IllIllIIIIlIIlIlllII implements IIlIIIIIllIlIIIlIIll
{
    private double llllIIIIlIIIlIlllIll;
    private double IlIlIlIlIlllllllllIl;
    private double llIllIIIIIllIlIIIIlI;
    private float IlIIIlIlIIIllIlIlIIl;
    private List IlIlIIIllIllIIIIIllI;
    private float IllIIlllIIIIlllIIlIl;
    private float llllIIIlIlllIlIIIIIl;
    private float lIIIIlIIIIIlllIllIII;
    
    public IllIllIIIIlIIlIlllII() {
    }
    
    public IllIllIIIIlIIlIlllII(final double llllIIIIlIIIlIlllIll, final double ilIlIlIlIlllllllllIl, final double llIllIIIIIllIlIIIIlI, final float ilIIIlIlIIIllIlIlIIl, final List list, final e e) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
        this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
        this.IlIIIlIlIIIllIlIlIIl = ilIIIlIlIIIllIlIlIIl;
        this.IlIlIIIllIllIIIIIllI = Lists.newArrayList((Iterable)list);
        if (e != null) {
            this.IllIIlllIIIIlllIIlIl = (float)e.llllIIIIlIIIlIlllIll;
            this.llllIIIlIlllIlIIIIIl = (float)e.IlIlIlIlIlllllllllIl;
            this.lIIIIlIIIIIlllIllIII = (float)e.llIllIIIIIllIlIIIIlI;
        }
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final llllllIllIllIlIllllI llllllIllIllIlIllllI) {
        this.llllIIIIlIIIlIlllIll = llllllIllIllIlIllllI.readFloat();
        this.IlIlIlIlIlllllllllIl = llllllIllIllIlIllllI.readFloat();
        this.llIllIIIIIllIlIIIIlI = llllllIllIllIlIllllI.readFloat();
        this.IlIIIlIlIIIllIlIlIIl = llllllIllIllIlIllllI.readFloat();
        final int int1 = llllllIllIllIlIllllI.readInt();
        this.IlIlIIIllIllIIIIIllI = Lists.newArrayListWithCapacity(int1);
        final int n = (int)this.llllIIIIlIIIlIlllIll;
        final int n2 = (int)this.IlIlIlIlIlllllllllIl;
        final int n3 = (int)this.llIllIIIIIllIlIIIIlI;
        for (int i = 0; i < int1; ++i) {
            this.IlIlIIIllIllIIIIIllI.add(new IlIlIlIlIlllllllllIl(llllllIllIllIlIllllI.readByte() + n, llllllIllIllIlIllllI.readByte() + n2, llllllIllIllIlIllllI.readByte() + n3));
        }
        this.IllIIlllIIIIlllIIlIl = llllllIllIllIlIllllI.readFloat();
        this.llllIIIlIlllIlIIIIIl = llllllIllIllIlIllllI.readFloat();
        this.lIIIIlIIIIIlllIllIII = llllllIllIllIlIllllI.readFloat();
    }
    
    @Override
    public void IlIlIlIlIlllllllllIl(final llllllIllIllIlIllllI llllllIllIllIlIllllI) {
        llllllIllIllIlIllllI.writeFloat((float)this.llllIIIIlIIIlIlllIll);
        llllllIllIllIlIllllI.writeFloat((float)this.IlIlIlIlIlllllllllIl);
        llllllIllIllIlIllllI.writeFloat((float)this.llIllIIIIIllIlIIIIlI);
        llllllIllIllIlIllllI.writeFloat(this.IlIIIlIlIIIllIlIlIIl);
        llllllIllIllIlIllllI.writeInt(this.IlIlIIIllIllIIIIIllI.size());
        final int n = (int)this.llllIIIIlIIIlIlllIll;
        final int n2 = (int)this.IlIlIlIlIlllllllllIl;
        final int n3 = (int)this.llIllIIIIIllIlIIIIlI;
        for (final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl : this.IlIlIIIllIllIIIIIllI) {
            final int n4 = ilIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII() - n;
            final int n5 = ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII() - n2;
            final int n6 = ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl() - n3;
            llllllIllIllIlIllllI.writeByte(n4);
            llllllIllIllIlIllllI.writeByte(n5);
            llllllIllIllIlIllllI.writeByte(n6);
        }
        llllllIllIllIlIllllI.writeFloat(this.IllIIlllIIIIlllIIlIl);
        llllllIllIllIlIllllI.writeFloat(this.llllIIIlIlllIlIIIIIl);
        llllllIllIllIlIllllI.writeFloat(this.lIIIIlIIIIIlllIllIII);
    }
    
    public void llllIIIIlIIIlIlllIll(final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(this);
    }
    
    public float llllIIIIlIIIlIlllIll() {
        return this.IllIIlllIIIIlllIIlIl;
    }
    
    public float IlIlIlIlIlllllllllIl() {
        return this.llllIIIlIlllIlIIIIIl;
    }
    
    public float llIllIIIIIllIlIIIIlI() {
        return this.lIIIIlIIIIIlllIllIII;
    }
    
    public double IlIIIlIlIIIllIlIlIIl() {
        return this.llllIIIIlIIIlIlllIll;
    }
    
    public double IlIlIIIllIllIIIIIllI() {
        return this.IlIlIlIlIlllllllllIl;
    }
    
    public double IllIIlllIIIIlllIIlIl() {
        return this.llIllIIIIIllIlIIIIlI;
    }
    
    public float llllIIIlIlllIlIIIIIl() {
        return this.IlIIIlIlIIIllIlIlIIl;
    }
    
    public List lIIIIlIIIIIlllIllIII() {
        return this.IlIlIIIllIllIIIIIllI;
    }
}
