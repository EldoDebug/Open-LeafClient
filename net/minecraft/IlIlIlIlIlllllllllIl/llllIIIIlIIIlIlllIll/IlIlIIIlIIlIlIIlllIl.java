package net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll;

import net.minecraft.IlIlIlIlIlllllllllIl.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import com.google.common.collect.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.lllIIIIlllllIlIIllIl.*;
import net.minecraft.lIlIlIIIllIIllIIIllI.*;
import java.util.*;

public class IlIlIIIlIIlIlIIlllIl extends llllIIIIlIIIlIlllIll
{
    @Override
    public String llIllIIIIIllIlIIIIlI() {
        return "scoreboard";
    }
    
    @Override
    public int llllIIIIlIIIlIlllIll() {
        return 2;
    }
    
    @Override
    public String llIllIIIIIllIlIIIIlI(final IllIlIIllIllIIlIllII illIlIIllIllIIlIllII) {
        return "commands.scoreboard.usage";
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final IllIlIIllIllIIlIllII illIlIIllIllIIlIllII, final String[] array) {
        if (!this.IlIlIlIlIlllllllllIl(illIlIIllIllIIlIllII, array)) {
            if (array.length < 1) {
                throw new llllIllllIllllIlIlII("commands.scoreboard.usage", new Object[0]);
            }
            if (array[0].equalsIgnoreCase("objectives")) {
                if (array.length == 1) {
                    throw new llllIllllIllllIlIlII("commands.scoreboard.objectives.usage", new Object[0]);
                }
                if (array[1].equalsIgnoreCase("list")) {
                    this.IlIIIlIlIIIllIlIlIIl(illIlIIllIllIIlIllII);
                }
                else if (array[1].equalsIgnoreCase("add")) {
                    if (array.length < 4) {
                        throw new llllIllllIllllIlIlII("commands.scoreboard.objectives.add.usage", new Object[0]);
                    }
                    this.IlIlIlIlIlllllllllIl(illIlIIllIllIIlIllII, array, 2);
                }
                else if (array[1].equalsIgnoreCase("remove")) {
                    if (array.length != 3) {
                        throw new llllIllllIllllIlIlII("commands.scoreboard.objectives.remove.usage", new Object[0]);
                    }
                    this.lIIIIlIIIIIlllIllIII(illIlIIllIllIIlIllII, array[2]);
                }
                else {
                    if (!array[1].equalsIgnoreCase("setdisplay")) {
                        throw new llllIllllIllllIlIlII("commands.scoreboard.objectives.usage", new Object[0]);
                    }
                    if (array.length != 3 && array.length != 4) {
                        throw new llllIllllIllllIlIlII("commands.scoreboard.objectives.setdisplay.usage", new Object[0]);
                    }
                    this.llIIlIIIlIIIllIlIIIl(illIlIIllIllIIlIllII, array, 2);
                }
            }
            else if (array[0].equalsIgnoreCase("players")) {
                if (array.length == 1) {
                    throw new llllIllllIllllIlIlII("commands.scoreboard.players.usage", new Object[0]);
                }
                if (array[1].equalsIgnoreCase("list")) {
                    if (array.length > 3) {
                        throw new llllIllllIllllIlIlII("commands.scoreboard.players.list.usage", new Object[0]);
                    }
                    this.llIllIlIIIIllIlIIllI(illIlIIllIllIIlIllII, array, 2);
                }
                else if (array[1].equalsIgnoreCase("add")) {
                    if (array.length < 5) {
                        throw new llllIllllIllllIlIlII("commands.scoreboard.players.add.usage", new Object[0]);
                    }
                    this.lIlIlIIIllIIllIIIllI(illIlIIllIllIIlIllII, array, 2);
                }
                else if (array[1].equalsIgnoreCase("remove")) {
                    if (array.length < 5) {
                        throw new llllIllllIllllIlIlII("commands.scoreboard.players.remove.usage", new Object[0]);
                    }
                    this.lIlIlIIIllIIllIIIllI(illIlIIllIllIIlIllII, array, 2);
                }
                else if (array[1].equalsIgnoreCase("set")) {
                    if (array.length < 5) {
                        throw new llllIllllIllllIlIlII("commands.scoreboard.players.set.usage", new Object[0]);
                    }
                    this.lIlIlIIIllIIllIIIllI(illIlIIllIllIIlIllII, array, 2);
                }
                else if (array[1].equalsIgnoreCase("reset")) {
                    if (array.length != 3 && array.length != 4) {
                        throw new llllIllllIllllIlIlII("commands.scoreboard.players.reset.usage", new Object[0]);
                    }
                    this.IlIlIIIllIIllIlllllI(illIlIIllIllIIlIllII, array, 2);
                }
                else if (array[1].equalsIgnoreCase("enable")) {
                    if (array.length != 4) {
                        throw new llllIllllIllllIlIlII("commands.scoreboard.players.enable.usage", new Object[0]);
                    }
                    this.IIIIlllIIIIIIlIIIlll(illIlIIllIllIIlIllII, array, 2);
                }
                else if (array[1].equalsIgnoreCase("test")) {
                    if (array.length != 5 && array.length != 6) {
                        throw new llllIllllIllllIlIlII("commands.scoreboard.players.test.usage", new Object[0]);
                    }
                    this.llllIIllllIlIlIIIIll(illIlIIllIllIIlIllII, array, 2);
                }
                else {
                    if (!array[1].equalsIgnoreCase("operation")) {
                        throw new llllIllllIllllIlIlII("commands.scoreboard.players.usage", new Object[0]);
                    }
                    if (array.length != 7) {
                        throw new llllIllllIllllIlIlII("commands.scoreboard.players.operation.usage", new Object[0]);
                    }
                    this.IlIllIlIlIIIlIlIlIII(illIlIIllIllIIlIllII, array, 2);
                }
            }
            else {
                if (!array[0].equalsIgnoreCase("teams")) {
                    throw new llllIllllIllllIlIlII("commands.scoreboard.usage", new Object[0]);
                }
                if (array.length == 1) {
                    throw new llllIllllIllllIlIlII("commands.scoreboard.teams.usage", new Object[0]);
                }
                if (array[1].equalsIgnoreCase("list")) {
                    if (array.length > 3) {
                        throw new llllIllllIllllIlIlII("commands.scoreboard.teams.list.usage", new Object[0]);
                    }
                    this.IllIIlllIIIIlllIIlIl(illIlIIllIllIIlIllII, array, 2);
                }
                else if (array[1].equalsIgnoreCase("add")) {
                    if (array.length < 3) {
                        throw new llllIllllIllllIlIlII("commands.scoreboard.teams.add.usage", new Object[0]);
                    }
                    this.llIllIIIIIllIlIIIIlI(illIlIIllIllIIlIllII, array, 2);
                }
                else if (array[1].equalsIgnoreCase("remove")) {
                    if (array.length != 3) {
                        throw new llllIllllIllllIlIlII("commands.scoreboard.teams.remove.usage", new Object[0]);
                    }
                    this.IlIlIIIllIllIIIIIllI(illIlIIllIllIIlIllII, array, 2);
                }
                else if (array[1].equalsIgnoreCase("empty")) {
                    if (array.length != 3) {
                        throw new llllIllllIllllIlIlII("commands.scoreboard.teams.empty.usage", new Object[0]);
                    }
                    this.lIIIlllIIIllIIIllIII(illIlIIllIllIIlIllII, array, 2);
                }
                else if (array[1].equalsIgnoreCase("join")) {
                    if (array.length < 4 && (array.length != 3 || !(illIlIIllIllIIlIllII instanceof net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll))) {
                        throw new llllIllllIllllIlIlII("commands.scoreboard.teams.join.usage", new Object[0]);
                    }
                    this.llllIIIlIlllIlIIIIIl(illIlIIllIllIIlIllII, array, 2);
                }
                else if (array[1].equalsIgnoreCase("leave")) {
                    if (array.length < 3 && !(illIlIIllIllIIlIllII instanceof net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll)) {
                        throw new llllIllllIllllIlIlII("commands.scoreboard.teams.leave.usage", new Object[0]);
                    }
                    this.lIIIIlIIIIIlllIllIII(illIlIIllIllIIlIllII, array, 2);
                }
                else {
                    if (!array[1].equalsIgnoreCase("option")) {
                        throw new llllIllllIllllIlIlII("commands.scoreboard.teams.usage", new Object[0]);
                    }
                    if (array.length != 4 && array.length != 5) {
                        throw new llllIllllIllllIlIlII("commands.scoreboard.teams.option.usage", new Object[0]);
                    }
                    this.IlIIIlIlIIIllIlIlIIl(illIlIIllIllIIlIllII, array, 2);
                }
            }
        }
    }
    
