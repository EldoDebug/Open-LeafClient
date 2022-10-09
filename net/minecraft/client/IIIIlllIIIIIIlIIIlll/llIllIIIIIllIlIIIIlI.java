package net.minecraft.client.IIIIlllIIIIIIlIIIlll;

import java.util.*;
import com.google.common.collect.*;
import org.apache.commons.lang3.*;

public class llIllIIIIIllIlIIIIlI
{
    private String llllIIIIlIIIlIlllIll;
    private final List IlIlIlIlIlllllllllIl;
    
    private llIllIIIIIllIlIIIIlI() {
        this.llllIIIIlIIIlIlllIll = null;
        this.IlIlIlIlIlllllllllIl = Lists.newArrayList();
    }
    
    private void llllIIIIlIIIlIlllIll(final String s) {
        this.IlIlIlIlIlllllllllIl.add(0, s);
    }
    
    public String llllIIIIlIIIlIlllIll() {
        return StringUtils.join((Iterable)this.IlIlIlIlIlllllllllIl, "->");
    }
    
    @Override
    public String toString() {
        return (this.llllIIIIlIIIlIlllIll != null) ? (this.IlIlIlIlIlllllllllIl.isEmpty() ? this.llllIIIIlIIIlIlllIll : (String.valueOf(this.llllIIIIlIIIlIlllIll) + " " + this.llllIIIIlIIIlIlllIll())) : (this.IlIlIlIlIlllllllllIl.isEmpty() ? "(Unknown file)" : ("(Unknown file) " + this.llllIIIIlIIIlIlllIll()));
    }
}
