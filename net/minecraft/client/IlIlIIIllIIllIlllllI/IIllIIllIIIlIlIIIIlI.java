package net.minecraft.client.IlIlIIIllIIllIlllllI;

import com.google.gson.*;
import java.util.*;
import com.google.common.collect.*;
import com.google.common.base.*;

public class IIllIIllIIIlIlIIIIlI
{
    private static final Gson llllIIIIlIIIlIlllIll;
    private final String IlIlIlIlIlllllllllIl;
    private String llIllIIIIIllIlIIIIlI;
    private Map IlIIIlIlIIIllIlIlIIl;
    
    static {
        llllIIIIlIIIlIlllIll = new Gson();
    }
    
    public IIllIIllIIIlIlIIIIlI(final String ilIlIlIlIlllllllllIl, final String llIllIIIIIllIlIIIIlI) {
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
        this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
    }
    
    public IIllIIllIIIlIlIIIIlI(final String s) {
        this(s, null);
    }
    
    public void llllIIIIlIIIlIlllIll(final String llIllIIIIIllIlIIIIlI) {
        this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
    }
    
    public String llllIIIIlIIIlIlllIll() {
        return (this.llIllIIIIIllIlIIIIlI == null) ? this.IlIlIlIlIlllllllllIl : this.llIllIIIIIllIlIIIIlI;
    }
    
    public void llllIIIIlIIIlIlllIll(final String s, final String s2) {
        if (this.IlIIIlIlIIIllIlIlIIl == null) {
            this.IlIIIlIlIIIllIlIlIIl = Maps.newHashMap();
        }
        if (this.IlIIIlIlIIIllIlIlIIl.size() > 50) {
            throw new IllegalArgumentException("Metadata payload is full, cannot add more to it!");
        }
        if (s == null) {
            throw new IllegalArgumentException("Metadata payload key cannot be null!");
        }
        if (s.length() > 255) {
            throw new IllegalArgumentException("Metadata payload key is too long!");
        }
        if (s2 == null) {
            throw new IllegalArgumentException("Metadata payload value cannot be null!");
        }
        if (s2.length() > 255) {
            throw new IllegalArgumentException("Metadata payload value is too long!");
        }
        this.IlIIIlIlIIIllIlIlIIl.put(s, s2);
    }
    
    public String IlIlIlIlIlllllllllIl() {
        return (this.IlIIIlIlIIIllIlIlIIl != null && !this.IlIIIlIlIIIllIlIlIIl.isEmpty()) ? IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.toJson((Object)this.IlIIIlIlIIIllIlIlIIl) : null;
    }
    
    public String llIllIIIIIllIlIIIIlI() {
        return this.IlIlIlIlIlllllllllIl;
    }
    
    @Override
    public String toString() {
        return Objects.toStringHelper((Object)this).add("name", (Object)this.IlIlIlIlIlllllllllIl).add("description", (Object)this.llIllIIIIIllIlIIIIlI).add("data", (Object)this.IlIlIlIlIlllllllllIl()).toString();
    }
}
