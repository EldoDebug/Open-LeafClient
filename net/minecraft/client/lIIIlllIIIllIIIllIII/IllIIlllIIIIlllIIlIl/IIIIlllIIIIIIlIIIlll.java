package net.minecraft.client.lIIIlllIIIllIIIllIII.IllIIlllIIIIlllIIlIl;

import net.minecraft.client.llIllIIIIIllIlIIIIlI.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;
import com.google.common.collect.*;
import net.minecraft.IlIlIIIlIIlIlIIlllIl.*;
import java.util.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.*;
import net.optifine.*;
import net.minecraft.llIllIIIIIllIlIIIIlI.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI.*;
import net.minecraft.client.*;

public class IIIIlllIIIIIIlIIIlll
{
    public Map llllIIIIlIIIlIlllIll;
    public static IIIIlllIIIIIIlIIIlll IlIlIlIlIlllllllllIl;
    public FontRenderer llIllIIIIIllIlIIIIlI;
    public static double IlIIIlIlIIIllIlIlIIl;
    public static double IlIlIIIllIllIIIIIllI;
    public static double IllIIlllIIIIlllIIlIl;
    public IIlllIIlIllIllIlIIll llllIIIlIlllIlIIIIIl;
    public IlllllllIIIlIIIlIlII lIIIIlIIIIIlllIllIII;
    public llIllIIIIIllIlIIIIlI lIIIlllIIIllIIIllIII;
    public float llIIlIIIlIIIllIlIIIl;
    public float llIllIlIIIIllIlIIllI;
    public double lIlIlIIIllIIllIIIllI;
    public double IlIlIIIllIIllIlllllI;
    public double IIIIlllIIIIIIlIIIlll;
    public IlIIIlIlIIIllIlIlIIl llllIIllllIlIlIIIIll;
    private IIlllIIlllIIIlIlllII IlIllIlIlIIIlIlIlIII;
    private boolean IIlllIIlIllIllIlIIll;
    
    static {
        IIIIlllIIIIIIlIIIlll.IlIlIlIlIlllllllllIl = new IIIIlllIIIIIIlIIIlll();
    }
    
    private IIIIlllIIIIIIlIIIlll() {
        this.llllIIIIlIIIlIlllIll = Maps.newHashMap();
        this.IlIllIlIlIIIlIlIlIII = new IIlllIIlllIIIlIlllII(2097152);
        this.IIlllIIlIllIllIlIIll = false;
        this.llllIIIIlIIIlIlllIll.put(llIIlllIIlllIIllIllI.class, new llllIIllllIlIlIIIIll());
        this.llllIIIIlIIIlIlllIll.put(IIlllIlIIllIlIlIlIIl.class, new lIlIlIIIllIIllIIIllI());
        this.llllIIIIlIIIlIlllIll.put(lIllllllIIllIlIlIlII.class, new IlIlIIIllIIllIlllllI());
        this.llllIIIIlIIIlIlllIll.put(net.minecraft.IlIlIIIlIIlIlIIlllIl.IlIlIIIllIIllIlllllI.class, new llllIIIlIlllIlIIIIIl());
        this.llllIIIIlIIIlIlllIll.put(IlIlIIIlIIlIlIIlllIl.class, new llIIlIIIlIIIllIlIIIl());
        this.llllIIIIlIIIlIlllIll.put(IIllIIllIIIlIlIIIIlI.class, new lIIIIlIIIIIlllIllIII());
        this.llllIIIIlIIIlIlllIll.put(IIIlIIIlIlIIlllIIlll.class, new lIIIlllIIIllIIIllIII());
        this.llllIIIIlIIIlIlllIll.put(net.minecraft.IlIlIIIlIIlIlIIlllIl.llIIlIIIlIIIllIlIIIl.class, new IllIIlllIIIIlllIIlIl());
        this.llllIIIIlIIIlIlllIll.put(llllllIllIllIlIllllI.class, new IlIllIlIlIIIlIlIlIII());
        this.llllIIIIlIIIlIlllIll.put(net.minecraft.IlIlIIIlIIlIlIIlllIl.lIIIIlIIIIIlllIllIII.class, new net.minecraft.client.lIIIlllIIIllIIIllIII.IllIIlllIIIIlllIIlIl.IlIIIlIlIIIllIlIlIIl());
        final Iterator<net.minecraft.client.lIIIlllIIIllIIIllIII.IllIIlllIIIIlllIIlIl.IIlllIIlIllIllIlIIll> iterator = this.llllIIIIlIIIlIlllIll.values().iterator();
        while (iterator.hasNext()) {
            iterator.next().llllIIIIlIIIlIlllIll(this);
        }
    }
    