    private boolean IlIlIlIlIlllllllllIl(final IllIlIIllIllIIlIllII illIlIIllIllIIlIllII, final String[] array) {
        int n = -1;
        for (int i = 0; i < array.length; ++i) {
            if (this.IlIlIlIlIlllllllllIl(array, i) && "*".equals(array[i])) {
                if (n >= 0) {
                    throw new IIIIlllIIIIIIlIIIlll("commands.scoreboard.noMultiWildcard", new Object[0]);
                }
                n = i;
            }
        }
        if (n < 0) {
            return false;
        }
        final ArrayList arrayList = Lists.newArrayList((Iterable)this.IlIIIlIlIIIllIlIlIIl().IlIlIlIlIlllllllllIl());
        final String s = array[n];
        final ArrayList arrayList2 = Lists.newArrayList();
        for (final String s2 : arrayList) {
            array[n] = s2;
            try {
                this.llllIIIIlIIIlIlllIll(illIlIIllIllIIlIllII, array);
                arrayList2.add(s2);
            }
            catch (IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll) {
                final IIllIIllIIIlIlIIIIlI illIIllIIIlIlIIIIlI = new IIllIIllIIIlIlIIIIlI(iiiIlllIIIIIIlIIIlll.getMessage(), iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll());
                illIIllIIIlIlIIIIlI.llllIIIlIlllIlIIIIIl().llllIIIIlIIIlIlllIll(IlllIIIIlIIIlIlIlIIl.IlIlIIIllIIllIlllllI);
                illIlIIllIllIIlIllII.llllIIIIlIIIlIlllIll(illIIllIIIlIlIIIIlI);
            }
        }
        array[n] = s;
        illIlIIllIllIIlIllII.llllIIIIlIIIlIlllIll(lIllllllIIllIlIlIlII.llIllIIIIIllIlIIIIlI, arrayList2.size());
        if (arrayList2.size() == 0) {
            throw new llllIllllIllllIlIlII("commands.scoreboard.allMatchesFailed", new Object[0]);
        }
        return true;
    }
    
    protected llIIlIIIlIIIllIlIIIl IlIIIlIlIIIllIlIlIIl() {
        return net.minecraft.IlIlIIIIIIlllIlIllIl.llllIIIIlIIIlIlllIll.IIIIIllIIIIlIIIIllIl().llllIIIIlIIIlIlllIll(0).IlllIIIIlIIIlIlIlIIl();
    }
    
    protected lIIIIlIIIIIlllIllIII llllIIIIlIIIlIlllIll(final String s, final boolean b) {
        final lIIIIlIIIIIlllIllIII llllIIIIlIIIlIlllIll = this.IlIIIlIlIIIllIlIlIIl().llllIIIIlIIIlIlllIll(s);
        if (llllIIIIlIIIlIlllIll == null) {
            throw new IIIIlllIIIIIIlIIIlll("commands.scoreboard.objectiveNotFound", new Object[] { s });
        }
        if (b && llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI().IlIlIlIlIlllllllllIl()) {
            throw new IIIIlllIIIIIIlIIIlll("commands.scoreboard.objectiveReadOnly", new Object[] { s });
        }
        return llllIIIIlIIIlIlllIll;
    }
    
    protected lIIIlllIIIllIIIllIII IlIlIIIllIllIIIIIllI(final String s) {
        final lIIIlllIIIllIIIllIII llIllIIIIIllIlIIIIlI = this.IlIIIlIlIIIllIlIlIIl().llIllIIIIIllIlIIIIlI(s);
        if (llIllIIIIIllIlIIIIlI == null) {
            throw new IIIIlllIIIIIIlIIIlll("commands.scoreboard.teamNotFound", new Object[] { s });
        }
        return llIllIIIIIllIlIIIIlI;
    }
    
    protected void IlIlIlIlIlllllllllIl(final IllIlIIllIllIIlIllII illIlIIllIllIIlIllII, final String[] array, int n) {
        final String s = array[n++];
        final String s2 = array[n++];
        final llIIlIIIlIIIllIlIIIl ilIIIlIlIIIllIlIlIIl = this.IlIIIlIlIIIllIlIlIIl();
        final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl = IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.get(s2);
        if (ilIlIlIlIlllllllllIl == null) {
            throw new llllIllllIllllIlIlII("commands.scoreboard.objectives.add.wrongType", new Object[] { s2 });
        }
        if (ilIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(s) != null) {
            throw new IIIIlllIIIIIIlIIIlll("commands.scoreboard.objectives.add.alreadyExists", new Object[] { s });
        }
        if (s.length() > 16) {
            throw new IIlllllIllIllIlIlIII("commands.scoreboard.objectives.add.tooLong", new Object[] { s, 16 });
        }
        if (s.length() == 0) {
            throw new llllIllllIllllIlIlII("commands.scoreboard.objectives.add.usage", new Object[0]);
        }
        if (array.length > n) {
            final String liiiIlIIIIIlllIllIII = net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(illIlIIllIllIIlIllII, array, n).lIIIIlIIIIIlllIllIII();
            if (liiiIlIIIIIlllIllIII.length() > 32) {
                throw new IIlllllIllIllIlIlIII("commands.scoreboard.objectives.add.displayTooLong", new Object[] { liiiIlIIIIIlllIllIII, 32 });
            }
            if (liiiIlIIIIIlllIllIII.length() > 0) {
                ilIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(s, ilIlIlIlIlllllllllIl).llllIIIIlIIIlIlllIll(liiiIlIIIIIlllIllIII);
            }
            else {
                ilIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(s, ilIlIlIlIlllllllllIl);
            }
        }
        else {
            ilIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(s, ilIlIlIlIlllllllllIl);
        }
        net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(illIlIIllIllIIlIllII, this, "commands.scoreboard.objectives.add.success", s);
    }
    
