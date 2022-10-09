package net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll;

import com.google.common.collect.*;
import org.apache.commons.lang3.*;
import com.google.common.base.*;
import java.lang.reflect.*;
import java.util.*;

public class IllIIlllIIIIlllIIlIl
{
    private static final Joiner llllIIIIlIIIlIlllIll;
    private final List IlIlIlIlIlllllllllIl;
    private final Map llIllIIIIIllIlIIIIlI;
    private int IlIIIlIlIIIllIlIlIIl;
    private int IlIlIIIllIllIIIIIllI;
    
    static {
        llllIIIIlIIIlIlllIll = Joiner.on(",");
    }
    
    private IllIIlllIIIIlllIIlIl() {
        this.IlIlIlIlIlllllllllIl = Lists.newArrayList();
        (this.llIllIIIIIllIlIIIIlI = Maps.newHashMap()).put(' ', Predicates.alwaysTrue());
    }
    
    public IllIIlllIIIIlllIIlIl llllIIIIlIIIlIlllIll(final String... array) {
        if (ArrayUtils.isEmpty((Object[])array) || StringUtils.isEmpty((CharSequence)array[0])) {
            throw new IllegalArgumentException("Empty pattern for aisle");
        }
        if (this.IlIlIlIlIlllllllllIl.isEmpty()) {
            this.IlIIIlIlIIIllIlIlIIl = array.length;
            this.IlIlIIIllIllIIIIIllI = array[0].length();
        }
        if (array.length != this.IlIIIlIlIIIllIlIlIIl) {
            throw new IllegalArgumentException("Expected aisle with height of " + this.IlIIIlIlIIIllIlIlIIl + ", but was given one with a height of " + array.length + ")");
        }
        for (final String s : array) {
            if (s.length() != this.IlIlIIIllIllIIIIIllI) {
                throw new IllegalArgumentException("Not all rows in the given aisle are the correct width (expected " + this.IlIlIIIllIllIIIIIllI + ", found one with " + s.length() + ")");
            }
            char[] charArray;
            for (int length2 = (charArray = s.toCharArray()).length, j = 0; j < length2; ++j) {
                final char c = charArray[j];
                if (!this.llIllIIIIIllIlIIIIlI.containsKey(c)) {
                    this.llIllIIIIIllIlIIIIlI.put(c, null);
                }
            }
        }
        this.IlIlIlIlIlllllllllIl.add(array);
        return this;
    }
    
    public static IllIIlllIIIIlllIIlIl llllIIIIlIIIlIlllIll() {
        return new IllIIlllIIIIlllIIlIl();
    }
    
    public IllIIlllIIIIlllIIlIl llllIIIIlIIIlIlllIll(final char c, final Predicate predicate) {
        this.llIllIIIIIllIlIIIIlI.put(c, predicate);
        return this;
    }
    
    public IlIlIlIlIlllllllllIl IlIlIlIlIlllllllllIl() {
        return new IlIlIlIlIlllllllllIl(this.llIllIIIIIllIlIIIIlI());
    }
    
    private Predicate[][][] llIllIIIIIllIlIIIIlI() {
        this.IlIIIlIlIIIllIlIlIIl();
        final Predicate[][][] array = (Predicate[][][])Array.newInstance(Predicate.class, this.IlIlIlIlIlllllllllIl.size(), this.IlIIIlIlIIIllIlIlIIl, this.IlIlIIIllIllIIIIIllI);
        for (int i = 0; i < this.IlIlIlIlIlllllllllIl.size(); ++i) {
            for (int j = 0; j < this.IlIIIlIlIIIllIlIlIIl; ++j) {
                for (int k = 0; k < this.IlIlIIIllIllIIIIIllI; ++k) {
                    array[i][j][k] = (Predicate)this.llIllIIIIIllIlIIIIlI.get(((String[])this.IlIlIlIlIlllllllllIl.get(i))[j].charAt(k));
                }
            }
        }
        return array;
    }
    
    private void IlIIIlIlIIIllIlIlIIl() {
        final ArrayList arrayList = Lists.newArrayList();
        for (final Map.Entry<Character, V> entry : this.llIllIIIIIllIlIIIIlI.entrySet()) {
            if (entry.getValue() == null) {
                arrayList.add(entry.getKey());
            }
        }
        if (!arrayList.isEmpty()) {
            throw new IllegalStateException("Predicates for character(s) " + IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll.join((Iterable)arrayList) + " are missing");
        }
    }
}
