package net.minecraft.llIllIlIIIIllIlIIllI;

import net.minecraft.IlIIIlIlIIIllIlIlIIl.*;
import net.minecraft.llllIIllllIlIlIIIIll.*;
import net.minecraft.lIlIlIIIllIIllIIIllI.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.IIIlIIIlIlIIlllIIlll.*;
import net.minecraft.lIIIlllIIIllIIIllIII.*;
import java.util.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.lIIIIlIIIIIlllIllIII.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import com.google.common.collect.*;

public class lllllIIIIIlIIlllIlIl extends IlIIIlIlIIIllIlIlIIl
{
    private Map llllIIIlIlllIlIIIIIl;
    private static final Map lIIIIlIIIIIlllIllIII;
    
    static {
        lIIIIlIIIIIlllIllIII = Maps.newLinkedHashMap();
    }
    
    public lllllIIIIIlIIlllIlIl() {
        this.llllIIIlIlllIlIIIIIl = Maps.newHashMap();
        this.IlIlIlIlIlllllllllIl(1);
        this.llllIIIIlIIIlIlllIll(true);
        this.IlIIIlIlIIIllIlIlIIl(0);
        this.llllIIIIlIIIlIlllIll(net.minecraft.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll.llIllIlIIIIllIlIIllI);
    }
    
    public List llIllIlIIIIllIlIIllI(final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl) {
        if (lllIIIIlIlIllIIlIIIl.IIIIlllIIIIIIlIIIlll() && lllIIIIlIlIllIIlIIIl.llllIIllllIlIlIIIIll().IlIlIlIlIlllllllllIl("CustomPotionEffects", 9)) {
            final ArrayList arrayList = Lists.newArrayList();
            final IlIlIIIlIIlIlIIlllIl llIllIIIIIllIlIIIIlI = lllIIIIlIlIllIIlIIIl.llllIIllllIlIlIIIIll().llIllIIIIIllIlIIIIlI("CustomPotionEffects", 10);
            for (int i = 0; i < llIllIIIIIllIlIIIIlI.IlIlIIIllIllIIIIIllI(); ++i) {
                final net.minecraft.llllIIllllIlIlIIIIll.IlIIIlIlIIIllIlIlIIl ilIlIlIlIlllllllllIl = net.minecraft.llllIIllllIlIlIIIIll.IlIIIlIlIIIllIlIlIIl.IlIlIlIlIlllllllllIl(llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(i));
                if (ilIlIlIlIlllllllllIl != null) {
                    arrayList.add(ilIlIlIlIlllllllllIl);
                }
            }
            return arrayList;
        }
        List ilIlIlIlIlllllllllIl2 = this.llllIIIlIlllIlIIIIIl.get(lllIIIIlIlIllIIlIIIl.lIIIIlIIIIIlllIllIII());
        if (ilIlIlIlIlllllllllIl2 == null) {
            ilIlIlIlIlllllllllIl2 = net.minecraft.llllIIllllIlIlIIIIll.llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl(lllIIIIlIlIllIIlIIIl.lIIIIlIIIIIlllIllIII(), false);
            this.llllIIIlIlllIlIIIIIl.put(lllIIIIlIlIllIIlIIIl.lIIIIlIIIIIlllIllIII(), ilIlIlIlIlllllllllIl2);
        }
        return ilIlIlIlIlllllllllIl2;
    }
    
    public List IlIlIIIllIllIIIIIllI(final int n) {
        List ilIlIlIlIlllllllllIl = this.llllIIIlIlllIlIIIIIl.get(n);
        if (ilIlIlIlIlllllllllIl == null) {
            ilIlIlIlIlllllllllIl = net.minecraft.llllIIllllIlIlIIIIll.llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl(n, false);
            this.llllIIIlIlllIlIIIIIl.put(n, ilIlIlIlIlllllllllIl);
        }
        return ilIlIlIlIlllllllllIl;
    }
    
