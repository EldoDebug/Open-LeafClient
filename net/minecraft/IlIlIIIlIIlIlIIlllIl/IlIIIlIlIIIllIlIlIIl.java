package net.minecraft.IlIlIIIlIIlIlIIlllIl;

import java.util.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import org.apache.logging.log4j.*;
import com.google.common.collect.*;
import net.minecraft.llllIIIIlIIIlIlllIll.*;
import net.minecraft.IlIlIIIllIIllIlllllI.*;
import net.minecraft.llIllIIIIIllIlIIIIlI.*;
import java.util.concurrent.*;

public abstract class IlIIIlIlIIIllIlIlIIl
{
    private static final Logger IlIlIIIllIllIIIIIllI;
    private static Map IllIIlllIIIIlllIIlIl;
    private static Map llllIIIlIlllIlIIIIIl;
    protected IlllllllIIIlIIIlIlII llllIIIIlIIIlIlllIll;
    protected IlIlIlIlIlllllllllIl IlIlIlIlIlllllllllIl;
    protected boolean llIllIIIIIllIlIIIIlI;
    private int lIIIIlIIIIIlllIllIII;
    protected llllIIIIlIIIlIlllIll IlIIIlIlIIIllIlIlIIl;
    
    static {
        IlIlIIIllIllIIIIIllI = LogManager.getLogger();
        IlIIIlIlIIIllIlIlIIl.IllIIlllIIIIlllIIlIl = Maps.newHashMap();
        IlIIIlIlIIIllIlIlIIl.llllIIIlIlllIlIIIIIl = Maps.newHashMap();
        llllIIIIlIIIlIlllIll(IIlIIIIlllIlllllIlII.class, "Furnace");
        llllIIIIlIIIlIlllIll(IlIlIIIllIIllIlllllI.class, "Chest");
        llllIIIIlIIIlIlllIll(IlIlIIIlIIlIlIIlllIl.class, "EnderChest");
        llllIIIIlIIIlIlllIll(lllIIIIlIlIllIIlIIIl.class, "RecordPlayer");
        llllIIIIlIIIlIlllIll(lllIIIIlllllIlIIllIl.class, "Trap");
        llllIIIIlIIIlIlllIll(IlIlIIIIIIlllIlIllIl.class, "Dropper");
        llllIIIIlIIIlIlllIll(llIIlllIIlllIIllIllI.class, "Sign");
        llllIIIIlIIIlIlllIll(IIlllIlIIllIlIlIlIIl.class, "MobSpawner");
        llllIIIIlIIIlIlllIll(lllllIlIIIlIlIIlllII.class, "Music");
        llllIIIIlIIIlIlllIll(lIllllllIIllIlIlIlII.class, "Piston");
        llllIIIIlIIIlIlllIll(lIlIlIIIllIIllIIIllI.class, "Cauldron");
        llllIIIIlIIIlIlllIll(IIllIIllIIIlIlIIIIlI.class, "EnchantTable");
        llllIIIIlIIIlIlllIll(IIIlIIIlIlIIlllIIlll.class, "Airportal");
        llllIIIIlIIIlIlllIll(IIIIlllIIIIIIlIIIlll.class, "Control");
        llllIIIIlIIIlIlllIll(llIIlIIIlIIIllIlIIIl.class, "Beacon");
        llllIIIIlIIIlIlllIll(llllllIllIllIlIllllI.class, "Skull");
        llllIIIIlIIIlIlllIll(IIlllIIlIllIllIlIIll.class, "DLDetector");
        llllIIIIlIIIlIlllIll(IIIlIIlIIIIlllIlllII.class, "Hopper");
        llllIIIIlIIIlIlllIll(IlIllIlIlIIIlIlIlIII.class, "Comparator");
        llllIIIIlIIIlIlllIll(net.minecraft.IlIlIIIlIIlIlIIlllIl.IlllllllIIIlIIIlIlII.class, "FlowerPot");
        llllIIIIlIIIlIlllIll(lIIIIlIIIIIlllIllIII.class, "Banner");
    }
    
    public IlIIIlIlIIIllIlIlIIl() {
        this.IlIlIlIlIlllllllllIl = net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll;
        this.lIIIIlIIIIIlllIllIII = -1;
    }
    
    private static void llllIIIIlIIIlIlllIll(final Class clazz, final String s) {
        if (IlIIIlIlIIIllIlIlIIl.IllIIlllIIIIlllIIlIl.containsKey(s)) {
            throw new IllegalArgumentException("Duplicate id: " + s);
        }
        IlIIIlIlIIIllIlIlIIl.IllIIlllIIIIlllIIlIl.put(s, clazz);
        IlIIIlIlIIIllIlIlIIl.llllIIIlIlllIlIIIIIl.put(clazz, s);
    }
    
    public IlllllllIIIlIIIlIlII IIlllIIIlIlllIIlllII() {
        return this.llllIIIIlIIIlIlllIll;
    }
    
