package net.minecraft.lllIIIIlllllIlIIllIl;

import com.google.common.collect.*;
import java.util.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.*;

public class llIIlIIIlIIIllIlIIIl
{
    private final Map llllIIIIlIIIlIlllIll;
    private final Map IlIlIlIlIlllllllllIl;
    private final Map llIllIIIIIllIlIIIIlI;
    private final lIIIIlIIIIIlllIllIII[] IlIIIlIlIIIllIlIlIIl;
    private final Map IlIlIIIllIllIIIIIllI;
    private final Map IllIIlllIIIIlllIIlIl;
    private static String[] llllIIIlIlllIlIIIIIl;
    
    static {
        llIIlIIIlIIIllIlIIIl.llllIIIlIlllIlIIIIIl = null;
    }
    
    public llIIlIIIlIIIllIlIIIl() {
        this.llllIIIIlIIIlIlllIll = Maps.newHashMap();
        this.IlIlIlIlIlllllllllIl = Maps.newHashMap();
        this.llIllIIIIIllIlIIIIlI = Maps.newHashMap();
        this.IlIIIlIlIIIllIlIlIIl = new lIIIIlIIIIIlllIllIII[19];
        this.IlIlIIIllIllIIIIIllI = Maps.newHashMap();
        this.IllIIlllIIIIlllIIlIl = Maps.newHashMap();
    }
    
    public lIIIIlIIIIIlllIllIII llllIIIIlIIIlIlllIll(final String s) {
        return this.llllIIIIlIIIlIlllIll.get(s);
    }
    
    public lIIIIlIIIIIlllIllIII llllIIIIlIIIlIlllIll(final String s, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        if (s.length() > 16) {
            throw new IllegalArgumentException("The objective name '" + s + "' is too long!");
        }
        if (this.llllIIIIlIIIlIlllIll(s) != null) {
            throw new IllegalArgumentException("An objective with the name '" + s + "' already exists!");
        }
        final lIIIIlIIIIIlllIllIII liiiIlIIIIIlllIllIII = new lIIIIlIIIIIlllIllIII(this, s, ilIlIlIlIlllllllllIl);
        List<lIIIIlIIIIIlllIllIII> arrayList = this.IlIlIlIlIlllllllllIl.get(ilIlIlIlIlllllllllIl);
        if (arrayList == null) {
            arrayList = (List<lIIIIlIIIIIlllIllIII>)Lists.newArrayList();
            this.IlIlIlIlIlllllllllIl.put(ilIlIlIlIlllllllllIl, arrayList);
        }
        arrayList.add(liiiIlIIIIIlllIllIII);
        this.llllIIIIlIIIlIlllIll.put(s, liiiIlIIIIIlllIllIII);
        this.llIllIIIIIllIlIIIIlI(liiiIlIIIIIlllIllIII);
        return liiiIlIIIIIlllIllIII;
    }
    
    public Collection llllIIIIlIIIlIlllIll(final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        final Collection collection = this.IlIlIlIlIlllllllllIl.get(ilIlIlIlIlllllllllIl);
        return (collection == null) ? Lists.newArrayList() : Lists.newArrayList((Iterable)collection);
    }
    
    public boolean llllIIIIlIIIlIlllIll(final String s, final lIIIIlIIIIIlllIllIII liiiIlIIIIIlllIllIII) {
        final Map<Object, IlIIIlIlIIIllIlIlIIl> map = this.llIllIIIIIllIlIIIIlI.get(s);
        return map != null && map.get(liiiIlIIIIIlllIllIII) != null;
    }
    
    public IlIIIlIlIIIllIlIlIIl IlIlIlIlIlllllllllIl(final String s, final lIIIIlIIIIIlllIllIII liiiIlIIIIIlllIllIII) {
        if (s.length() > 40) {
            throw new IllegalArgumentException("The player name '" + s + "' is too long!");
        }
        Map<Object, IlIIIlIlIIIllIlIlIIl> hashMap = this.llIllIIIIIllIlIIIIlI.get(s);
        if (hashMap == null) {
            hashMap = (Map<Object, IlIIIlIlIIIllIlIlIIl>)Maps.newHashMap();
            this.llIllIIIIIllIlIIIIlI.put(s, hashMap);
        }
        IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl = hashMap.get(liiiIlIIIIIlllIllIII);
        if (ilIIIlIlIIIllIlIlIIl == null) {
            ilIIIlIlIIIllIlIlIIl = new IlIIIlIlIIIllIlIlIIl(this, liiiIlIIIIIlllIllIII, s);
            hashMap.put(liiiIlIIIIIlllIllIII, ilIIIlIlIIIllIlIlIIl);
        }
        return ilIIIlIlIIIllIlIlIIl;
    }
    
