package net.optifine.IlIlIIIllIllIIIIIllI;

import net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.*;
import java.util.*;
import net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.*;

public class llIllIIIIIllIlIIIIlI
{
    private List llllIIIIlIIIlIlllIll;
    private List IlIlIlIlIlllllllllIl;
    private List llIllIIIIIllIlIIIIlI;
    
    public llIllIIIIIllIlIIIIlI() {
        this.llllIIIIlIIIlIlllIll = new ArrayList();
        this.IlIlIlIlIlllllllllIl = new ArrayList();
        this.llIllIIIIIllIlIIIIlI = Arrays.asList(new llllIIIIlIIIlIlllIll[1]);
    }
    
    public void llllIIIIlIIIlIlllIll(final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl) {
        if (llllIIIIlIIIlIlllIll != null) {
            this.llllIIIIlIIIlIlllIll.add(llllIIIIlIIIlIlllIll);
            this.IlIlIlIlIlllllllllIl.add(llIIlIIIlIIIllIlIIIl);
        }
    }
    
    public int llllIIIIlIIIlIlllIll() {
        return this.llllIIIIlIIIlIlllIll.size();
    }
    
    public llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll(final int n) {
        return this.llllIIIIlIIIlIlllIll.get(n);
    }
    
    public llIIlIIIlIIIllIlIIIl IlIlIlIlIlllllllllIl(final int n) {
        return (n >= 0 && n < this.IlIlIlIlIlllllllllIl.size()) ? this.IlIlIlIlIlllllllllIl.get(n) : net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.lllIllIIIllllllIllll();
    }
    
    public List llllIIIIlIIIlIlllIll(final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        this.llIllIIIIIllIlIIIIlI.set(0, llllIIIIlIIIlIlllIll);
        return this.llIllIIIIIllIlIIIIlI;
    }
    
    public void IlIlIlIlIlllllllllIl() {
        this.llllIIIIlIIIlIlllIll.clear();
        this.IlIlIlIlIlllllllllIl.clear();
    }
}
