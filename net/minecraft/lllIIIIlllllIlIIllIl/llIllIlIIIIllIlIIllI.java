package net.minecraft.lllIIIIlllllIlIIllIl;

import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import org.apache.logging.log4j.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.lIlIlIIIllIIllIIIllI.*;
import java.util.*;

public class llIllIlIIIIllIlIIllI extends llllllIllIllIlIllllI
{
    private static final Logger IlIlIlIlIlllllllllIl;
    private llIIlIIIlIIIllIlIIIl llIllIIIIIllIlIIIIlI;
    private IIIIlllIIIIIIlIIIlll IlIIIlIlIIIllIlIlIIl;
    
    static {
        IlIlIlIlIlllllllllIl = LogManager.getLogger();
    }
    
    public llIllIlIIIIllIlIIllI() {
        this("scoreboard");
    }
    
    public llIllIlIIIIllIlIIllI(final String s) {
        super(s);
    }
    
    public void llllIIIIlIIIlIlllIll(final llIIlIIIlIIIllIlIIIl llIllIIIIIllIlIIIIlI) {
        this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
        if (this.IlIIIlIlIIIllIlIlIIl != null) {
            this.llllIIIIlIIIlIlllIll(this.IlIIIlIlIIIllIlIlIIl);
        }
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final IIIIlllIIIIIIlIIIlll ilIIIlIlIIIllIlIlIIl) {
        if (this.llIllIIIIIllIlIIIIlI == null) {
            this.IlIIIlIlIIIllIlIlIIl = ilIIIlIlIIIllIlIlIIl;
        }
        else {
            this.IlIlIlIlIlllllllllIl(ilIIIlIlIIIllIlIlIIl.llIllIIIIIllIlIIIIlI("Objectives", 10));
            this.llIllIIIIIllIlIIIIlI(ilIIIlIlIIIllIlIlIIl.llIllIIIIIllIlIIIIlI("PlayerScores", 10));
            if (ilIIIlIlIIIllIlIlIIl.IlIlIlIlIlllllllllIl("DisplaySlots", 10)) {
                this.IlIlIlIlIlllllllllIl(ilIIIlIlIIIllIlIlIIl.IlIlIIIllIIllIlllllI("DisplaySlots"));
            }
            if (ilIIIlIlIIIllIlIlIIl.IlIlIlIlIlllllllllIl("Teams", 9)) {
                this.llllIIIIlIIIlIlllIll(ilIIIlIlIIIllIlIlIIl.llIllIIIIIllIlIIIIlI("Teams", 10));
            }
        }
    }
    