    public Collection llllIIIIlIIIlIlllIll(final lIIIIlIIIIIlllIllIII liiiIlIIIIIlllIllIII) {
        final ArrayList arrayList = Lists.newArrayList();
        final Iterator<Map<Object, IlIIIlIlIIIllIlIlIIl>> iterator = this.llIllIIIIIllIlIIIIlI.values().iterator();
        while (iterator.hasNext()) {
            final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl = iterator.next().get(liiiIlIIIIIlllIllIII);
            if (ilIIIlIlIIIllIlIlIIl != null) {
                arrayList.add(ilIIIlIlIIIllIlIlIIl);
            }
        }
        Collections.sort((List<Object>)arrayList, net.minecraft.lllIIIIlllllIlIIllIl.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll);
        return arrayList;
    }
    
    public Collection llllIIIIlIIIlIlllIll() {
        return this.llllIIIIlIIIlIlllIll.values();
    }
    
    public Collection IlIlIlIlIlllllllllIl() {
        return this.llIllIIIIIllIlIIIIlI.keySet();
    }
    
    public void llIllIIIIIllIlIIIIlI(final String s, final lIIIIlIIIIIlllIllIII liiiIlIIIIIlllIllIII) {
        if (liiiIlIIIIIlllIllIII == null) {
            if (this.llIllIIIIIllIlIIIIlI.remove(s) != null) {
                this.llllIIIlIlllIlIIIIIl(s);
            }
        }
        else {
            final Map<Object, IlIIIlIlIIIllIlIlIIl> map = this.llIllIIIIIllIlIIIIlI.get(s);
            if (map != null) {
                final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl = map.remove(liiiIlIIIIIlllIllIII);
                if (map.size() < 1) {
                    if (this.llIllIIIIIllIlIIIIlI.remove(s) != null) {
                        this.llllIIIlIlllIlIIIIIl(s);
                    }
                }
                else if (ilIIIlIlIIIllIlIlIIl != null) {
                    this.IlIIIlIlIIIllIlIlIIl(s, liiiIlIIIIIlllIllIII);
                }
            }
        }
    }
    
    public Collection llIllIIIIIllIlIIIIlI() {
        final Collection<Map<Object, ? extends E>> values = this.llIllIIIIIllIlIIIIlI.values();
        final ArrayList arrayList = Lists.newArrayList();
        final Iterator<Map<Object, ? extends E>> iterator = values.iterator();
        while (iterator.hasNext()) {
            arrayList.addAll(iterator.next().values());
        }
        return arrayList;
    }
    
    public Map IlIlIlIlIlllllllllIl(final String s) {
        Map hashMap = this.llIllIIIIIllIlIIIIlI.get(s);
        if (hashMap == null) {
            hashMap = Maps.newHashMap();
        }
        return hashMap;
    }
    
    public void IlIlIlIlIlllllllllIl(final lIIIIlIIIIIlllIllIII liiiIlIIIIIlllIllIII) {
        this.llllIIIIlIIIlIlllIll.remove(liiiIlIIIIIlllIllIII.IlIlIlIlIlllllllllIl());
        for (int i = 0; i < 19; ++i) {
            if (this.llllIIIIlIIIlIlllIll(i) == liiiIlIIIIIlllIllIII) {
                this.llllIIIIlIIIlIlllIll(i, null);
            }
        }
        final List list = this.IlIlIlIlIlllllllllIl.get(liiiIlIIIIIlllIllIII.llIllIIIIIllIlIIIIlI());
        if (list != null) {
            list.remove(liiiIlIIIIIlllIllIII);
        }
        final Iterator<Map> iterator = this.llIllIIIIIllIlIIIIlI.values().iterator();
        while (iterator.hasNext()) {
            iterator.next().remove(liiiIlIIIIIlllIllIII);
        }
        this.IlIlIIIllIllIIIIIllI(liiiIlIIIIIlllIllIII);
    }
    