    public void llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII llllIIIIlIIIlIlllIll) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
    }
    
    public boolean lIIIIlIIIIIlllIllIII() {
        return this.llllIIIIlIIIlIlllIll != null;
    }
    
    public void llllIIIIlIIIlIlllIll(final net.minecraft.lIlIlIIIllIIllIIIllI.IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll) {
        this.IlIlIlIlIlllllllllIl = new IlIlIlIlIlllllllllIl(iiiIlllIIIIIIlIIIlll.IllIIlllIIIIlllIIlIl("x"), iiiIlllIIIIIIlIIIlll.IllIIlllIIIIlllIIlIl("y"), iiiIlllIIIIIIlIIIlll.IllIIlllIIIIlllIIlIl("z"));
    }
    
    public void IlIlIlIlIlllllllllIl(final net.minecraft.lIlIlIIIllIIllIIIllI.IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll) {
        final String s = net.minecraft.IlIlIIIlIIlIlIIlllIl.IlIIIlIlIIIllIlIlIIl.llllIIIlIlllIlIIIIIl.get(this.getClass());
        if (s == null) {
            throw new RuntimeException(this.getClass() + " is missing a mapping! This is a bug!");
        }
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("id", s);
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("x", this.IlIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII());
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("y", this.IlIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII());
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("z", this.IlIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl());
    }
    
    public static IlIIIlIlIIIllIlIlIIl llIllIIIIIllIlIIIIlI(final net.minecraft.lIlIlIIIllIIllIIIllI.IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll) {
        IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl = null;
        try {
            final Class<IlIIIlIlIIIllIlIlIIl> clazz = IlIIIlIlIIIllIlIlIIl.IllIIlllIIIIlllIIlIl.get(iiiIlllIIIIIIlIIIlll.llIIlIIIlIIIllIlIIIl("id"));
            if (clazz != null) {
                ilIIIlIlIIIllIlIlIIl = clazz.newInstance();
            }
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
        if (ilIIIlIlIIIllIlIlIIl != null) {
            ilIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(iiiIlllIIIIIIlIIIlll);
        }
        else {
            IlIIIlIlIIIllIlIlIIl.IlIlIIIllIllIIIIIllI.warn("Skipping BlockEntity with id " + iiiIlllIIIIIIlIIIlll.llIIlIIIlIIIllIlIIIl("id"));
        }
        return ilIIIlIlIIIllIlIlIIl;
    }
    
    public int llIIlIIIlIIIllIlIIIl() {
        if (this.lIIIIlIIIIIlllIllIII == -1) {
            final net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.llIIlIIIlIIIllIlIIIl ilIlIlIlIlllllllllIl = this.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(this.IlIlIlIlIlllllllllIl);
            this.lIIIIlIIIIIlllIllIII = ilIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI().llIllIIIIIllIlIIIIlI(ilIlIlIlIlllllllllIl);
        }
        return this.lIIIIlIIIIIlllIllIII;
    }
    
    public void llIIIlIlIllIIlIlIlII() {
        if (this.llllIIIIlIIIlIlllIll != null) {
            final net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.llIIlIIIlIIIllIlIIIl ilIlIlIlIlllllllllIl = this.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(this.IlIlIlIlIlllllllllIl);
            this.lIIIIlIIIIIlllIllIII = ilIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI().llIllIIIIIllIlIIIIlI(ilIlIlIlIlllllllllIl);
            this.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(this.IlIlIlIlIlllllllllIl, this);
            if (this.IlIlIIIllIIllIlllllI() != net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll) {
                this.llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI(this.IlIlIlIlIlllllllllIl, this.IlIlIIIllIIllIlllllI());
            }
        }
    }
    
    public double llllIIIIlIIIlIlllIll(final double n, final double n2, final double n3) {
        final double n4 = this.IlIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII() + 0.5 - n;
        final double n5 = this.IlIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII() + 0.5 - n2;
        final double n6 = this.IlIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl() + 0.5 - n3;
        return n4 * n4 + n5 * n5 + n6 * n6;
    }
    
    public double llIllIlIIIIllIlIIllI() {
        return 4096.0;
    }
    
    public IlIlIlIlIlllllllllIl lIlIlIIIllIIllIIIllI() {
        return this.IlIlIlIlIlllllllllIl;
    }
    
    public llllIIIIlIIIlIlllIll IlIlIIIllIIllIlllllI() {
        if (this.IlIIIlIlIIIllIlIlIIl == null) {
            this.IlIIIlIlIIIllIlIlIIl = this.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(this.IlIlIlIlIlllllllllIl).llIllIIIIIllIlIIIIlI();
        }
        return this.IlIIIlIlIIIllIlIlIIl;
    }
    
    public IIlIIIIIllIlIIIlIIll IIIIlllIIIIIIlIIIlll() {
        return null;
    }
    
    public boolean llllIIllllIlIlIIIIll() {
        return this.llIllIIIIIllIlIIIIlI;
    }
    
    public void IlIllIlIlIIIlIlIlIII() {
        this.llIllIIIIIllIlIIIIlI = true;
    }
    
    public void IIlllIIlIllIllIlIIll() {
        this.llIllIIIIIllIlIIIIlI = false;
    }
    
    public boolean llIllIIIIIllIlIIIIlI(final int n, final int n2) {
        return false;
    }
    
    public void lllIIIIlllllIlIIllIl() {
        this.IlIIIlIlIIIllIlIlIIl = null;
        this.lIIIIlIIIIIlllIllIII = -1;
    }
    
    public void llllIIIIlIIIlIlllIll(final lIIIlllIIIllIIIllIII liiIlllIIIllIIIllIII) {
        liiIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll("Name", new IlIlIIIllIllIIIIIllI(this));
        if (this.llllIIIIlIIIlIlllIll != null) {
            lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll(liiIlllIIIllIIIllIII, this.IlIlIlIlIlllllllllIl, this.IlIlIIIllIIllIlllllI(), this.llIIlIIIlIIIllIlIIIl());
            liiIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll("Actual block type", new IllIIlllIIIIlllIIlIl(this));
            liiIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll("Actual block data value", new llllIIIlIlllIlIIIIIl(this));
        }
    }
    
    public void llllIIIIlIIIlIlllIll(final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
    }
    
    public boolean IlIlIIIIIIlllIlIllIl() {
        return false;
    }
}
