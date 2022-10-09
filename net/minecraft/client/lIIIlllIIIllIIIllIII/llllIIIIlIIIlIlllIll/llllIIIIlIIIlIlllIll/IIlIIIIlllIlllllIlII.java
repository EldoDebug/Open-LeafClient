package net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll;

import java.lang.reflect.*;
import com.google.gson.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import com.google.common.collect.*;
import java.util.*;

public class IIlIIIIlllIlllllIlII implements JsonDeserializer
{
    public IlllllllIIIlIIIlIlII llllIIIIlIIIlIlllIll(final JsonElement jsonElement, final Type type, final JsonDeserializationContext jsonDeserializationContext) {
        return new IlllllllIIIlIIIlIlII((Collection)this.llllIIIIlIIIlIlllIll(jsonDeserializationContext, jsonElement.getAsJsonObject()));
    }
    
    protected List llllIIIIlIIIlIlllIll(final JsonDeserializationContext jsonDeserializationContext, final JsonObject jsonObject) {
        final JsonObject llIIlIIIlIIIllIlIIIl = IIlllllIllIllIlIlIII.llIIlIIIlIIIllIlIIIl(jsonObject, "variants");
        final ArrayList arrayList = Lists.newArrayList();
        final Iterator iterator = llIIlIIIlIIIllIlIIIl.entrySet().iterator();
        while (iterator.hasNext()) {
            arrayList.add(this.llllIIIIlIIIlIlllIll(jsonDeserializationContext, (Map.Entry)iterator.next()));
        }
        return arrayList;
    }
    
    protected llIIIlIlIllIIlIlIlII llllIIIIlIIIlIlllIll(final JsonDeserializationContext jsonDeserializationContext, final Map.Entry entry) {
        final String s = entry.getKey();
        final ArrayList arrayList = Lists.newArrayList();
        final JsonElement jsonElement = (JsonElement)entry.getValue();
        if (jsonElement.isJsonArray()) {
            final Iterator iterator = jsonElement.getAsJsonArray().iterator();
            while (iterator.hasNext()) {
                arrayList.add(jsonDeserializationContext.deserialize((JsonElement)iterator.next(), (Type)IlIlIllllllllIIIIlII.class));
            }
        }
        else {
            arrayList.add(jsonDeserializationContext.deserialize(jsonElement, (Type)IlIlIllllllllIIIIlII.class));
        }
        return new llIIIlIlIllIIlIlIlII(s, arrayList);
    }
}