    public void llllIIIIlIIIlIlllIll(final int n, final lIIIIlIIIIIlllIllIII liiiIlIIIIIlllIllIII) {
        this.IlIIIlIlIIIllIlIlIIl[n] = liiiIlIIIIIlllIllIII;
    }
    
    public lIIIIlIIIIIlllIllIII llllIIIIlIIIlIlllIll(final int n) {
        return this.IlIIIlIlIIIllIlIlIIl[n];
    }
    
    public lIIIlllIIIllIIIllIII llIllIIIIIllIlIIIIlI(final String s) {
        return this.IlIlIIIllIllIIIIIllI.get(s);
    }
    
    public lIIIlllIIIllIIIllIII IlIIIlIlIIIllIlIlIIl(final String s) {
        if (s.length() > 16) {
            throw new IllegalArgumentException("The team name '" + s + "' is too long!");
        }
        if (this.llIllIIIIIllIlIIIIlI(s) != null) {
            throw new IllegalArgumentException("A team with the name '" + s + "' already exists!");
        }
        final lIIIlllIIIllIIIllIII liiIlllIIIllIIIllIII = new lIIIlllIIIllIIIllIII(this, s);
        this.IlIlIIIllIllIIIIIllI.put(s, liiIlllIIIllIIIllIII);
        this.IlIlIlIlIlllllllllIl(liiIlllIIIllIIIllIII);
        return liiIlllIIIllIIIllIII;
    }
    
    public void llllIIIIlIIIlIlllIll(final lIIIlllIIIllIIIllIII liiIlllIIIllIIIllIII) {
        this.IlIlIIIllIllIIIIIllI.remove(liiIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll());
        final Iterator<String> iterator = liiIlllIIIllIIIllIII.llIllIIIIIllIlIIIIlI().iterator();
        while (iterator.hasNext()) {
            this.IllIIlllIIIIlllIIlIl.remove(iterator.next());
        }
        this.IlIIIlIlIIIllIlIlIIl(liiIlllIIIllIIIllIII);
    }
    
    public boolean llllIIIIlIIIlIlllIll(final String s, final String s2) {
        if (s.length() > 40) {
            throw new IllegalArgumentException("The player name '" + s + "' is too long!");
        }
        if (!this.IlIlIIIllIllIIIIIllI.containsKey(s2)) {
            return false;
        }
        final lIIIlllIIIllIIIllIII llIllIIIIIllIlIIIIlI = this.llIllIIIIIllIlIIIIlI(s2);
        if (this.IllIIlllIIIIlllIIlIl(s) != null) {
            this.IlIlIIIllIllIIIIIllI(s);
        }
        this.IllIIlllIIIIlllIIlIl.put(s, llIllIIIIIllIlIIIIlI);
        llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI().add(s);
        return true;
    }
    
    public boolean IlIlIIIllIllIIIIIllI(final String s) {
        final lIIIlllIIIllIIIllIII illIIlllIIIIlllIIlIl = this.IllIIlllIIIIlllIIlIl(s);
        if (illIIlllIIIIlllIIlIl != null) {
            this.llllIIIIlIIIlIlllIll(s, illIIlllIIIIlllIIlIl);
            return true;
        }
        return false;
    }
    
    public void llllIIIIlIIIlIlllIll(final String s, final lIIIlllIIIllIIIllIII liiIlllIIIllIIIllIII) {
        if (this.IllIIlllIIIIlllIIlIl(s) != liiIlllIIIllIIIllIII) {
            throw new IllegalStateException("Player is either on another team or not on any team. Cannot remove from team '" + liiIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll() + "'.");
        }
        this.IllIIlllIIIIlllIIlIl.remove(s);
        liiIlllIIIllIIIllIII.llIllIIIIIllIlIIIIlI().remove(s);
    }
    
    public Collection IlIIIlIlIIIllIlIlIIl() {
        return this.IlIlIIIllIllIIIIIllI.keySet();
    }
    
    public Collection IlIlIIIllIllIIIIIllI() {
        return this.IlIlIIIllIllIIIIIllI.values();
    }
    