    protected void llIllIIIIIllIlIIIIlI(final IllIlIIllIllIIlIllII illIlIIllIllIIlIllII, final String[] array, int n) {
        final String s = array[n++];
        final llIIlIIIlIIIllIlIIIl ilIIIlIlIIIllIlIlIIl = this.IlIIIlIlIIIllIlIlIIl();
        if (ilIIIlIlIIIllIlIlIIl.llIllIIIIIllIlIIIIlI(s) != null) {
            throw new IIIIlllIIIIIIlIIIlll("commands.scoreboard.teams.add.alreadyExists", new Object[] { s });
        }
        if (s.length() > 16) {
            throw new IIlllllIllIllIlIlIII("commands.scoreboard.teams.add.tooLong", new Object[] { s, 16 });
        }
        if (s.length() == 0) {
            throw new llllIllllIllllIlIlII("commands.scoreboard.teams.add.usage", new Object[0]);
        }
        if (array.length > n) {
            final String liiiIlIIIIIlllIllIII = net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(illIlIIllIllIIlIllII, array, n).lIIIIlIIIIIlllIllIII();
            if (liiiIlIIIIIlllIllIII.length() > 32) {
                throw new IIlllllIllIllIlIlIII("commands.scoreboard.teams.add.displayTooLong", new Object[] { liiiIlIIIIIlllIllIII, 32 });
            }
            if (liiiIlIIIIIlllIllIII.length() > 0) {
                ilIIIlIlIIIllIlIlIIl.IlIIIlIlIIIllIlIlIIl(s).llllIIIIlIIIlIlllIll(liiiIlIIIIIlllIllIII);
            }
            else {
                ilIIIlIlIIIllIlIlIIl.IlIIIlIlIIIllIlIlIIl(s);
            }
        }
        else {
            ilIIIlIlIIIllIlIlIIl.IlIIIlIlIIIllIlIlIIl(s);
        }
        net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(illIlIIllIllIIlIllII, this, "commands.scoreboard.teams.add.success", s);
    }
    
