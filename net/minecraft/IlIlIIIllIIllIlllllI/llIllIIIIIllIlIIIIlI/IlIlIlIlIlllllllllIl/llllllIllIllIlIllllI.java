package net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl;

import com.google.common.collect.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.*;
import java.util.*;
import net.minecraft.IlIlIIIllIIllIlllllI.*;

public class llllllIllIllIlIllllI implements IIlIIIIIllIlIIIlIIll
{
    private int llllIIIIlIIIlIlllIll;
    private final List IlIlIlIlIlllllllllIl;
    
    public llllllIllIllIlIllllI() {
        this.IlIlIlIlIlllllllllIl = Lists.newArrayList();
    }
    
    public llllllIllIllIlIllllI(final int llllIIIIlIIIlIlllIll, final Collection collection) {
        this.IlIlIlIlIlllllllllIl = Lists.newArrayList();
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        for (final IlIlIIIllIllIIIIIllI ilIlIIIllIllIIIIIllI : collection) {
            this.IlIlIlIlIlllllllllIl.add(new IIIllllllIllIIIlllIl(this, ilIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll().llllIIIIlIIIlIlllIll(), ilIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl(), ilIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI()));
        }
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final net.minecraft.IlIlIIIllIIllIlllllI.llllllIllIllIlIllllI llllllIllIllIlIllllI) {
        this.llllIIIIlIIIlIlllIll = llllllIllIllIlIllllI.IlIIIlIlIIIllIlIlIIl();
        for (int int1 = llllllIllIllIlIllllI.readInt(), i = 0; i < int1; ++i) {
            final String llIllIIIIIllIlIIIIlI = llllllIllIllIlIllllI.llIllIIIIIllIlIIIIlI(64);
            final double double1 = llllllIllIllIlIllllI.readDouble();
            final ArrayList arrayList = Lists.newArrayList();
            for (int ilIIIlIlIIIllIlIlIIl = llllllIllIllIlIllllI.IlIIIlIlIIIllIlIlIIl(), j = 0; j < ilIIIlIlIIIllIlIlIIl; ++j) {
                arrayList.add(new llllIIIIlIIIlIlllIll(llllllIllIllIlIllllI.IllIIlllIIIIlllIIlIl(), "Unknown synced attribute modifier", llllllIllIllIlIllllI.readDouble(), llllllIllIllIlIllllI.readByte()));
            }
            this.IlIlIlIlIlllllllllIl.add(new IIIllllllIllIIIlllIl(this, llIllIIIIIllIlIIIIlI, double1, arrayList));
        }
    }
    
    @Override
    public void IlIlIlIlIlllllllllIl(final net.minecraft.IlIlIIIllIIllIlllllI.llllllIllIllIlIllllI llllllIllIllIlIllllI) {
        llllllIllIllIlIllllI.IlIlIlIlIlllllllllIl(this.llllIIIIlIIIlIlllIll);
        llllllIllIllIlIllllI.writeInt(this.IlIlIlIlIlllllllllIl.size());
        for (final IIIllllllIllIIIlllIl iiIllllllIllIIIlllIl : this.IlIlIlIlIlllllllllIl) {
            llllllIllIllIlIllllI.llllIIIIlIIIlIlllIll(iiIllllllIllIIIlllIl.llllIIIIlIIIlIlllIll());
            llllllIllIllIlIllllI.writeDouble(iiIllllllIllIIIlllIl.IlIlIlIlIlllllllllIl());
            llllllIllIllIlIllllI.IlIlIlIlIlllllllllIl(iiIllllllIllIIIlllIl.llIllIIIIIllIlIIIIlI().size());
            for (final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll : iiIllllllIllIIIlllIl.llIllIIIIIllIlIIIIlI()) {
                llllllIllIllIlIllllI.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll());
                llllllIllIllIlIllllI.writeDouble(llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl());
                llllllIllIllIlIllllI.writeByte(llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI());
            }
        }
    }
    
    public void llllIIIIlIIIlIlllIll(final net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(this);
    }
    
    public int llllIIIIlIIIlIlllIll() {
        return this.llllIIIIlIIIlIlllIll;
    }
    
    public List IlIlIlIlIlllllllllIl() {
        return this.IlIlIlIlIlllllllllIl;
    }
}
