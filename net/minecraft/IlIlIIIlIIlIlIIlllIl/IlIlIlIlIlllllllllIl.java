package net.minecraft.IlIlIIIlIIlIlIIlllIl;

import com.google.common.collect.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;
import java.util.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.lIlIlIIIllIIllIIIllI.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;

public abstract class IlIlIlIlIlllllllllIl
{
    private int llllIIIIlIIIlIlllIll;
    private String IlIlIlIlIlllllllllIl;
    private final List llIllIIIIIllIlIIIIlI;
    private llIllIIIIIllIlIIIIlI IlIIIlIlIIIllIlIlIIl;
    private double IlIlIIIllIllIIIIIllI;
    private double IllIIlllIIIIlllIIlIl;
    private int llllIIIlIlllIlIIIIIl;
    private int lIIIIlIIIIIlllIllIII;
    private int lIIIlllIIIllIIIllIII;
    private net.minecraft.llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI llIIlIIIlIIIllIlIIIl;
    private int llIllIlIIIIllIlIIllI;
    private int lIlIlIIIllIIllIIIllI;
    private int IlIlIIIllIIllIlllllI;
    
    public IlIlIlIlIlllllllllIl() {
        this.llllIIIIlIIIlIlllIll = 20;
        this.IlIlIlIlIlllllllllIl = "Pig";
        this.llIllIIIIIllIlIIIIlI = Lists.newArrayList();
        this.llllIIIlIlllIlIIIIIl = 200;
        this.lIIIIlIIIIIlllIllIII = 800;
        this.lIIIlllIIIllIIIllIII = 4;
        this.llIllIlIIIIllIlIIllI = 6;
        this.lIlIlIIIllIIllIIIllI = 16;
        this.IlIlIIIllIIllIlllllI = 4;
    }
    
    private String IllIIlllIIIIlllIIlIl() {
        if (this.lIIIlllIIIllIIIllIII() == null) {
            if (this.IlIlIlIlIlllllllllIl != null && this.IlIlIlIlIlllllllllIl.equals("Minecart")) {
                this.IlIlIlIlIlllllllllIl = "MinecartRideable";
            }
            return this.IlIlIlIlIlllllllllIl;
        }
        return this.lIIIlllIIIllIIIllIII().IlIIIlIlIIIllIlIlIIl;
    }
    
    public void llllIIIIlIIIlIlllIll(final String ilIlIlIlIlllllllllIl) {
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
    }
    
