package net.minecraft.IllIIlllIIIIlllIIlIl;

import com.google.common.collect.*;
import java.util.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.llIllIlIIIIllIlIIllI.*;

public abstract class llllIIIIlIIIlIlllIll
{
    private static final llllIIIIlIIIlIlllIll[] lIllllllIIllIlIlIlII;
    public static final llllIIIIlIIIlIlllIll[] llllIIIIlIIIlIlllIll;
    private static final Map llIIlllIIlllIIllIllI;
    public static final llllIIIIlIIIlIlllIll IlIlIlIlIlllllllllIl;
    public static final llllIIIIlIIIlIlllIll llIllIIIIIllIlIIIIlI;
    public static final llllIIIIlIIIlIlllIll IlIIIlIlIIIllIlIlIIl;
    public static final llllIIIIlIIIlIlllIll IlIlIIIllIllIIIIIllI;
    public static final llllIIIIlIIIlIlllIll IllIIlllIIIIlllIIlIl;
    public static final llllIIIIlIIIlIlllIll llllIIIlIlllIlIIIIIl;
    public static final llllIIIIlIIIlIlllIll lIIIIlIIIIIlllIllIII;
    public static final llllIIIIlIIIlIlllIll lIIIlllIIIllIIIllIII;
    public static final llllIIIIlIIIlIlllIll llIIlIIIlIIIllIlIIIl;
    public static final llllIIIIlIIIlIlllIll llIllIlIIIIllIlIIllI;
    public static final llllIIIIlIIIlIlllIll lIlIlIIIllIIllIIIllI;
    public static final llllIIIIlIIIlIlllIll IlIlIIIllIIllIlllllI;
    public static final llllIIIIlIIIlIlllIll IIIIlllIIIIIIlIIIlll;
    public static final llllIIIIlIIIlIlllIll llllIIllllIlIlIIIIll;
    public static final llllIIIIlIIIlIlllIll IlIllIlIlIIIlIlIlIII;
    public static final llllIIIIlIIIlIlllIll IIlllIIlIllIllIlIIll;
    public static final llllIIIIlIIIlIlllIll lllIIIIlllllIlIIllIl;
    public static final llllIIIIlIIIlIlllIll IlIlIIIIIIlllIlIllIl;
    public static final llllIIIIlIIIlIlllIll IIllIIllIIIlIlIIIIlI;
    public static final llllIIIIlIIIlIlllIll IIIlIIIlIlIIlllIIlll;
    public static final llllIIIIlIIIlIlllIll IlIlIIIlIIlIlIIlllIl;
    public static final llllIIIIlIIIlIlllIll IlllllllIIIlIIIlIlII;
    public static final llllIIIIlIIIlIlllIll IIlIIIIlllIlllllIlII;
    public static final llllIIIIlIIIlIlllIll IIIlIIlIIIIlllIlllII;
    public static final llllIIIIlIIIlIlllIll IlIlIllllllllIIIIlII;
    public final int IIlllIlIIllIlIlIlIIl;
    private final int IIlllIIIlIlllIIlllII;
    public IlIlIllllllllIIIIlII llIIIlIlIllIIlIlIlII;
    protected String lllllIlIIIlIlIIlllII;
    
