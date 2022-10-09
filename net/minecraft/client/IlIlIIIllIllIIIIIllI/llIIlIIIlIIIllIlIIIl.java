package net.minecraft.client.IlIlIIIllIllIIIIIllI;

import net.minecraft.client.IllIIlllIIIIlllIIlIl.*;
import net.minecraft.client.*;
import net.minecraft.IlIllIlIlIIIlIlIlIII.*;
import com.google.common.collect.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIlIlllIlIIIIIl.*;
import net.optifine.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl.*;
import net.minecraft.client.llllIIIIlIIIlIlllIll.*;
import leaf.*;
import java.util.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.llIllIlIIIIllIlIIllI.*;
import java.util.concurrent.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.client.llllIIIlIlllIlIIIIIl.*;

public class llIIlIIIlIIIllIlIIIl extends IlllllllIIIlIIIlIlII
{
    private lIIIIlIIIIIlllIllIII llIIlllIIlllIIllIllI;
    private llllIIIIlIIIlIlllIll IIlllIIIlIlllIIlllII;
    private final Set IIlIIIIIllIlIIIlIIll;
    private final Set llllllIllIllIlIllllI;
    private final Minecraft IIIllllllIllIIIlllIl;
    private final Set IlIIIlIIIllllIlIlIlI;
    private boolean IIIIIllIIIIlIIIIllIl;
    
    public llIIlIIIlIIIllIlIIIl(final lIIIIlIIIIIlllIllIII llIIlllIIlllIIllIllI, final IlllIIIIlIIIlIlIlIIl illlIIIIlIIIlIlIlIIl, final int n, final IllIIlllIIIIlllIIlIl illIIlllIIIIlllIIlIl, final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl) {
        super(new IlIlIIIllIIllIlllllI(), new llllIIllllIlIlIIIIll(illlIIIIlIIIlIlIlIIl, "MpServer"), net.minecraft.IIIlIIlIIIIlllIlllII.lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(n), ilIIIlIlIIIllIlIlIIl, true);
        this.IIlIIIIIllIlIIIlIIll = Sets.newHashSet();
        this.llllllIllIllIlIllllI = Sets.newHashSet();
        this.IIIllllllIllIIIlllIl = Minecraft.getMinecraft();
        this.IlIIIlIIIllllIlIlIlI = Sets.newHashSet();
        this.IIIIIllIIIIlIIIIllIl = false;
        this.llIIlllIIlllIIllIllI = llIIlllIIlllIIllIllI;
        this.lIllllllIIllIlIlIlII().llllIIIIlIIIlIlllIll(illIIlllIIIIlllIIlIl);
        this.IlIllIlIlIIIlIlIlIII.llllIIIIlIIIlIlllIll(this);
        this.IIlllIlIIllIlIlIlIIl(new IlIlIlIlIlllllllllIl(8, 64, 8));
        this.lllIIIIlllllIlIIllIl = this.IlIlIlIlIlllllllllIl();
        this.IlIlIIIlIIlIlIIlllIl = new lIIIlllIIIllIIIllIII();
        this.lllIIIIlllllIlIIllIl();
        this.IlIlIIIIIIlllIlIllIl();
        net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll(net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.aO, this);
        if (this.IIIllllllIllIIIlllIl.llIllIIIIIllIlIIIIlI != null && this.IIIllllllIllIIIlllIl.llIllIIIIIllIlIIIIlI.getClass() == net.minecraft.client.IlIlIIIllIllIIIIIllI.IlIIIlIlIIIllIlIlIIl.class) {
            this.IIIllllllIllIIIlllIl.llIllIIIIIllIlIIIIlI = new net.optifine.IllIIlllIIIIlllIIlIl.IlIlIlIlIlllllllllIl(this.IIIllllllIllIIIlllIl, llIIlllIIlllIIllIllI);
            net.optifine.llIIIlIlIllIIlIlIlII.llllIIIIlIIIlIlllIll((net.optifine.IllIIlllIIIIlllIIlIl.IlIlIlIlIlllllllllIl)this.IIIllllllIllIIIlllIl.llIllIIIIIllIlIIIIlI);
        }
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll() {
        super.llllIIIIlIIIlIlllIll();
        this.IlIlIlIlIlllllllllIl(this.IIIlIIlIIIIlllIlllII() + 1L);
        if (this.llIIlllIIlllIIllIllI().IlIlIlIlIlllllllllIl("doDaylightCycle")) {
            this.llllIIIIlIIIlIlllIll(this.IlIlIllllllllIIIIlII() + 1L);
        }
        this.IIlIIIIlllIlllllIlII.llllIIIIlIIIlIlllIll("reEntryProcessing");
        for (int n = 0; n < 10 && !this.llllllIllIllIlIllllI.isEmpty(); ++n) {
            final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI = this.llllllIllIllIlIllllI.iterator().next();
            this.llllllIllIllIlIllllI.remove(llIllIIIIIllIlIIIIlI);
            if (!this.IlIlIlIlIlllllllllIl.contains(llIllIIIIIllIlIIIIlI)) {
                this.llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI);
            }
        }
        this.IIlIIIIlllIlllllIlII.llIllIIIIIllIlIIIIlI("chunkCache");
        this.IIlllIIIlIlllIIlllII.IlIlIlIlIlllllllllIl();
        this.IIlIIIIlllIlllllIlII.llIllIIIIIllIlIIIIlI("blocks");
        this.llIllIIIIIllIlIIIIlI();
        this.IIlIIIIlllIlllllIlII.IlIlIlIlIlllllllllIl();
    }
    
