package net.minecraft.client.lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll;

import java.util.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import com.google.common.collect.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.llIIlIIIlIIIllIlIIIl.*;

public class llllIIIIlIIIlIlllIll extends lIllllllIIllIlIlIlII implements IIIIlllIIIIIIlIIIlll
{
    private String llllIIIIlIIIlIlllIll;
    private Map IlIlIlIlIlllllllllIl;
    
    public llllIIIIlIIIlIlllIll(final String llllIIIIlIIIlIlllIll, final llIIIIIIlIllIIlIIIll llIIIIIIlIllIIlIIIll, final int n) {
        super(llIIIIIIlIllIIlIIIll, n);
        this.IlIlIlIlIlllllllllIl = Maps.newHashMap();
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
    }
    
    @Override
    public int llllIIIIlIIIlIlllIll(final int n) {
        return this.IlIlIlIlIlllllllllIl.containsKey(n) ? this.IlIlIlIlIlllllllllIl.get(n) : 0;
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final int n, final int n2) {
        this.IlIlIlIlIlllllllllIl.put(n, n2);
    }
    
    @Override
    public int IlIlIIIllIllIIIIIllI() {
        return this.IlIlIlIlIlllllllllIl.size();
    }
    
    @Override
    public boolean IllIIlllIIIIlllIIlIl() {
        return false;
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final IIlllIIlIllIllIlIIll illlIIlIllIllIlIIll) {
    }
    
    @Override
    public IIlllIIlIllIllIlIIll u_() {
        return IIlllIIlIllIllIlIIll.llllIIIIlIIIlIlllIll;
    }
    
    @Override
    public String IlIIIlIlIIIllIlIlIIl() {
        return this.llllIIIIlIIIlIlllIll;
    }
    
    @Override
    public IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll(final IllIIlllIIIIlllIIlIl illIIlllIIIIlllIIlIl, final net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        throw new UnsupportedOperationException();
    }
}