    public lIIIlllIIIllIIIllIII IllIIlllIIIIlllIIlIl(final String s) {
        return this.IllIIlllIIIIlllIIlIl.get(s);
    }
    
    public void llIllIIIIIllIlIIIIlI(final lIIIIlIIIIIlllIllIII liiiIlIIIIIlllIllIII) {
    }
    
    public void IlIIIlIlIIIllIlIlIIl(final lIIIIlIIIIIlllIllIII liiiIlIIIIIlllIllIII) {
    }
    
    public void IlIlIIIllIllIIIIIllI(final lIIIIlIIIIIlllIllIII liiiIlIIIIIlllIllIII) {
    }
    
    public void llllIIIIlIIIlIlllIll(final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl) {
    }
    
    public void llllIIIlIlllIlIIIIIl(final String s) {
    }
    
    public void IlIIIlIlIIIllIlIlIIl(final String s, final lIIIIlIIIIIlllIllIII liiiIlIIIIIlllIllIII) {
    }
    
    public void IlIlIlIlIlllllllllIl(final lIIIlllIIIllIIIllIII liiIlllIIIllIIIllIII) {
    }
    
    public void llIllIIIIIllIlIIIIlI(final lIIIlllIIIllIIIllIII liiIlllIIIllIIIllIII) {
    }
    
    public void IlIIIlIlIIIllIlIlIIl(final lIIIlllIIIllIIIllIII liiIlllIIIllIIIllIII) {
    }
    
    public static String IlIlIlIlIlllllllllIl(final int n) {
        switch (n) {
            case 0: {
                return "list";
            }
            case 1: {
                return "sidebar";
            }
            case 2: {
                return "belowName";
            }
            default: {
                if (n >= 3 && n <= 18) {
                    final IlllIIIIlIIIlIlIlIIl llllIIIIlIIIlIlllIll = IlllIIIIlIIIlIlIlIIl.llllIIIIlIIIlIlllIll(n - 3);
                    if (llllIIIIlIIIlIlllIll != null && llllIIIIlIIIlIlllIll != IlllIIIIlIIIlIlIlIIl.IlIlIIIlIIlIlIIlllIl) {
                        return "sidebar.team." + llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl();
                    }
                }
                return null;
            }
        }
    }
    
    public static int lIIIIlIIIIIlllIllIII(final String s) {
        if (s.equalsIgnoreCase("list")) {
            return 0;
        }
        if (s.equalsIgnoreCase("sidebar")) {
            return 1;
        }
        if (s.equalsIgnoreCase("belowName")) {
            return 2;
        }
        if (s.startsWith("sidebar.team.")) {
            final IlllIIIIlIIIlIlIlIIl ilIlIlIlIlllllllllIl = IlllIIIIlIIIlIlIlIIl.IlIlIlIlIlllllllllIl(s.substring("sidebar.team.".length()));
            if (ilIlIlIlIlllllllllIl != null && ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll() >= 0) {
                return ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll() + 3;
            }
        }
        return -1;
    }
    
    public static String[] IllIIlllIIIIlllIIlIl() {
        if (llIIlIIIlIIIllIlIIIl.llllIIIlIlllIlIIIIIl == null) {
            llIIlIIIlIIIllIlIIIl.llllIIIlIlllIlIIIIIl = new String[19];
            for (int i = 0; i < 19; ++i) {
                llIIlIIIlIIIllIlIIIl.llllIIIlIlllIlIIIIIl[i] = IlIlIlIlIlllllllllIl(i);
            }
        }
        return llIIlIIIlIIIllIlIIIl.llllIIIlIlllIlIIIIIl;
    }
    
    public void llllIIIIlIIIlIlllIll(final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI) {
        if (llIllIIIIIllIlIIIIlI != null && !(llIllIIIIIllIlIIIIlI instanceof llllIIIIlIIIlIlllIll) && !llIllIIIIIllIlIIIIlI.llllIllllIllllIlIlII()) {
            final String string = llIllIIIIIllIlIIIIlI.lllIIIIlIlIllIIlIIIl().toString();
            this.llIllIIIIIllIlIIIIlI(string, null);
            this.IlIlIIIllIllIIIIIllI(string);
        }
    }
}