    public net.minecraft.client.lIIIlllIIIllIIIllIII.IllIIlllIIIIlllIIlIl.IIlllIIlIllIllIlIIll llllIIIIlIIIlIlllIll(final Class clazz) {
        net.minecraft.client.lIIIlllIIIllIIIllIII.IllIIlllIIIIlllIIlIl.IIlllIIlIllIllIlIIll llllIIIIlIIIlIlllIll = this.llllIIIIlIIIlIlllIll.get(clazz);
        if (llllIIIIlIIIlIlllIll == null && clazz != IlIIIlIlIIIllIlIlIIl.class) {
            llllIIIIlIIIlIlllIll = this.llllIIIIlIIIlIlllIll(clazz.getSuperclass());
            this.llllIIIIlIIIlIlllIll.put(clazz, llllIIIIlIIIlIlllIll);
        }
        return llllIIIIlIIIlIlllIll;
    }
    
    public net.minecraft.client.lIIIlllIIIllIIIllIII.IllIIlllIIIIlllIIlIl.IIlllIIlIllIllIlIIll llllIIIIlIIIlIlllIll(final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl) {
        return (ilIIIlIlIIIllIlIlIIl != null && !ilIIIlIlIIIllIlIlIIl.llllIIllllIlIlIIIIll()) ? this.llllIIIIlIIIlIlllIll(ilIIIlIlIIIllIlIlIIl.getClass()) : null;
    }
    
