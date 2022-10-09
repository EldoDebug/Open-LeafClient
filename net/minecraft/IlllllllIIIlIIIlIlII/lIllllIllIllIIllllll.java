package net.minecraft.IlllllllIIIlIIIlIlII;

import org.apache.commons.lang3.*;

public class lIllllIllIllIIllllll
{
    protected final String llllIIIIlIIIlIlllIll;
    protected final String IlIlIlIlIlllllllllIl;
    
    protected lIllllIllIllIIllllll(final int n, final String... array) {
        this.llllIIIIlIIIlIlllIll = (StringUtils.isEmpty((CharSequence)array[0]) ? "minecraft" : array[0].toLowerCase());
        Validate.notNull((Object)(this.IlIlIlIlIlllllllllIl = array[1]));
    }
    
    public lIllllIllIllIIllllll(final String s) {
        this(0, IlIlIlIlIlllllllllIl(s));
    }
    
    public lIllllIllIllIIllllll(final String s, final String s2) {
        this(0, new String[] { s, s2 });
    }
    
    protected static String[] IlIlIlIlIlllllllllIl(final String s) {
        final String[] array = { null, s };
        final int index = s.indexOf(58);
        if (index >= 0) {
            array[1] = s.substring(index + 1, s.length());
            if (index > 1) {
                array[0] = s.substring(0, index);
            }
        }
        return array;
    }
    
    public String IlIlIlIlIlllllllllIl() {
        return this.IlIlIlIlIlllllllllIl;
    }
    
    public String llIllIIIIIllIlIIIIlI() {
        return this.llllIIIIlIIIlIlllIll;
    }
    
    @Override
    public String toString() {
        return String.valueOf(this.llllIIIIlIIIlIlllIll) + ':' + this.IlIlIlIlIlllllllllIl;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof lIllllIllIllIIllllll)) {
            return false;
        }
        final lIllllIllIllIIllllll lIllllIllIllIIllllll = (lIllllIllIllIIllllll)o;
        return this.llllIIIIlIIIlIlllIll.equals(lIllllIllIllIIllllll.llllIIIIlIIIlIlllIll) && this.IlIlIlIlIlllllllllIl.equals(lIllllIllIllIIllllll.IlIlIlIlIlllllllllIl);
    }
    
    @Override
    public int hashCode() {
        return 31 * this.llllIIIIlIIIlIlllIll.hashCode() + this.IlIlIlIlIlllllllllIl.hashCode();
    }
}
