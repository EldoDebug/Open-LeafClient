package net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll;

import com.google.gson.*;
import java.lang.reflect.*;
import java.io.*;
import com.google.common.collect.*;
import java.util.*;

public class IlllllllIIIlIIIlIlII
{
    static final Gson llllIIIIlIIIlIlllIll;
    private final Map IlIlIlIlIlllllllllIl;
    
    static {
        llllIIIIlIIIlIlllIll = new GsonBuilder().registerTypeAdapter((Type)IlllllllIIIlIIIlIlII.class, (Object)new IIlIIIIlllIlllllIlII()).registerTypeAdapter((Type)IlIlIllllllllIIIIlII.class, (Object)new IIlllIlIIllIlIlIlIIl()).create();
    }
    
    public static IlllllllIIIlIIIlIlII llllIIIIlIIIlIlllIll(final Reader reader) {
        return (IlllllllIIIlIIIlIlII)IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll.fromJson(reader, (Class)IlllllllIIIlIIIlIlII.class);
    }
    
    public IlllllllIIIlIIIlIlII(final Collection collection) {
        this.IlIlIlIlIlllllllllIl = Maps.newHashMap();
        for (final llIIIlIlIllIIlIlIlII llIIIlIlIllIIlIlIlII : collection) {
            this.IlIlIlIlIlllllllllIl.put(llIIIlIlIllIIlIlIlII.llllIIIIlIIIlIlllIll, llIIIlIlIllIIlIlIlII);
        }
    }
    
    public IlllllllIIIlIIIlIlII(final List list) {
        this.IlIlIlIlIlllllllllIl = Maps.newHashMap();
        final Iterator<IlllllllIIIlIIIlIlII> iterator = list.iterator();
        while (iterator.hasNext()) {
            this.IlIlIlIlIlllllllllIl.putAll(iterator.next().IlIlIlIlIlllllllllIl);
        }
    }
    
    public llIIIlIlIllIIlIlIlII llllIIIIlIIIlIlllIll(final String s) {
        final llIIIlIlIllIIlIlIlII llIIIlIlIllIIlIlIlII = this.IlIlIlIlIlllllllllIl.get(s);
        if (llIIIlIlIllIIlIlIlII == null) {
            throw new IIIlIIlIIIIlllIlllII(this);
        }
        return llIIIlIlIllIIlIlIlII;
    }
    
    @Override
    public boolean equals(final Object o) {
        return this == o || (o instanceof IlllllllIIIlIIIlIlII && this.IlIlIlIlIlllllllllIl.equals(((IlllllllIIIlIIIlIlII)o).IlIlIlIlIlllllllllIl));
    }
    
    @Override
    public int hashCode() {
        return this.IlIlIlIlIlllllllllIl.hashCode();
    }
}
