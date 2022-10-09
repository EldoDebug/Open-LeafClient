package net.minecraft.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl;

import com.google.common.collect.*;
import java.util.*;

public class IlIlIlIlIlllllllllIl extends IlIlIIIllIllIIIIIllI
{
    private final ImmutableSet llllIIIIlIIIlIlllIll;
    
    protected IlIlIlIlIlllllllllIl(final String s) {
        super(s, Boolean.class);
        this.llllIIIIlIIIlIlllIll = ImmutableSet.of((Object)true, (Object)false);
    }
    
    @Override
    public Collection IlIlIlIlIlllllllllIl() {
        return (Collection)this.llllIIIIlIIIlIlllIll;
    }
    
    public static IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll(final String s) {
        return new IlIlIlIlIlllllllllIl(s);
    }
    
    public String llllIIIIlIIIlIlllIll(final Boolean b) {
        return b.toString();
    }
}
