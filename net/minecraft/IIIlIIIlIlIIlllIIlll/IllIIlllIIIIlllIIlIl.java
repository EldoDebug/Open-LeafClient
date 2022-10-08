package net.minecraft.IIIlIIIlIlIIlllIIlll;

import net.minecraft.lllIIIIlllllIlIIllIl.*;
import java.text.*;
import java.util.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.lIIIIlIIIIIlllIllIII.*;

public class IllIIlllIIIIlllIIlIl
{
    public final String IlIlIIIllIllIIIIIllI;
    private final llIIIIIIlIllIIlIIIll llllIIIIlIIIlIlllIll;
    public boolean IllIIlllIIIIlllIIlIl;
    private final IlIIIlIlIIIllIlIlIIl IlIlIlIlIlllllllllIl;
    private final IlIlIlIlIlllllllllIl llIllIIIIIllIlIIIIlI;
    private Class IlIIIlIlIIIllIlIlIIl;
    private static NumberFormat llIllIlIIIIllIlIIllI;
    public static IlIIIlIlIIIllIlIlIIl llllIIIlIlllIlIIIIIl;
    private static DecimalFormat lIlIlIIIllIIllIIIllI;
    public static IlIIIlIlIIIllIlIlIIl lIIIIlIIIIIlllIllIII;
    public static IlIIIlIlIIIllIlIlIIl lIIIlllIIIllIIIllIII;
    public static IlIIIlIlIIIllIlIlIIl llIIlIIIlIIIllIlIIIl;
    
    static {
        IllIIlllIIIIlllIIlIl.llIllIlIIIIllIlIIllI = NumberFormat.getIntegerInstance(Locale.US);
        IllIIlllIIIIlllIIlIl.llllIIIlIlllIlIIIIIl = new llllIIIlIlllIlIIIIIl();
        IllIIlllIIIIlllIIlIl.lIlIlIIIllIIllIIIllI = new DecimalFormat("########0.00");
        IllIIlllIIIIlllIIlIl.lIIIIlIIIIIlllIllIII = new lIIIIlIIIIIlllIllIII();
        IllIIlllIIIIlllIIlIl.lIIIlllIIIllIIIllIII = new lIIIlllIIIllIIIllIII();
        IllIIlllIIIIlllIIlIl.llIIlIIIlIIIllIlIIIl = new llIIlIIIlIIIllIlIIIl();
    }
    
    public IllIIlllIIIIlllIIlIl(final String ilIlIIIllIllIIIIIllI, final llIIIIIIlIllIIlIIIll llllIIIIlIIIlIlllIll, final IlIIIlIlIIIllIlIlIIl ilIlIlIlIlllllllllIl) {
        this.IlIlIIIllIllIIIIIllI = ilIlIIIllIllIIIIIllI;
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
        this.llIllIIIIIllIlIIIIlI = new IlIlIIIllIllIIIIIllI(this);
        net.minecraft.lllIIIIlllllIlIIllIl.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.put(this.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(), this.llIllIIIIIllIlIIIIlI);
    }
    
    public IllIIlllIIIIlllIIlIl(final String s, final llIIIIIIlIllIIlIIIll llIIIIIIlIllIIlIIIll) {
        this(s, llIIIIIIlIllIIlIIIll, net.minecraft.IIIlIIIlIlIIlllIIlll.IllIIlllIIIIlllIIlIl.llllIIIlIlllIlIIIIIl);
    }
    
    public IllIIlllIIIIlllIIlIl lIIIIlIIIIIlllIllIII() {
        this.IllIIlllIIIIlllIIlIl = true;
        return this;
    }
    
    public IllIIlllIIIIlllIIlIl lIIIlllIIIllIIIllIII() {
        if (IIIIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll.containsKey(this.IlIlIIIllIllIIIIIllI)) {
            throw new RuntimeException("Duplicate stat id: \"" + IIIIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll.get(this.IlIlIIIllIllIIIIIllI).llllIIIIlIIIlIlllIll + "\" and \"" + this.llllIIIIlIIIlIlllIll + "\" at id " + this.IlIlIIIllIllIIIIIllI);
        }
        IIIIlllIIIIIIlIIIlll.IlIlIlIlIlllllllllIl.add(this);
        IIIIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll.put(this.IlIlIIIllIllIIIIIllI, this);
        return this;
    }
    
    public boolean IlIIIlIlIIIllIlIlIIl() {
        return false;
    }
    
    public String llllIIIIlIIIlIlllIll(final int n) {
        return this.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(n);
    }
    
    public llIIIIIIlIllIIlIIIll IlIlIIIllIllIIIIIllI() {
        final llIIIIIIlIllIIlIIIll ilIlIIIllIllIIIIIllI = this.llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI();
        ilIlIIIllIllIIIIIllI.llllIIIlIlllIlIIIIIl().llllIIIIlIIIlIlllIll(IlllIIIIlIIIlIlIlIIl.lIIIIlIIIIIlllIllIII);
        ilIlIIIllIllIIIIIllI.llllIIIlIlllIlIIIIIl().llllIIIIlIIIlIlllIll(new llIllIIIIIllIlIIIIlI(net.minecraft.lIIIIlIIIIIlllIllIII.IlIIIlIlIIIllIlIlIIl.IlIlIlIlIlllllllllIl, new IlIlIIIIIIlllIlIllIl(this.IlIlIIIllIllIIIIIllI)));
        return ilIlIIIllIllIIIIIllI;
    }
    
    public llIIIIIIlIllIIlIIIll llIIlIIIlIIIllIlIIIl() {
        final llIIIIIIlIllIIlIIIll ilIlIIIllIllIIIIIllI = this.IlIlIIIllIllIIIIIllI();
        final llIIIIIIlIllIIlIIIll ilIlIlIlIlllllllllIl = new IlIlIIIIIIlllIlIllIl("[").llllIIIIlIIIlIlllIll(ilIlIIIllIllIIIIIllI).IlIlIlIlIlllllllllIl("]");
        ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(ilIlIIIllIllIIIIIllI.llllIIIlIlllIlIIIIIl());
        return ilIlIlIlIlllllllllIl;
    }
    
    @Override
    public boolean equals(final Object o) {
        return this == o || (o != null && this.getClass() == o.getClass() && this.IlIlIIIllIllIIIIIllI.equals(((IllIIlllIIIIlllIIlIl)o).IlIlIIIllIllIIIIIllI));
    }
    
    @Override
    public int hashCode() {
        return this.IlIlIIIllIllIIIIIllI.hashCode();
    }
    
    @Override
    public String toString() {
        return "Stat{id=" + this.IlIlIIIllIllIIIIIllI + ", nameId=" + this.llllIIIIlIIIlIlllIll + ", awardLocallyOnly=" + this.IllIIlllIIIIlllIIlIl + ", formatter=" + this.IlIlIlIlIlllllllllIl + ", objectiveCriteria=" + this.llIllIIIIIllIlIIIIlI + '}';
    }
    
    public IlIlIlIlIlllllllllIl llIllIlIIIIllIlIIllI() {
        return this.llIllIIIIIllIlIIIIlI;
    }
    
    public Class lIlIlIIIllIIllIIIllI() {
        return this.IlIIIlIlIIIllIlIlIIl;
    }
    
    public IllIIlllIIIIlllIIlIl IlIlIlIlIlllllllllIl(final Class ilIIIlIlIIIllIlIlIIl) {
        this.IlIIIlIlIIIllIlIlIIl = ilIIIlIlIIIllIlIlIIl;
        return this;
    }
}
