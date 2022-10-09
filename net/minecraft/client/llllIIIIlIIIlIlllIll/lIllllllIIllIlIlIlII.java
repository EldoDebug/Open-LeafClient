package net.minecraft.client.llllIIIIlIIIlIlllIll;

import net.minecraft.IlllllllIIIlIIIlIlII.*;
import java.util.*;
import com.google.common.collect.*;

public class lIllllllIIllIlIlIlII extends llllllIIIIIIIlllIIll
{
    private Map llllIIIIlIIIlIlllIll;
    
    @Override
    protected Map llllIIIIlIIIlIlllIll() {
        return this.llllIIIIlIIIlIlllIll = Maps.newHashMap();
    }
    
    public void llllIIIIlIIIlIlllIll(final llllIIllllIlIlIIIIll llllIIllllIlIlIIIIll) {
        this.llllIIIIlIIIlIlllIll(llllIIllllIlIlIIIIll.IlIIIlIlIIIllIlIlIIl(), llllIIllllIlIlIIIIll);
    }
    
    public void IlIlIlIlIlllllllllIl() {
        this.llllIIIIlIIIlIlllIll.clear();
    }
}
