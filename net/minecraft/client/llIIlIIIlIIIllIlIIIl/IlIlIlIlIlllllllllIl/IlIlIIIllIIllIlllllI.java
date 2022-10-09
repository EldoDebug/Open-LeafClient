package net.minecraft.client.llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl;

import com.google.common.collect.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;

class IlIlIIIllIIllIlllllI extends j implements Comparable
{
    protected final IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll;
    
    public IlIlIIIllIIllIlllllI(final IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll, final int n) {
        super(n);
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
    }
    
    public int llllIIIIlIIIlIlllIll(final IlIlIIIllIIllIlllllI ilIlIIIllIIllIlllllI) {
        return ComparisonChain.start().compare(ilIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI, this.llIllIIIIIllIlIIIIlI).compare(this.llllIIIIlIIIlIlllIll(), ilIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll()).result();
    }
    
    protected int llllIIIIlIIIlIlllIll() {
        int size = this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll().size();
        lllIllIIIllllllIllll[] values;
        for (int length = (values = lllIllIIIllllllIllll.values()).length, i = 0; i < length; ++i) {
            size += this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(values[i]).size();
        }
        return size;
    }
    
    @Override
    public String toString() {
        return "MyWeighedRandomItem{weight=" + this.llIllIIIIIllIlIIIIlI + ", model=" + this.llllIIIIlIIIlIlllIll + '}';
    }
}