    public void llllIIIIlIIIlIlllIll(final int n, final int n2, final int n3, final int n4, final int n5, final int n6) {
    }
    
    @Override
    protected net.minecraft.IIIlIIlIIIIlllIlllII.llIllIIIIIllIlIIIIlI.lIIIIlIIIIIlllIllIII IlIlIlIlIlllllllllIl() {
        return this.IIlllIIIlIlllIIlllII = new llllIIIIlIIIlIlllIll(this);
    }
    
    @Override
    protected void llIllIIIIIllIlIIIIlI() {
        super.llIllIIIIIllIlIIIIlI();
        this.IlIIIlIIIllllIlIlIlI.retainAll(this.IIlllIlIIllIlIlIlIIl);
        if (this.IlIIIlIIIllllIlIlIlI.size() == this.IIlllIlIIllIlIlIlIIl.size()) {
            this.IlIIIlIIIllllIlIlIlI.clear();
        }
        int n = 0;
        for (final net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl : this.IIlllIlIIllIlIlIlIIl) {
            if (!this.IlIIIlIIIllllIlIlIlI.contains(ilIlIlIlIlllllllllIl)) {
                final int n2 = ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll * 16;
                final int n3 = ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl * 16;
                this.IIlIIIIlllIlllllIlII.llllIIIIlIIIlIlllIll("getChunk");
                this.llllIIIIlIIIlIlllIll(n2, n3, this.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll, ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl));
                this.IIlIIIIlllIlllllIlII.IlIlIlIlIlllllllllIl();
                this.IlIIIlIIIllllIlIlIlI.add(ilIlIlIlIlllllllllIl);
                if (++n >= 10) {
                    return;
                }
                continue;
            }
        }
    }
    
    public void llllIIIIlIIIlIlllIll(final int n, final int n2, final boolean b) {
        if (b) {
            this.IIlllIIIlIlllIIlllII.llIllIIIIIllIlIIIIlI(n, n2);
        }
        else {
            this.IIlllIIIlIlllIIlllII.IlIlIlIlIlllllllllIl(n, n2);
        }
        if (!b) {
            this.IlIlIlIlIlllllllllIl(n * 16, 0, n2 * 16, n * 16 + 15, 256, n2 * 16 + 15);
        }
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll(final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI) {
        final boolean llllIIIIlIIIlIlllIll = super.llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI);
        this.IIlIIIIIllIlIIIlIIll.add(llIllIIIIIllIlIIIIlI);
        if (!llllIIIIlIIIlIlllIll) {
            this.llllllIllIllIlIllllI.add(llIllIIIIIllIlIIIIlI);
        }
        else if (llIllIIIIIllIlIIIIlI instanceof llIllIlIIIIllIlIIllI) {
            this.IIIllllllIllIIIlllIl.IlIIlIlIIIlIIlIlIlII().llllIIIIlIIIlIlllIll(new llllIIIlIlllIlIIIIIl((llIllIlIIIIllIlIIllI)llIllIIIIIllIlIIIIlI));
        }
        return llllIIIIlIIIlIlllIll;
    }
    
    @Override
    public void IlIlIlIlIlllllllllIl(final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI) {
        super.IlIlIlIlIlllllllllIl(llIllIIIIIllIlIIIIlI);
        this.IIlIIIIIllIlIIIlIIll.remove(llIllIIIIIllIlIIIIlI);
    }
    
    @Override
    protected void llIllIIIIIllIlIIIIlI(final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI) {
        super.llIllIIIIIllIlIIIIlI(llIllIIIIIllIlIIIIlI);
        if (this.llllllIllIllIlIllllI.contains(llIllIIIIIllIlIIIIlI)) {
            this.llllllIllIllIlIllllI.remove(llIllIIIIIllIlIIIIlI);
        }
    }
    
    @Override
    protected void IlIIIlIlIIIllIlIlIIl(final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI) {
        super.IlIIIlIlIIIllIlIlIIl(llIllIIIIIllIlIIIIlI);
        if (this.IIlIIIIIllIlIIIlIIll.contains(llIllIIIIIllIlIIIIlI)) {
            if (llIllIIIIIllIlIIIIlI.llllIllllIllllIlIlII()) {
                this.llllllIllIllIlIllllI.add(llIllIIIIIllIlIIIIlI);
            }
            else {
                this.IIlIIIIIllIlIIIlIIll.remove(llIllIIIIIllIlIIIIlI);
            }
        }
    }
    
    public void llllIIIIlIIIlIlllIll(final int n, final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI) {
        final llIllIIIIIllIlIIIIlI llllIIIIlIIIlIlllIll = this.llllIIIIlIIIlIlllIll(n);
        if (llllIIIIlIIIlIlllIll != null) {
            this.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll);
        }
        this.IIlIIIIIllIlIIIlIIll.add(llIllIIIIIllIlIIIIlI);
        llIllIIIIIllIlIIIIlI.IlIIIlIlIIIllIlIlIIl(n);
        if (!this.llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI)) {
            this.llllllIllIllIlIllllI.add(llIllIIIIIllIlIIIIlI);
        }
        this.lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll(n, llIllIIIIIllIlIIIIlI);
    }
    
    @Override
    public llIllIIIIIllIlIIIIlI llllIIIIlIIIlIlllIll(final int n) {
        return (n == this.IIIllllllIllIIIlllIl.lIIIIlIIIIIlllIllIII.IlllIIIIlIIIlIlIlIIl()) ? this.IIIllllllIllIIIlllIl.lIIIIlIIIIIlllIllIII : super.llllIIIIlIIIlIlllIll(n);
    }
    
    public llIllIIIIIllIlIIIIlI IlIlIlIlIlllllllllIl(final int n) {
        final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI = (llIllIIIIIllIlIIIIlI)this.lIIIIlIIIIIlllIllIII.IlIIIlIlIIIllIlIlIIl(n);
        if (llIllIIIIIllIlIIIIlI != null) {
            if (llIllIIIIIllIlIIIIlI instanceof net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll && Leaf.instance.modManager.killEffectMod.bypass) {
                Leaf.instance.modManager.killEffectMod.llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI);
            }
            this.IIlIIIIIllIlIIIlIIll.remove(llIllIIIIIllIlIIIIlI);
            this.IlIlIlIlIlllllllllIl(llIllIIIIIllIlIIIIlI);
        }
        return llIllIIIIIllIlIIIIlI;
    }
    
    public boolean llllIIIIlIIIlIlllIll(final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl) {
        final int liiiIlIIIIIlllIllIII = ilIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII();
        final int liiIlllIIIllIIIllIII = ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII();
        final int llIIlIIIlIIIllIlIIIl2 = ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl();
        this.llllIIIIlIIIlIlllIll(liiiIlIIIIIlllIllIII, liiIlllIIIllIIIllIII, llIIlIIIlIIIllIlIIIl2, liiiIlIIIIIlllIllIII, liiIlllIIIllIIIllIII, llIIlIIIlIIIllIlIIIl2);
        return super.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl, llIIlIIIlIIIllIlIIIl, 3);
    }
    
    @Override
    public void IlIIIlIlIIIllIlIlIIl() {
        this.llIIlllIIlllIIllIllI.IlIlIlIlIlllllllllIl().llllIIIIlIIIlIlllIll(new IlIlIIIIIIlllIlIllIl("Quitting"));
    }
    
    @Override
    protected void IlIlIIIllIllIIIIIllI() {
    }
    
    @Override
    protected int IllIIlllIIIIlllIIlIl() {
        return this.IIIllllllIllIIIlllIl.IIIlIIIlIlIIlllIIlll.llIllIIIIIllIlIIIIlI;
    }
    
    public void llllIIIIlIIIlIlllIll(final int n, final int n2, final int n3) {
        final int n4 = 16;
        final Random random = new Random();
        final lllIIIIlIlIllIIlIIIl n5 = this.IIIllllllIllIIIlllIl.lIIIIlIIIIIlllIllIII.n();
        final boolean b = this.IIIllllllIllIIIlllIl.llIllIIIIIllIlIIIIlI.lIlIlIIIllIIllIIIllI() == lllIllIIIllllllIllll.llIllIIIIIllIlIIIIlI && n5 != null && net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(n5.llllIIIIlIIIlIlllIll()) == net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.az;
        final net.minecraft.IlllllllIIIlIIIlIlII.llllIIIlIlllIlIIIIIl llllIIIlIlllIlIIIIIl = new net.minecraft.IlllllllIIIlIIIlIlII.llllIIIlIlllIlIIIIIl();
        for (int i = 0; i < 1000; ++i) {
            final int n6 = n + this.llllIIllllIlIlIIIIll.nextInt(n4) - this.llllIIllllIlIlIIIIll.nextInt(n4);
            final int n7 = n2 + this.llllIIllllIlIlIIIIll.nextInt(n4) - this.llllIIllllIlIlIIIIll.nextInt(n4);
            final int n8 = n3 + this.llllIIllllIlIlIIIIll.nextInt(n4) - this.llllIIllllIlIlIIIIll.nextInt(n4);
            llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl(n6, n7, n8);
            final net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.llIIlIIIlIIIllIlIIIl ilIlIlIlIlllllllllIl = this.IlIlIlIlIlllllllllIl(llllIIIlIlllIlIIIIIl);
            ilIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI().llIllIIIIIllIlIIIIlI(this, llllIIIlIlllIlIIIIIl, ilIlIlIlIlllllllllIl, random);
            if (b && ilIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI() == net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.az) {
                this.llllIIIIlIIIlIlllIll(IlIllllIIlIIlIlIlIll.IlIIIlIIIllllIlIlIlI, n6 + 0.5f, n7 + 0.5f, n8 + 0.5f, 0.0, 0.0, 0.0, new int[0]);
            }
        }
    }
    
    public void llllIIIlIlllIlIIIIIl() {
        this.IlIlIlIlIlllllllllIl.removeAll(this.llIllIIIIIllIlIIIIlI);
        for (int i = 0; i < this.llIllIIIIIllIlIIIIlI.size(); ++i) {
            final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI = this.llIllIIIIIllIlIIIIlI.get(i);
            final int lllllIIlIlIIIlIlIIIl = llIllIIIIIllIlIIIIlI.lllllIIlIlIIIlIlIIIl;
            final int llllIllllIllllIlIlII = llIllIIIIIllIlIIIIlI.llllIllllIllllIlIlII;
            if (llIllIIIIIllIlIIIIlI.IlIIlllllIIllIIlllll && this.IlIlIlIlIlllllllllIl(lllllIIlIlIIIlIlIIIl, llllIllllIllllIlIlII, true)) {
                this.llllIIIIlIIIlIlllIll(lllllIIlIlIIIlIlIIIl, llllIllllIllllIlIlII).IlIlIlIlIlllllllllIl(llIllIIIIIllIlIIIIlI);
            }
        }
        for (int j = 0; j < this.llIllIIIIIllIlIIIIlI.size(); ++j) {
            this.IlIIIlIlIIIllIlIlIIl((llIllIIIIIllIlIIIIlI)this.llIllIIIIIllIlIIIIlI.get(j));
        }
        this.llIllIIIIIllIlIIIIlI.clear();
        for (int k = 0; k < this.IlIlIlIlIlllllllllIl.size(); ++k) {
            final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI2 = this.IlIlIlIlIlllllllllIl.get(k);
            if (llIllIIIIIllIlIIIIlI2.IIIlIIIlIlIIlllIIlll != null) {
                if (!llIllIIIIIllIlIIIIlI2.IIIlIIIlIlIIlllIIlll.IIlIlIlIIlIllIIIIIIl && llIllIIIIIllIlIIIIlI2.IIIlIIIlIlIIlllIIlll.IIllIIllIIIlIlIIIIlI == llIllIIIIIllIlIIIIlI2) {
                    continue;
                }
                llIllIIIIIllIlIIIIlI2.IIIlIIIlIlIIlllIIlll.IIllIIllIIIlIlIIIIlI = null;
                llIllIIIIIllIlIIIIlI2.IIIlIIIlIlIIlllIIlll = null;
            }
            if (llIllIIIIIllIlIIIIlI2.IIlIlIlIIlIllIIIIIIl) {
                final int lllllIIlIlIIIlIlIIIl2 = llIllIIIIIllIlIIIIlI2.lllllIIlIlIIIlIlIIIl;
                final int llllIllllIllllIlIlII2 = llIllIIIIIllIlIIIIlI2.llllIllllIllllIlIlII;
                if (llIllIIIIIllIlIIIIlI2.IlIIlllllIIllIIlllll && this.IlIlIlIlIlllllllllIl(lllllIIlIlIIIlIlIIIl2, llllIllllIllllIlIlII2, true)) {
                    this.llllIIIIlIIIlIlllIll(lllllIIlIlIIIlIlIIIl2, llllIllllIllllIlIlII2).IlIlIlIlIlllllllllIl(llIllIIIIIllIlIIIIlI2);
                }
                this.IlIlIlIlIlllllllllIl.remove(k--);
                this.IlIIIlIlIIIllIlIlIIl(llIllIIIIIllIlIIIIlI2);
            }
        }
    }
    
    @Override
    public net.minecraft.llIllIIIIIllIlIIIIlI.lIIIlllIIIllIIIllIII llllIIIIlIIIlIlllIll(final net.minecraft.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        final net.minecraft.llIllIIIIIllIlIIIIlI.lIIIlllIIIllIIIllIII llllIIIIlIIIlIlllIll2 = super.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll);
        llllIIIIlIIIlIlllIll2.llllIIIIlIIIlIlllIll("Forced entities", new net.minecraft.client.IlIlIIIllIllIIIIIllI.llIllIlIIIIllIlIIllI(this));
        llllIIIIlIIIlIlllIll2.llllIIIIlIIIlIlllIll("Retry entities", new net.minecraft.client.IlIlIIIllIllIIIIIllI.lIlIlIIIllIIllIIIllI(this));
        llllIIIIlIIIlIlllIll2.llllIIIIlIIIlIlllIll("Server brand", new net.minecraft.client.IlIlIIIllIllIIIIIllI.IlIlIIIllIIllIlllllI(this));
        llllIIIIlIIIlIlllIll2.llllIIIIlIIIlIlllIll("Server type", new IIIIlllIIIIIIlIIIlll(this));
        return llllIIIIlIIIlIlllIll2;
    }
    
    public void llllIIIIlIIIlIlllIll(final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final String s, final float n, final float n2, final boolean b) {
        this.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII() + 0.5, ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII() + 0.5, ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl() + 0.5, s, n, n2, b);
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final double n, final double n2, final double n3, final String s, final float n4, final float n5, final boolean b) {
        final double ilIlIIIllIllIIIIIllI = this.IIIllllllIllIIIlllIl.lIIIIlIlIllllIIlIllI().IlIlIIIllIllIIIIIllI(n, n2, n3);
        final net.minecraft.client.llllIIIIlIIIlIlllIll.lIlIlIIIllIIllIIIllI lIlIlIIIllIIllIIIllI = new net.minecraft.client.llllIIIIlIIIlIlllIll.lIlIlIIIllIIllIIIllI(new lIllllIllIllIIllllll(s), n4, n5, (float)n, (float)n2, (float)n3);
        if (b && ilIlIIIllIllIIIIIllI > 100.0) {
            this.IIIllllllIllIIIlllIl.IlIIlIlIIIlIIlIlIlII().llllIIIIlIIIlIlllIll(lIlIlIIIllIIllIIIllI, (int)(Math.sqrt(ilIlIIIllIllIIIIIllI) / 40.0 * 20.0));
        }
        else {
            this.IIIllllllIllIIIlllIl.IlIIlIlIIIlIIlIlIlII().llllIIIIlIIIlIlllIll(lIlIlIIIllIIllIIIllI);
        }
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final double n, final double n2, final double n3, final double n4, final double n5, final double n6, final net.minecraft.lIlIlIIIllIIllIIIllI.IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll) {
        this.IIIllllllIllIIIlllIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(new net.minecraft.client.llllIIIlIlllIlIIIIIl.IlllIIIIlIIIlIlIlIIl(this, n, n2, n3, n4, n5, n6, this.IIIllllllIllIIIlllIl.llIIlIIIlIIIllIlIIIl, iiiIlllIIIIIIlIIIlll));
    }
    
    public void llllIIIIlIIIlIlllIll(final net.minecraft.lllIIIIlllllIlIIllIl.llIIlIIIlIIIllIlIIIl iiIlIIlIIIIlllIlllII) {
        this.IIIlIIlIIIIlllIlllII = iiIlIIlIIIIlllIlllII;
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(long n) {
        if (n < 0L) {
            n = -n;
            this.llIIlllIIlllIIllIllI().llllIIIIlIIIlIlllIll("doDaylightCycle", "false");
        }
        else {
            this.llIIlllIIlllIIllIllI().llllIIIIlIIIlIlllIll("doDaylightCycle", "true");
        }
        super.llllIIIIlIIIlIlllIll(n);
    }
    
    @Override
    public int llllIIIIlIIIlIlllIll(final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final int n) {
        int n2 = super.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl, n);
        if (net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.x()) {
            n2 = net.optifine.IlllIIIIlIIIlIlIlIIl.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl, n2);
        }
        return n2;
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll(final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final int n) {
        this.IIIIIllIIIIlIIIIllIl = this.llIlIIIIIlIIlIlIIlll();
        final boolean llllIIIIlIIIlIlllIll = super.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl, llIIlIIIlIIIllIlIIIl, n);
        this.IIIIIllIIIIlIIIIllIl = false;
        return llllIIIIlIIIlIlllIll;
    }
    
    private boolean llIlIIIIIlIIlIlIIlll() {
        return this.IIIllllllIllIIIlllIl.llIllIIIIIllIlIIIIlI instanceof net.optifine.IllIIlllIIIIlllIIlIl.IlIlIlIlIlllllllllIl && ((net.optifine.IllIIlllIIIIlllIIlIl.IlIlIlIlIlllllllllIl)this.IIIllllllIllIIIlllIl.llIllIIIIIllIlIIIIlI).IIIIlllIIIIIIlIIIlll();
    }
    
    public boolean lIIIIlIIIIIlllIllIII() {
        return this.IIIIIllIIIIlIIIIllIl;
    }
}
