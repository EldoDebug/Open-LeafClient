package net.minecraft.client.lIIIlllIIIllIIIllIII;

import com.google.common.collect.*;
import net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI.*;
import net.minecraft.client.llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl.*;
import java.util.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.*;
import net.minecraft.llllIIIIlIIIlIlllIll.*;

public class lIIIIlIIIIIlllIllIII
{
    private final Map llllIIIIlIIIlIlllIll;
    private final llllIIIIlIIIlIlllIll IlIlIlIlIlllllllllIl;
    private final IllIIlllIIIIlllIIlIl llIllIIIIIllIlIIIIlI;
    
    public lIIIIlIIIIIlllIllIII(final IllIIlllIIIIlllIIlIl llIllIIIIIllIlIIIIlI) {
        this.llllIIIIlIIIlIlllIll = Maps.newIdentityHashMap();
        this.IlIlIlIlIlllllllllIl = new llllIIIIlIIIlIlllIll();
        this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
        this.IlIIIlIlIIIllIlIlIIl();
    }
    
    public llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll() {
        return this.IlIlIlIlIlllllllllIl;
    }
    
    public IlIlIIIllIIllIlllllI llllIIIIlIIIlIlllIll(final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl) {
        final net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llIllIIIIIllIlIIIIlI = llIIlIIIlIIIllIlIIIl.llIllIIIIIllIlIIIIlI();
        IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl = this.IlIlIlIlIlllllllllIl(llIIlIIIlIIIllIlIIIl);
        if (ilIlIlIlIlllllllllIl == null || ilIlIlIlIlllllllllIl == this.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll()) {
            if (llIllIIIIIllIlIIIIlI == net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lllllIIIIIlIIlllIlIl || llIllIIIIIllIlIIIIlI == net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIlllllIllIllIlIlIII || llIllIIIIIllIlIIIIlI == net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lllllIIIIIlIlIIIIIIl || llIllIIIIIllIlIIIIlI == net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.ak || llIllIIIIIllIlIIIIlI == net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.aO || llIllIIIIIllIlIIIIlI == net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.aP) {
                return this.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl().llllIIIIlIIIlIlllIll("minecraft:blocks/planks_oak");
            }
            if (llIllIIIIIllIlIIIIlI == net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.U) {
                return this.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl().llllIIIIlIIIlIlllIll("minecraft:blocks/obsidian");
            }
            if (llIllIIIIIllIlIIIIlI == net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llIllIlIIIIllIlIIllI || llIllIIIIIllIlIIIIlI == net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lIlIlIIIllIIllIIIllI) {
                return this.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl().llllIIIIlIIIlIlllIll("minecraft:blocks/lava_still");
            }
            if (llIllIIIIIllIlIIIIlI == net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lIIIlllIIIllIIIllIII || llIllIIIIIllIlIIIIlI == net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl) {
                return this.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl().llllIIIIlIIIlIlllIll("minecraft:blocks/water_still");
            }
            if (llIllIIIIIllIlIIIIlI == net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.ai) {
                return this.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl().llllIIIIlIIIlIlllIll("minecraft:blocks/soul_sand");
            }
            if (llIllIIIIIllIlIIIIlI == net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.az) {
                return this.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl().llllIIIIlIIIlIlllIll("minecraft:items/barrier");
            }
        }
        if (ilIlIlIlIlllllllllIl == null) {
            ilIlIlIlIlllllllllIl = this.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll();
        }
        return ilIlIlIlIlllllllllIl.IlIlIIIllIllIIIIIllI();
    }
    
    public IlIlIlIlIlllllllllIl IlIlIlIlIlllllllllIl(final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl) {
        IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll = this.llllIIIIlIIIlIlllIll.get(llIIlIIIlIIIllIlIIIl);
        if (llllIIIIlIIIlIlllIll == null) {
            llllIIIIlIIIlIlllIll = this.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll();
        }
        return llllIIIIlIIIlIlllIll;
    }
    
    public IllIIlllIIIIlllIIlIl IlIlIlIlIlllllllllIl() {
        return this.llIllIIIIIllIlIIIIlI;
    }
    