    static {
        lIllllllIIllIlIlIlII = new llllIIIIlIIIlIlllIll[256];
        llIIlllIIlllIIllIllI = Maps.newHashMap();
        IlIlIlIlIlllllllllIl = new IIIlIIIlIlIIlllIIlll(0, new lIllllIllIllIIllllll("protection"), 10, 0);
        llIllIIIIIllIlIIIIlI = new IIIlIIIlIlIIlllIIlll(1, new lIllllIllIllIIllllll("fire_protection"), 5, 1);
        IlIIIlIlIIIllIlIlIIl = new IIIlIIIlIlIIlllIIlll(2, new lIllllIllIllIIllllll("feather_falling"), 5, 2);
        IlIlIIIllIllIIIIIllI = new IIIlIIIlIlIIlllIIlll(3, new lIllllIllIllIIllllll("blast_protection"), 2, 3);
        IllIIlllIIIIlllIIlIl = new IIIlIIIlIlIIlllIIlll(4, new lIllllIllIllIIllllll("projectile_protection"), 5, 4);
        llllIIIlIlllIlIIIIIl = new IIllIIllIIIlIlIIIIlI(5, new lIllllIllIllIIllllll("respiration"), 2);
        lIIIIlIIIIIlllIllIII = new IIIlIIlIIIIlllIlllII(6, new lIllllIllIllIIllllll("aqua_affinity"), 2);
        lIIIlllIIIllIIIllIII = new IlIlIIIlIIlIlIIlllIl(7, new lIllllIllIllIIllllll("thorns"), 1);
        llIIlIIIlIIIllIlIIIl = new IIlIIIIlllIlllllIlII(8, new lIllllIllIllIIllllll("depth_strider"), 2);
        llIllIlIIIIllIlIIllI = new IllIIlllIIIIlllIIlIl(16, new lIllllIllIllIIllllll("sharpness"), 10, 0);
        lIlIlIIIllIIllIIIllI = new IllIIlllIIIIlllIIlIl(17, new lIllllIllIllIIllllll("smite"), 5, 1);
        IlIlIIIllIIllIlllllI = new IllIIlllIIIIlllIIlIl(18, new lIllllIllIllIIllllll("bane_of_arthropods"), 5, 2);
        IIIIlllIIIIIIlIIIlll = new lllIIIIlllllIlIIllIl(19, new lIllllIllIllIIllllll("knockback"), 5);
        llllIIllllIlIlIIIIll = new llIIlIIIlIIIllIlIIIl(20, new lIllllIllIllIIllllll("fire_aspect"), 2);
        IlIllIlIlIIIlIlIlIII = new IlIlIIIIIIlllIlIllIl(21, new lIllllIllIllIIllllll("looting"), 2, net.minecraft.IllIIlllIIIIlllIIlIl.IlIlIllllllllIIIIlII.llllIIIlIlllIlIIIIIl);
        IIlllIIlIllIllIlIIll = new lIIIIlIIIIIlllIllIII(32, new lIllllIllIllIIllllll("efficiency"), 10);
        lllIIIIlllllIlIIllIl = new IlllllllIIIlIIIlIlII(33, new lIllllIllIllIIllllll("silk_touch"), 1);
        IlIlIIIIIIlllIlIllIl = new lIIIlllIIIllIIIllIII(34, new lIllllIllIllIIllllll("unbreaking"), 5);
        IIllIIllIIIlIlIIIIlI = new IlIlIIIIIIlllIlIllIl(35, new lIllllIllIllIIllllll("fortune"), 2, net.minecraft.IllIIlllIIIIlllIIlIl.IlIlIllllllllIIIIlII.lIIIIlIIIIIlllIllIII);
        IIIlIIIlIlIIlllIIlll = new IlIlIlIlIlllllllllIl(48, new lIllllIllIllIIllllll("power"), 10);
        IlIlIIIlIIlIlIIlllIl = new IlIlIIIllIllIIIIIllI(49, new lIllllIllIllIIllllll("punch"), 2);
        IlllllllIIIlIIIlIlII = new llIllIIIIIllIlIIIIlI(50, new lIllllIllIllIIllllll("flame"), 2);
        IIlIIIIlllIlllllIlII = new IlIIIlIlIIIllIlIlIIl(51, new lIllllIllIllIIllllll("infinity"), 1);
        IIIlIIlIIIIlllIlllII = new IlIlIIIIIIlllIlIllIl(61, new lIllllIllIllIIllllll("luck_of_the_sea"), 2, net.minecraft.IllIIlllIIIIlllIIlIl.IlIlIllllllllIIIIlII.lIIIlllIIIllIIIllIII);
        IlIlIllllllllIIIIlII = new llIllIlIIIIllIlIIllI(62, new lIllllIllIllIIllllll("lure"), 2, net.minecraft.IllIIlllIIIIlllIIlIl.IlIlIllllllllIIIIlII.lIIIlllIIIllIIIllIII);
        final ArrayList arrayList = Lists.newArrayList();
        llllIIIIlIIIlIlllIll[] lIllllllIIllIlIlIlII2;
        for (int length = (lIllllllIIllIlIlIlII2 = net.minecraft.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll.lIllllllIIllIlIlIlII).length, i = 0; i < length; ++i) {
            final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll2 = lIllllllIIllIlIlIlII2[i];
            if (llllIIIIlIIIlIlllIll2 != null) {
                arrayList.add(llllIIIIlIIIlIlllIll2);
            }
        }
        llllIIIIlIIIlIlllIll = arrayList.toArray(new llllIIIIlIIIlIlllIll[arrayList.size()]);
    }
    
