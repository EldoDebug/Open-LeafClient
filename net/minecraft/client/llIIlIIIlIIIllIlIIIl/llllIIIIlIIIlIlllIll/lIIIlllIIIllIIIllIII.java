package net.minecraft.client.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll;

import net.minecraft.IlllllllIIIlIIIlIlII.*;
import java.lang.reflect.*;
import com.google.gson.*;

public class lIIIlllIIIllIIIllIII
{
    private final IllIIlllllIIllIIllIl llllIIIIlIIIlIlllIll;
    private final GsonBuilder IlIlIlIlIlllllllllIl;
    private Gson llIllIIIIIllIlIIIIlI;
    
    public lIIIlllIIIllIIIllIII() {
        this.llllIIIIlIIIlIlllIll = new llllllIIIIIIIlllIIll();
        (this.IlIlIlIlIlllllllllIl = new GsonBuilder()).registerTypeHierarchyAdapter((Class)llIIIIIIlIllIIlIIIll.class, (Object)new lIIIIlIlIllllIIlIllI());
        this.IlIlIlIlIlllllllllIl.registerTypeHierarchyAdapter((Class)IlIlIIIlIIlIlIIlllIl.class, (Object)new IIlIIIIlllIlllllIlII());
        this.IlIlIlIlIlllllllllIl.registerTypeAdapterFactory((TypeAdapterFactory)new IllIllIlllIllllIIllI());
    }
    
    public void llllIIIIlIIIlIlllIll(final lIIIIlIIIIIlllIllIII liiiIlIIIIIlllIllIII, final Class clazz) {
        this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(liiiIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll(), new llIIlIIIlIIIllIlIIIl(this, liiiIlIIIIIlllIllIII, clazz, null));
        this.IlIlIlIlIlllllllllIl.registerTypeAdapter((Type)clazz, (Object)liiiIlIIIIIlllIllIII);
        this.llIllIIIIIllIlIIIIlI = null;
    }
    
    public llllIIIlIlllIlIIIIIl llllIIIIlIIIlIlllIll(final String s, final JsonObject jsonObject) {
        if (s == null) {
            throw new IllegalArgumentException("Metadata section name cannot be null");
        }
        if (!jsonObject.has(s)) {
            return null;
        }
        if (!jsonObject.get(s).isJsonObject()) {
            throw new IllegalArgumentException("Invalid metadata for '" + s + "' - expected object, found " + jsonObject.get(s));
        }
        final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl = (llIIlIIIlIIIllIlIIIl)this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(s);
        if (llIIlIIIlIIIllIlIIIl == null) {
            throw new IllegalArgumentException("Don't know how to handle metadata section '" + s + "'");
        }
        return (llllIIIlIlllIlIIIIIl)this.llllIIIIlIIIlIlllIll().fromJson((JsonElement)jsonObject.getAsJsonObject(s), llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl);
    }
    
    private Gson llllIIIIlIIIlIlllIll() {
        if (this.llIllIIIIIllIlIIIIlI == null) {
            this.llIllIIIIIllIlIIIIlI = this.IlIlIlIlIlllllllllIl.create();
        }
        return this.llIllIIIIIllIlIIIIlI;
    }
}
