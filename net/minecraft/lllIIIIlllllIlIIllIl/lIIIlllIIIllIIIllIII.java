package net.minecraft.lllIIIIlllllIlIIllIl;

import net.minecraft.IlllllllIIIlIIIlIlII.*;
import com.google.common.collect.*;
import java.util.*;

public class lIIIlllIIIllIIIllIII extends IlIlIIIllIIllIlllllI
{
    private final llIIlIIIlIIIllIlIIIl llllIIIIlIIIlIlllIll;
    private final String IlIlIlIlIlllllllllIl;
    private final Set llIllIIIIIllIlIIIIlI;
    private String IlIIIlIlIIIllIlIlIIl;
    private String IlIlIIIllIllIIIIIllI;
    private String IllIIlllIIIIlllIIlIl;
    private boolean llllIIIlIlllIlIIIIIl;
    private boolean lIIIIlIIIIIlllIllIII;
    private IIIIlllIIIIIIlIIIlll lIIIlllIIIllIIIllIII;
    private IIIIlllIIIIIIlIIIlll llIIlIIIlIIIllIlIIIl;
    private IlllIIIIlIIIlIlIlIIl llIllIlIIIIllIlIIllI;
    
    public lIIIlllIIIllIIIllIII(final llIIlIIIlIIIllIlIIIl llllIIIIlIIIlIlllIll, final String s) {
        this.llIllIIIIIllIlIIIIlI = Sets.newHashSet();
        this.IlIlIIIllIllIIIIIllI = "";
        this.IllIIlllIIIIlllIIlIl = "";
        this.llllIIIlIlllIlIIIIIl = true;
        this.lIIIIlIIIIIlllIllIII = true;
        this.lIIIlllIIIllIIIllIII = IIIIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll;
        this.llIIlIIIlIIIllIlIIIl = IIIIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll;
        this.llIllIlIIIIllIlIIllI = IlllIIIIlIIIlIlIlIIl.IlIlIIIlIIlIlIIlllIl;
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.IlIlIlIlIlllllllllIl = s;
        this.IlIIIlIlIIIllIlIlIIl = s;
    }
    
    @Override
    public String llllIIIIlIIIlIlllIll() {
        return this.IlIlIlIlIlllllllllIl;
    }
    
    public String IlIlIlIlIlllllllllIl() {
        return this.IlIIIlIlIIIllIlIlIIl;
    }
    
    public void llllIIIIlIIIlIlllIll(final String ilIIIlIlIIIllIlIlIIl) {
        if (ilIIIlIlIIIllIlIlIIl == null) {
            throw new IllegalArgumentException("Name cannot be null");
        }
        this.IlIIIlIlIIIllIlIlIIl = ilIIIlIlIIIllIlIlIIl;
        this.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI(this);
    }
    
    @Override
    public Collection llIllIIIIIllIlIIIIlI() {
        return this.llIllIIIIIllIlIIIIlI;
    }
    
    public String IlIIIlIlIIIllIlIlIIl() {
        return this.IlIlIIIllIllIIIIIllI;
    }
    
    public void IlIlIlIlIlllllllllIl(final String ilIlIIIllIllIIIIIllI) {
        if (ilIlIIIllIllIIIIIllI == null) {
            throw new IllegalArgumentException("Prefix cannot be null");
        }
        this.IlIlIIIllIllIIIIIllI = ilIlIIIllIllIIIIIllI;
        this.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI(this);
    }
    
    public String IlIlIIIllIllIIIIIllI() {
        return this.IllIIlllIIIIlllIIlIl;
    }
    
    public void llIllIIIIIllIlIIIIlI(final String illIIlllIIIIlllIIlIl) {
        this.IllIIlllIIIIlllIIlIl = illIIlllIIIIlllIIlIl;
        this.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI(this);
    }
    
    @Override
    public String IlIIIlIlIIIllIlIlIIl(final String s) {
        return String.valueOf(this.IlIIIlIlIIIllIlIlIIl()) + s + this.IlIlIIIllIllIIIIIllI();
    }
    
    public static String llllIIIIlIIIlIlllIll(final IlIlIIIllIIllIlllllI ilIlIIIllIIllIlllllI, final String s) {
        return (ilIlIIIllIIllIlllllI == null) ? s : ilIlIIIllIIllIlllllI.IlIIIlIlIIIllIlIlIIl(s);
    }
    
    @Override
    public boolean IllIIlllIIIIlllIIlIl() {
        return this.llllIIIlIlllIlIIIIIl;
    }
    
    public void llllIIIIlIIIlIlllIll(final boolean llllIIIlIlllIlIIIIIl) {
        this.llllIIIlIlllIlIIIIIl = llllIIIlIlllIlIIIIIl;
        this.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI(this);
    }
    
    @Override
    public boolean llllIIIlIlllIlIIIIIl() {
        return this.lIIIIlIIIIIlllIllIII;
    }
    
    public void IlIlIlIlIlllllllllIl(final boolean liiiIlIIIIIlllIllIII) {
        this.lIIIIlIIIIIlllIllIII = liiiIlIIIIIlllIllIII;
        this.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI(this);
    }
    
    @Override
    public IIIIlllIIIIIIlIIIlll lIIIIlIIIIIlllIllIII() {
        return this.lIIIlllIIIllIIIllIII;
    }
    
    @Override
    public IIIIlllIIIIIIlIIIlll lIIIlllIIIllIIIllIII() {
        return this.llIIlIIIlIIIllIlIIIl;
    }
    
    public void llllIIIIlIIIlIlllIll(final IIIIlllIIIIIIlIIIlll liiIlllIIIllIIIllIII) {
        this.lIIIlllIIIllIIIllIII = liiIlllIIIllIIIllIII;
        this.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI(this);
    }
    
    public void IlIlIlIlIlllllllllIl(final IIIIlllIIIIIIlIIIlll llIIlIIIlIIIllIlIIIl) {
        this.llIIlIIIlIIIllIlIIIl = llIIlIIIlIIIllIlIIIl;
        this.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI(this);
    }
    
    public int llIIlIIIlIIIllIlIIIl() {
        int n = 0;
        if (this.IllIIlllIIIIlllIIlIl()) {
            n |= 0x1;
        }
        if (this.llllIIIlIlllIlIIIIIl()) {
            n |= 0x2;
        }
        return n;
    }
    
    public void llllIIIIlIIIlIlllIll(final int n) {
        this.llllIIIIlIIIlIlllIll((n & 0x1) > 0);
        this.IlIlIlIlIlllllllllIl((n & 0x2) > 0);
    }
    
    public void llllIIIIlIIIlIlllIll(final IlllIIIIlIIIlIlIlIIl llIllIlIIIIllIlIIllI) {
        this.llIllIlIIIIllIlIIllI = llIllIlIIIIllIlIIllI;
    }
    
    public IlllIIIIlIIIlIlIlIIl llIllIlIIIIllIlIIllI() {
        return this.llIllIlIIIIllIlIIllI;
    }
}