    @Override
    public lllIIIIlIlIllIIlIIIl IlIlIlIlIlllllllllIl(final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl, final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        if (!llllIIIIlIIIlIlllIll.K.IlIIIlIlIIIllIlIlIIl) {
            --lllIIIIlIlIllIIlIIIl.IlIlIlIlIlllllllllIl;
        }
        if (!illlllllIIIlIIIlIlII.IlIlIllllllllIIIIlII) {
            final List llIllIlIIIIllIlIIllI = this.llIllIlIIIIllIlIIllI(lllIIIIlIlIllIIlIIIl);
            if (llIllIlIIIIllIlIIllI != null) {
                final Iterator<net.minecraft.llllIIllllIlIlIIIIll.IlIIIlIlIIIllIlIlIIl> iterator = llIllIlIIIIllIlIIllI.iterator();
                while (iterator.hasNext()) {
                    llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(new net.minecraft.llllIIllllIlIlIIIIll.IlIIIlIlIIIllIlIlIIl(iterator.next()));
                }
            }
        }
        llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(IIIIlllIIIIIIlIIIlll.IlIIllIIllIIllIIlIIl[net.minecraft.llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(this)]);
        if (!llllIIIIlIIIlIlllIll.K.IlIIIlIlIIIllIlIlIIl) {
            if (lllIIIIlIlIllIIlIIIl.IlIlIlIlIlllllllllIl <= 0) {
                return new lllIIIIlIlIllIIlIIIl(IIllIIllIIIlIlIIIIlI.E);
            }
            llllIIIIlIIIlIlllIll.lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll(new lllIIIIlIlIllIIlIIIl(IIllIIllIIIlIlIIIIlI.E));
        }
        return lllIIIIlIlIllIIlIIIl;
    }
    
    @Override
    public int IlIIIlIlIIIllIlIlIIl(final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl) {
        return 32;
    }
    
    @Override
    public net.minecraft.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll llIllIIIIIllIlIIIIlI(final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl) {
        return net.minecraft.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI;
    }
    
    @Override
    public lllIIIIlIlIllIIlIIIl llllIIIIlIIIlIlllIll(final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl, final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        if (IllIIlllIIIIlllIIlIl(lllIIIIlIlIllIIlIIIl.lIIIIlIIIIIlllIllIII())) {
            if (!llllIIIIlIIIlIlllIll.K.IlIIIlIlIIIllIlIlIIl) {
                --lllIIIIlIlIllIIlIIIl.IlIlIlIlIlllllllllIl;
            }
            illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll((llIllIIIIIllIlIIIIlI)llllIIIIlIIIlIlllIll, "random.bow", 0.5f, 0.4f / (lllllIIIIIlIIlllIlIl.llIllIIIIIllIlIIIIlI.nextFloat() * 0.4f + 0.8f));
            if (!illlllllIIIlIIIlIlII.IlIlIllllllllIIIIlII) {
                illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(new IllIIlllIIIIlllIIlIl(illlllllIIIlIIIlIlII, llllIIIIlIIIlIlllIll, lllIIIIlIlIllIIlIIIl));
            }
            llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(IIIIlllIIIIIIlIIIlll.IlIIllIIllIIllIIlIIl[net.minecraft.llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(this)]);
            return lllIIIIlIlIllIIlIIIl;
        }
        llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(lllIIIIlIlIllIIlIIIl, this.IlIIIlIlIIIllIlIlIIl(lllIIIIlIlIllIIlIIIl));
        return lllIIIIlIlIllIIlIIIl;
    }
    
    public static boolean IllIIlllIIIIlllIIlIl(final int n) {
        return (n & 0x4000) != 0x0;
    }
    
    public int llllIIIlIlllIlIIIIIl(final int n) {
        return net.minecraft.llllIIllllIlIlIIIIll.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll(n, false);
    }
    
    @Override
    public int llllIIIIlIIIlIlllIll(final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl, final int n) {
        return (n > 0) ? 16777215 : this.llllIIIlIlllIlIIIIIl(lllIIIIlIlIllIIlIIIl.lIIIIlIIIIIlllIllIII());
    }
    
