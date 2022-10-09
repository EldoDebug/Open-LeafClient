package net.minecraft.IIlllIIlIllIllIlIIll;

import net.minecraft.IlllllllIIIlIIIlIlII.*;
import com.google.common.collect.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIlIlllIlIIIIIl.*;
import java.util.*;

public class llIllIIIIIllIlIIIIlI
{
    private net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI llllIIIIlIIIlIlllIll;
    
    public llIllIIIIIllIlIIIIlI(final net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI llllIIIIlIIIlIlllIll) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
    }
    
    public String llllIIIIlIIIlIlllIll() {
        return this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll();
    }
    
    public boolean llllIIIIlIIIlIlllIll(final String s) {
        return this.llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl(s);
    }
    
    public boolean llllIIIIlIIIlIlllIll(final String s, final lllllIIIIIlIlIIIIIIl lllllIIIIIlIlIIIIIIl) {
        return this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(s, lllllIIIIIlIlIIIIIIl);
    }
    
    public boolean IlIlIlIlIlllllllllIl(final String s) {
        return this.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(s);
    }
    
    public boolean llIllIIIIIllIlIIIIlI(final String s) {
        return this.llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl(s);
    }
    
    public boolean IlIIIlIlIIIllIlIlIIl(final String s) {
        return this.llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI(s);
    }
    
    public boolean IlIlIIIllIllIIIIIllI(final String s) {
        return this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(s);
    }
    
    public void llllIIIIlIIIlIlllIll(final String s, final String s2) {
        this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(s, s2);
    }
    
    public void IlIlIlIlIlllllllllIl() {
        this.llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl();
    }
    
    public List llIllIIIIIllIlIIIIlI() {
        final ArrayList arrayList = Lists.newArrayList();
        final Iterator<llIIlIIIlIIIllIlIIIl> iterator = this.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl().iterator();
        while (iterator.hasNext()) {
            arrayList.add(new lIlIlIIIllIIllIIIllI(iterator.next()));
        }
        return arrayList;
    }
}