    public void llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final IIlllIIlIllIllIlIIll llllIIIlIlllIlIIIIIl, final FontRenderer llIllIIIIIllIlIIIIlI, final llIllIIIIIllIlIIIIlI liiIlllIIIllIIIllIII, final float n) {
        if (this.lIIIIlIIIIIlllIllIII != illlllllIIIlIIIlIlII) {
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII);
        }
        this.llllIIIlIlllIlIIIIIl = llllIIIlIlllIlIIIIIl;
        this.lIIIlllIIIllIIIllIII = liiIlllIIIllIIIllIII;
        this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
        this.llIIlIIIlIIIllIlIIIl = liiIlllIIIllIIIllIII.IIIllllllIllIIIlllIl + (liiIlllIIIllIIIllIII.IIlIIIIIllIlIIIlIIll - liiIlllIIIllIIIllIII.IIIllllllIllIIIlllIl) * n;
        this.llIllIlIIIIllIlIIllI = liiIlllIIIllIIIllIII.IlIIIlIIIllllIlIlIlI + (liiIlllIIIllIIIllIII.llllllIllIllIlIllllI - liiIlllIIIllIIIllIII.IlIIIlIIIllllIlIlIlI) * n;
        this.lIlIlIIIllIIllIIIllI = liiIlllIIIllIIIllIII.lIIlIIIlIllIlIllIIIl + (liiIlllIIIllIIIllIII.IIlllIlIIllIlIlIlIIl - liiIlllIIIllIIIllIII.lIIlIIIlIllIlIllIIIl) * n;
        this.IlIlIIIllIIllIlllllI = liiIlllIIIllIIIllIII.IIlIIIlllIllIllIlIII + (liiIlllIIIllIIIllIII.llIIIlIlIllIIlIlIlII - liiIlllIIIllIIIllIII.IIlIIIlllIllIllIlIII) * n;
        this.IIIIlllIIIIIIlIIIlll = liiIlllIIIllIIIllIII.lIlIlIlllIIlIlIlllIl + (liiIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII - liiIlllIIIllIIIllIII.lIlIlIlllIIlIlIlllIl) * n;
    }
    
    public void llllIIIIlIIIlIlllIll(final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl, final float n, final int n2) {
        if (ilIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(this.lIlIlIIIllIIllIIIllI, this.IlIlIIIllIIllIlllllI, this.IIIIlllIIIIIIlIIIlll) < ilIIIlIlIIIllIlIlIIl.llIllIlIIIIllIlIIllI()) {
            int n3 = 1;
            if (net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.B.llIllIIIIIllIlIIIIlI()) {
                n3 = ((!this.IIlllIIlIllIllIlIIll || !net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.IlIlIlIlIlllllllllIl(ilIIIlIlIIIllIlIlIIl, net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.B, new Object[0])) ? 1 : 0);
            }
            if (n3 != 0) {
                lIlIIlllIIlIIlIlllIl.IlIlIlIlIlllllllllIl();
                final int llllIIIIlIIIlIlllIll = this.lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll(ilIIIlIlIIIllIlIlIIl.lIlIlIIIllIIllIIIllI(), 0);
                lIIIIlIlIllllIIlIllI.llllIIIIlIIIlIlllIll(lIIIIlIlIllllIIlIllI.lllIIIIlllllIlIIllIl, llllIIIIlIIIlIlllIll % 65536 / 1.0f, llllIIIIlIIIlIlllIll / 65536 / 1.0f);
                lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI(1.0f, 1.0f, 1.0f, 1.0f);
            }
            final IlIlIlIlIlllllllllIl lIlIlIIIllIIllIIIllI = ilIIIlIlIIIllIlIlIIl.lIlIlIIIllIIllIIIllI();
            if (!this.lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll(lIlIlIIIllIIllIIIllI, false)) {
                return;
            }
            if (llIllIlIlIIIIIIIllII.llllIIIIlIIIlIlllIll()) {
                llIllIlIlIIIIIIIllII.llIllIIIIIllIlIIIIlI();
            }
            this.llllIIIIlIIIlIlllIll(ilIIIlIlIIIllIlIlIIl, lIlIlIIIllIIllIIIllI.lIIIIlIIIIIlllIllIII() - net.minecraft.client.lIIIlllIIIllIIIllIII.IllIIlllIIIIlllIIlIl.IIIIlllIIIIIIlIIIlll.IlIIIlIlIIIllIlIlIIl, lIlIlIIIllIIllIIIllI.lIIIlllIIIllIIIllIII() - net.minecraft.client.lIIIlllIIIllIIIllIII.IllIIlllIIIIlllIIlIl.IIIIlllIIIIIIlIIIlll.IlIlIIIllIllIIIIIllI, lIlIlIIIllIIllIIIllI.llIIlIIIlIIIllIlIIIl() - net.minecraft.client.lIIIlllIIIllIIIllIII.IllIIlllIIIIlllIIlIl.IIIIlllIIIIIIlIIIlll.IllIIlllIIIIlllIIlIl, n, n2);
            if (llIllIlIlIIIIIIIllII.llllIIIIlIIIlIlllIll()) {
                if (llIllIlIlIIIIIIIllII.IlIIIlIlIIIllIlIlIIl()) {
                    llIllIlIlIIIIIIIllII.IlIlIIIllIllIIIIIllI();
                    this.llllIIIIlIIIlIlllIll(ilIIIlIlIIIllIlIlIIl, lIlIlIIIllIIllIIIllI.lIIIIlIIIIIlllIllIII() - net.minecraft.client.lIIIlllIIIllIIIllIII.IllIIlllIIIIlllIIlIl.IIIIlllIIIIIIlIIIlll.IlIIIlIlIIIllIlIlIIl, lIlIlIIIllIIllIIIllI.lIIIlllIIIllIIIllIII() - net.minecraft.client.lIIIlllIIIllIIIllIII.IllIIlllIIIIlllIIlIl.IIIIlllIIIIIIlIIIlll.IlIlIIIllIllIIIIIllI, lIlIlIIIllIIllIIIllI.llIIlIIIlIIIllIlIIIl() - net.minecraft.client.lIIIlllIIIllIIIllIII.IllIIlllIIIIlllIIlIl.IIIIlllIIIIIIlIIIlll.IllIIlllIIIIlllIIlIl, n, n2);
                    llIllIlIlIIIIIIIllII.IllIIlllIIIIlllIIlIl();
                }
                llIllIlIlIIIIIIIllII.llllIIIlIlllIlIIIIIl();
            }
        }
    }
    
    public void llllIIIIlIIIlIlllIll(final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl, final double n, final double n2, final double n3, final float n4) {
        this.llllIIIIlIIIlIlllIll(ilIIIlIlIIIllIlIlIIl, n, n2, n3, n4, -1);
    }
    
    public void llllIIIIlIIIlIlllIll(final IlIIIlIlIIIllIlIlIIl llllIIllllIlIlIIIIll, final double n, final double n2, final double n3, final float n4, final int n5) {
        final net.minecraft.client.lIIIlllIIIllIIIllIII.IllIIlllIIIIlllIIlIl.IIlllIIlIllIllIlIIll llllIIIIlIIIlIlllIll = this.llllIIIIlIIIlIlllIll(llllIIllllIlIlIIIIll);
        if (llllIIIIlIIIlIlllIll != null) {
            try {
                this.llllIIllllIlIlIIIIll = llllIIllllIlIlIIIIll;
                if (this.IIlllIIlIllIllIlIIll && net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.IlIlIlIlIlllllllllIl(llllIIllllIlIlIIIIll, net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.B, new Object[0])) {
                    llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(llllIIllllIlIlIIIIll, n, n2, n3, n4, n5, this.IlIllIlIlIIIlIlIlIII.llIllIIIIIllIlIIIIlI());
                }
                else {
                    llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(llllIIllllIlIlIIIIll, n, n2, n3, n4, n5);
                }
                this.llllIIllllIlIlIIIIll = null;
            }
            catch (Throwable t) {
                final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll2 = net.minecraft.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(t, "Rendering Block Entity");
                llllIIllllIlIlIIIIll.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll2.llllIIIIlIIIlIlllIll("Block Entity Details"));
                throw new IIlIlllIlIlllIlIllll(llllIIIIlIIIlIlllIll2);
            }
        }
    }
    
    public void llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII liiiIlIIIIIlllIllIII) {
        this.lIIIIlIIIIIlllIllIII = liiiIlIIIIIlllIllIII;
    }
    
    public FontRenderer llllIIIIlIIIlIlllIll() {
        return this.llIllIIIIIllIlIIIIlI;
    }
    
    public void IlIlIlIlIlllllllllIl() {
        this.IlIllIlIlIIIlIlIlIII.llIllIIIIIllIlIIIIlI().llllIIIIlIIIlIlllIll(7, net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll);
        this.IIlllIIlIllIllIlIIll = true;
    }
    
    public void llllIIIIlIIIlIlllIll(final int n) {
        this.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll(IlIlIIIIIIlllIlIllIl.IlIlIlIlIlllllllllIl);
        lIlIIlllIIlIIlIlllIl.llllIIIIlIIIlIlllIll();
        lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(770, 771);
        lllllIlIIIlIlIIlllII.lIlIlIIIllIIllIIIllI();
        lllllIlIIIlIlIIlllII.IlIllIlIlIIIlIlIlIII();
        if (Minecraft.IIlIIIIlllIlllllIlII()) {
            lllllIlIIIlIlIIlllII.llIIlIIIlIIIllIlIIIl(7425);
        }
        else {
            lllllIlIIIlIlIIlllII.llIIlIIIlIIIllIlIIIl(7424);
        }
        if (n > 0) {
            this.IlIllIlIlIIIlIlIlIII.llIllIIIIIllIlIIIIlI().llllIIIIlIIIlIlllIll((float)net.minecraft.client.lIIIlllIIIllIIIllIII.IllIIlllIIIIlllIIlIl.IIIIlllIIIIIIlIIIlll.IlIIIlIlIIIllIlIlIIl, (float)net.minecraft.client.lIIIlllIIIllIIIllIII.IllIIlllIIIIlllIIlIl.IIIIlllIIIIIIlIIIlll.IlIlIIIllIllIIIIIllI, (float)net.minecraft.client.lIIIlllIIIllIIIllIII.IllIIlllIIIIlllIIlIl.IIIIlllIIIIIIlIIIlll.IllIIlllIIIIlllIIlIl);
        }
        this.IlIllIlIlIIIlIlIlIII.IlIlIlIlIlllllllllIl();
        lIlIIlllIIlIIlIlllIl.IlIlIlIlIlllllllllIl();
        this.IIlllIIlIllIllIlIIll = false;
    }
}
