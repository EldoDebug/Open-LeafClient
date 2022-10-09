package net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll;

import net.minecraft.IIIlIIIlIlIIlllIIlll.*;
import net.minecraft.IlIlIlIlIlllllllllIl.*;
import com.google.common.collect.*;
import com.google.common.base.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.*;
import java.util.*;

public class llllIIIIlIIIlIlllIll extends net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll
{
    @Override
    public String llIllIIIIIllIlIIIIlI() {
        return "achievement";
    }
    
    @Override
    public int llllIIIIlIIIlIlllIll() {
        return 2;
    }
    
    @Override
    public String llIllIIIIIllIlIIIIlI(final IllIlIIllIllIIlIllII illIlIIllIllIIlIllII) {
        return "commands.achievement.usage";
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final IllIlIIllIllIIlIllII illIlIIllIllIIlIllII, final String[] array) {
        if (array.length < 2) {
            throw new llllIllllIllllIlIlII("commands.achievement.usage", new Object[0]);
        }
        final IllIIlllIIIIlllIIlIl llllIIIIlIIIlIlllIll = IIIIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll(array[1]);
        if (llllIIIIlIIIlIlllIll == null && !array[1].equals("*")) {
            throw new net.minecraft.IlIlIlIlIlllllllllIl.IIIIlllIIIIIIlIIIlll("commands.achievement.unknownAchievement", new Object[] { array[1] });
        }
        final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl = (array.length >= 3) ? net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(illIlIIllIllIIlIllII, array[2]) : net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(illIlIIllIllIIlIllII);
        final boolean equalsIgnoreCase = array[0].equalsIgnoreCase("give");
        final boolean equalsIgnoreCase2 = array[0].equalsIgnoreCase("take");
        if (equalsIgnoreCase || equalsIgnoreCase2) {
            if (llllIIIIlIIIlIlllIll == null) {
                if (equalsIgnoreCase) {
                    final Iterator<net.minecraft.IIIlIIIlIlIIlllIIlll.llllIIIIlIIIlIlllIll> iterator = (Iterator<net.minecraft.IIIlIIIlIlIIlllIIlll.llllIIIIlIIIlIlllIll>)IlIlIlIlIlllllllllIl.IlIlIIIllIllIIIIIllI.iterator();
                    while (iterator.hasNext()) {
                        ilIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(iterator.next());
                    }
                    net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(illIlIIllIllIIlIllII, this, "commands.achievement.give.success.all", ilIIIlIlIIIllIlIlIIl.s_());
                }
                else if (equalsIgnoreCase2) {
                    final Iterator<net.minecraft.IIIlIIIlIlIIlllIIlll.llllIIIIlIIIlIlllIll> iterator2 = (Iterator<net.minecraft.IIIlIIIlIlIIlllIIlll.llllIIIIlIIIlIlllIll>)Lists.reverse(IlIlIlIlIlllllllllIl.IlIlIIIllIllIIIIIllI).iterator();
                    while (iterator2.hasNext()) {
                        ilIIIlIlIIIllIlIlIIl.IlIlIlIlIlllllllllIl(iterator2.next());
                    }
                    net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(illIlIIllIllIIlIllII, this, "commands.achievement.take.success.all", ilIIIlIlIIIllIlIlIIl.s_());
                }
            }
            else {
                if (llllIIIIlIIIlIlllIll instanceof net.minecraft.IIIlIIIlIlIIlllIIlll.llllIIIIlIIIlIlllIll) {
                    net.minecraft.IIIlIIIlIlIIlllIIlll.llllIIIIlIIIlIlllIll llIllIIIIIllIlIIIIlI = (net.minecraft.IIIlIIIlIlIIlllIIlll.llllIIIIlIIIlIlllIll)llllIIIIlIIIlIlllIll;
                    if (equalsIgnoreCase) {
                        if (ilIIIlIlIIIllIlIlIIl.IIlllIIIlIlllIIlllII().llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI)) {
                            throw new net.minecraft.IlIlIlIlIlllllllllIl.IIIIlllIIIIIIlIIIlll("commands.achievement.alreadyHave", new Object[] { ilIIIlIlIIIllIlIlIIl.s_(), llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl() });
                        }
                        final ArrayList arrayList = Lists.newArrayList();
                        while (llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI != null && !ilIIIlIlIIIllIlIlIIl.IIlllIIIlIlllIIlllII().llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI)) {
                            arrayList.add(llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI);
                            llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI;
                        }
                        final Iterator iterator3 = Lists.reverse((List)arrayList).iterator();
                        while (iterator3.hasNext()) {
                            ilIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(iterator3.next());
                        }
                    }
                    else if (equalsIgnoreCase2) {
                        if (!ilIIIlIlIIIllIlIlIIl.IIlllIIIlIlllIIlllII().llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI)) {
                            throw new net.minecraft.IlIlIlIlIlllllllllIl.IIIIlllIIIIIIlIIIlll("commands.achievement.dontHave", new Object[] { ilIIIlIlIIIllIlIlIIl.s_(), llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl() });
                        }
                        final ArrayList arrayList2 = Lists.newArrayList((Iterator)Iterators.filter((Iterator)IlIlIlIlIlllllllllIl.IlIlIIIllIllIIIIIllI.iterator(), (Predicate)new net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(this, ilIIIlIlIIIllIlIlIIl, llllIIIIlIIIlIlllIll)));
                        final ArrayList arrayList3 = Lists.newArrayList((Iterable)arrayList2);
                        for (net.minecraft.IIIlIIIlIlIIlllIIlll.llllIIIIlIIIlIlllIll llIllIIIIIllIlIIIIlI2 : arrayList2) {
                            final net.minecraft.IIIlIIIlIlIIlllIIlll.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll2 = llIllIIIIIllIlIIIIlI2;
                            boolean b = false;
                            while (llIllIIIIIllIlIIIIlI2 != null) {
                                if (llIllIIIIIllIlIIIIlI2 == llllIIIIlIIIlIlllIll) {
                                    b = true;
                                }
                                llIllIIIIIllIlIIIIlI2 = llIllIIIIIllIlIIIIlI2.llIllIIIIIllIlIIIIlI;
                            }
                            if (!b) {
                                for (net.minecraft.IIIlIIIlIlIIlllIIlll.llllIIIIlIIIlIlllIll llIllIIIIIllIlIIIIlI3 = llllIIIIlIIIlIlllIll2; llIllIIIIIllIlIIIIlI3 != null; llIllIIIIIllIlIIIIlI3 = llIllIIIIIllIlIIIIlI3.llIllIIIIIllIlIIIIlI) {
                                    arrayList3.remove(llllIIIIlIIIlIlllIll2);
                                }
                            }
                        }
                        final Iterator<net.minecraft.IIIlIIIlIlIIlllIIlll.llllIIIIlIIIlIlllIll> iterator5 = (Iterator<net.minecraft.IIIlIIIlIlIIlllIIlll.llllIIIIlIIIlIlllIll>)arrayList3.iterator();
                        while (iterator5.hasNext()) {
                            ilIIIlIlIIIllIlIlIIl.IlIlIlIlIlllllllllIl(iterator5.next());
                        }
                    }
                }
                if (equalsIgnoreCase) {
                    ilIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll);
                    net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(illIlIIllIllIIlIllII, this, "commands.achievement.give.success.one", ilIIIlIlIIIllIlIlIIl.s_(), llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl());
                }
                else if (equalsIgnoreCase2) {
                    ilIIIlIlIIIllIlIlIIl.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll);
                    net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(illIlIIllIllIIlIllII, this, "commands.achievement.take.success.one", llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl(), ilIIIlIlIIIllIlIlIIl.s_());
                }
            }
        }
    }
    
    @Override
    public List llllIIIIlIIIlIlllIll(final IllIlIIllIllIIlIllII illIlIIllIllIIlIllII, final String[] array, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        if (array.length == 1) {
            return net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(array, "give", "take");
        }
        if (array.length != 2) {
            return (array.length == 3) ? net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(array, net.minecraft.IlIlIIIIIIlllIlIllIl.llllIIIIlIIIlIlllIll.IIIIIllIIIIlIIIIllIl().llllllIllIllIlIllllI()) : null;
        }
        final ArrayList arrayList = Lists.newArrayList();
        final Iterator<IllIIlllIIIIlllIIlIl> iterator = IIIIlllIIIIIIlIIIlll.IlIlIlIlIlllllllllIl.iterator();
        while (iterator.hasNext()) {
            arrayList.add(iterator.next().IlIlIIIllIllIIIIIllI);
        }
        return net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(array, arrayList);
    }
    
    @Override
    public boolean IlIlIlIlIlllllllllIl(final String[] array, final int n) {
        return n == 2;
    }
}