    protected void IlIIIlIlIIIllIlIlIIl(final IllIlIIllIllIIlIllII illIlIIllIllIIlIllII, final String[] array, int n) {
        final lIIIlllIIIllIIIllIII ilIlIIIllIllIIIIIllI = this.IlIlIIIllIllIIIIIllI(array[n++]);
        if (ilIlIIIllIllIIIIIllI != null) {
            final String lowerCase = array[n++].toLowerCase();
            if (!lowerCase.equalsIgnoreCase("color") && !lowerCase.equalsIgnoreCase("friendlyfire") && !lowerCase.equalsIgnoreCase("seeFriendlyInvisibles") && !lowerCase.equalsIgnoreCase("nametagVisibility") && !lowerCase.equalsIgnoreCase("deathMessageVisibility")) {
                throw new llllIllllIllllIlIlII("commands.scoreboard.teams.option.usage", new Object[0]);
            }
            if (array.length == 4) {
                if (lowerCase.equalsIgnoreCase("color")) {
                    throw new llllIllllIllllIlIlII("commands.scoreboard.teams.option.noValue", new Object[] { lowerCase, net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(IlllIIIIlIIIlIlIlIIl.llllIIIIlIIIlIlllIll(true, false)) });
                }
                if (lowerCase.equalsIgnoreCase("friendlyfire") || lowerCase.equalsIgnoreCase("seeFriendlyInvisibles")) {
                    throw new llllIllllIllllIlIlII("commands.scoreboard.teams.option.noValue", new Object[] { lowerCase, net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll((Collection)Arrays.asList("true", "false")) });
                }
                if (!lowerCase.equalsIgnoreCase("nametagVisibility") && !lowerCase.equalsIgnoreCase("deathMessageVisibility")) {
                    throw new llllIllllIllllIlIlII("commands.scoreboard.teams.option.usage", new Object[0]);
                }
                throw new llllIllllIllllIlIlII("commands.scoreboard.teams.option.noValue", new Object[] { lowerCase, net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll((Object[])net.minecraft.lllIIIIlllllIlIIllIl.IIIIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll()) });
            }
            else {
                final String s = array[n];
                if (lowerCase.equalsIgnoreCase("color")) {
                    final IlllIIIIlIIIlIlIlIIl ilIlIlIlIlllllllllIl = IlllIIIIlIIIlIlIlIIl.IlIlIlIlIlllllllllIl(s);
                    if (ilIlIlIlIlllllllllIl == null || ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl()) {
                        throw new llllIllllIllllIlIlII("commands.scoreboard.teams.option.noValue", new Object[] { lowerCase, net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(IlllIIIIlIIIlIlIlIIl.llllIIIIlIIIlIlllIll(true, false)) });
                    }
                    ilIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl);
                    ilIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl.toString());
                    ilIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI(IlllIIIIlIIIlIlIlIIl.IlIlIIIlIIlIlIIlllIl.toString());
                }
                else if (lowerCase.equalsIgnoreCase("friendlyfire")) {
                    if (!s.equalsIgnoreCase("true") && !s.equalsIgnoreCase("false")) {
                        throw new llllIllllIllllIlIlII("commands.scoreboard.teams.option.noValue", new Object[] { lowerCase, net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll((Collection)Arrays.asList("true", "false")) });
                    }
                    ilIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll(s.equalsIgnoreCase("true"));
                }
                else if (lowerCase.equalsIgnoreCase("seeFriendlyInvisibles")) {
                    if (!s.equalsIgnoreCase("true") && !s.equalsIgnoreCase("false")) {
                        throw new llllIllllIllllIlIlII("commands.scoreboard.teams.option.noValue", new Object[] { lowerCase, net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll((Collection)Arrays.asList("true", "false")) });
                    }
                    ilIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl(s.equalsIgnoreCase("true"));
                }
                else if (lowerCase.equalsIgnoreCase("nametagVisibility")) {
                    final net.minecraft.lllIIIIlllllIlIIllIl.IIIIlllIIIIIIlIIIlll llllIIIIlIIIlIlllIll = net.minecraft.lllIIIIlllllIlIIllIl.IIIIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll(s);
                    if (llllIIIIlIIIlIlllIll == null) {
                        throw new llllIllllIllllIlIlII("commands.scoreboard.teams.option.noValue", new Object[] { lowerCase, net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll((Object[])net.minecraft.lllIIIIlllllIlIIllIl.IIIIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll()) });
                    }
                    ilIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll);
                }
                else if (lowerCase.equalsIgnoreCase("deathMessageVisibility")) {
                    final net.minecraft.lllIIIIlllllIlIIllIl.IIIIlllIIIIIIlIIIlll llllIIIIlIIIlIlllIll2 = net.minecraft.lllIIIIlllllIlIIllIl.IIIIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll(s);
                    if (llllIIIIlIIIlIlllIll2 == null) {
                        throw new llllIllllIllllIlIlII("commands.scoreboard.teams.option.noValue", new Object[] { lowerCase, net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll((Object[])net.minecraft.lllIIIIlllllIlIIllIl.IIIIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll()) });
                    }
                    ilIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll2);
                }
                net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(illIlIIllIllIIlIllII, this, "commands.scoreboard.teams.option.success", lowerCase, ilIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll(), s);
            }
        }
    }
    
    protected void IlIlIIIllIllIIIIIllI(final IllIlIIllIllIIlIllII illIlIIllIllIIlIllII, final String[] array, final int n) {
        final llIIlIIIlIIIllIlIIIl ilIIIlIlIIIllIlIlIIl = this.IlIIIlIlIIIllIlIlIIl();
        final lIIIlllIIIllIIIllIII ilIlIIIllIllIIIIIllI = this.IlIlIIIllIllIIIIIllI(array[n]);
        if (ilIlIIIllIllIIIIIllI != null) {
            ilIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(ilIlIIIllIllIIIIIllI);
            net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(illIlIIllIllIIlIllII, this, "commands.scoreboard.teams.remove.success", ilIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll());
        }
    }
    
    protected void IllIIlllIIIIlllIIlIl(final IllIlIIllIllIIlIllII illIlIIllIllIIlIllII, final String[] array, final int n) {
        final llIIlIIIlIIIllIlIIIl ilIIIlIlIIIllIlIlIIl = this.IlIIIlIlIIIllIlIlIIl();
        if (array.length > n) {
            final lIIIlllIIIllIIIllIII ilIlIIIllIllIIIIIllI = this.IlIlIIIllIllIIIIIllI(array[n]);
            if (ilIlIIIllIllIIIIIllI == null) {
                return;
            }
            final Collection llIllIIIIIllIlIIIIlI = ilIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI();
            illIlIIllIllIIlIllII.llllIIIIlIIIlIlllIll(lIllllllIIllIlIlIlII.IlIlIIIllIllIIIIIllI, llIllIIIIIllIlIIIIlI.size());
            if (llIllIIIIIllIlIIIIlI.size() <= 0) {
                throw new IIIIlllIIIIIIlIIIlll("commands.scoreboard.teams.list.player.empty", new Object[] { ilIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll() });
            }
            final IIllIIllIIIlIlIIIIlI illIIllIIIlIlIIIIlI = new IIllIIllIIIlIlIIIIlI("commands.scoreboard.teams.list.player.count", new Object[] { llIllIIIIIllIlIIIIlI.size(), ilIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll() });
            illIIllIIIlIlIIIIlI.llllIIIlIlllIlIIIIIl().llllIIIIlIIIlIlllIll(IlllIIIIlIIIlIlIlIIl.llIllIIIIIllIlIIIIlI);
            illIlIIllIllIIlIllII.llllIIIIlIIIlIlllIll(illIIllIIIlIlIIIIlI);
            illIlIIllIllIIlIllII.llllIIIIlIIIlIlllIll(new IlIlIIIIIIlllIlIllIl(net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI.toArray())));
        }
        else {
            final Collection ilIlIIIllIllIIIIIllI2 = ilIIIlIlIIIllIlIlIIl.IlIlIIIllIllIIIIIllI();
            illIlIIllIllIIlIllII.llllIIIIlIIIlIlllIll(lIllllllIIllIlIlIlII.IlIlIIIllIllIIIIIllI, ilIlIIIllIllIIIIIllI2.size());
            if (ilIlIIIllIllIIIIIllI2.size() <= 0) {
                throw new IIIIlllIIIIIIlIIIlll("commands.scoreboard.teams.list.empty", new Object[0]);
            }
            final IIllIIllIIIlIlIIIIlI illIIllIIIlIlIIIIlI2 = new IIllIIllIIIlIlIIIIlI("commands.scoreboard.teams.list.count", new Object[] { ilIlIIIllIllIIIIIllI2.size() });
            illIIllIIIlIlIIIIlI2.llllIIIlIlllIlIIIIIl().llllIIIIlIIIlIlllIll(IlllIIIIlIIIlIlIlIIl.llIllIIIIIllIlIIIIlI);
            illIlIIllIllIIlIllII.llllIIIIlIIIlIlllIll(illIIllIIIlIlIIIIlI2);
            for (final lIIIlllIIIllIIIllIII liiIlllIIIllIIIllIII : ilIlIIIllIllIIIIIllI2) {
                illIlIIllIllIIlIllII.llllIIIIlIIIlIlllIll(new IIllIIllIIIlIlIIIIlI("commands.scoreboard.teams.list.entry", new Object[] { liiIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll(), liiIlllIIIllIIIllIII.IlIlIlIlIlllllllllIl(), liiIlllIIIllIIIllIII.llIllIIIIIllIlIIIIlI().size() }));
            }
        }
    }
    
    protected void llllIIIlIlllIlIIIIIl(final IllIlIIllIllIIlIllII illIlIIllIllIIlIllII, final String[] array, int i) {
        final llIIlIIIlIIIllIlIIIl ilIIIlIlIIIllIlIlIIl = this.IlIIIlIlIIIllIlIlIIl();
        final String s = array[i++];
        final HashSet hashSet = Sets.newHashSet();
        final HashSet hashSet2 = Sets.newHashSet();
        if (illIlIIllIllIIlIllII instanceof net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll && i == array.length) {
            final String s_ = net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(illIlIIllIllIIlIllII).s_();
            if (ilIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(s_, s)) {
                hashSet.add(s_);
            }
            else {
                hashSet2.add(s_);
            }
        }
        else {
            while (i < array.length) {
                final String s2 = array[i++];
                if (s2.startsWith("@")) {
                    final Iterator iterator = net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI(illIlIIllIllIIlIllII, s2).iterator();
                    while (iterator.hasNext()) {
                        final String ilIlIIIllIllIIIIIllI = net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI(illIlIIllIllIIlIllII, iterator.next().lllIIIIlIlIllIIlIIIl().toString());
                        if (ilIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(ilIlIIIllIllIIIIIllI, s)) {
                            hashSet.add(ilIlIIIllIllIIIIIllI);
                        }
                        else {
                            hashSet2.add(ilIlIIIllIllIIIIIllI);
                        }
                    }
                }
                else {
                    final String ilIlIIIllIllIIIIIllI2 = net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI(illIlIIllIllIIlIllII, s2);
                    if (ilIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(ilIlIIIllIllIIIIIllI2, s)) {
                        hashSet.add(ilIlIIIllIllIIIIIllI2);
                    }
                    else {
                        hashSet2.add(ilIlIIIllIllIIIIIllI2);
                    }
                }
            }
        }
        if (!hashSet.isEmpty()) {
            illIlIIllIllIIlIllII.llllIIIIlIIIlIlllIll(lIllllllIIllIlIlIlII.llIllIIIIIllIlIIIIlI, hashSet.size());
            net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(illIlIIllIllIIlIllII, this, "commands.scoreboard.teams.join.success", hashSet.size(), s, net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll((Object[])hashSet.toArray(new String[hashSet.size()])));
        }
        if (!hashSet2.isEmpty()) {
            throw new IIIIlllIIIIIIlIIIlll("commands.scoreboard.teams.join.failure", new Object[] { hashSet2.size(), s, net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll((Object[])hashSet2.toArray(new String[hashSet2.size()])) });
        }
    }
    
    protected void lIIIIlIIIIIlllIllIII(final IllIlIIllIllIIlIllII illIlIIllIllIIlIllII, final String[] array, int i) {
        final llIIlIIIlIIIllIlIIIl ilIIIlIlIIIllIlIlIIl = this.IlIIIlIlIIIllIlIlIIl();
        final HashSet hashSet = Sets.newHashSet();
        final HashSet hashSet2 = Sets.newHashSet();
        if (illIlIIllIllIIlIllII instanceof net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll && i == array.length) {
            final String s_ = net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(illIlIIllIllIIlIllII).s_();
            if (ilIIIlIlIIIllIlIlIIl.IlIlIIIllIllIIIIIllI(s_)) {
                hashSet.add(s_);
            }
            else {
                hashSet2.add(s_);
            }
        }
        else {
            while (i < array.length) {
                final String s = array[i++];
                if (s.startsWith("@")) {
                    final Iterator iterator = net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI(illIlIIllIllIIlIllII, s).iterator();
                    while (iterator.hasNext()) {
                        final String ilIlIIIllIllIIIIIllI = net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI(illIlIIllIllIIlIllII, iterator.next().lllIIIIlIlIllIIlIIIl().toString());
                        if (ilIIIlIlIIIllIlIlIIl.IlIlIIIllIllIIIIIllI(ilIlIIIllIllIIIIIllI)) {
                            hashSet.add(ilIlIIIllIllIIIIIllI);
                        }
                        else {
                            hashSet2.add(ilIlIIIllIllIIIIIllI);
                        }
                    }
                }
                else {
                    final String ilIlIIIllIllIIIIIllI2 = net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI(illIlIIllIllIIlIllII, s);
                    if (ilIIIlIlIIIllIlIlIIl.IlIlIIIllIllIIIIIllI(ilIlIIIllIllIIIIIllI2)) {
                        hashSet.add(ilIlIIIllIllIIIIIllI2);
                    }
                    else {
                        hashSet2.add(ilIlIIIllIllIIIIIllI2);
                    }
                }
            }
        }
        if (!hashSet.isEmpty()) {
            illIlIIllIllIIlIllII.llllIIIIlIIIlIlllIll(lIllllllIIllIlIlIlII.llIllIIIIIllIlIIIIlI, hashSet.size());
            net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(illIlIIllIllIIlIllII, this, "commands.scoreboard.teams.leave.success", hashSet.size(), net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll((Object[])hashSet.toArray(new String[hashSet.size()])));
        }
        if (!hashSet2.isEmpty()) {
            throw new IIIIlllIIIIIIlIIIlll("commands.scoreboard.teams.leave.failure", new Object[] { hashSet2.size(), net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll((Object[])hashSet2.toArray(new String[hashSet2.size()])) });
        }
    }
    
    protected void lIIIlllIIIllIIIllIII(final IllIlIIllIllIIlIllII illIlIIllIllIIlIllII, final String[] array, final int n) {
        final llIIlIIIlIIIllIlIIIl ilIIIlIlIIIllIlIlIIl = this.IlIIIlIlIIIllIlIlIIl();
        final lIIIlllIIIllIIIllIII ilIlIIIllIllIIIIIllI = this.IlIlIIIllIllIIIIIllI(array[n]);
        if (ilIlIIIllIllIIIIIllI != null) {
            final ArrayList arrayList = Lists.newArrayList((Iterable)ilIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI());
            illIlIIllIllIIlIllII.llllIIIIlIIIlIlllIll(lIllllllIIllIlIlIlII.llIllIIIIIllIlIIIIlI, arrayList.size());
            if (arrayList.isEmpty()) {
                throw new IIIIlllIIIIIIlIIIlll("commands.scoreboard.teams.empty.alreadyEmpty", new Object[] { ilIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll() });
            }
            final Iterator<String> iterator = (Iterator<String>)arrayList.iterator();
            while (iterator.hasNext()) {
                ilIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(iterator.next(), ilIlIIIllIllIIIIIllI);
            }
            net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(illIlIIllIllIIlIllII, this, "commands.scoreboard.teams.empty.success", arrayList.size(), ilIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll());
        }
    }
    
    protected void lIIIIlIIIIIlllIllIII(final IllIlIIllIllIIlIllII illIlIIllIllIIlIllII, final String s) {
        this.IlIIIlIlIIIllIlIlIIl().IlIlIlIlIlllllllllIl(this.llllIIIIlIIIlIlllIll(s, false));
        net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(illIlIIllIllIIlIllII, this, "commands.scoreboard.objectives.remove.success", s);
    }
    
    protected void IlIIIlIlIIIllIlIlIIl(final IllIlIIllIllIIlIllII illIlIIllIllIIlIllII) {
        final Collection llllIIIIlIIIlIlllIll = this.IlIIIlIlIIIllIlIlIIl().llllIIIIlIIIlIlllIll();
        if (llllIIIIlIIIlIlllIll.size() <= 0) {
            throw new IIIIlllIIIIIIlIIIlll("commands.scoreboard.objectives.list.empty", new Object[0]);
        }
        final IIllIIllIIIlIlIIIIlI illIIllIIIlIlIIIIlI = new IIllIIllIIIlIlIIIIlI("commands.scoreboard.objectives.list.count", new Object[] { llllIIIIlIIIlIlllIll.size() });
        illIIllIIIlIlIIIIlI.llllIIIlIlllIlIIIIIl().llllIIIIlIIIlIlllIll(IlllIIIIlIIIlIlIlIIl.llIllIIIIIllIlIIIIlI);
        illIlIIllIllIIlIllII.llllIIIIlIIIlIlllIll(illIIllIIIlIlIIIIlI);
        for (final lIIIIlIIIIIlllIllIII liiiIlIIIIIlllIllIII : llllIIIIlIIIlIlllIll) {
            illIlIIllIllIIlIllII.llllIIIIlIIIlIlllIll(new IIllIIllIIIlIlIIIIlI("commands.scoreboard.objectives.list.entry", new Object[] { liiiIlIIIIIlllIllIII.IlIlIlIlIlllllllllIl(), liiiIlIIIIIlllIllIII.IlIIIlIlIIIllIlIlIIl(), liiiIlIIIIIlllIllIII.llIllIIIIIllIlIIIIlI().llllIIIIlIIIlIlllIll() }));
        }
    }
    
    protected void llIIlIIIlIIIllIlIIIl(final IllIlIIllIllIIlIllII illIlIIllIllIIlIllII, final String[] array, int n) {
        final llIIlIIIlIIIllIlIIIl ilIIIlIlIIIllIlIlIIl = this.IlIIIlIlIIIllIlIlIIl();
        final String s = array[n++];
        final int liiiIlIIIIIlllIllIII = llIIlIIIlIIIllIlIIIl.lIIIIlIIIIIlllIllIII(s);
        lIIIIlIIIIIlllIllIII llllIIIIlIIIlIlllIll = null;
        if (array.length == 4) {
            llllIIIIlIIIlIlllIll = this.llllIIIIlIIIlIlllIll(array[n], false);
        }
        if (liiiIlIIIIIlllIllIII < 0) {
            throw new IIIIlllIIIIIIlIIIlll("commands.scoreboard.objectives.setdisplay.invalidSlot", new Object[] { s });
        }
        ilIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(liiiIlIIIIIlllIllIII, llllIIIIlIIIlIlllIll);
        if (llllIIIIlIIIlIlllIll != null) {
            net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(illIlIIllIllIIlIllII, this, "commands.scoreboard.objectives.setdisplay.successSet", llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl(liiiIlIIIIIlllIllIII), llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl());
        }
        else {
            net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(illIlIIllIllIIlIllII, this, "commands.scoreboard.objectives.setdisplay.successCleared", llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl(liiiIlIIIIIlllIllIII));
        }
    }
    
    protected void llIllIlIIIIllIlIIllI(final IllIlIIllIllIIlIllII illIlIIllIllIIlIllII, final String[] array, final int n) {
        final llIIlIIIlIIIllIlIIIl ilIIIlIlIIIllIlIlIIl = this.IlIIIlIlIIIllIlIlIIl();
        if (array.length > n) {
            final String ilIlIIIllIllIIIIIllI = net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI(illIlIIllIllIIlIllII, array[n]);
            final Map ilIlIlIlIlllllllllIl = ilIIIlIlIIIllIlIlIIl.IlIlIlIlIlllllllllIl(ilIlIIIllIllIIIIIllI);
            illIlIIllIllIIlIllII.llllIIIIlIIIlIlllIll(lIllllllIIllIlIlIlII.IlIlIIIllIllIIIIIllI, ilIlIlIlIlllllllllIl.size());
            if (ilIlIlIlIlllllllllIl.size() <= 0) {
                throw new IIIIlllIIIIIIlIIIlll("commands.scoreboard.players.list.player.empty", new Object[] { ilIlIIIllIllIIIIIllI });
            }
            final IIllIIllIIIlIlIIIIlI illIIllIIIlIlIIIIlI = new IIllIIllIIIlIlIIIIlI("commands.scoreboard.players.list.player.count", new Object[] { ilIlIlIlIlllllllllIl.size(), ilIlIIIllIllIIIIIllI });
            illIIllIIIlIlIIIIlI.llllIIIlIlllIlIIIIIl().llllIIIIlIIIlIlllIll(IlllIIIIlIIIlIlIlIIl.llIllIIIIIllIlIIIIlI);
            illIlIIllIllIIlIllII.llllIIIIlIIIlIlllIll(illIIllIIIlIlIIIIlI);
            for (final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl2 : ilIlIlIlIlllllllllIl.values()) {
                illIlIIllIllIIlIllII.llllIIIIlIIIlIlllIll(new IIllIIllIIIlIlIIIIlI("commands.scoreboard.players.list.player.entry", new Object[] { ilIIIlIlIIIllIlIlIIl2.IlIlIlIlIlllllllllIl(), ilIIIlIlIIIllIlIlIIl2.llIllIIIIIllIlIIIIlI().IlIIIlIlIIIllIlIlIIl(), ilIIIlIlIIIllIlIlIIl2.llIllIIIIIllIlIIIIlI().IlIlIlIlIlllllllllIl() }));
            }
        }
        else {
            final Collection ilIlIlIlIlllllllllIl2 = ilIIIlIlIIIllIlIlIIl.IlIlIlIlIlllllllllIl();
            illIlIIllIllIIlIllII.llllIIIIlIIIlIlllIll(lIllllllIIllIlIlIlII.IlIlIIIllIllIIIIIllI, ilIlIlIlIlllllllllIl2.size());
            if (ilIlIlIlIlllllllllIl2.size() <= 0) {
                throw new IIIIlllIIIIIIlIIIlll("commands.scoreboard.players.list.empty", new Object[0]);
            }
            final IIllIIllIIIlIlIIIIlI illIIllIIIlIlIIIIlI2 = new IIllIIllIIIlIlIIIIlI("commands.scoreboard.players.list.count", new Object[] { ilIlIlIlIlllllllllIl2.size() });
            illIIllIIIlIlIIIIlI2.llllIIIlIlllIlIIIIIl().llllIIIIlIIIlIlllIll(IlllIIIIlIIIlIlIlIIl.llIllIIIIIllIlIIIIlI);
            illIlIIllIllIIlIllII.llllIIIIlIIIlIlllIll(illIIllIIIlIlIIIIlI2);
            illIlIIllIllIIlIllII.llllIIIIlIIIlIlllIll(new IlIlIIIIIIlllIlIllIl(net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl2.toArray())));
        }
    }
    
    protected void lIlIlIIIllIIllIIIllI(final IllIlIIllIllIIlIllII illIlIIllIllIIlIllII, final String[] array, int n) {
        final String s = array[n - 1];
        final int n2 = n;
        final String ilIlIIIllIllIIIIIllI = net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI(illIlIIllIllIIlIllII, array[n++]);
        if (ilIlIIIllIllIIIIIllI.length() > 40) {
            throw new IIlllllIllIllIlIlIII("commands.scoreboard.players.name.tooLong", new Object[] { ilIlIIIllIllIIIIIllI, 40 });
        }
        final lIIIIlIIIIIlllIllIII llllIIIIlIIIlIlllIll = this.llllIIIIlIIIlIlllIll(array[n++], true);
        final int n3 = s.equalsIgnoreCase("set") ? net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(array[n++]) : net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(array[n++], 0);
        if (array.length > n) {
            final llIllIIIIIllIlIIIIlI ilIlIlIlIlllllllllIl = net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(illIlIIllIllIIlIllII, array[n2]);
            try {
                final net.minecraft.lIlIlIIIllIIllIIIllI.IIIIlllIIIIIIlIIIlll llllIIIIlIIIlIlllIll2 = net.minecraft.lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(array, n));
                final net.minecraft.lIlIlIIIllIIllIIIllI.IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll = new net.minecraft.lIlIlIIIllIIllIIIllI.IIIIlllIIIIIIlIIIlll();
                ilIlIlIlIlllllllllIl.IlIlIIIllIllIIIIIllI(iiiIlllIIIIIIlIIIlll);
                if (!IlIlIllllllllIIIIlII.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll2, iiiIlllIIIIIIlIIIlll, true)) {
                    throw new IIIIlllIIIIIIlIIIlll("commands.scoreboard.players.set.tagMismatch", new Object[] { ilIlIIIllIllIIIIIllI });
                }
            }
            catch (net.minecraft.lIlIlIIIllIIllIIIllI.lIIIlllIIIllIIIllIII liiIlllIIIllIIIllIII) {
                throw new IIIIlllIIIIIIlIIIlll("commands.scoreboard.players.set.tagError", new Object[] { liiIlllIIIllIIIllIII.getMessage() });
            }
        }
        final IlIIIlIlIIIllIlIlIIl ilIlIlIlIlllllllllIl2 = this.IlIIIlIlIIIllIlIlIIl().IlIlIlIlIlllllllllIl(ilIlIIIllIllIIIIIllI, llllIIIIlIIIlIlllIll);
        if (s.equalsIgnoreCase("set")) {
            ilIlIlIlIlllllllllIl2.llIllIIIIIllIlIIIIlI(n3);
        }
        else if (s.equalsIgnoreCase("add")) {
            ilIlIlIlIlllllllllIl2.llllIIIIlIIIlIlllIll(n3);
        }
        else {
            ilIlIlIlIlllllllllIl2.IlIlIlIlIlllllllllIl(n3);
        }
        net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(illIlIIllIllIIlIllII, this, "commands.scoreboard.players.set.success", llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(), ilIlIIIllIllIIIIIllI, ilIlIlIlIlllllllllIl2.IlIlIlIlIlllllllllIl());
    }
    
    protected void IlIlIIIllIIllIlllllI(final IllIlIIllIllIIlIllII illIlIIllIllIIlIllII, final String[] array, int n) {
        final llIIlIIIlIIIllIlIIIl ilIIIlIlIIIllIlIlIIl = this.IlIIIlIlIIIllIlIlIIl();
        final String ilIlIIIllIllIIIIIllI = net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI(illIlIIllIllIIlIllII, array[n++]);
        if (array.length > n) {
            final lIIIIlIIIIIlllIllIII llllIIIIlIIIlIlllIll = this.llllIIIIlIIIlIlllIll(array[n++], false);
            ilIIIlIlIIIllIlIlIIl.llIllIIIIIllIlIIIIlI(ilIlIIIllIllIIIIIllI, llllIIIIlIIIlIlllIll);
            net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(illIlIIllIllIIlIllII, this, "commands.scoreboard.players.resetscore.success", llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(), ilIlIIIllIllIIIIIllI);
        }
        else {
            ilIIIlIlIIIllIlIlIIl.llIllIIIIIllIlIIIIlI(ilIlIIIllIllIIIIIllI, null);
            net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(illIlIIllIllIIlIllII, this, "commands.scoreboard.players.reset.success", ilIlIIIllIllIIIIIllI);
        }
    }
    
    protected void IIIIlllIIIIIIlIIIlll(final IllIlIIllIllIIlIllII illIlIIllIllIIlIllII, final String[] array, int n) {
        final llIIlIIIlIIIllIlIIIl ilIIIlIlIIIllIlIlIIl = this.IlIIIlIlIIIllIlIlIIl();
        final String ilIIIlIlIIIllIlIlIIl2 = net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl(illIlIIllIllIIlIllII, array[n++]);
        if (ilIIIlIlIIIllIlIlIIl2.length() > 40) {
            throw new IIlllllIllIllIlIlIII("commands.scoreboard.players.name.tooLong", new Object[] { ilIIIlIlIIIllIlIlIIl2, 40 });
        }
        final lIIIIlIIIIIlllIllIII llllIIIIlIIIlIlllIll = this.llllIIIIlIIIlIlllIll(array[n], false);
        if (llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI() != IlIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI) {
            throw new IIIIlllIIIIIIlIIIlll("commands.scoreboard.players.enable.noTrigger", new Object[] { llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl() });
        }
        ilIIIlIlIIIllIlIlIIl.IlIlIlIlIlllllllllIl(ilIIIlIlIIIllIlIlIIl2, llllIIIIlIIIlIlllIll).llllIIIIlIIIlIlllIll(false);
        net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(illIlIIllIllIIlIllII, this, "commands.scoreboard.players.enable.success", llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(), ilIIIlIlIIIllIlIlIIl2);
    }
    
    protected void llllIIllllIlIlIIIIll(final IllIlIIllIllIIlIllII illIlIIllIllIIlIllII, final String[] array, int n) {
        final llIIlIIIlIIIllIlIIIl ilIIIlIlIIIllIlIlIIl = this.IlIIIlIlIIIllIlIlIIl();
        final String ilIlIIIllIllIIIIIllI = net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI(illIlIIllIllIIlIllII, array[n++]);
        if (ilIlIIIllIllIIIIIllI.length() > 40) {
            throw new IIlllllIllIllIlIlIII("commands.scoreboard.players.name.tooLong", new Object[] { ilIlIIIllIllIIIIIllI, 40 });
        }
        final lIIIIlIIIIIlllIllIII llllIIIIlIIIlIlllIll = this.llllIIIIlIIIlIlllIll(array[n++], false);
        if (!ilIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(ilIlIIIllIllIIIIIllI, llllIIIIlIIIlIlllIll)) {
            throw new IIIIlllIIIIIIlIIIlll("commands.scoreboard.players.test.notFound", new Object[] { llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(), ilIlIIIllIllIIIIIllI });
        }
        final int n2 = array[n].equals("*") ? Integer.MIN_VALUE : net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(array[n]);
        final int n3 = (++n < array.length && !array[n].equals("*")) ? net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(array[n], n2) : Integer.MAX_VALUE;
        final IlIIIlIlIIIllIlIlIIl ilIlIlIlIlllllllllIl = ilIIIlIlIIIllIlIlIIl.IlIlIlIlIlllllllllIl(ilIlIIIllIllIIIIIllI, llllIIIIlIIIlIlllIll);
        if (ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl() >= n2 && ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl() <= n3) {
            net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(illIlIIllIllIIlIllII, this, "commands.scoreboard.players.test.success", ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl(), n2, n3);
            return;
        }
        throw new IIIIlllIIIIIIlIIIlll("commands.scoreboard.players.test.failed", new Object[] { ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl(), n2, n3 });
    }
    
    protected void IlIllIlIlIIIlIlIlIII(final IllIlIIllIllIIlIllII illIlIIllIllIIlIllII, final String[] array, int n) {
        final llIIlIIIlIIIllIlIIIl ilIIIlIlIIIllIlIlIIl = this.IlIIIlIlIIIllIlIlIIl();
        final String ilIlIIIllIllIIIIIllI = net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI(illIlIIllIllIIlIllII, array[n++]);
        final lIIIIlIIIIIlllIllIII llllIIIIlIIIlIlllIll = this.llllIIIIlIIIlIlllIll(array[n++], true);
        final String s = array[n++];
        final String ilIlIIIllIllIIIIIllI2 = net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI(illIlIIllIllIIlIllII, array[n++]);
        final lIIIIlIIIIIlllIllIII llllIIIIlIIIlIlllIll2 = this.llllIIIIlIIIlIlllIll(array[n], false);
        if (ilIlIIIllIllIIIIIllI.length() > 40) {
            throw new IIlllllIllIllIlIlIII("commands.scoreboard.players.name.tooLong", new Object[] { ilIlIIIllIllIIIIIllI, 40 });
        }
        if (ilIlIIIllIllIIIIIllI2.length() > 40) {
            throw new IIlllllIllIllIlIlIII("commands.scoreboard.players.name.tooLong", new Object[] { ilIlIIIllIllIIIIIllI2, 40 });
        }
        final IlIIIlIlIIIllIlIlIIl ilIlIlIlIlllllllllIl = ilIIIlIlIIIllIlIlIIl.IlIlIlIlIlllllllllIl(ilIlIIIllIllIIIIIllI, llllIIIIlIIIlIlllIll);
        if (!ilIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(ilIlIIIllIllIIIIIllI2, llllIIIIlIIIlIlllIll2)) {
            throw new IIIIlllIIIIIIlIIIlll("commands.scoreboard.players.operation.notFound", new Object[] { llllIIIIlIIIlIlllIll2.IlIlIlIlIlllllllllIl(), ilIlIIIllIllIIIIIllI2 });
        }
        final IlIIIlIlIIIllIlIlIIl ilIlIlIlIlllllllllIl2 = ilIIIlIlIIIllIlIlIIl.IlIlIlIlIlllllllllIl(ilIlIIIllIllIIIIIllI2, llllIIIIlIIIlIlllIll2);
        if (s.equals("+=")) {
            ilIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI(ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl() + ilIlIlIlIlllllllllIl2.IlIlIlIlIlllllllllIl());
        }
        else if (s.equals("-=")) {
            ilIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI(ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl() - ilIlIlIlIlllllllllIl2.IlIlIlIlIlllllllllIl());
        }
        else if (s.equals("*=")) {
            ilIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI(ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl() * ilIlIlIlIlllllllllIl2.IlIlIlIlIlllllllllIl());
        }
        else if (s.equals("/=")) {
            if (ilIlIlIlIlllllllllIl2.IlIlIlIlIlllllllllIl() != 0) {
                ilIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI(ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl() / ilIlIlIlIlllllllllIl2.IlIlIlIlIlllllllllIl());
            }
        }
        else if (s.equals("%=")) {
            if (ilIlIlIlIlllllllllIl2.IlIlIlIlIlllllllllIl() != 0) {
                ilIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI(ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl() % ilIlIlIlIlllllllllIl2.IlIlIlIlIlllllllllIl());
            }
        }
        else if (s.equals("=")) {
            ilIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI(ilIlIlIlIlllllllllIl2.IlIlIlIlIlllllllllIl());
        }
        else if (s.equals("<")) {
            ilIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI(Math.min(ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl(), ilIlIlIlIlllllllllIl2.IlIlIlIlIlllllllllIl()));
        }
        else if (s.equals(">")) {
            ilIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI(Math.max(ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl(), ilIlIlIlIlllllllllIl2.IlIlIlIlIlllllllllIl()));
        }
        else {
            if (!s.equals("><")) {
                throw new IIIIlllIIIIIIlIIIlll("commands.scoreboard.players.operation.invalidOperation", new Object[] { s });
            }
            final int ilIlIlIlIlllllllllIl3 = ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl();
            ilIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI(ilIlIlIlIlllllllllIl2.IlIlIlIlIlllllllllIl());
            ilIlIlIlIlllllllllIl2.llIllIIIIIllIlIIIIlI(ilIlIlIlIlllllllllIl3);
        }
        net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(illIlIIllIllIIlIllII, this, "commands.scoreboard.players.operation.success", new Object[0]);
    }
    
    @Override
    public List llllIIIIlIIIlIlllIll(final IllIlIIllIllIIlIllII illIlIIllIllIIlIllII, final String[] array, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        if (array.length == 1) {
            return net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(array, "objectives", "players", "teams");
        }
        if (array[0].equalsIgnoreCase("objectives")) {
            if (array.length == 2) {
                return net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(array, "list", "add", "remove", "setdisplay");
            }
            if (array[1].equalsIgnoreCase("add")) {
                if (array.length == 4) {
                    return net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(array, IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.keySet());
                }
            }
            else if (array[1].equalsIgnoreCase("remove")) {
                if (array.length == 3) {
                    return net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(array, this.llllIIIIlIIIlIlllIll(false));
                }
            }
            else if (array[1].equalsIgnoreCase("setdisplay")) {
                if (array.length == 3) {
                    return net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(array, llIIlIIIlIIIllIlIIIl.IllIIlllIIIIlllIIlIl());
                }
                if (array.length == 4) {
                    return net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(array, this.llllIIIIlIIIlIlllIll(false));
                }
            }
        }
        else if (array[0].equalsIgnoreCase("players")) {
            if (array.length == 2) {
                return net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(array, "set", "add", "remove", "reset", "list", "enable", "test", "operation");
            }
            if (!array[1].equalsIgnoreCase("set") && !array[1].equalsIgnoreCase("add") && !array[1].equalsIgnoreCase("remove") && !array[1].equalsIgnoreCase("reset")) {
                if (array[1].equalsIgnoreCase("enable")) {
                    if (array.length == 3) {
                        return net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(array, net.minecraft.IlIlIIIIIIlllIlIllIl.llllIIIIlIIIlIlllIll.IIIIIllIIIIlIIIIllIl().llllllIllIllIlIllllI());
                    }
                    if (array.length == 4) {
                        return net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(array, this.IlIlIIIllIllIIIIIllI());
                    }
                }
                else if (!array[1].equalsIgnoreCase("list") && !array[1].equalsIgnoreCase("test")) {
                    if (array[1].equalsIgnoreCase("operation")) {
                        if (array.length == 3) {
                            return net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(array, this.IlIIIlIlIIIllIlIlIIl().IlIlIlIlIlllllllllIl());
                        }
                        if (array.length == 4) {
                            return net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(array, this.llllIIIIlIIIlIlllIll(true));
                        }
                        if (array.length == 5) {
                            return net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(array, "+=", "-=", "*=", "/=", "%=", "=", "<", ">", "><");
                        }
                        if (array.length == 6) {
                            return net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(array, net.minecraft.IlIlIIIIIIlllIlIllIl.llllIIIIlIIIlIlllIll.IIIIIllIIIIlIIIIllIl().llllllIllIllIlIllllI());
                        }
                        if (array.length == 7) {
                            return net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(array, this.llllIIIIlIIIlIlllIll(false));
                        }
                    }
                }
                else {
                    if (array.length == 3) {
                        return net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(array, this.IlIIIlIlIIIllIlIlIIl().IlIlIlIlIlllllllllIl());
                    }
                    if (array.length == 4 && array[1].equalsIgnoreCase("test")) {
                        return net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(array, this.llllIIIIlIIIlIlllIll(false));
                    }
                }
            }
            else {
                if (array.length == 3) {
                    return net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(array, net.minecraft.IlIlIIIIIIlllIlIllIl.llllIIIIlIIIlIlllIll.IIIIIllIIIIlIIIIllIl().llllllIllIllIlIllllI());
                }
                if (array.length == 4) {
                    return net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(array, this.llllIIIIlIIIlIlllIll(true));
                }
            }
        }
        else if (array[0].equalsIgnoreCase("teams")) {
            if (array.length == 2) {
                return net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(array, "add", "remove", "join", "leave", "empty", "list", "option");
            }
            if (array[1].equalsIgnoreCase("join")) {
                if (array.length == 3) {
                    return net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(array, this.IlIIIlIlIIIllIlIlIIl().IlIIIlIlIIIllIlIlIIl());
                }
                if (array.length >= 4) {
                    return net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(array, net.minecraft.IlIlIIIIIIlllIlIllIl.llllIIIIlIIIlIlllIll.IIIIIllIIIIlIIIIllIl().llllllIllIllIlIllllI());
                }
            }
            else {
                if (array[1].equalsIgnoreCase("leave")) {
                    return net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(array, net.minecraft.IlIlIIIIIIlllIlIllIl.llllIIIIlIIIlIlllIll.IIIIIllIIIIlIIIIllIl().llllllIllIllIlIllllI());
                }
                if (!array[1].equalsIgnoreCase("empty") && !array[1].equalsIgnoreCase("list") && !array[1].equalsIgnoreCase("remove")) {
                    if (array[1].equalsIgnoreCase("option")) {
                        if (array.length == 3) {
                            return net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(array, this.IlIIIlIlIIIllIlIlIIl().IlIIIlIlIIIllIlIlIIl());
                        }
                        if (array.length == 4) {
                            return net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(array, "color", "friendlyfire", "seeFriendlyInvisibles", "nametagVisibility", "deathMessageVisibility");
                        }
                        if (array.length == 5) {
                            if (array[3].equalsIgnoreCase("color")) {
                                return net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(array, IlllIIIIlIIIlIlIlIIl.llllIIIIlIIIlIlllIll(true, false));
                            }
                            if (array[3].equalsIgnoreCase("nametagVisibility") || array[3].equalsIgnoreCase("deathMessageVisibility")) {
                                return net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(array, net.minecraft.lllIIIIlllllIlIIllIl.IIIIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll());
                            }
                            if (array[3].equalsIgnoreCase("friendlyfire") || array[3].equalsIgnoreCase("seeFriendlyInvisibles")) {
                                return net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(array, "true", "false");
                            }
                        }
                    }
                }
                else if (array.length == 3) {
                    return net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(array, this.IlIIIlIlIIIllIlIlIIl().IlIIIlIlIIIllIlIlIIl());
                }
            }
        }
        return null;
    }
    
    protected List llllIIIIlIIIlIlllIll(final boolean b) {
        final Collection llllIIIIlIIIlIlllIll = this.IlIIIlIlIIIllIlIlIIl().llllIIIIlIIIlIlllIll();
        final ArrayList arrayList = Lists.newArrayList();
        for (final lIIIIlIIIIIlllIllIII liiiIlIIIIIlllIllIII : llllIIIIlIIIlIlllIll) {
            if (!b || !liiiIlIIIIIlllIllIII.llIllIIIIIllIlIIIIlI().IlIlIlIlIlllllllllIl()) {
                arrayList.add(liiiIlIIIIIlllIllIII.IlIlIlIlIlllllllllIl());
            }
        }
        return arrayList;
    }
    
    protected List IlIlIIIllIllIIIIIllI() {
        final Collection llllIIIIlIIIlIlllIll = this.IlIIIlIlIIIllIlIlIIl().llllIIIIlIIIlIlllIll();
        final ArrayList arrayList = Lists.newArrayList();
        for (final lIIIIlIIIIIlllIllIII liiiIlIIIIIlllIllIII : llllIIIIlIIIlIlllIll) {
            if (liiiIlIIIIIlllIllIII.llIllIIIIIllIlIIIIlI() == IlIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI) {
                arrayList.add(liiiIlIIIIIlllIllIII.IlIlIlIlIlllllllllIl());
            }
        }
        return arrayList;
    }
    
    @Override
    public boolean IlIlIlIlIlllllllllIl(final String[] array, final int n) {
        return array[0].equalsIgnoreCase("players") ? ((array.length > 1 && array[1].equalsIgnoreCase("operation")) ? (n == 2 || n == 5) : (n == 2)) : (array[0].equalsIgnoreCase("teams") && n == 2);
    }
}