    public void llIllIIIIIllIlIIIIlI() {
        this.llllIIIIlIIIlIlllIll.clear();
        for (final Map.Entry<llIIlIIIlIIIllIlIIIl, V> entry : this.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll().entrySet()) {
            this.llllIIIIlIIIlIlllIll.put(entry.getKey(), this.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll((llllIIIlIlllIlIIIIIl)entry.getValue()));
        }
    }
    
    public void llllIIIIlIIIlIlllIll(final net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI) {
        this.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll, llIllIIIIIllIlIIIIlI);
    }
    
    public void llllIIIIlIIIlIlllIll(final net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll... array) {
        this.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(array);
    }
    
    private void IlIIIlIlIIIllIlIlIIl() {
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lIIIlllIIIllIIIllIII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llIllIlIIIIllIlIIllI, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lIlIlIIIllIIllIIIllI, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIllllIIIlIIIIIIllIl, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lllllIIIIIlIlIIIIIIl, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.U, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.ak, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIlllllIllIllIlIlIII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.ai, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.J, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.az, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lllllIIIIIlIIlllIlIl, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.aP, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.aO);
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl, new IlIlIIIllIllIIIIIllI().llllIIIIlIIIlIlllIll(ct.IIIIIIIIIlllIllIlIlI).llllIIIIlIIIlIlllIll());
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.aM, new IlIlIIIllIllIIIIIllI().llllIIIIlIIIlIlllIll(ah.IIIIIIIIIlllIllIlIlI).llllIIIIlIIIlIlllIll());
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIllIIllIIIlIlIIIIlI, new IlIlIIIllIllIIIIIllI().llllIIIIlIIIlIlllIll(o.IllIllIIIIlIIlIlllII).llllIIIIlIIIlIlllIll("_leaves").llllIIIIlIIIlIlllIll(lIllIlIIIllllllIIlII.IIllllIIIlIIIIIIllIl, lIllIlIIIllllllIIlII.IIIIIIIIIlllIllIlIlI).llllIIIIlIIIlIlllIll());
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIIlIIIlIlIIlllIIlll, new IlIlIIIllIllIIIIIllI().llllIIIIlIIIlIlllIll(i.IllIllIIIIlIIlIlllII).llllIIIIlIIIlIlllIll("_leaves").llllIIIIlIIIlIlllIll(lIllIlIIIllllllIIlII.IIllllIIIlIIIIIIllIl, lIllIlIIIllllllIIlII.IIIIIIIIIlllIllIlIlI).llllIIIIlIIIlIlllIll());
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllllIIIIIIIlllIIll, new IlIlIIIllIllIIIIIllI().llllIIIIlIIIlIlllIll(new net.minecraft.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll[] { llIIIlIlIllIIlIlIlII.IIIIIIIIIlllIllIlIlI }).llllIIIIlIIIlIlllIll());
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lIllllIllIllIIllllll, new IlIlIIIllIllIIIIIllI().llllIIIIlIIIlIlllIll(new net.minecraft.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll[] { bj.IIIIIIIIIlllIllIlIlI }).llllIIIIlIIIlIlllIll());
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lllIIIIlIlIllIIlIIIl, new IlIlIIIllIllIIIIIllI().llllIIIIlIIIlIlllIll(new net.minecraft.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll[] { lIllllIllIllIIllllll.IIIIIIIIIlllIllIlIlI }).llllIIIIlIIIlIlllIll());
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.ab, new IlIlIIIllIllIIIIIllI().llllIIIIlIIIlIlllIll(new net.minecraft.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll[] { IIIIIllIIIIlIIIIllIl.IIIIIIIIIlllIllIlIlI }).llllIIIIlIIIlIlllIll());
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.ad, new IlIlIIIllIllIIIIIllI().llllIIIIlIIIlIlllIll(dl.IIlIlIlIIlIllIIIIIIl).llllIIIIlIIIlIlllIll("_wall").llllIIIIlIIIlIlllIll());
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.aJ, new IlIlIIIllIllIIIIIllI().llllIIIIlIIIlIlllIll(lIIlIIIlIllIlIllIIIl.IIIIIIIIIlllIllIlIlI).llllIIIIlIIIlIlllIll(new net.minecraft.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll[] { lIIlIIIlIllIlIllIIIl.IlllIIIIlIIIlIlIlIIl }).llllIIIIlIIIlIlllIll());
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.s, new IlIlIIIllIllIIIIIllI().llllIIIIlIIIlIlllIll(new net.minecraft.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll[] { llllIllllIllllIlIlII.IIllllIIIlIIIIIIllIl }).llllIIIIlIIIlIlllIll());
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.t, new IlIlIIIllIllIIIIIllI().llllIIIIlIIIlIlllIll(new net.minecraft.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll[] { llllIllllIllllIlIlII.IIllllIIIlIIIIIIllIl }).llllIIIIlIIIlIlllIll());
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.u, new IlIlIIIllIllIIIIIllI().llllIIIIlIIIlIlllIll(new net.minecraft.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll[] { llllIllllIllllIlIlII.IIllllIIIlIIIIIIllIl }).llllIIIIlIIIlIlllIll());
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.v, new IlIlIIIllIllIIIIIllI().llllIIIIlIIIlIlllIll(new net.minecraft.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll[] { llllIllllIllllIlIlII.IIllllIIIlIIIIIIllIl }).llllIIIIlIIIlIlllIll());
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.w, new IlIlIIIllIllIIIIIllI().llllIIIIlIIIlIlllIll(new net.minecraft.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll[] { llllIllllIllllIlIlII.IIllllIIIlIIIIIIllIl }).llllIIIIlIIIlIlllIll());
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.x, new IlIlIIIllIllIIIIIllI().llllIIIIlIIIlIlllIll(new net.minecraft.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll[] { llllIllllIllllIlIlII.IIllllIIIlIIIIIIllIl }).llllIIIIlIIIlIlllIll());
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.W, new IlIlIIIllIllIIIIIllI().llllIIIIlIIIlIlllIll(di.lllIllIIIllllllIllll, di.IIIIIIIIIlllIllIlIlI).llllIIIIlIIIlIlllIll());
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.P, new IlIlIIIllIllIIIIIllI().llllIIIIlIIIlIlllIll(z.IIIIIIIIIlllIllIlIlI).llllIIIIlIIIlIlllIll("_double_slab").llllIIIIlIIIlIlllIll());
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.Q, new IlIlIIIllIllIIIIIllI().llllIIIIlIIIlIlllIll(z.IIIIIIIIIlllIllIlIlI).llllIIIIlIIIlIlllIll("_slab").llllIIIIlIIIlIlllIll());
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IllIlIIllIllIIlIllII, new IlIlIIIllIllIIIIIllI().llllIIIIlIIIlIlllIll(new net.minecraft.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll[] { db.IIIIIIIIIlllIllIlIlI }).llllIIIIlIIIlIlllIll());
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lIIIIlIlIllllIIlIllI, new IlIlIIIllIllIIIIIllI().llllIIIIlIIIlIlllIll(new net.minecraft.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll[] { IIlIlIllllIlllIIIIll.IIIIIIIIIlllIllIlIlI }).llllIIIIlIIIlIlllIll());
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IllIIlllllIIllIIllIl, new IlIlIIIllIllIIIIIllI().llllIIIIlIIIlIlllIll(new net.minecraft.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll[] { bh.llIllIlIlIIIIIIIllII }).llllIIIIlIIIlIlllIll());
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIllllIllllIlIlII, new IlIlIIIllIllIIIIIllI().llllIIIIlIIIlIlllIll(new net.minecraft.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll[] { llIlIIIIIlIIlIlIIlll.lllIllIIIllllllIllll }).llllIIIIlIIIlIlllIll());
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIlIlIllllIlllIIIIll, new IlIlIIIllIllIIIIIllI().llllIIIIlIIIlIlllIll(new net.minecraft.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll[] { llIlIIIIIlIIlIlIIlll.lllIllIIIllllllIllll }).llllIIIIlIIIlIlllIll());
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lIIllIIIllllIlllIllI, new IlIlIIIllIllIIIIIllI().llllIIIIlIIIlIlllIll(new net.minecraft.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll[] { llIlIIIIIlIIlIlIIlll.lllIllIIIllllllIllll }).llllIIIIlIIIlIlllIll());
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IllIlIllIllIlllIIlll, new IlIlIIIllIllIIIIIllI().llllIIIIlIIIlIlllIll(new net.minecraft.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll[] { llIlIIIIIlIIlIlIIlll.lllIllIIIllllllIllll }).llllIIIIlIIIlIlllIll());
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIllIIIlIIlIlIlIIIII, new IlIlIIIllIllIIIIIllI().llllIIIIlIIIlIlllIll(new net.minecraft.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll[] { llIlIIIIIlIIlIlIIlll.lllIllIIIllllllIllll }).llllIIIIlIIIlIlllIll());
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llIllIIlllllllllllll, new IlIlIIIllIllIIIIIllI().llllIIIIlIIIlIlllIll(new net.minecraft.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll[] { llIlIIIIIlIIlIlIIlll.lllIllIIIllllllIllll }).llllIIIIlIIIlIlllIll());
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIllIIIlIIIIlIIlIIII, new IlIlIIIllIllIIIIIllI().llllIIIIlIIIlIlllIll(new net.minecraft.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll[] { llIlIIIIIlIIlIlIIlll.lllIllIIIllllllIllll }).llllIIIIlIIIlIlllIll());
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIIIIIIIIlllIllIlIlI, new IlIlIIIllIllIIIIIllI().llllIIIIlIIIlIlllIll(IlIIIlIIIllllIlIlIlI.IIIIIIIIIlllIllIlIlI).llllIIIIlIIIlIlllIll("_wool").llllIIIIlIIIlIlllIll());
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.aC, new IlIlIIIllIllIIIIIllI().llllIIIIlIIIlIlllIll(IlIIIlIIIllllIlIlIlI.IIIIIIIIIlllIllIlIlI).llllIIIIlIIIlIlllIll("_carpet").llllIIIIlIIIlIlllIll());
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.ay, new IlIlIIIllIllIIIIIllI().llllIIIIlIIIlIlllIll(IlIIIlIIIllllIlIlIlI.IIIIIIIIIlllIllIlIlI).llllIIIIlIIIlIlllIll("_stained_hardened_clay").llllIIIIlIIIlIlllIll());
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.aL, new IlIlIIIllIllIIIIIllI().llllIIIIlIIIlIlllIll(IlIIIlIIIllllIlIlIlI.IIIIIIIIIlllIllIlIlI).llllIIIIlIIIlIlllIll("_stained_glass_pane").llllIIIIlIIIlIlllIll());
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.aK, new IlIlIIIllIllIIIIIllI().llllIIIIlIIIlIlllIll(IlIIIlIIIllllIlIlIlI.IIIIIIIIIlllIllIlIlI).llllIIIIlIIIlIlllIll("_stained_glass").llllIIIIlIIIlIlllIll());
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIlllIlIIllIlIlIlIIl, new IlIlIIIllIllIIIIIllI().llllIIIIlIIIlIlllIll(bn.IIIIIIIIIlllIllIlIlI).llllIIIIlIIIlIlllIll());
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.aQ, new IlIlIIIllIllIIIIIllI().llllIIIIlIIIlIlllIll(aw.IIIIIIIIIlllIllIlIlI).llllIIIIlIIIlIlllIll());
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllllIllIllIlIllllI, new IlIlIIIllIllIIIIIllI().llllIIIIlIIIlIlllIll(dc.IIIIIIIIIlllIllIlIlI).llllIIIIlIIIlIlllIll());
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lllllIlIIIlIlIIlllII, new IlIlIIIllIllIIIIIllI().llllIIIIlIIIlIlllIll(new net.minecraft.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll[] { IlIlIIIIIIlllIlIllIl.IIllllIIIlIIIIIIllIl }).llllIIIIlIIIlIlllIll());
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlllIIIIlIIIlIlIlIIl, new IlIlIIIllIllIIIIIllI().llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlllIIIIlIIIlIlIlIIl.IlIllllIIlIIlIlIlIll()).llllIIIIlIIIlIlllIll());
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lllIllIIIllllllIllll, new IlIlIIIllIllIIIIIllI().llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lllIllIIIllllllIllll.IlIllllIIlIIlIlIlIll()).llllIIIIlIIIlIlllIll());
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llIlIIIIIlIIlIlIIlll, new IlIlIIIllIllIIIIIllI().llllIIIIlIIIlIlllIll(cx.IlllIIIIlIIIlIlIlIIl).llllIIIIlIIIlIlllIll("_slab").llllIIIIlIIIlIlllIll());
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.aT, new IlIlIIIllIllIIIIIllI().llllIIIIlIIIlIlllIll(cz.IlllIIIIlIIIlIlIlIIl).llllIIIIlIIIlIlllIll("_slab").llllIIIIlIIIlIlllIll());
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.i, new IlIlIIIllIllIIIIIllI().llllIIIIlIIIlIlllIll(bs.IIIIIIIIIlllIllIlIlI).llllIIIIlIIIlIlllIll("_monster_egg").llllIIIIlIIIlIlllIll());
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.j, new IlIlIIIllIllIIIIIllI().llllIIIIlIIIlIlllIll(cv.IIIIIIIIIlllIllIlIlI).llllIIIIlIIIlIlllIll());
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIlIllllllllIIIIlII, new IlIlIIIllIllIIIIIllI().llllIIIIlIIIlIlllIll(new net.minecraft.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll[] { IllIllIlllIllllIIllI.IIllllIIIlIIIIIIllIl }).llllIIIIlIIIlIlllIll());
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.ax, new IlIlIIIllIllIIIIIllI().llllIIIIlIIIlIlllIll(new net.minecraft.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll[] { lllllIIIIIlIlIIIIIIl.IIllllIIIlIIIIIIllIl }).llllIIIIlIIIlIlllIll());
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lllIIIIlllllIlIIllIl, new IlIlIIIllIllIIIIIllI().llllIIIIlIIIlIlllIll(q.IIllllIIIlIIIIIIllIl).llllIIIIlIIIlIlllIll("_log").llllIIIIlIIIlIlllIll());
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIlIIIIIIlllIlIllIl, new IlIlIIIllIllIIIIIllI().llllIIIIlIIIlIlllIll(k.IIllllIIIlIIIIIIllIl).llllIIIIlIIIlIlllIll("_log").llllIIIIlIIIlIlllIll());
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl, new IlIlIIIllIllIIIIIllI().llllIIIIlIIIlIlllIll(z.IIIIIIIIIlllIllIlIlI).llllIIIIlIIIlIlllIll("_planks").llllIIIIlIIIlIlllIll());
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIlIlllIlIIIIIl, new IlIlIIIllIllIIIIIllI().llllIIIIlIIIlIlllIll(bp.IIIIIIIIIlllIllIlIlI).llllIIIIlIIIlIlllIll("_sapling").llllIIIIlIIIlIlllIll());
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIlIIIllIIllIlllllI, new IlIlIIIllIllIIIIIllI().llllIIIIlIIIlIlllIll(bl.IIIIIIIIIlllIllIlIlI).llllIIIIlIIIlIlllIll());
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.at, new IlIlIIIllIllIIIIIllI().llllIIIIlIIIlIlllIll(new net.minecraft.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll[] { lllIlIIIIIlIlllllIlI.IIllllIIIlIIIIIIllIl }).llllIIIIlIIIlIlllIll());
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.ae, new IlIlIIIllIllIIIIIllI().llllIIIIlIIIlIlllIll(new net.minecraft.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll[] { IlIIIIIlIIllIIlIlIll.IIIIIIIIIlllIllIlIlI }).llllIIIIlIIIlIlllIll());
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.au, new lIIIlllIIIllIIIllIII(this));
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIIllllllIllIIIlllIl, new net.minecraft.client.lIIIlllIIIllIIIllIII.llIIlIIIlIIIllIlIIIl(this));
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.p, new llIllIlIIIIllIlIIllI(this));
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.q, new lIlIlIIIllIIllIIIllI(this));
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl, new net.minecraft.client.lIIIlllIIIllIIIllIII.IlIlIIIllIIllIlllllI(this));
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IllIllIlllIllllIIllI, new IIIIlllIIIIIIlIIIlll(this));
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.aS, new llllIIllllIlIlIIIIll(this));
    }
}