    public boolean lIIIIlIIIIIlllIllIII(final int n) {
        final List ilIlIIIllIllIIIIIllI = this.IlIlIIIllIllIIIIIllI(n);
        if (ilIlIIIllIllIIIIIllI != null && !ilIlIIIllIllIIIIIllI.isEmpty()) {
            final Iterator<net.minecraft.llllIIllllIlIlIIIIll.IlIIIlIlIIIllIlIlIIl> iterator = ilIlIIIllIllIIIIIllI.iterator();
            while (iterator.hasNext()) {
                if (net.minecraft.llllIIllllIlIlIIIIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll[iterator.next().llllIIIIlIIIlIlllIll()].llIllIIIIIllIlIIIIlI()) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }
    
    @Override
    public String llllIIIlIlllIlIIIIIl(final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl) {
        if (lllIIIIlIlIllIIlIIIl.lIIIIlIIIIIlllIllIII() == 0) {
            return lIIlllIlllllIIlllIll.llllIIIIlIIIlIlllIll("item.emptyPotion.name").trim();
        }
        String string = "";
        if (IllIIlllIIIIlllIIlIl(lllIIIIlIlIllIIlIIIl.lIIIIlIIIIIlllIllIII())) {
            string = String.valueOf(lIIlllIlllllIIlllIll.llllIIIIlIIIlIlllIll("potion.prefix.grenade").trim()) + " ";
        }
        final List llIllIlIIIIllIlIIllI = IIllIIllIIIlIlIIIIlI.D.llIllIlIIIIllIlIIllI(lllIIIIlIlIllIIlIIIl);
        if (llIllIlIIIIllIlIIllI != null && !llIllIlIIIIllIlIIllI.isEmpty()) {
            return String.valueOf(string) + lIIlllIlllllIIlllIll.llllIIIIlIIIlIlllIll(String.valueOf(llIllIlIIIIllIlIIllI.get(0).IllIIlllIIIIlllIIlIl()) + ".postfix").trim();
        }
        return String.valueOf(lIIlllIlllllIIlllIll.llllIIIIlIIIlIlllIll(net.minecraft.llllIIllllIlIlIIIIll.llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl(lllIIIIlIlIllIIlIIIl.lIIIIlIIIIIlllIllIII())).trim()) + " " + super.llllIIIlIlllIlIIIIIl(lllIIIIlIlIllIIlIIIl);
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl, final net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final List list, final boolean b) {
        if (lllIIIIlIlIllIIlIIIl.lIIIIlIIIIIlllIllIII() != 0) {
            final List llIllIlIIIIllIlIIllI = IIllIIllIIIlIlIIIIlI.D.llIllIlIIIIllIlIIllI(lllIIIIlIlIllIIlIIIl);
            final HashMultimap create = HashMultimap.create();
            if (llIllIlIIIIllIlIIllI != null && !llIllIlIIIIllIlIIllI.isEmpty()) {
                for (final net.minecraft.llllIIllllIlIlIIIIll.IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl : llIllIlIIIIllIlIIllI) {
                    String s = lIIlllIlllllIIlllIll.llllIIIIlIIIlIlllIll(ilIIIlIlIIIllIlIlIIl.IllIIlllIIIIlllIIlIl()).trim();
                    final net.minecraft.llllIIllllIlIlIIIIll.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll2 = net.minecraft.llllIIllllIlIlIIIIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll[ilIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll()];
                    final Map llIllIlIIIIllIlIIllI2 = llllIIIIlIIIlIlllIll2.llIllIlIIIIllIlIIllI();
                    if (llIllIlIIIIllIlIIllI2 != null && llIllIlIIIIllIlIIllI2.size() > 0) {
                        for (final Map.Entry<K, net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll> entry : llIllIlIIIIllIlIIllI2.entrySet()) {
                            final net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll3 = entry.getValue();
                            ((Multimap)create).put((Object)((net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl)entry.getKey()).llllIIIIlIIIlIlllIll(), (Object)new net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll3.IlIlIlIlIlllllllllIl(), llllIIIIlIIIlIlllIll2.llllIIIIlIIIlIlllIll(ilIIIlIlIIIllIlIlIIl.llIllIIIIIllIlIIIIlI(), llllIIIIlIIIlIlllIll3), llllIIIIlIIIlIlllIll3.llIllIIIIIllIlIIIIlI()));
                        }
                    }
                    if (ilIIIlIlIIIllIlIlIIl.llIllIIIIIllIlIIIIlI() > 0) {
                        s = String.valueOf(s) + " " + lIIlllIlllllIIlllIll.llllIIIIlIIIlIlllIll("potion.potency." + ilIIIlIlIIIllIlIlIIl.llIllIIIIIllIlIIIIlI()).trim();
                    }
                    if (ilIIIlIlIIIllIlIlIIl.IlIlIlIlIlllllllllIl() > 20) {
                        s = String.valueOf(s) + " (" + net.minecraft.llllIIllllIlIlIIIIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(ilIIIlIlIIIllIlIlIIl) + ")";
                    }
                    if (llllIIIIlIIIlIlllIll2.llllIIIlIlllIlIIIIIl()) {
                        list.add(IlllIIIIlIIIlIlIlIIl.IlIlIIIllIIllIlllllI + s);
                    }
                    else {
                        list.add(IlllIIIIlIIIlIlIlIIl.lIIIIlIIIIIlllIllIII + s);
                    }
                }
            }
            else {
                list.add(IlllIIIIlIIIlIlIlIIl.lIIIIlIIIIIlllIllIII + lIIlllIlllllIIlllIll.llllIIIIlIIIlIlllIll("potion.empty").trim());
            }
            if (!((Multimap)create).isEmpty()) {
                list.add("");
                list.add(IlllIIIIlIIIlIlIlIIl.IllIIlllIIIIlllIIlIl + lIIlllIlllllIIlllIll.llllIIIIlIIIlIlllIll("potion.effects.whenDrank"));
                for (final Map.Entry<K, net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll> entry2 : ((Multimap)create).entries()) {
                    final net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll4 = entry2.getValue();
                    final double ilIIIlIlIIIllIlIlIIl2 = llllIIIIlIIIlIlllIll4.IlIIIlIlIIIllIlIlIIl();
                    double ilIIIlIlIIIllIlIlIIl3;
                    if (llllIIIIlIIIlIlllIll4.llIllIIIIIllIlIIIIlI() != 1 && llllIIIIlIIIlIlllIll4.llIllIIIIIllIlIIIIlI() != 2) {
                        ilIIIlIlIIIllIlIlIIl3 = llllIIIIlIIIlIlllIll4.IlIIIlIlIIIllIlIlIIl();
                    }
                    else {
                        ilIIIlIlIIIllIlIlIIl3 = llllIIIIlIIIlIlllIll4.IlIIIlIlIIIllIlIlIIl() * 100.0;
                    }
                    if (ilIIIlIlIIIllIlIlIIl2 > 0.0) {
                        list.add(IlllIIIIlIIIlIlIlIIl.llIIlIIIlIIIllIlIIIl + lIIlllIlllllIIlllIll.llllIIIIlIIIlIlllIll("attribute.modifier.plus." + llllIIIIlIIIlIlllIll4.llIllIIIIIllIlIIIIlI(), lllIIIIlIlIllIIlIIIl.llllIIIIlIIIlIlllIll.format(ilIIIlIlIIIllIlIlIIl3), lIIlllIlllllIIlllIll.llllIIIIlIIIlIlllIll("attribute.name." + (String)entry2.getKey())));
                    }
                    else {
                        if (ilIIIlIlIIIllIlIlIIl2 >= 0.0) {
                            continue;
                        }
                        list.add(IlllIIIIlIIIlIlIlIIl.IlIlIIIllIIllIlllllI + lIIlllIlllllIIlllIll.llllIIIIlIIIlIlllIll("attribute.modifier.take." + llllIIIIlIIIlIlllIll4.llIllIIIIIllIlIIIIlI(), lllIIIIlIlIllIIlIIIl.llllIIIIlIIIlIlllIll.format(ilIIIlIlIIIllIlIlIIl3 * -1.0), lIIlllIlllllIIlllIll.llllIIIIlIIIlIlllIll("attribute.name." + (String)entry2.getKey())));
                    }
                }
            }
        }
    }
    
    @Override
    public boolean lIIIIlIIIIIlllIllIII(final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl) {
        final List llIllIlIIIIllIlIIllI = this.llIllIlIIIIllIlIIllI(lllIIIIlIlIllIIlIIIl);
        return llIllIlIIIIllIlIIllI != null && !llIllIlIIIIllIlIIllI.isEmpty();
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl, final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final List list) {
        super.llllIIIIlIIIlIlllIll(ilIIIlIlIIIllIlIlIIl, llllIIIIlIIIlIlllIll, list);
        if (lllllIIIIIlIIlllIlIl.lIIIIlIIIIIlllIllIII.isEmpty()) {
            for (int i = 0; i <= 15; ++i) {
                for (int j = 0; j <= 1; ++j) {
                    int n;
                    if (j == 0) {
                        n = (i | 0x2000);
                    }
                    else {
                        n = (i | 0x4000);
                    }
                    for (int k = 0; k <= 2; ++k) {
                        int n2 = n;
                        if (k != 0) {
                            if (k == 1) {
                                n2 = (n | 0x20);
                            }
                            else if (k == 2) {
                                n2 = (n | 0x40);
                            }
                        }
                        final List ilIlIlIlIlllllllllIl = net.minecraft.llllIIllllIlIlIIIIll.llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl(n2, false);
                        if (ilIlIlIlIlllllllllIl != null && !ilIlIlIlIlllllllllIl.isEmpty()) {
                            lllllIIIIIlIIlllIlIl.lIIIIlIIIIIlllIllIII.put(ilIlIlIlIlllllllllIl, n2);
                        }
                    }
                }
            }
        }
        final Iterator<Integer> iterator = lllllIIIIIlIIlllIlIl.lIIIIlIIIIIlllIllIII.values().iterator();
        while (iterator.hasNext()) {
            list.add(new lllIIIIlIlIllIIlIIIl(ilIIIlIlIIIllIlIlIIl, 1, iterator.next()));
        }
    }
}
