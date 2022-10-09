package net.minecraft.IlIlIIIIIIlllIlIllIl.IlIlIlIlIlllllllllIl;

import java.lang.reflect.*;
import org.apache.logging.log4j.*;
import com.google.common.collect.*;
import java.util.*;
import com.google.gson.*;
import com.google.common.base.*;
import com.google.common.io.*;
import org.apache.commons.io.*;
import java.io.*;

public class lllIIIIlllllIlIIllIl
{
    protected static final Logger llllIIIIlIIIlIlllIll;
    protected final Gson IlIlIlIlIlllllllllIl;
    private final File llIllIIIIIllIlIIIIlI;
    private final Map IlIIIlIlIIIllIlIlIIl;
    private boolean IlIlIIIllIllIIIIIllI;
    private static final ParameterizedType IllIIlllIIIIlllIIlIl;
    
    static {
        llllIIIIlIIIlIlllIll = LogManager.getLogger();
        IllIIlllIIIIlllIIlIl = new IlIlIIIIIIlllIlIllIl();
    }
    
    public lllIIIIlllllIlIIllIl(final File llIllIIIIIllIlIIIIlI) {
        this.IlIIIlIlIIIllIlIlIIl = Maps.newHashMap();
        this.IlIlIIIllIllIIIIIllI = true;
        this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
        final GsonBuilder setPrettyPrinting = new GsonBuilder().setPrettyPrinting();
        setPrettyPrinting.registerTypeHierarchyAdapter((Class)IlllllllIIIlIIIlIlII.class, (Object)new IIllIIllIIIlIlIIIIlI(this, null));
        this.IlIlIlIlIlllllllllIl = setPrettyPrinting.create();
    }
    
    public boolean llllIIIIlIIIlIlllIll() {
        return this.IlIlIIIllIllIIIIIllI;
    }
    
    public void llllIIIIlIIIlIlllIll(final boolean ilIlIIIllIllIIIIIllI) {
        this.IlIlIIIllIllIIIIIllI = ilIlIIIllIllIIIIIllI;
    }
    
    public void llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII) {
        this.IlIIIlIlIIIllIlIlIIl.put(this.llIllIIIIIllIlIIIIlI(illlllllIIIlIIIlIlII.IlIIIlIlIIIllIlIlIIl()), illlllllIIIlIIIlIlII);
        try {
            this.IlIIIlIlIIIllIlIlIIl();
        }
        catch (IOException ex) {
            lllIIIIlllllIlIIllIl.llllIIIIlIIIlIlllIll.warn("Could not save the list after adding a user.", (Throwable)ex);
        }
    }
    
    public IlllllllIIIlIIIlIlII llllIIIIlIIIlIlllIll(final Object o) {
        this.IlIlIIIllIllIIIIIllI();
        return this.IlIIIlIlIIIllIlIlIIl.get(this.llIllIIIIIllIlIIIIlI(o));
    }
    
    public void IlIlIlIlIlllllllllIl(final Object o) {
        this.IlIIIlIlIIIllIlIlIIl.remove(this.llIllIIIIIllIlIIIIlI(o));
        try {
            this.IlIIIlIlIIIllIlIlIIl();
        }
        catch (IOException ex) {
            lllIIIIlllllIlIIllIl.llllIIIIlIIIlIlllIll.warn("Could not save the list after removing a user.", (Throwable)ex);
        }
    }
    
    public String[] IlIlIlIlIlllllllllIl() {
        return (String[])this.IlIIIlIlIIIllIlIlIIl.keySet().toArray(new String[this.IlIIIlIlIIIllIlIlIIl.size()]);
    }
    
    protected String llIllIIIIIllIlIIIIlI(final Object o) {
        return o.toString();
    }
    
    protected boolean IlIIIlIlIIIllIlIlIIl(final Object o) {
        return this.IlIIIlIlIIIllIlIlIIl.containsKey(this.llIllIIIIIllIlIIIIlI(o));
    }
    
    private void IlIlIIIllIllIIIIIllI() {
        final ArrayList arrayList = Lists.newArrayList();
        for (final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII : this.IlIIIlIlIIIllIlIlIIl.values()) {
            if (illlllllIIIlIIIlIlII.llIllIIIIIllIlIIIIlI()) {
                arrayList.add(illlllllIIIlIIIlIlII.IlIIIlIlIIIllIlIlIIl());
            }
        }
        final Iterator<Object> iterator2 = arrayList.iterator();
        while (iterator2.hasNext()) {
            this.IlIIIlIlIIIllIlIlIIl.remove(iterator2.next());
        }
    }
    
    protected IlllllllIIIlIIIlIlII llllIIIIlIIIlIlllIll(final JsonObject jsonObject) {
        return new IlllllllIIIlIIIlIlII(null, jsonObject);
    }
    
    protected Map llIllIIIIIllIlIIIIlI() {
        return this.IlIIIlIlIIIllIlIlIIl;
    }
    
    public void IlIIIlIlIIIllIlIlIIl() {
        final String json = this.IlIlIlIlIlllllllllIl.toJson((Object)this.IlIIIlIlIIIllIlIlIIl.values());
        Writer writer = null;
        try {
            writer = Files.newWriter(this.llIllIIIIIllIlIIIIlI, Charsets.UTF_8);
            writer.write(json);
        }
        finally {
            IOUtils.closeQuietly(writer);
        }
        IOUtils.closeQuietly(writer);
    }
}