    public static llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll(final int n) {
        return (n >= 0 && n < net.minecraft.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll.lIllllllIIllIlIlIlII.length) ? net.minecraft.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll.lIllllllIIllIlIlIlII[n] : null;
    }
    
    protected llllIIIIlIIIlIlllIll(final int iIlllIlIIllIlIlIlIIl, final lIllllIllIllIIllllll lIllllIllIllIIllllll, final int iIlllIIIlIlllIIlllII, final IlIlIllllllllIIIIlII llIIIlIlIllIIlIlIlII) {
        this.IIlllIlIIllIlIlIlIIl = iIlllIlIIllIlIlIlIIl;
        this.IIlllIIIlIlllIIlllII = iIlllIIIlIlllIIlllII;
        this.llIIIlIlIllIIlIlIlII = llIIIlIlIllIIlIlIlII;
        if (net.minecraft.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll.lIllllllIIllIlIlIlII[iIlllIlIIllIlIlIlIIl] != null) {
            throw new IllegalArgumentException("Duplicate enchantment id!");
        }
        net.minecraft.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll.lIllllllIIllIlIlIlII[iIlllIlIIllIlIlIlIIl] = this;
        net.minecraft.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll.llIIlllIIlllIIllIllI.put(lIllllIllIllIIllllll, this);
    }
    
    public static llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll(final String s) {
        return net.minecraft.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll.llIIlllIIlllIIllIllI.get(new lIllllIllIllIIllllll(s));
    }
    
    public static Set llllIIIIlIIIlIlllIll() {
        return net.minecraft.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll.llIIlllIIlllIIllIllI.keySet();
    }
    
    public int IlIlIlIlIlllllllllIl() {
        return this.IIlllIIIlIlllIIlllII;
    }
    
    public int llIllIIIIIllIlIIIIlI() {
        return 1;
    }
    
    public int IlIIIlIlIIIllIlIlIIl() {
        return 1;
    }
    
    public int IlIlIlIlIlllllllllIl(final int n) {
        return 1 + n * 10;
    }
    
    public int llIllIIIIIllIlIIIIlI(final int n) {
        return this.IlIlIlIlIlllllllllIl(n) + 5;
    }
    
    public int llllIIIIlIIIlIlllIll(final int n, final lIllllllIIllIlIlIlII lIllllllIIllIlIlIlII) {
        return 0;
    }
    
    public float llllIIIIlIIIlIlllIll(final int n, final net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIllllllllIIIIlII ilIlIllllllllIIIIlII) {
        return 0.0f;
    }
    
    public boolean llllIIIIlIIIlIlllIll(final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        return this != llllIIIIlIIIlIlllIll;
    }
    
    public llllIIIIlIIIlIlllIll IlIlIlIlIlllllllllIl(final String lllllIlIIIlIlIIlllII) {
        this.lllllIlIIIlIlIIlllII = lllllIlIIIlIlIIlllII;
        return this;
    }
    
    public String IlIlIIIllIllIIIIIllI() {
        return "enchantment." + this.lllllIlIIIlIlIIlllII;
    }
    
    public String IlIIIlIlIIIllIlIlIIl(final int n) {
        return String.valueOf(lIIlllIlllllIIlllIll.llllIIIIlIIIlIlllIll(this.IlIlIIIllIllIIIIIllI())) + " " + lIIlllIlllllIIlllIll.llllIIIIlIIIlIlllIll("enchantment.level." + n);
    }
    
    public boolean llllIIIIlIIIlIlllIll(final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl) {
        return this.llIIIlIlIllIIlIlIlII.llllIIIIlIIIlIlllIll(lllIIIIlIlIllIIlIIIl.llllIIIIlIIIlIlllIll());
    }
    
    public void llllIIIIlIIIlIlllIll(final net.minecraft.llllIIIlIlllIlIIIIIl.lllIIIIlllllIlIIllIl lllIIIIlllllIlIIllIl, final net.minecraft.llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI, final int n) {
    }
    
    public void IlIlIlIlIlllllllllIl(final net.minecraft.llllIIIlIlllIlIIIIIl.lllIIIIlllllIlIIllIl lllIIIIlllllIlIIllIl, final net.minecraft.llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI, final int n) {
    }
}
