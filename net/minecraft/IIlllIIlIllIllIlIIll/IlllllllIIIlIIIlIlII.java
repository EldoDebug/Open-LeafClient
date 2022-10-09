package net.minecraft.IIlllIIlIllIllIlIIll;

import net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIlIlllIlIIIIIl.*;
import java.util.*;

public class IlllllllIIIlIIIlIlII
{
    private llIllIIIIIllIlIIIIlI llllIIIIlIIIlIlllIll;
    
    public IlllllllIIIlIIIlIlII(final llIllIIIIIllIlIIIIlI llllIIIIlIIIlIlllIll) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
    }
    
    public IlllllllIIIlIIIlIlII llllIIIIlIIIlIlllIll(final llIllIIIIIllIlIIIIlI llllIIIIlIIIlIlllIll) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        return this;
    }
    
    public llIllIIIIIllIlIIIIlI llllIIIIlIIIlIlllIll() {
        return this.llllIIIIlIIIlIlllIll;
    }
    
    public void IlIlIlIlIlllllllllIl() {
        this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll();
    }
    
    public int llllIIIIlIIIlIlllIll(final int n) {
        return this.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(n);
    }
    
    public int llIllIIIIIllIlIIIIlI() {
        return this.llllIIIIlIIIlIlllIll.lIIIlllIIIllIIIllIII();
    }
    
    public boolean IlIIIlIlIIIllIlIlIIl() {
        return this.llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl();
    }
    
    public boolean IlIlIlIlIlllllllllIl(final int n) {
        return this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(n);
    }
    
    public IIlIIIIlllIlllllIlII llIllIIIIIllIlIIIIlI(final int n) {
        return new IIlIIIIlllIlllllIlII(this.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI(n));
    }
    
    public IlllllllIIIlIIIlIlII llllIIIIlIIIlIlllIll(final IIlIIIIlllIlllllIlII ilIIIIlllIlllllIlII) {
        return this.llllIIIIlIIIlIlllIll(this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(ilIIIIlllIlllllIlII.llllIIIIlIIIlIlllIll()));
    }
    
    public int IlIlIIIllIllIIIIIllI() {
        return this.llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI();
    }
    
    public List IllIIlllIIIIlllIIlIl() {
        final ArrayList<IIlIIIIlllIlllllIlII> list = new ArrayList<IIlIIIIlllIlllllIlII>();
        final Iterator<IlIIIlIlIIIllIlIlIIl> iterator = this.llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII().iterator();
        while (iterator.hasNext()) {
            list.add(new IIlIIIIlllIlllllIlII(iterator.next()));
        }
        return list;
    }
    
    public boolean llllIIIlIlllIlIIIIIl() {
        return this.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl();
    }
    
    public int lIIIIlIIIIIlllIllIII() {
        return this.llllIIIIlIIIlIlllIll.llllIIIlIlllIlIIIIIl();
    }
    
    public int IlIIIlIlIIIllIlIlIIl(final int n) {
        return this.llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl(n);
    }
    
    public int lIIIlllIIIllIIIllIII() {
        return this.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI();
    }
    
    public int llIIlIIIlIIIllIlIIIl() {
        return this.llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl();
    }
    
    @Override
    public boolean equals(final Object o) {
        return this.llllIIIIlIIIlIlllIll.equals(o);
    }
    
    @Override
    public int hashCode() {
        return this.llllIIIIlIIIlIlllIll.hashCode();
    }
    
    @Override
    public String toString() {
        return this.llllIIIIlIIIlIlllIll.toString();
    }
}
