package net.minecraft.IlllllllIIIlIIIlIlII;

import com.google.common.collect.*;
import com.google.gson.*;
import java.util.*;

public class lllllIIlIlIIIlIlIIIl extends ForwardingSet implements llIIIlIlllIllIIlIllI
{
    private final Set llllIIIIlIIIlIlllIll;
    
    public lllllIIlIlIIIlIlIIIl() {
        this.llllIIIIlIIIlIlllIll = Sets.newHashSet();
    }
    
    public void llllIIIIlIIIlIlllIll(final JsonElement jsonElement) {
        if (jsonElement.isJsonArray()) {
            final Iterator iterator = jsonElement.getAsJsonArray().iterator();
            while (iterator.hasNext()) {
                this.add((Object)iterator.next().getAsString());
            }
        }
    }
    
    public JsonElement llllIIIIlIIIlIlllIll() {
        final JsonArray jsonArray = new JsonArray();
        final Iterator iterator = this.iterator();
        while (iterator.hasNext()) {
            jsonArray.add((JsonElement)new JsonPrimitive((String)iterator.next()));
        }
        return (JsonElement)jsonArray;
    }
    
    protected Set delegate() {
        return this.llllIIIIlIIIlIlllIll;
    }
}
