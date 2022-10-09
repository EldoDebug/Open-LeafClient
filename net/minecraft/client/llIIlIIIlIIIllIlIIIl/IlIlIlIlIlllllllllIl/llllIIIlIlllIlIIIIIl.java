package net.minecraft.client.llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl;

import net.minecraft.IlllllllIIIlIIIlIlII.*;
import org.apache.commons.lang3.*;

public class llllIIIlIlllIlIIIIIl extends lIllllIllIllIIllllll
{
    private final String llIllIIIIIllIlIIIIlI;
    
    protected llllIIIlIlllIlIIIIIl(final int n, final String... array) {
        super(0, new String[] { array[0], array[1] });
        this.llIllIIIIIllIlIIIIlI = (StringUtils.isEmpty((CharSequence)array[2]) ? "normal" : array[2].toLowerCase());
    }
    
    public llllIIIlIlllIlIIIIIl(final String s) {
        this(0, llllIIIIlIIIlIlllIll(s));
    }
    
    public llllIIIlIlllIlIIIIIl(final lIllllIllIllIIllllll lIllllIllIllIIllllll, final String s) {
        this(lIllllIllIllIIllllll.toString(), s);
    }
    
    public llllIIIlIlllIlIIIIIl(final String s, final String s2) {
        this(0, llllIIIIlIIIlIlllIll(String.valueOf(s) + '#' + ((s2 == null) ? "normal" : s2)));
    }
    
    protected static String[] llllIIIIlIIIlIlllIll(final String s) {
        final String[] array = { null, s, null };
        final int index = s.indexOf(35);
        String substring = s;
        if (index >= 0) {
            array[2] = s.substring(index + 1, s.length());
            if (index > 1) {
                substring = s.substring(0, index);
            }
        }
        System.arraycopy(lIllllIllIllIIllllll.IlIlIlIlIlllllllllIl(substring), 0, array, 0, 2);
        return array;
    }
    
    public String llllIIIIlIIIlIlllIll() {
        return this.llIllIIIIIllIlIIIIlI;
    }
    
    @Override
    public boolean equals(final Object o) {
        return this == o || (o instanceof llllIIIlIlllIlIIIIIl && super.equals(o) && this.llIllIIIIIllIlIIIIlI.equals(((llllIIIlIlllIlIIIIIl)o).llIllIIIIIllIlIIIIlI));
    }
    
    @Override
    public int hashCode() {
        return 31 * super.hashCode() + this.llIllIIIIIllIlIIIIlI.hashCode();
    }
    
    @Override
    public String toString() {
        return String.valueOf(super.toString()) + '#' + this.llIllIIIIIllIlIIIIlI;
    }
}
