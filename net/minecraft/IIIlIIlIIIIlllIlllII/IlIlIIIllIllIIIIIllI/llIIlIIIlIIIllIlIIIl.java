package net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIIIllIllIIIIIllI;

import com.google.common.collect.*;
import net.minecraft.llllIIIIlIIIlIlllIll.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import java.util.*;

public class llIIlIIIlIIIllIlIIIl
{
    private final List llllIIIIlIIIlIlllIll;
    private final Map IlIlIlIlIlllllllllIl;
    private int llIllIIIIIllIlIIIIlI;
    
    public llIIlIIIlIIIllIlIIIl() {
        this.llllIIIIlIIIlIlllIll = Lists.newArrayList();
        this.IlIlIlIlIlllllllllIl = Maps.newHashMap();
    }
    
    public int llllIIIIlIIIlIlllIll() {
        return this.llIllIIIIIllIlIIIIlI;
    }
    
    public void llllIIIIlIIIlIlllIll(final int llIllIIIIIllIlIIIIlI) {
        this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
    }
    
    public Map IlIlIlIlIlllllllllIl() {
        return this.IlIlIlIlIlllllllllIl;
    }
    
    public List llIllIIIIIllIlIIIIlI() {
        return this.llllIIIIlIIIlIlllIll;
    }
    
    public void IlIIIlIlIIIllIlIlIIl() {
        int n = 0;
        for (final llIllIlIIIIllIlIIllI llIllIlIIIIllIlIIllI : this.llllIIIIlIIIlIlllIll) {
            llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll(n);
            n += llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll();
        }
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(3);
        sb.append(";");
        for (int i = 0; i < this.llllIIIIlIIIlIlllIll.size(); ++i) {
            if (i > 0) {
                sb.append(",");
            }
            sb.append(((llIllIlIIIIllIlIIllI)this.llllIIIIlIIIlIlllIll.get(i)).toString());
        }
        sb.append(";");
        sb.append(this.llIllIIIIIllIlIIIIlI);
        if (!this.IlIlIlIlIlllllllllIl.isEmpty()) {
            sb.append(";");
            int n = 0;
            for (final Map.Entry<String, V> entry : this.IlIlIlIlIlllllllllIl.entrySet()) {
                if (n++ > 0) {
                    sb.append(",");
                }
                sb.append(entry.getKey().toLowerCase());
                final Map map = (Map)entry.getValue();
                if (!map.isEmpty()) {
                    sb.append("(");
                    int n2 = 0;
                    for (final Map.Entry<String, V> entry2 : map.entrySet()) {
                        if (n2++ > 0) {
                            sb.append(" ");
                        }
                        sb.append(entry2.getKey());
                        sb.append("=");
                        sb.append((String)entry2.getValue());
                    }
                    sb.append(")");
                }
            }
        }
        else {
            sb.append(";");
        }
        return sb.toString();
    }
    
    private static llIllIlIIIIllIlIIllI llllIIIIlIIIlIlllIll(final int n, final String s, final int n2) {
        final String[] array = (n >= 3) ? s.split("\\*", 2) : s.split("x", 2);
        int int1 = 1;
        int int2 = 0;
        if (array.length == 2) {
            try {
                int1 = Integer.parseInt(array[0]);
                if (n2 + int1 >= 256) {
                    int1 = 256 - n2;
                }
                if (int1 < 0) {
                    int1 = 0;
                }
            }
            catch (Throwable t) {
                return null;
            }
        }
        llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll;
        try {
            final String s2 = array[array.length - 1];
            if (n < 3) {
                final String[] split = s2.split(":", 2);
                if (split.length > 1) {
                    int2 = Integer.parseInt(split[1]);
                }
                llllIIIIlIIIlIlllIll = net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(Integer.parseInt(split[0]));
            }
            else {
                final String[] split2 = s2.split(":", 3);
                llllIIIIlIIIlIlllIll = ((split2.length > 1) ? net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(String.valueOf(split2[0]) + ":" + split2[1]) : null);
                if (llllIIIIlIIIlIlllIll != null) {
                    int2 = ((split2.length > 2) ? Integer.parseInt(split2[2]) : 0);
                }
                else {
                    llllIIIIlIIIlIlllIll = net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(split2[0]);
                    if (llllIIIIlIIIlIlllIll != null) {
                        int2 = ((split2.length > 1) ? Integer.parseInt(split2[1]) : 0);
                    }
                }
                if (llllIIIIlIIIlIlllIll == null) {
                    return null;
                }
            }
            if (llllIIIIlIIIlIlllIll == net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll) {
                int2 = 0;
            }
            if (int2 < 0 || int2 > 15) {
                int2 = 0;
            }
        }
        catch (Throwable t2) {
            return null;
        }
        final llIllIlIIIIllIlIIllI llIllIlIIIIllIlIIllI = new llIllIlIIIIllIlIIllI(n, int1, llllIIIIlIIIlIlllIll, int2);
        llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll(n2);
        return llIllIlIIIIllIlIIllI;
    }
    