    protected void llllIIIIlIIIlIlllIll(final IlIlIIIlIIlIlIIlllIl ilIlIIIlIIlIlIIlllIl) {
        for (int i = 0; i < ilIlIIIlIIlIlIIlllIl.IlIlIIIllIllIIIIIllI(); ++i) {
            final IIIIlllIIIIIIlIIIlll ilIlIlIlIlllllllllIl = ilIlIIIlIIlIlIIlllIl.IlIlIlIlIlllllllllIl(i);
            String s = ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl("Name");
            if (s.length() > 16) {
                s = s.substring(0, 16);
            }
            final lIIIlllIIIllIIIllIII ilIIIlIlIIIllIlIlIIl = this.llIllIIIIIllIlIIIIlI.IlIIIlIlIIIllIlIlIIl(s);
            String s2 = ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl("DisplayName");
            if (s2.length() > 32) {
                s2 = s2.substring(0, 32);
            }
            ilIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(s2);
            if (ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl("TeamColor", 8)) {
                ilIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(IlllIIIIlIIIlIlIlIIl.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl("TeamColor")));
            }
            ilIIIlIlIIIllIlIlIIl.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl("Prefix"));
            ilIIIlIlIIIllIlIlIIl.llIllIIIIIllIlIIIIlI(ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl("Suffix"));
            if (ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl("AllowFriendlyFire", 99)) {
                ilIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl.IIIIlllIIIIIIlIIIlll("AllowFriendlyFire"));
            }
            if (ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl("SeeFriendlyInvisibles", 99)) {
                ilIIIlIlIIIllIlIlIIl.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl.IIIIlllIIIIIIlIIIlll("SeeFriendlyInvisibles"));
            }
            if (ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl("NameTagVisibility", 8)) {
                final net.minecraft.lllIIIIlllllIlIIllIl.IIIIlllIIIIIIlIIIlll llllIIIIlIIIlIlllIll = net.minecraft.lllIIIIlllllIlIIllIl.IIIIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl("NameTagVisibility"));
                if (llllIIIIlIIIlIlllIll != null) {
                    ilIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll);
                }
            }
            if (ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl("DeathMessageVisibility", 8)) {
                final net.minecraft.lllIIIIlllllIlIIllIl.IIIIlllIIIIIIlIIIlll llllIIIIlIIIlIlllIll2 = net.minecraft.lllIIIIlllllIlIIllIl.IIIIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl("DeathMessageVisibility"));
                if (llllIIIIlIIIlIlllIll2 != null) {
                    ilIIIlIlIIIllIlIlIIl.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll2);
                }
            }
            this.llllIIIIlIIIlIlllIll(ilIIIlIlIIIllIlIlIIl, ilIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI("Players", 8));
        }
    }
    
    protected void llllIIIIlIIIlIlllIll(final lIIIlllIIIllIIIllIII liiIlllIIIllIIIllIII, final IlIlIIIlIIlIlIIlllIl ilIlIIIlIIlIlIIlllIl) {
        for (int i = 0; i < ilIlIIIlIIlIlIIlllIl.IlIlIIIllIllIIIIIllI(); ++i) {
            this.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(ilIlIIIlIIlIlIIlllIl.IllIIlllIIIIlllIIlIl(i), liiIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll());
        }
    }
    
    protected void IlIlIlIlIlllllllllIl(final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll) {
        for (int i = 0; i < 19; ++i) {
            if (iiiIlllIIIIIIlIIIlll.IlIlIlIlIlllllllllIl("slot_" + i, 8)) {
                this.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(i, this.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(iiiIlllIIIIIIlIIIlll.llIIlIIIlIIIllIlIIIl("slot_" + i)));
            }
        }
    }
    
    protected void IlIlIlIlIlllllllllIl(final IlIlIIIlIIlIlIIlllIl ilIlIIIlIIlIlIIlllIl) {
        for (int i = 0; i < ilIlIIIlIIlIlIIlllIl.IlIlIIIllIllIIIIIllI(); ++i) {
            final IIIIlllIIIIIIlIIIlll ilIlIlIlIlllllllllIl = ilIlIIIlIIlIlIIlllIl.IlIlIlIlIlllllllllIl(i);
            final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl2 = net.minecraft.lllIIIIlllllIlIIllIl.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.get(ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl("CriteriaName"));
            if (ilIlIlIlIlllllllllIl2 != null) {
                String s = ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl("Name");
                if (s.length() > 16) {
                    s = s.substring(0, 16);
                }
                final lIIIIlIIIIIlllIllIII llllIIIIlIIIlIlllIll = this.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(s, ilIlIlIlIlllllllllIl2);
                llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl("DisplayName"));
                llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(net.minecraft.lllIIIIlllllIlIIllIl.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl("RenderType")));
            }
        }
    }
    
    protected void llIllIIIIIllIlIIIIlI(final IlIlIIIlIIlIlIIlllIl ilIlIIIlIIlIlIIlllIl) {
        for (int i = 0; i < ilIlIIIlIIlIlIIlllIl.IlIlIIIllIllIIIIIllI(); ++i) {
            final IIIIlllIIIIIIlIIIlll ilIlIlIlIlllllllllIl = ilIlIIIlIIlIlIIlllIl.IlIlIlIlIlllllllllIl(i);
            final lIIIIlIIIIIlllIllIII llllIIIIlIIIlIlllIll = this.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl("Objective"));
            String s = ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl("Name");
            if (s.length() > 40) {
                s = s.substring(0, 40);
            }
            final IlIIIlIlIIIllIlIlIIl ilIlIlIlIlllllllllIl2 = this.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(s, llllIIIIlIIIlIlllIll);
            ilIlIlIlIlllllllllIl2.llIllIIIIIllIlIIIIlI(ilIlIlIlIlllllllllIl.IllIIlllIIIIlllIIlIl("Score"));
            if (ilIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI("Locked")) {
                ilIlIlIlIlllllllllIl2.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl.IIIIlllIIIIIIlIIIlll("Locked"));
            }
        }
    }
    
    @Override
    public void llIllIIIIIllIlIIIIlI(final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll) {
        if (this.llIllIIIIIllIlIIIIlI == null) {
            llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl.warn("Tried to save scoreboard without having a scoreboard...");
        }
        else {
            iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("Objectives", this.IlIlIlIlIlllllllllIl());
            iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("PlayerScores", this.llIllIIIIIllIlIIIIlI());
            iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("Teams", this.llllIIIIlIIIlIlllIll());
            this.IlIIIlIlIIIllIlIlIIl(iiiIlllIIIIIIlIIIlll);
        }
    }
    
    protected IlIlIIIlIIlIlIIlllIl llllIIIIlIIIlIlllIll() {
        final IlIlIIIlIIlIlIIlllIl ilIlIIIlIIlIlIIlllIl = new IlIlIIIlIIlIlIIlllIl();
        for (final lIIIlllIIIllIIIllIII liiIlllIIIllIIIllIII : this.llIllIIIIIllIlIIIIlI.IlIlIIIllIllIIIIIllI()) {
            final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll = new IIIIlllIIIIIIlIIIlll();
            iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("Name", liiIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll());
            iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("DisplayName", liiIlllIIIllIIIllIII.IlIlIlIlIlllllllllIl());
            if (liiIlllIIIllIIIllIII.llIllIlIIIIllIlIIllI().llllIIIIlIIIlIlllIll() >= 0) {
                iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("TeamColor", liiIlllIIIllIIIllIII.llIllIlIIIIllIlIIllI().IlIIIlIlIIIllIlIlIIl());
            }
            iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("Prefix", liiIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl());
            iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("Suffix", liiIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI());
            iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("AllowFriendlyFire", liiIlllIIIllIIIllIII.IllIIlllIIIIlllIIlIl());
            iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("SeeFriendlyInvisibles", liiIlllIIIllIIIllIII.llllIIIlIlllIlIIIIIl());
            iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("NameTagVisibility", liiIlllIIIllIIIllIII.lIIIIlIIIIIlllIllIII().IlIlIIIllIllIIIIIllI);
            iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("DeathMessageVisibility", liiIlllIIIllIIIllIII.lIIIlllIIIllIIIllIII().IlIlIIIllIllIIIIIllI);
            final IlIlIIIlIIlIlIIlllIl ilIlIIIlIIlIlIIlllIl2 = new IlIlIIIlIIlIlIIlllIl();
            final Iterator iterator2 = liiIlllIIIllIIIllIII.llIllIIIIIllIlIIIIlI().iterator();
            while (iterator2.hasNext()) {
                ilIlIIIlIIlIlIIlllIl2.llllIIIIlIIIlIlllIll(new IIIlIIlIIIIlllIlllII(iterator2.next()));
            }
            iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("Players", ilIlIIIlIIlIlIIlllIl2);
            ilIlIIIlIIlIlIIlllIl.llllIIIIlIIIlIlllIll(iiiIlllIIIIIIlIIIlll);
        }
        return ilIlIIIlIIlIlIIlllIl;
    }
    
    protected void IlIIIlIlIIIllIlIlIIl(final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll) {
        final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll2 = new IIIIlllIIIIIIlIIIlll();
        boolean b = false;
        for (int i = 0; i < 19; ++i) {
            final lIIIIlIIIIIlllIllIII llllIIIIlIIIlIlllIll = this.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(i);
            if (llllIIIIlIIIlIlllIll != null) {
                iiiIlllIIIIIIlIIIlll2.llllIIIIlIIIlIlllIll("slot_" + i, llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl());
                b = true;
            }
        }
        if (b) {
            iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("DisplaySlots", iiiIlllIIIIIIlIIIlll2);
        }
    }
    
    protected IlIlIIIlIIlIlIIlllIl IlIlIlIlIlllllllllIl() {
        final IlIlIIIlIIlIlIIlllIl ilIlIIIlIIlIlIIlllIl = new IlIlIIIlIIlIlIIlllIl();
        for (final lIIIIlIIIIIlllIllIII liiiIlIIIIIlllIllIII : this.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll()) {
            if (liiiIlIIIIIlllIllIII.llIllIIIIIllIlIIIIlI() != null) {
                final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll = new IIIIlllIIIIIIlIIIlll();
                iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("Name", liiiIlIIIIIlllIllIII.IlIlIlIlIlllllllllIl());
                iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("CriteriaName", liiiIlIIIIIlllIllIII.llIllIIIIIllIlIIIIlI().llllIIIIlIIIlIlllIll());
                iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("DisplayName", liiiIlIIIIIlllIllIII.IlIIIlIlIIIllIlIlIIl());
                iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("RenderType", liiiIlIIIIIlllIllIII.IlIlIIIllIllIIIIIllI().llllIIIIlIIIlIlllIll());
                ilIlIIIlIIlIlIIlllIl.llllIIIIlIIIlIlllIll(iiiIlllIIIIIIlIIIlll);
            }
        }
        return ilIlIIIlIIlIlIIlllIl;
    }
    
    protected IlIlIIIlIIlIlIIlllIl llIllIIIIIllIlIIIIlI() {
        final IlIlIIIlIIlIlIIlllIl ilIlIIIlIIlIlIIlllIl = new IlIlIIIlIIlIlIIlllIl();
        for (final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl : this.llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI()) {
            if (ilIIIlIlIIIllIlIlIIl.llIllIIIIIllIlIIIIlI() != null) {
                final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll = new IIIIlllIIIIIIlIIIlll();
                iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("Name", ilIIIlIlIIIllIlIlIIl.IlIIIlIlIIIllIlIlIIl());
                iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("Objective", ilIIIlIlIIIllIlIlIIl.llIllIIIIIllIlIIIIlI().IlIlIlIlIlllllllllIl());
                iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("Score", ilIIIlIlIIIllIlIlIIl.IlIlIlIlIlllllllllIl());
                iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("Locked", ilIIIlIlIIIllIlIlIIl.IllIIlllIIIIlllIIlIl());
                ilIlIIIlIIlIlIIlllIl.llllIIIIlIIIlIlllIll(iiiIlllIIIIIIlIIIlll);
            }
        }
        return ilIlIIIlIIlIlIIlllIl;
    }
}
