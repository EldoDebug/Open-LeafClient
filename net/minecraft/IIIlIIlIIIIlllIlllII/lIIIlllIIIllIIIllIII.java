package net.minecraft.IIIlIIlIIIIlllIlllII;

import net.minecraft.lIlIlIIIllIIllIIIllI.*;
import java.util.*;

public class lIIIlllIIIllIIIllIII
{
    private TreeMap llllIIIIlIIIlIlllIll;
    
    public lIIIlllIIIllIIIllIII() {
        this.llllIIIIlIIIlIlllIll = new TreeMap();
        this.llllIIIIlIIIlIlllIll("doFireTick", "true", llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl);
        this.llllIIIIlIIIlIlllIll("mobGriefing", "true", llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl);
        this.llllIIIIlIIIlIlllIll("keepInventory", "false", llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl);
        this.llllIIIIlIIIlIlllIll("doMobSpawning", "true", llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl);
        this.llllIIIIlIIIlIlllIll("doMobLoot", "true", llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl);
        this.llllIIIIlIIIlIlllIll("doTileDrops", "true", llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl);
        this.llllIIIIlIIIlIlllIll("doEntityDrops", "true", llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl);
        this.llllIIIIlIIIlIlllIll("commandBlockOutput", "true", llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl);
        this.llllIIIIlIIIlIlllIll("naturalRegeneration", "true", llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl);
        this.llllIIIIlIIIlIlllIll("doDaylightCycle", "true", llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl);
        this.llllIIIIlIIIlIlllIll("logAdminCommands", "true", llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl);
        this.llllIIIIlIIIlIlllIll("showDeathMessages", "true", llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl);
        this.llllIIIIlIIIlIlllIll("randomTickSpeed", "3", llIllIlIIIIllIlIIllI.llIllIIIIIllIlIIIIlI);
        this.llllIIIIlIIIlIlllIll("sendCommandFeedback", "true", llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl);
        this.llllIIIIlIIIlIlllIll("reducedDebugInfo", "false", llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl);
    }
    
    public void llllIIIIlIIIlIlllIll(final String s, final String s2, final llIllIlIIIIllIlIIllI llIllIlIIIIllIlIIllI) {
        this.llllIIIIlIIIlIlllIll.put(s, new llIIlIIIlIIIllIlIIIl(s2, llIllIlIIIIllIlIIllI));
    }
    
    public void llllIIIIlIIIlIlllIll(final String s, final String s2) {
        final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl = this.llllIIIIlIIIlIlllIll.get(s);
        if (llIIlIIIlIIIllIlIIIl != null) {
            llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(s2);
        }
        else {
            this.llllIIIIlIIIlIlllIll(s, s2, llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll);
        }
    }
    
    public String llllIIIIlIIIlIlllIll(final String s) {
        final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl = this.llllIIIIlIIIlIlllIll.get(s);
        return (llIIlIIIlIIIllIlIIIl != null) ? llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll() : "";
    }
    
    public boolean IlIlIlIlIlllllllllIl(final String s) {
        final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl = this.llllIIIIlIIIlIlllIll.get(s);
        return llIIlIIIlIIIllIlIIIl != null && llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl();
    }
    
    public int llIllIIIIIllIlIIIIlI(final String s) {
        final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl = this.llllIIIIlIIIlIlllIll.get(s);
        return (llIIlIIIlIIIllIlIIIl != null) ? llIIlIIIlIIIllIlIIIl.llIllIIIIIllIlIIIIlI() : 0;
    }
    
    public IIIIlllIIIIIIlIIIlll llllIIIIlIIIlIlllIll() {
        final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll = new IIIIlllIIIIIIlIIIlll();
        for (final String s : this.llllIIIIlIIIlIlllIll.keySet()) {
            iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll(s, ((llIIlIIIlIIIllIlIIIl)this.llllIIIIlIIIlIlllIll.get(s)).llllIIIIlIIIlIlllIll());
        }
        return iiiIlllIIIIIIlIIIlll;
    }
    
    public void llllIIIIlIIIlIlllIll(final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll) {
        for (final String s : iiiIlllIIIIIIlIIIlll.IlIlIIIllIllIIIIIllI()) {
            this.llllIIIIlIIIlIlllIll(s, iiiIlllIIIIIIlIIIlll.llIIlIIIlIIIllIlIIIl(s));
        }
    }
    
    public String[] IlIlIlIlIlllllllllIl() {
        final Set keySet = this.llllIIIIlIIIlIlllIll.keySet();
        return (String[])keySet.toArray(new String[keySet.size()]);
    }
    
    public boolean IlIIIlIlIIIllIlIlIIl(final String s) {
        return this.llllIIIIlIIIlIlllIll.containsKey(s);
    }
    
    public boolean llllIIIIlIIIlIlllIll(final String s, final llIllIlIIIIllIlIIllI llIllIlIIIIllIlIIllI) {
        final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl = this.llllIIIIlIIIlIlllIll.get(s);
        return llIIlIIIlIIIllIlIIIl != null && (llIIlIIIlIIIllIlIIIl.IlIIIlIlIIIllIlIlIIl() == llIllIlIIIIllIlIIllI || llIllIlIIIIllIlIIllI == llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll);
    }
}