    private static List llllIIIIlIIIlIlllIll(final int n, final String s) {
        if (s != null && s.length() >= 1) {
            final ArrayList arrayList = Lists.newArrayList();
            final String[] split = s.split(",");
            int n2 = 0;
            String[] array;
            for (int length = (array = split).length, i = 0; i < length; ++i) {
                final llIllIlIIIIllIlIIllI llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll(n, array[i], n2);
                if (llllIIIIlIIIlIlllIll == null) {
                    return null;
                }
                arrayList.add(llllIIIIlIIIlIlllIll);
                n2 += llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll();
            }
            return arrayList;
        }
        return null;
    }
    
    public static llIIlIIIlIIIllIlIIIl llllIIIIlIIIlIlllIll(final String s) {
        if (s == null) {
            return IlIlIIIllIllIIIIIllI();
        }
        final String[] split = s.split(";", -1);
        final int n = (split.length == 1) ? 0 : llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(split[0], 0);
        if (n < 0 || n > 3) {
            return IlIlIIIllIllIIIIIllI();
        }
        final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl = new llIIlIIIlIIIllIlIIIl();
        int n2 = (split.length != 1) ? 1 : 0;
        final List llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll(n, split[n2++]);
        if (llllIIIIlIIIlIlllIll != null && !llllIIIIlIIIlIlllIll.isEmpty()) {
            llIIlIIIlIIIllIlIIIl.llIllIIIIIllIlIIIIlI().addAll(llllIIIIlIIIlIlllIll);
            llIIlIIIlIIIllIlIIIl.IlIIIlIlIIIllIlIlIIl();
            int n3 = net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl.IIlllIIlIllIllIlIIll.lIIIIIlIlIIIlIIIIlIl;
            if (n > 0 && split.length > n2) {
                n3 = llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(split[n2++], n3);
            }
            llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(n3);
            if (n > 0 && split.length > n2) {
                String[] split2;
                for (int length = (split2 = split[n2++].toLowerCase().split(",")).length, i = 0; i < length; ++i) {
                    final String[] split3 = split2[i].split("\\(", 2);
                    final HashMap hashMap = Maps.newHashMap();
                    if (split3[0].length() > 0) {
                        llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl().put(split3[0], hashMap);
                        if (split3.length > 1 && split3[1].endsWith(")") && split3[1].length() > 1) {
                            final String[] split4 = split3[1].substring(0, split3[1].length() - 1).split(" ");
                            for (int j = 0; j < split4.length; ++j) {
                                final String[] split5 = split4[j].split("=", 2);
                                if (split5.length == 2) {
                                    hashMap.put(split5[0], split5[1]);
                                }
                            }
                        }
                    }
                }
            }
            else {
                llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl().put("village", Maps.newHashMap());
            }
            return llIIlIIIlIIIllIlIIIl;
        }
        return IlIlIIIllIllIIIIIllI();
    }
    
    public static llIIlIIIlIIIllIlIIIl IlIlIIIllIllIIIIIllI() {
        final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl = new llIIlIIIlIIIllIlIIIl();
        llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl.IIlllIIlIllIllIlIIll.lIIIIIlIlIIIlIIIIlIl);
        llIIlIIIlIIIllIlIIIl.llIllIIIIIllIlIIIIlI().add(new llIllIlIIIIllIlIIllI(1, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII));
        llIIlIIIlIIIllIlIIIl.llIllIIIIIllIlIIIIlI().add(new llIllIlIIIIllIlIIllI(2, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl));
        llIIlIIIlIIIllIlIIIl.llIllIIIIIllIlIIIIlI().add(new llIllIlIIIIllIlIIllI(1, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI));
        llIIlIIIlIIIllIlIIIl.IlIIIlIlIIIllIlIlIIl();
        llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl().put("village", Maps.newHashMap());
        return llIIlIIIlIIIllIlIIIl;
    }
}