    private boolean llllIIIlIlllIlIIIIIl() {
        final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl = this.IlIlIlIlIlllllllllIl();
        return this.llllIIIIlIIIlIlllIll().IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII() + 0.5, ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII() + 0.5, ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl() + 0.5, this.lIlIlIIIllIIllIIIllI);
    }
    
    public void llIllIIIIIllIlIIIIlI() {
        if (this.llllIIIlIlllIlIIIIIl()) {
            final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl = this.IlIlIlIlIlllllllllIl();
            if (this.llllIIIIlIIIlIlllIll().IlIlIllllllllIIIIlII) {
                final double n = ilIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII() + this.llllIIIIlIIIlIlllIll().llllIIllllIlIlIIIIll.nextFloat();
                final double n2 = ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII() + this.llllIIIIlIIIlIlllIll().llllIIllllIlIlIIIIll.nextFloat();
                final double n3 = ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl() + this.llllIIIIlIIIlIlllIll().llllIIllllIlIlIIIIll.nextFloat();
                this.llllIIIIlIIIlIlllIll().llllIIIIlIIIlIlllIll(IlIllllIIlIIlIlIlIll.lIlIlIIIllIIllIIIllI, n, n2, n3, 0.0, 0.0, 0.0, new int[0]);
                this.llllIIIIlIIIlIlllIll().llllIIIIlIIIlIlllIll(IlIllllIIlIIlIlIlIll.IIlllIlIIllIlIlIlIIl, n, n2, n3, 0.0, 0.0, 0.0, new int[0]);
                if (this.llllIIIIlIIIlIlllIll > 0) {
                    --this.llllIIIIlIIIlIlllIll;
                }
                this.IllIIlllIIIIlllIIlIl = this.IlIlIIIllIllIIIIIllI;
                this.IlIlIIIllIllIIIIIllI = (this.IlIlIIIllIllIIIIIllI + 1000.0f / (this.llllIIIIlIIIlIlllIll + 200.0f)) % 360.0;
            }
            else {
                if (this.llllIIIIlIIIlIlllIll == -1) {
                    this.lIIIIlIIIIIlllIllIII();
                }
                if (this.llllIIIIlIIIlIlllIll > 0) {
                    --this.llllIIIIlIIIlIlllIll;
                    return;
                }
                boolean b = false;
                for (int i = 0; i < this.lIIIlllIIIllIIIllIII; ++i) {
                    final net.minecraft.llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI llllIIIIlIIIlIlllIll = IIIIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll(this.IllIIlllIIIIlllIIlIl(), this.llllIIIIlIIIlIlllIll());
                    if (llllIIIIlIIIlIlllIll == null) {
                        return;
                    }
                    if (this.llllIIIIlIIIlIlllIll().llllIIIIlIIIlIlllIll(((IlIllIlIlIIIlIlIlIII)llllIIIIlIIIlIlllIll).getClass(), new llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII(), ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII(), ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl(), ilIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII() + 1, ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII() + 1, ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl() + 1).IlIlIlIlIlllllllllIl(this.IlIlIIIllIIllIlllllI, this.IlIlIIIllIIllIlllllI, this.IlIlIIIllIIllIlllllI)).size() >= this.llIllIlIIIIllIlIIllI) {
                        this.lIIIIlIIIIIlllIllIII();
                        return;
                    }
                    final double n4 = ilIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII() + (this.llllIIIIlIIIlIlllIll().llllIIllllIlIlIIIIll.nextDouble() - this.llllIIIIlIIIlIlllIll().llllIIllllIlIlIIIIll.nextDouble()) * this.IlIlIIIllIIllIlllllI + 0.5;
                    final double n5 = ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII() + this.llllIIIIlIIIlIlllIll().llllIIllllIlIlIIIIll.nextInt(3) - 1;
                    final double n6 = ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl() + (this.llllIIIIlIIIlIlllIll().llllIIllllIlIlIIIIll.nextDouble() - this.llllIIIIlIIIlIlllIll().llllIIllllIlIlIIIIll.nextDouble()) * this.IlIlIIIllIIllIlllllI + 0.5;
                    final IlIllIlIlIIIlIlIlIII ilIllIlIlIIIlIlIlIII = (llllIIIIlIIIlIlllIll instanceof IlIllIlIlIIIlIlIlIII) ? ((IlIllIlIlIIIlIlIlIII)llllIIIIlIIIlIlllIll) : null;
                    llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(n4, n5, n6, this.llllIIIIlIIIlIlllIll().llllIIllllIlIlIIIIll.nextFloat() * 360.0f, 0.0f);
                    if (ilIllIlIlIIIlIlIlIII == null || (ilIllIlIlIIIlIlIlIII.lIlIlIIIllIIllIIIllI() && ilIllIlIlIIIlIlIlIII.k())) {
                        this.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll, true);
                        this.llllIIIIlIIIlIlllIll().IlIlIlIlIlllllllllIl(2004, ilIlIlIlIlllllllllIl, 0);
                        if (ilIllIlIlIIIlIlIlIII != null) {
                            ilIllIlIlIIIlIlIlIII.IIllllIIIlIIIIIIllIl();
                        }
                        b = true;
                    }
                }
                if (b) {
                    this.lIIIIlIIIIIlllIllIII();
                }
            }
        }
    }
    
    private net.minecraft.llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI llllIIIIlIIIlIlllIll(final net.minecraft.llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI, final boolean b) {
        if (this.lIIIlllIIIllIIIllIII() != null) {
            net.minecraft.lIlIlIIIllIIllIIIllI.IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll = new net.minecraft.lIlIlIIIllIIllIIIllI.IIIIlllIIIIIIlIIIlll();
            llIllIIIIIllIlIIIIlI.IlIIIlIlIIIllIlIlIIl(iiiIlllIIIIIIlIIIlll);
            for (final String s : this.lIIIlllIIIllIIIllIII().IlIlIlIlIlllllllllIl.IlIlIIIllIllIIIIIllI()) {
                iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll(s, this.lIIIlllIIIllIIIllIII().IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(s).IlIlIlIlIlllllllllIl());
            }
            llIllIIIIIllIlIIIIlI.IllIIlllIIIIlllIIlIl(iiiIlllIIIIIIlIIIlll);
            if (llIllIIIIIllIlIIIIlI.IlllllllIIIlIIIlIlII != null && b) {
                llIllIIIIIllIlIIIIlI.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI);
            }
            net.minecraft.llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI2 = llIllIIIIIllIlIIIIlI;
            while (iiiIlllIIIIIIlIIIlll.IlIlIlIlIlllllllllIl("Riding", 10)) {
                final net.minecraft.lIlIlIIIllIIllIIIllI.IIIIlllIIIIIIlIIIlll ilIlIIIllIIllIlllllI = iiiIlllIIIIIIlIIIlll.IlIlIIIllIIllIlllllI("Riding");
                final net.minecraft.llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI llllIIIIlIIIlIlllIll = IIIIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll(ilIlIIIllIIllIlllllI.llIIlIIIlIIIllIlIIIl("id"), llIllIIIIIllIlIIIIlI.IlllllllIIIlIIIlIlII);
                if (llllIIIIlIIIlIlllIll != null) {
                    final net.minecraft.lIlIlIIIllIIllIIIllI.IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll2 = new net.minecraft.lIlIlIIIllIIllIIIllI.IIIIlllIIIIIIlIIIlll();
                    llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl(iiiIlllIIIIIIlIIIlll2);
                    for (final String s2 : ilIlIIIllIIllIlllllI.IlIlIIIllIllIIIIIllI()) {
                        iiiIlllIIIIIIlIIIlll2.llllIIIIlIIIlIlllIll(s2, ilIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll(s2).IlIlIlIlIlllllllllIl());
                    }
                    llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl(iiiIlllIIIIIIlIIIlll2);
                    llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(llIllIIIIIllIlIIIIlI2.IIlllIlIIllIlIlIlIIl, llIllIIIIIllIlIIIIlI2.llIIIlIlIllIIlIlIlII, llIllIIIIIllIlIIIIlI2.lllllIlIIIlIlIIlllII, llIllIIIIIllIlIIIIlI2.IIlIIIIIllIlIIIlIIll, llIllIIIIIllIlIIIIlI2.llllllIllIllIlIllllI);
                    if (llIllIIIIIllIlIIIIlI.IlllllllIIIlIIIlIlII != null && b) {
                        llIllIIIIIllIlIIIIlI.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll);
                    }
                    llIllIIIIIllIlIIIIlI2.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll);
                }
                llIllIIIIIllIlIIIIlI2 = llllIIIIlIIIlIlllIll;
                iiiIlllIIIIIIlIIIlll = ilIlIIIllIIllIlllllI;
            }
        }
        else if (llIllIIIIIllIlIIIIlI instanceof lllIIIIlllllIlIIllIl && llIllIIIIIllIlIIIIlI.IlllllllIIIlIIIlIlII != null && b) {
            if (llIllIIIIIllIlIIIIlI instanceof IlIllIlIlIIIlIlIlIII) {
                ((IlIllIlIlIIIlIlIlIII)llIllIIIIIllIlIIIIlI).llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI.IlllllllIIIlIIIlIlII.lIllllllIIllIlIlIlII(new net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(llIllIIIIIllIlIIIIlI)), null);
            }
            llIllIIIIIllIlIIIIlI.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI);
        }
        return llIllIIIIIllIlIIIIlI;
    }
    
    private void lIIIIlIIIIIlllIllIII() {
        if (this.lIIIIlIIIIIlllIllIII <= this.llllIIIlIlllIlIIIIIl) {
            this.llllIIIIlIIIlIlllIll = this.llllIIIlIlllIlIIIIIl;
        }
        else {
            this.llllIIIIlIIIlIlllIll = this.llllIIIlIlllIlIIIIIl + this.llllIIIIlIIIlIlllIll().llllIIllllIlIlIIIIll.nextInt(this.lIIIIlIIIIIlllIllIII - this.llllIIIlIlllIlIIIIIl);
        }
        if (this.llIllIIIIIllIlIIIIlI.size() > 0) {
            this.llllIIIIlIIIlIlllIll((llIllIIIIIllIlIIIIlI)i.llllIIIIlIIIlIlllIll(this.llllIIIIlIIIlIlllIll().llllIIllllIlIlIIIIll, this.llIllIIIIIllIlIIIIlI));
        }
        this.llllIIIIlIIIlIlllIll(1);
    }
    
    public void llllIIIIlIIIlIlllIll(final net.minecraft.lIlIlIIIllIIllIIIllI.IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll) {
        this.IlIlIlIlIlllllllllIl = iiiIlllIIIIIIlIIIlll.llIIlIIIlIIIllIlIIIl("EntityId");
        this.llllIIIIlIIIlIlllIll = iiiIlllIIIIIIlIIIlll.IlIlIIIllIllIIIIIllI("Delay");
        this.llIllIIIIIllIlIIIIlI.clear();
        if (iiiIlllIIIIIIlIIIlll.IlIlIlIlIlllllllllIl("SpawnPotentials", 9)) {
            final IlIlIIIlIIlIlIIlllIl llIllIIIIIllIlIIIIlI = iiiIlllIIIIIIlIIIlll.llIllIIIIIllIlIIIIlI("SpawnPotentials", 10);
            for (int i = 0; i < llIllIIIIIllIlIIIIlI.IlIlIIIllIllIIIIIllI(); ++i) {
                this.llIllIIIIIllIlIIIIlI.add(new llIllIIIIIllIlIIIIlI(this, llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(i)));
            }
        }
        if (iiiIlllIIIIIIlIIIlll.IlIlIlIlIlllllllllIl("SpawnData", 10)) {
            this.llllIIIIlIIIlIlllIll(new llIllIIIIIllIlIIIIlI(this, iiiIlllIIIIIIlIIIlll.IlIlIIIllIIllIlllllI("SpawnData"), this.IlIlIlIlIlllllllllIl));
        }
        else {
            this.llllIIIIlIIIlIlllIll((llIllIIIIIllIlIIIIlI)null);
        }
        if (iiiIlllIIIIIIlIIIlll.IlIlIlIlIlllllllllIl("MinSpawnDelay", 99)) {
            this.llllIIIlIlllIlIIIIIl = iiiIlllIIIIIIlIIIlll.IlIlIIIllIllIIIIIllI("MinSpawnDelay");
            this.lIIIIlIIIIIlllIllIII = iiiIlllIIIIIIlIIIlll.IlIlIIIllIllIIIIIllI("MaxSpawnDelay");
            this.lIIIlllIIIllIIIllIII = iiiIlllIIIIIIlIIIlll.IlIlIIIllIllIIIIIllI("SpawnCount");
        }
        if (iiiIlllIIIIIIlIIIlll.IlIlIlIlIlllllllllIl("MaxNearbyEntities", 99)) {
            this.llIllIlIIIIllIlIIllI = iiiIlllIIIIIIlIIIlll.IlIlIIIllIllIIIIIllI("MaxNearbyEntities");
            this.lIlIlIIIllIIllIIIllI = iiiIlllIIIIIIlIIIlll.IlIlIIIllIllIIIIIllI("RequiredPlayerRange");
        }
        if (iiiIlllIIIIIIlIIIlll.IlIlIlIlIlllllllllIl("SpawnRange", 99)) {
            this.IlIlIIIllIIllIlllllI = iiiIlllIIIIIIlIIIlll.IlIlIIIllIllIIIIIllI("SpawnRange");
        }
        if (this.llllIIIIlIIIlIlllIll() != null) {
            this.llIIlIIIlIIIllIlIIIl = null;
        }
    }
    
    public void IlIlIlIlIlllllllllIl(final net.minecraft.lIlIlIIIllIIllIIIllI.IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll) {
        final String illIIlllIIIIlllIIlIl = this.IllIIlllIIIIlllIIlIl();
        if (!lIIlIIIIIIIlIIlIlIIl.IlIlIlIlIlllllllllIl(illIIlllIIIIlllIIlIl)) {
            iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("EntityId", illIIlllIIIIlllIIlIl);
            iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("Delay", (short)this.llllIIIIlIIIlIlllIll);
            iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("MinSpawnDelay", (short)this.llllIIIlIlllIlIIIIIl);
            iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("MaxSpawnDelay", (short)this.lIIIIlIIIIIlllIllIII);
            iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("SpawnCount", (short)this.lIIIlllIIIllIIIllIII);
            iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("MaxNearbyEntities", (short)this.llIllIlIIIIllIlIIllI);
            iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("RequiredPlayerRange", (short)this.lIlIlIIIllIIllIIIllI);
            iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("SpawnRange", (short)this.IlIlIIIllIIllIlllllI);
            if (this.lIIIlllIIIllIIIllIII() != null) {
                iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("SpawnData", this.lIIIlllIIIllIIIllIII().IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl());
            }
            if (this.lIIIlllIIIllIIIllIII() != null || this.llIllIIIIIllIlIIIIlI.size() > 0) {
                final IlIlIIIlIIlIlIIlllIl ilIlIIIlIIlIlIIlllIl = new IlIlIIIlIIlIlIIlllIl();
                if (this.llIllIIIIIllIlIIIIlI.size() > 0) {
                    final Iterator<llIllIIIIIllIlIIIIlI> iterator = this.llIllIIIIIllIlIIIIlI.iterator();
                    while (iterator.hasNext()) {
                        ilIlIIIlIIlIlIIlllIl.llllIIIIlIIIlIlllIll(iterator.next().llllIIIIlIIIlIlllIll());
                    }
                }
                else {
                    ilIlIIIlIIlIlIIlllIl.llllIIIIlIIIlIlllIll(this.lIIIlllIIIllIIIllIII().llllIIIIlIIIlIlllIll());
                }
                iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("SpawnPotentials", ilIlIIIlIIlIlIIlllIl);
            }
        }
    }
    
    public net.minecraft.llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII) {
        if (this.llIIlIIIlIIIllIlIIIl == null) {
            final net.minecraft.llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI llllIIIIlIIIlIlllIll = IIIIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll(this.IllIIlllIIIIlllIIlIl(), illlllllIIIlIIIlIlII);
            if (llllIIIIlIIIlIlllIll != null) {
                this.llIIlIIIlIIIllIlIIIl = this.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll, false);
            }
        }
        return this.llIIlIIIlIIIllIlIIIl;
    }
    
    public boolean IlIlIlIlIlllllllllIl(final int n) {
        if (n == 1 && this.llllIIIIlIIIlIlllIll().IlIlIllllllllIIIIlII) {
            this.llllIIIIlIIIlIlllIll = this.llllIIIlIlllIlIIIIIl;
            return true;
        }
        return false;
    }
    
    private llIllIIIIIllIlIIIIlI lIIIlllIIIllIIIllIII() {
        return this.IlIIIlIlIIIllIlIlIIl;
    }
    
    public void llllIIIIlIIIlIlllIll(final llIllIIIIIllIlIIIIlI ilIIIlIlIIIllIlIlIIl) {
        this.IlIIIlIlIIIllIlIlIIl = ilIIIlIlIIIllIlIlIIl;
    }
    
    public abstract void llllIIIIlIIIlIlllIll(final int p0);
    
    public abstract IlllllllIIIlIIIlIlII llllIIIIlIIIlIlllIll();
    
    public abstract net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl IlIlIlIlIlllllllllIl();
    
    public double IlIIIlIlIIIllIlIlIIl() {
        return this.IlIlIIIllIllIIIIIllI;
    }
    
    public double IlIlIIIllIllIIIIIllI() {
        return this.IllIIlllIIIIlllIIlIl;
    }
}
