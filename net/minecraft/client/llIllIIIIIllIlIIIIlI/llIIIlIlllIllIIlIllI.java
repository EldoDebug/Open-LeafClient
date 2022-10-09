package net.minecraft.client.llIllIIIIIllIlIIIIlI;

import com.google.common.base.*;

public class llIIIlIlllIllIIlIllI extends lIllIIIIIlllIIlIIllI
{
    private final Predicate llllIIIIlIIIlIlllIll;
    
    public llIIIlIlllIllIIlIllI(final int n, final String s, final boolean b, final Predicate predicate) {
        super(n, s, b);
        this.llllIIIIlIIIlIlllIll = (Predicate)Objects.firstNonNull((Object)predicate, (Object)Predicates.alwaysTrue());
    }
    
    public Predicate llllIIIIlIIIlIlllIll() {
        return this.llllIIIIlIIIlIlllIll;
    }
}
